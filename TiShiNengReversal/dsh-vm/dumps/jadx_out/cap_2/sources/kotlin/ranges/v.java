package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1572:1\n1#2:1573\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class v extends kotlin.ranges.u {
    public v() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final float A(float r1, float r2) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r2
        L5:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer A0(@org.jetbrains.annotations.NotNull kotlin.ranges.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            int r1 = r1.e()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.a A1(@org.jetbrains.annotations.NotNull kotlin.ranges.a r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            kotlin.ranges.u.a(r0, r1)
            kotlin.ranges.a$a r0 = kotlin.ranges.a.d
            char r1 = r3.e()
            char r2 = r3.f()
            int r3 = r3.g()
            if (r3 <= 0) goto L22
            goto L23
        L22:
            int r4 = -r4
        L23:
            kotlin.ranges.a r3 = r0.a(r1, r2, r4)
            return r3
    }

    public static int B(int r0, int r1) {
            if (r0 <= r1) goto L3
            return r1
        L3:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long B0(@org.jetbrains.annotations.NotNull kotlin.ranges.n r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            r2 = 0
            return r2
        Ld:
            long r0 = r2.e()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.ranges.k B1(@org.jetbrains.annotations.NotNull kotlin.ranges.k r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            kotlin.ranges.u.a(r0, r1)
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            int r1 = r3.e()
            int r2 = r3.f()
            int r3 = r3.g()
            if (r3 <= 0) goto L22
            goto L23
        L22:
            int r4 = -r4
        L23:
            kotlin.ranges.k r3 = r0.a(r1, r2, r4)
            return r3
    }

    public static long C(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            return r1
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean C0(kotlin.ranges.h r1, byte r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n C1(@org.jetbrains.annotations.NotNull kotlin.ranges.n r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            kotlin.ranges.u.a(r2, r3)
            kotlin.ranges.n$a r4 = kotlin.ranges.n.d
            long r5 = r11.e()
            long r7 = r11.f()
            long r2 = r11.g()
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L29
        L27:
            r9 = r12
            goto L2b
        L29:
            long r12 = -r12
            goto L27
        L2b:
            kotlin.ranges.n r11 = r4.a(r5, r7, r9)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T D(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "maximumValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.compareTo(r2)
            if (r0 <= 0) goto L11
            return r2
        L11:
            return r1
    }

    @kotlin.jvm.JvmName(name = "floatRangeContains")
    public static final boolean D0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Float> r1, double r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte D1(double r3) {
            r0 = -4584664420663164928(0xc060000000000000, double:-128.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L16
            r0 = 4638637247447433216(0x405fc00000000000, double:127.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L16
            int r3 = (int) r3
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L16:
            r3 = 0
            return r3
    }

    public static final short E(short r0, short r1) {
            if (r0 <= r1) goto L3
            return r1
        L3:
            return r0
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean E0(kotlin.ranges.h r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte E1(float r1) {
            r0 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L13
            r0 = 1123942400(0x42fe0000, float:127.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L13
            int r1 = (int) r1
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static final byte F(byte r2, byte r3, byte r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean F0(kotlin.ranges.h r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte F1(int r1) {
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r0 > r1) goto Le
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto Le
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static final double G(double r1, double r3, double r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            r2.append(r5)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean G0(kotlin.ranges.h r1, short r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte G1(long r3) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L13
            r0 = 128(0x80, double:6.3E-322)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L13
            int r4 = (int) r3
            byte r3 = (byte) r4
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L13:
            r3 = 0
            return r3
    }

    public static final float H(float r2, float r3, float r4) {
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r4
        Le:
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final boolean H0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Integer> r1, byte r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Byte H1(short r1) {
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r0 > r1) goto Le
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto Le
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static int I(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean I0(kotlin.ranges.h r1, double r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = I1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer I1(double r3) {
            r0 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L15
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L15
            int r3 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L15:
            r3 = 0
            return r3
    }

    public static final int J(int r2, @org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Integer> r3) {
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.ranges.g
            if (r0 == 0) goto L1a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.ranges.g r3 = (kotlin.ranges.g) r3
            java.lang.Comparable r2 = N(r2, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
        L1a:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L4e
            java.lang.Comparable r0 = r3.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r2 >= r0) goto L37
            java.lang.Comparable r2 = r3.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
        L37:
            java.lang.Comparable r0 = r3.getEndInclusive()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r2 <= r0) goto L4d
            java.lang.Comparable r2 = r3.getEndInclusive()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L4d:
            return r2
        L4e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean J0(kotlin.ranges.h r1, float r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = J1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer J1(float r1) {
            r0 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = 1325400064(0x4f000000, float:2.1474836E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L12
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static long K(long r1, long r3, long r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            r2.append(r5)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final boolean K0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Integer> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = K1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer K1(long r3) {
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L16
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L16
            int r4 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            return r3
        L16:
            r3 = 0
            return r3
    }

    public static long L(long r3, @org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Long> r5) {
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof kotlin.ranges.g
            if (r0 == 0) goto L1a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            kotlin.ranges.g r5 = (kotlin.ranges.g) r5
            java.lang.Comparable r3 = N(r3, r5)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            return r3
        L1a:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L52
            java.lang.Comparable r0 = r5.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L39
            java.lang.Comparable r3 = r5.getStart()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            return r3
        L39:
            java.lang.Comparable r0 = r5.getEndInclusive()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L51
            java.lang.Comparable r3 = r5.getEndInclusive()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
        L51:
            return r3
        L52:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: "
            r4.append(r0)
            r4.append(r5)
            r5 = 46
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final boolean L0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Integer> r1, short r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long L1(double r3) {
            r0 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L12
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L12
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L12:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T M(@org.jetbrains.annotations.NotNull T r2, @org.jetbrains.annotations.Nullable T r3, @org.jetbrains.annotations.Nullable T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto L41
            if (r4 == 0) goto L41
            int r0 = r3.compareTo(r4)
            if (r0 > 0) goto L1d
            int r0 = r2.compareTo(r3)
            if (r0 >= 0) goto L16
            return r3
        L16:
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L53
            return r4
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L41:
            if (r3 == 0) goto L4a
            int r0 = r2.compareTo(r3)
            if (r0 >= 0) goto L4a
            return r3
        L4a:
            if (r4 == 0) goto L53
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L53
            return r4
        L53:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final boolean M0(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Integer> r1, byte r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long M1(float r2) {
            r0 = -553648128(0xffffffffdf000000, float:-9.223372E18)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = 1593835520(0x5f000000, float:9.223372E18)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L12
            long r0 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T N(@org.jetbrains.annotations.NotNull T r2, @org.jetbrains.annotations.NotNull kotlin.ranges.g<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L42
            java.lang.Comparable r0 = r3.getStart()
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L29
            java.lang.Comparable r0 = r3.getStart()
            boolean r0 = r3.a(r0, r2)
            if (r0 != 0) goto L29
            java.lang.Comparable r2 = r3.getStart()
            return r2
        L29:
            java.lang.Comparable r0 = r3.getEndInclusive()
            boolean r0 = r3.a(r0, r2)
            if (r0 == 0) goto L41
            java.lang.Comparable r0 = r3.getEndInclusive()
            boolean r0 = r3.a(r2, r0)
            if (r0 != 0) goto L41
            java.lang.Comparable r2 = r3.getEndInclusive()
        L41:
            return r2
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final boolean N0(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Integer> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = K1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short N1(double r3) {
            r0 = -4548635623644200960(0xc0e0000000000000, double:-32768.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L16
            r0 = 4674736138332667904(0x40dfffc000000000, double:32767.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L16
            int r3 = (int) r3
            short r3 = (short) r3
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L16:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T O(@org.jetbrains.annotations.NotNull T r2, @org.jetbrains.annotations.NotNull kotlin.ranges.h<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.ranges.g
            if (r0 == 0) goto L15
            kotlin.ranges.g r3 = (kotlin.ranges.g) r3
            java.lang.Comparable r2 = N(r2, r3)
            return r2
        L15:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L39
            java.lang.Comparable r0 = r3.getStart()
            int r0 = r2.compareTo(r0)
            if (r0 >= 0) goto L2a
            java.lang.Comparable r2 = r3.getStart()
            return r2
        L2a:
            java.lang.Comparable r0 = r3.getEndInclusive()
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L38
            java.lang.Comparable r2 = r3.getEndInclusive()
        L38:
            return r2
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "intRangeContains")
    public static final boolean O0(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Integer> r1, short r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short O1(float r1) {
            r0 = -956301312(0xffffffffc7000000, float:-32768.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L14
            r0 = 1191181824(0x46fffe00, float:32767.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L14
            int r1 = (int) r1
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static final short P(short r2, short r3, short r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    public static final char P0(@org.jetbrains.annotations.NotNull kotlin.ranges.a r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            char r3 = r3.f()
            return r3
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is empty."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short P1(int r1) {
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 > r1) goto Lf
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r1 >= r0) goto Lf
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final boolean Q(kotlin.ranges.c r1, java.lang.Character r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto L13
            char r2 = r2.charValue()
            boolean r1 = r1.n(r2)
            if (r1 == 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    public static final int Q0(@org.jetbrains.annotations.NotNull kotlin.ranges.k r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            int r3 = r3.f()
            return r3
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is empty."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short Q1(long r3) {
            r0 = -32768(0xffffffffffff8000, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L14
            r0 = 32768(0x8000, double:1.61895E-319)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L14
            int r4 = (int) r3
            short r3 = (short) r4
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final boolean R(kotlin.ranges.m r1, byte r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = H0(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    public static final long R0(@org.jetbrains.annotations.NotNull kotlin.ranges.n r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            long r0 = r3.f()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is empty."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.c R1(char r1, char r2) {
            r0 = 0
            int r0 = kotlin.jvm.internal.g0.t(r2, r0)
            if (r0 > 0) goto Le
            kotlin.ranges.c$a r1 = kotlin.ranges.c.e
            kotlin.ranges.c r1 = r1.a()
            return r1
        Le:
            kotlin.ranges.c r0 = new kotlin.ranges.c
            int r2 = r2 + (-1)
            char r2 = (char) r2
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean S(kotlin.ranges.m r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = K0(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Character S0(@org.jetbrains.annotations.NotNull kotlin.ranges.a r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            char r1 = r1.f()
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m S1(byte r1, byte r2) {
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final boolean T(kotlin.ranges.m r1, java.lang.Integer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto L13
            int r2 = r2.intValue()
            boolean r1 = r1.n(r2)
            if (r1 == 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer T0(@org.jetbrains.annotations.NotNull kotlin.ranges.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            int r1 = r1.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m T1(byte r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r0) goto Lb
            kotlin.ranges.m$a r1 = kotlin.ranges.m.e
            kotlin.ranges.m r1 = r1.a()
            return r1
        Lb:
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean U(kotlin.ranges.m r1, short r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = L0(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long U0(@org.jetbrains.annotations.NotNull kotlin.ranges.n r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            r2 = 0
            return r2
        Ld:
            long r0 = r2.f()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m U1(byte r1, short r2) {
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean V(kotlin.ranges.p r1, byte r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = V0(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final boolean V0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Long> r2, byte r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m V1(int r1, byte r2) {
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean W(kotlin.ranges.p r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = Y0(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean W0(kotlin.ranges.h r1, double r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Long r2 = L1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.ranges.m W1(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r0) goto Lb
            kotlin.ranges.m$a r1 = kotlin.ranges.m.e
            kotlin.ranges.m r1 = r1.a()
            return r1
        Lb:
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final boolean X(kotlin.ranges.p r2, java.lang.Long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto L13
            long r0 = r3.longValue()
            boolean r2 = r2.n(r0)
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean X0(kotlin.ranges.h r1, float r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Long r2 = M1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m X1(int r1, short r2) {
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean Y(kotlin.ranges.p r1, short r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = Z0(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final boolean Y0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Long> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m Y1(short r1, byte r2) {
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean Z(kotlin.ranges.h r2, byte r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            double r0 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final boolean Z0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Long> r2, short r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m Z1(short r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r0) goto Lb
            kotlin.ranges.m$a r1 = kotlin.ranges.m.e
            kotlin.ranges.m r1 = r1.a()
            return r1
        Lb:
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "doubleRangeContains")
    public static final boolean a0(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Double> r2, float r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            double r0 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final boolean a1(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Long> r2, byte r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m a2(short r1, short r2) {
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean b0(kotlin.ranges.h r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            double r0 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final boolean b1(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Long> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p b2(byte r5, long r6) {
            r0 = -9223372036854775808
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld
            kotlin.ranges.p$a r5 = kotlin.ranges.p.e
            kotlin.ranges.p r5 = r5.a()
            return r5
        Ld:
            kotlin.ranges.p r0 = new kotlin.ranges.p
            long r1 = (long) r5
            r3 = 1
            long r6 = r6 - r3
            r0.<init>(r1, r6)
            return r0
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean c0(kotlin.ranges.h r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "longRangeContains")
    public static final boolean c1(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Long> r2, short r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p c2(int r5, long r6) {
            r0 = -9223372036854775808
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld
            kotlin.ranges.p$a r5 = kotlin.ranges.p.e
            kotlin.ranges.p r5 = r5.a()
            return r5
        Ld:
            kotlin.ranges.p r0 = new kotlin.ranges.p
            long r1 = (long) r5
            r3 = 1
            long r6 = r6 - r3
            r0.<init>(r1, r6)
            return r0
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean d0(kotlin.ranges.h r2, short r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            double r0 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final char d1(kotlin.ranges.c r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            char r1 = e1(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p d2(long r5, byte r7) {
            kotlin.ranges.p r0 = new kotlin.ranges.p
            long r1 = (long) r7
            r3 = 1
            long r1 = r1 - r3
            r0.<init>(r5, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "doubleRangeContains")
    public static final boolean e0(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Double> r2, float r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            double r0 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            boolean r2 = r2.contains(r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final char e1(@org.jetbrains.annotations.NotNull kotlin.ranges.c r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            char r0 = r1.e()     // Catch: java.lang.IllegalArgumentException -> L1a
            char r1 = r1.f()     // Catch: java.lang.IllegalArgumentException -> L1a
            int r1 = r1 + 1
            int r1 = r2.nextInt(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L1a
            char r1 = (char) r1
            return r1
        L1a:
            r1 = move-exception
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r1 = r1.getMessage()
            r2.<init>(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p e2(long r5, int r7) {
            kotlin.ranges.p r0 = new kotlin.ranges.p
            long r1 = (long) r7
            r3 = 1
            long r1 = r1 - r3
            r0.<init>(r5, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.a f0(char r2, char r3) {
            kotlin.ranges.a$a r0 = kotlin.ranges.a.d
            r1 = -1
            kotlin.ranges.a r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final int f1(kotlin.ranges.m r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            int r1 = g1(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p f2(long r3, long r5) {
            r0 = -9223372036854775808
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld
            kotlin.ranges.p$a r3 = kotlin.ranges.p.e
            kotlin.ranges.p r3 = r3.a()
            return r3
        Ld:
            kotlin.ranges.p r0 = new kotlin.ranges.p
            r1 = 1
            long r5 = r5 - r1
            r0.<init>(r3, r5)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k g0(byte r2, byte r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final int g1(@org.jetbrains.annotations.NotNull kotlin.ranges.m r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r1 = kotlin.random.f.h(r2, r1)     // Catch: java.lang.IllegalArgumentException -> Lf
            return r1
        Lf:
            r1 = move-exception
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r1 = r1.getMessage()
            r2.<init>(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p g2(long r5, short r7) {
            kotlin.ranges.p r0 = new kotlin.ranges.p
            long r1 = (long) r7
            r3 = 1
            long r1 = r1 - r3
            r0.<init>(r5, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k h0(byte r2, int r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final long h1(kotlin.ranges.p r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            long r0 = i1(r2, r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p h2(short r5, long r6) {
            r0 = -9223372036854775808
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld
            kotlin.ranges.p$a r5 = kotlin.ranges.p.e
            kotlin.ranges.p r5 = r5.a()
            return r5
        Ld:
            kotlin.ranges.p r0 = new kotlin.ranges.p
            long r1 = (long) r5
            r3 = 1
            long r6 = r6 - r3
            r0.<init>(r1, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k i0(byte r2, short r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final long i1(@org.jetbrains.annotations.NotNull kotlin.ranges.p r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r1 = kotlin.random.f.i(r2, r1)     // Catch: java.lang.IllegalArgumentException -> Lf
            return r1
        Lf:
            r1 = move-exception
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r1 = r1.getMessage()
            r2.<init>(r1)
            throw r2
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean j(kotlin.ranges.h r1, double r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = D1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k j0(int r2, byte r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.Character j1(kotlin.ranges.c r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            java.lang.Character r1 = k1(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean k(kotlin.ranges.h r1, float r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = E1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.ranges.k k0(int r2, int r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Character k1(@org.jetbrains.annotations.NotNull kotlin.ranges.c r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L12
            r1 = 0
            return r1
        L12:
            char r0 = r1.e()
            char r1 = r1.f()
            int r1 = r1 + 1
            int r1 = r2.nextInt(r0, r1)
            char r1 = (char) r1
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
    }

    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final boolean l(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Byte> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = F1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k l0(int r2, short r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.Integer l1(kotlin.ranges.m r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            java.lang.Integer r1 = m1(r1, r0)
            return r1
    }

    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final boolean m(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Byte> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = G1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k m0(short r2, byte r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer m1(@org.jetbrains.annotations.NotNull kotlin.ranges.m r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L12
            r1 = 0
            return r1
        L12:
            int r1 = kotlin.random.f.h(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final boolean n(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Byte> r1, short r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = H1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k n0(short r2, int r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.Long n1(kotlin.ranges.p r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            java.lang.Long r1 = o1(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final boolean o(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Byte> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = F1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k o0(short r2, short r3) {
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            r1 = -1
            kotlin.ranges.k r2 = r0.a(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long o1(@org.jetbrains.annotations.NotNull kotlin.ranges.p r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L12
            r1 = 0
            return r1
        L12:
            long r1 = kotlin.random.f.i(r2, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final boolean p(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Byte> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = G1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n p0(byte r7, long r8) {
            kotlin.ranges.n$a r0 = kotlin.ranges.n.d
            long r1 = (long) r7
            r5 = -1
            r3 = r8
            kotlin.ranges.n r7 = r0.a(r1, r3, r5)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.a p1(@org.jetbrains.annotations.NotNull kotlin.ranges.a r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.ranges.a$a r0 = kotlin.ranges.a.d
            char r1 = r3.f()
            char r2 = r3.e()
            int r3 = r3.g()
            int r3 = -r3
            kotlin.ranges.a r3 = r0.a(r1, r2, r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "byteRangeContains")
    public static final boolean q(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Byte> r1, short r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Byte r2 = H1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n q0(int r7, long r8) {
            kotlin.ranges.n$a r0 = kotlin.ranges.n.d
            long r1 = (long) r7
            r5 = -1
            r3 = r8
            kotlin.ranges.n r7 = r0.a(r1, r3, r5)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.k q1(@org.jetbrains.annotations.NotNull kotlin.ranges.k r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.ranges.k$a r0 = kotlin.ranges.k.d
            int r1 = r3.f()
            int r2 = r3.e()
            int r3 = r3.g()
            int r3 = -r3
            kotlin.ranges.k r3 = r0.a(r1, r2, r3)
            return r3
    }

    public static final byte r(byte r0, byte r1) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n r0(long r7, byte r9) {
            kotlin.ranges.n$a r0 = kotlin.ranges.n.d
            long r3 = (long) r9
            r5 = -1
            r1 = r7
            kotlin.ranges.n r7 = r0.a(r1, r3, r5)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n r1(@org.jetbrains.annotations.NotNull kotlin.ranges.n r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.ranges.n$a r1 = kotlin.ranges.n.d
            long r2 = r8.f()
            long r4 = r8.e()
            long r6 = r8.g()
            long r6 = -r6
            kotlin.ranges.n r8 = r1.a(r2, r4, r6)
            return r8
    }

    public static final double s(double r1, double r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n s0(long r7, int r9) {
            kotlin.ranges.n$a r0 = kotlin.ranges.n.d
            long r3 = (long) r9
            r5 = -1
            r1 = r7
            kotlin.ranges.n r7 = r0.a(r1, r3, r5)
            return r7
    }

    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final boolean s1(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Short> r1, byte r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            short r2 = (short) r2
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    public static final float t(float r1, float r2) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n t0(long r7, long r9) {
            kotlin.ranges.n$a r0 = kotlin.ranges.n.d
            r5 = -1
            r1 = r7
            r3 = r9
            kotlin.ranges.n r7 = r0.a(r1, r3, r5)
            return r7
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean t1(kotlin.ranges.h r1, double r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r2 = N1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static int u(int r0, int r1) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n u0(long r7, short r9) {
            kotlin.ranges.n$a r0 = kotlin.ranges.n.d
            long r3 = (long) r9
            r5 = -1
            r1 = r7
            kotlin.ranges.n r7 = r0.a(r1, r3, r5)
            return r7
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean u1(kotlin.ranges.h r1, float r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r2 = O1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static long v(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.n v0(short r7, long r8) {
            kotlin.ranges.n$a r0 = kotlin.ranges.n.d
            long r1 = (long) r7
            r5 = -1
            r3 = r8
            kotlin.ranges.n r7 = r0.a(r1, r3, r5)
            return r7
    }

    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final boolean v1(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Short> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r2 = P1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T w(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "minimumValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L11
            return r2
        L11:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    public static final char w0(@org.jetbrains.annotations.NotNull kotlin.ranges.a r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            char r3 = r3.e()
            return r3
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is empty."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final boolean w1(@org.jetbrains.annotations.NotNull kotlin.ranges.h<java.lang.Short> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r2 = Q1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final short x(short r0, short r1) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    public static final int x0(@org.jetbrains.annotations.NotNull kotlin.ranges.k r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            int r3 = r3.e()
            return r3
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is empty."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final boolean x1(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Short> r1, byte r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            short r2 = (short) r2
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            boolean r1 = r1.contains(r2)
            return r1
    }

    public static final byte y(byte r0, byte r1) {
            if (r0 <= r1) goto L3
            return r1
        L3:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    public static final long y0(@org.jetbrains.annotations.NotNull kotlin.ranges.n r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            long r0 = r3.e()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is empty."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final boolean y1(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Short> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r2 = P1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final double z(double r1, double r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Character z0(@org.jetbrains.annotations.NotNull kotlin.ranges.a r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            char r1 = r1.e()
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.jvm.JvmName(name = "shortRangeContains")
    public static final boolean z1(@org.jetbrains.annotations.NotNull kotlin.ranges.s<java.lang.Short> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Short r2 = Q1(r2)
            if (r2 == 0) goto L10
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }
}
