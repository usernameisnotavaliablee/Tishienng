package com.bytedance.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    static volatile boolean g = true;
    private com.bytedance.j.xt.j.b a;
    private com.bytedance.j.xt.j.d b;
    private final android.content.Context c;
    private volatile long d;
    private volatile boolean e;
    private final android.content.SharedPreferences f;

    static {
            return
    }

    public a(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.e = r0
            if (r4 == 0) goto L21
            boolean r1 = r4 instanceof android.app.Application
            if (r1 == 0) goto L21
            r3.c = r4
            java.lang.String r1 = "anr_monitor_table"
            android.content.SharedPreferences r4 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r4, r1, r0)
            r3.f = r4
            java.lang.String r0 = "trace_anr_happen_time"
            r1 = 0
            long r0 = r4.getLong(r0, r1)
            r3.d = r0
            return
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "context must not be null or not application"
            r4.<init>(r0)
            throw r4
    }

    private java.lang.String a(java.io.BufferedReader r4) throws java.io.IOException {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L9:
            java.lang.String r1 = r4.readLine()
            if (r1 == 0) goto L22
            java.lang.String r2 = r1.trim()
            int r2 = r2.length()
            if (r2 <= 0) goto L22
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            goto L9
        L22:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static void d(java.lang.String r1) {
            com.bytedance.j.xt.g r1 = com.bytedance.j.xt.e.l()
            java.util.List r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            r1.next()
            com.bytedance.j.xt.cw r0 = com.bytedance.j.xt.cw.f2132r
            goto Lc
        L18:
            return
    }

    private java.lang.Object[] f(java.io.BufferedReader r8, java.util.regex.Pattern... r9) throws java.io.IOException {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L2c
            if (r9 == 0) goto L2c
            int r1 = r9.length
            if (r1 > 0) goto L9
            goto L2c
        L9:
            java.lang.String r1 = r8.readLine()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            int r2 = r9.length     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L9
            r5 = r9[r4]     // Catch: java.lang.Throwable -> L2c
            java.util.regex.Matcher r6 = r5.matcher(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r6.matches()     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L29
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L2c
            r8[r3] = r5     // Catch: java.lang.Throwable -> L2c
            r9 = 1
            r8[r9] = r1     // Catch: java.lang.Throwable -> L2c
            return r8
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            return r0
    }

    public org.json.JSONObject b(java.lang.String r18, int r19, java.lang.String r20) {
            r17 = this;
            r1 = r17
            java.lang.String r0 = "\\s"
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.io.File r2 = new java.io.File
            r4 = r18
            r2.<init>(r4)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L1bd
            boolean r4 = r2.canRead()
            if (r4 != 0) goto L21
            goto L1bd
        L21:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1ae java.lang.Exception -> L1b0
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L1ae java.lang.Exception -> L1b0
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L1ae java.lang.Exception -> L1b0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1ae java.lang.Exception -> L1b0
            java.lang.String r2 = "-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r5 = "-{5}\\send\\s\\d+\\s-{5}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r6 = "Cmd\\sline:\\s(\\S+)"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r7 = "\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r9 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r10 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r9 = 1
            java.util.regex.Pattern[] r10 = new java.util.regex.Pattern[r9]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r11 = 0
            r10[r11] = r2     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.Object[] r2 = r1.f(r4, r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r2 != 0) goto L5c
            com.bytedance.j.xt.tl.h.a(r4)
            return r3
        L5c:
            r10 = r2[r9]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String[] r10 = r10.split(r0)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r12 = 2
            r10 = r10[r12]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            long r13 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r10.<init>()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r15 = r2[r9]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String[] r15 = r15.split(r0)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r16 = 4
            r15 = r15[r16]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r10.append(r15)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r15 = " "
            r10.append(r15)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r2 = r2[r9]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r15 = 5
            r2 = r2[r15]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r10.append(r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.util.Date r2 = r8.parse(r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r18 = 0
            r8 = 2
            long r11 = r2.getTime()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.util.regex.Pattern[] r2 = new java.util.regex.Pattern[r9]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r2[r18] = r6     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.Object[] r2 = r1.f(r4, r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r2 != 0) goto Lb5
            com.bytedance.j.xt.tl.h.a(r4)
            return r3
        Lb5:
            r2 = r2[r9]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r0 = r0[r8]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r2 = r19
            r6 = 1
            long r8 = (long) r2     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 != 0) goto L1aa
            r2 = r20
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r0 != 0) goto Ld3
            goto L1aa
        Ld3:
            long r8 = r1.d     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 == 0) goto Lf3
            long r8 = r1.d     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            long r8 = r8 - r11
            long r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r13 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 >= 0) goto Lf3
            com.bytedance.j.xt.tl.h.a(r4)
            return r3
        Lec:
            r0 = move-exception
            r3 = r4
            goto L1b9
        Lf0:
            r0 = move-exception
            goto L1b2
        Lf3:
            r1.d = r11     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            android.content.SharedPreferences r0 = r1.f     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r0 == 0) goto L108
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r2 = "trace_anr_happen_time"
            long r8 = r1.d     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            android.content.SharedPreferences$Editor r0 = r0.putLong(r2, r8)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r0.apply()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
        L108:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r0.<init>()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r2 = "anrTime"
            r0.put(r2, r11)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r8 = 2
        L113:
            java.util.regex.Pattern[] r2 = new java.util.regex.Pattern[r8]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r2[r18] = r5     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r2[r6] = r7     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.Object[] r2 = r1.f(r4, r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r2 == 0) goto L1a6
            r9 = r2[r18]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r9 != r7) goto L1a6
            java.lang.String r9 = ""
            java.lang.String r10 = "\".+\""
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r11 = r2[r6]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.util.regex.Matcher r10 = r10.matcher(r11)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            boolean r11 = r10.find()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r11 == 0) goto L14c
            java.lang.String r9 = r10.group()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r10 = r10.group()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            int r10 = r10.length()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            int r10 = r10 - r6
            java.lang.String r9 = r9.substring(r6, r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
        L14c:
            java.lang.String r10 = "tid=\\d+"
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r6 = 1
            r2 = r2[r6]     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.util.regex.Matcher r2 = r10.matcher(r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            boolean r10 = r2.find()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r11 = -1
            if (r10 == 0) goto L179
            java.lang.String r2 = r2.group()     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r10 = "="
            int r10 = r2.indexOf(r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            r6 = 1
            int r10 = r10 + r6
            java.lang.String r2 = r2.substring(r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            goto L17a
        L179:
            r2 = -1
        L17a:
            java.lang.String r10 = r1.a(r4)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r2 == r11) goto L1a3
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r2 != 0) goto L1a3
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r2 != 0) goto L1a3
            java.lang.String r2 = "main"
            boolean r2 = r9.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            if (r2 == 0) goto L1a3
            java.lang.String r2 = "mainStackFromTrace"
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            java.lang.String r2 = "thread_number"
            r6 = 1
            r0.put(r2, r6)     // Catch: java.lang.Throwable -> Lec java.lang.Exception -> Lf0
            com.bytedance.j.xt.tl.h.a(r4)
            return r0
        L1a3:
            r6 = 1
            goto L113
        L1a6:
            com.bytedance.j.xt.tl.h.a(r4)
            return r3
        L1aa:
            com.bytedance.j.xt.tl.h.a(r4)
            return r3
        L1ae:
            r0 = move-exception
            goto L1b9
        L1b0:
            r0 = move-exception
            r4 = r3
        L1b2:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> Lec
            com.bytedance.j.xt.tl.h.a(r4)
            return r3
        L1b9:
            com.bytedance.j.xt.tl.h.a(r3)
            throw r0
        L1bd:
            return r3
    }

    public void c() {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto L5
            return
        L5:
            com.bytedance.j.xt.j.d r0 = new com.bytedance.j.xt.j.d
            r0.<init>(r1)
            r1.b = r0
            r0 = 1
            r1.e = r0
            return
    }

    boolean e(int r5, java.lang.String r6, int r7) {
            r4 = this;
            r0 = 0
            boolean r1 = com.bytedance.j.xt.j.a.g     // Catch: java.lang.Throwable -> L8
            org.json.JSONObject r1 = com.bytedance.j.xt.j.e.b(r1)     // Catch: java.lang.Throwable -> L8
            goto Ld
        L8:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            r1 = r0
        Ld:
            android.content.Context r2 = r4.c
            java.lang.String r7 = com.bytedance.j.xt.j.e.a(r2, r7)
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 0
            if (r2 == 0) goto L1b
            return r3
        L1b:
            com.bytedance.j.xt.g r2 = com.bytedance.j.xt.e.l()     // Catch: java.lang.Throwable -> Le0
            com.bytedance.j.xt.c r2 = r2.f()     // Catch: java.lang.Throwable -> Le0
            if (r2 == 0) goto Le0
            boolean r2 = r2.j()     // Catch: java.lang.Throwable -> Le0
            if (r2 != 0) goto L2d
            goto Le0
        L2d:
            r2 = 200(0xc8, float:2.8E-43)
            if (r5 != r2) goto L48
            int r5 = android.os.Process.myPid()
            android.content.Context r2 = r4.c
            java.lang.String r2 = r2.getPackageName()
            org.json.JSONObject r5 = r4.b(r6, r5, r2)
            if (r5 == 0) goto L48
            int r6 = r5.length()
            if (r6 <= 0) goto L48
            r1 = r5
        L48:
            r5 = 1
            if (r1 == 0) goto Ldf
            int r6 = r1.length()
            if (r6 <= 0) goto Ldf
            java.lang.String r6 = "pid"
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Ldb
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = "package"
            android.content.Context r2 = r4.c     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Ldb
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = "is_remote_process"
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.j.xt.cw.b r6 = new com.bytedance.j.xt.cw.b     // Catch: java.lang.Throwable -> Ldb
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldb
            r2.<init>()     // Catch: java.lang.Throwable -> Ldb
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = "data"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ldb
            r6.l(r2, r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "is_anr"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Ldb
            r6.l(r1, r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "timestamp"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Ldb
            r6.l(r1, r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "event_type"
            java.lang.String r2 = "anr"
            r6.l(r1, r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "anr_time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Ldb
            r6.l(r1, r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "crash_time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Ldb
            r6.l(r1, r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "anr_info"
            r6.l(r1, r7)     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.j.xt.up.j.f r1 = com.bytedance.j.xt.up.j.f.c()     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.j.xt.cw r2 = com.bytedance.j.xt.cw.f2132r     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.j.xt.cw.b r6 = r1.a(r2, r6)     // Catch: java.lang.Throwable -> Ldb
            android.content.Context r1 = r4.c     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r2.j()     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.j.xt.tl.k.e(r1, r2, r0)     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.j.xt.a$d r0 = com.bytedance.j.xt.a.d.b()     // Catch: java.lang.Throwable -> Ldb
            org.json.JSONObject r6 = r6.k()     // Catch: java.lang.Throwable -> Ldb
            r0.d(r6)     // Catch: java.lang.Throwable -> Ldb
            d(r7)     // Catch: java.lang.Throwable -> Ldb
            goto Ldf
        Ldb:
            r6 = move-exception
            com.bytedance.j.xt.tl.i.c(r6)
        Ldf:
            return r5
        Le0:
            return r3
    }
}
