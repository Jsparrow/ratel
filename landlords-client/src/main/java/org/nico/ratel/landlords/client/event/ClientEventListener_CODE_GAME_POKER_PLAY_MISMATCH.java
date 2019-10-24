package org.nico.ratel.landlords.client.event;

import java.util.Map;

import org.nico.ratel.landlords.enums.ServerEventCode;
import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_GAME_POKER_PLAY_MISMATCH extends ClientEventListener{

	@Override
	public void call(Channel channel, String data) {
		Map<String, Object> map = MapHelper.parser(data);
		
		SimplePrinter.printNotice(new StringBuilder().append("Your pokers' type is ").append(map.get("playType")).append(" (").append(map.get("playCount")).append(") but previous pokers' type is ").append(map.get("preType"))
				.append(" (").append(map.get("preCount")).append("), mismatch !!").toString());
		
		if(lastPokers != null) {
			SimplePrinter.printNotice(new StringBuilder().append(lastSellClientNickname).append("[").append(lastSellClientType).append("] played:").toString());
			SimplePrinter.printPokers(lastPokers);
		}
		
		pushToServer(channel, ServerEventCode.CODE_GAME_POKER_PLAY_REDIRECT);
	}

}
