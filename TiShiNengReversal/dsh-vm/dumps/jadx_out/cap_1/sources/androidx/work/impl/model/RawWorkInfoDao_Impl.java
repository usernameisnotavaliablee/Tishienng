package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RawWorkInfoDao_Impl implements androidx.work.impl.model.RawWorkInfoDao {
    private final androidx.room.RoomDatabase __db;


    public RawWorkInfoDao_Impl(androidx.room.RoomDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.__db = r1
            return
    }

    private void __fetchRelationshipWorkProgressAsandroidxWorkData(androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> r9) {
            r8 = this;
            java.util.Set r0 = r9.keySet()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L44
        Lb:
            int r1 = r9.size()
            r2 = 999(0x3e7, float:1.4E-42)
            r3 = 0
            if (r1 <= r2) goto L45
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            int r1 = r9.size()
            r4 = 0
        L1e:
            r5 = 0
        L1f:
            if (r4 >= r1) goto L3f
            java.lang.Object r6 = r9.keyAt(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.valueAt(r4)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r2) goto L1f
            r8.__fetchRelationshipWorkProgressAsandroidxWorkData(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            goto L1e
        L3f:
            if (r5 <= 0) goto L44
            r8.__fetchRelationshipWorkProgressAsandroidxWorkData(r0)
        L44:
            return
        L45:
            java.lang.StringBuilder r1 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r2 = "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("
            r1.append(r2)
            int r2 = r0.size()
            androidx.room.util.StringUtil.appendPlaceholders(r1, r2)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.room.RoomSQLiteQuery r1 = androidx.room.RoomSQLiteQuery.acquire(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L67:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L79
            r1.bindNull(r2)
            goto L7c
        L79:
            r1.bindString(r2, r4)
        L7c:
            int r2 = r2 + 1
            goto L67
        L7f:
            androidx.room.RoomDatabase r0 = r8.__db
            r2 = 0
            android.database.Cursor r0 = androidx.room.util.DBUtil.query(r0, r1, r3, r2)
            java.lang.String r1 = "work_spec_id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndex(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            r2 = -1
            if (r1 != r2) goto L94
            r0.close()
            return
        L94:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto Lba
            boolean r2 = r0.isNull(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r2 != 0) goto L94
            java.lang.String r2 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> Lb8
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L94
            byte[] r4 = r0.getBlob(r3)     // Catch: java.lang.Throwable -> Lb8
            androidx.work.Data r4 = androidx.work.Data.fromByteArray(r4)     // Catch: java.lang.Throwable -> Lb8
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb8
            goto L94
        Lb8:
            r9 = move-exception
            goto Lbe
        Lba:
            r0.close()
            return
        Lbe:
            r0.close()
            throw r9
    }

    private void __fetchRelationshipWorkTagAsjavaLangString(androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> r9) {
            r8 = this;
            java.util.Set r0 = r9.keySet()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L44
        Lb:
            int r1 = r9.size()
            r2 = 999(0x3e7, float:1.4E-42)
            r3 = 0
            if (r1 <= r2) goto L45
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            int r1 = r9.size()
            r4 = 0
        L1e:
            r5 = 0
        L1f:
            if (r4 >= r1) goto L3f
            java.lang.Object r6 = r9.keyAt(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.valueAt(r4)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r2) goto L1f
            r8.__fetchRelationshipWorkTagAsjavaLangString(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            goto L1e
        L3f:
            if (r5 <= 0) goto L44
            r8.__fetchRelationshipWorkTagAsjavaLangString(r0)
        L44:
            return
        L45:
            java.lang.StringBuilder r1 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r2 = "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("
            r1.append(r2)
            int r2 = r0.size()
            androidx.room.util.StringUtil.appendPlaceholders(r1, r2)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.room.RoomSQLiteQuery r1 = androidx.room.RoomSQLiteQuery.acquire(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L67:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L79
            r1.bindNull(r2)
            goto L7c
        L79:
            r1.bindString(r2, r4)
        L7c:
            int r2 = r2 + 1
            goto L67
        L7f:
            androidx.room.RoomDatabase r0 = r8.__db
            r2 = 0
            android.database.Cursor r0 = androidx.room.util.DBUtil.query(r0, r1, r3, r2)
            java.lang.String r1 = "work_spec_id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndex(r0, r1)     // Catch: java.lang.Throwable -> Lb4
            r2 = -1
            if (r1 != r2) goto L94
            r0.close()
            return
        L94:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb6
            boolean r2 = r0.isNull(r1)     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto L94
            java.lang.String r2 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L94
            java.lang.String r4 = r0.getString(r3)     // Catch: java.lang.Throwable -> Lb4
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb4
            goto L94
        Lb4:
            r9 = move-exception
            goto Lba
        Lb6:
            r0.close()
            return
        Lba:
            r0.close()
            throw r9
    }

    static /* synthetic */ androidx.room.RoomDatabase access$000(androidx.work.impl.model.RawWorkInfoDao_Impl r0) {
            androidx.room.RoomDatabase r0 = r0.__db
            return r0
    }

    static /* synthetic */ void access$100(androidx.work.impl.model.RawWorkInfoDao_Impl r0, androidx.collection.ArrayMap r1) {
            r0.__fetchRelationshipWorkTagAsjavaLangString(r1)
            return
    }

    static /* synthetic */ void access$200(androidx.work.impl.model.RawWorkInfoDao_Impl r0, androidx.collection.ArrayMap r1) {
            r0.__fetchRelationshipWorkProgressAsandroidxWorkData(r1)
            return
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkInfoPojos(androidx.sqlite.db.SupportSQLiteQuery r14) {
            r13 = this;
            androidx.room.RoomDatabase r0 = r13.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r13.__db
            r1 = 1
            r2 = 0
            android.database.Cursor r14 = androidx.room.util.DBUtil.query(r0, r14, r1, r2)
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.CursorUtil.getColumnIndex(r14, r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "state"
            int r1 = androidx.room.util.CursorUtil.getColumnIndex(r14, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "output"
            int r3 = androidx.room.util.CursorUtil.getColumnIndex(r14, r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "run_attempt_count"
            int r4 = androidx.room.util.CursorUtil.getColumnIndex(r14, r4)     // Catch: java.lang.Throwable -> L50
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L50
            r5.<init>()     // Catch: java.lang.Throwable -> L50
            androidx.collection.ArrayMap r6 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L50
            r6.<init>()     // Catch: java.lang.Throwable -> L50
        L2f:
            boolean r7 = r14.moveToNext()     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L6e
            boolean r7 = r14.isNull(r0)     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L53
            java.lang.String r7 = r14.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r8 = r5.get(r7)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> L50
            if (r8 != 0) goto L53
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r8.<init>()     // Catch: java.lang.Throwable -> L50
            r5.put(r7, r8)     // Catch: java.lang.Throwable -> L50
            goto L53
        L50:
            r0 = move-exception
            goto Lf2
        L53:
            boolean r7 = r14.isNull(r0)     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L2f
            java.lang.String r7 = r14.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r8 = r6.get(r7)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> L50
            if (r8 != 0) goto L2f
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r8.<init>()     // Catch: java.lang.Throwable -> L50
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L50
            goto L2f
        L6e:
            r7 = -1
            r14.moveToPosition(r7)     // Catch: java.lang.Throwable -> L50
            r13.__fetchRelationshipWorkTagAsjavaLangString(r5)     // Catch: java.lang.Throwable -> L50
            r13.__fetchRelationshipWorkProgressAsandroidxWorkData(r6)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            int r9 = r14.getCount()     // Catch: java.lang.Throwable -> L50
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L50
        L81:
            boolean r9 = r14.moveToNext()     // Catch: java.lang.Throwable -> L50
            if (r9 == 0) goto Lee
            boolean r9 = r14.isNull(r0)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L98
            java.lang.String r9 = r14.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r9 = r5.get(r9)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L50
            goto L99
        L98:
            r9 = r2
        L99:
            if (r9 != 0) goto La0
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r9.<init>()     // Catch: java.lang.Throwable -> L50
        La0:
            boolean r10 = r14.isNull(r0)     // Catch: java.lang.Throwable -> L50
            if (r10 != 0) goto Lb1
            java.lang.String r10 = r14.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r10 = r6.get(r10)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L50
            goto Lb2
        Lb1:
            r10 = r2
        Lb2:
            if (r10 != 0) goto Lb9
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r10.<init>()     // Catch: java.lang.Throwable -> L50
        Lb9:
            androidx.work.impl.model.WorkSpec$WorkInfoPojo r11 = new androidx.work.impl.model.WorkSpec$WorkInfoPojo     // Catch: java.lang.Throwable -> L50
            r11.<init>()     // Catch: java.lang.Throwable -> L50
            if (r0 == r7) goto Lc6
            java.lang.String r12 = r14.getString(r0)     // Catch: java.lang.Throwable -> L50
            r11.id = r12     // Catch: java.lang.Throwable -> L50
        Lc6:
            if (r1 == r7) goto Ld2
            int r12 = r14.getInt(r1)     // Catch: java.lang.Throwable -> L50
            androidx.work.WorkInfo$State r12 = androidx.work.impl.model.WorkTypeConverters.intToState(r12)     // Catch: java.lang.Throwable -> L50
            r11.state = r12     // Catch: java.lang.Throwable -> L50
        Ld2:
            if (r3 == r7) goto Lde
            byte[] r12 = r14.getBlob(r3)     // Catch: java.lang.Throwable -> L50
            androidx.work.Data r12 = androidx.work.Data.fromByteArray(r12)     // Catch: java.lang.Throwable -> L50
            r11.output = r12     // Catch: java.lang.Throwable -> L50
        Lde:
            if (r4 == r7) goto Le6
            int r12 = r14.getInt(r4)     // Catch: java.lang.Throwable -> L50
            r11.runAttemptCount = r12     // Catch: java.lang.Throwable -> L50
        Le6:
            r11.tags = r9     // Catch: java.lang.Throwable -> L50
            r11.progress = r10     // Catch: java.lang.Throwable -> L50
            r8.add(r11)     // Catch: java.lang.Throwable -> L50
            goto L81
        Lee:
            r14.close()
            return r8
        Lf2:
            r14.close()
            throw r0
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(androidx.sqlite.db.SupportSQLiteQuery r5) {
            r4 = this;
            androidx.room.RoomDatabase r0 = r4.__db
            androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
            java.lang.String r1 = "WorkProgress"
            java.lang.String r2 = "WorkSpec"
            java.lang.String r3 = "WorkTag"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            androidx.work.impl.model.RawWorkInfoDao_Impl$1 r2 = new androidx.work.impl.model.RawWorkInfoDao_Impl$1
            r2.<init>(r4, r5)
            r5 = 0
            androidx.lifecycle.LiveData r5 = r0.createLiveData(r1, r5, r2)
            return r5
    }
}
