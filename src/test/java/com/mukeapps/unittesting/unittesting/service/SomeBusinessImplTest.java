package com.mukeapps.unittesting.unittesting.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SomeBusinessImplTest {

    private SomeBusinessImpl someBusiness;

    @BeforeEach
    void setUp() {
        this.someBusiness = new SomeBusinessImpl();
    }

    @AfterEach
    void tearDown() {
    }

//    @Test
//    void  test(){
//        fail("Not Yet Implemented");
//    }

    @Test
    public   void  calculateSum_basic(){
        int actuarResult = someBusiness.calculateSum(new int[] {1,2,3});

        int expectedResult = 6;
        assertEquals(actuarResult , expectedResult);
    }


    @Test
    public   void  calculateSum_empty(){
        int actuarResult = someBusiness.calculateSum(new int[] {});

        int expectedResult = 0;
        assertEquals(actuarResult , expectedResult);
    }
}