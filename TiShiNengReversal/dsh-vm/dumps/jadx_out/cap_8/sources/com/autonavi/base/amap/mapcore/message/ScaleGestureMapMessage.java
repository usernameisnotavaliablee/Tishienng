package com.autonavi.base.amap.mapcore.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ScaleGestureMapMessage extends com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage> M_POOL = null;
    public int pivotX;
    public int pivotY;
    public float scaleDelta;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.M_POOL = r0
            return
    }

    public ScaleGestureMapMessage(int r2, float r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.scaleDelta = r0
            r0 = 0
            r1.pivotX = r0
            r1.pivotY = r0
            r1.setParams(r2, r3, r4, r5)
            return
    }

    public static void destory() {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.M_POOL
            r0.destory()
            return
    }

    public static com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage obtain(int r1, float r2, int r3, int r4) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage) r0
            if (r0 != 0) goto L10
            com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage r0 = new com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage
            r0.<init>(r1, r2, r3, r4)
            return r0
        L10:
            r0.reset()
            r0.setParams(r1, r2, r3, r4)
            return r0
    }

    private void setMapZoomer(com.autonavi.base.ae.gmap.GLMapState r3) {
            r2 = this;
            float r0 = r2.scaleDelta
            float r1 = r3.getMapZoomer()
            float r1 = r1 + r0
            r3.setMapZoomer(r1)
            r3.recalculate()
            return
    }

    private void setParams(int r1, float r2, int r3, int r4) {
            r0 = this;
            r0.setState(r1)
            r0.scaleDelta = r2
            r0.pivotX = r3
            r0.pivotY = r4
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage, com.autonavi.base.ae.gmap.AbstractMapMessage
    public int getType() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage.M_POOL
            r0.release(r1)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage
    public void runCameraUpdate(com.autonavi.base.ae.gmap.GLMapState r9) {
            r8 = this;
            boolean r0 = r8.isUseAnchor
            if (r0 == 0) goto L8
            r8.setMapZoomer(r9)
            return
        L8:
            int r0 = r8.pivotX
            int r1 = r8.pivotY
            boolean r2 = r8.isGestureScaleByMapCenter
            if (r2 == 0) goto L18
            int r0 = r8.width
            int r0 = r0 >> 1
            int r1 = r8.height
            int r1 = r1 >> 1
        L18:
            if (r0 > 0) goto L20
            if (r1 <= 0) goto L1d
            goto L20
        L1d:
            r2 = 0
            r3 = r2
            goto L34
        L20:
            com.autonavi.amap.mapcore.IPoint r2 = com.autonavi.amap.mapcore.IPoint.obtain()
            com.autonavi.amap.mapcore.IPoint r3 = com.autonavi.amap.mapcore.IPoint.obtain()
            r8.win2geo(r9, r0, r1, r2)
            int r4 = r2.x
            double r4 = (double) r4
            int r6 = r2.y
            double r6 = (double) r6
            r9.setMapGeoCenter(r4, r6)
        L34:
            r8.setMapZoomer(r9)
            if (r0 > 0) goto L3b
            if (r1 <= 0) goto L56
        L3b:
            r8.win2geo(r9, r0, r1, r3)
            if (r2 == 0) goto L53
            int r0 = r2.x
            int r0 = r0 * 2
            int r1 = r3.x
            int r0 = r0 - r1
            double r0 = (double) r0
            int r4 = r2.y
            int r4 = r4 * 2
            int r5 = r3.y
            int r4 = r4 - r5
            double r4 = (double) r4
            r9.setMapGeoCenter(r0, r4)
        L53:
            r9.recalculate()
        L56:
            if (r2 == 0) goto L5b
            r2.recycle()
        L5b:
            if (r3 == 0) goto L60
            r3.recycle()
        L60:
            return
    }
}
