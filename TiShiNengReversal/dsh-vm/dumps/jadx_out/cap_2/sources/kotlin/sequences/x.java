package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class x extends kotlin.sequences.r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,731:1\n*E\n"})
    public static final class a<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.util.Iterator<T>> a;

        public a(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r1 = this;
                kotlin.jvm.functions.Function0<java.util.Iterator<T>> r0 = r1.a
                java.lang.Object r0 = r0.invoke()
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,731:1\n31#2:732\n*E\n"})
    public static final class b<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ java.util.Iterator a;

        public b(java.util.Iterator r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.util.Iterator r0 = r1.a
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0, 0, 0}, l = {383}, m = "invokeSuspend", n = {"$this$sequence", "element", "result", "index"}, nl = {385}, s = {"L$0", "L$2", "L$3", "I$0"}, v = 2)
    static final class c<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        int e;
        private /* synthetic */ java.lang.Object f;
        final /* synthetic */ kotlin.sequences.m<T> g;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, C> h;
        final /* synthetic */ kotlin.jvm.functions.Function1<C, java.util.Iterator<R>> i;

        c(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> r2, kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> r3, kotlin.coroutines.e<? super kotlin.sequences.x.c> r4) {
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
                kotlin.sequences.x$c r0 = new kotlin.sequences.x$c
                kotlin.sequences.m<T> r1 = r4.g
                kotlin.jvm.functions.Function2<java.lang.Integer, T, C> r2 = r4.h
                kotlin.jvm.functions.Function1<C, java.util.Iterator<R>> r3 = r4.i
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
                kotlin.sequences.x$c r1 = (kotlin.sequences.x.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = r7.f
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r7.e
                r3 = 1
                if (r2 == 0) goto L21
                if (r2 != r3) goto L19
                int r2 = r7.d
                java.lang.Object r4 = r7.a
                java.util.Iterator r4 = (java.util.Iterator) r4
                kotlin.g0.n(r8)
                goto L2c
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                kotlin.g0.n(r8)
                kotlin.sequences.m<T> r8 = r7.g
                java.util.Iterator r8 = r8.iterator()
                r2 = 0
                r4 = r8
            L2c:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L6c
                java.lang.Object r8 = r4.next()
                kotlin.jvm.functions.Function2<java.lang.Integer, T, C> r5 = r7.h
                int r6 = r2 + 1
                if (r2 >= 0) goto L3f
                kotlin.collections.f0.b0()
            L3f:
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.f(r2)
                java.lang.Object r2 = r5.invoke(r2, r8)
                kotlin.jvm.functions.Function1<C, java.util.Iterator<R>> r5 = r7.i
                java.lang.Object r5 = r5.invoke(r2)
                java.util.Iterator r5 = (java.util.Iterator) r5
                r7.f = r0
                r7.a = r4
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r8)
                r7.b = r8
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r2)
                r7.c = r8
                r7.d = r6
                r7.e = r3
                java.lang.Object r8 = r0.f(r5, r7)
                if (r8 != r1) goto L6a
                return r1
            L6a:
                r2 = r6
                goto L2c
            L6c:
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {0, 0, 1, 1}, l = {102, 104}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "$this$sequence", "iterator"}, nl = {104, 106}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
    static final class d<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        private /* synthetic */ java.lang.Object c;
        final /* synthetic */ kotlin.sequences.m<T> d;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.sequences.m<T>> e;

        d(kotlin.sequences.m<? extends T> r1, kotlin.jvm.functions.Function0<? extends kotlin.sequences.m<? extends T>> r2, kotlin.coroutines.e<? super kotlin.sequences.x.d> r3) {
                r0 = this;
                r0.d = r1
                r0.e = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlin.sequences.x$d r0 = new kotlin.sequences.x$d
                kotlin.sequences.m<T> r1 = r3.d
                kotlin.jvm.functions.Function0<kotlin.sequences.m<T>> r2 = r3.e
                r0.<init>(r1, r2, r5)
                r0.c = r4
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

        public final java.lang.Object invoke(kotlin.sequences.o<? super T> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.sequences.x$d r1 = (kotlin.sequences.x.d) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = r5.c
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r5.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r0 = r5.a
                java.util.Iterator r0 = (java.util.Iterator) r0
                kotlin.g0.n(r6)
                goto L64
            L23:
                kotlin.g0.n(r6)
                kotlin.sequences.m<T> r6 = r5.d
                java.util.Iterator r6 = r6.iterator()
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L47
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r0)
                r5.c = r2
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r6)
                r5.a = r2
                r5.b = r4
                java.lang.Object r6 = r0.f(r6, r5)
                if (r6 != r1) goto L64
                goto L63
            L47:
                kotlin.jvm.functions.Function0<kotlin.sequences.m<T>> r2 = r5.e
                java.lang.Object r2 = r2.invoke()
                kotlin.sequences.m r2 = (kotlin.sequences.m) r2
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r0)
                r5.c = r4
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r6)
                r5.a = r6
                r5.b = r3
                java.lang.Object r6 = r0.g(r2, r5)
                if (r6 != r1) goto L64
            L63:
                return r1
            L64:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,731:1\n49#2,11:732\n*E\n"})
    public static final class e<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ java.lang.Object a;

        public e(java.lang.Object r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r2 = this;
                kotlin.sequences.x$f r0 = new kotlin.sequences.x$f
                java.lang.Object r1 = r2.a
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f<T> implements java.util.Iterator<T>, l3.a {
        private boolean a;
        final /* synthetic */ T b;

        f(T r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r1 = 1
                r0.a = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.a
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto La
                r0 = 0
                r1.a = r0
                T r0 = r1.b
                return r0
            La:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0, 0, 0, 0}, l = {178}, m = "invokeSuspend", n = {"$this$sequence", "buffer", "last", "value", "j"}, nl = {180}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
    static final class g<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        int e;
        private /* synthetic */ java.lang.Object f;
        final /* synthetic */ kotlin.sequences.m<T> g;
        final /* synthetic */ kotlin.random.Random h;

        g(kotlin.sequences.m<? extends T> r1, kotlin.random.Random r2, kotlin.coroutines.e<? super kotlin.sequences.x.g> r3) {
                r0 = this;
                r0.g = r1
                r0.h = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlin.sequences.x$g r0 = new kotlin.sequences.x$g
                kotlin.sequences.m<T> r1 = r3.g
                kotlin.random.Random r2 = r3.h
                r0.<init>(r1, r2, r5)
                r0.f = r4
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

        public final java.lang.Object invoke(kotlin.sequences.o<? super T> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.sequences.x$g r1 = (kotlin.sequences.x.g) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = r6.f
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r6.e
                r3 = 1
                if (r2 == 0) goto L1f
                if (r2 != r3) goto L17
                java.lang.Object r2 = r6.a
                java.util.List r2 = (java.util.List) r2
                kotlin.g0.n(r7)
                goto L29
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                kotlin.g0.n(r7)
                kotlin.sequences.m<T> r7 = r6.g
                java.util.List r7 = kotlin.sequences.k0.J3(r7)
                r2 = r7
            L29:
                r7 = r2
                java.util.Collection r7 = (java.util.Collection) r7
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L67
                kotlin.random.Random r7 = r6.h
                int r4 = r2.size()
                int r7 = r7.nextInt(r4)
                java.lang.Object r4 = kotlin.collections.f0.Q0(r2)
                int r5 = r2.size()
                if (r7 >= r5) goto L4b
                java.lang.Object r5 = r2.set(r7, r4)
                goto L4c
            L4b:
                r5 = r4
            L4c:
                r6.f = r0
                r6.a = r2
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r4)
                r6.b = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r5)
                r6.c = r4
                r6.d = r7
                r6.e = r3
                java.lang.Object r7 = r0.c(r5, r6)
                if (r7 != r1) goto L29
                return r1
            L67:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    public x() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.m<T> A() {
            kotlin.sequences.m r0 = l()
            return r0
    }

    @kotlin.SinceKotlin(version = "2.2")
    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> B(T r1) {
            kotlin.sequences.x$e r0 = new kotlin.sequences.x$e
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> C(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = kotlin.collections.n.T5(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> D(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.sequences.m r1 = E(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> E(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.random.Random r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.x$g r0 = new kotlin.sequences.x$g
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> F(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends kotlin.Pair<? extends T, ? extends R>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.getFirst()
            r0.add(r3)
            java.lang.Object r2 = r2.getSecond()
            r1.add(r2)
            goto L13
        L2e:
            kotlin.Pair r4 = kotlin.o0.a(r0, r1)
            return r4
    }

    public static /* synthetic */ java.lang.Object d(kotlin.jvm.functions.Function0 r0, java.lang.Object r1) {
            java.lang.Object r0 = w(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object e(java.lang.Object r0) {
            java.lang.Object r0 = r(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object f(java.lang.Object r0) {
            java.lang.Object r0 = x(r0)
            return r0
    }

    public static /* synthetic */ java.util.Iterator g(kotlin.sequences.m r0) {
            java.util.Iterator r0 = p(r0)
            return r0
    }

    public static /* synthetic */ java.util.Iterator h(java.lang.Iterable r0) {
            java.util.Iterator r0 = q(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.m<T> i(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r1) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.x$a r0 = new kotlin.sequences.x$a
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> j(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.x$b r0 = new kotlin.sequences.x$b
            r0.<init>(r1)
            kotlin.sequences.m r1 = k(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> k(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.sequences.a
            if (r0 == 0) goto La
            return r1
        La:
            kotlin.sequences.a r0 = new kotlin.sequences.a
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> l() {
            kotlin.sequences.g r0 = kotlin.sequences.g.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C, R> kotlin.sequences.m<R> m(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> r4) {
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.sequences.x$c r0 = new kotlin.sequences.x$c
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> n(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends kotlin.sequences.m<? extends T>> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.u r0 = new kotlin.sequences.u
            r0.<init>()
            kotlin.sequences.m r1 = o(r1, r0)
            return r1
    }

    private static final <T, R> kotlin.sequences.m<R> o(kotlin.sequences.m<? extends T> r2, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends R>> r3) {
            boolean r0 = r2 instanceof kotlin.sequences.t0
            if (r0 == 0) goto Lb
            kotlin.sequences.t0 r2 = (kotlin.sequences.t0) r2
            kotlin.sequences.m r2 = r2.e(r3)
            return r2
        Lb:
            kotlin.sequences.i r0 = new kotlin.sequences.i
            kotlin.sequences.w r1 = new kotlin.sequences.w
            r1.<init>()
            r0.<init>(r2, r1, r3)
            return r0
    }

    private static final java.util.Iterator p(kotlin.sequences.m r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            return r1
    }

    private static final java.util.Iterator q(java.lang.Iterable r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            return r1
    }

    private static final java.lang.Object r(java.lang.Object r0) {
            return r0
    }

    @kotlin.jvm.JvmName(name = "flattenSequenceOfIterable")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> s(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends java.lang.Iterable<? extends T>> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.v r0 = new kotlin.sequences.v
            r0.<init>()
            kotlin.sequences.m r1 = o(r1, r0)
            return r1
    }

    @kotlin.internal.LowPriorityInOverloadResolution
    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> t(@org.jetbrains.annotations.Nullable T r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
            java.lang.String r0 = "nextFunction"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 != 0) goto La
            kotlin.sequences.g r2 = kotlin.sequences.g.a
            return r2
        La:
            kotlin.sequences.j r0 = new kotlin.sequences.j
            kotlin.sequences.s r1 = new kotlin.sequences.s
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> u(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "nextFunction"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.j r0 = new kotlin.sequences.j
            kotlin.sequences.t r1 = new kotlin.sequences.t
            r1.<init>(r2)
            r0.<init>(r2, r1)
            kotlin.sequences.m r2 = k(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> v(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r2) {
            java.lang.String r0 = "seedFunction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "nextFunction"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.j r0 = new kotlin.sequences.j
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.lang.Object w(kotlin.jvm.functions.Function0 r1, java.lang.Object r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r1 = r1.invoke()
            return r1
    }

    private static final java.lang.Object x(java.lang.Object r0) {
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<T> y(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends kotlin.sequences.m<? extends T>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.sequences.x$d r0 = new kotlin.sequences.x$d
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.m r2 = kotlin.sequences.q.b(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.m<T> z(kotlin.sequences.m<? extends T> r0) {
            if (r0 != 0) goto L6
            kotlin.sequences.m r0 = l()
        L6:
            return r0
    }
}
