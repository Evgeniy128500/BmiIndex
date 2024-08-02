public class BmiService {
    public double calculate(double heightMetre, double weightKg) {
        double heightSquare = heightMetre * heightMetre;
        double bmiresult = weightKg / heightSquare;
        int result = (int) bmiresult;
        return result;
    }
}

