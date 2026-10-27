package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1260#2,14:109\n1584#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class m0 extends kotlin.text.l0 {
    public m0() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.SortedSet<java.lang.Character> A6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.text.s0.F9(r1, r0)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final char r6(java.lang.CharSequence r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            char r1 = r1.charAt(r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character s6(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Character r1 = kotlin.text.s0.q8(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character t6(java.lang.CharSequence r7, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length()
            if (r0 != 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            char r0 = r7.charAt(r0)
            int r1 = kotlin.text.l0.y3(r7)
            if (r1 != 0) goto L22
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
        L22:
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            char r4 = r7.charAt(r3)
            java.lang.Character r5 = java.lang.Character.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 >= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character u6(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Character r1 = kotlin.text.s0.s8(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character v6(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Character r1 = kotlin.text.s0.E8(r1)
            return r1
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character w6(java.lang.CharSequence r7, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7.length()
            if (r0 != 0) goto L12
            r7 = 0
            return r7
        L12:
            r0 = 0
            char r0 = r7.charAt(r0)
            int r1 = kotlin.text.l0.y3(r7)
            if (r1 != 0) goto L22
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
        L22:
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r8.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            if (r3 > r1) goto L4a
        L2f:
            char r4 = r7.charAt(r3)
            java.lang.Character r5 = java.lang.Character.valueOf(r4)
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L45
            r0 = r4
            r2 = r5
        L45:
            if (r3 == r1) goto L4a
            int r3 = r3 + 1
            goto L2f
        L4a:
            java.lang.Character r7 = java.lang.Character.valueOf(r0)
            return r7
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character x6(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Character r1 = kotlin.text.s0.G8(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal y6(java.lang.CharSequence r3, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigDecimal> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 0
        L16:
            int r2 = r3.length()
            if (r1 >= r2) goto L36
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            java.math.BigDecimal r0 = r0.add(r2)
            java.lang.String r2 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            int r1 = r1 + 1
            goto L16
        L36:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger z6(java.lang.CharSequence r3, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigInteger> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 0
        L16:
            int r2 = r3.length()
            if (r1 >= r2) goto L36
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.math.BigInteger r0 = r0.add(r2)
            java.lang.String r2 = "add(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            int r1 = r1 + 1
            goto L16
        L36:
            return r0
    }
}
