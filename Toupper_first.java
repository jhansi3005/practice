package problems;
import java.util.*;
public class Toupper_first {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a=scan.nextLine();
String b[]=a.split(" ");
for(int i=0;i<b.length;i++)
{
String t=(b[i].substring(0,1)).toUpperCase();
//System.out.println(t);
System.out.print(t+b[i].substring(1,b[i].length())+" ");
}
}
}
