package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class e3 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.SafeCloseImageReaderProxy f63a;

    public /* synthetic */ e3(androidx.camera.core.SafeCloseImageReaderProxy r1) {
            r0 = this;
            r0.<init>()
            r0.f63a = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r1.f63a
            r0.safeClose()
            return
    }
}
