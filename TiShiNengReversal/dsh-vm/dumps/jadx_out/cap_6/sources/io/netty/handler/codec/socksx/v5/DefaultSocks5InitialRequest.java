package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSocks5InitialRequest extends io.netty.handler.codec.socksx.v5.AbstractSocks5Message implements io.netty.handler.codec.socksx.v5.Socks5InitialRequest {
    private final java.util.List<io.netty.handler.codec.socksx.v5.Socks5AuthMethod> authMethods;

    public DefaultSocks5InitialRequest(java.lang.Iterable<io.netty.handler.codec.socksx.v5.Socks5AuthMethod> r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L36
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r1 = (io.netty.handler.codec.socksx.v5.Socks5AuthMethod) r1
            if (r1 != 0) goto L1d
            goto L21
        L1d:
            r0.add(r1)
            goto Le
        L21:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L2e
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r2.authMethods = r3
            return
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "authMethods is empty"
            r3.<init>(r0)
            throw r3
        L36:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "authSchemes"
            r3.<init>(r0)
            throw r3
    }

    public DefaultSocks5InitialRequest(io.netty.handler.codec.socksx.v5.Socks5AuthMethod... r5) {
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1a
            r3 = r5[r2]
            if (r3 != 0) goto L14
            goto L1a
        L14:
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L1a:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L27
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            r4.authMethods = r5
            return
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "authMethods is empty"
            r5.<init>(r0)
            throw r5
        L2f:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "authMethods"
            r5.<init>(r0)
            throw r5
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5InitialRequest
    public java.util.List<io.netty.handler.codec.socksx.v5.Socks5AuthMethod> authMethods() {
            r1 = this;
            java.util.List<io.netty.handler.codec.socksx.v5.Socks5AuthMethod> r0 = r1.authMethods
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
            java.lang.String r1 = ", authMethods: "
            r0.append(r1)
            goto L26
        L21:
            java.lang.String r1 = "(authMethods: "
            r0.append(r1)
        L26:
            java.util.List r1 = r3.authMethods()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
