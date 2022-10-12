import java.math.BigInteger;

public class MyClass {
    public static void main(String args[]) {
      int index = 2;
      BigInteger first = BigInteger.valueOf(1);
      BigInteger second = BigInteger.valueOf(1);
      BigInteger next;
      
      do {
        next = first.add(second);
        first = second;
        second = next;
          
        index++;
      } while (next.toString().length() < 1000);

      System.out.println(index);
    }
}