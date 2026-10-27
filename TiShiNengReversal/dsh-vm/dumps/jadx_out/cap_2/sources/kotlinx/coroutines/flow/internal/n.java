package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,63:1\n107#2:64\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n50#1:64\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,113:1\n51#2,2:114\n*E\n"})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {
        final /* synthetic */ kotlin.jvm.functions.Function3 a;

        public a(kotlin.jvm.functions.Function3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
                r3 = this;
                kotlinx.coroutines.flow.internal.n$b r0 = new kotlinx.coroutines.flow.internal.n$b
                kotlin.jvm.functions.Function3 r1 = r3.a
                r2 = 0
                r0.<init>(r1, r4, r2)
                java.lang.Object r4 = kotlinx.coroutines.flow.internal.n.a(r0, r5)
                java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
                if (r4 != r5) goto L13
                return r4
            L13:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.r0, kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> c;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> d;

        b(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.r0, ? super kotlinx.coroutines.flow.j<? super R>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, kotlinx.coroutines.flow.j<? super R> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.n.b> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.internal.n$b r0 = new kotlinx.coroutines.flow.internal.n$b
                kotlin.jvm.functions.Function3<kotlinx.coroutines.r0, kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r3.c
                kotlinx.coroutines.flow.j<R> r2 = r3.d
                r0.<init>(r1, r2, r5)
                r0.b = r4
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
                kotlinx.coroutines.flow.internal.n$b r1 = (kotlinx.coroutines.flow.internal.n.b) r1
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
                goto L2b
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                java.lang.Object r5 = r4.b
                kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
                kotlin.jvm.functions.Function3<kotlinx.coroutines.r0, kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r4.c
                kotlinx.coroutines.flow.j<R> r3 = r4.d
                r4.a = r2
                java.lang.Object r5 = r1.invoke(r5, r3, r4)
                if (r5 != r0) goto L2b
                return r0
            L2b:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object a(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            kotlinx.coroutines.flow.internal.m r0 = new kotlinx.coroutines.flow.internal.m
            kotlin.coroutines.i r1 = r3.getContext()
            r0.<init>(r1, r3)
            java.lang.Object r2 = n4.b.e(r0, r0, r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L16
            kotlin.coroutines.jvm.internal.e.c(r3)
        L16:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> b(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.r0, ? super kotlinx.coroutines.flow.j<? super R>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.internal.n$a r0 = new kotlinx.coroutines.flow.internal.n$a
            r0.<init>(r1)
            return r0
    }
}
