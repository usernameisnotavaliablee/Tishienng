package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FallbackStrategy {
    static final int FALLBACK_RULE_HIGHER = 2;
    static final int FALLBACK_RULE_HIGHER_OR_LOWER = 1;
    static final int FALLBACK_RULE_LOWER = 4;
    static final int FALLBACK_RULE_LOWER_OR_HIGHER = 3;
    static final int FALLBACK_RULE_NONE = 0;
    static final androidx.camera.video.FallbackStrategy NONE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.FallbackStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class RuleStrategy extends androidx.camera.video.FallbackStrategy {
        RuleStrategy() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @androidx.annotation.NonNull
        abstract androidx.camera.video.Quality getFallbackQuality();

        abstract int getFallbackRule();
    }

    static {
            androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy r0 = new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.NONE
            r2 = 0
            r0.<init>(r1, r2)
            androidx.camera.video.FallbackStrategy.NONE = r0
            return
    }

    private FallbackStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ FallbackStrategy(androidx.camera.video.FallbackStrategy.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.FallbackStrategy higherQualityOrLowerThan(@androidx.annotation.NonNull androidx.camera.video.Quality r2) {
            androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy r0 = new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.FallbackStrategy higherQualityThan(@androidx.annotation.NonNull androidx.camera.video.Quality r2) {
            androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy r0 = new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy
            r1 = 2
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.FallbackStrategy lowerQualityOrHigherThan(@androidx.annotation.NonNull androidx.camera.video.Quality r2) {
            androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy r0 = new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy
            r1 = 3
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.FallbackStrategy lowerQualityThan(@androidx.annotation.NonNull androidx.camera.video.Quality r2) {
            androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy r0 = new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy
            r1 = 4
            r0.<init>(r2, r1)
            return r0
    }
}
