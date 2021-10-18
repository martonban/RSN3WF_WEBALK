package hu.me.iit.webalk.second;

public interface Dependency {
    void helpNoParameterNoReturnValue();
    int helpNoParameterReturnValue();
    int helpParameterReturnValue(int a);
    void helpParameterNoReturnValue(int a);
    String important(String a);
}