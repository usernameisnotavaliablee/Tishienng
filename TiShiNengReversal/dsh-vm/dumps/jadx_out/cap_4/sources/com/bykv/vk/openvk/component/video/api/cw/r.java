package com.bykv.vk.openvk.component.video.api.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r implements java.io.Serializable {
    private int ae;
    private long av;
    private java.lang.String az;
    private org.json.JSONObject ch;
    public final java.util.HashMap<java.lang.String, java.lang.Object> cw;
    private int f;
    private int g;
    private boolean i;
    public java.lang.String j;
    private int jy;
    private int kt;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f1679m;
    private int mi;
    private int oq;
    private java.lang.String qv;

    /* renamed from: r, reason: collision with root package name */
    private com.bykv.vk.openvk.component.video.api.cw.cw f1680r;
    private int tj;
    private int tl;
    private com.bykv.vk.openvk.component.video.api.cw.cw up;

    /* renamed from: v, reason: collision with root package name */
    private int f1681v;
    private int vl;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1682w;
    private java.util.List<java.lang.String> ws;

    /* renamed from: x, reason: collision with root package name */
    private int f1683x;
    public int xt;

    public r(java.lang.String r3, com.bykv.vk.openvk.component.video.api.cw.cw r4, com.bykv.vk.openvk.component.video.api.cw.cw r5, int r6, int r7) {
            r2 = this;
            r2.<init>()
            r0 = 204800(0x32000, float:2.86986E-40)
            r2.tl = r0
            r0 = 0
            r2.g = r0
            r2.oq = r0
            r2.mi = r0
            r2.kt = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.cw = r1
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.tj = r1
            r2.f = r1
            r2.f1681v = r1
            r2.f1683x = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r2.ch = r0
            r2.f1679m = r3
            r2.f1680r = r4
            r2.up = r5
            r2.mi = r6
            r2.kt = r7
            return
    }

    public void ae(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public boolean ae() {
            r1 = this;
            boolean r0 = r1.f1682w
            return r0
    }

    public java.lang.String av() {
            r1 = this;
            boolean r0 = r1.ws()
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.up
            java.lang.String r0 = r0.vl()
            return r0
        Ld:
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.f1680r
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.vl()
            return r0
        L16:
            r0 = 0
            return r0
    }

    public float az() {
            r1 = this;
            boolean r0 = r1.ws()
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.up
            float r0 = r0.tl()
            return r0
        Ld:
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.f1680r
            if (r0 == 0) goto L16
            float r0 = r0.tl()
            return r0
        L16:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    public com.bykv.vk.openvk.component.video.api.cw.cw ch() {
            r1 = this;
            boolean r0 = r1.ws()
            if (r0 == 0) goto L9
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.up
            return r0
        L9:
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.f1680r
            if (r0 == 0) goto Le
            return r0
        Le:
            r0 = 0
            return r0
    }

    public int cw() {
            r3 = this;
            org.json.JSONObject r0 = r3.ch
            java.lang.String r1 = "pitaya_code"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public void cw(int r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            r0.az = r1
            return
    }

    public int f() {
            r1 = this;
            int r0 = r1.f1683x
            return r0
    }

    public int g() {
            r1 = this;
            int r0 = r1.jy
            return r0
    }

    public void g(int r1) {
            r0 = this;
            r0.f1683x = r1
            return
    }

    public java.lang.String i() {
            r1 = this;
            boolean r0 = r1.ws()
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.up
            java.lang.String r0 = r0.az()
            return r0
        Ld:
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.f1680r
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.az()
            return r0
        L16:
            r0 = 0
            return r0
    }

    public org.json.JSONObject j() {
            r1 = this;
            org.json.JSONObject r0 = r1.ch
            return r0
    }

    public void j(int r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.av = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.f1679m = r1
            return
    }

    public synchronized void j(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r1.cw     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public void j(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.ws = r1
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.f1682w = r1
            return
    }

    public boolean jy() {
            r1 = this;
            boolean r0 = r1.ws()
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.up
            boolean r0 = r0.v()
            return r0
        Ld:
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.f1680r
            if (r0 == 0) goto L16
            boolean r0 = r0.v()
            return r0
        L16:
            r0 = 1
            return r0
    }

    public int kt() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int m() {
            r1 = this;
            boolean r0 = r1.ws()
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.up
            int r0 = r0.av()
            return r0
        Ld:
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.f1680r
            if (r0 == 0) goto L16
            int r0 = r0.av()
            return r0
        L16:
            r0 = 0
            return r0
    }

    public void m(int r1) {
            r0 = this;
            r0.tj = r1
            return
    }

    public int mi() {
            r1 = this;
            int r0 = r1.tj
            return r0
    }

    public long oq() {
            r2 = this;
            long r0 = r2.av
            return r0
    }

    public boolean qv() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public java.lang.String r() {
            r2 = this;
            org.json.JSONObject r0 = r2.ch
            java.lang.String r1 = "pitaya_msg"
            java.lang.String r0 = r0.optString(r1)
            return r0
    }

    public void r(int r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public int tj() {
            r1 = this;
            int r0 = r1.f1681v
            return r0
    }

    public int tl() {
            r1 = this;
            int r0 = r1.vl
            return r0
    }

    public void tl(int r1) {
            r0 = this;
            r0.f1681v = r1
            return
    }

    public synchronized java.lang.Object up(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r1.cw     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public java.lang.String up() {
            r1 = this;
            java.lang.String r0 = r1.f1679m
            return r0
    }

    public void up(int r1) {
            r0 = this;
            r0.mi = r1
            return
    }

    public com.bykv.vk.openvk.component.video.api.cw.cw v() {
            r1 = this;
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.f1680r
            return r0
    }

    public long vl() {
            r2 = this;
            boolean r0 = r2.ws()
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r2.up
            long r0 = r0.up()
            return r0
        Ld:
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r2.f1680r
            if (r0 == 0) goto L16
            long r0 = r0.up()
            return r0
        L16:
            r0 = 0
            return r0
    }

    public int w() {
            r1 = this;
            int r0 = r1.mi
            return r0
    }

    public boolean ws() {
            r3 = this;
            int r0 = r3.kt
            r1 = 1
            if (r0 != r1) goto L26
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r3.up
            if (r0 == 0) goto L26
            java.lang.String r0 = r0.vl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            int r0 = com.bykv.vk.openvk.component.video.api.cw.up()
            r2 = 2
            if (r0 != r2) goto L21
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L26
            return r1
        L21:
            int r0 = r3.mi
            if (r0 != r1) goto L26
            return r1
        L26:
            r0 = 0
            return r0
    }

    public com.bykv.vk.openvk.component.video.api.cw.cw x() {
            r1 = this;
            com.bykv.vk.openvk.component.video.api.cw.cw r0 = r1.up
            return r0
    }

    public int xt() {
            r3 = this;
            org.json.JSONObject r0 = r3.ch
            java.lang.String r1 = "pitaya_cache_size"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public void xt(int r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }
}
