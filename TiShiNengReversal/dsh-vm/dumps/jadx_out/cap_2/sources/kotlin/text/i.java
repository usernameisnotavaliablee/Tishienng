package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1237:1\n1186#1,7:1239\n1186#1,7:1246\n1186#1,7:1253\n1186#1,7:1260\n1186#1,7:1267\n1186#1,7:1274\n1186#1,7:1281\n1186#1,7:1288\n1197#1,5:1295\n1197#1,5:1300\n1186#1,7:1305\n1186#1,7:1312\n1197#1,5:1319\n1206#1,5:1324\n1#2:1238\n1188#3,3:1329\n1188#3,3:1332\n1188#3,3:1335\n1188#3,3:1338\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n450#1:1239,7\n482#1:1246,7\n486#1:1253,7\n489#1:1260,7\n529#1:1267,7\n532#1:1274,7\n537#1:1281,7\n542#1:1288,7\n549#1:1295,5\n550#1:1300,5\n1141#1:1305,7\n1143#1:1312,7\n1171#1:1319,5\n1179#1:1324,5\n42#1:1329,3\n43#1:1332,3\n54#1:1335,3\n55#1:1338,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String a = "0123456789abcdef";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = "0123456789ABCDEF";

    @org.jetbrains.annotations.NotNull
    private static final int[] c = null;

    @org.jetbrains.annotations.NotNull
    private static final int[] d = null;

    @org.jetbrains.annotations.NotNull
    private static final int[] e = null;

    @org.jetbrains.annotations.NotNull
    private static final long[] f = null;

    static {
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L6:
            java.lang.String r4 = "0123456789abcdef"
            if (r3 >= r0) goto L1e
            int r5 = r3 >> 4
            char r5 = r4.charAt(r5)
            int r5 = r5 << 8
            r6 = r3 & 15
            char r4 = r4.charAt(r6)
            r4 = r4 | r5
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        L1e:
            kotlin.text.i.c = r1
            int[] r1 = new int[r0]
            r3 = 0
        L23:
            java.lang.String r5 = "0123456789ABCDEF"
            if (r3 >= r0) goto L3b
            int r6 = r3 >> 4
            char r6 = r5.charAt(r6)
            int r6 = r6 << 8
            r7 = r3 & 15
            char r5 = r5.charAt(r7)
            r5 = r5 | r6
            r1[r3] = r5
            int r3 = r3 + 1
            goto L23
        L3b:
            kotlin.text.i.d = r1
            int[] r1 = new int[r0]
            r3 = 0
        L40:
            if (r3 >= r0) goto L48
            r6 = -1
            r1[r3] = r6
            int r3 = r3 + 1
            goto L40
        L48:
            r3 = 0
            r6 = 0
        L4a:
            int r7 = r4.length()
            if (r3 >= r7) goto L5c
            char r7 = r4.charAt(r3)
            int r8 = r6 + 1
            r1[r7] = r6
            int r3 = r3 + 1
            r6 = r8
            goto L4a
        L5c:
            r3 = 0
            r6 = 0
        L5e:
            int r7 = r5.length()
            if (r3 >= r7) goto L70
            char r7 = r5.charAt(r3)
            int r8 = r6 + 1
            r1[r7] = r6
            int r3 = r3 + 1
            r6 = r8
            goto L5e
        L70:
            kotlin.text.i.e = r1
            long[] r1 = new long[r0]
            r3 = 0
        L75:
            if (r3 >= r0) goto L7e
            r6 = -1
            r1[r3] = r6
            int r3 = r3 + 1
            goto L75
        L7e:
            r0 = 0
            r3 = 0
        L80:
            int r6 = r4.length()
            if (r0 >= r6) goto L93
            char r6 = r4.charAt(r0)
            int r7 = r3 + 1
            long r8 = (long) r3
            r1[r6] = r8
            int r0 = r0 + 1
            r3 = r7
            goto L80
        L93:
            r0 = 0
        L94:
            int r3 = r5.length()
            if (r2 >= r3) goto La7
            char r3 = r5.charAt(r2)
            int r4 = r0 + 1
            long r6 = (long) r0
            r1[r3] = r6
            int r2 = r2 + 1
            r0 = r4
            goto L94
        La7:
            kotlin.text.i.f = r1
            return
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final int A(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.j r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r2.length()
            int r2 = z(r2, r0, r1, r3)
            return r2
    }

    public static /* synthetic */ int B(java.lang.String r0, int r1, int r2, kotlin.text.j r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.j$c r3 = kotlin.text.j.d
            kotlin.text.j r3 = r3.a()
        L17:
            int r0 = z(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int C(java.lang.String r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            int r0 = A(r0, r1)
            return r0
    }

    private static final int D(java.lang.String r7, int r8, int r9, kotlin.text.j r10, int r11) {
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r7.length()
            r0.a(r8, r9, r1)
            kotlin.text.j$d r10 = r10.d()
            boolean r0 = r10.i()
            if (r0 == 0) goto L1b
            e(r7, r8, r9, r11)
            int r7 = P(r7, r8, r9)
            return r7
        L1b:
            java.lang.String r3 = r10.f()
            java.lang.String r4 = r10.h()
            boolean r5 = r10.c()
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r11
            f(r0, r1, r2, r3, r4, r5, r6)
            int r7 = r3.length()
            int r8 = r1 + r7
            int r7 = r4.length()
            int r9 = r2 - r7
            int r7 = P(r0, r8, r9)
            return r7
    }

    public static final long E(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3, @org.jetbrains.annotations.NotNull kotlin.text.j r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 16
            long r1 = I(r1, r2, r3, r4, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final long F(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.j r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r2.length()
            long r2 = E(r2, r0, r1, r3)
            return r2
    }

    public static /* synthetic */ long G(java.lang.String r0, int r1, int r2, kotlin.text.j r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.j$c r3 = kotlin.text.j.d
            kotlin.text.j r3 = r3.a()
        L17:
            long r0 = E(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ long H(java.lang.String r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            long r0 = F(r0, r1)
            return r0
    }

    private static final long I(java.lang.String r7, int r8, int r9, kotlin.text.j r10, int r11) {
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r7.length()
            r0.a(r8, r9, r1)
            kotlin.text.j$d r10 = r10.d()
            boolean r0 = r10.i()
            if (r0 == 0) goto L1b
            e(r7, r8, r9, r11)
            long r7 = Q(r7, r8, r9)
            return r7
        L1b:
            java.lang.String r3 = r10.f()
            java.lang.String r4 = r10.h()
            boolean r5 = r10.c()
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r11
            f(r0, r1, r2, r3, r4, r5, r6)
            int r7 = r3.length()
            int r8 = r1 + r7
            int r7 = r4.length()
            int r9 = r2 - r7
            long r7 = Q(r0, r8, r9)
            return r7
    }

    private static final short J(java.lang.String r1, int r2, int r3, kotlin.text.j r4) {
            r0 = 4
            int r1 = D(r1, r2, r3, r4, r0)
            short r1 = (short) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final short K(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.j r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r2.length()
            short r2 = J(r2, r0, r1, r3)
            return r2
    }

    static /* synthetic */ short L(java.lang.String r0, int r1, int r2, kotlin.text.j r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.j$c r3 = kotlin.text.j.d
            kotlin.text.j r3 = r3.a()
        L17:
            short r0 = J(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ short M(java.lang.String r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            short r0 = K(r0, r1)
            return r0
    }

    private static final long N(java.lang.String r5, int r6) {
            char r0 = r5.charAt(r6)
            int r1 = r0 >>> 8
            if (r1 != 0) goto L13
            long[] r1 = kotlin.text.i.f
            r0 = r1[r0]
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            return r0
        L13:
            S(r5, r6)
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
    }

    private static final byte O(java.lang.String r4, int r5) {
            char r0 = r4.charAt(r5)
            int r1 = r0 >>> 8
            if (r1 != 0) goto L2a
            int[] r1 = kotlin.text.i.e
            r0 = r1[r0]
            if (r0 < 0) goto L2a
            int r5 = r5 + 1
            char r2 = r4.charAt(r5)
            int r3 = r2 >>> 8
            if (r3 != 0) goto L21
            r1 = r1[r2]
            if (r1 < 0) goto L21
            int r4 = r0 << 4
            r4 = r4 | r1
            byte r4 = (byte) r4
            return r4
        L21:
            S(r4, r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L2a:
            S(r4, r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
    }

    private static final int P(java.lang.String r3, int r4, int r5) {
            r0 = 0
        L1:
            if (r4 >= r5) goto L20
            int r0 = r0 << 4
            char r1 = r3.charAt(r4)
            int r2 = r1 >>> 8
            if (r2 != 0) goto L17
            int[] r2 = kotlin.text.i.e
            r1 = r2[r1]
            if (r1 < 0) goto L17
            r0 = r0 | r1
            int r4 = r4 + 1
            goto L1
        L17:
            S(r3, r4)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        L20:
            return r0
    }

    private static final long Q(java.lang.String r7, int r8, int r9) {
            r0 = 0
            r2 = r0
        L3:
            if (r8 >= r9) goto L24
            r4 = 4
            long r2 = r2 << r4
            char r4 = r7.charAt(r8)
            int r5 = r4 >>> 8
            if (r5 != 0) goto L1b
            long[] r5 = kotlin.text.i.f
            r4 = r5[r4]
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L1b
            long r2 = r2 | r4
            int r8 = r8 + 1
            goto L3
        L1b:
            S(r7, r8)
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        L24:
            return r2
    }

    public static final int R(int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            if (r0 <= 0) goto L68
            r5 = r22
            long r5 = (long) r5
            r7 = 2
            long r5 = r5 + r7
            r7 = r23
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = a(r5, r2, r4)
            if (r1 > r2) goto L21
            long r9 = a(r5, r1, r4)
            goto L32
        L21:
            int r9 = r1 / r2
            long r9 = a(r7, r9, r3)
            int r11 = r1 % r2
            if (r11 == 0) goto L32
            long r12 = (long) r3
            long r9 = r9 + r12
            long r11 = a(r5, r11, r4)
            long r9 = r9 + r11
        L32:
            long r11 = (long) r0
            r0 = 1
            long r13 = o0(r11, r9, r0)
            r15 = 1
            long r9 = r9 + r15
            long r9 = r9 * r13
            long r11 = r11 - r9
            long r9 = o0(r11, r7, r3)
            long r0 = (long) r3
            long r7 = r7 + r0
            long r7 = r7 * r9
            long r11 = r11 - r7
            long r0 = o0(r11, r5, r4)
            long r3 = (long) r4
            long r5 = r5 + r3
            long r5 = r5 * r0
            long r11 = r11 - r5
            r3 = 0
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 <= 0) goto L5a
            r3 = 1
        L57:
            r4 = r18
            goto L5c
        L5a:
            r3 = 0
            goto L57
        L5c:
            long r4 = (long) r4
            long r13 = r13 * r4
            long r4 = (long) r2
            long r9 = r9 * r4
            long r13 = r13 + r9
            long r13 = r13 + r0
            long r0 = (long) r3
            long r13 = r13 + r0
            int r0 = (int) r13
            return r0
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            r0.<init>(r1)
            throw r0
    }

    private static final java.lang.Void S(java.lang.String r3, int r4) {
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a hexadecimal digit at index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", but was "
            r1.append(r2)
            char r3 = r3.charAt(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final void T(java.lang.String r3, int r4, int r5, java.lang.String r6, int r7) {
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.lang.String r3 = r3.substring(r4, r5)
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected "
            r1.append(r2)
            r1.append(r6)
            r6 = 32
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = " hexadecimal digits at index "
            r1.append(r6)
            r1.append(r4)
            java.lang.String r6 = ", but was \""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\" of length "
            r1.append(r3)
            int r5 = r5 - r4
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final void U(java.lang.String r1, int r2, int r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r1, r0)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Expected a hexadecimal number with prefix \""
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = "\" and suffix \""
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = "\", but was "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    private static final void V(java.lang.String r2, int r3, int r4, java.lang.String r5, java.lang.String r6) {
            int r0 = r5.length()
            int r0 = r0 + r3
            int r4 = kotlin.ranges.t.B(r0, r4)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r2, r0)
            java.lang.String r2 = r2.substring(r3, r4)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " \""
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = "\" at index "
            r0.append(r5)
            r0.append(r3)
            java.lang.String r3 = ", but was "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2)
            throw r4
    }

    private static final int W(java.lang.String r3, char[] r4, int r5) {
            int r0 = r3.length()
            if (r0 == 0) goto L1d
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L17
            int r0 = r3.length()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r3, r1)
            r3.getChars(r2, r0, r4, r5)
            goto L1d
        L17:
            char r0 = r3.charAt(r2)
            r4[r5] = r0
        L1d:
            int r3 = r3.length()
            int r5 = r5 + r3
            return r5
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String X(byte r5, @org.jetbrains.annotations.NotNull kotlin.text.j r6) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r6.e()
            if (r0 == 0) goto Le
            java.lang.String r0 = "0123456789ABCDEF"
            goto L10
        Le:
            java.lang.String r0 = "0123456789abcdef"
        L10:
            kotlin.text.j$d r6 = r6.d()
            boolean r1 = r6.j()
            if (r1 == 0) goto L4f
            int r1 = r5 >> 4
            r1 = r1 & 15
            char r1 = r0.charAt(r1)
            r2 = r5 & 15
            char r0 = r0.charAt(r2)
            r2 = 2
            char[] r3 = new char[r2]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r0
            boolean r6 = r6.g()
            if (r6 == 0) goto L4a
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = r5 + (-24)
            int r5 = r5 >> r2
            int r5 = kotlin.ranges.t.B(r5, r1)
            r6 = 0
            java.lang.String r5 = kotlin.text.g0.L1(r3, r5, r4, r2, r6)
            return r5
        L4a:
            java.lang.String r5 = kotlin.text.g0.J1(r3)
            return r5
        L4f:
            long r1 = (long) r5
            r5 = 8
            java.lang.String r5 = j0(r1, r6, r0, r5)
            return r5
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String Y(int r10, @org.jetbrains.annotations.NotNull kotlin.text.j r11) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r11, r0)
            boolean r0 = r11.e()
            if (r0 == 0) goto Le
            java.lang.String r0 = "0123456789ABCDEF"
            goto L10
        Le:
            java.lang.String r0 = "0123456789abcdef"
        L10:
            kotlin.text.j$d r11 = r11.d()
            boolean r1 = r11.j()
            if (r1 == 0) goto L8e
            int r1 = r10 >> 28
            r1 = r1 & 15
            char r1 = r0.charAt(r1)
            int r2 = r10 >> 24
            r2 = r2 & 15
            char r2 = r0.charAt(r2)
            int r3 = r10 >> 20
            r3 = r3 & 15
            char r3 = r0.charAt(r3)
            int r4 = r10 >> 16
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            int r5 = r10 >> 12
            r5 = r5 & 15
            char r5 = r0.charAt(r5)
            int r6 = r10 >> 8
            r6 = r6 & 15
            char r6 = r0.charAt(r6)
            int r7 = r10 >> 4
            r7 = r7 & 15
            char r7 = r0.charAt(r7)
            r8 = r10 & 15
            char r0 = r0.charAt(r8)
            r8 = 8
            char[] r8 = new char[r8]
            r9 = 0
            r8[r9] = r1
            r1 = 1
            r8[r1] = r2
            r1 = 2
            r8[r1] = r3
            r2 = 3
            r8[r2] = r4
            r2 = 4
            r8[r2] = r5
            r2 = 5
            r8[r2] = r6
            r2 = 6
            r8[r2] = r7
            r2 = 7
            r8[r2] = r0
            boolean r11 = r11.g()
            if (r11 == 0) goto L89
            int r10 = java.lang.Integer.numberOfLeadingZeros(r10)
            int r10 = r10 >> r1
            int r10 = kotlin.ranges.t.B(r10, r2)
            r11 = 0
            java.lang.String r10 = kotlin.text.g0.L1(r8, r10, r9, r1, r11)
            return r10
        L89:
            java.lang.String r10 = kotlin.text.g0.J1(r8)
            return r10
        L8e:
            long r1 = (long) r10
            r10 = 32
            java.lang.String r10 = j0(r1, r11, r0, r10)
            return r10
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String Z(long r26, @org.jetbrains.annotations.NotNull kotlin.text.j r28) {
            r0 = r26
            java.lang.String r2 = "format"
            r3 = r28
            kotlin.jvm.internal.g0.p(r3, r2)
            boolean r2 = r3.e()
            if (r2 == 0) goto L12
            java.lang.String r2 = "0123456789ABCDEF"
            goto L14
        L12:
            java.lang.String r2 = "0123456789abcdef"
        L14:
            kotlin.text.j$d r3 = r3.d()
            boolean r4 = r3.j()
            if (r4 == 0) goto L12b
            r4 = 60
            long r4 = r0 >> r4
            r6 = 15
            long r4 = r4 & r6
            int r5 = (int) r4
            char r4 = r2.charAt(r5)
            r5 = 56
            long r8 = r0 >> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            char r5 = r2.charAt(r5)
            r8 = 52
            long r8 = r0 >> r8
            long r8 = r8 & r6
            int r9 = (int) r8
            char r8 = r2.charAt(r9)
            r9 = 48
            long r9 = r0 >> r9
            long r9 = r9 & r6
            int r10 = (int) r9
            char r9 = r2.charAt(r10)
            r10 = 44
            long r10 = r0 >> r10
            long r10 = r10 & r6
            int r11 = (int) r10
            char r10 = r2.charAt(r11)
            r11 = 40
            long r11 = r0 >> r11
            long r11 = r11 & r6
            int r12 = (int) r11
            char r11 = r2.charAt(r12)
            r12 = 36
            long r12 = r0 >> r12
            long r12 = r12 & r6
            int r13 = (int) r12
            char r12 = r2.charAt(r13)
            r13 = 32
            long r13 = r0 >> r13
            long r13 = r13 & r6
            int r14 = (int) r13
            char r13 = r2.charAt(r14)
            r14 = 28
            long r14 = r0 >> r14
            long r14 = r14 & r6
            int r15 = (int) r14
            char r14 = r2.charAt(r15)
            r15 = 24
            long r15 = r0 >> r15
            r17 = r6
            long r6 = r15 & r17
            int r7 = (int) r6
            char r6 = r2.charAt(r7)
            r7 = 20
            long r15 = r0 >> r7
            r28 = r4
            r7 = r5
            long r4 = r15 & r17
            int r5 = (int) r4
            char r4 = r2.charAt(r5)
            r5 = 16
            long r15 = r0 >> r5
            r19 = r6
            long r5 = r15 & r17
            int r6 = (int) r5
            char r5 = r2.charAt(r6)
            r6 = 12
            long r15 = r0 >> r6
            r20 = r7
            r21 = 12
            long r6 = r15 & r17
            int r7 = (int) r6
            char r6 = r2.charAt(r7)
            r7 = 8
            long r15 = r0 >> r7
            r22 = r8
            r23 = 8
            long r7 = r15 & r17
            int r8 = (int) r7
            char r7 = r2.charAt(r8)
            r8 = 4
            long r15 = r0 >> r8
            r24 = r9
            r25 = 4
            long r8 = r15 & r17
            int r9 = (int) r8
            char r8 = r2.charAt(r9)
            r9 = r4
            r15 = r5
            long r4 = r0 & r17
            int r5 = (int) r4
            char r2 = r2.charAt(r5)
            r4 = 16
            char[] r4 = new char[r4]
            r5 = 0
            r4[r5] = r28
            r16 = 1
            r4[r16] = r20
            r5 = 2
            r4[r5] = r22
            r16 = 3
            r4[r16] = r24
            r4[r25] = r10
            r10 = 5
            r4[r10] = r11
            r10 = 6
            r4[r10] = r12
            r10 = 7
            r4[r10] = r13
            r4[r23] = r14
            r10 = 9
            r4[r10] = r19
            r10 = 10
            r4[r10] = r9
            r9 = 11
            r4[r9] = r15
            r4[r21] = r6
            r6 = 13
            r4[r6] = r7
            r6 = 14
            r4[r6] = r8
            r6 = 15
            r4[r6] = r2
            boolean r2 = r3.g()
            if (r2 == 0) goto L126
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            int r0 = r0 >> r5
            int r0 = kotlin.ranges.t.B(r0, r6)
            r1 = 0
            r2 = 0
            java.lang.String r0 = kotlin.text.g0.L1(r4, r0, r2, r5, r1)
            return r0
        L126:
            java.lang.String r0 = kotlin.text.g0.J1(r4)
            return r0
        L12b:
            r4 = 64
            java.lang.String r0 = j0(r0, r3, r2, r4)
            return r0
    }

    private static final long a(long r4, int r6, int r7) {
            if (r6 <= 0) goto Ld
            long r0 = (long) r6
            long r4 = r4 * r0
            long r6 = (long) r7
            r2 = 1
            long r0 = r0 - r2
            long r6 = r6 * r0
            long r4 = r4 + r6
            return r4
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            r4.<init>(r5)
            throw r4
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a0(short r7, @org.jetbrains.annotations.NotNull kotlin.text.j r8) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r8.e()
            if (r0 == 0) goto Le
            java.lang.String r0 = "0123456789ABCDEF"
            goto L10
        Le:
            java.lang.String r0 = "0123456789abcdef"
        L10:
            kotlin.text.j$d r8 = r8.d()
            boolean r1 = r8.j()
            r2 = 16
            if (r1 == 0) goto L68
            int r1 = r7 >> 12
            r1 = r1 & 15
            char r1 = r0.charAt(r1)
            int r3 = r7 >> 8
            r3 = r3 & 15
            char r3 = r0.charAt(r3)
            int r4 = r7 >> 4
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r5 = r7 & 15
            char r0 = r0.charAt(r5)
            r5 = 4
            char[] r5 = new char[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r3
            r1 = 2
            r5[r1] = r4
            r3 = 3
            r5[r3] = r0
            boolean r8 = r8.g()
            if (r8 == 0) goto L63
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 - r2
            int r7 = r7 >> r1
            int r7 = kotlin.ranges.t.B(r7, r3)
            r8 = 0
            java.lang.String r7 = kotlin.text.g0.L1(r5, r7, r6, r1, r8)
            return r7
        L63:
            java.lang.String r7 = kotlin.text.g0.J1(r5)
            return r7
        L68:
            long r3 = (long) r7
            java.lang.String r7 = j0(r3, r8, r0, r2)
            return r7
    }

    private static final int b(java.lang.String r4, int r5, int r6, java.lang.String r7, boolean r8, java.lang.String r9) {
            int r0 = r7.length()
            if (r0 != 0) goto L7
            return r5
        L7:
            int r0 = r7.length()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L24
            char r2 = r7.charAt(r1)
            int r3 = r5 + r1
            char r3 = r4.charAt(r3)
            boolean r2 = kotlin.text.d.J(r2, r3, r8)
            if (r2 != 0) goto L21
            V(r4, r5, r6, r7, r9)
        L21:
            int r1 = r1 + 1
            goto Lc
        L24:
            int r4 = r7.length()
            int r5 = r5 + r4
            return r5
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b0(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4, @org.jetbrains.annotations.NotNull kotlin.text.j r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.a(r3, r4, r1)
            if (r3 != r4) goto L15
            java.lang.String r2 = ""
            return r2
        L15:
            boolean r0 = r5.e()
            if (r0 == 0) goto L1e
            int[] r0 = kotlin.text.i.d
            goto L20
        L1e:
            int[] r0 = kotlin.text.i.c
        L20:
            kotlin.text.j$b r5 = r5.c()
            boolean r1 = r5.j()
            if (r1 == 0) goto L2f
            java.lang.String r2 = k0(r2, r3, r4, r5, r0)
            return r2
        L2f:
            java.lang.String r2 = n0(r2, r3, r4, r5, r0)
            return r2
    }

    private static final int c(long r3) {
            r0 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto Lf
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto Lf
            int r4 = (int) r3
            return r4
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The resulting string length is too big: "
            r1.append(r2)
            long r3 = kotlin.d1.k(r3)
            java.lang.String r3 = kotlin.d1.l0(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c0(@org.jetbrains.annotations.NotNull byte[] r2, @org.jetbrains.annotations.NotNull kotlin.text.j r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = b0(r2, r0, r1, r3)
            return r2
    }

    private static final int d(java.lang.String r3, int r4, int r5) {
            char r0 = r3.charAt(r4)
            r1 = 13
            r2 = 10
            if (r0 != r1) goto L18
            int r0 = r4 + 1
            if (r0 >= r5) goto L17
            char r3 = r3.charAt(r0)
            if (r3 != r2) goto L17
            int r4 = r4 + 2
            return r4
        L17:
            return r0
        L18:
            char r5 = r3.charAt(r4)
            if (r5 != r2) goto L21
            int r4 = r4 + 1
            return r4
        L21:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a new line at index "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", but was "
            r0.append(r1)
            char r3 = r3.charAt(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
    }

    public static /* synthetic */ java.lang.String d0(byte r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            java.lang.String r0 = X(r0, r1)
            return r0
    }

    private static final void e(java.lang.String r2, int r3, int r4, int r5) {
            int r0 = r4 - r3
            r1 = 1
            if (r0 >= r1) goto Lb
            java.lang.String r5 = "at least"
            T(r2, r3, r4, r5, r1)
            return
        Lb:
            if (r0 <= r5) goto L12
            int r0 = r0 + r3
            int r0 = r0 - r5
            g(r2, r3, r0)
        L12:
            return
    }

    public static /* synthetic */ java.lang.String e0(int r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            java.lang.String r0 = Y(r0, r1)
            return r0
    }

    private static final void f(java.lang.String r5, int r6, int r7, java.lang.String r8, java.lang.String r9, boolean r10, int r11) {
            int r0 = r7 - r6
            int r1 = r8.length()
            int r0 = r0 - r1
            int r1 = r9.length()
            if (r0 > r1) goto L10
            U(r5, r6, r7, r8, r9)
        L10:
            int r0 = r8.length()
            r1 = 0
            if (r0 != 0) goto L18
            goto L3c
        L18:
            int r0 = r8.length()
            r2 = 0
        L1d:
            if (r2 >= r0) goto L37
            char r3 = r8.charAt(r2)
            int r4 = r6 + r2
            char r4 = r5.charAt(r4)
            boolean r3 = kotlin.text.d.J(r3, r4, r10)
            if (r3 != 0) goto L34
            java.lang.String r3 = "prefix"
            V(r5, r6, r7, r8, r3)
        L34:
            int r2 = r2 + 1
            goto L1d
        L37:
            int r8 = r8.length()
            int r6 = r6 + r8
        L3c:
            int r8 = r9.length()
            int r8 = r7 - r8
            int r0 = r9.length()
            if (r0 != 0) goto L49
            goto L67
        L49:
            int r0 = r9.length()
        L4d:
            if (r1 >= r0) goto L67
            char r2 = r9.charAt(r1)
            int r3 = r8 + r1
            char r3 = r5.charAt(r3)
            boolean r2 = kotlin.text.d.J(r2, r3, r10)
            if (r2 != 0) goto L64
            java.lang.String r2 = "suffix"
            V(r5, r8, r7, r9, r2)
        L64:
            int r1 = r1 + 1
            goto L4d
        L67:
            e(r5, r6, r8, r11)
            return
    }

    public static /* synthetic */ java.lang.String f0(long r0, kotlin.text.j r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlin.text.j$c r2 = kotlin.text.j.d
            kotlin.text.j r2 = r2.a()
        La:
            java.lang.String r0 = Z(r0, r2)
            return r0
    }

    private static final void g(java.lang.String r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto L35
            char r0 = r2.charAt(r3)
            r1 = 48
            if (r0 != r1) goto Ld
            int r3 = r3 + 1
            goto L0
        Ld:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected the hexadecimal digit '0' at index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", but was '"
            r0.append(r1)
            char r2 = r2.charAt(r3)
            r0.append(r2)
            java.lang.String r2 = "'.\nThe result won't fit the type being parsed."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2)
            throw r4
        L35:
            return
    }

    public static /* synthetic */ java.lang.String g0(short r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            java.lang.String r0 = a0(r0, r1)
            return r0
    }

    private static final int h(java.lang.String r2, int r3) {
            char r0 = r2.charAt(r3)
            int r1 = r0 >>> 8
            if (r1 != 0) goto Lf
            int[] r1 = kotlin.text.i.e
            r0 = r1[r0]
            if (r0 < 0) goto Lf
            return r0
        Lf:
            S(r2, r3)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
    }

    public static /* synthetic */ java.lang.String h0(byte[] r0, int r1, int r2, kotlin.text.j r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto La
            int r2 = r0.length
        La:
            r4 = r4 & 4
            if (r4 == 0) goto L14
            kotlin.text.j$c r3 = kotlin.text.j.d
            kotlin.text.j r3 = r3.a()
        L14:
            java.lang.String r0 = b0(r0, r1, r2, r3)
            return r0
    }

    private static final int i(byte[] r0, int r1, java.lang.String r2, java.lang.String r3, int[] r4, char[] r5, int r6) {
            int r2 = W(r2, r5, r6)
            int r0 = j(r0, r1, r4, r5, r2)
            int r0 = W(r3, r5, r0)
            return r0
    }

    public static /* synthetic */ java.lang.String i0(byte[] r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            java.lang.String r0 = c0(r0, r1)
            return r0
    }

    private static final int j(byte[] r0, int r1, int[] r2, char[] r3, int r4) {
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r2[r0]
            int r1 = r0 >> 8
            char r1 = (char) r1
            r3[r4] = r1
            int r1 = r4 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r3[r1] = r0
            int r4 = r4 + 2
            return r4
    }

    private static final java.lang.String j0(long r16, kotlin.text.j.d r18, java.lang.String r19, int r20) {
            r0 = r19
            r1 = r20 & 3
            if (r1 != 0) goto L7b
            int r1 = r20 >> 2
            int r2 = r18.d()
            int r3 = r2 - r1
            r4 = 0
            int r3 = kotlin.ranges.t.u(r3, r4)
            java.lang.String r5 = r18.f()
            java.lang.String r6 = r18.h()
            boolean r7 = r18.g()
            int r8 = r5.length()
            long r8 = (long) r8
            long r10 = (long) r3
            long r8 = r8 + r10
            long r10 = (long) r1
            long r8 = r8 + r10
            int r10 = r6.length()
            long r10 = (long) r10
            long r8 = r8 + r10
            int r8 = c(r8)
            char[] r9 = new char[r8]
            int r5 = W(r5, r9, r4)
            if (r3 <= 0) goto L43
            char r10 = r0.charAt(r4)
            int r3 = r3 + r5
            kotlin.collections.n.H1(r9, r10, r5, r3)
            r5 = r3
        L43:
            r3 = r20
            r10 = 0
        L46:
            r11 = 1
            if (r10 >= r1) goto L6a
            int r3 = r3 + (-4)
            long r12 = r16 >> r3
            r14 = 15
            long r12 = r12 & r14
            int r13 = (int) r12
            if (r7 == 0) goto L5b
            if (r13 != 0) goto L5b
            int r7 = r3 >> 2
            if (r7 < r2) goto L5b
            r7 = 1
            goto L5c
        L5b:
            r7 = 0
        L5c:
            if (r7 != 0) goto L67
            int r11 = r5 + 1
            char r12 = r0.charAt(r13)
            r9[r5] = r12
            r5 = r11
        L67:
            int r10 = r10 + 1
            goto L46
        L6a:
            int r0 = W(r6, r9, r5)
            if (r0 != r8) goto L75
            java.lang.String r0 = kotlin.text.g0.J1(r9)
            return r0
        L75:
            r1 = 0
            java.lang.String r0 = kotlin.text.g0.L1(r9, r4, r0, r11, r1)
            return r0
        L7b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            r0.<init>(r1)
            throw r0
    }

    private static final int k(int r4, int r5, int r6, int r7) {
            if (r4 <= 0) goto L13
            r0 = 2
            long r2 = (long) r6
            long r2 = r2 + r0
            long r6 = (long) r7
            long r2 = r2 + r6
            long r5 = (long) r5
            long r2 = r2 + r5
            long r0 = (long) r4
            long r0 = r0 * r2
            long r0 = r0 - r5
            int r4 = c(r0)
            return r4
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            r4.<init>(r5)
            throw r4
    }

    private static final java.lang.String k0(byte[] r1, int r2, int r3, kotlin.text.j.b r4, int[] r5) {
            boolean r0 = r4.k()
            if (r0 == 0) goto Lb
            java.lang.String r1 = m0(r1, r2, r3, r4, r5)
            return r1
        Lb:
            java.lang.String r1 = l0(r1, r2, r3, r4, r5)
            return r1
    }

    public static final int l(int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            if (r5 <= 0) goto L31
            int r0 = r5 + (-1)
            int r1 = r0 / r6
            int r2 = r6 + (-1)
            int r2 = r2 / r7
            int r3 = r5 % r6
            if (r3 != 0) goto Le
            goto Lf
        Le:
            r6 = r3
        Lf:
            int r6 = r6 + (-1)
            int r6 = r6 / r7
            int r2 = r2 * r1
            int r2 = r2 + r6
            int r0 = r0 - r1
            int r0 = r0 - r2
            long r6 = (long) r1
            long r1 = (long) r2
            long r3 = (long) r8
            long r1 = r1 * r3
            long r6 = r6 + r1
            long r0 = (long) r0
            long r8 = (long) r9
            long r0 = r0 * r8
            long r6 = r6 + r0
            long r8 = (long) r5
            long r0 = (long) r10
            r2 = 2
            long r0 = r0 + r2
            long r10 = (long) r11
            long r0 = r0 + r10
            long r8 = r8 * r0
            long r6 = r6 + r8
            int r5 = c(r6)
            return r5
        L31:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            r5.<init>(r6)
            throw r5
    }

    private static final java.lang.String l0(byte[] r7, int r8, int r9, kotlin.text.j.b r10, int[] r11) {
            java.lang.String r2 = r10.c()
            java.lang.String r3 = r10.e()
            java.lang.String r10 = r10.d()
            int r0 = r9 - r8
            int r1 = r10.length()
            int r4 = r2.length()
            int r5 = r3.length()
            int r0 = k(r0, r1, r4, r5)
            char[] r5 = new char[r0]
            r6 = 0
            r0 = r7
            r1 = r8
            r4 = r11
            int r7 = i(r0, r1, r2, r3, r4, r5, r6)
            int r8 = r1 + 1
            r1 = r8
        L2b:
            if (r1 >= r9) goto L38
            int r6 = W(r10, r5, r7)
            int r7 = i(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r1 + 1
            goto L2b
        L38:
            java.lang.String r7 = kotlin.text.g0.J1(r5)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final int[] m() {
            int[] r0 = kotlin.text.i.c
            return r0
    }

    private static final java.lang.String m0(byte[] r8, int r9, int r10, kotlin.text.j.b r11, int[] r12) {
            java.lang.String r0 = r11.d()
            int r0 = r0.length()
            r1 = 1
            if (r0 > r1) goto L56
            int r2 = r10 - r9
            r3 = 0
            if (r0 != 0) goto L29
            r0 = 2
            long r4 = (long) r2
            long r4 = r4 * r0
            int r11 = c(r4)
            char[] r11 = new char[r11]
        L1b:
            if (r9 >= r10) goto L24
            int r3 = j(r8, r9, r12, r11, r3)
            int r9 = r9 + 1
            goto L1b
        L24:
            java.lang.String r8 = kotlin.text.g0.J1(r11)
            return r8
        L29:
            r4 = 3
            long r6 = (long) r2
            long r6 = r6 * r4
            r4 = 1
            long r6 = r6 - r4
            int r0 = c(r6)
            char[] r0 = new char[r0]
            java.lang.String r11 = r11.d()
            char r11 = r11.charAt(r3)
            int r2 = j(r8, r9, r12, r0, r3)
            int r9 = r9 + r1
        L44:
            if (r9 >= r10) goto L51
            int r1 = r2 + 1
            r0[r2] = r11
            int r2 = j(r8, r9, r12, r0, r1)
            int r9 = r9 + 1
            goto L44
        L51:
            java.lang.String r8 = kotlin.text.g0.J1(r0)
            return r8
        L56:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Failed requirement."
            r8.<init>(r9)
            throw r8
    }

    private static final byte n(java.lang.String r1, int r2, int r3, kotlin.text.j r4) {
            r0 = 2
            int r1 = D(r1, r2, r3, r4, r0)
            byte r1 = (byte) r1
            return r1
    }

    private static final java.lang.String n0(byte[] r17, int r18, int r19, kotlin.text.j.b r20, int[] r21) {
            r0 = r19
            int r2 = r20.g()
            int r3 = r20.f()
            java.lang.String r8 = r20.c()
            java.lang.String r9 = r20.e()
            java.lang.String r11 = r20.d()
            java.lang.String r12 = r20.h()
            int r1 = r0 - r18
            int r4 = r12.length()
            int r5 = r11.length()
            int r6 = r8.length()
            int r7 = r9.length()
            int r1 = l(r1, r2, r3, r4, r5, r6, r7)
            r7 = r9
            char[] r9 = new char[r1]
            r13 = 0
            r5 = r18
            r4 = 0
            r6 = 0
            r10 = 0
        L39:
            if (r5 >= r0) goto L72
            if (r6 != r2) goto L47
            int r6 = r4 + 1
            r10 = 10
            r9[r4] = r10
            r4 = r6
            r14 = 0
        L45:
            r15 = 0
            goto L51
        L47:
            if (r10 != r3) goto L4f
            int r4 = W(r12, r9, r4)
            r14 = r6
            goto L45
        L4f:
            r14 = r6
            r15 = r10
        L51:
            if (r15 == 0) goto L57
            int r4 = W(r11, r9, r4)
        L57:
            r10 = r4
            r6 = r8
            r4 = r17
            r8 = r21
            int r10 = i(r4, r5, r6, r7, r8, r9, r10)
            int r4 = r15 + 1
            int r8 = r14 + 1
            int r5 = r5 + 1
            r16 = r10
            r10 = r4
            r4 = r16
            r16 = r8
            r8 = r6
            r6 = r16
            goto L39
        L72:
            if (r4 != r1) goto L79
            java.lang.String r0 = kotlin.text.g0.J1(r9)
            return r0
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final byte o(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.j r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte r2 = n(r2, r0, r1, r3)
            return r2
    }

    private static final long o0(long r3, long r5, int r7) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            goto L10
        Lb:
            long r0 = (long) r7
            long r3 = r3 + r0
            long r5 = r5 + r0
            long r3 = r3 / r5
            return r3
        L10:
            return r0
    }

    static /* synthetic */ byte p(java.lang.String r0, int r1, int r2, kotlin.text.j r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.j$c r3 = kotlin.text.j.d
            kotlin.text.j r3 = r3.a()
        L17:
            byte r0 = n(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte q(java.lang.String r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            byte r0 = o(r0, r1)
            return r0
    }

    private static final byte[] r(java.lang.String r2, int r3, int r4, kotlin.text.j r5) {
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length()
            r0.a(r3, r4, r1)
            if (r3 != r4) goto Lf
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
        Lf:
            kotlin.text.j$b r5 = r5.c()
            boolean r0 = r5.j()
            if (r0 == 0) goto L20
            byte[] r0 = v(r2, r3, r4, r5)
            if (r0 == 0) goto L20
            return r0
        L20:
            byte[] r2 = y(r2, r3, r4, r5)
            return r2
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final byte[] s(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.j r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte[] r2 = r(r2, r0, r1, r3)
            return r2
    }

    static /* synthetic */ byte[] t(java.lang.String r0, int r1, int r2, kotlin.text.j r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.j$c r3 = kotlin.text.j.d
            kotlin.text.j r3 = r3.a()
        L17:
            byte[] r0 = r(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte[] u(java.lang.String r0, kotlin.text.j r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.j$c r1 = kotlin.text.j.d
            kotlin.text.j r1 = r1.a()
        La:
            byte[] r0 = s(r0, r1)
            return r0
    }

    private static final byte[] v(java.lang.String r1, int r2, int r3, kotlin.text.j.b r4) {
            boolean r0 = r4.k()
            if (r0 == 0) goto Lb
            byte[] r1 = x(r1, r2, r3, r4)
            return r1
        Lb:
            byte[] r1 = w(r1, r2, r3, r4)
            return r1
    }

    private static final byte[] w(java.lang.String r12, int r13, int r14, kotlin.text.j.b r15) {
            java.lang.String r0 = r15.c()
            java.lang.String r1 = r15.e()
            java.lang.String r2 = r15.d()
            int r3 = r2.length()
            int r4 = r0.length()
            long r4 = (long) r4
            r6 = 2
            long r4 = r4 + r6
            int r6 = r1.length()
            long r6 = (long) r6
            long r4 = r4 + r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r3 = r14 - r13
            long r8 = (long) r3
            long r10 = r8 + r6
            long r10 = r10 / r4
            int r3 = (int) r10
            long r10 = (long) r3
            long r10 = r10 * r4
            long r10 = r10 - r6
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 == 0) goto L31
            r12 = 0
            return r12
        L31:
            boolean r15 = r15.i()
            byte[] r4 = new byte[r3]
            int r5 = r0.length()
            r6 = 0
            if (r5 != 0) goto L3f
            goto L63
        L3f:
            int r5 = r0.length()
            r7 = 0
        L44:
            if (r7 >= r5) goto L5e
            char r8 = r0.charAt(r7)
            int r9 = r13 + r7
            char r9 = r12.charAt(r9)
            boolean r8 = kotlin.text.d.J(r8, r9, r15)
            if (r8 != 0) goto L5b
            java.lang.String r8 = "byte prefix"
            V(r12, r13, r14, r0, r8)
        L5b:
            int r7 = r7 + 1
            goto L44
        L5e:
            int r5 = r0.length()
            int r13 = r13 + r5
        L63:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            int r3 = r3 + (-1)
            r2 = 0
        L78:
            if (r2 >= r3) goto Lb0
            byte r5 = O(r12, r13)
            r4[r2] = r5
            int r13 = r13 + 2
            int r5 = r0.length()
            if (r5 != 0) goto L89
            goto Lad
        L89:
            int r5 = r0.length()
            r7 = 0
        L8e:
            if (r7 >= r5) goto La8
            char r8 = r0.charAt(r7)
            int r9 = r13 + r7
            char r9 = r12.charAt(r9)
            boolean r8 = kotlin.text.d.J(r8, r9, r15)
            if (r8 != 0) goto La5
            java.lang.String r8 = "byte suffix + byte separator + byte prefix"
            V(r12, r13, r14, r0, r8)
        La5:
            int r7 = r7 + 1
            goto L8e
        La8:
            int r5 = r0.length()
            int r13 = r13 + r5
        Lad:
            int r2 = r2 + 1
            goto L78
        Lb0:
            byte r0 = O(r12, r13)
            r4[r3] = r0
            int r13 = r13 + 2
            int r0 = r1.length()
            if (r0 != 0) goto Lbf
            return r4
        Lbf:
            int r0 = r1.length()
        Lc3:
            if (r6 >= r0) goto Ldd
            char r2 = r1.charAt(r6)
            int r3 = r13 + r6
            char r3 = r12.charAt(r3)
            boolean r2 = kotlin.text.d.J(r2, r3, r15)
            if (r2 != 0) goto Lda
            java.lang.String r2 = "byte suffix"
            V(r12, r13, r14, r1, r2)
        Lda:
            int r6 = r6 + 1
            goto Lc3
        Ldd:
            return r4
    }

    private static final byte[] x(java.lang.String r11, int r12, int r13, kotlin.text.j.b r14) {
            java.lang.String r0 = r14.d()
            int r0 = r0.length()
            r1 = 1
            if (r0 > r1) goto L87
            int r12 = r13 - r12
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 != 0) goto L28
            r13 = r12 & 1
            if (r13 == 0) goto L17
            return r2
        L17:
            int r12 = r12 >> r1
            byte[] r13 = new byte[r12]
            r14 = 0
        L1b:
            if (r4 >= r12) goto L27
            byte r0 = O(r11, r14)
            r13[r4] = r0
            int r14 = r14 + r3
            int r4 = r4 + 1
            goto L1b
        L27:
            return r13
        L28:
            int r0 = r12 % 3
            if (r0 == r3) goto L2d
            return r2
        L2d:
            int r12 = r12 / 3
            int r12 = r12 + r1
            byte[] r0 = new byte[r12]
            java.lang.String r2 = r14.d()
            char r2 = r2.charAt(r4)
            byte r5 = O(r11, r4)
            r0[r4] = r5
        L40:
            if (r1 >= r12) goto L86
            char r5 = r11.charAt(r3)
            if (r5 == r2) goto L79
            java.lang.String r5 = r14.d()
            boolean r6 = r14.i()
            int r7 = r5.length()
            if (r7 != 0) goto L57
            goto L79
        L57:
            int r7 = r5.length()
            r8 = 0
        L5c:
            if (r8 >= r7) goto L76
            char r9 = r5.charAt(r8)
            int r10 = r3 + r8
            char r10 = r11.charAt(r10)
            boolean r9 = kotlin.text.d.J(r9, r10, r6)
            if (r9 != 0) goto L73
            java.lang.String r9 = "byte separator"
            V(r11, r3, r13, r5, r9)
        L73:
            int r8 = r8 + 1
            goto L5c
        L76:
            r5.length()
        L79:
            int r5 = r3 + 1
            byte r5 = O(r11, r5)
            r0[r1] = r5
            int r3 = r3 + 3
            int r1 = r1 + 1
            goto L40
        L86:
            return r0
        L87:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed requirement."
            r11.<init>(r12)
            throw r11
    }

    private static final byte[] y(java.lang.String r18, int r19, int r20, kotlin.text.j.b r21) {
            r0 = r18
            r1 = r20
            int r3 = r21.g()
            int r4 = r21.f()
            java.lang.String r9 = r21.c()
            java.lang.String r10 = r21.e()
            java.lang.String r11 = r21.d()
            java.lang.String r12 = r21.h()
            boolean r13 = r21.i()
            int r2 = r1 - r19
            int r5 = r12.length()
            int r6 = r11.length()
            int r7 = r9.length()
            int r8 = r10.length()
            int r2 = R(r2, r3, r4, r5, r6, r7, r8)
            byte[] r5 = new byte[r2]
            r7 = r19
            r8 = 0
            r14 = 0
            r15 = 0
        L3d:
            if (r7 >= r1) goto L142
            if (r14 != r3) goto L4d
            int r7 = d(r0, r7, r1)
            r16 = r3
            r17 = r4
            r14 = 0
        L4a:
            r15 = 0
            goto Lc0
        L4d:
            if (r15 != r4) goto L8b
            int r15 = r12.length()
            if (r15 != 0) goto L5a
            r16 = r3
            r17 = r4
            goto L4a
        L5a:
            int r15 = r12.length()
            r6 = 0
        L5f:
            if (r6 >= r15) goto L81
            r16 = r3
            char r3 = r12.charAt(r6)
            r17 = r4
            int r4 = r7 + r6
            char r4 = r0.charAt(r4)
            boolean r3 = kotlin.text.d.J(r3, r4, r13)
            if (r3 != 0) goto L7a
            java.lang.String r3 = "group separator"
            V(r0, r7, r1, r12, r3)
        L7a:
            int r6 = r6 + 1
            r3 = r16
            r4 = r17
            goto L5f
        L81:
            r16 = r3
            r17 = r4
            int r3 = r12.length()
            int r7 = r7 + r3
            goto L4a
        L8b:
            r16 = r3
            r17 = r4
            if (r15 == 0) goto Lc0
            int r3 = r11.length()
            if (r3 != 0) goto L98
            goto Lc0
        L98:
            int r3 = r11.length()
            r4 = 0
        L9d:
            if (r4 >= r3) goto Lbb
            char r6 = r11.charAt(r4)
            r19 = r3
            int r3 = r7 + r4
            char r3 = r0.charAt(r3)
            boolean r3 = kotlin.text.d.J(r6, r3, r13)
            if (r3 != 0) goto Lb6
            java.lang.String r3 = "byte separator"
            V(r0, r7, r1, r11, r3)
        Lb6:
            int r4 = r4 + 1
            r3 = r19
            goto L9d
        Lbb:
            int r3 = r11.length()
            int r7 = r7 + r3
        Lc0:
            int r14 = r14 + 1
            int r15 = r15 + 1
            int r3 = r9.length()
            if (r3 != 0) goto Lcb
            goto Lf3
        Lcb:
            int r3 = r9.length()
            r4 = 0
        Ld0:
            if (r4 >= r3) goto Lee
            char r6 = r9.charAt(r4)
            r19 = r3
            int r3 = r7 + r4
            char r3 = r0.charAt(r3)
            boolean r3 = kotlin.text.d.J(r6, r3, r13)
            if (r3 != 0) goto Le9
            java.lang.String r3 = "byte prefix"
            V(r0, r7, r1, r9, r3)
        Le9:
            int r4 = r4 + 1
            r3 = r19
            goto Ld0
        Lee:
            int r3 = r9.length()
            int r7 = r7 + r3
        Lf3:
            int r3 = r1 + (-2)
            if (r3 >= r7) goto Lfd
            java.lang.String r3 = "exactly"
            r4 = 2
            T(r0, r7, r1, r3, r4)
        Lfd:
            int r3 = r8 + 1
            byte r4 = O(r0, r7)
            r5[r8] = r4
            int r7 = r7 + 2
            int r4 = r10.length()
            if (r4 != 0) goto L110
            r19 = r3
            goto L13a
        L110:
            int r4 = r10.length()
            r6 = 0
        L115:
            if (r6 >= r4) goto L133
            char r8 = r10.charAt(r6)
            r19 = r3
            int r3 = r7 + r6
            char r3 = r0.charAt(r3)
            boolean r3 = kotlin.text.d.J(r8, r3, r13)
            if (r3 != 0) goto L12e
            java.lang.String r3 = "byte suffix"
            V(r0, r7, r1, r10, r3)
        L12e:
            int r6 = r6 + 1
            r3 = r19
            goto L115
        L133:
            r19 = r3
            int r3 = r10.length()
            int r7 = r7 + r3
        L13a:
            r8 = r19
            r3 = r16
            r4 = r17
            goto L3d
        L142:
            if (r8 != r2) goto L145
            return r5
        L145:
            byte[] r0 = java.util.Arrays.copyOf(r5, r8)
            java.lang.String r1 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public static final int z(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3, @org.jetbrains.annotations.NotNull kotlin.text.j r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 8
            int r1 = D(r1, r2, r3, r4, r0)
            return r1
    }
}
