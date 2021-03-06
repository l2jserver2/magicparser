/*
 * This file is part of l2jserver2 <l2jserver2.com>.
 *
 * l2jserver2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver2.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.magicparser;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXB;

import com.magicparser.net.packet.ProtocolPacket;
import com.magicparser.net.parser.AbstractProtocolParser;
import com.magicparser.net.parser.FileProtocolParser;
import com.magicparser.net.parser.PacketListener;
import com.magicparser.net.parser.ProtocolSession;
import com.rogiel.packetmagic.packet.ProtocolDescriptor;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 * 
 */
public class TestMain {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		final ProtocolDescriptor protocol = JAXB.unmarshal(new File(
				"protocol/lineage2_protocol.xml"), ProtocolDescriptor.class);

		final AbstractProtocolParser parser = new FileProtocolParser(protocol,
				new PacketListener() {
					@Override
					public void receivePacket(ProtocolSession session,
							ProtocolPacket packet) {
						if (packet == null)
							return;
						if (packet.getDescritor() == null)
							return;
						if (packet.getDescritor().getName() == null)
							return;
						if (packet.getDescritor().getName().equals("SM_HTML"))
							System.out.println(packet);
					}

					@Override
					public boolean onException(Throwable exception) {
						exception.printStackTrace();
						return true;
					}
				}, new File("dump.pcap"));
		new Thread(parser).start();
	}
}
