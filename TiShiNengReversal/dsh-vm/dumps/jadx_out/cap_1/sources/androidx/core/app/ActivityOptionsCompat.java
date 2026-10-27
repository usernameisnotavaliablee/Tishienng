package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ActivityOptionsCompat {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ActivityOptionsCompatImpl extends androidx.core.app.ActivityOptionsCompat {
        private final android.app.ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(android.app.ActivityOptions r1) {
                r0 = this;
                r0.<init>()
                r0.mActivityOptions = r1
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.graphics.Rect getLaunchBounds() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 >= r1) goto L8
                r0 = 0
                return r0
            L8:
                android.app.ActivityOptions r0 = r2.mActivityOptions
                android.graphics.Rect r0 = androidx.core.app.ActivityOptionsCompat.Api24Impl.getLaunchBounds(r0)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(@androidx.annotation.NonNull android.app.PendingIntent r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto Lb
                android.app.ActivityOptions r0 = r2.mActivityOptions
                androidx.core.app.ActivityOptionsCompat.Api23Impl.requestUsageTimeReport(r0, r3)
            Lb:
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        @androidx.annotation.NonNull
        public androidx.core.app.ActivityOptionsCompat setLaunchBounds(@androidx.annotation.Nullable android.graphics.Rect r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 >= r1) goto L7
                return r2
            L7:
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
                android.app.ActivityOptions r1 = r2.mActivityOptions
                android.app.ActivityOptions r3 = androidx.core.app.ActivityOptionsCompat.Api24Impl.setLaunchBounds(r1, r3)
                r0.<init>(r3)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setShareIdentityEnabled(boolean r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 >= r1) goto L7
                return r2
            L7:
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
                android.app.ActivityOptions r1 = r2.mActivityOptions
                android.app.ActivityOptions r3 = androidx.core.app.ActivityOptionsCompat.Api34Impl.setShareIdentityEnabled(r1, r3)
                r0.<init>(r3)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.os.Bundle toBundle() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.os.Bundle r0 = r0.toBundle()
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(@androidx.annotation.NonNull androidx.core.app.ActivityOptionsCompat r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl
                if (r0 == 0) goto Ld
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r2 = (androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) r2
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.app.ActivityOptions r2 = r2.mActivityOptions
                r0.update(r2)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity r0, android.view.View r1, java.lang.String r2) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeSceneTransitionAnimation(r0, r1, r2)
                return r0
        }

        @java.lang.SafeVarargs
        @androidx.annotation.DoNotInline
        static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity r0, android.util.Pair<android.view.View, java.lang.String>... r1) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeSceneTransitionAnimation(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.ActivityOptions makeTaskLaunchBehind() {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeTaskLaunchBehind()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.ActivityOptions makeBasic() {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.ActivityOptions makeClipRevealAnimation(android.view.View r0, int r1, int r2, int r3, int r4) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeClipRevealAnimation(r0, r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void requestUsageTimeReport(android.app.ActivityOptions r0, android.app.PendingIntent r1) {
                r0.requestUsageTimeReport(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.Rect getLaunchBounds(android.app.ActivityOptions r0) {
                android.graphics.Rect r0 = r0.getLaunchBounds()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.app.ActivityOptions setLaunchBounds(android.app.ActivityOptions r0, android.graphics.Rect r1) {
                android.app.ActivityOptions r0 = r0.setLaunchBounds(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.ActivityOptions setShareIdentityEnabled(android.app.ActivityOptions r0, boolean r1) {
                android.app.ActivityOptions r0 = r0.setShareIdentityEnabled(r1)
                return r0
        }
    }

    protected ActivityOptionsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeBasic() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L10
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api23Impl.makeBasic()
            r0.<init>(r1)
            return r0
        L10:
            androidx.core.app.ActivityOptionsCompat r0 = new androidx.core.app.ActivityOptionsCompat
            r0.<init>()
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeClipRevealAnimation(@androidx.annotation.NonNull android.view.View r2, int r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L10
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r2 = androidx.core.app.ActivityOptionsCompat.Api23Impl.makeClipRevealAnimation(r2, r3, r4, r5, r6)
            r0.<init>(r2)
            return r0
        L10:
            androidx.core.app.ActivityOptionsCompat r2 = new androidx.core.app.ActivityOptionsCompat
            r2.<init>()
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeCustomAnimation(@androidx.annotation.NonNull android.content.Context r1, int r2, int r3) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeCustomAnimation(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeScaleUpAnimation(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeScaleUpAnimation(r1, r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.lang.String r3) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api21Impl.makeSceneTransitionAnimation(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Nullable androidx.core.util.Pair<android.view.View, java.lang.String>... r5) {
            if (r5 == 0) goto L1c
            int r0 = r5.length
            android.util.Pair[] r0 = new android.util.Pair[r0]
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            F r3 = r2.first
            android.view.View r3 = (android.view.View) r3
            S r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            android.util.Pair r2 = android.util.Pair.create(r3, r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L1c:
            r0 = 0
        L1d:
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r5 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r4 = androidx.core.app.ActivityOptionsCompat.Api21Impl.makeSceneTransitionAnimation(r4, r0)
            r5.<init>(r4)
            return r5
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeTaskLaunchBehind() {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api21Impl.makeTaskLaunchBehind()
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.ActivityOptionsCompat makeThumbnailScaleUpAnimation(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeThumbnailScaleUpAnimation(r1, r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Rect getLaunchBounds() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void requestUsageTimeReport(@androidx.annotation.NonNull android.app.PendingIntent r1) {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    public androidx.core.app.ActivityOptionsCompat setLaunchBounds(@androidx.annotation.Nullable android.graphics.Rect r1) {
            r0 = this;
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.app.ActivityOptionsCompat setShareIdentityEnabled(boolean r1) {
            r0 = this;
            return r0
    }

    @androidx.annotation.Nullable
    public android.os.Bundle toBundle() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void update(@androidx.annotation.NonNull androidx.core.app.ActivityOptionsCompat r1) {
            r0 = this;
            return
    }
}
