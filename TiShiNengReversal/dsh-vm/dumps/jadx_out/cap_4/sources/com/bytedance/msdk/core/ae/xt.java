package com.bytedance.msdk.core.ae;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(java.util.List<java.lang.Integer> r7) {
            if (r7 != 0) goto L3
            goto L57
        L3:
            r0 = 0
            boolean r1 = r7.contains(r0)
            if (r1 == 0) goto Le
            r7.remove(r0)
            goto L3
        Le:
            int r0 = r7.size()
            r1 = 1
            if (r0 > r1) goto L16
            goto L57
        L16:
            int r0 = r7.size()
            int[] r2 = new int[r0]
            r3 = 0
            r4 = 0
        L1e:
            if (r4 >= r0) goto L2f
            java.lang.Object r5 = r7.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2[r4] = r5
            int r4 = r4 + 1
            goto L1e
        L2f:
            if (r1 >= r0) goto L46
            r4 = r2[r1]
            r5 = r1
        L34:
            if (r5 <= 0) goto L41
            int r6 = r5 + (-1)
            r6 = r2[r6]
            if (r6 <= r4) goto L41
            r2[r5] = r6
            int r5 = r5 + (-1)
            goto L34
        L41:
            r2[r5] = r4
            int r1 = r1 + 1
            goto L2f
        L46:
            r7.clear()
        L49:
            if (r3 >= r0) goto L57
            r1 = r2[r3]     // Catch: java.lang.RuntimeException -> L57
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.RuntimeException -> L57
            r7.add(r1)     // Catch: java.lang.RuntimeException -> L57
            int r3 = r3 + 1
            goto L49
        L57:
            return
    }
}
