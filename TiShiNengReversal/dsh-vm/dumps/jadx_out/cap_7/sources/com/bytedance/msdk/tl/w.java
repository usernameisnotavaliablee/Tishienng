package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class w {
    public w() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(int[] r3) {
            if (r3 == 0) goto L26
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L26
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lc:
            int r2 = r3.length
            if (r1 >= r2) goto L21
            r2 = r3[r1]
            r0.append(r2)
            int r2 = r3.length
            int r2 = r2 + (-1)
            if (r1 == r2) goto L1e
            java.lang.String r2 = ","
            r0.append(r2)
        L1e:
            int r1 = r1 + 1
            goto Lc
        L21:
            java.lang.String r3 = r0.toString()
            return r3
        L26:
            r3 = 0
            return r3
    }
}
