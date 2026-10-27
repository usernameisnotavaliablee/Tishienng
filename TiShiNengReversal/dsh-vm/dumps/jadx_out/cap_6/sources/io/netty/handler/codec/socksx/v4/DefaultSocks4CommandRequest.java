package io.netty.handler.codec.socksx.v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSocks4CommandRequest extends io.netty.handler.codec.socksx.v4.AbstractSocks4Message implements io.netty.handler.codec.socksx.v4.Socks4CommandRequest {
    private final java.lang.String dstAddr;
    private final int dstPort;
    private final io.netty.handler.codec.socksx.v4.Socks4CommandType type;
    private final java.lang.String userId;

    public DefaultSocks4CommandRequest(io.netty.handler.codec.socksx.v4.Socks4CommandType r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultSocks4CommandRequest(io.netty.handler.codec.socksx.v4.Socks4CommandType r2, java.lang.String r3, int r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L48
            if (r3 == 0) goto L40
            if (r4 <= 0) goto L24
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r4 >= r0) goto L24
            if (r5 == 0) goto L1c
            r1.userId = r5
            r1.type = r2
            java.lang.String r2 = java.net.IDN.toASCII(r3)
            r1.dstAddr = r2
            r1.dstPort = r4
            return
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "userId"
            r2.<init>(r3)
            throw r2
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "dstPort: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " (expected: 1~65535)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L40:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "dstAddr"
            r2.<init>(r3)
            throw r2
        L48:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "type"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.socksx.v4.Socks4CommandRequest
    public java.lang.String dstAddr() {
            r1 = this;
            java.lang.String r0 = r1.dstAddr
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v4.Socks4CommandRequest
    public int dstPort() {
            r1 = this;
            int r0 = r1.dstPort
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            io.netty.handler.codec.DecoderResult r1 = r3.decoderResult()
            boolean r2 = r1.isSuccess()
            if (r2 != 0) goto L26
            java.lang.String r2 = "(decoderResult: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", type: "
            r0.append(r1)
            goto L2b
        L26:
            java.lang.String r1 = "(type: "
            r0.append(r1)
        L2b:
            io.netty.handler.codec.socksx.v4.Socks4CommandType r1 = r3.type()
            r0.append(r1)
            java.lang.String r1 = ", dstAddr: "
            r0.append(r1)
            java.lang.String r1 = r3.dstAddr()
            r0.append(r1)
            java.lang.String r1 = ", dstPort: "
            r0.append(r1)
            int r1 = r3.dstPort()
            r0.append(r1)
            java.lang.String r1 = ", userId: "
            r0.append(r1)
            java.lang.String r1 = r3.userId()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v4.Socks4CommandRequest
    public io.netty.handler.codec.socksx.v4.Socks4CommandType type() {
            r1 = this;
            io.netty.handler.codec.socksx.v4.Socks4CommandType r0 = r1.type
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v4.Socks4CommandRequest
    public java.lang.String userId() {
            r1 = this;
            java.lang.String r0 = r1.userId
            return r0
    }
}
