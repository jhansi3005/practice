package problems;
import java.util.*;
import java.io.*;
public class Alphabetical {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.next();
char ch[]=s.toCharArray();
Arrays.sort(ch);
String t=String.valueOf(ch);
System.out.println(t);
StringBuilder sb=new StringBuilder(t);
sb.reverse();
System.out.println(sb);

}

}
