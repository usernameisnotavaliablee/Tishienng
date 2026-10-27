package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum EpollMode extends java.lang.Enum<io.netty.channel.epoll.EpollMode> {
    private static final /* synthetic */ io.netty.channel.epoll.EpollMode[] $VALUES = null;
    public static final io.netty.channel.epoll.EpollMode EDGE_TRIGGERED = null;
    public static final io.netty.channel.epoll.EpollMode LEVEL_TRIGGERED = null;

    static {
            io.netty.channel.epoll.EpollMode r0 = new io.netty.channel.epoll.EpollMode
            java.lang.String r1 = "EDGE_TRIGGERED"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.channel.epoll.EpollMode.EDGE_TRIGGERED = r0
            io.netty.channel.epoll.EpollMode r1 = new io.netty.channel.epoll.EpollMode
            java.lang.String r3 = "LEVEL_TRIGGERED"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.channel.epoll.EpollMode.LEVEL_TRIGGERED = r1
            r3 = 2
            io.netty.channel.epoll.EpollMode[] r3 = new io.netty.channel.epoll.EpollMode[r3]
            r3[r2] = r0
            r3[r4] = r1
            io.netty.channel.epoll.EpollMode.$VALUES = r3
            return
    }

    EpollMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.channel.epoll.EpollMode valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.channel.epoll.EpollMode> r0 = io.netty.channel.epoll.EpollMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.channel.epoll.EpollMode r1 = (io.netty.channel.epoll.EpollMode) r1
            return r1
    }

    public static io.netty.channel.epoll.EpollMode[] values() {
            io.netty.channel.epoll.EpollMode[] r0 = io.netty.channel.epoll.EpollMode.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.channel.epoll.EpollMode[] r0 = (io.netty.channel.epoll.EpollMode[]) r0
            return r0
    }
}
