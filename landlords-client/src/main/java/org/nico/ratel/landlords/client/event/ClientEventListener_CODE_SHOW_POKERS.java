package org.nico.ratel.landlords.client.event;

import java.util.List;
import java.util.Map;

import org.nico.noson.Noson;
import org.nico.noson.entity.NoType;
import org.nico.ratel.landlords.entity.Poker;
import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_SHOW_POKERS extends ClientEventListener{

	@Override
	public void call(Channel channel, String data) {
		
		Map<String, Object> map = MapHelper.parser(data);
		
		lastSellClientNickname = (String) map.get("clientNickname");
		lastSellClientType = (String) map.get("clientType");
		
		SimplePrinter.printNotice(new StringBuilder().append(lastSellClientNickname).append("[").append(lastSellClientType).append("] played:").toString());
		lastPokers = Noson.convert(map.get("pokers"), new NoType<List<Poker>>() {});
		SimplePrinter.printPokers(lastPokers);
		
		if(map.containsKey("sellClinetNickname")) {
			SimplePrinter.printNotice(new StringBuilder().append("Next player is ").append(map.get("sellClinetNickname")).append(". Please wait for him to play his pokers.").toString());
		}
	}

}
