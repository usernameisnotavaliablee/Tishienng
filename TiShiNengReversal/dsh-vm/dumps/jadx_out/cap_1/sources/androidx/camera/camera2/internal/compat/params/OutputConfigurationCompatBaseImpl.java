package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class OutputConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl {
    static final java.lang.String TAG = "OutputConfigCompat";
    final java.lang.Object mObject;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static final class OutputConfigurationParamsApi21 {
        private static final java.lang.String DETECT_SURFACE_TYPE_METHOD = "detectSurfaceType";
        private static final java.lang.String GET_GENERATION_ID_METHOD = "getGenerationId";
        private static final java.lang.String GET_SURFACE_SIZE_METHOD = "getSurfaceSize";
        private static final java.lang.String LEGACY_CAMERA_DEVICE_CLASS = "android.hardware.camera2.legacy.LegacyCameraDevice";
        static final int MAX_SURFACES_COUNT = 1;
        final int mConfiguredFormat;
        final int mConfiguredGenerationId;
        final android.util.Size mConfiguredSize;
        long mDynamicRangeProfile;
        boolean mIsShared;

        @androidx.annotation.Nullable
        java.lang.String mPhysicalCameraId;
        final java.util.List<android.view.Surface> mSurfaces;

        OutputConfigurationParamsApi21(@androidx.annotation.NonNull android.view.Surface r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mIsShared = r0
                r0 = 1
                r2.mDynamicRangeProfile = r0
                java.lang.String r0 = "Surface must not be null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                java.util.List r0 = java.util.Collections.singletonList(r3)
                r2.mSurfaces = r0
                android.util.Size r0 = getSurfaceSize(r3)
                r2.mConfiguredSize = r0
                int r0 = getSurfaceFormat(r3)
                r2.mConfiguredFormat = r0
                int r3 = getSurfaceGenerationId(r3)
                r2.mConfiguredGenerationId = r3
                return
        }

        @android.annotation.SuppressLint({"BlockedPrivateApi", "BanUncheckedReflection"})
        private static int getSurfaceFormat(@androidx.annotation.NonNull android.view.Surface r6) {
                r0 = 0
                java.lang.String r1 = "android.hardware.camera2.legacy.LegacyCameraDevice"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                java.lang.String r2 = "detectSurfaceType"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                java.lang.Class<android.view.Surface> r5 = android.view.Surface.class
                r4[r0] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                r4 = 22
                if (r2 >= r4) goto L26
                r1.setAccessible(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                goto L26
            L1e:
                r6 = move-exception
                goto L36
            L20:
                r6 = move-exception
                goto L36
            L22:
                r6 = move-exception
                goto L36
            L24:
                r6 = move-exception
                goto L36
            L26:
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                r2[r0] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                r6 = 0
                java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                int r6 = r6.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.ClassNotFoundException -> L24
                return r6
            L36:
                java.lang.String r1 = "OutputConfigCompat"
                java.lang.String r2 = "Unable to retrieve surface format."
                androidx.camera.core.Logger.e(r1, r2, r6)
                return r0
        }

        @android.annotation.SuppressLint({"SoonBlockedPrivateApi", "BlockedPrivateApi", "BanUncheckedReflection"})
        private static int getSurfaceGenerationId(@androidx.annotation.NonNull android.view.Surface r3) {
                java.lang.Class<android.view.Surface> r0 = android.view.Surface.class
                java.lang.String r1 = "getGenerationId"
                r2 = 0
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L14
                java.lang.Object r3 = r0.invoke(r3, r2)     // Catch: java.lang.Throwable -> L14
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L14
                int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L14
                return r3
            L14:
                r3 = move-exception
                java.lang.String r0 = "OutputConfigCompat"
                java.lang.String r1 = "Unable to retrieve surface generation id."
                androidx.camera.core.Logger.e(r0, r1, r3)
                r3 = -1
                return r3
        }

        @android.annotation.SuppressLint({"BlockedPrivateApi", "BanUncheckedReflection"})
        private static android.util.Size getSurfaceSize(@androidx.annotation.NonNull android.view.Surface r7) {
                r0 = 0
                java.lang.String r1 = "android.hardware.camera2.legacy.LegacyCameraDevice"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                java.lang.String r2 = "getSurfaceSize"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                java.lang.Class<android.view.Surface> r5 = android.view.Surface.class
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                r1.setAccessible(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                r2[r6] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                android.util.Size r7 = (android.util.Size) r7     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25 java.lang.NoSuchMethodException -> L27 java.lang.ClassNotFoundException -> L29
                return r7
            L23:
                r7 = move-exception
                goto L2a
            L25:
                r7 = move-exception
                goto L2a
            L27:
                r7 = move-exception
                goto L2a
            L29:
                r7 = move-exception
            L2a:
                java.lang.String r1 = "OutputConfigCompat"
                java.lang.String r2 = "Unable to retrieve surface size."
                androidx.camera.core.Logger.e(r1, r2, r7)
                return r0
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                boolean r0 = r7 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r7 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r7
                android.util.Size r0 = r6.mConfiguredSize
                android.util.Size r2 = r7.mConfiguredSize
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L5e
                int r0 = r6.mConfiguredFormat
                int r2 = r7.mConfiguredFormat
                if (r0 != r2) goto L5e
                int r0 = r6.mConfiguredGenerationId
                int r2 = r7.mConfiguredGenerationId
                if (r0 != r2) goto L5e
                boolean r0 = r6.mIsShared
                boolean r2 = r7.mIsShared
                if (r0 != r2) goto L5e
                long r2 = r6.mDynamicRangeProfile
                long r4 = r7.mDynamicRangeProfile
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L5e
                java.lang.String r0 = r6.mPhysicalCameraId
                java.lang.String r2 = r7.mPhysicalCameraId
                boolean r0 = java.util.Objects.equals(r0, r2)
                if (r0 != 0) goto L37
                goto L5e
            L37:
                java.util.List<android.view.Surface> r0 = r6.mSurfaces
                int r0 = r0.size()
                java.util.List<android.view.Surface> r2 = r7.mSurfaces
                int r2 = r2.size()
                int r0 = java.lang.Math.min(r0, r2)
                r2 = 0
            L48:
                if (r2 >= r0) goto L5c
                java.util.List<android.view.Surface> r3 = r6.mSurfaces
                java.lang.Object r3 = r3.get(r2)
                java.util.List<android.view.Surface> r4 = r7.mSurfaces
                java.lang.Object r4 = r4.get(r2)
                if (r3 == r4) goto L59
                return r1
            L59:
                int r2 = r2 + 1
                goto L48
            L5c:
                r7 = 1
                return r7
            L5e:
                return r1
        }

        public int hashCode() {
                r4 = this;
                java.util.List<android.view.Surface> r0 = r4.mSurfaces
                int r0 = r0.hashCode()
                r1 = 31
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                int r0 = r4.mConfiguredGenerationId
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                android.util.Size r0 = r4.mConfiguredSize
                int r0 = r0.hashCode()
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                int r0 = r4.mConfiguredFormat
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                boolean r0 = r4.mIsShared
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                java.lang.String r0 = r4.mPhysicalCameraId
                if (r0 != 0) goto L2e
                r0 = 0
                goto L32
            L2e:
                int r0 = r0.hashCode()
            L32:
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                long r2 = r4.mDynamicRangeProfile
                int r0 = androidx.camera.camera2.internal.compat.params.e.a(r2)
                r0 = r0 ^ r1
                return r0
        }
    }

    OutputConfigurationCompatBaseImpl(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            r1.<init>()
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21
            r0.<init>(r2)
            r1.mObject = r0
            return
    }

    OutputConfigurationCompatBaseImpl(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mObject = r1
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void addSurface(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            java.lang.String r0 = "Surface must not be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            android.view.Surface r0 = r1.getSurface()
            if (r0 == r2) goto L21
            boolean r2 = r1.isSurfaceSharingEnabled()
            if (r2 != 0) goto L19
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot have 2 surfaces for a non-sharing configuration"
            r2.<init>(r0)
            throw r2
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Exceeds maximum number of surfaces"
            r2.<init>(r0)
            throw r2
        L21:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Surface is already added!"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
            r2 = this;
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            r1 = 1
            r0.mIsShared = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl r2 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl) r2
            java.lang.Object r2 = r2.mObject
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
            r2 = this;
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            long r0 = r0.mDynamicRangeProfile
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public java.lang.Object getOutputConfiguration() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public java.lang.String getPhysicalCameraId() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            java.lang.String r0 = r0.mPhysicalCameraId
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getStreamUseCase() {
            r2 = this;
            r0 = -1
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.Nullable
    public android.view.Surface getSurface() {
            r2 = this;
            java.lang.Object r0 = r2.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            java.util.List<android.view.Surface> r0 = r0.mSurfaces
            int r1 = r0.size()
            if (r1 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            android.view.Surface r0 = (android.view.Surface) r0
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @androidx.annotation.NonNull
    public java.util.List<android.view.Surface> getSurfaces() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            java.util.List<android.view.Surface> r0 = r0.mSurfaces
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            int r0 = r0.hashCode()
            return r0
    }

    boolean isSurfaceSharingEnabled() {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            boolean r0 = r0.mIsShared
            return r0
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            android.view.Surface r0 = r1.getSurface()
            if (r0 != r2) goto Le
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot remove surface associated with this output configuration"
            r2.<init>(r0)
            throw r2
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Surface is not part of this output configuration"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            r0.mDynamicRangeProfile = r2
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.mObject
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl$OutputConfigurationParamsApi21 r0 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) r0
            r0.mPhysicalCameraId = r2
            return
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setStreamUseCase(long r1) {
            r0 = this;
            return
    }
}
