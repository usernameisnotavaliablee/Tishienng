package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e2 {
    public e2() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.jvm.JvmName(name = "sumOfUByte")
    public static final int a(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.v0> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r2.next()
            kotlin.v0 r1 = (kotlin.v0) r1
            byte r1 = r1.o0()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.z0.k(r1)
            int r0 = r0 + r1
            int r0 = kotlin.z0.k(r0)
            goto La
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.jvm.JvmName(name = "sumOfUInt")
    public static final int b(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.z0> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            kotlin.z0 r1 = (kotlin.z0) r1
            int r1 = r1.q0()
            int r0 = r0 + r1
            int r0 = kotlin.z0.k(r0)
            goto La
        L20:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.jvm.JvmName(name = "sumOfULong")
    public static final long c(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.d1> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r4.next()
            kotlin.d1 r2 = (kotlin.d1) r2
            long r2 = r2.q0()
            long r0 = r0 + r2
            long r0 = kotlin.d1.k(r0)
            goto Lb
        L21:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.jvm.JvmName(name = "sumOfUShort")
    public static final int d(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.j1> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        La:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            kotlin.j1 r1 = (kotlin.j1) r1
            short r1 = r1.o0()
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            int r1 = kotlin.z0.k(r1)
            int r0 = r0 + r1
            int r0 = kotlin.z0.k(r0)
            goto La
        L28:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final byte[] e(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.v0> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            byte[] r0 = kotlin.w0.e(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            kotlin.v0 r2 = (kotlin.v0) r2
            byte r2 = r2.o0()
            int r3 = r1 + 1
            kotlin.w0.x(r0, r1, r2)
            r1 = r3
            goto L12
        L29:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final int[] f(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.z0> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            int[] r0 = kotlin.a1.e(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            kotlin.z0 r2 = (kotlin.z0) r2
            int r2 = r2.q0()
            int r3 = r1 + 1
            kotlin.a1.x(r0, r1, r2)
            r1 = r3
            goto L12
        L29:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final long[] g(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.d1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            long[] r0 = kotlin.e1.e(r0)
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r5.next()
            kotlin.d1 r2 = (kotlin.d1) r2
            long r2 = r2.q0()
            int r4 = r1 + 1
            kotlin.e1.x(r0, r1, r2)
            r1 = r4
            goto L12
        L29:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final short[] h(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.j1> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            short[] r0 = kotlin.k1.e(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            kotlin.j1 r2 = (kotlin.j1) r2
            short r2 = r2.o0()
            int r3 = r1 + 1
            kotlin.k1.x(r0, r1, r2)
            r1 = r3
            goto L12
        L29:
            return r0
    }
}
