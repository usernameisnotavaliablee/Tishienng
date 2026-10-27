package com.bytedance.msdk.core.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.msdk.core.g.j {

    /* renamed from: r, reason: collision with root package name */
    private static volatile com.bytedance.msdk.core.g.xt f2201r;
    protected final java.util.Map<java.lang.String, java.lang.String> cw;

    private xt() {
            r1 = this;
            java.lang.String r0 = "label_v_v_s_3"
            r1.<init>(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cw = r0
            r1.xt()
            return
    }

    public static com.bytedance.msdk.core.g.xt r() {
            com.bytedance.msdk.core.g.xt r0 = com.bytedance.msdk.core.g.xt.f2201r
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.g.xt> r0 = com.bytedance.msdk.core.g.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.core.g.xt r1 = com.bytedance.msdk.core.g.xt.f2201r     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.g.xt r1 = new com.bytedance.msdk.core.g.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.g.xt.f2201r = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.core.g.xt r0 = com.bytedance.msdk.core.g.xt.f2201r
            return r0
    }

    protected void cw(java.lang.String r3, org.json.JSONObject r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r2 = this;
            java.lang.String r0 = "rule_id"
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.hl()
            if (r1 == 0) goto L21
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L13
            goto L21
        L13:
            if (r4 == 0) goto L21
            java.lang.Object r3 = r5.get(r0)     // Catch: org.json.JSONException -> L1d
            r4.putOpt(r0, r3)     // Catch: org.json.JSONException -> L1d
            return
        L1d:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L21:
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected java.util.Map<java.lang.String, java.lang.String> j() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.msdk.core.g.j
    protected org.json.JSONObject j(com.bytedance.msdk.core.oq.cw r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10
            r0.<init>()     // Catch: org.json.JSONException -> L10
            java.lang.String r1 = "label_name"
            java.lang.String r2 = "-1"
            if (r5 == 0) goto L12
            java.lang.String r3 = r5.j()     // Catch: org.json.JSONException -> L10
            goto L13
        L10:
            r5 = move-exception
            goto L33
        L12:
            r3 = r2
        L13:
            r0.putOpt(r1, r3)     // Catch: org.json.JSONException -> L10
            java.lang.String r1 = "label_id"
            if (r5 == 0) goto L23
            int r3 = r5.cw()     // Catch: org.json.JSONException -> L10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L10
            goto L24
        L23:
            r3 = r2
        L24:
            r0.putOpt(r1, r3)     // Catch: org.json.JSONException -> L10
            java.lang.String r1 = "label_version"
            if (r5 == 0) goto L2f
            java.lang.String r2 = r5.r()     // Catch: org.json.JSONException -> L10
        L2f:
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L10
            return r0
        L33:
            com.bytedance.sdk.component.utils.vl.j(r5)
            r5 = 0
            return r5
    }

    protected void j(java.lang.String r8, int r9, double r10) {
            r7 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.hl()
            if (r0 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L11
            goto L19
        L11:
            r2 = 3
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.j(r2, r3, r4, r5)
        L19:
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected void j(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 3
            if (r3 != r0) goto L8
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.cw
            r3.put(r2, r4)
        L8:
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected void j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L34
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "readCacheFromSp-SP_NAME_V3，cpmKey:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = "，type_value_timestamp:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DynamicLabelValueManagerAbs"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            java.lang.String r0 = "cpm_key_"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L34
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.cw
            r0.put(r3, r4)
        L34:
            return
    }

    @Override // com.bytedance.msdk.core.g.j
    protected boolean xt(java.lang.String r8, org.json.JSONObject r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
            r7 = this;
            java.lang.String r0 = "refresh_time"
            java.lang.String r1 = "ecpm"
            java.lang.String r2 = "rule_in_use"
            java.lang.String r3 = "group_type"
            java.lang.String r4 = "rule_id"
            java.lang.String r5 = "user_label_value"
            java.lang.Object r5 = r10.get(r5)     // Catch: org.json.JSONException -> L1f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1f
            r6.<init>()     // Catch: org.json.JSONException -> L1f
            r9.put(r8, r6)     // Catch: org.json.JSONException -> L1f
            java.lang.String r8 = "label_info"
            if (r5 == 0) goto L21
            com.bytedance.msdk.core.oq.cw r5 = (com.bytedance.msdk.core.oq.cw) r5     // Catch: org.json.JSONException -> L1f
            goto L22
        L1f:
            r8 = move-exception
            goto L76
        L21:
            r5 = 0
        L22:
            org.json.JSONObject r9 = r7.j(r5)     // Catch: org.json.JSONException -> L1f
            r6.putOpt(r8, r9)     // Catch: org.json.JSONException -> L1f
            java.lang.String r8 = "ecpm_ttl"
            com.bytedance.msdk.core.ws.cw r9 = com.bytedance.msdk.core.xt.xt()     // Catch: org.json.JSONException -> L1f
            int r9 = r9.b()     // Catch: org.json.JSONException -> L1f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: org.json.JSONException -> L1f
            r6.putOpt(r8, r9)     // Catch: org.json.JSONException -> L1f
            java.lang.Object r8 = r10.get(r4)     // Catch: org.json.JSONException -> L1f
            r6.putOpt(r4, r8)     // Catch: org.json.JSONException -> L1f
            java.lang.Object r8 = r10.get(r3)     // Catch: org.json.JSONException -> L1f
            r6.putOpt(r3, r8)     // Catch: org.json.JSONException -> L1f
            java.lang.Object r8 = r10.get(r2)     // Catch: org.json.JSONException -> L1f
            r6.putOpt(r2, r8)     // Catch: org.json.JSONException -> L1f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1f
            r8.<init>()     // Catch: org.json.JSONException -> L1f
            java.lang.Object r9 = r10.get(r1)     // Catch: org.json.JSONException -> L1f
            r8.putOpt(r1, r9)     // Catch: org.json.JSONException -> L1f
            java.lang.String r9 = "timestamp"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L1f
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: org.json.JSONException -> L1f
            r8.putOpt(r9, r1)     // Catch: org.json.JSONException -> L1f
            java.lang.String r9 = "ecpm_info"
            r6.putOpt(r9, r8)     // Catch: org.json.JSONException -> L1f
            java.lang.Object r8 = r10.get(r0)     // Catch: org.json.JSONException -> L1f
            r6.putOpt(r0, r8)     // Catch: org.json.JSONException -> L1f
            r8 = 1
            return r8
        L76:
            com.bytedance.sdk.component.utils.vl.j(r8)
            r8 = 0
            return r8
    }
}
