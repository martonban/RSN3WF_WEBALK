import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Motor motor16 = new BelsoEgesuMotor(180, 1600);
        Kerek[] kereks = new Kerek[4];

        for(int i = 0; i<4; i++){
            kereks[i] = new KerekImpl(185, 15, 65);
        }



        AutoImpl opelAstra = new AutoImpl(motor16, kereks, "Opel Astra");

        System.out.println(opelAstra);
    }

}