package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class aa implements com.amap.api.maps.LocationSource.OnLocationChangedListener {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    /* renamed from: b, reason: collision with root package name */
    android.location.Location f2984b;

    aa(com.autonavi.base.amap.api.mapcore.IAMapDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.amap.api.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(android.location.Location r3) {
            r2 = this;
            r2.f2984b = r3
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a     // Catch: java.lang.Throwable -> L10
            boolean r0 = r0.isMyLocationEnabled()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a     // Catch: java.lang.Throwable -> L10
            r0.showMyLocationOverlay(r3)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            goto L13
        L12:
            return
        L13:
            java.lang.String r0 = "AMapOnLocationChangedListener"
            java.lang.String r1 = "onLocationChanged"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }
}
