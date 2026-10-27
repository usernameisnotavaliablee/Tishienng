package com.bytedance.msdk.core.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private int ae;
    private int cw;
    public java.util.List<java.lang.Integer> j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f2198m;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f2199r;
    private java.lang.String up;
    private org.json.JSONObject xt;

    public xt(org.json.JSONObject r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "behavior_state"
            org.json.JSONArray r0 = r5.optJSONArray(r0)
            if (r0 == 0) goto L30
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r4.j = r1
            r1 = 0
        L13:
            int r2 = r0.length()
            if (r1 >= r2) goto L30
            int r2 = r0.getInt(r1)     // Catch: org.json.JSONException -> L29
            java.util.List<java.lang.Integer> r3 = r4.j     // Catch: org.json.JSONException -> L29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L29
            r3.add(r2)     // Catch: org.json.JSONException -> L29
            int r1 = r1 + 1
            goto L13
        L29:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L30:
            java.lang.String r0 = "rule_excs"
            org.json.JSONObject r5 = r5.optJSONObject(r0)
            if (r5 == 0) goto L6e
            java.lang.String r0 = "condition"
            int r1 = r5.optInt(r0)
            r4.ae = r1
            java.lang.String r1 = "perform"
            org.json.JSONObject r5 = r5.optJSONObject(r1)
            r4.xt = r5
            if (r5 == 0) goto L6e
            int r5 = r5.optInt(r0)
            r4.cw = r5
            org.json.JSONObject r5 = r4.xt
            java.lang.String r0 = "opt"
            java.lang.String r5 = r5.optString(r0)
            r4.f2199r = r5
            org.json.JSONObject r5 = r4.xt
            java.lang.String r0 = "rule_id"
            java.lang.String r5 = r5.optString(r0)
            r4.up = r5
            org.json.JSONObject r5 = r4.xt
            java.lang.String r0 = "rule_timestamp"
            java.lang.String r5 = r5.optString(r0)
            r4.f2198m = r5
        L6e:
            return
    }

    public boolean ae() {
            r2 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = r2.f2199r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = "2"
            java.lang.String r1 = r2.f2199r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = "3"
            java.lang.String r1 = r2.f2199r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = "4"
            java.lang.String r1 = r2.f2199r
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = "5"
            java.lang.String r1 = r2.f2199r
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            return r0
        L35:
            r0 = 1
            return r0
    }

    public java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = r1.up
            return r0
    }

    public double j(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L2e
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lf
            goto L2e
        Lf:
            org.json.JSONObject r0 = r4.xt
            if (r0 == 0) goto L2e
            java.lang.String r3 = "prime_rits"
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            if (r0 == 0) goto L2e
            org.json.JSONObject r6 = r0.optJSONObject(r6)
            if (r6 == 0) goto L2e
            java.lang.String r0 = "ssr"
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L2e
            double r5 = r6.optDouble(r5, r1)
            return r5
        L2e:
            return r1
    }

    public int j() {
            r1 = this;
            int r0 = r1.cw
            return r0
    }

    public boolean j(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.j
            if (r0 == 0) goto Ld
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public boolean j(java.lang.String r4) {
            r3 = this;
            org.json.JSONObject r0 = r3.xt
            java.lang.String r1 = "prime_rits"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            r1 = 0
            if (r0 == 0) goto L25
            org.json.JSONObject r4 = r0.optJSONObject(r4)
            if (r4 == 0) goto L25
            java.lang.String r0 = "ssr"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            java.lang.String r2 = "srr"
            org.json.JSONObject r4 = r4.optJSONObject(r2)
            if (r0 != 0) goto L23
            if (r4 == 0) goto L22
            goto L23
        L22:
            return r1
        L23:
            r4 = 1
            return r4
        L25:
            return r1
    }

    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f2199r
            return r0
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.f2198m
            return r0
    }

    public org.json.JSONObject up() {
            r1 = this;
            org.json.JSONObject r0 = r1.xt
            return r0
    }

    public double xt(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L2e
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lf
            goto L2e
        Lf:
            org.json.JSONObject r0 = r4.xt
            if (r0 == 0) goto L2e
            java.lang.String r3 = "prime_rits"
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            if (r0 == 0) goto L2e
            org.json.JSONObject r6 = r0.optJSONObject(r6)
            if (r6 == 0) goto L2e
            java.lang.String r0 = "srr"
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto L2e
            double r5 = r6.optDouble(r5, r1)
            return r5
        L2e:
            return r1
    }

    public int xt() {
            r1 = this;
            int r0 = r1.ae
            return r0
    }
}
