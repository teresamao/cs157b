package beans;

import java.sql.Date;

public class Promotion {
    private int promotionKey;
    private String promotionName;
    private String price_reductionType;
    private String adType;
    private String displayType;
    private String couponType;
    private String adMediaType;
    private String displayProvider;
    private float promoCost;
    private Date promoBeginDate;
    private Date promoEndDate;

    public int getPromotionKey() {
        return promotionKey;
    }

    public void setPromotionKey(int promotionKey) {
        this.promotionKey = promotionKey;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getPrice_reductionType() {
        return price_reductionType;
    }

    public void setPrice_reductionType(String price_reductionType) {
        this.price_reductionType = price_reductionType;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getAdMediaType() {
        return adMediaType;
    }

    public void setAdMediaType(String adMediaType) {
        this.adMediaType = adMediaType;
    }

    public String getDisplayProvider() {
        return displayProvider;
    }

    public void setDisplayProvider(String displayProvider) {
        this.displayProvider = displayProvider;
    }

    public float getPromoCost() {
        return promoCost;
    }

    public void setPromoCost(float promoCost) {
        this.promoCost = promoCost;
    }

    public Date getPromoBeginDate() {
        return promoBeginDate;
    }

    public void setPromoBeginDate(Date promoBeginDate) {
        this.promoBeginDate = promoBeginDate;
    }

    public Date getPromoEndDate() {
        return promoEndDate;
    }

    public void setPromoEndDate(Date promoEndDate) {
        this.promoEndDate = promoEndDate;
    }
}
