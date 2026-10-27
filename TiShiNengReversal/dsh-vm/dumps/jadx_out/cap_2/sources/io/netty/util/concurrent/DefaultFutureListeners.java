package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class DefaultFutureListeners {
    private io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>>[] listeners;
    private int progressiveSize;
    private int size;

    DefaultFutureListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>> r4, io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>> r5) {
            r3 = this;
            r3.<init>()
            r0 = 2
            io.netty.util.concurrent.GenericFutureListener[] r1 = new io.netty.util.concurrent.GenericFutureListener[r0]
            r3.listeners = r1
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r3.size = r0
            boolean r4 = r4 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener
            if (r4 == 0) goto L19
            int r4 = r3.progressiveSize
            int r4 = r4 + r2
            r3.progressiveSize = r4
        L19:
            boolean r4 = r5 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener
            if (r4 == 0) goto L22
            int r4 = r3.progressiveSize
            int r4 = r4 + r2
            r3.progressiveSize = r4
        L22:
            return
    }

    public void add(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>> r4) {
            r3 = this;
            io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>>[] r0 = r3.listeners
            int r1 = r3.size
            int r2 = r0.length
            if (r1 != r2) goto L11
            int r2 = r1 << 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            io.netty.util.concurrent.GenericFutureListener[] r0 = (io.netty.util.concurrent.GenericFutureListener[]) r0
            r3.listeners = r0
        L11:
            r0[r1] = r4
            int r1 = r1 + 1
            r3.size = r1
            boolean r4 = r4 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener
            if (r4 == 0) goto L21
            int r4 = r3.progressiveSize
            int r4 = r4 + 1
            r3.progressiveSize = r4
        L21:
            return
    }

    public io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>>[] listeners() {
            r1 = this;
            io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>>[] r0 = r1.listeners
            return r0
    }

    public int progressiveSize() {
            r1 = this;
            int r0 = r1.progressiveSize
            return r0
    }

    public void remove(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>> r6) {
            r5 = this;
            io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<?>>[] r0 = r5.listeners
            int r1 = r5.size
            r2 = 0
        L5:
            if (r2 >= r1) goto L2b
            r3 = r0[r2]
            if (r3 != r6) goto L28
            int r3 = r1 - r2
            int r3 = r3 + (-1)
            if (r3 <= 0) goto L16
            int r4 = r2 + 1
            java.lang.System.arraycopy(r0, r4, r0, r2, r3)
        L16:
            int r1 = r1 + (-1)
            r2 = 0
            r0[r1] = r2
            r5.size = r1
            boolean r6 = r6 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener
            if (r6 == 0) goto L2b
            int r6 = r5.progressiveSize
            int r6 = r6 + (-1)
            r5.progressiveSize = r6
            return
        L28:
            int r2 = r2 + 1
            goto L5
        L2b:
            return
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
