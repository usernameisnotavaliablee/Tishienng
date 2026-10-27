package androidx.camera.core.resolutionselector;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ResolutionSelector {
    public static final int PREFER_CAPTURE_RATE_OVER_HIGHER_RESOLUTION = 0;
    public static final int PREFER_HIGHER_RESOLUTION_OVER_CAPTURE_RATE = 1;
    private final int mAllowedResolutionMode;

    @androidx.annotation.NonNull
    private final androidx.camera.core.resolutionselector.AspectRatioStrategy mAspectRatioStrategy;

    @androidx.annotation.Nullable
    private final androidx.camera.core.resolutionselector.ResolutionFilter mResolutionFilter;

    @androidx.annotation.Nullable
    private final androidx.camera.core.resolutionselector.ResolutionStrategy mResolutionStrategy;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AllowedResolutionMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private int mAllowedResolutionMode;

        @androidx.annotation.Nullable
        private androidx.camera.core.resolutionselector.AspectRatioStrategy mAspectRatioStrategy;

        @androidx.annotation.Nullable
        private androidx.camera.core.resolutionselector.ResolutionFilter mResolutionFilter;

        @androidx.annotation.Nullable
        private androidx.camera.core.resolutionselector.ResolutionStrategy mResolutionStrategy;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY
                r1.mAspectRatioStrategy = r0
                r0 = 0
                r1.mResolutionStrategy = r0
                r1.mResolutionFilter = r0
                r0 = 0
                r1.mAllowedResolutionMode = r0
                return
        }

        private Builder(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r2) {
                r1 = this;
                r1.<init>()
                androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY
                r1.mAspectRatioStrategy = r0
                r0 = 0
                r1.mResolutionStrategy = r0
                r1.mResolutionFilter = r0
                r0 = 0
                r1.mAllowedResolutionMode = r0
                androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = r2.getAspectRatioStrategy()
                r1.mAspectRatioStrategy = r0
                androidx.camera.core.resolutionselector.ResolutionStrategy r0 = r2.getResolutionStrategy()
                r1.mResolutionStrategy = r0
                androidx.camera.core.resolutionselector.ResolutionFilter r0 = r2.getResolutionFilter()
                r1.mResolutionFilter = r0
                int r2 = r2.getAllowedResolutionMode()
                r1.mAllowedResolutionMode = r2
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static androidx.camera.core.resolutionselector.ResolutionSelector.Builder fromResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionSelector r1) {
                androidx.camera.core.resolutionselector.ResolutionSelector$Builder r0 = new androidx.camera.core.resolutionselector.ResolutionSelector$Builder
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.resolutionselector.ResolutionSelector build() {
                r5 = this;
                androidx.camera.core.resolutionselector.ResolutionSelector r0 = new androidx.camera.core.resolutionselector.ResolutionSelector
                androidx.camera.core.resolutionselector.AspectRatioStrategy r1 = r5.mAspectRatioStrategy
                androidx.camera.core.resolutionselector.ResolutionStrategy r2 = r5.mResolutionStrategy
                androidx.camera.core.resolutionselector.ResolutionFilter r3 = r5.mResolutionFilter
                int r4 = r5.mAllowedResolutionMode
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setAllowedResolutionMode(int r1) {
                r0 = this;
                r0.mAllowedResolutionMode = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setAspectRatioStrategy(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.AspectRatioStrategy r1) {
                r0 = this;
                r0.mAspectRatioStrategy = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setResolutionFilter(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionFilter r1) {
                r0 = this;
                r0.mResolutionFilter = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setResolutionStrategy(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.ResolutionStrategy r1) {
                r0 = this;
                r0.mResolutionStrategy = r1
                return r0
        }
    }

    ResolutionSelector(@androidx.annotation.NonNull androidx.camera.core.resolutionselector.AspectRatioStrategy r1, @androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionStrategy r2, @androidx.annotation.Nullable androidx.camera.core.resolutionselector.ResolutionFilter r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.mAspectRatioStrategy = r1
            r0.mResolutionStrategy = r2
            r0.mResolutionFilter = r3
            r0.mAllowedResolutionMode = r4
            return
    }

    public int getAllowedResolutionMode() {
            r1 = this;
            int r0 = r1.mAllowedResolutionMode
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.resolutionselector.AspectRatioStrategy getAspectRatioStrategy() {
            r1 = this;
            androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = r1.mAspectRatioStrategy
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.resolutionselector.ResolutionFilter getResolutionFilter() {
            r1 = this;
            androidx.camera.core.resolutionselector.ResolutionFilter r0 = r1.mResolutionFilter
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.resolutionselector.ResolutionStrategy getResolutionStrategy() {
            r1 = this;
            androidx.camera.core.resolutionselector.ResolutionStrategy r0 = r1.mResolutionStrategy
            return r0
    }
}
