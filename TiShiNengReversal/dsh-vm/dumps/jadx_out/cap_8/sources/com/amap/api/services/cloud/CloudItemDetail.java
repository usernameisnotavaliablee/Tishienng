package com.amap.api.services.cloud;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CloudItemDetail extends com.amap.api.services.cloud.CloudItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.cloud.CloudItemDetail> CREATOR = null;


    static {
            com.amap.api.services.cloud.CloudItemDetail$1 r0 = new com.amap.api.services.cloud.CloudItemDetail$1
            r0.<init>()
            com.amap.api.services.cloud.CloudItemDetail.CREATOR = r0
            return
    }

    protected CloudItemDetail(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public CloudItemDetail(java.lang.String r1, com.amap.api.services.core.LatLonPoint r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.amap.api.services.cloud.CloudItem, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.services.cloud.CloudItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            return
    }
}
