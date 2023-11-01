public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 50;
        double heightMetr = 1.70;
        int bmi = service.calculate(weightKg, heightMetr);
        System.out.println("Индекс массы тела: " + bmi);
    }
}