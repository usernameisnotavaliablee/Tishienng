package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FSize extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> pool;
    public float height;
    public float width;

    static {
            com.github.mikephil.charting.utils.FSize r0 = new com.github.mikephil.charting.utils.FSize
            r1 = 0
            r0.<init>(r1, r1)
            r1 = 256(0x100, float:3.59E-43)
            com.github.mikephil.charting.utils.ObjectPool r0 = com.github.mikephil.charting.utils.ObjectPool.create(r1, r0)
            com.github.mikephil.charting.utils.FSize.pool = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setReplenishPercentage(r1)
            return
    }

    public FSize() {
            r0 = this;
            r0.<init>()
            return
    }

    public FSize(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            return
    }

    public static com.github.mikephil.charting.utils.FSize getInstance(float r1, float r2) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> r0 = com.github.mikephil.charting.utils.FSize.pool
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = r0.get()
            com.github.mikephil.charting.utils.FSize r0 = (com.github.mikephil.charting.utils.FSize) r0
            r0.width = r1
            r0.height = r2
            return r0
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.FSize r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> r0 = com.github.mikephil.charting.utils.FSize.pool
            r0.recycle(r1)
            return
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.FSize> r1) {
            com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> r0 = com.github.mikephil.charting.utils.FSize.pool
            r0.recycle(r1)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.github.mikephil.charting.utils.FSize
            if (r2 == 0) goto L1f
            com.github.mikephil.charting.utils.FSize r5 = (com.github.mikephil.charting.utils.FSize) r5
            float r2 = r4.width
            float r3 = r5.width
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1f
            float r2 = r4.height
            float r5 = r5.height
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.width
            int r0 = java.lang.Float.floatToIntBits(r0)
            float r1 = r2.height
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
            r2 = this;
            com.github.mikephil.charting.utils.FSize r0 = new com.github.mikephil.charting.utils.FSize
            r1 = 0
            r0.<init>(r1, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.width
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            float r1 = r2.height
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
