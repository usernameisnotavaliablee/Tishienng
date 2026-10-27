package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ba implements com.umeng.analytics.pro.av {
    private static final int a = 1;
    private org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId b;
    private boolean c;
    private boolean d;

    public ba() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r0
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5.c
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1e
            org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId r1 = new org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId
            r1.<init>()
            r5.b = r1
            int r6 = r1.a(r6, r0)
            if (r6 != r3) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = 0
        L1a:
            r5.d = r6
            r5.c = r3
        L1e:
            boolean r6 = r5.d
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = "isSupported"
            r1[r2] = r4
            r1[r3] = r6
            java.lang.String r6 = "getOAID"
            com.umeng.analytics.pro.bh.a(r6, r1)
            boolean r6 = r5.d
            if (r6 == 0) goto L45
            org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId r6 = r5.b
            boolean r6 = r6.c()
            if (r6 == 0) goto L45
            org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId r6 = r5.b
            java.lang.String r6 = r6.a()
            return r6
        L45:
            return r0
    }
}
