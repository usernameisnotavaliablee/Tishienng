package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f0 implements kotlinx.coroutines.flow.c0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super kotlinx.coroutines.flow.SharingCommand>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.h0<java.lang.Integer> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlinx.coroutines.flow.f0$a$a, reason: collision with other inner class name */
        static final class C0090a<T> implements kotlinx.coroutines.flow.j {
            final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef a;
            final /* synthetic */ kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.SharingCommand> b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.f0$a$a$a, reason: collision with other inner class name */
            static final class C0091a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                /* synthetic */ java.lang.Object a;
                final /* synthetic */ kotlinx.coroutines.flow.f0.a.C0090a<T> b;
                int c;

                C0091a(kotlinx.coroutines.flow.f0.a.C0090a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.f0.a.C0090a.C0091a> r2) {
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
                        kotlinx.coroutines.flow.f0$a$a<T> r2 = r1.b
                        r0 = 0
                        java.lang.Object r2 = r2.a(r0, r1)
                        return r2
                }
            }

            C0090a(kotlin.jvm.internal.Ref.BooleanRef r1, kotlinx.coroutines.flow.j<? super kotlinx.coroutines.flow.SharingCommand> r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object a(int r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.f0.a.C0090a.C0091a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.f0$a$a$a r0 = (kotlinx.coroutines.flow.f0.a.C0090a.C0091a) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.f0$a$a$a r0 = new kotlinx.coroutines.flow.f0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.g0.n(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.g0.n(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.a
                    boolean r6 = r5.element
                    if (r6 != 0) goto L4e
                    r5.element = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.SharingCommand> r5 = r4.b
                    kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                    r0.c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.n1 r5 = kotlin.n1.a
                    return r5
                L4e:
                    kotlin.n1 r5 = kotlin.n1.a
                    return r5
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.e r2) {
                    r0 = this;
                    java.lang.Number r1 = (java.lang.Number) r1
                    int r1 = r1.intValue()
                    java.lang.Object r1 = r0.a(r1, r2)
                    return r1
            }
        }

        a(kotlinx.coroutines.flow.h0<java.lang.Integer> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.f0.a> r2) {
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
                kotlinx.coroutines.flow.f0$a r0 = new kotlinx.coroutines.flow.f0$a
                kotlinx.coroutines.flow.h0<java.lang.Integer> r1 = r2.c
                r0.<init>(r1, r4)
                r0.b = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.j<? super kotlinx.coroutines.flow.SharingCommand> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super kotlinx.coroutines.flow.SharingCommand> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.f0$a r1 = (kotlinx.coroutines.flow.f0.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 == r2) goto L13
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L13:
                kotlin.g0.n(r6)
                goto L33
            L17:
                kotlin.g0.n(r6)
                java.lang.Object r6 = r5.b
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
                r1.<init>()
                kotlinx.coroutines.flow.h0<java.lang.Integer> r3 = r5.c
                kotlinx.coroutines.flow.f0$a$a r4 = new kotlinx.coroutines.flow.f0$a$a
                r4.<init>(r1, r6)
                r5.a = r2
                java.lang.Object r6 = r3.collect(r4, r5)
                if (r6 != r0) goto L33
                return r0
            L33:
                kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
                r6.<init>()
                throw r6
        }
    }

    public f0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.SharingCommand> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.h0<java.lang.Integer> r3) {
            r2 = this;
            kotlinx.coroutines.flow.f0$a r0 = new kotlinx.coroutines.flow.f0$a
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.J0(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "SharingStarted.Lazily"
            return r0
    }
}
