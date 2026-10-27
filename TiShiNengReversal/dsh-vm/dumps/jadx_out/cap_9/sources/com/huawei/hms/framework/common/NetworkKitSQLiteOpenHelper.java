package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class NetworkKitSQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    private static final java.lang.String a = "PLSQLiteOpenHelper";
    private static final java.lang.String b = "networkkit_dynamic.db";
    private static final java.lang.String c = "networkkit.db";
    private static final java.lang.String d = "-journal";
    private static java.lang.String e = "networkkit.db";
    private static volatile com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper f;

    static {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getKitContext()
            if (r0 == 0) goto La
            java.lang.String r0 = "networkkit_dynamic.db"
            com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e = r0
        La:
            return
    }

    private NetworkKitSQLiteOpenHelper(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public static com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper getInstance() {
            com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper r0 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.f
            if (r0 != 0) goto L2e
            java.lang.Class<com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper> r0 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.class
            monitor-enter(r0)
            com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper r1 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.f     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L2a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16
            r2 = 24
            if (r1 >= r2) goto L18
            android.content.Context r1 = com.huawei.hms.framework.common.ContextHolder.getAppContext()     // Catch: java.lang.Throwable -> L16
            goto L20
        L16:
            r1 = move-exception
            goto L2c
        L18:
            android.content.Context r1 = com.huawei.hms.framework.common.ContextHolder.getAppContext()     // Catch: java.lang.Throwable -> L16
            android.content.Context r1 = androidx.profileinstaller.a.a(r1)     // Catch: java.lang.Throwable -> L16
        L20:
            com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper r2 = new com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e     // Catch: java.lang.Throwable -> L16
            r4 = 1
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L16
            com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.f = r2     // Catch: java.lang.Throwable -> L16
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
        L2e:
            com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper r0 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.f
            return r0
    }

    public boolean deleteDbFile() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.getNetworkKitReadableDatabase()
            java.lang.String r0 = r0.getPath()
            boolean r0 = r1.deleteDbFileByPath(r0)
            return r0
    }

    public boolean deleteDbFileByPath(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L10
            boolean r2 = r0.delete()
            return r2
        L10:
            java.lang.String r2 = "PLSQLiteOpenHelper"
            java.lang.String r0 = "db is not exists"
            com.huawei.hms.framework.common.Logger.i(r2, r0)
            r2 = 0
            return r2
    }

    public boolean deleteUnusedDbFile() {
            r3 = this;
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e
            java.lang.String r1 = "networkkit_dynamic.db"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            java.lang.String r1 = "networkkit.db"
        Lc:
            android.database.sqlite.SQLiteDatabase r0 = r3.getNetworkKitReadableDatabase()
            java.lang.String r0 = r0.getPath()
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e
            java.lang.String r0 = r0.replace(r2, r1)
            boolean r0 = r3.deleteDbFileByPath(r0)
            return r0
    }

    public android.database.sqlite.SQLiteDatabase getDbByName(java.lang.String r4) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.getNetworkKitReadableDatabase()
            if (r0 == 0) goto L29
            java.lang.String r1 = r0.getPath()
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e
            java.lang.String r4 = r1.replace(r2, r4)
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L22
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r4 = android.database.sqlite.SQLiteDatabase.openDatabase(r4, r0, r1)
            return r4
        L22:
            java.lang.String r4 = "PLSQLiteOpenHelper"
            java.lang.String r1 = "old db is not exists"
            com.huawei.hms.framework.common.Logger.i(r4, r1)
        L29:
            return r0
    }

    public java.lang.String getDbName() {
            r1 = this;
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e
            return r0
    }

    public java.lang.String getDbNameSuffix() {
            r1 = this;
            java.lang.String r0 = "-journal"
            return r0
    }

    public android.database.sqlite.SQLiteDatabase getNetworkKitReadableDatabase() {
            r4 = this;
            java.lang.String r0 = "PLSQLiteOpenHelper"
            android.database.sqlite.SQLiteDatabase r1 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L7
            goto L21
        L7:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getReadableDatabase db error:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.huawei.hms.framework.common.Logger.e(r0, r1)
            r1 = 0
        L21:
            if (r1 != 0) goto L28
            java.lang.String r2 = "getReadableDatabase db is null"
            com.huawei.hms.framework.common.Logger.e(r0, r2)
        L28:
            return r1
    }

    public android.database.sqlite.SQLiteDatabase getNetworkKitWritableDatabase() {
            r4 = this;
            java.lang.String r0 = "PLSQLiteOpenHelper"
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L7
            goto L21
        L7:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getWritableDatabase db error:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.huawei.hms.framework.common.Logger.e(r0, r1)
            r1 = 0
        L21:
            if (r1 != 0) goto L28
            java.lang.String r2 = "getWritableDatabase db is null"
            com.huawei.hms.framework.common.Logger.e(r0, r2)
        L28:
            return r1
    }

    public android.database.sqlite.SQLiteDatabase getNetworkkitUnusedDbDB() {
            r2 = this;
            java.lang.String r0 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e
            java.lang.String r1 = "networkkit_dynamic.db"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            java.lang.String r1 = "networkkit.db"
        Lc:
            android.database.sqlite.SQLiteDatabase r0 = r2.getDbByName(r1)
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }

    public boolean tabbleIsExistInDB(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L4
            goto L35
        L4:
            android.database.sqlite.SQLiteDatabase r1 = r4.getNetworkKitReadableDatabase()
            if (r1 == 0) goto L35
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = com.huawei.hms.framework.common.NetworkKitSQLiteOpenHelper.e     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r2.replace(r3, r5)     // Catch: java.lang.Throwable -> L32
            r2 = 0
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r5, r2, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "select count(1) from "
            r5.append(r3)     // Catch: java.lang.Throwable -> L32
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r1.rawQuery(r5, r2)     // Catch: java.lang.Throwable -> L32
            com.huawei.hms.framework.common.IoUtils.closeSecure(r1)
            r5 = 1
            return r5
        L32:
            com.huawei.hms.framework.common.IoUtils.closeSecure(r1)
        L35:
            return r0
    }
}
