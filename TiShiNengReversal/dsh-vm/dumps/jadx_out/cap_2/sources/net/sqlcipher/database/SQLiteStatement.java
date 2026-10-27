package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteStatement extends net.sqlcipher.database.SQLiteProgram implements androidx.sqlite.db.SupportSQLiteStatement {
    SQLiteStatement(net.sqlcipher.database.SQLiteDatabase r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private final native long native_1x1_long();

    private final native java.lang.String native_1x1_string();

    private final native void native_execute();

    public void execute() {
            r3 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L29
            android.os.SystemClock.uptimeMillis()
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            r0.lock()
            r3.acquireReference()
            r3.native_execute()     // Catch: java.lang.Throwable -> L1f
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            r0.unlock()
            return
        L1f:
            r0 = move-exception
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase
            r1.unlock()
            throw r0
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "database "
            r1.append(r2)
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = " already closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public long executeInsert() {
            r3 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L3b
            android.os.SystemClock.uptimeMillis()
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            r0.lock()
            r3.acquireReference()
            r3.native_execute()     // Catch: java.lang.Throwable -> L25
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase     // Catch: java.lang.Throwable -> L25
            int r0 = r0.lastChangeCount()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L27
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase     // Catch: java.lang.Throwable -> L25
            long r0 = r0.lastInsertRow()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r0 = move-exception
            goto L32
        L27:
            r0 = -1
        L29:
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            r2.unlock()
            return r0
        L32:
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase
            r1.unlock()
            throw r0
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "database "
            r1.append(r2)
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = " already closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int executeUpdateDelete() {
            r3 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L2f
            android.os.SystemClock.uptimeMillis()
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            r0.lock()
            r3.acquireReference()
            r3.native_execute()     // Catch: java.lang.Throwable -> L25
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase     // Catch: java.lang.Throwable -> L25
            int r0 = r0.lastChangeCount()     // Catch: java.lang.Throwable -> L25
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase
            r1.unlock()
            return r0
        L25:
            r0 = move-exception
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase
            r1.unlock()
            throw r0
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "database "
            r1.append(r2)
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = " already closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public long simpleQueryForLong() {
            r3 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L2a
            android.os.SystemClock.uptimeMillis()
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            r0.lock()
            r3.acquireReference()
            long r0 = r3.native_1x1_long()     // Catch: java.lang.Throwable -> L20
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            r2.unlock()
            return r0
        L20:
            r0 = move-exception
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase
            r1.unlock()
            throw r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "database "
            r1.append(r2)
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = " already closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String simpleQueryForString() {
            r3 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L2a
            android.os.SystemClock.uptimeMillis()
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            r0.lock()
            r3.acquireReference()
            java.lang.String r0 = r3.native_1x1_string()     // Catch: java.lang.Throwable -> L20
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase
            r1.unlock()
            return r0
        L20:
            r0 = move-exception
            r3.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase
            r1.unlock()
            throw r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "database "
            r1.append(r2)
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = " already closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
