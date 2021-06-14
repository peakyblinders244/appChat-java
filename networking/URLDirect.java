import java.net.*; 
import java.io.*; 

public class URLDirect
{ 
	public static void main(String[] args) 
	{
		try
		{
			URL url = new URL("http://localhost");
			 
			BufferedReader in = new BufferedReader( 
					new InputStreamReader(url.openStream()));  
			String inputLine;
			while ((inputLine = in.readLine()) != null) 			      	      
				System.out.println(inputLine); 
			in.close(); 
		} 
		catch (MalformedURLException mue)
		{
			System.out.println("Check your URL");
		}
		catch (IOException ioe)
		{
			System.out.println("Check your IO stream");
		}
	} 
} 