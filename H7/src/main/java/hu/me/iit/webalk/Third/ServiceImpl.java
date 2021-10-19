package hu.me.iit.webalk.Third;

import org.springframework.beans.factory.config.DependencyDescriptor;
import hu.me.iit.webalk.Third.Dependency;

public class ServiceImpl implements Service{
    private Dependency dependency;
    private final String value;

    public ServiceImpl(){
        this.value = Double.toString(Math.random());
        this.dependency = dependency;
    }


    @Override
    public void calculate() {
        dependency.helpNoParameterNoReturnValue();
    }

    @Override
    public String getValue() {
        return null;
    }
}
