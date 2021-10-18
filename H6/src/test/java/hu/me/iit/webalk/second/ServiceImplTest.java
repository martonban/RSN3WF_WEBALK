package hu.me.iit.webalk.second;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServiceImplTest {


    @Mock Dependency dependency;

    @InjectMocks ServiceImpl service;


    //Itt azt nézzük, hogy a service-ben meghívódik e a Dependency-nek a metódusa.
    @Test
    void calculateTest() {
        //GIVEN

        //WHEN
        service.calculate();
        //THEN
        verify(dependency, times(1)).helpNoParameterNoReturnValue();
    }

    @Test
    void return5Test(){
        //GIVEN
        final int FIVE = 5;
        //WHEN
        int result = service.return5();
        //THEN
        assertEquals(FIVE, result);
    }


    // Itt tudjuk, hogy 5-el tér vissza de a Mock megváltoztatja ezt, a thenReturn(FIVE)-al
    @Test
    void dependencyReturnValueIsUsedTest(){
        //GIVEN
        final int FIVE = 5;
        when(dependency.helpNoParameterReturnValue()).thenReturn(FIVE);
        //WHEN
        int result = service.callHelpAndUsedReturnValue();
        //THEN
        verify(dependency, times(1)).helpNoParameterReturnValue();
        assertEquals(FIVE, result);
    }

    //
    @Test
    void dependencyReturnValueIsUsedTest2(){
        //GIVEN
        final int FIVE = 5;

        //WHEN
        service.callHelpAndPassParameterFive();

        //THEN
        ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);
        verify(dependency, times(1)).helpParameterNoReturnValue(captor.capture());
        assertEquals(FIVE, captor.getValue());
    }


}