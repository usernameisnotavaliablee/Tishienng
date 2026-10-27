package androidx.camera.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_LifecycleCameraRepository_Key extends androidx.camera.lifecycle.LifecycleCameraRepository.Key {
    private final androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner;

    AutoValue_LifecycleCameraRepository_Key(androidx.lifecycle.LifecycleOwner r1, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            r0.lifecycleOwner = r1
            if (r2 == 0) goto Lc
            r0.cameraId = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null cameraId"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null lifecycleOwner"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.lifecycle.LifecycleCameraRepository.Key
            r2 = 0
            if (r1 == 0) goto L24
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r5 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r5
            androidx.lifecycle.LifecycleOwner r1 = r4.lifecycleOwner
            androidx.lifecycle.LifecycleOwner r3 = r5.getLifecycleOwner()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r1 = r4.cameraId
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r5 = r5.getCameraId()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            return r0
        L24:
            return r2
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    @androidx.annotation.NonNull
    public androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId() {
            r1 = this;
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r0 = r1.cameraId
            return r0
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    @androidx.annotation.NonNull
    public androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
            r1 = this;
            androidx.lifecycle.LifecycleOwner r0 = r1.lifecycleOwner
            return r0
    }

    public int hashCode() {
            r2 = this;
            androidx.lifecycle.LifecycleOwner r0 = r2.lifecycleOwner
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r1 = r2.cameraId
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Key{lifecycleOwner="
            r0.append(r1)
            androidx.lifecycle.LifecycleOwner r1 = r2.lifecycleOwner
            r0.append(r1)
            java.lang.String r1 = ", cameraId="
            r0.append(r1)
            androidx.camera.core.internal.CameraUseCaseAdapter$CameraId r1 = r2.cameraId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
