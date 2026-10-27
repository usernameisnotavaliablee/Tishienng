package androidx.camera.camera2.interop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.camera2.interop.ExperimentalCamera2Interop
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2Interop {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class Extender<T> {
        androidx.camera.core.ExtendableBuilder<T> mBaseBuilder;

        public Extender(@androidx.annotation.NonNull androidx.camera.core.ExtendableBuilder<T> r1) {
                r0 = this;
                r0.<init>()
                r0.mBaseBuilder = r1
                return
        }

        @androidx.annotation.NonNull
        public <ValueT> androidx.camera.camera2.interop.Camera2Interop.Extender<T> setCaptureRequestOption(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<ValueT> r3, @androidx.annotation.NonNull ValueT r4) {
                r2 = this;
                androidx.camera.core.impl.Config$Option r3 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r3)
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$OptionPriority r1 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
                r0.insertOption(r3, r1, r4)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setCaptureRequestTemplate(int r3) {
                r2 = this;
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.TEMPLATE_TYPE_OPTION
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"ExecutorRegistration"})
        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setDeviceStateCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r3) {
                r2 = this;
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.hardware.camera2.CameraDevice$StateCallback> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(28)
        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setPhysicalCameraId(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"ExecutorRegistration"})
        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setSessionCaptureCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) {
                r2 = this;
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"ExecutorRegistration"})
        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setSessionStateCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r3) {
                r2 = this;
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$Option<android.hardware.camera2.CameraCaptureSession$StateCallback> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION
                r0.insertOption(r1, r3)
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(33)
        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setStreamUseCase(long r3) {
                r2 = this;
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$Option<java.lang.Long> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.insertOption(r1, r3)
                return r2
        }
    }

    private Camera2Interop() {
            r0 = this;
            r0.<init>()
            return
    }
}
