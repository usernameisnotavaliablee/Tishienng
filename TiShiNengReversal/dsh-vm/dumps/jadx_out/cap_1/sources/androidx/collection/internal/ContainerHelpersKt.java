package androidx.collection.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContainerHelpersKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final int[] EMPTY_INTS = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final long[] EMPTY_LONGS = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object[] EMPTY_OBJECTS = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS = r1
            long[] r1 = new long[r0]
            androidx.collection.internal.ContainerHelpersKt.EMPTY_LONGS = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS = r0
            return
    }

    public static final int binarySearch(@org.jetbrains.annotations.NotNull int[] r3, int r4, int r5) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r4 = r4 + (-1)
            r0 = 0
        L8:
            if (r0 > r4) goto L1b
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L15
            int r0 = r1 + 1
            goto L8
        L15:
            if (r2 <= r5) goto L1a
            int r4 = r1 + (-1)
            goto L8
        L1a:
            return r1
        L1b:
            int r3 = ~r0
            return r3
    }

    public static final int binarySearch(@org.jetbrains.annotations.NotNull long[] r5, int r6, long r7) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r6 = r6 + (-1)
            r0 = 0
        L8:
            if (r0 > r6) goto L1d
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            r2 = r5[r1]
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L17
            int r0 = r1 + 1
            goto L8
        L17:
            if (r4 <= 0) goto L1c
            int r6 = r1 + (-1)
            goto L8
        L1c:
            return r1
        L1d:
            int r5 = ~r0
            return r5
    }

    public static final boolean equal(@org.jetbrains.annotations.Nullable java.lang.Object r0, @org.jetbrains.annotations.Nullable java.lang.Object r1) {
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    public static final int idealByteArraySize(int r2) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto Lf
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            return r2
    }

    public static final int idealIntArraySize(int r0) {
            int r0 = r0 * 4
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 4
            return r0
    }

    public static final int idealLongArraySize(int r0) {
            int r0 = r0 * 8
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 8
            return r0
    }
}
