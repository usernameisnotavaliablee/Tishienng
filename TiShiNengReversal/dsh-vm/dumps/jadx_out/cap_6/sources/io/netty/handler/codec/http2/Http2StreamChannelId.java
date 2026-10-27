package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Http2StreamChannelId implements io.netty.channel.ChannelId {
    private static final long serialVersionUID = -6642338822166867585L;
    private final int id;
    private final io.netty.channel.ChannelId parentId;

    Http2StreamChannelId(io.netty.channel.ChannelId r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.parentId = r1
            r0.id = r2
            return
    }

    @Override // io.netty.channel.ChannelId
    public java.lang.String asLongText() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.channel.ChannelId r1 = r2.parentId
            java.lang.String r1 = r1.asLongText()
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            int r1 = r2.id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.channel.ChannelId
    public java.lang.String asShortText() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.channel.ChannelId r1 = r2.parentId
            java.lang.String r1 = r1.asShortText()
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            int r1 = r2.id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.channel.ChannelId r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http2.Http2StreamChannelId
            if (r0 == 0) goto L16
            io.netty.handler.codec.http2.Http2StreamChannelId r3 = (io.netty.handler.codec.http2.Http2StreamChannelId) r3
            io.netty.channel.ChannelId r0 = r2.parentId
            io.netty.channel.ChannelId r1 = r3.parentId
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L15
            int r0 = r2.id
            int r3 = r3.id
            int r0 = r0 - r3
        L15:
            return r0
        L16:
            io.netty.channel.ChannelId r0 = r2.parentId
            int r3 = r0.compareTo(r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.channel.ChannelId r1) {
            r0 = this;
            io.netty.channel.ChannelId r1 = (io.netty.channel.ChannelId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http2.Http2StreamChannelId
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http2.Http2StreamChannelId r4 = (io.netty.handler.codec.http2.Http2StreamChannelId) r4
            int r0 = r3.id
            int r2 = r4.id
            if (r0 != r2) goto L1a
            io.netty.channel.ChannelId r0 = r3.parentId
            io.netty.channel.ChannelId r4 = r4.parentId
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.id
            int r0 = r0 * 31
            io.netty.channel.ChannelId r1 = r2.parentId
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.asShortText()
            return r0
    }
}
