package LAB01;

import java.util.Scanner;

public class Cau4VN {
    //ham nhap so nguyen n
    public static int Nhap(){
        int n;
        Scanner in=new Scanner(System.in);
        do{
            System.out.printf("Nhap vao so nguyen duong n:");
            n=in.nextInt();
        }
        while (n<=0);
        return n;
    }
    //ham liet ke uoc so
    public static void LietKeUocSo(int n){
        System.out.printf("Uoc so cua n la:\n ");
        for(int i=1; i<=n;i++){
            if(n%i==0)
                System.out.println(i);
        }
        System.out.println();
    }
    public static void main (String [] args){
        int n=Nhap();
        LietKeUocSo(n);
    }
}
