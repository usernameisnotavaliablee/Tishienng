package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum DomainSocketReadMode extends java.lang.Enum<io.netty.channel.unix.DomainSocketReadMode> {
    private static final /* synthetic */ io.netty.channel.unix.DomainSocketReadMode[] $VALUES = null;
    public static final io.netty.channel.unix.DomainSocketReadMode BYTES = null;
    public static final io.netty.channel.unix.DomainSocketReadMode FILE_DESCRIPTORS = null;

    static {
            io.netty.channel.unix.DomainSocketReadMode r0 = new io.netty.channel.unix.DomainSocketReadMode
            java.lang.String r1 = "BYTES"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.channel.unix.DomainSocketReadMode.BYTES = r0
            io.netty.channel.unix.DomainSocketReadMode r1 = new io.netty.channel.unix.DomainSocketReadMode
            java.lang.String r3 = "FILE_DESCRIPTORS"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.channel.unix.DomainSocketReadMode.FILE_DESCRIPTORS = r1
            r3 = 2
            io.netty.channel.unix.DomainSocketReadMode[] r3 = new io.netty.channel.unix.DomainSocketReadMode[r3]
            r3[r2] = r0
            r3[r4] = r1
            io.netty.channel.unix.DomainSocketReadMode.$VALUES = r3
            return
    }

    DomainSocketReadMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.channel.unix.DomainSocketReadMode valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.channel.unix.DomainSocketReadMode> r0 = io.netty.channel.unix.DomainSocketReadMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.channel.unix.DomainSocketReadMode r1 = (io.netty.channel.unix.DomainSocketReadMode) r1
            return r1
    }

    public static io.netty.channel.unix.DomainSocketReadMode[] values() {
            io.netty.channel.unix.DomainSocketReadMode[] r0 = io.netty.channel.unix.DomainSocketReadMode.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.channel.unix.DomainSocketReadMode[] r0 = (io.netty.channel.unix.DomainSocketReadMode[]) r0
            return r0
    }
}
