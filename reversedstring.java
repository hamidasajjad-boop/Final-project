import java.util.Scanner;

public class reversedstring {
    public static void main(String[] args) {
        Scanner scannerobject = new Scanner(System.in);

        String name = scannerobject.nextLine();
        String reversed = "";


        for(int i=0; i<name.length(); i++)
        {
           String letter = name.substring(i, i+1);
           reversed = letter + reversed;

        }
        System.out.println(reversed);
        scannerobject.close();
    }
}
