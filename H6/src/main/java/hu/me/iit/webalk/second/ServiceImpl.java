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

    //A LEHETŐ LEGROSSZABB MEGOLDÁS DE MEGOLDÁSNAK NEM ANNYIRA ROSSZ....
    @Override
    public String getImportantAbstract(String str) {
        String result;

        String[] arrOfStr = str.split("<b>");
        result = arrOfStr[2];
        result = result.substring(0, 2);
        return result;
    }

}
