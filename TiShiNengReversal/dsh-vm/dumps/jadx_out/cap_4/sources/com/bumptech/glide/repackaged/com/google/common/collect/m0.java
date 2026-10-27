package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class m0 {
    public m0() {
            r1 = this;
            r1.<init>()
            return
    }

    static boolean a(java.util.Set<?> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1c
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1c
            return r0
        L1c:
            return r2
    }

    static int b(java.util.Set<?> r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r1 + r2
            int r1 = ~r1
            int r1 = ~r1
            goto L6
        L1c:
            return r1
    }
}
