import java.util.BitSet;

public class BitSetClass {
    public static void main(String [] args){
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        for(int i = 0; i < 16; i++){
            if((i%2) == 0)bits1.set(i);
            if((i%5) == 0)bits2.set(i);
        }
        System.out.println("initial pattern in bit1:- ............");
        System.out.println(bits1);
        System.out.println("initial pattern in bit2:- ............");
        System.out.println(bits2);

        bits2.and(bits1);
        System.out.println("bits2 AND bits1");
        System.out.println(bits2);

        bits2.or(bits1);
        System.out.println("bits2 OR bits1");
        System.out.println(bits2);

        bits2.xor(bits1);
        System.out.println("bits2 XOR bits1");
        System.out.println(bits2);
    }
    
}
