package GS;

public class GcdOfStrings {
	public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1))  return "";
    
        int g = gcd(str1.length() , str2.length());
        return str2.substring(0, g);
    }
    public static int gcd(int p, int q) {
    if (q == 0) return p;
    else return gcd(q, p % q);
    }
}
