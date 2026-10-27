package com.amap.api.services.auto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Meta implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Meta> CREATOR = null;
    public java.lang.String listBizType;


    static {
            com.amap.api.services.auto.Meta$1 r0 = new com.amap.api.services.auto.Meta$1
            r0.<init>()
            com.amap.api.services.auto.Meta.CREATOR = r0
            return
    }

    public Meta() {
            r0 = this;
            r0.<init>()
            return
    }

    protected Meta(android.os.Parcel r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.readString()
            r0.listBizType = r1
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
            java.lang.String r2 = r0.listBizType
            r1.writeString(r2)
            return
    }
}
