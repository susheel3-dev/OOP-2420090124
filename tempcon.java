import java.util.*;
public class tempcon {
public static void main(String args[]) {
float f;
float c;
System.out.println("Enter temp in fahrenheit:");
Scanner sc=new Scanner(System.in);
f=sc.nextInt();
c=(f-32)*5/9;
System.out.println("temp converted:"+c);
}
}