package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class c8 implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    com.amap.api.col.3l.c8.a f3102f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        void a(com.amap.api.col.p0003l.c8 r1);

        void b(com.amap.api.col.p0003l.c8 r1);
    }

    public c8() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void cancelTask() {
            r3 = this;
            com.amap.api.col.3l.c8$a r0 = r3.f3102f     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.a(r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            java.lang.String r1 = "ThreadTask"
            java.lang.String r2 = "cancelTask"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L7
            goto L1b
        L7:
            r3.runTask()     // Catch: java.lang.Throwable -> L19
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L11
            goto L1b
        L11:
            com.amap.api.col.3l.c8$a r0 = r3.f3102f     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            r0.b(r3)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r0 = move-exception
            goto L1c
        L1b:
            return
        L1c:
            java.lang.String r1 = "ThreadTask"
            java.lang.String r2 = "run"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public abstract void runTask();
}
