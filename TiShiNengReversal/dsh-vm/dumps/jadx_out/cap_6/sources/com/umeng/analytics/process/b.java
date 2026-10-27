package com.umeng.analytics.process;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class b extends android.database.sqlite.SQLiteOpenHelper {
    b(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static com.umeng.analytics.process.b a(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = b(r3, r4)
            java.lang.String r1 = "_main_"
            r1.equals(r4)
            com.umeng.analytics.process.b r4 = new com.umeng.analytics.process.b
            r1 = 0
            r2 = 1
            r4.<init>(r3, r0, r1, r2)
            return r4
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.umeng.analytics.pro.h.b(r1)
            r0.append(r1)
            java.lang.String r1 = com.umeng.analytics.process.a.a
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private void a(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)"
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L5
        L5:
            return
    }

    public static java.lang.String b(android.content.Context r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = "_main_"
            if (r0 == 0) goto L9
            r4 = r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.umeng.analytics.pro.h.b(r3)
            r0.append(r2)
            java.lang.String r2 = com.umeng.analytics.process.a.a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L28
            java.lang.String r0 = com.umeng.analytics.pro.h.b(r3)
        L28:
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r1 = r3.exists()
            if (r1 != 0) goto L36
            r3.mkdirs()
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = com.umeng.analytics.process.a.e
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}
