import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String jenisKelamin = input.nextLine();
        double beratBadan = input.nextDouble();
        double tinggiBadan = input.nextDouble();

        tinggiBadan = tinggiBadan / 100;

        double BMI = beratBadan / (tinggiBadan * tinggiBadan);


        switch (jenisKelamin) {
            case "Pria":
            System.out.printf("%.2f, ", BMI);
                pria(BMI);
                break;
            case "Wanita":
            System.out.printf("%.2f, ", BMI);
                wanita(BMI);
                break;
            default:
                break;
        }


    }

    public static void pria(double BMI){


        if(BMI <= 20.50){
            System.out.println("Kurus");
        } else if (BMI >= 20.50 && BMI <= 26.99){
            System.out.println("Ideal");
        } else if (BMI >= 27){
            System.out.println("Gemuk");
        }
    }

     public static void wanita(double BMI){
        if(BMI <= 18.50){
            System.out.println("Kurus");
        } else if (BMI >= 18.50 && BMI <= 24.99){
            System.out.println("Ideal");
        } else if (BMI >= 25){
            System.out.println("Gemuk");
        }
    }
}
