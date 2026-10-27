package androidx.lifecycle;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class FlowExtKt$flowWithLifecycle$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ androidx.lifecycle.Lifecycle $lifecycle;
    final /* synthetic */ androidx.lifecycle.Lifecycle.State $minActiveState;
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_flowWithLifecycle;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.z<T> $$this$callbackFlow;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_flowWithLifecycle;
        int label;


        AnonymousClass1(kotlinx.coroutines.flow.i<? extends T> r1, kotlinx.coroutines.channels.z<? super T> r2, kotlin.coroutines.e<? super androidx.lifecycle.FlowExtKt$flowWithLifecycle$1.AnonymousClass1> r3) {
                r0 = this;
                r0.$this_flowWithLifecycle = r1
                r0.$$this$callbackFlow = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 r3 = new androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1
                kotlinx.coroutines.flow.i<T> r0 = r2.$this_flowWithLifecycle
                kotlinx.coroutines.channels.z<T> r1 = r2.$$this$callbackFlow
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

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 r1 = (androidx.lifecycle.FlowExtKt$flowWithLifecycle$1.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
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
                kotlinx.coroutines.flow.i<T> r5 = r4.$this_flowWithLifecycle
                androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$1 r1 = new androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$1
                kotlinx.coroutines.channels.z<T> r3 = r4.$$this$callbackFlow
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

    FlowExtKt$flowWithLifecycle$1(androidx.lifecycle.Lifecycle r1, androidx.lifecycle.Lifecycle.State r2, kotlinx.coroutines.flow.i<? extends T> r3, kotlin.coroutines.e<? super androidx.lifecycle.FlowExtKt$flowWithLifecycle$1> r4) {
            r0 = this;
            r0.$lifecycle = r1
            r0.$minActiveState = r2
            r0.$this_flowWithLifecycle = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r6) {
            r4 = this;
            androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 r0 = new androidx.lifecycle.FlowExtKt$flowWithLifecycle$1
            androidx.lifecycle.Lifecycle r1 = r4.$lifecycle
            androidx.lifecycle.Lifecycle$State r2 = r4.$minActiveState
            kotlinx.coroutines.flow.i<T> r3 = r4.$this_flowWithLifecycle
            r0.<init>(r1, r2, r3, r6)
            r0.L$0 = r5
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 r1 = (androidx.lifecycle.FlowExtKt$flowWithLifecycle$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r7.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.channels.z r0 = (kotlinx.coroutines.channels.z) r0
            kotlin.g0.n(r8)
            goto L3a
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            kotlin.g0.n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.channels.z r8 = (kotlinx.coroutines.channels.z) r8
            androidx.lifecycle.Lifecycle r1 = r7.$lifecycle
            androidx.lifecycle.Lifecycle$State r4 = r7.$minActiveState
            androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 r5 = new androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1
            kotlinx.coroutines.flow.i<T> r6 = r7.$this_flowWithLifecycle
            r5.<init>(r6, r8, r2)
            r7.L$0 = r8
            r7.label = r3
            java.lang.Object r1 = androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(r1, r4, r5, r7)
            if (r1 != r0) goto L39
            return r0
        L39:
            r0 = r8
        L3a:
            kotlinx.coroutines.channels.c0.a.a(r0, r2, r3, r2)
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }
}
