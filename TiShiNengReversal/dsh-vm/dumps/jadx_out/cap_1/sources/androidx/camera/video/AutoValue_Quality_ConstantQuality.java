package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_Quality_ConstantQuality extends androidx.camera.video.Quality.ConstantQuality {
    private final java.lang.String name;
    private final int value;

    AutoValue_Quality_ConstantQuality(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            if (r2 == 0) goto La
            r0.name = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null name"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.Quality.ConstantQuality
            r2 = 0
            if (r1 == 0) goto L20
            androidx.camera.video.Quality$ConstantQuality r5 = (androidx.camera.video.Quality.ConstantQuality) r5
            int r1 = r4.value
            int r3 = r5.getValue()
            if (r1 != r3) goto L20
            java.lang.String r1 = r4.name
            java.lang.String r5 = r5.getName()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    @androidx.annotation.NonNull
    java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.value
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.name
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ConstantQuality{value="
            r0.append(r1)
            int r1 = r2.value
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
