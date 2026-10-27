package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MPPointD extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> pool;
    public double x;
    public double y;

    static {
            com.github.mikephil.charting.utils.MPPointD r0 = new com.github.mikephil.charting.utils.MPPointD
            r1 = 0
            r0.<init>(r1, r1)
            r1 = 64
            com.github.mikephil.charting.utils.ObjectPool r0 = com.github.mikephil.charting.utils.ObjectPool.create(r1, r0)
            com.github.mikephil.charting.utils.MPPointD.pool = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setReplenishPercentage(r1)
            return
    }

    private MPPointD(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r3
            return
    }

    public static com.github.mikephil.charting.utils.MPPointD getInstance(double r1, double r3) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> r0 = com.github.mikephil.charting.utils.MPPointD.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.utils.MPPointD r0 = (com.github.mikephil.charting.utils.MPPointD) r0
            r0.x = r1
            r0.y = r3
            return r0
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.MPPointD r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> r0 = com.github.mikephil.charting.utils.MPPointD.pool
            r0.recycle(r1)
            return
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.MPPointD> r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> r0 = com.github.mikephil.charting.utils.MPPointD.pool
            r0.recycle(r1)
            return
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
            r3 = this;
            com.github.mikephil.charting.utils.MPPointD r0 = new com.github.mikephil.charting.utils.MPPointD
            r1 = 0
            r0.<init>(r1, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MPPointD, x: "
            r0.append(r1)
            double r1 = r3.x
            r0.append(r1)
            java.lang.String r1 = ", y: "
            r0.append(r1)
            double r1 = r3.y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
