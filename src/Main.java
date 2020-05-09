public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60; // масса тела в килограммах
        double height = 190; // рост в сантиметрах
        double bmi = service.calculate(weight, height);
        System.out.printf("%.2f %n", bmi);
    }
}