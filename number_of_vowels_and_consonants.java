package problems;
import java.util.*;
public class number_of_vowels_and_consonants {

public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a1=scan.next();
String a=a1.toLowerCase();
int con=0;
int vow=0;
System.out.println(a);
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
{
vow++;
}
else if(a.charAt(i)>='a'&&a.charAt(i)<='z')
{
con++;
}
}
System.out.println("NUmber of vowels in given string is "+vow);
System.out.println("Number of consonants in given string is "+con);
}
}
