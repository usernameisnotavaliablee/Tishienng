package com.autonavi.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DPoint {
    private static final com.autonavi.base.ae.gmap.maploader.Pools.SynchronizedPool<com.autonavi.amap.mapcore.DPoint> M_POOL = null;
    public double x;
    public double y;

    static {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool r0 = new com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool
            r1 = 32
            r0.<init>(r1)
            com.autonavi.amap.mapcore.DPoint.M_POOL = r0
            return
    }

    public DPoint() {
            r0 = this;
            r0.<init>()
            return
    }

    public DPoint(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r3
            return
    }

    public static com.autonavi.amap.mapcore.DPoint obtain() {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.amap.mapcore.DPoint> r0 = com.autonavi.amap.mapcore.DPoint.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.amap.mapcore.DPoint r0 = (com.autonavi.amap.mapcore.DPoint) r0
            if (r0 != 0) goto L10
            com.autonavi.amap.mapcore.DPoint r0 = new com.autonavi.amap.mapcore.DPoint
            r0.<init>()
            return r0
        L10:
            r1 = 0
            r0.set(r1, r1)
            return r0
    }

    public static com.autonavi.amap.mapcore.DPoint obtain(double r1, double r3) {
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.amap.mapcore.DPoint> r0 = com.autonavi.amap.mapcore.DPoint.M_POOL
            java.lang.Object r0 = r0.acquire()
            com.autonavi.amap.mapcore.DPoint r0 = (com.autonavi.amap.mapcore.DPoint) r0
            if (r0 != 0) goto L10
            com.autonavi.amap.mapcore.DPoint r0 = new com.autonavi.amap.mapcore.DPoint
            r0.<init>(r1, r3)
            return r0
        L10:
            r0.set(r1, r3)
            return r0
    }

    private void set(double r1, double r3) {
            r0 = this;
            r0.x = r1
            r0.y = r3
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.autonavi.amap.mapcore.DPoint
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.autonavi.amap.mapcore.DPoint r8 = (com.autonavi.amap.mapcore.DPoint) r8
            double r3 = r7.x
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.x
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2d
            double r3 = r7.y
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.y
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2d
            return r0
        L2d:
            return r2
    }

    public void recycle() {
            r1 = this;
            com.autonavi.base.ae.gmap.maploader.Pools$SynchronizedPool<com.autonavi.amap.mapcore.DPoint> r0 = com.autonavi.amap.mapcore.DPoint.M_POOL
            r0.release(r1)
            return
    }
}
