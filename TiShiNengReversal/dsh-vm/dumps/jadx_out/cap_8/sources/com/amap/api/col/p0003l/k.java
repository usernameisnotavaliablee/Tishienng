package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k extends com.autonavi.amap.mapcore.AbstractCameraUpdateMessage {
    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void mergeCameraUpdateDelegate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2) {
            r1 = this;
            com.autonavi.amap.mapcore.DPoint r0 = r1.geoPoint
            if (r0 != 0) goto L6
            com.autonavi.amap.mapcore.DPoint r0 = r2.geoPoint
        L6:
            r2.geoPoint = r0
            float r0 = r1.zoom
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L13
            float r0 = r2.zoom
            goto L15
        L13:
            float r0 = r1.zoom
        L15:
            r2.zoom = r0
            float r0 = r1.bearing
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L22
            float r0 = r2.bearing
            goto L24
        L22:
            float r0 = r1.bearing
        L24:
            r2.bearing = r0
            float r0 = r1.tilt
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L31
            float r0 = r2.tilt
            goto L33
        L31:
            float r0 = r1.tilt
        L33:
            r2.tilt = r0
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void runCameraUpdate(com.autonavi.amap.api.mapcore.IGLMapState r1) {
            r0 = this;
            r0.normalChange(r1)
            return
    }
}
