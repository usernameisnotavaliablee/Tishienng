package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,151:1\n1#2:152\n314#3,11:153\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n48#1:153,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        int d;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.channels.x.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.c = r2
                int r2 = r1.d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.d = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.x.a(r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.n1> {
        public static final kotlinx.coroutines.channels.x.b a = null;

        static {
                kotlinx.coroutines.channels.x$b r0 = new kotlinx.coroutines.channels.x$b
                r0.<init>()
                kotlinx.coroutines.channels.x.b.a = r0
                return
        }

        b() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.n1 invoke() {
                r1 = this;
                r1.invoke2()
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
        final /* synthetic */ kotlinx.coroutines.p<kotlin.n1> a;

        c(kotlinx.coroutines.p<? super kotlin.n1> r1) {
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
                kotlinx.coroutines.p<kotlin.n1> r2 = r1.a
                kotlin.Result$a r0 = kotlin.Result.Companion
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
                r2.resumeWith(r0)
                return
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<?> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.x.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.x$a r0 = (kotlinx.coroutines.channels.x.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.x$a r0 = new kotlinx.coroutines.channels.x$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.channels.z r4 = (kotlinx.coroutines.channels.z) r4
            kotlin.g0.n(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.g0.n(r6)
            kotlin.coroutines.i r6 = r0.getContext()
            kotlinx.coroutines.e2$b r2 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.a = r4     // Catch: java.lang.Throwable -> L32
            r0.b = r5     // Catch: java.lang.Throwable -> L32
            r0.d = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.q r6 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.e r2 = kotlin.coroutines.intrinsics.a.e(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.Q()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.x$c r2 = new kotlinx.coroutines.channels.x$c     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.q(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.x()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.e.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ java.lang.Object b(kotlinx.coroutines.channels.z r0, kotlin.jvm.functions.Function0 r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            kotlinx.coroutines.channels.x$b r1 = kotlinx.coroutines.channels.x.b.a
        L6:
            java.lang.Object r0 = a(r0, r1, r2)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.b0<E> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r8, int r9, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super E>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r10
            kotlinx.coroutines.channels.b0 r7 = e(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.b0<E> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r8, int r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r10, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r11, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super E>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r12) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            kotlinx.coroutines.channels.b0 r7 = e(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.b0<E> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r6, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r7, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super E>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r8) {
            r0 = 0
            r1 = 4
            kotlinx.coroutines.channels.j r4 = kotlinx.coroutines.channels.m.d(r4, r5, r0, r1, r0)
            kotlin.coroutines.i r2 = kotlinx.coroutines.l0.e(r2, r3)
            kotlinx.coroutines.channels.y r3 = new kotlinx.coroutines.channels.y
            r3.<init>(r2, r4)
            if (r7 == 0) goto L14
            r3.k(r7)
        L14:
            r3.z1(r6, r3, r8)
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.b0 f(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, int r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r2 = 0
        Lb:
            kotlinx.coroutines.channels.b0 r0 = c(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.b0 g(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, int r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function2 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r2 = 0
        Lb:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.DEFAULT
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L16
            r4 = 0
        L16:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            kotlinx.coroutines.channels.b0 r0 = d(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.b0 h(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, kotlinx.coroutines.CoroutineStart r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function2 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lb
            r2 = 0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L1c
            r5 = 0
        L1c:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            kotlinx.coroutines.channels.b0 r0 = e(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
