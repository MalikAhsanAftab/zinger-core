package com.food.ordering.ssn.model;

public class ConfigurationModel {
    private ShopModel shopModel;
    private Double deliveryPrice;
    private Integer isDeliveryAvailable;
    private Integer isOrderTaken;
    private Integer isDelete;

    public ConfigurationModel() {
        shopModel = new ShopModel();
    }

    public ShopModel getShopModel() {
        return shopModel;
    }

    public void setShopModel(ShopModel shopModel) {
        this.shopModel = shopModel;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Integer getIsDeliveryAvailable() {
        return isDeliveryAvailable;
    }

    public void setIsDeliveryAvailable(Integer isDeliveryAvailable) {
        this.isDeliveryAvailable = isDeliveryAvailable;
    }

    public Integer getIsOrderTaken() {
        return isOrderTaken;
    }

    public void setIsOrderTaken(Integer isOrderTaken) {
        this.isOrderTaken = isOrderTaken;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "ConfigurationModel{" +
                "shopModel=" + shopModel +
                ", deliveryPrice=" + deliveryPrice +
                ", isDeliveryAvailable=" + isDeliveryAvailable +
                ", isOrderTaken=" + isOrderTaken +
                ", isDelete=" + isDelete +
                '}';
    }
}
