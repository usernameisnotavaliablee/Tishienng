package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class v {
    public v() {
            r1 = this;
            r1.<init>()
            return
    }

    private static org.json.JSONObject cw() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "imei"
            java.lang.String r2 = com.bytedance.msdk.tl.x.tj()     // Catch: org.json.JSONException -> L51
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = "imei_md5"
            java.lang.String r2 = com.bytedance.msdk.tl.x.tj()     // Catch: org.json.JSONException -> L51
            java.lang.String r2 = com.bytedance.msdk.tl.f.j(r2)     // Catch: org.json.JSONException -> L51
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = "gaid"
            com.bytedance.msdk.tl.tl r2 = com.bytedance.msdk.tl.tl.j()     // Catch: org.json.JSONException -> L51
            java.lang.String r2 = r2.xt()     // Catch: org.json.JSONException -> L51
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = "applog_did"
            java.lang.String r2 = com.bytedance.msdk.tl.x.j()     // Catch: org.json.JSONException -> L51
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = "publisher_did"
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: org.json.JSONException -> L51
            java.lang.String r2 = r2.w()     // Catch: org.json.JSONException -> L51
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = "android_id"
            java.lang.String r2 = com.bytedance.msdk.tl.x.r()     // Catch: org.json.JSONException -> L51
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = "oaid"
            java.lang.String r2 = com.bytedance.msdk.tl.x.xt()     // Catch: org.json.JSONException -> L51
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L51
            return r0
        L51:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static java.lang.String j(java.lang.String r2) {
            java.lang.String r0 = ","
            java.lang.String[] r2 = r2.split(r0)
            if (r2 == 0) goto L1b
            int r0 = r2.length
            if (r0 <= 0) goto L1b
            r0 = 0
            r1 = r2[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1b
            r2 = r2[r0]
            java.lang.String r2 = r2.trim()
            return r2
        L1b:
            java.lang.String r2 = "127.0.0.1"
            return r2
    }

    public static org.json.JSONObject j() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "os"
            int r2 = com.bytedance.msdk.tl.x.jy()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "imei"
            java.lang.String r2 = com.bytedance.msdk.tl.x.tj()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "imei_md5"
            java.lang.String r2 = com.bytedance.msdk.tl.x.tj()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = com.bytedance.msdk.tl.f.j(r2)     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "gaid"
            com.bytedance.msdk.tl.tl r2 = com.bytedance.msdk.tl.tl.j()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = r2.xt()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "oaid"
            java.lang.String r2 = com.bytedance.msdk.tl.x.xt()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "applog_did"
            java.lang.String r2 = com.bytedance.msdk.tl.x.j()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "device_model"
            java.lang.String r2 = com.bytedance.msdk.tl.x.ae()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "vendor"
            java.lang.String r2 = com.bytedance.msdk.tl.x.i()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "ua"
            java.lang.String r2 = com.bytedance.msdk.tl.x.h()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "ip"
            java.lang.String r2 = com.bytedance.msdk.tl.x.f()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "package_name"
            java.lang.String r2 = com.bytedance.msdk.tl.rn.j()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "publisher_did"
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = r2.w()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "android_id"
            java.lang.String r2 = com.bytedance.msdk.tl.x.r()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "os_version"
            java.lang.String r2 = com.bytedance.msdk.tl.x.ws()     // Catch: java.lang.Throwable -> L8f
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8f
        L8f:
            return r0
    }

    public static org.json.JSONObject j(android.content.Context r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "imei"
            java.lang.String r2 = com.bytedance.msdk.tl.x.tj()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "android_id"
            java.lang.String r2 = com.bytedance.msdk.tl.x.r()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "uuid"
            java.lang.String r2 = com.bytedance.msdk.tl.x.v()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "ssid"
            java.lang.String r2 = com.bytedance.msdk.tl.x.ch()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "wifi_mac"
            java.lang.String r2 = com.bytedance.msdk.tl.x.s()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "imsi"
            java.lang.String r2 = com.bytedance.msdk.tl.x.x()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "power_on_time"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r2.<init>()     // Catch: java.lang.Throwable -> Lc5
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lc5
            r2.append(r3)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "rom_version"
            java.lang.String r2 = com.bytedance.msdk.tl.a.j()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "sys_compiling_time"
            java.lang.String r2 = com.bytedance.msdk.tl.x.cw()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "type"
            int r2 = com.bytedance.msdk.tl.x.p()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "os"
            int r2 = com.bytedance.msdk.tl.x.jy()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "os_version"
            java.lang.String r2 = com.bytedance.msdk.tl.x.ws()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "vendor"
            java.lang.String r2 = com.bytedance.msdk.tl.x.i()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "device_model"
            java.lang.String r2 = com.bytedance.msdk.tl.x.ae()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "language"
            java.lang.String r2 = com.bytedance.msdk.tl.x.g()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "conn_type"
            int r2 = com.bytedance.msdk.tl.x.up()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "mac"
            java.lang.String r2 = com.bytedance.msdk.tl.x.l()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "screen_width"
            int r2 = com.bytedance.msdk.j.up.ae.xt(r5)     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "screen_height"
            int r5 = com.bytedance.msdk.j.up.ae.cw(r5)     // Catch: java.lang.Throwable -> Lc5
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r5 = "oaid"
            java.lang.String r1 = com.bytedance.msdk.tl.x.xt()     // Catch: java.lang.Throwable -> Lc5
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            return r0
    }

    private static void j(android.content.Context r1, org.json.JSONObject r2) {
            if (r1 == 0) goto L21
            if (r2 == 0) goto L21
            java.lang.String r0 = "MD5"
            java.util.ArrayList r1 = com.bytedance.msdk.tl.oq.j(r1, r0)
            if (r1 == 0) goto L21
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L21
            java.lang.String r1 = "sig_hash"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: org.json.JSONException -> L1a
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L1a
            return
        L1a:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L21:
            return
    }

    public static org.json.JSONObject xt() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r2 = "device_id"
            java.lang.String r3 = com.bytedance.msdk.tl.x.j()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "user_unique_id"
            java.lang.String r3 = com.bytedance.msdk.tl.x.j()     // Catch: java.lang.Exception -> L23
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L23
            if (r3 != 0) goto L26
            java.lang.String r3 = com.bytedance.msdk.tl.x.j()     // Catch: java.lang.Exception -> L23
            goto L2e
        L23:
            r1 = move-exception
            goto L17d
        L26:
            java.util.UUID r3 = java.util.UUID.randomUUID()     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L23
        L2e:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "sdk_version"
            java.lang.String r3 = com.bytedance.msdk.xt.xt.xt()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "plugin_version"
            java.lang.String r3 = com.bytedance.msdk.xt.xt.r()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "os"
            java.lang.String r3 = "Android"
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "os_version"
            java.lang.String r3 = com.bytedance.msdk.tl.x.ws()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "device_model"
            java.lang.String r3 = com.bytedance.msdk.tl.x.ae()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "resolution"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r3.<init>()     // Catch: java.lang.Exception -> L23
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Exception -> L23
            int r4 = com.bytedance.msdk.j.up.ae.cw(r4)     // Catch: java.lang.Exception -> L23
            r3.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r4 = "x"
            r3.append(r4)     // Catch: java.lang.Exception -> L23
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Exception -> L23
            int r4 = com.bytedance.msdk.j.up.ae.xt(r4)     // Catch: java.lang.Exception -> L23
            r3.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "language"
            java.lang.String r3 = com.bytedance.msdk.tl.x.g()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "timezone"
            int r3 = com.bytedance.msdk.tl.x.gq()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "access"
            java.lang.String r3 = com.bytedance.msdk.tl.x.m()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "openudid"
            java.lang.String r3 = com.bytedance.msdk.tl.x.r()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "aid"
            java.lang.String r3 = "5685"
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "display_name"
            java.lang.String r3 = com.bytedance.msdk.tl.g.xt()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "app_version"
            java.lang.String r3 = com.bytedance.msdk.tl.g.j()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "package"
            java.lang.String r3 = com.bytedance.msdk.tl.rn.j()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "region"
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = r3.getCountry()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "tz_name"
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L23
            java.util.TimeZone r3 = r3.getTimeZone()     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = r3.getID()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "tz_offset"
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L23
            java.util.TimeZone r3 = r3.getTimeZone()     // Catch: java.lang.Exception -> L23
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L23
            int r3 = r3.getOffset(r4)     // Catch: java.lang.Exception -> L23
            int r3 = r3 / 1000
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "rom"
            java.lang.String r3 = com.bytedance.msdk.tl.x.la()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "device_manufacturer"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            j(r1, r0)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "display_density"
            java.lang.String r3 = com.bytedance.msdk.tl.x.rn()     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "os_api"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L23
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "density_dpi"
            int r1 = com.bytedance.msdk.j.up.ae.up(r1)     // Catch: java.lang.Exception -> L23
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "device_brand"
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L23
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "cpu_abi"
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch: java.lang.Exception -> L23
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "build_serial"
            java.lang.String r2 = com.bytedance.msdk.tl.x.a()     // Catch: java.lang.Exception -> L23
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "version_code"
            java.lang.String r2 = com.bytedance.msdk.tl.rn.xt()     // Catch: java.lang.Exception -> L23
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "udid"
            java.lang.String r2 = com.bytedance.msdk.tl.x.tj()     // Catch: java.lang.Exception -> L23
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "custom"
            org.json.JSONObject r2 = cw()     // Catch: java.lang.Exception -> L23
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = com.bytedance.msdk.tl.x.f()     // Catch: java.lang.Exception -> L23
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L16b
            java.lang.String r1 = "127.0.0.1"
            goto L177
        L16b:
            java.lang.String r2 = ","
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L177
            java.lang.String r1 = j(r1)     // Catch: java.lang.Exception -> L23
        L177:
            java.lang.String r2 = "ip"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L23
            return r0
        L17d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "exception: "
            r2.<init>(r3)
            java.lang.String r3 = r1.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "getUploadEventV3Header"
            com.bytedance.msdk.up.xt.xt.j(r3, r2)
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }
}
