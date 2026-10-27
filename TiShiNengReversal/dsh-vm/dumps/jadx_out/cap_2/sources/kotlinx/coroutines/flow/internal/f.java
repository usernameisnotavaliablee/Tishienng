package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f<T> extends kotlinx.coroutines.flow.internal.d<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> d;
    private final int e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.e2 a;
        final /* synthetic */ kotlinx.coroutines.sync.d b;
        final /* synthetic */ kotlinx.coroutines.channels.z<T> c;
        final /* synthetic */ kotlinx.coroutines.flow.internal.u<T> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.f$a$a, reason: collision with other inner class name */
        static final class C0093a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlinx.coroutines.flow.i<T> b;
            final /* synthetic */ kotlinx.coroutines.flow.internal.u<T> c;
            final /* synthetic */ kotlinx.coroutines.sync.d d;

            C0093a(kotlinx.coroutines.flow.i<? extends T> r1, kotlinx.coroutines.flow.internal.u<T> r2, kotlinx.coroutines.sync.d r3, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.f.a.C0093a> r4) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                    r3 = this;
                    kotlinx.coroutines.flow.internal.f$a$a r4 = new kotlinx.coroutines.flow.internal.f$a$a
                    kotlinx.coroutines.flow.i<T> r0 = r3.b
                    kotlinx.coroutines.flow.internal.u<T> r1 = r3.c
                    kotlinx.coroutines.sync.d r2 = r3.d
                    r4.<init>(r0, r1, r2, r5)
                    return r4
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke2(r1, r2)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.internal.f$a$a r1 = (kotlinx.coroutines.flow.internal.f.a.C0093a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r3.a
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    kotlin.g0.n(r4)     // Catch: java.lang.Throwable -> Lf
                    goto L29
                Lf:
                    r4 = move-exception
                    goto L31
                L11:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L19:
                    kotlin.g0.n(r4)
                    kotlinx.coroutines.flow.i<T> r4 = r3.b     // Catch: java.lang.Throwable -> Lf
                    kotlinx.coroutines.flow.internal.u<T> r1 = r3.c     // Catch: java.lang.Throwable -> Lf
                    r3.a = r2     // Catch: java.lang.Throwable -> Lf
                    java.lang.Object r4 = r4.collect(r1, r3)     // Catch: java.lang.Throwable -> Lf
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    kotlinx.coroutines.sync.d r4 = r3.d
                    r4.release()
                    kotlin.n1 r4 = kotlin.n1.a
                    return r4
                L31:
                    kotlinx.coroutines.sync.d r0 = r3.d
                    r0.release()
                    throw r4
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object a;
            java.lang.Object b;
            /* synthetic */ java.lang.Object c;
            final /* synthetic */ kotlinx.coroutines.flow.internal.f.a<T> d;
            int e;

            b(kotlinx.coroutines.flow.internal.f.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.f.a.b> r2) {
                    r0 = this;
                    r0.d = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.c = r2
                    int r2 = r1.e
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.e = r2
                    kotlinx.coroutines.flow.internal.f$a<T> r2 = r1.d
                    r0 = 0
                    java.lang.Object r2 = r2.a(r0, r1)
                    return r2
            }
        }

        a(kotlinx.coroutines.e2 r1, kotlinx.coroutines.sync.d r2, kotlinx.coroutines.channels.z<? super T> r3, kotlinx.coroutines.flow.internal.u<T> r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.f.a.b
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.f$a$b r0 = (kotlinx.coroutines.flow.internal.f.a.b) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.f$a$b r0 = new kotlinx.coroutines.flow.internal.f$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.b
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                java.lang.Object r0 = r0.a
                kotlinx.coroutines.flow.internal.f$a r0 = (kotlinx.coroutines.flow.internal.f.a) r0
                kotlin.g0.n(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.g0.n(r9)
                kotlinx.coroutines.e2 r9 = r7.a
                if (r9 == 0) goto L43
                kotlinx.coroutines.h2.A(r9)
            L43:
                kotlinx.coroutines.sync.d r9 = r7.b
                r0.a = r7
                r0.b = r8
                r0.e = r3
                java.lang.Object r9 = r9.c(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                kotlinx.coroutines.channels.z<T> r1 = r0.c
                kotlinx.coroutines.flow.internal.f$a$a r4 = new kotlinx.coroutines.flow.internal.f$a$a
                kotlinx.coroutines.flow.internal.u<T> r9 = r0.d
                kotlinx.coroutines.sync.d r0 = r0.b
                r2 = 0
                r4.<init>(r8, r9, r0, r2)
                r5 = 3
                r6 = 0
                r3 = 0
                kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.e r2) {
                r0 = this;
                kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
                java.lang.Object r1 = r0.a(r1, r2)
                return r1
        }
    }

    public f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r1, int r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.d = r1
            r0.e = r2
            return
    }

    public /* synthetic */ f(kotlinx.coroutines.flow.i r7, int r8, kotlin.coroutines.i r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = -2
            r4 = -2
            goto Lf
        Le:
            r4 = r10
        Lf:
            r9 = r12 & 16
            if (r9 == 0) goto L15
            kotlinx.coroutines.channels.BufferOverflow r11 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L15:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected java.lang.String f() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "concurrency="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
            r5 = this;
            int r0 = r5.e
            r1 = 2
            r2 = 0
            r3 = 0
            kotlinx.coroutines.sync.d r0 = kotlinx.coroutines.sync.f.b(r0, r3, r1, r2)
            kotlinx.coroutines.flow.internal.u r1 = new kotlinx.coroutines.flow.internal.u
            r1.<init>(r6)
            kotlin.coroutines.i r2 = r7.getContext()
            kotlinx.coroutines.e2$b r3 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r2 = r2.get(r3)
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> r3 = r5.d
            kotlinx.coroutines.flow.internal.f$a r4 = new kotlinx.coroutines.flow.internal.f$a
            r4.<init>(r2, r0, r6, r1)
            java.lang.Object r6 = r3.collect(r4, r7)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.l()
            if (r6 != r7) goto L2c
            return r6
        L2c:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.internal.d<T> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r7, int r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r9) {
            r6 = this;
            kotlinx.coroutines.flow.internal.f r0 = new kotlinx.coroutines.flow.internal.f
            kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> r1 = r6.d
            int r2 = r6.e
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<T> m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r4) {
            r3 = this;
            kotlin.coroutines.i r0 = r3.a
            int r1 = r3.b
            kotlin.jvm.functions.Function2 r2 = r3.k()
            kotlinx.coroutines.channels.b0 r4 = kotlinx.coroutines.channels.x.c(r4, r0, r1, r2)
            return r4
    }
}
