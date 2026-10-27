package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,885:1\n1179#2,2:886\n1#3:888\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:886,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class g0 extends kotlin.text.f0 {
    public g0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String A1(char[] r1, int r2, int r3) {
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String A2(java.lang.String r0, char r1, char r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = y2(r0, r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String B1(int[] r1, int r2, int r3) {
            java.lang.String r0 = "codePoints"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String B2(java.lang.String r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = z2(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String C1(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "getDefault(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r2 = D1(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> C2(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.regex.Pattern r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.text.l0.f5(r3)
            if (r3 != 0) goto L10
            r3 = -1
        L10:
            java.lang.String[] r1 = r2.split(r1, r3)
            java.lang.String r2 = "split(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.util.List r1 = kotlin.collections.n.t(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String D1(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.util.Locale r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6.length()
            if (r0 <= 0) goto L57
            r0 = 0
            char r1 = r6.charAt(r0)
            boolean r2 = java.lang.Character.isLowerCase(r1)
            if (r2 == 0) goto L57
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r3 = java.lang.Character.toTitleCase(r1)
            char r1 = java.lang.Character.toUpperCase(r1)
            java.lang.String r4 = "substring(...)"
            r5 = 1
            if (r3 == r1) goto L31
            r2.append(r3)
            goto L49
        L31:
            java.lang.String r0 = r6.substring(r0, r5)
            kotlin.jvm.internal.g0.o(r0, r4)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.lang.String r7 = r0.toUpperCase(r7)
            java.lang.String r0 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            r2.append(r7)
        L49:
            java.lang.String r6 = r6.substring(r5)
            kotlin.jvm.internal.g0.o(r6, r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        L57:
            return r6
    }

    public static /* synthetic */ java.util.List D2(java.lang.CharSequence r0, java.util.regex.Pattern r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.util.List r0 = C2(r0, r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final int E1(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.codePointAt(r2)
            return r1
    }

    public static boolean E2(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r9 != 0) goto L11
            boolean r6 = r6.startsWith(r7, r8)
            return r6
        L11:
            r3 = 0
            int r4 = r7.length()
            r0 = r6
            r2 = r7
            r1 = r8
            r5 = r9
            boolean r6 = q2(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @kotlin.internal.InlineOnly
    private static final int F1(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.codePointBefore(r2)
            return r1
    }

    public static boolean F2(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r8 != 0) goto L11
            boolean r6 = r6.startsWith(r7)
            return r6
        L11:
            r3 = 0
            int r4 = r7.length()
            r1 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = q2(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @kotlin.internal.InlineOnly
    private static final int G1(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.codePointCount(r2, r3)
            return r1
    }

    public static /* synthetic */ boolean G2(java.lang.String r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            boolean r0 = E2(r0, r1, r2, r3)
            return r0
    }

    public static final int H1(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto L11
            int r1 = r1.compareToIgnoreCase(r2)
            return r1
        L11:
            int r1 = r1.compareTo(r2)
            return r1
    }

    public static /* synthetic */ boolean H2(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = F2(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int I1(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = H1(r0, r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String I2(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static java.lang.String J1(@org.jetbrains.annotations.NotNull char[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String J2(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static java.lang.String K1(@org.jetbrains.annotations.NotNull char[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.a(r3, r4, r1)
            java.lang.String r0 = new java.lang.String
            int r4 = r4 - r3
            r0.<init>(r2, r3, r4)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final byte[] K2(java.lang.String r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String L1(char[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = K1(r0, r1, r2)
            return r0
    }

    static /* synthetic */ byte[] L2(java.lang.String r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final boolean M1(@org.jetbrains.annotations.Nullable java.lang.CharSequence r1, @org.jetbrains.annotations.Nullable java.lang.CharSequence r2) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.contentEquals(r2)
            return r1
        Ld:
            boolean r1 = kotlin.text.l0.n3(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final char[] M2(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            char[] r1 = r1.toCharArray()
            java.lang.String r0 = "toCharArray(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final boolean N1(@org.jetbrains.annotations.Nullable java.lang.CharSequence r0, @org.jetbrains.annotations.Nullable java.lang.CharSequence r1, boolean r2) {
            if (r2 == 0) goto L7
            boolean r0 = kotlin.text.l0.m3(r0, r1)
            return r0
        L7:
            boolean r0 = M1(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final char[] N2(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length()
            r0.a(r3, r4, r1)
            int r0 = r4 - r3
            char[] r0 = new char[r0]
            r1 = 0
            r2.getChars(r3, r4, r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean O1(java.lang.String r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charSequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = r1.contentEquals(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final char[] O2(java.lang.String r1, char[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.getChars(r4, r5, r2, r3)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final boolean P1(java.lang.String r1, java.lang.StringBuffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "stringBuilder"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = r1.contentEquals(r2)
            return r1
    }

    public static /* synthetic */ char[] P2(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            char[] r0 = N2(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String Q1(@org.jetbrains.annotations.NotNull java.lang.String r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length()
            if (r0 <= 0) goto L4d
            r0 = 0
            char r1 = r6.charAt(r0)
            boolean r1 = java.lang.Character.isLowerCase(r1)
            if (r1 != 0) goto L4d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            java.lang.String r0 = r6.substring(r0, r2)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r5 = "getDefault(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r0, r5)
            java.lang.String r0 = r0.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r0, r4)
            r1.append(r0)
            java.lang.String r6 = r6.substring(r2)
            kotlin.jvm.internal.g0.o(r6, r3)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
        L4d:
            return r6
    }

    static /* synthetic */ char[] Q2(java.lang.String r1, char[] r2, int r3, int r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = 0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = 0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L13
            int r5 = r1.length()
        L13:
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r6)
            java.lang.String r6 = "destination"
            kotlin.jvm.internal.g0.p(r2, r6)
            r1.getChars(r4, r5, r2, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String R1(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.util.Locale r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length()
            if (r0 <= 0) goto L49
            r0 = 0
            char r1 = r5.charAt(r0)
            boolean r1 = java.lang.Character.isLowerCase(r1)
            if (r1 != 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            java.lang.String r0 = r5.substring(r0, r2)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r0, r4)
            java.lang.String r6 = r0.toLowerCase(r6)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            r1.append(r6)
            java.lang.String r5 = r5.substring(r2)
            kotlin.jvm.internal.g0.o(r5, r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
        L49:
            return r5
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String R2(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static java.lang.String S1(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.e.b
            r0.<init>(r2, r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String S2(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String T1(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.a(r3, r4, r1)
            if (r5 != 0) goto L16
            java.lang.String r5 = new java.lang.String
            int r4 = r4 - r3
            java.nio.charset.Charset r0 = kotlin.text.e.b
            r5.<init>(r2, r3, r4, r0)
            return r5
        L16:
            java.nio.charset.Charset r5 = kotlin.text.e.b
            java.nio.charset.CharsetDecoder r5 = r5.newDecoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetDecoder r5 = r5.onMalformedInput(r0)
            java.nio.charset.CharsetDecoder r5 = r5.onUnmappableCharacter(r0)
            int r4 = r4 - r3
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2, r3, r4)
            java.nio.CharBuffer r2 = r5.decode(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.util.regex.Pattern T2(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            java.lang.String r2 = "compile(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String U1(byte[] r1, int r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = 0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            int r3 = r1.length
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = 0
        L10:
            java.lang.String r1 = T1(r1, r2, r3, r4)
            return r1
    }

    static /* synthetic */ java.util.regex.Pattern U2(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r1 = "compile(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static byte[] V1(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.charset.Charset r0 = kotlin.text.e.b
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String V2(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.toUpperCase()
            java.lang.String r0 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final byte[] W1(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length()
            r0.a(r3, r4, r1)
            if (r5 != 0) goto L2a
            java.lang.String r2 = r2.substring(r3, r4)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.nio.charset.Charset r3 = kotlin.text.e.b
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r2, r4)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
        L2a:
            java.nio.charset.Charset r5 = kotlin.text.e.b
            java.nio.charset.CharsetEncoder r5 = r5.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetEncoder r5 = r5.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r5 = r5.onUnmappableCharacter(r0)
            java.nio.CharBuffer r2 = java.nio.CharBuffer.wrap(r2, r3, r4)
            java.nio.ByteBuffer r2 = r5.encode(r2)
            boolean r3 = r2.hasArray()
            if (r3 == 0) goto L64
            int r3 = r2.arrayOffset()
            if (r3 != 0) goto L64
            int r3 = r2.remaining()
            byte[] r4 = r2.array()
            kotlin.jvm.internal.g0.m(r4)
            int r4 = r4.length
            if (r3 != r4) goto L64
            byte[] r2 = r2.array()
            kotlin.jvm.internal.g0.m(r2)
            return r2
        L64:
            int r3 = r2.remaining()
            byte[] r3 = new byte[r3]
            r2.get(r3)
            return r3
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String W2(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ byte[] X1(java.lang.String r1, int r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = 0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r3 = r1.length()
        Le:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            r4 = 0
        L13:
            byte[] r1 = W1(r1, r2, r3, r4)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String X2(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    public static boolean Y1(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r8, r0)
            if (r9 != 0) goto L11
            boolean r7 = r7.endsWith(r8)
            return r7
        L11:
            int r9 = r7.length()
            int r0 = r8.length()
            int r2 = r9 - r0
            int r5 = r8.length()
            r6 = 1
            r4 = 0
            r1 = r7
            r3 = r8
            boolean r7 = q2(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String Y2(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ boolean Z1(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = Y1(r0, r1, r2)
            return r0
    }

    public static boolean a2(@org.jetbrains.annotations.Nullable java.lang.String r0, @org.jetbrains.annotations.Nullable java.lang.String r1, boolean r2) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            if (r2 != 0) goto Lf
            boolean r0 = r0.equals(r1)
            return r0
        Lf:
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public static /* synthetic */ boolean b2(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = a2(r0, r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String c2(java.lang.String r1, java.util.Locale r2, java.lang.Object... r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r1 = java.lang.String.format(r2, r1, r3)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String d2(java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String e2(kotlin.jvm.internal.t0 r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = "format"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "args"
            kotlin.jvm.internal.g0.p(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.String f2(kotlin.jvm.internal.t0 r1, java.util.Locale r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = "format"
            kotlin.jvm.internal.g0.p(r3, r1)
            java.lang.String r1 = "args"
            kotlin.jvm.internal.g0.p(r4, r1)
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.Comparator<java.lang.String> g2(@org.jetbrains.annotations.NotNull kotlin.jvm.internal.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = "CASE_INSENSITIVE_ORDER"
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String h2(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = "intern(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String i2(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String j2(java.lang.String r1, java.util.Locale r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final int k2(java.lang.String r1, char r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final int l2(java.lang.String r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "str"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final int m2(java.lang.String r1, char r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final int n2(java.lang.String r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "str"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final int o2(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.offsetByCodePoints(r2, r3)
            return r1
    }

    public static final boolean p2(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, int r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, int r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L1b
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L1b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = (java.lang.String) r8
            boolean r6 = q2(r6, r7, r8, r9, r10, r11)
            return r6
        L1b:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r6 = kotlin.text.l0.t4(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean q2(@org.jetbrains.annotations.NotNull java.lang.String r6, int r7, @org.jetbrains.annotations.NotNull java.lang.String r8, int r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r8, r0)
            if (r11 != 0) goto L11
            boolean r6 = r6.regionMatches(r7, r8, r9, r10)
            return r6
        L11:
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ boolean r2(java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto Lc
            r11 = 0
            r5 = 0
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto Le
        Lc:
            r5 = r11
            goto L6
        Le:
            boolean r6 = p2(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ boolean s2(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto Lc
            r11 = 0
            r5 = 0
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto Le
        Lc:
            r5 = r11
            goto L6
        Le:
            boolean r6 = q2(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String t1(java.lang.StringBuffer r1) {
            java.lang.String r0 = "stringBuffer"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String t2(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 < 0) goto L4e
            java.lang.String r0 = ""
            if (r4 == 0) goto L4d
            r1 = 1
            if (r4 == r1) goto L48
            int r2 = r3.length()
            if (r2 == 0) goto L47
            if (r2 == r1) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r2 = r3.length()
            int r2 = r2 * r4
            r0.<init>(r2)
            if (r1 > r4) goto L2b
        L23:
            r0.append(r3)
            if (r1 == r4) goto L2b
            int r1 = r1 + 1
            goto L23
        L2b:
            java.lang.String r3 = r0.toString()
            kotlin.jvm.internal.g0.m(r3)
            return r3
        L33:
            r0 = 0
            char r3 = r3.charAt(r0)
            char[] r1 = new char[r4]
        L3a:
            if (r0 >= r4) goto L41
            r1[r0] = r3
            int r0 = r0 + 1
            goto L3a
        L41:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            return r3
        L47:
            return r0
        L48:
            java.lang.String r3 = r3.toString()
            return r3
        L4d:
            return r0
        L4e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Count 'n' must be non-negative, but was "
            r3.append(r0)
            r3.append(r4)
            r4 = 46
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String u1(java.lang.StringBuilder r1) {
            java.lang.String r0 = "stringBuilder"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String u2(@org.jetbrains.annotations.NotNull java.lang.String r4, char r5, char r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            if (r7 != 0) goto L11
            java.lang.String r4 = r4.replace(r5, r6)
            java.lang.String r5 = "replace(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            return r4
        L11:
            int r0 = r4.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 0
        L1b:
            int r2 = r4.length()
            if (r0 >= r2) goto L32
            char r2 = r4.charAt(r0)
            boolean r3 = kotlin.text.d.J(r2, r5, r7)
            if (r3 == 0) goto L2c
            r2 = r6
        L2c:
            r1.append(r2)
            int r0 = r0 + 1
            goto L1b
        L32:
            java.lang.String r4 = r1.toString()
            return r4
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String v1(byte[] r2) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.e.b
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String v2(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "newValue"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            int r1 = kotlin.text.l0.D3(r6, r7, r0, r9)
            if (r1 >= 0) goto L17
            return r6
        L17:
            int r2 = r7.length()
            r3 = 1
            int r3 = kotlin.ranges.t.u(r2, r3)
            int r4 = r6.length()
            int r4 = r4 - r2
            int r5 = r8.length()
            int r4 = r4 + r5
            if (r4 < 0) goto L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
        L31:
            r5.append(r6, r0, r1)
            r5.append(r8)
            int r0 = r1 + r2
            int r4 = r6.length()
            if (r1 >= r4) goto L46
            int r1 = r1 + r3
            int r1 = kotlin.text.l0.D3(r6, r7, r1, r9)
            if (r1 > 0) goto L31
        L46:
            int r7 = r6.length()
            r5.append(r6, r0, r7)
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            return r6
        L57:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String w1(byte[] r2, int r3, int r4) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.e.b
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String w2(java.lang.String r0, char r1, char r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = u2(r0, r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String x1(byte[] r1, int r2, int r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.lang.String x2(java.lang.String r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = v2(r0, r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String y1(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String y2(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, char r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r10
            int r7 = kotlin.text.l0.G3(r1, r2, r3, r4, r5, r6)
            if (r7 >= 0) goto L12
            return r1
        L12:
            int r8 = r7 + 1
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.CharSequence r7 = kotlin.text.l0.b5(r1, r7, r8, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String z1(char[] r1) {
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String z2(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "newValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r10
            int r7 = kotlin.text.l0.H3(r1, r2, r3, r4, r5, r6)
            if (r7 >= 0) goto L1c
            return r1
        L1c:
            int r8 = r2.length()
            int r8 = r8 + r7
            java.lang.CharSequence r7 = kotlin.text.l0.b5(r1, r7, r8, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }
}
