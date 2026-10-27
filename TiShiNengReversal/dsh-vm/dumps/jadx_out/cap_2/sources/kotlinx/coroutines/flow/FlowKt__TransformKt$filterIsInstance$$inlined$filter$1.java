package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements kotlinx.coroutines.flow.i<java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.i a;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2:223\n36#2:224\n23#2:225\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.flow.j a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object L$0;
            java.lang.Object L$1;
            int label;
            /* synthetic */ java.lang.Object result;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2 this$0;

            public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2 r1, kotlin.coroutines.e r2) {
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
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 r2 = r1.this$0
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object a(java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r5) {
                r3 = this;
                r0 = 4
                kotlin.jvm.internal.d0.e(r0)
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r0.<init>(r3, r5)
                r0 = 5
                kotlin.jvm.internal.d0.e(r0)
                kotlinx.coroutines.flow.j r0 = r3.a
                r1 = 3
                java.lang.String r2 = "R"
                kotlin.jvm.internal.g0.y(r1, r2)
                boolean r1 = androidx.activity.k.a(r4)
                if (r1 == 0) goto L26
                r1 = 0
                kotlin.jvm.internal.d0.e(r1)
                r0.emit(r4, r5)
                r4 = 1
                kotlin.jvm.internal.d0.e(r4)
            L26:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r7) {
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r7)
                goto L4b
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.g0.n(r7)
                kotlinx.coroutines.flow.j r7 = r5.a
                r2 = 3
                java.lang.String r4 = "R"
                kotlin.jvm.internal.g0.y(r2, r4)
                boolean r2 = androidx.activity.k.a(r6)
                if (r2 == 0) goto L4b
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L4b
                return r1
            L4b:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(kotlinx.coroutines.flow.i r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r4) {
            r2 = this;
            kotlinx.coroutines.flow.i r0 = r2.a
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2
            r1.<init>(r3)
            java.lang.Object r3 = r0.collect(r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L15
            return r3
        L15:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r4) {
            r2 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$1
            r0.<init>(r2, r4)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.i r0 = r2.a
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2
            r1.<init>(r3)
            r3 = 0
            kotlin.jvm.internal.d0.e(r3)
            r0.collect(r1, r4)
            r3 = 1
            kotlin.jvm.internal.d0.e(r3)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }
}
