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
    @Test
    public void canGetMoneyReturned(){
        assertEquals(0, vendingMachine.getMoneyReturned(), 0.5);
    }
    @Test
    public void canAddProductToInventory(){
        vendingMachine.addProductToInventory(SnackType.SWEETS);
        assertEquals(1, vendingMachine.getInventory());

    }
    @Test
    public void canGetSnackBySnackCode(){
        vendingMachine.addProductToInventory(SnackType.SWEETS);
        assertEquals(SnackType.SWEETS, vendingMachine.getSnackTypeByCode(3));
    }
    @Test
    public void canGetSnackBySnackPrice(){
        vendingMachine.addProductToInventory(snackType.SWEETS);
        assertEquals(snackType.SWEETS, vendingMachine.getSnackTypeByPrice(65));

    }
    @Test
    public void canPay(){
        vendingMachine.paidCoins(CoinType.TWENTY_PENCE);
        assertEquals(20, vendingMachine.getMoneyPaid());
    }
    @Test
    public void canRejectCoins(){
        vendingMachine.rejectCoins(CoinType.FIVE_PENCE);
        assertEquals(5, vendingMachine.getMoneyReturned());

    }
    @Test
    public void canBuySnackWithCodeAndMoney(){
        vendingMachine.addProductToInventory(snackType.COLA);
        vendingMachine.paidCoins(CoinType.TWENTY_PENCE);
        vendingMachine.paidCoins(CoinType.TWENTY_PENCE);
        vendingMachine.paidCoins(CoinType.TWENTY_PENCE);
        vendingMachine.paidCoins(CoinType.TWENTY_PENCE);
        vendingMachine.paidCoins(CoinType.TWENTY_PENCE);
        assertEquals(100, vendingMachine.getMoneyPaid(), 0.1);
        assertEquals(0, vendingMachine.setMoneyPaid(0));
        assertEquals(SnackType.COLA, vendingMachine.getSnackTypeByCode(1));

    }

}
