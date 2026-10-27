package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_QualityRatioToResolutionsTable_QualityRatio extends androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio {
    private final int aspectRatio;
    private final androidx.camera.video.Quality quality;

    AutoValue_QualityRatioToResolutionsTable_QualityRatio(androidx.camera.video.Quality r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.quality = r1
            r0.aspectRatio = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null quality"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
            r2 = 0
            if (r1 == 0) goto L20
            androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio r5 = (androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio) r5
            androidx.camera.video.Quality r1 = r4.quality
            androidx.camera.video.Quality r3 = r5.getQuality()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            int r1 = r4.aspectRatio
            int r5 = r5.getAspectRatio()
            if (r1 != r5) goto L20
            return r0
        L20:
            return r2
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    int getAspectRatio() {
            r1 = this;
            int r0 = r1.aspectRatio
            return r0
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    @androidx.annotation.NonNull
    androidx.camera.video.Quality getQuality() {
            r1 = this;
            androidx.camera.video.Quality r0 = r1.quality
            return r0
    }

    public int hashCode() {
            r2 = this;
            androidx.camera.video.Quality r0 = r2.quality
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r1 = r2.aspectRatio
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "QualityRatio{quality="
            r0.append(r1)
            androidx.camera.video.Quality r1 = r2.quality
            r0.append(r1)
            java.lang.String r1 = ", aspectRatio="
            r0.append(r1)
            int r1 = r2.aspectRatio
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
