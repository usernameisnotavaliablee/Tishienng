package com.baidu.liantian.rp.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    private static com.baidu.liantian.rp.b.a a;

    /* renamed from: b, reason: collision with root package name */
    private com.baidu.liantian.rp.b.a.C0095a f6002b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.liantian.e f6003c;

    /* renamed from: d, reason: collision with root package name */
    private android.database.sqlite.SQLiteDatabase f6004d;

    /* renamed from: e, reason: collision with root package name */
    private android.content.Context f6005e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.liantian.rp.b.a$a, reason: collision with other inner class name */
    class C0095a extends android.database.sqlite.SQLiteOpenHelper {
        final /* synthetic */ com.baidu.liantian.rp.b.a a;

        public C0095a(com.baidu.liantian.rp.b.a r3, android.content.Context r4) {
                r2 = this;
                r2.a = r3
                r3 = 0
                r0 = 3
                java.lang.String r1 = "liantian_d.db"
                r2.<init>(r4, r1, r3, r0)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "create table if not exists r(a integer primary key autoincrement, b text, c integer, e integer,f integer,h text, g integer, i integer, j text, d long);"
                r2.execSQL(r0)
                java.lang.String r0 = "create table if not exists c(a integer primary key autoincrement, b text); "
                r2.execSQL(r0)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
                r0 = this;
                r3 = 1
                if (r2 > r3) goto L8
                java.lang.String r3 = "alter table r add i integer default 0;"
                r1.execSQL(r3)
            L8:
                r3 = 2
                if (r2 > r3) goto L10
                java.lang.String r2 = "ALTER TABLE r ADD COLUMN j TEXT"
                r1.execSQL(r2)
            L10:
                return
        }
    }

    private a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.f6005e = r2
            com.baidu.liantian.rp.b.a$a r0 = new com.baidu.liantian.rp.b.a$a
            r0.<init>(r1, r2)
            r1.f6002b = r0
            com.baidu.liantian.e r0 = new com.baidu.liantian.e
            r0.<init>(r2)
            r1.f6003c = r0
            com.baidu.liantian.rp.b.a$a r2 = r1.f6002b     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L1c
            r1.f6004d = r2     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            com.baidu.liantian.b.e.a()
            return
    }

    public static synchronized com.baidu.liantian.rp.b.a a(android.content.Context r2) {
            java.lang.Class<com.baidu.liantian.rp.b.a> r0 = com.baidu.liantian.rp.b.a.class
            monitor-enter(r0)
            com.baidu.liantian.rp.b.a r1 = com.baidu.liantian.rp.b.a.a     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.baidu.liantian.rp.b.a r1 = new com.baidu.liantian.rp.b.a     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.baidu.liantian.rp.b.a.a = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.baidu.liantian.rp.b.a r2 = com.baidu.liantian.rp.b.a.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private int b(int r4) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.f6004d     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "r"
            java.lang.String r2 = "a=?"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L13
            int r4 = r0.delete(r1, r2, r4)     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            com.baidu.liantian.b.e.a()
            r4 = -1
            return r4
    }

    public final int a(java.util.List<java.lang.Integer> r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.f6004d     // Catch: java.lang.Throwable -> L2c
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2c
        L9:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2c
            r1.b(r0)     // Catch: java.lang.Throwable -> L2c
            goto L9
        L1d:
            android.database.sqlite.SQLiteDatabase r2 = r1.f6004d     // Catch: java.lang.Throwable -> L2c
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2c
            android.database.sqlite.SQLiteDatabase r2 = r1.f6004d     // Catch: java.lang.Exception -> L28
        L24:
            r2.endTransaction()     // Catch: java.lang.Exception -> L28
            goto L32
        L28:
            com.baidu.liantian.b.e.a()
            goto L32
        L2c:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L34
            android.database.sqlite.SQLiteDatabase r2 = r1.f6004d     // Catch: java.lang.Exception -> L28
            goto L24
        L32:
            r2 = -1
            return r2
        L34:
            r2 = move-exception
            android.database.sqlite.SQLiteDatabase r0 = r1.f6004d     // Catch: java.lang.Exception -> L3b
            r0.endTransaction()     // Catch: java.lang.Exception -> L3b
            goto L3e
        L3b:
            com.baidu.liantian.b.e.a()
        L3e:
            throw r2
    }

    public final long a(com.baidu.liantian.rp.c.a r6) {
            r5 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "b"
            java.lang.String r2 = r6.f6006b
            r0.put(r1, r2)
            int r1 = r6.f6007c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "c"
            r0.put(r2, r1)
            long r1 = r6.f6009e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "d"
            r0.put(r2, r1)
            int r1 = r6.f6011g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "e"
            r0.put(r2, r1)
            int r1 = r6.f6010f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "g"
            r0.put(r2, r1)
            int r1 = r6.f6012h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "f"
            r0.put(r2, r1)
            int r1 = r6.f6013i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "i"
            r0.put(r2, r1)
            java.lang.String r1 = "j"
            java.lang.String r2 = r6.f6014j
            r0.put(r1, r2)
            java.lang.String r6 = r6.f6008d
            com.baidu.liantian.ac.F r1 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Exception -> L71
            byte[] r2 = r6.getBytes()     // Catch: java.lang.Exception -> L71
            java.lang.String r3 = "xVOTuxgN3lkRN2v4"
            java.lang.String r4 = "utf-8"
            byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Exception -> L71
            byte[] r1 = r1.ae(r2, r3)     // Catch: java.lang.Exception -> L71
            r2 = 0
            java.lang.String r6 = android.util.Base64.encodeToString(r1, r2)     // Catch: java.lang.Exception -> L71
            goto L74
        L71:
            com.baidu.liantian.b.e.a()
        L74:
            java.lang.String r1 = "h"
            r0.put(r1, r6)
            android.database.sqlite.SQLiteDatabase r6 = r5.f6004d     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "r"
            r2 = 0
            long r0 = r6.insert(r1, r2, r0)     // Catch: java.lang.Throwable -> L83
            goto L88
        L83:
            com.baidu.liantian.b.e.a()
            r0 = -1
        L88:
            return r0
    }

    public final long a(java.lang.String r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "b"
            r0.put(r1, r4)
            android.database.sqlite.SQLiteDatabase r4 = r3.f6004d     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "c"
            r2 = 0
            long r0 = r4.insert(r1, r2, r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            com.baidu.liantian.b.e.a()
            r0 = -1
            return r0
    }

    public final java.util.List<com.baidu.liantian.rp.c.a> a() {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r4 = "i=5"
            java.lang.String r8 = "d desc"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.f6004d     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "r"
            java.lang.String r9 = "100"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            if (r10 == 0) goto Lc3
        L1a:
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            if (r1 == 0) goto Lc3
            com.baidu.liantian.rp.c.a r1 = new com.baidu.liantian.rp.c.a     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.<init>()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "a"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.a = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "b"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6006b = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "c"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6007c = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "d"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            long r2 = r10.getLong(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6009e = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "g"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6010f = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "e"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6011g = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "f"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6012h = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "i"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6013i = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "j"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r1.f6014j = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = "h"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            com.baidu.liantian.ac.F r3 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lb9
            r4 = 0
            byte[] r4 = android.util.Base64.decode(r2, r4)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lb9
            java.lang.String r5 = "xVOTuxgN3lkRN2v4"
            java.lang.String r6 = "utf-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lb9
            byte[] r3 = r3.ad(r4, r5)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lb9
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lb9
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lb9
            r2 = r4
            goto Lbc
        Lb7:
            r0 = move-exception
            goto Ld4
        Lb9:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
        Lbc:
            r1.f6008d = r2     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb7 java.lang.Exception -> Lcd
            goto L1a
        Lc3:
            if (r10 == 0) goto Ld3
        Lc5:
            r10.close()     // Catch: java.lang.Exception -> Lc9
            goto Ld3
        Lc9:
            com.baidu.liantian.b.e.a()
            goto Ld3
        Lcd:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto Ld3
            goto Lc5
        Ld3:
            return r0
        Ld4:
            if (r10 == 0) goto Ldd
            r10.close()     // Catch: java.lang.Exception -> Lda
            goto Ldd
        Lda:
            com.baidu.liantian.b.e.a()
        Ldd:
            throw r0
    }

    public final java.util.List<com.baidu.liantian.rp.c.a> a(int r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            long r3 = java.lang.System.currentTimeMillis()
            com.baidu.liantian.e r5 = new com.baidu.liantian.e
            android.content.Context r6 = r1.f6005e
            r5.<init>(r6)
            android.content.SharedPreferences r6 = r5.f5994e
            java.lang.String r7 = "re_net_wt"
            r8 = 3
            int r6 = r6.getInt(r7, r8)
            r7 = 3600000(0x36ee80, float:5.044674E-39)
            int r6 = r6 * r7
            java.lang.String r7 = "(d <= ("
            r8 = 2
            if (r0 != r8) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = "-e*3600000) or e=0 )"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        L38:
            r12 = r3
            goto L56
        L3a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r7)
            r9.append(r3)
            java.lang.String r7 = "-e*3600000) or e=0 ) and (g!=2 or d<="
            r9.append(r7)
            long r6 = (long) r6
            long r3 = r3 - r6
            r9.append(r3)
            java.lang.String r3 = ")"
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            goto L38
        L56:
            java.lang.String r16 = "d desc"
            r3 = 0
            if (r0 != r8) goto L72
            android.database.sqlite.SQLiteDatabase r9 = r1.f6004d     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r10 = "r"
            r0 = 100
            java.lang.String r17 = java.lang.Integer.toString(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            android.database.Cursor r0 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
        L6d:
            r3 = r0
            goto L87
        L6f:
            r0 = move-exception
            goto L141
        L72:
            int r0 = r5.y()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            android.database.sqlite.SQLiteDatabase r9 = r1.f6004d     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r10 = "r"
            java.lang.String r17 = java.lang.Integer.toString(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            android.database.Cursor r0 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            goto L6d
        L87:
            if (r3 == 0) goto L130
        L89:
            boolean r0 = r3.moveToNext()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            if (r0 == 0) goto L130
            com.baidu.liantian.rp.c.a r0 = new com.baidu.liantian.rp.c.a     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "a"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.a = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "b"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6006b = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "c"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6007c = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "d"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            long r4 = r3.getLong(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6009e = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "g"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6010f = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "e"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6011g = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "f"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6012h = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "i"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            int r4 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6013i = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "j"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r0.f6014j = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = "h"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            com.baidu.liantian.ac.F r5 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L126
            r6 = 0
            byte[] r6 = android.util.Base64.decode(r4, r6)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L126
            java.lang.String r7 = "xVOTuxgN3lkRN2v4"
            java.lang.String r8 = "utf-8"
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L126
            byte[] r5 = r5.ad(r6, r7)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L126
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L126
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L126
            r4 = r6
            goto L129
        L126:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
        L129:
            r0.f6008d = r4     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            r2.add(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L13a
            goto L89
        L130:
            if (r3 == 0) goto L140
        L132:
            r3.close()     // Catch: java.lang.Exception -> L136
            goto L140
        L136:
            com.baidu.liantian.b.e.a()
            goto L140
        L13a:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L140
            goto L132
        L140:
            return r2
        L141:
            if (r3 == 0) goto L14a
            r3.close()     // Catch: java.lang.Exception -> L147
            goto L14a
        L147:
            com.baidu.liantian.b.e.a()
        L14a:
            throw r0
    }

    public final java.util.List<com.baidu.liantian.rp.c.a> a(boolean r12, int r13) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            if (r12 == 0) goto L20
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "(d < ("
            r12.<init>(r3)
            r12.append(r1)
            java.lang.String r1 = "-f*3600000) and f!= 0)"
            r12.append(r1)
            java.lang.String r12 = r12.toString()
        L1e:
            r4 = r12
            goto L33
        L20:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "d<="
            r12.<init>(r3)
            r3 = 259200000(0xf731400, double:1.280618154E-315)
            long r1 = r1 - r3
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            goto L1e
        L33:
            r12 = 2
            java.lang.String r8 = "d desc"
            r10 = 0
            if (r13 != r12) goto L4c
            android.database.sqlite.SQLiteDatabase r1 = r11.f6004d     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r2 = "r"
            r7 = 0
            r9 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
        L46:
            r10 = r12
            goto L6e
        L48:
            r0 = move-exception
            r12 = r0
            goto L128
        L4c:
            com.baidu.liantian.e r12 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            android.content.Context r13 = r11.f6005e     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            int r12 = r12.y()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.Integer.toString(r12)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            android.database.sqlite.SQLiteDatabase r1 = r11.f6004d     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r2 = "r"
            java.lang.String r9 = java.lang.Integer.toString(r12)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            goto L46
        L6e:
            if (r10 == 0) goto L117
        L70:
            boolean r12 = r10.moveToNext()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            if (r12 == 0) goto L117
            com.baidu.liantian.rp.c.a r12 = new com.baidu.liantian.rp.c.a     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.<init>()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "a"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            int r13 = r10.getInt(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.a = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "b"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = r10.getString(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6006b = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "c"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            int r13 = r10.getInt(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6007c = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "d"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            long r1 = r10.getLong(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6009e = r1     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "g"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            int r13 = r10.getInt(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6010f = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "e"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            int r13 = r10.getInt(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6011g = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "f"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            int r13 = r10.getInt(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6012h = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "i"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            int r13 = r10.getInt(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6013i = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "j"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = r10.getString(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r12.f6014j = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = "h"
            int r13 = r10.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            java.lang.String r13 = r10.getString(r13)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            com.baidu.liantian.ac.F r1 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L10d
            r2 = 0
            byte[] r2 = android.util.Base64.decode(r13, r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L10d
            java.lang.String r3 = "xVOTuxgN3lkRN2v4"
            java.lang.String r4 = "utf-8"
            byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L10d
            byte[] r1 = r1.ad(r2, r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L10d
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L10d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L10d
            r13 = r2
            goto L110
        L10d:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
        L110:
            r12.f6008d = r13     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            r0.add(r12)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L121
            goto L70
        L117:
            if (r10 == 0) goto L127
        L119:
            r10.close()     // Catch: java.lang.Exception -> L11d
            goto L127
        L11d:
            com.baidu.liantian.b.e.a()
            goto L127
        L121:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L127
            goto L119
        L127:
            return r0
        L128:
            if (r10 == 0) goto L131
            r10.close()     // Catch: java.lang.Exception -> L12e
            goto L131
        L12e:
            com.baidu.liantian.b.e.a()
        L131:
            throw r12
    }

    public final int b() {
            r11 = this;
            r1 = 0
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.f6004d     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L24
            java.lang.String r3 = "r"
            r9 = 0
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L24
            if (r1 == 0) goto L1a
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L24
            goto L1a
        L18:
            r0 = move-exception
            goto L2b
        L1a:
            if (r1 == 0) goto L2a
        L1c:
            r1.close()     // Catch: java.lang.Exception -> L20
            goto L2a
        L20:
            com.baidu.liantian.b.e.a()
            goto L2a
        L24:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L2a
            goto L1c
        L2a:
            return r0
        L2b:
            if (r1 == 0) goto L34
            r1.close()     // Catch: java.lang.Exception -> L31
            goto L34
        L31:
            com.baidu.liantian.b.e.a()
        L34:
            throw r0
    }

    public final boolean b(java.lang.String r10) {
            r9 = this;
            r0 = 1
            java.lang.String r4 = "b=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r1 = r9.f6004d     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "c"
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L26
            if (r10 == 0) goto L1c
            int r1 = r10.getCount()     // Catch: java.lang.Throwable -> L27
            if (r1 <= 0) goto L1c
            r0 = 0
        L1c:
            if (r10 == 0) goto L2d
        L1e:
            r10.close()     // Catch: java.lang.Exception -> L22
            goto L2d
        L22:
            com.baidu.liantian.b.e.a()
            goto L2d
        L26:
            r10 = 0
        L27:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L2e
            if (r10 == 0) goto L2d
            goto L1e
        L2d:
            return r0
        L2e:
            r0 = move-exception
            if (r10 == 0) goto L38
            r10.close()     // Catch: java.lang.Exception -> L35
            goto L38
        L35:
            com.baidu.liantian.b.e.a()
        L38:
            throw r0
    }

    public final int c() {
            r6 = this;
            com.baidu.liantian.e r0 = new com.baidu.liantian.e
            android.content.Context r1 = r6.f6005e
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r0.f5994e
            java.lang.String r3 = "re_net_over"
            r4 = 7
            int r0 = r0.getInt(r3, r4)
            r3 = 86400000(0x5265c00, float:7.82218E-36)
            int r0 = r0 * r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            java.lang.String r4 = "(d <= ? or (d < ("
            r3.<init>(r4)     // Catch: java.lang.Exception -> L3f
            r3.append(r1)     // Catch: java.lang.Exception -> L3f
            java.lang.String r4 = "-f*3600000) and f!= 0)) and b != '1001001'and i != 5 "
            r3.append(r4)     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L3f
            long r4 = (long) r0     // Catch: java.lang.Exception -> L3f
            long r1 = r1 - r4
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L3f
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L3f
            android.database.sqlite.SQLiteDatabase r1 = r6.f6004d     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "r"
            int r0 = r1.delete(r2, r3, r0)     // Catch: java.lang.Exception -> L3f
            return r0
        L3f:
            com.baidu.liantian.b.e.a()
            r0 = -1
            return r0
    }
}
