package LAB01;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class Cau9 {
    //ham nhap mang
    public static void Nhap(int number, int arr[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap mang:");
        for(int i=0;i<number;i++)
            arr[i]=in.nextInt();
    }

    //ham xuat mang
    public static void Xuat(int number, int arr[]){
        System.out.println("Xuat mang:");
        for(int i=0; i<number;i++)
            System.out.printf(arr[i]+" ");
    }
    //ham tim max trong mang
    public static int max (int number, int arr[]){
        int max=arr[0];
        for(int i=1; i<number;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    //ham tim min trong mang
    public static int min (int number, int arr[]){
        int min= arr[0];
        for(int i=1; i<number; i++)
            min=Math.min(min,arr[i]);
        return min;
    }

    //ham kiem tra x co nam trong mang khong
    public static boolean KT_x(int key,int number, int arr[]){
        Arrays.sort(arr);
        int KT=Arrays.binarySearch(arr, key);
        if(KT>=0)
            return true;
        return false;
    }

    //ham dem so phan tu co gia tri bang x
    public static int BangX(int key,int number, int arr[]){
        int value=0;
        for(int i=0;i<number;i++)
            if(arr[i]==key)
                value++;
        return value;
    }

    //ham main
    public static void main (String[]args){
        Scanner in= new Scanner(System.in);
        System.out.printf("Nhap so phan tu cua mang: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        Nhap(n, arr);
        System.out.printf("a/ Cac phan tu cua mang la: "+Arrays.toString(arr)+"\n");


        System.out.printf("b/ Phan tu nho nhat trong mang: "+min(n, arr)+"\n");
        System.out.printf("Phan tu lon nhat trong mang la: "+max(n, arr)+"\n");
        System.out.println();

        System.out.print("c/ Nhap vao so x: ");
        int x=in.nextInt();
        if(KT_x(x, n, arr)==true)
            System.out.printf(x+" co trong mang arr");
        else
            System.out.printf(x+" khong co trong mang arr");
        System.out.println();
        System.out.printf("\nd/ So phan tu co gia tri bang "+x+" la: "+BangX(x, n, arr));

        Arrays.sort(arr);
        System.out.printf("\ne/ Ham sau khi sap xep tang dan: "+Arrays.toString(arr));
    }   

}
