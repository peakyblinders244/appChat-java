import java.net.*;
import java.io.*;

class UDPClient2
{
	public static void main(String[] args)
	{
		try
		{
			byte[] sentBuf = new byte[100];
			String sentMessage = "Hello, there !";
			System.out.println(" Sent : " + sentMessage);
			
			InetAddress sentHost = InetAddress.getByName("localhost");
			DatagramSocket utpSocket = new DatagramSocket(3500);
			
			sentBuf = sentMessage.getBytes("ascii");
			DatagramPacket sentPacket = new DatagramPacket(sentBuf, sentBuf.length, sentHost, 3400);
			
			utpSocket.send(sentPacket);
			
			byte[] receivedBuf = new byte[100];
			DatagramPacket receivedPacket = new DatagramPacket(receivedBuf, receivedBuf.length);
			utpSocket.receive(receivedPacket);
			System.out.println(" Received : " + new String(receivedBuf));
		}
		catch (Exception e)
		{ 
			e.printStackTrace();
		}
	}
}
