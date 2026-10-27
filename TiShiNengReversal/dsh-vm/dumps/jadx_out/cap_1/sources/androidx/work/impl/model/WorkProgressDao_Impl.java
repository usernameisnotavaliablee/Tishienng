package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class WorkProgressDao_Impl implements androidx.work.impl.model.WorkProgressDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkProgress> __insertionAdapterOfWorkProgress;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;




    public WorkProgressDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.WorkProgressDao_Impl$1 r0 = new androidx.work.impl.model.WorkProgressDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfWorkProgress = r0
            androidx.work.impl.model.WorkProgressDao_Impl$2 r0 = new androidx.work.impl.model.WorkProgressDao_Impl$2
            r0.<init>(r1, r2)
            r1.__preparedStmtOfDelete = r0
            androidx.work.impl.model.WorkProgressDao_Impl$3 r0 = new androidx.work.impl.model.WorkProgressDao_Impl$3
            r0.<init>(r1, r2)
            r1.__preparedStmtOfDeleteAll = r0
            return
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfDelete
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L2d
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfDelete
            r3.release(r0)
            return
        L2d:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfDelete
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r3.__preparedStmtOfDeleteAll
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            androidx.room.RoomDatabase r1 = r3.__db
            r1.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L23
            androidx.room.RoomDatabase r1 = r3.__db     // Catch: java.lang.Throwable -> L23
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23
            androidx.room.RoomDatabase r1 = r3.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r3.__preparedStmtOfDeleteAll
            r1.release(r0)
            return
        L23:
            r1 = move-exception
            androidx.room.RoomDatabase r2 = r3.__db
            r2.endTransaction()
            androidx.room.SharedSQLiteStatement r2 = r3.__preparedStmtOfDeleteAll
            r2.release(r0)
            throw r1
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public androidx.work.Data getProgressForWorkSpecId(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT progress FROM WorkProgress WHERE work_spec_id=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r1, r2)
            boolean r3 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2e
            byte[] r1 = r5.getBlob(r1)     // Catch: java.lang.Throwable -> L2c
            androidx.work.Data r2 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r1 = move-exception
            goto L35
        L2e:
            r5.close()
            r0.release()
            return r2
        L35:
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public java.util.List<androidx.work.Data> getProgressForWorkSpecIds(java.util.List<java.lang.String> r5) {
            r4 = this;
            java.lang.StringBuilder r0 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r1 = "SELECT progress FROM WorkProgress WHERE work_spec_id IN ("
            r0.append(r1)
            int r1 = r5.size()
            androidx.room.util.StringUtil.appendPlaceholders(r0, r1)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            java.util.Iterator r5 = r5.iterator()
            r1 = 1
        L22:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L34
            r0.bindNull(r1)
            goto L37
        L34:
            r0.bindString(r1, r2)
        L37:
            int r1 = r1 + 1
            goto L22
        L3a:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L62
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L62
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L62
        L50:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L64
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L62
            androidx.work.Data r3 = androidx.work.Data.fromByteArray(r3)     // Catch: java.lang.Throwable -> L62
            r1.add(r3)     // Catch: java.lang.Throwable -> L62
            goto L50
        L62:
            r1 = move-exception
            goto L6b
        L64:
            r5.close()
            r0.release()
            return r1
        L6b:
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(androidx.work.impl.model.WorkProgress r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkProgress> r0 = r1.__insertionAdapterOfWorkProgress     // Catch: java.lang.Throwable -> L1a
            r0.insert(r2)     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db     // Catch: java.lang.Throwable -> L1a
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db
            r2.endTransaction()
            return
        L1a:
            r2 = move-exception
            androidx.room.RoomDatabase r0 = r1.__db
            r0.endTransaction()
            throw r2
    }
}
