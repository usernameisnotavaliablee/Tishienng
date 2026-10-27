package com.bytedance.msdk.core.oq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae {
    private java.util.List<com.bytedance.msdk.core.oq.tl> ae;
    private java.lang.String cw;
    private double g;
    private java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private java.util.List<com.bytedance.msdk.core.oq.m> f2219m;
    private int oq;
    private double qv;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.msdk.core.oq.tl f2220r;
    private org.json.JSONObject tl;
    private com.bytedance.msdk.core.oq.ae.j up;
    private java.lang.String xt;

    public static class j {
        private java.lang.String j;
        private java.util.List<com.bytedance.msdk.core.oq.oq> xt;

        public j() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.xt = r0
                return
        }

        static /* synthetic */ java.lang.String j(com.bytedance.msdk.core.oq.ae.j r0) {
                java.lang.String r0 = r0.j
                return r0
        }

        static /* synthetic */ java.util.List xt(com.bytedance.msdk.core.oq.ae.j r0) {
                java.util.List<com.bytedance.msdk.core.oq.oq> r0 = r0.xt
                return r0
        }

        public void j(java.lang.String r1) {
                r0 = this;
                r0.j = r1
                return
        }

        public void j(java.util.List<com.bytedance.msdk.core.oq.oq> r1) {
                r0 = this;
                r0.xt = r1
                return
        }
    }

    public ae() {
            r0 = this;
            r0.<init>()
            return
    }

    public org.json.JSONObject ae() {
            r1 = this;
            org.json.JSONObject r0 = r1.tl
            return r0
    }

    public double cw() {
            r2 = this;
            double r0 = r2.qv
            return r0
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public java.util.List<com.bytedance.msdk.core.oq.oq> g() {
            r1 = this;
            com.bytedance.msdk.core.oq.ae$j r0 = r1.up
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.List r0 = com.bytedance.msdk.core.oq.ae.j.xt(r0)
            return r0
    }

    public double j() {
            r2 = this;
            double r0 = r2.g
            return r0
    }

    public void j(int r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public void j(com.bytedance.msdk.core.oq.ae.j r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void j(com.bytedance.msdk.core.oq.tl r1) {
            r0 = this;
            r0.f2220r = r1
            return
    }

    public void j(java.lang.String r3) {
            r2 = this;
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Throwable -> La
            double r0 = r3.doubleValue()     // Catch: java.lang.Throwable -> La
            r2.g = r0     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void j(java.util.List<com.bytedance.msdk.core.oq.tl> r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(org.json.JSONObject r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    public java.util.List<com.bytedance.msdk.core.oq.tl> r() {
            r1 = this;
            java.util.List<com.bytedance.msdk.core.oq.tl> r0 = r1.ae
            return r0
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public boolean tl() {
            r2 = this;
            com.bytedance.msdk.core.oq.ae$j r0 = r2.up
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = com.bytedance.msdk.core.oq.ae.j.j(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            return r1
    }

    public java.util.List<com.bytedance.msdk.core.oq.m> up() {
            r1 = this;
            java.util.List<com.bytedance.msdk.core.oq.m> r0 = r1.f2219m
            return r0
    }

    public void up(java.lang.String r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public int xt() {
            r1 = this;
            int r0 = r1.oq
            return r0
    }

    public void xt(java.lang.String r3) {
            r2 = this;
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Throwable -> La
            double r0 = r3.doubleValue()     // Catch: java.lang.Throwable -> La
            r2.qv = r0     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void xt(java.util.List<com.bytedance.msdk.core.oq.m> r1) {
            r0 = this;
            r0.f2219m = r1
            return
    }
}
