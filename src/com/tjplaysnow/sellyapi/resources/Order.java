
package com.tjplaysnow.sellyapi.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("user_agent")
    @Expose
    private String userAgent;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("gateway")
    @Expose
    private String gateway;
    @SerializedName("risk_level")
    @Expose
    private Integer riskLevel;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("delivered")
    @Expose
    private String delivered;
    @SerializedName("crypto_value")
    @Expose
    private Object cryptoValue;
    @SerializedName("crypto_address")
    @Expose
    private Object cryptoAddress;
    @SerializedName("referral")
    @Expose
    private Object referral;
    @SerializedName("usd_value")
    @Expose
    private String usdValue;
    @SerializedName("exchange_rate")
    @Expose
    private String exchangeRate;
    @SerializedName("custom")
    @Expose
    private Custom custom;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDelivered() {
        return delivered;
    }

    public void setDelivered(String delivered) {
        this.delivered = delivered;
    }

    public Object getCryptoValue() {
        return cryptoValue;
    }

    public void setCryptoValue(Object cryptoValue) {
        this.cryptoValue = cryptoValue;
    }

    public Object getCryptoAddress() {
        return cryptoAddress;
    }

    public void setCryptoAddress(Object cryptoAddress) {
        this.cryptoAddress = cryptoAddress;
    }

    public Object getReferral() {
        return referral;
    }

    public void setReferral(Object referral) {
        this.referral = referral;
    }

    public String getUsdValue() {
        return usdValue;
    }

    public void setUsdValue(String usdValue) {
        this.usdValue = usdValue;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
