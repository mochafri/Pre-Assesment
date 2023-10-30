import java.util.Scanner;

public class Soal1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int bilangan1 = input.nextInt();
        int bilangan2 = input.nextInt();
        int bilangan3 = input.nextInt();

        enkripsi1(bilangan1);
        System.out.println();
        enkripsi1(bilangan2);
        System.out.println();
        enkripsi1(bilangan3);



    }

    public static void enkripsi1(int bilangan){
        int ribuan = (bilangan/1000 + 5) % 10;
        int ratusan = (bilangan/100 + 5) % 10;
        int puluhan = (bilangan/10 + 5) % 10;
        int satuan = (bilangan + 5) % 10;

        System.out.print(ribuan);
        System.out.print(satuan);
        System.out.print(puluhan);
        System.out.print(ratusan);
    }
}