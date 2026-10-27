package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r0 implements com.amap.api.col.p0003l.e6 {
    private static volatile com.amap.api.col.p0003l.r0 a;

    private r0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.amap.api.col.p0003l.r0 a() {
            com.amap.api.col.3l.r0 r0 = com.amap.api.col.p0003l.r0.a
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.3l.r0> r0 = com.amap.api.col.p0003l.r0.class
            monitor-enter(r0)
            com.amap.api.col.3l.r0 r1 = com.amap.api.col.p0003l.r0.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.r0 r1 = new com.amap.api.col.3l.r0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.r0.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.amap.api.col.3l.r0 r0 = com.amap.api.col.p0003l.r0.a
            return r0
    }

    @Override // com.amap.api.col.p0003l.e6
    public final void a(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS update_item (_id integer primary key autoincrement, title  TEXT, url TEXT,mAdcode TEXT,fileName TEXT,version TEXT,lLocalLength INTEGER,lRemoteLength INTEGER,localPath TEXT,mIndex INTEGER,isProvince INTEGER NOT NULL,mCompleteCode INTEGER,mCityCode TEXT,mState INTEGER,mPinyin TEXT, UNIQUE(mAdcode));"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS update_item_file (_id integer primary key autoincrement,mAdcode TTEXT, file TEXT);"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS update_item_download_info (_id integer primary key autoincrement,mAdcode TEXT,fileLength integer,splitter integer,startPos integer,endPos integer, UNIQUE(mAdcode));"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "DB"
            java.lang.String r1 = "onCreate"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    @Override // com.amap.api.col.p0003l.e6
    public final void a(android.database.sqlite.SQLiteDatabase r10, int r11) {
            r9 = this;
            if (r10 != 0) goto L3
            goto L56
        L3:
            r0 = 1
            if (r11 == r0) goto L7
            goto L56
        L7:
            java.lang.String r11 = "ALTER TABLE update_item ADD COLUMN mPinyin TEXT;"
            r10.execSQL(r11)
            r7 = 0
            r8 = 0
            java.lang.String r2 = "update_item"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != 0) goto L20
            r1.close()
            r11 = 0
            goto L21
        L20:
            r11 = r1
        L21:
            if (r10 == 0) goto L56
        L23:
            boolean r1 = r10.moveToNext()
            if (r1 == 0) goto L53
            java.lang.String r1 = "url"
            int r1 = r10.getColumnIndex(r1)
            java.lang.String r1 = r10.getString(r1)
            java.lang.String r2 = "/"
            int r2 = r1.lastIndexOf(r2)
            int r2 = r2 + r0
            java.lang.String r2 = r1.substring(r2)
            java.lang.String r3 = "."
            int r3 = r2.lastIndexOf(r3)
            r4 = 0
            java.lang.String r2 = r2.substring(r4, r3)
            java.lang.String r3 = "update update_item set mPinyin=? where url =?"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            r11.execSQL(r3, r1)
            goto L23
        L53:
            r10.close()
        L56:
            return
    }

    @Override // com.amap.api.col.p0003l.e6
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "offlineDbV4.db"
            return r0
    }

    @Override // com.amap.api.col.p0003l.e6
    public final int c() {
            r1 = this;
            r0 = 2
            return r0
    }
}
