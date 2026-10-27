package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_Camera2CameraImpl_UseCaseInfo extends androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo {
    private final androidx.camera.core.impl.SessionConfig sessionConfig;
    private final android.util.Size surfaceResolution;
    private final androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig;
    private final java.lang.String useCaseId;
    private final java.lang.Class<?> useCaseType;

    AutoValue_Camera2CameraImpl_UseCaseInfo(java.lang.String r1, java.lang.Class<?> r2, androidx.camera.core.impl.SessionConfig r3, androidx.camera.core.impl.UseCaseConfig<?> r4, @androidx.annotation.Nullable android.util.Size r5) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L2e
            r0.useCaseId = r1
            if (r2 == 0) goto L26
            r0.useCaseType = r2
            if (r3 == 0) goto L1e
            r0.sessionConfig = r3
            if (r4 == 0) goto L16
            r0.useCaseConfig = r4
            r0.surfaceResolution = r5
            return
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null useCaseConfig"
            r1.<init>(r2)
            throw r1
        L1e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null sessionConfig"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null useCaseType"
            r1.<init>(r2)
            throw r1
        L2e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null useCaseId"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
            r2 = 0
            if (r1 == 0) goto L51
            androidx.camera.camera2.internal.Camera2CameraImpl$UseCaseInfo r5 = (androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo) r5
            java.lang.String r1 = r4.useCaseId
            java.lang.String r3 = r5.getUseCaseId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L51
            java.lang.Class<?> r1 = r4.useCaseType
            java.lang.Class r3 = r5.getUseCaseType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L51
            androidx.camera.core.impl.SessionConfig r1 = r4.sessionConfig
            androidx.camera.core.impl.SessionConfig r3 = r5.getSessionConfig()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L51
            androidx.camera.core.impl.UseCaseConfig<?> r1 = r4.useCaseConfig
            androidx.camera.core.impl.UseCaseConfig r3 = r5.getUseCaseConfig()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L51
            android.util.Size r1 = r4.surfaceResolution
            if (r1 != 0) goto L46
            android.util.Size r5 = r5.getSurfaceResolution()
            if (r5 != 0) goto L51
            goto L50
        L46:
            android.util.Size r5 = r5.getSurfaceResolution()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L51
        L50:
            return r0
        L51:
            return r2
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig getSessionConfig() {
            r1 = this;
            androidx.camera.core.impl.SessionConfig r0 = r1.sessionConfig
            return r0
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @androidx.annotation.Nullable
    android.util.Size getSurfaceResolution() {
            r1 = this;
            android.util.Size r0 = r1.surfaceResolution
            return r0
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @androidx.annotation.NonNull
    androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig() {
            r1 = this;
            androidx.camera.core.impl.UseCaseConfig<?> r0 = r1.useCaseConfig
            return r0
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @androidx.annotation.NonNull
    java.lang.String getUseCaseId() {
            r1 = this;
            java.lang.String r0 = r1.useCaseId
            return r0
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @androidx.annotation.NonNull
    java.lang.Class<?> getUseCaseType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.useCaseType
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.useCaseId
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Class<?> r2 = r3.useCaseType
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.SessionConfig r2 = r3.sessionConfig
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.UseCaseConfig<?> r2 = r3.useCaseConfig
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r1 = r3.surfaceResolution
            if (r1 != 0) goto L2d
            r1 = 0
            goto L31
        L2d:
            int r1 = r1.hashCode()
        L31:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UseCaseInfo{useCaseId="
            r0.append(r1)
            java.lang.String r1 = r2.useCaseId
            r0.append(r1)
            java.lang.String r1 = ", useCaseType="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.useCaseType
            r0.append(r1)
            java.lang.String r1 = ", sessionConfig="
            r0.append(r1)
            androidx.camera.core.impl.SessionConfig r1 = r2.sessionConfig
            r0.append(r1)
            java.lang.String r1 = ", useCaseConfig="
            r0.append(r1)
            androidx.camera.core.impl.UseCaseConfig<?> r1 = r2.useCaseConfig
            r0.append(r1)
            java.lang.String r1 = ", surfaceResolution="
            r0.append(r1)
            android.util.Size r1 = r2.surfaceResolution
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
