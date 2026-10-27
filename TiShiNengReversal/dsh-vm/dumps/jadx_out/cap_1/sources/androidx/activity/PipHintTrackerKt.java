package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PipHintTrackerKt {
    public static final /* synthetic */ android.graphics.Rect access$trackPipAnimationHintView$positionInWindow(android.view.View r0) {
            android.graphics.Rect r0 = trackPipAnimationHintView$positionInWindow(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object trackPipAnimationHintView(@org.jetbrains.annotations.NotNull android.app.Activity r2, @org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1 r0 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.s(r0)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2 r0 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            r0.<init>(r2)
            java.lang.Object r2 = r3.collect(r0, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L1a
            return r2
        L1a:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final android.graphics.Rect trackPipAnimationHintView$positionInWindow(android.view.View r1) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.getGlobalVisibleRect(r0)
            return r0
    }
}
