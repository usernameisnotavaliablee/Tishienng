package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSocks5PasswordAuthResponse extends io.netty.handler.codec.socksx.v5.AbstractSocks5Message implements io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse {
    private final io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus status;

    public DefaultSocks5PasswordAuthResponse(io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.status = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "status"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse
    public io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus status() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r0 = r1.status
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.<init>(r1)
            io.netty.handler.codec.DecoderResult r1 = r3.decoderResult()
            boolean r2 = r1.isSuccess()
            if (r2 != 0) goto L21
            java.lang.String r2 = "(decoderResult: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", status: "
            r0.append(r1)
            goto L26
        L21:
            java.lang.String r1 = "(status: "
            r0.append(r1)
        L26:
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r1 = r3.status()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
