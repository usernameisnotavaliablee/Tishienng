package com.bytedance.adsdk.ugeno.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g extends android.os.Handler {
    private final java.lang.ref.WeakReference<com.bytedance.adsdk.ugeno.m.g.j> j;

    public interface j {
        void j(android.os.Message r1);
    }

    public g(android.os.Looper r1, com.bytedance.adsdk.ugeno.m.g.j r2) {
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
            java.lang.ref.WeakReference<com.bytedance.adsdk.ugeno.m.g$j> r0 = r1.j
            java.lang.Object r0 = r0.get()
            com.bytedance.adsdk.ugeno.m.g$j r0 = (com.bytedance.adsdk.ugeno.m.g.j) r0
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            r0.j(r2)
        Lf:
            return
    }
}
