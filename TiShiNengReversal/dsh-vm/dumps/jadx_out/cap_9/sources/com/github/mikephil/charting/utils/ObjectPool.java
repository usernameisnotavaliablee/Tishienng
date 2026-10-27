package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ObjectPool<T extends com.github.mikephil.charting.utils.ObjectPool.Poolable> {
    private static int ids;
    private int desiredCapacity;
    private T modelObject;
    private java.lang.Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        int currentOwnerId;

        static {
                return
        }

        public Poolable() {
                r1 = this;
                r1.<init>()
                int r0 = com.github.mikephil.charting.utils.ObjectPool.Poolable.NO_OWNER
                r1.currentOwnerId = r0
                return
        }

        protected abstract com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate();
    }

    static {
            return
    }

    private ObjectPool(int r1, T r2) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto L18
            r0.desiredCapacity = r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.objects = r1
            r1 = 0
            r0.objectsPointer = r1
            r0.modelObject = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.replenishPercentage = r1
            r0.refillPool()
            return
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Object Pool must be instantiated with a capacity greater than 0!"
            r1.<init>(r2)
            throw r1
    }

    public static synchronized com.github.mikephil.charting.utils.ObjectPool create(int r2, com.github.mikephil.charting.utils.ObjectPool.Poolable r3) {
            java.lang.Class<com.github.mikephil.charting.utils.ObjectPool> r0 = com.github.mikephil.charting.utils.ObjectPool.class
            monitor-enter(r0)
            com.github.mikephil.charting.utils.ObjectPool r1 = new com.github.mikephil.charting.utils.ObjectPool     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L12
            int r2 = com.github.mikephil.charting.utils.ObjectPool.ids     // Catch: java.lang.Throwable -> L12
            r1.poolId = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r2 + 1
            com.github.mikephil.charting.utils.ObjectPool.ids = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private void refillPool() {
            r1 = this;
            float r0 = r1.replenishPercentage
            r1.refillPool(r0)
            return
    }

    private void refillPool(float r5) {
            r4 = this;
            int r0 = r4.desiredCapacity
            float r1 = (float) r0
            float r1 = r1 * r5
            int r5 = (int) r1
            r1 = 1
            if (r5 >= r1) goto Lb
            r0 = 1
            goto Lf
        Lb:
            if (r5 <= r0) goto Le
            goto Lf
        Le:
            r0 = r5
        Lf:
            r5 = 0
        L10:
            if (r5 >= r0) goto L1f
            java.lang.Object[] r2 = r4.objects
            T extends com.github.mikephil.charting.utils.ObjectPool$Poolable r3 = r4.modelObject
            com.github.mikephil.charting.utils.ObjectPool$Poolable r3 = r3.instantiate()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L10
        L1f:
            int r0 = r0 - r1
            r4.objectsPointer = r0
            return
    }

    private void resizePool() {
            r4 = this;
            int r0 = r4.desiredCapacity
            int r1 = r0 * 2
            r4.desiredCapacity = r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
        L9:
            if (r2 >= r0) goto L14
            java.lang.Object[] r3 = r4.objects
            r3 = r3[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L14:
            r4.objects = r1
            return
    }

    public synchronized T get() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.objectsPointer     // Catch: java.lang.Throwable -> L11
            r1 = -1
            if (r0 != r1) goto L13
            float r0 = r3.replenishPercentage     // Catch: java.lang.Throwable -> L11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L13
            r3.refillPool()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L25
        L13:
            java.lang.Object[] r0 = r3.objects     // Catch: java.lang.Throwable -> L11
            int r1 = r3.objectsPointer     // Catch: java.lang.Throwable -> L11
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L11
            com.github.mikephil.charting.utils.ObjectPool$Poolable r0 = (com.github.mikephil.charting.utils.ObjectPool.Poolable) r0     // Catch: java.lang.Throwable -> L11
            int r2 = com.github.mikephil.charting.utils.ObjectPool.Poolable.NO_OWNER     // Catch: java.lang.Throwable -> L11
            r0.currentOwnerId = r2     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + (-1)
            r3.objectsPointer = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return r0
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    public int getPoolCapacity() {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            int r0 = r0.length
            return r0
    }

    public int getPoolCount() {
            r1 = this;
            int r0 = r1.objectsPointer
            int r0 = r0 + 1
            return r0
    }

    public int getPoolId() {
            r1 = this;
            int r0 = r1.poolId
            return r0
    }

    public float getReplenishPercentage() {
            r1 = this;
            float r0 = r1.replenishPercentage
            return r0
    }

    public synchronized void recycle(T r4) {
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.currentOwnerId     // Catch: java.lang.Throwable -> L13
            int r1 = com.github.mikephil.charting.utils.ObjectPool.Poolable.NO_OWNER     // Catch: java.lang.Throwable -> L13
            if (r0 == r1) goto L33
            int r1 = r3.poolId     // Catch: java.lang.Throwable -> L13
            if (r0 != r1) goto L15
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "The object passed is already stored in this pool!"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L13
            throw r4     // Catch: java.lang.Throwable -> L13
        L13:
            r4 = move-exception
            goto L4d
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "The object to recycle already belongs to poolId "
            r1.append(r2)     // Catch: java.lang.Throwable -> L13
            int r4 = r4.currentOwnerId     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = ".  Object cannot belong to two different pool instances simultaneously!"
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L33:
            int r0 = r3.objectsPointer     // Catch: java.lang.Throwable -> L13
            int r0 = r0 + 1
            r3.objectsPointer = r0     // Catch: java.lang.Throwable -> L13
            java.lang.Object[] r1 = r3.objects     // Catch: java.lang.Throwable -> L13
            int r1 = r1.length     // Catch: java.lang.Throwable -> L13
            if (r0 < r1) goto L41
            r3.resizePool()     // Catch: java.lang.Throwable -> L13
        L41:
            int r0 = r3.poolId     // Catch: java.lang.Throwable -> L13
            r4.currentOwnerId = r0     // Catch: java.lang.Throwable -> L13
            java.lang.Object[] r0 = r3.objects     // Catch: java.lang.Throwable -> L13
            int r1 = r3.objectsPointer     // Catch: java.lang.Throwable -> L13
            r0[r1] = r4     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    public synchronized void recycle(java.util.List<T> r6) {
            r5 = this;
            monitor-enter(r5)
        L1:
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L12
            int r1 = r5.objectsPointer     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + r1
            int r0 = r0 + 1
            int r1 = r5.desiredCapacity     // Catch: java.lang.Throwable -> L12
            if (r0 <= r1) goto L14
            r5.resizePool()     // Catch: java.lang.Throwable -> L12
            goto L1
        L12:
            r6 = move-exception
            goto L68
        L14:
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L12
            r1 = 0
        L19:
            if (r1 >= r0) goto L61
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Throwable -> L12
            com.github.mikephil.charting.utils.ObjectPool$Poolable r2 = (com.github.mikephil.charting.utils.ObjectPool.Poolable) r2     // Catch: java.lang.Throwable -> L12
            int r3 = r2.currentOwnerId     // Catch: java.lang.Throwable -> L12
            int r4 = com.github.mikephil.charting.utils.ObjectPool.Poolable.NO_OWNER     // Catch: java.lang.Throwable -> L12
            if (r3 == r4) goto L51
            int r6 = r5.poolId     // Catch: java.lang.Throwable -> L12
            if (r3 != r6) goto L33
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = "The object passed is already stored in this pool!"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r6     // Catch: java.lang.Throwable -> L12
        L33:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "The object to recycle already belongs to poolId "
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            int r1 = r2.currentOwnerId     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".  Object cannot belong to two different pool instances simultaneously!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r6     // Catch: java.lang.Throwable -> L12
        L51:
            int r3 = r5.poolId     // Catch: java.lang.Throwable -> L12
            r2.currentOwnerId = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r3 = r5.objects     // Catch: java.lang.Throwable -> L12
            int r4 = r5.objectsPointer     // Catch: java.lang.Throwable -> L12
            int r4 = r4 + 1
            int r4 = r4 + r1
            r3[r4] = r2     // Catch: java.lang.Throwable -> L12
            int r1 = r1 + 1
            goto L19
        L61:
            int r6 = r5.objectsPointer     // Catch: java.lang.Throwable -> L12
            int r6 = r6 + r0
            r5.objectsPointer = r6     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)
            return
        L68:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r6
    }

    public void setReplenishPercentage(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L9
            r3 = 1065353216(0x3f800000, float:1.0)
            goto Lf
        L9:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lf
            r3 = 0
        Lf:
            r2.replenishPercentage = r3
            return
    }
}
