package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChannelException extends java.lang.RuntimeException {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 2908618315971075004L;

    static {
            return
    }

    public ChannelException() {
            r0 = this;
            r0.<init>()
            return
    }

    public ChannelException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ChannelException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @io.netty.util.internal.SuppressJava6Requirement(reason = "uses Java 7+ RuntimeException.<init>(String, Throwable, boolean, boolean) but is guarded by version checks")
    protected ChannelException(java.lang.String r2, java.lang.Throwable r3, boolean r4) {
            r1 = this;
            r4 = 0
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ChannelException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static io.netty.channel.ChannelException newStatic(java.lang.String r2, java.lang.Throwable r3) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Le
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        Le:
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2, r3)
            return r0
    }
}
