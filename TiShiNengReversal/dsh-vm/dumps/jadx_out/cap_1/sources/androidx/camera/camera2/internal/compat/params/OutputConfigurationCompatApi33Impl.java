package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(33)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class OutputConfigurationCompatApi33Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl {
    OutputConfigurationCompatApi33Impl(int r2, @androidx.annotation.NonNull android.view.Surface r3) {
            r1 = this;
            android.hardware.camera2.params.OutputConfiguration r0 = new android.hardware.camera2.params.OutputConfiguration
            r0.<init>(r2, r3)
            r1.<init>(r0)
            return
    }

    OutputConfigurationCompatApi33Impl(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            android.hardware.camera2.params.OutputConfiguration r0 = new android.hardware.camera2.params.OutputConfiguration
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    OutputConfigurationCompatApi33Impl(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.RequiresApi(33)
    static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl wrap(@androidx.annotation.NonNull android.hardware.camera2.params.OutputConfiguration r1) {
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public /* bridge */ /* synthetic */ void addSurface(@androidx.annotation.NonNull android.view.Surface r1) {
            r0 = this;
            super.addSurface(r1)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public /* bridge */ /* synthetic */ void enableSurfaceSharing() {
            r0 = this;
            super.enableSurfaceSharing()
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
            r2 = this;
            java.lang.Object r0 = r2.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            long r0 = r0.getDynamicRangeProfile()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public /* bridge */ /* synthetic */ int getMaxSharedSurfaceCount() {
            r1 = this;
            int r0 = super.getMaxSharedSurfaceCount()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public java.lang.Object getOutputConfiguration() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            boolean r0 = r0 instanceof android.hardware.camera2.params.OutputConfiguration
            androidx.core.util.Preconditions.checkArgument(r0)
            java.lang.Object r0 = r1.mObject
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.String getPhysicalCameraId() {
            r1 = this;
            java.lang.String r0 = super.getPhysicalCameraId()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getStreamUseCase() {
            r2 = this;
            java.lang.Object r0 = r2.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            long r0 = r0.getStreamUseCase()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ android.view.Surface getSurface() {
            r1 = this;
            android.view.Surface r0 = super.getSurface()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public /* bridge */ /* synthetic */ int getSurfaceGroupId() {
            r1 = this;
            int r0 = super.getSurfaceGroupId()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.util.List getSurfaces() {
            r1 = this;
            java.util.List r0 = super.getSurfaces()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public /* bridge */ /* synthetic */ void removeSurface(@androidx.annotation.NonNull android.view.Surface r1) {
            r0 = this;
            super.removeSurface(r1)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            r0.setDynamicRangeProfile(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public /* bridge */ /* synthetic */ void setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            super.setPhysicalCameraId(r1)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setStreamUseCase(long r4) {
            r3 = this;
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            java.lang.Object r0 = r3.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            r0.setStreamUseCase(r4)
            return
    }
}
