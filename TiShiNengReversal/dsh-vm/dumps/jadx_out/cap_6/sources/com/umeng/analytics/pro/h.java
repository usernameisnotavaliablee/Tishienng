package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.util.List<java.lang.String> r1) {
            java.lang.String r0 = "!"
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            return r1
    }

    public static java.util.List<java.lang.String> a(java.lang.String r1) {
            java.lang.String r0 = "!"
            java.lang.String[] r1 = r1.split(r0)
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    public static void a(android.content.Context r2) {
            if (r2 != 0) goto L3
            goto L1b
        L3:
            java.lang.String r0 = com.umeng.analytics.pro.e.b     // Catch: java.lang.Throwable -> L1b
            java.io.File r0 = r2.getDatabasePath(r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L14
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L14
            r0.delete()     // Catch: java.lang.Throwable -> L1b
        L14:
            com.umeng.analytics.pro.f r2 = com.umeng.analytics.pro.f.a(r2)     // Catch: java.lang.Throwable -> L1b
            r2.a()     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public static void a(android.database.sqlite.SQLiteDatabase r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "alter table "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " add "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.execSQL(r3)
            return
    }

    public static boolean a(android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12) {
            r0 = 0
            r1 = 0
            java.lang.String r9 = "LIMIT 0"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r10
            r3 = r11
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            if (r1 == 0) goto L1f
            int r10 = r1.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r11 = -1
            if (r10 == r11) goto L1f
            r0 = 1
            goto L1f
        L1a:
            r0 = move-exception
            r10 = r0
            goto L2b
        L1d:
            goto L37
        L1f:
            if (r1 == 0) goto L2a
            boolean r10 = r1.isClosed()
            if (r10 != 0) goto L2a
            r1.close()
        L2a:
            return r0
        L2b:
            if (r1 == 0) goto L36
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L36
            r1.close()
        L36:
            throw r10
        L37:
            if (r1 == 0) goto L42
            boolean r10 = r1.isClosed()
            if (r10 != 0) goto L42
            r1.close()
        L42:
            return r0
    }

    public static boolean a(java.lang.String r12, android.database.sqlite.SQLiteDatabase r13) {
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            r1 = 0
            java.lang.String r2 = "count(*)"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            java.lang.String r2 = "table"
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            java.lang.String[] r7 = new java.lang.String[]{r2, r12}     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            java.lang.String r4 = "sqlite_master"
            java.lang.String r6 = "type=? and name=?"
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r3 = r13
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            if (r12 == 0) goto L35
            int r12 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            if (r12 <= 0) goto L35
            r0 = 1
            goto L35
        L30:
            r0 = move-exception
            r12 = r0
            goto L39
        L33:
            goto L3f
        L35:
            r1.close()
            return r0
        L39:
            if (r1 == 0) goto L3e
            r1.close()
        L3e:
            throw r12
        L3f:
            if (r1 == 0) goto L44
            r1.close()
        L44:
            return r0
    }

    public static java.lang.String b(android.content.Context r1) {
            java.lang.String r0 = com.umeng.analytics.pro.e.b
            java.io.File r1 = r1.getDatabasePath(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getParent()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.util.List<java.lang.String> b(java.util.List<java.lang.String> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L20
        L9:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L20
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L20
            int r2 = java.util.Collections.frequency(r0, r1)     // Catch: java.lang.Exception -> L20
            r3 = 1
            if (r2 >= r3) goto L9
            r0.add(r1)     // Catch: java.lang.Exception -> L20
            goto L9
        L20:
            return r0
    }

    public static java.lang.String c(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = b(r1)
            r0.append(r1)
            java.lang.String r1 = "subprocess/"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
