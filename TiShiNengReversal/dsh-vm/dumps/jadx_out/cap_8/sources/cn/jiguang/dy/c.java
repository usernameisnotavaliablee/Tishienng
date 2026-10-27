package cn.jiguang.dy;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private java.lang.Boolean a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.Boolean f1260b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.Boolean f1261c;

    /* renamed from: d, reason: collision with root package name */
    private android.content.SharedPreferences f1262d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1263e;

    /* renamed from: cn.jiguang.dy.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.dy.c a = null;

        static {
                cn.jiguang.dy.c r0 = new cn.jiguang.dy.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.dy.c.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.dy.c a() {
                cn.jiguang.dy.c r0 = cn.jiguang.dy.c.a.a
                return r0
        }
    }

    private c() {
            r2 = this;
            r2.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.f1261c = r0
            java.lang.String r0 = "cn.jiguang.dy.FileLocker"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Boolean r0 = cn.jiguang.dy.FileLocker.fileLock     // Catch: java.lang.Throwable -> L11
            r2.f1261c = r0     // Catch: java.lang.Throwable -> L11
            return
        L11:
            java.lang.String r0 = "PluginAnalytics"
            java.lang.String r1 = "FileLocker not exist"
            cn.jiguang.t.b.e(r0, r1)
            return
    }

    /* synthetic */ c(cn.jiguang.dy.c.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.dy.c a() {
            cn.jiguang.dy.c r0 = cn.jiguang.dy.c.a.a()
            return r0
    }

    private void a(android.content.Context r5, cn.jiguang.r.b r6, int r7) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L27
        L3:
            if (r7 != 0) goto L12
            if (r6 != 0) goto L12
            java.lang.String r5 = "PluginAnalytics"
            java.lang.String r6 = "save event info is null"
            cn.jiguang.t.b.e(r5, r6)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r5 = move-exception
            goto L9c
        L12:
            r0 = 1
            if (r7 != r0) goto L2c
            boolean r6 = r4.f1263e     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L21
            java.lang.String r5 = "PluginAnalytics"
            java.lang.String r6 = "first need not report"
            cn.jiguang.t.b.b(r5, r6)     // Catch: java.lang.Throwable -> Lf
            return
        L21:
            boolean r6 = r4.c(r5)     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L28
        L27:
            return
        L28:
            r4.g(r5)     // Catch: java.lang.Throwable -> Lf
            return
        L2c:
            java.lang.Boolean r7 = r4.f1261c     // Catch: java.lang.Throwable -> Lf
            monitor-enter(r7)     // Catch: java.lang.Throwable -> Lf
            java.util.List r0 = r4.h(r5)     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L3d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r5 = move-exception
            goto L9a
        L3d:
            java.lang.String r1 = "PluginAnalytics"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "will save event info:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r6.e()     // Catch: java.lang.Throwable -> L3b
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.t.b.b(r1, r2)     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r0.contains(r6)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L86
            int r1 = r0.indexOf(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.r.b r1 = (cn.jiguang.r.b) r1     // Catch: java.lang.Throwable -> L3b
            r1.a(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "PluginAnalytics"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "just update,need not add:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r1.e()     // Catch: java.lang.Throwable -> L3b
            r2.append(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.t.b.b(r6, r1)     // Catch: java.lang.Throwable -> L3b
            goto L89
        L86:
            r0.add(r6)     // Catch: java.lang.Throwable -> L3b
        L89:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L3b
            r1 = 200(0xc8, float:2.8E-43)
            if (r6 < r1) goto L95
            r6 = 0
            r0.remove(r6)     // Catch: java.lang.Throwable -> L3b
        L95:
            r4.a(r5, r0)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            return
        L9a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            throw r5     // Catch: java.lang.Throwable -> Lf
        L9c:
            java.lang.String r6 = "PluginAnalytics"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "saveAction failed:"
            r7.append(r0)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            cn.jiguang.t.b.e(r6, r5)
            return
    }

    private void a(android.content.Context r6, java.util.List<cn.jiguang.r.b> r7) {
            r5 = this;
            java.lang.String r0 = "PluginAnalytics"
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            r2 = 0
        L8:
            int r3 = r7.size()     // Catch: java.lang.Throwable -> L23
            if (r2 >= r3) goto L25
            java.lang.Object r3 = r7.get(r2)     // Catch: java.lang.Throwable -> L23
            cn.jiguang.r.b r3 = (cn.jiguang.r.b) r3     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r3.e()     // Catch: java.lang.Throwable -> L23
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r1.put(r4)     // Catch: java.lang.Throwable -> L23
            int r2 = r2 + 1
            goto L8
        L23:
            r6 = move-exception
            goto L57
        L25:
            boolean r7 = r5.c(r6)     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto L4c
            boolean r7 = r5.f1263e     // Catch: java.lang.Throwable -> L23
            if (r7 != 0) goto L4c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r7.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r5.i(r6)     // Catch: java.lang.Throwable -> L23
            r7.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = ".tmp"
            r7.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L23
        L44:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L23
            cn.jiguang.u.c.a(r6, r7, r1)     // Catch: java.lang.Throwable -> L23
            goto L51
        L4c:
            java.lang.String r7 = r5.i(r6)     // Catch: java.lang.Throwable -> L23
            goto L44
        L51:
            java.lang.String r6 = "saveObjects finished"
            cn.jiguang.t.b.b(r0, r6)     // Catch: java.lang.Throwable -> L23
            return
        L57:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "[saveObjects] failed:"
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.t.b.e(r0, r6)
            return
    }

    private boolean c(android.content.Context r5, boolean r6) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.f(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "first_"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r3 = 1
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 == 0) goto L3d
            r4.f1263e = r3
            android.content.SharedPreferences r5 = r4.f(r5)
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r6, r1)
            r5.apply()
        L3d:
            return r0
    }

    private boolean d(android.content.Context r4) {
            r3 = this;
            boolean r0 = cn.jiguang.u.g.b(r4)
            r3.c(r4, r0)
            android.content.SharedPreferences r0 = r3.f(r4)
            java.lang.String r1 = "plugin_report_switch"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L15
            return r0
        L15:
            java.lang.Boolean r0 = r3.a
            if (r0 == 0) goto L1e
            boolean r4 = r0.booleanValue()
            return r4
        L1e:
            android.content.SharedPreferences r4 = r3.f(r4)
            java.lang.String r0 = "need_report"
            boolean r4 = r4.getBoolean(r0, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.a = r4
            boolean r4 = r4.booleanValue()
            return r4
    }

    private boolean e(android.content.Context r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f(r4)
            java.lang.String r1 = "plugin_multi_switch"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Le
            return r0
        Le:
            java.lang.Boolean r0 = r3.f1260b
            if (r0 == 0) goto L17
            boolean r4 = r0.booleanValue()
            return r4
        L17:
            android.content.SharedPreferences r4 = r3.f(r4)
            java.lang.String r0 = "multi_process"
            boolean r4 = r4.getBoolean(r0, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.f1260b = r4
            boolean r4 = r4.booleanValue()
            return r4
    }

    private android.content.SharedPreferences f(android.content.Context r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f1262d
            if (r0 != 0) goto Ld
            java.lang.String r0 = "cn.jiguang.prefs"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.f1262d = r3
        Ld:
            android.content.SharedPreferences r3 = r2.f1262d
            return r3
    }

    private void g(android.content.Context r16) {
            r15 = this;
            java.lang.String r0 = "PluginAnalytics"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "[reportNow]:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L33
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
            cn.jiguang.t.b.b(r0, r1)     // Catch: java.lang.Throwable -> L33
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = cn.jiguang.u.c.a(r16)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "dy_analysis"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L33
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L36
            java.lang.String r0 = "PluginAnalytics"
            java.lang.String r1 = "no event file to report"
        L2f:
            cn.jiguang.t.b.b(r0, r1)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            goto L12c
        L36:
            java.io.File[] r1 = r0.listFiles()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L126
            int r0 = r1.length     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L41
            goto L126
        L41:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L33
            r3 = 0
            r4 = 0
        L44:
            if (r4 >= r2) goto Ld3
            r0 = r1[r4]     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r0.getName()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = ".tmp"
            boolean r5 = r5.endsWith(r6)     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L56
            goto Lcf
        L56:
            java.lang.String r5 = "PluginAnalytics"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r6.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "read event from file:"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb4
            r6.append(r7)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb4
            cn.jiguang.t.b.b(r5, r6)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = cn.jiguang.u.c.a(r0)     // Catch: java.lang.Throwable -> Lb4
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto L7b
            goto Lcf
        L7b:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb4
            r6.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "itime"
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb4
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "type"
            java.lang.String r8 = "sdk_stat"
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "events"
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r5)     // Catch: java.lang.Throwable -> Lb4
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r10 = "JCore"
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> Lb4
            r6 = 1
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb4
            r14[r3] = r5     // Catch: java.lang.Throwable -> Lb4
            r11 = 14
            r12 = 0
            r13 = 0
            r9 = r16
            cn.jiguang.u.f.a(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = ""
            cn.jiguang.u.c.a(r0, r5)     // Catch: java.lang.Throwable -> Lb4
            goto Lcf
        Lb4:
            r0 = move-exception
            java.lang.String r5 = "PluginAnalytics"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r6.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r7 = "report file failed:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L33
            r6.append(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L33
            cn.jiguang.t.b.b(r5, r0)     // Catch: java.lang.Throwable -> L33
        Lcf:
            int r4 = r4 + 1
            goto L44
        Ld3:
            java.lang.Boolean r2 = r15.f1261c     // Catch: java.lang.Throwable -> L33
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L33
            int r4 = r1.length     // Catch: java.lang.Throwable -> L11d
            r5 = 0
        Ld8:
            if (r5 >= r4) goto L11f
            r0 = r1[r5]     // Catch: java.lang.Throwable -> L11d
            java.lang.String r6 = r0.getName()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r7 = ".tmp"
            boolean r7 = r6.endsWith(r7)     // Catch: java.lang.Throwable -> Lff
            if (r7 == 0) goto L11a
            int r7 = r6.length()     // Catch: java.lang.Throwable -> Lff
            int r7 = r7 + (-4)
            java.lang.String r6 = r6.substring(r3, r7)     // Catch: java.lang.Throwable -> Lff
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> Lff
            java.io.File r8 = r0.getParentFile()     // Catch: java.lang.Throwable -> Lff
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> Lff
            r0.renameTo(r7)     // Catch: java.lang.Throwable -> Lff
            goto L11a
        Lff:
            r0 = move-exception
            java.lang.String r6 = "PluginAnalytics"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r7.<init>()     // Catch: java.lang.Throwable -> L11d
            java.lang.String r8 = "report file failed:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L11d
            r7.append(r0)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L11d
            cn.jiguang.t.b.b(r6, r0)     // Catch: java.lang.Throwable -> L11d
        L11a:
            int r5 = r5 + 1
            goto Ld8
        L11d:
            r0 = move-exception
            goto L124
        L11f:
            r15.b(r16)     // Catch: java.lang.Throwable -> L11d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11d
            goto L146
        L124:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11d
            throw r0     // Catch: java.lang.Throwable -> L33
        L126:
            java.lang.String r0 = "PluginAnalytics"
            java.lang.String r1 = "not found child event file to report"
            goto L2f
        L12c:
            java.lang.String r1 = "PluginAnalytics"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "report analysis error:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.t.b.g(r1, r0)
        L146:
            return
    }

    private java.util.List<cn.jiguang.r.b> h(android.content.Context r8) {
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "PluginAnalytics"
            r2 = 0
            java.lang.String r3 = "loadObjects start"
            cn.jiguang.t.b.b(r1, r3)     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r7.c(r8)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            boolean r3 = r7.f1263e     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r3.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r7.i(r8)     // Catch: java.lang.Throwable -> L2e
            r3.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = ".tmp"
            r3.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2e
        L29:
            java.lang.String r3 = cn.jiguang.u.c.a(r8, r3)     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r3 = move-exception
            goto L69
        L30:
            java.lang.String r3 = r7.i(r8)     // Catch: java.lang.Throwable -> L2e
            goto L29
        L35:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L88
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5e
            r3 = 0
        L46:
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L5e
            if (r3 >= r5) goto L65
            org.json.JSONObject r5 = r2.getJSONObject(r3)     // Catch: java.lang.Throwable -> L5e
            cn.jiguang.r.b r6 = new cn.jiguang.r.b     // Catch: java.lang.Throwable -> L5e
            r6.<init>()     // Catch: java.lang.Throwable -> L5e
            r6.a(r5)     // Catch: java.lang.Throwable -> L5e
            r4.add(r6)     // Catch: java.lang.Throwable -> L5e
            int r3 = r3 + 1
            goto L46
        L5e:
            java.lang.String r2 = r7.i(r8)     // Catch: java.lang.Throwable -> L67
            cn.jiguang.u.c.a(r8, r2, r0)     // Catch: java.lang.Throwable -> L67
        L65:
            r2 = r4
            goto L88
        L67:
            r3 = move-exception
            r2 = r4
        L69:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[loadObjects] failed:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.t.b.e(r1, r3)
            java.lang.String r1 = r7.i(r8)
            cn.jiguang.u.c.a(r8, r1, r0)
        L88:
            return r2
    }

    private java.lang.String i(android.content.Context r3) {
            r2 = this;
            java.lang.String r3 = cn.jiguang.u.g.a(r3)
            java.lang.String r3 = cn.jiguang.u.j.d(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = "dy_analysis"
            if (r0 == 0) goto L29
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = java.io.File.separator
            r3.append(r0)
            int r0 = android.os.Process.myPid()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public void a(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "PluginAnalytics"
            java.lang.String r1 = "will [report]"
            cn.jiguang.t.b.b(r0, r1)     // Catch: java.lang.Throwable -> L14
            boolean r1 = r3.d(r4)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            java.lang.String r4 = "need not report"
            cn.jiguang.t.b.b(r0, r4)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r4 = move-exception
            goto L1c
        L16:
            r1 = 0
            r2 = 1
            r3.a(r4, r1, r2)     // Catch: java.lang.Throwable -> L14
            return
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[report] failed:"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.t.b.b(r0, r4)
            return
    }

    public void a(android.content.Context r4, int r5, int r6, cn.jiguang.r.a r7, int r8, java.lang.String r9) {
            r3 = this;
            java.lang.String r0 = "PluginAnalytics"
            boolean r1 = r3.d(r4)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L6d
            r1 = 4
            java.lang.String r1 = cn.jiguang.q.a.a(r5, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L18
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L1b:
            r2 = 1
            if (r6 > r1) goto L2c
            int r1 = r7.f1435k     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 / 1000
            if (r1 != r2) goto L2c
            java.lang.String r4 = "no plugin ,need not save event"
        L26:
            cn.jiguang.t.b.b(r0, r4)     // Catch: java.lang.Throwable -> L2a
            goto L88
        L2a:
            r4 = move-exception
            goto L70
        L2c:
            if (r7 == 0) goto L88
            cn.jiguang.r.b r1 = new cn.jiguang.r.b     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r4, r7, r5, r6)     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r1.b()     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L56
            boolean r5 = r3.e(r4)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L40
            goto L56
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "need not save event in sub process:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r1.f()     // Catch: java.lang.Throwable -> L2a
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2a
            goto L26
        L56:
            if (r8 != 0) goto L5c
            r1.c()     // Catch: java.lang.Throwable -> L2a
            goto L68
        L5c:
            if (r8 != r2) goto L62
            r1.d()     // Catch: java.lang.Throwable -> L2a
            goto L68
        L62:
            r5 = 2
            if (r8 != r5) goto L68
            r1.a(r9)     // Catch: java.lang.Throwable -> L2a
        L68:
            r5 = 0
            r3.a(r4, r1, r5)     // Catch: java.lang.Throwable -> L2a
            goto L88
        L6d:
            java.lang.String r4 = "need not save event"
            goto L26
        L70:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onEvent:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.t.b.b(r0, r4)
        L88:
            return
    }

    public void a(android.content.Context r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[setNeedReport] enable:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PluginAnalytics"
            cn.jiguang.t.b.b(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.a = r0
            android.content.SharedPreferences r3 = r2.f(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = "need_report"
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r0, r4)
            r3.apply()
            return
    }

    public void b(android.content.Context r4) {
            r3 = this;
            android.content.SharedPreferences r4 = r3.f(r4)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r0 = "plugin_report_time_"
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r4 = r4.putLong(r0, r1)
            r4.apply()
            return
    }

    public void b(android.content.Context r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[setMultiProcessOpen] enable:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PluginAnalytics"
            cn.jiguang.t.b.b(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.f1260b = r0
            android.content.SharedPreferences r3 = r2.f(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = "multi_process"
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r0, r4)
            r3.apply()
            return
    }

    public boolean c(android.content.Context r8) {
            r7 = this;
            android.content.SharedPreferences r0 = r7.f(r8)
            java.lang.String r1 = "plugin_report_time_"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            android.content.SharedPreferences r8 = r7.f(r8)
            java.lang.String r4 = "plugin_report_interval_"
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r8.getLong(r4, r5)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L29
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r4 + r0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L27
            goto L29
        L27:
            r8 = 0
            goto L2a
        L29:
            r8 = 1
        L2a:
            if (r8 != 0) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no need report, last is "
            r2.append(r3)
            java.lang.String r0 = cn.jiguang.u.b.a(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "PluginAnalytics"
            cn.jiguang.t.b.b(r1, r0)
        L46:
            return r8
    }
}
