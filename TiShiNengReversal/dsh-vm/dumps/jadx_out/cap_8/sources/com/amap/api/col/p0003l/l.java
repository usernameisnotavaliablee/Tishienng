package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class l extends com.autonavi.amap.mapcore.AbstractCameraUpdateMessage {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(com.autonavi.amap.api.mapcore.IGLMapState r0, int r1, int r2, android.graphics.Point r3) {
            r0.screenToP20Point(r1, r2, r3)
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void mergeCameraUpdateDelegate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1) {
            r0 = this;
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void runCameraUpdate(com.autonavi.amap.api.mapcore.IGLMapState r5) {
            r4 = this;
            float r0 = r4.xPixel
            float r1 = r4.yPixel
            int r2 = r4.width
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r2 + r0
            int r0 = r4.height
            float r0 = (float) r0
            float r0 = r0 / r3
            float r0 = r0 + r1
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = (int) r2
            int r0 = (int) r0
            a(r5, r2, r0, r1)
            int r0 = r1.x
            double r2 = (double) r0
            int r0 = r1.y
            double r0 = (double) r0
            r5.setMapGeoCenter(r2, r0)
            return
    }
}
