package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MPPointF extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    public static final android.os.Parcelable.Creator<com.github.mikephil.charting.utils.MPPointF> CREATOR = null;
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> pool;
    public float x;
    public float y;


    static {
            com.github.mikephil.charting.utils.MPPointF r0 = new com.github.mikephil.charting.utils.MPPointF
            r1 = 0
            r0.<init>(r1, r1)
            r1 = 32
            com.github.mikephil.charting.utils.ObjectPool r0 = com.github.mikephil.charting.utils.ObjectPool.create(r1, r0)
            com.github.mikephil.charting.utils.MPPointF.pool = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setReplenishPercentage(r1)
            com.github.mikephil.charting.utils.MPPointF$1 r0 = new com.github.mikephil.charting.utils.MPPointF$1
            r0.<init>()
            com.github.mikephil.charting.utils.MPPointF.CREATOR = r0
            return
    }

    public MPPointF() {
            r0 = this;
            r0.<init>()
            return
    }

    public MPPointF(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            return
    }

    public static com.github.mikephil.charting.utils.MPPointF getInstance() {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> r0 = com.github.mikephil.charting.utils.MPPointF.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.utils.MPPointF r0 = (com.github.mikephil.charting.utils.MPPointF) r0
            return r0
    }

    public static com.github.mikephil.charting.utils.MPPointF getInstance(float r1, float r2) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> r0 = com.github.mikephil.charting.utils.MPPointF.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.utils.MPPointF r0 = (com.github.mikephil.charting.utils.MPPointF) r0
            r0.x = r1
            r0.y = r2
            return r0
    }

    public static com.github.mikephil.charting.utils.MPPointF getInstance(com.github.mikephil.charting.utils.MPPointF r2) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> r0 = com.github.mikephil.charting.utils.MPPointF.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.utils.MPPointF r0 = (com.github.mikephil.charting.utils.MPPointF) r0
            float r1 = r2.x
            r0.x = r1
            float r2 = r2.y
            r0.y = r2
            return r0
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.MPPointF r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> r0 = com.github.mikephil.charting.utils.MPPointF.pool
            r0.recycle(r1)
            return
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.MPPointF> r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointF> r0 = com.github.mikephil.charting.utils.MPPointF.pool
            r0.recycle(r1)
            return
    }

    public float getX() {
            r1 = this;
            float r0 = r1.x
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1.y
            return r0
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
            r2 = this;
            com.github.mikephil.charting.utils.MPPointF r0 = new com.github.mikephil.charting.utils.MPPointF
            r1 = 0
            r0.<init>(r1, r1)
            return r0
    }

    public void my_readFromParcel(android.os.Parcel r2) {
            r1 = this;
            float r0 = r2.readFloat()
            r1.x = r0
            float r2 = r2.readFloat()
            r1.y = r2
            return
    }
}
