package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLTFOverlayOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.GLTFOverlayOptions> {
    public GLTFOverlayOptionsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.GLTFOverlayOptions createFromParcel(android.os.Parcel r17) {
            r16 = this;
            r0 = r17
            java.lang.Class<com.amap.api.maps.model.LatLng> r1 = com.amap.api.maps.model.LatLng.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r3 = r1
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3
            double r10 = r0.readDouble()
            double r12 = r0.readDouble()
            double r14 = r0.readDouble()
            double r4 = r0.readDouble()
            double r6 = r0.readDouble()
            java.lang.String r8 = r0.readString()
            java.lang.Class<com.amap.api.maps.model.GLTFResourceIterm> r1 = com.amap.api.maps.model.GLTFResourceIterm.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r9 = r0.readArrayList(r1)
            com.amap.api.maps.model.GLTFOverlayOptions r2 = new com.amap.api.maps.model.GLTFOverlayOptions
            r2.<init>(r3, r4, r6, r8, r9)
            r4 = r2
            r9 = r10
            r5 = r12
            r7 = r14
            r4.rotationDegree(r5, r7, r9)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.GLTFOverlayOptions createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.GLTFOverlayOptions r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.GLTFOverlayOptions[] newArray(int r1) {
            r0 = this;
            r1 = 0
            com.amap.api.maps.model.GLTFOverlayOptions[] r1 = new com.amap.api.maps.model.GLTFOverlayOptions[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.GLTFOverlayOptions[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.GLTFOverlayOptions[] r1 = r0.newArray(r1)
            return r1
    }
}
