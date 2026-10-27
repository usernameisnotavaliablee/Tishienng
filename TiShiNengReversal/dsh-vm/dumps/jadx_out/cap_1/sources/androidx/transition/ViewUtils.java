package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewUtils {
    static final android.util.Property<android.view.View, android.graphics.Rect> CLIP_BOUNDS = null;
    private static final androidx.transition.ViewUtilsBase IMPL = null;
    private static final java.lang.String TAG = "ViewUtils";
    static final android.util.Property<android.view.View, java.lang.Float> TRANSITION_ALPHA = null;



    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            androidx.transition.ViewUtilsApi29 r0 = new androidx.transition.ViewUtilsApi29
            r0.<init>()
            androidx.transition.ViewUtils.IMPL = r0
            goto L2d
        Le:
            r1 = 23
            if (r0 < r1) goto L1a
            androidx.transition.ViewUtilsApi23 r0 = new androidx.transition.ViewUtilsApi23
            r0.<init>()
            androidx.transition.ViewUtils.IMPL = r0
            goto L2d
        L1a:
            r1 = 22
            if (r0 < r1) goto L26
            androidx.transition.ViewUtilsApi22 r0 = new androidx.transition.ViewUtilsApi22
            r0.<init>()
            androidx.transition.ViewUtils.IMPL = r0
            goto L2d
        L26:
            androidx.transition.ViewUtilsApi21 r0 = new androidx.transition.ViewUtilsApi21
            r0.<init>()
            androidx.transition.ViewUtils.IMPL = r0
        L2d:
            androidx.transition.ViewUtils$1 r0 = new androidx.transition.ViewUtils$1
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "translationAlpha"
            r0.<init>(r1, r2)
            androidx.transition.ViewUtils.TRANSITION_ALPHA = r0
            androidx.transition.ViewUtils$2 r0 = new androidx.transition.ViewUtils$2
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r2 = "clipBounds"
            r0.<init>(r1, r2)
            androidx.transition.ViewUtils.CLIP_BOUNDS = r0
            return
    }

    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void clearNonTransitionAlpha(@androidx.annotation.NonNull android.view.View r1) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r0.clearNonTransitionAlpha(r1)
            return
    }

    static androidx.transition.ViewOverlayImpl getOverlay(@androidx.annotation.NonNull android.view.View r1) {
            androidx.transition.ViewOverlayApi18 r0 = new androidx.transition.ViewOverlayApi18
            r0.<init>(r1)
            return r0
    }

    static float getTransitionAlpha(@androidx.annotation.NonNull android.view.View r1) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            float r1 = r0.getTransitionAlpha(r1)
            return r1
    }

    static androidx.transition.WindowIdImpl getWindowId(@androidx.annotation.NonNull android.view.View r1) {
            androidx.transition.WindowIdApi18 r0 = new androidx.transition.WindowIdApi18
            r0.<init>(r1)
            return r0
    }

    static void saveNonTransitionAlpha(@androidx.annotation.NonNull android.view.View r1) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r0.saveNonTransitionAlpha(r1)
            return
    }

    static void setAnimationMatrix(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.graphics.Matrix r2) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r0.setAnimationMatrix(r1, r2)
            return
    }

    static void setLeftTopRightBottom(@androidx.annotation.NonNull android.view.View r6, int r7, int r8, int r9, int r10) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.setLeftTopRightBottom(r1, r2, r3, r4, r5)
            return
    }

    static void setTransitionAlpha(@androidx.annotation.NonNull android.view.View r1, float r2) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r0.setTransitionAlpha(r1, r2)
            return
    }

    static void setTransitionVisibility(@androidx.annotation.NonNull android.view.View r1, int r2) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r0.setTransitionVisibility(r1, r2)
            return
    }

    static void transformMatrixToGlobal(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r0.transformMatrixToGlobal(r1, r2)
            return
    }

    static void transformMatrixToLocal(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            androidx.transition.ViewUtilsBase r0 = androidx.transition.ViewUtils.IMPL
            r0.transformMatrixToLocal(r1, r2)
            return
    }
}
