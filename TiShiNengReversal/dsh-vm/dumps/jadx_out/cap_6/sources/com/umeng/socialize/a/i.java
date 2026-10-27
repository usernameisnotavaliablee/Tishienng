package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i {
    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] a(byte[] r3, byte[] r4) {
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 == 0) goto L20
            if (r4 == 0) goto L20
            int r0 = r4.length
            if (r0 != 0) goto Lb
            goto L20
        Lb:
            r0 = 0
        Lc:
            int r1 = r3.length
            if (r0 >= r1) goto L20
            r1 = r3[r0]
            int r2 = r4.length
            int r2 = r0 % r2
            r2 = r4[r2]
            r1 = r1 ^ r2
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto Lc
        L20:
            return r3
    }
}
