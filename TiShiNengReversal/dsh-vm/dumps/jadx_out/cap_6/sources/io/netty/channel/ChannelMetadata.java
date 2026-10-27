package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ChannelMetadata {
    private final int defaultMaxMessagesPerRead;
    private final boolean hasDisconnect;

    public ChannelMetadata(boolean r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public ChannelMetadata(boolean r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "defaultMaxMessagesPerRead"
            io.netty.util.internal.ObjectUtil.checkPositive(r3, r0)
            r1.hasDisconnect = r2
            r1.defaultMaxMessagesPerRead = r3
            return
    }

    public int defaultMaxMessagesPerRead() {
            r1 = this;
            int r0 = r1.defaultMaxMessagesPerRead
            return r0
    }

    public boolean hasDisconnect() {
            r1 = this;
            boolean r0 = r1.hasDisconnect
            return r0
    }
}
