package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageAnalysisBlockingAnalyzer extends androidx.camera.core.ImageAnalysisAbstractAnalyzer {


    ImageAnalysisBlockingAnalyzer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    @androidx.annotation.Nullable
    androidx.camera.core.ImageProxy acquireImage(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r1) {
            r0 = this;
            androidx.camera.core.ImageProxy r1 = r1.acquireNextImage()
            return r1
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    void clearCache() {
            r0 = this;
            return
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    void onValidImageAvailable(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r2.analyzeImage(r3)
            androidx.camera.core.ImageAnalysisBlockingAnalyzer$1 r1 = new androidx.camera.core.ImageAnalysisBlockingAnalyzer$1
            r1.<init>(r2, r3)
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r3)
            return
    }
}
