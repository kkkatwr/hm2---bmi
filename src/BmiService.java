import java.lang.module.FindException;

public class BmiService {
    public int bmi(double heightInMeters, int weightInKg) {
        int bmi = (int) (weightInKg / (heightInMeters * heightInMeters));
        return bmi;
    }
}
