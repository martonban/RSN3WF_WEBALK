package hu.me.iit.webalk.H8_Auto_Project_Spring;

public class KerekImpl implements Kerek{
    private final int szelleseg;
    private final int atmero;
    private final int koppenymaggasag;

    public KerekImpl(int szelleseg, int atmero, int koppenymaggasag) {
        this.szelleseg = szelleseg;
        this.atmero = atmero;
        this.koppenymaggasag = koppenymaggasag;
    }

    @Override
    public String toString() {
        return "KerekImpl{" +
                szelleseg +
                "/ " + koppenymaggasag +
                "R " + atmero +
                '}';
    }
}