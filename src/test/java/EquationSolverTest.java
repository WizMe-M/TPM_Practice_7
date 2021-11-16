import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationSolverTest {

    @BeforeAll
    static void setUp() {
        System.out.println("@BeforeAll annotation - one root");
        double[] expected, actual;
        double a, b, c;

        expected = new double[1];
        expected[0] = -1;
        a = 1;
        b = 2;
        c = 1;
        actual = EquationSolver.Solve(a, b, c);
        assertArrayEquals(expected, actual);
    }

    @AfterAll
    static void tearDown() {

        System.out.println("@AfterAll annotation - two roots");
        double[] expected, actual;
        double a, b, c;

        expected = new double[2];
        expected[0] = -1;
        expected[1] = -3;
        a = 1;
        b = 4;
        c = 3;
        actual = EquationSolver.Solve(a, b, c);
        assertArrayEquals(expected, actual);
    }

    @Test
    void solve() {

        double[] expected, actual;
        double a, b, c;

        System.out.println("@Test annotation - zero roots");
        expected = new double[0];
        a = 1;
        b = 1;
        c = 3;
        actual = EquationSolver.Solve(a, b, c);
        assertArrayEquals(expected, actual);
    }
}