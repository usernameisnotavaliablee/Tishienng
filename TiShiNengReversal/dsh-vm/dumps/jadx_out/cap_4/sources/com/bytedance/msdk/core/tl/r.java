package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class r {
    protected java.lang.String cw;
    protected java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2260m;

    /* renamed from: r, reason: collision with root package name */
    protected java.lang.String f2261r;
    protected int up;
    protected java.lang.String xt;

    public r(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.cw = r3
            r0.up = r5
            r0.xt = r2
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r1 = r1 ^ 1
            r0.f2260m = r1
            r0.f2261r = r4
            return
    }

    public int ae() {
            r1 = this;
            int r0 = r1.up
            return r0
    }

    public java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.f2260m
            return r0
    }

    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f2261r
            return r0
    }

    public java.lang.String r() {
            r2 = this;
            java.lang.String r0 = r2.xt
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r2.j
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = r2.xt
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean tl() {
            r2 = this;
            int r0 = r2.up
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaseIntervalBean{waterfallId='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", showRulesVersion='"
            r0.append(r2)
            java.lang.String r2 = r3.cw
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", timingMode="
            r0.append(r1)
            int r1 = r3.up
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String up() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }
}
