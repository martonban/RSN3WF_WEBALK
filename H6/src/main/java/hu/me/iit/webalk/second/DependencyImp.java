package hu.me.iit.webalk.second;

public class DependencyImp implements Dependency{

    @Override
    public void helpNoParameterNoReturnValue() {}

    @Override
    public int helpNoParameterReturnValue() {
        return 0;
    }

    @Override
    public int helpParameterReturnValue(int a) {
        return 0;
    }

    @Override
    public void helpParameterNoReturnValue(int a) {}

    @Override
    public String important(String a) {
        return "<b> " + a + " </b>";
    }
}
