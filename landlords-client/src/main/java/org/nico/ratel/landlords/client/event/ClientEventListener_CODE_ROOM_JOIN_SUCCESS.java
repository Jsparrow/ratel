package org.nico.ratel.landlords.client.event;

import java.util.Map;

import org.nico.ratel.landlords.client.SimpleClient;
import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_ROOM_JOIN_SUCCESS extends ClientEventListener{

	@Override
	public void call(Channel channel, String data) {
		Map<String, Object> map = MapHelper.parser(data);
		
		initLastSellInfo();
		
		int joinClientId = (int) map.get("clientId");
		if(SimpleClient.id == joinClientId) {
			SimplePrinter.printNotice(new StringBuilder().append("You have joined room：").append(map.get("roomId")).append(". There are ").append(map.get("roomClientCount")).append(" players in the room now.").toString());
			SimplePrinter.printNotice("Please wait for other players to join, start a good game when the room player reaches three !");
		}else {
			SimplePrinter.printNotice(new StringBuilder().append(map.get("clientNickname")).append(" joined room, the current number of room player is ").append(map.get("roomClientCount")).toString());
		}
		
	}



}
