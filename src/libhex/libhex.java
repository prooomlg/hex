package libhex;
import java.math.*;
public class libhex {
    public static void HexToBig(BigInteger _a){
        System.out.println(_a.toString(10));
    }
    public static void HexToLittle(BigInteger _a){
        String htl = _a.toString(16);
        String newhtl="";
        for (int i = htl.length()-1;i >= 0 ;i-=2){
            if (i!=0){newhtl+=htl.charAt(i-1);}
            else {newhtl+="0";}
            newhtl+=htl.charAt(i);
        }
        BigInteger a = new BigInteger(newhtl , 16);
        System.out.println(a);
    }
    public static void LittleToHex(BigInteger _a,int kol_byte){
        kol_byte *= 2;
        String lth = _a.toString(16);
        while (lth.length()<kol_byte){
           lth = "0"+lth;
        }
        String newlth="";
        for (int i = lth.length()-1;i >= 0 ;i-=2){
            if (i!=0){newlth+=lth.charAt(i-1);}
            else {newlth+="0";}
            newlth+=lth.charAt(i);
        }
        System.out.println(newlth);
    }
    public static void BigToHex(BigInteger _a){
        System.out.println(_a.toString(16));
    }
}
