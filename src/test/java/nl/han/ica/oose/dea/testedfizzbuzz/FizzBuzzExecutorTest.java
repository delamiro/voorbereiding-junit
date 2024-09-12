package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {
    @Test
    void testFizzBuzzReturnNull() {
        FizzBuzzExecutor executor = new FizzBuzzExecutor();
        assertEquals(null,executor.execute(7));
    }
}