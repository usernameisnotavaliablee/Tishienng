package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpObjectAggregator extends io.netty.handler.codec.MessageAggregator<io.netty.handler.codec.http.HttpObject, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.handler.codec.http.FullHttpMessage> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.handler.codec.http.FullHttpResponse CONTINUE = null;
    private static final io.netty.handler.codec.http.FullHttpResponse EXPECTATION_FAILED = null;
    private static final io.netty.handler.codec.http.FullHttpResponse TOO_LARGE = null;
    private static final io.netty.handler.codec.http.FullHttpResponse TOO_LARGE_CLOSE = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean closeOnExpectationFailed;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class AggregatedFullHttpMessage implements io.netty.handler.codec.http.FullHttpMessage {
        private final io.netty.buffer.ByteBuf content;
        protected final io.netty.handler.codec.http.HttpMessage message;
        private io.netty.handler.codec.http.HttpHeaders trailingHeaders;

        AggregatedFullHttpMessage(io.netty.handler.codec.http.HttpMessage r1, io.netty.buffer.ByteBuf r2, io.netty.handler.codec.http.HttpHeaders r3) {
                r0 = this;
                r0.<init>()
                r0.message = r1
                r0.content = r2
                r0.trailingHeaders = r3
                return
        }

        @Override // io.netty.buffer.ByteBufHolder
        public io.netty.buffer.ByteBuf content() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public abstract io.netty.handler.codec.http.FullHttpMessage copy();

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.DecoderResultProvider
        public io.netty.handler.codec.DecoderResult decoderResult() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.DecoderResult r0 = r0.decoderResult()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public abstract io.netty.handler.codec.http.FullHttpMessage duplicate();

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObject
        public io.netty.handler.codec.DecoderResult getDecoderResult() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.DecoderResult r0 = r0.decoderResult()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpMessage
        public io.netty.handler.codec.http.HttpVersion getProtocolVersion() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpVersion r0 = r0.protocolVersion()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpMessage
        public io.netty.handler.codec.http.HttpHeaders headers() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpMessage
        public io.netty.handler.codec.http.HttpVersion protocolVersion() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpVersion r0 = r0.protocolVersion()
                return r0
        }

        public int refCnt() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                int r0 = r0.refCnt()
                return r0
        }

        public boolean release() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                boolean r0 = r0.release()
                return r0
        }

        public boolean release(int r2) {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                boolean r2 = r0.release(r2)
                return r2
        }

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpMessage mo39retain() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                r0.retain()
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpMessage mo40retain(int r2) {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                r0.retain(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo40retain(r1)
                return r1
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo39retain()
                return r0
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public abstract io.netty.handler.codec.http.FullHttpMessage retainedDuplicate();

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.DecoderResultProvider
        public void setDecoderResult(io.netty.handler.codec.DecoderResult r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                r0.setDecoderResult(r2)
                return
        }

        @Override // io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                r0.setProtocolVersion(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.setProtocolVersion(r1)
                return r1
        }

        void setTrailingHeaders(io.netty.handler.codec.http.HttpHeaders r1) {
                r0 = this;
                r0.trailingHeaders = r1
                return
        }

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpMessage mo41touch() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                r0.touch()
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpMessage mo42touch(java.lang.Object r2) {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content
                r0.touch(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo42touch(r1)
                return r1
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpMessage r0 = r1.mo41touch()
                return r0
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpMessage r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent
        public io.netty.handler.codec.http.HttpHeaders trailingHeaders() {
                r1 = this;
                io.netty.handler.codec.http.HttpHeaders r0 = r1.trailingHeaders
                if (r0 != 0) goto L6
                io.netty.handler.codec.http.EmptyHttpHeaders r0 = io.netty.handler.codec.http.EmptyHttpHeaders.INSTANCE
            L6:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AggregatedFullHttpRequest extends io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage implements io.netty.handler.codec.http.FullHttpRequest {
        AggregatedFullHttpRequest(io.netty.handler.codec.http.HttpRequest r1, io.netty.buffer.ByteBuf r2, io.netty.handler.codec.http.HttpHeaders r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest copy() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.copy()
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest duplicate() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.duplicate()
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public io.netty.handler.codec.http.HttpMethod getMethod() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
                io.netty.handler.codec.http.HttpMethod r0 = r0.method()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public java.lang.String getUri() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
                java.lang.String r0 = r0.uri()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public io.netty.handler.codec.http.HttpMethod method() {
                r1 = this;
                io.netty.handler.codec.http.HttpMethod r0 = r1.getMethod()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest replace(io.netty.buffer.ByteBuf r8) {
                r7 = this;
                io.netty.handler.codec.http.DefaultFullHttpRequest r0 = new io.netty.handler.codec.http.DefaultFullHttpRequest
                io.netty.handler.codec.http.HttpVersion r1 = r7.protocolVersion()
                io.netty.handler.codec.http.HttpMethod r2 = r7.method()
                java.lang.String r3 = r7.uri()
                io.netty.handler.codec.http.HttpHeaders r4 = r7.headers()
                io.netty.handler.codec.http.HttpHeaders r5 = r4.copy()
                io.netty.handler.codec.http.HttpHeaders r4 = r7.trailingHeaders()
                io.netty.handler.codec.http.HttpHeaders r6 = r4.copy()
                r4 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                io.netty.handler.codec.DecoderResult r8 = r7.decoderResult()
                r0.setDecoderResult(r8)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpRequest mo39retain() {
                r0 = this;
                super.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpRequest mo40retain(int r1) {
                r0 = this;
                super.mo40retain(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest retainedDuplicate() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpRequest setMethod(io.netty.handler.codec.http.HttpMethod r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
                r0.setMethod(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpRequest setMethod(io.netty.handler.codec.http.HttpMethod r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setMethod(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpRequest setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                super.setProtocolVersion(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpRequest setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpRequest setUri(java.lang.String r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
                r0.setUri(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpRequest setUri(java.lang.String r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setUri(r1)
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 256(0x100, float:3.59E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = io.netty.handler.codec.http.HttpMessageUtil.appendFullRequest(r0, r2)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpRequest mo41touch() {
                r0 = this;
                super.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpRequest mo42touch(java.lang.Object r1) {
                r0 = this;
                super.mo42touch(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public java.lang.String uri() {
                r1 = this;
                java.lang.String r0 = r1.getUri()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AggregatedFullHttpResponse extends io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage implements io.netty.handler.codec.http.FullHttpResponse {
        AggregatedFullHttpResponse(io.netty.handler.codec.http.HttpResponse r1, io.netty.buffer.ByteBuf r2, io.netty.handler.codec.http.HttpHeaders r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpResponse copy() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.copy()
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpResponse duplicate() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.duplicate()
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpResponse
        public io.netty.handler.codec.http.HttpResponseStatus getStatus() {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
                io.netty.handler.codec.http.HttpResponseStatus r0 = r0.status()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpResponse replace(io.netty.buffer.ByteBuf r7) {
                r6 = this;
                io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
                io.netty.handler.codec.http.HttpVersion r1 = r6.getProtocolVersion()
                io.netty.handler.codec.http.HttpResponseStatus r2 = r6.getStatus()
                io.netty.handler.codec.http.HttpHeaders r3 = r6.headers()
                io.netty.handler.codec.http.HttpHeaders r4 = r3.copy()
                io.netty.handler.codec.http.HttpHeaders r3 = r6.trailingHeaders()
                io.netty.handler.codec.http.HttpHeaders r5 = r3.copy()
                r3 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                io.netty.handler.codec.DecoderResult r7 = r6.decoderResult()
                r0.setDecoderResult(r7)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent replace(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.replace(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpResponse mo39retain() {
                r0 = this;
                super.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpResponse mo40retain(int r1) {
                r0 = this;
                super.mo40retain(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpResponse retainedDuplicate() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpResponse setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                super.setProtocolVersion(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpResponse setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpResponse
        public io.netty.handler.codec.http.FullHttpResponse setStatus(io.netty.handler.codec.http.HttpResponseStatus r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpMessage r0 = r1.message
                io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
                r0.setStatus(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpResponse, io.netty.handler.codec.http.FullHttpResponse
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpResponse setStatus(io.netty.handler.codec.http.HttpResponseStatus r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.setStatus(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpResponse
        public io.netty.handler.codec.http.HttpResponseStatus status() {
                r1 = this;
                io.netty.handler.codec.http.HttpResponseStatus r0 = r1.getStatus()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 256(0x100, float:3.59E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = io.netty.handler.codec.http.HttpMessageUtil.appendFullResponse(r0, r2)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpResponse mo41touch() {
                r0 = this;
                super.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpResponse mo42touch(java.lang.Object r1) {
                r0 = this;
                super.mo42touch(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpResponse r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpResponse r1 = r0.mo42touch(r1)
                return r1
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http.HttpObjectAggregator> r0 = io.netty.handler.codec.http.HttpObjectAggregator.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http.HttpObjectAggregator.logger = r0
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.CONTINUE
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.http.HttpObjectAggregator.CONTINUE = r0
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.EXPECTATION_FAILED
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.http.HttpObjectAggregator.EXPECTATION_FAILED = r0
            io.netty.handler.codec.http.DefaultFullHttpResponse r2 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpResponseStatus r4 = io.netty.handler.codec.http.HttpResponseStatus.REQUEST_ENTITY_TOO_LARGE
            r2.<init>(r1, r4, r3)
            io.netty.handler.codec.http.HttpObjectAggregator.TOO_LARGE_CLOSE = r2
            io.netty.handler.codec.http.DefaultFullHttpResponse r5 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            r5.<init>(r1, r4, r3)
            io.netty.handler.codec.http.HttpObjectAggregator.TOO_LARGE = r5
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.set(r1, r3)
            io.netty.handler.codec.http.HttpHeaders r0 = r5.headers()
            r0.set(r1, r3)
            io.netty.handler.codec.http.HttpHeaders r0 = r2.headers()
            r0.set(r1, r3)
            io.netty.handler.codec.http.HttpHeaders r0 = r2.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.CLOSE
            r0.set(r1, r2)
            return
    }

    public HttpObjectAggregator(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public HttpObjectAggregator(int r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.closeOnExpectationFailed = r2
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http.HttpObjectAggregator.logger
            return r0
    }

    private static java.lang.Object continueResponse(io.netty.handler.codec.http.HttpMessage r3, int r4, io.netty.channel.ChannelPipeline r5) {
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isUnsupportedExpectation(r3)
            if (r0 == 0) goto L12
            io.netty.handler.codec.http.HttpExpectationFailedEvent r3 = io.netty.handler.codec.http.HttpExpectationFailedEvent.INSTANCE
            r5.fireUserEventTriggered(r3)
            io.netty.handler.codec.http.FullHttpResponse r3 = io.netty.handler.codec.http.HttpObjectAggregator.EXPECTATION_FAILED
            io.netty.handler.codec.http.FullHttpResponse r3 = r3.retainedDuplicate()
            return r3
        L12:
            boolean r0 = io.netty.handler.codec.http.HttpUtil.is100ContinueExpected(r3)
            if (r0 == 0) goto L36
            r0 = -1
            long r0 = io.netty.handler.codec.http.HttpUtil.getContentLength(r3, r0)
            long r3 = (long) r4
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L2a
            io.netty.handler.codec.http.FullHttpResponse r3 = io.netty.handler.codec.http.HttpObjectAggregator.CONTINUE
            io.netty.handler.codec.http.FullHttpResponse r3 = r3.retainedDuplicate()
            return r3
        L2a:
            io.netty.handler.codec.http.HttpExpectationFailedEvent r3 = io.netty.handler.codec.http.HttpExpectationFailedEvent.INSTANCE
            r5.fireUserEventTriggered(r3)
            io.netty.handler.codec.http.FullHttpResponse r3 = io.netty.handler.codec.http.HttpObjectAggregator.TOO_LARGE
            io.netty.handler.codec.http.FullHttpResponse r3 = r3.retainedDuplicate()
            return r3
        L36:
            r3 = 0
            return r3
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ void aggregate(io.netty.handler.codec.http.FullHttpMessage r1, io.netty.handler.codec.http.HttpContent r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.FullHttpMessage r1 = (io.netty.handler.codec.http.FullHttpMessage) r1
            io.netty.handler.codec.http.HttpContent r2 = (io.netty.handler.codec.http.HttpContent) r2
            r0.aggregate2(r1, r2)
            return
    }

    /* renamed from: aggregate, reason: avoid collision after fix types in other method */
    protected void aggregate2(io.netty.handler.codec.http.FullHttpMessage r2, io.netty.handler.codec.http.HttpContent r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r0 == 0) goto Lf
            io.netty.handler.codec.http.HttpObjectAggregator$AggregatedFullHttpMessage r2 = (io.netty.handler.codec.http.HttpObjectAggregator.AggregatedFullHttpMessage) r2
            io.netty.handler.codec.http.LastHttpContent r3 = (io.netty.handler.codec.http.LastHttpContent) r3
            io.netty.handler.codec.http.HttpHeaders r3 = r3.trailingHeaders()
            r2.setTrailingHeaders(r3)
        Lf:
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage beginAggregation(io.netty.handler.codec.http.HttpMessage r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpMessage r1 = (io.netty.handler.codec.http.HttpMessage) r1
            io.netty.handler.codec.http.FullHttpMessage r1 = r0.beginAggregation2(r1, r2)
            return r1
    }

    /* renamed from: beginAggregation, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.http.FullHttpMessage beginAggregation2(io.netty.handler.codec.http.HttpMessage r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            io.netty.handler.codec.http.HttpUtil.setTransferEncodingChunked(r3, r0)
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpRequest
            r1 = 0
            if (r0 == 0) goto L11
            io.netty.handler.codec.http.HttpObjectAggregator$AggregatedFullHttpRequest r0 = new io.netty.handler.codec.http.HttpObjectAggregator$AggregatedFullHttpRequest
            io.netty.handler.codec.http.HttpRequest r3 = (io.netty.handler.codec.http.HttpRequest) r3
            r0.<init>(r3, r4, r1)
            return r0
        L11:
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L1d
            io.netty.handler.codec.http.HttpObjectAggregator$AggregatedFullHttpResponse r0 = new io.netty.handler.codec.http.HttpObjectAggregator$AggregatedFullHttpResponse
            io.netty.handler.codec.http.HttpResponse r3 = (io.netty.handler.codec.http.HttpResponse) r3
            r0.<init>(r3, r4, r1)
            return r0
        L1d:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>()
            throw r3
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected boolean closeAfterContinueResponse(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.closeOnExpectationFailed
            if (r0 == 0) goto Lc
            boolean r2 = r1.ignoreContentAfterContinueResponse(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ void finishAggregation(io.netty.handler.codec.http.FullHttpMessage r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.FullHttpMessage r1 = (io.netty.handler.codec.http.FullHttpMessage) r1
            r0.finishAggregation2(r1)
            return
    }

    /* renamed from: finishAggregation, reason: avoid collision after fix types in other method */
    protected void finishAggregation2(io.netty.handler.codec.http.FullHttpMessage r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isContentLengthSet(r3)
            if (r0 != 0) goto L1b
            io.netty.handler.codec.http.HttpHeaders r0 = r3.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            io.netty.buffer.ByteBuf r3 = r3.content()
            int r3 = r3.readableBytes()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.set(r1, r3)
        L1b:
            return
    }

    /* renamed from: handleOversizedMessage, reason: avoid collision after fix types in other method */
    protected void handleOversizedMessage2(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http.HttpMessage r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L3b
            boolean r0 = r4 instanceof io.netty.handler.codec.http.FullHttpMessage
            if (r0 != 0) goto L28
            boolean r0 = io.netty.handler.codec.http.HttpUtil.is100ContinueExpected(r4)
            if (r0 != 0) goto L15
            boolean r4 = io.netty.handler.codec.http.HttpUtil.isKeepAlive(r4)
            if (r4 != 0) goto L15
            goto L28
        L15:
            io.netty.handler.codec.http.FullHttpResponse r4 = io.netty.handler.codec.http.HttpObjectAggregator.TOO_LARGE
            io.netty.handler.codec.http.FullHttpResponse r4 = r4.retainedDuplicate()
            io.netty.channel.ChannelFuture r4 = r3.writeAndFlush(r4)
            io.netty.handler.codec.http.HttpObjectAggregator$2 r0 = new io.netty.handler.codec.http.HttpObjectAggregator$2
            r0.<init>(r2, r3)
            r4.addListener(r0)
            return
        L28:
            io.netty.handler.codec.http.FullHttpResponse r4 = io.netty.handler.codec.http.HttpObjectAggregator.TOO_LARGE_CLOSE
            io.netty.handler.codec.http.FullHttpResponse r4 = r4.retainedDuplicate()
            io.netty.channel.ChannelFuture r4 = r3.writeAndFlush(r4)
            io.netty.handler.codec.http.HttpObjectAggregator$1 r0 = new io.netty.handler.codec.http.HttpObjectAggregator$1
            r0.<init>(r2, r3)
            r4.addListener(r0)
            return
        L3b:
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L59
            r3.close()
            io.netty.handler.codec.TooLongFrameException r3 = new io.netty.handler.codec.TooLongFrameException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Response entity too large: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L59:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ void handleOversizedMessage(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpMessage r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpMessage r2 = (io.netty.handler.codec.http.HttpMessage) r2
            r0.handleOversizedMessage2(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected boolean ignoreContentAfterContinueResponse(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L15
            io.netty.handler.codec.http.HttpResponse r2 = (io.netty.handler.codec.http.HttpResponse) r2
            io.netty.handler.codec.http.HttpResponseStatus r2 = r2.status()
            io.netty.handler.codec.http.HttpStatusClass r2 = r2.codeClass()
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.CLIENT_ERROR
            boolean r2 = r2.equals(r0)
            return r2
        L15:
            r2 = 0
            return r2
    }

    /* renamed from: isAggregated, reason: avoid collision after fix types in other method */
    protected boolean isAggregated2(io.netty.handler.codec.http.HttpObject r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.http.FullHttpMessage
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isAggregated(io.netty.handler.codec.http.HttpObject r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r1 = (io.netty.handler.codec.http.HttpObject) r1
            boolean r1 = r0.isAggregated2(r1)
            return r1
    }

    /* renamed from: isContentLengthInvalid, reason: avoid collision after fix types in other method */
    protected boolean isContentLengthInvalid2(io.netty.handler.codec.http.HttpMessage r5, int r6) {
            r4 = this;
            r0 = -1
            r2 = 0
            long r0 = io.netty.handler.codec.http.HttpUtil.getContentLength(r5, r0)     // Catch: java.lang.NumberFormatException -> Le
            long r5 = (long) r6
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            r5 = 1
            return r5
        Le:
            return r2
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentLengthInvalid(io.netty.handler.codec.http.HttpMessage r1, int r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpMessage r1 = (io.netty.handler.codec.http.HttpMessage) r1
            boolean r1 = r0.isContentLengthInvalid2(r1, r2)
            return r1
    }

    /* renamed from: isContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isContentMessage2(io.netty.handler.codec.http.HttpObject r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.http.HttpContent
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentMessage(io.netty.handler.codec.http.HttpObject r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r1 = (io.netty.handler.codec.http.HttpObject) r1
            boolean r1 = r0.isContentMessage2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isLastContentMessage(io.netty.handler.codec.http.HttpContent r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = (io.netty.handler.codec.http.HttpContent) r1
            boolean r1 = r0.isLastContentMessage2(r1)
            return r1
    }

    /* renamed from: isLastContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isLastContentMessage2(io.netty.handler.codec.http.HttpContent r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.http.LastHttpContent
            return r1
    }

    /* renamed from: isStartMessage, reason: avoid collision after fix types in other method */
    protected boolean isStartMessage2(io.netty.handler.codec.http.HttpObject r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.http.HttpMessage
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isStartMessage(io.netty.handler.codec.http.HttpObject r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r1 = (io.netty.handler.codec.http.HttpObject) r1
            boolean r1 = r0.isStartMessage2(r1)
            return r1
    }

    /* renamed from: newContinueResponse, reason: avoid collision after fix types in other method */
    protected java.lang.Object newContinueResponse2(io.netty.handler.codec.http.HttpMessage r1, int r2, io.netty.channel.ChannelPipeline r3) {
            r0 = this;
            java.lang.Object r2 = continueResponse(r1, r2, r3)
            if (r2 == 0) goto Lf
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.EXPECT
            r1.remove(r3)
        Lf:
            return r2
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ java.lang.Object newContinueResponse(io.netty.handler.codec.http.HttpMessage r1, int r2, io.netty.channel.ChannelPipeline r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpMessage r1 = (io.netty.handler.codec.http.HttpMessage) r1
            java.lang.Object r1 = r0.newContinueResponse2(r1, r2, r3)
            return r1
    }
}
