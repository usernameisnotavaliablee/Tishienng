package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LifecycleCameraController extends androidx.camera.view.CameraController {
    private static final java.lang.String TAG = "CamLifecycleController";

    @androidx.annotation.Nullable
    private androidx.lifecycle.LifecycleOwner mLifecycleOwner;

    public LifecycleCameraController(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    LifecycleCameraController(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<androidx.camera.view.ProcessCameraProviderWrapper> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    @androidx.annotation.MainThread
    public void bindToLifecycle(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0.mLifecycleOwner = r1
            r0.startCameraAndTrackStates()
            return
    }

    @androidx.annotation.VisibleForTesting
    void shutDownForTests() {
            r1 = this;
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r1.mCameraProvider
            if (r0 == 0) goto L7
            r0.shutdown()
        L7:
            return
    }

    @Override // androidx.camera.view.CameraController
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresPermission("android.permission.CAMERA")
    androidx.camera.core.Camera startCamera() {
            r4 = this;
            androidx.lifecycle.LifecycleOwner r0 = r4.mLifecycleOwner
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r4.mCameraProvider
            if (r0 != 0) goto Lb
            return r1
        Lb:
            androidx.camera.core.UseCaseGroup r0 = r4.createUseCaseGroup()
            if (r0 != 0) goto L12
            return r1
        L12:
            androidx.camera.view.ProcessCameraProviderWrapper r1 = r4.mCameraProvider     // Catch: java.lang.IllegalArgumentException -> L1d
            androidx.lifecycle.LifecycleOwner r2 = r4.mLifecycleOwner     // Catch: java.lang.IllegalArgumentException -> L1d
            androidx.camera.core.CameraSelector r3 = r4.mCameraSelector     // Catch: java.lang.IllegalArgumentException -> L1d
            androidx.camera.core.Camera r0 = r1.bindToLifecycle(r2, r3, r0)     // Catch: java.lang.IllegalArgumentException -> L1d
            return r0
        L1d:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)"
            r1.<init>(r2, r0)
            throw r1
    }

    @androidx.annotation.MainThread
    public void unbind() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 0
            r1.mLifecycleOwner = r0
            r1.mCamera = r0
            androidx.camera.view.ProcessCameraProviderWrapper r0 = r1.mCameraProvider
            if (r0 == 0) goto Lf
            r0.unbindAll()
        Lf:
            return
    }
}
