package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class q implements kotlin.text.p {

    @org.jetbrains.annotations.NotNull
    private final java.util.regex.Matcher a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.CharSequence b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.text.n c;

    @org.jetbrains.annotations.Nullable
    private java.util.List<java.lang.String> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.collections.d<java.lang.String> {
        final /* synthetic */ kotlin.text.q a;

        a(kotlin.text.q r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = r1.contains(r2)
                return r2
        }

        public /* bridge */ boolean contains(java.lang.String r1) {
                r0 = this;
                boolean r1 = super.contains(r1)
                return r1
        }

        public java.lang.String e(int r2) {
                r1 = this;
                kotlin.text.q r0 = r1.a
                java.util.regex.MatchResult r0 = kotlin.text.q.e(r0)
                java.lang.String r2 = r0.group(r2)
                if (r2 != 0) goto Le
                java.lang.String r2 = ""
            Le:
                return r2
        }

        public /* bridge */ int f(java.lang.String r1) {
                r0 = this;
                int r1 = super.indexOf(r1)
                return r1
        }

        public /* bridge */ int g(java.lang.String r1) {
                r0 = this;
                int r1 = super.lastIndexOf(r1)
                return r1
        }

        @Override // kotlin.collections.d, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.String r1 = r0.e(r1)
                return r1
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                kotlin.text.q r0 = r1.a
                java.util.regex.MatchResult r0 = kotlin.text.q.e(r0)
                int r0 = r0.groupCount()
                int r0 = r0 + 1
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r1.f(r2)
                return r2
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r1.g(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.collections.b<kotlin.text.m> implements kotlin.text.o {
        final /* synthetic */ kotlin.text.q a;

        b(kotlin.text.q r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.text.m e(kotlin.text.q.b r0, int r1) {
                kotlin.text.m r0 = g(r0, r1)
                return r0
        }

        private static final kotlin.text.m g(kotlin.text.q.b r0, int r1) {
                kotlin.text.m r0 = r0.get(r1)
                return r0
        }

        @Override // kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 1
                goto L6
            L4:
                boolean r0 = r2 instanceof kotlin.text.m
            L6:
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                kotlin.text.m r2 = (kotlin.text.m) r2
                boolean r2 = r1.f(r2)
                return r2
        }

        public /* bridge */ boolean f(kotlin.text.m r1) {
                r0 = this;
                boolean r1 = super.contains(r1)
                return r1
        }

        @Override // kotlin.text.n
        public kotlin.text.m get(int r4) {
                r3 = this;
                kotlin.text.q r0 = r3.a
                java.util.regex.MatchResult r0 = kotlin.text.q.e(r0)
                kotlin.ranges.m r0 = kotlin.text.t.d(r0, r4)
                java.lang.Integer r1 = r0.r()
                int r1 = r1.intValue()
                if (r1 < 0) goto L29
                kotlin.text.m r1 = new kotlin.text.m
                kotlin.text.q r2 = r3.a
                java.util.regex.MatchResult r2 = kotlin.text.q.e(r2)
                java.lang.String r4 = r2.group(r4)
                java.lang.String r2 = "group(...)"
                kotlin.jvm.internal.g0.o(r4, r2)
                r1.<init>(r4, r0)
                return r1
            L29:
                r4 = 0
                return r4
        }

        @Override // kotlin.text.o
        public kotlin.text.m get(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.internal.a r0 = kotlin.internal.b.a
                kotlin.text.q r1 = r2.a
                java.util.regex.MatchResult r1 = kotlin.text.q.e(r1)
                kotlin.text.m r3 = r0.c(r1, r3)
                return r3
        }

        @Override // kotlin.collections.b
        public int getSize() {
                r1 = this;
                kotlin.text.q r0 = r1.a
                java.util.regex.MatchResult r0 = kotlin.text.q.e(r0)
                int r0 = r0.groupCount()
                int r0 = r0 + 1
                return r0
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.collections.b, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<kotlin.text.m> iterator() {
                r2 = this;
                kotlin.ranges.m r0 = kotlin.collections.f0.K(r2)
                kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
                kotlin.text.r r1 = new kotlin.text.r
                r1.<init>(r2)
                kotlin.sequences.m r0 = kotlin.sequences.p.N1(r0, r1)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    public q(@org.jetbrains.annotations.NotNull java.util.regex.Matcher r2, @org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            r1 = this;
            java.lang.String r0 = "matcher"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            kotlin.text.q$b r2 = new kotlin.text.q$b
            r2.<init>(r1)
            r1.c = r2
            return
    }

    public static final /* synthetic */ java.util.regex.MatchResult e(kotlin.text.q r0) {
            java.util.regex.MatchResult r0 = r0.f()
            return r0
    }

    private final java.util.regex.MatchResult f() {
            r1 = this;
            java.util.regex.Matcher r0 = r1.a
            return r0
    }

    @Override // kotlin.text.p
    @org.jetbrains.annotations.NotNull
    public /* bridge */ kotlin.text.p.b a() {
            r1 = this;
            kotlin.text.p$b r0 = kotlin.text.p.a.a(r1)
            return r0
    }

    @Override // kotlin.text.p
    @org.jetbrains.annotations.NotNull
    public kotlin.text.n b() {
            r1 = this;
            kotlin.text.n r0 = r1.c
            return r0
    }

    @Override // kotlin.text.p
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> c() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.d
            if (r0 != 0) goto Lb
            kotlin.text.q$a r0 = new kotlin.text.q$a
            r0.<init>(r1)
            r1.d = r0
        Lb:
            java.util.List<java.lang.String> r0 = r1.d
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    @Override // kotlin.text.p
    @org.jetbrains.annotations.NotNull
    public kotlin.ranges.m d() {
            r1 = this;
            java.util.regex.MatchResult r0 = r1.f()
            kotlin.ranges.m r0 = kotlin.text.t.c(r0)
            return r0
    }

    @Override // kotlin.text.p
    @org.jetbrains.annotations.NotNull
    public java.lang.String getValue() {
            r2 = this;
            java.util.regex.MatchResult r0 = r2.f()
            java.lang.String r0 = r0.group()
            java.lang.String r1 = "group(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.text.p
    @org.jetbrains.annotations.Nullable
    public kotlin.text.p next() {
            r3 = this;
            java.util.regex.MatchResult r0 = r3.f()
            int r0 = r0.end()
            java.util.regex.MatchResult r1 = r3.f()
            int r1 = r1.end()
            java.util.regex.MatchResult r2 = r3.f()
            int r2 = r2.start()
            if (r1 != r2) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r3.b
            int r1 = r1.length()
            if (r0 > r1) goto L3e
            java.util.regex.Matcher r1 = r3.a
            java.util.regex.Pattern r1 = r1.pattern()
            java.lang.CharSequence r2 = r3.b
            java.util.regex.Matcher r1 = r1.matcher(r2)
            java.lang.String r2 = "matcher(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.CharSequence r2 = r3.b
            kotlin.text.p r0 = kotlin.text.t.a(r1, r0, r2)
            return r0
        L3e:
            r0 = 0
            return r0
    }
}
