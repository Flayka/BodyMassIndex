public class BmiService {
    public double calculate(double weight, double height) {
        double heightMeter = height/100;
        double bmi = weight/heightMeter/heightMeter;
        return bmi;
        }
}