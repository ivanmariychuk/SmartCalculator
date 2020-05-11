import calculator.MainKt;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.SimpleTestCase;

import java.util.Arrays;
import java.util.List;

public class Test extends StageTest {

    public Test() {
        super(MainKt.class);
    }

    @Override
    public List<SimpleTestCase> generate() {
        return Arrays.asList(
            new SimpleTestCase(
                "/exit",
                "Bye!"
            ),
            new SimpleTestCase(
                "17 9\n-2 5\n\n7\n/exit",
                "26\n3\n7\nBye!"
            ),
            new SimpleTestCase(
                "100 200\n500\n300 400\n200\n\n\n-500\n/exit",
                "300\n500\n700\n200\n-500\nBye!"
            )
        );
    }

}
