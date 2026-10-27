package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class rn {
    private volatile org.json.JSONObject ae;
    private final android.content.SharedPreferences cw;
    private final android.content.Context j;

    /* renamed from: m, reason: collision with root package name */
    private volatile org.json.JSONObject f2096m;

    /* renamed from: r, reason: collision with root package name */
    private final android.content.SharedPreferences f2097r;
    private final android.content.SharedPreferences up;
    private final com.bytedance.embedapplog.tl xt;

    public rn(android.content.Context r2, com.bytedance.embedapplog.tl r3) {
            r1 = this;
            r1.<init>()
            r1.j = r2
            r1.xt = r3
            java.lang.String r3 = "embed_applog_stats"
            r0 = 0
            android.content.SharedPreferences r3 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r2, r3, r0)
            r1.up = r3
            java.lang.String r3 = "embed_header_custom"
            android.content.SharedPreferences r3 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r2, r3, r0)
            r1.cw = r3
            java.lang.String r3 = "embed_last_sp_session"
            android.content.SharedPreferences r2 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r2, r3, r0)
            r1.f2097r = r2
            return
    }

    @androidx.annotation.Nullable
    java.lang.String a() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.up
            java.lang.String r1 = "user_agent"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public long ae() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.up
            java.lang.String r1 = "app_log_last_config_time"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    java.lang.String av() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.cw
            java.lang.String r1 = "user_unique_id"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    java.lang.String az() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.cw
            java.lang.String r1 = "ab_sdk_version"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.f()
            return r0
    }

    java.lang.String ch() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int cw() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f2097r
            java.lang.String r1 = "session_order"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    void cw(org.json.JSONObject r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setAbConfig, "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.embedapplog.uc.j(r0, r1)
            android.content.SharedPreferences r0 = r3.cw
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "ab_configure"
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences$Editor r4 = r0.putString(r2, r4)
            r4.apply()
            r3.f2096m = r1
            return
    }

    public java.lang.String ed() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.tj()
            return r0
    }

    public boolean f() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.up
            java.lang.String r1 = "bav_log_collect"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.cw()
            return r0
    }

    public java.lang.String gq() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.jy()
            return r0
    }

    public java.lang.String gx() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.l()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.l()
            return r0
    }

    public int h() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            int r0 = r0.av()
            return r0
    }

    public com.bytedance.embedapplog.tl hh() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            return r0
    }

    public boolean i() {
            r5 = this;
            com.bytedance.embedapplog.tl r0 = r5.xt
            int r0 = r0.g()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L2c
            android.content.Context r0 = r5.j
            java.lang.String r0 = com.bytedance.embedapplog.ri.j(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L27
            com.bytedance.embedapplog.tl r3 = r5.xt
            java.lang.String r4 = ":"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L22
            r0 = 2
            goto L23
        L22:
            r0 = 1
        L23:
            r3.j(r0)
            goto L2c
        L27:
            com.bytedance.embedapplog.tl r0 = r5.xt
            r0.j(r1)
        L2c:
            com.bytedance.embedapplog.tl r0 = r5.xt
            int r0 = r0.g()
            if (r0 != r2) goto L35
            return r2
        L35:
            return r1
    }

    java.lang.String j() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.tl()
            return r0
    }

    public void j(java.lang.String r3, int r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f2097r
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "session_last_day"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            java.lang.String r0 = "session_order"
            android.content.SharedPreferences$Editor r3 = r3.putInt(r0, r4)
            r3.apply()
            return
    }

    public void j(org.json.JSONObject r15) {
            r14 = this;
            boolean r0 = com.bytedance.embedapplog.uc.xt
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setConfig, "
            r0.<init>(r1)
            java.lang.String r1 = r15.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.embedapplog.uc.j(r0, r1)
        L1a:
            r14.ae = r15
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r2 = r14.up
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "session_interval"
            r4 = 0
            int r5 = r15.optInt(r3, r4)
            long r5 = (long) r5
            r7 = 0
            r9 = 1000(0x3e8, double:4.94E-321)
            r11 = 604800(0x93a80, double:2.98811E-318)
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 <= 0) goto L43
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 > 0) goto L43
            long r5 = r5 * r9
            r2.putLong(r3, r5)
            goto L46
        L43:
            r2.remove(r3)
        L46:
            java.lang.String r3 = "batch_event_interval"
            int r5 = r15.optInt(r3, r4)
            long r5 = (long) r5
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 <= 0) goto L5b
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 > 0) goto L5b
            long r5 = r5 * r9
            r2.putLong(r3, r5)
            goto L5e
        L5b:
            r2.remove(r3)
        L5e:
            java.lang.String r3 = "send_launch_timely"
            int r5 = r15.optInt(r3, r4)
            if (r5 <= 0) goto L6f
            long r6 = (long) r5
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 > 0) goto L6f
            r2.putInt(r3, r5)
            goto L72
        L6f:
            r2.remove(r3)
        L72:
            java.lang.String r3 = "abtest_fetch_interval"
            int r5 = r15.optInt(r3, r4)
            long r5 = (long) r5
            r7 = 20
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 <= 0) goto L89
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 > 0) goto L89
            long r5 = r5 * r9
            r2.putLong(r3, r5)
            goto L8c
        L89:
            r2.remove(r3)
        L8c:
            java.lang.String r3 = "bav_log_collect"
            r5 = 1
            boolean r6 = r15.optBoolean(r3, r5)
            if (r6 == 0) goto L99
            r2.putBoolean(r3, r5)
            goto L9c
        L99:
            r2.remove(r3)
        L9c:
            com.bytedance.embedapplog.uc.j = r6
            java.lang.String r3 = "bav_ab_config"
            boolean r6 = r15.optBoolean(r3, r4)
            if (r6 == 0) goto Laa
            r2.putBoolean(r3, r5)
            goto Lad
        Laa:
            r2.remove(r3)
        Lad:
            java.lang.String r3 = "bav_monitor_rate"
            int r15 = r15.optInt(r3, r4)
            if (r15 <= 0) goto Lc0
            r6 = 100
            if (r15 > r6) goto Lc0
            r2.putInt(r3, r15)
            com.bytedance.embedapplog.im.j(r5)
            goto Lc6
        Lc0:
            r2.remove(r3)
            com.bytedance.embedapplog.im.j(r4)
        Lc6:
            java.lang.String r15 = "app_log_last_config_time"
            r2.putLong(r15, r0)
            r2.apply()
            return
    }

    public boolean j(java.util.ArrayList<com.bytedance.embedapplog.ya> r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    java.lang.String jy() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.ae()
            return r0
    }

    public org.json.JSONObject kt() {
            r5 = this;
            org.json.JSONObject r0 = r5.f2096m
            if (r0 != 0) goto L2c
            monitor-enter(r5)
            boolean r1 = r5.tj()     // Catch: java.lang.Throwable -> L1c org.json.JSONException -> L1e
            if (r1 == 0) goto L1f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c org.json.JSONException -> L1e
            android.content.SharedPreferences r2 = r5.cw     // Catch: java.lang.Throwable -> L1c org.json.JSONException -> L1e
            java.lang.String r3 = "ab_configure"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L1c org.json.JSONException -> L1e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c org.json.JSONException -> L1e
            r0 = r1
            goto L1f
        L1c:
            r0 = move-exception
            goto L2a
        L1e:
        L1f:
            if (r0 != 0) goto L26
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
        L26:
            r5.f2096m = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            return r0
        L2a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            throw r0
        L2c:
            return r0
    }

    public java.lang.String l() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.vl()
            return r0
    }

    public int la() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            int r0 = r0.i()
            return r0
    }

    public org.json.JSONObject m() {
            r1 = this;
            org.json.JSONObject r0 = r1.ae
            return r0
    }

    public java.lang.String mi() {
            r3 = this;
            com.bytedance.embedapplog.tl r0 = r3.xt
            java.lang.String r0 = r0.mi()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L13
            com.bytedance.embedapplog.tl r0 = r3.xt
            java.lang.String r0 = r0.mi()
            return r0
        L13:
            android.content.SharedPreferences r0 = r3.cw
            java.lang.String r1 = "ab_version"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public java.lang.String n() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.p()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.p()
            return r0
    }

    public boolean nd() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            boolean r0 = r0.x()
            return r0
    }

    public java.lang.String ol() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.a()
            return r0
    }

    java.lang.String oq() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.r()
            return r0
    }

    public int p() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            int r0 = r0.az()
            return r0
    }

    java.lang.String qv() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.up()
            return r0
    }

    public android.content.SharedPreferences r() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.up
            return r0
    }

    public boolean rh() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            boolean r0 = r0.ch()
            return r0
    }

    public java.lang.String rn() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.ws()
            return r0
    }

    java.lang.String s() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.j()
            return r0
    }

    public boolean tj() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.up
            java.lang.String r1 = "bav_ab_config"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public int tl() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.up
            java.lang.String r1 = "bav_monitor_rate"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public java.lang.String uf() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.kt()
            return r0
    }

    public boolean up() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            boolean r0 = r0.xt()
            return r0
    }

    public long v() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.up
            java.lang.String r1 = "session_interval"
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    java.lang.String vl() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.m()
            return r0
    }

    public long w() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.up
            java.lang.String r1 = "abtest_fetch_interval"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public java.lang.String wq() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.w()
            return r0
    }

    java.lang.String ws() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.cw
            java.lang.String r1 = "header_custom_info"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public long x() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.up
            java.lang.String r1 = "batch_event_interval"
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public java.lang.String xt() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f2097r
            java.lang.String r1 = "session_last_day"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    void xt(org.json.JSONObject r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.cw
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r3 == 0) goto Ld
            java.lang.String r3 = r3.toString()
            goto Lf
        Ld:
            java.lang.String r3 = ""
        Lf:
            java.lang.String r1 = "header_custom_info"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            r3.apply()
            return
    }

    public java.lang.CharSequence z() {
            r1 = this;
            com.bytedance.embedapplog.tl r0 = r1.xt
            java.lang.String r0 = r0.v()
            return r0
    }
}
