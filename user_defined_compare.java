package problems;
import java.util.*;
public class user_defined_compare {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a=scan.next();
String b=scan.next();
if(a.length()==b.length())
{
System.out.println(com(a,b));
}
else
{
System.out.println("the strings are not equal");
}
}

static boolean com(String a,String b)
{
for(int i=0;i<a.length();i++)
{
int n=(int)a.charAt(i);
int m=(int)b.charAt(i);
if(n==m)
{
}
else
{
return false;
}
}
return true;
}
}
