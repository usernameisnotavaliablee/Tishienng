package com.bykv.vk.openvk.component.video.api.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private java.lang.String ae;
    private int av;
    private int az;
    private long cw;
    private java.lang.String g;
    private int i;
    private int j;
    private int jy;
    private int kt;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f1674m;
    private int mi;
    private java.lang.String oq;
    private double qv;

    /* renamed from: r, reason: collision with root package name */
    private double f1675r;
    private java.lang.String tl;
    private java.lang.String up;
    private int vl;

    /* renamed from: w, reason: collision with root package name */
    private int f1676w;
    private float ws;
    private int xt;

    public cw() {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.ws = r0
            r0 = 0
            r1.az = r0
            r1.av = r0
            r1.i = r0
            r1.f1676w = r0
            r0 = 307200(0x4b000, float:4.30479E-40)
            r1.mi = r0
            r0 = 1
            r1.kt = r0
            return
    }

    public double ae() {
            r2 = this;
            double r0 = r2.qv
            return r0
    }

    public int av() {
            r5 = this;
            int r0 = r5.mi
            if (r0 >= 0) goto L9
            r0 = 307200(0x4b000, float:4.30479E-40)
            r5.mi = r0
        L9:
            int r0 = r5.mi
            long r0 = (long) r0
            long r2 = r5.cw
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            int r0 = (int) r2
            r5.mi = r0
        L15:
            int r0 = r5.mi
            return r0
    }

    public java.lang.String az() {
            r1 = this;
            java.lang.String r0 = r1.oq
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = r1.ae
            java.lang.String r0 = com.bykv.vk.openvk.component.video.api.m.xt.j(r0)
            r1.oq = r0
        L10:
            java.lang.String r0 = r1.oq
            return r0
    }

    public int cw() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public void cw(int r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public boolean f() {
            r2 = this;
            int r0 = r2.f1676w
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.up
            return r0
    }

    public int i() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.vl
            return r0
    }

    public void j(double r1) {
            r0 = this;
            r0.f1675r = r1
            return
    }

    public void j(float r1) {
            r0 = this;
            r0.ws = r1
            return
    }

    public void j(int r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public java.lang.String jy() {
            r1 = this;
            java.lang.String r0 = r1.tl
            return r0
    }

    public int kt() {
            r1 = this;
            int r0 = r1.az
            return r0
    }

    public double m() {
            r2 = this;
            double r0 = r2.f1675r
            return r0
    }

    public void m(int r1) {
            r0 = this;
            r0.f1676w = r1
            return
    }

    public org.json.JSONObject mi() {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "cover_height"
            int r2 = r6.xt()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "cover_url"
            java.lang.String r2 = r6.qv()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "cover_width"
            int r2 = r6.cw()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "endcard"
            java.lang.String r2 = r6.jy()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "file_hash"
            java.lang.String r2 = r6.az()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "resolution"
            java.lang.String r2 = r6.g()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "size"
            long r2 = r6.up()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "video_duration"
            double r2 = r6.m()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "video_url"
            java.lang.String r2 = r6.vl()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "playable_download_url"
            java.lang.String r2 = r6.ws()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "if_playable_loading_show"
            int r2 = r6.kt()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "remove_loading_page_type"
            int r2 = r6.tj()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "fallback_endcard_judge"
            int r2 = r6.j()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "video_preload_size"
            int r2 = r6.av()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "reward_video_cached_type"
            int r2 = r6.i()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "execute_cached_type"
            int r2 = r6.w()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "endcard_render"
            int r2 = r6.r()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "replay_time"
            int r2 = r6.x()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            java.lang.String r1 = "play_speed_ratio"
            float r2 = r6.tl()     // Catch: java.lang.Exception -> Lc4
            double r2 = (double) r2     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
            double r1 = r6.ae()     // Catch: java.lang.Exception -> Lc4
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto Lc4
            java.lang.String r1 = "start"
            double r2 = r6.ae()     // Catch: java.lang.Exception -> Lc4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Lc4
        Lc4:
            return r0
    }

    public int[] oq() {
            r3 = this;
            java.lang.String r0 = r3.up     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "x"
            int r0 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r3.up     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r3.up     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L2c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L2c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L2c
            int[] r0 = new int[]{r1, r0}     // Catch: java.lang.Throwable -> L2c
            return r0
        L2c:
            r0 = move-exception
            java.lang.String r1 = "VideoInfo"
            java.lang.String r2 = "getWidthAndHeight error"
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r2, r0)
            r0 = 0
            return r0
    }

    public java.lang.String qv() {
            r1 = this;
            java.lang.String r0 = r1.f1674m
            return r0
    }

    public int r() {
            r1 = this;
            int r0 = r1.jy
            return r0
    }

    public void r(int r1) {
            r0 = this;
            r0.mi = r1
            return
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public int tj() {
            r1 = this;
            int r0 = r1.av
            return r0
    }

    public float tl() {
            r1 = this;
            float r0 = r1.ws
            return r0
    }

    public long up() {
            r2 = this;
            long r0 = r2.cw
            return r0
    }

    public void up(int r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void up(java.lang.String r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public boolean v() {
            r1 = this;
            int r0 = r1.i
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String vl() {
            r1 = this;
            java.lang.String r0 = r1.ae
            return r0
    }

    public int w() {
            r1 = this;
            int r0 = r1.f1676w
            return r0
    }

    public java.lang.String ws() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public int x() {
            r1 = this;
            int r0 = r1.kt
            return r0
    }

    public int xt() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public void xt(double r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    public void xt(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.f1674m = r1
            return
    }
}
