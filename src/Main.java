public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        // вес в кг.
        double weight = 64.0;
        // рост в м.
        double height = 1.65;

        int bmi = bmiService.calculate(weight, height);

        System.out.println(" Индекс массы тела: " + bmi);

        // вес в кг.
        double weightX = 125.0;
        // рост в м.
        double heightX = 1.95;

        int bmiX = bmiService.calculate(weightX, heightX);

        System.out.println(" Индекс массы тела: " + bmiX);
    }
}