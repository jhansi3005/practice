package problems;
import java.util.*;
public class Length_predefined {
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	System.out.println(leng(s));
	}

	public static int leng(String s)
	{
	int count=0;
	int i=0;
	while((int)s.charAt(i)!=32)
	{
	count++;
	i++;
	}
	return count;
	}
}
