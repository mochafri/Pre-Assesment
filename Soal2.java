import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int hasil = A + B;

        int ratusan = hasil / 100;
        int puluhan = hasil % 100 / 10;
        int satuan = hasil % 10;
        System.out.println(toTeks(ratusan) + " ratus " + toTeks(puluhan) + " puluh " + toTeks(satuan));


    }

    public static String toTeks(int hasil){

        String kalimat = "";


        switch (hasil) {
            case 1:
                kalimat = "satu";
                break;
            case 2:
                kalimat = "dua";
                break;
            case 3:
                kalimat = "tiga";
                break;
            case 4:
                kalimat = "empat";
                break;
            case 5:
                kalimat = "lima";
                break;
            case 6:
                kalimat = "enam";
                break;
            case 7:
                kalimat = "tujuh";
                break;
            case 8:
                kalimat = "delapan";
                break;
            case 9:
                kalimat = "sembilan";
                break;
            default:
                break;

        }
        return kalimat;
    }
}
