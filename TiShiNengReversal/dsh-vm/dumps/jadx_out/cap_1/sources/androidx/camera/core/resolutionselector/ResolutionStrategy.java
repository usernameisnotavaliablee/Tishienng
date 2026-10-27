package androidx.camera.core.resolutionselector;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ResolutionStrategy {
    public static final int FALLBACK_RULE_CLOSEST_HIGHER = 2;
    public static final int FALLBACK_RULE_CLOSEST_HIGHER_THEN_LOWER = 1;
    public static final int FALLBACK_RULE_CLOSEST_LOWER = 4;
    public static final int FALLBACK_RULE_CLOSEST_LOWER_THEN_HIGHER = 3;
    public static final int FALLBACK_RULE_NONE = 0;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.resolutionselector.ResolutionStrategy HIGHEST_AVAILABLE_STRATEGY = null;

    @androidx.annotation.Nullable
    private android.util.Size mBoundSize;
    private int mFallbackRule;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ResolutionFallbackRule {
    }

    static {
            androidx.camera.core.resolutionselector.ResolutionStrategy r0 = new androidx.camera.core.resolutionselector.ResolutionStrategy
            r0.<init>()
            androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY = r0
            return
    }

    private ResolutionStrategy() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mBoundSize = r0
            r0 = 0
            r1.mFallbackRule = r0
            return
    }

    public ResolutionStrategy(@androidx.annotation.NonNull android.util.Size r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mBoundSize = r1
            r0.mFallbackRule = r2
            return
    }

    @androidx.annotation.Nullable
    public android.util.Size getBoundSize() {
            r1 = this;
            android.util.Size r0 = r1.mBoundSize
            return r0
    }

    public int getFallbackRule() {
            r1 = this;
            int r0 = r1.mFallbackRule
            return r0
    }
}
