import java.rmi.*;
import java.io.*;
public class TemperatureClient{
public static void main(String[ ] args) throws NotBoundException, IOException{
	String url="rmi:// localhost:1099/temObj";
	TemperatureInterface remoteObj= (TemperatureInterface) Naming.lookup(url);
	System.out.println("Got remote object");
	BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
	System.out.println("Enter the Fahrenheit value of temperature:");
double fahrenheit=Double.parseDouble(br.readLine());
Double c=remoteObj.FahrenheitToCelsius(fahrenheit);
System.out.println(fahrenheit+ "F=" +c+ "C");
}}