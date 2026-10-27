package c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final /* synthetic */ class a implements androidx.camera.core.CameraFilter {
    public final /* synthetic */ java.lang.String a;

    public /* synthetic */ a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.util.List filter(java.util.List r2) {
            r1 = this;
            java.lang.String r0 = r1.a
            java.util.List r2 = androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator.a(r0, r2)
            return r2
    }

    public /* synthetic */ androidx.camera.core.impl.Identifier getIdentifier() {
            r1 = this;
            androidx.camera.core.impl.Identifier r0 = androidx.camera.core.e.a(r1)
            return r0
    }
}
