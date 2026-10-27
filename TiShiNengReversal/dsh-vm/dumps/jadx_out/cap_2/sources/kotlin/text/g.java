package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g implements kotlin.sequences.m<kotlin.ranges.m> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.CharSequence a;
    private final int b;
    private final int c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<kotlin.ranges.m>, l3.a {
        private int a;
        private int b;
        private int c;
        private kotlin.ranges.m d;
        private int e;
        final /* synthetic */ kotlin.text.g f;

        a(kotlin.text.g r3) {
                r2 = this;
                r2.f = r3
                r2.<init>()
                r0 = -1
                r2.a = r0
                int r0 = kotlin.text.g.f(r3)
                java.lang.CharSequence r3 = kotlin.text.g.d(r3)
                int r3 = r3.length()
                r1 = 0
                int r3 = kotlin.ranges.t.I(r0, r1, r3)
                r2.b = r3
                r2.c = r3
                return
        }

        private final void a() {
                r6 = this;
                int r0 = r6.c
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.a = r1
                r0 = 0
                r6.d = r0
                return
            Lb:
                kotlin.text.g r0 = r6.f
                int r0 = kotlin.text.g.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.e
                int r0 = r0 + r3
                r6.e = r0
                kotlin.text.g r4 = r6.f
                int r4 = kotlin.text.g.e(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.c
                kotlin.text.g r4 = r6.f
                java.lang.CharSequence r4 = kotlin.text.g.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                kotlin.ranges.m r0 = new kotlin.ranges.m
                int r1 = r6.b
                kotlin.text.g r4 = r6.f
                java.lang.CharSequence r4 = kotlin.text.g.d(r4)
                int r4 = kotlin.text.l0.y3(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.c = r2
                goto L9b
            L46:
                kotlin.text.g r0 = r6.f
                kotlin.jvm.functions.Function2 r0 = kotlin.text.g.c(r0)
                kotlin.text.g r4 = r6.f
                java.lang.CharSequence r4 = kotlin.text.g.d(r4)
                int r5 = r6.c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                kotlin.ranges.m r0 = new kotlin.ranges.m
                int r1 = r6.b
                kotlin.text.g r4 = r6.f
                java.lang.CharSequence r4 = kotlin.text.g.d(r4)
                int r4 = kotlin.text.l0.y3(r4)
                r0.<init>(r1, r4)
                r6.d = r0
                r6.c = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.b
                kotlin.ranges.m r4 = kotlin.ranges.t.W1(r4, r2)
                r6.d = r4
                int r2 = r2 + r0
                r6.b = r2
                if (r0 != 0) goto L98
                r1 = 1
            L98:
                int r2 = r2 + r1
                r6.c = r2
            L9b:
                r6.a = r3
                return
        }

        public final int c() {
                r1 = this;
                int r0 = r1.e
                return r0
        }

        public final int e() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final kotlin.ranges.m f() {
                r1 = this;
                kotlin.ranges.m r0 = r1.d
                return r0
        }

        public final int g() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        public final int h() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.a
                r1 = -1
                if (r0 != r1) goto L8
                r2.a()
            L8:
                int r0 = r2.a
                r1 = 1
                if (r0 != r1) goto Le
                return r1
            Le:
                r0 = 0
                return r0
        }

        public kotlin.ranges.m i() {
                r3 = this;
                int r0 = r3.a
                r1 = -1
                if (r0 != r1) goto L8
                r3.a()
            L8:
                int r0 = r3.a
                if (r0 == 0) goto L19
                kotlin.ranges.m r0 = r3.d
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.ranges.IntRange"
                kotlin.jvm.internal.g0.n(r0, r2)
                r2 = 0
                r3.d = r2
                r3.a = r1
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public final void j(int r1) {
                r0 = this;
                r0.e = r1
                return
        }

        public final void k(int r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public final void m(kotlin.ranges.m r1) {
                r0 = this;
                r0.d = r1
                return
        }

        public final void n(int r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ kotlin.ranges.m next() {
                r1 = this;
                kotlin.ranges.m r0 = r1.i()
                return r0
        }

        public final void o(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public g(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, int r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r5) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "getNextMatch"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 c(kotlin.text.g r0) {
            kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r0.d
            return r0
    }

    public static final /* synthetic */ java.lang.CharSequence d(kotlin.text.g r0) {
            java.lang.CharSequence r0 = r0.a
            return r0
    }

    public static final /* synthetic */ int e(kotlin.text.g r0) {
            int r0 = r0.c
            return r0
    }

    public static final /* synthetic */ int f(kotlin.text.g r0) {
            int r0 = r0.b
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.ranges.m> iterator() {
            r1 = this;
            kotlin.text.g$a r0 = new kotlin.text.g$a
            r0.<init>(r1)
            return r0
    }
}
