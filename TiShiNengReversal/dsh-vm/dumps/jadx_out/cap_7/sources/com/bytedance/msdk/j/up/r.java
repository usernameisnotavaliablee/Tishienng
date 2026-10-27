package com.bytedance.msdk.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String j(java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.util.IllegalFormatException -> L9
            return r2
        L9:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MoPub preconditions had a format exception: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "TTMediationSDK_ADAPTER"
            com.bytedance.msdk.j.up.cw.r(r0, r3)
            return r2
    }

    public static void j(java.lang.Object r4) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = ""
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Object can not be null."
            j(r4, r0, r2, r1)
            return
    }

    private static boolean j(java.lang.Object r0, boolean r1, java.lang.String r2, java.lang.Object... r3) {
            if (r0 == 0) goto L4
            r0 = 1
            return r0
        L4:
            java.lang.String r0 = j(r2, r3)
            if (r1 != 0) goto L11
            java.lang.String r1 = "TTMediationSDK_ADAPTER"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            r0 = 0
            return r0
        L11:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
    }
}
