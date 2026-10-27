package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__CollectKt {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> b;

        a(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__CollectKt.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowKt__CollectKt$a r2 = new kotlinx.coroutines.flow.FlowKt__CollectKt$a
                kotlinx.coroutines.flow.i<T> r0 = r1.b
                r2.<init>(r0, r3)
                return r2
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
                kotlinx.coroutines.flow.FlowKt__CollectKt$a r1 = (kotlinx.coroutines.flow.FlowKt__CollectKt.a) r1
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
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                goto L25
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                kotlinx.coroutines.flow.i<T> r4 = r3.b
                r3.a = r2
                java.lang.Object r4 = kotlinx.coroutines.flow.k.x(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<?> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            kotlinx.coroutines.flow.internal.r r0 = kotlinx.coroutines.flow.internal.r.a
            java.lang.Object r1 = r1.collect(r0, r2)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto Ld
            return r1
        Ld:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> java.lang.Object b(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3
            r0.<init>(r2)
            java.lang.Object r1 = r1.collect(r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto L10
            return r1
        L10:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> java.lang.Object c(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3
            r0.<init>(r2)
            r2 = 0
            kotlin.jvm.internal.d0.e(r2)
            r1.collect(r0, r3)
            r1 = 1
            kotlin.jvm.internal.d0.e(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2
            r0.<init>(r2)
            java.lang.Object r1 = r1.collect(r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto L10
            return r1
        L10:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final <T> java.lang.Object e(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2
            r0.<init>(r2)
            r2 = 0
            kotlin.jvm.internal.d0.e(r2)
            r1.collect(r0, r3)
            r1 = 1
            kotlin.jvm.internal.d0.e(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.X0(r2, r3)
            r3 = 0
            r0 = 2
            r1 = 0
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.q(r2, r1, r3, r0, r3)
            java.lang.Object r2 = kotlinx.coroutines.flow.k.x(r2, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L16
            return r2
        L16:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            kotlinx.coroutines.flow.k.o0(r0)
            java.lang.Object r0 = r1.collect(r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto Le
            return r0
        Le:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.e2 h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r6, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r7) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$a r3 = new kotlinx.coroutines.flow.FlowKt__CollectKt$a
            r0 = 0
            r3.<init>(r6, r0)
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r7
            kotlinx.coroutines.e2 r6 = kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
