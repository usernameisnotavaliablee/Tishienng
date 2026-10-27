package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSocks5PasswordAuthRequest extends io.netty.handler.codec.socksx.v5.AbstractSocks5Message implements io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest {
    private final java.lang.String password;
    private final java.lang.String username;

    public DefaultSocks5PasswordAuthRequest(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L32
            if (r4 == 0) goto L2a
            int r0 = r3.length()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L22
            int r0 = r4.length()
            if (r0 > r1) goto L1a
            r2.username = r3
            r2.password = r4
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "password: **** (expected: less than 256 chars)"
            r3.<init>(r4)
            throw r3
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "username: **** (expected: less than 256 chars)"
            r3.<init>(r4)
            throw r3
        L2a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "password"
            r3.<init>(r4)
            throw r3
        L32:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "username"
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest
    public java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
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
            java.lang.String r1 = ", username: "
            r0.append(r1)
            goto L26
        L21:
            java.lang.String r1 = "(username: "
            r0.append(r1)
        L26:
            java.lang.String r1 = r3.username()
            r0.append(r1)
            java.lang.String r1 = ", password: ****)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest
    public java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
