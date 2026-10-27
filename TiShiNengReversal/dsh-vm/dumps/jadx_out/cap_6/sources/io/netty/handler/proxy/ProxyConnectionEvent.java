package io.netty.handler.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ProxyConnectionEvent {
    private final java.lang.String authScheme;
    private final java.net.SocketAddress destinationAddress;
    private final java.lang.String protocol;
    private final java.net.SocketAddress proxyAddress;
    private java.lang.String strVal;

    public ProxyConnectionEvent(java.lang.String r1, java.lang.String r2, java.net.SocketAddress r3, java.net.SocketAddress r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L2c
            if (r2 == 0) goto L24
            if (r3 == 0) goto L1c
            if (r4 == 0) goto L14
            r0.protocol = r1
            r0.authScheme = r2
            r0.proxyAddress = r3
            r0.destinationAddress = r4
            return
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "destinationAddress"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "proxyAddress"
            r1.<init>(r2)
            throw r1
        L24:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "authScheme"
            r1.<init>(r2)
            throw r1
        L2c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "protocol"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String authScheme() {
            r1 = this;
            java.lang.String r0 = r1.authScheme
            return r0
    }

    public <T extends java.net.SocketAddress> T destinationAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.destinationAddress
            return r0
    }

    public java.lang.String protocol() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }

    public <T extends java.net.SocketAddress> T proxyAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.proxyAddress
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.strVal
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = r3.protocol
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r2 = r3.authScheme
            r0.append(r2)
            r0.append(r1)
            java.net.SocketAddress r1 = r3.proxyAddress
            r0.append(r1)
            java.lang.String r1 = " => "
            r0.append(r1)
            java.net.SocketAddress r1 = r3.destinationAddress
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.strVal = r0
            return r0
    }
}
