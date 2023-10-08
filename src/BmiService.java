public class BmiService {
    public int calculate(double weight, double height) {

        // Расчет по формуле индекс массы тела
        double bmi = weight / (height * height);

        // Округдение дробного числа в целое
        int bmiInteger = (int) bmi;

        return bmiInteger;
    }
}