package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ProcessCameraProviderWrapperImpl implements androidx.camera.view.ProcessCameraProviderWrapper {
    private final androidx.camera.lifecycle.ProcessCameraProvider mProcessCameraProvider;

    ProcessCameraProviderWrapperImpl(androidx.camera.lifecycle.ProcessCameraProvider r1) {
            r0 = this;
            r0.<init>()
            r0.mProcessCameraProvider = r1
            return
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    @androidx.annotation.NonNull
    public androidx.camera.core.Camera bindToLifecycle(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2, @androidx.annotation.NonNull androidx.camera.core.CameraSelector r3, @androidx.annotation.NonNull androidx.camera.core.UseCaseGroup r4) {
            r1 = this;
            androidx.camera.lifecycle.ProcessCameraProvider r0 = r1.mProcessCameraProvider
            androidx.camera.core.Camera r2 = r0.bindToLifecycle(r2, r3, r4)
            return r2
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public boolean hasCamera(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r2) throws androidx.camera.core.CameraInfoUnavailableException {
            r1 = this;
            androidx.camera.lifecycle.ProcessCameraProvider r0 = r1.mProcessCameraProvider
            boolean r2 = r0.hasCamera(r2)
            return r2
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> shutdown() {
            r1 = this;
            androidx.camera.lifecycle.ProcessCameraProvider r0 = r1.mProcessCameraProvider
            com.google.common.util.concurrent.ListenableFuture r0 = r0.shutdown()
            return r0
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public void unbind(@androidx.annotation.NonNull androidx.camera.core.UseCase... r2) {
            r1 = this;
            androidx.camera.lifecycle.ProcessCameraProvider r0 = r1.mProcessCameraProvider
            r0.unbind(r2)
            return
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public void unbindAll() {
            r1 = this;
            androidx.camera.lifecycle.ProcessCameraProvider r0 = r1.mProcessCameraProvider
            r0.unbindAll()
            return
    }
}
