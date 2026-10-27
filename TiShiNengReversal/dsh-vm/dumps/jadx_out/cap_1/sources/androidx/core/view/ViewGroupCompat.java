package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getNestedScrollAxes(android.view.ViewGroup r0) {
                int r0 = r0.getNestedScrollAxes()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isTransitionGroup(android.view.ViewGroup r0) {
                boolean r0 = r0.isTransitionGroup()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setTransitionGroup(android.view.ViewGroup r0, boolean r1) {
                r0.setTransitionGroup(r1)
                return
        }
    }

    private ViewGroupCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getLayoutMode(@androidx.annotation.NonNull android.view.ViewGroup r0) {
            int r0 = r0.getLayoutMode()
            return r0
    }

    public static int getNestedScrollAxes(@androidx.annotation.NonNull android.view.ViewGroup r0) {
            int r0 = androidx.core.view.ViewGroupCompat.Api21Impl.getNestedScrollAxes(r0)
            return r0
    }

    public static boolean isTransitionGroup(@androidx.annotation.NonNull android.view.ViewGroup r0) {
            boolean r0 = androidx.core.view.ViewGroupCompat.Api21Impl.isTransitionGroup(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r0, android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            boolean r0 = r0.onRequestSendAccessibilityEvent(r1, r2)
            return r0
    }

    public static void setLayoutMode(@androidx.annotation.NonNull android.view.ViewGroup r0, int r1) {
            r0.setLayoutMode(r1)
            return
    }

    @java.lang.Deprecated
    public static void setMotionEventSplittingEnabled(android.view.ViewGroup r0, boolean r1) {
            r0.setMotionEventSplittingEnabled(r1)
            return
    }

    public static void setTransitionGroup(@androidx.annotation.NonNull android.view.ViewGroup r0, boolean r1) {
            androidx.core.view.ViewGroupCompat.Api21Impl.setTransitionGroup(r0, r1)
            return
    }
}
