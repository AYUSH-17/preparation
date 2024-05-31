package org.example.dsa;

public class ReverseStringRecursion {

    //ayush
    // yush + a
    // ush  + y
    // sh + u
    // h + s
    //""+h
    /*rev("") returns "".
    rev("h") returns rev("") + 'h' -> "" + 'h' -> "h".
    rev("sh") returns rev("h") + 's' -> "h" + 's' -> "hs".
    rev("ush") returns rev("sh") + 'u' -> "hs" + 'u' -> "hsu".
    rev("yush") returns rev("ush") + 'y' -> "hsu" + 'y' -> "hsuy".
    rev("ayush") returns rev("yush") + 'a' -> "hsuy" + 'a' -> "hsuya".*/


    public String rev(String str){
        if(str.isEmpty()) {
            return str;
        }
        return rev(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
        ReverseStringRecursion recursion = new ReverseStringRecursion();
        System.out.println(recursion.rev("ayush"));
        String str1 = "ayush";
        System.out.println(str1.substring(1));
        System.out.println(str1.charAt(0));
    }
}
