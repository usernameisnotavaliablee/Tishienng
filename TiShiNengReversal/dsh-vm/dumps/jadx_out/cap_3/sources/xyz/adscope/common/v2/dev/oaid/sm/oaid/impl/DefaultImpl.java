package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class DefaultImpl implements xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID {
    DefaultImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public void doGet(xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException r0 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDException
            java.lang.String r1 = "Unsupported"
            r0.<init>(r1)
            r3.onOAIDGetError(r0)
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public boolean supported() {
            r1 = this;
            r0 = 0
            return r0
    }
}
