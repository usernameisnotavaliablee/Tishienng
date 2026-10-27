package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3218:1\n183#1,2:3219\n320#1,7:3221\n1332#1,3:3229\n747#1,4:3232\n712#1,4:3236\n730#1,4:3240\n783#1,4:3244\n1025#1,3:3248\n1028#1,3:3258\n1045#1,3:3261\n1048#1,3:3271\n1332#1,3:3288\n1321#1,2:3291\n1#2:3228\n382#3,7:3251\n382#3,7:3264\n382#3,7:3274\n382#3,7:3281\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n91#1:3219,2\n103#1:3221,7\n462#1:3229,3\n666#1:3232,4\n682#1:3236,4\n697#1:3240,4\n768#1:3244,4\n996#1:3248,3\n996#1:3258,3\n1011#1:3261,3\n1011#1:3271,3\n1114#1:3288,3\n1152#1:3291,2\n996#1:3251,7\n1011#1:3264,7\n1027#1:3274,7\n1047#1:3281,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class k0 extends kotlin.sequences.z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n3027#2:71\n*E\n"})
    public static final class a<T> implements java.lang.Iterable<T>, l3.a {
        final /* synthetic */ kotlin.sequences.m a;

        public a(kotlin.sequences.m r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r1 = this;
                kotlin.sequences.m r0 = r1.a
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3218:1\n*E\n"})
    public static final class b implements kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> {
        public static final kotlin.sequences.k0.b a = null;

        static {
                kotlin.sequences.k0$b r0 = new kotlin.sequences.k0$b
                r0.<init>()
                kotlin.sequences.k0.b.a = r0
                return
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Boolean a(java.lang.Object r3) {
                r2 = this;
                r0 = 3
                java.lang.String r1 = "R"
                kotlin.jvm.internal.g0.y(r0, r1)
                boolean r3 = androidx.activity.k.a(r3)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class c<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Iterable<? extends R>, java.util.Iterator<? extends R>> {
        public static final kotlin.sequences.k0.c a = null;

        static {
                kotlin.sequences.k0$c r0 = new kotlin.sequences.k0$c
                r0.<init>()
                kotlin.sequences.k0.c.a = r0
                return
        }

        c() {
                r6 = this;
                java.lang.String r4 = "iterator()Ljava/util/Iterator;"
                r5 = 0
                r1 = 1
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                java.lang.String r3 = "iterator"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.util.Iterator<R> c(java.lang.Iterable<? extends R> r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Iterator r2 = r2.iterator()
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r0.c(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class d<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.sequences.m<? extends R>, java.util.Iterator<? extends R>> {
        public static final kotlin.sequences.k0.d a = null;

        static {
                kotlin.sequences.k0$d r0 = new kotlin.sequences.k0$d
                r0.<init>()
                kotlin.sequences.k0.d.a = r0
                return
        }

        d() {
                r6 = this;
                java.lang.String r4 = "iterator()Ljava/util/Iterator;"
                r5 = 0
                r1 = 1
                java.lang.Class<kotlin.sequences.m> r2 = kotlin.sequences.m.class
                java.lang.String r3 = "iterator"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.util.Iterator<R> c(kotlin.sequences.m<? extends R> r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Iterator r2 = r2.iterator()
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.sequences.m r1 = (kotlin.sequences.m) r1
                java.util.Iterator r1 = r0.c(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class e<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Iterable<? extends R>, java.util.Iterator<? extends R>> {
        public static final kotlin.sequences.k0.e a = null;

        static {
                kotlin.sequences.k0$e r0 = new kotlin.sequences.k0$e
                r0.<init>()
                kotlin.sequences.k0.e.a = r0
                return
        }

        e() {
                r6 = this;
                java.lang.String r4 = "iterator()Ljava/util/Iterator;"
                r5 = 0
                r1 = 1
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                java.lang.String r3 = "iterator"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.util.Iterator<R> c(java.lang.Iterable<? extends R> r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Iterator r2 = r2.iterator()
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r0.c(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class f<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.sequences.m<? extends R>, java.util.Iterator<? extends R>> {
        public static final kotlin.sequences.k0.f a = null;

        static {
                kotlin.sequences.k0$f r0 = new kotlin.sequences.k0$f
                r0.<init>()
                kotlin.sequences.k0.f.a = r0
                return
        }

        f() {
                r6 = this;
                java.lang.String r4 = "iterator()Ljava/util/Iterator;"
                r5 = 0
                r1 = 1
                java.lang.Class<kotlin.sequences.m> r2 = kotlin.sequences.m.class
                java.lang.String r3 = "iterator"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.util.Iterator<R> c(kotlin.sequences.m<? extends R> r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Iterator r2 = r2.iterator()
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.sequences.m r1 = (kotlin.sequences.m) r1
                java.util.Iterator r1 = r0.c(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3218:1\n*E\n"})
    public static final class g<K, T> implements kotlin.collections.w0<T, K> {
        final /* synthetic */ kotlin.sequences.m<T> a;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> b;

        public g(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.collections.w0
        public K a(T r2) {
                r1 = this;
                kotlin.jvm.functions.Function1<T, K> r0 = r1.b
                java.lang.Object r2 = r0.invoke(r2)
                return r2
        }

        @Override // kotlin.collections.w0
        public java.util.Iterator<T> b() {
                r1 = this;
                kotlin.sequences.m<T> r0 = r1.a
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class h<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ kotlin.sequences.m<T> a;
        final /* synthetic */ T b;

        h(kotlin.sequences.m<? extends T> r1, T r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean c(kotlin.jvm.internal.Ref.BooleanRef r0, java.lang.Object r1, java.lang.Object r2) {
                boolean r0 = d(r0, r1, r2)
                return r0
        }

        private static final boolean d(kotlin.jvm.internal.Ref.BooleanRef r2, java.lang.Object r3, java.lang.Object r4) {
                boolean r0 = r2.element
                r1 = 1
                if (r0 != 0) goto Lf
                boolean r3 = kotlin.jvm.internal.g0.g(r4, r3)
                if (r3 == 0) goto Lf
                r2.element = r1
                r2 = 0
                return r2
            Lf:
                return r1
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r4 = this;
                kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
                r0.<init>()
                kotlin.sequences.m<T> r1 = r4.a
                T r2 = r4.b
                kotlin.sequences.l0 r3 = new kotlin.sequences.l0
                r3.<init>(r0, r2)
                kotlin.sequences.m r0 = kotlin.sequences.k0.P0(r1, r3)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class i<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ kotlin.sequences.m<T> a;
        final /* synthetic */ T[] b;

        i(kotlin.sequences.m<? extends T> r1, T[] r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean c(java.lang.Object[] r0, java.lang.Object r1) {
                boolean r0 = d(r0, r1)
                return r0
        }

        private static final boolean d(java.lang.Object[] r0, java.lang.Object r1) {
                boolean r0 = kotlin.collections.n.B8(r0, r1)
                return r0
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r3 = this;
                kotlin.sequences.m<T> r0 = r3.a
                T[] r1 = r3.b
                kotlin.sequences.m0 r2 = new kotlin.sequences.m0
                r2.<init>(r1)
                kotlin.sequences.m r0 = kotlin.sequences.k0.W0(r0, r2)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class j<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ java.lang.Iterable<T> a;
        final /* synthetic */ kotlin.sequences.m<T> b;

        j(java.lang.Iterable<? extends T> r1, kotlin.sequences.m<? extends T> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean c(java.util.Collection r0, java.lang.Object r1) {
                boolean r0 = d(r0, r1)
                return r0
        }

        private static final boolean d(java.util.Collection r0, java.lang.Object r1) {
                boolean r0 = r0.contains(r1)
                return r0
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r3 = this;
                java.lang.Iterable<T> r0 = r3.a
                java.util.Collection r0 = kotlin.collections.f0.v0(r0)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L13
                kotlin.sequences.m<T> r0 = r3.b
                java.util.Iterator r0 = r0.iterator()
                return r0
            L13:
                kotlin.sequences.m<T> r1 = r3.b
                kotlin.sequences.n0 r2 = new kotlin.sequences.n0
                r2.<init>(r0)
                kotlin.sequences.m r0 = kotlin.sequences.k0.W0(r1, r2)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class k<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ kotlin.sequences.m<T> a;
        final /* synthetic */ kotlin.sequences.m<T> b;

        k(kotlin.sequences.m<? extends T> r1, kotlin.sequences.m<? extends T> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean c(java.util.List r0, java.lang.Object r1) {
                boolean r0 = d(r0, r1)
                return r0
        }

        private static final boolean d(java.util.List r0, java.lang.Object r1) {
                boolean r0 = r0.contains(r1)
                return r0
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r3 = this;
                kotlin.sequences.m<T> r0 = r3.a
                java.util.List r0 = kotlin.sequences.k0.I3(r0)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L13
                kotlin.sequences.m<T> r0 = r3.b
                java.util.Iterator r0 = r0.iterator()
                return r0
            L13:
                kotlin.sequences.m<T> r1 = r3.b
                kotlin.sequences.o0 r2 = new kotlin.sequences.o0
                r2.<init>(r0)
                kotlin.sequences.m r0 = kotlin.sequences.k0.W0(r1, r2)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2423, 2427}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element"}, nl = {2424, 2429}, s = {"L$0", "L$0", "L$1", "L$3"}, v = 2)
    static final class l<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        private /* synthetic */ java.lang.Object e;
        final /* synthetic */ R f;
        final /* synthetic */ kotlin.sequences.m<T> g;
        final /* synthetic */ kotlin.jvm.functions.Function2<R, T, R> h;

        l(R r1, kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r3, kotlin.coroutines.e<? super kotlin.sequences.k0.l> r4) {
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
                kotlin.sequences.k0$l r0 = new kotlin.sequences.k0$l
                R r1 = r4.f
                kotlin.sequences.m<T> r2 = r4.g
                kotlin.jvm.functions.Function2<R, T, R> r3 = r4.h
                r0.<init>(r1, r2, r3, r6)
                r0.e = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlin.sequences.o<? super R> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.sequences.k0$l r1 = (kotlin.sequences.k0.l) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = r6.e
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r6.d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L29
                if (r2 == r4) goto L25
                if (r2 != r3) goto L1d
                java.lang.Object r2 = r6.b
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r6.a
                kotlin.g0.n(r7)
                r7 = r4
                goto L41
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                kotlin.g0.n(r7)
                goto L39
            L29:
                kotlin.g0.n(r7)
                R r7 = r6.f
                r6.e = r0
                r6.d = r4
                java.lang.Object r7 = r0.c(r7, r6)
                if (r7 != r1) goto L39
                goto L65
            L39:
                R r7 = r6.f
                kotlin.sequences.m<T> r2 = r6.g
                java.util.Iterator r2 = r2.iterator()
            L41:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L66
                java.lang.Object r4 = r2.next()
                kotlin.jvm.functions.Function2<R, T, R> r5 = r6.h
                java.lang.Object r7 = r5.invoke(r7, r4)
                r6.e = r0
                r6.a = r7
                r6.b = r2
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r4)
                r6.c = r4
                r6.d = r3
                java.lang.Object r4 = r0.c(r7, r6)
                if (r4 != r1) goto L41
            L65:
                return r1
            L66:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1, 1}, l = {2451, 2456}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element", "index"}, nl = {2452, 2458}, s = {"L$0", "L$0", "L$1", "L$3", "I$0"}, v = 2)
    static final class m<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        int e;
        private /* synthetic */ java.lang.Object f;
        final /* synthetic */ R g;
        final /* synthetic */ kotlin.sequences.m<T> h;
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, R, T, R> i;

        m(R r1, kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> r3, kotlin.coroutines.e<? super kotlin.sequences.k0.m> r4) {
                r0 = this;
                r0.g = r1
                r0.h = r2
                r0.i = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r5, kotlin.coroutines.e<?> r6) {
                r4 = this;
                kotlin.sequences.k0$m r0 = new kotlin.sequences.k0$m
                R r1 = r4.g
                kotlin.sequences.m<T> r2 = r4.h
                kotlin.jvm.functions.Function3<java.lang.Integer, R, T, R> r3 = r4.i
                r0.<init>(r1, r2, r3, r6)
                r0.f = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlin.sequences.o<? super R> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.sequences.k0$m r1 = (kotlin.sequences.k0.m) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = r8.f
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r8.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                int r2 = r8.d
                java.lang.Object r4 = r8.b
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r8.a
                kotlin.g0.n(r9)
                r9 = r5
                goto L46
            L1f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L27:
                kotlin.g0.n(r9)
                goto L3b
            L2b:
                kotlin.g0.n(r9)
                R r9 = r8.g
                r8.f = r0
                r8.e = r4
                java.lang.Object r9 = r0.c(r9, r8)
                if (r9 != r1) goto L3b
                goto L77
            L3b:
                R r9 = r8.g
                kotlin.sequences.m<T> r2 = r8.h
                java.util.Iterator r2 = r2.iterator()
                r4 = 0
                r4 = r2
                r2 = 0
            L46:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L7a
                java.lang.Object r5 = r4.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, R, T, R> r6 = r8.i
                int r7 = r2 + 1
                if (r2 >= 0) goto L59
                kotlin.collections.f0.b0()
            L59:
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.f(r2)
                java.lang.Object r9 = r6.invoke(r2, r9, r5)
                r8.f = r0
                r8.a = r9
                r8.b = r4
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r5)
                r8.c = r2
                r8.d = r7
                r8.e = r3
                java.lang.Object r2 = r0.c(r9, r8)
                if (r2 != r1) goto L78
            L77:
                return r1
            L78:
                r2 = r7
                goto L46
            L7a:
                kotlin.n1 r9 = kotlin.n1.a
                return r9
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2480, 2483}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, nl = {2481, 2486}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
    static final class n<S> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super S>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        private /* synthetic */ java.lang.Object d;
        final /* synthetic */ kotlin.sequences.m<T> e;
        final /* synthetic */ kotlin.jvm.functions.Function2<S, T, S> f;

        n(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> r2, kotlin.coroutines.e<? super kotlin.sequences.k0.n> r3) {
                r0 = this;
                r0.e = r1
                r0.f = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlin.sequences.k0$n r0 = new kotlin.sequences.k0$n
                kotlin.sequences.m<T> r1 = r3.e
                kotlin.jvm.functions.Function2<S, T, S> r2 = r3.f
                r0.<init>(r1, r2, r5)
                r0.d = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlin.sequences.o<? super S> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.sequences.k0$n r1 = (kotlin.sequences.k0.n) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = r6.d
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r6.c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r2 = r6.b
                java.lang.Object r4 = r6.a
                java.util.Iterator r4 = (java.util.Iterator) r4
                kotlin.g0.n(r7)
                goto L48
            L25:
                kotlin.g0.n(r7)
                kotlin.sequences.m<T> r7 = r6.e
                java.util.Iterator r7 = r7.iterator()
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L67
                java.lang.Object r2 = r7.next()
                r6.d = r0
                r6.a = r7
                r6.b = r2
                r6.c = r4
                java.lang.Object r4 = r0.c(r2, r6)
                if (r4 != r1) goto L47
                goto L66
            L47:
                r4 = r7
            L48:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L67
                kotlin.jvm.functions.Function2<S, T, S> r7 = r6.f
                java.lang.Object r5 = r4.next()
                java.lang.Object r2 = r7.invoke(r2, r5)
                r6.d = r0
                r6.a = r4
                r6.b = r2
                r6.c = r3
                java.lang.Object r7 = r0.c(r2, r6)
                if (r7 != r1) goto L48
            L66:
                return r1
            L67:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2509, 2513}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, nl = {2510, 2516}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"}, v = 2)
    static final class o<S> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super S>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        int d;
        private /* synthetic */ java.lang.Object e;
        final /* synthetic */ kotlin.sequences.m<T> f;
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, S, T, S> g;

        o(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> r2, kotlin.coroutines.e<? super kotlin.sequences.k0.o> r3) {
                r0 = this;
                r0.f = r1
                r0.g = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlin.sequences.k0$o r0 = new kotlin.sequences.k0$o
                kotlin.sequences.m<T> r1 = r3.f
                kotlin.jvm.functions.Function3<java.lang.Integer, S, T, S> r2 = r3.g
                r0.<init>(r1, r2, r5)
                r0.e = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlin.sequences.o<? super S> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.sequences.k0$o r1 = (kotlin.sequences.k0.o) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = r9.e
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r9.d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L33
                if (r2 == r4) goto L29
                if (r2 != r3) goto L21
                int r2 = r9.c
                java.lang.Object r4 = r9.b
                java.lang.Object r5 = r9.a
                java.util.Iterator r5 = (java.util.Iterator) r5
                kotlin.g0.n(r10)
                r8 = r4
                r4 = r2
                r2 = r8
                goto L55
            L21:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L29:
                java.lang.Object r2 = r9.b
                java.lang.Object r5 = r9.a
                java.util.Iterator r5 = (java.util.Iterator) r5
                kotlin.g0.n(r10)
                goto L55
            L33:
                kotlin.g0.n(r10)
                kotlin.sequences.m<T> r10 = r9.f
                java.util.Iterator r5 = r10.iterator()
                boolean r10 = r5.hasNext()
                if (r10 == 0) goto L84
                java.lang.Object r2 = r5.next()
                r9.e = r0
                r9.a = r5
                r9.b = r2
                r9.d = r4
                java.lang.Object r10 = r0.c(r2, r9)
                if (r10 != r1) goto L55
                goto L80
            L55:
                boolean r10 = r5.hasNext()
                if (r10 == 0) goto L84
                kotlin.jvm.functions.Function3<java.lang.Integer, S, T, S> r10 = r9.g
                int r6 = r4 + 1
                if (r4 >= 0) goto L64
                kotlin.collections.f0.b0()
            L64:
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
                java.lang.Object r7 = r5.next()
                java.lang.Object r4 = r10.invoke(r4, r2, r7)
                r9.e = r0
                r9.a = r5
                r9.b = r4
                r9.c = r6
                r9.d = r3
                java.lang.Object r10 = r0.c(r4, r9)
                if (r10 != r1) goto L81
            L80:
                return r1
            L81:
                r2 = r4
                r4 = r6
                goto L55
            L84:
                kotlin.n1 r10 = kotlin.n1.a
                return r10
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class p<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ kotlin.sequences.m<T> a;

        p(kotlin.sequences.m<? extends T> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r1 = this;
                kotlin.sequences.m<T> r0 = r1.a
                java.util.List r0 = kotlin.sequences.k0.J3(r0)
                kotlin.collections.f0.o0(r0)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class q<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ kotlin.sequences.m<T> a;
        final /* synthetic */ java.util.Comparator<? super T> b;

        q(kotlin.sequences.m<? extends T> r1, java.util.Comparator<? super T> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r2 = this;
                kotlin.sequences.m<T> r0 = r2.a
                java.util.List r0 = kotlin.sequences.k0.J3(r0)
                java.util.Comparator<? super T> r1 = r2.b
                kotlin.collections.f0.r0(r0, r1)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0, 0}, l = {2979}, m = "invokeSuspend", n = {"$this$result", "iterator", "current", "next"}, nl = {2980}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
    static final class r<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        private /* synthetic */ java.lang.Object e;
        final /* synthetic */ kotlin.sequences.m<T> f;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, T, R> g;

        r(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> r2, kotlin.coroutines.e<? super kotlin.sequences.k0.r> r3) {
                r0 = this;
                r0.f = r1
                r0.g = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlin.sequences.k0$r r0 = new kotlin.sequences.k0$r
                kotlin.sequences.m<T> r1 = r3.f
                kotlin.jvm.functions.Function2<T, T, R> r2 = r3.g
                r0.<init>(r1, r2, r5)
                r0.e = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlin.sequences.o<? super R> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.sequences.k0$r r1 = (kotlin.sequences.k0.r) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = r6.e
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r6.d
                r3 = 1
                if (r2 == 0) goto L21
                if (r2 != r3) goto L19
                java.lang.Object r2 = r6.c
                java.lang.Object r4 = r6.a
                java.util.Iterator r4 = (java.util.Iterator) r4
                kotlin.g0.n(r7)
                goto L38
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                kotlin.g0.n(r7)
                kotlin.sequences.m<T> r7 = r6.f
                java.util.Iterator r7 = r7.iterator()
                boolean r2 = r7.hasNext()
                if (r2 != 0) goto L33
                kotlin.n1 r7 = kotlin.n1.a
                return r7
            L33:
                java.lang.Object r2 = r7.next()
                r4 = r7
            L38:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L5f
                java.lang.Object r7 = r4.next()
                kotlin.jvm.functions.Function2<T, T, R> r5 = r6.g
                java.lang.Object r5 = r5.invoke(r2, r7)
                r6.e = r0
                r6.a = r4
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r2)
                r6.b = r2
                r6.c = r7
                r6.d = r3
                java.lang.Object r2 = r0.c(r5, r6)
                if (r2 != r1) goto L5d
                return r1
            L5d:
                r2 = r7
                goto L38
            L5f:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    public k0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmName(name = "averageOfShort")
    public static final double A0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Short> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.f0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K> kotlin.collections.w0<T, K> A1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.k0$g r0 = new kotlin.sequences.k0$g
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minOrThrow")
    public static final double A2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfLong")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> long A3(kotlin.sequences.m<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r0 = r0 + r2
            goto L10
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<java.util.List<T>> B0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            kotlin.sequences.m r1 = M3(r1, r2, r2, r0)
            return r1
    }

    public static final <T> int B1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r2.next()
            if (r0 >= 0) goto L19
            kotlin.collections.f0.b0()
        L19:
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r1 == 0) goto L20
            return r0
        L20:
            int r0 = r0 + 1
            goto La
        L23:
            r2 = -1
            return r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minOrThrow")
    public static final float B2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @kotlin.jvm.JvmName(name = "sumOfShort")
    public static final int B3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Short> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            int r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> C0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            kotlin.sequences.m r1 = N3(r1, r2, r2, r0, r3)
            return r1
    }

    public static final <T> int C1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            if (r0 >= 0) goto L1e
            kotlin.collections.f0.b0()
        L1e:
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2b
            return r0
        L2b:
            int r0 = r0 + 1
            goto Lf
        L2e:
            r2 = -1
            return r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minOrThrow")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T C2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L15
            r0 = r1
            goto L15
        L29:
            return r0
        L2a:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfUInt")
    private static final <T> int C3(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, kotlin.z0> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r0 = kotlin.z0.k(r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            kotlin.z0 r1 = (kotlin.z0) r1
            int r1 = r1.q0()
            int r0 = r0 + r1
            int r0 = kotlin.z0.k(r0)
            goto L13
        L2d:
            return r0
    }

    public static <T> boolean D0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = B1(r1, r2)
            if (r1 < 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static final <T> int D1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = -1
            r1 = 0
        L10:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r3.next()
            if (r1 >= 0) goto L1f
            kotlin.collections.f0.b0()
        L1f:
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2c
            r0 = r1
        L2c:
            int r1 = r1 + 1
            goto L10
        L2f:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T> T D2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L1a
            r0 = r1
            goto L1a
        L2c:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfULong")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> long D3(kotlin.sequences.m<? extends T> r4, kotlin.jvm.functions.Function1<? super T, kotlin.d1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            long r0 = kotlin.d1.k(r0)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            kotlin.d1 r2 = (kotlin.d1) r2
            long r2 = r2.q0()
            long r0 = r0 + r2
            long r0 = kotlin.d1.k(r0)
            goto L14
        L2e:
            return r0
    }

    public static <T> int E0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            r2.next()
            int r0 = r0 + 1
            if (r0 >= 0) goto La
            kotlin.collections.f0.a0()
            goto La
        L1b:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, A extends java.lang.Appendable> A E1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull A r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, int r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r8, r0)
            r3.append(r5)
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            int r5 = r5 + 1
            r1 = 1
            if (r5 <= r1) goto L38
            r3.append(r4)
        L38:
            if (r7 < 0) goto L3c
            if (r5 > r7) goto L40
        L3c:
            kotlin.text.u.b(r3, r0, r9)
            goto L26
        L40:
            if (r7 < 0) goto L47
            if (r5 <= r7) goto L47
            r3.append(r8)
        L47:
            r3.append(r6)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minWithOrThrow")
    public static final <T> T E2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L18
            r0 = r1
            goto L18
        L2a:
            return r0
        L2b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> E3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 < 0) goto L1f
            if (r2 != 0) goto Le
            kotlin.sequences.m r1 = kotlin.sequences.x.l()
            return r1
        Le:
            boolean r0 = r1 instanceof kotlin.sequences.e
            if (r0 == 0) goto L19
            kotlin.sequences.e r1 = (kotlin.sequences.e) r1
            kotlin.sequences.m r1 = r1.b(r2)
            return r1
        L19:
            kotlin.sequences.q0 r0 = new kotlin.sequences.q0
            r0.<init>(r1, r2)
            return r0
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Requested element count "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " is less than zero."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <T> int F0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lf
            int r0 = r0 + 1
            if (r0 >= 0) goto Lf
            kotlin.collections.f0.a0()
            goto Lf
        L2d:
            return r0
    }

    public static /* synthetic */ java.lang.Appendable F1(kotlin.sequences.m r6, java.lang.Appendable r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, java.lang.CharSequence r12, kotlin.jvm.functions.Function1 r13, int r14, java.lang.Object r15) {
            r0 = r14 & 2
            if (r0 == 0) goto L7
            java.lang.String r0 = ", "
            goto L8
        L7:
            r0 = r8
        L8:
            r1 = r14 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L10
            r1 = r2
            goto L11
        L10:
            r1 = r9
        L11:
            r3 = r14 & 8
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = r10
        L17:
            r3 = r14 & 16
            if (r3 == 0) goto L1d
            r3 = -1
            goto L1e
        L1d:
            r3 = r11
        L1e:
            r4 = r14 & 32
            if (r4 == 0) goto L25
            java.lang.String r4 = "..."
            goto L26
        L25:
            r4 = r12
        L26:
            r5 = r14 & 64
            if (r5 == 0) goto L34
            r5 = 0
            r15 = r5
        L2c:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            goto L36
        L34:
            r15 = r13
            goto L2c
        L36:
            java.lang.Appendable r0 = E1(r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> F2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.k0$j r0 = new kotlin.sequences.k0$j
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> F3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.r0 r0 = new kotlin.sequences.r0
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> G0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.j0 r0 = new kotlin.sequences.j0
            r0.<init>()
            kotlin.sequences.m r1 = I0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.String G1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r9, @org.jetbrains.annotations.NotNull java.lang.CharSequence r10, @org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12, int r13, @org.jetbrains.annotations.NotNull java.lang.CharSequence r14, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Appendable r9 = E1(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            java.lang.String r9 = r9.toString()
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> G2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.k0$h r0 = new kotlin.sequences.k0$h
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C G3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto Le
        L1c:
            return r2
    }

    private static final java.lang.Object H0(java.lang.Object r0) {
            return r0
    }

    public static /* synthetic */ java.lang.String H1(kotlin.sequences.m r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ", "
        L6:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto Ld
            r3 = r0
        Ld:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            r4 = r0
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L17
            r5 = -1
        L17:
            r9 = r8 & 16
            if (r9 == 0) goto L1d
            java.lang.String r6 = "..."
        L1d:
            r8 = r8 & 32
            if (r8 == 0) goto L22
            r7 = 0
        L22:
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            java.lang.String r1 = G1(r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> H2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.k0$k r0 = new kotlin.sequences.k0$k
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.HashSet<T> H3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Collection r1 = G3(r1, r0)
            java.util.HashSet r1 = (java.util.HashSet) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> kotlin.sequences.m<T> I0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.c r0 = new kotlin.sequences.c
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> T I1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            goto L13
        L1e:
            return r0
        L1f:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "Sequence is empty."
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> I2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Le
            return r1
        Le:
            kotlin.sequences.k0$i r0 = new kotlin.sequences.k0$i
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> I3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L14
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
        L14:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L23
            java.util.List r2 = kotlin.collections.f0.l(r0)
            return r2
        L23:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L2b
        L39:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> J0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 < 0) goto L1b
            if (r2 != 0) goto La
            return r1
        La:
            boolean r0 = r1 instanceof kotlin.sequences.e
            if (r0 == 0) goto L15
            kotlin.sequences.e r1 = (kotlin.sequences.e) r1
            kotlin.sequences.m r1 = r1.a(r2)
            return r1
        L15:
            kotlin.sequences.d r0 = new kotlin.sequences.d
            r0.<init>(r1, r2)
            return r0
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Requested element count "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " is less than zero."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <T> T J1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L10
            r1 = 1
            r0 = r2
            goto L10
        L29:
            if (r1 == 0) goto L2c
            return r0
        L2c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Sequence contains no element matching the predicate."
            r4.<init>(r5)
            throw r4
    }

    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.m<T> J2(kotlin.sequences.m<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = G2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> J3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = G3(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> K0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.f r0 = new kotlin.sequences.f
            r0.<init>(r1, r2)
            return r0
    }

    public static final <T> int K1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = -1
            r1 = 0
        Lb:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r3.next()
            if (r1 >= 0) goto L1a
            kotlin.collections.f0.b0()
        L1a:
            boolean r2 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r2 == 0) goto L21
            r0 = r1
        L21:
            int r1 = r1 + 1
            goto Lb
        L24:
            return r0
    }

    public static final <T> boolean K2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = r1.hasNext()
            r1 = r1 ^ 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> K3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto Le
        L1c:
            return r0
    }

    public static final <T> T L0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.f0 r0 = new kotlin.sequences.f0
            r0.<init>(r2)
            java.lang.Object r1 = N0(r1, r2, r0)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T L1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L11
            r2 = 0
            return r2
        L11:
            java.lang.Object r0 = r2.next()
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r0 = r2.next()
            goto L15
        L20:
            return r0
    }

    public static final <T> boolean L2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le
            r1 = 0
            return r1
        L26:
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> L3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L14
            java.util.Set r2 = kotlin.collections.u1.k()
            return r2
        L14:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L23
            java.util.Set r2 = kotlin.collections.u1.f(r0)
            return r2
        L23:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r1.add(r0)
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L2b
        L39:
            return r1
    }

    private static final java.lang.Object M0(int r2, int r3) {
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Sequence doesn't contain element at index "
            r0.append(r1)
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T M1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf
            r0 = r1
            goto Lf
        L27:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> M2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.h0 r0 = new kotlin.sequences.h0
            r0.<init>(r2)
            kotlin.sequences.m r1 = N1(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<java.util.List<T>> M3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, int r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            kotlin.sequences.m r1 = kotlin.collections.z1.c(r1, r2, r3, r4, r0)
            return r1
    }

    public static final <T> T N0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r4 >= 0) goto L15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r5.invoke(r3)
            return r3
        L15:
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r4 != r0) goto L29
            return r1
        L29:
            r0 = r2
            goto L1a
        L2b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r5.invoke(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static <T, R> kotlin.sequences.m<R> N1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.t0 r0 = new kotlin.sequences.t0
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.lang.Object N2(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> N3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, int r2, int r3, boolean r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 1
            kotlin.sequences.m r1 = kotlin.collections.z1.c(r1, r2, r3, r4, r0)
            kotlin.sequences.m r1 = N1(r1, r5)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T O0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            if (r5 >= 0) goto L9
            return r0
        L9:
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r5 != r1) goto L1d
            return r2
        L1d:
            r1 = r3
            goto Le
        L1f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> O1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.s0 r0 = new kotlin.sequences.s0
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> O2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.i0 r0 = new kotlin.sequences.i0
            r0.<init>(r2)
            kotlin.sequences.m r1 = O1(r1, r0)
            return r1
    }

    public static /* synthetic */ kotlin.sequences.m O3(kotlin.sequences.m r0, int r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            r3 = 0
        La:
            kotlin.sequences.m r0 = M3(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> P0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.h r0 = new kotlin.sequences.h
            r1 = 1
            r0.<init>(r2, r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> P1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.s0 r0 = new kotlin.sequences.s0
            r0.<init>(r1, r2)
            kotlin.sequences.m r1 = X0(r0)
            return r1
    }

    private static final java.lang.Object P2(kotlin.jvm.functions.Function2 r0, int r1, java.lang.Object r2) {
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r1, r2)
            return r2
    }

    public static /* synthetic */ kotlin.sequences.m P3(kotlin.sequences.m r0, int r1, int r2, boolean r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 1
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r3 = 0
        La:
            kotlin.sequences.m r0 = N3(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> Q0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.sequences.t0 r0 = new kotlin.sequences.t0
            kotlin.sequences.h r1 = new kotlin.sequences.h
            kotlin.sequences.k r2 = new kotlin.sequences.k
            r2.<init>(r3)
            kotlin.sequences.c0 r3 = new kotlin.sequences.c0
            r3.<init>(r4)
            r4 = 1
            r1.<init>(r2, r4, r3)
            kotlin.sequences.d0 r3 = new kotlin.sequences.d0
            r3.<init>()
            r0.<init>(r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C Q1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull C r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.f0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            if (r0 == 0) goto L32
            r4.add(r0)
        L32:
            r0 = r2
            goto L14
        L34:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.Pair<java.util.List<T>, java.util.List<T>> Q2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L32
            r0.add(r2)
            goto L18
        L32:
            r1.add(r2)
            goto L18
        L36:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r0, r1)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<kotlin.collections.a1<T>> Q3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.k r0 = new kotlin.sequences.k
            r0.<init>(r1)
            return r0
    }

    private static final boolean R0(kotlin.jvm.functions.Function2 r1, kotlin.collections.a1 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.e()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.f()
            java.lang.Object r1 = r1.invoke(r0, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C R1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull C r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.f0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            r4.add(r0)
            r0 = r2
            goto L14
        L32:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> R2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.m r3 = kotlin.collections.f0.E1(r3)
            r0 = 2
            kotlin.sequences.m[] r0 = new kotlin.sequences.m[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            kotlin.sequences.m r2 = kotlin.sequences.x.C(r0)
            kotlin.sequences.m r2 = kotlin.sequences.x.n(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<kotlin.Pair<T, R>> R3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.l r0 = new kotlin.sequences.l
            kotlin.sequences.a0 r1 = new kotlin.sequences.a0
            r1.<init>()
            r0.<init>(r2, r3, r1)
            return r0
    }

    private static final java.lang.Object S0(kotlin.collections.a1 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.f()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T, R> kotlin.sequences.m<R> S1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.t0 r0 = new kotlin.sequences.t0
            r0.<init>(r1, r2)
            kotlin.sequences.m r1 = X0(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> S2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.m r3 = kotlin.sequences.x.B(r3)
            r0 = 2
            kotlin.sequences.m[] r0 = new kotlin.sequences.m[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            kotlin.sequences.m r2 = kotlin.sequences.x.C(r0)
            kotlin.sequences.m r2 = kotlin.sequences.x.n(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, V> kotlin.sequences.m<V> S3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends R> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super R, ? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.l r0 = new kotlin.sequences.l
            r0.<init>(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C T0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull C r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.f0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
            r4.add(r1)
        L38:
            r0 = r2
            goto L14
        L3a:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C T1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            if (r0 == 0) goto L13
            r2.add(r0)
            goto L13
        L27:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> T2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 2
            kotlin.sequences.m[] r0 = new kotlin.sequences.m[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            kotlin.sequences.m r2 = kotlin.sequences.x.C(r0)
            kotlin.sequences.m r2 = kotlin.sequences.x.n(r2)
            return r2
    }

    private static final kotlin.Pair T3(java.lang.Object r0, java.lang.Object r1) {
            kotlin.Pair r0 = kotlin.o0.a(r0, r1)
            return r0
    }

    public static final /* synthetic */ <R> kotlin.sequences.m<R> U0(kotlin.sequences.m<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.jvm.internal.g0.w()
            kotlin.sequences.k0$b r0 = kotlin.sequences.k0.b.a
            kotlin.sequences.m r1 = P0(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"
            kotlin.jvm.internal.g0.n(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C U1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            r2.add(r0)
            goto L13
        L25:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> U2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.collections.n.t(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.m r1 = R2(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<kotlin.Pair<T, T>> U3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.e0 r0 = new kotlin.sequences.e0
            r0.<init>()
            kotlin.sequences.m r1 = V3(r1, r0)
            return r1
    }

    public static final /* synthetic */ <R, C extends java.util.Collection<? super R>> C V0(kotlin.sequences.m<?> r3, C r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            r1 = 3
            java.lang.String r2 = "R"
            kotlin.jvm.internal.g0.y(r1, r2)
            boolean r1 = androidx.activity.k.a(r0)
            if (r1 == 0) goto Le
            r4.add(r0)
            goto Le
        L28:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T, R extends java.lang.Comparable<? super R>> T V1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r5 = 0
            return r5
        L16:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L21
            return r0
        L21:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L27:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L39
            r0 = r2
            r1 = r3
        L39:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L27
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.m<T> V2(kotlin.sequences.m<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = S2(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> V3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.k0$r r0 = new kotlin.sequences.k0$r
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> W0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.h r0 = new kotlin.sequences.h
            r1 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxByOrThrow")
    public static final <T, R extends java.lang.Comparable<? super R>> T W1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L25:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L37
            r0 = r2
            r1 = r3
        L37:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L25
            return r0
        L3e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    public static final <S, T extends S> S W2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
        L18:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r0, r1)
            goto L18
        L27:
            return r0
        L28:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty sequence can't be reduced."
            r2.<init>(r3)
            throw r2
    }

    private static final kotlin.Pair W3(java.lang.Object r0, java.lang.Object r1) {
            kotlin.Pair r0 = kotlin.o0.a(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> X0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.g0 r0 = new kotlin.sequences.g0
            r0.<init>()
            kotlin.sequences.m r1 = W0(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>"
            kotlin.jvm.internal.g0.n(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> double X1(kotlin.sequences.m<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L22:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    public static final <S, T extends S> S X2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            r1 = 1
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L34
            int r2 = r1 + 1
            if (r1 >= 0) goto L26
            kotlin.collections.f0.b0()
        L26:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.invoke(r1, r0, r3)
            r1 = r2
            goto L19
        L34:
            return r0
        L35:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Empty sequence can't be reduced."
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ java.lang.Object Y(kotlin.sequences.m r0, java.lang.Object r1) {
            java.lang.Object r0 = b3(r0, r1)
            return r0
    }

    private static final boolean Y0(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> float Y1(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L22:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> S Y2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L16
            r4 = 0
            return r4
        L16:
            java.lang.Object r0 = r4.next()
            r1 = 1
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L36
            int r2 = r1 + 1
            if (r1 >= 0) goto L28
            kotlin.collections.f0.b0()
        L28:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.invoke(r1, r0, r3)
            r1 = r2
            goto L1b
        L36:
            return r0
    }

    public static /* synthetic */ kotlin.Pair Z(java.lang.Object r0, java.lang.Object r1) {
            kotlin.Pair r0 = W3(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <C extends java.util.Collection<? super T>, T> C Z0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto Le
            r2.add(r0)
            goto Le
        L1e:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R Z1(kotlin.sequences.m<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L1e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L1e
            r0 = r1
            goto L1e
        L36:
            return r0
        L37:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> S Z2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.Object r0 = r2.next()
        L1a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r0, r1)
            goto L1a
        L29:
            return r0
    }

    public static /* synthetic */ java.lang.Object a0(kotlin.jvm.functions.Function2 r0, int r1, java.lang.Object r2) {
            java.lang.Object r0 = P2(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C a1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull C r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L13
            r3.add(r0)
            goto L13
        L2d:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R a2(kotlin.sequences.m<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L20:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L20
            r0 = r1
            goto L20
        L38:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> a3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.b0 r0 = new kotlin.sequences.b0
            r0.<init>(r1)
            kotlin.sequences.m r1 = N1(r1, r0)
            return r1
    }

    public static /* synthetic */ java.lang.Object b0(java.lang.Object r0) {
            java.lang.Object r0 = H0(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C b1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull C r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L13
            r3.add(r0)
            goto L13
        L2d:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Double b2(kotlin.sequences.m<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L16
            r4 = 0
            return r4
        L16:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L24:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L24
        L3d:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    private static final java.lang.Object b3(kotlin.sequences.m r2, java.lang.Object r3) {
            if (r3 == 0) goto L3
            return r3
        L3:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null element found in "
            r0.append(r1)
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static /* synthetic */ boolean c0(kotlin.jvm.functions.Function2 r0, kotlin.collections.a1 r1) {
            boolean r0 = R0(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T c1(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
            return r0
        L25:
            r2 = 0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Float c2(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L24:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L24
        L3d:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> c3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, R r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.sequences.k0$l r0 = new kotlin.sequences.k0$l
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Object d0(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            java.lang.Object r0 = N2(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T d1(kotlin.sequences.m<? extends T> r3, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf
            r0 = r1
            goto Lf
        L27:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R d2(kotlin.sequences.m<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L21:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L21
            r0 = r1
            goto L21
        L37:
            return r0
        L38:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> d3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, R r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.sequences.k0$m r0 = new kotlin.sequences.k0$m
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Object e0(int r0, int r1) {
            java.lang.Object r0 = M0(r0, r1)
            return r0
    }

    public static final <T> T e1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r1 = r1.next()
            return r1
        L14:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Sequence is empty."
            r1.<init>(r0)
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R e2(kotlin.sequences.m<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1b
            r3 = 0
            return r3
        L1b:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L23:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L23
            r0 = r1
            goto L23
        L39:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <S, T extends S> kotlin.sequences.m<S> e3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.k0$n r0 = new kotlin.sequences.k0$n
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    public static /* synthetic */ kotlin.Pair f0(java.lang.Object r0, java.lang.Object r1) {
            kotlin.Pair r0 = T3(r0, r1)
            return r0
    }

    public static final <T> T f1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
            return r0
        L25:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "Sequence contains no element matching the predicate."
            r2.<init>(r3)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T extends java.lang.Comparable<? super T>> T f2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L11:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L17
            r0 = r1
            goto L17
        L2b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <S, T extends S> kotlin.sequences.m<S> f3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.k0$o r0 = new kotlin.sequences.k0$o
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    public static /* synthetic */ boolean g0(java.lang.Object r0) {
            boolean r0 = Y0(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <T, R> R g1(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != 0) goto L20
            goto Le
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L23
            return r0
        L23:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "No element of the sequence was transformed to a non-null value."
            r1.<init>(r2)
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Double g2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L11
            r4 = 0
            return r4
        L11:
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L1b
        L30:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> g3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.m r1 = c3(r1, r2, r3)
            return r1
    }

    public static /* synthetic */ java.lang.Object h0(kotlin.collections.a1 r0) {
            java.lang.Object r0 = S0(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <T, R> R h1(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 == 0) goto Le
            return r0
        L1f:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float h2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L11
            r2 = 0
            return r2
        L11:
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L1b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L1b
        L30:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.sequences.m<R> h3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.m r1 = d3(r1, r2, r3)
            return r1
    }

    public static final <T> boolean i0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Le
            r1 = 0
            return r1
        L26:
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T i1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L11
            r1 = 0
            return r1
        L11:
            java.lang.Object r1 = r1.next()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxOrThrow")
    public static final double i2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    public static final <T> T i3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L1a
            return r0
        L1a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sequence has more than one element."
            r1.<init>(r0)
            throw r1
        L22:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Sequence is empty."
            r1.<init>(r0)
            throw r1
    }

    public static final <T> boolean j0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = r1.hasNext()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T j1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
            return r0
        L25:
            r2 = 0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxOrThrow")
    public static final float j2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    public static final <T> T j3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L10
            if (r1 != 0) goto L2b
            r1 = 1
            r0 = r2
            goto L10
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Sequence contains more than one matching element."
            r4.<init>(r5)
            throw r4
        L33:
            if (r1 == 0) goto L36
            return r0
        L36:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Sequence contains no element matching the predicate."
            r4.<init>(r5)
            throw r4
    }

    public static final <T> boolean k0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        L26:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T, R> kotlin.sequences.m<R> k1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.sequences.m<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.i r0 = new kotlin.sequences.i
            kotlin.sequences.k0$d r1 = kotlin.sequences.k0.d.a
            r0.<init>(r2, r3, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxOrThrow")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T k2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L15
            r0 = r1
            goto L15
        L29:
            return r0
        L2a:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T k3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r0 = r2.next()
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L1c
            return r1
        L1c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.lang.Iterable<T> l0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.k0$a r0 = new kotlin.sequences.k0$a
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapIndexedIterable")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T, R> kotlin.sequences.m<R> l1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Iterable<? extends R>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.k0$e r0 = kotlin.sequences.k0.e.a
            kotlin.sequences.m r1 = kotlin.sequences.x.m(r1, r2, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T> T l2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L1a
            r0 = r1
            goto L1a
        L2c:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T l3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L11:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r5.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L11
            if (r1 == 0) goto L2a
            return r0
        L2a:
            r1 = 1
            r2 = r3
            goto L11
        L2d:
            if (r1 != 0) goto L30
            return r0
        L30:
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.m<T> m0(kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "flatMapIndexedIterableTo")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends java.util.Collection<? super R>> C m1(kotlin.sequences.m<? extends T> r3, C r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Iterable<? extends R>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.f0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.f0.s0(r4, r0)
            r0 = r2
            goto L14
        L34:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxWithOrThrow")
    public static final <T> T m2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L18
            r0 = r1
            goto L18
        L2a:
            return r0
        L2b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> kotlin.sequences.m<T> m3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.k0$p r0 = new kotlin.sequences.k0$p
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V> java.util.Map<K, V> n0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Pair<? extends K, ? extends V>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            r0.put(r2, r1)
            goto L13
        L2f:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapIndexedSequence")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T, R> kotlin.sequences.m<R> n1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.k0$f r0 = kotlin.sequences.k0.f.a
            kotlin.sequences.m r1 = kotlin.sequences.x.m(r1, r2, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T, R extends java.lang.Comparable<? super R>> T n2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r5 = 0
            return r5
        L16:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L21
            return r0
        L21:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L27:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L39
            r0 = r2
            r1 = r3
        L39:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L27
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R extends java.lang.Comparable<? super R>> kotlin.sequences.m<T> n3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$a r0 = new kotlin.comparisons.g$a
            r0.<init>(r2)
            kotlin.sequences.m r1 = q3(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> java.util.Map<K, T> o0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            r0.put(r2, r1)
            goto L13
        L25:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "flatMapIndexedSequenceTo")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends java.util.Collection<? super R>> C o1(kotlin.sequences.m<? extends T> r3, C r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.f0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            kotlin.sequences.m r0 = (kotlin.sequences.m) r0
            kotlin.collections.f0.t0(r4, r0)
            r0 = r2
            goto L14
        L34:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minByOrThrow")
    public static final <T, R extends java.lang.Comparable<? super R>> T o2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L25:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L37
            r0 = r2
            r1 = r3
        L37:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L25
            return r0
        L3e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R extends java.lang.Comparable<? super R>> kotlin.sequences.m<T> o3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$c r0 = new kotlin.comparisons.g$c
            r0.<init>(r2)
            kotlin.sequences.m r1 = q3(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V> java.util.Map<K, V> p0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Object r1 = r5.invoke(r1)
            r0.put(r2, r1)
            goto L18
        L2e:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapIterable")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T, R> kotlin.sequences.m<R> p1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.i r0 = new kotlin.sequences.i
            kotlin.sequences.k0$c r1 = kotlin.sequences.k0.c.a
            r0.<init>(r2, r3, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> double p2(kotlin.sequences.m<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L22:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> kotlin.sequences.m<T> p3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Comparator r0 = kotlin.comparisons.a.x()
            kotlin.sequences.m r1 = q3(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, M extends java.util.Map<? super K, ? super T>> M q0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            r3.put(r1, r0)
            goto L13
        L25:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapIterableTo")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends java.util.Collection<? super R>> C q1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.f0.s0(r2, r0)
            goto L13
        L27:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> float q2(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L22:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> q3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.k0$q r0 = new kotlin.sequences.k0$q
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V, M extends java.util.Map<? super K, ? super V>> M r0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Object r0 = r5.invoke(r0)
            r3.put(r1, r0)
            goto L18
        L2e:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C r1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.sequences.m<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            kotlin.sequences.m r0 = (kotlin.sequences.m) r0
            kotlin.collections.f0.t0(r2, r0)
            goto L13
        L27:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R r2(kotlin.sequences.m<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L1e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L1e
            r0 = r1
            goto L1e
        L36:
            return r0
        L37:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.Deprecated(message = "Use sumOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int r3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            goto Lf
        L25:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V, M extends java.util.Map<? super K, ? super V>> M s0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Pair<? extends K, ? extends V>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r4.invoke(r0)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r3.put(r1, r0)
            goto L13
        L2f:
            return r3
    }

    public static final <T, R> R s1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            java.lang.Object r2 = r3.invoke(r2, r0)
            goto Le
        L1d:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R s2(kotlin.sequences.m<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L20:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L20
            r0 = r1
            goto L20
        L38:
            return r0
    }

    @kotlin.Deprecated(message = "Use sumOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double s3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 + r2
            goto L10
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> t0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends K> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "valueSelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            r0.put(r1, r2)
            goto L13
        L25:
            return r0
    }

    public static final <T, R> R t1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L20
            kotlin.collections.f0.b0()
        L20:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r5.invoke(r0, r4, r1)
            r0 = r2
            goto Lf
        L2a:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Double t2(kotlin.sequences.m<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L16
            r4 = 0
            return r4
        L16:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L24:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L24
        L3d:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @kotlin.jvm.JvmName(name = "sumOfByte")
    public static final int t3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Byte> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            int r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M u0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends K> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "valueSelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            r3.put(r0, r1)
            goto L13
        L25:
            return r3
    }

    public static final <T> void u1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            r2.invoke(r0)
            goto Le
        L1c:
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Float u2(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L24:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L24
        L3d:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.jvm.JvmName(name = "sumOfDouble")
    public static final double u3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 + r2
            goto Lb
        L1d:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfByte")
    public static final double v0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Byte> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.f0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public static final <T> void v1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.n1> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L20
            kotlin.collections.f0.b0()
        L20:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r0, r1)
            r0 = r2
            goto Lf
        L29:
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R v2(kotlin.sequences.m<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L21:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L21
            r0 = r1
            goto L21
        L37:
            return r0
        L38:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfDouble")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> double v3(kotlin.sequences.m<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 + r2
            goto L10
        L26:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfDouble")
    public static final double w0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.f0.a0()
            goto Lc
        L25:
            if (r2 != 0) goto L2a
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2a:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> java.util.Map<K, java.util.List<T>> w1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r5.invoke(r1)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L2f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L2f:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto L13
        L35:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R w2(kotlin.sequences.m<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1b
            r3 = 0
            return r3
        L1b:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L23:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L23
            r0 = r1
            goto L23
        L39:
            return r0
    }

    @kotlin.jvm.JvmName(name = "sumOfFloat")
    public static final float w3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfFloat")
    public static final double x0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Float> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.f0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V> java.util.Map<K, java.util.List<V>> x1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r5.invoke(r1)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L34:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r6.invoke(r1)
            r3.add(r1)
            goto L18
        L3e:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T extends java.lang.Comparable<? super T>> T x2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L11:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L17
            r0 = r1
            goto L17
        L2b:
            return r0
    }

    @kotlin.jvm.JvmName(name = "sumOfInt")
    public static final int x3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Integer> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfInt")
    public static final double y0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Integer> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.f0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, M extends java.util.Map<? super K, java.util.List<T>>> M y1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull M r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            java.lang.Object r1 = r5.invoke(r0)
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L2f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.put(r1, r2)
        L2f:
            java.util.List r2 = (java.util.List) r2
            r2.add(r0)
            goto L13
        L35:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Double y2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L11
            r4 = 0
            return r4
        L11:
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L1b
        L30:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfInt")
    private static final <T> int y3(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            goto Lf
        L25:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfLong")
    public static final double z0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.f0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V, M extends java.util.Map<? super K, java.util.List<V>>> M z1(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3, @org.jetbrains.annotations.NotNull M r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r3.next()
            java.lang.Object r1 = r5.invoke(r0)
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L34
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.put(r1, r2)
        L34:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r6.invoke(r0)
            r2.add(r0)
            goto L18
        L3e:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float z2(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L11
            r2 = 0
            return r2
        L11:
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L1b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L1b
        L30:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.jvm.JvmName(name = "sumOfLong")
    public static final long z3(@org.jetbrains.annotations.NotNull kotlin.sequences.m<java.lang.Long> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r0 = r0 + r2
            goto Lb
        L1d:
            return r0
    }
}
