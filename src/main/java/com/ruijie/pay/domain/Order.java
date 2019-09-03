package com.ruijie.pay.domain;

public class Order {

    /**
     * 商户号
     */
    private String merchNo;

    /**
     * 商户单号
     */
    private String orderNo;

    /**
     * 金额
     */
    private String amount;

    /**
     * 币种
     */
    private String currency;

    /**
     * 支付类型
     */
    private String outChannel;

    /**
     * 银行编号
     */
    private String bankCode;

    /**
     * 订单标题
     */
    private String title;

    /**
     * 商品描述
     */
    private String product;

    /**
     * 商品备注
     */
    private String memo;

    /**
     * 同步回调地址
     */
    private String returnUrl;

    /**
     * 异步通知地址
     */
    private String notifyUrl;

    /**
     * 下单时间
     */
    private String reqTime;

    /**
     * 客户标识
     */
    private String userId;

    public String getMerchNo() {
        return merchNo;
    }

    public void setMerchNo(String merchNo) {
        this.merchNo = merchNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOutChannel() {
        return outChannel;
    }

    public void setOutChannel(String outChannel) {
        this.outChannel = outChannel;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "merchNo='" + merchNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", outChannel='" + outChannel + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", title='" + title + '\'' +
                ", product='" + product + '\'' +
                ", memo='" + memo + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", reqTime='" + reqTime + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
