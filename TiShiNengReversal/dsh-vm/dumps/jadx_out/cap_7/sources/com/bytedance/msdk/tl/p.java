package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> boolean j(java.util.List<T> r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static <T> boolean xt(java.util.List<T> r1) {
            if (r1 == 0) goto L11
            int r0 = r1.size()
            if (r0 == 0) goto L11
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            r1 = 1
            return r1
    }
}
