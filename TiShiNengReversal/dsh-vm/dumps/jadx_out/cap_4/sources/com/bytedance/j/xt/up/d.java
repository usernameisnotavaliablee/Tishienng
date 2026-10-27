package com.bytedance.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Long> a = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.<init>(r1)
            com.bytedance.j.xt.up.d.a = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(long r6) {
            r0 = 0
        L1:
            int r1 = r0 + 1
            long r2 = (long) r0
            r4 = 5
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L24
            java.util.concurrent.atomic.AtomicReference<java.lang.Long> r0 = com.bytedance.j.xt.up.d.a
            java.lang.Object r2 = r0.get()
            java.lang.Long r2 = (java.lang.Long) r2
            long r3 = r2.longValue()
            long r3 = r3 | r6
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r0 = androidx.camera.view.p.a(r0, r2, r3)
            if (r0 == 0) goto L22
            goto L24
        L22:
            r0 = r1
            goto L1
        L24:
            return
    }
}
