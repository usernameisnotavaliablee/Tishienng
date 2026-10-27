package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a implements java.lang.Runnable {
    public final /* synthetic */ android.content.Context a;

    public a(android.content.Context r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: java.lang.Throwable -> L25
            android.content.Context r1 = com.uyumao.j.a     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L12
            if (r0 == 0) goto L12
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L25
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L25
            com.uyumao.j.a = r0     // Catch: java.lang.Throwable -> L25
        L12:
            com.uyumao.j r0 = com.uyumao.j.a.a     // Catch: java.lang.Throwable -> L25
            com.uyumao.i r0 = r0.a()     // Catch: java.lang.Throwable -> L25
            android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L25
            r2 = 0
            org.json.JSONObject r0 = com.uyumao.c.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L25
            android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L25
            r2 = 0
            com.uyumao.c.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L25
        L25:
            return
    }
}
