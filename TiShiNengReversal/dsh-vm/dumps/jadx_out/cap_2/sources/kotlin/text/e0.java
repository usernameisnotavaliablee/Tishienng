package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n267#1,7:513\n267#1,7:520\n267#1,7:527\n267#1,7:534\n1#2:541\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n166#1:513,7\n173#1:520,7\n253#1:527,7\n264#1:534,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e0 extends kotlin.text.d0 {
    public e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final int C0(java.lang.String r6, int r7, int r8, boolean r9, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r10) {
            r0 = r7
        L1:
            if (r0 > r8) goto L1a
            char r1 = r6.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r1 = r10.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1a
            int r0 = r0 + 1
            goto L1
        L1a:
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L20
            r7 = 1
            goto L21
        L20:
            r7 = 0
        L21:
            r3 = -1
            if (r0 <= r8) goto L28
            if (r9 == 0) goto L27
            return r3
        L27:
            return r0
        L28:
            char r4 = r6.charAt(r0)
            r5 = 46
            if (r4 != r5) goto L53
            int r0 = r0 + 1
            r4 = r0
        L33:
            if (r4 > r8) goto L4c
            char r5 = r6.charAt(r4)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            java.lang.Object r5 = r10.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4c
            int r4 = r4 + 1
            goto L33
        L4c:
            if (r0 == r4) goto L50
            r10 = 1
            goto L51
        L50:
            r10 = 0
        L51:
            r0 = r4
            goto L54
        L53:
            r10 = 0
        L54:
            if (r7 != 0) goto L76
            if (r10 != 0) goto L76
            if (r9 == 0) goto L5b
            return r3
        L5b:
            int r7 = r0 + 2
            if (r8 != r7) goto L62
            java.lang.String r7 = "NaN"
            goto L6a
        L62:
            int r7 = r0 + 7
            if (r8 != r7) goto L69
            java.lang.String r7 = "Infinity"
            goto L6a
        L69:
            r7 = 0
        L6a:
            if (r7 != 0) goto L6d
            return r3
        L6d:
            int r6 = kotlin.text.l0.D3(r6, r7, r0, r1)
            if (r6 != r0) goto L75
            int r8 = r8 + r2
            return r8
        L75:
            return r3
        L76:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final int D0(java.lang.String r1, int r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
        L0:
            if (r2 > r3) goto L19
            char r0 = r1.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19
            int r2 = r2 + 1
            goto L0
        L19:
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final int E0(char r0) {
            r0 = r0 | 32
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final int F0(java.lang.String r1, int r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
        L0:
            if (r3 <= r2) goto L19
            char r0 = r1.charAt(r3)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19
            int r3 = r3 + (-1)
            goto L0
        L19:
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String G0(int r1, int r2) {
            int r0 = r1 + 2
            if (r2 != r0) goto L7
            java.lang.String r1 = "NaN"
            return r1
        L7:
            int r1 = r1 + 7
            if (r2 != r1) goto Le
            java.lang.String r1 = "Infinity"
            return r1
        Le:
            r1 = 0
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean H0(char r1) {
            int r1 = r1 + (-48)
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = 10
            if (r1 >= r0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean I0(char r1) {
            r1 = r1 | 32
            int r1 = r1 + (-97)
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = 6
            if (r1 >= r0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private static final boolean J0(java.lang.String r19) {
            r0 = r19
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = 0
        La:
            r5 = 32
            if (r4 > r1) goto L17
            char r6 = r0.charAt(r4)
            if (r6 > r5) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            if (r4 <= r1) goto L1a
            return r3
        L1a:
            if (r1 <= r4) goto L25
            char r6 = r0.charAt(r1)
            if (r6 > r5) goto L25
            int r1 = r1 + (-1)
            goto L1a
        L25:
            char r6 = r0.charAt(r4)
            r7 = 45
            r8 = 43
            if (r6 == r8) goto L35
            char r6 = r0.charAt(r4)
            if (r6 != r7) goto L37
        L35:
            int r4 = r4 + 1
        L37:
            if (r4 <= r1) goto L3a
            return r3
        L3a:
            char r6 = r0.charAt(r4)
            r9 = 46
            r10 = 10
            r11 = 48
            r12 = 65535(0xffff, float:9.1834E-41)
            r13 = -1
            if (r6 != r11) goto Lc2
            int r6 = r4 + 1
            if (r6 <= r1) goto L4f
            return r2
        L4f:
            char r6 = r0.charAt(r6)
            r6 = r6 | r5
            r14 = 120(0x78, float:1.68E-43)
            if (r6 != r14) goto Lc2
            int r4 = r4 + 2
            r6 = r4
        L5b:
            r14 = 6
            if (r6 > r1) goto L76
            char r15 = r0.charAt(r6)
            int r16 = r15 + (-48)
            r17 = 1
            r2 = r16 & r12
            if (r2 >= r10) goto L6b
            goto L72
        L6b:
            r2 = r15 | 32
            int r2 = r2 + (-97)
            r2 = r2 & r12
            if (r2 >= r14) goto L78
        L72:
            int r6 = r6 + 1
            r2 = 1
            goto L5b
        L76:
            r17 = 1
        L78:
            if (r4 == r6) goto L7c
            r2 = 1
            goto L7d
        L7c:
            r2 = 0
        L7d:
            if (r6 <= r1) goto L83
            r4 = -1
            r18 = 32
            goto Lba
        L83:
            char r4 = r0.charAt(r6)
            if (r4 != r9) goto Lb0
            int r6 = r6 + 1
            r4 = r6
        L8c:
            if (r4 > r1) goto La7
            char r15 = r0.charAt(r4)
            int r16 = r15 + (-48)
            r18 = 32
            r5 = r16 & r12
            if (r5 >= r10) goto L9b
            goto La2
        L9b:
            r5 = r15 | 32
            int r5 = r5 + (-97)
            r5 = r5 & r12
            if (r5 >= r14) goto La9
        La2:
            int r4 = r4 + 1
            r5 = 32
            goto L8c
        La7:
            r18 = 32
        La9:
            if (r6 == r4) goto Lad
            r5 = 1
            goto Lae
        Lad:
            r5 = 0
        Lae:
            r6 = r4
            goto Lb3
        Lb0:
            r18 = 32
            r5 = 0
        Lb3:
            if (r2 != 0) goto Lb9
            if (r5 != 0) goto Lb9
            r4 = -1
            goto Lba
        Lb9:
            r4 = r6
        Lba:
            if (r4 == r13) goto Lc1
            if (r4 <= r1) goto Lbf
            goto Lc1
        Lbf:
            r2 = 1
            goto Lc7
        Lc1:
            return r3
        Lc2:
            r17 = 1
            r18 = 32
            r2 = 0
        Lc7:
            if (r2 != 0) goto L123
            r5 = r4
        Lca:
            if (r5 > r1) goto Ld7
            char r6 = r0.charAt(r5)
            int r6 = r6 - r11
            r6 = r6 & r12
            if (r6 >= r10) goto Ld7
            int r5 = r5 + 1
            goto Lca
        Ld7:
            if (r4 == r5) goto Ldb
            r4 = 1
            goto Ldc
        Ldb:
            r4 = 0
        Ldc:
            if (r5 <= r1) goto Le0
            r4 = r5
            goto L11d
        Le0:
            char r6 = r0.charAt(r5)
            if (r6 != r9) goto Lfa
            int r5 = r5 + 1
            r6 = r5
        Le9:
            if (r6 > r1) goto Lf6
            char r9 = r0.charAt(r6)
            int r9 = r9 - r11
            r9 = r9 & r12
            if (r9 >= r10) goto Lf6
            int r6 = r6 + 1
            goto Le9
        Lf6:
            if (r5 == r6) goto Lfb
            r5 = 1
            goto Lfc
        Lfa:
            r6 = r5
        Lfb:
            r5 = 0
        Lfc:
            if (r4 != 0) goto L11c
            if (r5 != 0) goto L11c
            int r4 = r6 + 2
            if (r1 != r4) goto L107
            java.lang.String r4 = "NaN"
            goto L10f
        L107:
            int r4 = r6 + 7
            if (r1 != r4) goto L10e
            java.lang.String r4 = "Infinity"
            goto L10f
        L10e:
            r4 = 0
        L10f:
            if (r4 != 0) goto L113
        L111:
            r4 = -1
            goto L11d
        L113:
            int r4 = kotlin.text.l0.D3(r0, r4, r6, r3)
            if (r4 != r6) goto L111
            int r4 = r1 + 1
            goto L11d
        L11c:
            r4 = r6
        L11d:
            if (r4 != r13) goto L120
            return r3
        L120:
            if (r4 <= r1) goto L123
            return r17
        L123:
            int r5 = r4 + 1
            char r6 = r0.charAt(r4)
            r6 = r6 | 32
            if (r2 == 0) goto L130
            r9 = 112(0x70, float:1.57E-43)
            goto L132
        L130:
            r9 = 101(0x65, float:1.42E-43)
        L132:
            r13 = 100
            r14 = 102(0x66, float:1.43E-43)
            if (r6 == r9) goto L142
            if (r2 != 0) goto L141
            if (r6 == r14) goto L13e
            if (r6 != r13) goto L141
        L13e:
            if (r5 <= r1) goto L141
            return r17
        L141:
            return r3
        L142:
            if (r5 <= r1) goto L145
            return r3
        L145:
            char r2 = r0.charAt(r5)
            if (r2 == r8) goto L151
            char r2 = r0.charAt(r5)
            if (r2 != r7) goto L156
        L151:
            int r5 = r4 + 2
            if (r5 <= r1) goto L156
            return r3
        L156:
            if (r5 > r1) goto L163
            char r2 = r0.charAt(r5)
            int r2 = r2 - r11
            r2 = r2 & r12
            if (r2 >= r10) goto L163
            int r5 = r5 + 1
            goto L156
        L163:
            if (r5 <= r1) goto L166
            return r17
        L166:
            if (r5 != r1) goto L175
            char r0 = r0.charAt(r5)
            r0 = r0 | 32
            if (r0 == r14) goto L174
            if (r0 != r13) goto L173
            goto L174
        L173:
            return r3
        L174:
            return r17
        L175:
            return r3
    }

    private static final <T> T K0(java.lang.String r2, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> r3) {
            r0 = 0
            boolean r1 = J0(r2)     // Catch: java.lang.NumberFormatException -> Lc
            if (r1 == 0) goto Lc
            java.lang.Object r2 = r3.invoke(r2)     // Catch: java.lang.NumberFormatException -> Lc
            return r2
        Lc:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal L0(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigDecimal M0(java.lang.String r1, java.math.MathContext r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigDecimal N0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            boolean r1 = J0(r2)     // Catch: java.lang.NumberFormatException -> L12
            if (r1 == 0) goto L12
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L12
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L12
            return r1
        L12:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigDecimal O0(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.math.MathContext r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mathContext"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            boolean r1 = J0(r2)     // Catch: java.lang.NumberFormatException -> L17
            if (r1 == 0) goto L17
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L17
            r1.<init>(r2, r3)     // Catch: java.lang.NumberFormatException -> L17
            return r1
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger P0(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final java.math.BigInteger Q0(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            int r2 = kotlin.text.c.a(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigInteger R0(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            java.math.BigInteger r1 = S0(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.Nullable
    public static final java.math.BigInteger S0(@org.jetbrains.annotations.NotNull java.lang.String r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.text.c.a(r7)
            int r0 = r6.length()
            r1 = 0
            if (r0 == 0) goto L41
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L2c
            char r4 = r6.charAt(r2)
            r5 = 45
            if (r4 != r5) goto L1c
            r2 = 1
        L1c:
            if (r2 >= r0) goto L37
            char r3 = r6.charAt(r2)
            int r3 = kotlin.text.c.b(r3, r7)
            if (r3 >= 0) goto L29
            return r1
        L29:
            int r2 = r2 + 1
            goto L1c
        L2c:
            char r0 = r6.charAt(r2)
            int r0 = kotlin.text.c.b(r0, r7)
            if (r0 >= 0) goto L37
            return r1
        L37:
            java.math.BigInteger r0 = new java.math.BigInteger
            int r7 = kotlin.text.c.a(r7)
            r0.<init>(r6, r7)
            return r0
        L41:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final boolean T0(java.lang.String r0) {
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final byte U0(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte r1 = java.lang.Byte.parseByte(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final byte V0(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = kotlin.text.c.a(r2)
            byte r1 = java.lang.Byte.parseByte(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final double W0(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            double r0 = java.lang.Double.parseDouble(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Double X0(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            boolean r1 = J0(r3)     // Catch: java.lang.NumberFormatException -> L15
            if (r1 == 0) goto L15
            double r1 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L15
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L15
            return r3
        L15:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final float Y0(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float r1 = java.lang.Float.parseFloat(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float Z0(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            boolean r1 = J0(r2)     // Catch: java.lang.NumberFormatException -> L15
            if (r1 == 0) goto L15
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L15
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L15
            return r2
        L15:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final int a1(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final int b1(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = kotlin.text.c.a(r2)
            int r1 = java.lang.Integer.parseInt(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final long c1(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = java.lang.Long.parseLong(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final long d1(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = kotlin.text.c.a(r2)
            long r1 = java.lang.Long.parseLong(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final short e1(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            short r1 = java.lang.Short.parseShort(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final short f1(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = kotlin.text.c.a(r2)
            short r1 = java.lang.Short.parseShort(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String g1(byte r0, int r1) {
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String h1(int r0, int r1) {
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String i1(long r0, int r2) {
            int r2 = kotlin.text.c.a(r2)
            java.lang.String r0 = java.lang.Long.toString(r0, r2)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String j1(short r0, int r1) {
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
