package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class z3 implements java.lang.Runnable {
    com.amap.api.col.s.z3.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        void a(com.amap.api.col.s.z3 r1);
    }

    public z3() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L7
            goto L1b
        L7:
            r3.a()     // Catch: java.lang.Throwable -> L19
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L11
            goto L1b
        L11:
            com.amap.api.col.s.z3$a r0 = r3.a     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            r0.a(r3)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r0 = move-exception
            goto L1c
        L1b:
            return
        L1c:
            java.lang.String r1 = "ThreadTask"
            java.lang.String r2 = "run"
            com.amap.api.col.s.g2.o(r0, r1, r2)
            return
    }
}
