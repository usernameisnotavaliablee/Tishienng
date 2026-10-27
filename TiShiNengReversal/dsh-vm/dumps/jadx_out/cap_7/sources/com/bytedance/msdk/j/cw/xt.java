package com.bytedance.msdk.j.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String cw() {
            java.lang.String r0 = com.bytedance.sdk.gromore.init.j.cw()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = "0.0"
            return r0
    }

    public static java.lang.String cw(java.util.Map<java.lang.String, java.lang.Object> r2) {
            if (r2 == 0) goto L11
            java.lang.String r0 = "request_id"
            java.lang.Object r1 = r2.get(r0)
            if (r1 == 0) goto L11
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    static org.json.JSONArray cw(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto Lc
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L13
            r1.<init>()     // Catch: java.lang.Exception -> L13
            goto L18
        Lc:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L13
            r0.<init>(r1)     // Catch: java.lang.Exception -> L13
            r1 = r0
            goto L18
        L13:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            r1 = 0
        L18:
            if (r1 != 0) goto L1f
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L1f:
            return r1
    }

    public static double j(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Lc
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            double r0 = (double) r2
            return r0
        Lc:
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L17
            java.lang.Double r2 = (java.lang.Double) r2
            double r0 = r2.doubleValue()
            return r0
        L17:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L22
            java.lang.Double r2 = (java.lang.Double) r2
            double r0 = r2.doubleValue()
            return r0
        L22:
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L31
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L31
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Exception -> L31
            double r0 = r2.doubleValue()     // Catch: java.lang.Exception -> L31
            return r0
        L31:
            r0 = 0
            return r0
    }

    public static long j(java.util.Map<java.lang.String, java.lang.Object> r2) {
            java.lang.String r0 = "creative_id"
            if (r2 == 0) goto L19
            java.lang.Object r1 = r2.get(r0)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L19
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = r2.longValue()     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L19:
            r0 = 0
            return r0
    }

    public static com.bytedance.sdk.openadsdk.i.cw.cw.xt.j j(com.bytedance.msdk.api.j.xt r6, com.bytedance.msdk.cw.m.xt.xt r7, boolean r8) {
            java.lang.String r1 = r7.vl()
            java.lang.String r2 = r7.av()
            java.lang.String r3 = r7.i()
            java.lang.String r4 = r7.ch()
            r0 = r6
            r5 = r8
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r6 = j(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static com.bytedance.sdk.openadsdk.i.cw.cw.xt.j j(com.bytedance.msdk.api.j.xt r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = new com.bytedance.sdk.openadsdk.i.cw.cw.xt$j
            r0.<init>()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r4 = r0.r(r4)
            r0 = 1
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r4 = r4.cw(r0)
            if (r3 == 0) goto Lb1
            int r0 = r3.xt()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r4.m(r0)
            java.lang.String r1 = r3.v()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r0.ae(r1)
            boolean r1 = r3.l()
            r0.xt(r1)
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r3.tj()
            if (r0 == 0) goto L8e
            java.lang.String r1 = r0.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r4.m(r1)
            boolean r2 = r0.up()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.j(r2)
            boolean r2 = r0.s()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.r(r2)
            java.lang.String r2 = r0.j()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.j(r2)
            java.lang.String r2 = r0.xt()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.xt(r2)
            int r2 = r0.az()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.r(r2)
            java.lang.Object r2 = r0.v()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.j(r2)
            java.lang.String r2 = r0.jy()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r1 = r1.up(r2)
            java.lang.String r2 = r0.cw()
            r1.cw(r2)
            java.lang.String r1 = r0.mi()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L81
            r4.ae(r1)
        L81:
            int r1 = r0.w()
            if (r1 == 0) goto L8e
            int r1 = r0.w()
            r4.m(r1)
        L8e:
            int[] r1 = j(r3, r0)
            if (r1 == 0) goto L9a
            int r2 = r1.length
            if (r2 <= 0) goto L9a
            r4.j(r1)
        L9a:
            r1 = 5
            int r2 = r3.f()
            if (r1 == r2) goto La9
            r1 = 9
            int r2 = r3.f()
            if (r1 != r2) goto Lb2
        La9:
            int r3 = r3.a()
            r4.cw(r3)
            goto Lb2
        Lb1:
            r0 = 0
        Lb2:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto Lbb
            r4.tl(r7)
        Lbb:
            j(r4, r5, r6, r8, r0)
            return r4
    }

    public static java.lang.String j() {
            java.lang.String r0 = com.bytedance.msdk.api.r.oq.ae()
            return r0
    }

    public static java.lang.String j(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L5e
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Ld
            goto L5e
        Ld:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L19
            if (r0 != 0) goto L21
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L19 org.json.JSONException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Exception -> L19 org.json.JSONException -> L1b
            goto L26
        L19:
            r6 = move-exception
            goto L5b
        L1b:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L19
            r0.<init>()     // Catch: java.lang.Exception -> L19
            goto L26
        L21:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L19
            r0.<init>()     // Catch: java.lang.Exception -> L19
        L26:
            r1 = 0
        L27:
            int r2 = r0.length()     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "value"
            java.lang.String r4 = "name"
            if (r1 >= r2) goto L48
            org.json.JSONObject r2 = r0.optJSONObject(r1)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L45
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Exception -> L19
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Exception -> L19
            if (r4 == 0) goto L45
            r2.put(r3, r7)     // Catch: java.lang.Exception -> L19
            goto L56
        L45:
            int r1 = r1 + 1
            goto L27
        L48:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L19
            r1.<init>()     // Catch: java.lang.Exception -> L19
            r1.put(r4, r6)     // Catch: java.lang.Exception -> L19
            r1.put(r3, r7)     // Catch: java.lang.Exception -> L19
            r0.put(r1)     // Catch: java.lang.Exception -> L19
        L56:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L19
            return r5
        L5b:
            com.bytedance.sdk.component.utils.vl.j(r6)
        L5e:
            return r5
    }

    public static org.json.JSONArray j(com.bytedance.sdk.openadsdk.mediation.xt.xt.j r7) {
            java.lang.String r0 = j()
            org.json.JSONArray r0 = cw(r0)
            java.util.Map r1 = xt()     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = "name"
            if (r1 == 0) goto L4f
            int r3 = r1.size()     // Catch: java.lang.Exception -> L4d
            if (r3 <= 0) goto L4f
            java.util.Set r3 = r1.keySet()     // Catch: java.lang.Exception -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L4d
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L4d
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L4d
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L4d
            if (r6 != 0) goto L1e
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L4d
            if (r6 != 0) goto L1e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4d
            r6.<init>()     // Catch: java.lang.Exception -> L4d
            r6.putOpt(r2, r4)     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = "value"
            r6.putOpt(r4, r5)     // Catch: java.lang.Exception -> L4d
            r0.put(r6)     // Catch: java.lang.Exception -> L4d
            goto L1e
        L4d:
            r7 = move-exception
            goto L75
        L4f:
            org.json.JSONArray r7 = xt(r7)     // Catch: java.lang.Exception -> L4d
            if (r7 == 0) goto L74
            r1 = 0
        L56:
            int r3 = r7.length()     // Catch: java.lang.Exception -> L4d
            if (r1 >= r3) goto L74
            org.json.JSONObject r3 = r7.optJSONObject(r1)     // Catch: java.lang.Exception -> L4d
            if (r3 == 0) goto L71
            java.lang.String r4 = "personal_ads_type"
            java.lang.String r5 = r3.optString(r2)     // Catch: java.lang.Exception -> L4d
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch: java.lang.Exception -> L4d
            if (r4 != 0) goto L71
            r0.put(r3)     // Catch: java.lang.Exception -> L4d
        L71:
            int r1 = r1 + 1
            goto L56
        L74:
            return r0
        L75:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return r0
    }

    public static void j(com.bytedance.sdk.openadsdk.i.cw.cw.xt.j r6) {
            if (r6 != 0) goto L3
            goto L5b
        L3:
            boolean r0 = com.bytedance.msdk.api.r.oq.g()
            if (r0 != 0) goto La
            goto L5b
        La:
            java.lang.String r0 = "tt_pangle_preview_ad_id"
            java.lang.String r0 = com.bytedance.msdk.api.r.oq.cw(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "tt_pangle_preview_creative_id"
            java.lang.String r1 = com.bytedance.msdk.api.r.oq.cw(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "tt_pangle_preview_ext"
            java.lang.String r2 = com.bytedance.msdk.api.r.oq.cw(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "TTMediationSDK"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "pangle preview adId:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5c
            r4.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = " creativeId:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            r4.append(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = " ext"
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            r4.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5c
            com.bytedance.msdk.j.up.cw.j(r3, r4)     // Catch: java.lang.Throwable -> L5c
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L52
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L52
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)     // Catch: java.lang.Throwable -> L5c
            r0.xt(r1)     // Catch: java.lang.Throwable -> L5c
        L52:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L5b
            r6.cw(r2)     // Catch: java.lang.Throwable -> L5c
        L5b:
            return
        L5c:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
            return
    }

    private static void j(com.bytedance.sdk.openadsdk.i.cw.cw.xt.j r6, java.lang.String r7, java.lang.String r8, boolean r9, com.bytedance.sdk.openadsdk.mediation.xt.xt.j r10) {
            java.lang.String r0 = "value"
            java.lang.String r1 = "name"
            org.json.JSONArray r10 = j(r10)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "mediation_sdk_version"
            r2.putOpt(r1, r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = com.bytedance.msdk.xt.xt.xt()     // Catch: java.lang.Throwable -> L3c
            r2.putOpt(r0, r3)     // Catch: java.lang.Throwable -> L3c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c
            r3.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "mediation_req_type"
            r3.putOpt(r1, r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "1"
            r3.putOpt(r0, r4)     // Catch: java.lang.Throwable -> L3c
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L3e
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c
            r4.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "waterfall_abtest"
            r4.putOpt(r1, r5)     // Catch: java.lang.Throwable -> L3c
            r4.putOpt(r0, r7)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r7 = move-exception
            goto L61
        L3e:
            r4 = 0
        L3f:
            r10.put(r3)     // Catch: java.lang.Throwable -> L3c
            r10.put(r2)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L4a
            r10.put(r4)     // Catch: java.lang.Throwable -> L3c
        L4a:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L64
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c
            r7.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "m_req_id"
            r7.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L3c
            r7.putOpt(r0, r8)     // Catch: java.lang.Throwable -> L3c
            r10.put(r7)     // Catch: java.lang.Throwable -> L3c
            goto L64
        L61:
            com.bytedance.sdk.component.utils.vl.j(r7)
        L64:
            if (r9 != 0) goto L69
            j(r6)
        L69:
            boolean r7 = com.bytedance.msdk.api.r.oq.m()
            com.bytedance.sdk.gromore.init.j.j(r7)
            if (r6 == 0) goto L79
            java.lang.String r7 = r10.toString()
            r6.g(r7)
        L79:
            return
    }

    public static boolean j(com.bytedance.msdk.api.j.xt r2) {
            r0 = 0
            if (r2 == 0) goto L1f
            java.util.Map r1 = r2.c()
            if (r1 != 0) goto La
            goto L1f
        La:
            java.util.Map r2 = r2.c()
            java.lang.String r1 = "banner_native_exp_auto_height"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1f
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1f
            return r2
        L1f:
            return r0
    }

    public static boolean j(java.lang.String r3) {
            java.lang.String r0 = cw()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L1a
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L12
            goto L1a
        L12:
            int r3 = r0.compareTo(r3)
            if (r3 < 0) goto L1a
            r3 = 1
            return r3
        L1a:
            return r2
    }

    private static int[] j(com.bytedance.msdk.api.j.xt r1, com.bytedance.sdk.openadsdk.mediation.xt.xt.j r2) {
            if (r2 == 0) goto L14
            int[] r0 = r2.i()
            if (r0 == 0) goto L14
            int[] r0 = r2.i()
            int r0 = r0.length
            if (r0 <= 0) goto L14
            int[] r1 = r2.i()
            return r1
        L14:
            java.util.Map r1 = r1.c()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L27
            java.lang.String r2 = "pangle_vid"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L23
            int[] r1 = (int[]) r1     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L27:
            r1 = 0
            return r1
    }

    public static long xt(java.util.Map<java.lang.String, java.lang.Object> r2) {
            java.lang.String r0 = "ad_id"
            if (r2 == 0) goto L19
            java.lang.Object r1 = r2.get(r0)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L19
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = r2.longValue()     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L19:
            r0 = 0
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.String> xt() {
            java.util.Map r0 = com.bytedance.msdk.api.r.oq.tl()
            return r0
    }

    private static org.json.JSONArray xt(com.bytedance.sdk.openadsdk.mediation.xt.xt.j r1) {
            if (r1 == 0) goto L1a
            java.lang.String r0 = r1.f()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.f()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L1a:
            r1 = 0
            return r1
    }

    public static void xt(java.lang.String r0) {
            com.bytedance.msdk.api.r.oq.xt(r0)
            return
    }
}
