package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketFrameAggregator extends io.netty.handler.codec.MessageAggregator<io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame, io.netty.handler.codec.http.websocketx.WebSocketFrame> {
    public WebSocketFrameAggregator(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame beginAggregation(io.netty.handler.codec.http.websocketx.WebSocketFrame r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r1
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = r0.beginAggregation2(r1, r2)
            return r1
    }

    /* renamed from: beginAggregation, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.http.websocketx.WebSocketFrame beginAggregation2(io.netty.handler.codec.http.websocketx.WebSocketFrame r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            r1 = 1
            if (r0 == 0) goto Lf
            io.netty.handler.codec.http.websocketx.TextWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            int r3 = r3.rsv()
            r0.<init>(r1, r3, r4)
            return r0
        Lf:
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r0 == 0) goto L1d
            io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            int r3 = r3.rsv()
            r0.<init>(r1, r3, r4)
            return r0
        L1d:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>()
            throw r3
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
    protected boolean isAggregated2(io.netty.handler.codec.http.websocketx.WebSocketFrame r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r3.isFinalFragment()
            r1 = 1
            if (r0 == 0) goto Ld
            boolean r3 = r2.isContentMessage2(r3)
            r3 = r3 ^ r1
            return r3
        Ld:
            boolean r0 = r2.isStartMessage2(r3)
            if (r0 != 0) goto L1a
            boolean r3 = r2.isContentMessage2(r3)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            r3 = 0
            return r3
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isAggregated(io.netty.handler.codec.http.websocketx.WebSocketFrame r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r1
            boolean r1 = r0.isAggregated2(r1)
            return r1
    }

    /* renamed from: isContentLengthInvalid, reason: avoid collision after fix types in other method */
    protected boolean isContentLengthInvalid2(io.netty.handler.codec.http.websocketx.WebSocketFrame r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentLengthInvalid(io.netty.handler.codec.http.websocketx.WebSocketFrame r1, int r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r1
            boolean r1 = r0.isContentLengthInvalid2(r1, r2)
            return r1
    }

    /* renamed from: isContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isContentMessage2(io.netty.handler.codec.http.websocketx.WebSocketFrame r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentMessage(io.netty.handler.codec.http.websocketx.WebSocketFrame r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r1
            boolean r1 = r0.isContentMessage2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isLastContentMessage(io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = (io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame) r1
            boolean r1 = r0.isLastContentMessage2(r1)
            return r1
    }

    /* renamed from: isLastContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isLastContentMessage2(io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.isContentMessage2(r2)
            if (r0 == 0) goto Le
            boolean r2 = r2.isFinalFragment()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    /* renamed from: isStartMessage, reason: avoid collision after fix types in other method */
    protected boolean isStartMessage2(io.netty.handler.codec.http.websocketx.WebSocketFrame r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r0 != 0) goto Lb
            boolean r2 = r2 instanceof io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isStartMessage(io.netty.handler.codec.http.websocketx.WebSocketFrame r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r1
            boolean r1 = r0.isStartMessage2(r1)
            return r1
    }

    /* renamed from: newContinueResponse, reason: avoid collision after fix types in other method */
    protected java.lang.Object newContinueResponse2(io.netty.handler.codec.http.websocketx.WebSocketFrame r1, int r2, io.netty.channel.ChannelPipeline r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ java.lang.Object newContinueResponse(io.netty.handler.codec.http.websocketx.WebSocketFrame r1, int r2, io.netty.channel.ChannelPipeline r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r1
            java.lang.Object r1 = r0.newContinueResponse2(r1, r2, r3)
            return r1
    }
}
