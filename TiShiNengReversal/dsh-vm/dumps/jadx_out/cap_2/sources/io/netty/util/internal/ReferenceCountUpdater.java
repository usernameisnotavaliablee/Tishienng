package io.netty.util.internal;

import io.netty.util.ReferenceCounted;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ReferenceCountUpdater<T extends io.netty.util.ReferenceCounted> {
    protected ReferenceCountUpdater() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getUnsafeOffset(java.lang.Class<? extends io.netty.util.ReferenceCounted> r1, java.lang.String r2) {
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lf
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> Lf
            long r1 = io.netty.util.internal.PlatformDependent.objectFieldOffset(r1)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = -1
            return r1
    }

    private boolean nonFinalRelease0(T r2, int r3, int r4, int r5) {
            r1 = this;
            if (r3 >= r5) goto L12
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = r1.updater()
            int r0 = r3 << 1
            int r0 = r4 - r0
            boolean r4 = r5.compareAndSet(r2, r4, r0)
            if (r4 == 0) goto L12
            r2 = 0
            return r2
        L12:
            boolean r2 = r1.retryRelease0(r2, r3)
            return r2
    }

    private int nonVolatileRawCnt(T r6) {
            r5 = this;
            long r0 = r5.unsafeOffset()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            int r6 = io.netty.util.internal.PlatformDependent.getInt(r6, r0)
            return r6
        Lf:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r5.updater()
            int r6 = r0.get(r6)
            return r6
    }

    private static int realRefCnt(int r1) {
            r0 = 2
            if (r1 == r0) goto Lc
            r0 = 4
            if (r1 == r0) goto Lc
            r0 = r1 & 1
            if (r0 == 0) goto Lc
            r1 = 0
            return r1
        Lc:
            int r1 = r1 >>> 1
            return r1
    }

    private T retain0(T r3, int r4, int r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r2.updater()
            int r0 = r0.getAndAdd(r3, r5)
            r1 = 2
            if (r0 == r1) goto L1a
            r1 = 4
            if (r0 == r1) goto L1a
            r1 = r0 & 1
            if (r1 != 0) goto L13
            goto L1a
        L13:
            io.netty.util.IllegalReferenceCountException r3 = new io.netty.util.IllegalReferenceCountException
            r5 = 0
            r3.<init>(r5, r4)
            throw r3
        L1a:
            if (r0 > 0) goto L20
            int r1 = r0 + r5
            if (r1 >= 0) goto L27
        L20:
            if (r0 < 0) goto L39
            int r1 = r0 + r5
            if (r1 < r0) goto L27
            goto L39
        L27:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = r2.updater()
            int r5 = -r5
            r1.getAndAdd(r3, r5)
            io.netty.util.IllegalReferenceCountException r3 = new io.netty.util.IllegalReferenceCountException
            int r5 = realRefCnt(r0)
            r3.<init>(r5, r4)
            throw r3
        L39:
            return r3
    }

    private boolean retryRelease0(T r4, int r5) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r3.updater()
            int r0 = r0.get(r4)
            int r1 = toLiveRealRefCnt(r0, r5)
            if (r5 != r1) goto L16
            boolean r0 = r3.tryFinalRelease0(r4, r0)
            if (r0 == 0) goto L28
            r4 = 1
            return r4
        L16:
            if (r5 >= r1) goto L2c
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = r3.updater()
            int r2 = r5 << 1
            int r2 = r0 - r2
            boolean r0 = r1.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L28
            r4 = 0
            return r4
        L28:
            java.lang.Thread.yield()
            goto L0
        L2c:
            io.netty.util.IllegalReferenceCountException r4 = new io.netty.util.IllegalReferenceCountException
            int r5 = -r5
            r4.<init>(r1, r5)
            throw r4
    }

    private static int toLiveRealRefCnt(int r1, int r2) {
            r0 = 2
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L13
            r0 = r1 & 1
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            io.netty.util.IllegalReferenceCountException r1 = new io.netty.util.IllegalReferenceCountException
            r0 = 0
            int r2 = -r2
            r1.<init>(r0, r2)
            throw r1
        L13:
            int r1 = r1 >>> 1
            return r1
    }

    private boolean tryFinalRelease0(T r3, int r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r2.updater()
            r1 = 1
            boolean r3 = r0.compareAndSet(r3, r4, r1)
            return r3
    }

    public final int initialValue() {
            r1 = this;
            r0 = 2
            return r0
    }

    public final boolean isLiveNonVolatile(T r6) {
            r5 = this;
            long r0 = r5.unsafeOffset()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            int r6 = io.netty.util.internal.PlatformDependent.getInt(r6, r0)
            goto L17
        Lf:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r5.updater()
            int r6 = r0.get(r6)
        L17:
            r0 = 2
            r1 = 1
            if (r6 == r0) goto L2b
            r0 = 4
            if (r6 == r0) goto L2b
            r0 = 6
            if (r6 == r0) goto L2b
            r0 = 8
            if (r6 == r0) goto L2b
            r6 = r6 & r1
            if (r6 != 0) goto L29
            goto L2b
        L29:
            r6 = 0
            return r6
        L2b:
            return r1
    }

    public final int refCnt(T r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r1.updater()
            int r2 = r0.get(r2)
            int r2 = realRefCnt(r2)
            return r2
    }

    public final boolean release(T r4) {
            r3 = this;
            int r0 = r3.nonVolatileRawCnt(r4)
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L18
            boolean r0 = r3.tryFinalRelease0(r4, r2)
            if (r0 != 0) goto L17
            boolean r4 = r3.retryRelease0(r4, r1)
            if (r4 == 0) goto L15
            goto L17
        L15:
            r4 = 0
            return r4
        L17:
            return r1
        L18:
            int r2 = toLiveRealRefCnt(r0, r1)
            boolean r4 = r3.nonFinalRelease0(r4, r1, r0, r2)
            return r4
    }

    public final boolean release(T r3, int r4) {
            r2 = this;
            int r0 = r2.nonVolatileRawCnt(r3)
            java.lang.String r1 = "decrement"
            int r1 = io.netty.util.internal.ObjectUtil.checkPositive(r4, r1)
            int r1 = toLiveRealRefCnt(r0, r1)
            if (r4 != r1) goto L21
            boolean r0 = r2.tryFinalRelease0(r3, r0)
            if (r0 != 0) goto L1f
            boolean r3 = r2.retryRelease0(r3, r4)
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            r3 = 1
            return r3
        L21:
            boolean r3 = r2.nonFinalRelease0(r3, r4, r0, r1)
            return r3
    }

    public final void resetRefCnt(T r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r2.updater()
            int r1 = r2.initialValue()
            r0.set(r3, r1)
            return
    }

    public final T retain(T r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            io.netty.util.ReferenceCounted r3 = r2.retain0(r3, r0, r1)
            return r3
    }

    public final T retain(T r2, int r3) {
            r1 = this;
            java.lang.String r0 = "increment"
            int r0 = io.netty.util.internal.ObjectUtil.checkPositive(r3, r0)
            int r0 = r0 << 1
            io.netty.util.ReferenceCounted r2 = r1.retain0(r2, r3, r0)
            return r2
    }

    public final void setRefCnt(T r3, int r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r2.updater()
            r1 = 1
            if (r4 <= 0) goto L9
            int r1 = r4 << 1
        L9:
            r0.set(r3, r1)
            return
    }

    protected abstract long unsafeOffset();

    protected abstract java.util.concurrent.atomic.AtomicIntegerFieldUpdater<T> updater();
}
