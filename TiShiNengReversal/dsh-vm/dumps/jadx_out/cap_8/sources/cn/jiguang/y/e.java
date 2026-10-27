package cn.jiguang.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f1564b;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentHashMap<java.io.File, java.lang.Boolean> f1565c;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f1566d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f1567e;






    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.y.e.f1565c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.y.e.f1566d = r0
            cn.jiguang.y.e.f1567e = r1
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(android.content.Context r10, java.io.File r11) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.M()
            java.lang.Object r0 = cn.jiguang.e.b.a(r10, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            java.lang.String r4 = "ReportHistory"
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L1d
            java.lang.String r10 = "can't get uid, skip upload history"
            cn.jiguang.w.f.c(r4, r10)
            r10 = -2
            return r10
        L1d:
            r0 = 1
            java.io.FileFilter[] r1 = new java.io.FileFilter[r0]
            cn.jiguang.av.i$a r2 = cn.jiguang.av.i.a.a
            r3 = 0
            r1[r3] = r2
            java.io.File[] r1 = cn.jiguang.av.i.a(r11, r1)
            if (r1 == 0) goto Ldd
            int r2 = r1.length
            if (r2 != 0) goto L30
            goto Ldd
        L30:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r5 = r1.length
            r6 = 0
        L37:
            if (r6 >= r5) goto L4f
            r7 = r1[r6]
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap<java.io.File, java.lang.Boolean> r9 = cn.jiguang.y.e.f1565c
            java.lang.Object r9 = r9.get(r7)
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L4c
            r2.add(r7)
        L4c:
            int r6 = r6 + 1
            goto L37
        L4f:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L56
            return r3
        L56:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "process space="
            r1.append(r5)
            java.lang.String r11 = e(r11)
            r1.append(r11)
            java.lang.String r11 = " history["
            r1.append(r11)
            int r11 = r2.size()
            r1.append(r11)
            java.lang.String r11 = "]"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            cn.jiguang.w.f.c(r4, r11)
            cn.jiguang.y.e$4 r11 = new cn.jiguang.y.e$4
            r11.<init>()
            java.util.Collections.sort(r2, r11)
            java.util.Iterator r11 = r2.iterator()
        L8b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Ldd
            java.lang.Object r1 = r11.next()
            java.io.File r1 = (java.io.File) r1
            org.json.JSONObject r2 = cn.jiguang.y.d.a(r1)     // Catch: java.lang.Throwable -> La1
            if (r2 != 0) goto La3
            cn.jiguang.av.i.b(r1)     // Catch: java.lang.Throwable -> La1
            goto L8b
        La1:
            r1 = move-exception
            goto Lc8
        La3:
            b(r1)     // Catch: java.lang.Throwable -> La1
            java.util.Set r5 = cn.jiguang.y.g.a(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r6.<init>()     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = "report history types="
            r6.append(r7)     // Catch: java.lang.Throwable -> La1
            r6.append(r5)     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La1
            cn.jiguang.w.f.c(r4, r6)     // Catch: java.lang.Throwable -> La1
            r6 = 0
            int r1 = cn.jiguang.y.g.a(r10, r5, r2, r1, r6)     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L8b
            if (r1 == r0) goto L8b
            return r1
        Lc8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "upload e:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r4, r1)
            goto L8b
        Ldd:
            return r3
    }

    public static java.io.File a(android.content.Context r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = e(r1)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            return r2
    }

    public static java.io.File a(android.content.Context r0, java.lang.String r1, org.json.JSONObject r2, boolean r3) {
            java.io.File r0 = a(r0, r1)
            if (r3 == 0) goto L9
            b(r0)
        L9:
            java.lang.String r1 = r2.toString()
            cn.jiguang.av.i.b(r0, r1)
            return r0
    }

    public static java.io.FileFilter a() {
            cn.jiguang.y.e$1 r0 = new cn.jiguang.y.e$1
            r0.<init>()
            return r0
    }

    public static void a(android.content.Context r7) {
            cn.jiguang.av.i$a r0 = new cn.jiguang.av.i$a
            java.lang.String r1 = "jpush_stat_history"
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1, r3)
            java.lang.String r1 = cn.jiguang.d.a.e(r7)
            java.io.File r7 = r7.getFilesDir()
            java.io.FileFilter r4 = a()
            r5 = 2
            java.io.FileFilter[] r5 = new java.io.FileFilter[r5]
            r5[r2] = r0
            r5[r3] = r4
            java.io.File[] r7 = cn.jiguang.av.i.a(r7, r5)
            if (r7 == 0) goto L89
            int r0 = r7.length
        L23:
            if (r2 >= r0) goto L89
            r3 = r7[r2]
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "nowrap"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.av.i.b(r4)     // Catch: java.lang.Throwable -> L6a
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = r3.getParent()     // Catch: java.lang.Throwable -> L6a
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = java.io.File.separator     // Catch: java.lang.Throwable -> L6a
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            r5.append(r1)     // Catch: java.lang.Throwable -> L6a
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = r3.getName()     // Catch: java.lang.Throwable -> L6a
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6a
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> L6a
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L6a
            if (r5 != 0) goto L6c
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> L6a
            r5.mkdirs()     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r3 = move-exception
            goto L70
        L6c:
            r3.renameTo(r4)     // Catch: java.lang.Throwable -> L6a
            goto L86
        L70:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "e="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "updateByAppKey"
            cn.jiguang.w.f.c(r4, r3)
        L86:
            int r2 = r2 + 1
            goto L23
        L89:
            return
    }

    public static void a(android.content.Context r5, java.lang.String... r6) {
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L1c
            int r2 = r6.length
            if (r2 != 0) goto L8
            goto L1c
        L8:
            int r2 = r6.length
            int r2 = r2 + r1
            java.io.FileFilter[] r2 = new java.io.FileFilter[r2]
            r3 = 0
        Ld:
            int r4 = r6.length
            if (r3 >= r4) goto L1e
            int r4 = r3 + 1
            r3 = r6[r3]
            cn.jiguang.av.i$a r3 = cn.jiguang.av.i.a.a(r3)
            r2[r4] = r3
            r3 = r4
            goto Ld
        L1c:
            java.io.FileFilter[] r2 = new java.io.FileFilter[r1]
        L1e:
            cn.jiguang.av.i$a r6 = new cn.jiguang.av.i$a
            java.lang.String r3 = "jpush_stat_history"
            r6.<init>(r0, r1, r3, r1)
            r2[r0] = r6
            java.io.File r5 = r5.getFilesDir()
            java.io.File[] r5 = cn.jiguang.av.i.a(r5, r2)
            if (r5 == 0) goto L3c
            int r6 = r5.length
        L32:
            if (r0 >= r6) goto L3c
            r1 = r5[r0]
            cn.jiguang.av.i.b(r1)
            int r0 = r0 + 1
            goto L32
        L3c:
            return
    }

    public static void a(java.io.File r1) {
            if (r1 == 0) goto L7
            java.util.concurrent.ConcurrentHashMap<java.io.File, java.lang.Boolean> r0 = cn.jiguang.y.e.f1565c
            r0.remove(r1)
        L7:
            return
    }

    public static void a(boolean r0) {
            cn.jiguang.y.e.f1567e = r0
            return
    }

    public static void b(android.content.Context r3) {
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.y.e.f1566d
            boolean r0 = r0.get()
            if (r0 == 0) goto L10
            java.lang.String r3 = "ReportHistory"
            java.lang.String r0 = "isRunning, no need report"
            cn.jiguang.w.f.c(r3, r0)
            return
        L10:
            r0 = 0
            a(r0)
            java.lang.String r0 = cn.jiguang.v.d.c(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "ReportHistory#submitReportAll"
            if (r0 != 0) goto L39
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r2 = cn.jiguang.av.a.a(r3)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L39
            cn.jiguang.y.e$2 r0 = new cn.jiguang.y.e$2
            r0.<init>(r1, r3)
            java.lang.String r3 = "MAJOR_TASK"
            cn.jiguang.au.d.a(r3, r0)
            return
        L39:
            cn.jiguang.y.e$3 r0 = new cn.jiguang.y.e$3
            r0.<init>(r1, r3)
            java.lang.String r3 = "NORMAL_TASK"
            cn.jiguang.au.d.a(r3, r0)
            return
    }

    private static void b(android.content.Context r6, java.io.File r7) {
            java.lang.String r0 = "ReportHistory"
            org.json.JSONObject r6 = cn.jiguang.y.g.a(r6)     // Catch: java.lang.Throwable -> L73
            boolean r1 = cn.jiguang.av.m.c(r6)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto Le
            goto L7b
        Le:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "nowrap"
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L73
            r2 = 1
            java.io.FileFilter[] r3 = new java.io.FileFilter[r2]     // Catch: java.lang.Throwable -> L73
            cn.jiguang.av.i$a r4 = cn.jiguang.av.i.a.a     // Catch: java.lang.Throwable -> L73
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L73
            java.io.File[] r1 = cn.jiguang.av.i.a(r1, r3)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L7b
            int r3 = r1.length     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L27
            goto L7b
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "process space="
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = e(r7)     // Catch: java.lang.Throwable -> L73
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = " nowrap["
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            int r4 = r1.length     // Catch: java.lang.Throwable -> L73
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "]"
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L73
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "tmp"
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L73
            r7 = r1[r5]     // Catch: java.lang.Throwable -> L73
            cn.jiguang.y.d r7 = cn.jiguang.y.d.a(r7, r6)     // Catch: java.lang.Throwable -> L73
        L5a:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L73
            if (r2 >= r4) goto L75
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L73
            cn.jiguang.y.d r4 = cn.jiguang.y.d.a(r4, r6)     // Catch: java.lang.Throwable -> L73
            if (r4 != 0) goto L66
            goto L70
        L66:
            if (r7 != 0) goto L69
            goto L6f
        L69:
            boolean r5 = r7.a(r4, r3)     // Catch: java.lang.Throwable -> L73
            if (r5 != 0) goto L70
        L6f:
            r7 = r4
        L70:
            int r2 = r2 + 1
            goto L5a
        L73:
            r6 = move-exception
            goto L7c
        L75:
            if (r7 == 0) goto L7b
            r6 = 0
            r7.a(r6, r3)     // Catch: java.lang.Throwable -> L73
        L7b:
            return
        L7c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "processNowrap e:"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.i(r0, r6)
            return
    }

    private static void b(java.io.File r2) {
            if (r2 == 0) goto L9
            java.util.concurrent.ConcurrentHashMap<java.io.File, java.lang.Boolean> r0 = cn.jiguang.y.e.f1565c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r2, r1)
        L9:
            return
    }

    private static boolean b() {
            boolean r0 = cn.jiguang.y.e.f1567e
            return r0
    }

    private static int c(android.content.Context r2, java.io.File r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "upload space="
            r0.append(r1)
            java.lang.String r1 = e(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReportHistory"
            cn.jiguang.w.f.c(r1, r0)
            b(r2, r3)
            d(r3)
            int r2 = a(r2, r3)
            c(r3)
            return r2
    }

    private static java.util.Set<java.lang.String> c() {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = "uid"
            r0.add(r1)
            java.lang.String r1 = "app_key"
            r0.add(r1)
            java.lang.String r1 = "sdk_ver"
            r0.add(r1)
            java.lang.String r1 = "channel"
            r0.add(r1)
            java.lang.String r1 = "app_version"
            r0.add(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            cn.jiguang.internal.ActionManager r2 = cn.jiguang.internal.ActionManager.getInstance()
            r2.wrapSdkVersionInfo(r1)
            java.util.Iterator r1 = r1.keys()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto L2e
        L3e:
            return r0
    }

    static /* synthetic */ void c(android.content.Context r0) {
            f(r0)
            return
    }

    private static void c(java.io.File r9) {
            r0 = 1
            java.io.FileFilter[] r1 = new java.io.FileFilter[r0]
            cn.jiguang.av.i$a r2 = cn.jiguang.av.i.a.a
            r3 = 0
            r1[r3] = r2
            java.io.File[] r1 = cn.jiguang.av.i.a(r9, r1)
            if (r1 == 0) goto L73
            int r2 = r1.length
            if (r2 > r0) goto L12
            goto L73
        L12:
            java.util.List r0 = java.util.Arrays.asList(r1)
            cn.jiguang.y.e$5 r2 = new cn.jiguang.y.e$5
            r2.<init>()
            java.util.Collections.sort(r0, r2)
            java.util.Iterator r2 = r0.iterator()
        L22:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r2.next()
            java.io.File r4 = (java.io.File) r4
            long r5 = (long) r3
            long r7 = r4.length()
            long r5 = r5 + r7
            int r3 = (int) r5
            r5 = 1048576(0x100000, float:1.469368E-39)
            if (r3 <= r5) goto L22
            cn.jiguang.av.i.b(r4)
            goto L22
        L3d:
            int r2 = r0.size()
            int r3 = r1.length
            if (r2 >= r3) goto L73
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "trim space history="
            r2.append(r3)
            java.lang.String r9 = e(r9)
            r2.append(r9)
            java.lang.String r9 = ","
            r2.append(r9)
            int r9 = r1.length
            r2.append(r9)
            java.lang.String r9 = " to "
            r2.append(r9)
            int r9 = r0.size()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r0 = "ReportHistory"
            cn.jiguang.w.f.c(r0, r9)
        L73:
            return
    }

    private static synchronized java.lang.String d(android.content.Context r3) {
            java.lang.Class<cn.jiguang.y.e> r0 = cn.jiguang.y.e.class
            monitor-enter(r0)
            java.lang.String r1 = cn.jiguang.y.e.f1564b     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L12
            java.lang.String r3 = cn.jiguang.y.e.f1564b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r3
        Lf:
            r3 = move-exception
            goto L88
        L12:
            java.lang.String r1 = cn.jiguang.y.e.a     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L4b
            java.lang.String r1 = cn.jiguang.av.a.a(r3)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L4b
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L2f
            java.lang.String r3 = ""
        L2c:
            cn.jiguang.y.e.a = r3     // Catch: java.lang.Throwable -> Lf
            goto L4b
        L2f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lf
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = ":"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "_"
            java.lang.String r3 = r1.replaceFirst(r3, r2)     // Catch: java.lang.Throwable -> Lf
            goto L2c
        L4b:
            java.lang.String r3 = cn.jiguang.y.e.a     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "jpush_stat_history"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = cn.jiguang.y.e.a     // Catch: java.lang.Throwable -> Lf
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf
            goto L65
        L63:
            java.lang.String r3 = "jpush_stat_history"
        L65:
            java.io.File r3 = cn.jiguang.av.i.c(r3)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L73
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.y.e.f1564b = r3     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r3
        L73:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "jpush_stat_history"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = cn.jiguang.y.e.a     // Catch: java.lang.Throwable -> Lf
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r3
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    private static void d(java.io.File r10) {
            java.lang.String r0 = "ReportHistory"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "tmp"
            r1.<init>(r10, r2)     // Catch: java.lang.Throwable -> L39
            r2 = 1
            java.io.FileFilter[] r3 = new java.io.FileFilter[r2]     // Catch: java.lang.Throwable -> L39
            cn.jiguang.av.i$a r4 = cn.jiguang.av.i.a.a     // Catch: java.lang.Throwable -> L39
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L39
            java.io.File[] r1 = cn.jiguang.av.i.a(r1, r3)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto Ldf
            int r3 = r1.length     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L1c
            goto Ldf
        L1c:
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L39
            r3.<init>()     // Catch: java.lang.Throwable -> L39
            int r4 = r1.length     // Catch: java.lang.Throwable -> L39
            r6 = 0
        L23:
            if (r6 >= r4) goto L3f
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.ConcurrentHashMap<java.io.File, java.lang.Boolean> r9 = cn.jiguang.y.e.f1565c     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r9.get(r7)     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L39
            if (r8 != 0) goto L3c
            r3.add(r7)     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r10 = move-exception
            goto Le0
        L3c:
            int r6 = r6 + 1
            goto L23
        L3f:
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L47
            goto Ldf
        L47:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "process space="
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = e(r10)     // Catch: java.lang.Throwable -> L39
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = " tmp["
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L39
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "]"
            r1.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L39
            java.util.Set r1 = c()     // Catch: java.lang.Throwable -> L39
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            java.io.FileFilter[] r2 = new java.io.FileFilter[r2]     // Catch: java.lang.Throwable -> L39
            cn.jiguang.av.i$a r6 = cn.jiguang.av.i.a.a     // Catch: java.lang.Throwable -> L39
            r2[r5] = r6     // Catch: java.lang.Throwable -> L39
            java.io.File[] r2 = cn.jiguang.av.i.a(r10, r2)     // Catch: java.lang.Throwable -> L39
            java.io.File r2 = cn.jiguang.av.i.a(r2)     // Catch: java.lang.Throwable -> L39
            cn.jiguang.y.d r2 = cn.jiguang.y.d.a(r2, r1)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L96
            org.json.JSONObject r5 = r2.f1559b     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L39
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L39
        L96:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L39
        L9a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L39
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L39
            cn.jiguang.y.d r3 = cn.jiguang.y.d.a(r3, r1)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto Lad
            goto L9a
        Lad:
            org.json.JSONObject r5 = r3.f1559b     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> L39
            cn.jiguang.y.d r6 = (cn.jiguang.y.d) r6     // Catch: java.lang.Throwable -> L39
            if (r6 != 0) goto Lbf
        Lbb:
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> L39
            goto L9a
        Lbf:
            boolean r6 = r6.a(r3, r10)     // Catch: java.lang.Throwable -> L39
            if (r6 != 0) goto L9a
            goto Lbb
        Lc6:
            java.util.Collection r1 = r4.values()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L39
        Lce:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            cn.jiguang.y.d r2 = (cn.jiguang.y.d) r2     // Catch: java.lang.Throwable -> L39
            r3 = 0
            r2.a(r3, r10)     // Catch: java.lang.Throwable -> L39
            goto Lce
        Ldf:
            return
        Le0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "processTmp e:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            cn.jiguang.w.f.i(r0, r10)
            return
    }

    private static java.lang.String e(android.content.Context r2) {
            java.lang.String r0 = cn.jiguang.d.a.e(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lc
            java.lang.String r0 = "0"
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = d(r2)
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private static java.lang.String e(java.io.File r3) {
            java.io.File r0 = r3.getParentFile()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.io.File r2 = r0.getParentFile()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L2f
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L2f
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2f
            r1.append(r0)     // Catch: java.lang.Throwable -> L2f
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r3.getName()     // Catch: java.lang.Throwable -> L2f
            r1.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            return r3
        L2f:
            java.lang.String r3 = r3.getAbsolutePath()
            return r3
    }

    private static void f(android.content.Context r8) {
            java.lang.String r0 = "ReportHistory"
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r2 = cn.jiguang.y.e.f1566d     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r2.set(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = e(r8)     // Catch: java.lang.Throwable -> L30
            java.io.FileFilter[] r4 = new java.io.FileFilter[r3]     // Catch: java.lang.Throwable -> L30
            cn.jiguang.av.i$a r5 = cn.jiguang.av.i.a.f701b     // Catch: java.lang.Throwable -> L30
            r4[r1] = r5     // Catch: java.lang.Throwable -> L30
            java.io.File[] r2 = cn.jiguang.av.i.a(r2, r4)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L3e
            int r4 = r2.length     // Catch: java.lang.Throwable -> L30
            r5 = 0
        L1b:
            if (r5 >= r4) goto L2a
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L30
            boolean r7 = b()     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L32
            java.lang.String r8 = "history, report is Tcp and http Fail"
        L27:
            cn.jiguang.w.f.c(r0, r8)     // Catch: java.lang.Throwable -> L30
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r8 = cn.jiguang.y.e.f1566d
            r8.set(r1)
            return
        L30:
            r8 = move-exception
            goto L41
        L32:
            int r6 = c(r8, r6)     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L3b
            if (r6 == r3) goto L3b
            goto L2a
        L3b:
            int r5 = r5 + 1
            goto L1b
        L3e:
            java.lang.String r8 = "no history, no report"
            goto L27
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "run upload exception="
            r2.append(r3)     // Catch: java.lang.Throwable -> L56
            r2.append(r8)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L56
            cn.jiguang.w.f.l(r0, r8)     // Catch: java.lang.Throwable -> L56
            goto L2a
        L56:
            r8 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.y.e.f1566d
            r0.set(r1)
            throw r8
    }
}
