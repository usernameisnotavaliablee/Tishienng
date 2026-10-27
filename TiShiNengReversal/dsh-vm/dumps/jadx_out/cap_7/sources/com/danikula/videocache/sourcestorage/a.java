package com.danikula.videocache.sourcestorage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class a extends android.database.sqlite.SQLiteOpenHelper implements com.danikula.videocache.sourcestorage.c {
    private static final java.lang.String a = "SourceInfo";
    private static final java.lang.String b = "_id";
    private static final java.lang.String c = "url";
    private static final java.lang.String d = "length";
    private static final java.lang.String e = "mime";
    private static final java.lang.String[] f = null;
    private static final java.lang.String g = "CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);";

    static {
            java.lang.String r0 = "length"
            java.lang.String r1 = "mime"
            java.lang.String r2 = "_id"
            java.lang.String r3 = "url"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            com.danikula.videocache.sourcestorage.a.f = r0
            return
    }

    a(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "AndroidVideoCache.db"
            r3.<init>(r4, r2, r0, r1)
            com.danikula.videocache.n.d(r4)
            return
    }

    private android.content.ContentValues b(com.danikula.videocache.s r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "url"
            java.lang.String r2 = r4.a
            r0.put(r1, r2)
            long r1 = r4.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "length"
            r0.put(r2, r1)
            java.lang.String r1 = "mime"
            java.lang.String r4 = r4.c
            r0.put(r1, r4)
            return r0
    }

    private com.danikula.videocache.s c(android.database.Cursor r6) {
            r5 = this;
            com.danikula.videocache.s r0 = new com.danikula.videocache.s
            java.lang.String r1 = "url"
            int r1 = r6.getColumnIndexOrThrow(r1)
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r2 = "length"
            int r2 = r6.getColumnIndexOrThrow(r2)
            long r2 = r6.getLong(r2)
            java.lang.String r4 = "mime"
            int r4 = r6.getColumnIndexOrThrow(r4)
            java.lang.String r6 = r6.getString(r4)
            r0.<init>(r1, r2, r6)
            return r0
    }

    @Override // com.danikula.videocache.sourcestorage.c
    public void a(java.lang.String r4, com.danikula.videocache.s r5) {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r2 = 1
            r0[r2] = r5
            com.danikula.videocache.n.a(r0)
            com.danikula.videocache.s r0 = r3.get(r4)
            if (r0 == 0) goto L13
            r1 = 1
        L13:
            android.content.ContentValues r5 = r3.b(r5)
            java.lang.String r0 = "SourceInfo"
            if (r1 == 0) goto L29
            android.database.sqlite.SQLiteDatabase r1 = r3.getWritableDatabase()
            java.lang.String r2 = "url=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r1.update(r0, r5, r2, r4)
            return
        L29:
            android.database.sqlite.SQLiteDatabase r4 = r3.getWritableDatabase()
            r1 = 0
            r4.insert(r0, r1, r5)
            return
    }

    @Override // com.danikula.videocache.sourcestorage.c
    public com.danikula.videocache.s get(java.lang.String r11) {
            r10 = this;
            com.danikula.videocache.n.d(r11)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "SourceInfo"
            java.lang.String[] r4 = com.danikula.videocache.sourcestorage.a.f     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "url=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L30
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L30
            if (r11 == 0) goto L2a
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L22
            goto L2a
        L22:
            com.danikula.videocache.s r1 = r10.c(r11)     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r0 = move-exception
            r1 = r11
            goto L31
        L2a:
            if (r11 == 0) goto L2f
            r11.close()
        L2f:
            return r1
        L30:
            r0 = move-exception
        L31:
            if (r1 == 0) goto L36
            r1.close()
        L36:
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.danikula.videocache.n.d(r2)
            java.lang.String r0 = "CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);"
            r2.execSQL(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Should not be called. There is no any migration"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.danikula.videocache.sourcestorage.c
    public void release() {
            r0 = this;
            r0.close()
            return
    }
}
