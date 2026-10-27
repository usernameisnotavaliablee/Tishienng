package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String A(char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String B(char r1, @org.jetbrains.annotations.NotNull java.util.Locale r2) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r1, r0)
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final char C(char r0) {
            char r0 = java.lang.Character.toUpperCase(r0)
            return r0
    }

    @kotlin.PublishedApi
    public static int a(int r4) {
            r0 = 2
            if (r0 > r4) goto L8
            r1 = 37
            if (r4 >= r1) goto L8
            return r4
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "radix "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " was not in valid range "
            r2.append(r4)
            kotlin.ranges.m r4 = new kotlin.ranges.m
            r3 = 36
            r4.<init>(r0, r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public static final int b(char r0, int r1) {
            int r0 = java.lang.Character.digit(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharCategory c(char r1) {
            kotlin.text.CharCategory$a r0 = kotlin.text.CharCategory.Companion
            int r1 = java.lang.Character.getType(r1)
            kotlin.text.CharCategory r1 = r0.a(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharDirectionality d(char r1) {
            kotlin.text.CharDirectionality$a r0 = kotlin.text.CharDirectionality.Companion
            byte r1 = java.lang.Character.getDirectionality(r1)
            kotlin.text.CharDirectionality r1 = r0.b(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean e(char r0) {
            boolean r0 = java.lang.Character.isDefined(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean f(char r0) {
            boolean r0 = java.lang.Character.isDigit(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean g(char r0) {
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean h(char r0) {
            boolean r0 = java.lang.Character.isISOControl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean i(char r0) {
            boolean r0 = java.lang.Character.isIdentifierIgnorable(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean j(char r0) {
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean k(char r0) {
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean l(char r0) {
            boolean r0 = java.lang.Character.isLetter(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean m(char r0) {
            boolean r0 = java.lang.Character.isLetterOrDigit(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean n(char r0) {
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean o(char r0) {
            boolean r0 = java.lang.Character.isLowerCase(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean p(char r0) {
            boolean r0 = java.lang.Character.isTitleCase(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean q(char r0) {
            boolean r0 = java.lang.Character.isUpperCase(r0)
            return r0
    }

    public static boolean r(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String s(char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r1, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String t(char r1, @org.jetbrains.annotations.NotNull java.util.Locale r2) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r1, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final char u(char r0) {
            char r0 = java.lang.Character.toLowerCase(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String v(char r3, @org.jetbrains.annotations.NotNull java.util.Locale r4) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r4 = B(r3, r4)
            int r0 = r4.length()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r2 = 1
            if (r0 <= r2) goto L46
            r0 = 329(0x149, float:4.61E-43)
            if (r3 != r0) goto L17
            goto L5e
        L17:
            r3 = 0
            char r3 = r4.charAt(r3)
            kotlin.jvm.internal.g0.n(r4, r1)
            java.lang.String r4 = r4.substring(r2)
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            kotlin.jvm.internal.g0.n(r4, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L46:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            kotlin.jvm.internal.g0.n(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r0 != 0) goto L5f
        L5e:
            return r4
        L5f:
            char r3 = java.lang.Character.toTitleCase(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final char w(char r0) {
            char r0 = java.lang.Character.toTitleCase(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final char x(char r0) {
            char r0 = java.lang.Character.toLowerCase(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final char y(char r0) {
            char r0 = java.lang.Character.toTitleCase(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    @kotlin.internal.InlineOnly
    private static final char z(char r0) {
            char r0 = java.lang.Character.toUpperCase(r0)
            return r0
    }
}
