import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperation {
    public static double roundToHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double invertAndRoundToTenth(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

}
