package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1<T> implements kotlinx.coroutines.flow.i<T> {
    final /* synthetic */ kotlinx.coroutines.flow.i a;
    final /* synthetic */ kotlin.jvm.functions.Function2 b;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n29#2,2:223\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.flow.j a;
        final /* synthetic */ kotlin.jvm.functions.Function2 b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u241"}, s = {"L$0", "L$1"})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object L$0;
            java.lang.Object L$1;
            int label;
            /* synthetic */ java.lang.Object result;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2 this$0;

            public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2 r1, kotlin.coroutines.e r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.result = r2
                    int r2 = r1.label
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.label = r2
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2 r2 = r1.this$0
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.j r1, kotlin.jvm.functions.Function2 r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object a(java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r4) {
                r2 = this;
                r0 = 4
                kotlin.jvm.internal.d0.e(r0)
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1
                r0.<init>(r2, r4)
                r0 = 5
                kotlin.jvm.internal.d0.e(r0)
                kotlinx.coroutines.flow.j r0 = r2.a
                kotlin.jvm.functions.Function2 r1 = r2.b
                java.lang.Object r1 = r1.invoke(r3, r4)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L28
                r1 = 0
                kotlin.jvm.internal.d0.e(r1)
                r0.emit(r3, r4)
                r3 = 1
                kotlin.jvm.internal.d0.e(r3)
            L28:
                kotlin.n1 r3 = kotlin.n1.a
                return r3
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.g0.n(r8)
                goto L6c
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$1
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                java.lang.Object r2 = r0.L$0
                kotlin.g0.n(r8)
                goto L56
            L3e:
                kotlin.g0.n(r8)
                kotlinx.coroutines.flow.j r8 = r6.a
                kotlin.jvm.functions.Function2 r2 = r6.b
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r2 = r2.invoke(r7, r0)
                if (r2 != r1) goto L52
                goto L6b
            L52:
                r5 = r2
                r2 = r7
                r7 = r8
                r8 = r5
            L56:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L6c
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L6c
            L6b:
                return r1
            L6c:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(kotlinx.coroutines.flow.i r1, kotlin.jvm.functions.Function2 r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r5) {
            r3 = this;
            kotlinx.coroutines.flow.i r0 = r3.a
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r2 = r3.b
            r1.<init>(r4, r2)
            java.lang.Object r4 = r0.collect(r1, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L14
            return r4
        L14:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r5) {
            r3 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$1
            r0.<init>(r3, r5)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.i r0 = r3.a
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r2 = r3.b
            r1.<init>(r4, r2)
            r4 = 0
            kotlin.jvm.internal.d0.e(r4)
            r0.collect(r1, r5)
            r4 = 1
            kotlin.jvm.internal.d0.e(r4)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
