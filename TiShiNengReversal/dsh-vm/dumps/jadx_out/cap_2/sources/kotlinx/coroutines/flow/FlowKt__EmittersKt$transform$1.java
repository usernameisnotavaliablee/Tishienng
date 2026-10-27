package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__EmittersKt$transform$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_transform;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> a;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> b;

        public AnonymousClass1(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, kotlinx.coroutines.flow.j<? super R> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object a(T r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
                r2 = this;
                r0 = 4
                kotlin.jvm.internal.d0.e(r0)
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                r0.<init>(r2, r4)
                r0 = 5
                kotlin.jvm.internal.d0.e(r0)
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r2.a
                kotlinx.coroutines.flow.j<R> r1 = r2.b
                r0.invoke(r1, r3, r4)
                kotlin.n1 r3 = kotlin.n1.a
                return r3
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r6)
                goto L41
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.g0.n(r6)
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r6 = r4.a
                kotlinx.coroutines.flow.j<R> r2 = r4.b
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    public FlowKt__EmittersKt$transform$1(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1> r3) {
            r0 = this;
            r0.$this_transform = r1
            r0.$transform = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1
            kotlinx.coroutines.flow.i<T> r1 = r3.$this_transform
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r2 = r3.$transform
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 r1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r6)
            goto L30
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.g0.n(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
            kotlinx.coroutines.flow.i<T> r1 = r5.$this_transform
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r4 = r5.$transform
            r3.<init>(r4, r6)
            r5.label = r2
            java.lang.Object r6 = r1.collect(r3, r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend$$forInline(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlinx.coroutines.flow.i<T> r0 = r3.$this_transform
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r2 = r3.$transform
            r1.<init>(r2, r4)
            r4 = 0
            kotlin.jvm.internal.d0.e(r4)
            r0.collect(r1, r3)
            r4 = 1
            kotlin.jvm.internal.d0.e(r4)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
