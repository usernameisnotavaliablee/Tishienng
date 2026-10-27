package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class t {
    private static com.kuaishou.weapon.p0.t E = null;
    public static final java.lang.String a = "k";
    public static final java.lang.String b = "p";
    public static final java.lang.String c = "v";
    public static final java.lang.String d = "l";
    public static final java.lang.String e = "i";
    public static final java.lang.String f = "a";
    public static final java.lang.String g = "s";
    public static final java.lang.String h = "n";
    public static final java.lang.String i = "u";
    public static final java.lang.String j = "c";
    public static final java.lang.String k = "r";
    public static final java.lang.String l = "b";
    public static final java.lang.String m = "m";
    public static final java.lang.String n = "el";
    public static final java.lang.String o = "ail";
    public static final java.lang.String p = "aps";
    public static final java.lang.String q = "dp";
    public static final java.lang.String r = "pcn";
    public static final java.lang.String s = "pst";
    public static final java.lang.String t = "d";
    public static final java.lang.String u = "at";
    public static final java.lang.String v = "dm";
    public static final java.lang.String w = "rm";
    public static final java.lang.String x = "pc";
    public static final java.lang.String y = "cbl";
    private java.lang.String A;
    private com.kuaishou.weapon.p0.t.a B;
    private android.database.sqlite.SQLiteDatabase C;
    private android.content.Context D;
    private int z;

    class a extends android.database.sqlite.SQLiteOpenHelper {
        final /* synthetic */ com.kuaishou.weapon.p0.t a;

        public a(com.kuaishou.weapon.p0.t r3, android.content.Context r4) {
                r2 = this;
                r2.a = r3
                r0 = 0
                int r3 = com.kuaishou.weapon.p0.t.a(r3)
                java.lang.String r1 = "w.db"
                r2.<init>(r4, r1, r0, r3)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                com.kuaishou.weapon.p0.t r0 = r1.a     // Catch: java.lang.Throwable -> L9
                java.lang.String r0 = com.kuaishou.weapon.p0.t.b(r0)     // Catch: java.lang.Throwable -> L9
                r2.execSQL(r0)     // Catch: java.lang.Throwable -> L9
            L9:
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                r0 = 3
                if (r3 >= r0) goto L17
                if (r4 < r0) goto L17
                r2.beginTransaction()     // Catch: java.lang.Throwable -> L17
                java.lang.String r3 = "ALTER TABLE wp ADD COLUMN pc INTEGER  DEFAULT -1"
                r2.execSQL(r3)     // Catch: java.lang.Throwable -> L14
                r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L14
                r2.endTransaction()     // Catch: java.lang.Throwable -> L17
                return
            L14:
                r2.endTransaction()     // Catch: java.lang.Throwable -> L17
            L17:
                return
        }
    }

    private t(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.z = r0
            java.lang.String r0 = "create table wp(k INTEGER PRIMARY KEY ON CONFLICT ABORT,p TEXT UNIQUE ON CONFLICT ABORT,v TEXT,n INTEGER,s INTEGER,i INTEGER,u INTEGER,el INTEGER,c INTEGER,r INTEGER,aps INTEGER,dp TEXT,pcn TEXT,b TEXT,m TEXT,ail BLOB,pst INTEGER,d INTEGER,at INTEGER,dm TEXT,rm INTEGER,l TEXT,pc INTEGER DEFAULT -1,a TEXT,cbl INTEGER)"
            r2.A = r0
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r2.D = r0
            com.kuaishou.weapon.p0.t$a r0 = new com.kuaishou.weapon.p0.t$a
            android.content.Context r1 = r3.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.<init>(r2, r1)
            r2.B = r0
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L3a
            java.io.File r3 = r3.getParentFile()     // Catch: java.lang.Throwable -> L3a
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L32
            goto L3a
        L32:
            com.kuaishou.weapon.p0.t$a r3 = r2.B     // Catch: java.lang.Throwable -> L3a
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L3a
            r2.C = r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            return
    }

    static /* synthetic */ int a(com.kuaishou.weapon.p0.t r0) {
            int r0 = r0.z
            return r0
    }

    public static synchronized com.kuaishou.weapon.p0.t a(android.content.Context r2) {
            java.lang.Class<com.kuaishou.weapon.p0.t> r0 = com.kuaishou.weapon.p0.t.class
            monitor-enter(r0)
            com.kuaishou.weapon.p0.t r1 = com.kuaishou.weapon.p0.t.E     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.kuaishou.weapon.p0.t r1 = new com.kuaishou.weapon.p0.t     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.kuaishou.weapon.p0.t.E = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.kuaishou.weapon.p0.t r2 = com.kuaishou.weapon.p0.t.E     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    static /* synthetic */ java.lang.String b(com.kuaishou.weapon.p0.t r0) {
            java.lang.String r0 = r0.A
            return r0
    }

    public int a(int r5, int r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "u"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L26
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r6 = r4.C     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "wp"
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

    public long a(com.kuaishou.weapon.p0.s r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            return r0
        L5:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            int r3 = r9.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "n"
            r2.put(r4, r3)
            int r3 = r9.p
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "aps"
            r2.put(r4, r3)
            java.lang.String r3 = "p"
            java.lang.String r4 = r9.c
            r2.put(r3, r4)
            java.lang.String r3 = r9.e
            java.lang.String r4 = "a"
            r2.put(r4, r3)
            java.lang.String r3 = "l"
            java.lang.String r5 = r9.h
            r2.put(r3, r5)
            java.lang.String r3 = "v"
            java.lang.String r5 = r9.d
            r2.put(r3, r5)
            java.lang.String r3 = "dp"
            java.lang.String r5 = r9.n
            r2.put(r3, r5)
            java.lang.String r3 = r9.e
            r2.put(r4, r3)
            java.lang.String r3 = "pcn"
            java.lang.String r4 = r9.o
            r2.put(r3, r4)
            long r3 = r9.s
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "pst"
            r2.put(r4, r3)
            int r3 = r9.w
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "rm"
            r2.put(r4, r3)
            int r3 = r9.q
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "at"
            r2.put(r4, r3)
            int r3 = r9.x
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "pc"
            r2.put(r4, r3)
            boolean r3 = r9.y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "cbl"
            r2.put(r4, r3)
            java.lang.String r3 = r9.j
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L95
            java.lang.String r3 = "dm"
            java.lang.String r4 = r9.j
            r2.put(r3, r4)
        L95:
            int r3 = r9.a
            boolean r3 = r8.b(r3)
            r4 = 0
            java.lang.String r5 = "wp"
            if (r3 == 0) goto Lb8
            android.database.sqlite.SQLiteDatabase r3 = r8.C     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r7 = "k="
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc9
            int r9 = r9.a     // Catch: java.lang.Throwable -> Lc9
            r6.append(r9)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> Lc9
            int r9 = r3.update(r5, r2, r9, r4)     // Catch: java.lang.Throwable -> Lc9
            long r0 = (long) r9     // Catch: java.lang.Throwable -> Lc9
            return r0
        Lb8:
            java.lang.String r3 = "k"
            int r9 = r9.a     // Catch: java.lang.Throwable -> Lc9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc9
            r2.put(r3, r9)     // Catch: java.lang.Throwable -> Lc9
            android.database.sqlite.SQLiteDatabase r9 = r8.C     // Catch: java.lang.Throwable -> Lc9
            long r0 = r9.insert(r5, r4, r2)     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            return r0
    }

    public com.kuaishou.weapon.p0.s a(int r10) {
            r9 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.C     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r2 = "wp"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r4 = "k="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lf8
            r3.append(r10)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> Lf8
            r7 = 0
            r8 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf8
            if (r1 == 0) goto Lec
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> Le9
            if (r2 == 0) goto Lec
            com.kuaishou.weapon.p0.s r2 = new com.kuaishou.weapon.p0.s     // Catch: java.lang.Throwable -> Le9
            r2.<init>()     // Catch: java.lang.Throwable -> Le9
            r2.a = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "n"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> Le6
            r2.b = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "p"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> Le6
            r2.c = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "a"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> Le6
            r2.e = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "l"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> Le6
            r2.h = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "v"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> Le6
            r2.d = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "dp"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> Le6
            r2.n = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "aps"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> Le6
            r2.p = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "pcn"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> Le6
            r2.o = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "at"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> Le6
            r2.q = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "pst"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> Le6
            r2.s = r3     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "d"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> Le6
            r2.t = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "rm"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> Le6
            r2.w = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "dm"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> Le6
            r2.j = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "pc"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> Le6
            r2.x = r10     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "cbl"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Le6
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> Le6
            r0 = 1
            if (r10 != r0) goto Le1
            goto Le2
        Le1:
            r0 = 0
        Le2:
            r2.y = r0     // Catch: java.lang.Throwable -> Le6
            r0 = r2
            goto Lec
        Le6:
        Le7:
            r0 = r1
            goto Lfa
        Le9:
            r2 = r0
            goto Le7
        Lec:
            if (r1 == 0) goto Lf7
            boolean r10 = r1.isClosed()
            if (r10 != 0) goto Lf7
            r1.close()
        Lf7:
            return r0
        Lf8:
            r2 = r0
        Lfa:
            if (r0 == 0) goto L105
            boolean r10 = r0.isClosed()
            if (r10 != 0) goto L105
            r0.close()
        L105:
            return r2
    }

    public java.util.List<com.kuaishou.weapon.p0.s> a() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r9.C     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = "wp"
            r7 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto La4
        L15:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto La4
            com.kuaishou.weapon.p0.s r2 = new com.kuaishou.weapon.p0.s     // Catch: java.lang.Throwable -> La2
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "k"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.a = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "p"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.c = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "a"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.e = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "l"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.h = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "v"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.d = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "pst"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> La2
            r2.s = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "d"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.t = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "rm"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.w = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "pc"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.x = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "cbl"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r4 = 1
            if (r3 != r4) goto L9a
            goto L9b
        L9a:
            r4 = 0
        L9b:
            r2.y = r4     // Catch: java.lang.Throwable -> La2
            r0.add(r2)     // Catch: java.lang.Throwable -> La2
            goto L15
        La2:
            goto Lb1
        La4:
            if (r1 == 0) goto Lbc
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto Lbc
            r1.close()
            return r0
        Lb0:
            r1 = 0
        Lb1:
            if (r1 == 0) goto Lbc
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto Lbc
            r1.close()
        Lbc:
            return r0
    }

    public void a(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L14
        L7:
            android.database.sqlite.SQLiteDatabase r0 = r3.C     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "wp"
            java.lang.String r2 = "p=?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L14
            r0.delete(r1, r2, r4)     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    public com.kuaishou.weapon.p0.s b(java.lang.String r11) {
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.database.sqlite.SQLiteDatabase r2 = r10.C     // Catch: java.lang.Throwable -> L100
            java.lang.String r3 = "wp"
            java.lang.String r5 = "p=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L100
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L100
            if (r11 == 0) goto Lf4
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto Lf4
            com.kuaishou.weapon.p0.s r0 = new com.kuaishou.weapon.p0.s     // Catch: java.lang.Throwable -> Lf1
            r0.<init>()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r1 = "k"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r0.a = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "n"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r0.b = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "p"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> Lee
            r0.c = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "a"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> Lee
            r0.e = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "l"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> Lee
            r0.h = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "v"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> Lee
            r0.d = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "dp"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> Lee
            r0.n = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "aps"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r0.p = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "pcn"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> Lee
            r0.o = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "at"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r0.q = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "pst"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            long r1 = r11.getLong(r1)     // Catch: java.lang.Throwable -> Lee
            r0.s = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "d"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r0.t = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "rm"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r0.w = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "dm"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> Lee
            r0.j = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "pc"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r0.x = r1     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "cbl"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = r11.getInt(r1)     // Catch: java.lang.Throwable -> Lee
            r2 = 1
            if (r1 != r2) goto Le9
            goto Lea
        Le9:
            r2 = 0
        Lea:
            r0.y = r2     // Catch: java.lang.Throwable -> Lee
            r1 = r0
            goto Lf4
        Lee:
        Lef:
            r1 = r11
            goto L102
        Lf1:
            r0 = r1
            goto Lef
        Lf4:
            if (r11 == 0) goto Lff
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto Lff
            r11.close()
        Lff:
            return r1
        L100:
            r0 = r1
        L102:
            if (r1 == 0) goto L10d
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L10d
            r1.close()
        L10d:
            return r0
    }

    public void b() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r7.a()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            com.kuaishou.weapon.p0.s r2 = (com.kuaishou.weapon.p0.s) r2
            java.lang.String r3 = r2.e
            boolean r3 = com.kuaishou.weapon.p0.dn.a(r3)
            if (r3 != 0) goto Ld
            r0.add(r2)
            goto Ld
        L25:
            com.kuaishou.weapon.p0.r r1 = com.kuaishou.weapon.p0.r.a()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
        L2d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lad
            com.kuaishou.weapon.p0.s r2 = (com.kuaishou.weapon.p0.s) r2     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L40
            java.lang.String r3 = r2.e     // Catch: java.lang.Throwable -> Lad
            r1.a(r3)     // Catch: java.lang.Throwable -> Lad
        L40:
            android.database.sqlite.SQLiteDatabase r3 = r7.C     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = "wp"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lad
            int r6 = r2.a     // Catch: java.lang.Throwable -> Lad
            r5.append(r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lad
            r6 = 0
            r3.delete(r4, r5, r6)     // Catch: java.lang.Throwable -> Lad
            java.util.List<java.lang.Integer> r3 = com.kuaishou.weapon.p0.r.b     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L8b
            int r4 = r2.a     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lad
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> Lad
            if (r3 != 0) goto L8b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r3.<init>()     // Catch: java.lang.Throwable -> Lad
            android.content.Context r4 = r7.D     // Catch: java.lang.Throwable -> Lad
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = r4.getCanonicalPath()     // Catch: java.lang.Throwable -> Lad
            r3.append(r4)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = "/."
            r3.append(r4)     // Catch: java.lang.Throwable -> Lad
            int r4 = r2.a     // Catch: java.lang.Throwable -> Lad
            r3.append(r4)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lad
            com.kuaishou.weapon.p0.dn.c(r3)     // Catch: java.lang.Throwable -> Lad
        L8b:
            java.util.Map r3 = r1.b()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L2d
            java.util.Map r3 = r1.b()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = r2.c     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L2d
            android.content.Context r3 = r7.D     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = r2.c     // Catch: java.lang.Throwable -> Lad
            java.io.File r2 = r3.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Lad
            com.kuaishou.weapon.p0.dn.c(r2)     // Catch: java.lang.Throwable -> Lad
            goto L2d
        Lad:
            return
    }

    public void b(int r5, int r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "n"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L24
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L24
            android.database.sqlite.SQLiteDatabase r6 = r4.C     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "wp"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "k="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L24
            r2.append(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r6.update(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    public boolean b(int r10) {
            r9 = this;
            java.lang.String r1 = "wp"
            r8 = 0
            android.database.sqlite.SQLiteDatabase r0 = r9.C     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "p"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "k="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39
            r3.append(r10)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L39
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L2d
            int r0 = r10.getCount()     // Catch: java.lang.Throwable -> L2b
            if (r0 <= 0) goto L2d
            r8 = 1
            goto L2d
        L2b:
            goto L3a
        L2d:
            if (r10 == 0) goto L38
            boolean r0 = r10.isClosed()
            if (r0 != 0) goto L38
            r10.close()
        L38:
            return r8
        L39:
            r10 = 0
        L3a:
            if (r10 == 0) goto L45
            boolean r0 = r10.isClosed()
            if (r0 != 0) goto L45
            r10.close()
        L45:
            return r8
    }

    public int c(int r11) {
            r10 = this;
            java.lang.String r0 = "n"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.C     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "wp"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L40
            r5.append(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L40
            if (r11 == 0) goto L34
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L32
            int r1 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            goto L41
        L34:
            if (r11 == 0) goto L3f
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L3f
            r11.close()
        L3f:
            return r1
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4c
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4c
            r11.close()
        L4c:
            return r1
    }

    public void c() {
            r5 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "n"
            r0.put(r2, r1)
            android.database.sqlite.SQLiteDatabase r1 = r5.C     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "wp"
            java.lang.String r3 = "n=-1"
            r4 = 0
            r1.update(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public void c(int r5, int r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "pc"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L24
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L24
            android.database.sqlite.SQLiteDatabase r6 = r4.C     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "wp"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "k="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L24
            r2.append(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r6.update(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    public void d() {
            r5 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "u"
            r0.put(r2, r1)
            android.database.sqlite.SQLiteDatabase r1 = r5.C     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "wp"
            java.lang.String r3 = "u=1"
            r4 = 0
            r1.update(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public boolean d(int r11) {
            r10 = this;
            java.lang.String r0 = "s"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.C     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "wp"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L44
            r5.append(r11)     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L44
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L38
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L38
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L36
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L36
            r2 = 1
            if (r0 != r2) goto L38
            r1 = 1
            goto L38
        L36:
            goto L45
        L38:
            if (r11 == 0) goto L43
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L43
            r11.close()
        L43:
            return r1
        L44:
            r11 = 0
        L45:
            if (r11 == 0) goto L50
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L50
            r11.close()
        L50:
            return r1
    }
}
