
package LAB01;
import java.util.Scanner;
import java.lang.Math;
public class Cau3 {
    private float tu,mau;
    //ham lay tu so
    public float LayTu(){return tu;}
    public float LayMau(){return mau;}
    //ham khoi tao
    public Cau3() {}
    public Cau3(float tu2, float mau2){
        tu=tu2;
        mau=mau2;
    }
    //ham nhap
    public void Nhap(){
        Scanner in= new Scanner(System.in);
        System.out.printf("Nhap tu so: ");
        tu= in.nextInt();
        do{
            System.out.printf("Nhap mau so: ");
            mau=in.nextInt();
        } while (mau==0);
    }
    //ham tim UCLN
    public float UCLN(float x, float y) {
        float a= Math.abs(x);
        float b=Math.abs(y);
        while ((a) != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    //ham xuat
    public void Xuat(){
        System.out.printf(tu+"/"+mau);
    }
    //ham rut gon phan so
    public Cau3 RutGon(){
        float key=UCLN(LayTu(),LayMau());
        tu= ((float) tu/key);
        mau= ((float) mau/key);
        return this;
    }
    //ham tinh tong
    public Cau3 Tong(Cau3 b){
        float tu=this.LayTu()*b.LayMau() + this.LayMau()*b.LayTu();
        float mau=this.LayMau()*b.LayMau();
        Cau3 temp = new Cau3(tu, mau);
        return temp.RutGon();
    }
    //ham tinh hieu
    public Cau3 Hieu(Cau3 b){
        float tu=this.LayTu()*b.LayMau() - this.LayMau()*b.LayTu();
        float mau=this.LayMau()*b.LayMau();
        Cau3 temp = new Cau3(tu, mau);
        return temp.RutGon();
    }
    //ham tinh tich
    public Cau3 Tich(Cau3 b){
        float tu=this.LayTu()*b.LayTu();
        float mau=this.LayMau()*b.LayMau();
        Cau3 temp = new Cau3(tu, mau);
        return temp.RutGon();
    }
    //ham tinh thuong
    public Cau3 Thuong(Cau3 b){
        float tu=this.LayTu()*b.LayMau();
        float mau=this.LayMau()*b.LayTu();
        Cau3 temp = new Cau3(tu, mau);
        return temp.RutGon();
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.printf("- Nhap PS1:\n");
        Cau3 PS1 = new Cau3();
        Cau3 PS2= new Cau3();
        PS1.Nhap();
        System.out.printf("- Nhap phan so PS2: \n");
        PS2.Nhap();

        System.out.printf("Tong 2 phan so la: "); PS1.Tong(PS2).Xuat();
        System.out.printf("\nHieu 2 phan so la: ");PS1.Hieu(PS2).Xuat();
        System.out.printf("\nTich 2 phan so la: ");PS1.Tich(PS2).Xuat();
        System.out.printf("\nThuong 2 phan so la: ");PS1.Thuong(PS2).Xuat();
    }
}

