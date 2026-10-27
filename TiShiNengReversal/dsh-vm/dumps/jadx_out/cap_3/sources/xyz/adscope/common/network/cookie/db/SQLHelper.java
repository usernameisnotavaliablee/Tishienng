package xyz.adscope.common.network.cookie.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class SQLHelper extends android.database.sqlite.SQLiteOpenHelper implements xyz.adscope.common.network.cookie.db.Field {
    SQLHelper(android.content.Context r4) {
            r3 = this;
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r0 = 0
            r1 = 3
            java.lang.String r2 = "_kalle_cookies_db.db"
            r3.<init>(r4, r2, r0, r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            r2.beginTransaction()
            java.lang.String r0 = "CREATE TABLE COOKIES_TABLE(_ID INTEGER PRIMARY KEY AUTOINCREMENT, URL TEXT, NAME TEXT, VALUE TEXT, COMMENT TEXT, COMMENT_URL TEXT, DISCARD TEXT, DOMAIN TEXT, EXPIRY INTEGER, PATH TEXT, PORT_LIST TEXT, SECURE TEXT, VERSION INTEGER)"
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "CREATE UNIQUE INDEX COOKIE_UNIQUE_INDEX ON COOKIES_TABLE(\"NAME\", \"DOMAIN\", \"PATH\")"
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L14
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L14
            r2.endTransaction()
            return
        L14:
            r0 = move-exception
            r2.endTransaction()
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            if (r3 == r2) goto L20
            r1.beginTransaction()
            java.lang.String r2 = "DROP TABLE IF EXISTS COOKIES_TABLE"
            r1.execSQL(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "CREATE TABLE COOKIES_TABLE(_ID INTEGER PRIMARY KEY AUTOINCREMENT, URL TEXT, NAME TEXT, VALUE TEXT, COMMENT TEXT, COMMENT_URL TEXT, DISCARD TEXT, DOMAIN TEXT, EXPIRY INTEGER, PATH TEXT, PORT_LIST TEXT, SECURE TEXT, VERSION INTEGER)"
            r1.execSQL(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "CREATE UNIQUE INDEX COOKIE_UNIQUE_INDEX ON COOKIES_TABLE(\"NAME\", \"DOMAIN\", \"PATH\")"
            r1.execSQL(r2)     // Catch: java.lang.Throwable -> L1b
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1b
            r1.endTransaction()
            return
        L1b:
            r2 = move-exception
            r1.endTransaction()
            throw r2
        L20:
            return
    }
}
