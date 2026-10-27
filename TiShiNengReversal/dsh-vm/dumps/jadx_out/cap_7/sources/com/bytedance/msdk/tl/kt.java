package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class kt {
    private static java.util.Map<java.lang.Integer, java.lang.Integer> j;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.tl.kt.j = r0
            return
    }

    public kt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Integer j(int r2) {
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.bytedance.msdk.tl.kt.j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L1b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = com.bytedance.msdk.tl.kt.j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
        L1b:
            return r0
    }
}
