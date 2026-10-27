package com.baidu.liantian.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static com.baidu.liantian.a.a f5901d;
    int a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f5902b;

    /* renamed from: c, reason: collision with root package name */
    public android.database.sqlite.SQLiteDatabase f5903c;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.liantian.a.a.C0094a f5904e;

    /* renamed from: f, reason: collision with root package name */
    private android.content.Context f5905f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.liantian.a.a$a, reason: collision with other inner class name */
    private class C0094a extends android.database.sqlite.SQLiteOpenHelper {
        final /* synthetic */ com.baidu.liantian.a.a a;

        public C0094a(com.baidu.liantian.a.a r3, android.content.Context r4) {
                r2 = this;
                r2.a = r3
                r0 = 0
                int r3 = r3.a
                java.lang.String r1 = "bliantianh.db"
                r2.<init>(r4, r1, r0, r3)
                com.baidu.liantian.b.a()
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                com.baidu.liantian.a.a r0 = r1.a     // Catch: java.lang.Throwable -> L8
                java.lang.String r0 = r0.f5902b     // Catch: java.lang.Throwable -> L8
                r2.execSQL(r0)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                com.baidu.liantian.b.e.a()
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L4c
                r0 = 3
                if (r3 >= r0) goto L20
                if (r4 < r0) goto L20
                r2.beginTransaction()     // Catch: java.lang.Throwable -> L4c
                java.lang.String r0 = "ALTER TABLE tbchliantian ADD COLUMN pr INTEGER  DEFAULT -1"
                r2.execSQL(r0)     // Catch: java.lang.Throwable -> L17
                r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L17
            L13:
                r2.endTransaction()     // Catch: java.lang.Throwable -> L4c
                goto L20
            L17:
                com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L1b
                goto L13
            L1b:
                r3 = move-exception
                r2.endTransaction()     // Catch: java.lang.Throwable -> L4c
                throw r3     // Catch: java.lang.Throwable -> L4c
            L20:
                r0 = 5
                if (r3 >= r0) goto L3d
                if (r4 < r0) goto L3d
                r2.beginTransaction()     // Catch: java.lang.Throwable -> L4c
                java.lang.String r0 = "ALTER TABLE tbchliantian ADD COLUMN pdld INTEGER  DEFAULT -1"
                r2.execSQL(r0)     // Catch: java.lang.Throwable -> L34
                r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L34
            L30:
                r2.endTransaction()     // Catch: java.lang.Throwable -> L4c
                goto L3d
            L34:
                com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L38
                goto L30
            L38:
                r3 = move-exception
                r2.endTransaction()     // Catch: java.lang.Throwable -> L4c
                throw r3     // Catch: java.lang.Throwable -> L4c
            L3d:
                r0 = 4
                if (r3 >= r0) goto L4b
                if (r4 < r0) goto L4b
                java.lang.String r3 = "drop table if exists pgnliantian"
                r2.execSQL(r3)     // Catch: java.lang.Throwable -> L48
                return
            L48:
                com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L4c
            L4b:
                return
            L4c:
                com.baidu.liantian.b.e.a()
                return
        }
    }

    private a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 5
            r1.a = r0
            java.lang.String r0 = "create table tbchliantian(k INTEGER PRIMARY KEY ON CONFLICT ABORT,p TEXT UNIQUE ON CONFLICT ABORT,v TEXT,n INTEGER,s INTEGER,i INTEGER,u INTEGER,la INTEGER,o INTEGER,r INTEGER,ap INTEGER,apk TEXT,cl TEXT,b TEXT,t TEXT,ac BLOB,st INTEGER,du INTEGER,th INTEGER,m5 TEXT,rs INTEGER,l TEXT,pr INTEGER DEFAULT -1,pdld INTEGER DEFAULT 0,a TEXT)"
            r1.f5902b = r0
            com.baidu.liantian.b.a()
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r1.f5905f = r0
            com.baidu.liantian.a.a$a r0 = new com.baidu.liantian.a.a$a
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r0.<init>(r1, r2)
            r1.f5904e = r0
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L2d
            r1.f5903c = r2     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            com.baidu.liantian.b.e.a()
            return
    }

    public static synchronized com.baidu.liantian.a.a a(android.content.Context r2) {
            java.lang.Class<com.baidu.liantian.a.a> r0 = com.baidu.liantian.a.a.class
            monitor-enter(r0)
            com.baidu.liantian.a.a r1 = com.baidu.liantian.a.a.f5901d     // Catch: java.lang.Throwable -> L17
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L17
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L17
            com.baidu.liantian.a.a r1 = com.baidu.liantian.a.a.f5901d     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.baidu.liantian.a.a r1 = new com.baidu.liantian.a.a     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.baidu.liantian.a.a.f5901d = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1d
        L19:
            com.baidu.liantian.a.a r2 = com.baidu.liantian.a.a.f5901d     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public final int a(int r5, int r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "u"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L26
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r6 = r4.f5903c     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "tbchliantian"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "k="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            r2.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L26
            r2 = 0
            int r5 = r6.update(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L26
            return r5
        L26:
            r5 = 0
            return r5
    }

    public final long a(com.baidu.liantian.core.ApkInfo r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            return r0
        L5:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            int r3 = r9.initStatus
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "n"
            r2.put(r4, r3)
            java.lang.String r3 = "p"
            java.lang.String r4 = r9.packageName
            r2.put(r3, r4)
            java.lang.String r3 = "a"
            java.lang.String r4 = r9.pkgPath
            r2.put(r3, r4)
            java.lang.String r3 = "l"
            java.lang.String r4 = r9.libPath
            r2.put(r3, r4)
            java.lang.String r3 = "v"
            java.lang.String r4 = r9.versionName
            r2.put(r3, r4)
            java.lang.String r3 = "apk"
            java.lang.String r4 = r9.dexPath
            r2.put(r3, r4)
            int r3 = r9.apkParseSuc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "ap"
            r2.put(r4, r3)
            java.lang.String r3 = "cl"
            java.lang.String r4 = r9.className
            r2.put(r3, r4)
            long r3 = r9.startTime
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "st"
            r2.put(r4, r3)
            int r3 = r9.duration
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "du"
            r2.put(r4, r3)
            java.lang.String r3 = "m5"
            java.lang.String r4 = r9.apkMD5
            r2.put(r3, r4)
            int r3 = r9.applicationTheme
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "th"
            r2.put(r4, r3)
            int r3 = r9.priority
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "pr"
            r2.put(r4, r3)
            android.content.pm.ActivityInfo[] r3 = r9.activities
            if (r3 == 0) goto L8f
            com.baidu.liantian.core.a r4 = new com.baidu.liantian.core.a
            r4.<init>(r3)
            java.lang.String r3 = "ac"
            byte[] r4 = r4.a()
            r2.put(r3, r4)
        L8f:
            int r3 = r9.key
            boolean r3 = r8.b(r3)
            r4 = 0
            java.lang.String r5 = "tbchliantian"
            if (r3 == 0) goto Lb2
            android.database.sqlite.SQLiteDatabase r3 = r8.f5903c     // Catch: java.lang.Throwable -> Lc3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r7 = "k="
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc3
            int r9 = r9.key     // Catch: java.lang.Throwable -> Lc3
            r6.append(r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> Lc3
            int r9 = r3.update(r5, r2, r9, r4)     // Catch: java.lang.Throwable -> Lc3
            long r0 = (long) r9     // Catch: java.lang.Throwable -> Lc3
            return r0
        Lb2:
            java.lang.String r3 = "k"
            int r9 = r9.key     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc3
            r2.put(r3, r9)     // Catch: java.lang.Throwable -> Lc3
            android.database.sqlite.SQLiteDatabase r9 = r8.f5903c     // Catch: java.lang.Throwable -> Lc3
            long r0 = r9.insert(r5, r4, r2)     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            return r0
    }

    public final com.baidu.liantian.core.ApkInfo a(int r10) {
            r9 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.f5903c     // Catch: java.lang.Throwable -> L189
            java.lang.String r2 = "tbchliantian"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L189
            java.lang.String r4 = "k="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L189
            r3.append(r10)     // Catch: java.lang.Throwable -> L189
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L189
            r7 = 0
            r8 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L189
            if (r1 == 0) goto L179
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18a
            if (r2 == 0) goto L179
            com.baidu.liantian.core.ApkInfo r2 = new com.baidu.liantian.core.ApkInfo     // Catch: java.lang.Throwable -> L18a
            r2.<init>()     // Catch: java.lang.Throwable -> L18a
            r2.key = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "n"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L177
            r2.initStatus = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "p"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L177
            r2.packageName = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "a"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L177
            r2.pkgPath = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "l"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L177
            r2.libPath = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "v"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L177
            r2.versionName = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "apk"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L177
            r2.dexPath = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "ap"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L177
            r2.apkParseSuc = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "cl"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L177
            r2.className = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "th"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L177
            r2.applicationTheme = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "st"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L177
            r2.startTime = r3     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "du"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L177
            r2.duration = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "m5"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L177
            r2.apkMD5 = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "pr"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L177
            r2.priority = r10     // Catch: java.lang.Throwable -> L177
            java.lang.String r10 = "ac"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L177
            byte[] r10 = r1.getBlob(r10)     // Catch: java.lang.Throwable -> L177
            if (r10 == 0) goto L175
            java.util.ArrayList r10 = com.baidu.liantian.core.a.a(r10)     // Catch: java.lang.Throwable -> L177
            if (r10 == 0) goto L175
            int r0 = r10.size()     // Catch: java.lang.Throwable -> L177
            if (r0 <= 0) goto L175
            android.content.pm.ActivityInfo[] r3 = new android.content.pm.ActivityInfo[r0]     // Catch: java.lang.Throwable -> L177
            r2.activities = r3     // Catch: java.lang.Throwable -> L177
            r3 = 0
        Le4:
            if (r3 >= r0) goto L175
            android.content.pm.ActivityInfo r4 = new android.content.pm.ActivityInfo     // Catch: java.lang.Throwable -> L177
            r4.<init>()     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            int r5 = r5.a     // Catch: java.lang.Throwable -> L177
            r4.theme = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            java.lang.String r5 = r5.f5944j     // Catch: java.lang.Throwable -> L177
            r4.name = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            int r5 = r5.f5942h     // Catch: java.lang.Throwable -> L177
            r4.configChanges = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            int r5 = r5.f5940f     // Catch: java.lang.Throwable -> L177
            r4.flags = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            int r5 = r5.l     // Catch: java.lang.Throwable -> L177
            r4.labelRes = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            int r5 = r5.f5936b     // Catch: java.lang.Throwable -> L177
            r4.launchMode = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            java.lang.String r5 = r5.m     // Catch: java.lang.Throwable -> L177
            r4.nonLocalizedLabel = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            java.lang.String r5 = r5.f5945k     // Catch: java.lang.Throwable -> L177
            r4.packageName = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            java.lang.String r5 = r5.f5937c     // Catch: java.lang.Throwable -> L177
            r4.permission = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            int r5 = r5.f5941g     // Catch: java.lang.Throwable -> L177
            r4.screenOrientation = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            int r5 = r5.f5943i     // Catch: java.lang.Throwable -> L177
            r4.softInputMode = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            java.lang.String r5 = r5.f5939e     // Catch: java.lang.Throwable -> L177
            r4.targetActivity = r5     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> L177
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L177
            java.lang.String r5 = r5.f5938d     // Catch: java.lang.Throwable -> L177
            r4.taskAffinity = r5     // Catch: java.lang.Throwable -> L177
            android.content.pm.ActivityInfo[] r5 = r2.activities     // Catch: java.lang.Throwable -> L177
            r5[r3] = r4     // Catch: java.lang.Throwable -> L177
            int r3 = r3 + 1
            goto Le4
        L175:
            r0 = r2
            goto L179
        L177:
            r0 = r2
            goto L18a
        L179:
            if (r1 == 0) goto L196
            boolean r10 = r1.isClosed()     // Catch: java.lang.Throwable -> L185
            if (r10 != 0) goto L196
        L181:
            r1.close()     // Catch: java.lang.Throwable -> L185
            goto L196
        L185:
            com.baidu.liantian.b.e.a()
            goto L196
        L189:
            r1 = r0
        L18a:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L197
            if (r1 == 0) goto L196
            boolean r10 = r1.isClosed()     // Catch: java.lang.Throwable -> L185
            if (r10 != 0) goto L196
            goto L181
        L196:
            return r0
        L197:
            r0 = move-exception
            r10 = r0
            if (r1 == 0) goto L1a8
            boolean r0 = r1.isClosed()     // Catch: java.lang.Throwable -> L1a5
            if (r0 != 0) goto L1a8
            r1.close()     // Catch: java.lang.Throwable -> L1a5
            goto L1a8
        L1a5:
            com.baidu.liantian.b.e.a()
        L1a8:
            throw r10
    }

    public final java.util.List<com.baidu.liantian.core.ApkInfo> a() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r9.f5903c     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "tbchliantian"
            r7 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L84
        L15:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L84
            com.baidu.liantian.core.ApkInfo r2 = new com.baidu.liantian.core.ApkInfo     // Catch: java.lang.Throwable -> L95
            r2.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "k"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L95
            r2.key = r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "p"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L95
            r2.packageName = r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "a"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L95
            r2.pkgPath = r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "l"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L95
            r2.libPath = r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "v"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L95
            r2.versionName = r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "st"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L95
            r2.startTime = r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "du"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L95
            r2.duration = r3     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "pr"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L95
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L95
            r2.priority = r3     // Catch: java.lang.Throwable -> L95
            r0.add(r2)     // Catch: java.lang.Throwable -> L95
            goto L15
        L84:
            if (r1 == 0) goto La3
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto La3
            r1.close()     // Catch: java.lang.Throwable -> L90
            return r0
        L90:
            com.baidu.liantian.b.e.a()
            goto La3
        L94:
            r1 = 0
        L95:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La3
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto La3
            r1.close()     // Catch: java.lang.Throwable -> L90
        La3:
            return r0
        La4:
            r0 = move-exception
            if (r1 == 0) goto Lb4
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> Lb1
            if (r2 != 0) goto Lb4
            r1.close()     // Catch: java.lang.Throwable -> Lb1
            goto Lb4
        Lb1:
            com.baidu.liantian.b.e.a()
        Lb4:
            throw r0
    }

    public final void a(java.lang.String r4) {
            r3 = this;
            com.baidu.liantian.b.a()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto La
            return
        La:
            android.database.sqlite.SQLiteDatabase r0 = r3.f5903c     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "tbchliantian"
            java.lang.String r2 = "p=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L18
            r0.delete(r1, r2, r4)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            com.baidu.liantian.b.e.a()
            return
    }

    public final java.util.Map<java.lang.Integer, java.lang.String> b() {
            r10 = this;
            java.lang.String r0 = "'"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r10.f5903c     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "tbchliantian"
            java.lang.String r5 = "n=1"
            r8 = 0
            r9 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L49
        L18:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L49
            java.lang.String r3 = "k"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L5a
            int r3 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "v"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            r5.append(r4)     // Catch: java.lang.Throwable -> L5a
            r5.append(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L5a
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L5a
            goto L18
        L49:
            if (r2 == 0) goto L68
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L68
            r2.close()     // Catch: java.lang.Throwable -> L55
            return r1
        L55:
            com.baidu.liantian.b.e.a()
            goto L68
        L59:
            r2 = 0
        L5a:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L68
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L68
            r2.close()     // Catch: java.lang.Throwable -> L55
        L68:
            return r1
        L69:
            r0 = move-exception
            if (r2 == 0) goto L79
            boolean r1 = r2.isClosed()     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L79
            r2.close()     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            com.baidu.liantian.b.e.a()
        L79:
            throw r0
    }

    public final void b(int r5, int r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "pdld"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r1, r6)
            android.database.sqlite.SQLiteDatabase r6 = r4.f5903c     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "tbchliantian"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "k="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L25
            r2.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r6.update(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            com.baidu.liantian.b.e.a()
            return
    }

    public final boolean b(int r10) {
            r9 = this;
            java.lang.String r1 = "tbchliantian"
            r8 = 0
            android.database.sqlite.SQLiteDatabase r0 = r9.f5903c     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "p"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "k="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            r3.append(r10)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3a
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            if (r10 == 0) goto L2a
            int r0 = r10.getCount()     // Catch: java.lang.Throwable -> L3b
            if (r0 <= 0) goto L2a
            r8 = 1
        L2a:
            if (r10 == 0) goto L47
            boolean r0 = r10.isClosed()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L47
        L32:
            r10.close()     // Catch: java.lang.Throwable -> L36
            goto L47
        L36:
            com.baidu.liantian.b.e.a()
            goto L47
        L3a:
            r10 = 0
        L3b:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L47
            boolean r0 = r10.isClosed()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L47
            goto L32
        L47:
            return r8
        L48:
            r0 = move-exception
            if (r10 == 0) goto L58
            boolean r1 = r10.isClosed()     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L58
            r10.close()     // Catch: java.lang.Throwable -> L55
            goto L58
        L55:
            com.baidu.liantian.b.e.a()
        L58:
            throw r0
    }

    public final java.lang.String[] b(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "t"
            java.lang.String r1 = "b"
            java.lang.String r2 = "r"
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r13.f5903c     // Catch: java.lang.Throwable -> L6d
            java.lang.String r5 = "tbchliantian"
            java.lang.String[] r6 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "p=?"
            java.lang.String[] r8 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d
            r10 = 0
            r11 = 0
            r9 = 0
            android.database.Cursor r14 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6d
            if (r14 == 0) goto L5d
            boolean r4 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L5d
            int r2 = r14.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L59
            int r2 = r14.getInt(r2)     // Catch: java.lang.Throwable -> L59
            r4 = 0
            r5 = 1
            if (r2 != r5) goto L32
            r2 = 1
            goto L33
        L32:
            r2 = 0
        L33:
            int r1 = r14.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r14.getString(r1)     // Catch: java.lang.Throwable -> L59
            int r0 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r14.getString(r0)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L5d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L5d
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L5d
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L59
            r3[r4] = r1     // Catch: java.lang.Throwable -> L59
            r3[r5] = r0     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r12 = r3
            r3 = r14
            r14 = r12
            goto L6e
        L5d:
            if (r14 == 0) goto L81
            boolean r0 = r14.isClosed()     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L81
            r14.close()     // Catch: java.lang.Throwable -> L69
            goto L81
        L69:
            com.baidu.liantian.b.e.a()
            goto L81
        L6d:
            r14 = r3
        L6e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L80
            boolean r0 = r3.isClosed()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L80
            r3.close()     // Catch: java.lang.Throwable -> L7d
            goto L80
        L7d:
            com.baidu.liantian.b.e.a()
        L80:
            r3 = r14
        L81:
            return r3
        L82:
            r0 = move-exception
            r14 = r0
            if (r3 == 0) goto L93
            boolean r0 = r3.isClosed()     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L93
            r3.close()     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            com.baidu.liantian.b.e.a()
        L93:
            throw r14
    }

    public final int c(int r11) {
            r10 = this;
            java.lang.String r0 = "n"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f5903c     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "tbchliantian"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r5.append(r11)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L41
            if (r11 == 0) goto L31
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L31
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L42
            int r1 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L42
        L31:
            if (r11 == 0) goto L4e
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L4e
        L39:
            r11.close()     // Catch: java.lang.Throwable -> L3d
            goto L4e
        L3d:
            com.baidu.liantian.b.e.a()
            goto L4e
        L41:
            r11 = 0
        L42:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L4f
            if (r11 == 0) goto L4e
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L4e
            goto L39
        L4e:
            return r1
        L4f:
            r0 = move-exception
            if (r11 == 0) goto L5f
            boolean r1 = r11.isClosed()     // Catch: java.lang.Throwable -> L5c
            if (r1 != 0) goto L5f
            r11.close()     // Catch: java.lang.Throwable -> L5c
            goto L5f
        L5c:
            com.baidu.liantian.b.e.a()
        L5f:
            throw r0
    }

    public final com.baidu.liantian.core.ApkInfo c(java.lang.String r11) {
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.database.sqlite.SQLiteDatabase r2 = r10.f5903c     // Catch: java.lang.Throwable -> L193
            java.lang.String r3 = "tbchliantian"
            java.lang.String r5 = "p=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L193
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L193
            if (r11 == 0) goto L183
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L181
            if (r0 == 0) goto L183
            com.baidu.liantian.core.ApkInfo r0 = new com.baidu.liantian.core.ApkInfo     // Catch: java.lang.Throwable -> L181
            r0.<init>()     // Catch: java.lang.Throwable -> L181
            java.lang.String r1 = "k"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L17f
            r0.key = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "n"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L17f
            r0.initStatus = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "p"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L17f
            r0.packageName = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "a"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L17f
            r0.pkgPath = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "l"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L17f
            r0.libPath = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "v"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L17f
            r0.versionName = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "apk"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L17f
            r0.dexPath = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "ap"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L17f
            r0.apkParseSuc = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "cl"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L17f
            r0.className = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "th"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L17f
            r0.applicationTheme = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "st"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            long r1 = r11.getLong(r1)     // Catch: java.lang.Throwable -> L17f
            r0.startTime = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "du"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L17f
            r0.duration = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "m5"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L17f
            r0.apkMD5 = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "pr"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L17f
            r0.priority = r1     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = "ac"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L17f
            byte[] r1 = r11.getBlob(r1)     // Catch: java.lang.Throwable -> L17f
            if (r1 == 0) goto L17d
            java.util.ArrayList r1 = com.baidu.liantian.core.a.a(r1)     // Catch: java.lang.Throwable -> L17f
            if (r1 == 0) goto L17d
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L17f
            if (r2 <= 0) goto L17d
            android.content.pm.ActivityInfo[] r3 = new android.content.pm.ActivityInfo[r2]     // Catch: java.lang.Throwable -> L17f
            r0.activities = r3     // Catch: java.lang.Throwable -> L17f
            r3 = 0
        Lec:
            if (r3 >= r2) goto L17d
            android.content.pm.ActivityInfo r4 = new android.content.pm.ActivityInfo     // Catch: java.lang.Throwable -> L17f
            r4.<init>()     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.a     // Catch: java.lang.Throwable -> L17f
            r4.theme = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.f5944j     // Catch: java.lang.Throwable -> L17f
            r4.name = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.f5942h     // Catch: java.lang.Throwable -> L17f
            r4.configChanges = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.f5940f     // Catch: java.lang.Throwable -> L17f
            r4.flags = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.l     // Catch: java.lang.Throwable -> L17f
            r4.labelRes = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.f5936b     // Catch: java.lang.Throwable -> L17f
            r4.launchMode = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.m     // Catch: java.lang.Throwable -> L17f
            r4.nonLocalizedLabel = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.f5945k     // Catch: java.lang.Throwable -> L17f
            r4.packageName = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.f5937c     // Catch: java.lang.Throwable -> L17f
            r4.permission = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.f5941g     // Catch: java.lang.Throwable -> L17f
            r4.screenOrientation = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            int r5 = r5.f5943i     // Catch: java.lang.Throwable -> L17f
            r4.softInputMode = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.f5939e     // Catch: java.lang.Throwable -> L17f
            r4.targetActivity = r5     // Catch: java.lang.Throwable -> L17f
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.Throwable -> L17f
            com.baidu.liantian.core.b r5 = (com.baidu.liantian.core.b) r5     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = r5.f5938d     // Catch: java.lang.Throwable -> L17f
            r4.taskAffinity = r5     // Catch: java.lang.Throwable -> L17f
            android.content.pm.ActivityInfo[] r5 = r0.activities     // Catch: java.lang.Throwable -> L17f
            r5[r3] = r4     // Catch: java.lang.Throwable -> L17f
            int r3 = r3 + 1
            goto Lec
        L17d:
            r1 = r0
            goto L183
        L17f:
            r1 = r11
            goto L194
        L181:
            r0 = r1
            goto L17f
        L183:
            if (r11 == 0) goto L1a7
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L18f
            if (r0 != 0) goto L1a7
            r11.close()     // Catch: java.lang.Throwable -> L18f
            goto L1a7
        L18f:
            com.baidu.liantian.b.e.a()
            goto L1a7
        L193:
            r0 = r1
        L194:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L1a8
            if (r1 == 0) goto L1a6
            boolean r11 = r1.isClosed()     // Catch: java.lang.Throwable -> L1a3
            if (r11 != 0) goto L1a6
            r1.close()     // Catch: java.lang.Throwable -> L1a3
            goto L1a6
        L1a3:
            com.baidu.liantian.b.e.a()
        L1a6:
            r1 = r0
        L1a7:
            return r1
        L1a8:
            r0 = move-exception
            r11 = r0
            if (r1 == 0) goto L1b9
            boolean r0 = r1.isClosed()     // Catch: java.lang.Throwable -> L1b6
            if (r0 != 0) goto L1b9
            r1.close()     // Catch: java.lang.Throwable -> L1b6
            goto L1b9
        L1b6:
            com.baidu.liantian.b.e.a()
        L1b9:
            throw r11
    }

    public final java.util.Map<java.lang.Integer, java.lang.String> c() {
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r9.f5903c     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "tbchliantian"
            java.lang.String r4 = "n=1"
            r7 = 0
            r8 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L38
        L16:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L38
            java.lang.String r2 = "k"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L49
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "p"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L49
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L49
            goto L16
        L38:
            if (r1 == 0) goto L57
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L57
            r1.close()     // Catch: java.lang.Throwable -> L44
            return r0
        L44:
            com.baidu.liantian.b.e.a()
            goto L57
        L48:
            r1 = 0
        L49:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L57
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L57
            r1.close()     // Catch: java.lang.Throwable -> L44
        L57:
            return r0
        L58:
            r0 = move-exception
            if (r1 == 0) goto L68
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L68
            r1.close()     // Catch: java.lang.Throwable -> L65
            goto L68
        L65:
            com.baidu.liantian.b.e.a()
        L68:
            throw r0
    }

    public final void c(int r5, int r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "pr"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L25
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L25
            android.database.sqlite.SQLiteDatabase r6 = r4.f5903c     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "tbchliantian"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "k="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L25
            r2.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r6.update(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            com.baidu.liantian.b.e.a()
            return
    }

    public final void d() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La1
            r0.<init>()     // Catch: java.lang.Throwable -> La1
            java.util.List r1 = r7.a()     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La1
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La1
            com.baidu.liantian.core.ApkInfo r2 = (com.baidu.liantian.core.ApkInfo) r2     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r2.pkgPath     // Catch: java.lang.Throwable -> La1
            boolean r3 = com.baidu.liantian.b.e.c(r3)     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto Ld
            java.util.List<java.lang.Integer> r3 = com.baidu.liantian.core.g.f5977b     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto Ld
            int r4 = r2.key     // Catch: java.lang.Throwable -> La1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La1
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> La1
            goto Ld
        L35:
            com.baidu.liantian.core.g r1 = com.baidu.liantian.core.g.a()     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La1
        L3d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto La0
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La1
            com.baidu.liantian.core.ApkInfo r2 = (com.baidu.liantian.core.ApkInfo) r2     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L50
            java.lang.String r3 = r2.packageName     // Catch: java.lang.Throwable -> La1
            r1.b(r3)     // Catch: java.lang.Throwable -> La1
        L50:
            android.database.sqlite.SQLiteDatabase r3 = r7.f5903c     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = "tbchliantian"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La1
            int r6 = r2.key     // Catch: java.lang.Throwable -> La1
            r5.append(r6)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La1
            r6 = 0
            r3.delete(r4, r5, r6)     // Catch: java.lang.Throwable -> La1
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r3.<init>()     // Catch: java.lang.Throwable -> La1
            android.content.Context r4 = r7.f5905f     // Catch: java.lang.Throwable -> La1
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r4.getCanonicalPath()     // Catch: java.lang.Throwable -> La1
            r3.append(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = "/.liantian_"
            r3.append(r4)     // Catch: java.lang.Throwable -> La1
            int r4 = r2.key     // Catch: java.lang.Throwable -> La1
            r3.append(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La1
            com.baidu.liantian.b.e.d(r3)     // Catch: java.lang.Throwable -> La1
            android.content.Context r3 = r7.f5905f     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L3d
            java.lang.String r2 = r2.packageName     // Catch: java.lang.Throwable -> La1
            java.io.File r2 = r3.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> La1
            com.baidu.liantian.b.e.d(r2)     // Catch: java.lang.Throwable -> La1
            goto L3d
        La0:
            return
        La1:
            com.baidu.liantian.b.e.a()
            return
    }

    public final boolean d(int r11) {
            r10 = this;
            java.lang.String r0 = "u"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f5903c     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "tbchliantian"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L45
            r5.append(r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L45
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L35
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L35
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L46
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L46
            r2 = 1
            if (r0 != r2) goto L35
            r1 = 1
        L35:
            if (r11 == 0) goto L52
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L52
        L3d:
            r11.close()     // Catch: java.lang.Throwable -> L41
            goto L52
        L41:
            com.baidu.liantian.b.e.a()
            goto L52
        L45:
            r11 = 0
        L46:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L52
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L52
            goto L3d
        L52:
            return r1
        L53:
            r0 = move-exception
            if (r11 == 0) goto L63
            boolean r1 = r11.isClosed()     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L63
            r11.close()     // Catch: java.lang.Throwable -> L60
            goto L63
        L60:
            com.baidu.liantian.b.e.a()
        L63:
            throw r0
    }

    public final boolean e(int r11) {
            r10 = this;
            java.lang.String r0 = "s"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f5903c     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "tbchliantian"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L45
            r5.append(r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L45
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L35
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L35
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L46
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L46
            r2 = 1
            if (r0 != r2) goto L35
            r1 = 1
        L35:
            if (r11 == 0) goto L52
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L52
        L3d:
            r11.close()     // Catch: java.lang.Throwable -> L41
            goto L52
        L41:
            com.baidu.liantian.b.e.a()
            goto L52
        L45:
            r11 = 0
        L46:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L52
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L52
            goto L3d
        L52:
            return r1
        L53:
            r0 = move-exception
            if (r11 == 0) goto L63
            boolean r1 = r11.isClosed()     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L63
            r11.close()     // Catch: java.lang.Throwable -> L60
            goto L63
        L60:
            com.baidu.liantian.b.e.a()
        L63:
            throw r0
    }

    public final void f(int r6) {
            r5 = this;
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "n"
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r1 = r5.f5903c     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "tbchliantian"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "k="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L26
            r3.append(r6)     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L26
            r3 = 0
            r1.update(r2, r0, r6, r3)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            com.baidu.liantian.b.e.a()
            return
    }

    public final int g(int r11) {
            r10 = this;
            java.lang.String r0 = "pdld"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f5903c     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "tbchliantian"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r5.append(r11)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L41
            if (r11 == 0) goto L31
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L31
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L42
            int r1 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L42
        L31:
            if (r11 == 0) goto L4e
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L4e
        L39:
            r11.close()     // Catch: java.lang.Throwable -> L3d
            goto L4e
        L3d:
            com.baidu.liantian.b.e.a()
            goto L4e
        L41:
            r11 = 0
        L42:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L4f
            if (r11 == 0) goto L4e
            boolean r0 = r11.isClosed()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L4e
            goto L39
        L4e:
            return r1
        L4f:
            r0 = move-exception
            if (r11 == 0) goto L5f
            boolean r1 = r11.isClosed()     // Catch: java.lang.Throwable -> L5c
            if (r1 != 0) goto L5f
            r11.close()     // Catch: java.lang.Throwable -> L5c
            goto L5f
        L5c:
            com.baidu.liantian.b.e.a()
        L5f:
            throw r0
    }

    public final void h(int r5) {
            r4 = this;
            com.baidu.liantian.b.a()
            if (r5 > 0) goto L6
            return
        L6:
            android.database.sqlite.SQLiteDatabase r0 = r4.f5903c     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "tbchliantian"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "k="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20
            r2.append(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r0.delete(r1, r5, r2)     // Catch: java.lang.Throwable -> L20
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L20
            return
        L20:
            com.baidu.liantian.b.e.a()
            return
    }
}
