package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f0 extends kotlin.text.e0 {
    public f0() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void k1(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid number format: '"
            r1.append(r2)
            r1.append(r3)
            r3 = 39
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte l1(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            java.lang.Byte r1 = m1(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte m1(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r1 = o1(r1, r2)
            r2 = 0
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L1f
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 <= r0) goto L19
            goto L1f
        L19:
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L1f:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static java.lang.Integer n1(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            java.lang.Integer r1 = o1(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer o1(@org.jetbrains.annotations.NotNull java.lang.String r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.text.c.a(r11)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = kotlin.jvm.internal.g0.t(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 >= 0) goto L33
            r4 = 1
            if (r0 != r4) goto L24
            return r1
        L24:
            r6 = 43
            if (r3 == r6) goto L31
            r5 = 45
            if (r3 == r5) goto L2d
            return r1
        L2d:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            goto L35
        L31:
            r3 = 0
            goto L35
        L33:
            r3 = 0
            r4 = 0
        L35:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L3b:
            if (r4 >= r0) goto L5c
            char r8 = r10.charAt(r4)
            int r8 = kotlin.text.c.b(r8, r11)
            if (r8 >= 0) goto L48
            return r1
        L48:
            if (r2 >= r7) goto L51
            if (r7 != r6) goto L50
            int r7 = r5 / r11
            if (r2 >= r7) goto L51
        L50:
            return r1
        L51:
            int r2 = r2 * r11
            int r9 = r5 + r8
            if (r2 >= r9) goto L58
            return r1
        L58:
            int r2 = r2 - r8
            int r4 = r4 + 1
            goto L3b
        L5c:
            if (r3 == 0) goto L63
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            return r10
        L63:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static java.lang.Long p1(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            java.lang.Long r1 = q1(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long q1(@org.jetbrains.annotations.NotNull java.lang.String r19, int r20) {
            r0 = r19
            r1 = r20
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
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= 0) goto L38
            r6 = 1
            if (r2 != r6) goto L2a
            return r3
        L2a:
            r9 = 43
            if (r5 == r9) goto L37
            r4 = 45
            if (r5 == r4) goto L33
            return r3
        L33:
            r7 = -9223372036854775808
            r4 = 1
            goto L39
        L37:
            r4 = 1
        L38:
            r6 = 0
        L39:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = 0
            r13 = r9
        L41:
            if (r4 >= r2) goto L73
            char r5 = r0.charAt(r4)
            int r5 = kotlin.text.c.b(r5, r1)
            if (r5 >= 0) goto L4e
            return r3
        L4e:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5e
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L62
            long r13 = (long) r1
            long r13 = r7 / r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5e
            return r3
        L5e:
            r15 = r3
            r16 = r4
            goto L63
        L62:
            return r3
        L63:
            long r3 = (long) r1
            long r11 = r11 * r3
            long r3 = (long) r5
            long r17 = r7 + r3
            int r5 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r5 >= 0) goto L6e
            return r15
        L6e:
            long r11 = r11 - r3
            int r4 = r16 + 1
            r3 = r15
            goto L41
        L73:
            if (r6 == 0) goto L7a
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            return r0
        L7a:
            long r0 = -r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short r1(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            java.lang.Short r1 = s1(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short s1(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r1 = o1(r1, r2)
            r2 = 0
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L1f
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 <= r0) goto L19
            goto L1f
        L19:
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L1f:
            return r2
    }
}
