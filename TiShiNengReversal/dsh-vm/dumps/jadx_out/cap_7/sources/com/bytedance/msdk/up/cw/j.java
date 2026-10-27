package com.bytedance.msdk.up.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static volatile com.bytedance.msdk.up.cw.j j;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.msdk.up.cw.j j() {
            com.bytedance.msdk.up.cw.j r0 = com.bytedance.msdk.up.cw.j.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.up.cw.j> r0 = com.bytedance.msdk.up.cw.j.class
            monitor-enter(r0)
            com.bytedance.msdk.up.cw.j r1 = com.bytedance.msdk.up.cw.j.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.up.cw.j r1 = new com.bytedance.msdk.up.cw.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.up.cw.j.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.up.cw.j r0 = com.bytedance.msdk.up.cw.j.j
            return r0
    }

    private static void j(com.bytedance.msdk.up.r r2) {
            java.lang.String r0 = "block_pacing"
            java.lang.String r1 = "-1"
            r2.j(r0, r1)
            java.lang.String r0 = "waterfall_show_rule_id"
            r2.j(r0, r1)
            java.lang.String r0 = "block_show_count"
            r2.j(r0, r1)
            return
    }

    private static void xt(com.bytedance.msdk.up.r r2) {
            java.lang.String r0 = "block_pacing"
            java.lang.String r1 = "-1"
            r2.j(r0, r1)
            java.lang.String r0 = "rit_adn_show_rule_id"
            r2.j(r0, r1)
            java.lang.String r0 = "block_show_count"
            r2.j(r0, r1)
            return
    }

    public void j(com.bytedance.msdk.up.r r2, com.bytedance.msdk.api.j.xt r3, int r4) {
            r1 = this;
            java.lang.String r0 = "get_config_error"
            com.bytedance.msdk.up.r r0 = r2.j(r0)
            r0.xt(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r0, r0, r4)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r2, r4)
            return
    }

    public void j(com.bytedance.msdk.up.r r3, @androidx.annotation.Nullable com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.api.j r5, java.lang.String r6) {
            r2 = this;
            java.lang.String r0 = "total_load_fail"
            com.bytedance.msdk.up.r r0 = r3.j(r0)
            java.lang.String r1 = "server_bidding_extra"
            r0.j(r1, r6)
            int r6 = r5.j
            r0 = 10003(0x2713, float:1.4017E-41)
            if (r6 != r0) goto L21
            r5 = 10010(0x271a, float:1.4027E-41)
            com.bytedance.msdk.up.r r5 = r3.xt(r5)
            java.lang.String r6 = "延长瀑布流总超时时长或者缩短层超时并添加兜底代码位"
            r5.oq(r6)
            j(r3)
            goto L96
        L21:
            r0 = 810085(0xc5c65, float:1.135171E-39)
            if (r6 != r0) goto L33
            com.bytedance.msdk.up.r r6 = r3.xt(r6)
            java.lang.String r5 = r5.xt
            r6.oq(r5)
            j(r3)
            goto L96
        L33:
            boolean r0 = r5 instanceof com.bytedance.msdk.api.xt.cw
            java.lang.String r1 = "waterfall_show_rule_id"
            if (r0 == 0) goto L56
            r0 = r5
            com.bytedance.msdk.api.xt.cw r0 = (com.bytedance.msdk.api.xt.cw) r0
            com.bytedance.msdk.up.r r6 = r3.xt(r6)
            java.lang.String r5 = r5.xt
            r6.oq(r5)
            java.lang.String r5 = "block_pacing"
            java.lang.String r6 = r0.j()
            r3.j(r5, r6)
            java.lang.String r5 = r0.xt()
            r3.j(r1, r5)
            goto L96
        L56:
            boolean r0 = r5 instanceof com.bytedance.msdk.api.xt.xt
            if (r0 == 0) goto L77
            r0 = r5
            com.bytedance.msdk.api.xt.xt r0 = (com.bytedance.msdk.api.xt.xt) r0
            com.bytedance.msdk.up.r r6 = r3.xt(r6)
            java.lang.String r5 = r5.xt
            r6.oq(r5)
            java.lang.String r5 = "block_show_count"
            java.lang.String r6 = r0.j()
            r3.j(r5, r6)
            java.lang.String r5 = r0.xt()
            r3.j(r1, r5)
            goto L96
        L77:
            boolean r0 = r5 instanceof com.bytedance.msdk.api.xt.j
            if (r0 == 0) goto L88
            com.bytedance.msdk.up.r r6 = r3.xt(r6)
            java.lang.String r5 = r5.xt
            r6.oq(r5)
            j(r3)
            goto L96
        L88:
            r5 = 10086(0x2766, float:1.4133E-41)
            com.bytedance.msdk.up.r r5 = r3.xt(r5)
            java.lang.String r6 = "Ad load fail all loadsorts! "
            r5.oq(r6)
            j(r3)
        L96:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            if (r4 == 0) goto La8
            org.json.JSONObject r6 = r4.oq()
            if (r6 == 0) goto La8
            java.lang.String r0 = "behavior"
            r5.put(r0, r6)
        La8:
            if (r4 == 0) goto Laf
            int r6 = r4.a()
            goto Lb0
        Laf:
            r6 = 0
        Lb0:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "ad_count"
            r3.j(r0, r6)
            r6 = 0
            com.bytedance.msdk.up.m.j(r3, r4, r6, r6, r5)
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r4, r3, r5)
            return
    }

    public void j(com.bytedance.msdk.up.r r4, com.bytedance.msdk.api.j.xt r5, com.bytedance.msdk.core.r.xt r6, int r7) {
            r3 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "return_bidding_result"
            com.bytedance.msdk.up.r r0 = r4.j(r0)
            long r1 = r6.ae
            com.bytedance.msdk.up.r r0 = r0.j(r1)
            int r1 = r6.m
            com.bytedance.msdk.up.r r0 = r0.setResult(r1)
            com.bytedance.msdk.api.j r1 = r6.tl
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1d
        L1b:
            int r1 = r1.j
        L1d:
            com.bytedance.msdk.up.r r0 = r0.xt(r1)
            com.bytedance.msdk.api.j r1 = r6.tl
            if (r1 != 0) goto L28
            java.lang.String r1 = ""
            goto L2a
        L28:
            java.lang.String r1 = r1.xt
        L2a:
            com.bytedance.msdk.up.r r0 = r0.oq(r1)
            r1 = 2
            com.bytedance.msdk.up.r r0 = r0.j(r1)
            java.lang.String r1 = "fill_type"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.bytedance.msdk.up.r r7 = r0.j(r1, r7)
            java.lang.String r0 = "server_bidding_extra"
            java.lang.String r1 = r6.r
            com.bytedance.msdk.up.r r7 = r7.j(r0, r1)
            int r0 = r6.g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "ad_count"
            r7.j(r1, r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r0 = r6.oq
            java.util.List r1 = r6.j
            com.bytedance.msdk.core.g.r.j(r0, r1, r7)
            org.json.JSONObject r6 = r6.qv
            if (r6 == 0) goto L65
            java.lang.String r0 = "token_time"
            r7.put(r0, r6)
        L65:
            r6 = 0
            com.bytedance.msdk.up.m.j(r4, r5, r6, r6, r7)
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r5, r4, r7)
            return
    }

    public void j(com.bytedance.msdk.up.r r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.xt.cw r4, long r5) {
            r1 = this;
            java.lang.String r0 = "mediation_video_cached"
            com.bytedance.msdk.up.r r0 = r2.j(r0)
            r0.j(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r6, r4, r5)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r2, r5)
            return
    }

    public void j(com.bytedance.msdk.up.r r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.xt.cw r4, long r5, int r7, int r8, int r9, java.lang.String r10, int r11, int r12, com.bytedance.msdk.core.oq.xt r13, org.json.JSONObject r14) {
            r1 = this;
            java.lang.String r10 = "%.2f"
            java.lang.String r0 = "mediation_request_end"
            com.bytedance.msdk.up.r r0 = r2.j(r0)
            com.bytedance.msdk.up.r r5 = r0.j(r5)
            java.lang.String r6 = "ad_count"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.bytedance.msdk.up.r r5 = r5.j(r6, r11)
            java.lang.String r6 = "reason"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            com.bytedance.msdk.up.r r5 = r5.j(r6, r11)
            r5.xt(r9)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r6, r4, r5)
            java.lang.String r4 = "requested_adn_count"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r5.put(r4, r6)
            java.lang.String r4 = "requested_level_count"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r5.put(r4, r6)
            if (r14 == 0) goto L45
            java.lang.String r4 = "auto_detail"
            r5.put(r4, r14)
        L45:
            if (r13 == 0) goto L97
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "layer_time_rate"
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L93
            double r8 = r13.xt()     // Catch: java.lang.Throwable -> L93
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Throwable -> L93
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L93
            r12 = 0
            r11[r12] = r8     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = java.lang.String.format(r7, r10, r11)     // Catch: java.lang.Throwable -> L93
            r4.putOpt(r6, r7)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "req_interval"
            long r7 = r13.r()     // Catch: java.lang.Throwable -> L93
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L93
            r4.putOpt(r6, r7)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "total_time_rate"
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L93
            double r13 = r13.cw()     // Catch: java.lang.Throwable -> L93
            java.lang.Double r8 = java.lang.Double.valueOf(r13)     // Catch: java.lang.Throwable -> L93
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L93
            r9[r12] = r8     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = java.lang.String.format(r7, r10, r9)     // Catch: java.lang.Throwable -> L93
            r4.putOpt(r6, r7)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "preload_req"
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L97:
            if (r3 == 0) goto La4
            org.json.JSONObject r3 = r3.oq()
            if (r3 == 0) goto La4
            java.lang.String r4 = "behavior"
            r5.put(r4, r3)
        La4:
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r2, r5)
            return
    }

    public void j(com.bytedance.msdk.up.r r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.xt.cw r4, com.bytedance.msdk.core.oq.oq r5) {
            r1 = this;
            java.lang.String r0 = "media_cache_success"
            r2.j(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.msdk.up.m.j(r2, r3, r5, r4, r0)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r2, r0)
            return
    }

    public void j(com.bytedance.msdk.up.r r5, com.bytedance.msdk.api.j.xt r6, java.lang.String r7, boolean r8, java.lang.String r9, int r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
            r4 = this;
            r7 = 0
            if (r10 <= 0) goto L8
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r10)
            goto Lb
        L8:
            java.lang.String r0 = ""
            r10 = 0
        Lb:
            r1 = 3
            if (r10 == 0) goto L14
            if (r8 == 0) goto L12
            r8 = 2
            goto L16
        L12:
            r8 = 3
            goto L16
        L14:
            r8 = r8 ^ 1
        L16:
            java.lang.String r2 = "mediation_request"
            com.bytedance.msdk.up.r r2 = r5.j(r2)
            java.lang.String r3 = "server_bidding_extra"
            com.bytedance.msdk.up.r r9 = r2.j(r3, r9)
            java.lang.String r2 = "mediation_req_type"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.bytedance.msdk.up.r r8 = r9.j(r2, r8)
            if (r6 == 0) goto L32
            int r7 = r6.a()
        L32:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = "ad_count"
            com.bytedance.msdk.up.r r7 = r8.j(r9, r7)
            com.bytedance.msdk.up.r r7 = r7.xt(r10)
            r7.oq(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r11 == 0) goto L53
            int r8 = r11.size()
            if (r8 <= 0) goto L53
            r7.putAll(r11)
        L53:
            if (r6 == 0) goto L92
            int r8 = r6.cw()
            r9 = 5
            if (r8 != r9) goto L92
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8e
            r8.<init>()     // Catch: org.json.JSONException -> L8e
            java.lang.String r9 = "parallel_num"
            com.bytedance.msdk.core.up.xt.r r10 = com.bytedance.msdk.core.up.xt.r.j()     // Catch: org.json.JSONException -> L8e
            int r10 = r10.cw()     // Catch: org.json.JSONException -> L8e
            r8.put(r9, r10)     // Catch: org.json.JSONException -> L8e
            java.lang.String r9 = "interval"
            com.bytedance.msdk.core.up.xt.r r10 = com.bytedance.msdk.core.up.xt.r.j()     // Catch: org.json.JSONException -> L8e
            int r10 = r10.r()     // Catch: org.json.JSONException -> L8e
            r8.put(r9, r10)     // Catch: org.json.JSONException -> L8e
            java.lang.String r9 = "primerit_list"
            com.bytedance.msdk.core.up.xt.r r10 = com.bytedance.msdk.core.up.xt.r.j()     // Catch: org.json.JSONException -> L8e
            java.util.List r10 = r10.xt()     // Catch: org.json.JSONException -> L8e
            r8.put(r9, r10)     // Catch: org.json.JSONException -> L8e
            java.lang.String r9 = "preload_info"
            r7.put(r9, r8)     // Catch: org.json.JSONException -> L8e
            goto L92
        L8e:
            r8 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r8)
        L92:
            if (r6 == 0) goto Lcf
            int r8 = r6.f()
            if (r8 != r1) goto Lcf
            com.bytedance.msdk.ae.xt.j r8 = com.bytedance.msdk.ae.xt.j.j()
            boolean r8 = r8.qv()
            java.lang.String r9 = "init_splash_request_duration"
            if (r8 == 0) goto Lb6
            com.bytedance.msdk.ae.xt.j r8 = com.bytedance.msdk.ae.xt.j.j()
            long r10 = r8.g()
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r7.put(r9, r8)
            goto Lcf
        Lb6:
            com.bytedance.msdk.ae.xt.j r8 = com.bytedance.msdk.ae.xt.j.j()
            boolean r8 = r8.vl()
            if (r8 == 0) goto Lcf
            com.bytedance.msdk.ae.xt.j r8 = com.bytedance.msdk.ae.xt.j.j()
            long r10 = r8.g()
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r7.put(r9, r8)
        Lcf:
            java.lang.String r8 = "csj_plugin_version"
            java.lang.String r9 = com.bytedance.msdk.m.cw.cw()
            r7.put(r8, r9)
            r8 = 0
            com.bytedance.msdk.up.m.j(r5, r6, r8, r8, r7)
            android.content.Context r6 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r6, r5, r7)
            return
    }

    public void j(com.bytedance.msdk.up.r r4, com.bytedance.msdk.api.j.xt r5, org.json.JSONObject r6) {
            r3 = this;
            java.lang.String r0 = "start_bidding_request"
            com.bytedance.msdk.up.r r0 = r4.j(r0)
            r1 = 2
            com.bytedance.msdk.up.r r0 = r0.j(r1)
            if (r5 == 0) goto L12
            int r1 = r5.a()
            goto L13
        L12:
            r1 = 0
        L13:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ad_count"
            r0.j(r2, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r6 == 0) goto L28
            java.lang.String r1 = "token_time"
            r0.put(r1, r6)
        L28:
            r6 = 0
            com.bytedance.msdk.up.m.j(r4, r5, r6, r6, r0)
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r5, r4, r0)
            return
    }

    public void j(com.bytedance.msdk.up.r r5, com.bytedance.msdk.api.j r6, com.bytedance.msdk.api.j.xt r7, com.bytedance.msdk.core.oq.oq r8, int r9, int r10, int r11, java.lang.String r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18) {
            r4 = this;
            r0 = r17
            boolean r1 = r6 instanceof com.bytedance.msdk.api.xt.cw
            java.lang.String r2 = "adn_rit_show_rule_id"
            if (r1 == 0) goto L27
            r1 = r6
            com.bytedance.msdk.api.xt.cw r1 = (com.bytedance.msdk.api.xt.cw) r1
            int r3 = r6.j
            com.bytedance.msdk.up.r r3 = r5.xt(r3)
            java.lang.String r6 = r6.xt
            r3.oq(r6)
            java.lang.String r6 = "block_pacing"
            java.lang.String r3 = r1.j()
            r5.j(r6, r3)
            java.lang.String r6 = r1.xt()
            r5.j(r2, r6)
            goto L73
        L27:
            boolean r1 = r6 instanceof com.bytedance.msdk.api.xt.xt
            if (r1 == 0) goto L4a
            r1 = r6
            com.bytedance.msdk.api.xt.xt r1 = (com.bytedance.msdk.api.xt.xt) r1
            int r3 = r6.j
            com.bytedance.msdk.up.r r3 = r5.xt(r3)
            java.lang.String r6 = r6.xt
            r3.oq(r6)
            java.lang.String r6 = "block_show_count"
            java.lang.String r3 = r1.j()
            r5.j(r6, r3)
            java.lang.String r6 = r1.xt()
            r5.j(r2, r6)
            goto L73
        L4a:
            boolean r1 = r6 instanceof com.bytedance.msdk.api.xt.j
            if (r1 == 0) goto L5c
            int r1 = r6.j
            r5.xt(r1)
            java.lang.String r6 = r6.xt
            r5.oq(r6)
            xt(r5)
            goto L73
        L5c:
            if (r6 == 0) goto L61
            int r1 = r6.cw
            goto L62
        L61:
            r1 = -1
        L62:
            com.bytedance.msdk.up.r r1 = r5.xt(r1)
            if (r6 == 0) goto L6b
            java.lang.String r6 = r6.r
            goto L6d
        L6b:
            java.lang.String r6 = "unknown error"
        L6d:
            r1.oq(r6)
            xt(r5)
        L73:
            java.lang.String r6 = "media_fill_fail"
            com.bytedance.msdk.up.r r6 = r5.j(r6)
            com.bytedance.msdk.up.r r6 = r6.j(r13)
            com.bytedance.msdk.up.r r6 = r6.m(r12)
            java.lang.String r12 = "adn_count"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.bytedance.msdk.up.r r6 = r6.j(r12, r9)
            java.lang.String r9 = "adn_preload"
            r12 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            com.bytedance.msdk.up.r r6 = r6.j(r9, r1)
            java.lang.String r9 = "mediationrit_req_type"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.bytedance.msdk.up.r r6 = r6.j(r9, r10)
            java.lang.String r9 = "mediationrit_req_type_src"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r6.j(r9, r10)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r9 = 0
            int r11 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r11 < 0) goto Lb5
            r12 = 1
        Lb5:
            if (r8 == 0) goto Lde
            boolean r9 = r8.c()
            if (r9 == 0) goto Lde
            double r9 = com.bytedance.msdk.tl.mi.cw()
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            java.lang.String r10 = "custom_adn_sample_ratio"
            r6.put(r10, r9)
            java.lang.String r9 = "custom_adn_sample_ratio_result"
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r12)
            r6.put(r9, r10)
            if (r12 == 0) goto Lde
            java.lang.String r9 = "custom_adn_rec_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r18)
            r6.put(r9, r10)
        Lde:
            r9 = 0
            com.bytedance.msdk.up.m.j(r5, r7, r8, r9, r6)
            boolean r7 = android.text.TextUtils.isEmpty(r15)
            if (r7 != 0) goto Leb
            r5.g(r15)
        Leb:
            boolean r7 = android.text.TextUtils.isEmpty(r16)
            if (r7 != 0) goto Lf8
            java.lang.String r7 = "level_tag"
            r8 = r16
            r5.j(r7, r8)
        Lf8:
            if (r0 == 0) goto Lff
            java.lang.String r7 = "sub_adn_name"
            r5.j(r7, r0)
        Lff:
            android.content.Context r7 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r7, r5, r6)
            return
    }

    public void j(com.bytedance.msdk.up.r r4, com.bytedance.msdk.core.oq.oq r5, com.bytedance.msdk.api.j.xt r6, int r7, int r8) {
            r3 = this;
            java.lang.String r0 = "adapter_request_fail"
            com.bytedance.msdk.up.r r0 = r4.j(r0)
            r1 = 0
            com.bytedance.msdk.up.r r0 = r0.j(r1)
            r1 = 0
            com.bytedance.msdk.up.r r0 = r0.m(r1)
            r2 = -99999(0xfffffffffffe7961, float:NaN)
            com.bytedance.msdk.up.r r0 = r0.xt(r2)
            java.lang.String r2 = "adapter create fail !"
            com.bytedance.msdk.up.r r0 = r0.oq(r2)
            java.lang.String r2 = "mediationrit_req_type"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.bytedance.msdk.up.r r7 = r0.j(r2, r7)
            java.lang.String r0 = "mediationrit_req_type_src"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.j(r0, r8)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.bytedance.msdk.up.m.j(r4, r6, r5, r1, r7)
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r5, r4, r7)
            return
    }

    public void j(com.bytedance.msdk.up.r r2, com.bytedance.msdk.core.oq.oq r3, com.bytedance.msdk.api.j.xt r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "get_bidding_adm_to_adn"
            com.bytedance.msdk.up.r r0 = r2.j(r0)
            r0.m(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0 = 0
            com.bytedance.msdk.up.m.j(r2, r4, r3, r0, r5)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r2, r5)
            return
    }

    public void j(com.bytedance.msdk.up.r r4, com.bytedance.msdk.core.oq.oq r5, com.bytedance.msdk.api.j.xt r6, java.lang.String r7, boolean r8, int r9, int r10, int r11, int r12, com.bytedance.msdk.api.j r13, long r14, boolean r16, boolean r17, java.lang.String r18) {
            r3 = this;
            boolean r1 = r13 instanceof com.bytedance.msdk.api.xt.cw
            if (r1 != 0) goto Lc
            boolean r1 = r13 instanceof com.bytedance.msdk.api.xt.xt
            if (r1 != 0) goto Lc
            boolean r1 = r13 instanceof com.bytedance.msdk.api.xt.j
            if (r1 == 0) goto L17
        Lc:
            int r1 = r13.j
            com.bytedance.msdk.up.r r1 = r4.xt(r1)
            java.lang.String r0 = r13.xt
            r1.oq(r0)
        L17:
            r0 = 1
            r8 = r8 ^ r0
            java.lang.String r1 = "media_request"
            com.bytedance.msdk.up.r r1 = r4.j(r1)
            com.bytedance.msdk.up.r r7 = r1.m(r7)
            if (r6 == 0) goto L2a
            int r1 = r6.a()
            goto L2b
        L2a:
            r1 = 0
        L2b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ad_count"
            com.bytedance.msdk.up.r r7 = r7.j(r2, r1)
            java.lang.String r1 = "adn_count"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.bytedance.msdk.up.r r7 = r7.j(r1, r10)
            java.lang.String r10 = "mediationrit_req_type"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.bytedance.msdk.up.r r7 = r7.j(r10, r11)
            java.lang.String r10 = "mediationrit_req_type_src"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            com.bytedance.msdk.up.r r7 = r7.j(r10, r11)
            java.lang.String r10 = "mediation_req_type"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.bytedance.msdk.up.r r7 = r7.j(r10, r8)
            java.lang.String r8 = "media_req_type"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.j(r8, r9)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r8 = "timeout_req"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            r7.put(r8, r9)
            java.lang.String r8 = "is_callback"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r7.put(r8, r9)
            if (r6 == 0) goto L92
            boolean r8 = r6.sm()
            if (r8 == 0) goto L92
            boolean r8 = android.text.TextUtils.isEmpty(r18)
            if (r8 != 0) goto L92
            java.lang.String r8 = "origin_link_id"
            r9 = r18
            r7.put(r8, r9)
        L92:
            if (r6 == 0) goto Lc2
            com.bytedance.msdk.core.oq.xt r8 = r6.n()
            if (r8 == 0) goto Lc2
            if (r5 == 0) goto Lc2
            java.lang.String r8 = "pangle"
            java.lang.String r9 = r5.az()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto Lc2
            int r8 = r5.jy()
            r9 = 5
            if (r8 != r9) goto Lc2
            com.bytedance.msdk.core.oq.xt r8 = r6.n()
            int r8 = r8.j()
            if (r8 != r0) goto Lc2
            java.lang.String r9 = "support_render_control"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.put(r9, r8)
        Lc2:
            r8 = -1
            int r10 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r10 == 0) goto Ld6
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r14
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "start_time"
            r7.put(r9, r8)
        Ld6:
            r8 = 0
            com.bytedance.msdk.up.m.j(r4, r6, r5, r8, r7)
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r5, r4, r7)
            return
    }

    public void j(com.bytedance.msdk.up.r r6, com.bytedance.msdk.xt.cw r7, int r8, java.lang.String r9, long r10, com.bytedance.msdk.api.j.xt r12, int r13, int r14, int r15, java.lang.String r16, long r17, long r19) {
            r5 = this;
            r0 = r16
            r1 = 0
            r2 = 1
            if (r7 == 0) goto Le
            boolean r3 = r7.nd()
            if (r3 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            java.lang.String r4 = "media_fill"
            com.bytedance.msdk.up.r r4 = r6.j(r4)
            com.bytedance.msdk.up.r r10 = r4.j(r10)
            com.bytedance.msdk.up.r r8 = r10.xt(r8)
            com.bytedance.msdk.up.r r8 = r8.oq(r9)
            java.lang.String r9 = "adn_count"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            com.bytedance.msdk.up.r r8 = r8.j(r9, r10)
            java.lang.String r9 = "adn_preload"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            com.bytedance.msdk.up.r r8 = r8.j(r9, r10)
            java.lang.String r9 = "ad_count"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r8.j(r9, r10)
            java.lang.String r8 = "fill_type"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r6.j(r8, r9)
            if (r0 == 0) goto L4e
            java.lang.String r8 = "sub_adn_name"
            r6.j(r8, r0)
        L4e:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 < 0) goto L5a
            r1 = 1
        L5a:
            if (r7 == 0) goto L83
            boolean r9 = r7.dj()
            if (r9 == 0) goto L83
            double r9 = com.bytedance.msdk.tl.mi.cw()
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            java.lang.String r10 = "custom_adn_sample_ratio"
            r8.put(r10, r9)
            java.lang.String r9 = "custom_adn_sample_ratio_result"
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            r8.put(r9, r10)
            if (r1 == 0) goto L83
            java.lang.String r9 = "custom_adn_rec_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r17)
            r8.put(r9, r10)
        L83:
            r9 = -1
            int r11 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r11 == 0) goto L92
            java.lang.String r9 = "end_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r19)
            r8.put(r9, r10)
        L92:
            r9 = 5
            if (r7 == 0) goto Lba
            java.lang.String r10 = "pangle"
            java.lang.String r11 = r7.ff()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lba
            int r10 = r7.om()
            if (r10 != r9) goto Lba
            int r10 = r7.ch()
            if (r10 != r2) goto Lba
            int r10 = r7.ch()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "if_to_express"
            r8.put(r11, r10)
        Lba:
            com.bytedance.msdk.core.ws.cw r10 = com.bytedance.msdk.core.xt.xt()
            boolean r10 = r10.hh()
            if (r10 == 0) goto Ld9
            if (r7 == 0) goto Ld9
            int r10 = r7.om()
            if (r9 != r10) goto Ld9
            com.bytedance.msdk.up.tl r9 = com.bytedance.msdk.up.tl.j()
            java.lang.String r9 = r9.j(r7)
            java.lang.String r10 = "ex_info"
            r6.j(r10, r9)
        Ld9:
            r9 = 0
            com.bytedance.msdk.up.m.j(r6, r12, r9, r7, r8)
            android.content.Context r7 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r7, r6, r8)
            return
    }

    public void j(com.bytedance.msdk.up.r r2, com.bytedance.msdk.xt.cw r3, com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.core.oq.oq r5) {
            r1 = this;
            java.lang.String r0 = "bidding_adm_cache"
            r2.j(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.msdk.up.m.j(r2, r4, r5, r3, r0)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r2, r0)
            return
    }

    public void j(com.bytedance.msdk.up.r r2, com.bytedance.msdk.xt.cw r3, com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.core.oq.oq r5, long r6) {
            r1 = this;
            java.lang.String r0 = "bidding_adm_load"
            com.bytedance.msdk.up.r r0 = r2.j(r0)
            r0.j(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.bytedance.msdk.core.ws.cw r7 = com.bytedance.msdk.core.xt.xt()
            boolean r7 = r7.hh()
            if (r7 == 0) goto L2e
            if (r3 == 0) goto L2e
            r7 = 5
            int r0 = r3.om()
            if (r7 != r0) goto L2e
            com.bytedance.msdk.up.tl r7 = com.bytedance.msdk.up.tl.j()
            java.lang.String r7 = r7.j(r3)
            java.lang.String r0 = "ex_info"
            r2.j(r0, r7)
        L2e:
            com.bytedance.msdk.up.m.j(r2, r4, r5, r3, r6)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r2, r6)
            return
    }

    public void j(com.bytedance.msdk.up.r r1, com.bytedance.msdk.xt.cw r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.core.oq.xt r4, long r5, java.lang.String r7, boolean r8, int r9, boolean r10, boolean r11) {
            r0 = this;
            java.lang.String r4 = "mediation_fill"
            com.bytedance.msdk.up.r r4 = r1.j(r4)
            com.bytedance.msdk.up.r r4 = r4.j(r5)
            java.lang.String r5 = "server_bidding_extra"
            com.bytedance.msdk.up.r r4 = r4.j(r5, r7)
            r5 = r8 ^ 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "mediation_req_type"
            com.bytedance.msdk.up.r r4 = r4.j(r6, r5)
            java.lang.String r5 = "ad_count"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            com.bytedance.msdk.up.r r4 = r4.j(r5, r6)
            r5 = 0
            com.bytedance.msdk.up.r r4 = r4.xt(r5)
            java.lang.String r5 = ""
            r4.oq(r5)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r3 == 0) goto L7c
            int r5 = r3.f()
            r6 = 3
            if (r5 != r6) goto L7c
            com.bytedance.msdk.ae.xt.j r5 = com.bytedance.msdk.ae.xt.j.j()
            boolean r5 = r5.qv()
            java.lang.String r6 = "init_splash_fill_duration"
            if (r5 == 0) goto L63
            com.bytedance.msdk.ae.xt.j r5 = com.bytedance.msdk.ae.xt.j.j()
            java.lang.String r7 = com.bytedance.msdk.up.j.cw
            r5.j(r7)
            com.bytedance.msdk.ae.xt.j r5 = com.bytedance.msdk.ae.xt.j.j()
            long r7 = r5.oq()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r4.put(r6, r5)
            goto L7c
        L63:
            com.bytedance.msdk.ae.xt.j r5 = com.bytedance.msdk.ae.xt.j.j()
            boolean r5 = r5.vl()
            if (r5 == 0) goto L7c
            com.bytedance.msdk.ae.xt.j r5 = com.bytedance.msdk.ae.xt.j.j()
            long r7 = r5.oq()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r4.put(r6, r5)
        L7c:
            r5 = 0
            com.bytedance.msdk.up.m.j(r1, r3, r5, r2, r4)
            java.lang.String r2 = "timeout_req"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4.put(r2, r3)
            java.lang.String r2 = "is_callback"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.put(r2, r3)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r2, r1, r4)
            return
    }

    public void j(com.bytedance.msdk.up.r r22, com.bytedance.msdk.xt.cw r23, com.bytedance.msdk.api.j.xt r24, java.util.List<com.bytedance.msdk.xt.cw> r25, java.util.List<com.bytedance.msdk.xt.cw> r26) {
            r21 = this;
            r0 = r22
            java.lang.String r1 = "bidding_win_event"
            r0.j(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r23
            r4 = r24
            com.bytedance.msdk.up.m.j(r0, r4, r2, r3, r1)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            boolean r3 = com.bytedance.msdk.tl.p.j(r25)
            java.lang.String r4 = "pricing_type"
            java.lang.String r5 = "loss_callback"
            java.lang.String r6 = "win_callback"
            java.lang.String r7 = "ad_extra"
            java.lang.String r8 = "win_state"
            java.lang.String r9 = "req_bidding_type"
            java.lang.String r10 = "m_aid"
            java.lang.String r11 = "rit_cpm"
            java.lang.String r12 = "exchange_rate"
            java.lang.String r13 = "show_sort"
            java.lang.String r14 = "load_sort"
            java.lang.String r15 = "adn_name"
            r23 = r3
            java.lang.String r3 = "mediation_rit"
            if (r23 != 0) goto Ldc
            java.util.Iterator r16 = r25.iterator()
        L3f:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto Ldc
            java.lang.Object r17 = r16.next()
            com.bytedance.msdk.xt.cw r17 = (com.bytedance.msdk.xt.cw) r17
            if (r17 == 0) goto Ld9
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld6
            r0.<init>()     // Catch: java.lang.Exception -> Ld6
            r18 = r1
            java.lang.String r1 = r17.qa()     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r3, r1)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = r17.ff()     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r15, r1)     // Catch: java.lang.Exception -> Lcb
            int r1 = r17.wi()     // Catch: java.lang.Exception -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r14, r1)     // Catch: java.lang.Exception -> Lcb
            int r1 = r17.d()     // Catch: java.lang.Exception -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r13, r1)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = r17.k()     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r12, r1)     // Catch: java.lang.Exception -> Lcb
            double r19 = r17.t()     // Catch: java.lang.Exception -> Lcb
            java.lang.Double r1 = java.lang.Double.valueOf(r19)     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r11, r1)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = r17.gx()     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r10, r1)     // Catch: java.lang.Exception -> Lcb
            int r1 = r17.xw()     // Catch: java.lang.Exception -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r9, r1)     // Catch: java.lang.Exception -> Lcb
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r8, r1)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = r17.n()     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r7, r1)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = r17.ed()     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r6, r1)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r1 = r17.c()     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r5, r1)     // Catch: java.lang.Exception -> Lcb
            boolean r1 = r17.qo()     // Catch: java.lang.Exception -> Lcb
            if (r1 == 0) goto Lcd
            int r1 = r17.wq()     // Catch: java.lang.Exception -> Lcb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lcb
            r0.putOpt(r4, r1)     // Catch: java.lang.Exception -> Lcb
            goto Lcd
        Lcb:
            goto Ld0
        Lcd:
            r2.put(r0)     // Catch: java.lang.Exception -> Lcb
        Ld0:
            r0 = r22
            r1 = r18
            goto L3f
        Ld6:
            r18 = r1
            goto Lcb
        Ld9:
            r18 = r1
            goto Ld0
        Ldc:
            r18 = r1
            boolean r0 = com.bytedance.msdk.tl.p.j(r26)
            if (r0 != 0) goto L182
            java.util.Iterator r0 = r26.iterator()
        Le8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L182
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            if (r1 == 0) goto L17f
            r23 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L176
            r0.<init>()     // Catch: java.lang.Exception -> L176
            r24 = r1
            java.lang.String r1 = r24.qa()     // Catch: java.lang.Exception -> L176
            r0.putOpt(r3, r1)     // Catch: java.lang.Exception -> L176
            java.lang.String r1 = r24.ff()     // Catch: java.lang.Exception -> L176
            r0.putOpt(r15, r1)     // Catch: java.lang.Exception -> L176
            int r1 = r24.wi()     // Catch: java.lang.Exception -> L176
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L176
            r0.putOpt(r14, r1)     // Catch: java.lang.Exception -> L176
            int r1 = r24.d()     // Catch: java.lang.Exception -> L176
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L176
            r0.putOpt(r13, r1)     // Catch: java.lang.Exception -> L176
            java.lang.String r1 = r24.k()     // Catch: java.lang.Exception -> L176
            r0.putOpt(r12, r1)     // Catch: java.lang.Exception -> L176
            double r16 = r24.t()     // Catch: java.lang.Exception -> L176
            java.lang.Double r1 = java.lang.Double.valueOf(r16)     // Catch: java.lang.Exception -> L176
            r0.putOpt(r11, r1)     // Catch: java.lang.Exception -> L176
            java.lang.String r1 = r24.gx()     // Catch: java.lang.Exception -> L176
            r0.putOpt(r10, r1)     // Catch: java.lang.Exception -> L176
            int r1 = r24.xw()     // Catch: java.lang.Exception -> L176
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L176
            r0.putOpt(r9, r1)     // Catch: java.lang.Exception -> L176
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L176
            r0.putOpt(r8, r1)     // Catch: java.lang.Exception -> L176
            java.lang.String r1 = r24.n()     // Catch: java.lang.Exception -> L176
            r0.putOpt(r7, r1)     // Catch: java.lang.Exception -> L176
            java.lang.String r1 = r24.ed()     // Catch: java.lang.Exception -> L176
            r0.putOpt(r6, r1)     // Catch: java.lang.Exception -> L176
            java.lang.String r1 = r24.c()     // Catch: java.lang.Exception -> L176
            r0.putOpt(r5, r1)     // Catch: java.lang.Exception -> L176
            boolean r1 = r24.qo()     // Catch: java.lang.Exception -> L176
            if (r1 == 0) goto L178
            int r1 = r24.wq()     // Catch: java.lang.Exception -> L176
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L176
            r0.putOpt(r4, r1)     // Catch: java.lang.Exception -> L176
            goto L178
        L176:
            goto L17b
        L178:
            r2.put(r0)     // Catch: java.lang.Exception -> L176
        L17b:
            r0 = r23
            goto Le8
        L17f:
            r23 = r0
            goto L17b
        L182:
            java.lang.String r0 = "others"
            r1 = r18
            r1.put(r0, r2)
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            r2 = r22
            com.bytedance.msdk.up.cw.j(r0, r2, r1)
            return
    }
}
