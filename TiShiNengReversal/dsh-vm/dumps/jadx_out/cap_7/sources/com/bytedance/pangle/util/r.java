package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> boolean j(@androidx.annotation.Nullable T[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    public static <T> boolean j(@androidx.annotation.Nullable T[] r0, T r1) {
            int r0 = xt(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static <T> boolean j(@androidx.annotation.Nullable T[] r5, T[] r6) {
            r0 = 1
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L15
            r4 = r6[r3]
            boolean r4 = j(r5, r4)
            if (r4 != 0) goto L12
            return r2
        L12:
            int r3 = r3 + 1
            goto L7
        L15:
            return r0
    }

    public static <T> int xt(@androidx.annotation.Nullable T[] r3, T r4) {
            r0 = -1
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 0
        L5:
            int r2 = r3.length
            if (r1 >= r2) goto L19
            r2 = r3[r1]
            if (r2 == r4) goto L18
            if (r2 == 0) goto L15
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L15
            goto L18
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            return r1
        L19:
            return r0
    }
}
