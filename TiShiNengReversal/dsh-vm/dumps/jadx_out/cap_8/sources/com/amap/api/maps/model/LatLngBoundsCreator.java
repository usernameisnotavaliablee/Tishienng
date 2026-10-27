package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LatLngBoundsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.LatLngBounds> {
    public static final int CONTENT_DESCRIPTION = 0;

    public LatLngBoundsCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(com.amap.api.maps.model.LatLngBounds r1, android.os.Parcel r2, int r3) {
            int r0 = r1.a()
            r2.writeInt(r0)
            com.amap.api.maps.model.LatLng r0 = r1.southwest
            r2.writeParcelable(r0, r3)
            com.amap.api.maps.model.LatLng r1 = r1.northeast
            r2.writeParcelable(r1, r3)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.LatLngBounds createFromParcel(android.os.Parcel r5) {
            r4 = this;
            java.lang.Class<com.amap.api.maps.model.LatLngBounds> r0 = com.amap.api.maps.model.LatLngBounds.class
            int r1 = r5.readInt()
            r2 = 0
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch: android.os.BadParcelableException -> L1d
            android.os.Parcelable r3 = r5.readParcelable(r3)     // Catch: android.os.BadParcelableException -> L1d
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: android.os.BadParcelableException -> L1d
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: android.os.BadParcelableException -> L1e
            android.os.Parcelable r5 = r5.readParcelable(r0)     // Catch: android.os.BadParcelableException -> L1e
            com.amap.api.maps.model.LatLng r5 = (com.amap.api.maps.model.LatLng) r5     // Catch: android.os.BadParcelableException -> L1e
            r2 = r5
            goto L1e
        L1d:
            r3 = r2
        L1e:
            com.amap.api.maps.model.LatLngBounds r5 = new com.amap.api.maps.model.LatLngBounds
            r5.<init>(r1, r3, r2)
            return r5
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.LatLngBounds createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.LatLngBounds r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.LatLngBounds[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.LatLngBounds[] r1 = new com.amap.api.maps.model.LatLngBounds[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.LatLngBounds[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.LatLngBounds[] r1 = r0.newArray(r1)
            return r1
    }
}
