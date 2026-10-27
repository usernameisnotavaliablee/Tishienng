package com.bytedance.msdk.tl.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private java.lang.String cw;
    private java.lang.String j;
    private java.lang.String r;
    private long up;
    private java.lang.String xt;

    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.r
            return r0
    }

    public void j(long r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MediationBehaviorDbData{primeRit='"
            r0.<init>(r1)
            java.lang.String r1 = r5.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", adnRit='"
            r0.append(r2)
            java.lang.String r2 = r5.xt
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", adnName='"
            r0.append(r2)
            java.lang.String r2 = r5.cw
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", adAction='"
            r0.append(r2)
            java.lang.String r2 = r5.r
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", timeStamp="
            r0.append(r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r1.<init>(r2)
            java.util.Date r2 = new java.util.Date
            long r3 = r5.up
            r2.<init>(r3)
            java.lang.String r1 = r1.format(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.xt = r1
            return
    }
}
