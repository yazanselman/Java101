import java.util.*;
import java.io.*;

class Main {

    public static String LetterCapitalize(String str) {

        String[] kelime = str.split(" ");
        String k="";

        for(String t : kelime){
            k += t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase() +" ";

        }
        // code goes here
        return k;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
      //  System.out.print(LetterCapitalize(s.nextLine()));

        int a = 5;
        int b = 9;
        int c = 0;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        System.out.println(b + "," + a);
    }

}