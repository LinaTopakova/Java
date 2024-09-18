package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void exercise_1() {
        int n = 5;
        List<String> list = Main.exercise_1(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        expected.add("fizz");
        assertEquals(expected,list);
    }

    @Test
    void exercise_2() {
        String s1="Polina";
        String s2 = Main.exercise_2(s1);
        assertEquals("aniloP",s2);
    }

    @Test
    void exercise_3() {
        List<String> list = Main.exercise_3(1,1,1);
        List<String> expected = new ArrayList<>();
        expected.add("not");
        assertEquals(expected,list);

        list = Main.exercise_3(1,0,-9);
        expected.clear();
        expected.add("-3.0");
        expected.add("3.0");
        assertEquals(expected,list);

        list = Main.exercise_3(0,1,-9);
        expected.clear();
        expected.add("9.0");
        assertEquals(expected,list);

        list = Main.exercise_3(0,0,0);
        expected.clear();
        expected.add("R");
        assertEquals(expected,list);

    }

    @Test
    void exercise_4() {
        double eps = Math.pow(10,-1);
        double s = Main.exercise_4(eps);
        assertEquals(0.25,s);
    }

    @Test
    void exercise_5() {
        String s="asdfghgfdsa";
        boolean b = Main.exercise_5(s);
        assertTrue(b);

        s = "dkssld";
        b = Main.exercise_5(s);
        assertFalse(b);
    }
}