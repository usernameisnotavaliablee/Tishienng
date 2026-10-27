package io.netty.channel.rxtx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RxtxDeviceAddress extends java.net.SocketAddress {
    private static final long serialVersionUID = -2907820090993709523L;
    private final java.lang.String value;

    public RxtxDeviceAddress(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
