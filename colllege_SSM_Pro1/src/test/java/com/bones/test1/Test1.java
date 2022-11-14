package com.bones.test1;

import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1(){
        String s = "option1,option1,option2,option1,option1";
        String[] split = s.split(",");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
