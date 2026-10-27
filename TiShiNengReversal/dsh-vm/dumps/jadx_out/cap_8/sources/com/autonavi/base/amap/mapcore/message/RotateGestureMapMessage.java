package com.autonavi.base.amap.mapcore.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RotateGestureMapMessage extends com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage> M_POOL = null;
    public float angleDelta;
    public int pivotX;
    public int pivotY;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage.M_POOL = r0
            return
    }

    public RotateGestureMapMessage(int r2, float r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.pivotX = r0
            r1.pivotY = r0
            r0 = 0
            r1.angleDelta = r0
            r1.setParams(r2, r3, r4, r5)
            r1.angleDelta = r3
            r1.pivotX = r4
            r1.pivotY = r5
            return
    }

    public static void destory() {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage.M_POOL
            r0.destory()
            return
    }

    public static com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage obtain(int r1, float r2, int r3, int r4) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage r0 = (com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage) r0
            if (r0 != 0) goto L10
            com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage r0 = new com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage
            r0.<init>(r1, r2, r3, r4)
            return r0
        L10:
            r0.reset()
            r0.setParams(r1, r2, r3, r4)
            return r0
    }

    private void setParams(int r1, float r2, int r3, int r4) {
            r0 = this;
            r0.setState(r1)
            r0.angleDelta = r2
            r0.pivotX = r3
            r0.pivotY = r4
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage, com.autonavi.base.ae.gmap.AbstractMapMessage
    public int getType() {
            r1 = this;
            r0 = 2
            return r0
    }

    public void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage> r0 = com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage.M_POOL
            r0.release(r1)
            return
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage
    public void runCameraUpdate(com.autonavi.base.ae.gmap.GLMapState r10) {
            r9 = this;
            float r0 = r9.angleDelta
            float r1 = r10.getMapAngle()
            float r1 = r1 + r0
            boolean r0 = r9.isGestureScaleByMapCenter
            if (r0 == 0) goto L12
            r10.setMapAngle(r1)
            r10.recalculate()
            return
        L12:
            int r0 = r9.pivotX
            int r2 = r9.pivotY
            boolean r3 = r9.isUseAnchor
            if (r3 == 0) goto L1e
            int r0 = r9.anchorX
            int r2 = r9.anchorY
        L1e:
            if (r0 > 0) goto L26
            if (r2 <= 0) goto L23
            goto L26
        L23:
            r3 = 0
            r4 = r3
            goto L3a
        L26:
            com.autonavi.amap.mapcore.IPoint r3 = com.autonavi.amap.mapcore.IPoint.obtain()
            com.autonavi.amap.mapcore.IPoint r4 = com.autonavi.amap.mapcore.IPoint.obtain()
            r9.win2geo(r10, r0, r2, r3)
            int r5 = r3.x
            double r5 = (double) r5
            int r7 = r3.y
            double r7 = (double) r7
            r10.setMapGeoCenter(r5, r7)
        L3a:
            r10.setMapAngle(r1)
            r10.recalculate()
            if (r0 > 0) goto L44
            if (r2 <= 0) goto L5f
        L44:
            r9.win2geo(r10, r0, r2, r4)
            if (r3 == 0) goto L5c
            int r0 = r3.x
            int r0 = r0 * 2
            int r1 = r4.x
            int r0 = r0 - r1
            double r0 = (double) r0
            int r2 = r3.y
            int r2 = r2 * 2
            int r5 = r4.y
            int r2 = r2 - r5
            double r5 = (double) r2
            r10.setMapGeoCenter(r0, r5)
        L5c:
            r10.recalculate()
        L5f:
            if (r3 == 0) goto L64
            r3.recycle()
        L64:
            if (r4 == 0) goto L69
            r4.recycle()
        L69:
            return
    }
}
