package com.umeng.socialize.net.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeClient extends com.umeng.socialize.net.utils.UClient {
    public SocializeClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.umeng.socialize.net.base.SocializeReseponse execute(com.umeng.socialize.net.utils.URequest r3) {
            r2 = this;
            boolean r0 = com.umeng.socialize.common.SocializeConstants.DEBUG_MODE
            if (r0 == 0) goto Le
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> La
            goto Le
        La:
            r0 = move-exception
            com.umeng.socialize.utils.SLog.error(r0)
        Le:
            java.lang.Class<? extends com.umeng.socialize.net.base.SocializeReseponse> r0 = r3.mResponseClz
            com.umeng.socialize.net.utils.UResponse r3 = super.execute(r3, r0)
            com.umeng.socialize.net.base.SocializeReseponse r3 = (com.umeng.socialize.net.base.SocializeReseponse) r3
            return r3
    }
}
