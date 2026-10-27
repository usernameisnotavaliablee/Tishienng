package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class y {
    private byte[] a;
    private int b;

    public y(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.b = r0
            byte[] r2 = new byte[r2]
            r1.a = r2
            return
    }

    public void a(byte[] r5, int r6) {
            r4 = this;
            if (r6 > 0) goto L3
            return
        L3:
            byte[] r0 = r4.a
            int r1 = r0.length
            int r2 = r4.b
            int r1 = r1 - r2
            r3 = 0
            if (r1 < r6) goto L10
            java.lang.System.arraycopy(r5, r3, r0, r2, r6)
            goto L20
        L10:
            int r1 = r0.length
            int r1 = r1 + r6
            int r1 = r1 << 1
            byte[] r1 = new byte[r1]
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r4.b
            java.lang.System.arraycopy(r5, r3, r1, r0, r6)
            r4.a = r1
        L20:
            int r5 = r4.b
            int r5 = r5 + r6
            r4.b = r5
            return
    }

    public byte[] b() {
            r4 = this;
            int r0 = r4.b
            r1 = 0
            if (r0 > 0) goto L8
            byte[] r0 = new byte[r1]
            return r0
        L8:
            byte[] r2 = new byte[r0]
            byte[] r3 = r4.a
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
            return r2
    }

    public int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }
}
