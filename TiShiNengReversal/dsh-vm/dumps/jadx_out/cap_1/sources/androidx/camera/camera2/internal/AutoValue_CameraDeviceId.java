package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_CameraDeviceId extends androidx.camera.camera2.internal.CameraDeviceId {
    private final java.lang.String brand;
    private final java.lang.String cameraId;
    private final java.lang.String device;
    private final java.lang.String model;

    AutoValue_CameraDeviceId(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L2c
            r0.brand = r1
            if (r2 == 0) goto L24
            r0.device = r2
            if (r3 == 0) goto L1c
            r0.model = r3
            if (r4 == 0) goto L14
            r0.cameraId = r4
            return
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null cameraId"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null model"
            r1.<init>(r2)
            throw r1
        L24:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null device"
            r1.<init>(r2)
            throw r1
        L2c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null brand"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.camera2.internal.CameraDeviceId
            r2 = 0
            if (r1 == 0) goto L3c
            androidx.camera.camera2.internal.CameraDeviceId r5 = (androidx.camera.camera2.internal.CameraDeviceId) r5
            java.lang.String r1 = r4.brand
            java.lang.String r3 = r5.getBrand()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.device
            java.lang.String r3 = r5.getDevice()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.getModel()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.cameraId
            java.lang.String r5 = r5.getCameraId()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3c
            return r0
        L3c:
            return r2
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @androidx.annotation.NonNull
    public java.lang.String getBrand() {
            r1 = this;
            java.lang.String r0 = r1.brand
            return r0
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @androidx.annotation.NonNull
    public java.lang.String getCameraId() {
            r1 = this;
            java.lang.String r0 = r1.cameraId
            return r0
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @androidx.annotation.NonNull
    public java.lang.String getDevice() {
            r1 = this;
            java.lang.String r0 = r1.device
            return r0
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @androidx.annotation.NonNull
    public java.lang.String getModel() {
            r1 = this;
            java.lang.String r0 = r1.model
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.brand
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.device
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.model
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r3.cameraId
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CameraDeviceId{brand="
            r0.append(r1)
            java.lang.String r1 = r2.brand
            r0.append(r1)
            java.lang.String r1 = ", device="
            r0.append(r1)
            java.lang.String r1 = r2.device
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r2.model
            r0.append(r1)
            java.lang.String r1 = ", cameraId="
            r0.append(r1)
            java.lang.String r1 = r2.cameraId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
