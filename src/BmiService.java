import java.lang.module.FindException;

public class BmiService {
    public int bmi(double height_in_meters, int weight_in_kg) {
        int bmi = (int) (weight_in_kg / (height_in_meters * height_in_meters));
        return bmi;
    }
}
