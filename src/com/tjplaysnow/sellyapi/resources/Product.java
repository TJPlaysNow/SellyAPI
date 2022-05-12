package com.tjplaysnow.sellyapi.resources;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {
    
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("product_type")
    @Expose
    private Integer productType;
    @SerializedName("bitcoin")
    @Expose
    private Object bitcoin;
    @SerializedName("paypal")
    @Expose
    private Boolean paypal;
    @SerializedName("stripe")
    @Expose
    private Object stripe;
    @SerializedName("litecoin")
    @Expose
    private Boolean litecoin;
    @SerializedName("dash")
    @Expose
    private Boolean dash;
    @SerializedName("ethereum")
    @Expose
    private Boolean ethereum;
    @SerializedName("perfect_money")
    @Expose
    private Boolean perfectMoney;
    @SerializedName("bitcoin_cash")
    @Expose
    private Boolean bitcoinCash;
    @SerializedName("ripple")
    @Expose
    private Boolean ripple;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("unlisted")
    @Expose
    private Boolean unlisted;
    @SerializedName("vpn_block")
    @Expose
    private Boolean vpnBlock;
    @SerializedName("seller_note")
    @Expose
    private String sellerNote;
    @SerializedName("maximum_quantity")
    @Expose
    private Object maximumQuantity;
    @SerializedName("minimum_quantity")
    @Expose
    private Integer minimumQuantity;
    @SerializedName("stock_denominator")
    @Expose
    private String stockDenominator;
    @SerializedName("image_url")
    @Expose
    private Object imageUrl;
    @SerializedName("crypto_confirmations")
    @Expose
    private Integer cryptoConfirmations;
    @SerializedName("max_risk_level")
    @Expose
    private Integer maxRiskLevel;
    @SerializedName("dynamic_url")
    @Expose
    private String dynamicUrl;
    @SerializedName("info")
    @Expose
    private String info;
    @SerializedName("attachment")
    @Expose
    private Attachment attachment;
    @SerializedName("webhook_url")
    @Expose
    private String webhookUrl;
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
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getStock() {
        return stock;
    }
    
    public void setStock(String stock) {
        this.stock = stock;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    public String getCurrency() {
        return currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    public Integer getProductType() {
        return productType;
    }
    
    public void setProductType(Integer productType) {
        this.productType = productType;
    }
    
    public Object getBitcoin() {
        return bitcoin;
    }
    
    public void setBitcoin(Object bitcoin) {
        this.bitcoin = bitcoin;
    }
    
    public Boolean getPaypal() {
        return paypal;
    }
    
    public void setPaypal(Boolean paypal) {
        this.paypal = paypal;
    }
    
    public Object getStripe() {
        return stripe;
    }
    
    public void setStripe(Object stripe) {
        this.stripe = stripe;
    }
    
    public Boolean getLitecoin() {
        return litecoin;
    }
    
    public void setLitecoin(Boolean litecoin) {
        this.litecoin = litecoin;
    }
    
    public Boolean getDash() {
        return dash;
    }
    
    public void setDash(Boolean dash) {
        this.dash = dash;
    }
    
    public Boolean getEthereum() {
        return ethereum;
    }
    
    public void setEthereum(Boolean ethereum) {
        this.ethereum = ethereum;
    }
    
    public Boolean getPerfectMoney() {
        return perfectMoney;
    }
    
    public void setPerfectMoney(Boolean perfectMoney) {
        this.perfectMoney = perfectMoney;
    }
    
    public Boolean getBitcoinCash() {
        return bitcoinCash;
    }
    
    public void setBitcoinCash(Boolean bitcoinCash) {
        this.bitcoinCash = bitcoinCash;
    }
    
    public Boolean getRipple() {
        return ripple;
    }
    
    public void setRipple(Boolean ripple) {
        this.ripple = ripple;
    }
    
    public Boolean getPrivate() {
        return _private;
    }
    
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }
    
    public Boolean getUnlisted() {
        return unlisted;
    }
    
    public void setUnlisted(Boolean unlisted) {
        this.unlisted = unlisted;
    }
    
    public Boolean getVpnBlock() {
        return vpnBlock;
    }
    
    public void setVpnBlock(Boolean vpnBlock) {
        this.vpnBlock = vpnBlock;
    }
    
    public String getSellerNote() {
        return sellerNote;
    }
    
    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }
    
    public Object getMaximumQuantity() {
        return maximumQuantity;
    }
    
    public void setMaximumQuantity(Object maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }
    
    public Integer getMinimumQuantity() {
        return minimumQuantity;
    }
    
    public void setMinimumQuantity(Integer minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }
    
    public String getStockDenominator() {
        return stockDenominator;
    }
    
    public void setStockDenominator(String stockDenominator) {
        this.stockDenominator = stockDenominator;
    }
    
    public Object getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    public Integer getCryptoConfirmations() {
        return cryptoConfirmations;
    }
    
    public void setCryptoConfirmations(Integer cryptoConfirmations) {
        this.cryptoConfirmations = cryptoConfirmations;
    }
    
    public Integer getMaxRiskLevel() {
        return maxRiskLevel;
    }
    
    public void setMaxRiskLevel(Integer maxRiskLevel) {
        this.maxRiskLevel = maxRiskLevel;
    }
    
    public String getDynamicUrl() {
        return dynamicUrl;
    }
    
    public void setDynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl;
    }
    
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    
    public Attachment getAttachment() {
        return attachment;
    }
    
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
    
    public String getWebhookUrl() {
        return webhookUrl;
    }
    
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
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
