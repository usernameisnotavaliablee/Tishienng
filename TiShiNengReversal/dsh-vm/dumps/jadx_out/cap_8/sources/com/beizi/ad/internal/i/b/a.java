package com.beizi.ad.internal.i.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class a extends android.database.sqlite.SQLiteOpenHelper implements com.beizi.ad.internal.i.b.c {
    private static final java.lang.String[] a = null;

    static {
            java.lang.String r0 = "length"
            java.lang.String r1 = "mime"
            java.lang.String r2 = "_id"
            java.lang.String r3 = "url"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            com.beizi.ad.internal.i.b.a.a = r0
            return
    }

    a(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "AndroidVideoCache.db"
            r3.<init>(r4, r2, r0, r1)
            com.beizi.ad.internal.i.k.a(r4)
            return
    }

    private android.content.ContentValues a(com.beizi.ad.internal.i.p r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "url"
            java.lang.String r2 = r4.a
            r0.put(r1, r2)
            int r1 = r4.f6996b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "length"
            r0.put(r2, r1)
            java.lang.String r1 = "mime"
            java.lang.String r4 = r4.f6997c
            r0.put(r1, r4)
            return r0
    }

    private com.beizi.ad.internal.i.p a(android.database.Cursor r5) {
            r4 = this;
            com.beizi.ad.internal.i.p r0 = new com.beizi.ad.internal.i.p
            java.lang.String r1 = "url"
            int r1 = r5.getColumnIndexOrThrow(r1)
            java.lang.String r1 = r5.getString(r1)
            java.lang.String r2 = "length"
            int r2 = r5.getColumnIndexOrThrow(r2)
            int r2 = r5.getInt(r2)
            java.lang.String r3 = "mime"
            int r3 = r5.getColumnIndexOrThrow(r3)
            java.lang.String r5 = r5.getString(r3)
            r0.<init>(r1, r2, r5)
            return r0
    }

    @Override // com.beizi.ad.internal.i.b.c
    public com.beizi.ad.internal.i.p a(java.lang.String r11) {
            r10 = this;
            com.beizi.ad.internal.i.k.a(r11)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "SourceInfo"
            java.lang.String[] r4 = com.beizi.ad.internal.i.b.a.a     // Catch: java.lang.Throwable -> L30
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
            com.beizi.ad.internal.i.p r1 = r10.a(r11)     // Catch: java.lang.Throwable -> L27
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

    @Override // com.beizi.ad.internal.i.b.c
    public void a(java.lang.String r4, com.beizi.ad.internal.i.p r5) {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r2 = 1
            r0[r2] = r5
            com.beizi.ad.internal.i.k.a(r0)
            com.beizi.ad.internal.i.p r0 = r3.a(r4)
            if (r0 == 0) goto L13
            r1 = 1
        L13:
            android.content.ContentValues r5 = r3.a(r5)
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.beizi.ad.internal.i.k.a(r2)
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
}
