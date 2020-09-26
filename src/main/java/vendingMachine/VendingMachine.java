package vendingMachine;

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

    addProductToInventory(SnackType snack){
        this.inventory.add(snack);
    }
}
