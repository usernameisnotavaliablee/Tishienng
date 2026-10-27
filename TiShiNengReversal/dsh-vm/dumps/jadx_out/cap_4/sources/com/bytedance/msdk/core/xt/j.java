package com.bytedance.msdk.core.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static final java.util.Calendar cw = null;
    private static final com.bytedance.msdk.tl.l j = null;
    private static final java.text.SimpleDateFormat xt = null;

    static {
            java.lang.String r0 = "tt_user_live_day_time"
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            com.bytedance.msdk.core.xt.j.j = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            com.bytedance.msdk.core.xt.j.xt = r0
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            com.bytedance.msdk.core.xt.j.cw = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String ae() {
            java.text.SimpleDateFormat r0 = com.bytedance.msdk.core.xt.j.xt
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static void ae(java.lang.String r7) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L74
            if (r7 != 0) goto Ld
            goto L74
        Ld:
            java.lang.String r0 = "_show_current_time_"
            java.lang.String r0 = xt(r7, r0)
            java.lang.String r1 = "_show_last_time_"
            java.lang.String r7 = xt(r7, r1)
            com.bytedance.msdk.tl.l r1 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r2 = "_show_gap_time_day"
            java.lang.String r3 = r1.xt(r2)
            java.lang.String r4 = ae()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "recordSameDayTwoAdIntervalTime curKey:"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = ",lastKey :"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = ",today:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = ",recordDate:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "AdLoadDynamicParamHandler"
            com.bytedance.msdk.j.up.cw.xt(r6, r5)
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L66
            r5 = 0
            r1.j(r7, r5)
            long r5 = java.lang.System.currentTimeMillis()
            r1.j(r0, r5)
            r1.j(r2, r4)
            return
        L66:
            long r2 = r1.r(r0)
            r1.j(r7, r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.j(r0, r2)
        L74:
            return
    }

    public static void cw() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recordSameDaySdkStartTimes start => enableDynamicPolicy:"
            r0.<init>(r1)
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.ed()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdLoadDynamicParamHandler"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 != 0) goto L26
            return
        L26:
            r0 = 0
            java.lang.String r1 = "tt_sdk_start_count_"
            j(r0, r1)
            return
    }

    public static void cw(java.lang.String r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L12
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r0 = "_show_count_"
            j(r1, r0)
        L12:
            return
    }

    private static int g(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "_"
            java.lang.String[] r3 = r3.split(r1)
            int r1 = r3.length
            r2 = 2
            if (r1 != r2) goto L18
            r1 = 1
            r3 = r3[r1]
            if (r3 == 0) goto L18
            int r3 = java.lang.Integer.parseInt(r3)
            return r3
        L18:
            return r0
    }

    private static int j(long r2, long r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2f
            java.time.Instant r2 = a1.a.a(r2)
            java.time.ZoneId r3 = a1.b.a()
            java.time.ZonedDateTime r2 = a1.c.a(r2, r3)
            java.time.LocalDate r2 = a1.d.a(r2)
            java.time.Instant r3 = a1.a.a(r4)
            java.time.ZoneId r4 = a1.b.a()
            java.time.ZonedDateTime r3 = a1.c.a(r3, r4)
            java.time.LocalDate r3 = a1.d.a(r3)
            java.time.Period r2 = a1.e.a(r2, r3)
            int r2 = a1.f.a(r2)
            return r2
        L2f:
            long r4 = r4 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 / r2
            int r2 = (int) r4
            return r2
    }

    private static java.lang.String j(java.lang.String r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String j(java.util.Date r1, int r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.Calendar r0 = com.bytedance.msdk.core.xt.j.cw
            r0.setTime(r1)
            r1 = 5
            r0.add(r1, r2)
            java.util.Date r1 = r0.getTime()
            java.text.SimpleDateFormat r2 = com.bytedance.msdk.core.xt.j.xt
            java.lang.String r1 = r2.format(r1)
            return r1
    }

    public static void j() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recordUserLiveDay start => enableDynamicPolicy:"
            r0.<init>(r1)
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.ed()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdLoadDynamicParamHandler"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 != 0) goto L26
            return
        L26:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = ae()
            java.lang.String r4 = "当前日期(key)："
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r4 = r4.concat(r5)
            com.bytedance.msdk.j.up.cw.xt(r1, r4)
            com.bytedance.msdk.tl.l r4 = com.bytedance.msdk.core.xt.j.j
            boolean r5 = r4.up(r0)
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "key="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "，同一天，不再重新记录"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            return
        L5a:
            java.lang.String r5 = "start_index"
            java.lang.String r6 = r4.xt(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L76
            r4.j(r5, r0)
            java.lang.String r6 = "START_INDEX="
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r6 = r6.concat(r7)
            com.bytedance.msdk.j.up.cw.xt(r1, r6)
        L76:
            r6 = 1
            r4.j(r0, r6)
            r7 = 0
            java.lang.String r8 = "user_live_times"
            int r7 = r4.xt(r8, r7)
            int r7 = r7 + r6
            r4.j(r8, r7)
            java.lang.String r6 = r4.xt(r5)
            boolean r7 = android.text.TextUtils.equals(r6, r0)
            if (r7 != 0) goto L106
            java.text.SimpleDateFormat r7 = com.bytedance.msdk.core.xt.j.xt     // Catch: java.text.ParseException -> La1
            java.util.Date r8 = r7.parse(r6)     // Catch: java.text.ParseException -> La1
            java.util.Date r0 = r7.parse(r0)     // Catch: java.text.ParseException -> La1
            if (r0 != 0) goto La3
            java.util.Date r0 = new java.util.Date     // Catch: java.text.ParseException -> La1
            r0.<init>()     // Catch: java.text.ParseException -> La1
            goto La3
        La1:
            r0 = move-exception
            goto Lf0
        La3:
            if (r8 == 0) goto L124
            long r9 = r8.getTime()     // Catch: java.text.ParseException -> La1
            long r11 = r0.getTime()     // Catch: java.text.ParseException -> La1
            int r0 = j(r9, r11)     // Catch: java.text.ParseException -> La1
            com.bytedance.msdk.core.ws.cw r7 = com.bytedance.msdk.core.xt.xt()     // Catch: java.text.ParseException -> La1
            int r7 = r7.e()     // Catch: java.text.ParseException -> La1
            int r9 = r7 - r0
            if (r9 >= 0) goto L124
            int r0 = r0 - r7
            java.lang.String r7 = j(r8, r0)     // Catch: java.text.ParseException -> La1
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch: java.text.ParseException -> La1
            if (r9 != 0) goto Lce
            r4.j(r5, r7)     // Catch: java.text.ParseException -> La1
            j(r6, r8, r0)     // Catch: java.text.ParseException -> La1
        Lce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.text.ParseException -> La1
            java.lang.String r5 = "old-startIndex:"
            r4.<init>(r5)     // Catch: java.text.ParseException -> La1
            r4.append(r6)     // Catch: java.text.ParseException -> La1
            java.lang.String r5 = ",diff="
            r4.append(r5)     // Catch: java.text.ParseException -> La1
            r4.append(r0)     // Catch: java.text.ParseException -> La1
            java.lang.String r0 = ",new-startIndex:"
            r4.append(r0)     // Catch: java.text.ParseException -> La1
            r4.append(r7)     // Catch: java.text.ParseException -> La1
            java.lang.String r0 = r4.toString()     // Catch: java.text.ParseException -> La1
            com.bytedance.msdk.j.up.cw.xt(r1, r0)     // Catch: java.text.ParseException -> La1
            goto L124
        Lf0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "计算生成日期出错："
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            goto L124
        L106:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "startDay:"
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = ",key="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "，同一天，不处理"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
        L124:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "recordUserLiveDay方法，执行耗时："
            r0.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r0.append(r4)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            return
    }

    public static void j(java.lang.String r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L12
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r0 = "_dislike_count_"
            j(r1, r0)
        L12:
            return
    }

    private static void j(java.lang.String r9, java.lang.String r10) {
            java.lang.String r9 = xt(r9, r10)
            java.lang.String r10 = ae()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r1 = r0.xt(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "saveToSpByAction key:"
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r4 = ",old value:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "AdLoadDynamicParamHandler"
            com.bytedance.msdk.j.up.cw.xt(r4, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r5 = "，new value："
            r6 = 1
            if (r2 != 0) goto L70
            java.lang.String r2 = "_"
            java.lang.String[] r2 = r1.split(r2)
            int r7 = r2.length
            r8 = 2
            if (r7 != r8) goto L57
            r1 = 0
            r1 = r2[r1]
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 != 0) goto L53
            boolean r7 = android.text.TextUtils.equals(r10, r1)
            if (r7 == 0) goto L53
            r10 = r2[r6]
            int r10 = java.lang.Integer.parseInt(r10)
            int r6 = r6 + r10
            r10 = r1
        L53:
            java.lang.String r1 = j(r10, r6)
        L57:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r3)
            r10.append(r9)
            r10.append(r5)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.bytedance.msdk.j.up.cw.xt(r4, r10)
            r0.j(r9, r1)
            return
        L70:
            java.lang.String r1 = j(r10, r6)
            r0.j(r9, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "saveToSpByAction 首次记录 key:"
            r0.<init>(r1)
            r0.append(r9)
            r0.append(r5)
            java.lang.String r9 = j(r10, r6)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r4, r9)
            return
    }

    private static void j(java.lang.String r6, java.util.Date r7, int r8) {
            r0 = 0
            java.lang.String r1 = "user_live_times"
            r2 = 1
            if (r8 != r2) goto L1e
            com.bytedance.msdk.tl.l r7 = com.bytedance.msdk.core.xt.j.j
            boolean r8 = r7.up(r6)
            if (r8 == 0) goto L1a
            int r8 = r7.cw(r1)
            int r8 = r8 - r2
            int r8 = java.lang.Math.max(r8, r0)
            r7.j(r1, r8)
        L1a:
            r7.m(r6)
            return
        L1e:
            r6 = 0
        L1f:
            if (r6 >= r8) goto L3f
            int r6 = r6 + 1
            java.lang.String r3 = j(r7, r6)
            com.bytedance.msdk.tl.l r4 = com.bytedance.msdk.core.xt.j.j
            boolean r5 = r4.up(r3)
            if (r5 == 0) goto L3b
            int r5 = r4.cw(r1)
            int r5 = r5 - r2
            int r5 = java.lang.Math.max(r5, r0)
            r4.j(r1, r5)
        L3b:
            r4.m(r3)
            goto L1f
        L3f:
            return
    }

    public static void j(java.util.List<com.bytedance.msdk.xt.cw> r3, com.bytedance.msdk.core.oq.xt r4) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L2f
            if (r3 == 0) goto L2f
            if (r4 != 0) goto Lf
            goto L2f
        Lf:
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            if (r0 == 0) goto L13
            java.util.Map r0 = r0.p()
            java.lang.String r1 = "prime_rit"
            java.lang.String r2 = r4.rn()
            r0.put(r1, r2)
            goto L13
        L2f:
            return
    }

    public static int m(java.lang.String r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L1e
            if (r1 != 0) goto Ld
            goto L1e
        Ld:
            java.lang.String r0 = "_click_count_"
            java.lang.String r1 = xt(r1, r0)
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r1 = r0.xt(r1)
            int r1 = g(r1)
            return r1
        L1e:
            r1 = -1
            return r1
    }

    public static long m() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 != 0) goto Ld
            r0 = -1
            return r0
        Ld:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            long r0 = r0.up()
            float r0 = (float) r0
            r1 = 1198153728(0x476a6000, float:60000.0)
            float r0 = r0 / r1
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L28
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L28
            r0 = 1
            return r0
        L28:
            int r0 = java.lang.Math.round(r0)
            long r0 = (long) r0
            return r0
    }

    public static int r() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 != 0) goto Lc
            r0 = -1
            return r0
        Lc:
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r1 = "tt_sdk_start_count_"
            java.lang.String r0 = r0.xt(r1)
            int r0 = g(r0)
            return r0
    }

    public static int r(java.lang.String r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L1e
            if (r1 != 0) goto Ld
            goto L1e
        Ld:
            java.lang.String r0 = "_show_count_"
            java.lang.String r1 = xt(r1, r0)
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r1 = r0.xt(r1)
            int r1 = g(r1)
            return r1
        L1e:
            r1 = -1
            return r1
    }

    public static long tl(java.lang.String r7) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L46
            if (r7 != 0) goto Ld
            goto L46
        Ld:
            java.lang.String r0 = "_show_current_time_"
            java.lang.String r0 = xt(r7, r0)
            java.lang.String r1 = "_show_last_time_"
            java.lang.String r7 = xt(r7, r1)
            com.bytedance.msdk.tl.l r1 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r2 = "_show_gap_time_day"
            java.lang.String r2 = r1.xt(r2)
            java.lang.String r3 = ae()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            r3 = 0
            if (r2 != 0) goto L2e
            return r3
        L2e:
            long r5 = r1.r(r7)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L37
            return r3
        L37:
            long r0 = r1.r(r0)
            long r0 = r0 - r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            float r7 = (float) r0
            int r7 = java.lang.Math.round(r7)
            long r0 = (long) r7
            return r0
        L46:
            r0 = -1
            return r0
    }

    public static int up() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 != 0) goto Lc
            r0 = -1
            return r0
        Lc:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            long r0 = r0.cw()
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = j(r0, r2)
            return r0
    }

    public static void up(java.lang.String r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L12
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r0 = "_click_count_"
            j(r1, r0)
        L12:
            return
    }

    public static int xt() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 != 0) goto Lc
            r0 = -1
            return r0
        Lc:
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r1 = "user_live_times"
            r2 = 0
            int r0 = r0.xt(r1, r2)
            return r0
    }

    public static int xt(java.lang.String r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L1e
            if (r1 != 0) goto Ld
            goto L1e
        Ld:
            java.lang.String r0 = "_dislike_count_"
            java.lang.String r1 = xt(r1, r0)
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.core.xt.j.j
            java.lang.String r1 = r0.xt(r1)
            int r1 = g(r1)
            return r1
        L1e:
            r1 = -1
            return r1
    }

    private static java.lang.String xt(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
