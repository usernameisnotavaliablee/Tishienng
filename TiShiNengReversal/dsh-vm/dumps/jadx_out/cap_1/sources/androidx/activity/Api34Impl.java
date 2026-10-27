package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(34)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api34Impl {

    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.Api34Impl INSTANCE = null;

    static {
            androidx.activity.Api34Impl r0 = new androidx.activity.Api34Impl
            r0.<init>()
            androidx.activity.Api34Impl.INSTANCE = r0
            return
    }

    private Api34Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.DoNotInline
    @org.jetbrains.annotations.NotNull
    public final android.window.BackEvent createOnBackEvent(float r2, float r3, float r4, int r5) {
            r1 = this;
            android.window.BackEvent r0 = new android.window.BackEvent
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    @androidx.annotation.DoNotInline
    public final float progress(@org.jetbrains.annotations.NotNull android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            float r2 = r2.getProgress()
            return r2
    }

    @androidx.annotation.DoNotInline
    public final int swipeEdge(@org.jetbrains.annotations.NotNull android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r2 = r2.getSwipeEdge()
            return r2
    }

    @androidx.annotation.DoNotInline
    public final float touchX(@org.jetbrains.annotations.NotNull android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            float r2 = r2.getTouchX()
            return r2
    }

    @androidx.annotation.DoNotInline
    public final float touchY(@org.jetbrains.annotations.NotNull android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            float r2 = r2.getTouchY()
            return r2
    }
}
