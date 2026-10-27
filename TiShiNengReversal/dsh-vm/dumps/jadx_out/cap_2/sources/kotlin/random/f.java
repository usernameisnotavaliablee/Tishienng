package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {
    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.random.Random a(int r2) {
            kotlin.random.XorWowRandom r0 = new kotlin.random.XorWowRandom
            int r1 = r2 >> 31
            r0.<init>(r2, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.random.Random b(long r3) {
            kotlin.random.XorWowRandom r0 = new kotlin.random.XorWowRandom
            int r1 = (int) r3
            r2 = 32
            long r3 = r3 >> r2
            int r4 = (int) r3
            r0.<init>(r1, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(@org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.Object r3) {
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "until"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Random range is empty: ["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final void d(double r1, double r3) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5
            return
        L5:
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            java.lang.String r1 = c(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final void e(int r0, int r1) {
            if (r1 <= r0) goto L3
            return
        L3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = c(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final void f(long r1, long r3) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5
            return
        L5:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = c(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final int g(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = 31 - r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final int h(@org.jetbrains.annotations.NotNull kotlin.random.Random r2, @org.jetbrains.annotations.NotNull kotlin.ranges.m r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L46
            int r0 = r3.f()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L28
            int r0 = r3.e()
            int r3 = r3.f()
            int r3 = r3 + 1
            int r2 = r2.nextInt(r0, r3)
            return r2
        L28:
            int r0 = r3.e()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 <= r1) goto L41
            int r0 = r3.e()
            int r0 = r0 + (-1)
            int r3 = r3.f()
            int r2 = r2.nextInt(r0, r3)
            int r2 = r2 + 1
            return r2
        L41:
            int r2 = r2.nextInt()
            return r2
        L46:
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

    @kotlin.SinceKotlin(version = "1.3")
    public static final long i(@org.jetbrains.annotations.NotNull kotlin.random.Random r7, @org.jetbrains.annotations.NotNull kotlin.ranges.p r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L4b
            long r0 = r8.f()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L2d
            long r0 = r8.e()
            long r2 = r8.f()
            long r2 = r2 + r4
            long r7 = r7.nextLong(r0, r2)
            return r7
        L2d:
            long r0 = r8.e()
            r2 = -9223372036854775808
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L46
            long r0 = r8.e()
            long r0 = r0 - r4
            long r2 = r8.f()
            long r7 = r7.nextLong(r0, r2)
            long r7 = r7 + r4
            return r7
        L46:
            long r7 = r7.nextLong()
            return r7
        L4b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    public static final int j(int r1, int r2) {
            int r0 = 32 - r2
            int r1 = r1 >>> r0
            int r2 = -r2
            int r2 = r2 >> 31
            r1 = r1 & r2
            return r1
    }
}
