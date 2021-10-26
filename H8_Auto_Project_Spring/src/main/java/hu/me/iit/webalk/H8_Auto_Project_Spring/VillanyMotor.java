package hu.me.iit.webalk.H8_Auto_Project_Spring;

public class VillanyMotor implements Motor{
    private final int teljesitmeny;
    private final int feszultseg;

    public VillanyMotor(int teljesitmeny, int feszultseg) {
        this.teljesitmeny = teljesitmeny;
        this.feszultseg = feszultseg;
    }

    @Override
    public String toString() {
        return "VillanyMotor{" +
                "teljesitmeny=" + teljesitmeny +
                ", feszultseg=" + feszultseg +
                '}';
    }
}
