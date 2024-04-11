package LAB01;

import java.util.Scanner;
import java.util.Arrays;

public class Cau7VN {

    //ham nhap mang 2 chieu
    public static void NhapMang(int row, int column, int arr[][]){
        Scanner in = new Scanner(System.in);
        for (int i=0; i<row;i++){
            for(int j=0;j<column;j++){
                while (arr[i][j]<=0 || arr[i][j]>=100)
                {
                    System.out.printf("Nhap arr["+i+"]["+j+"]=");
                    arr[i][j]=in.nextInt();
                } ;
            }
            System.out.println();
        }      
    }

    //ham xuat mang
    public static void XuatMang(int row, int column, int arr[][]){
        for(int i=0;i<row;i++){
            for( int j=0;j<column;j++)
                System.out.printf(arr[i][j]+ " ");
            System.out.println();
        }
    }

    //ham tim phan tu lon nhat cua mang
    public static int arrMax(int row, int column,int arr[][]){
        int max=arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(max<arr[i][j])
                    max=arr[i][j];
            }
        }
        return max;
    }

    //ham kiem tra so nguyen to
    public static boolean KTSoNguyenTo(int n){
        if (n<2)
            return false;
        else if (n==2)
            return true;
        else
        for(int i=2; i<n;i++)
            if(n%i==0)
                return false;
        return true;
    }
    //in ra phan tu la so nguyen to
    public static void InSoNguyenTo (int row, int column, int arr[][]){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(KTSoNguyenTo(arr[i][j])==true)
                    System.out.printf(arr[i][j]+" " );
            }
        }
    }

    //sx cac cot mang a theo thu tu tang dan 
    public static void SXCotTangDan( int row, int column, int arr[][]){
        for(int j=0;j<column;j++){
            int c[]=new int [row];
            for(int i=0;i<row;i++){
                c[i]=arr[i][j];
            }
            Arrays.sort(c);
            for(int i=0;i<row;i++){
                arr[i][j]= c[i];
            }
        }
        XuatMang(row, column, arr);
    }
    public static void main (String [] args){
        int arr[][]=new int[100][100];
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap row: ");
        int row=in.nextInt();
        System.out.printf("Nhap so column: ");
        int column=in.nextInt();
        NhapMang(row,column,arr);
        int max=arrMax(row, column, arr);
        System.out.println("Phan tu lon nhat trong mang la:"+max);
        System.out.println("Danh sach cac so nguyen to:");
        InSoNguyenTo(row, column, arr);
        System.out.println();
        System.out.println("Cac cot sap xep tang dan la: ");
        SXCotTangDan(row, column, arr);
    }
}
