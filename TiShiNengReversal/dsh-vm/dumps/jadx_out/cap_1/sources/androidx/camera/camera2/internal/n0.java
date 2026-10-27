package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class n0 implements androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat f93a;

    public /* synthetic */ n0(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1) {
            r0 = this;
            r0.<init>()
            r0.f93a = r1
            return
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final java.lang.Object get(android.hardware.camera2.CameraCharacteristics.Key r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r1.f93a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }
}
