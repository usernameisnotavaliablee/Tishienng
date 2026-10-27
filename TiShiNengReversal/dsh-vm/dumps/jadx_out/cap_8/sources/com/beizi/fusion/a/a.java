package com.beizi.fusion.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends android.database.sqlite.SQLiteOpenHelper {
    private static volatile com.beizi.fusion.a.a a;

    private a(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "beizi_ad.db"
            r3.<init>(r4, r2, r0, r1)
            return
    }

    static com.beizi.fusion.a.a a(android.content.Context r2) {
            com.beizi.fusion.a.a r0 = com.beizi.fusion.a.a.a
            if (r0 != 0) goto L21
            java.lang.Class<com.beizi.fusion.a.a> r0 = com.beizi.fusion.a.a.class
            monitor-enter(r0)
            com.beizi.fusion.a.a r1 = com.beizi.fusion.a.a.a     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            com.beizi.fusion.a.a r1 = new com.beizi.fusion.a.a     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            com.beizi.fusion.a.a.a = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
        L21:
            com.beizi.fusion.a.a r2 = com.beizi.fusion.a.a.a
            return r2
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r9, int r10, int r11) {
            r8 = this;
            if (r11 <= r10) goto L6a
            r10 = 0
            java.lang.String r11 = "name"
            java.lang.String[] r2 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r3 = "type=?"
            java.lang.String r11 = "table"
            java.lang.String[] r4 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r1 = "Sqlite_master"
            r6 = 0
            r7 = 0
            r5 = 0
            r0 = r9
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
        L1b:
            boolean r9 = r10.moveToNext()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r9 == 0) goto L5b
            r9 = 0
            java.lang.String r9 = r10.getString(r9)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r9 == 0) goto L1b
            java.lang.String r11 = "T_"
            boolean r11 = r9.startsWith(r11)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r11 == 0) goto L1b
            java.lang.String r11 = "BeiZis"
            java.lang.String r1 = "before alter table "
            com.beizi.fusion.tool.aa.c(r11, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r11.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r1 = "alter table "
            r11.append(r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r11.append(r9)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r9 = " add column "
            r11.append(r9)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r9 = "space_id"
            r11.append(r9)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r0.execSQL(r9)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            goto L1b
        L56:
            r0 = move-exception
            r9 = r0
            goto L5f
        L59:
            goto L65
        L5b:
            r10.close()
            return
        L5f:
            if (r10 == 0) goto L64
            r10.close()
        L64:
            throw r9
        L65:
            if (r10 == 0) goto L6a
            r10.close()
        L6a:
            return
    }
}
