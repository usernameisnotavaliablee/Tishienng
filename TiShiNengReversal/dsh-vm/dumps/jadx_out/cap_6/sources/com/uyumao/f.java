package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class f extends android.os.Handler {
    public f(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what
            r1 = 256(0x100, float:3.59E-43)
            if (r0 == r1) goto L7
            goto L2b
        L7:
            int r0 = r4.arg1
            java.lang.Object r4 = r4.obj
            int r1 = r0 / 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap<java.lang.Integer, com.uyumao.g$a> r2 = com.uyumao.g.c
            if (r2 != 0) goto L16
            goto L2b
        L16:
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L25
            java.util.HashMap<java.lang.Integer, com.uyumao.g$a> r2 = com.uyumao.g.c
            java.lang.Object r1 = r2.get(r1)
            com.uyumao.g$a r1 = (com.uyumao.g.a) r1
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L2b
            r1.a(r4, r0)
        L2b:
            return
    }
}
