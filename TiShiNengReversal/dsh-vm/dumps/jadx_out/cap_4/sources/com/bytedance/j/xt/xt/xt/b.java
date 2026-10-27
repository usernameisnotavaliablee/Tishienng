package com.bytedance.j.xt.xt.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b extends com.bytedance.j.xt.xt.xt.a<y0.a> {
    public b() {
            r1 = this;
            java.lang.String r0 = "duplicatelog"
            r1.<init>(r0)
            return
    }

    @Override // com.bytedance.j.xt.xt.xt.a
    protected /* bridge */ /* synthetic */ android.content.ContentValues a(y0.a r1) {
            r0 = this;
            y0.a r1 = (y0.a) r1
            android.content.ContentValues r1 = r0.d(r1)
            return r1
    }

    @Override // com.bytedance.j.xt.xt.xt.a
    protected java.util.HashMap<java.lang.String, java.lang.String> b() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "path"
            java.lang.String r2 = "TEXT"
            r0.put(r1, r2)
            java.lang.String r1 = "insert_time"
            java.lang.String r3 = "INTEGER"
            r0.put(r1, r3)
            java.lang.String r1 = "ext1"
            r0.put(r1, r2)
            java.lang.String r1 = "ext2"
            r0.put(r1, r2)
            return r0
    }

    protected android.content.ContentValues d(y0.a r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "path"
            java.lang.String r2 = r4.a
            r0.put(r1, r2)
            long r1 = r4.b
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "insert_time"
            r0.put(r1, r4)
            return r0
    }

    public boolean e(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
            r10 = this;
            r1 = 0
            if (r11 == 0) goto L30
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto La
            goto L30
        La:
            java.lang.String r3 = r10.b     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = "path=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Exception -> L26
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L26
            int r12 = r11.getCount()     // Catch: java.lang.Exception -> L26
            r11.close()     // Catch: java.lang.Exception -> L23
            goto L2c
        L23:
            r0 = move-exception
            r11 = r0
            goto L29
        L26:
            r0 = move-exception
            r11 = r0
            r12 = 0
        L29:
            com.bytedance.j.xt.tl.i.c(r11)
        L2c:
            if (r12 <= 0) goto L30
            r11 = 1
            return r11
        L30:
            return r1
    }

    @Override // com.bytedance.j.xt.xt.xt.a
    public /* bridge */ /* synthetic */ void insert(android.database.sqlite.SQLiteDatabase r1, y0.a r2) {
            r0 = this;
            y0.a r2 = (y0.a) r2
            r0.insert2(r1, r2)
            return
    }

    /* renamed from: insert, reason: avoid collision after fix types in other method */
    public void insert2(android.database.sqlite.SQLiteDatabase r2, y0.a r3) {
            r1 = this;
            if (r3 == 0) goto L35
            java.lang.String r0 = r3.a
            boolean r0 = r1.e(r2, r0)
            if (r0 == 0) goto Lb
            goto L35
        Lb:
            super.insert(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "delete from "
            r3.<init>(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = r1.b     // Catch: java.lang.Exception -> L31
            r3.append(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = " where _id in (select _id from "
            r3.append(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = r1.b     // Catch: java.lang.Exception -> L31
            r3.append(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = " order by insert_time desc limit 1000 offset 500)"
            r3.append(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L31
            r2.execSQL(r3)     // Catch: java.lang.Exception -> L31
            return
        L31:
            r2 = move-exception
            com.bytedance.j.xt.tl.i.c(r2)
        L35:
            return
    }
}
