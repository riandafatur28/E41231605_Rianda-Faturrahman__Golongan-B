
package menghitungpangkat;
import java.util.Scanner;

public class MenghitungPangkat {
public static double hitungPangkat(double angka, int pangkat) {
    if(pangkat==0){
        return 1;
    } else{
        return angka *hitungPangkat(angka, pangkat -1);
    }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        double angka = input.nextInt();
        System.out.print("Masukkan pangkat : ");
        int pangkat = input.nextInt();
        double hasil = hitungPangkat(angka, pangkat);
        System.out.println(angka + "^" + pangkat + " = " + hasil);
        }

}
    

  