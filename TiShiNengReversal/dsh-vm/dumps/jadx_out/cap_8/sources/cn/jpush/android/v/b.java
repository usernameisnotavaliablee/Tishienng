package cn.jpush.android.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jpush.android.v.e {
    private static final java.lang.String[] a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cn.jpush.android.v.b f1968b;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f1969c = null;

    static {
            java.lang.String r6 = "ln_trigger_time"
            java.lang.String r7 = "ln_add_time"
            java.lang.String r0 = "_id"
            java.lang.String r1 = "ln_id"
            java.lang.String r2 = "ln_count"
            java.lang.String r3 = "ln_remove"
            java.lang.String r4 = "ln_type"
            java.lang.String r5 = "ln_extra"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            cn.jpush.android.v.b.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.v.b.f1969c = r0
            return
    }

    private b(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "jpush_local_notification.db"
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public static cn.jpush.android.v.b a(android.content.Context r2) {
            cn.jpush.android.v.b r0 = cn.jpush.android.v.b.f1968b
            if (r0 != 0) goto L21
            java.lang.Object r0 = cn.jpush.android.v.b.f1969c
            monitor-enter(r0)
            cn.jpush.android.v.b r1 = cn.jpush.android.v.b.f1968b     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            cn.jpush.android.v.b r1 = new cn.jpush.android.v.b     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.v.b.f1968b = r1     // Catch: java.lang.Throwable -> L1b
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
            cn.jpush.android.v.b r2 = cn.jpush.android.v.b.f1968b
            return r2
    }

    public static cn.jpush.android.v.c a(android.database.Cursor r5) {
            r0 = 0
            java.lang.String r1 = "LocalNotificationDb"
            if (r5 == 0) goto L72
            int r2 = r5.getCount()
            if (r2 != 0) goto Lc
            goto L72
        Lc:
            cn.jpush.android.v.c r2 = new cn.jpush.android.v.c     // Catch: java.lang.Exception -> L55
            r2.<init>()     // Catch: java.lang.Exception -> L55
            r3 = 1
            long r3 = r5.getLong(r3)     // Catch: java.lang.Exception -> L55
            r2.a(r3)     // Catch: java.lang.Exception -> L55
            r3 = 2
            int r3 = r5.getInt(r3)     // Catch: java.lang.Exception -> L55
            r2.a(r3)     // Catch: java.lang.Exception -> L55
            r3 = 3
            int r3 = r5.getInt(r3)     // Catch: java.lang.Exception -> L55
            r2.b(r3)     // Catch: java.lang.Exception -> L55
            r3 = 4
            int r3 = r5.getInt(r3)     // Catch: java.lang.Exception -> L55
            r2.c(r3)     // Catch: java.lang.Exception -> L55
            r3 = 5
            java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> L55
            java.lang.String r3 = cn.jpush.android.ad.c.c(r3)     // Catch: java.lang.Exception -> L55
            r2.a(r3)     // Catch: java.lang.Exception -> L55
            r3 = 6
            long r3 = r5.getLong(r3)     // Catch: java.lang.Exception -> L55
            r2.c(r3)     // Catch: java.lang.Exception -> L55
            r3 = 7
            long r3 = r5.getLong(r3)     // Catch: java.lang.Exception -> L55
            r2.b(r3)     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L55
            cn.jpush.android.helper.Logger.i(r1, r5)     // Catch: java.lang.Exception -> L55
            return r2
        L55:
            r5 = move-exception
            r5.getStackTrace()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initLocalNotificationDBData exception:"
            r2.append(r3)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jpush.android.helper.Logger.w(r1, r5)
            return r0
        L72:
            java.lang.String r5 = "cursor is null"
            cn.jpush.android.helper.Logger.d(r1, r5)
            return r0
    }

    public int a(long r4) {
            r3 = this;
            r0 = 1
            boolean r1 = r3.a(r0)
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            java.lang.String r2 = "ln_id="
            r1.append(r2)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            r1.append(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            android.database.sqlite.SQLiteDatabase r5 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            java.lang.String r1 = "t_localnotification"
            r2 = 0
            int r4 = r5.delete(r1, r4, r2)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            r3.b(r0)
            return r4
        L27:
            r4 = move-exception
            r3.b(r0)
            throw r4
        L2c:
            r3.b(r0)
        L2f:
            r4 = 0
            return r4
    }

    public long a(long r4, int r6, int r7, int r8, java.lang.String r9, long r10, long r12) {
            r3 = this;
            r0 = 1
            boolean r1 = r3.a(r0)
            if (r1 == 0) goto L62
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r2 = "ln_id"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r4 = "ln_count"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r4 = "ln_remove"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r4 = "ln_type"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r4 = "ln_extra"
            java.lang.String r5 = cn.jpush.android.ad.c.c(r9)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r4 = "ln_trigger_time"
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r4 = "ln_add_time"
            java.lang.Long r5 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            android.database.sqlite.SQLiteDatabase r4 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            java.lang.String r5 = "t_localnotification"
            r6 = 0
            long r4 = r4.insert(r5, r6, r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
            r3.b(r0)
            return r4
        L5a:
            r4 = move-exception
            r3.b(r0)
            throw r4
        L5f:
            r3.b(r0)
        L62:
            r4 = 0
            return r4
    }

    public android.database.Cursor a(int r12, long r13) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ln_count="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " and "
            r0.append(r12)
            java.lang.String r12 = "ln_trigger_time"
            r0.append(r12)
            java.lang.String r12 = "<"
            r0.append(r12)
            r0.append(r13)
            java.lang.String r5 = r0.toString()
            android.database.sqlite.SQLiteDatabase r1 = r11.getReadableDatabase()     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "t_localnotification"
            java.lang.String[] r4 = cn.jpush.android.v.b.a     // Catch: java.lang.Exception -> L36
            r9 = 0
            r10 = 0
            r2 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L36
            return r12
        L36:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getOutDatas exception:"
            r13.append(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = "LocalNotificationDb"
            cn.jpush.android.helper.Logger.w(r13, r12)
            r12 = 0
            return r12
    }

    public android.database.Cursor a(long r12, long r14) {
            r11 = this;
            long r14 = r14 + r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ln_count>0 and ln_trigger_time<"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = " and "
            r0.append(r14)
            java.lang.String r14 = "ln_trigger_time"
            r0.append(r14)
            java.lang.String r14 = ">"
            r0.append(r14)
            r0.append(r12)
            java.lang.String r5 = r0.toString()
            android.database.sqlite.SQLiteDatabase r1 = r11.getReadableDatabase()     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = "t_localnotification"
            java.lang.String[] r4 = cn.jpush.android.v.b.a     // Catch: java.lang.Exception -> L37
            r9 = 0
            r10 = 0
            r2 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L37
            return r12
        L37:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getRtcDatas exception:"
            r13.append(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = "LocalNotificationDb"
            cn.jpush.android.helper.Logger.w(r13, r12)
            r12 = 0
            return r12
    }

    public cn.jpush.android.v.c a(long r14, int r16) {
            r13 = this;
            r1 = 0
            boolean r0 = r13.a(r1)
            if (r0 == 0) goto L5e
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "ln_id="
            r0.append(r3)     // Catch: java.lang.Throwable -> L45
            r0.append(r14)     // Catch: java.lang.Throwable -> L45
            java.lang.String r14 = " and "
            r0.append(r14)     // Catch: java.lang.Throwable -> L45
            java.lang.String r14 = "ln_type"
            r0.append(r14)     // Catch: java.lang.Throwable -> L45
            java.lang.String r14 = "="
            r0.append(r14)     // Catch: java.lang.Throwable -> L45
            r14 = r16
            r0.append(r14)     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L45
            android.database.sqlite.SQLiteDatabase r3 = r13.getReadableDatabase()     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "t_localnotification"
            java.lang.String[] r6 = cn.jpush.android.v.b.a     // Catch: java.lang.Throwable -> L45
            r11 = 0
            r12 = 0
            r4 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L48
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L45
            goto L48
        L45:
            r0 = move-exception
            r14 = r0
            goto L55
        L48:
            cn.jpush.android.v.c r14 = a(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L51
            r2.close()
        L51:
            r13.b(r1)
            return r14
        L55:
            if (r2 == 0) goto L5a
            r2.close()
        L5a:
            r13.b(r1)
            throw r14
        L5e:
            java.lang.Exception r14 = new java.lang.Exception
            java.lang.String r15 = "open database failed"
            r14.<init>(r15)
            throw r14
    }

    public int[] a() {
            r13 = this;
            java.lang.String r4 = "1"
            r10 = 0
            boolean r0 = r13.a(r10)
            r11 = 0
            if (r0 == 0) goto L95
            r12 = 1
            java.lang.String r0 = "ln_id"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            android.database.sqlite.SQLiteDatabase r0 = r13.getReadableDatabase()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            java.lang.String r2 = "t_localnotification"
            r8 = 0
            r9 = 0
            r1 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r1 == 0) goto L4b
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            if (r0 <= 0) goto L4b
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            int[] r11 = new int[r0]     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            r0 = 0
        L33:
            int r2 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            r11[r0] = r2     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            int r0 = r0 + 1
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            if (r2 != 0) goto L33
            goto L4b
        L42:
            r0 = move-exception
            r11 = r1
        L44:
            r1 = 0
            goto L79
        L46:
            r0 = r11
            r11 = r1
        L49:
            r1 = 0
            goto L87
        L4b:
            boolean r0 = r13.a(r12)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L46
            if (r0 == 0) goto L65
            java.lang.String r0 = "delete from t_localnotification"
            android.database.sqlite.SQLiteDatabase r2 = r13.getWritableDatabase()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            r0 = 1
            goto L66
        L5c:
            r0 = move-exception
            r11 = r1
            r1 = 1
            goto L79
        L60:
            r0 = r11
            r11 = r1
            r1 = 1
            goto L87
        L65:
            r0 = 0
        L66:
            if (r1 == 0) goto L6b
            r1.close()
        L6b:
            r13.b(r10)
            if (r0 == 0) goto L73
            r13.b(r12)
        L73:
            return r11
        L74:
            r0 = move-exception
            goto L44
        L76:
            r0 = r11
            goto L49
        L79:
            if (r11 == 0) goto L7e
            r11.close()
        L7e:
            r13.b(r10)
            if (r1 == 0) goto L86
            r13.b(r12)
        L86:
            throw r0
        L87:
            if (r11 == 0) goto L8c
            r11.close()
        L8c:
            r13.b(r10)
            if (r1 == 0) goto L94
            r13.b(r12)
        L94:
            return r0
        L95:
            return r11
    }

    public long b(long r5, int r7, int r8, int r9, java.lang.String r10, long r11, long r13) {
            r4 = this;
            r0 = 1
            boolean r1 = r4.a(r0)
            if (r1 == 0) goto L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r2 = "ln_id="
            r1.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r1.append(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r3 = "ln_id"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r5 = "ln_count"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r5 = "ln_remove"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r5 = "ln_type"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r5 = "ln_extra"
            java.lang.String r6 = cn.jpush.android.ad.c.c(r10)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r5 = "ln_trigger_time"
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r5 = "ln_add_time"
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            java.lang.String r6 = "t_localnotification"
            r7 = 0
            int r5 = r5.update(r6, r2, r1, r7)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            long r5 = (long) r5
            r4.b(r0)
            return r5
        L6c:
            r5 = move-exception
            r4.b(r0)
            throw r5
        L71:
            r4.b(r0)
        L74:
            r5 = 0
            return r5
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE t_localnotification (_id INTEGER PRIMARY KEY AUTOINCREMENT ,ln_id long not null,ln_count integer not null,ln_remove integer not null,ln_type integer not null,ln_extra text ,ln_trigger_time long ,ln_add_time long );"
            r2.execSQL(r0)     // Catch: java.lang.Exception -> L6
            return
        L6:
            java.lang.String r2 = "LocalNotificationDb"
            java.lang.String r0 = "表已经存在"
            cn.jpush.android.helper.Logger.v(r2, r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE IF EXISTS t_localnotification"
            r1.execSQL(r2)
            r0.onCreate(r1)
            return
    }
}
