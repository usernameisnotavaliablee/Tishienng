package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PreferenceDao_Impl implements androidx.work.impl.model.PreferenceDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.Preference> __insertionAdapterOfPreference;



    public PreferenceDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.PreferenceDao_Impl$1 r0 = new androidx.work.impl.model.PreferenceDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfPreference = r0
            return
    }

    static /* synthetic */ androidx.room.RoomDatabase access$000(androidx.work.impl.model.PreferenceDao_Impl r0) {
            androidx.room.RoomDatabase r0 = r0.__db
            return r0
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public java.lang.Long getLongValue(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT long_value FROM Preference where `key`=?"
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
            boolean r3 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L35
            boolean r3 = r5.isNull(r1)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L2a
            goto L35
        L2a:
            long r1 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r1 = move-exception
            goto L3c
        L35:
            r5.close()
            r0.release()
            return r2
        L3c:
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public androidx.lifecycle.LiveData<java.lang.Long> getObservableLongValue(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "SELECT long_value FROM Preference where `key`=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r4 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r4)
        L10:
            androidx.room.RoomDatabase r4 = r3.__db
            androidx.room.InvalidationTracker r4 = r4.getInvalidationTracker()
            java.lang.String r1 = "Preference"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            androidx.work.impl.model.PreferenceDao_Impl$2 r2 = new androidx.work.impl.model.PreferenceDao_Impl$2
            r2.<init>(r3, r0)
            r0 = 0
            androidx.lifecycle.LiveData r4 = r4.createLiveData(r1, r0, r2)
            return r4
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public void insertPreference(androidx.work.impl.model.Preference r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.Preference> r0 = r1.__insertionAdapterOfPreference     // Catch: java.lang.Throwable -> L1a
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
