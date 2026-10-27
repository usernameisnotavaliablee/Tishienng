package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m extends com.autonavi.amap.mapcore.AbstractCameraUpdateMessage {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void mergeCameraUpdateDelegate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r3) {
            r2 = this;
            float r0 = r3.zoom
            float r1 = r2.amount
            float r0 = r0 + r1
            r3.zoom = r0
            return
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void runCameraUpdate(com.autonavi.amap.api.mapcore.IGLMapState r3) {
            r2 = this;
            float r0 = r3.getMapZoomer()
            float r1 = r2.amount
            float r0 = r0 + r1
            r2.zoom = r0
            com.autonavi.amap.mapcore.interfaces.IMapConfig r1 = r2.mapConfig
            float r0 = com.amap.api.col.p0003l.b3.h(r1, r0)
            r2.zoom = r0
            r2.normalChange(r3)
            return
    }
}
