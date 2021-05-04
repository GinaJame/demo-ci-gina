package com.example.democi;

import com.example.democi.service.PruebaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaServiceUnitTest extends DemoCiApplicationTests{

    @Autowired
    PruebaService pruebaService;

    @Test
    public void sumaTest(){
        assertEquals(2.0,pruebaService.suma(5.0,2.0));
    }
}
