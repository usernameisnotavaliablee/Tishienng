package kotlinx.coroutines.future;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,197:1\n1#2:198\n314#3,11:199\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n172#1:199,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ java.util.concurrent.CompletableFuture<T> a;
        final /* synthetic */ kotlinx.coroutines.x0<T> b;

        a(java.util.concurrent.CompletableFuture<T> r1, kotlinx.coroutines.x0<? extends T> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.CompletableFuture<T> r2 = r1.a     // Catch: java.lang.Throwable -> Lc
                kotlinx.coroutines.x0<T> r0 = r1.b     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r0 = r0.d()     // Catch: java.lang.Throwable -> Lc
                kotlinx.coroutines.future.a.a(r2, r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r2 = move-exception
                java.util.concurrent.CompletableFuture<T> r0 = r1.a
                kotlinx.coroutines.future.b.a(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ java.util.concurrent.CompletableFuture<kotlin.n1> a;

        b(java.util.concurrent.CompletableFuture<kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                if (r2 != 0) goto La
                java.util.concurrent.CompletableFuture<kotlin.n1> r2 = r1.a
                kotlin.n1 r0 = kotlin.n1.a
                kotlinx.coroutines.future.a.a(r2, r0)
                return
            La:
                java.util.concurrent.CompletableFuture<kotlin.n1> r0 = r1.a
                kotlinx.coroutines.future.b.a(r0, r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<T, java.lang.Throwable, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.y<T> a;

        c(kotlinx.coroutines.y<T> r1) {
                r0 = this;
                r0.a = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        public final java.lang.Object a(T r2, java.lang.Throwable r3) {
                r1 = this;
                if (r3 != 0) goto Lb
                kotlinx.coroutines.y<T> r3 = r1.a     // Catch: java.lang.Throwable -> L9
                boolean r2 = r3.p(r2)     // Catch: java.lang.Throwable -> L9
                goto L27
            L9:
                r2 = move-exception
                goto L2c
            Lb:
                kotlinx.coroutines.y<T> r2 = r1.a     // Catch: java.lang.Throwable -> L9
                boolean r0 = kotlinx.coroutines.future.d.a(r3)     // Catch: java.lang.Throwable -> L9
                if (r0 == 0) goto L18
                java.util.concurrent.CompletionException r0 = kotlinx.coroutines.future.e.a(r3)     // Catch: java.lang.Throwable -> L9
                goto L19
            L18:
                r0 = 0
            L19:
                if (r0 == 0) goto L23
                java.lang.Throwable r0 = kotlinx.coroutines.future.f.a(r0)     // Catch: java.lang.Throwable -> L9
                if (r0 != 0) goto L22
                goto L23
            L22:
                r3 = r0
            L23:
                boolean r2 = r2.c(r3)     // Catch: java.lang.Throwable -> L9
            L27:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L9
                return r2
            L2c:
                kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                kotlinx.coroutines.o0.b(r3, r2)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Throwable r2) {
                r0 = this;
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Object r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ java.util.concurrent.CompletableFuture<T> a;
        final /* synthetic */ kotlinx.coroutines.future.g<T> b;

        d(java.util.concurrent.CompletableFuture<T> r1, kotlinx.coroutines.future.g<T> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.CompletableFuture<T> r2 = r1.a
                r0 = 0
                kotlinx.coroutines.future.q.a(r2, r0)
                kotlinx.coroutines.future.g<T> r2 = r1.b
                r0 = 0
                r2.cont = r0
                return
        }
    }

    public static /* synthetic */ java.lang.Object a(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, java.lang.Throwable r2) {
            java.lang.Object r0 = f(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(kotlinx.coroutines.e2 r0, java.lang.Object r1, java.lang.Throwable r2) {
            kotlin.n1 r0 = k(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.concurrent.CompletableFuture<T> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.x0<? extends T> r2) {
            java.util.concurrent.CompletableFuture r0 = kotlinx.coroutines.future.m.a()
            j(r2, r0)
            kotlinx.coroutines.future.p$a r1 = new kotlinx.coroutines.future.p$a
            r1.<init>(r0, r2)
            r2.k(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.CompletableFuture<kotlin.n1> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r2) {
            java.util.concurrent.CompletableFuture r0 = kotlinx.coroutines.future.m.a()
            j(r2, r0)
            kotlinx.coroutines.future.p$b r1 = new kotlinx.coroutines.future.p$b
            r1.<init>(r0)
            r2.k(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.x0<T> e(@org.jetbrains.annotations.NotNull java.util.concurrent.CompletionStage<T> r4) {
            java.util.concurrent.CompletableFuture r0 = kotlinx.coroutines.future.h.a(r4)
            boolean r1 = kotlinx.coroutines.future.i.a(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L31
            java.lang.Object r4 = kotlinx.coroutines.future.j.a(r0)     // Catch: java.lang.Throwable -> L15
            kotlinx.coroutines.y r4 = kotlinx.coroutines.a0.a(r4)     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r4 = move-exception
            boolean r0 = r4 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L1e
            r0 = r4
            java.util.concurrent.ExecutionException r0 = (java.util.concurrent.ExecutionException) r0
            goto L1f
        L1e:
            r0 = r3
        L1f:
            if (r0 == 0) goto L29
            java.lang.Throwable r0 = r0.getCause()
            if (r0 != 0) goto L28
            goto L29
        L28:
            r4 = r0
        L29:
            kotlinx.coroutines.y r0 = kotlinx.coroutines.a0.c(r3, r2, r3)
            r0.c(r4)
            return r0
        L31:
            kotlinx.coroutines.y r1 = kotlinx.coroutines.a0.c(r3, r2, r3)
            kotlinx.coroutines.future.p$c r2 = new kotlinx.coroutines.future.p$c
            r2.<init>(r1)
            kotlinx.coroutines.future.n r3 = new kotlinx.coroutines.future.n
            r3.<init>(r2)
            kotlinx.coroutines.future.k.a(r4, r3)
            kotlinx.coroutines.h2.x(r1, r0)
            return r1
    }

    private static final java.lang.Object f(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, java.lang.Throwable r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object g(@org.jetbrains.annotations.NotNull java.util.concurrent.CompletionStage<T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r5) {
            java.util.concurrent.CompletableFuture r0 = kotlinx.coroutines.future.h.a(r4)
            boolean r1 = kotlinx.coroutines.future.i.a(r0)
            if (r1 == 0) goto L19
            java.lang.Object r4 = kotlinx.coroutines.future.j.a(r0)     // Catch: java.util.concurrent.ExecutionException -> Lf
            return r4
        Lf:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L17
            goto L18
        L17:
            r4 = r5
        L18:
            throw r4
        L19:
            kotlinx.coroutines.q r1 = new kotlinx.coroutines.q
            kotlin.coroutines.e r2 = kotlin.coroutines.intrinsics.a.e(r5)
            r3 = 1
            r1.<init>(r2, r3)
            r1.Q()
            kotlinx.coroutines.future.g r2 = new kotlinx.coroutines.future.g
            r2.<init>(r1)
            java.util.function.BiFunction r3 = io.netty.handler.ssl.p.a(r2)
            kotlinx.coroutines.future.k.a(r4, r3)
            kotlinx.coroutines.future.p$d r4 = new kotlinx.coroutines.future.p$d
            r4.<init>(r0, r2)
            r1.I(r4)
            java.lang.Object r4 = r1.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r0) goto L47
            kotlin.coroutines.jvm.internal.e.c(r5)
        L47:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.concurrent.CompletableFuture<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r4) {
            boolean r0 = r3.isLazy()
            if (r0 != 0) goto L1e
            kotlin.coroutines.i r1 = kotlinx.coroutines.l0.e(r1, r2)
            java.util.concurrent.CompletableFuture r2 = kotlinx.coroutines.future.m.a()
            kotlinx.coroutines.future.c r0 = new kotlinx.coroutines.future.c
            r0.<init>(r1, r2)
            java.util.function.BiFunction r1 = io.netty.handler.ssl.p.a(r0)
            kotlinx.coroutines.future.l.a(r2, r1)
            r0.z1(r3, r0, r4)
            return r2
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = " start is not supported"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ java.util.concurrent.CompletableFuture i(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Lc:
            java.util.concurrent.CompletableFuture r0 = h(r0, r1, r2, r3)
            return r0
    }

    private static final void j(kotlinx.coroutines.e2 r1, java.util.concurrent.CompletableFuture<?> r2) {
            kotlinx.coroutines.future.o r0 = new kotlinx.coroutines.future.o
            r0.<init>(r1)
            kotlinx.coroutines.future.l.a(r2, r0)
            return
    }

    private static final kotlin.n1 k(kotlinx.coroutines.e2 r1, java.lang.Object r2, java.lang.Throwable r3) {
            r2 = 0
            if (r3 == 0) goto L12
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto La
            r2 = r3
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        La:
            if (r2 != 0) goto L12
            java.lang.String r2 = "CompletableFuture was completed exceptionally"
            java.util.concurrent.CancellationException r2 = kotlinx.coroutines.s1.a(r2, r3)
        L12:
            r1.b(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }
}
