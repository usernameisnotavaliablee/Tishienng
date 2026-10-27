package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class x<T> implements kotlinx.coroutines.flow.j<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> c;

        a(kotlinx.coroutines.flow.j<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.x.a> r2) {
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
                kotlinx.coroutines.flow.internal.x$a r0 = new kotlinx.coroutines.flow.internal.x$a
                kotlinx.coroutines.flow.j<T> r1 = r2.c
                r0.<init>(r1, r4)
                r0.b = r3
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(T r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.x$a r1 = (kotlinx.coroutines.flow.internal.x.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.f(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                java.lang.Object r4 = r3.b
                kotlinx.coroutines.flow.j<T> r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = r1.emit(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public x(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            r1 = this;
            r1.<init>()
            r1.a = r3
            java.lang.Object r3 = kotlinx.coroutines.internal.y0.b(r3)
            r1.b = r3
            kotlinx.coroutines.flow.internal.x$a r3 = new kotlinx.coroutines.flow.internal.x$a
            r0 = 0
            r3.<init>(r2, r0)
            r1.c = r3
            return
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            kotlin.coroutines.i r0 = r3.a
            java.lang.Object r1 = r3.b
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r2 = r3.c
            java.lang.Object r4 = kotlinx.coroutines.flow.internal.e.c(r0, r4, r1, r2, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L11
            return r4
        L11:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
