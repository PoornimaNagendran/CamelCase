import java.util.Scanner;
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = null;
		String result="";
		String b;
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String sent=s.nextLine();
String[] str=sent.split(" ");
String d;
for(int i=0;i<str.length;i++)
{
	 a=str[i].toCharArray();
	if(a[0]>96 && a[0]<123)
	{
		a[0]=(char) (a[0]-32);
	b=new String(a);
		d=b.toString();
	result=result+" "+d;
	}	
}
System.out.println(result);
	}

}
