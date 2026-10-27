package xyz.adscope.amps.report.model.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AdModel {
    private java.lang.String accessType;
    private java.lang.String adSdkVersion;
    private java.lang.String adTimeOut;
    private java.lang.String adType;
    private java.lang.String bidType;
    private java.lang.String expPrice;
    private java.lang.String floorPrice;
    private java.lang.String loadType;
    private java.lang.String maxWaitTime;
    private java.lang.String quantity;

    public AdModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.accessType = r0
            r1.adSdkVersion = r0
            r1.loadType = r0
            r1.bidType = r0
            r1.maxWaitTime = r0
            r1.adType = r0
            r1.floorPrice = r0
            r1.quantity = r0
            r1.expPrice = r0
            return
    }

    public AdModel(xyz.adscope.amps.report.model.request.AdModel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.accessType = r0
            r1.adSdkVersion = r0
            r1.loadType = r0
            r1.bidType = r0
            r1.maxWaitTime = r0
            r1.adType = r0
            r1.floorPrice = r0
            r1.quantity = r0
            r1.expPrice = r0
            java.lang.String r0 = r2.getAccessType()
            r1.accessType = r0
            java.lang.String r0 = r2.getAdSdkVersion()
            r1.adSdkVersion = r0
            java.lang.String r0 = r2.getLoadType()
            r1.loadType = r0
            java.lang.String r0 = r2.getBidType()
            r1.bidType = r0
            java.lang.String r0 = r2.getMaxWaitTime()
            r1.maxWaitTime = r0
            java.lang.String r0 = r2.getAdType()
            r1.adType = r0
            java.lang.String r0 = r2.getFloorPrice()
            r1.floorPrice = r0
            java.lang.String r0 = r2.getQuantity()
            r1.quantity = r0
            java.lang.String r0 = r2.getExpPrice()
            r1.expPrice = r0
            java.lang.String r2 = r2.getAdTimeOut()
            r1.adTimeOut = r2
            return
    }

    public java.lang.String getAccessType() {
            r1 = this;
            java.lang.String r0 = r1.accessType
            return r0
    }

    public java.lang.String getAdSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.adSdkVersion
            return r0
    }

    public java.lang.String getAdTimeOut() {
            r1 = this;
            java.lang.String r0 = r1.adTimeOut
            return r0
    }

    public java.lang.String getAdType() {
            r1 = this;
            java.lang.String r0 = r1.adType
            return r0
    }

    public java.lang.String getBidType() {
            r1 = this;
            java.lang.String r0 = r1.bidType
            return r0
    }

    public java.lang.String getExpPrice() {
            r1 = this;
            java.lang.String r0 = r1.expPrice
            return r0
    }

    public java.lang.String getFloorPrice() {
            r1 = this;
            java.lang.String r0 = r1.floorPrice
            return r0
    }

    public java.lang.String getLoadType() {
            r1 = this;
            java.lang.String r0 = r1.loadType
            return r0
    }

    public java.lang.String getMaxWaitTime() {
            r1 = this;
            java.lang.String r0 = r1.maxWaitTime
            return r0
    }

    public java.lang.String getQuantity() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public void setAccessType(java.lang.String r1) {
            r0 = this;
            r0.accessType = r1
            return
    }

    public void setAdSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.adSdkVersion = r1
            return
    }

    public void setAdTimeOut(java.lang.String r1) {
            r0 = this;
            r0.adTimeOut = r1
            return
    }

    public void setAdType(java.lang.String r1) {
            r0 = this;
            r0.adType = r1
            return
    }

    public void setBidType(java.lang.String r1) {
            r0 = this;
            r0.bidType = r1
            return
    }

    public void setExpPrice(java.lang.String r1) {
            r0 = this;
            r0.expPrice = r1
            return
    }

    public void setFloorPrice(java.lang.String r1) {
            r0 = this;
            r0.floorPrice = r1
            return
    }

    public void setLoadType(java.lang.String r1) {
            r0 = this;
            r0.loadType = r1
            return
    }

    public void setMaxWaitTime(java.lang.String r1) {
            r0 = this;
            r0.maxWaitTime = r1
            return
    }

    public void setQuantity(java.lang.String r1) {
            r0 = this;
            r0.quantity = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"accessType\":\""
            r0.append(r1)
            java.lang.String r1 = r2.accessType
            r0.append(r1)
            java.lang.String r1 = "\", \"adSdkVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r2.adSdkVersion
            r0.append(r1)
            java.lang.String r1 = "\", \"loadType\":\""
            r0.append(r1)
            java.lang.String r1 = r2.loadType
            r0.append(r1)
            java.lang.String r1 = "\", \"bidType\":\""
            r0.append(r1)
            java.lang.String r1 = r2.bidType
            r0.append(r1)
            java.lang.String r1 = "\", \"maxWaitTime\":\""
            r0.append(r1)
            java.lang.String r1 = r2.maxWaitTime
            r0.append(r1)
            java.lang.String r1 = "\", \"adType\":\""
            r0.append(r1)
            java.lang.String r1 = r2.adType
            r0.append(r1)
            java.lang.String r1 = "\", \"floorPrice\":\""
            r0.append(r1)
            java.lang.String r1 = r2.floorPrice
            r0.append(r1)
            java.lang.String r1 = "\", \"quantity\":\""
            r0.append(r1)
            java.lang.String r1 = r2.quantity
            r0.append(r1)
            java.lang.String r1 = "\", \"expPrice\":\""
            r0.append(r1)
            java.lang.String r1 = r2.expPrice
            r0.append(r1)
            java.lang.String r1 = "\", \"adTimeOut\":\""
            r0.append(r1)
            java.lang.String r1 = r2.adTimeOut
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
