package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j implements com.bytedance.sdk.component.tl.xt.r.j.xt {
    public static final java.lang.String cw = null;
    public final java.lang.String j;
    public final org.json.JSONObject xt;

    static {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.up.j.cw = r0
            return
    }

    public j(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            return
    }

    private static void cw(org.json.JSONObject r2, com.bytedance.msdk.up.r r3) throws org.json.JSONException {
            if (r2 == 0) goto L91
            if (r3 == 0) goto L91
            java.lang.String r0 = "media_fill_fail"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "media_fill"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "bidding_adm_load"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "bidding_adm_load_fail"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "mediation_fill"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "mediation_request_end"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "mediation_video_cached"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "get_config_final"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "sdk_init_end"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "sdk_backstage"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "mediation_request"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "rit_map_query"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "return_bidding_result"
            java.lang.String r1 = r3.j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L91
        L86:
            long r0 = r3.w
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r2.putOpt(r0, r3)
        L91:
            return
    }

    public static org.json.JSONObject j(com.bytedance.msdk.up.r r7, org.json.JSONObject r8) {
            java.lang.String r0 = "device_score"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "device_info"
            org.json.JSONObject r3 = com.bytedance.msdk.tl.v.j()     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L15f
            java.lang.String r2 = "type"
            java.lang.String r3 = r7.j     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "link_id"
            java.lang.String r3 = r7.xt     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "adn_name"
            java.lang.String r3 = r7.cw     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "ad_sdk_version"
            java.lang.String r3 = r7.r     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "rit_cpm"
            java.lang.String r3 = r7.ae     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "mediation_rit"
            java.lang.String r3 = r7.m     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "adtype"
            int r3 = r7.i     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "error_msg"
            java.lang.String r3 = r7.qv     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "error_code"
            int r3 = r7.ws     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "creative_id"
            java.lang.String r3 = r7.vl     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "exchange_rate"
            java.lang.String r3 = r7.tj     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "msdk_session_id"
            java.lang.String r3 = com.bytedance.msdk.up.j.cw     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "is_trusteeship_monetize"
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L97
            int r3 = r3.j()     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            com.bytedance.msdk.core.qv.j r2 = com.bytedance.msdk.core.qv.j.j()     // Catch: java.lang.Throwable -> L97
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.jy()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.xt(r3)     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L9a
            java.lang.String r3 = "app_abtest"
            r1.putOpt(r3, r2)     // Catch: java.lang.Throwable -> L97
            goto L9a
        L97:
            r8 = move-exception
            goto L1b0
        L9a:
            j(r1, r7)     // Catch: java.lang.Throwable -> L97
            cw(r1, r7)     // Catch: java.lang.Throwable -> L97
            xt(r7, r8)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "total_load_fail"
            java.lang.String r3 = r7.j     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto Ldf
            java.lang.String r2 = "adapter_request_fail"
            java.lang.String r3 = r7.j     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto Ldf
            java.lang.String r2 = "req_id"
            java.lang.String r3 = r7.up     // Catch: java.lang.Throwable -> L97
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto Lda
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r7.xt     // Catch: java.lang.Throwable -> L97
            r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r7.m     // Catch: java.lang.Throwable -> L97
            r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L97
            goto Ldc
        Lda:
            java.lang.String r3 = r7.up     // Catch: java.lang.Throwable -> L97
        Ldc:
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
        Ldf:
            java.lang.String r2 = "country"
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.tl()     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "pangle"
            com.bytedance.msdk.core.oq.j r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "app_id"
            if (r2 == 0) goto L102
            java.lang.String r2 = r2.j()     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r3, r2)     // Catch: java.lang.Throwable -> L97
            goto L10d
        L102:
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.vl()     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r3, r2)     // Catch: java.lang.Throwable -> L97
        L10d:
            long r2 = r7.g     // Catch: java.lang.Throwable -> L97
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L11e
            java.lang.String r4 = "waterfall_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r4, r2)     // Catch: java.lang.Throwable -> L97
        L11e:
            java.lang.String r2 = r7.oq     // Catch: java.lang.Throwable -> L97
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L12d
            java.lang.String r2 = "version"
            java.lang.String r3 = r7.oq     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L97
        L12d:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.f     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L15f
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L97
            if (r2 <= 0) goto L15f
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.f     // Catch: java.lang.Throwable -> L97
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L97
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L97
        L141:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L15f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.f     // Catch: java.lang.Throwable -> L97
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L97
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto L141
            if (r4 == 0) goto L141
            r1.putOpt(r3, r4)     // Catch: java.lang.Throwable -> L97
            goto L141
        L15f:
            java.lang.String r2 = "event_extra"
            if (r8 == 0) goto L168
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L97
            goto L169
        L168:
            r8 = 0
        L169:
            r1.putOpt(r2, r8)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "app_version"
            java.lang.String r2 = com.bytedance.msdk.tl.rn.cw()     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r8, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "conn_type"
            int r2 = com.bytedance.msdk.tl.x.up()     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r8, r2)     // Catch: java.lang.Throwable -> L97
            xt(r1, r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "mediation_sdk_version"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.xt()     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r8, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "plugin_version"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.r()     // Catch: java.lang.Throwable -> L97
            r1.putOpt(r8, r2)     // Catch: java.lang.Throwable -> L97
            com.bytedance.sdk.openadsdk.core.ch.j r8 = com.bytedance.sdk.openadsdk.core.ch.j.j()     // Catch: java.lang.Throwable -> L97 java.lang.NumberFormatException -> L1ab
            java.lang.String r2 = "DeviceRate"
            java.lang.String r3 = "bytebench_value"
            java.lang.String r8 = r8.j(r2, r3)     // Catch: java.lang.Throwable -> L97 java.lang.NumberFormatException -> L1ab
            double r2 = java.lang.Double.parseDouble(r8)     // Catch: java.lang.Throwable -> L97 java.lang.NumberFormatException -> L1ab
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L97 java.lang.NumberFormatException -> L1ab
            return r1
        L1ab:
            r8 = -1
            r1.put(r0, r8)     // Catch: java.lang.Throwable -> L97
            goto L1b3
        L1b0:
            j(r1, r8, r7)     // Catch: java.lang.Throwable -> L1b3
        L1b3:
            return r1
    }

    private static void j(org.json.JSONObject r3, com.bytedance.msdk.up.r r4) throws org.json.JSONException {
            if (r3 == 0) goto L41
            if (r4 == 0) goto L41
            int r0 = r4.mi
            r1 = -1
            if (r0 == r1) goto L12
            java.lang.String r2 = "result"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.putOpt(r2, r0)
        L12:
            int r0 = r4.kt
            if (r0 == r1) goto L1f
            java.lang.String r1 = "status_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.putOpt(r1, r0)
        L1f:
            java.lang.String r0 = r4.av
            if (r0 == 0) goto L28
            java.lang.String r1 = "show_sort"
            r3.putOpt(r1, r0)
        L28:
            java.lang.String r0 = r4.az
            if (r0 == 0) goto L31
            java.lang.String r1 = "load_sort"
            r3.putOpt(r1, r0)
        L31:
            java.lang.String r0 = r4.jy
            if (r0 == 0) goto L3a
            java.lang.String r1 = "req_bidding_type"
            r3.putOpt(r1, r0)
        L3a:
            java.lang.String r0 = "prime_rit"
            java.lang.String r4 = r4.tl
            r3.putOpt(r0, r4)
        L41:
            return
    }

    private static void j(org.json.JSONObject r4, java.lang.Throwable r5, com.bytedance.msdk.up.r r6) throws org.json.JSONException {
            java.lang.String r0 = "err_msg_comm"
            if (r4 == 0) goto L25
            if (r5 == 0) goto L25
            java.lang.String r1 = "event_extra"
            java.lang.String r2 = r4.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L25
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
            java.lang.String r2 = r5.toString()
            r3.putOpt(r0, r2)
            java.lang.String r2 = r3.toString()
            r4.putOpt(r1, r2)
        L25:
            if (r6 == 0) goto L45
            if (r5 == 0) goto L45
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f
            java.lang.String r1 = "event_id"
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r1 = "comm_eventId"
            r4.putOpt(r1, r6)
            java.lang.String r5 = r5.toString()
            r4.putOpt(r0, r5)
            com.bytedance.msdk.tl.l.j(r4)
        L45:
            return
    }

    private static void xt(com.bytedance.msdk.up.r r2, org.json.JSONObject r3) {
            if (r2 == 0) goto L104
            java.lang.String r0 = "media_request"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_fill"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_fill_fail"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "get_bidding_adm_to_adn"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "bidding_adm_load"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "bidding_adm_load_fail"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "bidding_win_event"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_show_is_ready"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_will_show"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_show"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_show_fail"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_show_listen"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_show_fail_listen"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "media_click_listen"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "sdk_init"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "sdk_init_end"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "get_config_start"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "get_config_final"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "mediation_request"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "mediation_fill"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "mediation_request_end"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lde
            java.lang.String r0 = "total_load_fail"
            java.lang.String r1 = r2.j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L104
        Lde:
            java.lang.String r0 = "grouping_params"
            org.json.JSONObject r1 = com.bytedance.msdk.core.ws.xt.xt()
            r2.j(r0, r1)
            org.json.JSONObject r0 = com.bytedance.msdk.core.ws.xt.cw()
            java.lang.String r1 = "user_defined_grouping_params"
            if (r0 == 0) goto Lf7
            java.lang.String r0 = r0.toString()
            r2.j(r1, r0)
            goto Lfb
        Lf7:
            r0 = 0
            r2.j(r1, r0)
        Lfb:
            java.lang.String r0 = r2.tl
            java.lang.String r1 = r2.j
            int r2 = r2.i
            com.bytedance.msdk.core.g.r.j(r0, r1, r2, r3)
        L104:
            return
    }

    private static void xt(org.json.JSONObject r6, com.bytedance.msdk.up.r r7) throws org.json.JSONException {
            java.lang.String r0 = "timestamp"
            if (r6 == 0) goto L54
            if (r7 == 0) goto L54
            java.lang.String r1 = r7.j
            java.lang.String r2 = "sdk_init"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L1c
            long r1 = com.bytedance.msdk.api.r.oq.xt()
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r6.putOpt(r0, r7)
            return
        L1c:
            java.lang.String r1 = r7.j
            java.lang.String r2 = "start_up"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L32
            long r1 = com.bytedance.msdk.api.r.oq.cw()
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r6.putOpt(r0, r7)
            return
        L32:
            long r1 = r7.j()
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L48
            long r1 = r7.j()
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r6.putOpt(r0, r7)
            return
        L48:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r6.putOpt(r0, r7)
            return
        L54:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r6.putOpt(r0, r7)
            return
    }

    public java.lang.String cw() {
            r3 = this;
            java.lang.String r0 = r3.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L24
            org.json.JSONObject r0 = r3.xt
            if (r0 == 0) goto L24
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "localId"
            java.lang.String r2 = r3.j     // Catch: java.lang.Throwable -> L1f
            r0.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "event"
            org.json.JSONObject r2 = r3.xt     // Catch: java.lang.Throwable -> L1f
            r0.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L1f
        L1f:
            java.lang.String r0 = r0.toString()
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.xt.r.j.xt
    public long j() {
            r2 = this;
            org.json.JSONObject r0 = r2.xt
            if (r0 == 0) goto L1e
            java.lang.String r1 = "params"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L13
            org.json.JSONObject r0 = r2.xt
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            goto L15
        L13:
            org.json.JSONObject r0 = r2.xt
        L15:
            if (r0 == 0) goto L1e
            java.lang.String r1 = "timestamp"
            long r0 = r0.optLong(r1)
            return r0
        L1e:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.xt.r.j.xt
    public org.json.JSONObject j(java.lang.String r1) {
            r0 = this;
            org.json.JSONObject r1 = r0.xt
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdEvent{localId='"
            r0.<init>(r1)
            java.lang.String r1 = r2.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", event="
            r0.append(r1)
            org.json.JSONObject r1 = r2.xt
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.sdk.component.tl.xt.r.j.xt
    public long xt() {
            r2 = this;
            org.json.JSONObject r0 = r2.xt
            if (r0 == 0) goto L2f
            java.lang.String r1 = "params"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L13
            org.json.JSONObject r0 = r2.xt
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            goto L15
        L13:
            org.json.JSONObject r0 = r2.xt
        L15:
            if (r0 == 0) goto L2f
            java.lang.String r1 = "event_extra"
            java.lang.String r0 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2f
            r1.<init>(r0)     // Catch: org.json.JSONException -> L2f
            java.lang.String r0 = "eventIndex"
            long r0 = r1.optLong(r0)     // Catch: org.json.JSONException -> L2f
            return r0
        L2f:
            r0 = 0
            return r0
    }
}
