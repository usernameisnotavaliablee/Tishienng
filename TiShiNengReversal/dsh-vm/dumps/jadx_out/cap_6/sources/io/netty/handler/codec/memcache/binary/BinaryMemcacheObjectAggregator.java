package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BinaryMemcacheObjectAggregator extends io.netty.handler.codec.memcache.AbstractMemcacheObjectAggregator<io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage> {
    public BinaryMemcacheObjectAggregator(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest toFullRequest(io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r3, io.netty.buffer.ByteBuf r4) {
            io.netty.buffer.ByteBuf r0 = r3.key()
            r1 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto L11
        L9:
            io.netty.buffer.ByteBuf r0 = r3.key()
            io.netty.buffer.ByteBuf r0 = r0.retain()
        L11:
            io.netty.buffer.ByteBuf r2 = r3.extras()
            if (r2 != 0) goto L18
            goto L20
        L18:
            io.netty.buffer.ByteBuf r1 = r3.extras()
            io.netty.buffer.ByteBuf r1 = r1.retain()
        L20:
            io.netty.handler.codec.memcache.binary.DefaultFullBinaryMemcacheRequest r2 = new io.netty.handler.codec.memcache.binary.DefaultFullBinaryMemcacheRequest
            r2.<init>(r0, r1, r4)
            byte r4 = r3.magic()
            r2.setMagic(r4)
            byte r4 = r3.opcode()
            r2.setOpcode(r4)
            short r4 = r3.keyLength()
            r2.setKeyLength(r4)
            byte r4 = r3.extrasLength()
            r2.setExtrasLength(r4)
            byte r4 = r3.dataType()
            r2.setDataType(r4)
            int r4 = r3.totalBodyLength()
            r2.setTotalBodyLength(r4)
            int r4 = r3.opaque()
            r2.setOpaque(r4)
            long r0 = r3.cas()
            r2.setCas(r0)
            short r3 = r3.reserved()
            r2.setReserved(r3)
            return r2
    }

    private static io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse toFullResponse(io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse r3, io.netty.buffer.ByteBuf r4) {
            io.netty.buffer.ByteBuf r0 = r3.key()
            r1 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto L11
        L9:
            io.netty.buffer.ByteBuf r0 = r3.key()
            io.netty.buffer.ByteBuf r0 = r0.retain()
        L11:
            io.netty.buffer.ByteBuf r2 = r3.extras()
            if (r2 != 0) goto L18
            goto L20
        L18:
            io.netty.buffer.ByteBuf r1 = r3.extras()
            io.netty.buffer.ByteBuf r1 = r1.retain()
        L20:
            io.netty.handler.codec.memcache.binary.DefaultFullBinaryMemcacheResponse r2 = new io.netty.handler.codec.memcache.binary.DefaultFullBinaryMemcacheResponse
            r2.<init>(r0, r1, r4)
            byte r4 = r3.magic()
            r2.setMagic(r4)
            byte r4 = r3.opcode()
            r2.setOpcode(r4)
            short r4 = r3.keyLength()
            r2.setKeyLength(r4)
            byte r4 = r3.extrasLength()
            r2.setExtrasLength(r4)
            byte r4 = r3.dataType()
            r2.setDataType(r4)
            int r4 = r3.totalBodyLength()
            r2.setTotalBodyLength(r4)
            int r4 = r3.opaque()
            r2.setOpaque(r4)
            long r0 = r3.cas()
            r2.setCas(r0)
            short r3 = r3.status()
            r2.setStatus(r3)
            return r2
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage beginAggregation(java.lang.Object r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r1 = (io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage) r1
            io.netty.handler.codec.memcache.FullMemcacheMessage r1 = r0.beginAggregation(r1, r2)
            return r1
    }

    protected io.netty.handler.codec.memcache.FullMemcacheMessage beginAggregation(io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest
            if (r0 == 0) goto Lb
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r2 = (io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest) r2
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest r2 = toFullRequest(r2, r3)
            return r2
        Lb:
            boolean r0 = r2 instanceof io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse
            if (r0 == 0) goto L16
            io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse r2 = (io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse) r2
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r2 = toFullResponse(r2, r3)
            return r2
        L16:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
    }

    /* renamed from: isStartMessage, reason: avoid collision after fix types in other method */
    protected boolean isStartMessage2(io.netty.handler.codec.memcache.MemcacheObject r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isStartMessage(io.netty.handler.codec.memcache.MemcacheObject r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheObject r1 = (io.netty.handler.codec.memcache.MemcacheObject) r1
            boolean r1 = r0.isStartMessage2(r1)
            return r1
    }
}
