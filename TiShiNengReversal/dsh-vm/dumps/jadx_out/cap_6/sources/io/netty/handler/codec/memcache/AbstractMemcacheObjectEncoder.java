package io.netty.handler.codec.memcache;

import io.netty.handler.codec.memcache.MemcacheMessage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractMemcacheObjectEncoder<M extends io.netty.handler.codec.memcache.MemcacheMessage> extends io.netty.handler.codec.MessageToMessageEncoder<java.lang.Object> {
    private boolean expectingMoreContent;

    public AbstractMemcacheObjectEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int contentLength(java.lang.Object r3) {
            boolean r0 = r3 instanceof io.netty.handler.codec.memcache.MemcacheContent
            if (r0 == 0) goto Lf
            io.netty.handler.codec.memcache.MemcacheContent r3 = (io.netty.handler.codec.memcache.MemcacheContent) r3
            io.netty.buffer.ByteBuf r3 = r3.content()
            int r3 = r3.readableBytes()
            return r3
        Lf:
            boolean r0 = r3 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L1a
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            int r3 = r3.readableBytes()
            return r3
        L1a:
            boolean r0 = r3 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L26
            io.netty.channel.FileRegion r3 = (io.netty.channel.FileRegion) r3
            long r0 = r3.count()
            int r3 = (int) r0
            return r3
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected message type: "
            r1.append(r2)
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.Object encodeAndRetain(java.lang.Object r3) {
            boolean r0 = r3 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            io.netty.buffer.ByteBuf r3 = r3.retain()
            return r3
        Lb:
            boolean r0 = r3 instanceof io.netty.handler.codec.memcache.MemcacheContent
            if (r0 == 0) goto L1a
            io.netty.handler.codec.memcache.MemcacheContent r3 = (io.netty.handler.codec.memcache.MemcacheContent) r3
            io.netty.buffer.ByteBuf r3 = r3.content()
            io.netty.buffer.ByteBuf r3 = r3.retain()
            return r3
        L1a:
            boolean r0 = r3 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L25
            io.netty.channel.FileRegion r3 = (io.netty.channel.FileRegion) r3
            io.netty.channel.FileRegion r3 = r3.retain()
            return r3
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected message type: "
            r1.append(r2)
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.memcache.MemcacheObject
            if (r0 != 0) goto Lf
            boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
            if (r0 != 0) goto Lf
            boolean r2 = r2 instanceof io.netty.channel.FileRegion
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected void encode(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.memcache.MemcacheMessage
            if (r0 == 0) goto L2e
            boolean r0 = r1.expectingMoreContent
            if (r0 != 0) goto L13
            r0 = r3
            io.netty.handler.codec.memcache.MemcacheMessage r0 = (io.netty.handler.codec.memcache.MemcacheMessage) r0
            io.netty.buffer.ByteBuf r2 = r1.encodeMessage(r2, r0)
            r4.add(r2)
            goto L2e
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "unexpected message type: "
            r4.append(r0)
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L2e:
            boolean r2 = r3 instanceof io.netty.handler.codec.memcache.MemcacheContent
            if (r2 != 0) goto L3c
            boolean r2 = r3 instanceof io.netty.buffer.ByteBuf
            if (r2 != 0) goto L3c
            boolean r2 = r3 instanceof io.netty.channel.FileRegion
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            return
        L3c:
            int r2 = contentLength(r3)
            if (r2 <= 0) goto L4a
            java.lang.Object r2 = encodeAndRetain(r3)
            r4.add(r2)
            goto L4f
        L4a:
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r4.add(r2)
        L4f:
            boolean r2 = r3 instanceof io.netty.handler.codec.memcache.LastMemcacheContent
            r2 = r2 ^ 1
            r1.expectingMoreContent = r2
            return
    }

    protected abstract io.netty.buffer.ByteBuf encodeMessage(io.netty.channel.ChannelHandlerContext r1, M r2);
}
