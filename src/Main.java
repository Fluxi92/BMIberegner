import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vægt;
        double højde;

        System.out.println("Velkommen til BMI-beregneren");
        System.out.println("Hvad er din vægt i kilo?");

        Scanner sc = new Scanner(System.in);
        vægt = sc.nextDouble();

        System.out.println("Hvad er din højde i meter");
        højde = sc.nextDouble();

        if (højde > 100) {
            højde = højde / 100;
        }


        double BMI = (vægt) / (højde * højde);
        System.out.println("Din BMI er" + BMI);

        if (BMI < 18.5)
            System.out.println("Du er undervægtig");
        if (BMI > 18.5 && BMI <= 25)
            System.out.println("Du er normalvægtig");
        else if (BMI > 25 && BMI <= 30)
            System.out.println("Du er overvægtig");
        else if (BMI > 30)
            System.out.println("Du er kraftig overvægtig");

    }

}