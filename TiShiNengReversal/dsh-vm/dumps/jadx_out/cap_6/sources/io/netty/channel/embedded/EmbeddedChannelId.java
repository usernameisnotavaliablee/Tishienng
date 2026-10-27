package io.netty.channel.embedded;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class EmbeddedChannelId implements io.netty.channel.ChannelId {
    static final io.netty.channel.ChannelId INSTANCE = null;
    private static final long serialVersionUID = -251711922203466130L;

    static {
            io.netty.channel.embedded.EmbeddedChannelId r0 = new io.netty.channel.embedded.EmbeddedChannelId
            r0.<init>()
            io.netty.channel.embedded.EmbeddedChannelId.INSTANCE = r0
            return
    }

    private EmbeddedChannelId() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.channel.ChannelId
    public java.lang.String asLongText() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // io.netty.channel.ChannelId
    public java.lang.String asShortText() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.channel.ChannelId r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.embedded.EmbeddedChannelId
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r0 = r1.asLongText()
            java.lang.String r2 = r2.asLongText()
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.channel.ChannelId r1) {
            r0 = this;
            io.netty.channel.ChannelId r1 = (io.netty.channel.ChannelId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.embedded.EmbeddedChannelId
            return r1
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "embedded"
            return r0
    }
}
