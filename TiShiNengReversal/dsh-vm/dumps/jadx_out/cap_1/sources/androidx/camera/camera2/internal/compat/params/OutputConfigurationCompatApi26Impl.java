package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class OutputConfigurationCompatApi26Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl {
    private static final java.lang.String MAX_SHARED_SURFACES_COUNT_FIELD = "MAX_SURFACES_COUNT";
    private static final java.lang.String SURFACES_FIELD = "mSurfaces";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OutputConfigurationParamsApi26 {
        long mDynamicRangeProfile;

        @androidx.annotation.NonNull
        final android.hardware.camera2.params.OutputConfiguration mOutputConfiguration;

        @androidx.annotation.Nullable
        java.lang.String mPhysicalCameraId;

        OutputConfigurationParamsApi26(@androidx.annotation.NonNull android.hardware.camera2.params.OutputConfiguration r3) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.mDynamicRangeProfile = r0
                r2.mOutputConfiguration = r3
                return
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                boolean r0 = r7 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r7 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) r7
                android.hardware.camera2.params.OutputConfiguration r0 = r6.mOutputConfiguration
                android.hardware.camera2.params.OutputConfiguration r2 = r7.mOutputConfiguration
                boolean r0 = java.util.Objects.equals(r0, r2)
                if (r0 == 0) goto L26
                long r2 = r6.mDynamicRangeProfile
                long r4 = r7.mDynamicRangeProfile
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L26
                java.lang.String r0 = r6.mPhysicalCameraId
                java.lang.String r7 = r7.mPhysicalCameraId
                boolean r7 = java.util.Objects.equals(r0, r7)
                if (r7 == 0) goto L26
                r7 = 1
                return r7
            L26:
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
                java.lang.String r0 = r4.mPhysicalCameraId
                if (r0 != 0) goto L12
                r0 = 0
                goto L16
            L12:
                int r0 = r0.hashCode()
            L16:
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                long r2 = r4.mDynamicRangeProfile
                int r0 = androidx.camera.camera2.internal.compat.params.e.a(r2)
                r0 = r0 ^ r1
                return r0
        }
    }

    OutputConfigurationCompatApi26Impl(int r3, @androidx.annotation.NonNull android.view.Surface r4) {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26
            android.hardware.camera2.params.OutputConfiguration r1 = new android.hardware.camera2.params.OutputConfiguration
            r1.<init>(r3, r4)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    OutputConfigurationCompatApi26Impl(@androidx.annotation.NonNull android.view.Surface r3) {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26
            android.hardware.camera2.params.OutputConfiguration r1 = new android.hardware.camera2.params.OutputConfiguration
            r1.<init>(r3)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    OutputConfigurationCompatApi26Impl(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    private static int getMaxSharedSurfaceCountApi26() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r0 = android.hardware.camera2.params.OutputConfiguration.class
            java.lang.String r1 = "MAX_SURFACES_COUNT"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    private static java.util.List<android.view.Surface> getMutableSurfaceListApi26(android.hardware.camera2.params.OutputConfiguration r2) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r0 = android.hardware.camera2.params.OutputConfiguration.class
            java.lang.String r1 = "mSurfaces"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    @androidx.annotation.RequiresApi(26)
    static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl wrap(@androidx.annotation.NonNull android.hardware.camera2.params.OutputConfiguration r2) {
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r1 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void addSurface(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            r0.addSurface(r2)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            r0.enableSurfaceSharing()
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
            r2 = this;
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) r0
            long r0 = r0.mDynamicRangeProfile
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
            r3 = this;
            int r0 = getMaxSharedSurfaceCountApi26()     // Catch: java.lang.IllegalAccessException -> L5 java.lang.NoSuchFieldException -> L7
            return r0
        L5:
            r0 = move-exception
            goto L8
        L7:
            r0 = move-exception
        L8:
            java.lang.String r1 = "OutputConfigCompat"
            java.lang.String r2 = "Unable to retrieve max shared surface count."
            androidx.camera.core.Logger.e(r1, r2, r0)
            int r0 = super.getMaxSharedSurfaceCount()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public java.lang.Object getOutputConfiguration() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            boolean r0 = r0 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26
            androidx.core.util.Preconditions.checkArgument(r0)
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) r0
            android.hardware.camera2.params.OutputConfiguration r0 = r0.mOutputConfiguration
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public java.lang.String getPhysicalCameraId() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) r0
            java.lang.String r0 = r0.mPhysicalCameraId
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public java.util.List<android.view.Surface> getSurfaces() {
            r1 = this;
            java.lang.Object r0 = r1.getOutputConfiguration()
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0
            java.util.List r0 = r0.getSurfaces()
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    final boolean isSurfaceSharingEnabled() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "isSurfaceSharingEnabled() should not be called on API >= 26"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(@androidx.annotation.NonNull android.view.Surface r3) {
            r2 = this;
            android.view.Surface r0 = r2.getSurface()
            if (r0 == r3) goto L2a
            java.lang.Object r0 = r2.getOutputConfiguration()     // Catch: java.lang.NoSuchFieldException -> L1f java.lang.IllegalAccessException -> L21
            android.hardware.camera2.params.OutputConfiguration r0 = (android.hardware.camera2.params.OutputConfiguration) r0     // Catch: java.lang.NoSuchFieldException -> L1f java.lang.IllegalAccessException -> L21
            java.util.List r0 = getMutableSurfaceListApi26(r0)     // Catch: java.lang.NoSuchFieldException -> L1f java.lang.IllegalAccessException -> L21
            boolean r3 = r0.remove(r3)     // Catch: java.lang.NoSuchFieldException -> L1f java.lang.IllegalAccessException -> L21
            if (r3 == 0) goto L17
            return
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.NoSuchFieldException -> L1f java.lang.IllegalAccessException -> L21
            java.lang.String r0 = "Surface is not part of this output configuration"
            r3.<init>(r0)     // Catch: java.lang.NoSuchFieldException -> L1f java.lang.IllegalAccessException -> L21
            throw r3     // Catch: java.lang.NoSuchFieldException -> L1f java.lang.IllegalAccessException -> L21
        L1f:
            r3 = move-exception
            goto L22
        L21:
            r3 = move-exception
        L22:
            java.lang.String r0 = "OutputConfigCompat"
            java.lang.String r1 = "Unable to remove surface from this output configuration."
            androidx.camera.core.Logger.e(r0, r1, r3)
            return
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot remove surface associated with this output configuration"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) r0
            r0.mDynamicRangeProfile = r2
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl$OutputConfigurationParamsApi26 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) r0
            r0.mPhysicalCameraId = r2
            return
    }
}
