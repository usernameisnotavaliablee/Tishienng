package com.bytedance.pangle.servermanager;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class AbsServerManager extends android.content.ContentProvider {
    static final java.lang.String BUNDLE_BINDER = "binder";
    static final java.lang.String METHOD_QUERY_BINDER = "query_binder";
    static final java.lang.String PACKAGE_QUERY_BINDER = "package";
    static final java.lang.String SERVICE_QUERY_BINDER = "service";

    public AbsServerManager() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            java.lang.String r3 = "query_binder"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L1e
            android.os.IBinder r1 = r0.onBind(r2)
            if (r1 == 0) goto L1e
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.bytedance.pangle.servermanager.j r3 = new com.bytedance.pangle.servermanager.j
            r3.<init>(r1)
            java.lang.String r1 = "binder"
            r2.putParcelable(r1, r3)
            return r2
        L1e:
            r1 = 0
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

    protected android.os.IBinder onBind(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "package"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "service"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L15
            r2 = 0
            return r2
        L15:
            com.bytedance.pangle.service.j.j r2 = com.bytedance.pangle.service.j.j.xt()
            return r2
        L1a:
            com.bytedance.pangle.ae.j r2 = com.bytedance.pangle.ae.j.xt()
            return r2
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
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
