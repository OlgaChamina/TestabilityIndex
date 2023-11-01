public class BmiService {
    public int calculate(int weightKg, double heightKg) {
        double bmi = weightKg / heightKg / heightKg;

        return (int) bmi;
    }
}
