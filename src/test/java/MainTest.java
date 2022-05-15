import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MainTest {
    //public static double pi = 3.14;


    @BeforeAll
    public static void beforeAllMetod() {
        System.out.println("Start Test");
    }

    @Test
    public void areaTest() {
        double R = 10;
        double expected = 314;
        // when:
        double result = Main.area(10);
        // then:
        Assertions.assertEquals(expected, result);
        System.out.println("Test areaTest passed");
    }

    @Test
    public void circumferenceTest() {
        double R = 26;
        double expected = 163;
        // when:
        double result = Main.circumference(26);
        // then:
        Assertions.assertEquals(expected, result);
        System.out.println("Test circumferenceTest  passed");
    }

    @ParameterizedTest
    @MethodSource("testSourse")
    public void testVolume(double R, double expected) {
        double result = Main.volume(R);
        Assertions.assertEquals(expected, result);
        System.out.println("Test testVolume  passed");
    }

    private static Stream<Arguments> testSourse() {
        return Stream.of(
                Arguments.of(20, 25120),
                Arguments.of(11, 4179)
        );
    }


    @AfterAll
    public static void afterAllMetod() {
        System.out.println("Finish Test");
    }
}
