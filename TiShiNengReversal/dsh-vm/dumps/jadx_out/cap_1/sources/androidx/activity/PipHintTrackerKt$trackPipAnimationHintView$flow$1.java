package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super android.graphics.Rect>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ android.view.View $view;
    private /* synthetic */ java.lang.Object L$0;
    int label;


    PipHintTrackerKt$trackPipAnimationHintView$flow$1(android.view.View r1, kotlin.coroutines.e<? super androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1> r2) {
            r0 = this;
            r0.$view = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ void f(kotlinx.coroutines.channels.z r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            invokeSuspend$lambda$0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ void i(kotlinx.coroutines.channels.z r0, android.view.View r1) {
            invokeSuspend$lambda$1(r0, r1)
            return
    }

    private static final void invokeSuspend$lambda$0(kotlinx.coroutines.channels.z r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            if (r2 != r6) goto La
            if (r4 != r8) goto La
            if (r3 != r7) goto La
            if (r5 == r9) goto L9
            goto La
        L9:
            return
        La:
            android.graphics.Rect r1 = androidx.activity.PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(r1)
            r0.r(r1)
            return
    }

    private static final void invokeSuspend$lambda$1(kotlinx.coroutines.channels.z r0, android.view.View r1) {
            android.graphics.Rect r1 = androidx.activity.PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(r1)
            r0.r(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1 r0 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1
            android.view.View r1 = r2.$view
            r0.<init>(r1, r4)
            r0.L$0 = r3
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
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super android.graphics.Rect> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1 r1 = (androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r8)
            goto L67
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.g0.n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.channels.z r8 = (kotlinx.coroutines.channels.z) r8
            androidx.activity.m r1 = new androidx.activity.m
            r1.<init>(r8)
            android.view.View r3 = r7.$view
            androidx.activity.n r4 = new androidx.activity.n
            r4.<init>(r8, r3)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 r3 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
            android.view.View r5 = r7.$view
            r3.<init>(r8, r5, r4, r1)
            androidx.activity.Api19Impl r5 = androidx.activity.Api19Impl.INSTANCE
            android.view.View r6 = r7.$view
            boolean r5 = r5.isAttachedToWindow(r6)
            if (r5 == 0) goto L52
            android.view.View r5 = r7.$view
            android.graphics.Rect r5 = androidx.activity.PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(r5)
            r8.r(r5)
            android.view.View r5 = r7.$view
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            r5.addOnScrollChangedListener(r4)
            android.view.View r5 = r7.$view
            r5.addOnLayoutChangeListener(r1)
        L52:
            android.view.View r5 = r7.$view
            r5.addOnAttachStateChangeListener(r3)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1 r5 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1
            android.view.View r6 = r7.$view
            r5.<init>(r6, r4, r1, r3)
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.channels.x.a(r8, r5, r7)
            if (r8 != r0) goto L67
            return r0
        L67:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }
}
