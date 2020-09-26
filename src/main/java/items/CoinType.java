package items;

public enum CoinType {
    FIVE_PENCE(5),
    TEN_PENCE(10),
    TWENTY_PENCE(20),
    FIFTY_PENCE(50);

    private int coinValue;

    CoinType(int coinValue) {
        this.coinValue = coinValue;

    }
    public int getCoinValue(){
        return coinValue;
    }

}
