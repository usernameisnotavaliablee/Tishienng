package com.beizi.fusion.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static volatile com.beizi.fusion.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.fusion.a.a f7557b;

    private b(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            com.beizi.fusion.a.a r1 = com.beizi.fusion.a.a.a(r1)
            r0.f7557b = r1
            return
    }

    private android.content.ContentValues a(com.beizi.fusion.model.EventItem r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "event_code"
            java.lang.String r2 = r4.getCode()
            r0.put(r1, r2)
            java.lang.String r1 = "channel"
            java.lang.String r2 = r4.getChannel()
            r0.put(r1, r2)
            java.lang.String r1 = "space_id"
            java.lang.String r2 = r4.getSpaceId()
            r0.put(r1, r2)
            java.lang.String r1 = "timestamp"
            java.lang.String r4 = r4.getTimeStamp()
            r0.put(r1, r4)
            return r0
    }

    public static com.beizi.fusion.a.b a(android.content.Context r2) {
            com.beizi.fusion.a.b r0 = com.beizi.fusion.a.b.a
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.a.b> r0 = com.beizi.fusion.a.b.class
            monitor-enter(r0)
            com.beizi.fusion.a.b r1 = com.beizi.fusion.a.b.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.a.b r1 = new com.beizi.fusion.a.b     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.a.b.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.beizi.fusion.a.b r2 = com.beizi.fusion.a.b.a
            return r2
    }

    private com.beizi.fusion.model.EventItem a(android.database.Cursor r3) {
            r2 = this;
            com.beizi.fusion.model.EventItem r0 = new com.beizi.fusion.model.EventItem
            r0.<init>()
            java.lang.String r1 = "event_code"
            int r1 = r3.getColumnIndex(r1)
            java.lang.String r1 = r3.getString(r1)
            r0.setCode(r1)
            java.lang.String r1 = "channel"
            int r1 = r3.getColumnIndex(r1)
            java.lang.String r1 = r3.getString(r1)
            r0.setChannel(r1)
            java.lang.String r1 = "space_id"
            int r1 = r3.getColumnIndex(r1)
            java.lang.String r1 = r3.getString(r1)
            r0.setSpaceId(r1)
            java.lang.String r1 = "timestamp"
            int r1 = r3.getColumnIndex(r1)
            java.lang.String r3 = r3.getString(r1)
            r0.setTimeStamp(r3)
            return r0
    }

    private synchronized boolean b(java.lang.String r12) {
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            if (r12 != 0) goto L6
            monitor-exit(r11)
            return r0
        L6:
            r1 = 0
            com.beizi.fusion.a.a r2 = r11.f7557b     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            android.database.sqlite.SQLiteDatabase r3 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            java.lang.String r2 = "count('*') as c"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            java.lang.String r6 = "type=? and name =?"
            java.lang.String r2 = "table"
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            java.lang.String[] r7 = new java.lang.String[]{r2, r12}     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            java.lang.String r4 = "Sqlite_master"
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r12 == 0) goto L3b
            int r12 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r12 <= 0) goto L3b
            r0 = 1
            goto L3b
        L36:
            r0 = move-exception
            r12 = r0
            goto L42
        L39:
            goto L48
        L3b:
            r1.close()     // Catch: java.lang.Throwable -> L3f
            goto L4d
        L3f:
            r0 = move-exception
            r12 = r0
            goto L4b
        L42:
            if (r1 == 0) goto L47
            r1.close()     // Catch: java.lang.Throwable -> L3f
        L47:
            throw r12     // Catch: java.lang.Throwable -> L3f
        L48:
            if (r1 == 0) goto L4d
            goto L3b
        L4b:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3f
            throw r12
        L4d:
            monitor-exit(r11)
            return r0
    }

    private synchronized void c(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            com.beizi.fusion.a.a r0 = r4.f7557b     // Catch: java.lang.Throwable -> L72
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L72
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r2 = "create table "
            r1.append(r2)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = "("
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = "id"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = " integer primary key autoincrement,"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = "event_code"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = " nvarchar,"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = "channel"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = " nvarchar,"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = "space_id"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = " nvarchar,"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = "timestamp"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = " nvarchar)"
            r1.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r1 = "DaoManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            r2.<init>()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r3 = "sql createTable tableName = "
            r2.append(r3)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            r2.append(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            com.beizi.fusion.tool.aa.a(r1, r2)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            r0.execSQL(r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
            r0.setTransactionSuccessful()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L74
        L6e:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L72
            goto L79
        L72:
            r5 = move-exception
            goto L7b
        L74:
            r5 = move-exception
            r0.endTransaction()     // Catch: java.lang.Throwable -> L72
            throw r5     // Catch: java.lang.Throwable -> L72
        L79:
            monitor-exit(r4)
            return
        L7b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            throw r5
    }

    private synchronized void d(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.b(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "DaoManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "sql table is exist == "
            r2.append(r3)     // Catch: java.lang.Throwable -> L21
            r2.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L21
            com.beizi.fusion.tool.aa.a(r1, r2)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L23
            r4.c(r5)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r5 = move-exception
            goto L25
        L23:
            monitor-exit(r4)
            return
        L25:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    private synchronized int e(java.lang.String r10) {
            r9 = this;
            monitor-enter(r9)
            com.beizi.fusion.a.a r0 = r9.f7557b     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r1 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L1c
            r7 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r10
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c
            if (r10 == 0) goto L1f
            int r0 = r10.getCount()     // Catch: java.lang.Throwable -> L1c
            r10.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r10 = r0
            goto L22
        L1f:
            r0 = 0
        L20:
            monitor-exit(r9)
            return r0
        L22:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
            throw r10
    }

    public synchronized java.util.List<com.beizi.fusion.model.EventItem> a(java.lang.String r11) {
            r10 = this;
            monitor-enter(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto La
            monitor-exit(r10)
            r11 = 0
            return r11
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "T_"
            r0.append(r1)     // Catch: java.lang.Throwable -> L4f
            r0.append(r11)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4f
            r10.d(r3)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r11.<init>()     // Catch: java.lang.Throwable -> L4f
            com.beizi.fusion.a.a r0 = r10.f7557b     // Catch: java.lang.Throwable -> L4f
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L4f
            r8 = 0
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L58
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L4f
            if (r0 <= 0) goto L58
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L4f
        L3e:
            com.beizi.fusion.model.EventItem r0 = r10.a(r1)     // Catch: java.lang.Throwable -> L52
            r11.add(r0)     // Catch: java.lang.Throwable -> L52
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L3e
            r1.close()     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r0 = move-exception
            r11 = r0
            goto L5a
        L52:
            r0 = move-exception
            r11 = r0
            r1.close()     // Catch: java.lang.Throwable -> L4f
            throw r11     // Catch: java.lang.Throwable -> L4f
        L58:
            monitor-exit(r10)
            return r11
        L5a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4f
            throw r11
    }

    public synchronized void a(java.lang.String r7, long r8) {
            r6 = this;
            monitor-enter(r6)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4e
            long r0 = r0 - r8
            int r2 = r6.e(r7)     // Catch: java.lang.Throwable -> L4e
            if (r2 <= 0) goto L50
            r3 = 0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L50
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L50
            com.beizi.fusion.a.a r3 = r6.f7557b     // Catch: java.lang.Throwable -> L4e
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = "timestamp<=?"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4e
            int r0 = r3.delete(r7, r4, r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "DaoManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = "start first delete data success = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e
            if (r0 <= 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            r3.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = ", intervalTime = "
            r3.append(r0)     // Catch: java.lang.Throwable -> L4e
            r3.append(r8)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L4e
            com.beizi.fusion.tool.aa.a(r1, r8)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r7 = move-exception
            goto L98
        L50:
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r8) goto L96
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r8.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = "delete from "
            r8.append(r9)     // Catch: java.lang.Throwable -> L4e
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = " where rowid in(select rowid from "
            r8.append(r9)     // Catch: java.lang.Throwable -> L4e
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = " order by "
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "id"
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = " limit "
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e
            r7 = 200(0xc8, float:2.8E-43)
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = ")"
            r8.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L4e
            com.beizi.fusion.a.a r8 = r6.f7557b     // Catch: java.lang.Throwable -> L4e
            android.database.sqlite.SQLiteDatabase r8 = r8.getWritableDatabase()     // Catch: java.lang.Throwable -> L4e
            r8.execSQL(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "DaoManager"
            java.lang.String r8 = "start second delete data"
            com.beizi.fusion.tool.aa.a(r7, r8)     // Catch: java.lang.Throwable -> L4e
        L96:
            monitor-exit(r6)
            return
        L98:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4e
            throw r7
    }

    public synchronized void a(java.lang.String r8, com.beizi.fusion.model.EventItem r9) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L9
            monitor-exit(r7)
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r0.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "T_"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6b
            r0.append(r8)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6b
            r7.d(r0)     // Catch: java.lang.Throwable -> L6b
            int r1 = r7.e(r0)     // Catch: java.lang.Throwable -> L6b
            com.beizi.fusion.a.a r2 = r7.f7557b     // Catch: java.lang.Throwable -> L6b
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L6b
            android.content.ContentValues r9 = r7.a(r9)     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            long r2 = r2.insert(r0, r3, r9)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r9 = "DaoManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "insert before size == "
            r4.append(r5)     // Catch: java.lang.Throwable -> L6b
            r4.append(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = ", insert data success = "
            r4.append(r1)     // Catch: java.lang.Throwable -> L6b
            r5 = -1
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L4c:
            r1 = 0
        L4d:
            r4.append(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L6b
            com.beizi.fusion.tool.aa.a(r9, r1)     // Catch: java.lang.Throwable -> L6b
            long r8 = com.beizi.fusion.tool.s.b(r8)     // Catch: java.lang.Throwable -> L6b
            r1 = 2
            long r8 = r8 * r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = java.lang.Math.max(r1, r8)     // Catch: java.lang.Throwable -> L6b
            r7.a(r0, r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r7)
            return
        L6b:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6b
            throw r8
    }
}
