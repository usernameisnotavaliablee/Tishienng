package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class VelocityTrackerCompat {
    private static java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> sFallbackTrackers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static float getAxisVelocity(android.view.VelocityTracker r0, int r1) {
                float r0 = r0.getAxisVelocity(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static float getAxisVelocity(android.view.VelocityTracker r0, int r1, int r2) {
                float r0 = r0.getAxisVelocity(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isAxisSupported(android.view.VelocityTracker r0, int r1) {
                boolean r0 = r0.isAxisSupported(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface VelocityTrackableMotionEventAxis {
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            androidx.core.view.VelocityTrackerCompat.sFallbackTrackers = r0
            return
    }

    private VelocityTrackerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addMovement(@androidx.annotation.NonNull android.view.VelocityTracker r2, @androidx.annotation.NonNull android.view.MotionEvent r3) {
            r2.addMovement(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            goto L2f
        La:
            int r0 = r3.getSource()
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r0 != r1) goto L2f
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L24
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            androidx.core.view.VelocityTrackerFallback r1 = new androidx.core.view.VelocityTrackerFallback
            r1.<init>()
            r0.put(r2, r1)
        L24:
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            java.lang.Object r2 = r0.get(r2)
            androidx.core.view.VelocityTrackerFallback r2 = (androidx.core.view.VelocityTrackerFallback) r2
            r2.addMovement(r3)
        L2f:
            return
    }

    public static void clear(@androidx.annotation.NonNull android.view.VelocityTracker r0) {
            r0.clear()
            removeFallbackForTracker(r0)
            return
    }

    public static void computeCurrentVelocity(@androidx.annotation.NonNull android.view.VelocityTracker r1, int r2) {
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            computeCurrentVelocity(r1, r2, r0)
            return
    }

    public static void computeCurrentVelocity(@androidx.annotation.NonNull android.view.VelocityTracker r0, int r1, float r2) {
            r0.computeCurrentVelocity(r1, r2)
            androidx.core.view.VelocityTrackerFallback r0 = getFallbackTrackerOrNull(r0)
            if (r0 == 0) goto Lc
            r0.computeCurrentVelocity(r1, r2)
        Lc:
            return
    }

    public static float getAxisVelocity(@androidx.annotation.NonNull android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(r2, r3)
            return r2
        Lb:
            if (r3 != 0) goto L12
            float r2 = r2.getXVelocity()
            return r2
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r2 = r2.getYVelocity()
            return r2
        L1a:
            androidx.core.view.VelocityTrackerFallback r2 = getFallbackTrackerOrNull(r2)
            if (r2 == 0) goto L25
            float r2 = r2.getAxisVelocity(r3)
            return r2
        L25:
            r2 = 0
            return r2
    }

    public static float getAxisVelocity(@androidx.annotation.NonNull android.view.VelocityTracker r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(r2, r3, r4)
            return r2
        Lb:
            if (r3 != 0) goto L12
            float r2 = r2.getXVelocity(r4)
            return r2
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r2 = r2.getYVelocity(r4)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    private static androidx.core.view.VelocityTrackerFallback getFallbackTrackerOrNull(android.view.VelocityTracker r1) {
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            java.lang.Object r1 = r0.get(r1)
            androidx.core.view.VelocityTrackerFallback r1 = (androidx.core.view.VelocityTrackerFallback) r1
            return r1
    }

    @java.lang.Deprecated
    public static float getXVelocity(android.view.VelocityTracker r0, int r1) {
            float r0 = r0.getXVelocity(r1)
            return r0
    }

    @java.lang.Deprecated
    public static float getYVelocity(android.view.VelocityTracker r0, int r1) {
            float r0 = r0.getYVelocity(r1)
            return r0
    }

    public static boolean isAxisSupported(@androidx.annotation.NonNull android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.VelocityTrackerCompat.Api34Impl.isAxisSupported(r2, r3)
            return r2
        Lb:
            r2 = 26
            r0 = 1
            if (r3 == r2) goto L17
            if (r3 == 0) goto L17
            if (r3 != r0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            return r0
    }

    public static void recycle(@androidx.annotation.NonNull android.view.VelocityTracker r0) {
            r0.recycle()
            removeFallbackForTracker(r0)
            return
    }

    private static void removeFallbackForTracker(android.view.VelocityTracker r1) {
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            r0.remove(r1)
            return
    }
}
