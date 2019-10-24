package org.nico.ratel.landlords.client.event;

import java.util.Map;

import org.nico.ratel.landlords.enums.ClientEventCode;
import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_ROOM_JOIN_FAIL_BY_FULL extends ClientEventListener{

	@Override
	public void call(Channel channel, String data) {
		Map<String, Object> dataMap = MapHelper.parser(data);
		
		SimplePrinter.printNotice(new StringBuilder().append("Join room failed. Room ").append(dataMap.get("roomId")).append(" player count is full!").toString());
		ClientEventListener.get(ClientEventCode.CODE_SHOW_OPTIONS).call(channel, data);
	}



}
