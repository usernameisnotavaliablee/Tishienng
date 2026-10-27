package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,143:1\n107#2:144\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n86#1:144\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        int d;
        int e;
        private /* synthetic */ java.lang.Object f;
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] g;
        final /* synthetic */ kotlin.jvm.functions.Function0<T[]> h;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> i;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> j;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.k$a$a, reason: collision with other inner class name */
        static final class C0096a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] b;
            final /* synthetic */ int c;
            final /* synthetic */ java.util.concurrent.atomic.AtomicInteger d;
            final /* synthetic */ kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> e;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a, reason: collision with other inner class name */
            static final class C0097a<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> a;
                final /* synthetic */ int b;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {32, 33}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$a$a$a$a, reason: collision with other inner class name */
                static final class C0098a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object a;
                    final /* synthetic */ kotlinx.coroutines.flow.internal.k.a.C0096a.C0097a<T> b;
                    int c;

                    C0098a(kotlinx.coroutines.flow.internal.k.a.C0096a.C0097a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.a.C0096a.C0097a.C0098a> r2) {
                            r0 = this;
                            r0.b = r1
                            r0.<init>(r2)
                            return
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                            r1 = this;
                            r1.a = r2
                            int r2 = r1.c
                            r0 = -2147483648(0xffffffff80000000, float:-0.0)
                            r2 = r2 | r0
                            r1.c = r2
                            kotlinx.coroutines.flow.internal.k$a$a$a<T> r2 = r1.b
                            r0 = 0
                            java.lang.Object r2 = r2.emit(r0, r1)
                            return r2
                    }
                }

                C0097a(kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> r1, int r2) {
                        r0 = this;
                        r0.a = r1
                        r0.b = r2
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.k.a.C0096a.C0097a.C0098a
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.k.a.C0096a.C0097a.C0098a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.k$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.g0.n(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.g0.n(r8)
                        goto L4d
                    L38:
                        kotlin.g0.n(r8)
                        kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> r8 = r6.a
                        kotlin.collections.a1 r2 = new kotlin.collections.a1
                        int r5 = r6.b
                        r2.<init>(r5, r7)
                        r0.c = r4
                        java.lang.Object r7 = r8.T(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.c = r3
                        java.lang.Object r7 = kotlinx.coroutines.t3.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.n1 r7 = kotlin.n1.a
                        return r7
                }
            }

            C0096a(kotlinx.coroutines.flow.i<? extends T>[] r1, int r2, java.util.concurrent.atomic.AtomicInteger r3, kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> r4, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.a.C0096a> r5) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r0.e = r4
                    r1 = 2
                    r0.<init>(r1, r5)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r8) {
                    r6 = this;
                    kotlinx.coroutines.flow.internal.k$a$a r0 = new kotlinx.coroutines.flow.internal.k$a$a
                    kotlinx.coroutines.flow.i<T>[] r1 = r6.b
                    int r2 = r6.c
                    java.util.concurrent.atomic.AtomicInteger r3 = r6.d
                    kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> r4 = r6.e
                    r5 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r0
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
                    kotlinx.coroutines.flow.internal.k$a$a r1 = (kotlinx.coroutines.flow.internal.k.a.C0096a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r6.a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r3) goto L12
                    kotlin.g0.n(r7)     // Catch: java.lang.Throwable -> L10
                    goto L33
                L10:
                    r7 = move-exception
                    goto L43
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    kotlin.g0.n(r7)
                    kotlinx.coroutines.flow.i<T>[] r7 = r6.b     // Catch: java.lang.Throwable -> L10
                    int r1 = r6.c     // Catch: java.lang.Throwable -> L10
                    r7 = r7[r1]     // Catch: java.lang.Throwable -> L10
                    kotlinx.coroutines.flow.internal.k$a$a$a r4 = new kotlinx.coroutines.flow.internal.k$a$a$a     // Catch: java.lang.Throwable -> L10
                    kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> r5 = r6.e     // Catch: java.lang.Throwable -> L10
                    r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L10
                    r6.a = r3     // Catch: java.lang.Throwable -> L10
                    java.lang.Object r7 = r7.collect(r4, r6)     // Catch: java.lang.Throwable -> L10
                    if (r7 != r0) goto L33
                    return r0
                L33:
                    java.util.concurrent.atomic.AtomicInteger r7 = r6.d
                    int r7 = r7.decrementAndGet()
                    if (r7 != 0) goto L40
                    kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> r7 = r6.e
                    kotlinx.coroutines.channels.c0.a.a(r7, r2, r3, r2)
                L40:
                    kotlin.n1 r7 = kotlin.n1.a
                    return r7
                L43:
                    java.util.concurrent.atomic.AtomicInteger r0 = r6.d
                    int r0 = r0.decrementAndGet()
                    if (r0 != 0) goto L50
                    kotlinx.coroutines.channels.j<kotlin.collections.a1<java.lang.Object>> r0 = r6.e
                    kotlinx.coroutines.channels.c0.a.a(r0, r2, r3, r2)
                L50:
                    throw r7
            }
        }

        a(kotlinx.coroutines.flow.i<? extends T>[] r1, kotlin.jvm.functions.Function0<T[]> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3, kotlinx.coroutines.flow.j<? super R> r4, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.a> r5) {
                r0 = this;
                r0.g = r1
                r0.h = r2
                r0.i = r3
                r0.j = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r8) {
                r6 = this;
                kotlinx.coroutines.flow.internal.k$a r0 = new kotlinx.coroutines.flow.internal.k$a
                kotlinx.coroutines.flow.i<T>[] r1 = r6.g
                kotlin.jvm.functions.Function0<T[]> r2 = r6.h
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r3 = r6.i
                kotlinx.coroutines.flow.j<R> r4 = r6.j
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r0.f = r7
                return r0
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
                kotlinx.coroutines.flow.internal.k$a r1 = (kotlinx.coroutines.flow.internal.k.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
                r21 = this;
                r0 = r21
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L4e
                if (r2 == r5) goto L31
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1c:
                int r2 = r0.d
                int r6 = r0.c
                java.lang.Object r7 = r0.b
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.a
                kotlinx.coroutines.channels.j r8 = (kotlinx.coroutines.channels.j) r8
                java.lang.Object r9 = r0.f
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                kotlin.g0.n(r22)
                goto L128
            L31:
                int r2 = r0.d
                int r6 = r0.c
                java.lang.Object r7 = r0.b
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.a
                kotlinx.coroutines.channels.j r8 = (kotlinx.coroutines.channels.j) r8
                java.lang.Object r9 = r0.f
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                kotlin.g0.n(r22)
                r10 = r22
                kotlinx.coroutines.channels.n r10 = (kotlinx.coroutines.channels.n) r10
                java.lang.Object r10 = r10.o()
                goto Lb5
            L4e:
                kotlin.g0.n(r22)
                java.lang.Object r2 = r0.f
                r6 = r2
                kotlinx.coroutines.r0 r6 = (kotlinx.coroutines.r0) r6
                kotlinx.coroutines.flow.i<T>[] r2 = r0.g
                int r2 = r2.length
                if (r2 != 0) goto L5e
                kotlin.n1 r1 = kotlin.n1.a
                return r1
            L5e:
                java.lang.Object[] r7 = new java.lang.Object[r2]
                kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.flow.internal.s.b
                r11 = 6
                r12 = 0
                r9 = 0
                r10 = 0
                kotlin.collections.n.V1(r7, r8, r9, r10, r11, r12)
                r12 = r7
                r7 = 6
                r8 = 0
                kotlinx.coroutines.channels.j r17 = kotlinx.coroutines.channels.m.d(r2, r8, r8, r7, r8)
                java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
                r7.<init>(r2)
                r19 = 0
                r15 = 0
            L78:
                if (r15 >= r2) goto L92
                kotlinx.coroutines.flow.internal.k$a$a r9 = new kotlinx.coroutines.flow.internal.k$a$a
                kotlinx.coroutines.flow.i<T>[] r14 = r0.g
                r18 = 0
                r16 = r7
                r13 = r9
                r13.<init>(r14, r15, r16, r17, r18)
                r10 = 3
                r11 = 0
                r7 = 0
                r8 = 0
                kotlinx.coroutines.i.e(r6, r7, r8, r9, r10, r11)
                int r15 = r15 + 1
                r7 = r16
                goto L78
            L92:
                byte[] r6 = new byte[r2]
                r7 = r12
                r8 = r17
            L97:
                int r9 = r19 + 1
                byte r9 = (byte) r9
                r0.f = r7
                r0.a = r8
                r0.b = r6
                r0.c = r2
                r0.d = r9
                r0.e = r5
                java.lang.Object r10 = r8.x(r0)
                if (r10 != r1) goto Lae
                goto L127
            Lae:
                r20 = r6
                r6 = r2
                r2 = r9
                r9 = r7
                r7 = r20
            Lb5:
                java.lang.Object r10 = kotlinx.coroutines.channels.n.h(r10)
                kotlin.collections.a1 r10 = (kotlin.collections.a1) r10
                if (r10 != 0) goto Lc0
                kotlin.n1 r1 = kotlin.n1.a
                return r1
            Lc0:
                int r11 = r10.e()
                r12 = r9[r11]
                java.lang.Object r10 = r10.f()
                r9[r11] = r10
                kotlinx.coroutines.internal.s0 r10 = kotlinx.coroutines.flow.internal.s.b
                if (r12 != r10) goto Ld2
                int r6 = r6 + (-1)
            Ld2:
                r10 = r7[r11]
                if (r10 == r2) goto Le5
                byte r10 = (byte) r2
                r7[r11] = r10
                java.lang.Object r10 = r8.v()
                java.lang.Object r10 = kotlinx.coroutines.channels.n.h(r10)
                kotlin.collections.a1 r10 = (kotlin.collections.a1) r10
                if (r10 != 0) goto Lc0
            Le5:
                if (r6 != 0) goto L128
                kotlin.jvm.functions.Function0<T[]> r10 = r0.h
                java.lang.Object r10 = r10.invoke()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L108
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r10 = r0.i
                kotlinx.coroutines.flow.j<R> r11 = r0.j
                r0.f = r9
                r0.a = r8
                r0.b = r7
                r0.c = r6
                r0.d = r2
                r0.e = r4
                java.lang.Object r10 = r10.invoke(r11, r9, r0)
                if (r10 != r1) goto L128
                goto L127
            L108:
                r14 = 14
                r15 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                kotlin.collections.n.K0(r9, r10, r11, r12, r13, r14, r15)
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r11 = r0.i
                kotlinx.coroutines.flow.j<R> r12 = r0.j
                r0.f = r9
                r0.a = r8
                r0.b = r7
                r0.c = r6
                r0.d = r2
                r0.e = r3
                java.lang.Object r10 = r11.invoke(r12, r10, r0)
                if (r10 != r1) goto L128
            L127:
                return r1
            L128:
                r19 = r2
                r2 = r6
                r6 = r7
                r7 = r9
                goto L97
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,113:1\n87#2:114\n142#2:115\n*E\n"})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {
        final /* synthetic */ kotlinx.coroutines.flow.i a;
        final /* synthetic */ kotlinx.coroutines.flow.i b;
        final /* synthetic */ kotlin.jvm.functions.Function3 c;

        public b(kotlinx.coroutines.flow.i r1, kotlinx.coroutines.flow.i r2, kotlin.jvm.functions.Function3 r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
                r6 = this;
                kotlinx.coroutines.flow.internal.k$c r0 = new kotlinx.coroutines.flow.internal.k$c
                kotlinx.coroutines.flow.i r2 = r6.a
                kotlinx.coroutines.flow.i r3 = r6.b
                kotlin.jvm.functions.Function3 r4 = r6.c
                r5 = 0
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.Object r7 = kotlinx.coroutines.s0.g(r0, r8)
                java.lang.Object r8 = kotlin.coroutines.intrinsics.a.l()
                if (r7 != r8) goto L18
                return r7
            L18:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> c;
        final /* synthetic */ kotlinx.coroutines.flow.i<T2> d;
        final /* synthetic */ kotlinx.coroutines.flow.i<T1> e;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> {
            final /* synthetic */ kotlinx.coroutines.b0 a;
            final /* synthetic */ kotlinx.coroutines.flow.j<R> b;

            a(kotlinx.coroutines.b0 r1, kotlinx.coroutines.flow.j<? super R> r2) {
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
            public final void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
                    r2 = this;
                    kotlinx.coroutines.b0 r3 = r2.a
                    boolean r3 = r3.isActive()
                    if (r3 == 0) goto L14
                    kotlinx.coroutines.b0 r3 = r2.a
                    kotlinx.coroutines.flow.internal.AbortFlowException r0 = new kotlinx.coroutines.flow.internal.AbortFlowException
                    kotlinx.coroutines.flow.j<R> r1 = r2.b
                    r0.<init>(r1)
                    r3.b(r0)
                L14:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.n1, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlinx.coroutines.flow.i<T1> b;
            final /* synthetic */ kotlin.coroutines.i c;
            final /* synthetic */ java.lang.Object d;
            final /* synthetic */ kotlinx.coroutines.channels.b0<java.lang.Object> e;
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f;
            final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> g;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            static final class a<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlin.coroutines.i a;
                final /* synthetic */ java.lang.Object b;
                final /* synthetic */ kotlinx.coroutines.channels.b0<java.lang.Object> c;
                final /* synthetic */ kotlinx.coroutines.flow.j<R> d;
                final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> e;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {129, 132, 132}, m = "invokeSuspend", n = {}, s = {})
                @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,143:1\n501#2,5:144\n18#3:149\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n129#1:144,5\n132#1:149\n*E\n"})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$a, reason: collision with other inner class name */
                static final class C0099a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.n1, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
                    java.lang.Object a;
                    int b;
                    final /* synthetic */ kotlinx.coroutines.channels.b0<java.lang.Object> c;
                    final /* synthetic */ kotlinx.coroutines.flow.j<R> d;
                    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> e;
                    final /* synthetic */ T1 f;

                    C0099a(kotlinx.coroutines.channels.b0<? extends java.lang.Object> r1, kotlinx.coroutines.flow.j<? super R> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3, T1 r4, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.c.b.a.C0099a> r5) {
                            r0 = this;
                            r0.c = r1
                            r0.d = r2
                            r0.e = r3
                            r0.f = r4
                            r1 = 2
                            r0.<init>(r1, r5)
                            return
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.NotNull
                    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r8) {
                            r6 = this;
                            kotlinx.coroutines.flow.internal.k$c$b$a$a r0 = new kotlinx.coroutines.flow.internal.k$c$b$a$a
                            kotlinx.coroutines.channels.b0<java.lang.Object> r1 = r6.c
                            kotlinx.coroutines.flow.j<R> r2 = r6.d
                            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r3 = r6.e
                            T1 r4 = r6.f
                            r5 = r8
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r0
                    }

                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.n1 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                            r0 = this;
                            kotlin.coroutines.e r1 = r0.create(r1, r2)
                            kotlinx.coroutines.flow.internal.k$c$b$a$a r1 = (kotlinx.coroutines.flow.internal.k.c.b.a.C0099a) r1
                            kotlin.n1 r2 = kotlin.n1.a
                            java.lang.Object r1 = r1.invokeSuspend(r2)
                            return r1
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.n1 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                            r0 = this;
                            kotlin.n1 r1 = (kotlin.n1) r1
                            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                            java.lang.Object r1 = r0.f(r1, r2)
                            return r1
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                            r8 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                            int r1 = r8.b
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            kotlin.g0.n(r9)
                            goto L6f
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.a
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                            kotlin.g0.n(r9)
                            goto L64
                        L26:
                            kotlin.g0.n(r9)
                            kotlinx.coroutines.channels.n r9 = (kotlinx.coroutines.channels.n) r9
                            java.lang.Object r9 = r9.o()
                            goto L3e
                        L30:
                            kotlin.g0.n(r9)
                            kotlinx.coroutines.channels.b0<java.lang.Object> r9 = r8.c
                            r8.b = r5
                            java.lang.Object r9 = r9.x(r8)
                            if (r9 != r0) goto L3e
                            goto L6e
                        L3e:
                            kotlinx.coroutines.flow.j<R> r1 = r8.d
                            boolean r5 = r9 instanceof kotlinx.coroutines.channels.n.c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = kotlinx.coroutines.channels.n.f(r9)
                            if (r9 != 0) goto L4f
                            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r5 = r8.e
                            T1 r6 = r8.f
                            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.flow.internal.s.a
                            if (r9 != r7) goto L59
                            r9 = r2
                        L59:
                            r8.a = r1
                            r8.b = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L64
                            goto L6e
                        L64:
                            r8.a = r2
                            r8.b = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L6f
                        L6e:
                            return r0
                        L6f:
                            kotlin.n1 r9 = kotlin.n1.a
                            return r9
                    }
                }

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {128}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$b$a$b, reason: collision with other inner class name */
                static final class C0100b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object a;
                    final /* synthetic */ kotlinx.coroutines.flow.internal.k.c.b.a<T> b;
                    int c;

                    C0100b(kotlinx.coroutines.flow.internal.k.c.b.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.c.b.a.C0100b> r2) {
                            r0 = this;
                            r0.b = r1
                            r0.<init>(r2)
                            return
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                            r1 = this;
                            r1.a = r2
                            int r2 = r1.c
                            r0 = -2147483648(0xffffffff80000000, float:-0.0)
                            r2 = r2 | r0
                            r1.c = r2
                            kotlinx.coroutines.flow.internal.k$c$b$a<T> r2 = r1.b
                            r0 = 0
                            java.lang.Object r2 = r2.emit(r0, r1)
                            return r2
                    }
                }

                a(kotlin.coroutines.i r1, java.lang.Object r2, kotlinx.coroutines.channels.b0<? extends java.lang.Object> r3, kotlinx.coroutines.flow.j<? super R> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5) {
                        r0 = this;
                        r0.a = r1
                        r0.b = r2
                        r0.c = r3
                        r0.d = r4
                        r0.e = r5
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object emit(T1 r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r13) {
                        r11 = this;
                        boolean r0 = r13 instanceof kotlinx.coroutines.flow.internal.k.c.b.a.C0100b
                        if (r0 == 0) goto L13
                        r0 = r13
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = (kotlinx.coroutines.flow.internal.k.c.b.a.C0100b) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$b$a$b r0 = new kotlinx.coroutines.flow.internal.k$c$b$a$b
                        r0.<init>(r11, r13)
                    L18:
                        java.lang.Object r13 = r0.a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.g0.n(r13)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r13)
                        throw r12
                    L31:
                        kotlin.g0.n(r13)
                        kotlin.coroutines.i r13 = r11.a
                        kotlin.n1 r2 = kotlin.n1.a
                        java.lang.Object r4 = r11.b
                        kotlinx.coroutines.flow.internal.k$c$b$a$a r5 = new kotlinx.coroutines.flow.internal.k$c$b$a$a
                        kotlinx.coroutines.channels.b0<java.lang.Object> r6 = r11.c
                        kotlinx.coroutines.flow.j<R> r7 = r11.d
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r8 = r11.e
                        r10 = 0
                        r9 = r12
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.c = r3
                        java.lang.Object r12 = kotlinx.coroutines.flow.internal.e.c(r13, r2, r4, r5, r0)
                        if (r12 != r1) goto L50
                        return r1
                    L50:
                        kotlin.n1 r12 = kotlin.n1.a
                        return r12
                }
            }

            b(kotlinx.coroutines.flow.i<? extends T1> r1, kotlin.coroutines.i r2, java.lang.Object r3, kotlinx.coroutines.channels.b0<? extends java.lang.Object> r4, kotlinx.coroutines.flow.j<? super R> r5, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r6, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.c.b> r7) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r0.e = r4
                    r0.f = r5
                    r0.g = r6
                    r1 = 2
                    r0.<init>(r1, r7)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r10) {
                    r8 = this;
                    kotlinx.coroutines.flow.internal.k$c$b r0 = new kotlinx.coroutines.flow.internal.k$c$b
                    kotlinx.coroutines.flow.i<T1> r1 = r8.b
                    kotlin.coroutines.i r2 = r8.c
                    java.lang.Object r3 = r8.d
                    kotlinx.coroutines.channels.b0<java.lang.Object> r4 = r8.e
                    kotlinx.coroutines.flow.j<R> r5 = r8.f
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r6 = r8.g
                    r7 = r10
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.n1 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.internal.k$c$b r1 = (kotlinx.coroutines.flow.internal.k.c.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.n1 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.n1 r1 = (kotlin.n1) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.f(r1, r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r9.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.g0.n(r10)
                    goto L34
                Lf:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L17:
                    kotlin.g0.n(r10)
                    kotlinx.coroutines.flow.i<T1> r10 = r9.b
                    kotlinx.coroutines.flow.internal.k$c$b$a r3 = new kotlinx.coroutines.flow.internal.k$c$b$a
                    kotlin.coroutines.i r4 = r9.c
                    java.lang.Object r5 = r9.d
                    kotlinx.coroutines.channels.b0<java.lang.Object> r6 = r9.e
                    kotlinx.coroutines.flow.j<R> r7 = r9.f
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r8 = r9.g
                    r3.<init>(r4, r5, r6, r7, r8)
                    r9.a = r2
                    java.lang.Object r10 = r10.collect(r3, r9)
                    if (r10 != r0) goto L34
                    return r0
                L34:
                    kotlin.n1 r10 = kotlin.n1.a
                    return r10
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.k$c$c, reason: collision with other inner class name */
        static final class C0101c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super java.lang.Object>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            private /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlinx.coroutines.flow.i<T2> c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a */
            static final class a<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.channels.z<java.lang.Object> a;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {90}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.k$c$c$a$a, reason: collision with other inner class name */
                static final class C0102a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object a;
                    final /* synthetic */ kotlinx.coroutines.flow.internal.k.c.C0101c.a<T> b;
                    int c;

                    C0102a(kotlinx.coroutines.flow.internal.k.c.C0101c.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.c.C0101c.a.C0102a> r2) {
                            r0 = this;
                            r0.b = r1
                            r0.<init>(r2)
                            return
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                            r1 = this;
                            r1.a = r2
                            int r2 = r1.c
                            r0 = -2147483648(0xffffffff80000000, float:-0.0)
                            r2 = r2 | r0
                            r1.c = r2
                            kotlinx.coroutines.flow.internal.k$c$c$a<T> r2 = r1.b
                            r0 = 0
                            java.lang.Object r2 = r2.emit(r0, r1)
                            return r2
                    }
                }

                a(kotlinx.coroutines.channels.z<java.lang.Object> r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object emit(T2 r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.k.c.C0101c.a.C0102a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = (kotlinx.coroutines.flow.internal.k.c.C0101c.a.C0102a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.k$c$c$a$a r0 = new kotlinx.coroutines.flow.internal.k$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.g0.n(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.g0.n(r6)
                        kotlinx.coroutines.channels.z<java.lang.Object> r6 = r4.a
                        kotlinx.coroutines.channels.c0 r6 = r6.getChannel()
                        if (r5 != 0) goto L3e
                        kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.a
                    L3e:
                        r0.c = r3
                        java.lang.Object r5 = r6.T(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.n1 r5 = kotlin.n1.a
                        return r5
                }
            }

            C0101c(kotlinx.coroutines.flow.i<? extends T2> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.c.C0101c> r2) {
                    r0 = this;
                    r0.c = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    kotlinx.coroutines.flow.internal.k$c$c r0 = new kotlinx.coroutines.flow.internal.k$c$c
                    kotlinx.coroutines.flow.i<T2> r1 = r2.c
                    r0.<init>(r1, r4)
                    r0.b = r3
                    return r0
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.z<? super java.lang.Object> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke2(r1, r2)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<java.lang.Object> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.internal.k$c$c r1 = (kotlinx.coroutines.flow.internal.k.c.C0101c) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r4.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.g0.n(r5)
                    goto L2e
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.g0.n(r5)
                    java.lang.Object r5 = r4.b
                    kotlinx.coroutines.channels.z r5 = (kotlinx.coroutines.channels.z) r5
                    kotlinx.coroutines.flow.i<T2> r1 = r4.c
                    kotlinx.coroutines.flow.internal.k$c$c$a r3 = new kotlinx.coroutines.flow.internal.k$c$c$a
                    r3.<init>(r5)
                    r4.a = r2
                    java.lang.Object r5 = r1.collect(r3, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    kotlin.n1 r5 = kotlin.n1.a
                    return r5
            }
        }

        c(kotlinx.coroutines.flow.j<? super R> r1, kotlinx.coroutines.flow.i<? extends T2> r2, kotlinx.coroutines.flow.i<? extends T1> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.k.c> r5) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r0.e = r3
                r0.f = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r8) {
                r6 = this;
                kotlinx.coroutines.flow.internal.k$c r0 = new kotlinx.coroutines.flow.internal.k$c
                kotlinx.coroutines.flow.j<R> r1 = r6.c
                kotlinx.coroutines.flow.i<T2> r2 = r6.d
                kotlinx.coroutines.flow.i<T1> r3 = r6.e
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r6.f
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r0.b = r7
                return r0
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
                kotlinx.coroutines.flow.internal.k$c r1 = (kotlinx.coroutines.flow.internal.k.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
                r24 = this;
                r4 = r24
                java.lang.Object r7 = kotlin.coroutines.intrinsics.a.l()
                int r0 = r4.a
                r8 = 1
                r9 = 0
                if (r0 == 0) goto L26
                if (r0 != r8) goto L1e
                java.lang.Object r0 = r4.b
                r1 = r0
                kotlinx.coroutines.channels.b0 r1 = (kotlinx.coroutines.channels.b0) r1
                kotlin.g0.n(r25)     // Catch: java.lang.Throwable -> L18 kotlinx.coroutines.flow.internal.AbortFlowException -> L1b
                goto L8d
            L18:
                r0 = move-exception
                goto Lad
            L1b:
                r0 = move-exception
                goto La4
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                kotlin.g0.n(r25)
                java.lang.Object r0 = r4.b
                r10 = r0
                kotlinx.coroutines.r0 r10 = (kotlinx.coroutines.r0) r10
                kotlinx.coroutines.flow.internal.k$c$c r13 = new kotlinx.coroutines.flow.internal.k$c$c
                kotlinx.coroutines.flow.i<T2> r0 = r4.d
                r13.<init>(r0, r9)
                r14 = 3
                r15 = 0
                r11 = 0
                r12 = 0
                kotlinx.coroutines.channels.b0 r1 = kotlinx.coroutines.channels.x.f(r10, r11, r12, r13, r14, r15)
                kotlinx.coroutines.b0 r0 = kotlinx.coroutines.h2.c(r9, r8, r9)
                java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>"
                kotlin.jvm.internal.g0.n(r1, r2)
                r2 = r1
                kotlinx.coroutines.channels.c0 r2 = (kotlinx.coroutines.channels.c0) r2
                kotlinx.coroutines.flow.internal.k$c$a r3 = new kotlinx.coroutines.flow.internal.k$c$a
                kotlinx.coroutines.flow.j<R> r5 = r4.c
                r3.<init>(r0, r5)
                r2.q(r3)
                kotlin.coroutines.i r18 = r10.getCoroutineContext()     // Catch: java.lang.Throwable -> L9f kotlinx.coroutines.flow.internal.AbortFlowException -> La2
                java.lang.Object r19 = kotlinx.coroutines.internal.y0.b(r18)     // Catch: java.lang.Throwable -> L9f kotlinx.coroutines.flow.internal.AbortFlowException -> La2
                kotlin.coroutines.i r2 = r10.getCoroutineContext()     // Catch: java.lang.Throwable -> L9f kotlinx.coroutines.flow.internal.AbortFlowException -> La2
                kotlin.coroutines.i r0 = r2.plus(r0)     // Catch: java.lang.Throwable -> L9f kotlinx.coroutines.flow.internal.AbortFlowException -> La2
                r20 = r1
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L97 kotlinx.coroutines.flow.internal.AbortFlowException -> L9b
                kotlinx.coroutines.flow.internal.k$c$b r16 = new kotlinx.coroutines.flow.internal.k$c$b     // Catch: java.lang.Throwable -> L97 kotlinx.coroutines.flow.internal.AbortFlowException -> L9b
                kotlinx.coroutines.flow.i<T1> r2 = r4.e     // Catch: java.lang.Throwable -> L97 kotlinx.coroutines.flow.internal.AbortFlowException -> L9b
                kotlinx.coroutines.flow.j<R> r3 = r4.c     // Catch: java.lang.Throwable -> L97 kotlinx.coroutines.flow.internal.AbortFlowException -> L9b
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r5 = r4.f     // Catch: java.lang.Throwable -> L97 kotlinx.coroutines.flow.internal.AbortFlowException -> L9b
                r23 = 0
                r17 = r2
                r21 = r3
                r22 = r5
                r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L97 kotlinx.coroutines.flow.internal.AbortFlowException -> L9b
                r10 = r20
                r4.b = r10     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L94
                r4.a = r8     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L94
                r2 = 0
                r5 = 4
                r6 = 0
                r3 = r16
                java.lang.Object r0 = kotlinx.coroutines.flow.internal.e.d(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L91 kotlinx.coroutines.flow.internal.AbortFlowException -> L94
                if (r0 != r7) goto L8c
                return r7
            L8c:
                r1 = r10
            L8d:
                kotlinx.coroutines.channels.b0.a.b(r1, r9, r8, r9)
                goto Laa
            L91:
                r0 = move-exception
            L92:
                r1 = r10
                goto Lad
            L94:
                r0 = move-exception
            L95:
                r1 = r10
                goto La4
            L97:
                r0 = move-exception
                r10 = r20
                goto L92
            L9b:
                r0 = move-exception
                r10 = r20
                goto L95
            L9f:
                r0 = move-exception
                r10 = r1
                goto Lad
            La2:
                r0 = move-exception
                r10 = r1
            La4:
                kotlinx.coroutines.flow.j<R> r2 = r4.c     // Catch: java.lang.Throwable -> L18
                kotlinx.coroutines.flow.internal.o.b(r0, r2)     // Catch: java.lang.Throwable -> L18
                goto L8d
            Laa:
                kotlin.n1 r0 = kotlin.n1.a
                return r0
            Lad:
                kotlinx.coroutines.channels.b0.a.b(r1, r9, r8, r9)
                throw r0
        }
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <R, T> java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r6, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T>[] r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<T[]> r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r10) {
            kotlinx.coroutines.flow.internal.k$a r0 = new kotlinx.coroutines.flow.internal.k$a
            r5 = 0
            r4 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r6 = kotlinx.coroutines.flow.internal.n.a(r0, r10)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.l()
            if (r6 != r7) goto L15
            return r6
        L15:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.internal.k$b r0 = new kotlinx.coroutines.flow.internal.k$b
            r0.<init>(r2, r1, r3)
            return r0
    }
}
