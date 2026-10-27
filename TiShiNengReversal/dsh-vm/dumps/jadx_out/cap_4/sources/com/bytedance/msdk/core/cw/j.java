package com.bytedance.msdk.core.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private int ae;
    private double cw;
    private int g;
    private double j;

    /* renamed from: m, reason: collision with root package name */
    private int f2196m;
    private java.lang.String oq;
    private java.lang.String qv;

    /* renamed from: r, reason: collision with root package name */
    private double f2197r;
    private int tl;
    private java.lang.String up;
    private double xt;

    public j(double r2, double r4, double r6, double r8, int r10, java.lang.String r11) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.ae = r0
            r1.tl = r0
            r1.g = r0
            r1.j = r2
            r1.xt = r4
            r1.cw = r6
            r1.f2197r = r8
            r1.up = r11
            r1.f2196m = r10
            return
    }

    private boolean j(double r6, double r8) {
            r5 = this;
            java.lang.String r0 = r5.up
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 1
            r4 = -1
            switch(r1) {
                case 49: goto L3c;
                case 50: goto L31;
                case 51: goto L26;
                case 52: goto L1b;
                case 53: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L46
        L10:
            java.lang.String r1 = "5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19
            goto L46
        L19:
            r4 = 4
            goto L46
        L1b:
            java.lang.String r1 = "4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L46
        L24:
            r4 = 3
            goto L46
        L26:
            java.lang.String r1 = "3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f
            goto L46
        L2f:
            r4 = 2
            goto L46
        L31:
            java.lang.String r1 = "2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            goto L46
        L3a:
            r4 = 1
            goto L46
        L3c:
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            goto L46
        L45:
            r4 = 0
        L46:
            switch(r4) {
                case 0: goto L62;
                case 1: goto L5c;
                case 2: goto L56;
                case 3: goto L50;
                case 4: goto L4a;
                default: goto L49;
            }
        L49:
            return r3
        L4a:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L4f
            return r3
        L4f:
            return r2
        L50:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L55
            return r3
        L55:
            return r2
        L56:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L5b
            return r3
        L5b:
            return r2
        L5c:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L61
            return r3
        L61:
            return r2
        L62:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L67
            return r3
        L67:
            return r2
    }

    private boolean r() {
            r4 = this;
            double r0 = r4.j
            double r2 = r4.cw
            boolean r0 = r4.j(r0, r2)
            return r0
    }

    private boolean up() {
            r4 = this;
            double r0 = r4.xt
            double r2 = r4.f2197r
            boolean r0 = r4.j(r0, r2)
            return r0
    }

    public double cw() {
            r2 = this;
            double r0 = r2.xt
            return r0
    }

    public void cw(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void j(int r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.r()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "adnName = "
            r0.<init>(r1)
            java.lang.String r1 = r3.oq
            r0.append(r1)
            java.lang.String r1 = " adnRit = "
            r0.append(r1)
            java.lang.String r1 = r3.qv
            r0.append(r1)
            java.lang.String r1 = ", send = "
            r0.append(r1)
            int r1 = r3.ae
            r0.append(r1)
            java.lang.String r1 = ", fill = "
            r0.append(r1)
            int r1 = r3.tl
            r0.append(r1)
            java.lang.String r1 = ", show = "
            r0.append(r1)
            int r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = " localSsr = "
            r0.append(r1)
            double r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", serviceSsr = "
            r0.append(r1)
            double r1 = r3.cw
            r0.append(r1)
            java.lang.String r1 = ", localSrr = "
            r0.append(r1)
            double r1 = r3.xt
            r0.append(r1)
            java.lang.String r1 = ", serviceSrr = "
            r0.append(r1)
            double r1 = r3.f2197r
            r0.append(r1)
            java.lang.String r1 = ", opt = "
            r0.append(r1)
            java.lang.String r1 = r3.up
            r0.append(r1)
            java.lang.String r1 = ", condition = "
            r0.append(r1)
            int r1 = r3.f2196m
            r0.append(r1)
            java.lang.String r1 = ", compareBehaviorSsr = "
            r0.append(r1)
            boolean r1 = r3.r()
            r0.append(r1)
            java.lang.String r1 = ", compareBehaviorSrr = "
            r0.append(r1)
            boolean r1 = r3.up()
            r0.append(r1)
            java.lang.String r1 = ", checkBehaviorRule = "
            r0.append(r1)
            boolean r1 = r3.j()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public double xt() {
            r2 = this;
            double r0 = r2.j
            return r0
    }

    public void xt(int r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.qv = r1
            return
    }
}
