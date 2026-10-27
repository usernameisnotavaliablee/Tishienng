package com.bytedance.msdk.core.oq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up implements java.lang.Comparable<com.bytedance.msdk.core.oq.up> {
    private int cw;
    private java.lang.String j;

    /* renamed from: r, reason: collision with root package name */
    private int f2236r;
    private double xt;

    public up(java.lang.String r1, double r2, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r4
            r0.f2236r = r5
            return
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.bytedance.msdk.core.oq.up r1) {
            r0 = this;
            com.bytedance.msdk.core.oq.up r1 = (com.bytedance.msdk.core.oq.up) r1
            int r1 = r0.j(r1)
            return r1
    }

    public int cw() {
            r1 = this;
            int r0 = r1.cw
            return r0
    }

    public int j(com.bytedance.msdk.core.oq.up r8) {
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L4
            return r0
        L4:
            double r1 = r7.xt
            double r3 = r8.xt()
            r5 = -1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L10
            return r5
        L10:
            double r1 = r7.xt
            double r3 = r8.xt()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L1b
            return r0
        L1b:
            int r1 = r7.cw
            int r2 = r8.cw()
            if (r1 <= r2) goto L24
            return r0
        L24:
            int r1 = r7.cw
            int r2 = r8.cw()
            if (r1 >= r2) goto L2d
            return r5
        L2d:
            int r1 = r7.f2236r
            int r2 = r8.r()
            if (r1 <= r2) goto L36
            return r0
        L36:
            int r0 = r7.f2236r
            int r8 = r8.r()
            if (r0 >= r8) goto L3f
            return r5
        L3f:
            r8 = 0
            return r8
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public int r() {
            r1 = this;
            int r0 = r1.f2236r
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{mCsjRitId:"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ",mEcpm:"
            r0.append(r1)
            double r1 = r3.xt
            r0.append(r1)
            java.lang.String r1 = ",mLoadSort:"
            r0.append(r1)
            int r1 = r3.cw
            r0.append(r1)
            java.lang.String r1 = ",mShowSort:"
            r0.append(r1)
            int r1 = r3.f2236r
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public double xt() {
            r2 = this;
            double r0 = r2.xt
            return r0
    }
}
