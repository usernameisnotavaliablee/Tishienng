package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/UnboundLocalDateTime\n*L\n1#1,864:1\n1#2:865\n479#3,28:866\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n*L\n689#1:866,28\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v {
    private static final long a = -3217862419201L;
    private static final long b = 3093527980800L;
    private static final long c = -31557014167219200L;
    private static final long d = 31556889864403199L;
    private static final int e = 146097;
    private static final int f = 719528;
    private static final int g = 3600;
    private static final int h = 60;
    private static final int i = 24;
    private static final int j = 86400;
    public static final int k = 1000000000;
    private static final int l = 1000000;
    private static final int m = 1000;

    @org.jetbrains.annotations.NotNull
    private static final int[] n = null;

    @org.jetbrains.annotations.NotNull
    private static final int[] o = null;

    @org.jetbrains.annotations.NotNull
    private static final int[] p = null;

    @org.jetbrains.annotations.NotNull
    private static final int[] q = null;

    static {
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0020: FILL_ARRAY_DATA , data: [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000} // fill-array
            kotlin.time.v.n = r1
            int[] r0 = new int[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [1, 2, 4, 5, 7, 8, 10, 11, 13, 14} // fill-array
            kotlin.time.v.o = r0
            r0 = 3
            r1 = 6
            int[] r0 = new int[]{r0, r1}
            kotlin.time.v.p = r0
            int[] r0 = new int[r1]
            r0 = {x0050: FILL_ARRAY_DATA , data: [1, 2, 4, 5, 7, 8} // fill-array
            kotlin.time.v.q = r0
            return
    }

    private static final int A(java.lang.CharSequence r1, int r2) {
            char r0 = r1.charAt(r2)
            int r0 = r0 + (-48)
            int r0 = r0 * 10
            int r2 = r2 + 1
            char r1 = r1.charAt(r2)
            int r1 = r1 + (-48)
            int r0 = r0 + r1
            return r0
    }

    private static final long B(long r7, long r9, kotlin.jvm.functions.Function0 r11) {
            long r0 = r7 + r9
            long r2 = r7 ^ r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L19
            long r7 = r7 ^ r9
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 >= 0) goto L10
            goto L19
        L10:
            r11.invoke()
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        L19:
            return r0
    }

    private static final long C(long r7, long r9, kotlin.jvm.functions.Function0 r11) {
            r0 = 1
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r7
        L7:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            return r9
        Lc:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L3d
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L3d
        L17:
            long r0 = r7 * r9
            long r2 = r0 / r9
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L34
            r2 = -1
            r4 = -9223372036854775808
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L2b
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 == 0) goto L34
        L2b:
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 != 0) goto L33
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto L34
        L33:
            return r0
        L34:
            r11.invoke()
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        L3d:
            return r0
    }

    private static final java.lang.String D(java.lang.CharSequence r2, int r3) {
            int r0 = r2.length()
            if (r0 > r3) goto Lb
            java.lang.String r2 = r2.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.CharSequence r2 = r2.subSequence(r1, r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = "..."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static /* synthetic */ boolean a(char r0) {
            boolean r0 = x(r0)
            return r0
    }

    public static /* synthetic */ boolean b(char r0) {
            boolean r0 = t(r0)
            return r0
    }

    public static /* synthetic */ boolean c(char r0) {
            boolean r0 = w(r0)
            return r0
    }

    public static /* synthetic */ boolean d(char r0) {
            boolean r0 = u(r0)
            return r0
    }

    public static /* synthetic */ boolean e(char r0) {
            boolean r0 = v(r0)
            return r0
    }

    public static /* synthetic */ boolean f(char r0) {
            boolean r0 = y(r0)
            return r0
    }

    public static final /* synthetic */ java.lang.String g(kotlin.time.Instant r0) {
            java.lang.String r0 = j(r0)
            return r0
    }

    public static final /* synthetic */ kotlin.time.w h(java.lang.CharSequence r0) {
            kotlin.time.w r0 = r(r0)
            return r0
    }

    public static final /* synthetic */ java.lang.String i(java.lang.CharSequence r0, int r1) {
            java.lang.String r0 = D(r0, r1)
            return r0
    }

    @kotlin.time.ExperimentalTime
    private static final java.lang.String j(kotlin.time.Instant r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.time.g0$a r1 = kotlin.time.g0.h
            kotlin.time.g0 r7 = r1.a(r7)
            int r1 = r7.g()
            int r2 = java.lang.Math.abs(r1)
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 0
            r5 = 1
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r2 >= r3) goto L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "deleteCharAt(...)"
            if (r1 < 0) goto L30
            int r1 = r1 + r6
            r2.append(r1)
            java.lang.StringBuilder r1 = r2.deleteCharAt(r4)
            kotlin.jvm.internal.g0.o(r1, r3)
            goto L3b
        L30:
            int r1 = r1 - r6
            r2.append(r1)
            java.lang.StringBuilder r1 = r2.deleteCharAt(r5)
            kotlin.jvm.internal.g0.o(r1, r3)
        L3b:
            r0.append(r2)
            goto L49
        L3f:
            if (r1 < r6) goto L46
            r2 = 43
            r0.append(r2)
        L46:
            r0.append(r1)
        L49:
            r1 = 45
            r0.append(r1)
            int r2 = r7.d()
            k(r0, r0, r2)
            r0.append(r1)
            int r1 = r7.a()
            k(r0, r0, r1)
            r1 = 84
            r0.append(r1)
            int r1 = r7.b()
            k(r0, r0, r1)
            r1 = 58
            r0.append(r1)
            int r2 = r7.c()
            k(r0, r0, r2)
            r0.append(r1)
            int r1 = r7.f()
            k(r0, r0, r1)
            int r1 = r7.e()
            if (r1 == 0) goto Lbf
            r1 = 46
            r0.append(r1)
        L8c:
            int r1 = r7.e()
            int[] r2 = kotlin.time.v.n
            int r3 = r4 + 1
            r6 = r2[r3]
            int r1 = r1 % r6
            if (r1 != 0) goto L9b
            r4 = r3
            goto L8c
        L9b:
            int r1 = r4 % 3
            int r4 = r4 - r1
            int r7 = r7.e()
            r1 = r2[r4]
            int r7 = r7 / r1
            int r1 = 9 - r4
            r1 = r2[r1]
            int r7 = r7 + r1
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r7, r1)
            java.lang.String r7 = r7.substring(r5)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r1)
            r0.append(r7)
        Lbf:
            r7 = 90
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    private static final void k(java.lang.Appendable r1, java.lang.StringBuilder r2, int r3) {
            r0 = 10
            if (r3 >= r0) goto L9
            r0 = 48
            r1.append(r0)
        L9:
            r2.append(r3)
            return
    }

    private static final boolean l(kotlin.time.Instant r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.time.Instant$a r0 = kotlin.time.Instant.Companion
            kotlin.time.Instant r0 = r0.e()
            int r1 = r1.compareTo2(r0)
            if (r1 < 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.internal.InlineOnly
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void m(kotlin.time.Instant r0) {
            return
    }

    private static final boolean n(kotlin.time.Instant r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.time.Instant$a r0 = kotlin.time.Instant.Companion
            kotlin.time.Instant r0 = r0.f()
            int r1 = r1.compareTo2(r0)
            if (r1 > 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.internal.InlineOnly
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void o(kotlin.time.Instant r0) {
            return
    }

    public static final boolean p(int r1) {
            r0 = r1 & 3
            if (r0 != 0) goto Le
            int r0 = r1 % 100
            if (r0 != 0) goto Lc
            int r1 = r1 % 400
            if (r1 != 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static final int q(int r1, boolean r2) {
            r0 = 2
            if (r1 == r0) goto L17
            r2 = 4
            if (r1 == r2) goto L14
            r2 = 6
            if (r1 == r2) goto L14
            r2 = 9
            if (r1 == r2) goto L14
            r2 = 11
            if (r1 == r2) goto L14
            r1 = 31
            return r1
        L14:
            r1 = 30
            return r1
        L17:
            if (r2 == 0) goto L1c
            r1 = 29
            return r1
        L1c:
            r1 = 28
            return r1
    }

    @kotlin.time.ExperimentalTime
    private static final kotlin.time.w r(java.lang.CharSequence r25) {
            r0 = r25
            int r1 = r0.length()
            if (r1 != 0) goto L10
            kotlin.time.w$a r1 = new kotlin.time.w$a
            java.lang.String r2 = "An empty string is not a valid Instant"
            r1.<init>(r2, r0)
            return r1
        L10:
            r1 = 0
            char r2 = r0.charAt(r1)
            r3 = 32
            r4 = 43
            r5 = 45
            r6 = 1
            if (r2 == r4) goto L24
            if (r2 == r5) goto L24
            r2 = 32
            r7 = 0
            goto L25
        L24:
            r7 = 1
        L25:
            r8 = r7
            r9 = 0
        L27:
            int r10 = r0.length()
            r11 = 58
            r12 = 48
            if (r8 >= r10) goto L44
            char r10 = r0.charAt(r8)
            if (r12 > r10) goto L44
            if (r10 >= r11) goto L44
            int r9 = r9 * 10
            char r10 = r0.charAt(r8)
            int r10 = r10 - r12
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L27
        L44:
            int r10 = r8 - r7
            java.lang.String r13 = " digits"
            r14 = 10
            if (r10 <= r14) goto L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected at most 10 digits for the year number, got "
            r1.append(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L65:
            if (r10 != r14) goto L8c
            char r7 = r0.charAt(r7)
            r15 = 50
            int r7 = kotlin.jvm.internal.g0.t(r7, r15)
            if (r7 < 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected at most 9 digits for the year number or year 1000000000, got "
            r1.append(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L8c:
            r7 = 4
            if (r10 >= r7) goto La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The year number must be padded to 4 digits, got "
            r1.append(r2)
            r1.append(r10)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        La8:
            if (r2 != r4) goto Lb3
            if (r10 != r7) goto Lb3
            java.lang.String r1 = "The '+' sign at the start is only valid for year numbers longer than 4 digits"
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        Lb3:
            if (r2 != r3) goto Lbe
            if (r10 == r7) goto Lbe
            java.lang.String r1 = "A '+' or '-' sign is required for year numbers longer than 4 digits"
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        Lbe:
            if (r2 != r5) goto Lc1
            int r9 = -r9
        Lc1:
            r16 = r9
            int r2 = r0.length()
            int r3 = r8 + 16
            if (r2 >= r3) goto Ld2
            java.lang.String r1 = "The input string is too short"
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        Ld2:
            kotlin.time.p r2 = new kotlin.time.p
            r2.<init>()
            java.lang.String r9 = "'-'"
            kotlin.time.w$a r2 = s(r0, r9, r8, r2)
            if (r2 == 0) goto Le0
            return r2
        Le0:
            int r2 = r8 + 3
            kotlin.time.q r10 = new kotlin.time.q
            r10.<init>()
            kotlin.time.w$a r2 = s(r0, r9, r2, r10)
            if (r2 == 0) goto Lee
            return r2
        Lee:
            int r2 = r8 + 6
            kotlin.time.r r9 = new kotlin.time.r
            r9.<init>()
            java.lang.String r10 = "'T' or 't'"
            kotlin.time.w$a r2 = s(r0, r10, r2, r9)
            if (r2 == 0) goto Lfe
            return r2
        Lfe:
            int r2 = r8 + 9
            kotlin.time.s r9 = new kotlin.time.s
            r9.<init>()
            java.lang.String r10 = "':'"
            kotlin.time.w$a r2 = s(r0, r10, r2, r9)
            if (r2 == 0) goto L10e
            return r2
        L10e:
            int r2 = r8 + 12
            kotlin.time.t r9 = new kotlin.time.t
            r9.<init>()
            kotlin.time.w$a r2 = s(r0, r10, r2, r9)
            if (r2 == 0) goto L11c
            return r2
        L11c:
            int[] r2 = kotlin.time.v.o
            int r9 = r2.length
            r10 = 0
        L120:
            if (r10 >= r9) goto L138
            r15 = r2[r10]
            int r15 = r15 + r8
            kotlin.time.u r1 = new kotlin.time.u
            r1.<init>()
            java.lang.String r7 = "an ASCII digit"
            kotlin.time.w$a r1 = s(r0, r7, r15, r1)
            if (r1 == 0) goto L133
            return r1
        L133:
            int r10 = r10 + 1
            r1 = 0
            r7 = 4
            goto L120
        L138:
            int r1 = r8 + 1
            int r1 = A(r0, r1)
            int r2 = r8 + 4
            int r2 = A(r0, r2)
            int r7 = r8 + 7
            int r7 = A(r0, r7)
            int r9 = r8 + 10
            int r9 = A(r0, r9)
            int r10 = r8 + 13
            int r10 = A(r0, r10)
            int r8 = r8 + 15
            char r15 = r0.charAt(r8)
            r5 = 46
            r4 = 9
            if (r15 != r5) goto L1a7
            r8 = r3
            r5 = 0
        L164:
            int r15 = r0.length()
            if (r8 >= r15) goto L17d
            char r15 = r0.charAt(r8)
            if (r12 > r15) goto L17d
            if (r15 >= r11) goto L17d
            int r5 = r5 * 10
            char r15 = r0.charAt(r8)
            int r15 = r15 - r12
            int r5 = r5 + r15
            int r8 = r8 + 1
            goto L164
        L17d:
            int r3 = r8 - r3
            if (r6 > r3) goto L18e
            if (r3 >= r14) goto L18e
            int[] r13 = kotlin.time.v.n
            int r3 = 9 - r3
            r3 = r13[r3]
            int r5 = r5 * r3
            r22 = r5
            goto L1a9
        L18e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "1..9 digits are supported for the fraction of the second, got "
            r1.append(r2)
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L1a7:
            r22 = 0
        L1a9:
            int r3 = r0.length()
            if (r8 < r3) goto L1b6
            java.lang.String r1 = "The UTC offset at the end of the string is missing"
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L1b6:
            char r3 = r0.charAt(r8)
            r5 = 39
            java.lang.String r13 = ", got '"
            r6 = 43
            r23 = 1
            if (r3 == r6) goto L212
            r6 = 45
            if (r3 == r6) goto L212
            r4 = 90
            if (r3 == r4) goto L1ef
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 == r4) goto L1ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected the UTC offset at position "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L1ef:
            int r3 = r0.length()
            int r8 = r8 + 1
            if (r3 != r8) goto L1fc
            r3 = 0
            r5 = 3
        L1f9:
            r4 = 1
            goto L388
        L1fc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Extra text after the instant at position "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L212:
            int r6 = r0.length()
            int r6 = r6 - r8
            if (r6 <= r4) goto L246
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The UTC offset string \""
            r1.append(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r3 = 16
            java.lang.String r2 = D(r2, r3)
            r1.append(r2)
            java.lang.String r2 = "\" is too long"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L246:
            int r4 = r6 % 3
            if (r4 == 0) goto L271
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid UTC offset string \""
            r1.append(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            r2 = 34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L271:
            int[] r4 = kotlin.time.v.p
            int r14 = r4.length
            r15 = 0
        L275:
            if (r15 >= r14) goto L2b4
            r21 = r4[r15]
            int r12 = r8 + r21
            int r5 = r0.length()
            if (r12 < r5) goto L282
            goto L2b4
        L282:
            char r5 = r0.charAt(r12)
            if (r5 == r11) goto L2ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected ':' at index "
            r1.append(r2)
            r1.append(r12)
            r1.append(r13)
            char r2 = r0.charAt(r12)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L2ad:
            int r15 = r15 + 1
            r5 = 39
            r12 = 48
            goto L275
        L2b4:
            int[] r4 = kotlin.time.v.q
            int r5 = r4.length
            r12 = 0
        L2b8:
            if (r12 >= r5) goto L2fa
            r14 = r4[r12]
            int r14 = r14 + r8
            int r15 = r0.length()
            if (r14 < r15) goto L2c4
            goto L2fa
        L2c4:
            char r15 = r0.charAt(r14)
            r24 = r4
            r4 = 48
            if (r4 > r15) goto L2d5
            if (r15 >= r11) goto L2d5
            int r12 = r12 + 1
            r4 = r24
            goto L2b8
        L2d5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected an ASCII digit at index "
            r1.append(r2)
            r1.append(r14)
            r1.append(r13)
            char r2 = r0.charAt(r14)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L2fa:
            int r4 = r8 + 1
            int r4 = A(r0, r4)
            r5 = 3
            if (r6 <= r5) goto L30a
            int r11 = r8 + 4
            int r11 = A(r0, r11)
            goto L30b
        L30a:
            r11 = 0
        L30b:
            r12 = 6
            if (r6 <= r12) goto L317
            int r6 = r8 + 7
            int r6 = A(r0, r6)
        L314:
            r12 = 59
            goto L319
        L317:
            r6 = 0
            goto L314
        L319:
            if (r11 <= r12) goto L331
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected offset-minute-of-hour in 0..59, got "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L331:
            if (r6 <= r12) goto L349
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected offset-second-of-minute in 0..59, got "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L349:
            r12 = 17
            if (r4 <= r12) goto L377
            r12 = 18
            if (r4 != r12) goto L355
            if (r11 != 0) goto L355
            if (r6 == 0) goto L377
        L355:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected an offset in -18:00..+18:00, got "
            r1.append(r2)
            int r2 = r0.length()
            java.lang.CharSequence r2 = r0.subSequence(r8, r2)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L377:
            int r4 = r4 * 3600
            int r11 = r11 * 60
            int r4 = r4 + r11
            int r4 = r4 + r6
            r6 = 45
            if (r3 != r6) goto L383
            r3 = -1
            goto L384
        L383:
            r3 = 1
        L384:
            int r3 = r3 * r4
            goto L1f9
        L388:
            if (r4 > r1) goto L4b0
            r6 = 13
            if (r1 >= r6) goto L4b0
            if (r4 > r2) goto L488
            boolean r4 = p(r16)
            int r4 = q(r1, r4)
            if (r2 > r4) goto L488
            r4 = 23
            if (r7 <= r4) goto L3b4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected hour in 0..23, got "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L3b4:
            r12 = 59
            if (r9 <= r12) goto L3ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected minute-of-hour in 0..59, got "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L3ce:
            if (r10 <= r12) goto L3e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected second-of-minute in 0..59, got "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L3e6:
            kotlin.time.g0 r15 = new kotlin.time.g0
            r17 = r1
            r18 = r2
            r19 = r7
            r20 = r9
            r21 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            int r0 = r15.g()
            long r0 = (long) r0
            r2 = 365(0x16d, float:5.11E-43)
            long r6 = (long) r2
            long r6 = r6 * r0
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L41e
            long r4 = (long) r5
            long r4 = r4 + r0
            r2 = 4
            long r8 = (long) r2
            long r4 = r4 / r8
            r2 = 99
            long r8 = (long) r2
            long r8 = r8 + r0
            r2 = 100
            long r10 = (long) r2
            long r8 = r8 / r10
            long r4 = r4 - r8
            r2 = 399(0x18f, float:5.59E-43)
            long r8 = (long) r2
            long r0 = r0 + r8
            r2 = 400(0x190, float:5.6E-43)
            long r8 = (long) r2
            long r0 = r0 / r8
            long r4 = r4 + r0
            long r6 = r6 + r4
            goto L42e
        L41e:
            r2 = -4
            long r4 = (long) r2
            long r4 = r0 / r4
            r2 = -100
            long r8 = (long) r2
            long r8 = r0 / r8
            long r4 = r4 - r8
            r2 = -400(0xfffffffffffffe70, float:NaN)
            long r8 = (long) r2
            long r0 = r0 / r8
            long r4 = r4 + r0
            long r6 = r6 - r4
        L42e:
            int r0 = r15.d()
            int r0 = r0 * 367
            int r0 = r0 + (-362)
            int r0 = r0 / 12
            long r0 = (long) r0
            long r6 = r6 + r0
            int r0 = r15.a()
            r23 = 1
            int r0 = r0 + (-1)
            long r0 = (long) r0
            long r6 = r6 + r0
            int r0 = r15.d()
            r1 = 2
            if (r0 <= r1) goto L45d
            r0 = -1
            long r0 = r0 + r6
            int r2 = r15.g()
            boolean r2 = p(r2)
            if (r2 != 0) goto L45c
            r0 = -2
            long r6 = r6 + r0
            goto L45d
        L45c:
            r6 = r0
        L45d:
            r0 = 719528(0xafaa8, float:1.008273E-39)
            long r0 = (long) r0
            long r6 = r6 - r0
            int r0 = r15.b()
            int r0 = r0 * 3600
            int r1 = r15.c()
            int r1 = r1 * 60
            int r0 = r0 + r1
            int r1 = r15.f()
            int r0 = r0 + r1
            r1 = 86400(0x15180, float:1.21072E-40)
            long r1 = (long) r1
            long r6 = r6 * r1
            long r0 = (long) r0
            long r6 = r6 + r0
            long r0 = (long) r3
            long r6 = r6 - r0
            int r0 = r15.e()
            kotlin.time.w$b r1 = new kotlin.time.w$b
            r1.<init>(r6, r0)
            return r1
        L488:
            r9 = r16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected a valid day-of-month for month "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " of year "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = ", got "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
        L4b0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a month number in 1..12, got "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            kotlin.time.w$a r0 = z(r0, r1)
            return r0
    }

    private static final kotlin.time.w.a s(java.lang.CharSequence r2, java.lang.String r3, int r4, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r5) {
            char r0 = r2.charAt(r4)
            java.lang.Character r1 = java.lang.Character.valueOf(r0)
            java.lang.Object r5 = r5.invoke(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Expected "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r3 = ", but got '"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "' at position "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            kotlin.time.w$a r2 = z(r2, r3)
            return r2
    }

    private static final boolean t(char r1) {
            r0 = 45
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static final boolean u(char r2) {
            r0 = 48
            r1 = 0
            if (r0 > r2) goto Lb
            r0 = 58
            if (r2 >= r0) goto Lb
            r2 = 1
            return r2
        Lb:
            return r1
    }

    private static final boolean v(char r1) {
            r0 = 45
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static final boolean w(char r1) {
            r0 = 84
            if (r1 == r0) goto Lb
            r0 = 116(0x74, float:1.63E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    private static final boolean x(char r1) {
            r0 = 58
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static final boolean y(char r1) {
            r0 = 58
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static final kotlin.time.w.a z(java.lang.CharSequence r2, java.lang.String r3) {
            kotlin.time.w$a r0 = new kotlin.time.w$a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " when parsing an Instant from \""
            r1.append(r3)
            r3 = 64
            java.lang.String r3 = D(r2, r3)
            r1.append(r3)
            r3 = 34
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r2)
            return r0
    }
}
