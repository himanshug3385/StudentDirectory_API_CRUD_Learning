package com.wu.learning.StudentDirectory;


import com.wu.learning.StudentDirectory.Entity.MaithUtils;
import org.h2.util.MathUtils;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;

public class PlayTest {
     @Nested
    class CricketTests{
        @Test
         void test1(){
           MaithUtils obj = mock(MaithUtils.class);
        }
     }
     @Nested
    class HockeyTests{
         @Test
         void test1(){

         }
     }
     @Nested
    class TennisTests{
         @Test
         void test1(){

         }
     }
}
