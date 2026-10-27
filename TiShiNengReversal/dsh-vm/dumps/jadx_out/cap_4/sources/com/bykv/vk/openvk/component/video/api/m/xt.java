package com.bykv.vk.openvk.component.video.api.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private static final java.security.MessageDigest j = null;
    private static final char[] xt = null;

    static {
            java.security.MessageDigest r0 = j()
            com.bykv.vk.openvk.component.video.api.m.xt.j = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.bykv.vk.openvk.component.video.api.m.xt.xt = r0
            return
    }

    private xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r2) {
            java.security.MessageDigest r0 = com.bykv.vk.openvk.component.video.api.m.xt.j
            if (r0 == 0) goto L25
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto Lb
            goto L25
        Lb:
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r2 = r2.getBytes(r1)
            java.lang.Class<com.bykv.vk.openvk.component.video.api.m.xt> r1 = com.bykv.vk.openvk.component.video.api.m.xt.class
            monitor-enter(r1)
            byte[] r2 = r0.digest(r2)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = j(r2)
            return r2
        L22:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r2
        L25:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String j(byte[] r8) {
            if (r8 == 0) goto L2f
            int r0 = r8.length
            if (r0 != 0) goto L6
            goto L2f
        L6:
            int r0 = r8.length
            int r0 = r0 << 1
            char[] r0 = new char[r0]
            int r1 = r8.length
            r2 = 0
            r3 = 0
        Le:
            if (r2 >= r1) goto L29
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = com.bykv.vk.openvk.component.video.api.m.xt.xt
            r7 = r4 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> 4
            char r7 = r6[r7]
            r0[r3] = r7
            int r3 = r3 + 2
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto Le
        L29:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
        L2f:
            r8 = 0
            return r8
    }

    private static java.security.MessageDigest j() {
            java.lang.String r0 = "md5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}
