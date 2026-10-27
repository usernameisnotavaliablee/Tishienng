package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i {
    private static java.lang.String a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static {
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] a() {
            java.lang.String r0 = com.baidu.liantian.core.i.a
            char[] r0 = r0.toCharArray()
            r1 = 16
            char[] r2 = new char[r1]
            r3 = 0
        Lb:
            if (r3 >= r1) goto L1f
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            r5 = 62
            int r4 = r4.nextInt(r5)
            char r4 = r0[r4]
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L1f:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            byte[] r0 = r0.getBytes()
            return r0
    }
}
