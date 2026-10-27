package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ViewDataBindingKtx$StateFlowListener$startCollection$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.i<java.lang.Object> $flow;
    final /* synthetic */ androidx.lifecycle.LifecycleOwner $owner;
    int label;
    final /* synthetic */ androidx.databinding.ViewDataBindingKtx.StateFlowListener this$0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i<java.lang.Object> $flow;
        int label;
        final /* synthetic */ androidx.databinding.ViewDataBindingKtx.StateFlowListener this$0;


        AnonymousClass1(kotlinx.coroutines.flow.i<? extends java.lang.Object> r1, androidx.databinding.ViewDataBindingKtx.StateFlowListener r2, kotlin.coroutines.e<? super androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1.AnonymousClass1> r3) {
                r0 = this;
                r0.$flow = r1
                r0.this$0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1 r3 = new androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1
                kotlinx.coroutines.flow.i<java.lang.Object> r0 = r2.$flow
                androidx.databinding.ViewDataBindingKtx$StateFlowListener r1 = r2.this$0
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1 r1 = (androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r5)
                goto L2c
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                kotlinx.coroutines.flow.i<java.lang.Object> r5 = r4.$flow
                androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1$1 r1 = new androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1$1
                androidx.databinding.ViewDataBindingKtx$StateFlowListener r3 = r4.this$0
                r1.<init>(r3)
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    ViewDataBindingKtx$StateFlowListener$startCollection$1(androidx.lifecycle.LifecycleOwner r1, kotlinx.coroutines.flow.i<? extends java.lang.Object> r2, androidx.databinding.ViewDataBindingKtx.StateFlowListener r3, kotlin.coroutines.e<? super androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1> r4) {
            r0 = this;
            r0.$owner = r1
            r0.$flow = r2
            r0.this$0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
            r3 = this;
            androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1 r4 = new androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1
            androidx.lifecycle.LifecycleOwner r0 = r3.$owner
            kotlinx.coroutines.flow.i<java.lang.Object> r1 = r3.$flow
            androidx.databinding.ViewDataBindingKtx$StateFlowListener r2 = r3.this$0
            r4.<init>(r0, r1, r2, r5)
            return r4
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1 r1 = (androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
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
            androidx.lifecycle.LifecycleOwner r8 = r7.$owner
            androidx.lifecycle.Lifecycle r8 = r8.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1 r3 = new androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1
            kotlinx.coroutines.flow.i<java.lang.Object> r4 = r7.$flow
            androidx.databinding.ViewDataBindingKtx$StateFlowListener r5 = r7.this$0
            r6 = 0
            r3.<init>(r4, r5, r6)
            r7.label = r2
            java.lang.Object r8 = androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r8, r1, r3, r7)
            if (r8 != r0) goto L35
            return r0
        L35:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }
}
