package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n24#2,3:405\n1#3:408\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n105#1:405,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Regex implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.Regex.a Companion = null;

    @org.jetbrains.annotations.Nullable
    private java.util.Set<? extends kotlin.text.RegexOption> _options;

    @org.jetbrains.annotations.NotNull
    private final java.util.regex.Pattern nativePattern;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ int a(kotlin.text.Regex.a r0, int r1) {
                int r0 = r0.b(r1)
                return r0
        }

        private final int b(int r2) {
                r1 = this;
                r0 = r2 & 2
                if (r0 == 0) goto L6
                r2 = r2 | 64
            L6:
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String c(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = java.util.regex.Pattern.quote(r2)
                java.lang.String r0 = "quote(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String d(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = java.util.regex.Matcher.quoteReplacement(r2)
                java.lang.String r0 = "quoteReplacement(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.text.Regex e(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.text.Regex r0 = new kotlin.text.Regex
                kotlin.text.RegexOption r1 = kotlin.text.RegexOption.LITERAL
                r0.<init>(r3, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements java.io.Serializable {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.text.Regex.b.a c = null;
        private static final long serialVersionUID = 0;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;
        private final int b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a {
            private a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                kotlin.text.Regex$b$a r0 = new kotlin.text.Regex$b$a
                r1 = 0
                r0.<init>(r1)
                kotlin.text.Regex.b.c = r0
                return
        }

        public b(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        private final java.lang.Object readResolve() {
                r3 = this;
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = r3.a
                int r2 = r3.b
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
                java.lang.String r2 = "compile(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                r0.<init>(r1)
                return r0
        }

        public final int a() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.text.p, kotlin.text.p> {
        public static final kotlin.text.Regex.c a = null;

        static {
                kotlin.text.Regex$c r0 = new kotlin.text.Regex$c
                r0.<init>()
                kotlin.text.Regex.c.a = r0
                return
        }

        c() {
                r6 = this;
                java.lang.String r4 = "next()Lkotlin/text/MatchResult;"
                r5 = 0
                r1 = 1
                java.lang.Class<kotlin.text.p> r2 = kotlin.text.p.class
                java.lang.String r3 = "next"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final kotlin.text.p c(kotlin.text.p r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.text.p r2 = r2.next()
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.text.p invoke(kotlin.text.p r1) {
                r0 = this;
                kotlin.text.p r1 = (kotlin.text.p) r1
                kotlin.text.p r1 = r0.c(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,404:1\n*E\n"})
    public static final class d implements kotlin.jvm.functions.Function1<kotlin.text.RegexOption, java.lang.Boolean> {
        final /* synthetic */ int a;

        public d(int r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public final java.lang.Boolean a(kotlin.text.RegexOption r3) {
                r2 = this;
                int r0 = r2.a
                kotlin.text.h r3 = (kotlin.text.h) r3
                int r1 = r3.getMask()
                r0 = r0 & r1
                int r3 = r3.getValue()
                if (r0 != r3) goto L11
                r3 = 1
                goto L12
            L11:
                r3 = 0
            L12:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.text.RegexOption r1) {
                r0 = this;
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {280, 288, 292}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "$this$sequence", "matcher", "nextStart", "splitCount", "$this$sequence", "matcher", "nextStart", "splitCount"}, nl = {281, 289, 293}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
    static final class e extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super java.lang.String>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        int c;
        int d;
        private /* synthetic */ java.lang.Object e;
        final /* synthetic */ kotlin.text.Regex f;
        final /* synthetic */ java.lang.CharSequence g;
        final /* synthetic */ int h;

        e(kotlin.text.Regex r1, java.lang.CharSequence r2, int r3, kotlin.coroutines.e<? super kotlin.text.Regex.e> r4) {
                r0 = this;
                r0.f = r1
                r0.g = r2
                r0.h = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r5, kotlin.coroutines.e<?> r6) {
                r4 = this;
                kotlin.text.Regex$e r0 = new kotlin.text.Regex$e
                kotlin.text.Regex r1 = r4.f
                java.lang.CharSequence r2 = r4.g
                int r3 = r4.h
                r0.<init>(r1, r2, r3, r6)
                r0.e = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.o<? super java.lang.String> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.o<? super java.lang.String> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.text.Regex$e r1 = (kotlin.text.Regex.e) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = r10.e
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r10.d
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L30
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r10.a
                java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
                kotlin.g0.n(r11)
                goto Lb2
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                int r2 = r10.c
                java.lang.Object r6 = r10.a
                java.util.regex.Matcher r6 = (java.util.regex.Matcher) r6
                kotlin.g0.n(r11)
                goto L76
            L30:
                java.lang.Object r0 = r10.a
                java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
                kotlin.g0.n(r11)
                goto Ld0
            L39:
                kotlin.g0.n(r11)
                kotlin.text.Regex r11 = r10.f
                java.util.regex.Pattern r11 = kotlin.text.Regex.access$getNativePattern$p(r11)
                java.lang.CharSequence r2 = r10.g
                java.util.regex.Matcher r11 = r11.matcher(r2)
                int r2 = r10.h
                if (r2 == r5) goto Lb5
                boolean r2 = r11.find()
                if (r2 != 0) goto L53
                goto Lb5
            L53:
                r2 = 0
                r6 = r11
                r11 = 0
            L56:
                java.lang.CharSequence r7 = r10.g
                int r8 = r6.start()
                java.lang.CharSequence r7 = r7.subSequence(r2, r8)
                java.lang.String r7 = r7.toString()
                r10.e = r0
                r10.a = r6
                r10.b = r2
                r10.c = r11
                r10.d = r4
                java.lang.Object r2 = r0.c(r7, r10)
                if (r2 != r1) goto L75
                goto Lcf
            L75:
                r2 = r11
            L76:
                int r11 = r6.end()
                int r2 = r2 + r5
                int r7 = r10.h
                int r7 = r7 - r5
                if (r2 == r7) goto L8b
                boolean r7 = r6.find()
                if (r7 != 0) goto L87
                goto L8b
            L87:
                r9 = r2
                r2 = r11
                r11 = r9
                goto L56
            L8b:
                java.lang.CharSequence r4 = r10.g
                int r5 = r4.length()
                java.lang.CharSequence r4 = r4.subSequence(r11, r5)
                java.lang.String r4 = r4.toString()
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.j.a(r0)
                r10.e = r5
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.j.a(r6)
                r10.a = r5
                r10.b = r11
                r10.c = r2
                r10.d = r3
                java.lang.Object r11 = r0.c(r4, r10)
                if (r11 != r1) goto Lb2
                goto Lcf
            Lb2:
                kotlin.n1 r11 = kotlin.n1.a
                return r11
            Lb5:
                java.lang.CharSequence r2 = r10.g
                java.lang.String r2 = r2.toString()
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r0)
                r10.e = r3
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.j.a(r11)
                r10.a = r11
                r10.d = r5
                java.lang.Object r11 = r0.c(r2, r10)
                if (r11 != r1) goto Ld0
            Lcf:
                return r1
            Ld0:
                kotlin.n1 r11 = kotlin.n1.a
                return r11
        }
    }

    static {
            kotlin.text.Regex$a r0 = new kotlin.text.Regex$a
            r1 = 0
            r0.<init>(r1)
            kotlin.text.Regex.Companion = r0
            return
    }

    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.<init>(r2)
            return
    }

    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Set<? extends kotlin.text.RegexOption> r3) {
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            int r3 = kotlin.text.t.e(r3)
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.<init>(r2)
            return
    }

    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.RegexOption r3) {
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            int r3 = r3.getValue()
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.<init>(r2)
            return
    }

    @kotlin.PublishedApi
    public Regex(@org.jetbrains.annotations.NotNull java.util.regex.Pattern r2) {
            r1 = this;
            java.lang.String r0 = "nativePattern"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.nativePattern = r2
            return
    }

    public static /* synthetic */ kotlin.text.p a(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2) {
            kotlin.text.p r0 = findAll$lambda$0(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getNativePattern$p(kotlin.text.Regex r0) {
            java.util.regex.Pattern r0 = r0.nativePattern
            return r0
    }

    public static /* synthetic */ kotlin.text.p find$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.text.p r0 = r0.find(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.sequences.m findAll$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.sequences.m r0 = r0.findAll(r1, r2)
            return r0
    }

    private static final kotlin.text.p findAll$lambda$0(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2) {
            kotlin.text.p r0 = r0.find(r1, r2)
            return r0
    }

    private final void readObject(java.io.ObjectInputStream r2) {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is supported via proxy only"
            r2.<init>(r0)
            throw r2
    }

    public static /* synthetic */ java.util.List split$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.util.List r0 = r0.split(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.sequences.m splitToSequence$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.sequences.m r0 = r0.splitToSequence(r1, r2)
            return r0
    }

    private final java.lang.Object writeReplace() {
            r3 = this;
            kotlin.text.Regex$b r0 = new kotlin.text.Regex$b
            java.util.regex.Pattern r1 = r3.nativePattern
            java.lang.String r1 = r1.pattern()
            java.lang.String r2 = "pattern(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.util.regex.Pattern r2 = r3.nativePattern
            int r2 = r2.flags()
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean containsMatchIn(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.find()
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.text.p find(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r1 = "matcher(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.p r3 = kotlin.text.t.a(r0, r4, r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.sequences.m<kotlin.text.p> findAll(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5) {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r4, r0)
            if (r5 < 0) goto L19
            int r0 = r4.length()
            if (r5 > r0) goto L19
            kotlin.text.s r0 = new kotlin.text.s
            r0.<init>(r3, r4, r5)
            kotlin.text.Regex$c r4 = kotlin.text.Regex.c.a
            kotlin.sequences.m r4 = kotlin.sequences.p.v(r0, r4)
            return r4
        L19:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Start index out of bounds: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", input length: "
            r1.append(r5)
            int r4 = r4.length()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.text.RegexOption> getOptions() {
            r3 = this;
            java.util.Set<? extends kotlin.text.RegexOption> r0 = r3._options
            if (r0 != 0) goto L26
            java.util.regex.Pattern r0 = r3.nativePattern
            int r0 = r0.flags()
            java.lang.Class<kotlin.text.RegexOption> r1 = kotlin.text.RegexOption.class
            java.util.EnumSet r1 = java.util.EnumSet.allOf(r1)
            kotlin.jvm.internal.g0.m(r1)
            kotlin.text.Regex$d r2 = new kotlin.text.Regex$d
            r2.<init>(r0)
            kotlin.collections.f0.S0(r1, r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
            java.lang.String r1 = "unmodifiableSet(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r3._options = r0
        L26:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPattern() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.nativePattern
            java.lang.String r0 = r0.pattern()
            java.lang.String r1 = "pattern(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.Nullable
    public final kotlin.text.p matchAt(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r1 = 0
            java.util.regex.Matcher r0 = r0.useAnchoringBounds(r1)
            r1 = 1
            java.util.regex.Matcher r0 = r0.useTransparentBounds(r1)
            int r1 = r3.length()
            java.util.regex.Matcher r4 = r0.region(r4, r1)
            boolean r0 = r4.lookingAt()
            if (r0 == 0) goto L2c
            kotlin.text.q r0 = new kotlin.text.q
            kotlin.jvm.internal.g0.m(r4)
            r0.<init>(r4, r3)
            return r0
        L2c:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.text.p matchEntire(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r1 = "matcher(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.text.p r3 = kotlin.text.t.b(r0, r3)
            return r3
    }

    public final boolean matches(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public final boolean matchesAt(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r1 = 0
            java.util.regex.Matcher r0 = r0.useAnchoringBounds(r1)
            r1 = 1
            java.util.regex.Matcher r0 = r0.useTransparentBounds(r1)
            int r3 = r3.length()
            java.util.regex.Matcher r3 = r0.region(r4, r3)
            boolean r3 = r3.lookingAt()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String replace(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r3)
            java.lang.String r3 = "replaceAll(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String replace(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.text.p, ? extends java.lang.CharSequence> r7) {
            r5 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            kotlin.text.p r0 = find$default(r5, r6, r2, r0, r1)
            if (r0 != 0) goto L18
            java.lang.String r6 = r6.toString()
            return r6
        L18:
            int r1 = r6.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
        L21:
            kotlin.ranges.m r4 = r0.d()
            java.lang.Integer r4 = r4.r()
            int r4 = r4.intValue()
            r3.append(r6, r2, r4)
            java.lang.Object r2 = r7.invoke(r0)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.append(r2)
            kotlin.ranges.m r2 = r0.d()
            java.lang.Integer r2 = r2.q()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            kotlin.text.p r0 = r0.next()
            if (r2 >= r1) goto L4f
            if (r0 != 0) goto L21
        L4f:
            if (r2 >= r1) goto L54
            r3.append(r6, r2, r1)
        L54:
            java.lang.String r6 = r3.toString()
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String replaceFirst(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceFirst(r3)
            java.lang.String r3 = "replaceFirst(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> split(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, int r6) {
            r4 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.text.l0.f5(r6)
            java.util.regex.Pattern r0 = r4.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r5)
            r1 = 1
            if (r6 == r1) goto L58
            boolean r2 = r0.find()
            if (r2 != 0) goto L18
            goto L58
        L18:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            if (r6 <= 0) goto L22
            int r3 = kotlin.ranges.t.B(r6, r3)
        L22:
            r2.<init>(r3)
            int r6 = r6 - r1
            r1 = 0
        L27:
            int r3 = r0.start()
            java.lang.CharSequence r1 = r5.subSequence(r1, r3)
            java.lang.String r1 = r1.toString()
            r2.add(r1)
            int r1 = r0.end()
            if (r6 < 0) goto L42
            int r3 = r2.size()
            if (r3 == r6) goto L48
        L42:
            boolean r3 = r0.find()
            if (r3 != 0) goto L27
        L48:
            int r6 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r1, r6)
            java.lang.String r5 = r5.toString()
            r2.add(r5)
            return r2
        L58:
            java.lang.String r5 = r5.toString()
            java.util.List r5 = kotlin.collections.f0.l(r5)
            return r5
    }

    @kotlin.SinceKotlin(version = "1.6")
    @org.jetbrains.annotations.NotNull
    public final kotlin.sequences.m<java.lang.String> splitToSequence(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.text.l0.f5(r4)
            kotlin.text.Regex$e r0 = new kotlin.text.Regex$e
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            kotlin.sequences.m r3 = kotlin.sequences.p.b(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.regex.Pattern toPattern() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.nativePattern
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.nativePattern
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
