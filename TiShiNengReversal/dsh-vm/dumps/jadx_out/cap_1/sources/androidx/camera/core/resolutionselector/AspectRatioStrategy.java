package androidx.camera.core.resolutionselector;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AspectRatioStrategy {
    public static final int FALLBACK_RULE_AUTO = 1;
    public static final int FALLBACK_RULE_NONE = 0;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.resolutionselector.AspectRatioStrategy RATIO_16_9_FALLBACK_AUTO_STRATEGY = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.resolutionselector.AspectRatioStrategy RATIO_4_3_FALLBACK_AUTO_STRATEGY = null;
    private final int mFallbackRule;
    private final int mPreferredAspectRatio;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AspectRatioFallbackRule {
    }

    static {
            androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = new androidx.camera.core.resolutionselector.AspectRatioStrategy
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY = r0
            androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = new androidx.camera.core.resolutionselector.AspectRatioStrategy
            r0.<init>(r2, r2)
            androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_16_9_FALLBACK_AUTO_STRATEGY = r0
            return
    }

    public AspectRatioStrategy(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mPreferredAspectRatio = r1
            r0.mFallbackRule = r2
            return
    }

    public int getFallbackRule() {
            r1 = this;
            int r0 = r1.mFallbackRule
            return r0
    }

    public int getPreferredAspectRatio() {
            r1 = this;
            int r0 = r1.mPreferredAspectRatio
            return r0
    }
}
