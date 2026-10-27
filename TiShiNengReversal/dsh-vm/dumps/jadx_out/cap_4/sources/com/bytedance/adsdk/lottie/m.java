package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    private android.util.SparseArray<com.bytedance.adsdk.lottie.model.r> ae;
    private com.bytedance.adsdk.lottie.m.r av;
    private int az;
    private java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.lottie.model.layer.tl>> cw;
    private java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> g;
    private java.lang.String i;
    private final com.bytedance.adsdk.lottie.w j;
    private float jy;
    private com.bytedance.adsdk.lottie.m.j kt;

    /* renamed from: m, reason: collision with root package name */
    private java.util.List<com.bytedance.adsdk.lottie.model.m> f1815m;
    private com.bytedance.adsdk.lottie.m.cw mi;
    private android.graphics.Rect oq;
    private float qv;

    /* renamed from: r, reason: collision with root package name */
    private java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> f1816r;
    private android.util.LongSparseArray<com.bytedance.adsdk.lottie.model.layer.tl> tl;
    private java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.model.cw> up;
    private float vl;

    /* renamed from: w, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.m.xt f1817w;
    private boolean ws;
    private final java.util.HashSet<java.lang.String> xt;

    public static class cw {
        public org.json.JSONArray cw;
        public java.lang.String j;
        public int[][] xt;

        public cw() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class j {
        public float ae;
        public java.lang.String cw;
        public java.lang.String j;

        /* renamed from: m, reason: collision with root package name */
        public float f1818m;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f1819r;
        public float tl;
        public float up;
        public java.lang.String xt;

        public j() {
                r1 = this;
                r1.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.up = r0
                r1.f1818m = r0
                r1.ae = r0
                r1.tl = r0
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "area["
                r0.<init>(r1)
                java.lang.String r1 = r3.j
                r0.append(r1)
                java.lang.String r1 = ","
                r0.append(r1)
                java.lang.String r2 = r3.xt
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r3.cw
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r3.f1819r
                r0.append(r2)
                java.lang.String r2 = "]->["
                r0.append(r2)
                float r2 = r3.up
                r0.append(r2)
                r0.append(r1)
                float r2 = r3.f1818m
                r0.append(r2)
                r0.append(r1)
                float r2 = r3.ae
                r0.append(r2)
                r0.append(r1)
                float r1 = r3.tl
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class r {
        public org.json.JSONArray ae;
        public java.lang.String cw;
        public int j;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f1822m;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f1823r;
        public int[] up;
        public java.lang.String xt;

        public r() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class xt {
        public org.json.JSONArray ae;
        public java.util.Map<java.lang.String, java.lang.Object> cw;
        public int j;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f1826m;

        /* renamed from: r, reason: collision with root package name */
        public int f1827r;
        public int up;
        public java.util.Map<java.lang.String, java.lang.Object> xt;

        public xt() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public m() {
            r1 = this;
            r1.<init>()
            com.bytedance.adsdk.lottie.w r0 = new com.bytedance.adsdk.lottie.w
            r0.<init>()
            r1.j = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.xt = r0
            r0 = 0
            r1.az = r0
            java.lang.String r0 = ""
            r1.i = r0
            return
    }

    public float ae() {
            r1 = this;
            float r0 = r1.vl
            return r0
    }

    public java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.model.cw> av() {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.model.cw> r0 = r1.up
            return r0
    }

    public android.util.SparseArray<com.bytedance.adsdk.lottie.model.r> az() {
            r1 = this;
            android.util.SparseArray<com.bytedance.adsdk.lottie.model.r> r0 = r1.ae
            return r0
    }

    public com.bytedance.adsdk.lottie.model.m cw(java.lang.String r5) {
            r4 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.m> r0 = r4.f1815m
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1b
            java.util.List<com.bytedance.adsdk.lottie.model.m> r2 = r4.f1815m
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.model.m r2 = (com.bytedance.adsdk.lottie.model.m) r2
            boolean r3 = r2.j(r5)
            if (r3 == 0) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L7
        L1b:
            r5 = 0
            return r5
    }

    public com.bytedance.adsdk.lottie.w cw() {
            r1 = this;
            com.bytedance.adsdk.lottie.w r0 = r1.j
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> i() {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> r0 = r1.f1816r
            return r0
    }

    public float j(float r3) {
            r2 = this;
            float r0 = r2.qv
            float r1 = r2.vl
            float r3 = com.bytedance.adsdk.lottie.up.tl.j(r0, r1, r3)
            return r3
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public com.bytedance.adsdk.lottie.model.layer.tl j(long r2) {
            r1 = this;
            android.util.LongSparseArray<com.bytedance.adsdk.lottie.model.layer.tl> r0 = r1.tl
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.adsdk.lottie.model.layer.tl r2 = (com.bytedance.adsdk.lottie.model.layer.tl) r2
            return r2
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public void j(int r2) {
            r1 = this;
            int r0 = r1.az
            int r0 = r0 + r2
            r1.az = r0
            return
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public void j(android.graphics.Rect r1, float r2, float r3, float r4, java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> r5, android.util.LongSparseArray<com.bytedance.adsdk.lottie.model.layer.tl> r6, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.lottie.model.layer.tl>> r7, java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> r8, android.util.SparseArray<com.bytedance.adsdk.lottie.model.r> r9, java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.model.cw> r10, java.util.List<com.bytedance.adsdk.lottie.model.m> r11, com.bytedance.adsdk.lottie.m.r r12, java.lang.String r13, com.bytedance.adsdk.lottie.m.xt r14, com.bytedance.adsdk.lottie.m.cw r15, com.bytedance.adsdk.lottie.m.j r16) {
            r0 = this;
            r0.oq = r1
            r0.qv = r2
            r0.vl = r3
            r0.jy = r4
            r0.g = r5
            r0.tl = r6
            r0.cw = r7
            r0.f1816r = r8
            r0.ae = r9
            r0.up = r10
            r0.f1815m = r11
            r0.av = r12
            r0.i = r13
            r0.f1817w = r14
            r0.mi = r15
            r1 = r16
            r0.kt = r1
            return
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public void j(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.up.xt(r2)
            java.util.HashSet<java.lang.String> r0 = r1.xt
            r0.add(r2)
            return
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public void j(boolean r1) {
            r0 = this;
            r0.ws = r1
            return
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public boolean j() {
            r1 = this;
            boolean r0 = r1.ws
            return r0
    }

    public float jy() {
            r1 = this;
            float r0 = r1.jy
            return r0
    }

    public float m() {
            r1 = this;
            float r0 = r1.qv
            return r0
    }

    public com.bytedance.adsdk.lottie.m.j oq() {
            r1 = this;
            com.bytedance.adsdk.lottie.m$j r0 = r1.kt
            return r0
    }

    public com.bytedance.adsdk.lottie.m.cw qv() {
            r1 = this;
            com.bytedance.adsdk.lottie.m$cw r0 = r1.mi
            return r0
    }

    public android.graphics.Rect r() {
            r1 = this;
            android.graphics.Rect r0 = r1.oq
            return r0
    }

    public com.bytedance.adsdk.lottie.m.r tl() {
            r1 = this;
            com.bytedance.adsdk.lottie.m$r r0 = r1.av
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LottieComposition:\n"
            r0.<init>(r1)
            java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> r1 = r4.g
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            com.bytedance.adsdk.lottie.model.layer.tl r2 = (com.bytedance.adsdk.lottie.model.layer.tl) r2
            java.lang.String r3 = "\t"
            java.lang.String r2 = r2.j(r3)
            r0.append(r2)
            goto Ld
        L23:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public float up() {
            r2 = this;
            float r0 = r2.w()
            float r1 = r2.jy
            float r0 = r0 / r1
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r1
            long r0 = (long) r0
            float r0 = (float) r0
            return r0
    }

    public com.bytedance.adsdk.lottie.m.xt vl() {
            r1 = this;
            com.bytedance.adsdk.lottie.m$xt r0 = r1.f1817w
            return r0
    }

    public float w() {
            r2 = this;
            float r0 = r2.vl
            float r1 = r2.qv
            float r0 = r0 - r1
            return r0
    }

    public java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> ws() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> r0 = r1.g
            return r0
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public int xt() {
            r1 = this;
            int r0 = r1.az
            return r0
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> xt(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.lottie.model.layer.tl>> r0 = r1.cw
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public void xt(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.w r0 = r1.j
            r0.j(r2)
            return
    }
}
