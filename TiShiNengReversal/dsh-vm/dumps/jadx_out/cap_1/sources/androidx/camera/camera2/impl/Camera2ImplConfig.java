package androidx.camera.camera2.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2ImplConfig extends androidx.camera.camera2.interop.CaptureRequestOptions {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.camera2.impl.CameraEventCallbacks> CAMERA_EVENT_CALLBACK_OPTION = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<java.lang.Object> CAPTURE_REQUEST_TAG_OPTION = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraDevice.StateCallback> DEVICE_STATE_CALLBACK_OPTION = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.CaptureCallback> SESSION_CAPTURE_CALLBACK_OPTION = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<java.lang.String> SESSION_PHYSICAL_CAMERA_ID_OPTION = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.StateCallback> SESSION_STATE_CALLBACK_OPTION = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<java.lang.Long> STREAM_USE_CASE_OPTION = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> TEMPLATE_TYPE_OPTION = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.impl.Camera2ImplConfig> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableOptionsBundle;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                r1.mMutableOptionsBundle = r0
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public androidx.camera.camera2.impl.Camera2ImplConfig build() {
                r2 = this;
                androidx.camera.camera2.impl.Camera2ImplConfig r0 = new androidx.camera.camera2.impl.Camera2ImplConfig
                androidx.camera.core.impl.MutableOptionsBundle r1 = r2.mMutableOptionsBundle
                androidx.camera.core.impl.OptionsBundle r1 = androidx.camera.core.impl.OptionsBundle.from(r1)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.camera2.impl.Camera2ImplConfig build() {
                r1 = this;
                androidx.camera.camera2.impl.Camera2ImplConfig r0 = r1.build()
                return r0
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
                r1 = this;
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableOptionsBundle
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.camera2.impl.Camera2ImplConfig.Builder insertAllOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r5) {
                r4 = this;
                java.util.Set r0 = r5.listOptions()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
                androidx.camera.core.impl.MutableOptionsBundle r2 = r4.mMutableOptionsBundle
                java.lang.Object r3 = r5.retrieveOption(r1)
                r2.insertOption(r1, r3)
                goto L8
            L1e:
                return r4
        }

        @androidx.annotation.NonNull
        public <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOption(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<ValueT> r2, @androidx.annotation.NonNull ValueT r3) {
                r1 = this;
                androidx.camera.core.impl.Config$Option r2 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r2)
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableOptionsBundle
                r0.insertOption(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOptionWithPriority(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<ValueT> r2, @androidx.annotation.NonNull ValueT r3, @androidx.annotation.NonNull androidx.camera.core.impl.Config.OptionPriority r4) {
                r1 = this;
                androidx.camera.core.impl.Config$Option r2 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r2)
                androidx.camera.core.impl.MutableOptionsBundle r0 = r1.mMutableOptionsBundle
                r0.insertOption(r2, r4, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Extender<T> {
        androidx.camera.core.ExtendableBuilder<T> mBaseBuilder;

        public Extender(@androidx.annotation.NonNull androidx.camera.core.ExtendableBuilder<T> r1) {
                r0 = this;
                r0.<init>()
                r0.mBaseBuilder = r1
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.camera2.impl.Camera2ImplConfig.Extender<T> setCameraEventCallback(@androidx.annotation.NonNull androidx.camera.camera2.impl.CameraEventCallbacks r3) {
                r2 = this;
                androidx.camera.core.ExtendableBuilder<T> r0 = r2.mBaseBuilder
                androidx.camera.core.impl.MutableConfig r0 = r0.getMutableConfig()
                androidx.camera.core.impl.Config$Option<androidx.camera.camera2.impl.CameraEventCallbacks> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.CAMERA_EVENT_CALLBACK_OPTION
                r0.insertOption(r1, r3)
                return r2
        }
    }

    static {
            java.lang.String r0 = "camera2.captureRequest.templateType"
            java.lang.Class r1 = java.lang.Integer.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.TEMPLATE_TYPE_OPTION = r0
            java.lang.String r0 = "camera2.cameraCaptureSession.streamUseCase"
            java.lang.Class r1 = java.lang.Long.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION = r0
            java.lang.String r0 = "camera2.cameraDevice.stateCallback"
            java.lang.Class<android.hardware.camera2.CameraDevice$StateCallback> r1 = android.hardware.camera2.CameraDevice.StateCallback.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION = r0
            java.lang.String r0 = "camera2.cameraCaptureSession.stateCallback"
            java.lang.Class<android.hardware.camera2.CameraCaptureSession$StateCallback> r1 = android.hardware.camera2.CameraCaptureSession.StateCallback.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION = r0
            java.lang.String r0 = "camera2.cameraCaptureSession.captureCallback"
            java.lang.Class<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r1 = android.hardware.camera2.CameraCaptureSession.CaptureCallback.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION = r0
            java.lang.String r0 = "camera2.cameraEvent.callback"
            java.lang.Class<androidx.camera.camera2.impl.CameraEventCallbacks> r1 = androidx.camera.camera2.impl.CameraEventCallbacks.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.CAMERA_EVENT_CALLBACK_OPTION = r0
            java.lang.String r0 = "camera2.captureRequest.tag"
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.CAPTURE_REQUEST_TAG_OPTION = r0
            java.lang.String r0 = "camera2.cameraCaptureSession.physicalCameraId"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION = r0
            return
    }

    public Camera2ImplConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static androidx.camera.core.impl.Config.Option<java.lang.Object> createCaptureRequestOption(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Key<?> r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "camera2.captureRequest.option."
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.core.impl.Config.Option.create(r0, r1, r2)
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.camera.camera2.impl.CameraEventCallbacks getCameraEventCallback(@androidx.annotation.Nullable androidx.camera.camera2.impl.CameraEventCallbacks r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.camera2.impl.CameraEventCallbacks> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.CAMERA_EVENT_CALLBACK_OPTION
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            androidx.camera.camera2.impl.CameraEventCallbacks r3 = (androidx.camera.camera2.impl.CameraEventCallbacks) r3
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.camera.camera2.interop.CaptureRequestOptions getCaptureRequestOptions() {
            r1 = this;
            androidx.camera.core.impl.Config r0 = r1.getConfig()
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r0 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r0)
            androidx.camera.camera2.interop.CaptureRequestOptions r0 = r0.build()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getCaptureRequestTag(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Object> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.CAPTURE_REQUEST_TAG_OPTION
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            return r3
    }

    public int getCaptureRequestTemplate(int r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.TEMPLATE_TYPE_OPTION
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
    }

    @androidx.annotation.Nullable
    public android.hardware.camera2.CameraDevice.StateCallback getDeviceStateCallback(@androidx.annotation.Nullable android.hardware.camera2.CameraDevice.StateCallback r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<android.hardware.camera2.CameraDevice$StateCallback> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            android.hardware.camera2.CameraDevice$StateCallback r3 = (android.hardware.camera2.CameraDevice.StateCallback) r3
            return r3
    }

    @androidx.annotation.Nullable
    public java.lang.String getPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<java.lang.String> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    @androidx.annotation.Nullable
    public android.hardware.camera2.CameraCaptureSession.CaptureCallback getSessionCaptureCallback(@androidx.annotation.Nullable android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r3 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r3
            return r3
    }

    @androidx.annotation.Nullable
    public android.hardware.camera2.CameraCaptureSession.StateCallback getSessionStateCallback(@androidx.annotation.Nullable android.hardware.camera2.CameraCaptureSession.StateCallback r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<android.hardware.camera2.CameraCaptureSession$StateCallback> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            android.hardware.camera2.CameraCaptureSession$StateCallback r3 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r3
            return r3
    }

    public long getStreamUseCase(long r3) {
            r2 = this;
            androidx.camera.core.impl.Config r0 = r2.getConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Long> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r0.retrieveOption(r1, r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            return r3
    }
}
