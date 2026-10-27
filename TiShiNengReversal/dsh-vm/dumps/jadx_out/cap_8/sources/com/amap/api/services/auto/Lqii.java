package com.amap.api.services.auto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Lqii implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Lqii> CREATOR = null;
    public java.lang.String categoryBrandRecognitionResult;
    public java.lang.String changeQueryTip;
    public java.lang.String expandRangeTip;
    public java.lang.String isCurrentCity;
    public java.lang.String isUserCity;
    public java.lang.String queryCateResult;
    public java.lang.String suggestContent;
    public java.lang.String targetViewCity;
    public java.lang.String totalhits;
    public java.lang.String viewRegion;


    static {
            com.amap.api.services.auto.Lqii$1 r0 = new com.amap.api.services.auto.Lqii$1
            r0.<init>()
            com.amap.api.services.auto.Lqii.CREATOR = r0
            return
    }

    public Lqii() {
            r0 = this;
            r0.<init>()
            return
    }

    protected Lqii(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.categoryBrandRecognitionResult = r0
            java.lang.String r0 = r2.readString()
            r1.changeQueryTip = r0
            java.lang.String r0 = r2.readString()
            r1.expandRangeTip = r0
            java.lang.String r0 = r2.readString()
            r1.isCurrentCity = r0
            java.lang.String r0 = r2.readString()
            r1.isUserCity = r0
            java.lang.String r0 = r2.readString()
            r1.queryCateResult = r0
            java.lang.String r0 = r2.readString()
            r1.suggestContent = r0
            java.lang.String r0 = r2.readString()
            r1.targetViewCity = r0
            java.lang.String r0 = r2.readString()
            r1.totalhits = r0
            java.lang.String r2 = r2.readString()
            r1.viewRegion = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.categoryBrandRecognitionResult
            r1.writeString(r2)
            java.lang.String r2 = r0.changeQueryTip
            r1.writeString(r2)
            java.lang.String r2 = r0.expandRangeTip
            r1.writeString(r2)
            java.lang.String r2 = r0.isCurrentCity
            r1.writeString(r2)
            java.lang.String r2 = r0.isUserCity
            r1.writeString(r2)
            java.lang.String r2 = r0.queryCateResult
            r1.writeString(r2)
            java.lang.String r2 = r0.suggestContent
            r1.writeString(r2)
            java.lang.String r2 = r0.targetViewCity
            r1.writeString(r2)
            java.lang.String r2 = r0.totalhits
            r1.writeString(r2)
            java.lang.String r2 = r0.viewRegion
            r1.writeString(r2)
            return
    }
}
