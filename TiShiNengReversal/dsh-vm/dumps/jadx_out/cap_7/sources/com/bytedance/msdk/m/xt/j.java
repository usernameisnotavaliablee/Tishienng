package com.bytedance.msdk.m.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static java.util.Map<java.lang.String, com.bytedance.msdk.m.j.cw> m;
    private static final com.bytedance.msdk.core.m.j r = null;
    private static java.util.Map<java.lang.String, android.util.Pair<java.lang.Boolean, java.lang.String>> up;
    private boolean ae;
    protected com.bytedance.msdk.core.m.xt cw;
    protected final java.util.concurrent.atomic.AtomicBoolean j;
    private boolean tl;
    protected final java.util.concurrent.atomic.AtomicBoolean xt;






    static {
            com.bytedance.msdk.core.m.j r0 = new com.bytedance.msdk.core.m.j
            r0.<init>()
            com.bytedance.msdk.m.xt.j.r = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.m.xt.j.up = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.m.xt.j.m = r0
            return
    }

    protected j() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.j = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.xt = r0
            return
    }

    private static synchronized com.bytedance.msdk.m.j.cw cw(java.lang.String r4) {
            java.lang.Class<com.bytedance.msdk.m.xt.j> r0 = com.bytedance.msdk.m.xt.j.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return r2
        Lc:
            java.util.Map<java.lang.String, com.bytedance.msdk.m.j.cw> r1 = com.bytedance.msdk.m.xt.j.m     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L37
            com.bytedance.msdk.m.j.cw r1 = (com.bytedance.msdk.m.j.cw) r1     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L18
            monitor-exit(r0)
            return r1
        L18:
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L37
            com.bytedance.msdk.core.oq.j r3 = r3.j(r4)     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L24
            monitor-exit(r0)
            return r2
        L24:
            int r2 = r4.hashCode()     // Catch: java.lang.Throwable -> L37
            switch(r2) {
                case -1128782217: goto Lb9;
                case -995541405: goto Lac;
                case -902468465: goto L9e;
                case -759499589: goto L90;
                case 3432: goto L82;
                case 102199: goto L74;
                case 92668925: goto L66;
                case 93498907: goto L58;
                case 111433589: goto L49;
                case 1126045977: goto L3a;
                case 1630528717: goto L2d;
                default: goto L2b;
            }     // Catch: java.lang.Throwable -> L37
        L2b:
            goto Lc6
        L2d:
            java.lang.String r2 = "pangle_custom"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            goto Lb4
        L37:
            r4 = move-exception
            goto Lcf
        L3a:
            java.lang.String r2 = "mintegral"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.tl r1 = new com.bytedance.msdk.m.j.tl     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        L49:
            java.lang.String r2 = "unity"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.jy r1 = new com.bytedance.msdk.m.j.jy     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        L58:
            java.lang.String r2 = "baidu"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.xt r1 = new com.bytedance.msdk.m.j.xt     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        L66:
            java.lang.String r2 = "admob"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.j r1 = new com.bytedance.msdk.m.j.j     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        L74:
            java.lang.String r2 = "gdt"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.up r1 = new com.bytedance.msdk.m.j.up     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        L82:
            java.lang.String r2 = "ks"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.ae r1 = new com.bytedance.msdk.m.j.ae     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        L90:
            java.lang.String r2 = "xiaomi"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.ws r1 = new com.bytedance.msdk.m.j.ws     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        L9e:
            java.lang.String r2 = "sigmob"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.vl r1 = new com.bytedance.msdk.m.j.vl     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        Lac:
            java.lang.String r2 = "pangle"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
        Lb4:
            com.bytedance.msdk.m.j.oq r1 = com.bytedance.msdk.m.j.oq.g()     // Catch: java.lang.Throwable -> L37
            goto Lc6
        Lb9:
            java.lang.String r2 = "klevin"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lc6
            com.bytedance.msdk.m.j.m r1 = new com.bytedance.msdk.m.j.m     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
        Lc6:
            if (r1 == 0) goto Lcd
            java.util.Map<java.lang.String, com.bytedance.msdk.m.j.cw> r2 = com.bytedance.msdk.m.xt.j.m     // Catch: java.lang.Throwable -> L37
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L37
        Lcd:
            monitor-exit(r0)
            return r1
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
    }

    public static synchronized void cw() {
            java.lang.Class<com.bytedance.msdk.m.xt.j> r0 = com.bytedance.msdk.m.xt.j.class
            monitor-enter(r0)
            com.bytedance.msdk.m.xt.j$1 r1 = new com.bytedance.msdk.m.xt.j$1     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            com.bytedance.msdk.j.up.m.r(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    static /* synthetic */ java.util.Map i() {
            java.util.Map<java.lang.String, android.util.Pair<java.lang.Boolean, java.lang.String>> r0 = com.bytedance.msdk.m.xt.j.up
            return r0
    }

    public static int j() {
            java.util.Map<java.lang.String, android.util.Pair<java.lang.Boolean, java.lang.String>> r0 = com.bytedance.msdk.m.xt.j.up
            int r0 = r0.size()
            return r0
    }

    public static com.bytedance.msdk.api.r.j.xt.m.j j(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            com.bytedance.msdk.core.m.j r0 = com.bytedance.msdk.m.xt.j.r
            com.bytedance.msdk.api.r.j.xt.m.j r1 = r0.j(r1)
            return r1
    }

    public static java.lang.String j(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            com.bytedance.msdk.core.m.j r0 = com.bytedance.msdk.m.xt.j.r
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r2 = r0.j(r1, r2, r3)
            return r2
    }

    public static void j(java.lang.String r1, android.util.Pair<java.lang.Boolean, java.lang.String> r2) {
            java.util.Map<java.lang.String, android.util.Pair<java.lang.Boolean, java.lang.String>> r0 = com.bytedance.msdk.m.xt.j.up
            r0.put(r1, r2)
            return
    }

    public static void jy() {
            java.lang.String r0 = "unity"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    public static com.bytedance.msdk.core.m.j r() {
            com.bytedance.msdk.core.m.j r0 = com.bytedance.msdk.m.xt.j.r
            return r0
    }

    private void w() {
            r1 = this;
            java.lang.String r0 = "gdt"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    public static void ws() {
            java.lang.String r0 = "xiaomi"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    public static com.bytedance.msdk.m.xt.j xt() {
            com.bytedance.msdk.m.xt.j r0 = new com.bytedance.msdk.m.xt.j
            r0.<init>()
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.Object> xt(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            com.bytedance.msdk.core.m.j r0 = com.bytedance.msdk.m.xt.j.r
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            java.util.Map r2 = r0.xt(r1, r2, r3)
            return r2
    }

    public static void xt(java.lang.String r2) {
            java.lang.String r0 = "pangle"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L9
            goto L34
        L9:
            com.bytedance.msdk.m.j.cw r0 = cw(r2)
            if (r0 != 0) goto L10
            goto L34
        L10:
            java.lang.String r1 = "mintegral"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L20
            java.lang.String r1 = "klevin"
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 == 0) goto L35
        L20:
            boolean r2 = com.bytedance.msdk.j.up.m.up()
            if (r2 != 0) goto L35
            boolean r2 = r0.up()
            if (r2 != 0) goto L34
            com.bytedance.msdk.m.xt.j$5 r2 = new com.bytedance.msdk.m.xt.j$5
            r2.<init>(r0)
            com.bytedance.msdk.j.up.m.xt(r2)
        L34:
            return
        L35:
            r0.tl()
            return
    }

    protected void ae() {
            r1 = this;
            java.lang.String r0 = "baidu"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    protected void av() {
            r1 = this;
            boolean r0 = r1.ae
            if (r0 != 0) goto L1e
            boolean r0 = r1.tl
            if (r0 == 0) goto L1e
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.j
            boolean r0 = r0.get()
            if (r0 == 0) goto L1e
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.xt
            boolean r0 = r0.get()
            if (r0 == 0) goto L1e
            com.bytedance.msdk.m.j.j()
            cw()
        L1e:
            return
    }

    protected void az() {
            r1 = this;
            com.bytedance.msdk.m.xt.j$4 r0 = new com.bytedance.msdk.m.xt.j$4
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    protected void cw(android.content.Context r1) {
            r0 = this;
            r0.xt(r1)
            r0.j(r1)
            return
    }

    protected void g() {
            r1 = this;
            java.lang.String r0 = "admob"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    protected void j(android.content.Context r3) {
            r2 = this;
            com.bytedance.msdk.m.xt.j$2 r3 = new com.bytedance.msdk.m.xt.j$2
            r3.<init>(r2)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L17
            r3.run()
            return
        L17:
            com.bytedance.msdk.j.up.m.cw(r3)
            return
    }

    public void j(android.content.Context r2, boolean r3, boolean r4, com.bytedance.msdk.core.m.xt r5) {
            r1 = this;
            r1.cw = r5
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.j
            r0 = 0
            r5.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.xt
            r5.set(r0)
            r1.ae = r3
            r1.tl = r4
            r1.cw(r2)
            return
    }

    protected void m() {
            r1 = this;
            java.lang.String r0 = "mintegral"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    protected void oq() {
            r0 = this;
            r0.w()
            return
    }

    protected void qv() {
            r1 = this;
            java.lang.String r0 = "sigmob"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    protected void tl() {
            r1 = this;
            java.lang.String r0 = "pangle"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    protected void up() {
            r1 = this;
            java.lang.String r0 = "klevin"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    protected void vl() {
            r1 = this;
            java.lang.String r0 = "ks"
            com.bytedance.msdk.m.j.cw r0 = cw(r0)
            if (r0 == 0) goto Lb
            r0.m()
        Lb:
            return
    }

    protected void xt(android.content.Context r2) {
            r1 = this;
            r1.oq()
            com.bytedance.msdk.m.xt.j$3 r0 = new com.bytedance.msdk.m.xt.j$3
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }
}
