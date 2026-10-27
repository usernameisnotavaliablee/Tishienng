package io.netty.handler.codec.memcache;

import io.netty.handler.codec.memcache.MemcacheMessage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractMemcacheObjectAggregator<H extends io.netty.handler.codec.memcache.MemcacheMessage> extends io.netty.handler.codec.MessageAggregator<io.netty.handler.codec.memcache.MemcacheObject, H, io.netty.handler.codec.memcache.MemcacheContent, io.netty.handler.codec.memcache.FullMemcacheMessage> {
    protected AbstractMemcacheObjectAggregator(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected boolean closeAfterContinueResponse(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected boolean ignoreContentAfterContinueResponse(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    /* renamed from: isAggregated, reason: avoid collision after fix types in other method */
    protected boolean isAggregated2(io.netty.handler.codec.memcache.MemcacheObject r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.memcache.FullMemcacheMessage
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isAggregated(io.netty.handler.codec.memcache.MemcacheObject r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheObject r1 = (io.netty.handler.codec.memcache.MemcacheObject) r1
            boolean r1 = r0.isAggregated2(r1)
            return r1
    }

    protected boolean isContentLengthInvalid(H r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentLengthInvalid(java.lang.Object r1, int r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheMessage r1 = (io.netty.handler.codec.memcache.MemcacheMessage) r1
            boolean r1 = r0.isContentLengthInvalid(r1, r2)
            return r1
    }

    /* renamed from: isContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isContentMessage2(io.netty.handler.codec.memcache.MemcacheObject r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.memcache.MemcacheContent
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentMessage(io.netty.handler.codec.memcache.MemcacheObject r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheObject r1 = (io.netty.handler.codec.memcache.MemcacheObject) r1
            boolean r1 = r0.isContentMessage2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isLastContentMessage(io.netty.handler.codec.memcache.MemcacheContent r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheContent r1 = (io.netty.handler.codec.memcache.MemcacheContent) r1
            boolean r1 = r0.isLastContentMessage2(r1)
            return r1
    }

    /* renamed from: isLastContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isLastContentMessage2(io.netty.handler.codec.memcache.MemcacheContent r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.memcache.LastMemcacheContent
            return r1
    }

    protected java.lang.Object newContinueResponse(H r1, int r2, io.netty.channel.ChannelPipeline r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ java.lang.Object newContinueResponse(java.lang.Object r1, int r2, io.netty.channel.ChannelPipeline r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheMessage r1 = (io.netty.handler.codec.memcache.MemcacheMessage) r1
            java.lang.Object r1 = r0.newContinueResponse(r1, r2, r3)
            return r1
    }
}
