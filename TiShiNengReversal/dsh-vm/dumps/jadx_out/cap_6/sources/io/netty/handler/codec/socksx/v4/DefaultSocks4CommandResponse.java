package io.netty.handler.codec.socksx.v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSocks4CommandResponse extends io.netty.handler.codec.socksx.v4.AbstractSocks4Message implements io.netty.handler.codec.socksx.v4.Socks4CommandResponse {
    private final java.lang.String dstAddr;
    private final int dstPort;
    private final io.netty.handler.codec.socksx.v4.Socks4CommandStatus status;

    public DefaultSocks4CommandResponse(io.netty.handler.codec.socksx.v4.Socks4CommandStatus r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public DefaultSocks4CommandResponse(io.netty.handler.codec.socksx.v4.Socks4CommandStatus r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L54
            if (r3 == 0) goto L2a
            boolean r0 = io.netty.util.NetUtil.isValidIpV4Address(r3)
            if (r0 == 0) goto Le
            goto L2a
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "dstAddr: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " (expected: a valid IPv4 address)"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L2a:
            if (r4 < 0) goto L38
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r0) goto L38
            r1.status = r2
            r1.dstAddr = r3
            r1.dstPort = r4
            return
        L38:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "dstPort: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " (expected: 0~65535)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L54:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "cmdStatus"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.socksx.v4.Socks4CommandResponse
    public java.lang.String dstAddr() {
            r1 = this;
            java.lang.String r0 = r1.dstAddr
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v4.Socks4CommandResponse
    public int dstPort() {
            r1 = this;
            int r0 = r1.dstPort
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v4.Socks4CommandResponse
    public io.netty.handler.codec.socksx.v4.Socks4CommandStatus status() {
            r1 = this;
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r0 = r1.status
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 96
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            io.netty.handler.codec.DecoderResult r1 = r3.decoderResult()
            boolean r2 = r1.isSuccess()
            if (r2 != 0) goto L26
            java.lang.String r2 = "(decoderResult: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", dstAddr: "
            r0.append(r1)
            goto L2b
        L26:
            java.lang.String r1 = "(dstAddr: "
            r0.append(r1)
        L2b:
            java.lang.String r1 = r3.dstAddr()
            r0.append(r1)
            java.lang.String r1 = ", dstPort: "
            r0.append(r1)
            int r1 = r3.dstPort()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
