package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class GestureDetectorCompat {
    private final android.view.GestureDetector mDetector;

    public GestureDetectorCompat(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.view.GestureDetector.OnGestureListener r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GestureDetectorCompat(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.view.GestureDetector.OnGestureListener r3, @androidx.annotation.Nullable android.os.Handler r4) {
            r1 = this;
            r1.<init>()
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r2, r3, r4)
            r1.mDetector = r0
            return
    }

    public boolean isLongpressEnabled() {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            boolean r0 = r0.isLongpressEnabled()
            return r0
    }

    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            boolean r2 = r0.onTouchEvent(r2)
            return r2
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public void setIsLongpressEnabled(boolean r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            r0.setIsLongpressEnabled(r2)
            return
    }

    public void setOnDoubleTapListener(@androidx.annotation.Nullable android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            r0.setOnDoubleTapListener(r2)
            return
    }
}
