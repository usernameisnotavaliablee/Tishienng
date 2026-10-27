package com.bytedance.msdk.core.oq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private org.json.JSONObject ae;
    private int cw;
    private double j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f2232m;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f2233r;
    private int up;
    private double xt;

    private r(double r1, double r3, int r5, java.lang.String r6, int r7, java.lang.String r8, org.json.JSONObject r9) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r3
            r0.cw = r5
            r0.f2233r = r6
            r0.up = r7
            r0.f2232m = r8
            r0.ae = r9
            return
    }

    public static void j(org.json.JSONObject r16, java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.r> r17) {
            r1 = r16
            if (r1 != 0) goto L5
            goto L58
        L5:
            java.lang.String r0 = "prime_rits"
            org.json.JSONArray r2 = r1.optJSONArray(r0)
            if (r2 == 0) goto L58
            r0 = 0
            r3 = 0
        Lf:
            int r0 = r2.length()
            if (r3 >= r0) goto L58
            java.lang.String r10 = r2.optString(r3)     // Catch: java.lang.Exception -> L4f
            com.bytedance.msdk.core.oq.r r4 = new com.bytedance.msdk.core.oq.r     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "upper"
            r5 = 0
            double r7 = r1.optDouble(r0, r5)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "lower"
            double r5 = r1.optDouble(r0, r5)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "type"
            int r9 = r1.optInt(r0)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "js_mode"
            int r11 = r1.optInt(r0)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "rule_id"
            java.lang.String r12 = r1.optString(r0)     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "refresh_time"
            org.json.JSONObject r13 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> L4f
            r14 = r7
            r7 = r5
            r5 = r14
            r4.<init>(r5, r7, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L4f
            r5 = r17
            r5.put(r10, r4)     // Catch: java.lang.Exception -> L4d
            goto L55
        L4d:
            r0 = move-exception
            goto L52
        L4f:
            r0 = move-exception
            r5 = r17
        L52:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L55:
            int r3 = r3 + 1
            goto Lf
        L58:
            return
    }

    public int cw() {
            r1 = this;
            int r0 = r1.up
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.cw
            return r0
    }

    public double j() {
            r2 = this;
            double r0 = r2.j
            return r0
    }

    public int j(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.ae
            if (r0 == 0) goto L9
            int r2 = r0.optInt(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.f2232m
            return r0
    }

    public boolean up() {
            r5 = this;
            double r0 = r5.j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L10
            double r0 = r5.xt
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public double xt() {
            r2 = this;
            double r0 = r2.xt
            return r0
    }
}
