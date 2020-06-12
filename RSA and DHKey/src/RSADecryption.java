import java.math.BigInteger ;

public class RSADecryption {
	
	public static void main(String args[])
	{
		//two prime numbers
		BigInteger p = new BigInteger("8771647");
		BigInteger q = new BigInteger("11143273");
	
		//provided public key e
		BigInteger e = new BigInteger("11464889");
	
		//Cipher text
		BigInteger C = new BigInteger("36812576988923");
	
		//product of two prime numbers
		BigInteger n =p.multiply(q);
	
		//Calculate the valiue of phi
		BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		
		//
		BigInteger d = e.modInverse(phi);
		
		//Calculate plain text
		BigInteger P = C.modPow(d, n);
		System.out.println("Plain text : " + P);
		
//		BigInteger enc = P.modPow(e, n);
//		System.out.println(enc);
	
	 }
	
}
