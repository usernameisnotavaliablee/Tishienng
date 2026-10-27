package com.bytedance.msdk.core.oq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private boolean a;
    private long ae;
    private int av;
    private int az;
    private int b;
    private com.bytedance.msdk.core.tl.g c;
    private int ch;
    private int cw;
    private int e;
    private int ed;
    private int f;
    private java.util.List<com.bytedance.msdk.core.oq.oq> g;
    private int gq;
    private com.bytedance.msdk.core.tl.ae gx;
    private double h;
    private double hh;
    private long hl;
    private long i;
    private java.lang.String j;
    private double jy;
    private java.lang.String kt;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2237l;
    private int la;

    /* renamed from: m, reason: collision with root package name */
    private long f2238m;
    private java.lang.String mi;

    /* renamed from: n, reason: collision with root package name */
    private int f2239n;
    private org.json.JSONObject nd;
    private int ol;
    private java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> oq;

    /* renamed from: p, reason: collision with root package name */
    private int f2240p;

    /* renamed from: q, reason: collision with root package name */
    private int f2241q;
    private int qb;
    private java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> qv;

    /* renamed from: r, reason: collision with root package name */
    private long f2242r;
    private int rh;
    private int rn;

    /* renamed from: s, reason: collision with root package name */
    private long f2243s;
    private int tj;
    private java.lang.String tl;
    private int uf;
    private long up;

    /* renamed from: v, reason: collision with root package name */
    private int f2244v;
    private java.util.List<java.lang.Integer> vl;

    /* renamed from: w, reason: collision with root package name */
    private int f2245w;
    private int wq;
    private double ws;

    /* renamed from: x, reason: collision with root package name */
    private java.lang.String f2246x;
    private int xt;
    private java.util.Map<java.lang.String, java.lang.Object> ya;

    /* renamed from: z, reason: collision with root package name */
    private double f2247z;

    public xt() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.g = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.oq = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.qv = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.vl = r0
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r2.jy = r0
            r2.ws = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.ol = r0
            r0 = 0
            r2.e = r0
            r1 = 2
            r2.f2241q = r1
            r2.qb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.ya = r0
            return
    }

    public static com.bytedance.msdk.core.oq.xt ae(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r2 = "AdsenseRitConfig"
            java.lang.String r0 = "TMe jsonStr is null or empty"
            com.bytedance.msdk.j.up.cw.j(r2, r0)
            return r1
        Lf:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            r0.<init>(r2)     // Catch: org.json.JSONException -> L1a
            r2 = 1
            com.bytedance.msdk.core.oq.xt r2 = j(r0, r2)     // Catch: org.json.JSONException -> L1a
            return r2
        L1a:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return r1
    }

    private void cw(java.util.List<com.bytedance.msdk.core.oq.oq> r7) {
            r6 = this;
            if (r7 != 0) goto L3
            goto L5a
        L3:
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r0 = r6.qv
            r0.clear()
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r1 = 0
        Lb:
            int r2 = r7.size()
            if (r1 >= r2) goto L5a
            java.lang.Object r2 = r7.get(r1)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 == 0) goto L57
            int r3 = r2.mi()
            if (r3 != 0) goto L29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r2.ch()
            goto L48
        L29:
            int r3 = r2.x()
            if (r3 == r0) goto L39
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r2.x()
            goto L48
        L39:
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r3 = r6.qv
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            r5 = r3
            r3 = r0
            r0 = r5
        L48:
            if (r0 == 0) goto L56
            r0.add(r2)
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r2 = r6.qv
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r0)
        L56:
            r0 = r3
        L57:
            int r1 = r1 + 1
            goto Lb
        L5a:
            return
    }

    private static java.lang.Long f(int r2) {
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            if (r2 == r1) goto L29
            r1 = 2
            if (r2 == r1) goto L29
            r1 = 3
            if (r2 == r1) goto L22
            r1 = 5
            if (r2 == r1) goto L29
            r1 = 7
            if (r2 == r1) goto L1a
            r1 = 8
            if (r2 == r1) goto L1a
            return r0
        L1a:
            r0 = 600000(0x927c0, double:2.964394E-318)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L22:
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L29:
            return r0
    }

    public static com.bytedance.msdk.core.oq.xt j(org.json.JSONObject r27, boolean r28) {
            r0 = r27
            java.lang.String r1 = "adn_name"
            r2 = 0
            if (r0 == 0) goto L4d6
            com.bytedance.msdk.core.oq.xt r3 = new com.bytedance.msdk.core.oq.xt
            r3.<init>()
            r3.j(r0)
            java.lang.String r4 = "bid_floor"
            r5 = 0
            double r4 = r0.optDouble(r4, r5)
            r3.cw(r4)
            java.lang.String r4 = "rit_id"
            java.lang.String r4 = r0.optString(r4)
            r3.r(r4)
            java.lang.String r4 = "version"
            java.lang.String r4 = r0.optString(r4)
            r3.cw(r4)
            java.lang.String r4 = "waterfall_id"
            r5 = -1
            long r4 = r0.optLong(r4, r5)
            r3.cw(r4)
            java.lang.String r4 = "rit_type"
            int r4 = r0.optInt(r4)
            r3.ws(r4)
            java.lang.String r4 = "look_type"
            r5 = 1
            int r4 = r0.optInt(r4, r5)
            r3.az(r4)
            int r4 = r3.wq()
            java.lang.Long r4 = tj(r4)
            long r6 = r4.longValue()
            java.lang.String r4 = "time_min"
            long r6 = r0.optLong(r4, r6)
            r3.r(r6)
            java.lang.String r4 = "layer_time_out"
            r6 = 2000(0x7d0, double:9.88E-321)
            long r8 = r0.optLong(r4, r6)
            r3.up(r8)
            int r4 = r3.wq()
            java.lang.Long r4 = f(r4)
            long r8 = r4.longValue()
            java.lang.String r4 = "total_time_out"
            long r8 = r0.optLong(r4, r8)
            r3.m(r8)
            java.lang.String r4 = "multilevel_time_out"
            long r6 = r0.optLong(r4, r6)
            r3.xt(r6)
            java.lang.String r4 = "cache_time_out"
            r6 = 3000(0xbb8, double:1.482E-320)
            long r6 = r0.optLong(r4, r6)
            r3.ae(r6)
            java.lang.String r4 = "req_type"
            r6 = 0
            int r4 = r0.optInt(r4, r6)
            r3.vl(r4)
            com.bytedance.msdk.core.up.xt.r r4 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.String r7 = r3.rn()
            int r8 = r3.tj()
            r4.j(r7, r8)
            java.lang.String r4 = "segment_id"
            int r4 = r0.optInt(r4)
            r3.jy(r4)
            java.lang.String r4 = "segment_version"
            java.lang.String r4 = r0.optString(r4)
            r3.xt(r4)
            java.lang.String r4 = "waterfall_extra"
            java.lang.String r4 = r0.optString(r4)
            r3.j(r4)
            java.lang.String r4 = "multilevel_after_p"
            int r4 = r0.optInt(r4, r5)
            r3.qv(r4)
            java.lang.String r4 = "refresh_time"
            int r4 = r0.optInt(r4, r6)
            r3.oq(r4)
            java.lang.String r4 = "is_refresh"
            int r7 = r0.optInt(r4, r6)
            r3.m(r7)
            java.lang.String r7 = "refresh_num"
            r8 = 2
            int r7 = r0.optInt(r7, r8)
            r3.ae(r7)
            java.lang.String r7 = "parallel_type"
            int r7 = r0.optInt(r7, r5)
            r3.w(r7)
            java.lang.String r7 = "is_adprime"
            int r7 = r0.optInt(r7, r6)
            r3.r(r7)
            java.lang.String r7 = "req_parallel_num"
            int r7 = r0.optInt(r7, r8)
            r3.mi(r7)
            java.lang.String r7 = "reward_start_time"
            r9 = 15000(0x3a98, float:2.102E-41)
            int r7 = r0.optInt(r7, r9)
            r3.av(r7)
            java.lang.String r7 = "reward_callback_type"
            int r7 = r0.optInt(r7)
            r3.i(r7)
            java.lang.String r7 = "req_interval"
            r9 = 1000(0x3e8, double:4.94E-321)
            long r9 = r0.optLong(r7, r9)
            r3.j(r9)
            java.lang.String r7 = "total_time_rate"
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r9 = r0.optDouble(r7, r9)
            r3.xt(r9)
            java.lang.String r7 = "layer_time_rate"
            r9 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r9 = r0.optDouble(r7, r9)
            r3.j(r9)
            java.lang.String r7 = "support_render_control"
            int r7 = r0.optInt(r7, r6)
            r3.j(r7)
            java.lang.String r7 = "behavior_ttl"
            int r7 = r0.optInt(r7)
            r3.kt(r7)
            java.lang.String r7 = "ad_count"
            int r7 = r0.optInt(r7, r6)
            r9 = 3
            if (r7 >= 0) goto L15f
            r7 = 0
            goto L162
        L15f:
            if (r7 <= r9) goto L162
            r7 = 3
        L162:
            r3.tl(r7)
            java.lang.String r7 = "group_type"
            int r7 = r0.optInt(r7)
            r3.xt(r7)
            java.lang.String r7 = "bidding_time_out"
            r10 = 1000(0x3e8, float:1.401E-42)
            int r7 = r0.optInt(r7, r10)
            r3.cw(r7)
            java.lang.String r7 = "waterfall_abtest"
            java.lang.String r7 = r0.optString(r7)
            if (r7 == 0) goto L184
            r3.up(r7)
        L184:
            java.lang.String r7 = "waterfall_timing_mode"
            int r15 = r0.optInt(r7)
            r3.up(r15)
            boolean r7 = r3.oq()
            java.lang.String r18 = "[]"
            if (r7 == 0) goto L204
            java.lang.String r7 = "waterfall_show_pacing_rule"
            org.json.JSONObject r7 = r0.optJSONObject(r7)
            java.lang.String r10 = "waterfall_show_rules_version"
            if (r7 == 0) goto L1cf
            com.bytedance.msdk.core.tl.g r11 = new com.bytedance.msdk.core.tl.g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r3.rn()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = r0.optString(r10)
            java.lang.String r14 = "waterfall_show_pacing"
            java.lang.String r16 = r7.optString(r14)
            java.lang.String r14 = "waterfall_show_pacing_rule_id"
            java.lang.String r17 = r7.optString(r14)
            r7 = r10
            r10 = r11
            r11 = r12
            java.lang.String r12 = ""
            java.lang.String r14 = ""
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r3.j(r10)
            goto L1d0
        L1cf:
            r7 = r10
        L1d0:
            java.lang.String r10 = "waterfall_show_freqctl_rules"
            org.json.JSONArray r10 = r0.optJSONArray(r10)
            r11 = r10
            com.bytedance.msdk.core.tl.ae r10 = new com.bytedance.msdk.core.tl.ae
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r3.rn()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = r0.optString(r7)
            if (r11 != 0) goto L1f3
            r16 = r18
        L1f1:
            r11 = r12
            goto L1fa
        L1f3:
            java.lang.String r7 = r11.toString()
            r16 = r7
            goto L1f1
        L1fa:
            java.lang.String r12 = ""
            java.lang.String r14 = ""
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.j(r10)
        L204:
            java.lang.String r7 = "is_ra"
            int r7 = r0.optInt(r7)
            if (r7 != r5) goto L251
            com.bytedance.msdk.core.admanager.reward.rewardagain.j r7 = new com.bytedance.msdk.core.admanager.reward.rewardagain.j
            r7.<init>()
            java.lang.String r10 = "ra_id"
            java.lang.String r10 = r0.optString(r10)
            r7.j(r10)
            java.lang.String r10 = "ra_max"
            int r10 = r0.optInt(r10, r6)
            r7.xt(r10)
            java.lang.String r10 = "ra_ecpm"
            double r10 = r0.optDouble(r10)
            r7.xt(r10)
            java.lang.String r10 = "ra_in"
            r11 = 0
            long r10 = r0.optLong(r10, r11)
            r7.j(r10)
            java.lang.String r10 = "ra_h_max"
            int r10 = r0.optInt(r10, r6)
            r7.j(r10)
            java.lang.String r10 = "ra_ra"
            double r10 = r0.optDouble(r10)
            r7.j(r10)
            java.lang.String r10 = r3.rn()
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw.j(r10, r7)
            goto L258
        L251:
            java.lang.String r7 = r3.rn()
            com.bytedance.msdk.core.admanager.reward.rewardagain.cw.oq(r7)
        L258:
            java.lang.String r7 = "adn_rit_conf"
            org.json.JSONArray r7 = r0.optJSONArray(r7)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r7 == 0) goto L4c5
            r11 = 0
        L266:
            int r0 = r7.length()
            if (r11 >= r0) goto L4c5
            org.json.JSONObject r0 = r7.getJSONObject(r11)     // Catch: org.json.JSONException -> L294
            com.bytedance.msdk.core.oq.oq r12 = new com.bytedance.msdk.core.oq.oq     // Catch: org.json.JSONException -> L294
            r12.<init>()     // Catch: org.json.JSONException -> L294
            java.lang.String r13 = r0.optString(r1)     // Catch: org.json.JSONException -> L294
            r12.cw(r13)     // Catch: org.json.JSONException -> L294
            com.bytedance.msdk.core.ws.cw r13 = com.bytedance.msdk.core.xt.xt()     // Catch: org.json.JSONException -> L294
            java.lang.String r14 = r0.optString(r1)     // Catch: org.json.JSONException -> L294
            boolean r13 = r13.cw(r14)     // Catch: org.json.JSONException -> L294
            if (r13 == 0) goto L299
            java.lang.String r13 = "custom_adn_name"
            java.lang.String r13 = r0.optString(r13)     // Catch: org.json.JSONException -> L294
            r12.r(r13)     // Catch: org.json.JSONException -> L294
            goto L29c
        L294:
            r0 = move-exception
            r16 = r2
            goto L4bc
        L299:
            r12.r(r2)     // Catch: org.json.JSONException -> L294
        L29c:
            java.lang.String r13 = r3.hh()     // Catch: org.json.JSONException -> L294
            r12.ae(r13)     // Catch: org.json.JSONException -> L294
            java.lang.String r13 = "adn_slot_id"
            java.lang.String r13 = r0.optString(r13)     // Catch: org.json.JSONException -> L294
            r12.up(r13)     // Catch: org.json.JSONException -> L294
            if (r28 != 0) goto L2c7
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: org.json.JSONException -> L294
            if (r14 != 0) goto L2c7
            java.lang.String r14 = r3.rn()     // Catch: org.json.JSONException -> L294
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch: org.json.JSONException -> L294
            if (r14 != 0) goto L2c7
            java.util.Map r14 = com.bytedance.msdk.cw.tl.r.xt     // Catch: org.json.JSONException -> L294
            java.lang.String r15 = r3.rn()     // Catch: org.json.JSONException -> L294
            r14.put(r13, r15)     // Catch: org.json.JSONException -> L294
        L2c7:
            int r14 = r0.optInt(r4, r6)     // Catch: org.json.JSONException -> L294
            r12.j(r14)     // Catch: org.json.JSONException -> L294
            java.lang.String r14 = "freqctl_timing_mode"
            int r14 = r0.optInt(r14)     // Catch: org.json.JSONException -> L294
            r12.xt(r14)     // Catch: org.json.JSONException -> L294
            boolean r15 = r12.r()     // Catch: org.json.JSONException -> L294
            if (r15 == 0) goto L358
            java.lang.String r15 = "show_pacing_rule"
            org.json.JSONObject r15 = r0.optJSONObject(r15)     // Catch: org.json.JSONException -> L31a
            if (r15 == 0) goto L31e
            com.bytedance.msdk.core.tl.g r19 = new com.bytedance.msdk.core.tl.g     // Catch: org.json.JSONException -> L31a
            r16 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L316
            r2.<init>()     // Catch: org.json.JSONException -> L316
            java.lang.String r9 = r3.rn()     // Catch: org.json.JSONException -> L316
            r2.append(r9)     // Catch: org.json.JSONException -> L316
            java.lang.String r20 = r2.toString()     // Catch: org.json.JSONException -> L316
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            java.lang.String r2 = "pacing"
            java.lang.String r25 = r15.optString(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "rule_id"
            java.lang.String r26 = r15.optString(r2)     // Catch: org.json.JSONException -> L316
            r21 = r13
            r24 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch: org.json.JSONException -> L316
            r2 = r19
            r12.j(r2)     // Catch: org.json.JSONException -> L316
            goto L324
        L316:
            r0 = move-exception
        L317:
            r9 = 3
            goto L4bc
        L31a:
            r0 = move-exception
            r16 = r2
            goto L317
        L31e:
            r16 = r2
            r21 = r13
            r24 = r14
        L324:
            java.lang.String r2 = "show_freqctl_rules"
            org.json.JSONArray r2 = r0.optJSONArray(r2)     // Catch: org.json.JSONException -> L316
            com.bytedance.msdk.core.tl.ae r19 = new com.bytedance.msdk.core.tl.ae     // Catch: org.json.JSONException -> L316
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L316
            r9.<init>()     // Catch: org.json.JSONException -> L316
            java.lang.String r13 = r3.rn()     // Catch: org.json.JSONException -> L316
            r9.append(r13)     // Catch: org.json.JSONException -> L316
            java.lang.String r20 = r9.toString()     // Catch: org.json.JSONException -> L316
            java.lang.String r22 = ""
            java.lang.String r9 = "show_freqctl_rules_version"
            java.lang.String r23 = r0.optString(r9)     // Catch: org.json.JSONException -> L316
            if (r2 != 0) goto L349
            r25 = r18
            goto L34f
        L349:
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L316
            r25 = r2
        L34f:
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch: org.json.JSONException -> L316
            r2 = r19
            r12.j(r2)     // Catch: org.json.JSONException -> L316
            goto L35a
        L358:
            r16 = r2
        L35a:
            java.lang.String r2 = "req_bidding_type"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L316
            r12.oq(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "slot_cpm"
            java.lang.String r9 = "0"
            java.lang.String r2 = r0.optString(r2, r9)     // Catch: org.json.JSONException -> L316
            r12.m(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "exchange_rate"
            java.lang.String r2 = r0.optString(r2)     // Catch: org.json.JSONException -> L316
            r12.xt(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "load_sort"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L316
            r12.qv(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "show_sort"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L316
            r12.vl(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "ad_expired_time"
            r9 = 1800000(0x1b7740, float:2.522337E-39)
            int r2 = r0.optInt(r2, r9)     // Catch: org.json.JSONException -> L316
            r12.r(r2)     // Catch: org.json.JSONException -> L316
            com.bytedance.msdk.core.up.xt.r r2 = com.bytedance.msdk.core.up.xt.r.j()     // Catch: org.json.JSONException -> L316
            java.lang.String r9 = r3.rn()     // Catch: org.json.JSONException -> L316
            java.lang.String r13 = r12.w()     // Catch: org.json.JSONException -> L316
            int r14 = r12.tl()     // Catch: org.json.JSONException -> L316
            r2.j(r9, r13, r14)     // Catch: org.json.JSONException -> L316
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()     // Catch: org.json.JSONException -> L316
            java.lang.String r9 = r3.rn()     // Catch: org.json.JSONException -> L316
            java.lang.String r13 = r12.w()     // Catch: org.json.JSONException -> L316
            int r14 = r12.tl()     // Catch: org.json.JSONException -> L316
            r2.j(r9, r13, r14)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "if_is_ready"
            int r2 = r0.optInt(r2, r5)     // Catch: org.json.JSONException -> L316
            r12.tl(r2)     // Catch: org.json.JSONException -> L316
            com.bytedance.msdk.core.up.xt.r r2 = com.bytedance.msdk.core.up.xt.r.j()     // Catch: org.json.JSONException -> L316
            java.lang.String r9 = r3.rn()     // Catch: org.json.JSONException -> L316
            java.lang.String r13 = r12.w()     // Catch: org.json.JSONException -> L316
            int r14 = r12.vl()     // Catch: org.json.JSONException -> L316
            r2.xt(r9, r13, r14)     // Catch: org.json.JSONException -> L316
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()     // Catch: org.json.JSONException -> L316
            java.lang.String r9 = r3.rn()     // Catch: org.json.JSONException -> L316
            java.lang.String r13 = r12.w()     // Catch: org.json.JSONException -> L316
            int r14 = r12.vl()     // Catch: org.json.JSONException -> L316
            r2.xt(r9, r13, r14)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "if_reuse_ads"
            int r2 = r0.optInt(r2, r6)     // Catch: org.json.JSONException -> L316
            r12.up(r2)     // Catch: org.json.JSONException -> L316
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()     // Catch: org.json.JSONException -> L316
            java.lang.String r9 = r3.rn()     // Catch: org.json.JSONException -> L316
            java.lang.String r13 = r12.w()     // Catch: org.json.JSONException -> L316
            int r14 = r12.g()     // Catch: org.json.JSONException -> L316
            r2.cw(r9, r13, r14)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "if_pre_request"
            int r2 = r0.optInt(r2, r6)     // Catch: org.json.JSONException -> L316
            r12.ae(r2)     // Catch: org.json.JSONException -> L316
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()     // Catch: org.json.JSONException -> L316
            java.lang.String r9 = r3.rn()     // Catch: org.json.JSONException -> L316
            java.lang.String r13 = r12.w()     // Catch: org.json.JSONException -> L316
            int r14 = r12.qv()     // Catch: org.json.JSONException -> L316
            r2.m(r9, r13, r14)     // Catch: org.json.JSONException -> L316
            int r2 = r3.wq()     // Catch: org.json.JSONException -> L316
            r12.g(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "%1$s%2$sAdapter"
            r12.j(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "origin_type"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L316
            r12.m(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "sub_adtype"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L316
            r12.cw(r2)     // Catch: org.json.JSONException -> L316
            java.lang.String r2 = "multilevel_slot_cpm"
            org.json.JSONObject r2 = r0.optJSONObject(r2)     // Catch: org.json.JSONException -> L316
            java.util.Map r2 = xt(r2)     // Catch: org.json.JSONException -> L316
            r12.j(r2)     // Catch: org.json.JSONException -> L316
            int r2 = r12.mi()     // Catch: org.json.JSONException -> L316
            if (r2 != r5) goto L458
            r3.xt(r5)     // Catch: org.json.JSONException -> L316
        L456:
            r9 = 3
            goto L4af
        L458:
            int r2 = r12.mi()     // Catch: org.json.JSONException -> L316
            if (r2 != r8) goto L462
            r3.j(r5)     // Catch: org.json.JSONException -> L316
            goto L456
        L462:
            int r2 = r12.mi()     // Catch: org.json.JSONException -> L316
            r9 = 3
            if (r2 != r9) goto L46f
            r3.xt(r5)     // Catch: org.json.JSONException -> L46d
            goto L4af
        L46d:
            r0 = move-exception
            goto L4bc
        L46f:
            int r2 = r12.mi()     // Catch: org.json.JSONException -> L46d
            r13 = 100
            if (r2 == r13) goto L4af
            double r13 = r3.v()     // Catch: org.json.JSONException -> L46d
            r19 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r2 == 0) goto L48d
            double r13 = r3.v()     // Catch: org.json.JSONException -> L46d
            double r21 = r12.v()     // Catch: org.json.JSONException -> L46d
            int r2 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r2 >= 0) goto L494
        L48d:
            double r13 = r12.v()     // Catch: org.json.JSONException -> L46d
            r3.r(r13)     // Catch: org.json.JSONException -> L46d
        L494:
            double r13 = r3.x()     // Catch: org.json.JSONException -> L46d
            int r2 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r2 == 0) goto L4a8
            double r13 = r3.x()     // Catch: org.json.JSONException -> L46d
            double r19 = r12.v()     // Catch: org.json.JSONException -> L46d
            int r2 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r2 <= 0) goto L4af
        L4a8:
            double r13 = r12.v()     // Catch: org.json.JSONException -> L46d
            r3.up(r13)     // Catch: org.json.JSONException -> L46d
        L4af:
            java.lang.String r2 = "customer_adapter_json"
            java.lang.String r0 = r0.optString(r2)     // Catch: org.json.JSONException -> L46d
            r12.g(r0)     // Catch: org.json.JSONException -> L46d
            r10.add(r12)     // Catch: org.json.JSONException -> L46d
            goto L4bf
        L4bc:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L4bf:
            int r11 = r11 + 1
            r2 = r16
            goto L266
        L4c5:
            java.util.Collections.sort(r10)
            boolean r0 = r3.qv()
            if (r0 == 0) goto L4d2
            r3.xt(r10)
            goto L4d5
        L4d2:
            r3.j(r10)
        L4d5:
            return r3
        L4d6:
            r16 = r2
            return r16
    }

    private void r(java.util.List<com.bytedance.msdk.core.oq.oq> r7) {
            r6 = this;
            if (r7 != 0) goto L3
            goto L4a
        L3:
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r0 = r6.qv
            r0.clear()
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r1 = 0
        Lb:
            int r2 = r7.size()
            if (r1 >= r2) goto L4a
            java.lang.Object r2 = r7.get(r1)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 == 0) goto L47
            int r3 = r2.x()
            if (r3 == r0) goto L29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r2.x()
            goto L38
        L29:
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r3 = r6.qv
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            r5 = r3
            r3 = r0
            r0 = r5
        L38:
            if (r0 == 0) goto L46
            r0.add(r2)
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r2 = r6.qv
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r0)
        L46:
            r0 = r3
        L47:
            int r1 = r1 + 1
            goto Lb
        L4a:
            return
    }

    private static java.lang.Long tj(int r2) {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            if (r2 == r1) goto L13
            r1 = 2
            if (r2 == r1) goto L12
            r1 = 3
            if (r2 == r1) goto L12
            r1 = 5
            if (r2 == r1) goto L13
        L12:
            return r0
        L13:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    private static java.util.Map<java.lang.String, java.lang.String> xt(org.json.JSONObject r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r6.keys()     // Catch: java.lang.Exception -> L38
            if (r2 != 0) goto L10
            return r0
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L38
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L38
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L38
            java.lang.String r4 = r6.optString(r3)     // Catch: java.lang.Exception -> L38
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L38
            if (r5 != 0) goto L10
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L38
            if (r5 != 0) goto L10
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L38
            goto L10
        L30:
            int r6 = r1.size()
            if (r6 != 0) goto L37
            return r0
        L37:
            return r1
        L38:
            return r0
    }

    public int a() {
            r1 = this;
            int r0 = r1.f2245w
            return r0
    }

    public int ae() {
            r2 = this;
            int r0 = r2.ol
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = java.lang.Math.min(r0, r1)
            if (r0 > 0) goto Lb
            return r1
        Lb:
            return r0
    }

    public void ae(int r1) {
            r0 = this;
            r0.f2241q = r1
            return
    }

    public void ae(long r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public com.bytedance.msdk.core.oq.xt av() {
            r3 = this;
            com.bytedance.msdk.core.oq.xt r0 = new com.bytedance.msdk.core.oq.xt
            r0.<init>()
            java.lang.String r1 = r3.j
            r0.j = r1
            int r1 = r3.xt
            r0.xt = r1
            int r1 = r3.cw
            r0.cw = r1
            long r1 = r3.f2242r
            r0.f2242r = r1
            long r1 = r3.up
            r0.up = r1
            long r1 = r3.f2238m
            r0.f2238m = r1
            long r1 = r3.ae
            r0.ae = r1
            java.lang.String r1 = r3.tl
            r0.tl = r1
            long r1 = r3.i
            r0.i = r1
            int r1 = r3.f2244v
            r0.f2244v = r1
            java.lang.String r1 = r3.kt
            r0.kt = r1
            int r1 = r3.f2245w
            r0.f2245w = r1
            java.lang.String r1 = r3.mi
            r0.mi = r1
            int r1 = r3.tj
            r0.tj = r1
            int r1 = r3.f
            r0.f = r1
            java.lang.String r1 = r3.f2246x
            r0.f2246x = r1
            int r1 = r3.ch
            r0.ch = r1
            long r1 = r3.f2243s
            r0.f2243s = r1
            int r1 = r3.f2240p
            r0.f2240p = r1
            double r1 = r3.h
            r0.h = r1
            int r1 = r3.rn
            r0.rn = r1
            int r1 = r3.wq
            r0.wq = r1
            int r1 = r3.uf
            r0.uf = r1
            int r1 = r3.la
            r0.la = r1
            int r1 = r3.gq
            r0.gq = r1
            int r1 = r3.f2239n
            r0.f2239n = r1
            com.bytedance.msdk.core.tl.ae r1 = r3.gx
            r0.gx = r1
            com.bytedance.msdk.core.tl.g r1 = r3.c
            r0.c = r1
            int r1 = r3.ed
            r0.ed = r1
            boolean r1 = r3.a
            r0.a = r1
            boolean r1 = r3.f2237l
            r0.f2237l = r1
            org.json.JSONObject r1 = r3.nd
            r0.nd = r1
            double r1 = r3.jy
            r0.jy = r1
            int r1 = r3.av
            r0.av = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.bytedance.msdk.core.oq.oq> r2 = r3.g
            r1.<init>(r2)
            r0.g = r1
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r2 = r3.oq
            r1.<init>(r2)
            r0.oq = r1
            int r1 = r3.az
            r0.az = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<java.lang.Integer> r2 = r3.vl
            r1.<init>(r2)
            r0.vl = r1
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.ya
            r1.<init>(r2)
            r0.ya = r1
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r2 = r3.qv
            r1.<init>(r2)
            r0.qv = r1
            int r1 = r3.rh
            r0.rh = r1
            int r1 = r3.ol
            r0.ol = r1
            double r1 = r3.ws
            r0.ws = r1
            long r1 = r3.hl
            r0.hl = r1
            double r1 = r3.hh
            r0.hh = r1
            double r1 = r3.f2247z
            r0.f2247z = r1
            int r1 = r3.e
            r0.e = r1
            int r1 = r3.f2241q
            r0.f2241q = r1
            int r1 = r3.qb
            r0.qb = r1
            return r0
    }

    public void av(int r1) {
            r0 = this;
            r0.la = r1
            return
    }

    public com.bytedance.msdk.core.oq.xt az() {
            r4 = this;
            java.util.List r0 = com.bytedance.msdk.tl.qv.j()
            com.bytedance.msdk.core.oq.xt r1 = new com.bytedance.msdk.core.oq.xt
            r1.<init>()
            java.lang.String r2 = r4.j
            r1.j = r2
            java.lang.String r2 = "mRitId"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.xt
            r1.xt = r2
            java.lang.String r2 = "mRitType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.cw
            r1.cw = r2
            java.lang.String r2 = "mLookType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            long r2 = r4.f2242r
            r1.f2242r = r2
            java.lang.String r2 = "mMinWaitTime"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            long r2 = r4.up
            r1.up = r2
            java.lang.String r2 = "mLayerTimeOut"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            long r2 = r4.f2238m
            r1.f2238m = r2
            java.lang.String r2 = "mTotalTimeOut"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            long r2 = r4.ae
            r1.ae = r2
            java.lang.String r2 = "mCacheTimeOut"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.tl
            r1.tl = r2
            java.lang.String r2 = "mVersion"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            long r2 = r4.i
            r1.i = r2
            java.lang.String r2 = "mWaterFallId"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f2244v
            r1.f2244v = r2
            java.lang.String r2 = "reqType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.kt
            r1.kt = r2
            java.lang.String r2 = "mWaterfallAbTestParam"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f2245w
            r1.f2245w = r2
            java.lang.String r2 = "segmentId"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.mi
            r1.mi = r2
            java.lang.String r2 = "segmentVersion"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.tj
            r1.tj = r2
            java.lang.String r2 = "preLoadSortControl"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f
            r1.f = r2
            java.lang.String r2 = "preShowSortControl"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.f2246x
            r1.f2246x = r2
            java.lang.String r2 = "waterfallExtra"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.ch
            r1.ch = r2
            java.lang.String r2 = "mMultilevelAfterP"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            long r2 = r4.f2243s
            r1.f2243s = r2
            java.lang.String r2 = "mMultilevelTimeOut"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f2240p
            r1.f2240p = r2
            java.lang.String r2 = "mRefreshTime"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            double r2 = r4.h
            r1.h = r2
            java.lang.String r2 = "mBidFloor"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.rn
            r1.rn = r2
            java.lang.String r2 = "mParallelType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.wq
            r1.wq = r2
            java.lang.String r2 = "mReqParallelNum"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.uf
            r1.uf = r2
            java.lang.String r2 = "mAdCount"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.la
            r1.la = r2
            java.lang.String r2 = "serverSideVerifyPreRequestTime"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.gq
            r1.gq = r2
            java.lang.String r2 = "serverSideRewardType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f2239n
            r1.f2239n = r2
            java.lang.String r2 = "mAdPrime"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f2241q
            r1.f2241q = r2
            java.lang.String r2 = "mRefreshNum"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.e
            r1.e = r2
            java.lang.String r2 = "mIsRefresh"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            com.bytedance.msdk.core.tl.ae r2 = r4.gx
            r1.gx = r2
            java.lang.String r2 = "mIntervalFreqctlBean"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            com.bytedance.msdk.core.tl.g r2 = r4.c
            r1.c = r2
            java.lang.String r2 = "mIntervalPacingBean"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.ed
            r1.ed = r2
            java.lang.String r2 = "mWaterFallTimingMode"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            long r2 = r4.hl
            r1.hl = r2
            java.lang.String r2 = "mReqInterval"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            double r2 = r4.hh
            r1.hh = r2
            java.lang.String r2 = "mTotalTimeoutRate"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            double r2 = r4.f2247z
            r1.f2247z = r2
            java.lang.String r2 = "mLayerTimeoutRate"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.ya
            r2.<init>(r3)
            r1.ya = r2
            int r2 = r4.rh
            r1.rh = r2
            int r2 = r4.ol
            r1.ol = r2
            double r2 = r4.ws
            r1.ws = r2
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r3 = r4.qv
            r2.<init>(r3)
            r1.qv = r2
            java.lang.String r2 = "AdsenseRitConfig"
            com.bytedance.msdk.tl.qv.xt(r0, r2)
            int r2 = r4.qb
            r1.qb = r2
            java.lang.String r2 = "mBehaviorTTL"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            return r1
    }

    public void az(int r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public int b() {
            r1 = this;
            int r0 = r1.qb
            return r0
    }

    public long c() {
            r2 = this;
            long r0 = r2.f2238m
            return r0
    }

    public java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> ch() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r1 = r5.oq
            if (r1 == 0) goto L35
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.intValue()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r0.put(r2, r4)
            goto L11
        L35:
            return r0
    }

    public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.av()
            return r0
    }

    public double cw() {
            r2 = this;
            double r0 = r2.hh
            return r0
    }

    public void cw(double r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void cw(int r1) {
            r0 = this;
            r0.ol = r1
            return
    }

    public void cw(long r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public long ed() {
            r2 = this;
            long r0 = r2.up
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.av
            return r0
    }

    public int g(int r3) {
            r2 = this;
            int r0 = r2.m()
            r1 = 2
            if (r0 != r1) goto L18
            java.lang.String r0 = r2.j
            java.util.Map r1 = r2.up()
            int r3 = com.bytedance.msdk.core.g.r.j(r0, r3, r1)
            int r0 = r2.f2240p
            if (r0 == 0) goto L18
            if (r3 == 0) goto L18
            return r3
        L18:
            int r3 = r2.f2240p
            return r3
    }

    public com.bytedance.msdk.core.tl.g g() {
            r1 = this;
            com.bytedance.msdk.core.tl.g r0 = r1.c
            return r0
    }

    public java.util.List<java.lang.Integer> gq() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.vl
            return r0
    }

    public long gx() {
            r2 = this;
            long r0 = r2.ae
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = r1.f2237l
            return r0
    }

    public java.lang.String hh() {
            r1 = this;
            java.lang.String r0 = r1.kt
            return r0
    }

    public int hl() {
            r1 = this;
            int r0 = r1.wq
            return r0
    }

    public int i() {
            r1 = this;
            int r0 = r1.uf
            return r0
    }

    public void i(int r1) {
            r0 = this;
            r0.gq = r1
            return
    }

    public int j() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public void j(double r6) {
            r5 = this;
            r0 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto Lf
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
        Lf:
            r6 = r0
        L10:
            r5.f2247z = r6
            return
    }

    public void j(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void j(long r4) {
            r3 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r4 = r0
        L7:
            r3.hl = r4
            return
    }

    public void j(com.bytedance.msdk.core.tl.ae r1) {
            r0 = this;
            r0.gx = r1
            return
    }

    public void j(com.bytedance.msdk.core.tl.g r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.f2246x = r1
            return
    }

    public void j(java.util.List<com.bytedance.msdk.core.oq.oq> r7) {
            r6 = this;
            r6.r(r7)
            r6.g = r7
            if (r7 != 0) goto L8
            return
        L8:
            r0 = 0
            r6.az = r0
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r1 = r6.oq
            r1.clear()
            java.util.List<java.lang.Integer> r1 = r6.vl
            r1.clear()
            java.util.List<com.bytedance.msdk.core.oq.oq> r1 = r6.g
            int r1 = r1.size()
            r6.av = r1
            r1 = -1000(0xfffffffffffffc18, float:NaN)
        L1f:
            java.util.List<com.bytedance.msdk.core.oq.oq> r2 = r6.g
            int r2 = r2.size()
            if (r0 >= r2) goto L66
            java.lang.Object r2 = r7.get(r0)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 == 0) goto L63
            int r3 = r2.x()
            if (r3 == r1) goto L45
            int r1 = r6.az
            int r1 = r1 + 1
            r6.az = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.x()
            goto L54
        L45:
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r3 = r6.oq
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            r5 = r3
            r3 = r1
            r1 = r5
        L54:
            if (r1 == 0) goto L62
            r1.add(r2)
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r2 = r6.oq
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
        L62:
            r1 = r3
        L63:
            int r0 = r0 + 1
            goto L1f
        L66:
            java.util.List<java.lang.Integer> r7 = r6.vl
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r0 = r6.oq
            java.util.Set r0 = r0.keySet()
            r7.addAll(r0)
            return
    }

    public void j(org.json.JSONObject r1) {
            r0 = this;
            r0.nd = r1
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public int jy() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public void jy(int r1) {
            r0 = this;
            r0.f2245w = r1
            return
    }

    public long kt() {
            r2 = this;
            long r0 = r2.f2243s
            return r0
    }

    public void kt(int r1) {
            r0 = this;
            r0.qb = r1
            return
    }

    public java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.mi
            return r0
    }

    public java.lang.String la() {
            r1 = this;
            java.lang.String r0 = r1.tl
            return r0
    }

    public int m() {
            r1 = this;
            int r0 = r1.rh
            return r0
    }

    public com.bytedance.msdk.core.oq.oq m(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.List<com.bytedance.msdk.core.oq.oq> r0 = r4.g
            if (r0 == 0) goto L30
            int r0 = r0.size()
            if (r0 != 0) goto L13
            goto L30
        L13:
            java.util.List<com.bytedance.msdk.core.oq.oq> r0 = r4.g
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            java.lang.String r3 = r2.w()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L19
            return r2
        L30:
            return r1
    }

    public void m(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void m(long r1) {
            r0 = this;
            r0.f2238m = r1
            return
    }

    public java.lang.String mi() {
            r1 = this;
            java.lang.String r0 = r1.f2246x
            return r0
    }

    public void mi(int r1) {
            r0 = this;
            r0.wq = r1
            return
    }

    public int n() {
            r1 = this;
            int r0 = r1.la
            return r0
    }

    public int nd() {
            r1 = this;
            int r0 = r1.gq
            return r0
    }

    public java.util.List<com.bytedance.msdk.core.oq.oq> ol() {
            r1 = this;
            java.util.List<com.bytedance.msdk.core.oq.oq> r0 = r1.g
            return r0
    }

    public void oq(int r1) {
            r0 = this;
            r0.f2240p = r1
            return
    }

    public boolean oq() {
            r2 = this;
            int r0 = r2.ed
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean p() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public void qv(int r1) {
            r0 = this;
            r0.ch = r1
            return
    }

    public boolean qv() {
            r2 = this;
            int r0 = r2.rn
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public long r() {
            r2 = this;
            long r0 = r2.hl
            return r0
    }

    public void r(double r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    public void r(int r1) {
            r0 = this;
            r0.f2239n = r1
            return
    }

    public void r(long r1) {
            r0 = this;
            r0.f2242r = r1
            return
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> rh() {
            r1 = this;
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r0 = r1.qv
            return r0
    }

    public java.lang.String rn() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public long s() {
            r2 = this;
            long r0 = r2.i
            return r0
    }

    public int tj() {
            r1 = this;
            int r0 = r1.f2244v
            return r0
    }

    public com.bytedance.msdk.core.tl.ae tl() {
            r1 = this;
            com.bytedance.msdk.core.tl.ae r0 = r1.gx
            return r0
    }

    public void tl(int r1) {
            r0 = this;
            r0.uf = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdsenseRitConfig{mRitId='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", mIsSpeed="
            r0.append(r1)
            boolean r1 = r3.qv()
            r0.append(r1)
            java.lang.String r1 = ", mHasServerbidding="
            r0.append(r1)
            boolean r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", mHasClientOrMultiLevel="
            r0.append(r1)
            boolean r1 = r3.f2237l
            r0.append(r1)
            java.lang.String r1 = ", mRitType="
            r0.append(r1)
            int r1 = r3.xt
            r0.append(r1)
            java.lang.String r1 = ", mLookType="
            r0.append(r1)
            int r1 = r3.cw
            r0.append(r1)
            java.lang.String r1 = ", mMinWaitTime="
            r0.append(r1)
            long r1 = r3.f2242r
            r0.append(r1)
            java.lang.String r1 = ", mLayerTimeOut="
            r0.append(r1)
            long r1 = r3.up
            r0.append(r1)
            java.lang.String r1 = ", mTotalTimeOut="
            r0.append(r1)
            long r1 = r3.f2238m
            r0.append(r1)
            java.lang.String r1 = ", mWaterFallConfigList="
            r0.append(r1)
            java.util.List<com.bytedance.msdk.core.oq.oq> r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", mWaterFallConfMap="
            r0.append(r1)
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r1 = r3.oq
            r0.append(r1)
            java.lang.String r1 = ", mLoadSortLevelList="
            r0.append(r1)
            java.util.List<java.lang.Integer> r1 = r3.vl
            r0.append(r1)
            java.lang.String r1 = ", mCurrentCommonAdMaxCpm="
            r0.append(r1)
            double r1 = r3.jy
            r0.append(r1)
            java.lang.String r1 = ", mTotalLoadLevelCount="
            r0.append(r1)
            int r1 = r3.az
            r0.append(r1)
            java.lang.String r1 = ", mTotalWaterFallCount="
            r0.append(r1)
            int r1 = r3.av
            r0.append(r1)
            java.lang.String r1 = ", mWaterfallAbTestParam="
            r0.append(r1)
            java.lang.String r1 = r3.kt
            r0.append(r1)
            java.lang.String r1 = ", mServerSideVerifyPreRequestTime="
            r0.append(r1)
            int r1 = r3.la
            r0.append(r1)
            java.lang.String r1 = ", mServerSideVerifyRewardType="
            r0.append(r1)
            int r1 = r3.gq
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public long uf() {
            r2 = this;
            long r0 = r2.f2242r
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> up() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.ya
            return r0
    }

    public void up(double r1) {
            r0 = this;
            r0.ws = r1
            return
    }

    public void up(int r1) {
            r0 = this;
            r0.ed = r1
            return
    }

    public void up(long r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void up(java.lang.String r1) {
            r0 = this;
            r0.kt = r1
            return
    }

    public double v() {
            r2 = this;
            double r0 = r2.jy
            return r0
    }

    public void vl(int r1) {
            r0 = this;
            r0.f2244v = r1
            return
    }

    public boolean vl() {
            r2 = this;
            int r0 = r2.f2239n
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public double w() {
            r2 = this;
            double r0 = r2.h
            return r0
    }

    public void w(int r1) {
            r0 = this;
            r0.rn = r1
            return
    }

    public int wq() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public int ws() {
            r2 = this;
            int r0 = r2.f2241q
            r1 = 2
            if (r0 >= r1) goto L6
            return r1
        L6:
            return r0
    }

    public void ws(int r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public double x() {
            r2 = this;
            double r0 = r2.ws
            return r0
    }

    public double xt() {
            r2 = this;
            double r0 = r2.f2247z
            return r0
    }

    public void xt(double r6) {
            r5 = this;
            r0 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto Lf
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
        Lf:
            r6 = r0
        L10:
            r5.hh = r6
            return
    }

    public void xt(int r1) {
            r0 = this;
            r0.rh = r1
            return
    }

    public void xt(long r1) {
            r0 = this;
            r0.f2243s = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.mi = r1
            return
    }

    public void xt(java.util.List<com.bytedance.msdk.core.oq.oq> r7) {
            r6 = this;
            r6.cw(r7)
            r6.g = r7
            if (r7 != 0) goto L8
            return
        L8:
            r0 = 0
            r6.az = r0
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r1 = r6.oq
            r1.clear()
            java.util.List<java.lang.Integer> r1 = r6.vl
            r1.clear()
            java.util.List<com.bytedance.msdk.core.oq.oq> r1 = r6.g
            int r1 = r1.size()
            r6.av = r1
            r1 = -1000(0xfffffffffffffc18, float:NaN)
        L1f:
            java.util.List<com.bytedance.msdk.core.oq.oq> r2 = r6.g
            int r2 = r2.size()
            if (r0 >= r2) goto L7c
            java.lang.Object r2 = r7.get(r0)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 == 0) goto L79
            int r3 = r2.mi()
            if (r3 != 0) goto L45
            int r1 = r6.az
            int r1 = r1 + 1
            r6.az = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.ch()
            goto L6a
        L45:
            int r3 = r2.x()
            if (r3 == r1) goto L5b
            int r1 = r6.az
            int r1 = r1 + 1
            r6.az = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.x()
            goto L6a
        L5b:
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r3 = r6.oq
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            r5 = r3
            r3 = r1
            r1 = r5
        L6a:
            if (r1 == 0) goto L78
            r1.add(r2)
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r2 = r6.oq
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
        L78:
            r1 = r3
        L79:
            int r0 = r0 + 1
            goto L1f
        L7c:
            java.util.List<java.lang.Integer> r7 = r6.vl
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r0 = r6.oq
            java.util.Set r0 = r0.keySet()
            r7.addAll(r0)
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.f2237l = r1
            return
    }

    public int z() {
            r1 = this;
            int r0 = r1.rn
            return r0
    }
}
