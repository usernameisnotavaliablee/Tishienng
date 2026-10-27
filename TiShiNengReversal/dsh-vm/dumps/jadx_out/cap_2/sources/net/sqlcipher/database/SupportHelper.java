package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SupportHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper {
    private final boolean clearPassphrase;
    private byte[] passphrase;
    private net.sqlcipher.database.SQLiteOpenHelper standardHelper;


    SupportHelper(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r10, byte[] r11, net.sqlcipher.database.SQLiteDatabaseHook r12, boolean r13) {
            r9 = this;
            r9.<init>()
            android.content.Context r0 = r10.context
            net.sqlcipher.database.SQLiteDatabase.loadLibs(r0)
            r9.passphrase = r11
            r9.clearPassphrase = r13
            net.sqlcipher.database.SupportHelper$1 r1 = new net.sqlcipher.database.SupportHelper$1
            android.content.Context r3 = r10.context
            java.lang.String r4 = r10.name
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r11 = r10.callback
            int r6 = r11.version
            r5 = 0
            r2 = r9
            r8 = r10
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r2.standardHelper = r1
            return
    }

    public void close() {
            r1 = this;
            net.sqlcipher.database.SQLiteOpenHelper r0 = r1.standardHelper
            r0.close()
            return
    }

    public java.lang.String getDatabaseName() {
            r1 = this;
            net.sqlcipher.database.SQLiteOpenHelper r0 = r1.standardHelper
            java.lang.String r0 = r0.getDatabaseName()
            return r0
    }

    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.getWritableDatabase()
            return r0
    }

    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
            r8 = this;
            r0 = 0
            net.sqlcipher.database.SQLiteOpenHelper r1 = r8.standardHelper     // Catch: net.sqlcipher.database.SQLiteException -> L1d
            byte[] r2 = r8.passphrase     // Catch: net.sqlcipher.database.SQLiteException -> L1d
            net.sqlcipher.database.SQLiteDatabase r1 = r1.getWritableDatabase(r2)     // Catch: net.sqlcipher.database.SQLiteException -> L1d
            boolean r2 = r8.clearPassphrase
            if (r2 == 0) goto L1c
            byte[] r2 = r8.passphrase
            if (r2 == 0) goto L1c
            r2 = 0
        L12:
            byte[] r3 = r8.passphrase
            int r4 = r3.length
            if (r2 >= r4) goto L1c
            r3[r2] = r0
            int r2 = r2 + 1
            goto L12
        L1c:
            return r1
        L1d:
            r1 = move-exception
            byte[] r2 = r8.passphrase
            if (r2 == 0) goto L3e
            int r3 = r2.length
            r4 = 1
            r5 = 0
            r6 = 1
        L26:
            if (r5 >= r3) goto L34
            r7 = r2[r5]
            if (r6 == 0) goto L30
            if (r7 != 0) goto L30
            r6 = 1
            goto L31
        L30:
            r6 = 0
        L31:
            int r5 = r5 + 1
            goto L26
        L34:
            if (r6 == 0) goto L3e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "The passphrase appears to be cleared. This happens by default the first time you use the factory to open a database, so we can remove the cleartext passphrase from memory. If you close the database yourself, please use a fresh SupportFactory to reopen it. If something else (e.g., Room) closed the database, and you cannot control that, use SupportFactory boolean constructor option to opt out of the automatic password clearing step. See the project README for more information."
            r0.<init>(r2, r1)
            throw r0
        L3e:
            throw r1
    }

    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            net.sqlcipher.database.SQLiteOpenHelper r0 = r1.standardHelper
            r0.setWriteAheadLoggingEnabled(r2)
            return
    }
}
