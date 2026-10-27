package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isQuickScaleEnabled(@androidx.annotation.NonNull android.view.ScaleGestureDetector r0) {
            boolean r0 = r0.isQuickScaleEnabled()
            return r0
    }

    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(java.lang.Object r0) {
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            boolean r0 = isQuickScaleEnabled(r0)
            return r0
    }

    public static void setQuickScaleEnabled(@androidx.annotation.NonNull android.view.ScaleGestureDetector r0, boolean r1) {
            r0.setQuickScaleEnabled(r1)
            return
    }

    @java.lang.Deprecated
    public static void setQuickScaleEnabled(java.lang.Object r0, boolean r1) {
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            setQuickScaleEnabled(r0, r1)
            return
    }
}
