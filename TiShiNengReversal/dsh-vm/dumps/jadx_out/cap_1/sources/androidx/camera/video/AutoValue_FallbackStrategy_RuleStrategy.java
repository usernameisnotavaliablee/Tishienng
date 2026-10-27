package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_FallbackStrategy_RuleStrategy extends androidx.camera.video.FallbackStrategy.RuleStrategy {
    private final androidx.camera.video.Quality fallbackQuality;
    private final int fallbackRule;

    AutoValue_FallbackStrategy_RuleStrategy(androidx.camera.video.Quality r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.fallbackQuality = r1
            r0.fallbackRule = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null fallbackQuality"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.FallbackStrategy.RuleStrategy
            r2 = 0
            if (r1 == 0) goto L20
            androidx.camera.video.FallbackStrategy$RuleStrategy r5 = (androidx.camera.video.FallbackStrategy.RuleStrategy) r5
            androidx.camera.video.Quality r1 = r4.fallbackQuality
            androidx.camera.video.Quality r3 = r5.getFallbackQuality()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            int r1 = r4.fallbackRule
            int r5 = r5.getFallbackRule()
            if (r1 != r5) goto L20
            return r0
        L20:
            return r2
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    @androidx.annotation.NonNull
    androidx.camera.video.Quality getFallbackQuality() {
            r1 = this;
            androidx.camera.video.Quality r0 = r1.fallbackQuality
            return r0
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    int getFallbackRule() {
            r1 = this;
            int r0 = r1.fallbackRule
            return r0
    }

    public int hashCode() {
            r2 = this;
            androidx.camera.video.Quality r0 = r2.fallbackQuality
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r1 = r2.fallbackRule
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RuleStrategy{fallbackQuality="
            r0.append(r1)
            androidx.camera.video.Quality r1 = r2.fallbackQuality
            r0.append(r1)
            java.lang.String r1 = ", fallbackRule="
            r0.append(r1)
            int r1 = r2.fallbackRule
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
