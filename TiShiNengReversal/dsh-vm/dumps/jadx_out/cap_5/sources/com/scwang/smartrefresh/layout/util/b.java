package com.scwang.smartrefresh.layout.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements java.lang.Runnable {
    public long a;
    public java.lang.Runnable b;

    public b(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public b(java.lang.Runnable r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            java.lang.Runnable r0 = r1.b     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.run()     // Catch: java.lang.Throwable -> La
            r0 = 0
            r1.b = r0     // Catch: java.lang.Throwable -> La
        La:
            return
    }
}
