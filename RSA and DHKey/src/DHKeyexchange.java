import java.math.BigInteger;

public class DHKeyexchange {
	
	public static void main(String args[])
	 {
		//prime number
		BigInteger q=new BigInteger("293040877");
		
		//primitive number
		BigInteger a=new BigInteger("11");
		
		//my private key
		BigInteger mypri=new BigInteger("178395426");
		
		//Cal my public key
		BigInteger mypub=a.modPow(mypri,q);
		
		
		//provided public key
		BigInteger propub=new BigInteger("1915204");
		
		//Cal secrete shared key
		BigInteger sharkey=propub.modPow(mypri,q);
		
		System.out.println("Shared private key : " + sharkey);
		System.out.println("My public key : " + mypub);
	}
}