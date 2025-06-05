//You are given an n integer , you have to convert it into a string.
//Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

import java.util.*;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n + "";
        if (n == Integer.parseInt(str)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }


        
    }
}
