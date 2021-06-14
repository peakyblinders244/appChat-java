import java.net.*;
import java.io.*;

class UDPClient1
{
	public static void main(String[] args)
	{
		try
		{
			byte[] receivedBuf = new byte[100];
			DatagramSocket utpSocket = new DatagramSocket(3400);
			
			DatagramPacket receivedPacket = new DatagramPacket(receivedBuf, receivedBuf.length);
			
			utpSocket.receive(receivedPacket);
			
			
			System.out.println("Received : " + new String(receivedBuf));
			String sentMessage = "I had received your message";
			byte[] sentBuf = new byte[100];
			sentBuf = sentMessage.getBytes("ascii");
			
			InetAddress add = InetAddress.getByName("localhost");
			DatagramPacket sentPacket = new DatagramPacket(sentBuf, sentBuf.length, add, 3500);
			utpSocket.send(sentPacket);
			System.out.println("Sent : " + sentMessage);
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
	}
}
