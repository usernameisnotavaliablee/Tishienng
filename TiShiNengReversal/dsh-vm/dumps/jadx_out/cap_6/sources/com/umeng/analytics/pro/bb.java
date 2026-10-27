package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class bb implements com.umeng.analytics.pro.av {
    bb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper.a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "isSupported"
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = "getOAID"
            com.umeng.analytics.pro.bh.a(r2, r3)
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r7 = org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper.b(r7)
            return r7
    }
}
