package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class SingleCloseImageProxy extends androidx.camera.core.ForwardingImageProxy {
    private final java.util.concurrent.atomic.AtomicBoolean mClosed;

    SingleCloseImageProxy(androidx.camera.core.ImageProxy r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.mClosed = r2
            return
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mClosed
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto Lc
            super.close()
        Lc:
            return
    }
}
