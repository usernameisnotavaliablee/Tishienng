package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class la {
    public la() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T extends java.lang.Comparable<? super T>> void j(java.util.List<T> r2) {
            if (r2 == 0) goto L1f
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto La
            goto L1f
        La:
            java.util.Collections.sort(r2)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            java.lang.Object[] r0 = r2.toArray()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Collections.sort(r0)
            r2.clear()
            r2.addAll(r0)
        L1f:
            return
    }

    public static <T> void j(java.util.List<T> r2, @androidx.annotation.NonNull java.util.Comparator<T> r3) {
            if (r2 == 0) goto L1f
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto La
            goto L1f
        La:
            java.util.Collections.sort(r2, r3)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            java.lang.Object[] r0 = r2.toArray()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Collections.sort(r0, r3)
            r2.clear()
            r2.addAll(r0)
        L1f:
            return
    }
}
