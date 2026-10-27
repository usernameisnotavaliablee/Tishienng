package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class p {
    public static /* synthetic */ boolean a(java.util.concurrent.atomic.AtomicReference r1, java.lang.Object r2, java.lang.Object r3) {
        L0:
            boolean r0 = r1.compareAndSet(r2, r3)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Object r0 = r1.get()
            if (r0 == r2) goto L0
            r1 = 0
            return r1
    }
}
