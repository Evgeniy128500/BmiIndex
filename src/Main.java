public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetre = 1.87;
        double weightKg = 98;
        int bmi = (int) service.calculate(heightMetre, weightKg);
        System.out.println("Для введенных параметров" + heightMetre + "м" + weightKg + "кг" + "bmi-индекс" + "=" + bmi);
    }
}

