package com.bytedance.adsdk.ugeno.swiper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int j(boolean r0, int r1, int r2) {
            if (r2 != 0) goto L3
            goto L14
        L3:
            if (r0 == 0) goto L14
            int r1 = r1 + (-512)
            int r0 = java.lang.Math.abs(r1)
            int r0 = r0 % r2
            if (r1 >= 0) goto L13
            if (r0 != 0) goto L11
            goto L13
        L11:
            int r2 = r2 - r0
            return r2
        L13:
            return r0
        L14:
            return r1
    }

    public static boolean j(int r0, java.util.Collection<?> r1) {
            if (r0 < 0) goto La
            int r1 = r1.size()
            if (r0 >= r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
