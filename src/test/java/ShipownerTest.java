import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipownerTest {

    private Shipowner shipowner;
    private Vessel v1;
    private Vessel v2;

    @BeforeEach
    void shipownerSetup() {
        shipowner = new Shipowner();
        v1 = new Vessel("Copernicus", 150, 200, 1000, 1000000, 500);
        v2 = new Vessel("Sternfeld", 90, 110, 200, 520000, 400);
    }

    @Test
    void removeNotExistingElement() {
        assertTrue(shipowner.add(v1));
        assertFalse(shipowner.delete(v2));
    }

    @Test
    void getElementAtWrongIndex() {
        assertNull(shipowner.getShip(100));
    }

}