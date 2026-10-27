package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class up {
    public final java.lang.String cw;
    public final boolean j;
    public final boolean r;
    public final int xt;

    public up(boolean r1, int r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.r = r4
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdEventUploadResult{mSuccess="
            r0.<init>(r1)
            boolean r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", mStatusCode="
            r0.append(r1)
            int r1 = r2.xt
            r0.append(r1)
            java.lang.String r1 = ", mMsg='"
            r0.append(r1)
            java.lang.String r1 = r2.cw
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", mIsDataError="
            r0.append(r1)
            boolean r1 = r2.r
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
