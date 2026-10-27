package kotlin.comparisons;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class g {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class a<T> implements java.util.Comparator {
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> a;

        public a(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r2, T r3) {
                r1 = this;
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> r0 = r1.a
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                java.lang.Object r3 = r0.invoke(r3)
                java.lang.Comparable r3 = (java.lang.Comparable) r3
                int r2 = kotlin.comparisons.g.l(r2, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class b<T> implements java.util.Comparator {
        final /* synthetic */ java.util.Comparator<? super K> a;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> b;

        public b(java.util.Comparator<? super K> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                java.util.Comparator<? super K> r0 = r2.a
                kotlin.jvm.functions.Function1<T, K> r1 = r2.b
                java.lang.Object r3 = r1.invoke(r3)
                java.lang.Object r4 = r1.invoke(r4)
                int r3 = r0.compare(r3, r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class c<T> implements java.util.Comparator {
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> a;

        public c(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r2, T r3) {
                r1 = this;
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> r0 = r1.a
                java.lang.Object r3 = r0.invoke(r3)
                java.lang.Comparable r3 = (java.lang.Comparable) r3
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                int r2 = kotlin.comparisons.g.l(r3, r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class d<T> implements java.util.Comparator {
        final /* synthetic */ java.util.Comparator<? super K> a;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> b;

        public d(java.util.Comparator<? super K> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                java.util.Comparator<? super K> r0 = r2.a
                kotlin.jvm.functions.Function1<T, K> r1 = r2.b
                java.lang.Object r4 = r1.invoke(r4)
                java.lang.Object r3 = r1.invoke(r3)
                int r3 = r0.compare(r4, r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class e<T> implements java.util.Comparator {
        final /* synthetic */ java.util.Comparator<T> a;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> b;

        public e(java.util.Comparator<T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r2, T r3) {
                r1 = this;
                java.util.Comparator<T> r0 = r1.a
                int r0 = r0.compare(r2, r3)
                if (r0 == 0) goto L9
                return r0
            L9:
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> r0 = r1.b
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                java.lang.Object r3 = r0.invoke(r3)
                java.lang.Comparable r3 = (java.lang.Comparable) r3
                int r2 = kotlin.comparisons.g.l(r2, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class f<T> implements java.util.Comparator {
        final /* synthetic */ java.util.Comparator<T> a;
        final /* synthetic */ java.util.Comparator<? super K> b;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> c;

        public f(java.util.Comparator<T> r1, java.util.Comparator<? super K> r2, kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                java.util.Comparator<T> r0 = r2.a
                int r0 = r0.compare(r3, r4)
                if (r0 == 0) goto L9
                return r0
            L9:
                java.util.Comparator<? super K> r0 = r2.b
                kotlin.jvm.functions.Function1<T, K> r1 = r2.c
                java.lang.Object r3 = r1.invoke(r3)
                java.lang.Object r4 = r1.invoke(r4)
                int r3 = r0.compare(r3, r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    public static final class C0014g<T> implements java.util.Comparator {
        final /* synthetic */ java.util.Comparator<T> a;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> b;

        public C0014g(java.util.Comparator<T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r2, T r3) {
                r1 = this;
                java.util.Comparator<T> r0 = r1.a
                int r0 = r0.compare(r2, r3)
                if (r0 == 0) goto L9
                return r0
            L9:
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>> r0 = r1.b
                java.lang.Object r3 = r0.invoke(r3)
                java.lang.Comparable r3 = (java.lang.Comparable) r3
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                int r2 = kotlin.comparisons.g.l(r3, r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class h<T> implements java.util.Comparator {
        final /* synthetic */ java.util.Comparator<T> a;
        final /* synthetic */ java.util.Comparator<? super K> b;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> c;

        public h(java.util.Comparator<T> r1, java.util.Comparator<? super K> r2, kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                java.util.Comparator<T> r0 = r2.a
                int r0 = r0.compare(r3, r4)
                if (r0 == 0) goto L9
                return r0
            L9:
                java.util.Comparator<? super K> r0 = r2.b
                kotlin.jvm.functions.Function1<T, K> r1 = r2.c
                java.lang.Object r4 = r1.invoke(r4)
                java.lang.Object r3 = r1.invoke(r3)
                int r3 = r0.compare(r4, r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class i<T> implements java.util.Comparator {
        final /* synthetic */ java.util.Comparator<T> a;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, T, java.lang.Integer> b;

        public i(java.util.Comparator<T> r1, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Integer> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r2, T r3) {
                r1 = this;
                java.util.Comparator<T> r0 = r1.a
                int r0 = r0.compare(r2, r3)
                if (r0 == 0) goto L9
                return r0
            L9:
                kotlin.jvm.functions.Function2<T, T, java.lang.Integer> r0 = r1.b
                java.lang.Object r2 = r0.invoke(r2, r3)
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                return r2
        }
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int A(java.util.Comparator r0, java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = r0.compare(r2, r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            int r0 = r1.compare(r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T, K> java.util.Comparator<T> B(java.util.Comparator<T> r1, java.util.Comparator<? super K> r2, kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.comparisons.g$f r0 = new kotlin.comparisons.g$f
            r0.<init>(r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Comparator<T> C(java.util.Comparator<T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$e r0 = new kotlin.comparisons.g$e
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T, K> java.util.Comparator<T> D(java.util.Comparator<T> r1, java.util.Comparator<? super K> r2, kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.comparisons.g$h r0 = new kotlin.comparisons.g$h
            r0.<init>(r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Comparator<T> E(java.util.Comparator<T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$g r0 = new kotlin.comparisons.g$g
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Comparator<T> F(java.util.Comparator<T> r1, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Integer> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparison"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$i r0 = new kotlin.comparisons.g$i
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Comparator<T> G(@org.jetbrains.annotations.NotNull java.util.Comparator<T> r1, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.c r0 = new kotlin.comparisons.c
            r0.<init>(r1, r2)
            return r0
    }

    private static final int H(java.util.Comparator r0, java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = r0.compare(r2, r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            int r0 = r1.compare(r3, r2)
            return r0
    }

    public static /* synthetic */ int a(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = t(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int b(java.util.Comparator r0, java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = H(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int c(java.util.Comparator r0, java.util.Comparator r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = A(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int d(kotlin.jvm.functions.Function1[] r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = i(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int e(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = w(r0, r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T, K> java.util.Comparator<T> f(java.util.Comparator<? super K> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$b r0 = new kotlin.comparisons.g$b
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Comparator<T> g(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.comparisons.g$a r0 = new kotlin.comparisons.g$a
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Comparator<T> h(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... r1) {
            java.lang.String r0 = "selectors"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Le
            kotlin.comparisons.e r0 = new kotlin.comparisons.e
            r0.<init>(r1)
            return r0
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r1.<init>(r0)
            throw r1
    }

    private static final int i(kotlin.jvm.functions.Function1[] r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = p(r1, r2, r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T, K> java.util.Comparator<T> j(java.util.Comparator<? super K> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$d r0 = new kotlin.comparisons.g$d
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Comparator<T> k(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r1) {
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.comparisons.g$c r0 = new kotlin.comparisons.g$c
            r0.<init>(r1)
            return r0
    }

    public static <T extends java.lang.Comparable<?>> int l(@org.jetbrains.annotations.Nullable T r0, @org.jetbrains.annotations.Nullable T r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compareTo(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T, K> int m(T r1, T r2, java.util.Comparator<? super K> r3, kotlin.jvm.functions.Function1<? super T, ? extends K> r4) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Object r2 = r4.invoke(r2)
            int r1 = r3.compare(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> int n(T r1, T r2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> r3) {
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r2 = r3.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r1 = l(r1, r2)
            return r1
    }

    public static final <T> int o(T r1, T r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... r3) {
            java.lang.String r0 = "selectors"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            if (r0 <= 0) goto Ld
            int r1 = p(r1, r2, r3)
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            r1.<init>(r2)
            throw r1
    }

    private static final <T> int p(T r5, T r6, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L1d
            r3 = r7[r2]
            java.lang.Object r4 = r3.invoke(r5)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r3 = r3.invoke(r6)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = l(r4, r3)
            if (r3 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto L3
        L1d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> q() {
            kotlin.comparisons.j r0 = kotlin.comparisons.j.a
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> r() {
            java.util.Comparator r0 = q()
            java.util.Comparator r0 = s(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Comparator<T> s(@org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r1) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.comparisons.f r0 = new kotlin.comparisons.f
            r0.<init>(r1)
            return r0
    }

    private static final int t(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            if (r1 != r2) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r2 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compare(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> u() {
            java.util.Comparator r0 = q()
            java.util.Comparator r0 = v(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Comparator<T> v(@org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r1) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.comparisons.b r0 = new kotlin.comparisons.b
            r0.<init>(r1)
            return r0
    }

    private static final int w(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            if (r1 != r2) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 != 0) goto L8
            r0 = 1
            return r0
        L8:
            if (r2 != 0) goto Lc
            r0 = -1
            return r0
        Lc:
            int r0 = r0.compare(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> x() {
            kotlin.comparisons.k r0 = kotlin.comparisons.k.a
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Comparator<T> y(@org.jetbrains.annotations.NotNull java.util.Comparator<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.comparisons.l
            if (r0 == 0) goto L10
            kotlin.comparisons.l r3 = (kotlin.comparisons.l) r3
            java.util.Comparator r3 = r3.a()
            return r3
        L10:
            kotlin.comparisons.j r0 = kotlin.comparisons.j.a
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r0)
            java.lang.String r2 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>"
            if (r1 == 0) goto L20
            kotlin.comparisons.k r3 = kotlin.comparisons.k.a
            kotlin.jvm.internal.g0.n(r3, r2)
            return r3
        L20:
            kotlin.comparisons.k r1 = kotlin.comparisons.k.a
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r1 == 0) goto L2c
            kotlin.jvm.internal.g0.n(r0, r2)
            return r0
        L2c:
            kotlin.comparisons.l r0 = new kotlin.comparisons.l
            r0.<init>(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Comparator<T> z(@org.jetbrains.annotations.NotNull java.util.Comparator<T> r1, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.d r0 = new kotlin.comparisons.d
            r0.<init>(r1, r2)
            return r0
    }
}
