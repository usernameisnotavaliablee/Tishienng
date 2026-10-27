package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class StreamConfigurationMapCompatBaseImpl implements androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {
    final android.hardware.camera2.params.StreamConfigurationMap mStreamConfigurationMap;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.util.Size[] getHighResolutionOutputSizes(android.hardware.camera2.params.StreamConfigurationMap r0, int r1) {
                android.util.Size[] r0 = androidx.camera.camera2.internal.compat.b0.a(r0, r1)
                return r0
        }
    }

    StreamConfigurationMapCompatBaseImpl(@androidx.annotation.NonNull android.hardware.camera2.params.StreamConfigurationMap r1) {
            r0 = this;
            r0.<init>()
            r0.mStreamConfigurationMap = r1
            return
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @androidx.annotation.Nullable
    public android.util.Size[] getHighResolutionOutputSizes(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            android.hardware.camera2.params.StreamConfigurationMap r0 = r2.mStreamConfigurationMap
            android.util.Size[] r3 = androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl.Api23Impl.getHighResolutionOutputSizes(r0, r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @androidx.annotation.Nullable
    public android.util.Size[] getOutputSizes(int r2) {
            r1 = this;
            r0 = 34
            if (r2 != r0) goto Ld
            android.hardware.camera2.params.StreamConfigurationMap r2 = r1.mStreamConfigurationMap
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r2 = r2.getOutputSizes(r0)
            return r2
        Ld:
            android.hardware.camera2.params.StreamConfigurationMap r0 = r1.mStreamConfigurationMap
            android.util.Size[] r2 = r0.getOutputSizes(r2)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @androidx.annotation.Nullable
    public <T> android.util.Size[] getOutputSizes(@androidx.annotation.NonNull java.lang.Class<T> r2) {
            r1 = this;
            android.hardware.camera2.params.StreamConfigurationMap r0 = r1.mStreamConfigurationMap
            android.util.Size[] r2 = r0.getOutputSizes(r2)
            return r2
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @androidx.annotation.NonNull
    public android.hardware.camera2.params.StreamConfigurationMap unwrap() {
            r1 = this;
            android.hardware.camera2.params.StreamConfigurationMap r0 = r1.mStreamConfigurationMap
            return r0
    }
}
