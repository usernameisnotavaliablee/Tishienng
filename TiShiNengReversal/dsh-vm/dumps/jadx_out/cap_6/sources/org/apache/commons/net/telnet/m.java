package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m extends org.apache.commons.net.telnet.k {
    protected static final int i = 24;
    protected static final int j = 1;
    protected static final int k = 0;
    private final java.lang.String h;

    public m(java.lang.String r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 24
            r2 = 0
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r0.h = r7
            return
    }

    public m(java.lang.String r7, boolean r8, boolean r9, boolean r10, boolean r11) {
            r6 = this;
            r1 = 24
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0.h = r7
            return
    }

    @Override // org.apache.commons.net.telnet.k
    public int[] a(int[] r5, int r6) {
            r4 = this;
            if (r5 == 0) goto L36
            r0 = 1
            if (r6 <= r0) goto L36
            java.lang.String r6 = r4.h
            if (r6 == 0) goto L36
            r1 = 0
            r2 = r5[r1]
            r3 = 24
            if (r2 != r3) goto L36
            r5 = r5[r0]
            if (r5 != r0) goto L36
            int r5 = r6.length()
            int r5 = r5 + 2
            int[] r5 = new int[r5]
            r5[r1] = r3
            r5[r0] = r1
        L20:
            java.lang.String r6 = r4.h
            int r6 = r6.length()
            if (r1 >= r6) goto L35
            int r6 = r1 + 2
            java.lang.String r0 = r4.h
            char r0 = r0.charAt(r1)
            r5[r6] = r0
            int r1 = r1 + 1
            goto L20
        L35:
            return r5
        L36:
            r5 = 0
            return r5
    }
}
