package be.vdab.validation.domain;

import be.vdab.validation.constraints.Prijs;
import be.vdab.validation.constraints.VerkoopPrijsAankoopPrijs;

import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
@VerkoopPrijsAankoopPrijs
public class Product {
    //@PositiveOrZero @Digits(integer = 7, fraction = 2)
    @Prijs
    private BigDecimal aankoopPrijs;
    //@PositiveOrZero @Digits(integer = 7, fraction = 2)
    @Prijs
    private BigDecimal verkoopPrijs;

    public BigDecimal getAankoopPrijs() {
        return aankoopPrijs;
    }

    public void setAankoopPrijs(BigDecimal aankoopPrijs) {
        this.aankoopPrijs = aankoopPrijs;
    }

    public BigDecimal getVerkoopPrijs() {
        return verkoopPrijs;
    }

    public void setVerkoopPrijs(BigDecimal verkoopPrijs) {
        this.verkoopPrijs = verkoopPrijs;
    }
}
