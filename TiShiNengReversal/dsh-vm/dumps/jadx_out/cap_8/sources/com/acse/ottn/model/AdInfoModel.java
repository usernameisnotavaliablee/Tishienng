package com.acse.ottn.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdInfoModel implements java.io.Serializable {
    private java.lang.String adId;
    private java.lang.String adType;
    private int countdown;
    private java.lang.String deeplink;
    private java.lang.String img;
    private java.lang.String link;
    private java.lang.String mediaType;
    private java.lang.String packageName;
    private int r;
    private java.lang.String showBigClose;
    private java.lang.String showDisLike;
    private boolean showPermissionDialog;

    public AdInfoModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "0"
            r1.showDisLike = r0
            r1.showBigClose = r0
            return
    }

    public java.lang.String getAdId() {
            r1 = this;
            java.lang.String r0 = r1.adId
            return r0
    }

    public java.lang.String getAdType() {
            r1 = this;
            java.lang.String r0 = r1.adType
            return r0
    }

    public int getCountdown() {
            r1 = this;
            int r0 = r1.countdown
            return r0
    }

    public java.lang.String getDeeplink() {
            r1 = this;
            java.lang.String r0 = r1.deeplink
            return r0
    }

    public java.lang.String getImg() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public java.lang.String getLink() {
            r1 = this;
            java.lang.String r0 = r1.link
            return r0
    }

    public java.lang.String getMediaType() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.packageName
            return r0
    }

    public int getR() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public java.lang.String getShowBigClose() {
            r1 = this;
            java.lang.String r0 = r1.showBigClose
            return r0
    }

    public java.lang.String getShowDisLike() {
            r1 = this;
            java.lang.String r0 = r1.showDisLike
            return r0
    }

    public boolean isShowPermissionDialog() {
            r1 = this;
            boolean r0 = r1.showPermissionDialog
            return r0
    }

    public void setAdId(java.lang.String r1) {
            r0 = this;
            r0.adId = r1
            return
    }

    public void setAdType(java.lang.String r1) {
            r0 = this;
            r0.adType = r1
            return
    }

    public void setCountdown(int r1) {
            r0 = this;
            r0.countdown = r1
            return
    }

    public void setDeeplink(java.lang.String r1) {
            r0 = this;
            r0.deeplink = r1
            return
    }

    public void setImg(java.lang.String r1) {
            r0 = this;
            r0.img = r1
            return
    }

    public void setLink(java.lang.String r1) {
            r0 = this;
            r0.link = r1
            return
    }

    public void setMediaType(java.lang.String r1) {
            r0 = this;
            r0.mediaType = r1
            return
    }

    public void setPackageName(java.lang.String r1) {
            r0 = this;
            r0.packageName = r1
            return
    }

    public void setR(int r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void setShowBigClose(java.lang.String r1) {
            r0 = this;
            r0.showBigClose = r1
            return
    }

    public void setShowDisLike(java.lang.String r1) {
            r0 = this;
            r0.showDisLike = r1
            return
    }

    public void setShowPermissionDialog(boolean r1) {
            r0 = this;
            r0.showPermissionDialog = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdInfoModel{r="
            r0.append(r1)
            int r1 = r3.r
            r0.append(r1)
            java.lang.String r1 = ", adType='"
            r0.append(r1)
            java.lang.String r1 = r3.adType
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", adId='"
            r0.append(r2)
            java.lang.String r2 = r3.adId
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", mediaType='"
            r0.append(r2)
            java.lang.String r2 = r3.mediaType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", showPermissionDialog="
            r0.append(r2)
            boolean r2 = r3.showPermissionDialog
            r0.append(r2)
            java.lang.String r2 = ", img='"
            r0.append(r2)
            java.lang.String r2 = r3.img
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", delink='"
            r0.append(r2)
            java.lang.String r2 = r3.deeplink
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", link='"
            r0.append(r2)
            java.lang.String r2 = r3.link
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
