package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class SQLiteClosable {
    private java.lang.Object mLock;
    private int mReferenceCount;

    public SQLiteClosable() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mReferenceCount = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            return
    }

    private java.lang.String getObjInfo() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            boolean r1 = r2 instanceof net.sqlcipher.database.SQLiteDatabase
            if (r1 == 0) goto L29
            java.lang.String r1 = "database = "
            r0.append(r1)
            r1 = r2
            net.sqlcipher.database.SQLiteDatabase r1 = (net.sqlcipher.database.SQLiteDatabase) r1
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            goto L42
        L29:
            boolean r1 = r2 instanceof net.sqlcipher.database.SQLiteProgram
            if (r1 != 0) goto L35
            boolean r1 = r2 instanceof net.sqlcipher.database.SQLiteStatement
            if (r1 != 0) goto L35
            boolean r1 = r2 instanceof net.sqlcipher.database.SQLiteQuery
            if (r1 == 0) goto L42
        L35:
            java.lang.String r1 = "mSql = "
            r0.append(r1)
            r1 = r2
            net.sqlcipher.database.SQLiteProgram r1 = (net.sqlcipher.database.SQLiteProgram) r1
            java.lang.String r1 = r1.mSql
            r0.append(r1)
        L42:
            java.lang.String r1 = ") "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void acquireReference() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            int r1 = r4.mReferenceCount     // Catch: java.lang.Throwable -> Ld
            if (r1 <= 0) goto Lf
            int r1 = r1 + 1
            r4.mReferenceCount = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L2a
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r2.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "attempt to re-open an already-closed object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = r4.getObjInfo()     // Catch: java.lang.Throwable -> Ld
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            throw r1     // Catch: java.lang.Throwable -> Ld
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    protected abstract void onAllReferencesReleased();

    protected void onAllReferencesReleasedFromContainer() {
            r0 = this;
            return
    }

    public void releaseReference() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mReferenceCount     // Catch: java.lang.Throwable -> Lf
            int r1 = r1 + (-1)
            r2.mReferenceCount = r1     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            r2.onAllReferencesReleased()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public void releaseReferenceFromContainer() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mReferenceCount     // Catch: java.lang.Throwable -> Lf
            int r1 = r1 + (-1)
            r2.mReferenceCount = r1     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            r2.onAllReferencesReleasedFromContainer()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }
}
