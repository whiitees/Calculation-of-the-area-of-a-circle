import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień koła: ");
        double promien = scanner.nextDouble();
        double pole = obliczPoleKola(promien);
        System.out.println("Pole koła o promieniu " + promien + " to: " + pole);
    }

    public static double obliczPoleKola(double promien) {
        return Math.PI * Math.pow(promien, 2);
    }
}
