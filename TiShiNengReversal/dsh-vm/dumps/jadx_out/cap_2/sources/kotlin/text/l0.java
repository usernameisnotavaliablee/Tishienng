package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1580:1\n78#1,22:1581\n112#1,5:1603\n129#1,5:1608\n78#1,22:1613\n106#1:1635\n78#1,22:1636\n112#1,5:1658\n123#1:1663\n112#1,5:1664\n129#1,5:1669\n140#1:1674\n129#1,5:1675\n78#1,22:1680\n112#1,5:1702\n129#1,5:1707\n1069#2,2:1712\n13050#3,2:1714\n13050#3,2:1716\n295#4,2:1718\n295#4,2:1720\n1563#4:1723\n1634#4,3:1724\n1563#4:1727\n1634#4,3:1728\n1#5:1722\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n106#1:1581,22\n123#1:1603,5\n140#1:1608,5\n145#1:1613,22\n150#1:1635\n150#1:1636,22\n155#1:1658,5\n160#1:1663\n160#1:1664,5\n165#1:1669,5\n170#1:1674\n170#1:1675,5\n175#1:1680,22\n186#1:1702,5\n197#1:1707,5\n310#1:1712,2\n967#1:1714,2\n991#1:1716,2\n1030#1:1718,2\n1036#1:1720,2\n1401#1:1723\n1401#1:1724,3\n1427#1:1727\n1427#1:1728,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class l0 extends kotlin.text.g0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.collections.e0 {
        private int a;
        final /* synthetic */ java.lang.CharSequence b;

        a(java.lang.CharSequence r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.e0
        public char c() {
                r3 = this;
                java.lang.CharSequence r0 = r3.b
                int r1 = r3.a
                int r2 = r1 + 1
                r3.a = r2
                char r0 = r0.charAt(r1)
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.a
                java.lang.CharSequence r1 = r2.b
                int r1 = r1.length()
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,731:1\n1487#2:732\n*E\n"})
    public static final class b implements kotlin.sequences.m<java.lang.String> {
        final /* synthetic */ java.lang.CharSequence a;

        public b(java.lang.CharSequence r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<java.lang.String> iterator() {
                r2 = this;
                kotlin.text.l r0 = new kotlin.text.l
                java.lang.CharSequence r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    public l0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <C extends java.lang.CharSequence & R, R> R A3(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = M3(r1)
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence A4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = r3(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L21
            int r0 = r3.length()
            int r4 = r4.length()
            int r0 = r0 - r4
            java.lang.CharSequence r3 = r3.subSequence(r2, r0)
            return r3
        L21:
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r2, r4)
            return r3
    }

    public static /* synthetic */ boolean A5(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = x5(r0, r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <C extends java.lang.CharSequence & R, R> R B3(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.length()
            if (r0 != 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String B4(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = r3(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L25
            int r0 = r3.length()
            int r4 = r4.length()
            int r0 = r0 - r4
            java.lang.String r3 = r3.substring(r2, r0)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
        L25:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence B5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull kotlin.ranges.m r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Integer r0 = r2.r()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.q()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            return r1
    }

    public static final int C3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.indexOf(r3, r4)
            return r2
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = J3(r2, r0, r4, r5)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence C4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.CharSequence r1 = D4(r1, r2, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @kotlin.ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @kotlin.internal.InlineOnly
    private static final java.lang.CharSequence C5(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            return r1
    }

    public static final int D3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.NotNull java.lang.String r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r11 != 0) goto L18
            boolean r0 = r8 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.indexOf(r9, r10)
            return r8
        L18:
            int r3 = r8.length()
            r6 = 16
            r7 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            int r8 = F3(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence D4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r4.length()
            int r1 = r5.length()
            int r2 = r6.length()
            int r1 = r1 + r2
            r2 = 0
            if (r0 < r1) goto L3f
            r0 = 2
            r1 = 0
            boolean r3 = A5(r4, r5, r2, r0, r1)
            if (r3 == 0) goto L3f
            boolean r0 = r3(r4, r6, r2, r0, r1)
            if (r0 == 0) goto L3f
            int r5 = r5.length()
            int r0 = r4.length()
            int r6 = r6.length()
            int r0 = r0 - r6
            java.lang.CharSequence r4 = r4.subSequence(r5, r0)
            return r4
        L3f:
            int r5 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r2, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String D5(java.lang.CharSequence r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private static final int E3(java.lang.CharSequence r10, java.lang.CharSequence r11, int r12, int r13, boolean r14, boolean r15) {
            r0 = 0
            if (r15 != 0) goto L15
            kotlin.ranges.m r15 = new kotlin.ranges.m
            int r12 = kotlin.ranges.t.u(r12, r0)
            int r0 = r10.length()
            int r13 = kotlin.ranges.t.B(r13, r0)
            r15.<init>(r12, r13)
            goto L25
        L15:
            int r15 = y3(r10)
            int r12 = kotlin.ranges.t.B(r12, r15)
            int r13 = kotlin.ranges.t.u(r13, r0)
            kotlin.ranges.k r15 = kotlin.ranges.t.k0(r12, r13)
        L25:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L5a
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L5a
            int r12 = r15.e()
            int r13 = r15.f()
            int r15 = r15.g()
            if (r15 <= 0) goto L3d
            if (r12 <= r13) goto L41
        L3d:
            if (r15 >= 0) goto L86
            if (r13 > r12) goto L86
        L41:
            r3 = r12
        L42:
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0.length()
            r1 = 0
            r5 = r14
            boolean r12 = kotlin.text.g0.q2(r0, r1, r2, r3, r4, r5)
            if (r12 == 0) goto L55
            return r3
        L55:
            if (r3 == r13) goto L86
            int r3 = r3 + r15
            r14 = r5
            goto L42
        L5a:
            r5 = r14
            int r12 = r15.e()
            int r13 = r15.f()
            int r14 = r15.g()
            if (r14 <= 0) goto L6b
            if (r12 <= r13) goto L6f
        L6b:
            if (r14 >= 0) goto L86
            if (r13 > r12) goto L86
        L6f:
            r7 = r12
        L70:
            r9 = r5
            r5 = 0
            int r8 = r11.length()
            r6 = r10
            r4 = r11
            boolean r10 = t4(r4, r5, r6, r7, r8, r9)
            r5 = r9
            if (r10 == 0) goto L80
            return r7
        L80:
            if (r7 == r13) goto L86
            int r7 = r7 + r14
            r11 = r4
            r10 = r6
            goto L70
        L86:
            r10 = -1
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String E4(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = F4(r1, r2, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull kotlin.ranges.m r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Integer r0 = r2.r()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.q()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    static /* synthetic */ int F3(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
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
            int r6 = E3(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String F4(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r4.length()
            int r1 = r5.length()
            int r2 = r6.length()
            int r1 = r1 + r2
            if (r0 < r1) goto L43
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r3 = A5(r4, r5, r0, r1, r2)
            if (r3 == 0) goto L43
            boolean r0 = r3(r4, r6, r0, r1, r2)
            if (r0 == 0) goto L43
            int r5 = r5.length()
            int r0 = r4.length()
            int r6 = r6.length()
            int r0 = r0 - r6
            java.lang.String r4 = r4.substring(r5, r0)
            java.lang.String r5 = "substring(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
        L43:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String F5(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.ranges.m r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Integer r0 = r2.r()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.q()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r0, r2)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ int G3(java.lang.CharSequence r1, char r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = C3(r1, r2, r3, r4)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String G4(java.lang.CharSequence r1, kotlin.text.Regex r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = r2.replace(r1, r3)
            return r1
    }

    static /* synthetic */ java.lang.String G5(java.lang.CharSequence r0, int r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L8
            int r2 = r0.length()
        L8:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static /* synthetic */ int H3(java.lang.CharSequence r1, java.lang.String r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = D3(r1, r2, r3, r4)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String H4(java.lang.CharSequence r1, kotlin.text.Regex r2, kotlin.jvm.functions.Function1<? super kotlin.text.p, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = r2.replace(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String H5(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = G3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L18
            return r9
        L18:
            int r7 = r7 + 1
            int r8 = r1.length()
            java.lang.String r7 = r1.substring(r7, r8)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    public static final int I3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            kotlin.Pair r1 = t3(r1, r2, r3, r4, r0)
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r1.getFirst()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            return r1
        L1c:
            r1 = -1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String I4(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = G3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r10
        L1d:
            int r7 = r7 + 1
            int r8 = r1.length()
            java.lang.CharSequence r7 = b5(r1, r7, r8, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String I5(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = H3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r9
        L1d:
            int r8 = r2.length()
            int r7 = r7 + r8
            int r8 = r1.length()
            java.lang.String r7 = r1.substring(r7, r8)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    public static final int J3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull char[] r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r9 != 0) goto L1f
            int r0 = r7.length
            r1 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L1f
            char r7 = kotlin.collections.n.qt(r7)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L1f:
            r0 = 0
            int r8 = kotlin.ranges.t.u(r8, r0)
            int r1 = y3(r6)
            if (r8 > r1) goto L43
        L2a:
            char r2 = r6.charAt(r8)
            int r3 = r7.length
            r4 = 0
        L30:
            if (r4 >= r3) goto L3e
            char r5 = r7[r4]
            boolean r5 = kotlin.text.d.J(r5, r2, r9)
            if (r5 == 0) goto L3b
            return r8
        L3b:
            int r4 = r4 + 1
            goto L30
        L3e:
            if (r8 == r1) goto L43
            int r8 = r8 + 1
            goto L2a
        L43:
            r6 = -1
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String J4(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = H3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L22
            return r10
        L22:
            int r8 = r2.length()
            int r7 = r7 + r8
            int r8 = r1.length()
            java.lang.CharSequence r7 = b5(r1, r7, r8, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public static /* synthetic */ java.lang.String J5(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = H5(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int K3(java.lang.CharSequence r1, java.util.Collection r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = I3(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ java.lang.String K4(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = I4(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String K5(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = I5(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int L3(java.lang.CharSequence r1, char[] r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            int r1 = J3(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ java.lang.String L4(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = J4(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String L5(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = V3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L18
            return r9
        L18:
            int r7 = r7 + 1
            int r8 = r1.length()
            java.lang.String r7 = r1.substring(r7, r8)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    public static boolean M3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r3.length()
            if (r1 >= r2) goto L1b
            char r2 = r3.charAt(r1)
            boolean r2 = kotlin.text.c.r(r2)
            if (r2 != 0) goto L18
            return r0
        L18:
            int r1 = r1 + 1
            goto L7
        L1b:
            r3 = 1
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String M4(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = V3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r10
        L1d:
            int r7 = r7 + 1
            int r8 = r1.length()
            java.lang.CharSequence r7 = b5(r1, r7, r8, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String M5(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = W3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r9
        L1d:
            int r8 = r2.length()
            int r7 = r7 + r8
            int r8 = r1.length()
            java.lang.String r7 = r1.substring(r7, r8)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    @kotlin.internal.InlineOnly
    private static final boolean N3(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.length()
            if (r1 != 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String N4(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = W3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L22
            return r10
        L22:
            int r8 = r2.length()
            int r7 = r7 + r8
            int r8 = r1.length()
            java.lang.CharSequence r7 = b5(r1, r7, r8, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public static /* synthetic */ java.lang.String N5(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = L5(r0, r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean O3(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = M3(r1)
            r1 = r1 ^ 1
            return r1
    }

    public static /* synthetic */ java.lang.String O4(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = M4(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String O5(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = M5(r0, r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final boolean P3(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.length()
            if (r1 <= 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static /* synthetic */ java.lang.String P4(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = N4(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String P5(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = G3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L18
            return r9
        L18:
            r8 = 0
            java.lang.String r7 = r1.substring(r8, r7)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    @kotlin.internal.InlineOnly
    private static final boolean Q3(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            boolean r0 = M3(r0)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String Q4(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = G3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r10
        L1d:
            r8 = 0
            java.lang.CharSequence r7 = b5(r1, r8, r7, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String Q5(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = H3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r9
        L1d:
            r8 = 0
            java.lang.String r7 = r1.substring(r8, r7)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    @kotlin.internal.InlineOnly
    private static final boolean R3(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String R4(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = H3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L22
            return r10
        L22:
            r8 = 0
            java.lang.CharSequence r7 = b5(r1, r8, r7, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public static /* synthetic */ java.lang.String R5(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = P5(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.e0 S3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.text.l0$a r0 = new kotlin.text.l0$a
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ java.lang.String S4(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = Q4(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String S5(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = Q5(r0, r1, r2)
            return r0
    }

    public static final int T3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.lastIndexOf(r3, r4)
            return r2
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = Y3(r2, r0, r4, r5)
            return r2
    }

    public static /* synthetic */ java.lang.String T4(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = R4(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String T5(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = V3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L18
            return r9
        L18:
            r8 = 0
            java.lang.String r7 = r1.substring(r8, r7)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    public static final int U3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r9 != 0) goto L18
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.lastIndexOf(r7, r8)
            return r6
        L18:
            r3 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = E3(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String U4(@org.jetbrains.annotations.NotNull java.lang.String r7, char r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = V3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r10
        L1d:
            r8 = 0
            java.lang.CharSequence r7 = b5(r1, r8, r7, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String U5(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = W3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L1d
            return r9
        L1d:
            r8 = 0
            java.lang.String r7 = r1.substring(r8, r7)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    public static /* synthetic */ int V3(java.lang.CharSequence r0, char r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = y3(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = T3(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String V4(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r7 = W3(r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r7 != r8) goto L22
            return r10
        L22:
            r8 = 0
            java.lang.CharSequence r7 = b5(r1, r8, r7, r9)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public static /* synthetic */ java.lang.String V5(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = T5(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int W3(java.lang.CharSequence r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = y3(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = U3(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String W4(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = U4(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String W5(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = U5(r0, r1, r2)
            return r0
    }

    public static final int X3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            kotlin.Pair r1 = t3(r1, r2, r3, r4, r0)
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r1.getFirst()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            return r1
        L1c:
            r1 = -1
            return r1
    }

    public static /* synthetic */ java.lang.String X4(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = V4(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final boolean X5(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto Lf
            r3 = 1
            return r3
        Lf:
            java.lang.String r0 = "false"
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto L19
            r3 = 0
            return r3
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The string doesn't represent a boolean value: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final int Y3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull char[] r5, int r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r7 != 0) goto L1f
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L1f
            char r5 = kotlin.collections.n.qt(r5)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L1f:
            int r0 = y3(r4)
            int r6 = kotlin.ranges.t.B(r6, r0)
        L27:
            r0 = -1
            if (r0 >= r6) goto L41
            char r0 = r4.charAt(r6)
            int r1 = r5.length
            r2 = 0
        L30:
            if (r2 >= r1) goto L3e
            char r3 = r5[r2]
            boolean r3 = kotlin.text.d.J(r3, r0, r7)
            if (r3 == 0) goto L3b
            return r6
        L3b:
            int r2 = r2 + 1
            goto L30
        L3e:
            int r6 = r6 + (-1)
            goto L27
        L41:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String Y4(java.lang.CharSequence r1, kotlin.text.Regex r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = r2.replaceFirst(r1, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Boolean Y5(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 == 0) goto L10
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L10:
            java.lang.String r0 = "false"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 == 0) goto L1b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static /* synthetic */ kotlin.Pair Z2(char[] r0, boolean r1, java.lang.CharSequence r2, int r3) {
            kotlin.Pair r0 = r4(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int Z3(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = y3(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = X3(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "replaceFirstCharWithChar")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.lang.String Z4(java.lang.String r1, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Character> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L3c
            r0 = 0
            char r0 = r1.charAt(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r2.invoke(r0)
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r0 = 1
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L3c:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.CharSequence Z5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        Ld:
            if (r2 > r0) goto L2b
            if (r3 != 0) goto L13
            r4 = r2
            goto L14
        L13:
            r4 = r0
        L14:
            char r4 = r5.charAt(r4)
            boolean r4 = kotlin.text.c.r(r4)
            if (r3 != 0) goto L25
            if (r4 != 0) goto L22
            r3 = 1
            goto Ld
        L22:
            int r2 = r2 + 1
            goto Ld
        L25:
            if (r4 != 0) goto L28
            goto L2b
        L28:
            int r0 = r0 + (-1)
            goto Ld
        L2b:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    public static /* synthetic */ java.lang.String a3(java.lang.CharSequence r0, kotlin.ranges.m r1) {
            java.lang.String r0 = t5(r0, r1)
            return r0
    }

    public static /* synthetic */ int a4(java.lang.CharSequence r0, char[] r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = y3(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = Y3(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "replaceFirstCharWithCharSequence")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.lang.String a5(java.lang.String r2, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.length()
            if (r0 <= 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r1 = r2.charAt(r1)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r3 = r3.invoke(r1)
            r0.append(r3)
            r3 = 1
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L36:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence a6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L12:
            if (r2 > r0) goto L3a
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r3 != 0) goto L34
            if (r4 != 0) goto L31
            r3 = 1
            goto L12
        L31:
            int r2 = r2 + 1
            goto L12
        L34:
            if (r4 != 0) goto L37
            goto L3a
        L37:
            int r0 = r0 + (-1)
            goto L12
        L3a:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    public static /* synthetic */ kotlin.Pair b3(java.util.List r0, boolean r1, java.lang.CharSequence r2, int r3) {
            kotlin.Pair r0 = s4(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.lang.String> b4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.text.l0$b r0 = new kotlin.text.l0$b
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence b5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, int r3, int r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r4 < r3) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r0.append(r2, r1, r3)
            java.lang.String r3 = "append(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            r0.append(r5)
            int r5 = r2.length()
            r0.append(r2, r4, r5)
            kotlin.jvm.internal.g0.o(r0, r3)
            return r0
        L28:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "End index ("
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = ") is less than start index ("
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ")."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence b6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull char... r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L12:
            if (r2 > r0) goto L30
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            boolean r4 = kotlin.collections.n.w8(r6, r4)
            if (r3 != 0) goto L2a
            if (r4 != 0) goto L27
            r3 = 1
            goto L12
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            if (r4 != 0) goto L2d
            goto L30
        L2d:
            int r0 = r0 + (-1)
            goto L12
        L30:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    public static /* synthetic */ java.lang.String c3(java.lang.CharSequence r0, kotlin.ranges.m r1) {
            java.lang.String r0 = u5(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.List<java.lang.String> c4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = b4(r1)
            java.util.List r1 = kotlin.sequences.p.I3(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence c5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull kotlin.ranges.m r2, @org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Integer r0 = r2.r()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.q()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = b5(r1, r0, r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String c6(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = Z5(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String d3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length()
            int r1 = r6.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = 0
        L18:
            if (r2 >= r0) goto L2b
            char r3 = r5.charAt(r2)
            char r4 = r6.charAt(r2)
            boolean r3 = kotlin.text.d.J(r3, r4, r7)
            if (r3 == 0) goto L2b
            int r2 = r2 + 1
            goto L18
        L2b:
            int r7 = r2 + (-1)
            boolean r0 = z3(r5, r7)
            if (r0 != 0) goto L39
            boolean r6 = z3(r6, r7)
            if (r6 == 0) goto L3b
        L39:
            int r2 = r2 + (-1)
        L3b:
            java.lang.CharSequence r5 = r5.subSequence(r1, r2)
            java.lang.String r5 = r5.toString()
            return r5
    }

    @kotlin.internal.InlineOnly
    private static final boolean d4(java.lang.CharSequence r1, kotlin.text.Regex r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = r2.matches(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String d5(java.lang.String r1, int r2, int r3, java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.CharSequence r1 = b5(r1, r2, r3, r4)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String d6(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L12:
            if (r2 > r0) goto L3a
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r3 != 0) goto L34
            if (r4 != 0) goto L31
            r3 = 1
            goto L12
        L31:
            int r2 = r2 + 1
            goto L12
        L34:
            if (r4 != 0) goto L37
            goto L3a
        L37:
            int r0 = r0 + (-1)
            goto L12
        L3a:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public static /* synthetic */ java.lang.String e3(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = d3(r0, r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String e4(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String e5(java.lang.String r1, kotlin.ranges.m r2, java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.CharSequence r1 = c5(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String e6(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull char... r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L12:
            if (r2 > r0) goto L30
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            boolean r4 = kotlin.collections.n.w8(r6, r4)
            if (r3 != 0) goto L2a
            if (r4 != 0) goto L27
            r3 = 1
            goto L12
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            if (r4 != 0) goto L2d
            goto L30
        L2d:
            int r0 = r0 + (-1)
            goto L12
        L30:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String f3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6.length()
            int r1 = r7.length()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        L17:
            if (r3 >= r2) goto L32
            int r4 = r0 - r3
            int r4 = r4 + (-1)
            char r4 = r6.charAt(r4)
            int r5 = r1 - r3
            int r5 = r5 + (-1)
            char r5 = r7.charAt(r5)
            boolean r4 = kotlin.text.d.J(r4, r5, r8)
            if (r4 == 0) goto L32
            int r3 = r3 + 1
            goto L17
        L32:
            int r8 = r0 - r3
            int r8 = r8 + (-1)
            boolean r8 = z3(r6, r8)
            if (r8 != 0) goto L45
            int r1 = r1 - r3
            int r1 = r1 + (-1)
            boolean r7 = z3(r7, r1)
            if (r7 == 0) goto L47
        L45:
            int r3 = r3 + (-1)
        L47:
            int r7 = r0 - r3
            java.lang.CharSequence r6 = r6.subSequence(r7, r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence f4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 < 0) goto L30
            int r0 = r1.length()
            if (r2 > r0) goto L17
            r2 = 0
            int r3 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            return r1
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            int r1 = r1.length()
            int r2 = r2 - r1
            r1 = 1
            if (r1 > r2) goto L2f
        L27:
            r0.append(r3)
            if (r1 == r2) goto L2f
            int r1 = r1 + 1
            goto L27
        L2f:
            return r0
        L30:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Desired length "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " is less than zero."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final void f5(int r2) {
            if (r2 < 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Limit must be non-negative, but was "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence f6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L26
        Ld:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = kotlin.text.c.r(r2)
            if (r2 != 0) goto L21
            int r0 = r0 + 1
            r1 = 0
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            return r3
        L21:
            if (r1 >= 0) goto L24
            goto L26
        L24:
            r0 = r1
            goto Ld
        L26:
            java.lang.String r3 = ""
            return r3
    }

    public static /* synthetic */ java.lang.String g3(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = f3(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String g4(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = f4(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.util.List<java.lang.String> g5(java.lang.CharSequence r1, kotlin.text.Regex r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r1 = r2.split(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence g6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L35
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L30
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            return r3
        L30:
            if (r1 >= 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L12
        L35:
            java.lang.String r3 = ""
            return r3
    }

    public static final boolean h3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, char r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            int r7 = G3(r1, r2, r3, r4, r5, r6)
            if (r7 < 0) goto L13
            r7 = 1
            return r7
        L13:
            r7 = 0
            return r7
    }

    public static /* synthetic */ java.lang.CharSequence h4(java.lang.CharSequence r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.CharSequence r0 = f4(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> h5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull char[] r8, boolean r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            char r8 = r8[r0]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.util.List r7 = j5(r7, r8, r9, r10)
            return r7
        L1a:
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            kotlin.sequences.m r7 = p4(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Iterable r7 = kotlin.sequences.p.l0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.f0.d0(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L38:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L4c
            java.lang.Object r9 = r7.next()
            kotlin.ranges.m r9 = (kotlin.ranges.m) r9
            java.lang.String r9 = E5(r0, r9)
            r8.add(r9)
            goto L38
        L4c:
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence h6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2b
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = kotlin.collections.n.w8(r4, r2)
            if (r2 != 0) goto L26
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            return r3
        L26:
            if (r1 >= 0) goto L29
            goto L2b
        L29:
            r0 = r1
            goto L12
        L2b:
            java.lang.String r3 = ""
            return r3
    }

    public static boolean i3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12, boolean r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r12, r0)
            boolean r0 = r12 instanceof java.lang.String
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r7 = 2
            r8 = 0
            r5 = 0
            r3 = r11
            r6 = r13
            int r11 = H3(r3, r4, r5, r6, r7, r8)
            if (r11 < 0) goto L1f
            return r2
        L1f:
            return r1
        L20:
            r3 = r11
            r6 = r13
            int r11 = r3.length()
            r9 = 16
            r10 = 0
            r5 = 0
            r8 = 0
            r4 = r12
            r7 = r6
            r6 = r11
            int r11 = F3(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 < 0) goto L35
            return r2
        L35:
            return r1
    }

    public static /* synthetic */ java.lang.String i4(java.lang.String r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.String r0 = g4(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> i5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.String[] r8, boolean r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            r1 = 1
            if (r0 != r1) goto L1d
            r0 = 0
            r0 = r8[r0]
            int r1 = r0.length()
            if (r1 != 0) goto L18
            goto L1d
        L18:
            java.util.List r7 = j5(r7, r0, r9, r10)
            return r7
        L1d:
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            kotlin.sequences.m r7 = q4(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Iterable r7 = kotlin.sequences.p.l0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.f0.d0(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L3b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L4f
            java.lang.Object r9 = r7.next()
            kotlin.ranges.m r9 = (kotlin.ranges.m) r9
            java.lang.String r9 = E5(r0, r9)
            r8.add(r9)
            goto L3b
        L4f:
            return r8
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String i6(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = f6(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final boolean j3(java.lang.CharSequence r1, kotlin.text.Regex r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = r2.containsMatchIn(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence j4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, int r3, char r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 < 0) goto L30
            int r0 = r2.length()
            if (r3 > r0) goto L17
            r3 = 0
            int r4 = r2.length()
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            return r2
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r2.length()
            int r3 = r3 - r1
            r1 = 1
            if (r1 > r3) goto L2c
        L24:
            r0.append(r4)
            if (r1 == r3) goto L2c
            int r1 = r1 + 1
            goto L24
        L2c:
            r0.append(r2)
            return r0
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Desired length "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " is less than zero."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    private static final java.util.List<java.lang.String> j5(java.lang.CharSequence r7, java.lang.String r8, boolean r9, int r10) {
            f5(r10)
            r0 = 0
            int r1 = D3(r7, r8, r0, r9)
            r2 = -1
            if (r1 == r2) goto L51
            r3 = 1
            if (r10 != r3) goto Lf
            goto L51
        Lf:
            if (r10 <= 0) goto L13
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            if (r4 == 0) goto L1e
            int r6 = kotlin.ranges.t.B(r10, r6)
        L1e:
            r5.<init>(r6)
        L21:
            java.lang.CharSequence r0 = r7.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            int r0 = r8.length()
            int r0 = r0 + r1
            if (r4 == 0) goto L3b
            int r1 = r5.size()
            int r6 = r10 + (-1)
            if (r1 == r6) goto L41
        L3b:
            int r1 = D3(r7, r8, r0, r9)
            if (r1 != r2) goto L21
        L41:
            int r8 = r7.length()
            java.lang.CharSequence r7 = r7.subSequence(r0, r8)
            java.lang.String r7 = r7.toString()
            r5.add(r7)
            return r5
        L51:
            java.lang.String r7 = r7.toString()
            java.util.List r7 = kotlin.collections.f0.l(r7)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String j6(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L35
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L30
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L37
        L30:
            if (r1 >= 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L12
        L35:
            java.lang.String r3 = ""
        L37:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static /* synthetic */ boolean k3(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = h3(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String k4(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = j4(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    static /* synthetic */ java.util.List k5(java.lang.CharSequence r0, kotlin.text.Regex r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "regex"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.util.List r0 = r1.split(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String k6(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2b
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = kotlin.collections.n.w8(r4, r2)
            if (r2 != 0) goto L26
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L2d
        L26:
            if (r1 >= 0) goto L29
            goto L2b
        L29:
            r0 = r1
            goto L12
        L2b:
            java.lang.String r3 = ""
        L2d:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static /* synthetic */ boolean l3(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = i3(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.CharSequence l4(java.lang.CharSequence r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.CharSequence r0 = j4(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List l5(java.lang.CharSequence r1, char[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            java.util.List r1 = h5(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence l6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length()
            r1 = 0
        La:
            if (r1 >= r0) goto L22
            char r2 = r3.charAt(r1)
            boolean r2 = kotlin.text.c.r(r2)
            if (r2 != 0) goto L1f
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            return r3
        L1f:
            int r1 = r1 + 1
            goto La
        L22:
            java.lang.String r3 = ""
            return r3
    }

    public static final boolean m3(@org.jetbrains.annotations.Nullable java.lang.CharSequence r6, @org.jetbrains.annotations.Nullable java.lang.CharSequence r7) {
            boolean r0 = r6 instanceof java.lang.String
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = kotlin.text.g0.a2(r6, r7, r1)
            return r6
        L12:
            if (r6 != r7) goto L15
            return r1
        L15:
            r0 = 0
            if (r6 == 0) goto L3f
            if (r7 == 0) goto L3f
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L25
            goto L3f
        L25:
            int r2 = r6.length()
            r3 = 0
        L2a:
            if (r3 >= r2) goto L3e
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            boolean r4 = kotlin.text.d.J(r4, r5, r1)
            if (r4 != 0) goto L3b
            return r0
        L3b:
            int r3 = r3 + 1
            goto L2a
        L3e:
            return r1
        L3f:
            return r0
    }

    public static /* synthetic */ java.lang.String m4(java.lang.String r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.String r0 = k4(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List m5(java.lang.CharSequence r1, java.lang.String[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            java.util.List r1 = i5(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence m6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L31
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2e
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            return r3
        L2e:
            int r1 = r1 + 1
            goto Lf
        L31:
            java.lang.String r3 = ""
            return r3
    }

    public static final boolean n3(@org.jetbrains.annotations.Nullable java.lang.CharSequence r6, @org.jetbrains.annotations.Nullable java.lang.CharSequence r7) {
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto Ld
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto Ld
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r7)
            return r6
        Ld:
            r0 = 1
            if (r6 != r7) goto L11
            return r0
        L11:
            r1 = 0
            if (r6 == 0) goto L37
            if (r7 == 0) goto L37
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L21
            goto L37
        L21:
            int r2 = r6.length()
            r3 = 0
        L26:
            if (r3 >= r2) goto L36
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L33
            return r1
        L33:
            int r3 = r3 + 1
            goto L26
        L36:
            return r0
        L37:
            return r1
    }

    private static final kotlin.sequences.m<kotlin.ranges.m> n4(java.lang.CharSequence r2, char[] r3, int r4, boolean r5, int r6) {
            f5(r6)
            kotlin.text.g r0 = new kotlin.text.g
            kotlin.text.i0 r1 = new kotlin.text.i0
            r1.<init>(r3, r5)
            r0.<init>(r2, r4, r6, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final kotlin.sequences.m<java.lang.String> n5(java.lang.CharSequence r1, kotlin.text.Regex r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.m r1 = r2.splitToSequence(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence n6(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L27
            char r2 = r3.charAt(r1)
            boolean r2 = kotlin.collections.n.w8(r4, r2)
            if (r2 != 0) goto L24
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            return r3
        L24:
            int r1 = r1 + 1
            goto Lf
        L27:
            java.lang.String r3 = ""
            return r3
    }

    public static final boolean o3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, char r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L1b
            int r0 = y3(r1)
            char r1 = r1.charAt(r0)
            boolean r1 = kotlin.text.d.J(r1, r2, r3)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    private static final kotlin.sequences.m<kotlin.ranges.m> o4(java.lang.CharSequence r2, java.lang.String[] r3, int r4, boolean r5, int r6) {
            f5(r6)
            java.util.List r3 = kotlin.collections.n.t(r3)
            kotlin.text.g r0 = new kotlin.text.g
            kotlin.text.j0 r1 = new kotlin.text.j0
            r1.<init>(r3, r5)
            r0.<init>(r2, r4, r6, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.lang.String> o5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.NotNull char[] r9, boolean r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.g0.p(r9, r0)
            r6 = 2
            r7 = 0
            r3 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            kotlin.sequences.m r8 = p4(r1, r2, r3, r4, r5, r6, r7)
            kotlin.text.h0 r9 = new kotlin.text.h0
            r9.<init>(r1)
            kotlin.sequences.m r8 = kotlin.sequences.p.N1(r8, r9)
            return r8
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String o6(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = l6(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static final boolean p3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.NotNull java.lang.CharSequence r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r10 != 0) goto L20
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L20
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L20
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 2
            r0 = 0
            r1 = 0
            boolean r8 = kotlin.text.g0.Z1(r8, r9, r1, r10, r0)
            return r8
        L20:
            int r0 = r8.length()
            int r1 = r9.length()
            int r3 = r0 - r1
            r5 = 0
            int r6 = r9.length()
            r2 = r8
            r4 = r9
            r7 = r10
            boolean r8 = t4(r2, r3, r4, r5, r6, r7)
            return r8
    }

    static /* synthetic */ kotlin.sequences.m p4(java.lang.CharSequence r1, char[] r2, int r3, boolean r4, int r5, int r6, java.lang.Object r7) {
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
            if (r6 == 0) goto L10
            r5 = 0
        L10:
            kotlin.sequences.m r1 = n4(r1, r2, r3, r4, r5)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.lang.String> p5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.NotNull java.lang.String[] r9, boolean r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.g0.p(r9, r0)
            r6 = 2
            r7 = 0
            r3 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            kotlin.sequences.m r8 = q4(r1, r2, r3, r4, r5, r6, r7)
            kotlin.text.k0 r9 = new kotlin.text.k0
            r9.<init>(r1)
            kotlin.sequences.m r8 = kotlin.sequences.p.N1(r8, r9)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String p6(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L31
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2e
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L33
        L2e:
            int r1 = r1 + 1
            goto Lf
        L31:
            java.lang.String r3 = ""
        L33:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static /* synthetic */ boolean q3(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = o3(r0, r1, r2)
            return r0
    }

    static /* synthetic */ kotlin.sequences.m q4(java.lang.CharSequence r1, java.lang.String[] r2, int r3, boolean r4, int r5, int r6, java.lang.Object r7) {
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
            if (r6 == 0) goto L10
            r5 = 0
        L10:
            kotlin.sequences.m r1 = o4(r1, r2, r3, r4, r5)
            return r1
    }

    static /* synthetic */ kotlin.sequences.m q5(java.lang.CharSequence r0, kotlin.text.Regex r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "regex"
            kotlin.jvm.internal.g0.p(r1, r3)
            kotlin.sequences.m r0 = r1.splitToSequence(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String q6(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull char... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L27
            char r2 = r3.charAt(r1)
            boolean r2 = kotlin.collections.n.w8(r4, r2)
            if (r2 != 0) goto L24
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L29
        L24:
            int r1 = r1 + 1
            goto Lf
        L27:
            java.lang.String r3 = ""
        L29:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static /* synthetic */ boolean r3(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = p3(r0, r1, r2)
            return r0
    }

    private static final kotlin.Pair r4(char[] r1, boolean r2, java.lang.CharSequence r3, int r4) {
            java.lang.String r0 = "$this$DelimitedRangesSequence"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r1 = J3(r3, r1, r4, r2)
            if (r1 >= 0) goto Ld
            r1 = 0
            return r1
        Ld:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r1 = kotlin.o0.a(r1, r2)
            return r1
    }

    public static /* synthetic */ kotlin.sequences.m r5(java.lang.CharSequence r1, char[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            kotlin.sequences.m r1 = o5(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> s3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            kotlin.Pair r1 = t3(r1, r2, r3, r4, r0)
            return r1
    }

    private static final kotlin.Pair s4(java.util.List r1, boolean r2, java.lang.CharSequence r3, int r4) {
            java.lang.String r0 = "$this$DelimitedRangesSequence"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            kotlin.Pair r1 = t3(r3, r1, r4, r2, r0)
            if (r1 == 0) goto L25
            java.lang.Object r2 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r1 = kotlin.o0.a(r2, r1)
            return r1
        L25:
            r1 = 0
            return r1
    }

    public static /* synthetic */ kotlin.sequences.m s5(java.lang.CharSequence r1, java.lang.String[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            kotlin.sequences.m r1 = p5(r1, r2, r3, r4)
            return r1
    }

    private static final kotlin.Pair<java.lang.Integer, java.lang.String> t3(java.lang.CharSequence r9, java.util.Collection<java.lang.String> r10, int r11, boolean r12, boolean r13) {
            r0 = 0
            if (r12 != 0) goto L34
            int r1 = r10.size()
            r2 = 1
            if (r1 != r2) goto L34
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = kotlin.collections.f0.k5(r10)
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            if (r13 != 0) goto L1f
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r9
            r3 = r11
            int r9 = H3(r1, r2, r3, r4, r5, r6)
            goto L28
        L1f:
            r1 = r9
            r3 = r11
            r5 = 4
            r6 = 0
            r4 = 0
            int r9 = W3(r1, r2, r3, r4, r5, r6)
        L28:
            if (r9 >= 0) goto L2b
            return r0
        L2b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            kotlin.Pair r9 = kotlin.o0.a(r9, r2)
            return r9
        L34:
            r1 = r9
            r3 = r11
            r9 = 0
            if (r13 != 0) goto L47
            kotlin.ranges.m r11 = new kotlin.ranges.m
            int r9 = kotlin.ranges.t.u(r3, r9)
            int r13 = r1.length()
            r11.<init>(r9, r13)
            goto L53
        L47:
            int r11 = y3(r1)
            int r11 = kotlin.ranges.t.B(r3, r11)
            kotlin.ranges.k r11 = kotlin.ranges.t.k0(r11, r9)
        L53:
            boolean r9 = r1 instanceof java.lang.String
            if (r9 == 0) goto La6
            int r9 = r11.e()
            int r13 = r11.f()
            int r11 = r11.g()
            if (r11 <= 0) goto L67
            if (r9 <= r13) goto L6b
        L67:
            if (r11 >= 0) goto Lf5
            if (r13 > r9) goto Lf5
        L6b:
            r5 = r9
        L6c:
            r9 = r10
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L73:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r8 = r9.next()
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r3 = 0
            r7 = r12
            boolean r12 = kotlin.text.g0.q2(r2, r3, r4, r5, r6, r7)
            if (r12 == 0) goto L90
            goto L94
        L90:
            r12 = r7
            goto L73
        L92:
            r7 = r12
            r8 = r0
        L94:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto La1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            kotlin.Pair r9 = kotlin.o0.a(r9, r8)
            return r9
        La1:
            if (r5 == r13) goto Lf5
            int r5 = r5 + r11
            r12 = r7
            goto L6c
        La6:
            r7 = r12
            int r9 = r11.e()
            int r12 = r11.f()
            int r11 = r11.g()
            if (r11 <= 0) goto Lb7
            if (r9 <= r12) goto Lbb
        Lb7:
            if (r11 >= 0) goto Lf5
            if (r12 > r9) goto Lf5
        Lbb:
            r6 = r9
        Lbc:
            r9 = r10
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        Lc3:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto Le1
            java.lang.Object r13 = r9.next()
            r3 = r13
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r8 = r7
            int r7 = r3.length()
            r5 = r1
            boolean r1 = t4(r3, r4, r5, r6, r7, r8)
            r7 = r8
            if (r1 == 0) goto Ldf
            goto Le3
        Ldf:
            r1 = r5
            goto Lc3
        Le1:
            r5 = r1
            r13 = r0
        Le3:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto Lf0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            kotlin.Pair r9 = kotlin.o0.a(r9, r13)
            return r9
        Lf0:
            if (r6 == r12) goto Lf5
            int r6 = r6 + r11
            r1 = r5
            goto Lbc
        Lf5:
            return r0
    }

    public static final boolean t4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            if (r7 < 0) goto L39
            if (r5 < 0) goto L39
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L39
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1e
            goto L39
        L1e:
            r1 = 0
        L1f:
            if (r1 >= r8) goto L37
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = kotlin.text.d.J(r2, r3, r9)
            if (r2 != 0) goto L34
            return r0
        L34:
            int r1 = r1 + 1
            goto L1f
        L37:
            r4 = 1
            return r4
        L39:
            return r0
    }

    private static final java.lang.String t5(java.lang.CharSequence r1, kotlin.ranges.m r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = E5(r1, r2)
            return r1
    }

    public static /* synthetic */ kotlin.Pair u3(java.lang.CharSequence r1, java.util.Collection r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = 0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            kotlin.Pair r1 = s3(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence u4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = A5(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L20
            int r4 = r4.length()
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            return r3
        L20:
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r2, r4)
            return r3
    }

    private static final java.lang.String u5(java.lang.CharSequence r1, kotlin.ranges.m r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = E5(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> v3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            kotlin.Pair r1 = t3(r1, r2, r3, r4, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String v4(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = A5(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L20
            int r4 = r4.length()
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
        L20:
            return r3
    }

    public static final boolean v5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, char r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L18
            char r2 = r2.charAt(r1)
            boolean r2 = kotlin.text.d.J(r2, r3, r4)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            return r1
    }

    public static /* synthetic */ kotlin.Pair w3(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = y3(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            kotlin.Pair r0 = v3(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence w4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            if (r6 < r5) goto L32
            r0 = 0
            if (r6 != r5) goto L13
            int r5 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r0, r5)
            return r4
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r3 = r6 - r5
            int r2 = r2 - r3
            r1.<init>(r2)
            r1.append(r4, r0, r5)
            java.lang.String r5 = "append(...)"
            kotlin.jvm.internal.g0.o(r1, r5)
            int r0 = r4.length()
            r1.append(r4, r6, r0)
            kotlin.jvm.internal.g0.o(r1, r5)
            return r1
        L32:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End index ("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ") is less than start index ("
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public static final boolean w5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, int r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r8, r0)
            if (r10 != 0) goto L23
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L23
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L23
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r5 = 4
            r6 = 0
            r4 = 0
            r3 = r9
            boolean r7 = kotlin.text.g0.G2(r1, r2, r3, r4, r5, r6)
            return r7
        L23:
            r1 = r9
            r3 = 0
            int r4 = r8.length()
            r0 = r7
            r2 = r8
            r5 = r10
            boolean r7 = t4(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.ranges.m x3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2.length()
            int r2 = r2 + (-1)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence x4(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, @org.jetbrains.annotations.NotNull kotlin.ranges.m r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Integer r0 = r2.r()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.q()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = w4(r1, r0, r2)
            return r1
    }

    public static final boolean x5(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r8 != 0) goto L20
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L20
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L20
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            r8 = 2
            r0 = 0
            r1 = 0
            boolean r6 = kotlin.text.g0.H2(r6, r7, r1, r8, r0)
            return r6
        L20:
            r3 = 0
            int r4 = r7.length()
            r1 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = t4(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static int y3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String y4(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.CharSequence r1 = w4(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static /* synthetic */ boolean y5(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = v5(r0, r1, r2)
            return r0
    }

    public static final boolean z3(@org.jetbrains.annotations.NotNull java.lang.CharSequence r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 < 0) goto L26
            int r0 = r1.length()
            int r0 = r0 + (-2)
            if (r2 > r0) goto L26
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L26
            r0 = 1
            int r2 = r2 + r0
            char r1 = r1.charAt(r2)
            boolean r1 = java.lang.Character.isLowSurrogate(r1)
            if (r1 == 0) goto L26
            return r0
        L26:
            r1 = 0
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String z4(java.lang.String r1, kotlin.ranges.m r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.CharSequence r1 = x4(r1, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static /* synthetic */ boolean z5(java.lang.CharSequence r0, java.lang.CharSequence r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            boolean r0 = w5(r0, r1, r2, r3)
            return r0
    }
}
