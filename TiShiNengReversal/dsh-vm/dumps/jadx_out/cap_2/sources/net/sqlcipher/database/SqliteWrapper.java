package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SqliteWrapper {
    private static final java.lang.String SQLITE_EXCEPTION_DETAIL_MESSAGE = "unable to open database file";
    private static final java.lang.String TAG = "SqliteWrapper";

    private SqliteWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkSQLiteException(android.content.Context r1, net.sqlcipher.database.SQLiteException r2) {
            boolean r0 = isLowMemory(r2)
            if (r0 == 0) goto L13
            java.lang.String r2 = r2.getMessage()
            r0 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
            return
        L13:
            throw r2
    }

    public static int delete(android.content.Context r0, android.content.ContentResolver r1, android.net.Uri r2, java.lang.String r3, java.lang.String[] r4) {
            int r0 = r1.delete(r2, r3, r4)     // Catch: net.sqlcipher.database.SQLiteException -> L5
            return r0
        L5:
            r1 = move-exception
            checkSQLiteException(r0, r1)
            r0 = -1
            return r0
    }

    public static android.net.Uri insert(android.content.Context r0, android.content.ContentResolver r1, android.net.Uri r2, android.content.ContentValues r3) {
            android.net.Uri r0 = r1.insert(r2, r3)     // Catch: net.sqlcipher.database.SQLiteException -> L5
            return r0
        L5:
            r1 = move-exception
            checkSQLiteException(r0, r1)
            r0 = 0
            return r0
    }

    private static boolean isLowMemory(net.sqlcipher.database.SQLiteException r1) {
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "unable to open database file"
            boolean r1 = r1.equals(r0)
            return r1
    }

    public static net.sqlcipher.Cursor query(android.content.Context r1, android.content.ContentResolver r2, android.net.Uri r3, java.lang.String[] r4, java.lang.String r5, java.lang.String[] r6, java.lang.String r7) {
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: net.sqlcipher.database.SQLiteException -> L7
            net.sqlcipher.Cursor r2 = (net.sqlcipher.Cursor) r2     // Catch: net.sqlcipher.database.SQLiteException -> L7
            return r2
        L7:
            r0 = move-exception
            r2 = r0
            checkSQLiteException(r1, r2)
            r1 = 0
            return r1
    }

    public static boolean requery(android.content.Context r0, android.database.Cursor r1) {
            boolean r0 = r1.requery()     // Catch: net.sqlcipher.database.SQLiteException -> L5
            return r0
        L5:
            r1 = move-exception
            checkSQLiteException(r0, r1)
            r0 = 0
            return r0
    }

    public static int update(android.content.Context r0, android.content.ContentResolver r1, android.net.Uri r2, android.content.ContentValues r3, java.lang.String r4, java.lang.String[] r5) {
            int r0 = r1.update(r2, r3, r4, r5)     // Catch: net.sqlcipher.database.SQLiteException -> L5
            return r0
        L5:
            r1 = move-exception
            checkSQLiteException(r0, r1)
            r0 = -1
            return r0
    }
}
