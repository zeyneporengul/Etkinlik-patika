import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
          Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
          Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
          Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık: ");
        sicaklik = input.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak");
        } else if(sicaklik>=5 && sicaklik<15){
            System.out.println("Sinema");
        } else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Piknik");
        } else if(sicaklik>=25){
            System.out.println("Yüzme");
        }

    }
}
