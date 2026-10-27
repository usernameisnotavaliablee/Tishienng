package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RestrictedCameraInfo extends androidx.camera.core.impl.ForwardingCameraInfo {
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfo;
    private final androidx.camera.core.impl.RestrictedCameraControl mRestrictedCameraControl;


    public RestrictedCameraInfo(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r1, @androidx.annotation.NonNull androidx.camera.core.impl.RestrictedCameraControl r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mCameraInfo = r1
            r0.mRestrictedCameraControl = r2
            return
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.ExposureState getExposureState() {
            r2 = this;
            androidx.camera.core.impl.RestrictedCameraControl r0 = r2.mRestrictedCameraControl
            r1 = 7
            int[] r1 = new int[]{r1}
            boolean r0 = r0.isOperationSupported(r1)
            if (r0 != 0) goto L13
            androidx.camera.core.impl.RestrictedCameraInfo$1 r0 = new androidx.camera.core.impl.RestrictedCameraInfo$1
            r0.<init>(r2)
            return r0
        L13:
            androidx.camera.core.impl.CameraInfoInternal r0 = r2.mCameraInfo
            androidx.camera.core.ExposureState r0 = r0.getExposureState()
            return r0
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraInfoInternal getImplementation() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfo
            return r0
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.lang.Integer> getTorchState() {
            r2 = this;
            androidx.camera.core.impl.RestrictedCameraControl r0 = r2.mRestrictedCameraControl
            r1 = 6
            int[] r1 = new int[]{r1}
            boolean r0 = r0.isOperationSupported(r1)
            if (r0 != 0) goto L18
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1)
            return r0
        L18:
            androidx.camera.core.impl.CameraInfoInternal r0 = r2.mCameraInfo
            androidx.lifecycle.LiveData r0 = r0.getTorchState()
            return r0
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState() {
            r3 = this;
            androidx.camera.core.impl.RestrictedCameraControl r0 = r3.mRestrictedCameraControl
            r1 = 0
            int[] r1 = new int[]{r1}
            boolean r0 = r0.isOperationSupported(r1)
            if (r0 != 0) goto L1a
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            androidx.camera.core.ZoomState r1 = androidx.camera.core.internal.ImmutableZoomState.create(r2, r2, r2, r1)
            r0.<init>(r1)
            return r0
        L1a:
            androidx.camera.core.impl.CameraInfoInternal r0 = r3.mCameraInfo
            androidx.lifecycle.LiveData r0 = r0.getZoomState()
            return r0
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
            r2 = this;
            androidx.camera.core.impl.RestrictedCameraControl r0 = r2.mRestrictedCameraControl
            r1 = 5
            int[] r1 = new int[]{r1}
            boolean r0 = r0.isOperationSupported(r1)
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            androidx.camera.core.impl.CameraInfoInternal r0 = r2.mCameraInfo
            boolean r0 = r0.hasFlashUnit()
            return r0
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r2) {
            r1 = this;
            androidx.camera.core.impl.RestrictedCameraControl r0 = r1.mRestrictedCameraControl
            androidx.camera.core.FocusMeteringAction r0 = r0.getModifiedFocusMeteringAction(r2)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfo
            boolean r2 = r0.isFocusMeteringSupported(r2)
            return r2
    }
}
