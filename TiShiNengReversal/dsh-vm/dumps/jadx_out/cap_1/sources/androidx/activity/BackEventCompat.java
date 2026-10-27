package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BackEventCompat {

    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.BackEventCompat.Companion Companion = null;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface SwipeEdge {
    }

    static {
            androidx.activity.BackEventCompat$Companion r0 = new androidx.activity.BackEventCompat$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.BackEventCompat.Companion = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    public BackEventCompat(float r1, float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.touchX = r1
            r0.touchY = r2
            r0.progress = r3
            r0.swipeEdge = r4
            return
    }

    @androidx.annotation.RequiresApi(34)
    public BackEventCompat(@org.jetbrains.annotations.NotNull android.window.BackEvent r5) {
            r4 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r1 = r0.touchX(r5)
            float r2 = r0.touchY(r5)
            float r3 = r0.progress(r5)
            int r5 = r0.swipeEdge(r5)
            r4.<init>(r1, r2, r3, r5)
            return
    }

    public final float getProgress() {
            r1 = this;
            float r0 = r1.progress
            return r0
    }

    public final int getSwipeEdge() {
            r1 = this;
            int r0 = r1.swipeEdge
            return r0
    }

    public final float getTouchX() {
            r1 = this;
            float r0 = r1.touchX
            return r0
    }

    public final float getTouchY() {
            r1 = this;
            float r0 = r1.touchY
            return r0
    }

    @androidx.annotation.RequiresApi(34)
    @org.jetbrains.annotations.NotNull
    public final android.window.BackEvent toBackEvent() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L15
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.INSTANCE
            float r1 = r5.touchX
            float r2 = r5.touchY
            float r3 = r5.progress
            int r4 = r5.swipeEdge
            android.window.BackEvent r0 = r0.createOnBackEvent(r1, r2, r3, r4)
            return r0
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only supported on API level 34+"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BackEventCompat{touchX="
            r0.append(r1)
            float r1 = r2.touchX
            r0.append(r1)
            java.lang.String r1 = ", touchY="
            r0.append(r1)
            float r1 = r2.touchY
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            float r1 = r2.progress
            r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            r0.append(r1)
            int r1 = r2.swipeEdge
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
