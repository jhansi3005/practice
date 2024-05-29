package problems;
import java.util.*;
public class replace_with_previous {

public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a=scan.nextLine();
String b[]=a.split(" ");
int n=b.length;
//System.out.println(b[n-1]);
//System.out.println(b[n-1].charAt(b[n-1].length()-1));
for(int i=0;i<b.length;i++)
{
String st="";
if(i==0)
{
char ch=b[n-1].charAt(b[n-1].length()-1);
st=b[i].replace(b[i].charAt(0),ch);
}
else
{
st=b[i].replace(b[i].charAt(0),b[i-1].charAt(b[i-1].length()-1));
}
System.out.println(st);
}
}
}
