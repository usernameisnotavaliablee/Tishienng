package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RestrictedCameraControl extends androidx.camera.core.impl.ForwardingCameraControl {
    public static final int AE_REGION = 3;
    public static final int AF_REGION = 2;
    public static final int AUTO_FOCUS = 1;
    public static final int AWB_REGION = 4;
    public static final int EXPOSURE_COMPENSATION = 7;
    public static final int FLASH = 5;
    public static final int TORCH = 6;
    public static final int ZOOM = 0;
    private final androidx.camera.core.impl.CameraControlInternal mCameraControl;

    @androidx.annotation.Nullable
    @androidx.camera.core.impl.RestrictedCameraControl.CameraOperation
    private volatile java.util.Set<java.lang.Integer> mRestrictedCameraOperations;
    private volatile boolean mUseRestrictedCameraOperations;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface CameraOperation {
    }

    public RestrictedCameraControl(@androidx.annotation.NonNull androidx.camera.core.impl.CameraControlInternal r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mUseRestrictedCameraOperations = r0
            r1.mCameraControl = r2
            return
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControl
            com.google.common.util.concurrent.ListenableFuture r0 = r0.cancelFocusAndMetering()
            return r0
    }

    public void enableRestrictedOperations(boolean r1, @androidx.annotation.Nullable @androidx.camera.core.impl.RestrictedCameraControl.CameraOperation java.util.Set<java.lang.Integer> r2) {
            r0 = this;
            r0.mUseRestrictedCameraOperations = r1
            r0.mRestrictedCameraOperations = r2
            return
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean r2) {
            r1 = this;
            r0 = 6
            int[] r0 = new int[]{r0}
            boolean r0 = r1.isOperationSupported(r0)
            if (r0 != 0) goto L17
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Torch is not supported"
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L17:
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.enableTorch(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraControlInternal getImplementation() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControl
            return r0
    }

    @androidx.annotation.Nullable
    androidx.camera.core.FocusMeteringAction getModifiedFocusMeteringAction(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r6) {
            r5 = this;
            androidx.camera.core.FocusMeteringAction$Builder r0 = new androidx.camera.core.FocusMeteringAction$Builder
            r0.<init>(r6)
            java.util.List r1 = r6.getMeteringPointsAf()
            boolean r1 = r1.isEmpty()
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L20
            int[] r1 = new int[]{r3, r2}
            boolean r1 = r5.isOperationSupported(r1)
            if (r1 != 0) goto L20
            r0.removePoints(r3)
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            java.util.List r4 = r6.getMeteringPointsAe()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L3a
            r4 = 3
            int[] r4 = new int[]{r4}
            boolean r4 = r5.isOperationSupported(r4)
            if (r4 != 0) goto L3a
            r0.removePoints(r2)
            r1 = 1
        L3a:
            java.util.List r2 = r6.getMeteringPointsAwb()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L53
            r2 = 4
            int[] r4 = new int[]{r2}
            boolean r4 = r5.isOperationSupported(r4)
            if (r4 != 0) goto L53
            r0.removePoints(r2)
            goto L54
        L53:
            r3 = r1
        L54:
            if (r3 != 0) goto L57
            return r6
        L57:
            androidx.camera.core.FocusMeteringAction r6 = r0.build()
            java.util.List r1 = r6.getMeteringPointsAf()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7b
            java.util.List r1 = r6.getMeteringPointsAe()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7b
            java.util.List r6 = r6.getMeteringPointsAwb()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L7b
            r6 = 0
            return r6
        L7b:
            androidx.camera.core.FocusMeteringAction r6 = r0.build()
            return r6
    }

    boolean isOperationSupported(@androidx.annotation.NonNull @androidx.camera.core.impl.RestrictedCameraControl.CameraOperation int... r5) {
            r4 = this;
            boolean r0 = r4.mUseRestrictedCameraOperations
            if (r0 == 0) goto L26
            java.util.Set<java.lang.Integer> r0 = r4.mRestrictedCameraOperations
            if (r0 != 0) goto L9
            goto L26
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L1f
            r3 = r5[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L11
        L1f:
            java.util.Set<java.lang.Integer> r5 = r4.mRestrictedCameraOperations
            boolean r5 = r5.containsAll(r0)
            return r5
        L26:
            r5 = 1
            return r5
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int r2) {
            r1 = this;
            r0 = 7
            int[] r0 = new int[]{r0}
            boolean r0 = r1.isOperationSupported(r0)
            if (r0 != 0) goto L17
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "ExposureCompensation is not supported"
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L17:
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setExposureCompensationIndex(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float r2) {
            r1 = this;
            r0 = 0
            int[] r0 = new int[]{r0}
            boolean r0 = r1.isOperationSupported(r0)
            if (r0 != 0) goto L17
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Zoom is not supported"
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L17:
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setLinearZoom(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float r2) {
            r1 = this;
            r0 = 0
            int[] r0 = new int[]{r0}
            boolean r0 = r1.isOperationSupported(r0)
            if (r0 != 0) goto L17
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Zoom is not supported"
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L17:
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setZoomRatio(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r2) {
            r1 = this;
            androidx.camera.core.FocusMeteringAction r2 = r1.getModifiedFocusMeteringAction(r2)
            if (r2 != 0) goto L12
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "FocusMetering is not supported"
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r2)
            return r2
        L12:
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControl
            com.google.common.util.concurrent.ListenableFuture r2 = r0.startFocusAndMetering(r2)
            return r2
    }
}
