
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    @Tag("Smoke")
    void test1() {
        System.out.println("Hello world");

    }

    @Test
    @Tag("Smoke")
    void test2() {
        System.out.println("Hello world2");

    }

    @Test
    @Tag("Regression")
    void test3() {
        System.out.println("Hello world2");
    }
}
