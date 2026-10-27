package io.netty.handler.codec.haproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HAProxySSLTLV extends io.netty.handler.codec.haproxy.HAProxyTLV {
    private final byte clientBitField;
    private final java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> tlvs;
    private final int verify;

    HAProxySSLTLV(int r3, byte r4, java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> r5, io.netty.buffer.ByteBuf r6) {
            r2 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV$Type r0 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL
            r1 = 32
            r2.<init>(r0, r1, r6)
            r2.verify = r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r5)
            r2.tlvs = r3
            r2.clientBitField = r4
            return
    }

    public java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> encapsulatedTLVs() {
            r1 = this;
            java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> r0 = r1.tlvs
            return r0
    }

    public boolean isPP2ClientCertConn() {
            r1 = this;
            byte r0 = r1.clientBitField
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isPP2ClientCertSess() {
            r1 = this;
            byte r0 = r1.clientBitField
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isPP2ClientSSL() {
            r2 = this;
            byte r0 = r2.clientBitField
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    public int verify() {
            r1 = this;
            int r0 = r1.verify
            return r0
    }
}
