package problems;
import java.util.*;
public class delete_character {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a1=scan.next();
String a=scan.next();
String b=" ";
for(int i=0;i<a1.length();i++)
{
String t=String.valueOf(a1.charAt(i));
//System.out.println(t);
if(t.equals(a))
{
continue;
}
else
{
b=b+a1.charAt(i);
}
}
System.out.println(b);
}

}
