package com.autonavi.base.amap.mapcore.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class AbstractGestureMapMessage extends com.autonavi.base.ae.gmap.AbstractMapMessage {
    public int anchorX;
    public int anchorY;
    public int height;
    public boolean isGestureScaleByMapCenter;
    public boolean isUseAnchor;
    private int state;
    public int width;

    public AbstractGestureMapMessage(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.width = r0
            r1.height = r0
            r1.isGestureScaleByMapCenter = r0
            r1.isUseAnchor = r0
            r1.state = r2
            return
    }

    protected com.autonavi.amap.mapcore.IPoint getAnchorGeoPoint(com.autonavi.base.ae.gmap.GLMapState r2, int r3, int r4) {
            r1 = this;
            com.autonavi.amap.mapcore.IPoint r0 = com.autonavi.amap.mapcore.IPoint.obtain()
            r2.screenToP20Point(r3, r4, r0)
            return r0
    }

    public int getMapGestureState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    @Override // com.autonavi.base.ae.gmap.AbstractMapMessage
    public abstract int getType();

    public void reset() {
            r1 = this;
            r0 = 0
            r1.width = r0
            r1.height = r0
            r1.state = r0
            r1.isGestureScaleByMapCenter = r0
            r1.isUseAnchor = r0
            r1.anchorX = r0
            r1.anchorY = r0
            return
    }

    public abstract void runCameraUpdate(com.autonavi.base.ae.gmap.GLMapState r1);

    public void setState(int r1) {
            r0 = this;
            r0.state = r1
            return
    }

    protected void win2geo(com.autonavi.base.ae.gmap.GLMapState r1, int r2, int r3, com.autonavi.amap.mapcore.IPoint r4) {
            r0 = this;
            r1.screenToP20Point(r2, r3, r4)
            return
    }
}
