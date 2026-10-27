package com.ss.android.socialbase.downloader.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isDigitsOnly(r4)     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L1a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L16
            long r0 = r4.longValue()     // Catch: java.lang.Exception -> L16
            r2 = 100
            long r0 = r0 % r2
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L16
            return r4
        L16:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L1a:
            java.lang.String r4 = ""
            return r4
    }

    private static org.json.JSONObject j(java.lang.String r10, com.ss.android.socialbase.downloader.ae.cw r11, com.ss.android.socialbase.downloader.up.j r12, int r13) {
            java.lang.String r0 = "setting_tag"
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L23c
            r2.<init>()     // Catch: org.json.JSONException -> L23c
            com.ss.android.socialbase.downloader.downloader.w r1 = com.ss.android.socialbase.downloader.downloader.cw.oq()     // Catch: org.json.JSONException -> L22
            r3 = 0
            java.lang.String r4 = ""
            if (r1 == 0) goto L26
            java.lang.String r5 = r1.xt()     // Catch: org.json.JSONException -> L22
            java.lang.String r6 = j(r5)     // Catch: org.json.JSONException -> L22
            java.lang.String r7 = r1.j()     // Catch: org.json.JSONException -> L22
            int r1 = r1.cw()     // Catch: org.json.JSONException -> L22
            goto L2a
        L22:
            r10 = move-exception
            r1 = r2
            goto L23d
        L26:
            r5 = r4
            r6 = r5
            r7 = r6
            r1 = 0
        L2a:
            if (r12 == 0) goto L38
            boolean r8 = r12 instanceof com.ss.android.socialbase.downloader.up.tl     // Catch: org.json.JSONException -> L22
            if (r8 == 0) goto L38
            r8 = r12
            com.ss.android.socialbase.downloader.up.tl r8 = (com.ss.android.socialbase.downloader.up.tl) r8     // Catch: org.json.JSONException -> L22
            java.lang.String r8 = r8.r()     // Catch: org.json.JSONException -> L22
            goto L39
        L38:
            r8 = r4
        L39:
            java.lang.String r9 = "event_page"
            r2.put(r9, r10)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "app_id"
            r2.put(r10, r7)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "device_id"
            r2.put(r10, r5)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "device_id_postfix"
            r2.put(r10, r6)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "update_version"
            r2.put(r10, r1)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "download_status"
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            if (r11 == 0) goto L220
            int r10 = r11.ae()     // Catch: org.json.JSONException -> L22
            com.ss.android.socialbase.downloader.jy.j r10 = com.ss.android.socialbase.downloader.jy.j.j(r10)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = r10.cw(r0)     // Catch: org.json.JSONException -> L22
            r2.put(r0, r10)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "download_id"
            int r13 = r11.ae()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "name"
            java.lang.String r13 = r11.tl()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "url"
            java.lang.String r13 = r11.oq()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "save_path"
            java.lang.String r13 = r11.qv()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "download_time"
            long r0 = r11.hu()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r0)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "cur_bytes"
            long r0 = r11.uq()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r0)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "total_bytes"
            long r0 = r11.ka()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r0)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "network_quality"
            java.lang.String r13 = r11.wo()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "only_wifi"
            boolean r13 = r11.x()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "need_https_degrade"
            boolean r13 = r11.d()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "https_degrade_retry_used"
            boolean r13 = r11.kt()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "md5"
            java.lang.String r13 = r11.rn()     // Catch: org.json.JSONException -> L22
            if (r13 != 0) goto Ld5
            r13 = r4
            goto Ld9
        Ld5:
            java.lang.String r13 = r11.rn()     // Catch: org.json.JSONException -> L22
        Ld9:
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "chunk_count"
            int r13 = r11.kj()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "is_force"
            boolean r13 = r11.ri()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "retry_count"
            int r13 = r11.c()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "cur_retry_time"
            int r13 = r11.fx()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "need_retry_delay"
            boolean r13 = r11.wi()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "need_reuse_first_connection"
            boolean r13 = r11.ln()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "default_http_service_backup"
            boolean r13 = r11.az()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "retry_delay_status"
            com.ss.android.socialbase.downloader.xt.g r13 = r11.rs()     // Catch: org.json.JSONException -> L22
            int r13 = r13.ordinal()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "backup_url_used"
            boolean r13 = r11.hh()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "download_byte_error_retry_status"
            com.ss.android.socialbase.downloader.xt.xt r13 = r11.ik()     // Catch: org.json.JSONException -> L22
            int r13 = r13.ordinal()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "forbidden_handler_status"
            com.ss.android.socialbase.downloader.xt.j r13 = r11.jl()     // Catch: org.json.JSONException -> L22
            int r13 = r13.ordinal()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "need_independent_process"
            boolean r13 = r11.xp()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "head_connection_error_msg"
            java.lang.String r13 = r11.cw()     // Catch: org.json.JSONException -> L22
            if (r13 == 0) goto L161
            java.lang.String r13 = r11.cw()     // Catch: org.json.JSONException -> L22
            goto L162
        L161:
            r13 = r4
        L162:
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "extra"
            java.lang.String r13 = r11.h()     // Catch: org.json.JSONException -> L22
            if (r13 == 0) goto L172
            java.lang.String r13 = r11.h()     // Catch: org.json.JSONException -> L22
            goto L173
        L172:
            r13 = r4
        L173:
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "add_listener_to_same_task"
            boolean r13 = r11.uc()     // Catch: org.json.JSONException -> L22
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "backup_url_count"
            java.util.List r13 = r11.ja()     // Catch: org.json.JSONException -> L22
            if (r13 == 0) goto L190
            java.util.List r13 = r11.ja()     // Catch: org.json.JSONException -> L22
            int r13 = r13.size()     // Catch: org.json.JSONException -> L22
            goto L191
        L190:
            r13 = 0
        L191:
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "cur_backup_url_index"
            java.util.List r13 = r11.ja()     // Catch: org.json.JSONException -> L22
            if (r13 == 0) goto L1a1
            int r13 = r11.mi()     // Catch: org.json.JSONException -> L22
            goto L1a2
        L1a1:
            r13 = -1
        L1a2:
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "forbidden_urls"
            java.util.List r13 = r11.rh()     // Catch: org.json.JSONException -> L22
            if (r13 == 0) goto L1b6
            java.util.List r13 = r11.rh()     // Catch: org.json.JSONException -> L22
            java.lang.String r13 = r13.toString()     // Catch: org.json.JSONException -> L22
            goto L1b7
        L1b6:
            r13 = r4
        L1b7:
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "task_id"
            java.lang.String r13 = r11.nu()     // Catch: org.json.JSONException -> L22
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: org.json.JSONException -> L22
            if (r13 == 0) goto L1c8
            r13 = r4
            goto L1cc
        L1c8:
            java.lang.String r13 = r11.nu()     // Catch: org.json.JSONException -> L22
        L1cc:
            r2.put(r10, r13)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = r11.oq()     // Catch: java.lang.Throwable -> L208
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L208
            if (r11 != 0) goto L20a
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L208
            java.lang.String r11 = r10.getHost()     // Catch: java.lang.Throwable -> L208
            java.lang.String r13 = r10.getPath()     // Catch: java.lang.Throwable -> L208
            java.lang.String r10 = r10.getLastPathSegment()     // Catch: java.lang.Throwable -> L208
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L208
            if (r0 != 0) goto L20d
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L208
            if (r0 != 0) goto L20d
            int r0 = r13.length()     // Catch: java.lang.Throwable -> L203
            int r1 = r10.length()     // Catch: java.lang.Throwable -> L203
            int r0 = r0 - r1
            java.lang.String r13 = r13.substring(r3, r0)     // Catch: java.lang.Throwable -> L203
            goto L20d
        L203:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L208
            goto L20d
        L208:
            r10 = move-exception
            goto L21d
        L20a:
            r10 = r4
            r11 = r10
            r13 = r11
        L20d:
            java.lang.String r0 = "url_host"
            r2.put(r0, r11)     // Catch: java.lang.Throwable -> L208
            java.lang.String r11 = "url_path"
            r2.put(r11, r13)     // Catch: java.lang.Throwable -> L208
            java.lang.String r11 = "url_last_path_segment"
            r2.put(r11, r10)     // Catch: java.lang.Throwable -> L208
            goto L220
        L21d:
            com.bytedance.sdk.component.utils.vl.j(r10)     // Catch: org.json.JSONException -> L22
        L220:
            java.lang.String r10 = "error_code"
            if (r12 == 0) goto L228
            int r3 = r12.j()     // Catch: org.json.JSONException -> L22
        L228:
            r2.put(r10, r3)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "error_msg"
            if (r12 == 0) goto L233
            java.lang.String r4 = r12.xt()     // Catch: org.json.JSONException -> L22
        L233:
            r2.put(r10, r4)     // Catch: org.json.JSONException -> L22
            java.lang.String r10 = "request_log"
            r2.put(r10, r8)     // Catch: org.json.JSONException -> L22
            goto L241
        L23c:
            r10 = move-exception
        L23d:
            com.bytedance.sdk.component.utils.vl.j(r10)
            r2 = r1
        L241:
            return r2
    }

    private static void j(int r4, org.json.JSONObject r5, com.ss.android.socialbase.downloader.ae.cw r6) throws org.json.JSONException {
            r0 = -5
            if (r4 == r0) goto L38
            r0 = -4
            if (r4 == r0) goto L35
            r0 = -3
            if (r4 == r0) goto L23
            r6 = -2
            if (r4 == r6) goto L20
            if (r4 == 0) goto L1d
            r6 = 2
            if (r4 == r6) goto L1a
            r6 = 6
            if (r4 == r6) goto L17
            java.lang.String r4 = ""
            goto L3a
        L17:
            java.lang.String r4 = "download_first_start"
            goto L3a
        L1a:
            java.lang.String r4 = "download_start"
            goto L3a
        L1d:
            java.lang.String r4 = "download_create"
            goto L3a
        L20:
            java.lang.String r4 = "download_pause"
            goto L3a
        L23:
            double r0 = r6.gs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L32
            java.lang.String r4 = "download_speed"
            r5.put(r4, r0)
        L32:
            java.lang.String r4 = "download_success"
            goto L3a
        L35:
            java.lang.String r4 = "download_cancel"
            goto L3a
        L38:
            java.lang.String r4 = "download_uncomplete"
        L3a:
            java.lang.String r6 = "status"
            r5.put(r6, r4)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.ae.cw r4, java.util.List<com.ss.android.socialbase.downloader.qv.g> r5) {
            java.lang.String r0 = "segments_error"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "segments"
            java.lang.String r5 = com.ss.android.socialbase.downloader.qv.g.j(r5)     // Catch: java.lang.Throwable -> L30
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "cur_bytes"
            long r2 = r4.uq()     // Catch: java.lang.Throwable -> L30
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "total_bytes"
            long r2 = r4.ka()     // Catch: java.lang.Throwable -> L30
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L30
            com.ss.android.socialbase.downloader.tl.cw r5 = com.ss.android.socialbase.downloader.downloader.cw.ol()     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L2f
            int r4 = r4.ae()     // Catch: java.lang.Throwable -> L30
            r5.j(r4, r0, r1)     // Catch: java.lang.Throwable -> L30
        L2f:
            return
        L30:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.ae.r r4, com.ss.android.socialbase.downloader.up.j r5, int r6) {
            if (r4 != 0) goto L3
            goto L49
        L3:
            com.ss.android.socialbase.downloader.ae.cw r0 = r4.j()     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto La
            goto L49
        La:
            com.ss.android.socialbase.downloader.r.l r1 = r4.up()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = com.ss.android.socialbase.downloader.xt.m.cw(r6)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L2f
            int[] r2 = r0.st()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = j(r2, r6)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L2f
            if (r1 == 0) goto L2f
            boolean r3 = r1 instanceof com.ss.android.socialbase.downloader.r.r     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L2f
            r2 = r1
            com.ss.android.socialbase.downloader.r.r r2 = (com.ss.android.socialbase.downloader.r.r) r2     // Catch: java.lang.Throwable -> L4a
            int[] r2 = r2.j()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = j(r2, r6)     // Catch: java.lang.Throwable -> L4a
        L2f:
            if (r2 == 0) goto L49
            com.ss.android.socialbase.downloader.r.az r4 = r4.r()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3f
            r4.j(r0, r5, r6)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L4a
        L3f:
            j(r1, r0, r5, r6)     // Catch: java.lang.Throwable -> L4a
            com.ss.android.socialbase.downloader.tl.xt r4 = com.ss.android.socialbase.downloader.downloader.cw.m()     // Catch: java.lang.Throwable -> L4a
            j(r4, r0, r5, r6)     // Catch: java.lang.Throwable -> L4a
        L49:
            return
        L4a:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    public static void j(@androidx.annotation.Nullable com.ss.android.socialbase.downloader.g.ae r11, java.lang.String r12, java.lang.String r13, long r14, java.lang.String r16, int r17, java.io.IOException r18, com.ss.android.socialbase.downloader.ae.cw r19) {
            r1 = r18
            java.lang.String r2 = "setting_tag"
            if (r19 != 0) goto L8
            goto L12f
        L8:
            int r0 = r19.ae()
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r0 = "monitor_download_connect"
            r4 = 0
            int r5 = r3.j(r0, r4)
            if (r5 > 0) goto L1b
            goto L12f
        L1b:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L23
            goto L12f
        L23:
            r6 = 0
            r7 = -1
            if (r11 == 0) goto L3b
            int r7 = r11.xt()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L130
        L30:
            boolean r0 = r11 instanceof com.ss.android.socialbase.downloader.g.j     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L3b
            com.ss.android.socialbase.downloader.g.j r11 = (com.ss.android.socialbase.downloader.g.j) r11     // Catch: java.lang.Throwable -> L130
            java.lang.String r11 = r11.up()     // Catch: java.lang.Throwable -> L130
            goto L3c
        L3b:
            r11 = r6
        L3c:
            r0 = 400(0x190, float:5.6E-43)
            r8 = 200(0xc8, float:2.8E-43)
            java.lang.String r9 = ""
            if (r7 < r8) goto L46
            if (r7 < r0) goto L7c
        L46:
            int r10 = r19.fx()     // Catch: java.lang.Throwable -> L130
            if (r10 == 0) goto L56
            int r10 = r19.ll()     // Catch: java.lang.Throwable -> L130
            if (r10 < r8) goto L12f
            if (r10 < r0) goto L56
            goto L12f
        L56:
            if (r1 == 0) goto L7c
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L130
            boolean r0 = com.ss.android.socialbase.downloader.az.m.cw(r0)     // Catch: java.lang.Throwable -> L130
            if (r0 != 0) goto L65
            r7 = 1049(0x419, float:1.47E-42)
            goto L7c
        L65:
            com.ss.android.socialbase.downloader.az.m.j(r1, r9)     // Catch: com.ss.android.socialbase.downloader.up.j -> L69 java.lang.Throwable -> L130
            goto L7c
        L69:
            r0 = move-exception
            int r7 = r0.j()     // Catch: java.lang.Throwable -> L130
            java.lang.String r6 = r0.xt()     // Catch: java.lang.Throwable -> L130
            boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.up.tl     // Catch: java.lang.Throwable -> L130
            if (r1 == 0) goto L7c
            com.ss.android.socialbase.downloader.up.tl r0 = (com.ss.android.socialbase.downloader.up.tl) r0     // Catch: java.lang.Throwable -> L130
            java.lang.String r9 = r0.r()     // Catch: java.lang.Throwable -> L130
        L7c:
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> L130
            java.lang.String r0 = r12.getHost()     // Catch: java.lang.Throwable -> L130
            java.lang.String r1 = r12.getPath()     // Catch: java.lang.Throwable -> L130
            java.lang.String r12 = r12.getLastPathSegment()     // Catch: java.lang.Throwable -> L130
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L130
            if (r8 != 0) goto La5
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L130
            if (r8 != 0) goto La5
            int r8 = r1.length()     // Catch: java.lang.Throwable -> La5
            int r10 = r12.length()     // Catch: java.lang.Throwable -> La5
            int r8 = r8 - r10
            java.lang.String r1 = r1.substring(r4, r8)     // Catch: java.lang.Throwable -> La5
        La5:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L130
            r4.<init>()     // Catch: java.lang.Throwable -> L130
            java.lang.String r8 = r3.cw(r2)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            r4.put(r2, r8)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r2 = "url_host"
            r4.put(r2, r0)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r0 = "host_ip"
            r4.putOpt(r0, r13)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r13 = "host_real_ip"
            r4.putOpt(r13, r11)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "url_path"
            r4.put(r11, r1)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "url_last_path_segment"
            r4.put(r11, r12)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "net_lib"
            r12 = r17
            r4.put(r11, r12)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "connect_type"
            r12 = r16
            r4.put(r11, r12)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "status_code"
            r4.put(r11, r7)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "request_log"
            r4.put(r11, r9)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            if (r6 == 0) goto Lf9
            java.lang.String r11 = "exception_msg_length"
            r12 = 500(0x1f4, float:7.0E-43)
            int r11 = r3.j(r11, r12)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r12 = "error_msg"
            java.lang.String r11 = com.ss.android.socialbase.downloader.az.m.j(r6, r11)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            r4.put(r12, r11)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            goto Lf9
        Lf6:
            r0 = move-exception
            r11 = r0
            goto L111
        Lf9:
            java.lang.String r11 = "connect_time"
            r4.put(r11, r14)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "pkg_name"
            java.lang.String r12 = r19.la()     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            r4.put(r11, r12)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            java.lang.String r11 = "name"
            java.lang.String r12 = r19.g()     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            r4.put(r11, r12)     // Catch: org.json.JSONException -> Lf6 java.lang.Throwable -> L130
            goto L114
        L111:
            com.bytedance.sdk.component.utils.vl.j(r11)     // Catch: java.lang.Throwable -> L130
        L114:
            r11 = 1
            r12 = 3
            if (r5 == r11) goto L11a
            if (r5 != r12) goto L11d
        L11a:
            com.ss.android.socialbase.downloader.downloader.cw.m()     // Catch: java.lang.Throwable -> L130
        L11d:
            r11 = 2
            if (r5 == r11) goto L122
            if (r5 != r12) goto L12f
        L122:
            com.ss.android.socialbase.downloader.tl.cw r11 = com.ss.android.socialbase.downloader.downloader.cw.ol()     // Catch: java.lang.Throwable -> L130
            int r12 = r19.ae()     // Catch: java.lang.Throwable -> L130
            java.lang.String r13 = "download_connect"
            r11.j(r12, r13, r4)     // Catch: java.lang.Throwable -> L130
        L12f:
            return
        L130:
            r0 = move-exception
            r11 = r0
            com.bytedance.sdk.component.utils.vl.j(r11)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.jy.j r24, com.ss.android.socialbase.downloader.ae.cw r25, java.lang.String r26, com.ss.android.socialbase.downloader.g.g r27, boolean r28, boolean r29, com.ss.android.socialbase.downloader.up.j r30, long r31, long r33, boolean r35, long r36, long r38, long r40, org.json.JSONObject r42) {
            java.lang.String r0 = "monitor_download_io"
            r3 = r24
            int r2 = r3.xt(r0)
            r7 = 0
            r23 = 0
            java.lang.String r1 = "download_io"
            r6 = 0
            r4 = r25
            r5 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r14 = r33
            r16 = r35
            r17 = r36
            r19 = r38
            r21 = r40
            j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r19, r21, r23)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.jy.j r24, com.ss.android.socialbase.downloader.ae.cw r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, com.ss.android.socialbase.downloader.g.g r30, com.ss.android.socialbase.downloader.up.j r31, long r32, long r34) {
            java.lang.String r0 = "monitor_segment_io"
            r3 = r24
            int r2 = r3.xt(r0)
            r21 = -1
            r23 = 0
            java.lang.String r1 = "segment_io"
            r10 = 0
            r16 = 0
            r17 = -1
            r19 = -1
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r9 = r29
            r8 = r30
            r11 = r31
            r12 = r32
            r14 = r34
            j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r19, r21, r23)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.r.l r2, com.ss.android.socialbase.downloader.ae.cw r3, com.ss.android.socialbase.downloader.up.j r4, int r5) {
            if (r2 != 0) goto L3
            goto L1d
        L3:
            java.lang.String r0 = r2.xt()     // Catch: java.lang.Throwable -> L1d
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Lf
            java.lang.String r0 = "default"
        Lf:
            org.json.JSONObject r3 = j(r0, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L1a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r3.<init>()     // Catch: java.lang.Throwable -> L1d
        L1a:
            r2.j(r3)     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.tl.xt r1, com.ss.android.socialbase.downloader.ae.cw r2, com.ss.android.socialbase.downloader.up.j r3, int r4) {
            if (r1 == 0) goto L37
            boolean r1 = r2.aq()
            if (r1 == 0) goto L37
            java.lang.String r1 = r2.rr()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L13
            goto L37
        L13:
            java.lang.String r1 = r2.rr()     // Catch: java.lang.Throwable -> L33
            org.json.JSONObject r1 = j(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L22
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
        L22:
            r0 = -1
            if (r4 != r0) goto L2f
            java.lang.String r2 = "status"
            int r3 = r3.j()     // Catch: java.lang.Throwable -> L33
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L33
            return
        L2f:
            j(r4, r1, r2)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L37:
            return
    }

    private static void j(java.lang.String r19, int r20, com.ss.android.socialbase.downloader.jy.j r21, com.ss.android.socialbase.downloader.ae.cw r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.ss.android.socialbase.downloader.g.g r26, boolean r27, boolean r28, com.ss.android.socialbase.downloader.up.j r29, long r30, long r32, boolean r34, long r35, long r37, long r39, org.json.JSONObject r41) {
            r0 = r20
            r1 = r21
            r2 = r26
            r3 = r32
            java.lang.String r5 = "setting_tag"
            if (r0 <= 0) goto L16e
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L14
            goto L16e
        L14:
            android.net.Uri r6 = android.net.Uri.parse(r23)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r7 = r6.getHost()     // Catch: java.lang.Throwable -> L16a
            java.lang.String r8 = r6.getPath()     // Catch: java.lang.Throwable -> L16a
            java.lang.String r6 = r6.getLastPathSegment()     // Catch: java.lang.Throwable -> L16a
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L16a
            r10 = 0
            if (r9 != 0) goto L40
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L16a
            if (r9 != 0) goto L40
            int r9 = r8.length()     // Catch: java.lang.Throwable -> L3f
            int r11 = r6.length()     // Catch: java.lang.Throwable -> L3f
            int r9 = r9 - r11
            java.lang.String r8 = r8.substring(r10, r9)     // Catch: java.lang.Throwable -> L3f
            goto L40
        L3f:
        L40:
            r11 = 1
            r12 = 0
            if (r27 == 0) goto L46
            r10 = 1
            goto L61
        L46:
            if (r28 == 0) goto L4a
            r10 = 2
            goto L61
        L4a:
            if (r29 == 0) goto L61
            android.content.Context r10 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L16a
            boolean r10 = com.ss.android.socialbase.downloader.az.m.cw(r10)     // Catch: java.lang.Throwable -> L16a
            if (r10 != 0) goto L59
            r10 = 1049(0x419, float:1.47E-42)
            goto L5d
        L59:
            int r10 = r29.j()     // Catch: java.lang.Throwable -> L16a
        L5d:
            java.lang.String r12 = r29.xt()     // Catch: java.lang.Throwable -> L16a
        L61:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16a
            r13.<init>()     // Catch: java.lang.Throwable -> L16a
            java.lang.String r14 = ""
            if (r2 == 0) goto L9e
            boolean r15 = r2 instanceof com.ss.android.socialbase.downloader.g.up     // Catch: java.lang.Throwable -> L16a
            r15 = r15 ^ r11
            java.lang.String r9 = "X-Cache"
            java.lang.String r9 = r2.j(r9)     // Catch: java.lang.Throwable -> L16a
            boolean r16 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L16a
            if (r16 != 0) goto L84
            java.lang.String r9 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L16a
            java.lang.String r11 = "hit"
            boolean r9 = r9.contains(r11)     // Catch: java.lang.Throwable -> L16a
            goto L85
        L84:
            r9 = -1
        L85:
            java.lang.String r11 = "monitor_sla"
            r23 = r9
            r9 = 1
            r1.j(r11, r9)     // Catch: java.lang.Throwable -> L16a
            boolean r9 = r2 instanceof com.ss.android.socialbase.downloader.g.j     // Catch: java.lang.Throwable -> L16a
            if (r9 == 0) goto L97
            com.ss.android.socialbase.downloader.g.j r2 = (com.ss.android.socialbase.downloader.g.j) r2     // Catch: java.lang.Throwable -> L16a
            java.lang.String r14 = r2.m()     // Catch: java.lang.Throwable -> L16a
        L97:
            r2 = r23
            r23 = r12
        L9b:
            r11 = r30
            goto La3
        L9e:
            r23 = r12
            r2 = -1
            r15 = -1
            goto L9b
        La3:
            double r11 = (double) r11     // Catch: java.lang.Throwable -> L16a
            r17 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r11 = r11 / r17
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L16a
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L16a
            r17 = r3
            r3 = 1
            long r3 = r9.toNanos(r3)     // Catch: java.lang.Throwable -> L16a
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L16a
            double r3 = r17 / r3
            java.lang.String r9 = r1.cw(r5)     // Catch: java.lang.Throwable -> L16a
            r13.put(r5, r9)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "url_host"
            r13.put(r5, r7)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "host_ip"
            r7 = r24
            r13.putOpt(r5, r7)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "host_real_ip"
            r7 = r25
            r13.putOpt(r5, r7)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "url_path"
            r13.put(r5, r8)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "url_last_path_segment"
            r13.put(r5, r6)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "net_lib"
            r13.put(r5, r15)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "hit_cdn_cache"
            r13.put(r5, r2)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "status_code"
            r13.put(r2, r10)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "request_log"
            r13.put(r2, r14)     // Catch: java.lang.Throwable -> L16a
            if (r23 == 0) goto L103
            java.lang.String r2 = "exception_msg_length"
            r5 = 500(0x1f4, float:7.0E-43)
            int r1 = r1.j(r2, r5)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "error_msg"
            r5 = r23
            java.lang.String r1 = com.ss.android.socialbase.downloader.az.m.j(r5, r1)     // Catch: java.lang.Throwable -> L16a
            r13.put(r2, r1)     // Catch: java.lang.Throwable -> L16a
        L103:
            java.lang.String r1 = "download_sec"
            r13.put(r1, r3)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r1 = "download_mb"
            r13.put(r1, r11)     // Catch: java.lang.Throwable -> L16a
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L119
            java.lang.String r1 = "download_speed"
            double r11 = r11 / r3
            r13.put(r1, r11)     // Catch: java.lang.Throwable -> L16a
        L119:
            if (r34 == 0) goto L139
            java.lang.String r1 = "rw_read_time"
            r2 = r35
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L16a
            double r2 = r2 / r17
            r13.put(r1, r2)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r1 = "rw_write_time"
            r2 = r37
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L16a
            double r2 = r2 / r17
            r13.put(r1, r2)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r1 = "rw_sync_time"
            r2 = r39
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L16a
            double r2 = r2 / r17
            r13.put(r1, r2)     // Catch: java.lang.Throwable -> L16a
        L139:
            java.lang.String r1 = "pkg_name"
            java.lang.String r2 = r22.la()     // Catch: java.lang.Throwable -> L16a
            r13.put(r1, r2)     // Catch: java.lang.Throwable -> L16a
            java.lang.String r1 = "name"
            java.lang.String r2 = r22.g()     // Catch: java.lang.Throwable -> L16a
            r13.put(r1, r2)     // Catch: java.lang.Throwable -> L16a
            r1 = 3
            r9 = 1
            if (r0 == r9) goto L154
            if (r0 != r1) goto L152
            goto L154
        L152:
            r2 = 2
            goto L158
        L154:
            com.ss.android.socialbase.downloader.downloader.cw.m()     // Catch: java.lang.Throwable -> L16a
            goto L152
        L158:
            if (r0 == r2) goto L15c
            if (r0 != r1) goto L16e
        L15c:
            com.ss.android.socialbase.downloader.tl.cw r0 = com.ss.android.socialbase.downloader.downloader.cw.ol()     // Catch: java.lang.Throwable -> L16a
            int r1 = r22.ae()     // Catch: java.lang.Throwable -> L16a
            r2 = r19
            r0.j(r1, r2, r13)     // Catch: java.lang.Throwable -> L16a
            goto L16e
        L16a:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L16e:
            return
    }

    private static boolean j(int[] r3, int r4) {
            r0 = 0
            if (r3 == 0) goto L13
            int r1 = r3.length
            if (r1 <= 0) goto L13
            r1 = 0
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            r2 = r3[r1]
            if (r4 != r2) goto L10
            r3 = 1
            return r3
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
    }
}
