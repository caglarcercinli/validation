package be.vdab.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class PrijsValidator implements ConstraintValidator<Prijs, BigDecimal> {
    @Override
    public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            return false;
        }
        var aantalCijfersNaKomma = value.scale();
        if (aantalCijfersNaKomma > 2) {
            return false;
        }
        var totaalAantalCijfers = value.precision();
        return totaalAantalCijfers - aantalCijfersNaKomma <= 7;
    }

    @Override
    public void initialize(Prijs constraintAnnotation) {
        //ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
