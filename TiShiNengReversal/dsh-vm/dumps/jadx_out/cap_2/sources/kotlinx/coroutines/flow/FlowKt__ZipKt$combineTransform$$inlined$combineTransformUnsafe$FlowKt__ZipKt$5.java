package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.i[] $flows;
    final /* synthetic */ kotlin.jvm.functions.Function7 $transform$inlined;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n221#2,8:333\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, java.lang.Object[], kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function7 $transform$inlined;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        public AnonymousClass1(kotlin.coroutines.e r1, kotlin.jvm.functions.Function7 r2) {
                r0 = this;
                r0.$transform$inlined = r2
                r2 = 3
                r0.<init>(r2, r1)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object[] r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r3, @org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r5) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1
                kotlin.jvm.functions.Function7 r1 = r2.$transform$inlined
                r0.<init>(r5, r1)
                r0.L$0 = r3
                r0.L$1 = r4
                kotlin.n1 r3 = kotlin.n1.a
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r12)
                goto L45
            Lf:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L17:
                kotlin.g0.n(r12)
                java.lang.Object r12 = r11.L$0
                r4 = r12
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r12 = r11.L$1
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                kotlin.jvm.functions.Function7 r3 = r11.$transform$inlined
                r1 = 0
                r5 = r12[r1]
                r6 = r12[r2]
                r1 = 2
                r7 = r12[r1]
                r1 = 3
                r8 = r12[r1]
                r1 = 4
                r9 = r12[r1]
                r11.label = r2
                r12 = 6
                kotlin.jvm.internal.d0.e(r12)
                r10 = r11
                java.lang.Object r12 = r3.invoke(r4, r5, r6, r7, r8, r9, r10)
                r1 = 7
                kotlin.jvm.internal.d0.e(r1)
                if (r12 != r0) goto L45
                return r0
            L45:
                kotlin.n1 r12 = kotlin.n1.a
                return r12
        }
    }

    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(kotlinx.coroutines.flow.i[] r1, kotlin.coroutines.e r2, kotlin.jvm.functions.Function7 r3) {
            r0 = this;
            r0.$flows = r1
            r0.$transform$inlined = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5
            kotlinx.coroutines.flow.i[] r1 = r3.$flows
            kotlin.jvm.functions.Function7 r2 = r3.$transform$inlined
            r0.<init>(r1, r5, r2)
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
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 r1 = (kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r8)
            goto L35
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.g0.n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
            kotlinx.coroutines.flow.i[] r1 = r7.$flows
            kotlin.jvm.functions.Function0 r3 = kotlinx.coroutines.flow.FlowKt__ZipKt.a()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1 r4 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1
            r5 = 0
            kotlin.jvm.functions.Function7 r6 = r7.$transform$inlined
            r4.<init>(r5, r6)
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.internal.k.a(r8, r1, r3, r4, r7)
            if (r8 != r0) goto L35
            return r0
        L35:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }
}
