package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class VisibleRegionCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.VisibleRegion> {
    public static final int CONTENT_DESCRIPTION = 0;

    public VisibleRegionCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(com.amap.api.maps.model.VisibleRegion r1, android.os.Parcel r2, int r3) {
            int r0 = r1.a()
            r2.writeInt(r0)
            com.amap.api.maps.model.LatLng r0 = r1.nearLeft
            r2.writeParcelable(r0, r3)
            com.amap.api.maps.model.LatLng r0 = r1.nearRight
            r2.writeParcelable(r0, r3)
            com.amap.api.maps.model.LatLng r0 = r1.farLeft
            r2.writeParcelable(r0, r3)
            com.amap.api.maps.model.LatLng r0 = r1.farRight
            r2.writeParcelable(r0, r3)
            com.amap.api.maps.model.LatLngBounds r1 = r1.latLngBounds
            r2.writeParcelable(r1, r3)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.VisibleRegion createFromParcel(android.os.Parcel r9) {
            r8 = this;
            java.lang.Class<com.amap.api.maps.model.LatLng> r0 = com.amap.api.maps.model.LatLng.class
            int r2 = r9.readInt()
            r1 = 0
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch: android.os.BadParcelableException -> L47
            android.os.Parcelable r3 = r9.readParcelable(r3)     // Catch: android.os.BadParcelableException -> L47
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3     // Catch: android.os.BadParcelableException -> L47
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch: android.os.BadParcelableException -> L43
            android.os.Parcelable r4 = r9.readParcelable(r4)     // Catch: android.os.BadParcelableException -> L43
            com.amap.api.maps.model.LatLng r4 = (com.amap.api.maps.model.LatLng) r4     // Catch: android.os.BadParcelableException -> L43
            java.lang.ClassLoader r5 = r0.getClassLoader()     // Catch: android.os.BadParcelableException -> L40
            android.os.Parcelable r5 = r9.readParcelable(r5)     // Catch: android.os.BadParcelableException -> L40
            com.amap.api.maps.model.LatLng r5 = (com.amap.api.maps.model.LatLng) r5     // Catch: android.os.BadParcelableException -> L40
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: android.os.BadParcelableException -> L3e
            android.os.Parcelable r0 = r9.readParcelable(r0)     // Catch: android.os.BadParcelableException -> L3e
            com.amap.api.maps.model.LatLng r0 = (com.amap.api.maps.model.LatLng) r0     // Catch: android.os.BadParcelableException -> L3e
            java.lang.Class<com.amap.api.maps.model.LatLngBounds> r6 = com.amap.api.maps.model.LatLngBounds.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: android.os.BadParcelableException -> L4b
            android.os.Parcelable r9 = r9.readParcelable(r6)     // Catch: android.os.BadParcelableException -> L4b
            com.amap.api.maps.model.LatLngBounds r9 = (com.amap.api.maps.model.LatLngBounds) r9     // Catch: android.os.BadParcelableException -> L4b
            r7 = r9
        L3c:
            r6 = r0
            goto L4d
        L3e:
            r0 = r1
            goto L4b
        L40:
            r0 = r1
            r5 = r0
            goto L4b
        L43:
            r0 = r1
            r4 = r0
        L45:
            r5 = r4
            goto L4b
        L47:
            r0 = r1
            r3 = r0
            r4 = r3
            goto L45
        L4b:
            r7 = r1
            goto L3c
        L4d:
            com.amap.api.maps.model.VisibleRegion r1 = new com.amap.api.maps.model.VisibleRegion
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.VisibleRegion createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.amap.api.maps.model.VisibleRegion r1 = r0.createFromParcel(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.VisibleRegion[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.VisibleRegion[] r1 = new com.amap.api.maps.model.VisibleRegion[r1]
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ com.amap.api.maps.model.VisibleRegion[] newArray(int r1) {
            r0 = this;
            com.amap.api.maps.model.VisibleRegion[] r1 = r0.newArray(r1)
            return r1
    }
}
