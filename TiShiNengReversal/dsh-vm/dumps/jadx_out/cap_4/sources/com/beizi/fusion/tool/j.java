package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j extends android.os.Handler {
    private java.lang.ref.WeakReference<android.content.Context> a;

    public j(android.content.Context r2) {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public android.content.Context a() {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            return r0
    }

    public abstract void a(android.os.Message r1);

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r2) {
            r1 = this;
            super.handleMessage(r2)
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.a
            if (r0 != 0) goto L8
            goto Le
        L8:
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            r1.a(r2)
            return
    }
}
