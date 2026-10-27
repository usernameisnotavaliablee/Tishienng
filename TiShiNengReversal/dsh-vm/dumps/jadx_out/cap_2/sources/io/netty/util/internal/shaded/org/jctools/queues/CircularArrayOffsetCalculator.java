package io.netty.util.internal.shaded.org.jctools.queues;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CircularArrayOffsetCalculator {
    public CircularArrayOffsetCalculator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> E[] allocate(int r0) {
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }

    public static long calcElementOffset(long r2, long r4) {
            long r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.REF_ARRAY_BASE
            long r2 = r2 & r4
            int r4 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.REF_ELEMENT_SHIFT
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
    }
}
