package hu.me.iit.webalk.H8_Auto_Project_Spring;

public class BelsoEgesuMotor {
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
