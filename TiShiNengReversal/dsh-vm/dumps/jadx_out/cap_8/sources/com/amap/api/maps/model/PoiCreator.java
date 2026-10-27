package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.Poi> {
    public PoiCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.Poi createFromParcel(android.os.Parcel r4) {
            r3 = this;
            java.lang.String r0 = r4.readString()
            java.lang.Class<com.amap.api.maps.model.LatLng> r1 = com.amap.api.maps.model.LatLng.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            java.lang.String r4 = r4.readString()
            com.amap.api.maps.model.Poi r2 = new com.amap.api.maps.model.Poi
            r2.<init>(r0, r1, r4)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.Poi createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.Poi r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.Poi[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.Poi[] r1 = new com.amap.api.maps.model.Poi[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.Poi[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.Poi[] r1 = r0.newArray(r1)
            return r1
    }
}
