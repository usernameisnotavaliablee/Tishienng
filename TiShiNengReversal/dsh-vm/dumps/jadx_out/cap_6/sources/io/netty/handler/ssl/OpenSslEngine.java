package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslEngine extends io.netty.handler.ssl.ReferenceCountedOpenSslEngine {
    OpenSslEngine(io.netty.handler.ssl.OpenSslContext r8, io.netty.buffer.ByteBufAllocator r9, java.lang.String r10, int r11, boolean r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            io.netty.handler.ssl.OpenSsl.releaseIfNeeded(r0)
            return
    }
}
