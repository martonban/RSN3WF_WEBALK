package hu.me.iit.webalk.second;

public class ServiceImpl implements Service{

    private final Dependency dependency;

    public ServiceImpl(Dependency dependency){
        this.dependency = dependency;
    }

    @Override
    public void calculate() {
        dependency.helpNoParameterNoReturnValue();
    }

    @Override
    public int return5(){
        return 5;
    }

    @Override
    public int callHelpAndUsedReturnValue() {
        return dependency.helpNoParameterReturnValue();
    }

    @Override
    public void callHelpAndPassParameterFive() {
      dependency.helpParameterNoReturnValue(5);
    }

    @Override
    public String getImportantAbstract(String str) {
        String result;

        result = str.substring(0, 3);
        result = result + "...";
        result = dependency.important(result);
        return result;
    }

}
