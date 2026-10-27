package com.huawei.hms.mlsdk.common.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MLInitializerProvider extends android.content.ContentProvider {
    private static final java.lang.String TAG = "MLInitializerProvider";

    static {
            return
    }

    public MLInitializerProvider() {
            r0 = this;
            r0.<init>()
            return
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
            r4 = this;
            com.huawei.hms.ml.common.utils.ActivityMgr r0 = com.huawei.hms.ml.common.utils.ActivityMgr.INST     // Catch: java.lang.Throwable -> L1b
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L1b
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Throwable -> L1b
            r0.init(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = com.huawei.hms.mlsdk.common.provider.MLInitializerProvider.TAG     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "MLInitializerProvider Done"
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r1)     // Catch: java.lang.Throwable -> L1b
            goto L32
        L1b:
            r0 = move-exception
            java.lang.String r1 = com.huawei.hms.mlsdk.common.provider.MLInitializerProvider.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "MLInitializerProvider e: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.hms.ml.common.utils.SmartLog.e(r1, r0)
        L32:
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
