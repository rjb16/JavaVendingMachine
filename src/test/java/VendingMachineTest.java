import items.CoinType;
import items.SnackType;
import org.junit.Before;
import org.junit.Test;
import vendingMachine.VendingMachine;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    SnackType sweets;
    VendingMachine vendingMachine;
    SnackType snackType;
    CoinType coinType;

    @Before
    public void before(){
        vendingMachine = new VendingMachine();
    }
    @Test
    public void canGetInventory(){
        assertEquals(0, vendingMachine.getInventory());
    }
    @Test
    public void canGetMoneyPaid(){
        assertEquals(0, vendingMachine.getMoneyPaid(), 0.5);
    }


}