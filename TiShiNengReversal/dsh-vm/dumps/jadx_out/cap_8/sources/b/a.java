package b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final /* synthetic */ class a implements androidx.camera.core.impl.CameraFactory.Provider {
    public /* synthetic */ a() {
            r0 = this;
            r0.<init>()
            return
    }

    public final androidx.camera.core.impl.CameraFactory newInstance(android.content.Context r2, androidx.camera.core.impl.CameraThreadConfig r3, androidx.camera.core.CameraSelector r4) {
            r1 = this;
            androidx.camera.camera2.internal.Camera2CameraFactory r0 = new androidx.camera.camera2.internal.Camera2CameraFactory
            r0.<init>(r2, r3, r4)
            return r0
    }
}
