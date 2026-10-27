package cn.jiguang.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e {
    public static java.lang.String a = "jpush_log";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f1542b = "internal_debug_log.txt";

    /* renamed from: c, reason: collision with root package name */
    private static final java.text.SimpleDateFormat f1543c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f1544d = null;


    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r0.<init>(r1, r2)
            cn.jiguang.w.e.f1543c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.w.e.f1544d = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a() {
            java.lang.String r0 = "Logger"
            r1 = 0
            android.content.Context r1 = cn.jiguang.av.c.a(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            boolean r2 = cn.jiguang.w.d.c(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            java.lang.String r1 = "Skip clearing log files due to active references"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            goto L38
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L15
            r2.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Throwable -> L15
            r2.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = cn.jiguang.w.e.a     // Catch: java.lang.Throwable -> L15
            r2.append(r3)     // Catch: java.lang.Throwable -> L15
            r2.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L15
            cn.jiguang.av.i.d(r1)     // Catch: java.lang.Throwable -> L15
            return
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "clearLogFiles error is "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return
    }

    static /* synthetic */ void a(java.io.File r0) {
            b(r0)
            return
    }

    private static void a(java.lang.String r2) {
            java.lang.String r0 = "ONCE_TASK"
            cn.jiguang.w.e$1 r1 = new cn.jiguang.w.e$1     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.au.d.a(r0, r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveLogs error is "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "Logger"
            cn.jiguang.w.f.i(r0, r2)
            return
    }

    public static void a(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Throwable r20) {
            r0 = r19
            java.lang.String r1 = "\n"
            java.lang.String r2 = " "
            if (r18 == 0) goto L18
            java.lang.String r3 = r18.trim()
            java.lang.String r4 = ""
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r3 = r18
            goto L1a
        L18:
            java.lang.String r3 = "Logger"
        L1a:
            if (r0 != 0) goto L1e
            goto Lbb
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.text.SimpleDateFormat r5 = cn.jiguang.w.e.f1543c     // Catch: java.lang.Throwable -> Lbc
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Throwable -> Lbc
            r6.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = r5.format(r6)     // Catch: java.lang.Throwable -> Lbc
            android.content.Context r6 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = cn.jiguang.av.a.a(r6)     // Catch: java.lang.Throwable -> Lbc
            int r7 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lbc
            long r8 = r8.getId()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> Lbc
            r10 = 0
            r11 = 1
            r12 = 0
        L49:
            int r13 = r0.length     // Catch: java.lang.Throwable -> Lbc
            if (r12 >= r13) goto L91
            r13 = r0[r12]     // Catch: java.lang.Throwable -> Lbc
            if (r11 != 0) goto L53
            r4.append(r1)     // Catch: java.lang.Throwable -> Lbc
        L53:
            r4.append(r5)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r2)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r7)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r11 = "-"
            r4.append(r11)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r8)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r2)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r6)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r2)     // Catch: java.lang.Throwable -> Lbc
            r11 = r17
            r4.append(r11)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r2)     // Catch: java.lang.Throwable -> Lbc
            r14 = r16
            r4.append(r14)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r2)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r15 = "["
            r4.append(r15)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r15 = "] "
            r4.append(r15)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r13)     // Catch: java.lang.Throwable -> Lbc
            int r12 = r12 + 1
            r11 = 0
            goto L49
        L91:
            if (r20 == 0) goto Laa
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> Lbc
            r0.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> Lbc
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lbc
            r2.close()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbc
            r4.append(r1)     // Catch: java.lang.Throwable -> Lbc
            r4.append(r0)     // Catch: java.lang.Throwable -> Lbc
        Laa:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto Lbb
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> Lbc
            a(r0)     // Catch: java.lang.Throwable -> Lbc
        Lbb:
            return
        Lbc:
            r0 = move-exception
            r0.getMessage()
            return
    }

    static /* synthetic */ java.lang.Object b() {
            java.lang.Object r0 = cn.jiguang.w.e.f1544d
            return r0
    }

    private static void b(java.io.File r6) {
            boolean r0 = r6.exists()     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L36
            long r0 = r6.length()     // Catch: java.lang.Exception -> L37
            r2 = 10485760(0xa00000, double:5.180654E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L36
            java.lang.Object r0 = cn.jiguang.w.e.f1544d     // Catch: java.lang.Exception -> L37
            monitor-enter(r0)     // Catch: java.lang.Exception -> L37
            boolean r1 = r6.exists()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            long r4 = r6.length()     // Catch: java.lang.Throwable -> L30
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L32
            cn.jiguang.av.i.b(r6)     // Catch: java.lang.Throwable -> L30
            r6.createNewFile()     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "Logger"
            java.lang.String r1 = "Log file exceeded max size, rotated"
            cn.jiguang.w.f.c(r6, r1)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r6 = move-exception
            goto L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r6     // Catch: java.lang.Exception -> L37
        L36:
            return
        L37:
            r6 = move-exception
            r6.getMessage()
            return
    }
}
