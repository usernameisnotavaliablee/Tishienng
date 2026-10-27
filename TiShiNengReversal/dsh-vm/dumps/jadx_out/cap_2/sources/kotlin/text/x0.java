package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "UStringsKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x0 {
    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(long r0, int r2) {
            int r2 = kotlin.text.c.a(r2)
            java.lang.String r0 = kotlin.o1.t(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(int r4, int r5) {
            int r5 = kotlin.text.c.a(r5)
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r4 = kotlin.o1.t(r0, r5)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String d(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r2 = kotlin.text.c.a(r2)
            java.lang.String r1 = java.lang.Integer.toString(r1, r2)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final byte e(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.v0 r0 = g(r1)
            if (r0 == 0) goto L10
            byte r1 = r0.o0()
            return r1
        L10:
            kotlin.text.f0.k1(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final byte f(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.v0 r2 = h(r1, r2)
            if (r2 == 0) goto L10
            byte r1 = r2.o0()
            return r1
        L10:
            kotlin.text.f0.k1(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.v0 g(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            kotlin.v0 r1 = h(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.v0 h(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.z0 r1 = l(r1, r2)
            r2 = 0
            if (r1 == 0) goto L27
            int r1 = r1.q0()
            r0 = 255(0xff, float:3.57E-43)
            int r0 = kotlin.z0.k(r0)
            int r0 = kotlin.u0.a(r1, r0)
            if (r0 <= 0) goto L1d
            return r2
        L1d:
            byte r1 = (byte) r1
            byte r1 = kotlin.v0.k(r1)
            kotlin.v0 r1 = kotlin.v0.b(r1)
            return r1
        L27:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int i(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.z0 r0 = k(r1)
            if (r0 == 0) goto L10
            int r1 = r0.q0()
            return r1
        L10:
            kotlin.text.f0.k1(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final int j(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.z0 r2 = l(r1, r2)
            if (r2 == 0) goto L10
            int r1 = r2.q0()
            return r1
        L10:
            kotlin.text.f0.k1(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.z0 k(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            kotlin.z0 r1 = l(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.z0 l(@org.jetbrains.annotations.NotNull java.lang.String r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.text.c.a(r10)
            int r0 = r9.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            char r3 = r9.charAt(r2)
            r4 = 48
            int r4 = kotlin.jvm.internal.g0.t(r3, r4)
            if (r4 >= 0) goto L25
            r4 = 1
            if (r0 == r4) goto L24
            r5 = 43
            if (r3 == r5) goto L26
        L24:
            return r1
        L25:
            r4 = 0
        L26:
            int r3 = kotlin.z0.k(r10)
            r5 = 119304647(0x71c71c7, float:1.1769572E-34)
            r6 = 119304647(0x71c71c7, float:1.1769572E-34)
        L30:
            if (r4 >= r0) goto L6b
            char r7 = r9.charAt(r4)
            int r7 = kotlin.text.c.b(r7, r10)
            if (r7 >= 0) goto L3d
            return r1
        L3d:
            int r8 = kotlin.u0.a(r2, r6)
            if (r8 <= 0) goto L51
            if (r6 != r5) goto L50
            r6 = -1
            int r6 = kotlin.q0.a(r6, r3)
            int r8 = kotlin.u0.a(r2, r6)
            if (r8 <= 0) goto L51
        L50:
            return r1
        L51:
            int r2 = r2 * r3
            int r2 = kotlin.z0.k(r2)
            int r7 = kotlin.z0.k(r7)
            int r7 = r7 + r2
            int r7 = kotlin.z0.k(r7)
            int r2 = kotlin.u0.a(r7, r2)
            if (r2 >= 0) goto L67
            return r1
        L67:
            int r4 = r4 + 1
            r2 = r7
            goto L30
        L6b:
            kotlin.z0 r9 = kotlin.z0.b(r2)
            return r9
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long m(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.d1 r0 = o(r2)
            if (r0 == 0) goto L10
            long r0 = r0.q0()
            return r0
        L10:
            kotlin.text.f0.k1(r2)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long n(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.d1 r2 = p(r1, r2)
            if (r2 == 0) goto L10
            long r1 = r2.q0()
            return r1
        L10:
            kotlin.text.f0.k1(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.d1 o(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            kotlin.d1 r1 = p(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.d1 p(@org.jetbrains.annotations.NotNull java.lang.String r17, int r18) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            kotlin.text.c.a(r1)
            int r2 = r0.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.g0.t(r5, r6)
            if (r6 >= 0) goto L29
            r4 = 1
            if (r2 == r4) goto L28
            r6 = 43
            if (r5 == r6) goto L29
        L28:
            return r3
        L29:
            long r5 = (long) r1
            long r5 = kotlin.d1.k(r5)
            r7 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r9 = 0
            r11 = r7
        L36:
            if (r4 >= r2) goto L7f
            char r13 = r0.charAt(r4)
            int r13 = kotlin.text.c.b(r13, r1)
            if (r13 >= 0) goto L43
            return r3
        L43:
            int r14 = androidx.collection.a.a(r9, r11)
            if (r14 <= 0) goto L5a
            int r14 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r14 != 0) goto L59
            r11 = -1
            long r11 = kotlin.t0.a(r11, r5)
            int r14 = androidx.collection.a.a(r9, r11)
            if (r14 <= 0) goto L5a
        L59:
            return r3
        L5a:
            long r9 = r9 * r5
            long r9 = kotlin.d1.k(r9)
            int r13 = kotlin.z0.k(r13)
            long r13 = (long) r13
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r15
            long r13 = kotlin.d1.k(r13)
            long r13 = r13 + r9
            long r13 = kotlin.d1.k(r13)
            int r9 = androidx.collection.a.a(r13, r9)
            if (r9 >= 0) goto L7b
            return r3
        L7b:
            int r4 = r4 + 1
            r9 = r13
            goto L36
        L7f:
            kotlin.d1 r0 = kotlin.d1.b(r9)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final short q(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.j1 r0 = s(r1)
            if (r0 == 0) goto L10
            short r1 = r0.o0()
            return r1
        L10:
            kotlin.text.f0.k1(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final short r(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.j1 r2 = t(r1, r2)
            if (r2 == 0) goto L10
            short r1 = r2.o0()
            return r1
        L10:
            kotlin.text.f0.k1(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.j1 s(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            kotlin.j1 r1 = t(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final kotlin.j1 t(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.z0 r1 = l(r1, r2)
            r2 = 0
            if (r1 == 0) goto L28
            int r1 = r1.q0()
            r0 = 65535(0xffff, float:9.1834E-41)
            int r0 = kotlin.z0.k(r0)
            int r0 = kotlin.u0.a(r1, r0)
            if (r0 <= 0) goto L1e
            return r2
        L1e:
            short r1 = (short) r1
            short r1 = kotlin.j1.k(r1)
            kotlin.j1 r1 = kotlin.j1.b(r1)
            return r1
        L28:
            return r2
    }
}
