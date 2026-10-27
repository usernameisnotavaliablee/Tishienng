package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FPoint extends android.graphics.PointF {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.base.amap.mapcore.FPoint> M_POOL = null;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 32
            r0.<init>(r1)
            com.autonavi.base.amap.mapcore.FPoint.M_POOL = r0
            return
    }

    public FPoint() {
            r0 = this;
            r0.<init>()
            return
    }

    public FPoint(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            return
    }

    public static com.autonavi.base.amap.mapcore.FPoint obtain() {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.FPoint> r0 = com.autonavi.base.amap.mapcore.FPoint.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.base.amap.mapcore.FPoint r0 = (com.autonavi.base.amap.mapcore.FPoint) r0
            if (r0 != 0) goto L10
            com.autonavi.base.amap.mapcore.FPoint r0 = new com.autonavi.base.amap.mapcore.FPoint
            r0.<init>()
            return r0
        L10:
            r1 = 0
            r0.set(r1, r1)
            return r0
    }

    public static com.autonavi.base.amap.mapcore.FPoint obtain(float r1, float r2) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.FPoint> r0 = com.autonavi.base.amap.mapcore.FPoint.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.base.amap.mapcore.FPoint r0 = (com.autonavi.base.amap.mapcore.FPoint) r0
            if (r0 != 0) goto L10
            com.autonavi.base.amap.mapcore.FPoint r0 = new com.autonavi.base.amap.mapcore.FPoint
            r0.<init>(r1, r2)
            return r0
        L10:
            r0.set(r1, r2)
            return r0
    }

    @Override // android.graphics.PointF
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.FPoint r4 = (com.autonavi.base.amap.mapcore.FPoint) r4
            r0 = 0
            if (r4 != 0) goto L6
            return r0
        L6:
            float r1 = r3.x
            float r2 = r4.x
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            float r1 = r3.y
            float r4 = r4.y
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L18
            r4 = 1
            return r4
        L18:
            return r0
    }

    @Override // android.graphics.PointF
    public int hashCode() {
            r1 = this;
            float r0 = r1.x
            java.lang.Float.floatToIntBits(r0)
            float r0 = r1.y
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 * 37
            return r0
    }

    public void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.base.amap.mapcore.FPoint> r0 = com.autonavi.base.amap.mapcore.FPoint.M_POOL
            r0.release(r1)
            return
    }
}
