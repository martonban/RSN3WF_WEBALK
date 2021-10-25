public class BelsoEgesuMotor implements Motor{

    private final int loero;
    private final int ccm;

    public BelsoEgesuMotor(int loero, int ccm) {
        this.loero = loero;
        this.ccm = ccm;
    }

    @Override
    public String toString() {
        return "MotorImpl{" +
                "loero=" + loero +
                ", ccm=" + ccm +
                '}';
    }
}
