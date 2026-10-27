package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s0 {
    public static com.acse.ottn.s0 a;

    public s0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(long r2) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            r0.setTime(r1)
            r2 = 7
            int r3 = r0.get(r2)
            r0 = 1
            if (r3 != r0) goto L17
            java.lang.String r2 = "周日"
            return r2
        L17:
            r0 = 2
            if (r3 != r0) goto L1d
            java.lang.String r2 = "周一"
            return r2
        L1d:
            r0 = 3
            if (r3 != r0) goto L23
            java.lang.String r2 = "周二"
            return r2
        L23:
            r0 = 4
            if (r3 != r0) goto L29
            java.lang.String r2 = "周三"
            return r2
        L29:
            r0 = 5
            if (r3 != r0) goto L2f
            java.lang.String r2 = "周四"
            return r2
        L2f:
            r0 = 6
            if (r3 != r0) goto L35
            java.lang.String r2 = "周五"
            return r2
        L35:
            if (r3 != r2) goto L3a
            java.lang.String r2 = "周六"
            return r2
        L3a:
            r2 = 0
            return r2
    }

    public static java.lang.String a(java.lang.String r6) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日HH时mm分ss秒"
            r0.<init>(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r1.getClass()
            int r6 = java.lang.Integer.parseInt(r6)
            java.util.Date r1 = new java.util.Date
            long r2 = (long) r6
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.<init>(r2)
            java.lang.String r6 = r0.format(r1)
            r1 = 7
            java.util.Date r6 = r0.parse(r6)     // Catch: java.text.ParseException -> L31
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.text.ParseException -> L31
            r0.setTime(r6)     // Catch: java.text.ParseException -> L31
            int r6 = r0.get(r1)     // Catch: java.text.ParseException -> L31
            goto L32
        L31:
            r6 = 0
        L32:
            r0 = 1
            if (r6 != r0) goto L38
            java.lang.String r6 = "星期日"
            goto L5c
        L38:
            r0 = 2
            if (r6 != r0) goto L3e
            java.lang.String r6 = "星期一"
            goto L5c
        L3e:
            r0 = 3
            if (r6 != r0) goto L44
            java.lang.String r6 = "星期二"
            goto L5c
        L44:
            r0 = 4
            if (r6 != r0) goto L4a
            java.lang.String r6 = "星期三"
            goto L5c
        L4a:
            r0 = 5
            if (r6 != r0) goto L50
            java.lang.String r6 = "星期四"
            goto L5c
        L50:
            r0 = 6
            if (r6 != r0) goto L56
            java.lang.String r6 = "星期五"
            goto L5c
        L56:
            if (r6 != r1) goto L5b
            java.lang.String r6 = "星期六"
            goto L5c
        L5b:
            r6 = 0
        L5c:
            return r6
    }

    public static java.lang.String a(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "000"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = b(r1, r4)
            r0.append(r4)
            java.lang.String r4 = "  "
            r0.append(r4)
            java.lang.String r3 = b(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String b(java.lang.String r6) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd-HH-mm-ss"
            r0.<init>(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r1.getClass()
            int r6 = java.lang.Integer.parseInt(r6)
            java.util.Date r1 = new java.util.Date
            long r2 = (long) r6
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.<init>(r2)
            java.lang.String r6 = r0.format(r1)
            r1 = 7
            java.util.Date r6 = r0.parse(r6)     // Catch: java.text.ParseException -> L31
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.text.ParseException -> L31
            r0.setTime(r6)     // Catch: java.text.ParseException -> L31
            int r6 = r0.get(r1)     // Catch: java.text.ParseException -> L31
            goto L32
        L31:
            r6 = 0
        L32:
            r0 = 1
            if (r6 != r0) goto L38
            java.lang.String r6 = "星期日"
            goto L5c
        L38:
            r0 = 2
            if (r6 != r0) goto L3e
            java.lang.String r6 = "星期一"
            goto L5c
        L3e:
            r0 = 3
            if (r6 != r0) goto L44
            java.lang.String r6 = "星期二"
            goto L5c
        L44:
            r0 = 4
            if (r6 != r0) goto L4a
            java.lang.String r6 = "星期三"
            goto L5c
        L4a:
            r0 = 5
            if (r6 != r0) goto L50
            java.lang.String r6 = "星期四"
            goto L5c
        L50:
            r0 = 6
            if (r6 != r0) goto L56
            java.lang.String r6 = "星期五"
            goto L5c
        L56:
            if (r6 != r1) goto L5b
            java.lang.String r6 = "星期六"
            goto L5c
        L5b:
            r6 = 0
        L5c:
            return r6
    }

    public static java.lang.String b(java.lang.String r3, java.lang.String r4) {
            java.util.Date r0 = new java.util.Date
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r1 = r3.longValue()
            r0.<init>(r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r4)
            java.lang.String r3 = r3.format(r0)
            return r3
    }

    public static java.lang.String c() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日  HH时mm分"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static java.lang.String c(java.lang.String r2, java.lang.String r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.CHINA
            r0.<init>(r3, r1)
            java.util.Date r2 = r0.parse(r2)     // Catch: java.text.ParseException -> L1b
            long r2 = r2.getTime()     // Catch: java.text.ParseException -> L1b
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.text.ParseException -> L1b
            r3 = 0
            r0 = 10
            java.lang.String r2 = r2.substring(r3, r0)     // Catch: java.text.ParseException -> L1b
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public static com.acse.ottn.s0 d() {
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.s0> r0 = com.acse.ottn.s0.class
            monitor-enter(r0)
            com.acse.ottn.s0 r1 = com.acse.ottn.s0.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.s0 r1 = new com.acse.ottn.s0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.s0.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.a
            return r0
    }

    public static java.lang.String[] g(java.lang.String r6) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日HH时mm分ss秒"
            r0.<init>(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r1.getClass()
            int r6 = java.lang.Integer.parseInt(r6)
            java.util.Date r1 = new java.util.Date
            long r2 = (long) r6
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.<init>(r2)
            java.lang.String r6 = r0.format(r1)
            java.lang.String r0 = "[年月日时分秒]"
            java.lang.String[] r6 = r6.split(r0)
            return r6
    }

    public static java.lang.String i(java.lang.String r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日"
            r0.<init>(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r1 = r3.longValue()
            java.util.Date r3 = new java.util.Date
            r3.<init>(r1)
            java.lang.String r3 = r0.format(r3)
            return r3
    }

    public java.lang.String a() {
            r4 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public int b() {
            r4 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.CHINA
            java.lang.String r2 = "HHmm"
            r0.<init>(r2, r1)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r0 = r0.format(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public java.lang.String b(long r3) {
            r2 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MM月dd日  #  HH:mm"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            java.lang.String r0 = r0.format(r1)
            java.lang.String r3 = a(r3)
            java.lang.String r4 = "#"
            java.lang.String r3 = r0.replaceAll(r4, r3)
            return r3
    }

    public long c(java.lang.String r4) {
            r3 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.CHINA
            java.lang.String r2 = "yyyy-MM-dd"
            r0.<init>(r2, r1)
            java.util.Date r4 = r0.parse(r4)     // Catch: java.text.ParseException -> L12
            long r0 = r4.getTime()     // Catch: java.text.ParseException -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public java.lang.String[] d(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[年月日时分秒]"
            java.lang.String[] r2 = r2.split(r0)
            return r2
    }

    public final java.lang.Object e() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.a
            return r0
    }

    public java.lang.String e(java.lang.String r7) {
            r6 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日HH时mm分ss秒"
            r0.<init>(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r1.getClass()
            int r7 = java.lang.Integer.parseInt(r7)
            java.util.Date r1 = new java.util.Date
            long r2 = (long) r7
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.<init>(r2)
            java.lang.String r7 = r0.format(r1)
            return r7
    }

    public java.lang.String f(java.lang.String r4) {
            r3 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "HH-mm-ss"
            r0.<init>(r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r1 = r4.longValue()
            java.util.Date r4 = new java.util.Date
            r4.<init>(r1)
            java.lang.String r4 = r0.format(r4)
            return r4
    }

    public java.lang.String h(java.lang.String r7) {
            r6 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日HH时mm分"
            r0.<init>(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r1.getClass()
            int r7 = java.lang.Integer.parseInt(r7)
            java.util.Date r1 = new java.util.Date
            long r2 = (long) r7
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.<init>(r2)
            java.lang.String r7 = r0.format(r1)
            return r7
    }

    public java.lang.String j(java.lang.String r3) {
            r2 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日HH时mm分ss秒"
            r0.<init>(r1)
            r1 = 7
            java.util.Date r3 = r0.parse(r3)     // Catch: java.text.ParseException -> L18
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.text.ParseException -> L18
            r0.setTime(r3)     // Catch: java.text.ParseException -> L18
            int r3 = r0.get(r1)     // Catch: java.text.ParseException -> L18
            goto L19
        L18:
            r3 = 0
        L19:
            r0 = 1
            if (r3 != r0) goto L1f
            java.lang.String r3 = "星期日"
            goto L43
        L1f:
            r0 = 2
            if (r3 != r0) goto L25
            java.lang.String r3 = "星期一"
            goto L43
        L25:
            r0 = 3
            if (r3 != r0) goto L2b
            java.lang.String r3 = "星期二"
            goto L43
        L2b:
            r0 = 4
            if (r3 != r0) goto L31
            java.lang.String r3 = "星期三"
            goto L43
        L31:
            r0 = 5
            if (r3 != r0) goto L37
            java.lang.String r3 = "星期四"
            goto L43
        L37:
            r0 = 6
            if (r3 != r0) goto L3d
            java.lang.String r3 = "星期五"
            goto L43
        L3d:
            if (r3 != r1) goto L42
            java.lang.String r3 = "星期六"
            goto L43
        L42:
            r3 = 0
        L43:
            return r3
    }

    public java.lang.String k(java.lang.String r3) {
            r2 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd-HH-mm-ss"
            r0.<init>(r1)
            r1 = 7
            java.util.Date r3 = r0.parse(r3)     // Catch: java.text.ParseException -> L18
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.text.ParseException -> L18
            r0.setTime(r3)     // Catch: java.text.ParseException -> L18
            int r3 = r0.get(r1)     // Catch: java.text.ParseException -> L18
            goto L19
        L18:
            r3 = 0
        L19:
            r0 = 1
            if (r3 != r0) goto L1f
            java.lang.String r3 = "星期日"
            goto L43
        L1f:
            r0 = 2
            if (r3 != r0) goto L25
            java.lang.String r3 = "星期一"
            goto L43
        L25:
            r0 = 3
            if (r3 != r0) goto L2b
            java.lang.String r3 = "星期二"
            goto L43
        L2b:
            r0 = 4
            if (r3 != r0) goto L31
            java.lang.String r3 = "星期三"
            goto L43
        L31:
            r0 = 5
            if (r3 != r0) goto L37
            java.lang.String r3 = "星期四"
            goto L43
        L37:
            r0 = 6
            if (r3 != r0) goto L3d
            java.lang.String r3 = "星期五"
            goto L43
        L3d:
            if (r3 != r1) goto L42
            java.lang.String r3 = "星期六"
            goto L43
        L42:
            r3 = 0
        L43:
            return r3
    }
}
