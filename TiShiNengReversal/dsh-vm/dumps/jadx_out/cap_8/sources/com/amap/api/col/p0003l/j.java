package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j extends com.autonavi.amap.mapcore.AbstractCameraUpdateMessage {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void mergeCameraUpdateDelegate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void runCameraUpdate(com.autonavi.amap.api.mapcore.IGLMapState r6) {
            r5 = this;
            com.autonavi.amap.mapcore.interfaces.IMapConfig r0 = r5.mapConfig
            android.util.Pair r0 = com.amap.api.col.p0003l.b3.q(r5, r0)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.Object r1 = r0.first
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r6.setMapZoomer(r1)
            java.lang.Object r0 = r0.second
            r1 = r0
            com.autonavi.amap.mapcore.IPoint r1 = (com.autonavi.amap.mapcore.IPoint) r1
            int r1 = r1.x
            double r1 = (double) r1
            com.autonavi.amap.mapcore.IPoint r0 = (com.autonavi.amap.mapcore.IPoint) r0
            int r0 = r0.y
            double r3 = (double) r0
            r6.setMapGeoCenter(r1, r3)
            r0 = 0
            r6.setCameraDegree(r0)
            r6.setMapAngle(r0)
            return
    }
}
