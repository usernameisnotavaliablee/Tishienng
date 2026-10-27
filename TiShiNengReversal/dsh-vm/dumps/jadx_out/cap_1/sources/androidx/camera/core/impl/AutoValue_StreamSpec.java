package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_StreamSpec extends androidx.camera.core.impl.StreamSpec {
    private final androidx.camera.core.DynamicRange dynamicRange;
    private final android.util.Range<java.lang.Integer> expectedFrameRateRange;
    private final androidx.camera.core.impl.Config implementationOptions;
    private final android.util.Size resolution;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.impl.AutoValue_StreamSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.core.impl.StreamSpec.Builder {
        private androidx.camera.core.DynamicRange dynamicRange;
        private android.util.Range<java.lang.Integer> expectedFrameRateRange;
        private androidx.camera.core.impl.Config implementationOptions;
        private android.util.Size resolution;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(androidx.camera.core.impl.StreamSpec r2) {
                r1 = this;
                r1.<init>()
                android.util.Size r0 = r2.getResolution()
                r1.resolution = r0
                androidx.camera.core.DynamicRange r0 = r2.getDynamicRange()
                r1.dynamicRange = r0
                android.util.Range r0 = r2.getExpectedFrameRateRange()
                r1.expectedFrameRateRange = r0
                androidx.camera.core.impl.Config r2 = r2.getImplementationOptions()
                r1.implementationOptions = r2
                return
        }

        /* synthetic */ Builder(androidx.camera.core.impl.StreamSpec r1, androidx.camera.core.impl.AutoValue_StreamSpec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec build() {
                r8 = this;
                android.util.Size r0 = r8.resolution
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " resolution"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                androidx.camera.core.DynamicRange r0 = r8.dynamicRange
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " dynamicRange"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                android.util.Range<java.lang.Integer> r0 = r8.expectedFrameRateRange
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " expectedFrameRateRange"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L56
                androidx.camera.core.impl.AutoValue_StreamSpec r2 = new androidx.camera.core.impl.AutoValue_StreamSpec
                android.util.Size r3 = r8.resolution
                androidx.camera.core.DynamicRange r4 = r8.dynamicRange
                android.util.Range<java.lang.Integer> r5 = r8.expectedFrameRateRange
                androidx.camera.core.impl.Config r6 = r8.implementationOptions
                r7 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
            L56:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setDynamicRange(androidx.camera.core.DynamicRange r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.dynamicRange = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null dynamicRange"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setExpectedFrameRateRange(android.util.Range<java.lang.Integer> r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.expectedFrameRateRange = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null expectedFrameRateRange"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setImplementationOptions(androidx.camera.core.impl.Config r1) {
                r0 = this;
                r0.implementationOptions = r1
                return r0
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setResolution(android.util.Size r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.resolution = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null resolution"
                r2.<init>(r0)
                throw r2
        }
    }

    private AutoValue_StreamSpec(android.util.Size r1, androidx.camera.core.DynamicRange r2, android.util.Range<java.lang.Integer> r3, @androidx.annotation.Nullable androidx.camera.core.impl.Config r4) {
            r0 = this;
            r0.<init>()
            r0.resolution = r1
            r0.dynamicRange = r2
            r0.expectedFrameRateRange = r3
            r0.implementationOptions = r4
            return
    }

    /* synthetic */ AutoValue_StreamSpec(android.util.Size r1, androidx.camera.core.DynamicRange r2, android.util.Range r3, androidx.camera.core.impl.Config r4, androidx.camera.core.impl.AutoValue_StreamSpec.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.StreamSpec
            r2 = 0
            if (r1 == 0) goto L45
            androidx.camera.core.impl.StreamSpec r5 = (androidx.camera.core.impl.StreamSpec) r5
            android.util.Size r1 = r4.resolution
            android.util.Size r3 = r5.getResolution()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L45
            androidx.camera.core.DynamicRange r1 = r4.dynamicRange
            androidx.camera.core.DynamicRange r3 = r5.getDynamicRange()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L45
            android.util.Range<java.lang.Integer> r1 = r4.expectedFrameRateRange
            android.util.Range r3 = r5.getExpectedFrameRateRange()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L45
            androidx.camera.core.impl.Config r1 = r4.implementationOptions
            if (r1 != 0) goto L3a
            androidx.camera.core.impl.Config r5 = r5.getImplementationOptions()
            if (r5 != 0) goto L45
            goto L44
        L3a:
            androidx.camera.core.impl.Config r5 = r5.getImplementationOptions()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L45
        L44:
            return r0
        L45:
            return r2
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @androidx.annotation.NonNull
    public androidx.camera.core.DynamicRange getDynamicRange() {
            r1 = this;
            androidx.camera.core.DynamicRange r0 = r1.dynamicRange
            return r0
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.expectedFrameRateRange
            return r0
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.Config getImplementationOptions() {
            r1 = this;
            androidx.camera.core.impl.Config r0 = r1.implementationOptions
            return r0
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @androidx.annotation.NonNull
    public android.util.Size getResolution() {
            r1 = this;
            android.util.Size r0 = r1.resolution
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.resolution
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.DynamicRange r2 = r3.dynamicRange
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Range<java.lang.Integer> r2 = r3.expectedFrameRateRange
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.Config r1 = r3.implementationOptions
            if (r1 != 0) goto L24
            r1 = 0
            goto L28
        L24:
            int r1 = r1.hashCode()
        L28:
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public androidx.camera.core.impl.StreamSpec.Builder toBuilder() {
            r2 = this;
            androidx.camera.core.impl.AutoValue_StreamSpec$Builder r0 = new androidx.camera.core.impl.AutoValue_StreamSpec$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StreamSpec{resolution="
            r0.append(r1)
            android.util.Size r1 = r2.resolution
            r0.append(r1)
            java.lang.String r1 = ", dynamicRange="
            r0.append(r1)
            androidx.camera.core.DynamicRange r1 = r2.dynamicRange
            r0.append(r1)
            java.lang.String r1 = ", expectedFrameRateRange="
            r0.append(r1)
            android.util.Range<java.lang.Integer> r1 = r2.expectedFrameRateRange
            r0.append(r1)
            java.lang.String r1 = ", implementationOptions="
            r0.append(r1)
            androidx.camera.core.impl.Config r1 = r2.implementationOptions
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
