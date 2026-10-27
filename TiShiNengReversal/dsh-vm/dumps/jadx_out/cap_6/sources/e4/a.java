package e4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1#2:148\n295#3,2:149\n295#3,2:151\n774#3:153\n865#3,2:154\n1878#3,3:156\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:149,2\n57#1:151,2\n72#1:153\n72#1:154,2\n78#1:156,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length()
            if (r0 != 0) goto Lc
            return r3
        Lc:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 97
            if (r1 > r0) goto L35
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L35
            int r1 = r3.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            char r0 = java.lang.Character.toUpperCase(r0)
            r2.append(r0)
            r0 = 1
            int r1 = r3.length()
            r2.append(r3, r0, r1)
            java.lang.String r3 = r2.toString()
        L35:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto Lc
            return r2
        Lc:
            r0 = 0
            char r0 = r2.charAt(r0)
            r1 = 65
            if (r1 > r0) goto L36
            r1 = 91
            if (r0 >= r1) goto L36
            char r0 = java.lang.Character.toLowerCase(r0)
            r1 = 1
            java.lang.String r2 = r2.substring(r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L36:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(@org.jetbrains.annotations.NotNull java.lang.String r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length()
            if (r0 != 0) goto Lc
            return r6
        Lc:
            r0 = 0
            boolean r1 = d(r6, r0, r7)
            if (r1 != 0) goto L14
            return r6
        L14:
            int r1 = r6.length()
            java.lang.String r2 = "substring(...)"
            r3 = 1
            if (r1 == r3) goto L75
            boolean r1 = d(r6, r3, r7)
            if (r1 != 0) goto L24
            goto L75
        L24:
            kotlin.ranges.m r1 = kotlin.text.u.x3(r6)
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = d(r6, r5, r7)
            if (r5 != 0) goto L2c
            goto L45
        L44:
            r4 = 0
        L45:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L70
            int r1 = r4.intValue()
            int r1 = r1 - r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r6.substring(r0, r1)
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.String r7 = e(r0, r7)
            r3.append(r7)
            java.lang.String r6 = r6.substring(r1)
            kotlin.jvm.internal.g0.o(r6, r2)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            return r6
        L70:
            java.lang.String r6 = e(r6, r7)
            return r6
        L75:
            if (r7 == 0) goto L7c
            java.lang.String r6 = b(r6)
            return r6
        L7c:
            int r7 = r6.length()
            if (r7 <= 0) goto La0
            char r7 = r6.charAt(r0)
            char r7 = java.lang.Character.toLowerCase(r7)
            java.lang.String r6 = r6.substring(r3)
            kotlin.jvm.internal.g0.o(r6, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        La0:
            return r6
    }

    private static final boolean d(java.lang.String r0, int r1, boolean r2) {
            char r0 = r0.charAt(r1)
            if (r2 == 0) goto L12
            r1 = 65
            r2 = 0
            if (r1 > r0) goto L11
            r1 = 91
            if (r0 >= r1) goto L11
            r0 = 1
            return r0
        L11:
            return r2
        L12:
            boolean r0 = java.lang.Character.isUpperCase(r0)
            return r0
    }

    private static final java.lang.String e(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L7
            java.lang.String r0 = f(r0)
            return r0
        L7:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String f(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length()
            r0.<init>(r1)
            int r1 = r5.length()
            r2 = 0
        L13:
            if (r2 >= r1) goto L2b
            char r3 = r5.charAt(r2)
            r4 = 65
            if (r4 > r3) goto L25
            r4 = 91
            if (r3 >= r4) goto L25
            char r3 = java.lang.Character.toLowerCase(r3)
        L25:
            r0.append(r3)
            int r2 = r2 + 1
            goto L13
        L2b:
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            return r5
    }
}
