package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_AttachedSurfaceInfo extends androidx.camera.core.impl.AttachedSurfaceInfo {
    private final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> captureTypes;
    private final androidx.camera.core.DynamicRange dynamicRange;
    private final int imageFormat;
    private final androidx.camera.core.impl.Config implementationOptions;
    private final android.util.Size size;
    private final androidx.camera.core.impl.SurfaceConfig surfaceConfig;
    private final android.util.Range<java.lang.Integer> targetFrameRate;

    AutoValue_AttachedSurfaceInfo(androidx.camera.core.impl.SurfaceConfig r1, int r2, android.util.Size r3, androidx.camera.core.DynamicRange r4, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> r5, @androidx.annotation.Nullable androidx.camera.core.impl.Config r6, @androidx.annotation.Nullable android.util.Range<java.lang.Integer> r7) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L32
            r0.surfaceConfig = r1
            r0.imageFormat = r2
            if (r3 == 0) goto L2a
            r0.size = r3
            if (r4 == 0) goto L22
            r0.dynamicRange = r4
            if (r5 == 0) goto L1a
            r0.captureTypes = r5
            r0.implementationOptions = r6
            r0.targetFrameRate = r7
            return
        L1a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null captureTypes"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null dynamicRange"
            r1.<init>(r2)
            throw r1
        L2a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null size"
            r1.<init>(r2)
            throw r1
        L32:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null surfaceConfig"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.AttachedSurfaceInfo
            r2 = 0
            if (r1 == 0) goto L6e
            androidx.camera.core.impl.AttachedSurfaceInfo r5 = (androidx.camera.core.impl.AttachedSurfaceInfo) r5
            androidx.camera.core.impl.SurfaceConfig r1 = r4.surfaceConfig
            androidx.camera.core.impl.SurfaceConfig r3 = r5.getSurfaceConfig()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6e
            int r1 = r4.imageFormat
            int r3 = r5.getImageFormat()
            if (r1 != r3) goto L6e
            android.util.Size r1 = r4.size
            android.util.Size r3 = r5.getSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6e
            androidx.camera.core.DynamicRange r1 = r4.dynamicRange
            androidx.camera.core.DynamicRange r3 = r5.getDynamicRange()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6e
            java.util.List<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = r4.captureTypes
            java.util.List r3 = r5.getCaptureTypes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6e
            androidx.camera.core.impl.Config r1 = r4.implementationOptions
            if (r1 != 0) goto L4e
            androidx.camera.core.impl.Config r1 = r5.getImplementationOptions()
            if (r1 != 0) goto L6e
            goto L58
        L4e:
            androidx.camera.core.impl.Config r3 = r5.getImplementationOptions()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6e
        L58:
            android.util.Range<java.lang.Integer> r1 = r4.targetFrameRate
            if (r1 != 0) goto L63
            android.util.Range r5 = r5.getTargetFrameRate()
            if (r5 != 0) goto L6e
            goto L6d
        L63:
            android.util.Range r5 = r5.getTargetFrameRate()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L6e
        L6d:
            return r0
        L6e:
            return r2
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r0 = r1.captureTypes
            return r0
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.DynamicRange getDynamicRange() {
            r1 = this;
            androidx.camera.core.DynamicRange r0 = r1.dynamicRange
            return r0
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getImageFormat() {
            r1 = this;
            int r0 = r1.imageFormat
            return r0
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.Config getImplementationOptions() {
            r1 = this;
            androidx.camera.core.impl.Config r0 = r1.implementationOptions
            return r0
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @androidx.annotation.NonNull
    public android.util.Size getSize() {
            r1 = this;
            android.util.Size r0 = r1.size
            return r0
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SurfaceConfig getSurfaceConfig() {
            r1 = this;
            androidx.camera.core.impl.SurfaceConfig r0 = r1.surfaceConfig
            return r0
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    @androidx.annotation.Nullable
    public android.util.Range<java.lang.Integer> getTargetFrameRate() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.targetFrameRate
            return r0
    }

    public int hashCode() {
            r4 = this;
            androidx.camera.core.impl.SurfaceConfig r0 = r4.surfaceConfig
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r4.imageFormat
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r4.size
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.DynamicRange r2 = r4.dynamicRange
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r2 = r4.captureTypes
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.Config r2 = r4.implementationOptions
            r3 = 0
            if (r2 != 0) goto L33
            r2 = 0
            goto L37
        L33:
            int r2 = r2.hashCode()
        L37:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Range<java.lang.Integer> r1 = r4.targetFrameRate
            if (r1 != 0) goto L3f
            goto L43
        L3f:
            int r3 = r1.hashCode()
        L43:
            r0 = r0 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AttachedSurfaceInfo{surfaceConfig="
            r0.append(r1)
            androidx.camera.core.impl.SurfaceConfig r1 = r2.surfaceConfig
            r0.append(r1)
            java.lang.String r1 = ", imageFormat="
            r0.append(r1)
            int r1 = r2.imageFormat
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            android.util.Size r1 = r2.size
            r0.append(r1)
            java.lang.String r1 = ", dynamicRange="
            r0.append(r1)
            androidx.camera.core.DynamicRange r1 = r2.dynamicRange
            r0.append(r1)
            java.lang.String r1 = ", captureTypes="
            r0.append(r1)
            java.util.List<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r1 = r2.captureTypes
            r0.append(r1)
            java.lang.String r1 = ", implementationOptions="
            r0.append(r1)
            androidx.camera.core.impl.Config r1 = r2.implementationOptions
            r0.append(r1)
            java.lang.String r1 = ", targetFrameRate="
            r0.append(r1)
            android.util.Range<java.lang.Integer> r1 = r2.targetFrameRate
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
