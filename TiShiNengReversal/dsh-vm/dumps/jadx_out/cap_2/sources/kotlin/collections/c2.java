package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c2 {
    @kotlin.ExperimentalUnsignedTypes
    private static final int a(long[] r6, int r7, int r8) {
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = kotlin.e1.p(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = kotlin.e1.p(r6, r7)
            int r2 = androidx.collection.a.a(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = kotlin.e1.p(r6, r8)
            int r2 = androidx.collection.a.a(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = kotlin.e1.p(r6, r7)
            long r4 = kotlin.e1.p(r6, r8)
            kotlin.e1.x(r6, r7, r4)
            kotlin.e1.x(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
    }

    @kotlin.ExperimentalUnsignedTypes
    private static final int b(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r0 = r0 / 2
            byte r0 = kotlin.w0.p(r3, r0)
        L8:
            if (r4 > r5) goto L3f
        La:
            byte r1 = kotlin.w0.p(r3, r4)
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.jvm.internal.g0.t(r1, r2)
            if (r1 >= 0) goto L1b
            int r4 = r4 + 1
            goto La
        L1b:
            byte r1 = kotlin.w0.p(r3, r5)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.jvm.internal.g0.t(r1, r2)
            if (r1 <= 0) goto L2a
            int r5 = r5 + (-1)
            goto L1b
        L2a:
            if (r4 > r5) goto L8
            byte r1 = kotlin.w0.p(r3, r4)
            byte r2 = kotlin.w0.p(r3, r5)
            kotlin.w0.x(r3, r4, r2)
            kotlin.w0.x(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L3f:
            return r4
    }

    @kotlin.ExperimentalUnsignedTypes
    private static final int c(short[] r4, int r5, int r6) {
            int r0 = r5 + r6
            int r0 = r0 / 2
            short r0 = kotlin.k1.p(r4, r0)
        L8:
            if (r5 > r6) goto L40
        La:
            short r1 = kotlin.k1.p(r4, r5)
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r3 = r0 & r2
            int r1 = kotlin.jvm.internal.g0.t(r1, r3)
            if (r1 >= 0) goto L1d
            int r5 = r5 + 1
            goto La
        L1d:
            short r1 = kotlin.k1.p(r4, r6)
            r1 = r1 & r2
            int r1 = kotlin.jvm.internal.g0.t(r1, r3)
            if (r1 <= 0) goto L2b
            int r6 = r6 + (-1)
            goto L1d
        L2b:
            if (r5 > r6) goto L8
            short r1 = kotlin.k1.p(r4, r5)
            short r2 = kotlin.k1.p(r4, r6)
            kotlin.k1.x(r4, r5, r2)
            kotlin.k1.x(r4, r6, r1)
            int r5 = r5 + 1
            int r6 = r6 + (-1)
            goto L8
        L40:
            return r5
    }

    @kotlin.ExperimentalUnsignedTypes
    private static final int d(int[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = kotlin.a1.p(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = kotlin.a1.p(r3, r4)
            int r1 = kotlin.u0.a(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = kotlin.a1.p(r3, r5)
            int r1 = kotlin.u0.a(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = kotlin.a1.p(r3, r4)
            int r2 = kotlin.a1.p(r3, r5)
            kotlin.a1.x(r3, r4, r2)
            kotlin.a1.x(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
    }

    @kotlin.ExperimentalUnsignedTypes
    private static final void e(long[] r2, int r3, int r4) {
            int r0 = a(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            e(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            e(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    private static final void f(byte[] r2, int r3, int r4) {
            int r0 = b(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            f(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            f(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    private static final void g(short[] r2, int r3, int r4) {
            int r0 = c(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            g(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            g(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    private static final void h(int[] r2, int r3, int r4) {
            int r0 = d(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            h(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            h(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    public static final void i(@org.jetbrains.annotations.NotNull long[] r1, int r2, int r3) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-array$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r3 = r3 + (-1)
            e(r1, r2, r3)
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    public static final void j(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) {
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-array$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r3 = r3 + (-1)
            f(r1, r2, r3)
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    public static final void k(@org.jetbrains.annotations.NotNull short[] r1, int r2, int r3) {
            java.lang.String r0 = "$v$c$kotlin-UShortArray$-array$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r3 = r3 + (-1)
            g(r1, r2, r3)
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    public static final void l(@org.jetbrains.annotations.NotNull int[] r1, int r2, int r3) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-array$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r3 = r3 + (-1)
            h(r1, r2, r3)
            return
    }
}
