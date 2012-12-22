package pixelmon.blocks;

import java.util.ArrayList;

import cpw.mods.fml.common.network.Player;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import pixelmon.Pixelmon;
import pixelmon.comm.EnumPackets;
import pixelmon.comm.PacketCreator;
import pixelmon.comm.PixelmonDataPacket;
import pixelmon.comm.PixelmonLevelUpPacket;
import pixelmon.comm.PixelmonStatsPacket;
import pixelmon.database.DatabaseStats;
import pixelmon.database.EvolutionInfo;
import pixelmon.database.EvolutionInfo.InfoMode;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.enums.EnumGui;
import pixelmon.enums.EnumPokemon;
import pixelmon.storage.PixelmonStorage;
import pixelmon.storage.PlayerStorage;

public class TileEntityTradeMachine extends TileEntity {

	public int playerCount = 0;
	public EntityPlayer player1, player2;
	public boolean ready1, ready2;
	public int pos1, pos2;

	public int tradeIndex = -1;

	private boolean tradePushed = false;
	
	public TileEntityTradeMachine() {
		if (this.tradeIndex == -1)
			TradingRegistry.registerTrade(this);
	}

	public void registerPlayer(EntityPlayer player) {
		playerCount++;
		if (playerCount == 1)
			player1 = player;
		if (playerCount == 2)
			player2 = player;

		player.openGui(Pixelmon.instance, EnumGui.Trading.getIndex(), player.worldObj, tradeIndex, 0, 0);
		if (player == player2) {
			((EntityPlayerMP) player2).playerNetServerHandler.sendPacketToPlayer(PacketCreator.createStringPacket(EnumPackets.RegisterTrader, player1.username));
			((EntityPlayerMP) player1).playerNetServerHandler.sendPacketToPlayer(PacketCreator.createStringPacket(EnumPackets.RegisterTrader, player2.username));
			if (pos1 != -1) {
				PlayerStorage s = PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) player1);
				NBTTagCompound n = s.getNBT(s.getIDFromPosition(pos1));
				((EntityPlayerMP) player2).playerNetServerHandler.sendPacketToPlayer(new PixelmonDataPacket(n, EnumPackets.SetTradeTarget).getPacket());
				((EntityPlayerMP) player2).playerNetServerHandler.sendPacketToPlayer(new PixelmonStatsPacket(n, EnumPackets.SetTradeTargetStats).getPacket());
				((EntityPlayerMP) player1).playerNetServerHandler.sendPacketToPlayer(new PixelmonStatsPacket(n, EnumPackets.SetSelectedStats).getPacket());
			}
		}
	}

	public boolean ready(EntityPlayer player, boolean ready) {
		if (player1 != null)
			if (player.username == player1.username) {
				ready1 = ready;
				((EntityPlayerMP) player2).playerNetServerHandler.sendPacketToPlayer(PacketCreator.createPacket(EnumPackets.SetTradingReadyClient, ready ? 1 : 0));
			}
		if (player2 != null)
			if (player.username == player2.username) {
				ready2 = ready;
				((EntityPlayerMP) player1).playerNetServerHandler.sendPacketToPlayer(PacketCreator.createPacket(EnumPackets.SetTradingReadyClient, ready ? 1 : 0));
			}

		tradePushed = false;
		return false;
	}

	public void setPos1(int pos) {
		pos1 = pos;
		PlayerStorage s = PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) player1);
		NBTTagCompound n = s.getNBT(s.getIDFromPosition(pos));
		((EntityPlayerMP) player1).playerNetServerHandler.sendPacketToPlayer(new PixelmonStatsPacket(n, EnumPackets.SetSelectedStats).getPacket());
		if (player2 == null)
			return;
		((EntityPlayerMP) player2).playerNetServerHandler.sendPacketToPlayer(new PixelmonDataPacket(n, EnumPackets.SetTradeTarget).getPacket());
		((EntityPlayerMP) player2).playerNetServerHandler.sendPacketToPlayer(new PixelmonStatsPacket(n, EnumPackets.SetTradeTargetStats).getPacket());
	}

	public void setPos2(int pos) {
		pos2 = pos;
		PlayerStorage s = PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) player2);
		NBTTagCompound n = s.getNBT(s.getIDFromPosition(pos));
		((EntityPlayerMP) player2).playerNetServerHandler.sendPacketToPlayer(new PixelmonStatsPacket(n, EnumPackets.SetSelectedStats).getPacket());
		if (player1 == null)
			return;
		((EntityPlayerMP) player1).playerNetServerHandler.sendPacketToPlayer(new PixelmonDataPacket(n, EnumPackets.SetTradeTarget).getPacket());
		((EntityPlayerMP) player1).playerNetServerHandler.sendPacketToPlayer(new PixelmonStatsPacket(n, EnumPackets.SetTradeTargetStats).getPacket());
	}

	public void removePlayer(Player player) {
		if (player1 == player) {
			player1 = player2;
			player2 = null;
			playerCount--;
			pos2 = -1;
		} else if (player2 == player) {
			player2 = null;
			playerCount--;
			pos2 = -1;
		}

		if (playerCount < 0)
			playerCount = 0;
		if (playerCount == 1)
			((EntityPlayerMP) player1).playerNetServerHandler.sendPacketToPlayer(PacketCreator.createStringPacket(EnumPackets.RegisterTrader, ""));
	}

	public void trade() {
		if (tradePushed) return;
		tradePushed = true;
		PlayerStorage storage1 = PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) player1);
		PlayerStorage storage2 = PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) player2);
		NBTTagCompound pokemon1 = storage1.getNBT(storage1.getIDFromPosition(pos1));
		NBTTagCompound pokemon2 = storage2.getNBT(storage2.getIDFromPosition(pos2));
		storage1.changePokemon(pos1, pokemon2);
		storage2.changePokemon(pos2, pokemon1);
		player1.closeScreen();
		player2.closeScreen();
		playerCount = 0;

		ArrayList<EvolutionInfo> evolve1 = DatabaseStats.getEvolveList(pokemon2.getString("Name"));
		for (EvolutionInfo e : evolve1) {
			if (e.mode == InfoMode.trade) {
				if (EnumPokemon.hasPokemon(e.extraParam)) {
					EntityPixelmon pixelmon = storage1.sendOut(pokemon2.getInteger("pixelmonID"), worldObj);
					pixelmon.evolve(e.extraParam);
					storage1.retrieve(pixelmon);
				}
			}
		}
		ArrayList<EvolutionInfo> evolve2 = DatabaseStats.getEvolveList(pokemon1.getString("Name"));
		for (EvolutionInfo e : evolve2) {
			if (e.mode == InfoMode.trade) {
				if (EnumPokemon.hasPokemon(e.extraParam)) {
					EntityPixelmon pixelmon = storage2.sendOut(pokemon1.getInteger("pixelmonID"), worldObj);
					pixelmon.evolve(e.extraParam);
					storage2.retrieve(pixelmon);
				}
			}
		}
	}

}