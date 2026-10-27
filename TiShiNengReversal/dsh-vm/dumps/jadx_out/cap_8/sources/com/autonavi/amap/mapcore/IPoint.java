package com.autonavi.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IPoint extends android.graphics.Point implements java.lang.Cloneable {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.amap.mapcore.IPoint> M_POOL = null;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 32
            r0.<init>(r1)
            com.autonavi.amap.mapcore.IPoint.M_POOL = r0
            return
    }

    public IPoint() {
            r0 = this;
            r0.<init>()
            return
    }

    public IPoint(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            return
    }

    public static com.autonavi.amap.mapcore.IPoint obtain() {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.amap.mapcore.IPoint> r0 = com.autonavi.amap.mapcore.IPoint.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.amap.mapcore.IPoint r0 = (com.autonavi.amap.mapcore.IPoint) r0
            if (r0 != 0) goto L10
            com.autonavi.amap.mapcore.IPoint r0 = new com.autonavi.amap.mapcore.IPoint
            r0.<init>()
            return r0
        L10:
            r1 = 0
            r0.set(r1, r1)
            return r0
    }

    public static com.autonavi.amap.mapcore.IPoint obtain(int r1, int r2) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.amap.mapcore.IPoint> r0 = com.autonavi.amap.mapcore.IPoint.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.amap.mapcore.IPoint r0 = (com.autonavi.amap.mapcore.IPoint) r0
            if (r0 != 0) goto L10
            com.autonavi.amap.mapcore.IPoint r0 = new com.autonavi.amap.mapcore.IPoint
            r0.<init>(r1, r2)
            return r0
        L10:
            r0.set(r1, r2)
            return r0
    }

    public java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.autonavi.amap.mapcore.IPoint r0 = (com.autonavi.amap.mapcore.IPoint) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public double distance(com.autonavi.amap.mapcore.IPoint r7) {
            r6 = this;
            int r0 = r7.x
            int r1 = r6.x
            int r0 = r0 - r1
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            int r7 = r7.y
            int r4 = r6.y
            int r7 = r7 - r4
            double r4 = (double) r7
            double r2 = java.lang.Math.pow(r4, r2)
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.amap.mapcore.IPoint> r0 = com.autonavi.amap.mapcore.IPoint.M_POOL
            r0.release(r1)
            return
    }
}
