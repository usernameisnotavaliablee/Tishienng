package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p implements java.lang.Runnable {
    private java.lang.ref.WeakReference<java.lang.Runnable> weakReference;

    public p(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.weakReference = r0
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            java.lang.ref.WeakReference<java.lang.Runnable> r0 = r1.weakReference
            java.lang.Object r0 = r0.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto Ld
            r0.run()
        Ld:
            return
    }
}
