package com.bytedance.msdk.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tl extends android.os.Handler {
    private final java.lang.ref.WeakReference<com.bytedance.msdk.j.up.tl.j> j;

    public interface j {
        void j(android.os.Message r1);
    }

    public tl(android.os.Looper r1, com.bytedance.msdk.j.up.tl.j r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.j = r1
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.bytedance.msdk.j.up.tl$j> r0 = r1.j
            java.lang.Object r0 = r0.get()
            com.bytedance.msdk.j.up.tl$j r0 = (com.bytedance.msdk.j.up.tl.j) r0
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            r0.j(r2)
        Lf:
            return
    }
}
