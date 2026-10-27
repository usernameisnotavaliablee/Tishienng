package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_SessionConfig_OutputConfig extends androidx.camera.core.impl.SessionConfig.OutputConfig {
    private final androidx.camera.core.DynamicRange dynamicRange;
    private final java.lang.String physicalCameraId;
    private final java.util.List<androidx.camera.core.impl.DeferrableSurface> sharedSurfaces;
    private final androidx.camera.core.impl.DeferrableSurface surface;
    private final int surfaceGroupId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.core.impl.SessionConfig.OutputConfig.Builder {
        private androidx.camera.core.DynamicRange dynamicRange;
        private java.lang.String physicalCameraId;
        private java.util.List<androidx.camera.core.impl.DeferrableSurface> sharedSurfaces;
        private androidx.camera.core.impl.DeferrableSurface surface;
        private java.lang.Integer surfaceGroupId;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig build() {
                r9 = this;
                androidx.camera.core.impl.DeferrableSurface r0 = r9.surface
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " surface"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.util.List<androidx.camera.core.impl.DeferrableSurface> r0 = r9.sharedSurfaces
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " sharedSurfaces"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Integer r0 = r9.surfaceGroupId
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " surfaceGroupId"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                androidx.camera.core.DynamicRange r0 = r9.dynamicRange
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " dynamicRange"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L71
                androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig r2 = new androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig
                androidx.camera.core.impl.DeferrableSurface r3 = r9.surface
                java.util.List<androidx.camera.core.impl.DeferrableSurface> r4 = r9.sharedSurfaces
                java.lang.String r5 = r9.physicalCameraId
                java.lang.Integer r0 = r9.surfaceGroupId
                int r6 = r0.intValue()
                androidx.camera.core.DynamicRange r7 = r9.dynamicRange
                r8 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r2
            L71:
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

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setDynamicRange(androidx.camera.core.DynamicRange r2) {
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

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.physicalCameraId = r1
                return r0
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSharedSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.sharedSurfaces = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null sharedSurfaces"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurface(androidx.camera.core.impl.DeferrableSurface r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.surface = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null surface"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurfaceGroupId(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.surfaceGroupId = r1
                return r0
        }
    }

    private AutoValue_SessionConfig_OutputConfig(androidx.camera.core.impl.DeferrableSurface r1, java.util.List<androidx.camera.core.impl.DeferrableSurface> r2, @androidx.annotation.Nullable java.lang.String r3, int r4, androidx.camera.core.DynamicRange r5) {
            r0 = this;
            r0.<init>()
            r0.surface = r1
            r0.sharedSurfaces = r2
            r0.physicalCameraId = r3
            r0.surfaceGroupId = r4
            r0.dynamicRange = r5
            return
    }

    /* synthetic */ AutoValue_SessionConfig_OutputConfig(androidx.camera.core.impl.DeferrableSurface r1, java.util.List r2, java.lang.String r3, int r4, androidx.camera.core.DynamicRange r5, androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.SessionConfig.OutputConfig
            r2 = 0
            if (r1 == 0) goto L4d
            androidx.camera.core.impl.SessionConfig$OutputConfig r5 = (androidx.camera.core.impl.SessionConfig.OutputConfig) r5
            androidx.camera.core.impl.DeferrableSurface r1 = r4.surface
            androidx.camera.core.impl.DeferrableSurface r3 = r5.getSurface()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4d
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = r4.sharedSurfaces
            java.util.List r3 = r5.getSharedSurfaces()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4d
            java.lang.String r1 = r4.physicalCameraId
            if (r1 != 0) goto L2e
            java.lang.String r1 = r5.getPhysicalCameraId()
            if (r1 != 0) goto L4d
            goto L38
        L2e:
            java.lang.String r3 = r5.getPhysicalCameraId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4d
        L38:
            int r1 = r4.surfaceGroupId
            int r3 = r5.getSurfaceGroupId()
            if (r1 != r3) goto L4d
            androidx.camera.core.DynamicRange r1 = r4.dynamicRange
            androidx.camera.core.DynamicRange r5 = r5.getDynamicRange()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L4d
            return r0
        L4d:
            return r2
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @androidx.annotation.NonNull
    public androidx.camera.core.DynamicRange getDynamicRange() {
            r1 = this;
            androidx.camera.core.DynamicRange r0 = r1.dynamicRange
            return r0
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @androidx.annotation.Nullable
    public java.lang.String getPhysicalCameraId() {
            r1 = this;
            java.lang.String r0 = r1.physicalCameraId
            return r0
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSharedSurfaces() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r0 = r1.sharedSurfaces
            return r0
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.DeferrableSurface getSurface() {
            r1 = this;
            androidx.camera.core.impl.DeferrableSurface r0 = r1.surface
            return r0
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getSurfaceGroupId() {
            r1 = this;
            int r0 = r1.surfaceGroupId
            return r0
    }

    public int hashCode() {
            r3 = this;
            androidx.camera.core.impl.DeferrableSurface r0 = r3.surface
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r2 = r3.sharedSurfaces
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.physicalCameraId
            if (r2 != 0) goto L1b
            r2 = 0
            goto L1f
        L1b:
            int r2 = r2.hashCode()
        L1f:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.surfaceGroupId
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.DynamicRange r1 = r3.dynamicRange
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OutputConfig{surface="
            r0.append(r1)
            androidx.camera.core.impl.DeferrableSurface r1 = r2.surface
            r0.append(r1)
            java.lang.String r1 = ", sharedSurfaces="
            r0.append(r1)
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = r2.sharedSurfaces
            r0.append(r1)
            java.lang.String r1 = ", physicalCameraId="
            r0.append(r1)
            java.lang.String r1 = r2.physicalCameraId
            r0.append(r1)
            java.lang.String r1 = ", surfaceGroupId="
            r0.append(r1)
            int r1 = r2.surfaceGroupId
            r0.append(r1)
            java.lang.String r1 = ", dynamicRange="
            r0.append(r1)
            androidx.camera.core.DynamicRange r1 = r2.dynamicRange
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
