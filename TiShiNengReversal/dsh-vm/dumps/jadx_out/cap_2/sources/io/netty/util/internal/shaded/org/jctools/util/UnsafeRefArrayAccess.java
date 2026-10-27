package io.netty.util.internal.shaded.org.jctools.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class UnsafeRefArrayAccess {
    public static final long REF_ARRAY_BASE = 0;
    public static final int REF_ELEMENT_SHIFT = 0;

    static {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            int r2 = r0.arrayIndexScale(r1)
            r3 = 4
            if (r3 != r2) goto Lf
            r2 = 2
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.REF_ELEMENT_SHIFT = r2
            goto L16
        Lf:
            r3 = 8
            if (r3 != r2) goto L1e
            r2 = 3
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.REF_ELEMENT_SHIFT = r2
        L16:
            int r0 = r0.arrayBaseOffset(r1)
            long r0 = (long) r0
            io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.REF_ARRAY_BASE = r0
            return
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown pointer size"
            r0.<init>(r1)
            throw r0
    }

    public UnsafeRefArrayAccess() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long calcElementOffset(long r3) {
            long r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.REF_ARRAY_BASE
            int r2 = io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess.REF_ELEMENT_SHIFT
            long r3 = r3 << r2
            long r0 = r0 + r3
            return r0
    }

    public static <E> E lpElement(E[] r1, long r2) {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            java.lang.Object r1 = r0.getObject(r1, r2)
            return r1
    }

    public static <E> E lvElement(E[] r1, long r2) {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            java.lang.Object r1 = r0.getObjectVolatile(r1, r2)
            return r1
    }

    public static <E> void soElement(E[] r1, long r2, E r4) {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            r0.putOrderedObject(r1, r2, r4)
            return
    }

    public static <E> void spElement(E[] r1, long r2, E r4) {
            sun.misc.Unsafe r0 = io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE
            r0.putObject(r1, r2, r4)
            return
    }
}
