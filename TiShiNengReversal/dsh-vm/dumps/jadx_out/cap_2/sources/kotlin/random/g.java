package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {
    public static final void a(int r1, int r2) {
            int r0 = kotlin.u0.a(r2, r1)
            if (r0 <= 0) goto L7
            return
        L7:
            kotlin.z0 r1 = kotlin.z0.b(r1)
            kotlin.z0 r2 = kotlin.z0.b(r2)
            java.lang.String r1 = kotlin.random.f.c(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final void b(long r1, long r3) {
            int r0 = androidx.collection.a.a(r3, r1)
            if (r0 <= 0) goto L7
            return
        L7:
            kotlin.d1 r1 = kotlin.d1.b(r1)
            kotlin.d1 r2 = kotlin.d1.b(r3)
            java.lang.String r1 = kotlin.random.f.c(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final byte[] c(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = r1.nextBytes(r2)
            byte[] r1 = kotlin.w0.f(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final byte[] d(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "$this$nextUBytes"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-array$0"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.nextBytes(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final byte[] e(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, @org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            java.lang.String r0 = "$this$nextUBytes"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "$v$c$kotlin-UByteArray$-array$0"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.nextBytes(r2, r3, r4)
            return r2
    }

    public static /* synthetic */ byte[] f(kotlin.random.Random r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.w0.r(r1)
        Ld:
            byte[] r0 = e(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int g(@org.jetbrains.annotations.NotNull kotlin.random.Random r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.nextInt()
            int r1 = kotlin.z0.k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int h(@org.jetbrains.annotations.NotNull kotlin.random.Random r2, @org.jetbrains.annotations.NotNull kotlin.ranges.y r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L57
            int r0 = r3.f()
            r1 = -1
            int r0 = kotlin.u0.a(r0, r1)
            if (r0 >= 0) goto L2e
            int r0 = r3.e()
            int r3 = r3.f()
            int r3 = r3 + 1
            int r3 = kotlin.z0.k(r3)
            int r2 = i(r2, r0, r3)
            return r2
        L2e:
            int r0 = r3.e()
            r1 = 0
            int r0 = kotlin.u0.a(r0, r1)
            if (r0 <= 0) goto L52
            int r0 = r3.e()
            int r0 = r0 + (-1)
            int r0 = kotlin.z0.k(r0)
            int r3 = r3.f()
            int r2 = i(r2, r0, r3)
            int r2 = r2 + 1
            int r2 = kotlin.z0.k(r2)
            return r2
        L52:
            int r2 = g(r2)
            return r2
        L57:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int i(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, int r2, int r3) {
            java.lang.String r0 = "$this$nextUInt"
            kotlin.jvm.internal.g0.p(r1, r0)
            a(r2, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r0
            r3 = r3 ^ r0
            int r1 = r1.nextInt(r2, r3)
            r1 = r1 ^ r0
            int r1 = kotlin.z0.k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int j(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, int r2) {
            java.lang.String r0 = "$this$nextUInt"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            int r1 = i(r1, r0, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long k(@org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = r2.nextLong()
            long r0 = kotlin.d1.k(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long l(@org.jetbrains.annotations.NotNull kotlin.random.Random r10, @org.jetbrains.annotations.NotNull kotlin.ranges.b0 r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r11, r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L6c
            long r0 = r11.f()
            r2 = -1
            int r0 = androidx.collection.a.a(r0, r2)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 1
            if (r0 >= 0) goto L3a
            long r4 = r11.e()
            long r6 = r11.f()
            long r8 = (long) r3
            long r1 = r1 & r8
            long r0 = kotlin.d1.k(r1)
            long r6 = r6 + r0
            long r0 = kotlin.d1.k(r6)
            long r10 = n(r10, r4, r0)
            return r10
        L3a:
            long r4 = r11.e()
            r6 = 0
            int r0 = androidx.collection.a.a(r4, r6)
            if (r0 <= 0) goto L67
            long r4 = r11.e()
            long r6 = (long) r3
            long r1 = r1 & r6
            long r6 = kotlin.d1.k(r1)
            long r4 = r4 - r6
            long r3 = kotlin.d1.k(r4)
            long r5 = r11.f()
            long r10 = n(r10, r3, r5)
            long r0 = kotlin.d1.k(r1)
            long r10 = r10 + r0
            long r10 = kotlin.d1.k(r10)
            return r10
        L67:
            long r10 = k(r10)
            return r10
        L6c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long m(@org.jetbrains.annotations.NotNull kotlin.random.Random r2, long r3) {
            java.lang.String r0 = "$this$nextULong"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            long r2 = n(r2, r0, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long n(@org.jetbrains.annotations.NotNull kotlin.random.Random r2, long r3, long r5) {
            java.lang.String r0 = "$this$nextULong"
            kotlin.jvm.internal.g0.p(r2, r0)
            b(r3, r5)
            r0 = -9223372036854775808
            long r3 = r3 ^ r0
            long r5 = r5 ^ r0
            long r2 = r2.nextLong(r3, r5)
            long r2 = r2 ^ r0
            long r2 = kotlin.d1.k(r2)
            return r2
    }
}
