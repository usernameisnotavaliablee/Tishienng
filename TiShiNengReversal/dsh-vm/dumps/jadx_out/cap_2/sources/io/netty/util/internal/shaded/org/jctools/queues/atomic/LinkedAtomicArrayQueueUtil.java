package io.netty.util.internal.shaded.org.jctools.queues.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class LinkedAtomicArrayQueueUtil {
    private LinkedAtomicArrayQueueUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> allocate(int r1) {
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r1)
            return r0
    }

    static int calcElementOffset(long r0, long r2) {
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    static int length(java.util.concurrent.atomic.AtomicReferenceArray<?> r0) {
            int r0 = r0.length()
            return r0
    }

    public static <E> E lpElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1) {
            java.lang.Object r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lpElement(r0, r1)
            return r0
    }

    public static <E> E lvElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1) {
            java.lang.Object r0 = io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.lvElement(r0, r1)
            return r0
    }

    static int modifiedCalcElementOffset(long r0, long r2) {
            long r0 = r0 & r2
            int r1 = (int) r0
            int r0 = r1 >> 1
            return r0
    }

    static int nextArrayOffset(java.util.concurrent.atomic.AtomicReferenceArray<?> r0) {
            int r0 = length(r0)
            int r0 = r0 + (-1)
            return r0
    }

    static <E> void soElement(java.util.concurrent.atomic.AtomicReferenceArray r0, int r1, java.lang.Object r2) {
            r0.lazySet(r1, r2)
            return
    }

    public static <E> void spElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1, E r2) {
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.spElement(r0, r1, r2)
            return
    }

    public static <E> void svElement(java.util.concurrent.atomic.AtomicReferenceArray<E> r0, int r1, E r2) {
            io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue.svElement(r0, r1, r2)
            return
    }
}
