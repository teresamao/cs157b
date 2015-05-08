package beans;

public class SalesFact {
    private int timeKey;
    private int productKey;
    private int promotionKey;
    private int storeKey;
    private float dollarSales;
    private int unitSales;
    private float dollarCost;
    private int customerCount;

    public int getTimeKey() {
        return timeKey;
    }

    public void setTimeKey(int timeKey) {
        this.timeKey = timeKey;
    }

    public int getProductKey() {
        return productKey;
    }

    public void setProductKey(int productKey) {
        this.productKey = productKey;
    }

    public int getPromotionKey() {
        return promotionKey;
    }

    public void setPromotionKey(int promotionKey) {
        this.promotionKey = promotionKey;
    }

    public int getStoreKey() {
        return storeKey;
    }

    public void setStoreKey(int storeKey) {
        this.storeKey = storeKey;
    }

    public float getDollarSales() {
        return dollarSales;
    }

    public void setDollarSales(float dollarSales) {
        this.dollarSales = dollarSales;
    }

    public int getUnitSales() {
        return unitSales;
    }

    public void setUnitSales(int unitSales) {
        this.unitSales = unitSales;
    }

    public float getDollarCost() {
        return dollarCost;
    }

    public void setDollarCost(float dollarCost) {
        this.dollarCost = dollarCost;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }
}
