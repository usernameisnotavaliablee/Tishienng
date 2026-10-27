package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
abstract class CameraDeviceId {
    CameraDeviceId() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.CameraDeviceId create(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            androidx.camera.camera2.internal.AutoValue_CameraDeviceId r0 = new androidx.camera.camera2.internal.AutoValue_CameraDeviceId
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = r4.toLowerCase()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @androidx.annotation.NonNull
    public abstract java.lang.String getBrand();

    @androidx.annotation.NonNull
    public abstract java.lang.String getCameraId();

    @androidx.annotation.NonNull
    public abstract java.lang.String getDevice();

    @androidx.annotation.NonNull
    public abstract java.lang.String getModel();
}
