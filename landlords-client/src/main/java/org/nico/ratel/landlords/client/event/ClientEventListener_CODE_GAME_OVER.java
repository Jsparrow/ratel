package org.nico.ratel.landlords.client.event;

import java.util.Map;

import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_GAME_OVER extends ClientEventListener{

	@Override
	public void call(Channel channel, String data) {
		Map<String, Object> map = MapHelper.parser(data);
		SimplePrinter.printNotice(new StringBuilder().append("\nPlayer ").append(map.get("winnerNickname")).append("[").append(map.get("winnerType")).append("]").append(" won the game").toString());
		SimplePrinter.printNotice("Game over, friendship first, competition second\n");
	}

}
