package items;

public enum SnackType {
    COLA(100, 1),
    CRISP(50, 2),
    SWEETS(65, 3);

    private int snackPrice;
    private int snackCode;

    SnackType(int snackPrice, int snackCode){
        this.snackPrice = snackPrice;
        this.snackCode = snackCode;

    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public int getSnackCode() {
        return snackCode;
    }
}
