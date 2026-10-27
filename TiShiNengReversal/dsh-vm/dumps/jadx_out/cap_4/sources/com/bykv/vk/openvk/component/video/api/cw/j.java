package com.bykv.vk.openvk.component.video.api.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private double ae;
    private long cw;
    private java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private double f1677m;

    /* renamed from: r, reason: collision with root package name */
    private int f1678r;
    private int tl;
    private long up;
    private java.lang.String xt;

    public j() {
            r3 = this;
            r3.<init>()
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r3.cw = r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f1678r = r2
            r3.up = r0
            r0 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            r3.f1677m = r0
            r3.ae = r0
            return
    }

    public int ae() {
            r1 = this;
            int r0 = r1.tl
            return r0
    }

    public long cw() {
            r2 = this;
            long r0 = r2.cw
            return r0
    }

    public org.json.JSONObject j() {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L15
            r0.<init>()     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = r6.xt     // Catch: java.lang.Exception -> L15
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L15
            if (r1 != 0) goto L17
            java.lang.String r1 = "audio_url"
            java.lang.String r2 = r6.xt     // Catch: java.lang.Exception -> L15
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L69
        L17:
            java.lang.String r1 = r6.j     // Catch: java.lang.Exception -> L15
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L15
            if (r1 != 0) goto L26
            java.lang.String r1 = "file_hash"
            java.lang.String r2 = r6.j     // Catch: java.lang.Exception -> L15
            r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L15
        L26:
            long r1 = r6.cw     // Catch: java.lang.Exception -> L15
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L33
            java.lang.String r5 = "size"
            r0.put(r5, r1)     // Catch: java.lang.Exception -> L15
        L33:
            int r1 = r6.f1678r     // Catch: java.lang.Exception -> L15
            if (r1 < 0) goto L3c
            java.lang.String r2 = "reward_audio_cached_type"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L15
        L3c:
            long r1 = r6.up     // Catch: java.lang.Exception -> L15
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L47
            java.lang.String r3 = "audio_preload_size"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L15
        L47:
            double r1 = r6.f1677m     // Catch: java.lang.Exception -> L15
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L54
            java.lang.String r5 = "audio_duration"
            r0.put(r5, r1)     // Catch: java.lang.Exception -> L15
        L54:
            double r1 = r6.ae     // Catch: java.lang.Exception -> L15
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L5f
            java.lang.String r3 = "start"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L15
        L5f:
            int r1 = r6.tl     // Catch: java.lang.Exception -> L15
            if (r1 <= 0) goto L68
            java.lang.String r2 = "repeat_count"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L15
        L68:
            return r0
        L69:
            r0.getMessage()
            r0 = 0
            return r0
    }

    public void j(double r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(int r1) {
            r0 = this;
            r0.f1678r = r1
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public double m() {
            r2 = this;
            double r0 = r2.f1677m
            return r0
    }

    public double r() {
            r2 = this;
            double r0 = r2.ae
            return r0
    }

    public java.lang.String up() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public void xt(double r1) {
            r0 = this;
            r0.f1677m = r1
            return
    }

    public void xt(int r1) {
            r0 = this;
            if (r1 >= 0) goto L3
            r1 = 0
        L3:
            r0.tl = r1
            return
    }

    public void xt(long r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.xt = r1
            return
    }
}
