import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int n1, n2, select;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("İlk Sayıyı giriniz:" );
        n1 = sc.nextInt();
        System.out.print("İkinci Sayıyı giriniz:" );
        n2 = sc.nextInt();
        System.out.println();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = sc.nextInt();
        // RESULT
        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
            break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
            break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
            break;
            case 4:
                System.out.println("Bölme: " + (n1 / n2));
            break;
            default :
                System.out.println("Lütfen Geçerli Bir İşlem Giriniz...");
        }

    }
}
