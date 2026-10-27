package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:146\n126#1,2:159\n119#1,2:168\n121#1,4:183\n126#1,2:190\n1#2:130\n1#2:156\n1#2:187\n1#2:211\n1583#3,11:133\n1878#3,2:144\n1880#3:157\n1594#3:158\n774#3:161\n865#3,2:162\n1563#3:164\n1634#3,3:165\n1583#3,11:170\n1878#3,2:181\n1880#3:188\n1594#3:189\n1583#3,11:198\n1878#3,2:209\n1880#3:212\n1594#3:213\n158#4,6:150\n158#4,6:192\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:146,4\n42#1:159,2\n83#1:168,2\n83#1:183,4\n83#1:190,2\n42#1:156\n83#1:187\n120#1:211\n42#1:133,11\n42#1:144,2\n42#1:157\n42#1:158\n79#1:161\n79#1:162,2\n80#1:164\n80#1:165,3\n83#1:170,11\n83#1:181,2\n83#1:188\n83#1:189\n120#1:198,11\n120#1:209,2\n120#1:212\n120#1:213\n43#1:150,6\n107#1:192,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class z extends kotlin.text.v {
    public z() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String g(java.lang.String r0) {
            java.lang.String r0 = k(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String h(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = p(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String i(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = l(r0, r1)
            return r0
    }

    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> j(java.lang.String r1) {
            int r0 = r1.length()
            if (r0 != 0) goto Lc
            kotlin.text.x r1 = new kotlin.text.x
            r1.<init>()
            return r1
        Lc:
            kotlin.text.y r0 = new kotlin.text.y
            r0.<init>(r1)
            return r0
    }

    private static final java.lang.String k(java.lang.String r1) {
            java.lang.String r0 = "line"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    private static final java.lang.String l(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "line"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static final int m(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            r2 = -1
            if (r1 >= r0) goto L16
            char r3 = r4.charAt(r1)
            boolean r3 = kotlin.text.c.r(r3)
            if (r3 != 0) goto L13
            goto L17
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            r1 = -1
        L17:
            if (r1 != r2) goto L1e
            int r4 = r4.length()
            return r4
        L1e:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String n(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "indent"
            kotlin.jvm.internal.g0.p(r11, r0)
            kotlin.sequences.m r10 = kotlin.text.l0.b4(r10)
            kotlin.text.w r0 = new kotlin.text.w
            r0.<init>(r11)
            kotlin.sequences.m r1 = kotlin.sequences.p.N1(r10, r0)
            r8 = 62
            r9 = 0
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = kotlin.sequences.p.H1(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public static /* synthetic */ java.lang.String o(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "    "
        L6:
            java.lang.String r0 = n(r0, r1)
            return r0
    }

    private static final java.lang.String p(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = kotlin.text.l0.M3(r3)
            if (r0 == 0) goto L17
            int r0 = r3.length()
            int r1 = r2.length()
            if (r0 >= r1) goto L16
            return r2
        L16:
            return r3
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static final java.lang.String q(java.util.List<java.lang.String> r11, int r12, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r13, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r14) {
            int r0 = kotlin.collections.f0.L(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
            r2 = 0
        L10:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r11.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L21
            kotlin.collections.f0.b0()
        L21:
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L27
            if (r2 != r0) goto L2f
        L27:
            boolean r2 = kotlin.text.l0.M3(r3)
            if (r2 == 0) goto L2f
            r3 = 0
            goto L41
        L2f:
            java.lang.Object r2 = r14.invoke(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L41
            java.lang.Object r2 = r13.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            if (r3 == 0) goto L46
            r1.add(r3)
        L46:
            r2 = r4
            goto L10
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r9 = 124(0x7c, float:1.74E-43)
            r10 = 0
            java.lang.String r3 = "\n"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.Appendable r11 = kotlin.collections.f0.p3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r11 = (java.lang.StringBuilder) r11
            java.lang.String r11 = r11.toString()
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String r(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.util.List r0 = kotlin.text.l0.c4(r14)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.l0.M3(r4)
            if (r4 != 0) goto L1a
            r2.add(r3)
            goto L1a
        L31:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = m(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L40
        L58:
            java.lang.Comparable r1 = kotlin.collections.f0.m4(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L66
            int r1 = r1.intValue()
            goto L67
        L66:
            r1 = 0
        L67:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            kotlin.jvm.functions.Function1 r15 = j(r15)
            int r3 = kotlin.collections.f0.L(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbf
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L9a
            kotlin.collections.f0.b0()
        L9a:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto La0
            if (r2 != r3) goto La8
        La0:
            boolean r2 = kotlin.text.l0.M3(r5)
            if (r2 == 0) goto La8
            r5 = 0
            goto Lb8
        La8:
            java.lang.String r2 = kotlin.text.s0.b7(r5, r1)
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r15.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb7
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            if (r5 == 0) goto Lbd
            r4.add(r5)
        Lbd:
            r2 = r6
            goto L89
        Lbf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.Appendable r14 = kotlin.collections.f0.p3(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            return r14
    }

    public static /* synthetic */ java.lang.String s(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            java.lang.String r0 = r(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String t(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "marginPrefix"
            kotlin.jvm.internal.g0.p(r15, r0)
            boolean r0 = kotlin.text.l0.M3(r15)
            if (r0 != 0) goto Lc6
            java.util.List r0 = kotlin.text.l0.c4(r13)
            int r13 = r13.length()
            int r1 = r14.length()
            int r2 = r0.size()
            int r1 = r1 * r2
            int r13 = r13 + r1
            kotlin.jvm.functions.Function1 r14 = j(r14)
            int r1 = kotlin.collections.f0.L(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = 0
        L3d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r0.next()
            int r6 = r4 + 1
            if (r4 >= 0) goto L4e
            kotlin.collections.f0.b0()
        L4e:
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            r5 = 0
            if (r4 == 0) goto L56
            if (r4 != r1) goto L5f
        L56:
            boolean r4 = kotlin.text.l0.M3(r7)
            if (r4 == 0) goto L5f
            r8 = r15
            r7 = r5
            goto La4
        L5f:
            int r4 = r7.length()
            r8 = 0
        L64:
            r9 = -1
            if (r8 >= r4) goto L75
            char r10 = r7.charAt(r8)
            boolean r10 = kotlin.text.c.r(r10)
            if (r10 != 0) goto L72
            goto L76
        L72:
            int r8 = r8 + 1
            goto L64
        L75:
            r8 = -1
        L76:
            if (r8 != r9) goto L7a
            r8 = r15
            goto L98
        L7a:
            r11 = 4
            r12 = 0
            r10 = 0
            r9 = r8
            r8 = r15
            boolean r15 = kotlin.text.g0.G2(r7, r8, r9, r10, r11, r12)
            if (r15 == 0) goto L98
            int r15 = r8.length()
            int r15 = r15 + r9
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r7, r4)
            java.lang.String r5 = r7.substring(r15)
            java.lang.String r15 = "substring(...)"
            kotlin.jvm.internal.g0.o(r5, r15)
        L98:
            if (r5 == 0) goto La4
            java.lang.Object r15 = r14.invoke(r5)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto La3
            goto La4
        La3:
            r7 = r15
        La4:
            if (r7 == 0) goto La9
            r2.add(r7)
        La9:
            r4 = r6
            r15 = r8
            goto L3d
        Lac:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r13)
            r10 = 124(0x7c, float:1.74E-43)
            r11 = 0
            java.lang.String r4 = "\n"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.Appendable r13 = kotlin.collections.f0.p3(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r13 = (java.lang.StringBuilder) r13
            java.lang.String r13 = r13.toString()
            return r13
        Lc6:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "marginPrefix must be non-blank string."
            r13.<init>(r14)
            throw r13
    }

    public static /* synthetic */ java.lang.String u(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = "|"
        Lc:
            java.lang.String r0 = t(r0, r1, r2)
            return r0
    }

    @kotlin.internal.IntrinsicConstEvaluation
    @org.jetbrains.annotations.NotNull
    public static java.lang.String v(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = r(r1, r0)
            return r1
    }

    @kotlin.internal.IntrinsicConstEvaluation
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String w(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "marginPrefix"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = t(r1, r0, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String x(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "|"
        L6:
            java.lang.String r0 = w(r0, r1)
            return r0
    }
}
