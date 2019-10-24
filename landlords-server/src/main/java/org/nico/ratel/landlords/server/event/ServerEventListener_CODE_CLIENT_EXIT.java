package org.nico.ratel.landlords.server.event;

import org.nico.ratel.landlords.channel.ChannelUtils;
import org.nico.ratel.landlords.entity.ClientSide;
import org.nico.ratel.landlords.entity.Room;
import org.nico.ratel.landlords.enums.ClientEventCode;
import org.nico.ratel.landlords.enums.ClientRole;
import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.server.ServerContains;

public class ServerEventListener_CODE_CLIENT_EXIT implements ServerEventListener{

	@Override
	public void call(ClientSide clientSide, String data) {

		Room room = ServerContains.getRoom(clientSide.getRoomId());

		if (room == null) {
			return;
		}
		String result = MapHelper.newInstance()
							.put("roomId", room.getId())
							.put("exitClientId", clientSide.getId())
							.put("exitClientNickname", clientSide.getNickname())
							.json();
		room.getClientSideList().stream().filter(client -> client.getRole() == ClientRole.PLAYER).forEach(client -> {
			ChannelUtils.pushToClient(client.getChannel(), ClientEventCode.CODE_CLIENT_EXIT, result);
			client.init();
		});
		ServerContains.removeRoom(room.getId());
	}

}
