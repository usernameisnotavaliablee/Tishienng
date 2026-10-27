package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private long cw;
    private java.util.List<java.lang.String> j;
    private java.util.List<java.lang.String> xt;

    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<java.lang.String> cw() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.xt
            return r0
    }

    public long j() {
            r2 = this;
            long r0 = r2.cw
            return r0
    }

    public void j(long r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void j(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdnLoadFailShowConfigBean{ breadRequestErrorCode="
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ",ritList="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.xt
            r0.append(r1)
            java.lang.String r1 = ",breadRequestDuration="
            r0.append(r1)
            long r1 = r3.cw
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.List<java.lang.String> xt() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.j
            return r0
    }

    public void xt(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.xt = r1
            return
    }
}
