import org.example.CalculationEngine;
import org.example.DBConnection;
import org.example.DBGateForCalculations;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculationEngineTest {

    @Mock
    private DBGateForCalculations gate;

    @Mock
    private DBConnection connection;

    @InjectMocks
    private CalculationEngine engine;

    @Test
    public void testEnginesGateIsMocked() {
        assertTrue(Mockito.mockingDetails(engine.getDbGate()).isMock());
        assertNull(engine.getDbGate().getDbConnection());
    }

    @Test
    public void testEnginesDBConnectionIsMocked() {
        assertTrue(Mockito.mockingDetails(connection).isMock());
        assertNull(gate.getDbConnection());
    }

    @Test
    public void testEngineSum() {
        assertEquals(engine.sum(2.5, 3.5), 6);
    }

    @Test
    public void testEngineSumNull() {
        assertEquals(engine.sum(0, 0), 0);
    }

    @Test
    public void testEngineSumNegative() {
        assertEquals(engine.sum(-2.5, -3.5), -6);
    }

}
