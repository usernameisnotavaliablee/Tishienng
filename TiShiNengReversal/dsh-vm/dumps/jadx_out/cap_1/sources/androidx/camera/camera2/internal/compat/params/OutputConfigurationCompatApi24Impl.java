package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(24)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class OutputConfigurationCompatApi24Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OutputConfigurationParamsApi24 {
        long mDynamicRangeProfile;
        boolean mIsShared;

        @androidx.annotation.NonNull
        final android.hardware.camera2.params.OutputConfiguration mOutputConfiguration;

        @androidx.annotation.Nullable
        java.lang.String mPhysicalCameraId;

        OutputConfigurationParamsApi24(@androidx.annotation.NonNull android.hardware.camera2.params.OutputConfiguration r3) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.mDynamicRangeProfile = r0
                r2.mOutputConfiguration = r3
                return
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                boolean r0 = r7 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r7 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r7
                android.hardware.camera2.params.OutputConfiguration r0 = r6.mOutputConfiguration
                android.hardware.camera2.params.OutputConfiguration r2 = r7.mOutputConfiguration
                boolean r0 = java.util.Objects.equals(r0, r2)
                if (r0 == 0) goto L2c
                boolean r0 = r6.mIsShared
                boolean r2 = r7.mIsShared
                if (r0 != r2) goto L2c
                long r2 = r6.mDynamicRangeProfile
                long r4 = r7.mDynamicRangeProfile
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L2c
                java.lang.String r0 = r6.mPhysicalCameraId
                java.lang.String r7 = r7.mPhysicalCameraId
                boolean r7 = java.util.Objects.equals(r0, r7)
                if (r7 == 0) goto L2c
                r7 = 1
                return r7
            L2c:
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
                boolean r0 = r4.mIsShared
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                java.lang.String r0 = r4.mPhysicalCameraId
                if (r0 != 0) goto L18
                r0 = 0
                goto L1c
            L18:
                int r0 = r0.hashCode()
            L1c:
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                long r2 = r4.mDynamicRangeProfile
                int r0 = androidx.camera.camera2.internal.compat.params.e.a(r2)
                r0 = r0 ^ r1
                return r0
        }
    }

    OutputConfigurationCompatApi24Impl(int r3, @androidx.annotation.NonNull android.view.Surface r4) {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24
            android.hardware.camera2.params.OutputConfiguration r1 = new android.hardware.camera2.params.OutputConfiguration
            r1.<init>(r3, r4)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    OutputConfigurationCompatApi24Impl(@androidx.annotation.NonNull android.view.Surface r3) {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24
            android.hardware.camera2.params.OutputConfiguration r1 = new android.hardware.camera2.params.OutputConfiguration
            r1.<init>(r3)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    OutputConfigurationCompatApi24Impl(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.RequiresApi(24)
    static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl wrap(@androidx.annotation.NonNull android.hardware.camera2.params.OutputConfiguration r2) {
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r1 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
            r2 = this;
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r0
            r1 = 1
            r0.mIsShared = r1
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
            r2 = this;
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r0
            long r0 = r0.mDynamicRangeProfile
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public java.lang.Object getOutputConfiguration() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            boolean r0 = r0 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24
            androidx.core.util.Preconditions.checkArgument(r0)
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r0
            android.hardware.camera2.params.OutputConfiguration r0 = r0.mOutputConfiguration
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public java.lang.String getPhysicalCameraId() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r0
            java.lang.String r0 = r0.mPhysicalCameraId
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public android.view.Surface getSurface() {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            int r0 = r0.getSurfaceGroupId()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public java.util.List<android.view.Surface> getSurfaces() {
            r1 = this;
            android.view.Surface r0 = r1.getSurface()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    boolean isSurfaceSharingEnabled() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r0
            boolean r0 = r0.mIsShared
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r0
            r0.mDynamicRangeProfile = r2
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl$OutputConfigurationParamsApi24 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) r0
            r0.mPhysicalCameraId = r2
            return
    }
}
