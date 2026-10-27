package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DataProvider extends android.content.ContentProvider {
    private static final java.lang.String TAG = "DataProvider";

    public DataProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            java.lang.String r0 = "DataProvider"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "method:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            r1.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = ", arg="
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            r1.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L2b
            cn.jiguang.internal.JCoreInternalHelper r1 = cn.jiguang.internal.JCoreInternalHelper.getInstance()     // Catch: java.lang.Throwable -> L2b
            android.content.Context r2 = r3.getContext()     // Catch: java.lang.Throwable -> L2b
            android.os.Bundle r4 = r1.directHandle(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L2b
            return r4
        L2b:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "call e:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.w.f.i(r0, r4)
            r4 = 0
            return r4
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
            r2 = this;
            java.lang.String r0 = "DataProvider"
            java.lang.String r1 = "onCreate"
            cn.jiguang.w.f.c(r0, r1)
            android.content.Context r0 = r2.getContext()
            cn.jiguang.api.JCoreManager.setStartId(r0)
            r0 = 1
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
