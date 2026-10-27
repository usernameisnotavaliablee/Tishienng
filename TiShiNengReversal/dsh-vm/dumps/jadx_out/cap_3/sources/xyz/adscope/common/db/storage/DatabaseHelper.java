package xyz.adscope.common.db.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DatabaseHelper extends android.database.sqlite.SQLiteOpenHelper {
    private static xyz.adscope.common.db.storage.DatabaseHelper a;

    private DatabaseHelper(@androidx.annotation.Nullable android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "common_base.db"
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public static xyz.adscope.common.db.storage.DatabaseHelper getInstance(android.content.Context r2) {
            xyz.adscope.common.db.storage.DatabaseHelper r0 = xyz.adscope.common.db.storage.DatabaseHelper.a
            if (r0 != 0) goto L21
            java.lang.Class<xyz.adscope.common.db.storage.DatabaseHelper> r0 = xyz.adscope.common.db.storage.DatabaseHelper.class
            monitor-enter(r0)
            xyz.adscope.common.db.storage.DatabaseHelper r1 = xyz.adscope.common.db.storage.DatabaseHelper.a     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            xyz.adscope.common.db.storage.DatabaseHelper r1 = new xyz.adscope.common.db.storage.DatabaseHelper     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.db.storage.DatabaseHelper.a = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
        L21:
            xyz.adscope.common.db.storage.DatabaseHelper r2 = xyz.adscope.common.db.storage.DatabaseHelper.a
            return r2
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}
