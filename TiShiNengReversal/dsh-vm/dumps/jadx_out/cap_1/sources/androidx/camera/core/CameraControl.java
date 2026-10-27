package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraControl {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class OperationCanceledException extends java.lang.Exception {
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering();

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean r1);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int r1);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float r1);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r1);
}
