package com.github.barteksc.pdfviewer.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ArrayUtils {
    private ArrayUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String arrayToString(int[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L1d
            r2 = r3[r1]
            r0.append(r2)
            int r2 = r3.length
            int r2 = r2 + (-1)
            if (r1 == r2) goto L1a
            java.lang.String r2 = ","
            r0.append(r2)
        L1a:
            int r1 = r1 + 1
            goto L8
        L1d:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static int[] calculateIndexesInDuplicateArray(int[] r5) {
            int r0 = r5.length
            int[] r0 = new int[r0]
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L1d
        L7:
            r1 = 0
            r0[r1] = r1
            r2 = 1
        Lb:
            int r3 = r5.length
            if (r2 >= r3) goto L1d
            r3 = r5[r2]
            int r4 = r2 + (-1)
            r4 = r5[r4]
            if (r3 == r4) goto L18
            int r1 = r1 + 1
        L18:
            r0[r2] = r1
            int r2 = r2 + 1
            goto Lb
        L1d:
            return r0
    }

    public static int[] deleteDuplicatedPages(int[] r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = -1
            r3 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto L1a
            r5 = r7[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r2 == r5) goto L16
            r0.add(r6)
        L16:
            int r4 = r4 + 1
            r2 = r5
            goto L9
        L1a:
            int r7 = r0.size()
            int[] r7 = new int[r7]
        L20:
            int r1 = r0.size()
            if (r3 >= r1) goto L35
            java.lang.Object r1 = r0.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r7[r3] = r1
            int r3 = r3 + 1
            goto L20
        L35:
            return r7
    }
}
