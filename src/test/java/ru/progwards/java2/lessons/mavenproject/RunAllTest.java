package ru.progwards.java2.lessons.mavenproject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SimpleCalculatorSumAndDiffTest.class,
        SimpleCalculatorMultAndDivTest.class
})
public class RunAllTest {
}
