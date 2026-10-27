package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StompSubframeAggregator extends io.netty.handler.codec.MessageAggregator<io.netty.handler.codec.stomp.StompSubframe, io.netty.handler.codec.stomp.StompHeadersSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.handler.codec.stomp.StompFrame> {
    public StompSubframeAggregator(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompFrame beginAggregation(io.netty.handler.codec.stomp.StompHeadersSubframe r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompHeadersSubframe r1 = (io.netty.handler.codec.stomp.StompHeadersSubframe) r1
            io.netty.handler.codec.stomp.StompFrame r1 = r0.beginAggregation2(r1, r2)
            return r1
    }

    /* renamed from: beginAggregation, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.stomp.StompFrame beginAggregation2(io.netty.handler.codec.stomp.StompHeadersSubframe r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.stomp.DefaultStompFrame r0 = new io.netty.handler.codec.stomp.DefaultStompFrame
            io.netty.handler.codec.stomp.StompCommand r1 = r3.command()
            r0.<init>(r1, r4)
            io.netty.handler.codec.stomp.StompHeaders r4 = r0.headers()
            io.netty.handler.codec.stomp.StompHeaders r3 = r3.headers()
            r4.set(r3)
            return r0
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
    protected boolean isAggregated2(io.netty.handler.codec.stomp.StompSubframe r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.stomp.StompFrame
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isAggregated(io.netty.handler.codec.stomp.StompSubframe r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompSubframe r1 = (io.netty.handler.codec.stomp.StompSubframe) r1
            boolean r1 = r0.isAggregated2(r1)
            return r1
    }

    /* renamed from: isContentLengthInvalid, reason: avoid collision after fix types in other method */
    protected boolean isContentLengthInvalid2(io.netty.handler.codec.stomp.StompHeadersSubframe r5, int r6) {
            r4 = this;
            io.netty.handler.codec.stomp.StompHeaders r5 = r5.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.stomp.StompHeaders.CONTENT_LENGTH
            r1 = -1
            long r0 = r5.getLong(r0, r1)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r2, r0)
            int r5 = (int) r0
            if (r5 <= r6) goto L18
            r5 = 1
            return r5
        L18:
            r5 = 0
            return r5
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentLengthInvalid(io.netty.handler.codec.stomp.StompHeadersSubframe r1, int r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompHeadersSubframe r1 = (io.netty.handler.codec.stomp.StompHeadersSubframe) r1
            boolean r1 = r0.isContentLengthInvalid2(r1, r2)
            return r1
    }

    /* renamed from: isContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isContentMessage2(io.netty.handler.codec.stomp.StompSubframe r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.stomp.StompContentSubframe
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentMessage(io.netty.handler.codec.stomp.StompSubframe r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompSubframe r1 = (io.netty.handler.codec.stomp.StompSubframe) r1
            boolean r1 = r0.isContentMessage2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isLastContentMessage(io.netty.handler.codec.stomp.StompContentSubframe r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r1 = (io.netty.handler.codec.stomp.StompContentSubframe) r1
            boolean r1 = r0.isLastContentMessage2(r1)
            return r1
    }

    /* renamed from: isLastContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isLastContentMessage2(io.netty.handler.codec.stomp.StompContentSubframe r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.stomp.LastStompContentSubframe
            return r1
    }

    /* renamed from: isStartMessage, reason: avoid collision after fix types in other method */
    protected boolean isStartMessage2(io.netty.handler.codec.stomp.StompSubframe r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.stomp.StompHeadersSubframe
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isStartMessage(io.netty.handler.codec.stomp.StompSubframe r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompSubframe r1 = (io.netty.handler.codec.stomp.StompSubframe) r1
            boolean r1 = r0.isStartMessage2(r1)
            return r1
    }

    /* renamed from: newContinueResponse, reason: avoid collision after fix types in other method */
    protected java.lang.Object newContinueResponse2(io.netty.handler.codec.stomp.StompHeadersSubframe r1, int r2, io.netty.channel.ChannelPipeline r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ java.lang.Object newContinueResponse(io.netty.handler.codec.stomp.StompHeadersSubframe r1, int r2, io.netty.channel.ChannelPipeline r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.stomp.StompHeadersSubframe r1 = (io.netty.handler.codec.stomp.StompHeadersSubframe) r1
            java.lang.Object r1 = r0.newContinueResponse2(r1, r2, r3)
            return r1
    }
}
