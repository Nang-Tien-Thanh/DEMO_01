package LAB01;
import java.util.Scanner;
import java.lang.String;
public class Cau4_3_y_dau{
    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Nhap chuoi x :");
        String x=in.nextLine();
        System.out.print("Nhap chuoi y: ");
        String y= in.nextLine();
        System.out.print("\nTong chieu dai chuoi x: "+x.length());
        System.out.print("\n3 ky tu dau tien cua chuoi x: "+ x.substring(0, 3));
        System.out.print("\n3 ky tu cuoi cua chuoi x: "+x.substring(x.length()-3,x.length()) );
    }   

    }
