import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        double[] distances = new double[5];
        double[] fuelLiters = new double[5];
        double[] efficiencies = new double[5];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter distance for vehicle " + (i + 1) + " (km): ");
            distances[i] = hi.nextDouble();

            System.out.print("Enter fuel for vehicle " + (i + 1) + " (liters): ");
            fuelLiters[i] = hi.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            efficiencies[i] = distances[i] / fuelLiters[i];
            System.out.println("Vehicle " + (i + 1) + ": " + efficiencies[i] + " km/L");
        }

        int best = 0;
        int worst = 0;
        for (int i = 1; i < 10; i++) {
            if (efficiencies[i] > efficiencies[best]) {
                best = i;
            }
            if (efficiencies[i] < efficiencies[worst]) {
                worst = i;
            }
        }

        System.out.println("Most fuel-efficient: Vehicle " + (best + 1));
        System.out.println("Least fuel-efficient: Vehicle " + (worst + 1));
    }
}