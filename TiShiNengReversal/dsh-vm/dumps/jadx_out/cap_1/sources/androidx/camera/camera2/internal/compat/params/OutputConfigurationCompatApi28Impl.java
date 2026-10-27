package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(28)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class OutputConfigurationCompatApi28Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OutputConfigurationParamsApi28 {
        long mDynamicRangeProfile;

        @androidx.annotation.NonNull
        final android.hardware.camera2.params.OutputConfiguration mOutputConfiguration;

        OutputConfigurationParamsApi28(@androidx.annotation.NonNull android.hardware.camera2.params.OutputConfiguration r3) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.mDynamicRangeProfile = r0
                r2.mOutputConfiguration = r3
                return
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                boolean r0 = r7 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 r7 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) r7
                android.hardware.camera2.params.OutputConfiguration r0 = r6.mOutputConfiguration
                android.hardware.camera2.params.OutputConfiguration r2 = r7.mOutputConfiguration
                boolean r0 = java.util.Objects.equals(r0, r2)
                if (r0 == 0) goto L1c
                long r2 = r6.mDynamicRangeProfile
                long r4 = r7.mDynamicRangeProfile
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L1c
                r7 = 1
                return r7
            L1c:
                return r1
        }

        public int hashCode() {
                r4 = this;
                android.hardware.camera2.params.OutputConfiguration r0 = r4.mOutputConfiguration
                int r0 = r0.hashCode()
                r1 = 31
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                long r2 = r4.mDynamicRangeProfile
                int r0 = androidx.camera.camera2.internal.compat.params.e.a(r2)
                r0 = r0 ^ r1
                return r0
        }
    }

    OutputConfigurationCompatApi28Impl(int r3, @androidx.annotation.NonNull android.view.Surface r4) {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28
            android.hardware.camera2.params.OutputConfiguration r1 = new android.hardware.camera2.params.OutputConfiguration
            r1.<init>(r3, r4)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    OutputConfigurationCompatApi28Impl(@androidx.annotation.NonNull android.view.Surface r3) {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28
            android.hardware.camera2.params.OutputConfiguration r1 = new android.hardware.camera2.params.OutputConfiguration
            r1.<init>(r3)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    OutputConfigurationCompatApi28Impl(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.RequiresApi(28)
    static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl wrap(@androidx.annotation.NonNull android.hardware.camera2.params.OutputConfiguration r2) {
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 r1 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
            r2 = this;
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) r0
            long r0 = r0.mDynamicRangeProfile
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            int r0 = r0.getMaxSharedSurfaceCount()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public java.lang.Object getOutputConfiguration() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            boolean r0 = r0 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28
            androidx.core.util.Preconditions.checkArgument(r0)
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) r0
            android.hardware.camera2.params.OutputConfiguration r0 = r0.mOutputConfiguration
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public java.lang.String getPhysicalCameraId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            r0.removeSurface(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl$OutputConfigurationParamsApi28 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28) r0
            r0.mDynamicRangeProfile = r2
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            r0.setPhysicalCameraId(r2)
            return
    }
}
