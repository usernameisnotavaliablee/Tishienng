package com.google.android.gms.internal.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zau extends android.os.Handler {
    private final android.os.Looper zaa;

    public zau() {
            r1 = this;
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.zaa = r0
            return
    }

    public zau(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.zaa = r1
            return
    }

    public zau(android.os.Looper r1, android.os.Handler.Callback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.zaa = r1
            return
    }
}
