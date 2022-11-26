package basic;

public class reverseString {

    String methodStringReverse(String x)
    {
        char [] y = x.toCharArray();
        String revString = "";

        for (int i=y.length-1;i>=0;i--)
        {
            revString = revString+y[i];
        }

         return revString;
    }

    public static void main(String[] args) {

        reverseString rs = new reverseString();
        System.out.println(rs.methodStringReverse("Gluck"));
    }
}
