package codewars;

import java.util.Scanner;

public class WhoLikesThis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int namesLength = scan.nextInt();
            String[] names = new String[namesLength];
            for(int i=0; i<namesLength; i++) {
                names[i] = scan.next();
            }
           String resultStr = whoLikesIt(names);
            System.out.println(resultStr);
        }
    }

    private static String whoLikesIt(String... names) {
        int namesLen = names.length;
        StringBuilder sb = new StringBuilder("");
        if(namesLen == 0) {
            sb.append("no one likes this");
            return sb.toString();
        }
        if(names.length == 1) {
            sb.append(names[0]+" likes this");
            return sb.toString();
        }
        if(names.length <= 3) {
            int ptr = 0;
            while(ptr < namesLen - 2) {
                sb.append(names[ptr]+", ");
                ptr++;
            }
            sb.append(len2(names[ptr],names[ptr+1]));
            return sb.toString();
        }
        sb.append(names[0]+", "+names[1]+makeStr(namesLen));

        return sb.toString();
    }
    private static String len2(String str1, String str2) {
        return str1+" and "+str2+" like this";
    }
    private static String makeStr(int len) {
        return " and "+(len-2)+" others like this";
    }
}
