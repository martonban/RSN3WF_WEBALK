import java.util.Arrays;
import java.util.List;

public class AutoImpl {
    private final Motor motor;
    private final Kerek[] kerekek;
    private final String tipus;


    public AutoImpl(Motor motor, Kerek[] kerekek, String tipus) {
        this.motor = motor;
        this.kerekek = kerekek;
        this.tipus = tipus;
    }


    //A motornál mindegy, hogy villany/Belso Egesű, a string az olyan lesz amit megadtunk
    @Override
    public String toString() {
        return "AutoImpl{" +
                "motor=" + motor.toString() +
                ", kerekek=" + kerekek[0].toString() +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}

