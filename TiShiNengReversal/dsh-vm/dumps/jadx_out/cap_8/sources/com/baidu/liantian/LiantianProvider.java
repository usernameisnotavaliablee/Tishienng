package com.baidu.liantian;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LiantianProvider extends android.content.ContentProvider {


    public LiantianProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            android.content.Context r2 = r0.getContext()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            android.os.Bundle r1 = com.baidu.liantian.core.e.a(r2, r1, r3)
            return r1
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            com.baidu.liantian.b.a()
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            com.baidu.liantian.b.a()
            java.lang.String r1 = "p"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            android.content.Context r1 = r0.getContext()     // Catch: java.lang.Throwable -> L1c
            com.baidu.liantian.b.r r2 = com.baidu.liantian.b.r.a()     // Catch: java.lang.Throwable -> L1c
            com.baidu.liantian.LiantianProvider$1 r3 = new com.baidu.liantian.LiantianProvider$1     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L1c
            r2.a(r3)     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            com.baidu.liantian.b.e.a()
        L1f:
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
