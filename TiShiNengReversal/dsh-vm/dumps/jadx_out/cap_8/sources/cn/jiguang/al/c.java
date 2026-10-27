package cn.jiguang.al;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public static long a = 314572800;

    /* renamed from: b, reason: collision with root package name */
    public static long f571b = 7000;

    /* renamed from: c, reason: collision with root package name */
    public static long f572c = 104857600;

    /* renamed from: d, reason: collision with root package name */
    public static long f573d = 3000;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f574e = "sync_net_monitor";

    /* renamed from: f, reason: collision with root package name */
    private org.json.JSONObject f575f;

    /* renamed from: g, reason: collision with root package name */
    private long f576g;

    /* renamed from: h, reason: collision with root package name */
    private long f577h;

    /* renamed from: i, reason: collision with root package name */
    private long f578i;

    /* renamed from: j, reason: collision with root package name */
    private long f579j;

    /* renamed from: k, reason: collision with root package name */
    private long f580k;
    private long l;
    private android.content.Context m;
    private java.lang.Boolean n;
    private long o;
    private long p;
    private long q;



    private static final class a {
        private static final cn.jiguang.al.c a = null;

        static {
                cn.jiguang.al.c r0 = new cn.jiguang.al.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.al.c.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.al.c a() {
                cn.jiguang.al.c r0 = cn.jiguang.al.c.a.a
                return r0
        }
    }

    static {
            return
    }

    private c() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.p = r0
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.q = r0
            android.content.Context r0 = cn.jiguang.av.c.a()
            r2.m = r0
            r0 = 0
            r2.a(r0)
            return
    }

    /* synthetic */ c(cn.jiguang.al.c.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private long a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "yyyyMMdd"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2c
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L2c
            java.util.Date r3 = r0.parse(r3)     // Catch: java.lang.Exception -> L2c
            r1.setTime(r3)     // Catch: java.lang.Exception -> L2c
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L2c
            java.util.Date r4 = r0.parse(r4)     // Catch: java.lang.Exception -> L2c
            r3.setTime(r4)     // Catch: java.lang.Exception -> L2c
            long r0 = r1.getTimeInMillis()     // Catch: java.lang.Exception -> L2c
            long r3 = r3.getTimeInMillis()     // Catch: java.lang.Exception -> L2c
            long r0 = r0 - r3
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r3
            return r0
        L2c:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
    }

    public static cn.jiguang.al.c a() {
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a.a()
            return r0
    }

    private java.lang.String a(android.content.Context r3, boolean r4) {
            r2 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> Lc
            if (r4 == 0) goto Le
            r4 = 5
            r1 = -1
            r0.add(r4, r1)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r3 = move-exception
            goto L53
        Le:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "yyyyMMdd"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            java.util.Date r0 = r0.getTime()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r4.format(r0)     // Catch: java.lang.Throwable -> Lc
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r1.<init>()     // Catch: java.lang.Throwable -> Lc
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> Lc
            r1.append(r3)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = "/nes"
            r1.append(r3)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lc
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r1.<init>()     // Catch: java.lang.Throwable -> Lc
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = ".l"
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = cn.jiguang.av.i.c(r3)     // Catch: java.lang.Throwable -> Lc
            return r3
        L53:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "read Throwable "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "NetDataMonitorManager"
            cn.jiguang.w.f.i(r4, r3)
            java.lang.String r3 = ""
            return r3
    }

    static /* synthetic */ org.json.JSONObject a(cn.jiguang.al.c r0) {
            org.json.JSONObject r0 = r0.f()
            return r0
    }

    static /* synthetic */ org.json.JSONObject a(cn.jiguang.al.c r0, org.json.JSONObject r1) {
            r0.f575f = r1
            return r1
    }

    private void a(long r9, long r11, long r13, java.lang.String r15) {
            r8 = this;
            r8.h()
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.p
            long r0 = r0 - r2
            long r2 = r8.q
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r2 = "NetDataMonitorManager"
            if (r1 != 0) goto Lc1
            java.lang.String r1 = "conn"
            boolean r15 = r15.contains(r1)
            if (r15 == 0) goto Lc1
            long r6 = r8.l
            long r6 = r6 + r13
            r8.l = r6
            long r13 = r8.f579j
            long r13 = r13 + r9
            r8.f579j = r13
            long r9 = r8.f580k
            long r9 = r9 + r11
            r8.f580k = r9
            android.content.Context r9 = r8.m
            cn.jiguang.e.a r10 = cn.jiguang.e.a.A()
            long r11 = r8.l
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            cn.jiguang.e.a r10 = r10.a(r11)
            cn.jiguang.e.a[] r11 = new cn.jiguang.e.a[r5]
            r11[r4] = r10
            cn.jiguang.e.b.a(r9, r11)
            android.content.Context r9 = r8.m
            cn.jiguang.e.a r10 = cn.jiguang.e.a.B()
            long r11 = r8.f580k
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            cn.jiguang.e.a r10 = r10.a(r11)
            cn.jiguang.e.a[] r11 = new cn.jiguang.e.a[r5]
            r11[r4] = r10
            cn.jiguang.e.b.a(r9, r11)
            android.content.Context r9 = r8.m
            cn.jiguang.e.a r10 = cn.jiguang.e.a.z()
            long r11 = r8.f579j
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            cn.jiguang.e.a r10 = r10.a(r11)
            cn.jiguang.e.a[] r11 = new cn.jiguang.e.a[r5]
            r11[r4] = r10
            cn.jiguang.e.b.a(r9, r11)
            if (r0 != 0) goto L7d
            goto L117
        L7d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "current conn data mAllReqLength, "
            r9.append(r10)
            long r10 = r8.f579j
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.i(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "current conn data mAllResLength, "
            r9.append(r10)
            long r10 = r8.f580k
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.i(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "current conn mAllCount, "
            r9.append(r10)
            long r10 = r8.l
        Lb5:
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.i(r2, r9)
            goto L152
        Lc1:
            long r6 = r8.f578i
            long r6 = r6 + r13
            r8.f578i = r6
            long r13 = r8.f577h
            long r13 = r13 + r11
            r8.f577h = r13
            long r11 = r8.f576g
            long r11 = r11 + r9
            r8.f576g = r11
            android.content.Context r9 = r8.m
            cn.jiguang.e.a r10 = cn.jiguang.e.a.x()
            long r11 = r8.f578i
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            cn.jiguang.e.a r10 = r10.a(r11)
            cn.jiguang.e.a[] r11 = new cn.jiguang.e.a[r5]
            r11[r4] = r10
            cn.jiguang.e.b.a(r9, r11)
            android.content.Context r9 = r8.m
            cn.jiguang.e.a r10 = cn.jiguang.e.a.y()
            long r11 = r8.f577h
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            cn.jiguang.e.a r10 = r10.a(r11)
            cn.jiguang.e.a[] r11 = new cn.jiguang.e.a[r5]
            r11[r4] = r10
            cn.jiguang.e.b.a(r9, r11)
            android.content.Context r9 = r8.m
            cn.jiguang.e.a r10 = cn.jiguang.e.a.w()
            long r11 = r8.f576g
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            cn.jiguang.e.a r10 = r10.a(r11)
            cn.jiguang.e.a[] r11 = new cn.jiguang.e.a[r5]
            r11[r4] = r10
            cn.jiguang.e.b.a(r9, r11)
            if (r0 != 0) goto L118
        L117:
            return
        L118:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "current data mAllReqLength, "
            r9.append(r10)
            long r10 = r8.f576g
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.i(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "current data mAllResLength, "
            r9.append(r10)
            long r10 = r8.f577h
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.i(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "current  mAllCount, "
            r9.append(r10)
            long r10 = r8.f578i
            goto Lb5
        L152:
            long r9 = java.lang.System.currentTimeMillis()
            r8.p = r9
            r8.g()
            return
    }

    private void a(android.content.Context r9, org.json.JSONObject r10) {
            r8 = this;
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L87
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L87
            r1.<init>()     // Catch: java.io.IOException -> L87
            java.io.File r9 = r9.getFilesDir()     // Catch: java.io.IOException -> L87
            r1.append(r9)     // Catch: java.io.IOException -> L87
            java.lang.String r9 = "/nes"
            r1.append(r9)     // Catch: java.io.IOException -> L87
            java.lang.String r9 = r1.toString()     // Catch: java.io.IOException -> L87
            r0.<init>(r9)     // Catch: java.io.IOException -> L87
            boolean r9 = r0.exists()     // Catch: java.io.IOException -> L87
            if (r9 != 0) goto L23
            r0.mkdirs()     // Catch: java.io.IOException -> L87
        L23:
            java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch: java.io.IOException -> L87
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.io.IOException -> L87
            java.lang.String r2 = "yyyyMMdd"
            r1.<init>(r2)     // Catch: java.io.IOException -> L87
            java.util.Date r9 = r9.getTime()     // Catch: java.io.IOException -> L87
            java.lang.String r9 = r1.format(r9)     // Catch: java.io.IOException -> L87
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L87
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L87
            r2.<init>()     // Catch: java.io.IOException -> L87
            r2.append(r9)     // Catch: java.io.IOException -> L87
            java.lang.String r3 = ".l"
            r2.append(r3)     // Catch: java.io.IOException -> L87
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L87
            r1.<init>(r0, r2)     // Catch: java.io.IOException -> L87
            boolean r2 = r1.exists()     // Catch: java.io.IOException -> L87
            if (r2 != 0) goto L56
            r1.createNewFile()     // Catch: java.io.IOException -> L87
        L56:
            if (r10 == 0) goto L5d
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> L87
            goto L5f
        L5d:
            java.lang.String r10 = ""
        L5f:
            cn.jiguang.av.i.b(r1, r10)     // Catch: java.io.IOException -> L87
            java.io.File[] r10 = r0.listFiles()     // Catch: java.io.IOException -> L87
            if (r10 == 0) goto L87
            int r0 = r10.length     // Catch: java.io.IOException -> L87
            r1 = 15
            if (r0 <= r1) goto L87
            int r0 = r10.length     // Catch: java.io.IOException -> L87
            r1 = 0
        L6f:
            if (r1 >= r0) goto L87
            r2 = r10[r1]     // Catch: java.io.IOException -> L87
            java.lang.String r3 = r2.getName()     // Catch: java.io.IOException -> L87
            long r3 = r8.a(r9, r3)     // Catch: java.io.IOException -> L87
            r5 = 15
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L84
            cn.jiguang.av.i.b(r2)     // Catch: java.io.IOException -> L87
        L84:
            int r1 = r1 + 1
            goto L6f
        L87:
            return
    }

    static /* synthetic */ void a(cn.jiguang.al.c r0, long r1, long r3, long r5, java.lang.String r7) {
            r0.a(r1, r3, r5, r7)
            return
    }

    static /* synthetic */ void a(cn.jiguang.al.c r0, android.content.Context r1, org.json.JSONObject r2) {
            r0.a(r1, r2)
            return
    }

    private void a(cn.jiguang.am.a r3) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            org.json.JSONObject r3 = r3.b()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r1 = r2.m     // Catch: java.lang.Throwable -> L2d
            boolean r1 = cn.jiguang.av.a.b(r1)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L22
            java.lang.String r1 = "save_data"
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L2d
            android.content.Context r3 = r2.m     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "a12"
            cn.jiguang.a.a.a(r3, r1, r0)     // Catch: java.lang.Throwable -> L2d
            return
        L22:
            cn.jiguang.al.c r0 = a()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            r0.a(r3)     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    static /* synthetic */ android.content.Context b(cn.jiguang.al.c r0) {
            android.content.Context r0 = r0.m
            return r0
    }

    private java.lang.String c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "wi/cjc4sa"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lc
            java.lang.String r2 = "1"
            return r2
        Lc:
            java.lang.String r0 = "wi/d8n3hj"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L18
            java.lang.String r2 = "2"
            return r2
        L18:
            java.lang.String r0 = "v1/status"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L24
            java.lang.String r2 = "3"
            return r2
        L24:
            java.lang.String r0 = "tsis"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L2f
            java.lang.String r2 = "4"
            return r2
        L2f:
            java.lang.String r0 = "ali-stats"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3a
            java.lang.String r2 = "6"
            return r2
        L3a:
            java.lang.String r0 = "gd-stats"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L45
            java.lang.String r2 = "7"
            return r2
        L45:
            java.lang.String r0 = "stats"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L50
            java.lang.String r2 = "5"
            return r2
        L50:
            java.lang.String r0 = "v1/version-check"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5c
            java.lang.String r2 = "8"
            return r2
        L5c:
            java.lang.String r0 = "wi/plp8j0k"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L68
            java.lang.String r2 = "9"
            return r2
        L68:
            java.lang.String r0 = "wi/spoml"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L74
            java.lang.String r2 = "10"
            return r2
        L74:
            java.lang.String r0 = "qiniup"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L7f
            java.lang.String r2 = "11"
            return r2
        L7f:
            java.lang.String r0 = "1/getEvent"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L8a
            java.lang.String r2 = "12"
            return r2
        L8a:
            java.lang.String r0 = "1/setUserInfo"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L95
            java.lang.String r2 = "13"
            return r2
        L95:
            java.lang.String r0 = "1/setChannel"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto La0
            java.lang.String r2 = "14"
            return r2
        La0:
            java.lang.String r0 = "1/updateUserProperties"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lab
            java.lang.String r2 = "15"
            return r2
        Lab:
            java.lang.String r0 = "1/switcUserProperties"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lb6
            java.lang.String r2 = "16"
            return r2
        Lb6:
            java.lang.String r0 = "v1/user"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lc2
            java.lang.String r2 = "17"
            return r2
        Lc2:
            java.lang.String r0 = "wi/qj18op"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lce
            java.lang.String r2 = "18"
            return r2
        Lce:
            java.lang.String r0 = "wi/op8jdu"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lda
            java.lang.String r2 = "19"
            return r2
        Lda:
            java.lang.String r0 = "v1/reqtime"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Le6
            java.lang.String r2 = "20"
            return r2
        Le6:
            java.lang.String r0 = "appgwc/status"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lf1
            java.lang.String r2 = "21"
            return r2
        Lf1:
            java.lang.String r0 = "appawake/status"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lfc
            java.lang.String r2 = "22"
            return r2
        Lfc:
            java.lang.String r0 = "jx/6ae71c"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L107
            java.lang.String r2 = "23"
            return r2
        L107:
            java.lang.String r0 = "wi/swelbv"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L113
            java.lang.String r2 = "24"
            return r2
        L113:
            java.lang.String r0 = "wi/ysdiox"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L11f
            java.lang.String r2 = "25"
            return r2
        L11f:
            java.lang.String r0 = "http"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L129
            java.lang.String r2 = "1000"
        L129:
            return r2
    }

    static /* synthetic */ org.json.JSONObject c(cn.jiguang.al.c r0) {
            org.json.JSONObject r0 = r0.e()
            return r0
    }

    static /* synthetic */ org.json.JSONObject d(cn.jiguang.al.c r0) {
            org.json.JSONObject r0 = r0.f575f
            return r0
    }

    private void d() {
            r2 = this;
            cn.jiguang.al.c$1 r0 = new cn.jiguang.al.c$1
            r0.<init>(r2)
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r1, r0)
            return
    }

    private org.json.JSONObject e() {
            r3 = this;
            org.json.JSONObject r0 = r3.f575f     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L12
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            android.content.Context r1 = r3.m     // Catch: java.lang.Throwable -> L15
            r2 = 0
            java.lang.String r1 = r3.a(r1, r2)     // Catch: java.lang.Throwable -> L15
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r3.f575f = r0     // Catch: java.lang.Throwable -> L15
        L12:
            org.json.JSONObject r0 = r3.f575f     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r0 = 0
            return r0
    }

    private org.json.JSONObject f() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
            android.content.Context r1 = r3.m     // Catch: java.lang.Throwable -> Ld
            r2 = 1
            java.lang.String r1 = r3.a(r1, r2)     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private void g() {
            r9 = this;
            long r0 = r9.f578i
            long r2 = cn.jiguang.al.c.f571b
            r4 = 0
            r5 = 1
            java.lang.String r6 = "NetDataMonitorManager"
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 > 0) goto L17
            long r0 = r9.f577h
            long r2 = r9.f576g
            long r0 = r0 + r2
            long r2 = cn.jiguang.al.c.a
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L64
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "check business count is more than COUNT= "
            r0.append(r1)
            long r1 = r9.f578i
            long r7 = cn.jiguang.al.c.f571b
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.i(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "check business data length is more than NET_LENGTH_THRESHOLD= "
            r0.append(r1)
            long r1 = r9.f577h
            long r7 = r9.f576g
            long r1 = r1 + r7
            long r7 = cn.jiguang.al.c.a
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L4d
            r1 = 1
            goto L4e
        L4d:
            r1 = 0
        L4e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.i(r6, r0)
            r9.c()
            cn.jiguang.ad.h r0 = cn.jiguang.ad.h.a()
            android.content.Context r1 = r9.m
            r0.a(r1)
        L64:
            long r0 = r9.l
            long r2 = cn.jiguang.al.c.f573d
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 > 0) goto L79
            long r0 = r9.f580k
            long r2 = r9.f579j
            long r0 = r0 + r2
            long r2 = cn.jiguang.al.c.f572c
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L78
            goto L79
        L78:
            return
        L79:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "check conn count is more than CONN_COUNT= "
            r0.append(r1)
            long r1 = r9.l
            long r7 = cn.jiguang.al.c.f573d
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L8d
            r1 = 1
            goto L8e
        L8d:
            r1 = 0
        L8e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.i(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "check conn data length is more than NET_CONN_LENGTH_THRESHOLD= "
            r0.append(r1)
            long r1 = r9.f580k
            long r7 = r9.f579j
            long r1 = r1 + r7
            long r7 = cn.jiguang.al.c.f572c
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto Lae
            r4 = 1
        Lae:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.i(r6, r0)
            r9.c()
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            android.content.Context r1 = r9.m
            java.lang.String r2 = "tcp_a23"
            r3 = 0
            r0.a(r1, r2, r3)
            return
    }

    private synchronized void h() {
            r9 = this;
            monitor-enter(r9)
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.C()     // Catch: java.lang.Throwable -> L113
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)     // Catch: java.lang.Throwable -> L113
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L113
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L113
            long r2 = r9.o     // Catch: java.lang.Throwable -> L113
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            r0 = r2
        L1a:
            long r2 = cn.jiguang.av.x.a()     // Catch: java.lang.Throwable -> L113
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L26
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L111
        L26:
            java.lang.String r6 = "NetDataMonitorManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r7.<init>()     // Catch: java.lang.Throwable -> L113
            java.lang.String r8 = "checkCurrentDayTime saveCurrentDayTime "
            r7.append(r8)     // Catch: java.lang.Throwable -> L113
            r7.append(r0)     // Catch: java.lang.Throwable -> L113
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L113
            cn.jiguang.w.f.i(r6, r0)     // Catch: java.lang.Throwable -> L113
            java.lang.String r0 = "NetDataMonitorManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r1.<init>()     // Catch: java.lang.Throwable -> L113
            java.lang.String r6 = "checkCurrentDayTime currentDayTime "
            r1.append(r6)     // Catch: java.lang.Throwable -> L113
            r1.append(r2)     // Catch: java.lang.Throwable -> L113
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L113
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L113
            java.lang.String r0 = "NetDataMonitorManager"
            java.lang.String r1 = "recover all data"
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L113
            r9.f578i = r4     // Catch: java.lang.Throwable -> L113
            r9.f576g = r4     // Catch: java.lang.Throwable -> L113
            r9.f577h = r4     // Catch: java.lang.Throwable -> L113
            r9.l = r4     // Catch: java.lang.Throwable -> L113
            r9.f579j = r4     // Catch: java.lang.Throwable -> L113
            r9.f580k = r4     // Catch: java.lang.Throwable -> L113
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.C()     // Catch: java.lang.Throwable -> L113
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = r1.a(r4)     // Catch: java.lang.Throwable -> L113
            r4 = 1
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L113
            r6 = 0
            r5[r6] = r1     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.b.a(r0, r5)     // Catch: java.lang.Throwable -> L113
            r9.o = r2     // Catch: java.lang.Throwable -> L113
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.x()     // Catch: java.lang.Throwable -> L113
            long r2 = r9.f578i     // Catch: java.lang.Throwable -> L113
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L113
            r2[r6] = r1     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L113
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.y()     // Catch: java.lang.Throwable -> L113
            long r2 = r9.f577h     // Catch: java.lang.Throwable -> L113
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L113
            r2[r6] = r1     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L113
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.w()     // Catch: java.lang.Throwable -> L113
            long r2 = r9.f576g     // Catch: java.lang.Throwable -> L113
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L113
            r2[r6] = r1     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L113
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.A()     // Catch: java.lang.Throwable -> L113
            long r2 = r9.l     // Catch: java.lang.Throwable -> L113
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L113
            r2[r6] = r1     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L113
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.B()     // Catch: java.lang.Throwable -> L113
            long r2 = r9.f580k     // Catch: java.lang.Throwable -> L113
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L113
            r2[r6] = r1     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L113
            android.content.Context r0 = r9.m     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = cn.jiguang.e.a.z()     // Catch: java.lang.Throwable -> L113
            long r2 = r9.f579j     // Catch: java.lang.Throwable -> L113
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L113
            r2[r6] = r1     // Catch: java.lang.Throwable -> L113
            cn.jiguang.e.b.a(r0, r2)     // Catch: java.lang.Throwable -> L113
            r0 = 0
            r9.f575f = r0     // Catch: java.lang.Throwable -> L113
            org.json.JSONObject r0 = r9.e()     // Catch: java.lang.Throwable -> L113
            r9.f575f = r0     // Catch: java.lang.Throwable -> L113
        L111:
            monitor-exit(r9)
            return
        L113:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L113
            throw r0
    }

    public void a(android.os.Bundle r8) {
            r7 = this;
            java.lang.String r0 = "url"
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "req"
            long r1 = r8.getLong(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "res"
            long r3 = r8.getLong(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "type"
            java.lang.String r8 = r8.getString(r5)     // Catch: java.lang.Throwable -> L37
            cn.jiguang.ap.i r5 = new cn.jiguang.ap.i     // Catch: java.lang.Throwable -> L37
            android.content.Context r6 = r7.m     // Catch: java.lang.Throwable -> L37
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r7.c(r0)     // Catch: java.lang.Throwable -> L37
            r5.a(r0)     // Catch: java.lang.Throwable -> L37
            r5.b(r8)     // Catch: java.lang.Throwable -> L37
            r5.b(r1)     // Catch: java.lang.Throwable -> L37
            r5.a(r3)     // Catch: java.lang.Throwable -> L37
            r0 = 1
            r5.c(r0)     // Catch: java.lang.Throwable -> L37
            r7.a(r5)     // Catch: java.lang.Throwable -> L37
        L37:
            return
    }

    public void a(cn.jiguang.net.HttpRequest r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto Ld
            java.lang.String r5 = r4.getUrl()     // Catch: java.lang.Throwable -> L37
            byte[] r0 = r4.getParas()     // Catch: java.lang.Throwable -> L37
            int r0 = r0.length     // Catch: java.lang.Throwable -> L37
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L37
            goto L2c
        Ld:
            java.lang.String r5 = r4.getUrl()     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = " \\?"
            java.lang.String[] r5 = r5.split(r0)     // Catch: java.lang.Throwable -> L37
            r0 = 0
            r0 = r5[r0]     // Catch: java.lang.Throwable -> L37
            int r1 = r5.length     // Catch: java.lang.Throwable -> L37
            r2 = 1
            if (r1 <= r2) goto L29
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L37
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L37
            int r5 = r5.length     // Catch: java.lang.Throwable -> L37
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L37
        L26:
            r5 = r0
            r0 = r1
            goto L2c
        L29:
            r1 = -1
            goto L26
        L2c:
            java.lang.String r5 = r3.c(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = r4.getType()     // Catch: java.lang.Throwable -> L37
            r3.b(r5, r4, r0)     // Catch: java.lang.Throwable -> L37
        L37:
            return
    }

    public void a(cn.jiguang.net.HttpRequest r3, boolean r4, cn.jiguang.net.HttpResponse r5) {
            r2 = this;
            if (r4 == 0) goto L7
            java.lang.String r4 = r3.getUrl()
            goto L14
        L7:
            java.lang.String r4 = r3.getUrl()
            java.lang.String r0 = " \\?"
            java.lang.String[] r4 = r4.split(r0)
            r0 = 0
            r4 = r4[r0]
        L14:
            java.lang.String r0 = r5.getResponseBody()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r5 = r5.getResponseBody()
            byte[] r5 = r5.getBytes()
            int r5 = r5.length
            long r0 = (long) r5
            goto L2b
        L29:
            r0 = 0
        L2b:
            java.lang.String r4 = r2.c(r4)
            java.lang.String r3 = r3.getType()
            r2.c(r4, r3, r0)
            return
    }

    public synchronized void a(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.m     // Catch: java.lang.Throwable -> L21
            cn.jiguang.e.a r1 = cn.jiguang.e.a.r()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L15
            monitor-exit(r2)
            return
        L15:
            java.lang.String r0 = "FUTURE_TASK"
            cn.jiguang.al.c$2 r1 = new cn.jiguang.al.c$2     // Catch: java.lang.Throwable -> L21
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L21
            cn.jiguang.au.d.a(r0, r1)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        L21:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    public void a(java.lang.String r3, java.lang.String r4, long r5) {
            r2 = this;
            cn.jiguang.ap.i r0 = new cn.jiguang.ap.i
            android.content.Context r1 = r2.m
            r0.<init>(r1)
            r0.a(r3)
            r0.b(r4)
            r0.a(r5)
            r3 = 1
            r0.c(r3)
            r2.a(r0)
            return
    }

    public void a(boolean r6) {
            r5 = this;
            android.content.Context r0 = r5.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.r()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            goto L19
        L13:
            if (r6 != 0) goto L1a
            java.lang.Boolean r6 = r5.n
            if (r6 == 0) goto L1a
        L19:
            return
        L1a:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.n = r6
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r0 = cn.jiguang.e.a.s()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            cn.jiguang.al.c.f571b = r0
        L36:
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r0 = cn.jiguang.e.a.t()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4c
            cn.jiguang.al.c.a = r0
        L4c:
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r0 = cn.jiguang.e.a.u()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L62
            cn.jiguang.al.c.f573d = r0
        L62:
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r0 = cn.jiguang.e.a.v()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L78
            cn.jiguang.al.c.f572c = r0
        L78:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "use count="
            r6.append(r0)
            long r0 = cn.jiguang.al.c.f571b
            r6.append(r0)
            java.lang.String r0 = " net threshold="
            r6.append(r0)
            long r0 = cn.jiguang.al.c.a
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "NetDataMonitorManager"
            cn.jiguang.w.f.c(r0, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "use conn count="
            r6.append(r1)
            long r1 = cn.jiguang.al.c.f573d
            r6.append(r1)
            java.lang.String r1 = " net conn threshold="
            r6.append(r1)
            long r1 = cn.jiguang.al.c.f572c
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r0, r6)
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.x()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r1)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.f578i = r1
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.w()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r1)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.f576g = r1
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.y()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r1)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.f577h = r1
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.A()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r1)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.l = r1
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.z()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r1)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.f579j = r1
            android.content.Context r6 = r5.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.B()
            java.lang.Object r6 = cn.jiguang.e.b.a(r6, r1)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r5.f580k = r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "init first mAllCount="
            r6.append(r1)
            long r1 = r5.f578i
            r6.append(r1)
            java.lang.String r1 = " mAllReqLength="
            r6.append(r1)
            long r2 = r5.f576g
            r6.append(r2)
            java.lang.String r2 = " mAllResLength="
            r6.append(r2)
            long r3 = r5.f577h
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r0, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = "init first conn mAllCount="
            r6.append(r3)
            long r3 = r5.l
            r6.append(r3)
            r6.append(r1)
            long r3 = r5.f579j
            r6.append(r3)
            r6.append(r2)
            long r1 = r5.f580k
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r0, r6)
            r5.h()
            r5.c()
            return
    }

    public boolean a(android.content.Context r9) {
            r8 = this;
            android.content.Context r9 = r8.m
            cn.jiguang.e.a r0 = cn.jiguang.e.a.r()
            java.lang.Object r9 = cn.jiguang.e.b.a(r9, r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r0 = 1
            if (r9 != 0) goto L14
            return r0
        L14:
            r8.h()
            long r1 = r8.f578i
            long r3 = cn.jiguang.al.c.f571b
            r9 = 0
            java.lang.String r5 = ",so sdk limit"
            java.lang.String r6 = "NetDataMonitorManager"
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "business count is more than count: "
            r0.append(r1)
            long r1 = cn.jiguang.al.c.f571b
        L30:
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.i(r6, r0)
            return r9
        L3e:
            long r1 = r8.f577h
            long r3 = r8.f576g
            long r1 = r1 + r3
            long r3 = cn.jiguang.al.c.a
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "business data length is more than data threshold: "
            r0.append(r1)
            long r1 = cn.jiguang.al.c.a
            goto L30
        L56:
            return r0
    }

    public void b() {
            r7 = this;
            android.content.Context r0 = r7.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.e()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            r4 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L31
            long r0 = java.lang.System.currentTimeMillis()
            android.content.Context r2 = r7.m
            cn.jiguang.e.a r3 = cn.jiguang.e.a.e()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            cn.jiguang.e.a r3 = r3.a(r5)
            r5 = 1
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r5]
            r5[r4] = r3
            cn.jiguang.e.b.a(r2, r5)
        L31:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lastReportTime "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " BuildConfig.INTERNAL_USE="
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NetDataMonitorManager"
            cn.jiguang.w.f.c(r3, r2)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = " currentTimestamp "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r3, r2)
            long r4 = r4 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L75
            java.lang.String r0 = "it not business time, interval: 86400000"
            cn.jiguang.w.f.c(r3, r0)
            return
        L75:
            java.lang.String r0 = "need to  report"
            cn.jiguang.w.f.c(r3, r0)
            r7.d()
            return
    }

    public void b(java.lang.String r7) {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L93
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = "NetDataMonitorManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r1.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "syncMessage json="
            r1.append(r2)     // Catch: java.lang.Throwable -> L93
            r1.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L93
            cn.jiguang.w.f.i(r7, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = "count"
            long r1 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L29
            r6.f578i = r1     // Catch: java.lang.Throwable -> L93
        L29:
            java.lang.String r1 = "res_l"
            long r1 = r0.optLong(r1)     // Catch: java.lang.Throwable -> L93
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L35
            r6.f577h = r1     // Catch: java.lang.Throwable -> L93
        L35:
            java.lang.String r1 = "req_l"
            long r1 = r0.optLong(r1)     // Catch: java.lang.Throwable -> L93
            if (r7 <= 0) goto L3f
            r6.f576g = r1     // Catch: java.lang.Throwable -> L93
        L3f:
            java.lang.String r7 = "count_th"
            long r1 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L4b
            cn.jiguang.al.c.f571b = r1     // Catch: java.lang.Throwable -> L93
        L4b:
            java.lang.String r7 = "l_th"
            long r1 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L57
            cn.jiguang.al.c.a = r1     // Catch: java.lang.Throwable -> L93
        L57:
            java.lang.String r7 = "conn_count"
            long r1 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L63
            r6.l = r1     // Catch: java.lang.Throwable -> L93
        L63:
            java.lang.String r7 = "conn_res_l"
            long r1 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L6f
            r6.f580k = r1     // Catch: java.lang.Throwable -> L93
        L6f:
            java.lang.String r7 = "conn_req_l"
            long r1 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L7b
            r6.f579j = r1     // Catch: java.lang.Throwable -> L93
        L7b:
            java.lang.String r7 = "conn_count_th"
            long r1 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L87
            cn.jiguang.al.c.f573d = r1     // Catch: java.lang.Throwable -> L93
        L87:
            java.lang.String r7 = "conn_length_th"
            long r0 = r0.optLong(r7)     // Catch: java.lang.Throwable -> L93
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 <= 0) goto L93
            cn.jiguang.al.c.f572c = r0     // Catch: java.lang.Throwable -> L93
        L93:
            return
    }

    public void b(java.lang.String r3, java.lang.String r4, long r5) {
            r2 = this;
            cn.jiguang.ap.i r0 = new cn.jiguang.ap.i
            android.content.Context r1 = r2.m
            r0.<init>(r1)
            r0.a(r3)
            r0.b(r4)
            r0.b(r5)
            r3 = 1
            r0.c(r3)
            r2.a(r0)
            return
    }

    public boolean b(android.content.Context r10) {
            r9 = this;
            android.content.Context r0 = r9.m
            cn.jiguang.e.a r1 = cn.jiguang.e.a.r()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L14
            return r1
        L14:
            r9.h()
            long r2 = r9.l
            long r4 = cn.jiguang.al.c.f573d
            r0 = 0
            java.lang.String r6 = "NetDataMonitorManager"
            java.lang.String r7 = ",so sdk limit"
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "conn count is more than count: "
            r1.append(r2)
            long r2 = cn.jiguang.al.c.f573d
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.i(r6, r1)
            r2 = 1409(0x581, float:1.974E-42)
        L3f:
            cn.jiguang.ab.c.a.a(r10, r2, r1)
            return r0
        L43:
            long r2 = r9.f580k
            long r4 = r9.f579j
            long r2 = r2 + r4
            long r4 = cn.jiguang.al.c.f572c
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "conn data length is more than data threshold: "
            r1.append(r2)
            long r2 = cn.jiguang.al.c.f572c
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.i(r6, r1)
            r2 = 1410(0x582, float:1.976E-42)
            goto L3f
        L6a:
            return r1
    }

    public void c() {
            r4 = this;
            android.content.Context r0 = r4.m     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L7f
            android.content.Context r1 = r4.m     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = cn.jiguang.av.a.a(r1)     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L13
            goto L7f
        L13:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "count"
            long r2 = r4.f578i     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "res_l"
            long r2 = r4.f577h     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "req_l"
            long r2 = r4.f576g     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "count_th"
            long r2 = cn.jiguang.al.c.f571b     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "l_th"
            long r2 = cn.jiguang.al.c.a     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "conn_count"
            long r2 = r4.l     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "conn_res_l"
            long r2 = r4.f580k     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "conn_req_l"
            long r2 = r4.f579j     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "conn_count_th"
            long r2 = cn.jiguang.al.c.f573d     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "conn_length_th"
            long r2 = cn.jiguang.al.c.f572c     // Catch: java.lang.Throwable -> L7f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "NetDataMonitorManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r2.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "sendMessageToMain json="
            r2.append(r3)     // Catch: java.lang.Throwable -> L7f
            r2.append(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7f
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L7f
            android.content.Context r1 = r4.m     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = cn.jiguang.al.c.f574e     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7f
            cn.jiguang.av.a.b(r1, r2, r0)     // Catch: java.lang.Throwable -> L7f
        L7f:
            return
    }

    public void c(java.lang.String r3, java.lang.String r4, long r5) {
            r2 = this;
            cn.jiguang.ap.i r0 = new cn.jiguang.ap.i
            android.content.Context r1 = r2.m
            r0.<init>(r1)
            r0.a(r3)
            r0.b(r4)
            r0.a(r5)
            r2.a(r0)
            return
    }
}
