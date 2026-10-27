package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ApiCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void close(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r0) {
                r0.close()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void onSurfacePrepared(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r0, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.view.Surface r2) {
                androidx.camera.camera2.internal.compat.a.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void onCaptureBufferLost(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r0, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull android.view.Surface r3, long r4) {
                androidx.camera.camera2.internal.compat.b.a(r0, r1, r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static <T> android.hardware.camera2.params.OutputConfiguration newOutputConfiguration(@androidx.annotation.NonNull android.util.Size r0, @androidx.annotation.NonNull java.lang.Class<T> r1) {
                android.hardware.camera2.params.OutputConfiguration r0 = androidx.camera.camera2.internal.compat.d.a(r0, r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void onCaptureQueueEmpty(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r0, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
                androidx.camera.camera2.internal.compat.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void onCameraAccessPrioritiesChanged(@androidx.annotation.NonNull android.hardware.camera2.CameraManager.AvailabilityCallback r0) {
                androidx.camera.camera2.internal.compat.e.a(r0)
                return
        }
    }

    private ApiCompat() {
            r0 = this;
            r0.<init>()
            return
    }
}
