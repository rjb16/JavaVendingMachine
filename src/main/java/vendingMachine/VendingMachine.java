package vendingMachine;

import items.CoinType;
import items.SnackType;

import java.util.ArrayList;

public class VendingMachine {

    private int moneyPaid;
    private int moneyReturned;
    private ArrayList<SnackType> inventory;

    public VendingMachine() {
        this.moneyReturned = 0;
        this.moneyPaid = 0;
        this.inventory = new ArrayList<SnackType>();

    }

    public int getMoneyReturned() {
        return moneyReturned;
    }

    public int getMoneyPaid() {
        return moneyPaid;
    }

    public int getInventory(){
        return inventory.size();
    }

    public void setMoneyReturned(int moneyReturned) {
        this.moneyReturned = moneyReturned;
    }

    public void setMoneyPaid(int moneyPaid) {
        this.moneyPaid = moneyPaid;
    }
    public void setInventory(ArrayList<SnackType> inventory){
        this.inventory = inventory;
    }

    public void addProductToInventory(SnackType snack){
        this.inventory.add(snack);
    }

    public SnackType getSnackTypeByCode(int code){
        for (SnackType snack : this.inventory){
            if (snack.getSnackCode() == code ){
                return snack;
            }
        }
        return null;
    }

    public SnackType getSnackTypeByPrice(int price) {
        for (SnackType snack : this.inventory) {
            if (snack.getSnackPrice() == price){
                return snack;
            }
        }
        return null;
    }
// NOT SURE IF THIS IS THE BEST WAY TO DO IT CAUSE NOW IM FILTERING
    // COINS BASED ON THEIR VALUE AND NOT THEIR NAME?

    public void paidCoins(CoinType coin) {
        if (coin.getCoinValue() >= 10) {
            this.moneyPaid += coin.getCoinValue();

        }
    }

        public void rejectCoins(CoinType coin){
            if (coin.getCoinValue() < 10) {
                this.moneyReturned += coin.getCoinValue();
            }
        }

        public SnackType BuySnack(int code){
       SnackType snack = this.getSnackTypeByCode(code);
       int price = snack.getSnackPrice();
       if(this.moneyPaid == price){
           return snack;
       }
       return null;
        }
    }




