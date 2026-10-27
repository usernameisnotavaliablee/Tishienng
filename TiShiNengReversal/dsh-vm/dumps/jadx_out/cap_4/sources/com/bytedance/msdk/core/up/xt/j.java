package com.bytedance.msdk.core.up.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private int ae;
    private java.lang.String cw;
    private int j;

    /* renamed from: m, reason: collision with root package name */
    private int f2272m;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f2273r;
    private int up;
    private int xt;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cw(int r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public java.lang.String j() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3b
            r0.<init>()     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "reason"
            int r2 = r3.j     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "fill_error_code"
            int r2 = r3.xt     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "fill_error_msg"
            java.lang.String r2 = r3.cw     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "mediation_rit"
            java.lang.String r2 = r3.f2273r     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "load_sort"
            int r2 = r3.up     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "show_sort"
            int r2 = r3.f2272m     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "has_shown"
            int r2 = r3.ae     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L3b
            return r0
        L3b:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            java.lang.String r0 = "{\"name\": \"json err\"}"
            return r0
    }

    public void j(int r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void r(int r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void up(int r1) {
            r0 = this;
            r0.f2272m = r1
            return
    }

    public void xt(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.f2273r = r1
            return
    }
}
