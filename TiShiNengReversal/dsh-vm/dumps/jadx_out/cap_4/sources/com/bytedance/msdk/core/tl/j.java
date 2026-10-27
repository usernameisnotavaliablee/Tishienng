package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private long cw;
    private java.lang.String j;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f2259r;
    private java.lang.String xt;

    public j(java.lang.String r7, java.lang.String r8, long r9) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public j(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.j = r2
            r0.xt = r1
            r0.cw = r3
            r0.f2259r = r5
            return
    }

    public long j() {
            r2 = this;
            long r0 = r2.cw
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdnLoadFailShowBean{slotId='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", adnName='"
            r0.append(r2)
            java.lang.String r2 = r3.xt
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", effectiveTime="
            r0.append(r1)
            long r1 = r3.cw
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.f2259r
            return r0
    }
}
