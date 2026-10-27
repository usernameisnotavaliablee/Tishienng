package com.bytedance.msdk.core.jy;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static volatile com.bytedance.msdk.core.jy.j j;




    /* renamed from: com.bytedance.msdk.core.jy.j$j, reason: collision with other inner class name */
    public interface InterfaceC0227j {
        void j(com.bytedance.msdk.api.j r1);

        void j(com.bytedance.msdk.core.oq.ae r1);
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.json.JSONObject cw() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "appid"
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r2.vl()     // Catch: java.lang.Exception -> L25
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "name"
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r2.tj()     // Catch: java.lang.Exception -> L25
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L25
            r3.xt(r0)     // Catch: java.lang.Exception -> L25
            r3.cw(r0)     // Catch: java.lang.Exception -> L25
        L25:
            return r0
    }

    private void cw(org.json.JSONObject r6) {
            r5 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.up r0 = com.bytedance.msdk.tl.m.j(r0)
            if (r0 == 0) goto L24
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L24
            r1.<init>()     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = "latitude"
            float r3 = r0.j     // Catch: java.lang.Exception -> L24
            double r3 = (double) r3     // Catch: java.lang.Exception -> L24
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = "longitude"
            float r0 = r0.xt     // Catch: java.lang.Exception -> L24
            double r3 = (double) r0     // Catch: java.lang.Exception -> L24
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = "geo"
            r6.put(r0, r1)     // Catch: java.lang.Exception -> L24
        L24:
            return
    }

    public static int j(int r2) {
            r0 = 1
            r1 = 2
            if (r2 == r0) goto L17
            r0 = 4
            if (r2 == r1) goto L16
            r1 = 3
            if (r2 == r1) goto L14
            if (r2 == r0) goto L14
            r0 = 7
            if (r2 == r0) goto L14
            r0 = 8
            if (r2 == r0) goto L14
            return r1
        L14:
            r2 = 5
            return r2
        L16:
            return r0
        L17:
            return r1
    }

    public static com.bytedance.msdk.core.jy.j j() {
            com.bytedance.msdk.core.jy.j r0 = com.bytedance.msdk.core.jy.j.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.jy.j> r0 = com.bytedance.msdk.core.jy.j.class
            monitor-enter(r0)
            com.bytedance.msdk.core.jy.j r1 = com.bytedance.msdk.core.jy.j.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.jy.j r1 = new com.bytedance.msdk.core.jy.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.jy.j.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.core.jy.j r0 = com.bytedance.msdk.core.jy.j.j
            return r0
    }

    private com.bytedance.msdk.core.oq.tl j(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "ServerBiddingHelper"
            r1 = 0
            if (r7 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "m_adm"
            java.lang.String r2 = r7.optString(r2)
            java.lang.String r3 = "extra_data_and_no_parse"
            java.lang.Object r7 = r7.opt(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L19
            return r1
        L19:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "cypher"
            r4 = -1
            int r2 = r3.optInt(r2, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "message"
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5e
            if (r2 < 0) goto L115
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L115
            r4 = 2
            r5 = 1
            if (r2 != r4) goto L61
            java.lang.String r2 = com.bytedance.msdk.tl.rn.j(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5e
            if (r3 != 0) goto L87
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L47
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L47
            goto L88
        L47:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = ">>>>> adm winner data error: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5e
            r3.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            com.bytedance.msdk.j.up.cw.j(r0, r2)     // Catch: java.lang.Throwable -> L5e
            goto L87
        L5e:
            r7 = move-exception
            goto L11b
        L61:
            if (r2 != r5) goto L7e
            java.lang.String r2 = com.bytedance.msdk.tl.xt.j()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = com.bytedance.msdk.tl.j.xt(r3, r2)     // Catch: java.lang.Throwable -> L5e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5e
            if (r3 != 0) goto L87
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L77
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L77
            goto L88
        L77:
            r2 = move-exception
            java.lang.String r3 = "adm winner data error: "
            com.bytedance.msdk.j.up.cw.j(r0, r3, r2)     // Catch: java.lang.Throwable -> L5e
            goto L87
        L7e:
            if (r2 != 0) goto L87
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5e
            r3 = r2
            goto L88
        L87:
            r3 = r1
        L88:
            if (r3 == 0) goto L10f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5e
            if (r2 != 0) goto L109
            com.bytedance.msdk.core.oq.tl r2 = new com.bytedance.msdk.core.oq.tl     // Catch: java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "req_bidding_type"
            int r4 = r3.optInt(r4)     // Catch: java.lang.Throwable -> L5e
            r2.xt(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "price"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5e
            r2.cw(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "load_price"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5e
            r2.r(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "adm"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5e
            r2.oq(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "name"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5e
            r2.up(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "app_id"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5e
            r2.ae(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "slot_id"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5e
            r2.m(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "win_callback"
            java.lang.String r4 = r3.optString(r4, r1)     // Catch: java.lang.Throwable -> L5e
            r2.tl(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "fail_callback"
            java.lang.String r4 = r3.optString(r4, r1)     // Catch: java.lang.Throwable -> L5e
            r2.g(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "m_aid"
            java.lang.String r4 = r3.optString(r4, r1)     // Catch: java.lang.Throwable -> L5e
            r2.j(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "ad_extra"
            java.lang.String r4 = r3.optString(r4, r1)     // Catch: java.lang.Throwable -> L5e
            r2.xt(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "pricing_type"
            int r3 = r3.optInt(r4, r5)     // Catch: java.lang.Throwable -> L5e
            r2.j(r3)     // Catch: java.lang.Throwable -> L5e
            r2.j(r7)     // Catch: java.lang.Throwable -> L5e
            return r2
        L109:
            java.lang.String r7 = "adm winner data.string is null "
            com.bytedance.msdk.j.up.cw.r(r0, r7)     // Catch: java.lang.Throwable -> L5e
            return r1
        L10f:
            java.lang.String r7 = "adm winner data is null"
            com.bytedance.msdk.j.up.cw.r(r0, r7)     // Catch: java.lang.Throwable -> L5e
            return r1
        L115:
            java.lang.String r7 = "adm winner data onResponse error "
            com.bytedance.msdk.j.up.cw.r(r0, r7)     // Catch: java.lang.Throwable -> L5e
            return r1
        L11b:
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "adm winner onResponse throwable ："
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r2.concat(r7)
            com.bytedance.msdk.j.up.cw.r(r0, r7)
            return r1
    }

    private java.lang.String j(com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.core.oq.oq r3) {
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.String r2 = r2.j()
            goto L8
        L7:
            r2 = 0
        L8:
            if (r3 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r3.w()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L2e:
            return r2
    }

    private java.lang.String j(java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> r8, android.content.Context r9, com.bytedance.msdk.api.j.xt r10, com.bytedance.msdk.core.oq.oq r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
            r7 = this;
            java.lang.String r0 = ""
            if (r10 == 0) goto L4f
            if (r11 != 0) goto L7
            goto L4f
        L7:
            java.lang.String r1 = "baidu"
            java.lang.String r2 = r11.az()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L46
            r12 = 0
            com.bytedance.msdk.cw.m.xt.xt r1 = com.bytedance.msdk.cw.m.xt.xt.j(r11, r12)
            com.bytedance.msdk.cw.j.j r12 = com.bytedance.msdk.cw.tl.cw.j(r1, r10, r12)
            if (r12 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r2 = "%1$s_%2$s_%3$s"
            java.lang.String r3 = r10.j()     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r10.v()     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = r11.w()     // Catch: java.lang.Throwable -> L45
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L45
            r6 = 0
            r5[r6] = r3     // Catch: java.lang.Throwable -> L45
            r3 = 1
            r5[r3] = r4     // Catch: java.lang.Throwable -> L45
            r3 = 2
            r5[r3] = r11     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = java.lang.String.format(r2, r5)     // Catch: java.lang.Throwable -> L45
            r8.put(r11, r12)     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = r12.j(r9, r1, r10)     // Catch: java.lang.Throwable -> L45
            return r8
        L45:
            return r0
        L46:
            java.lang.String r8 = r11.az()
            java.lang.String r8 = com.bytedance.msdk.m.xt.j.j(r12, r8)
            return r8
        L4f:
            java.lang.String r8 = "serverBiddingRequest"
            java.lang.String r9 = "adSlot is null or waterFallConfig is null can not get server bidding token"
            com.bytedance.msdk.j.up.cw.xt(r8, r9)
            return r0
    }

    private java.lang.String j(java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> r36, android.content.Context r37, com.bytedance.msdk.api.j.xt r38, java.util.List<com.bytedance.msdk.core.oq.oq> r39, java.util.List<com.bytedance.msdk.xt.cw> r40, com.bytedance.msdk.core.oq.xt r41, int r42, boolean r43, org.json.JSONObject r44, boolean r45) {
            r35 = this;
            r1 = r35
            r4 = r38
            r7 = r39
            r8 = r44
            java.lang.String r9 = "pangle"
            java.lang.String r10 = "req_bidding_type"
            java.lang.String r11 = "sdk_version"
            r12 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r13 = 2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r3 = "request_id"
            java.lang.String r5 = r4.j()     // Catch: java.lang.Exception -> L626
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = com.bytedance.msdk.xt.xt.xt()     // Catch: java.lang.Exception -> L626
            r15.putOpt(r11, r3)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = "plugin_version"
            java.lang.String r5 = com.bytedance.msdk.xt.xt.r()     // Catch: java.lang.Exception -> L626
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = "waterfall_id"
            long r5 = r41.s()     // Catch: java.lang.Exception -> L626
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L626
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = "waterfall_version"
            java.lang.String r5 = r41.la()     // Catch: java.lang.Exception -> L626
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L626
            r15.putOpt(r10, r14)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = "segment_id"
            int r5 = r41.a()     // Catch: java.lang.Exception -> L626
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L626
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = "segment_version"
            java.lang.String r5 = r41.l()     // Catch: java.lang.Exception -> L626
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = "transparent_params"
            java.lang.String r5 = r4.m()     // Catch: java.lang.Exception -> L626
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = r4.x()     // Catch: java.lang.Exception -> L626
            if (r3 == 0) goto L84
            java.lang.String r3 = "scenario_id"
            java.lang.String r5 = r4.x()     // Catch: java.lang.Exception -> L7e
            r15.putOpt(r3, r5)     // Catch: java.lang.Exception -> L7e
            goto L84
        L7e:
            r0 = move-exception
            r2 = r15
        L80:
            r16 = 0
            goto L62b
        L84:
            java.lang.String r3 = "is_fusion"
            r15.putOpt(r3, r0)     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = r4.nd()     // Catch: java.lang.Exception -> L626
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L626
            if (r3 != 0) goto L98
            java.lang.String r3 = "mediation_map_request"
            r15.putOpt(r3, r0)     // Catch: java.lang.Exception -> L7e
        L98:
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j()     // Catch: java.lang.Exception -> L626
            org.json.JSONObject r3 = r1.xt()     // Catch: java.lang.Exception -> L626
            org.json.JSONObject r0 = r0.j(r3)     // Catch: java.lang.Exception -> L626
            if (r0 == 0) goto Lab
            java.lang.String r3 = "app_abtest"
            r15.putOpt(r3, r0)     // Catch: java.lang.Exception -> L7e
        Lab:
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j()     // Catch: java.lang.Exception -> L626
            java.lang.String r3 = r41.hh()     // Catch: java.lang.Exception -> L626
            org.json.JSONObject r3 = r1.j(r3)     // Catch: java.lang.Exception -> L626
            org.json.JSONObject r0 = r0.xt(r3)     // Catch: java.lang.Exception -> L626
            if (r0 == 0) goto Lc2
            java.lang.String r3 = "waterfall_abtest"
            r15.putOpt(r3, r0)     // Catch: java.lang.Exception -> L7e
        Lc2:
            java.lang.String r0 = "grouping_params"
            org.json.JSONObject r3 = com.bytedance.msdk.core.ws.xt.xt()     // Catch: java.lang.Exception -> L626
            r15.putOpt(r0, r3)     // Catch: java.lang.Exception -> L626
            org.json.JSONObject r0 = com.bytedance.msdk.core.ws.xt.cw()     // Catch: java.lang.Exception -> L626
            if (r0 == 0) goto Ld6
            java.lang.String r3 = "user_defined_grouping_params"
            r15.putOpt(r3, r0)     // Catch: java.lang.Exception -> L7e
        Ld6:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L626
            r3.<init>()     // Catch: java.lang.Exception -> L626
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> L626
            r6.<init>()     // Catch: java.lang.Exception -> L626
            java.lang.String r0 = com.bytedance.msdk.j.j.j.j     // Catch: java.lang.Exception -> L626
            r6.put(r0, r4)     // Catch: java.lang.Exception -> L626
            java.lang.String r0 = com.bytedance.msdk.j.j.j.r     // Catch: java.lang.Exception -> L626
            java.lang.String r5 = r41.hh()     // Catch: java.lang.Exception -> L626
            r6.put(r0, r5)     // Catch: java.lang.Exception -> L626
            r5 = 0
            r16 = 0
        Lf1:
            int r0 = r7.size()     // Catch: java.lang.Exception -> L623
            java.lang.String r12 = "exchange_rate"
            java.lang.String r13 = "load_sort"
            r19 = r10
            java.lang.String r10 = "show_sort"
            r20 = r15
            java.lang.String r15 = "name"
            r21 = 0
            r22 = r14
            java.lang.String r14 = "app_id"
            r23 = r14
            java.lang.String r14 = "slot_id"
            if (r5 >= r0) goto L49e
            java.lang.Object r0 = r7.get(r5)     // Catch: java.lang.Throwable -> L452
            com.bytedance.msdk.core.oq.oq r0 = (com.bytedance.msdk.core.oq.oq) r0     // Catch: java.lang.Throwable -> L452
            boolean r24 = r0.h()     // Catch: java.lang.Throwable -> L452
            if (r24 != 0) goto L122
            r1 = r3
            r29 = r5
            r33 = r6
            r24 = r11
            goto L482
        L122:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L452
            r7.<init>()     // Catch: java.lang.Throwable -> L452
            r24 = r11
            java.lang.String r11 = r0.az()     // Catch: java.lang.Throwable -> L449
            r25 = r12
            java.lang.String r12 = r0.av()     // Catch: java.lang.Throwable -> L442
            java.lang.String r2 = com.bytedance.msdk.j.j.j.xt     // Catch: java.lang.Throwable -> L442
            int r21 = r0.oq()     // Catch: java.lang.Throwable -> L442
            r26 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L43b
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L43b
            java.lang.String r2 = com.bytedance.msdk.j.j.j.cw     // Catch: java.lang.Throwable -> L43b
            int r3 = r0.m()     // Catch: java.lang.Throwable -> L43b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L43b
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L43b
            java.lang.String r2 = com.bytedance.msdk.j.j.j.m     // Catch: java.lang.Throwable -> L43b
            java.lang.String r3 = r1.j(r4, r0)     // Catch: java.lang.Throwable -> L43b
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L43b
            java.lang.String r2 = r0.w()     // Catch: java.lang.Throwable -> L43b
            r6.put(r14, r2)     // Catch: java.lang.Throwable -> L43b
            java.lang.String r2 = "rit_type"
            int r3 = r0.jy()     // Catch: java.lang.Throwable -> L43b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L43b
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L43b
            java.lang.String r2 = "reward_name"
            java.lang.String r3 = r4.p()     // Catch: java.lang.Throwable -> L43b
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L43b
            java.lang.String r2 = "reward_amount"
            int r3 = r4.h()     // Catch: java.lang.Throwable -> L43b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L43b
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L43b
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L43b
            com.bytedance.msdk.core.oq.j r21 = r2.j(r11)     // Catch: java.lang.Throwable -> L43b
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L43b
            r27 = r0
            java.util.Map r0 = com.bytedance.msdk.m.xt.j.xt(r6, r11)     // Catch: java.lang.Throwable -> L43b
            long r28 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L43b
            long r2 = r28 - r2
            r28 = r14
            java.lang.String r14 = "token"
            if (r0 == 0) goto L22e
            boolean r29 = r0.isEmpty()     // Catch: java.lang.Throwable -> L22a
            if (r29 != 0) goto L22e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L22a
            r1.<init>()     // Catch: java.lang.Throwable -> L22a
            java.lang.String r4 = "buyerId"
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L22a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L22a
            r29 = r5
            java.lang.String r5 = "sdkInfo"
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L226
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L226
            com.bytedance.msdk.core.j r5 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L226
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L226
            com.bytedance.msdk.core.j r30 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L226
            r31 = r5
            java.lang.String r5 = r30.gx()     // Catch: java.lang.Throwable -> L226
            com.bytedance.msdk.core.j r30 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L226
            boolean r30 = r30.n()     // Catch: java.lang.Throwable -> L226
            com.bytedance.msdk.core.j r32 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L226
            boolean r32 = r32.nd()     // Catch: java.lang.Throwable -> L226
            r33 = r6
            java.lang.String r6 = "sdk_info"
            r1.putOpt(r6, r0)     // Catch: java.lang.Throwable -> L214
            java.lang.String r0 = "wx_installed"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r31)     // Catch: java.lang.Throwable -> L214
            r1.putOpt(r0, r6)     // Catch: java.lang.Throwable -> L214
            java.lang.String r0 = "opensdk_ver"
            r1.putOpt(r0, r5)     // Catch: java.lang.Throwable -> L214
            java.lang.String r0 = "support_h265"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r30)     // Catch: java.lang.Throwable -> L214
            r1.putOpt(r0, r5)     // Catch: java.lang.Throwable -> L214
            java.lang.String r0 = "support_splash_zoomout"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r32)     // Catch: java.lang.Throwable -> L214
            r1.putOpt(r0, r5)     // Catch: java.lang.Throwable -> L214
            r7.putOpt(r14, r4)     // Catch: java.lang.Throwable -> L214
            java.lang.String r0 = "extra"
            r7.putOpt(r0, r1)     // Catch: java.lang.Throwable -> L214
            if (r8 == 0) goto L21b
            r8.put(r11, r2)     // Catch: java.lang.Throwable -> L214
            goto L21b
        L214:
            r0 = move-exception
        L215:
            r4 = r38
        L217:
            r1 = r26
            goto L45b
        L21b:
            r1 = r35
            r4 = r38
            r34 = r26
            r5 = r27
            r6 = r33
            goto L25e
        L226:
            r0 = move-exception
        L227:
            r33 = r6
            goto L215
        L22a:
            r0 = move-exception
            r29 = r5
            goto L227
        L22e:
            r29 = r5
            r33 = r6
            long r30 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L214
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r34 = r26
            r5 = r27
            r6 = r33
            java.lang.String r0 = r1.j(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L254
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L254
            long r2 = r2 - r30
            if (r8 == 0) goto L25b
            r8.put(r11, r2)     // Catch: java.lang.Throwable -> L254
            goto L25b
        L254:
            r0 = move-exception
        L255:
            r33 = r6
        L257:
            r1 = r34
            goto L45b
        L25b:
            r7.putOpt(r14, r0)     // Catch: java.lang.Throwable -> L254
        L25e:
            java.lang.String r0 = r1.xt(r11)     // Catch: java.lang.Throwable -> L254
            r7.putOpt(r15, r11)     // Catch: java.lang.Throwable -> L254
            java.lang.String r2 = "custom_adn_name"
            r7.putOpt(r2, r12)     // Catch: java.lang.Throwable -> L254
            boolean r2 = android.text.TextUtils.equals(r11, r9)     // Catch: java.lang.Throwable -> L254
            if (r2 == 0) goto L281
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L254
            boolean r2 = r2.uf()     // Catch: java.lang.Throwable -> L254
            if (r2 == 0) goto L281
            java.lang.String r2 = "sub_adn_name"
            java.lang.String r3 = "pangleoppo"
            r7.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L254
        L281:
            int r2 = r5.ch()     // Catch: java.lang.Throwable -> L254
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L254
            r7.putOpt(r10, r2)     // Catch: java.lang.Throwable -> L254
            int r2 = r5.x()     // Catch: java.lang.Throwable -> L254
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L254
            r7.putOpt(r13, r2)     // Catch: java.lang.Throwable -> L254
            java.lang.String r2 = r5.ws()     // Catch: java.lang.Throwable -> L254
            r3 = r25
            r7.putOpt(r3, r2)     // Catch: java.lang.Throwable -> L254
            java.lang.String r2 = r5.w()     // Catch: java.lang.Throwable -> L254
            r12 = r28
            r7.putOpt(r12, r2)     // Catch: java.lang.Throwable -> L254
            java.lang.String r2 = "sub_adType"
            int r3 = r5.m()     // Catch: java.lang.Throwable -> L254
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L254
            r7.putOpt(r2, r3)     // Catch: java.lang.Throwable -> L254
            r2 = r24
            r7.putOpt(r2, r0)     // Catch: java.lang.Throwable -> L2d5
            boolean r0 = r5.c()     // Catch: java.lang.Throwable -> L2d5
            if (r0 == 0) goto L2da
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L2d5
            com.bytedance.msdk.core.oq.j r0 = r0.xt(r11)     // Catch: java.lang.Throwable -> L2d5
            if (r0 == 0) goto L2e5
            java.lang.String r0 = r0.j()     // Catch: java.lang.Throwable -> L2d5
            r14 = r23
            r7.putOpt(r14, r0)     // Catch: java.lang.Throwable -> L2d5
            goto L2e5
        L2d5:
            r0 = move-exception
            r24 = r2
            goto L255
        L2da:
            r14 = r23
            if (r21 == 0) goto L2e5
            java.lang.String r0 = r21.j()     // Catch: java.lang.Throwable -> L2d5
            r7.putOpt(r14, r0)     // Catch: java.lang.Throwable -> L2d5
        L2e5:
            com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j()     // Catch: java.lang.Throwable -> L2d5
            java.lang.String r3 = r4.v()     // Catch: java.lang.Throwable -> L2d5
            java.lang.String r10 = r5.w()     // Catch: java.lang.Throwable -> L2d5
            boolean r0 = r0.cw(r3, r10)     // Catch: java.lang.Throwable -> L2d5
            java.lang.String r3 = "log_extra"
            java.lang.String r10 = "adn_rit_show_rule_id"
            java.lang.String r12 = "error_msg"
            java.lang.String r13 = "media_req_type"
            java.lang.String r14 = "mediation_req_type"
            java.lang.String r15 = "error_code"
            if (r0 != 0) goto L391
            com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j()     // Catch: java.lang.Throwable -> L38d
            r24 = r2
            java.lang.String r2 = r4.v()     // Catch: java.lang.Throwable -> L37c
            java.lang.String r5 = r5.w()     // Catch: java.lang.Throwable -> L37c
            android.util.Pair r0 = r0.j(r2, r5)     // Catch: java.lang.Throwable -> L37c
            if (r0 == 0) goto L383
            if (r43 == 0) goto L31c
            r21 = 2
            goto L31e
        L31c:
            r21 = 3
        L31e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L37c
            r7.putOpt(r14, r2)     // Catch: java.lang.Throwable -> L37c
            r2 = r22
            r7.putOpt(r13, r2)     // Catch: java.lang.Throwable -> L378
            com.bytedance.msdk.api.xt.xt r5 = new com.bytedance.msdk.api.xt.xt     // Catch: java.lang.Throwable -> L378
            r13 = 41041(0xa051, float:5.751E-41)
            java.lang.String r14 = com.bytedance.msdk.api.j.j(r13)     // Catch: java.lang.Throwable -> L378
            java.lang.Object r13 = r0.second     // Catch: java.lang.Throwable -> L378
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L378
            java.lang.Object r0 = r0.first     // Catch: java.lang.Throwable -> L378
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L378
            r33 = r6
            r6 = 41041(0xa051, float:5.751E-41)
            r5.<init>(r6, r14, r13, r0)     // Catch: java.lang.Throwable -> L373
            int r0 = r5.j     // Catch: java.lang.Throwable -> L373
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L373
            r7.putOpt(r15, r0)     // Catch: java.lang.Throwable -> L373
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L373
            r0.<init>()     // Catch: java.lang.Throwable -> L373
            int r6 = r5.j     // Catch: java.lang.Throwable -> L373
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L373
            r0.putOpt(r15, r6)     // Catch: java.lang.Throwable -> L373
            java.lang.String r6 = r5.xt     // Catch: java.lang.Throwable -> L373
            r0.putOpt(r12, r6)     // Catch: java.lang.Throwable -> L373
            java.lang.String r6 = "block_show_count"
            java.lang.String r12 = r5.j()     // Catch: java.lang.Throwable -> L373
            r0.putOpt(r6, r12)     // Catch: java.lang.Throwable -> L373
            java.lang.String r5 = r5.xt()     // Catch: java.lang.Throwable -> L373
            r0.putOpt(r10, r5)     // Catch: java.lang.Throwable -> L373
            r7.putOpt(r3, r0)     // Catch: java.lang.Throwable -> L373
            goto L387
        L373:
            r0 = move-exception
        L374:
            r22 = r2
            goto L257
        L378:
            r0 = move-exception
            r33 = r6
            goto L374
        L37c:
            r0 = move-exception
        L37d:
            r33 = r6
            r2 = r22
            goto L257
        L383:
            r33 = r6
            r2 = r22
        L387:
            r22 = r2
        L389:
            r1 = r34
            goto L435
        L38d:
            r0 = move-exception
            r24 = r2
            goto L37d
        L391:
            r24 = r2
            r33 = r6
            r2 = r22
            com.bytedance.msdk.core.tl.vl r0 = com.bytedance.msdk.core.tl.vl.j()     // Catch: java.lang.Throwable -> L373
            java.lang.String r6 = r4.v()     // Catch: java.lang.Throwable -> L373
            r27 = r5
            java.lang.String r5 = r27.w()     // Catch: java.lang.Throwable -> L373
            boolean r0 = r0.cw(r6, r5)     // Catch: java.lang.Throwable -> L373
            if (r0 != 0) goto L387
            com.bytedance.msdk.core.tl.vl r0 = com.bytedance.msdk.core.tl.vl.j()     // Catch: java.lang.Throwable -> L373
            java.lang.String r5 = r4.v()     // Catch: java.lang.Throwable -> L373
            java.lang.String r6 = r27.w()     // Catch: java.lang.Throwable -> L373
            com.bytedance.msdk.core.tl.g r0 = r0.r(r5, r6)     // Catch: java.lang.Throwable -> L373
            if (r0 == 0) goto L387
            if (r43 == 0) goto L3c2
            r21 = 2
            goto L3c4
        L3c2:
            r21 = 3
        L3c4:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L373
            r7.putOpt(r14, r5)     // Catch: java.lang.Throwable -> L373
            r7.putOpt(r13, r2)     // Catch: java.lang.Throwable -> L373
            com.bytedance.msdk.api.xt.cw r5 = new com.bytedance.msdk.api.xt.cw     // Catch: java.lang.Throwable -> L373
            r6 = 41042(0xa052, float:5.7512E-41)
            java.lang.String r6 = com.bytedance.msdk.api.j.j(r6)     // Catch: java.lang.Throwable -> L373
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L373
            r13.<init>()     // Catch: java.lang.Throwable -> L373
            com.bytedance.msdk.core.tl.vl r14 = com.bytedance.msdk.core.tl.vl.j()     // Catch: java.lang.Throwable -> L373
            r21 = r0
            java.lang.String r0 = r4.v()     // Catch: java.lang.Throwable -> L373
            r22 = r2
            java.lang.String r2 = r27.w()     // Catch: java.lang.Throwable -> L432
            long r0 = r14.j(r0, r2)     // Catch: java.lang.Throwable -> L432
            r13.append(r0)     // Catch: java.lang.Throwable -> L432
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L432
            java.lang.String r1 = r21.oq()     // Catch: java.lang.Throwable -> L432
            r2 = 41042(0xa052, float:5.7512E-41)
            r5.<init>(r2, r6, r0, r1)     // Catch: java.lang.Throwable -> L432
            int r0 = r5.j     // Catch: java.lang.Throwable -> L432
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L432
            r7.putOpt(r15, r0)     // Catch: java.lang.Throwable -> L432
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L432
            r0.<init>()     // Catch: java.lang.Throwable -> L432
            int r1 = r5.j     // Catch: java.lang.Throwable -> L432
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L432
            r0.putOpt(r15, r1)     // Catch: java.lang.Throwable -> L432
            java.lang.String r1 = r5.xt     // Catch: java.lang.Throwable -> L432
            r0.putOpt(r12, r1)     // Catch: java.lang.Throwable -> L432
            java.lang.String r1 = "block_pacing"
            java.lang.String r2 = r5.j()     // Catch: java.lang.Throwable -> L432
            r0.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L432
            java.lang.String r1 = r5.xt()     // Catch: java.lang.Throwable -> L432
            r0.putOpt(r10, r1)     // Catch: java.lang.Throwable -> L432
            r7.putOpt(r3, r0)     // Catch: java.lang.Throwable -> L432
            goto L389
        L432:
            r0 = move-exception
            goto L257
        L435:
            r1.put(r7)     // Catch: java.lang.Throwable -> L439
            goto L47a
        L439:
            r0 = move-exception
            goto L45b
        L43b:
            r0 = move-exception
            r29 = r5
            r33 = r6
            goto L217
        L442:
            r0 = move-exception
            r1 = r3
            r29 = r5
            r33 = r6
            goto L45b
        L449:
            r0 = move-exception
            r1 = r3
            r29 = r5
            r33 = r6
        L44f:
            r11 = r21
            goto L45b
        L452:
            r0 = move-exception
            r1 = r3
            r29 = r5
            r33 = r6
            r24 = r11
            goto L44f
        L45b:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L497
            java.lang.String r5 = "serverBiddingRequest-buildBiddingRequestBody:[adnName="
            r3.<init>(r5)     // Catch: java.lang.Exception -> L497
            r3.append(r11)     // Catch: java.lang.Exception -> L497
            java.lang.String r5 = "]-error:"
            r3.append(r5)     // Catch: java.lang.Exception -> L497
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L497
            r3.append(r0)     // Catch: java.lang.Exception -> L497
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L497
            com.bytedance.msdk.j.up.cw.r(r2, r0)     // Catch: java.lang.Exception -> L497
        L47a:
            boolean r0 = r9.equals(r11)     // Catch: java.lang.Exception -> L497
            if (r0 == 0) goto L482
            r16 = 1
        L482:
            int r5 = r29 + 1
            r7 = r39
            r3 = r1
            r10 = r19
            r15 = r20
            r14 = r22
            r11 = r24
            r6 = r33
            r12 = 1
            r13 = 2
            r1 = r35
            goto Lf1
        L497:
            r0 = move-exception
            r1 = r35
            r2 = r20
            goto L62b
        L49e:
            r1 = r3
            r3 = r12
            r12 = r14
            r14 = r23
            java.lang.String r0 = "bidders"
            r2 = r20
            r2.putOpt(r0, r1)     // Catch: java.lang.Exception -> L4bb
            if (r16 != 0) goto L4c0
            java.lang.String r0 = "bid_request"
            r1 = r35
            org.json.JSONObject r5 = r1.j(r4)     // Catch: java.lang.Exception -> L4b8
            r2.putOpt(r0, r5)     // Catch: java.lang.Exception -> L4b8
            goto L4c2
        L4b8:
            r0 = move-exception
            goto L62b
        L4bb:
            r0 = move-exception
            r1 = r35
            goto L62b
        L4c0:
            r1 = r35
        L4c2:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4b8
            r5.<init>()     // Catch: java.lang.Exception -> L4b8
            java.lang.String r0 = "group_type"
            int r6 = r41.m()     // Catch: java.lang.Exception -> L4b8
            r5.put(r0, r6)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r0 = "primerit_req_type"
            r6 = r42
            r5.put(r0, r6)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r0 = "req_type"
            int r6 = r4.r()     // Catch: java.lang.Exception -> L4b8
            r5.put(r0, r6)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r0 = "ad_type"
            int r6 = r4.f()     // Catch: java.lang.Exception -> L4b8
            r5.put(r0, r6)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r0 = "waterfall_extra"
            java.lang.String r6 = r4.ya()     // Catch: java.lang.Exception -> L4b8
            r5.putOpt(r0, r6)     // Catch: java.lang.Exception -> L4b8
            int r0 = r4.up()     // Catch: java.lang.Exception -> L4b8
            r6 = 2
            if (r0 != r6) goto L51b
            int r0 = r39.size()     // Catch: java.lang.Exception -> L4b8
            if (r0 <= 0) goto L51b
            java.lang.String r0 = "if_test"
            int r6 = r4.up()     // Catch: java.lang.Exception -> L4b8
            r5.put(r0, r6)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r0 = "expect_winner"
            r7 = r39
            r6 = 0
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Exception -> L4b8
            com.bytedance.msdk.core.oq.oq r7 = (com.bytedance.msdk.core.oq.oq) r7     // Catch: java.lang.Exception -> L4b8
            java.lang.String r7 = r7.az()     // Catch: java.lang.Exception -> L4b8
            r5.put(r0, r7)     // Catch: java.lang.Exception -> L4b8
            goto L51c
        L51b:
            r6 = 0
        L51c:
            int r0 = r41.m()     // Catch: java.lang.Exception -> L4b8
            java.lang.String r7 = r4.v()     // Catch: java.lang.Exception -> L4b8
            com.bytedance.msdk.core.g.r.j(r0, r7, r5)     // Catch: java.lang.Exception -> L4b8
            java.util.Map r0 = r4.c()     // Catch: java.lang.Exception -> L4b8
            if (r0 == 0) goto L55d
            java.lang.String r4 = "pangle_vid"
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L53a
            boolean r4 = r0 instanceof int[]     // Catch: java.lang.Throwable -> L53a
            if (r4 == 0) goto L53c
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L53a
            goto L55f
        L53a:
            r0 = move-exception
            goto L55a
        L53c:
            boolean r4 = r0 instanceof java.lang.Integer[]     // Catch: java.lang.Throwable -> L53a
            if (r4 == 0) goto L55d
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0     // Catch: java.lang.Throwable -> L53a
            int r4 = r0.length     // Catch: java.lang.Throwable -> L53a
            int[] r4 = new int[r4]     // Catch: java.lang.Throwable -> L53a
        L545:
            int r7 = r0.length     // Catch: java.lang.Throwable -> L553
            if (r6 >= r7) goto L557
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L553
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L553
            r4[r6] = r7     // Catch: java.lang.Throwable -> L553
            int r6 = r6 + 1
            goto L545
        L553:
            r0 = move-exception
            r21 = r4
            goto L55a
        L557:
            r21 = r4
            goto L55d
        L55a:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Exception -> L4b8
        L55d:
            r0 = r21
        L55f:
            if (r0 == 0) goto L573
            int r4 = r0.length     // Catch: java.lang.Exception -> L4b8
            if (r4 <= 0) goto L573
            java.lang.String r0 = com.bytedance.msdk.tl.w.j(r0)     // Catch: java.lang.Exception -> L4b8
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L4b8
            if (r4 != 0) goto L573
            java.lang.String r4 = "external_vid"
            r5.put(r4, r0)     // Catch: java.lang.Exception -> L4b8
        L573:
            java.lang.String r0 = "bid_request_ext"
            r2.putOpt(r0, r5)     // Catch: java.lang.Exception -> L4b8
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4b8
            r0.<init>()     // Catch: java.lang.Exception -> L4b8
            boolean r4 = com.bytedance.msdk.tl.p.j(r40)     // Catch: java.lang.Exception -> L4b8
            if (r4 != 0) goto L61e
            java.util.Iterator r4 = r40.iterator()     // Catch: java.lang.Exception -> L4b8
        L587:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L4b8
            if (r5 == 0) goto L619
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L4b8
            com.bytedance.msdk.xt.cw r5 = (com.bytedance.msdk.xt.cw) r5     // Catch: java.lang.Exception -> L4b8
            if (r5 == 0) goto L613
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4b8
            r6.<init>()     // Catch: java.lang.Exception -> L4b8
            java.lang.String r7 = r5.ff()     // Catch: java.lang.Exception -> L4b8
            r6.put(r15, r7)     // Catch: java.lang.Exception -> L4b8
            boolean r8 = r5.dj()     // Catch: java.lang.Exception -> L4b8
            if (r8 == 0) goto L5b0
            com.bytedance.msdk.core.ws.cw r8 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Exception -> L4b8
            com.bytedance.msdk.core.oq.j r7 = r8.xt(r7)     // Catch: java.lang.Exception -> L4b8
            goto L5b8
        L5b0:
            com.bytedance.msdk.core.ws.cw r8 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Exception -> L4b8
            com.bytedance.msdk.core.oq.j r7 = r8.j(r7)     // Catch: java.lang.Exception -> L4b8
        L5b8:
            if (r7 == 0) goto L5c1
            java.lang.String r7 = r7.j()     // Catch: java.lang.Exception -> L4b8
            r6.putOpt(r14, r7)     // Catch: java.lang.Exception -> L4b8
        L5c1:
            java.lang.String r7 = r5.qa()     // Catch: java.lang.Exception -> L4b8
            r6.put(r12, r7)     // Catch: java.lang.Exception -> L4b8
            int r7 = r5.xw()     // Catch: java.lang.Exception -> L4b8
            r8 = r19
            r6.put(r8, r7)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r7 = "level_tag"
            java.lang.String r9 = r5.q()     // Catch: java.lang.Exception -> L4b8
            r6.put(r7, r9)     // Catch: java.lang.Exception -> L4b8
            int r7 = r5.wi()     // Catch: java.lang.Exception -> L4b8
            r6.put(r13, r7)     // Catch: java.lang.Exception -> L4b8
            int r7 = r5.d()     // Catch: java.lang.Exception -> L4b8
            r6.put(r10, r7)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r7 = r5.k()     // Catch: java.lang.Exception -> L4b8
            r6.put(r3, r7)     // Catch: java.lang.Exception -> L4b8
            java.lang.String r7 = r5.o()     // Catch: java.lang.Exception -> L4b8
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L4b8
            if (r7 != 0) goto L602
            java.lang.String r7 = "req_id"
            java.lang.String r9 = r5.o()     // Catch: java.lang.Exception -> L4b8
            r6.put(r7, r9)     // Catch: java.lang.Exception -> L4b8
        L602:
            java.lang.String r7 = "cpm"
            double r17 = r5.t()     // Catch: java.lang.Exception -> L4b8
            java.lang.String r5 = java.lang.String.valueOf(r17)     // Catch: java.lang.Exception -> L4b8
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L4b8
            r0.put(r6)     // Catch: java.lang.Exception -> L4b8
            goto L615
        L613:
            r8 = r19
        L615:
            r19 = r8
            goto L587
        L619:
            java.lang.String r3 = "non_server_bidding_results"
            r2.putOpt(r3, r0)     // Catch: java.lang.Exception -> L4b8
        L61e:
            r3 = r45
            r0 = r16
            goto L643
        L623:
            r0 = move-exception
            r2 = r15
            goto L62b
        L626:
            r0 = move-exception
            r2 = r15
            r6 = 0
            goto L80
        L62b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ServerBiddingHelper#serverBiddingRequest getParam() error:"
            r3.<init>(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "tt_server_bidding"
            com.bytedance.msdk.j.up.cw.xt(r3, r0)
            goto L61e
        L643:
            java.lang.String r0 = r1.j(r2, r0, r3)
            return r0
    }

    private java.lang.String j(org.json.JSONObject r2, boolean r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "token_type"
            if (r4 != 0) goto L16
            org.json.JSONObject r2 = com.bytedance.msdk.tl.rn.j(r2)
            if (r2 == 0) goto L24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L11
            r2.putOpt(r0, r3)     // Catch: java.lang.Exception -> L11
        L11:
            java.lang.String r2 = r2.toString()
            return r2
        L16:
            if (r2 == 0) goto L24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1f
            r2.putOpt(r0, r3)     // Catch: java.lang.Exception -> L1f
        L1f:
            java.lang.String r2 = r2.toString()
            return r2
        L24:
            r2 = 0
            return r2
    }

    private org.json.JSONObject j(com.bytedance.msdk.api.j.xt r7) {
            r6 = this;
            java.lang.String r0 = "app"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "request_id"
            java.lang.String r3 = r7.j()     // Catch: java.lang.Exception -> La4
            r1.put(r2, r3)     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = "ad_sdk_version"
            java.lang.String r3 = com.bytedance.msdk.xt.xt.xt()     // Catch: java.lang.Exception -> La4
            r1.put(r2, r3)     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = "plugin_version"
            java.lang.String r3 = com.bytedance.msdk.xt.xt.r()     // Catch: java.lang.Exception -> La4
            r1.put(r2, r3)     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = "source_type"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> La4
            org.json.JSONObject r2 = r6.cw()     // Catch: java.lang.Exception -> La4
            r1.put(r0, r2)     // Catch: java.lang.Exception -> La4
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Exception -> La4
            org.json.JSONObject r0 = com.bytedance.msdk.tl.v.j(r0)     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L47
            int r2 = r7.rn()     // Catch: java.lang.Exception -> La4
            if (r2 <= 0) goto L47
            java.lang.String r2 = "orientation"
            int r3 = r7.rn()     // Catch: java.lang.Exception -> La4
            r0.put(r2, r3)     // Catch: java.lang.Exception -> La4
        L47:
            java.lang.String r2 = "device"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "ua"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.j     // Catch: java.lang.Exception -> La4
            r1.put(r0, r2)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "ip"
            java.lang.String r2 = com.bytedance.msdk.tl.x.f()     // Catch: java.lang.Exception -> La4
            r1.put(r0, r2)     // Catch: java.lang.Exception -> La4
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> La4
            r0.<init>()     // Catch: java.lang.Exception -> La4
            org.json.JSONObject r2 = r6.xt(r7)     // Catch: java.lang.Exception -> La4
            r0.put(r2)     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = "adslots"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> La4
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            java.lang.String r0 = "ts"
            r1.put(r0, r2)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = ""
            java.lang.String r4 = r7.v()     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto L9b
            java.lang.String r4 = r7.j()     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto L9b
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = r7.v()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = r7.j()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r0.concat(r7)     // Catch: java.lang.Exception -> La4
        L9b:
            java.lang.String r7 = "req_sign"
            java.lang.String r0 = com.bytedance.msdk.tl.jy.j(r0)     // Catch: java.lang.Exception -> La4
            r1.put(r7, r0)     // Catch: java.lang.Exception -> La4
        La4:
            return r1
    }

    private org.json.JSONObject j(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le
            r0.<init>(r3)     // Catch: java.lang.Exception -> Le
            return r0
        Le:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    private void j(int r5, java.lang.String r6, com.bytedance.msdk.core.jy.j.InterfaceC0227j r7, boolean r8) {
            r4 = this;
            if (r8 == 0) goto L5
            java.lang.String r8 = "v4Enc_exchange"
            goto L7
        L5:
            java.lang.String r8 = "v2Enc_exchange"
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "code = "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = "，msg = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 0
            com.bytedance.msdk.tl.l.j(r8, r1, r2, r0)
            com.bytedance.msdk.api.j r8 = new com.bytedance.msdk.api.j
            r8.<init>(r5, r6)
            r4.j(r7, r8)
            return
    }

    private void j(com.bytedance.msdk.core.jy.j.InterfaceC0227j r2, com.bytedance.msdk.api.j r3) {
            r1 = this;
            com.bytedance.msdk.core.jy.j$2 r0 = new com.bytedance.msdk.core.jy.j$2
            r0.<init>(r1, r2, r3)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    private void j(com.bytedance.msdk.core.jy.j.InterfaceC0227j r2, com.bytedance.msdk.core.oq.ae r3) {
            r1 = this;
            com.bytedance.msdk.core.jy.j$3 r0 = new com.bytedance.msdk.core.jy.j$3
            r0.<init>(r1, r2, r3)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.jy.j r0, int r1, java.lang.String r2, com.bytedance.msdk.core.jy.j.InterfaceC0227j r3, boolean r4) {
            r0.j(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.jy.j r0, org.json.JSONObject r1, org.json.JSONObject r2, com.bytedance.msdk.core.jy.j.InterfaceC0227j r3, boolean r4, long r5) {
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    private void j(com.bytedance.msdk.core.oq.ae r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "ServerBiddingHelper"
            if (r4 != 0) goto L6
            goto Laf
        L6:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Le
            goto Laf
        Le:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L52
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = "cypher"
            r2 = -1
            int r5 = r1.optInt(r5, r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "message"
            java.lang.String r1 = r1.optString(r2)     // Catch: java.lang.Throwable -> L52
            if (r5 < 0) goto Lb0
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto Lb0
            r2 = 2
            if (r5 != r2) goto L54
            java.lang.String r5 = com.bytedance.msdk.tl.rn.j(r1)     // Catch: java.lang.Throwable -> L52
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L7b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L3b
            goto L7c
        L3b:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = ">>>>> m_meta data error: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L52
            r1.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L52
            com.bytedance.msdk.j.up.cw.j(r0, r5)     // Catch: java.lang.Throwable -> L52
            goto L7b
        L52:
            r4 = move-exception
            goto Lb6
        L54:
            r2 = 1
            if (r5 != r2) goto L72
            java.lang.String r5 = com.bytedance.msdk.tl.xt.j()     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = com.bytedance.msdk.tl.j.xt(r1, r5)     // Catch: java.lang.Throwable -> L52
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L7b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L6b
            goto L7c
        L6b:
            r5 = move-exception
            java.lang.String r1 = "m_meta data error: "
            com.bytedance.msdk.j.up.cw.j(r0, r1, r5)     // Catch: java.lang.Throwable -> L52
            goto L7b
        L72:
            if (r5 != 0) goto L7b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L52
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L52
            r1 = r5
            goto L7c
        L7b:
            r1 = 0
        L7c:
            if (r1 == 0) goto Laa
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L52
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52
            if (r5 != 0) goto La4
            java.lang.String r5 = "request_id"
            java.lang.String r5 = r1.optString(r5)     // Catch: java.lang.Throwable -> L52
            r4.cw(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = "server_bidding_extra"
            java.lang.String r5 = r1.optString(r5)     // Catch: java.lang.Throwable -> L52
            r4.up(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = "server_request_id"
            java.lang.String r5 = r1.optString(r5)     // Catch: java.lang.Throwable -> L52
            r4.r(r5)     // Catch: java.lang.Throwable -> L52
            goto Laf
        La4:
            java.lang.String r4 = "m_meta..data.string is null "
            com.bytedance.msdk.j.up.cw.r(r0, r4)     // Catch: java.lang.Throwable -> L52
            goto Laf
        Laa:
            java.lang.String r4 = "m_meta...data is null"
            com.bytedance.msdk.j.up.cw.r(r0, r4)     // Catch: java.lang.Throwable -> L52
        Laf:
            return
        Lb0:
            java.lang.String r4 = "m_meta onResponse error "
            com.bytedance.msdk.j.up.cw.r(r0, r4)     // Catch: java.lang.Throwable -> L52
            return
        Lb6:
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "m_meta onResponse throwable ："
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r5.concat(r4)
            com.bytedance.msdk.j.up.cw.r(r0, r4)
            return
    }

    private void j(org.json.JSONObject r4, java.lang.String r5, int r6, int r7) {
            r3 = this;
            if (r6 <= 0) goto L1e
            if (r7 <= 0) goto L1e
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "width"
            r0.put(r2, r6)     // Catch: java.lang.Exception -> L1e
            java.lang.String r6 = "height"
            r0.put(r6, r7)     // Catch: java.lang.Exception -> L1e
            r1.put(r0)     // Catch: java.lang.Exception -> L1e
            r4.put(r5, r1)     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    private void j(org.json.JSONObject r20, org.json.JSONObject r21, com.bytedance.msdk.core.jy.j.InterfaceC0227j r22, boolean r23, long r24) {
            r19 = this;
            r2 = r20
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r24
            r0 = -1
            java.lang.String r7 = "ServerBiddingHelper"
            if (r2 == 0) goto L296
            java.lang.String r8 = r2.toString()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L284
            com.bytedance.msdk.core.oq.ae r8 = new com.bytedance.msdk.core.oq.ae
            r8.<init>()
            r0 = r21
            r8.j(r0)
            java.lang.String r0 = "request_id"
            java.lang.String r0 = r2.optString(r0)
            r8.cw(r0)
            java.lang.String r0 = "server_bidding_extra"
            java.lang.String r0 = r2.optString(r0)
            r8.up(r0)
            java.lang.String r0 = "server_request_id"
            java.lang.String r0 = r2.optString(r0)
            r8.r(r0)
            com.bytedance.msdk.core.oq.tl r0 = new com.bytedance.msdk.core.oq.tl
            r0.<init>()
            java.lang.String r9 = "winner"
            org.json.JSONObject r9 = r2.optJSONObject(r9)
            java.lang.String r10 = "pricing_type"
            java.lang.String r11 = "fail_callback"
            java.lang.String r12 = "win_callback"
            java.lang.String r13 = "app_id"
            java.lang.String r14 = "adm"
            java.lang.String r15 = "load_price"
            java.lang.String r4 = "price"
            r24 = r5
            java.lang.String r5 = "slot_id"
            java.lang.String r6 = "name"
            java.lang.String r1 = "req_bidding_type"
            if (r9 == 0) goto Lad
            int r3 = r9.optInt(r1)
            r0.xt(r3)
            java.lang.String r3 = r9.optString(r4)
            r0.cw(r3)
            java.lang.String r3 = r9.optString(r15)
            r0.r(r3)
            java.lang.String r3 = r9.optString(r14)
            r0.oq(r3)
            java.lang.String r3 = r9.optString(r6)
            r0.up(r3)
            java.lang.String r3 = r9.optString(r13)
            r0.ae(r3)
            java.lang.String r3 = r9.optString(r5)
            r0.m(r3)
            r17 = r7
            r3 = 0
            java.lang.String r7 = r9.optString(r12, r3)
            r0.tl(r7)
            java.lang.String r7 = r9.optString(r11, r3)
            r0.g(r7)
            r3 = 1
            int r7 = r9.optInt(r10, r3)
            r0.j(r7)
            r8.j(r0)
            goto Laf
        Lad:
            r17 = r7
        Laf:
            java.lang.String r0 = "winners"
            org.json.JSONArray r3 = r2.optJSONArray(r0)
            if (r3 == 0) goto L16d
            int r0 = r3.length()
            if (r0 <= 0) goto L16d
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7 = 0
        Lc3:
            int r0 = r3.length()
            if (r7 >= r0) goto L167
            com.bytedance.msdk.core.oq.tl r0 = new com.bytedance.msdk.core.oq.tl     // Catch: java.lang.Throwable -> L140
            r0.<init>()     // Catch: java.lang.Throwable -> L140
            org.json.JSONObject r2 = r3.optJSONObject(r7)     // Catch: java.lang.Throwable -> L140
            r18 = r3
            int r3 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L13b
            r0.xt(r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r3 = r2.optString(r4)     // Catch: java.lang.Throwable -> L13b
            r0.cw(r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r3 = r2.optString(r15)     // Catch: java.lang.Throwable -> L13b
            r0.r(r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r3 = r2.optString(r14)     // Catch: java.lang.Throwable -> L13b
            r0.oq(r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r3 = r2.optString(r6)     // Catch: java.lang.Throwable -> L13b
            r0.up(r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r3 = r2.optString(r13)     // Catch: java.lang.Throwable -> L13b
            r0.ae(r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r3 = r2.optString(r5)     // Catch: java.lang.Throwable -> L13b
            r0.m(r3)     // Catch: java.lang.Throwable -> L13b
            r16 = r4
            r3 = 0
            java.lang.String r4 = r2.optString(r12, r3)     // Catch: java.lang.Throwable -> L138
            r0.tl(r4)     // Catch: java.lang.Throwable -> L138
            java.lang.String r4 = r2.optString(r11, r3)     // Catch: java.lang.Throwable -> L138
            r0.g(r4)     // Catch: java.lang.Throwable -> L138
            java.lang.String r4 = "m_aid"
            java.lang.String r4 = r2.optString(r4, r3)     // Catch: java.lang.Throwable -> L138
            r0.j(r4)     // Catch: java.lang.Throwable -> L138
            java.lang.String r4 = "ad_extra"
            java.lang.String r4 = r2.optString(r4, r3)     // Catch: java.lang.Throwable -> L138
            r0.xt(r4)     // Catch: java.lang.Throwable -> L138
            r4 = 1
            int r2 = r2.optInt(r10, r4)     // Catch: java.lang.Throwable -> L136
            r0.j(r2)     // Catch: java.lang.Throwable -> L136
            r9.add(r0)     // Catch: java.lang.Throwable -> L136
            r2 = r17
            goto L15b
        L136:
            r0 = move-exception
            goto L144
        L138:
            r0 = move-exception
        L139:
            r4 = 1
            goto L144
        L13b:
            r0 = move-exception
        L13c:
            r16 = r4
            r3 = 0
            goto L139
        L140:
            r0 = move-exception
            r18 = r3
            goto L13c
        L144:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "new invalid_non_server_bidding_results winners parse error: "
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = r17
            com.bytedance.msdk.j.up.cw.j(r2, r0)
        L15b:
            int r7 = r7 + 1
            r17 = r2
            r4 = r16
            r3 = r18
            r2 = r20
            goto Lc3
        L167:
            r2 = r17
            r8.j(r9)
            goto L16f
        L16d:
            r2 = r17
        L16f:
            java.lang.String r0 = "auto_detail"
            r3 = r20
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            if (r0 == 0) goto L194
            java.lang.String r4 = "est_price"
            java.lang.String r4 = r0.optString(r4)
            r8.j(r4)
            java.lang.String r4 = "est_price_source"
            int r4 = r0.optInt(r4)
            r8.j(r4)
            java.lang.String r4 = "bidding_ecpm"
            java.lang.String r0 = r0.optString(r4)
            r8.xt(r0)
        L194:
            java.lang.String r0 = "waterfall"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            if (r0 == 0) goto L202
            com.bytedance.msdk.core.oq.ae$j r4 = new com.bytedance.msdk.core.oq.ae$j
            r4.<init>()
            java.lang.String r7 = "version"
            java.lang.String r7 = r0.optString(r7)
            r4.j(r7)
            java.lang.String r7 = "adn_rit_conf"
            org.json.JSONArray r7 = r0.optJSONArray(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r7 == 0) goto L1fc
            int r0 = r7.length()
            if (r0 <= 0) goto L1fc
            r10 = 0
        L1be:
            int r0 = r7.length()
            if (r10 >= r0) goto L1fc
            org.json.JSONObject r0 = r7.optJSONObject(r10)     // Catch: java.lang.Throwable -> L1e3
            com.bytedance.msdk.core.oq.oq r11 = new com.bytedance.msdk.core.oq.oq     // Catch: java.lang.Throwable -> L1e3
            r11.<init>()     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r12 = "adn_name"
            java.lang.String r12 = r0.optString(r12)     // Catch: java.lang.Throwable -> L1e3
            r11.cw(r12)     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r12 = "adn_slot_id"
            java.lang.String r0 = r0.optString(r12)     // Catch: java.lang.Throwable -> L1e3
            r11.up(r0)     // Catch: java.lang.Throwable -> L1e3
            r9.add(r11)     // Catch: java.lang.Throwable -> L1e3
            goto L1f9
        L1e3:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "new waterfallListJson parse error: "
            r11.<init>(r12)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.bytedance.msdk.j.up.cw.j(r2, r0)
        L1f9:
            int r10 = r10 + 1
            goto L1be
        L1fc:
            r4.j(r9)
            r8.j(r4)
        L202:
            java.lang.String r0 = "invalid_non_server_bidding_results"
            org.json.JSONArray r3 = r3.optJSONArray(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto L275
            int r0 = r3.length()
            if (r0 <= 0) goto L275
            r7 = 0
        L216:
            int r0 = r3.length()
            if (r7 >= r0) goto L272
            org.json.JSONObject r0 = r3.optJSONObject(r7)     // Catch: java.lang.Throwable -> L259
            com.bytedance.msdk.core.oq.m r9 = new com.bytedance.msdk.core.oq.m     // Catch: java.lang.Throwable -> L259
            r9.<init>()     // Catch: java.lang.Throwable -> L259
            java.lang.String r10 = r0.optString(r6)     // Catch: java.lang.Throwable -> L259
            r9.j(r10)     // Catch: java.lang.Throwable -> L259
            java.lang.String r10 = r0.optString(r5)     // Catch: java.lang.Throwable -> L259
            r9.xt(r10)     // Catch: java.lang.Throwable -> L259
            int r10 = r0.optInt(r1)     // Catch: java.lang.Throwable -> L259
            r9.j(r10)     // Catch: java.lang.Throwable -> L259
            java.lang.String r10 = "error_code"
            int r10 = r0.optInt(r10)     // Catch: java.lang.Throwable -> L259
            r9.xt(r10)     // Catch: java.lang.Throwable -> L259
            java.lang.String r10 = "error_msg"
            java.lang.String r10 = r0.optString(r10)     // Catch: java.lang.Throwable -> L259
            r9.cw(r10)     // Catch: java.lang.Throwable -> L259
            java.lang.String r10 = "level_tag"
            java.lang.String r0 = r0.optString(r10)     // Catch: java.lang.Throwable -> L259
            r9.r(r0)     // Catch: java.lang.Throwable -> L259
            r4.add(r9)     // Catch: java.lang.Throwable -> L259
            goto L26f
        L259:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "new invalid_non_server_bidding_results parse error: "
            r9.<init>(r10)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.bytedance.msdk.j.up.cw.j(r2, r0)
        L26f:
            int r7 = r7 + 1
            goto L216
        L272:
            r8.xt(r4)
        L275:
            r1 = r19
            r3 = r22
            r1.j(r3, r8)
            r4 = r23
            r5 = r24
            r1.j(r4, r5)
            return
        L284:
            r1 = r19
            r3 = r22
            r4 = r23
            r2 = r7
            java.lang.String r5 = "Server Bidding Request onResponse..data.string is null "
            com.bytedance.msdk.j.up.cw.r(r2, r5)
            java.lang.String r2 = "data.string is null"
            r1.j(r0, r2, r3, r4)
            return
        L296:
            r1 = r19
            r3 = r22
            r4 = r23
            r2 = r7
            java.lang.String r5 = "Server Bidding Request onResponse...data is null"
            com.bytedance.msdk.j.up.cw.r(r2, r5)
            java.lang.String r2 = "data is null"
            r1.j(r0, r2, r3, r4)
            return
    }

    private void j(boolean r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L5
            java.lang.String r3 = "v4Enc_exchange"
            goto L7
        L5:
            java.lang.String r3 = "v2Enc_exchange"
        L7:
            r0 = 1
            java.lang.String r1 = ""
            com.bytedance.msdk.tl.l.j(r3, r0, r4, r1)
            return
    }

    private java.lang.String xt(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.bytedance.msdk.api.r.j.xt.m.j r0 = com.bytedance.msdk.m.xt.j.j(r4)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.String r4 = r0.j()     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            r4 = move-exception
            goto L25
        L15:
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.j.j.r r4 = r0.j(r4)     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L20
            return r1
        L20:
            java.lang.String r4 = r4.xt()     // Catch: java.lang.Throwable -> L13
            return r4
        L25:
            com.bytedance.sdk.component.utils.vl.j(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "GDT SDK 初始化失败。。 e="
            r0.<init>(r2)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "TTMediationSDK_SDK_Init"
            com.bytedance.msdk.j.up.cw.r(r0, r4)
            return r1
    }

    private org.json.JSONObject xt() {
            r3 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r0 = r0.jy()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1e
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Exception -> L1e
            java.lang.String r2 = r2.jy()     // Catch: java.lang.Exception -> L1e
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1e
            return r0
        L1e:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r1
    }

    private org.json.JSONObject xt(com.bytedance.msdk.api.j.xt r6) {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r6.f()     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = "id"
            java.lang.String r3 = r6.v()     // Catch: java.lang.Exception -> L50
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = "adtype"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = "pos"
            int r3 = j(r1)     // Catch: java.lang.Exception -> L50
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = "accepted_size"
            int r3 = r6.ch()     // Catch: java.lang.Exception -> L50
            int r4 = r6.s()     // Catch: java.lang.Exception -> L50
            r5.j(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = "is_support_dpl"
            boolean r3 = r6.l()     // Catch: java.lang.Exception -> L50
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L50
            int r6 = r6.a()     // Catch: java.lang.Exception -> L50
            r2 = 1
            if (r6 > 0) goto L3e
            r6 = 1
        L3e:
            r3 = 3
            if (r6 <= r3) goto L42
            r6 = 3
        L42:
            r3 = 7
            if (r1 == r3) goto L4b
            r3 = 8
            if (r1 != r3) goto L4a
            goto L4b
        L4a:
            r2 = r6
        L4b:
            java.lang.String r6 = "ad_count"
            r0.put(r6, r2)     // Catch: java.lang.Exception -> L50
        L50:
            return r0
    }

    private void xt(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "package_name"
            java.lang.String r1 = com.bytedance.msdk.tl.rn.j()     // Catch: java.lang.Exception -> L1b
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "version_code"
            java.lang.String r1 = com.bytedance.msdk.tl.rn.xt()     // Catch: java.lang.Exception -> L1b
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "version"
            java.lang.String r1 = com.bytedance.msdk.tl.rn.cw()     // Catch: java.lang.Exception -> L1b
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L1b
        L1b:
            return
    }

    public java.lang.String j(java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> r12, android.content.Context r13, com.bytedance.msdk.api.j.xt r14, java.util.List<com.bytedance.msdk.core.oq.oq> r15, com.bytedance.msdk.core.oq.xt r16, int r17, boolean r18, org.json.JSONObject r19) {
            r11 = this;
            if (r13 != 0) goto L5
            java.lang.String r12 = ""
            return r12
        L5:
            r5 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            java.lang.String r12 = r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public void j(java.lang.String r10, com.bytedance.msdk.core.jy.j.InterfaceC0227j r11) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = -1
            java.lang.String r2 = "ServerBiddingHelper"
            if (r0 != 0) goto L8a
            com.bytedance.msdk.core.oq.ae r0 = new com.bytedance.msdk.core.oq.ae     // Catch: java.lang.Throwable -> L5a
            r0.<init>()     // Catch: java.lang.Throwable -> L5a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = "items"
            org.json.JSONArray r10 = r3.optJSONArray(r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "m_meta"
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Throwable -> L5a
            if (r10 == 0) goto L5f
            int r4 = r10.length()     // Catch: java.lang.Throwable -> L5a
            if (r4 <= 0) goto L5f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            r5 = 0
        L2d:
            int r6 = r10.length()     // Catch: java.lang.Throwable -> L5a
            if (r5 >= r6) goto L5c
            org.json.JSONObject r6 = r10.optJSONObject(r5)     // Catch: java.lang.Throwable -> L41
            com.bytedance.msdk.core.oq.tl r6 = r9.j(r6)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L57
            r4.add(r6)     // Catch: java.lang.Throwable -> L41
            goto L57
        L41:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = "new invalid_non_server_bidding_results winners parse error: "
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r7.append(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L5a
            com.bytedance.msdk.j.up.cw.j(r2, r6)     // Catch: java.lang.Throwable -> L5a
        L57:
            int r5 = r5 + 1
            goto L2d
        L5a:
            r10 = move-exception
            goto L66
        L5c:
            r0.j(r4)     // Catch: java.lang.Throwable -> L5a
        L5f:
            r9.j(r0, r3)     // Catch: java.lang.Throwable -> L5a
            r9.j(r11, r0)     // Catch: java.lang.Throwable -> L5a
            return
        L66:
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Server Bidding onResponse throwable ："
            java.lang.String r3 = java.lang.String.valueOf(r10)
            java.lang.String r0 = r0.concat(r3)
            com.bytedance.msdk.j.up.cw.r(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L81
            java.lang.String r10 = com.bytedance.msdk.api.j.j(r1)
        L81:
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            r0.<init>(r1, r10)
            r9.j(r11, r0)
            return
        L8a:
            java.lang.String r10 = "Server Bidding Request onResponse...response is invalid"
            com.bytedance.msdk.j.up.cw.r(r2, r10)
            com.bytedance.msdk.api.j r10 = new com.bytedance.msdk.api.j
            java.lang.String r0 = "response is invalid"
            r10.<init>(r1, r0)
            r9.j(r11, r10)
            return
    }

    public void j(java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> r16, android.content.Context r17, com.bytedance.msdk.api.j.xt r18, java.util.List<com.bytedance.msdk.core.oq.oq> r19, java.util.List<com.bytedance.msdk.xt.cw> r20, com.bytedance.msdk.core.oq.xt r21, int r22, boolean r23, com.bytedance.msdk.core.jy.j.InterfaceC0227j r24) {
            r15 = this;
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            long r11 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.r.xt r0 = com.bytedance.msdk.r.xt.j()
            com.bytedance.sdk.component.g.j r0 = r0.xt()
            com.bytedance.sdk.component.g.xt.up r13 = r0.xt()
            java.lang.String r0 = com.bytedance.msdk.core.cw.cw()
            r13.j(r0)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.tl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L36
            java.lang.String r1 = "X-Tt-Env"
            r13.xt(r1, r0)
            java.lang.String r0 = "x-use-ppe"
            java.lang.String r1 = "1"
            r13.xt(r0, r1)
        L36:
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = com.bytedance.msdk.xt.xt.j
            r13.xt(r0, r1)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.up()
            r14 = r0 ^ 1
            if (r0 != 0) goto L70
            java.lang.String r0 = "x-pglcypher"
            java.lang.String r1 = "4"
            r13.xt(r0, r1)
            r10 = 1
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            java.lang.String r1 = r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "application/octet-stream"
            byte[] r1 = com.bytedance.msdk.tl.rn.xt(r1)
            r13.j(r0, r1)
            goto L89
        L70:
            r10 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            java.lang.String r1 = r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.cw(r1)
        L89:
            com.bytedance.msdk.core.jy.j$1 r0 = new com.bytedance.msdk.core.jy.j$1
            r17 = r15
            r19 = r24
            r16 = r0
            r18 = r9
            r21 = r11
            r20 = r14
            r16.<init>(r17, r18, r19, r20, r21)
            r13.j(r0)
            return
    }
}
