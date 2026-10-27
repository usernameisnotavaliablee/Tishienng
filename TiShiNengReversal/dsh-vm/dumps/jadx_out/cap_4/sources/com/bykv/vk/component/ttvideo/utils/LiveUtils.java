package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveUtils {
    public LiveUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int versionStringToInt(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L2e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L2e
        La:
            java.lang.String r1 = "\\."
            java.lang.String[] r3 = r3.split(r1)
            int r1 = r3.length
            if (r1 > 0) goto L14
            return r0
        L14:
            r1 = 0
        L15:
            int r2 = r3.length
            if (r0 >= r2) goto L2d
            if (r0 != 0) goto L21
            r1 = r3[r0]
            int r1 = java.lang.Integer.parseInt(r1)
            goto L2a
        L21:
            r2 = r3[r0]
            int r2 = java.lang.Integer.parseInt(r2)
            int r1 = r1 * 100
            int r1 = r1 + r2
        L2a:
            int r0 = r0 + 1
            goto L15
        L2d:
            return r1
        L2e:
            return r0
    }
}
