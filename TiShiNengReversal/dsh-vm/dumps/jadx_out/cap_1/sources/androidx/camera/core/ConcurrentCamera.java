package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConcurrentCamera {

    @androidx.annotation.NonNull
    private java.util.List<androidx.camera.core.Camera> mCameras;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class SingleCameraConfig {

        @androidx.annotation.NonNull
        private androidx.camera.core.CameraSelector mCameraSelector;

        @androidx.annotation.NonNull
        private androidx.lifecycle.LifecycleOwner mLifecycleOwner;

        @androidx.annotation.NonNull
        private androidx.camera.core.UseCaseGroup mUseCaseGroup;

        public SingleCameraConfig(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1, @androidx.annotation.NonNull androidx.camera.core.UseCaseGroup r2, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r3) {
                r0 = this;
                r0.<init>()
                r0.mCameraSelector = r1
                r0.mUseCaseGroup = r2
                r0.mLifecycleOwner = r3
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraSelector getCameraSelector() {
                r1 = this;
                androidx.camera.core.CameraSelector r0 = r1.mCameraSelector
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
                r1 = this;
                androidx.lifecycle.LifecycleOwner r0 = r1.mLifecycleOwner
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.UseCaseGroup getUseCaseGroup() {
                r1 = this;
                androidx.camera.core.UseCaseGroup r0 = r1.mUseCaseGroup
                return r0
        }
    }

    public ConcurrentCamera(@androidx.annotation.NonNull java.util.List<androidx.camera.core.Camera> r1) {
            r0 = this;
            r0.<init>()
            r0.mCameras = r1
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.Camera> getCameras() {
            r1 = this;
            java.util.List<androidx.camera.core.Camera> r0 = r1.mCameras
            return r0
    }
}
