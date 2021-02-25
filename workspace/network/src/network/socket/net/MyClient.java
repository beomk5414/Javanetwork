package network.socket.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 최초작성자 : 김범석
 * 최초작성일 : 2021-02-25
 * 최종변경일 : 2021-02-25
 * 목적 : 소켓통신 클라이언트 테스트
 */

public class MyClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5000));
			System.out.println("MyServer에 접속되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// socket을 닫아야 합니다.
				if(socket != null) {
					socket.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
