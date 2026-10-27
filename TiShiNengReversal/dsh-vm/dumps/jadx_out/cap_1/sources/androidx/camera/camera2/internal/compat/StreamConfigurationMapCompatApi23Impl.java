package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class StreamConfigurationMapCompatApi23Impl extends androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl {
    StreamConfigurationMapCompatApi23Impl(@androidx.annotation.NonNull android.hardware.camera2.params.StreamConfigurationMap r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @androidx.annotation.Nullable
    public android.util.Size[] getOutputSizes(int r2) {
            r1 = this;
            android.hardware.camera2.params.StreamConfigurationMap r0 = r1.mStreamConfigurationMap
            android.util.Size[] r2 = r0.getOutputSizes(r2)
            return r2
    }
}
