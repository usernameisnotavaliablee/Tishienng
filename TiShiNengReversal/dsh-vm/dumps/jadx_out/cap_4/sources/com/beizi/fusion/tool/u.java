package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class u {
    private static final android.os.Handler a = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.beizi.fusion.tool.u.a = r0
            return
    }

    public u() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.lang.Runnable r1, long r2) {
            android.os.Handler r0 = com.beizi.fusion.tool.u.a
            r0.postDelayed(r1, r2)
            return
    }
}
