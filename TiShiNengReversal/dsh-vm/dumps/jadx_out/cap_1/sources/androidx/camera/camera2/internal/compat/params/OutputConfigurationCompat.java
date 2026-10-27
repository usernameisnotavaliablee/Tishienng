package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OutputConfigurationCompat {
    public static final int STREAM_USE_CASE_NONE = -1;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OutputConfigurationCompatImpl {
        void addSurface(@androidx.annotation.NonNull android.view.Surface r1);

        void enableSurfaceSharing();

        long getDynamicRangeProfile();

        int getMaxSharedSurfaceCount();

        @androidx.annotation.Nullable
        java.lang.Object getOutputConfiguration();

        @androidx.annotation.Nullable
        java.lang.String getPhysicalCameraId();

        long getStreamUseCase();

        @androidx.annotation.Nullable
        android.view.Surface getSurface();

        int getSurfaceGroupId();

        java.util.List<android.view.Surface> getSurfaces();

        void removeSurface(@androidx.annotation.NonNull android.view.Surface r1);

        void setDynamicRangeProfile(long r1);

        void setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r1);

        void setStreamUseCase(long r1);
    }

    public OutputConfigurationCompat(int r3, @androidx.annotation.NonNull android.view.Surface r4) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L11
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl
            r0.<init>(r3, r4)
            r2.mImpl = r0
            return
        L11:
            r1 = 28
            if (r0 < r1) goto L1d
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl
            r0.<init>(r3, r4)
            r2.mImpl = r0
            return
        L1d:
            r1 = 26
            if (r0 < r1) goto L29
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl
            r0.<init>(r3, r4)
            r2.mImpl = r0
            return
        L29:
            r1 = 24
            if (r0 < r1) goto L35
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl
            r0.<init>(r3, r4)
            r2.mImpl = r0
            return
        L35:
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl r3 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
            r3.<init>(r4)
            r2.mImpl = r3
            return
    }

    @androidx.annotation.RequiresApi(26)
    public <T> OutputConfigurationCompat(@androidx.annotation.NonNull android.util.Size r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            r1 = this;
            r1.<init>()
            android.hardware.camera2.params.OutputConfiguration r2 = androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.newOutputConfiguration(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L14
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl r2 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl.wrap(r2)
            r1.mImpl = r2
            return
        L14:
            r0 = 28
            if (r3 < r0) goto L1f
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl r2 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.wrap(r2)
            r1.mImpl = r2
            return
        L1f:
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl r2 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.wrap(r2)
            r1.mImpl = r2
            return
    }

    public OutputConfigurationCompat(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            r0 = -1
            r1.<init>(r0, r2)
            return
    }

    private OutputConfigurationCompat(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.Nullable
    public static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat wrap(@androidx.annotation.Nullable java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L13
            android.hardware.camera2.params.OutputConfiguration r3 = androidx.camera.camera2.internal.compat.params.d.a(r3)
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl r3 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl.wrap(r3)
            goto L3b
        L13:
            r2 = 28
            if (r1 < r2) goto L20
            android.hardware.camera2.params.OutputConfiguration r3 = androidx.camera.camera2.internal.compat.params.d.a(r3)
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl r3 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.wrap(r3)
            goto L3b
        L20:
            r2 = 26
            if (r1 < r2) goto L2d
            android.hardware.camera2.params.OutputConfiguration r3 = androidx.camera.camera2.internal.compat.params.d.a(r3)
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl r3 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.wrap(r3)
            goto L3b
        L2d:
            r2 = 24
            if (r1 < r2) goto L3a
            android.hardware.camera2.params.OutputConfiguration r3 = androidx.camera.camera2.internal.compat.params.d.a(r3)
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl r3 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.wrap(r3)
            goto L3b
        L3a:
            r3 = r0
        L3b:
            if (r3 != 0) goto L3e
            return r0
        L3e:
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r0 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat
            r0.<init>(r3)
            return r0
    }

    public void addSurface(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            r0.addSurface(r2)
            return
    }

    public void enableSurfaceSharing() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            r0.enableSurfaceSharing()
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r2 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) r2
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r2 = r2.mImpl
            boolean r2 = r0.equals(r2)
            return r2
    }

    public long getDynamicRangeProfile() {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r2.mImpl
            long r0 = r0.getDynamicRangeProfile()
            return r0
    }

    public int getMaxSharedSurfaceCount() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.getMaxSharedSurfaceCount()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.String getPhysicalCameraId() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            java.lang.String r0 = r0.getPhysicalCameraId()
            return r0
    }

    public long getStreamUseCase() {
            r2 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r2.mImpl
            long r0 = r0.getStreamUseCase()
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.Surface getSurface() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    public int getSurfaceGroupId() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.getSurfaceGroupId()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.view.Surface> getSurfaces() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            java.util.List r0 = r0.getSurfaces()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    public void removeSurface(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            r0.removeSurface(r2)
            return
    }

    public void setDynamicRangeProfile(long r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            r0.setDynamicRangeProfile(r2)
            return
    }

    public void setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            r0.setPhysicalCameraId(r2)
            return
    }

    public void setStreamUseCase(long r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            r0.setStreamUseCase(r2)
            return
    }

    @androidx.annotation.Nullable
    public java.lang.Object unwrap() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getOutputConfiguration()
            return r0
    }
}
