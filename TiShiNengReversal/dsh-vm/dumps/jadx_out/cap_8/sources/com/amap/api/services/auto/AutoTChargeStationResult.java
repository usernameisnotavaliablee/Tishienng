package com.amap.api.services.auto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AutoTChargeStationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTChargeStationResult> CREATOR = null;
    public com.amap.api.services.auto.Classify classify;
    public int code;
    public com.amap.api.services.auto.ListData listData;
    public com.amap.api.services.auto.Lqii lqii;
    public java.lang.String message;
    public com.amap.api.services.auto.Meta meta;
    public java.lang.String originJson;


    static {
            com.amap.api.services.auto.AutoTChargeStationResult$1 r0 = new com.amap.api.services.auto.AutoTChargeStationResult$1
            r0.<init>()
            com.amap.api.services.auto.AutoTChargeStationResult.CREATOR = r0
            return
    }

    public AutoTChargeStationResult() {
            r0 = this;
            r0.<init>()
            return
    }

    protected AutoTChargeStationResult(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.code = r0
            java.lang.String r0 = r2.readString()
            r1.message = r0
            java.lang.Class<com.amap.api.services.auto.Classify> r0 = com.amap.api.services.auto.Classify.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.auto.Classify r0 = (com.amap.api.services.auto.Classify) r0
            r1.classify = r0
            java.lang.Class<com.amap.api.services.auto.ListData> r0 = com.amap.api.services.auto.ListData.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.auto.ListData r0 = (com.amap.api.services.auto.ListData) r0
            r1.listData = r0
            java.lang.Class<com.amap.api.services.auto.Lqii> r0 = com.amap.api.services.auto.Lqii.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.auto.Lqii r0 = (com.amap.api.services.auto.Lqii) r0
            r1.lqii = r0
            java.lang.Class<com.amap.api.services.auto.Meta> r0 = com.amap.api.services.auto.Meta.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.auto.Meta r0 = (com.amap.api.services.auto.Meta) r0
            r1.meta = r0
            java.lang.String r2 = r2.readString()
            r1.originJson = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.code
            r2.writeInt(r0)
            java.lang.String r0 = r1.message
            r2.writeString(r0)
            com.amap.api.services.auto.Classify r0 = r1.classify
            r2.writeParcelable(r0, r3)
            com.amap.api.services.auto.ListData r0 = r1.listData
            r2.writeParcelable(r0, r3)
            com.amap.api.services.auto.Lqii r0 = r1.lqii
            r2.writeParcelable(r0, r3)
            com.amap.api.services.auto.Meta r0 = r1.meta
            r2.writeParcelable(r0, r3)
            java.lang.String r3 = r1.originJson
            r2.writeString(r3)
            return
    }
}
