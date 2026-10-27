package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class OpenSslContext extends io.netty.handler.ssl.ReferenceCountedOpenSslContext {
    OpenSslContext(java.lang.Iterable<java.lang.String> r16, io.netty.handler.ssl.CipherSuiteFilter r17, io.netty.handler.ssl.ApplicationProtocolConfig r18, long r19, long r21, int r23, java.security.cert.Certificate[] r24, io.netty.handler.ssl.ClientAuth r25, java.lang.String[] r26, boolean r27, boolean r28) throws javax.net.ssl.SSLException {
            r15 = this;
            r14 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    OpenSslContext(java.lang.Iterable<java.lang.String> r16, io.netty.handler.ssl.CipherSuiteFilter r17, io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r18, long r19, long r21, int r23, java.security.cert.Certificate[] r24, io.netty.handler.ssl.ClientAuth r25, java.lang.String[] r26, boolean r27, boolean r28) throws javax.net.ssl.SSLException {
            r15 = this;
            r14 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    protected final void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            io.netty.handler.ssl.OpenSsl.releaseIfNeeded(r0)
            return
    }

    @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext
    final javax.net.ssl.SSLEngine newEngine0(io.netty.buffer.ByteBufAllocator r7, java.lang.String r8, int r9, boolean r10) {
            r6 = this;
            io.netty.handler.ssl.OpenSslEngine r0 = new io.netty.handler.ssl.OpenSslEngine
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
