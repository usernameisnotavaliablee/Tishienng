package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class l {
    private static final java.util.Map<java.lang.String, com.bytedance.msdk.tl.l> j = null;
    private com.bytedance.sdk.component.r.j.xt xt;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.msdk.tl.l.j = r0
            return
    }

    private l(java.lang.String r2, android.content.Context r3) {
            r1 = this;
            r1.<init>()
            if (r3 != 0) goto L9
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
        L9:
            if (r3 == 0) goto L2f
            com.bytedance.sdk.component.ae.r$j r0 = new com.bytedance.sdk.component.ae.r$j
            r0.<init>()
            com.bytedance.sdk.component.ae.r$j r2 = r0.j(r2)
            com.bytedance.sdk.component.ae.r$j r2 = r2.j(r3)
            r3 = 1
            com.bytedance.sdk.component.ae.r$j r2 = r2.j(r3)
            com.bytedance.msdk.core.j r3 = com.bytedance.msdk.core.j.qv()
            boolean r3 = r3.jy()
            com.bytedance.sdk.component.ae.r$j r2 = r2.j(r3)
            com.bytedance.sdk.component.r.j.xt r2 = r2.j()
            r1.xt = r2
        L2f:
            return
    }

    public static org.json.JSONObject ae(java.lang.String r3) {
            java.lang.String r0 = "evt_upload_info"
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L25
            com.bytedance.msdk.tl.l r1 = j(r0, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r1.xt(r3)     // Catch: java.lang.Throwable -> L25
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L25
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L25
            com.bytedance.msdk.tl.l r0 = j(r0, r2)     // Catch: java.lang.Throwable -> L25
            r0.m(r3)     // Catch: java.lang.Throwable -> L25
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L25
            return r3
        L25:
            r3 = 0
            return r3
    }

    public static void cw(java.lang.String r4, long r5) {
            java.lang.String r0 = "init_time"
            java.lang.String r1 = "evt_upload_info"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L34
            com.bytedance.msdk.tl.l r2 = j(r1, r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r2.xt(r0)     // Catch: java.lang.Throwable -> L34
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L1c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            goto L22
        L1c:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L34
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L34
            r2 = r3
        L22:
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L34
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L34
            com.bytedance.msdk.tl.l r4 = j(r1, r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L34
            r4.j(r0, r5)     // Catch: java.lang.Throwable -> L34
        L34:
            return
    }

    public static com.bytedance.msdk.tl.l j(java.lang.String r2, android.content.Context r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            java.lang.String r2 = "tt_ad_mediation_sdk_sp"
        L8:
            java.util.Map<java.lang.String, com.bytedance.msdk.tl.l> r0 = com.bytedance.msdk.tl.l.j
            java.lang.Object r1 = r0.get(r2)
            com.bytedance.msdk.tl.l r1 = (com.bytedance.msdk.tl.l) r1
            if (r1 != 0) goto L1a
            com.bytedance.msdk.tl.l r1 = new com.bytedance.msdk.tl.l
            r1.<init>(r2, r3)
            r0.put(r2, r1)
        L1a:
            return r1
    }

    public static void j(int r8, int r9) {
            java.lang.String r0 = "force_clean_cnt"
            java.lang.String r1 = "clean_invalid_cnt"
            java.lang.String r2 = "low_m_cnt"
            java.lang.String r3 = "evt_upload_info"
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L52
            com.bytedance.msdk.tl.l r4 = j(r3, r4)     // Catch: java.lang.Throwable -> L52
            r5 = 0
            int r4 = r4.xt(r2, r5)     // Catch: java.lang.Throwable -> L52
            android.content.Context r6 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L52
            com.bytedance.msdk.tl.l r6 = j(r3, r6)     // Catch: java.lang.Throwable -> L52
            int r6 = r6.xt(r1, r5)     // Catch: java.lang.Throwable -> L52
            android.content.Context r7 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L52
            com.bytedance.msdk.tl.l r7 = j(r3, r7)     // Catch: java.lang.Throwable -> L52
            int r5 = r7.xt(r0, r5)     // Catch: java.lang.Throwable -> L52
            int r4 = r4 + 1
            int r6 = r6 + r8
            int r5 = r5 + r9
            android.content.Context r8 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L52
            com.bytedance.msdk.tl.l r8 = j(r3, r8)     // Catch: java.lang.Throwable -> L52
            r8.j(r2, r4)     // Catch: java.lang.Throwable -> L52
            android.content.Context r8 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L52
            com.bytedance.msdk.tl.l r8 = j(r3, r8)     // Catch: java.lang.Throwable -> L52
            r8.j(r1, r6)     // Catch: java.lang.Throwable -> L52
            android.content.Context r8 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L52
            com.bytedance.msdk.tl.l r8 = j(r3, r8)     // Catch: java.lang.Throwable -> L52
            r8.j(r0, r5)     // Catch: java.lang.Throwable -> L52
        L52:
            return
    }

    public static void j(java.lang.String r10, boolean r11, long r12, java.lang.String r14) {
            java.lang.String r0 = "error_code"
            java.lang.String r1 = "fail"
            java.lang.String r2 = "avg_req_duration"
            java.lang.String r3 = "success"
            java.lang.String r4 = "evt_upload_info"
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> La8
            com.bytedance.msdk.tl.l r5 = j(r4, r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = r5.xt(r10)     // Catch: java.lang.Throwable -> La8
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La8
            if (r6 == 0) goto L22
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            r5.<init>()     // Catch: java.lang.Throwable -> La8
            goto L28
        L22:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            r6.<init>(r5)     // Catch: java.lang.Throwable -> La8
            r5 = r6
        L28:
            java.lang.String r6 = "times"
            r7 = 1
            r8 = -1
            if (r11 == 0) goto L66
            org.json.JSONObject r11 = r5.optJSONObject(r3)     // Catch: java.lang.Throwable -> La8
            if (r11 != 0) goto L3c
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            r11.<init>()     // Catch: java.lang.Throwable -> La8
            r5.put(r3, r11)     // Catch: java.lang.Throwable -> La8
        L3c:
            int r14 = r11.optInt(r6, r8)     // Catch: java.lang.Throwable -> La8
            if (r14 != r8) goto L43
            goto L44
        L43:
            int r7 = r7 + r14
        L44:
            r11.put(r6, r7)     // Catch: java.lang.Throwable -> La8
            r0 = 10000(0x2710, double:4.9407E-320)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 > 0) goto L99
            int r14 = r11.optInt(r2, r8)     // Catch: java.lang.Throwable -> La8
            long r0 = (long) r14     // Catch: java.lang.Throwable -> La8
            r8 = -1
            int r14 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L62
        L59:
            int r14 = r7 + (-1)
            long r8 = (long) r14     // Catch: java.lang.Throwable -> La8
            long r0 = r0 * r8
            long r0 = r0 + r12
            long r12 = (long) r7     // Catch: java.lang.Throwable -> La8
            long r12 = r0 / r12
        L62:
            r11.put(r2, r12)     // Catch: java.lang.Throwable -> La8
            goto L99
        L66:
            org.json.JSONObject r11 = r5.optJSONObject(r1)     // Catch: java.lang.Throwable -> La8
            if (r11 != 0) goto L74
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            r11.<init>()     // Catch: java.lang.Throwable -> La8
            r5.put(r1, r11)     // Catch: java.lang.Throwable -> La8
        L74:
            int r12 = r11.optInt(r6, r8)     // Catch: java.lang.Throwable -> La8
            if (r12 != r8) goto L7c
            r12 = 1
            goto L7d
        L7c:
            int r12 = r12 + r7
        L7d:
            r11.put(r6, r12)     // Catch: java.lang.Throwable -> La8
            org.json.JSONObject r12 = r11.optJSONObject(r0)     // Catch: java.lang.Throwable -> La8
            if (r12 != 0) goto L8e
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            r12.<init>()     // Catch: java.lang.Throwable -> La8
            r11.put(r0, r12)     // Catch: java.lang.Throwable -> La8
        L8e:
            int r11 = r12.optInt(r14, r8)     // Catch: java.lang.Throwable -> La8
            if (r11 != r8) goto L95
            goto L96
        L95:
            int r7 = r7 + r11
        L96:
            r12.put(r14, r7)     // Catch: java.lang.Throwable -> La8
        L99:
            android.content.Context r11 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> La8
            com.bytedance.msdk.tl.l r11 = j(r4, r11)     // Catch: java.lang.Throwable -> La8
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> La8
            r11.j(r10, r12)     // Catch: java.lang.Throwable -> La8
        La8:
            return
    }

    public static void j(java.util.Map<java.lang.String, java.lang.Object> r9) {
            java.lang.String r0 = "force_clean_cnt"
            java.lang.String r1 = "clean_invalid_cnt"
            java.lang.String r2 = "low_m_cnt"
            java.lang.String r3 = "evt_upload_info"
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L65
            com.bytedance.msdk.tl.l r4 = j(r3, r4)     // Catch: java.lang.Throwable -> L65
            r5 = 0
            int r4 = r4.xt(r2, r5)     // Catch: java.lang.Throwable -> L65
            android.content.Context r6 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L65
            com.bytedance.msdk.tl.l r6 = j(r3, r6)     // Catch: java.lang.Throwable -> L65
            int r6 = r6.xt(r1, r5)     // Catch: java.lang.Throwable -> L65
            android.content.Context r7 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L65
            com.bytedance.msdk.tl.l r7 = j(r3, r7)     // Catch: java.lang.Throwable -> L65
            int r7 = r7.xt(r0, r5)     // Catch: java.lang.Throwable -> L65
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L65
            r8.<init>()     // Catch: java.lang.Throwable -> L65
            r8.put(r2, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "invalid_cnt"
            r8.put(r4, r6)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "force_cnt"
            r8.put(r4, r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "low_m_clean"
            r9.put(r4, r8)     // Catch: java.lang.Throwable -> L65
            android.content.Context r9 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L65
            com.bytedance.msdk.tl.l r9 = j(r3, r9)     // Catch: java.lang.Throwable -> L65
            r9.j(r2, r5)     // Catch: java.lang.Throwable -> L65
            android.content.Context r9 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L65
            com.bytedance.msdk.tl.l r9 = j(r3, r9)     // Catch: java.lang.Throwable -> L65
            r9.j(r1, r5)     // Catch: java.lang.Throwable -> L65
            android.content.Context r9 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L65
            com.bytedance.msdk.tl.l r9 = j(r3, r9)     // Catch: java.lang.Throwable -> L65
            r9.j(r0, r5)     // Catch: java.lang.Throwable -> L65
        L65:
            return
    }

    public static void j(org.json.JSONObject r5) {
            java.lang.String r0 = "gm_key_v3_bug"
            java.lang.String r1 = "gm_v3_temp"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L41
            com.bytedance.msdk.tl.l r2 = j(r1, r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r2.xt(r0)     // Catch: java.lang.Throwable -> L41
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L1c
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L41
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L41
            goto L21
        L1c:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
        L21:
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L41
            r4 = 100
            if (r2 < r4) goto L2f
            r2 = 99
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L41
            goto L32
        L2f:
            r3.put(r5)     // Catch: java.lang.Throwable -> L41
        L32:
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L41
            com.bytedance.msdk.tl.l r5 = j(r1, r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L41
            r5.j(r0, r1)     // Catch: java.lang.Throwable -> L41
        L41:
            return
    }

    public static void j(boolean r14, int r15, java.lang.String r16, long r17, java.lang.String r19) {
            r0 = r16
            r1 = r19
            java.lang.String r2 = "error_code"
            java.lang.String r3 = "fail"
            java.lang.String r4 = "avg_req_duration"
            java.lang.String r5 = "reason"
            java.lang.String r6 = "upload_size"
            java.lang.String r7 = "success"
            java.lang.String r8 = "evt_upload_info"
            java.lang.String r9 = "v3"
            android.content.Context r10 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> Lda
            com.bytedance.msdk.tl.l r10 = j(r8, r10)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r10 = r10.xt(r9)     // Catch: java.lang.Throwable -> Lda
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lda
            if (r11 == 0) goto L2c
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r10.<init>()     // Catch: java.lang.Throwable -> Lda
            goto L32
        L2c:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lda
            r10 = r11
        L32:
            java.lang.String r11 = "times"
            r12 = 1
            r13 = -1
            if (r14 == 0) goto L98
            org.json.JSONObject r14 = r10.optJSONObject(r7)     // Catch: java.lang.Throwable -> Lda
            if (r14 != 0) goto L46
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r14.<init>()     // Catch: java.lang.Throwable -> Lda
            r10.put(r7, r14)     // Catch: java.lang.Throwable -> Lda
        L46:
            int r1 = r14.optInt(r11, r13)     // Catch: java.lang.Throwable -> Lda
            if (r1 != r13) goto L4e
            r1 = 1
            goto L4f
        L4e:
            int r1 = r1 + r12
        L4f:
            r14.put(r11, r1)     // Catch: java.lang.Throwable -> Lda
            int r2 = r14.optInt(r6, r13)     // Catch: java.lang.Throwable -> Lda
            if (r2 != r13) goto L59
            goto L5a
        L59:
            int r15 = r15 + r2
        L5a:
            r14.put(r6, r15)     // Catch: java.lang.Throwable -> Lda
            org.json.JSONObject r15 = r14.optJSONObject(r5)     // Catch: java.lang.Throwable -> Lda
            if (r15 != 0) goto L6b
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r15.<init>()     // Catch: java.lang.Throwable -> Lda
            r14.put(r5, r15)     // Catch: java.lang.Throwable -> Lda
        L6b:
            int r2 = r15.optInt(r0, r13)     // Catch: java.lang.Throwable -> Lda
            if (r2 != r13) goto L72
            goto L73
        L72:
            int r12 = r12 + r2
        L73:
            r15.put(r0, r12)     // Catch: java.lang.Throwable -> Lda
            r2 = 10000(0x2710, double:4.9407E-320)
            int r15 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r15 > 0) goto Lcb
            int r15 = r14.optInt(r4, r13)     // Catch: java.lang.Throwable -> Lda
            long r2 = (long) r15     // Catch: java.lang.Throwable -> Lda
            r5 = -1
            int r15 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r15 != 0) goto L8a
            r0 = r17
            goto L94
        L8a:
            int r15 = r1 + (-1)
            long r5 = (long) r15     // Catch: java.lang.Throwable -> Lda
            long r2 = r2 * r5
            long r2 = r2 + r17
            long r0 = (long) r1     // Catch: java.lang.Throwable -> Lda
            long r0 = r2 / r0
        L94:
            r14.put(r4, r0)     // Catch: java.lang.Throwable -> Lda
            goto Lcb
        L98:
            org.json.JSONObject r14 = r10.optJSONObject(r3)     // Catch: java.lang.Throwable -> Lda
            if (r14 != 0) goto La6
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r14.<init>()     // Catch: java.lang.Throwable -> Lda
            r10.put(r3, r14)     // Catch: java.lang.Throwable -> Lda
        La6:
            int r15 = r14.optInt(r11, r13)     // Catch: java.lang.Throwable -> Lda
            if (r15 != r13) goto Lae
            r15 = 1
            goto Laf
        Lae:
            int r15 = r15 + r12
        Laf:
            r14.put(r11, r15)     // Catch: java.lang.Throwable -> Lda
            org.json.JSONObject r15 = r14.optJSONObject(r2)     // Catch: java.lang.Throwable -> Lda
            if (r15 != 0) goto Lc0
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r15.<init>()     // Catch: java.lang.Throwable -> Lda
            r14.put(r2, r15)     // Catch: java.lang.Throwable -> Lda
        Lc0:
            int r14 = r15.optInt(r1, r13)     // Catch: java.lang.Throwable -> Lda
            if (r14 != r13) goto Lc7
            goto Lc8
        Lc7:
            int r12 = r12 + r14
        Lc8:
            r15.put(r1, r12)     // Catch: java.lang.Throwable -> Lda
        Lcb:
            android.content.Context r14 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> Lda
            com.bytedance.msdk.tl.l r14 = j(r8, r14)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r15 = r10.toString()     // Catch: java.lang.Throwable -> Lda
            r14.j(r9, r15)     // Catch: java.lang.Throwable -> Lda
        Lda:
            return
    }

    public static org.json.JSONArray r() {
            java.lang.String r0 = "gm_key_v3_bug"
            java.lang.String r1 = "gm_v3_temp"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L27
            com.bytedance.msdk.tl.l r2 = j(r1, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r2.xt(r0)     // Catch: java.lang.Throwable -> L27
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L27
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L27
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L27
            com.bytedance.msdk.tl.l r1 = j(r1, r2)     // Catch: java.lang.Throwable -> L27
            r1.m(r0)     // Catch: java.lang.Throwable -> L27
            return r3
        L27:
            r0 = 0
            return r0
    }

    public static org.json.JSONObject up() {
            java.lang.String r0 = "init_time"
            java.lang.String r1 = "evt_upload_info"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L27
            com.bytedance.msdk.tl.l r2 = j(r1, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r2.xt(r0)     // Catch: java.lang.Throwable -> L27
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L27
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L27
            com.bytedance.msdk.tl.l r1 = j(r1, r3)     // Catch: java.lang.Throwable -> L27
            r1.m(r0)     // Catch: java.lang.Throwable -> L27
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            r0 = 0
            return r0
    }

    public static void xt(java.util.Map<java.lang.String, java.lang.Object> r10) {
            java.lang.String r0 = "gdt"
            java.lang.String r1 = "ks"
            java.lang.String r2 = ""
            java.lang.String r3 = "cb_test"
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r5 = com.bytedance.msdk.j.up.j.j(r4)     // Catch: java.lang.Throwable -> L6c
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L6c
            r6 = 0
            android.content.SharedPreferences r5 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r5, r3, r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r5.getString(r1, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r5.getString(r0, r2)     // Catch: java.lang.Throwable -> L6c
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L6c
            if (r9 == 0) goto L37
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L6c
            if (r9 == 0) goto L37
            android.content.SharedPreferences r5 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r4, r3, r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r5.getString(r1, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r5.getString(r0, r2)     // Catch: java.lang.Throwable -> L6c
        L37:
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L44
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L44
            return
        L44:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r2.<init>()     // Catch: java.lang.Throwable -> L6c
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L52
            r2.put(r1, r7)     // Catch: java.lang.Throwable -> L6c
        L52:
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L5b
            r2.put(r0, r8)     // Catch: java.lang.Throwable -> L6c
        L5b:
            java.lang.String r0 = "cb_stacktrace"
            r10.put(r0, r2)     // Catch: java.lang.Throwable -> L6c
            android.content.SharedPreferences$Editor r10 = r5.edit()     // Catch: java.lang.Throwable -> L6c
            android.content.SharedPreferences$Editor r10 = r10.clear()     // Catch: java.lang.Throwable -> L6c
            r10.apply()     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r10 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r10)
            return
    }

    public int cw(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = -1
            int r2 = r1.xt(r2, r0)
            return r2
    }

    public void cw() {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            r0.j()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public java.lang.String j() {
            r2 = this;
            java.lang.String r0 = "any_door_id"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.xt(r0, r1)
            return r0
    }

    public void j(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "any_door_id"
            r1.j(r0, r2)
            return
    }

    public void j(@androidx.annotation.NonNull java.lang.String r2, float r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            r0.j(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void j(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            r0.j(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void j(@androidx.annotation.NonNull java.lang.String r2, long r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            r0.j(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void j(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            r0.j(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void j(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            r0.j(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void m(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L5
            r0.j(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public long r(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            r0 = -1
            long r0 = r2.xt(r3, r0)
            return r0
    }

    public boolean up(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.xt(r2, r0)
            return r2
    }

    public float xt(@androidx.annotation.NonNull java.lang.String r2, float r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L7
            float r2 = r0.xt(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            return r3
    }

    public int xt(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L7
            int r2 = r0.xt(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            return r3
    }

    public long xt(@androidx.annotation.NonNull java.lang.String r2, long r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L7
            long r2 = r0.xt(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            return r3
    }

    public java.lang.String xt(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.xt(r2, r0)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public java.lang.String xt(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L7
            java.lang.String r2 = r0.xt(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            return r3
    }

    public java.util.Map<java.lang.String, ?> xt() {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L7
            java.util.Map r0 = r0.getAll()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public boolean xt(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            r1 = this;
            com.bytedance.sdk.component.r.j.xt r0 = r1.xt     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0.xt(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            return r3
    }
}
