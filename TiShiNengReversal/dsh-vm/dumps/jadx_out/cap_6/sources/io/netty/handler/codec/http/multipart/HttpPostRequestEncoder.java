package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpPostRequestEncoder implements io.netty.handler.stream.ChunkedInput<io.netty.handler.codec.http.HttpContent> {
    private static final java.util.Map.Entry[] percentEncodings = null;
    private final java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> bodyListDatas;
    private final java.nio.charset.Charset charset;
    private io.netty.buffer.ByteBuf currentBuffer;
    private io.netty.handler.codec.http.multipart.InterfaceHttpData currentData;
    private io.netty.handler.codec.http.multipart.FileUpload currentFileUpload;
    private boolean duringMixedMode;
    private final io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode encoderMode;
    private final io.netty.handler.codec.http.multipart.HttpDataFactory factory;
    private long globalBodySize;
    private long globalProgress;
    private boolean headerFinalized;
    private boolean isChunked;
    private boolean isKey;
    private boolean isLastChunk;
    private boolean isLastChunkSent;
    private final boolean isMultipart;
    private java.util.ListIterator<io.netty.handler.codec.http.multipart.InterfaceHttpData> iterator;
    java.lang.String multipartDataBoundary;
    final java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> multipartHttpDatas;
    java.lang.String multipartMixedBoundary;
    private final io.netty.handler.codec.http.HttpRequest request;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum EncoderMode extends java.lang.Enum<io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode> {
        private static final /* synthetic */ io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode[] $VALUES = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode HTML5 = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode RFC1738 = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode RFC3986 = null;

        static {
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode
                java.lang.String r1 = "RFC1738"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.RFC1738 = r0
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode
                java.lang.String r3 = "RFC3986"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.RFC3986 = r1
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r3 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode
                java.lang.String r5 = "HTML5"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.HTML5 = r3
                r5 = 3
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode[] r5 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.$VALUES = r5
                return
        }

        EncoderMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode> r0 = io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r1 = (io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode) r1
                return r1
        }

        public static io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode[] values() {
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode[] r0 = io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode[] r0 = (io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ErrorDataEncoderException extends java.lang.Exception {
        private static final long serialVersionUID = 5020247425493164465L;

        public ErrorDataEncoderException() {
                r0 = this;
                r0.<init>()
                return
        }

        public ErrorDataEncoderException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ErrorDataEncoderException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public ErrorDataEncoderException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class WrappedFullHttpRequest extends io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest implements io.netty.handler.codec.http.FullHttpRequest {
        private final io.netty.handler.codec.http.HttpContent content;

        private WrappedFullHttpRequest(io.netty.handler.codec.http.HttpRequest r1, io.netty.handler.codec.http.HttpContent r2) {
                r0 = this;
                r0.<init>(r1)
                r0.content = r2
                return
        }

        /* synthetic */ WrappedFullHttpRequest(io.netty.handler.codec.http.HttpRequest r1, io.netty.handler.codec.http.HttpContent r2, io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.netty.buffer.ByteBufHolder
        public io.netty.buffer.ByteBuf content() {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                io.netty.buffer.ByteBuf r0 = r0.content()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest copy() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.copy()
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent copy() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.copy()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest duplicate() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.duplicate()
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent duplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.duplicate()
                return r0
        }

        public int refCnt() {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                int r0 = r0.refCnt()
                return r0
        }

        public boolean release() {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                boolean r0 = r0.release()
                return r0
        }

        public boolean release(int r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                boolean r2 = r0.release(r2)
                return r2
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

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest replace(io.netty.buffer.ByteBuf r5) {
                r4 = this;
                io.netty.handler.codec.http.DefaultFullHttpRequest r0 = new io.netty.handler.codec.http.DefaultFullHttpRequest
                io.netty.handler.codec.http.HttpVersion r1 = r4.protocolVersion()
                io.netty.handler.codec.http.HttpMethod r2 = r4.method()
                java.lang.String r3 = r4.uri()
                r0.<init>(r1, r2, r3, r5)
                io.netty.handler.codec.http.HttpHeaders r5 = r0.headers()
                io.netty.handler.codec.http.HttpHeaders r1 = r4.headers()
                r5.set(r1)
                io.netty.handler.codec.http.HttpHeaders r5 = r0.trailingHeaders()
                io.netty.handler.codec.http.HttpHeaders r1 = r4.trailingHeaders()
                r5.set(r1)
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

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpRequest mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                r0.mo39retain()
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public io.netty.handler.codec.http.FullHttpRequest mo40retain(int r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                r0.mo40retain(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo39retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: retain */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo40retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo39retain()
                return r0
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo40retain(r1)
                return r1
        }

        @Override // io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public io.netty.handler.codec.http.FullHttpRequest retainedDuplicate() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.content()
                io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.replace(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent retainedDuplicate() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.retainedDuplicate()
                return r0
        }

        @Override // io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpRequest setMethod(io.netty.handler.codec.http.HttpMethod r1) {
                r0 = this;
                super.setMethod(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpRequest setMethod(io.netty.handler.codec.http.HttpMethod r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setMethod(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpRequest setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                super.setProtocolVersion(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpRequest setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.FullHttpRequest setUri(java.lang.String r1) {
                r0 = this;
                super.setUri(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.WrappedHttpRequest, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpRequest setUri(java.lang.String r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.setUri(r1)
                return r1
        }

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.FullHttpMessage mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpRequest mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                r0.mo41touch()
                return r1
        }

        @Override // io.netty.handler.codec.http.FullHttpRequest, io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public io.netty.handler.codec.http.FullHttpRequest mo42touch(java.lang.Object r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpContent r0 = r1.content
                r0.mo42touch(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo41touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
        /* renamed from: touch */
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.LastHttpContent mo42touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.mo41touch()
                return r0
        }

        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.FullHttpRequest r1 = r0.mo42touch(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.LastHttpContent
        public io.netty.handler.codec.http.HttpHeaders trailingHeaders() {
                r2 = this;
                io.netty.handler.codec.http.HttpContent r0 = r2.content
                boolean r1 = r0 instanceof io.netty.handler.codec.http.LastHttpContent
                if (r1 == 0) goto Ld
                io.netty.handler.codec.http.LastHttpContent r0 = (io.netty.handler.codec.http.LastHttpContent) r0
                io.netty.handler.codec.http.HttpHeaders r0 = r0.trailingHeaders()
                return r0
            Ld:
                io.netty.handler.codec.http.EmptyHttpHeaders r0 = io.netty.handler.codec.http.EmptyHttpHeaders.INSTANCE
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class WrappedHttpRequest implements io.netty.handler.codec.http.HttpRequest {
        private final io.netty.handler.codec.http.HttpRequest request;

        WrappedHttpRequest(io.netty.handler.codec.http.HttpRequest r1) {
                r0 = this;
                r0.<init>()
                r0.request = r1
                return
        }

        @Override // io.netty.handler.codec.DecoderResultProvider
        public io.netty.handler.codec.DecoderResult decoderResult() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                io.netty.handler.codec.DecoderResult r0 = r0.decoderResult()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObject
        @java.lang.Deprecated
        public io.netty.handler.codec.DecoderResult getDecoderResult() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                io.netty.handler.codec.DecoderResult r0 = r0.getDecoderResult()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public io.netty.handler.codec.http.HttpMethod getMethod() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                io.netty.handler.codec.http.HttpMethod r0 = r0.method()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpMessage
        public io.netty.handler.codec.http.HttpVersion getProtocolVersion() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                io.netty.handler.codec.http.HttpVersion r0 = r0.protocolVersion()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public java.lang.String getUri() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                java.lang.String r0 = r0.uri()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpMessage
        public io.netty.handler.codec.http.HttpHeaders headers() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public io.netty.handler.codec.http.HttpMethod method() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                io.netty.handler.codec.http.HttpMethod r0 = r0.method()
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpMessage
        public io.netty.handler.codec.http.HttpVersion protocolVersion() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                io.netty.handler.codec.http.HttpVersion r0 = r0.protocolVersion()
                return r0
        }

        @Override // io.netty.handler.codec.DecoderResultProvider
        public void setDecoderResult(io.netty.handler.codec.DecoderResult r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                r0.setDecoderResult(r2)
                return
        }

        @Override // io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.HttpRequest setMethod(io.netty.handler.codec.http.HttpMethod r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                r0.setMethod(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1) {
                r0 = this;
                io.netty.handler.codec.http.HttpRequest r1 = r0.setProtocolVersion(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.HttpRequest setProtocolVersion(io.netty.handler.codec.http.HttpVersion r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                r0.setProtocolVersion(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
        public io.netty.handler.codec.http.HttpRequest setUri(java.lang.String r2) {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                r0.setUri(r2)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpRequest
        public java.lang.String uri() {
                r1 = this;
                io.netty.handler.codec.http.HttpRequest r0 = r1.request
                java.lang.String r0 = r0.uri()
                return r0
        }
    }

    static {
            java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
            java.lang.String r1 = "\\*"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.lang.String r2 = "%2A"
            r0.<init>(r1, r2)
            java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
            java.lang.String r2 = "\\+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r3 = "%20"
            r1.<init>(r2, r3)
            java.util.AbstractMap$SimpleImmutableEntry r2 = new java.util.AbstractMap$SimpleImmutableEntry
            java.lang.String r3 = "~"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.lang.String r4 = "%7E"
            r2.<init>(r3, r4)
            r3 = 3
            java.util.Map$Entry[] r3 = new java.util.Map.Entry[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.percentEncodings = r3
            return
    }

    public HttpPostRequestEncoder(io.netty.handler.codec.http.HttpRequest r7, boolean r8) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r6 = this;
            io.netty.handler.codec.http.multipart.DefaultHttpDataFactory r1 = new io.netty.handler.codec.http.multipart.DefaultHttpDataFactory
            r2 = 16384(0x4000, double:8.095E-320)
            r1.<init>(r2)
            java.nio.charset.Charset r4 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r5 = io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.RFC1738
            r0 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public HttpPostRequestEncoder(io.netty.handler.codec.http.multipart.HttpDataFactory r7, io.netty.handler.codec.http.HttpRequest r8, boolean r9) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r6 = this;
            java.nio.charset.Charset r4 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r5 = io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.RFC1738
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public HttpPostRequestEncoder(io.netty.handler.codec.http.multipart.HttpDataFactory r2, io.netty.handler.codec.http.HttpRequest r3, boolean r4, java.nio.charset.Charset r5, io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode r6) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isKey = r0
            java.lang.String r0 = "request"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            r1.request = r0
            java.lang.String r0 = "charset"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.nio.charset.Charset r5 = (java.nio.charset.Charset) r5
            r1.charset = r5
            java.lang.String r5 = "factory"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r5)
            io.netty.handler.codec.http.multipart.HttpDataFactory r2 = (io.netty.handler.codec.http.multipart.HttpDataFactory) r2
            r1.factory = r2
            io.netty.handler.codec.http.HttpMethod r2 = io.netty.handler.codec.http.HttpMethod.TRACE
            io.netty.handler.codec.http.HttpMethod r3 = r3.method()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.bodyListDatas = r2
            r2 = 0
            r1.isLastChunk = r2
            r1.isLastChunkSent = r2
            r1.isMultipart = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.multipartHttpDatas = r2
            r1.encoderMode = r6
            if (r4 == 0) goto L4c
            r1.initDataMultipart()
        L4c:
            return
        L4d:
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r2 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            java.lang.String r3 = "Cannot create a Encoder if request is a TRACE"
            r2.<init>(r3)
            throw r2
    }

    private int calculateRemainingSize() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.currentBuffer
            r1 = 8096(0x1fa0, float:1.1345E-41)
            if (r0 == 0) goto Lb
            int r0 = r0.readableBytes()
            int r1 = r1 - r0
        Lb:
            return r1
    }

    private java.lang.String encodeAttribute(java.lang.String r6, java.nio.charset.Charset r7) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r6 = ""
            return r6
        L5:
            java.lang.String r0 = r7.name()     // Catch: java.io.UnsupportedEncodingException -> L32
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r0)     // Catch: java.io.UnsupportedEncodingException -> L32
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r0 = r5.encoderMode     // Catch: java.io.UnsupportedEncodingException -> L32
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r1 = io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.RFC3986     // Catch: java.io.UnsupportedEncodingException -> L32
            if (r0 != r1) goto L34
            java.util.Map$Entry[] r0 = io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.percentEncodings     // Catch: java.io.UnsupportedEncodingException -> L32
            int r1 = r0.length     // Catch: java.io.UnsupportedEncodingException -> L32
            r2 = 0
        L17:
            if (r2 >= r1) goto L34
            r3 = r0[r2]     // Catch: java.io.UnsupportedEncodingException -> L32
            java.lang.Object r4 = r3.getValue()     // Catch: java.io.UnsupportedEncodingException -> L32
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.io.UnsupportedEncodingException -> L32
            java.lang.Object r3 = r3.getKey()     // Catch: java.io.UnsupportedEncodingException -> L32
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3     // Catch: java.io.UnsupportedEncodingException -> L32
            java.util.regex.Matcher r6 = r3.matcher(r6)     // Catch: java.io.UnsupportedEncodingException -> L32
            java.lang.String r6 = r6.replaceAll(r4)     // Catch: java.io.UnsupportedEncodingException -> L32
            int r2 = r2 + 1
            goto L17
        L32:
            r6 = move-exception
            goto L35
        L34:
            return r6
        L35:
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            java.lang.String r7 = r7.name()
            r0.<init>(r7, r6)
            throw r0
    }

    private io.netty.handler.codec.http.HttpContent encodeNextChunkMultipart(int r5) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r4 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r4.currentData
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0 instanceof io.netty.handler.codec.http.multipart.InternalAttribute
            if (r2 == 0) goto L13
            io.netty.handler.codec.http.multipart.InternalAttribute r0 = (io.netty.handler.codec.http.multipart.InternalAttribute) r0
            io.netty.buffer.ByteBuf r5 = r0.toByteBuf()
            r4.currentData = r1
            goto L22
        L13:
            io.netty.handler.codec.http.multipart.HttpData r0 = (io.netty.handler.codec.http.multipart.HttpData) r0     // Catch: java.io.IOException -> L4f
            io.netty.buffer.ByteBuf r5 = r0.getChunk(r5)     // Catch: java.io.IOException -> L4f
            int r0 = r5.capacity()
            if (r0 != 0) goto L22
            r4.currentData = r1
            return r1
        L22:
            io.netty.buffer.ByteBuf r0 = r4.currentBuffer
            if (r0 != 0) goto L29
            r4.currentBuffer = r5
            goto L38
        L29:
            r2 = 2
            io.netty.buffer.ByteBuf[] r2 = new io.netty.buffer.ByteBuf[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r5
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.wrappedBuffer(r2)
            r4.currentBuffer = r5
        L38:
            io.netty.buffer.ByteBuf r5 = r4.currentBuffer
            int r5 = r5.readableBytes()
            r0 = 8096(0x1fa0, float:1.1345E-41)
            if (r5 >= r0) goto L45
            r4.currentData = r1
            return r1
        L45:
            io.netty.buffer.ByteBuf r5 = r4.fillByteBuf()
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            r0.<init>(r5)
            return r0
        L4f:
            r5 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            r0.<init>(r5)
            throw r0
    }

    private io.netty.handler.codec.http.HttpContent encodeNextChunkUrlEncoded(int r11) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r10 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r10.currentData
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r10.isKey
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 8096(0x1fa0, float:1.1345E-41)
            r7 = 1
            if (r2 == 0) goto L67
            java.lang.String r0 = r0.getName()
            byte[] r0 = r0.getBytes()
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            r10.isKey = r5
            io.netty.buffer.ByteBuf r2 = r10.currentBuffer
            java.lang.String r8 = "="
            if (r2 != 0) goto L39
            byte[] r2 = r8.getBytes()
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.wrappedBuffer(r2)
            io.netty.buffer.ByteBuf[] r8 = new io.netty.buffer.ByteBuf[r4]
            r8[r5] = r0
            r8[r7] = r2
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.wrappedBuffer(r8)
            r10.currentBuffer = r2
            goto L4f
        L39:
            byte[] r8 = r8.getBytes()
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.wrappedBuffer(r8)
            io.netty.buffer.ByteBuf[] r9 = new io.netty.buffer.ByteBuf[r3]
            r9[r5] = r2
            r9[r7] = r0
            r9[r4] = r8
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.wrappedBuffer(r9)
            r10.currentBuffer = r2
        L4f:
            int r0 = r0.readableBytes()
            int r0 = r0 + r7
            int r11 = r11 - r0
            io.netty.buffer.ByteBuf r0 = r10.currentBuffer
            int r0 = r0.readableBytes()
            if (r0 < r6) goto L67
            io.netty.buffer.ByteBuf r11 = r10.fillByteBuf()
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            r0.<init>(r11)
            return r0
        L67:
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r10.currentData     // Catch: java.io.IOException -> L108
            io.netty.handler.codec.http.multipart.HttpData r0 = (io.netty.handler.codec.http.multipart.HttpData) r0     // Catch: java.io.IOException -> L108
            io.netty.buffer.ByteBuf r0 = r0.getChunk(r11)     // Catch: java.io.IOException -> L108
            int r2 = r0.readableBytes()
            if (r2 >= r11) goto L8a
            r10.isKey = r7
            java.util.ListIterator<io.netty.handler.codec.http.multipart.InterfaceHttpData> r11 = r10.iterator
            boolean r11 = r11.hasNext()
            if (r11 == 0) goto L8a
            java.lang.String r11 = "&"
            byte[] r11 = r11.getBytes()
            io.netty.buffer.ByteBuf r11 = io.netty.buffer.Unpooled.wrappedBuffer(r11)
            goto L8b
        L8a:
            r11 = r1
        L8b:
            int r2 = r0.capacity()
            if (r2 != 0) goto Lbe
            r10.currentData = r1
            io.netty.buffer.ByteBuf r0 = r10.currentBuffer
            if (r0 != 0) goto L9d
            if (r11 != 0) goto L9a
            return r1
        L9a:
            r10.currentBuffer = r11
            goto Lab
        L9d:
            if (r11 == 0) goto Lab
            io.netty.buffer.ByteBuf[] r2 = new io.netty.buffer.ByteBuf[r4]
            r2[r5] = r0
            r2[r7] = r11
            io.netty.buffer.ByteBuf r11 = io.netty.buffer.Unpooled.wrappedBuffer(r2)
            r10.currentBuffer = r11
        Lab:
            io.netty.buffer.ByteBuf r11 = r10.currentBuffer
            int r11 = r11.readableBytes()
            if (r11 < r6) goto Lbd
            io.netty.buffer.ByteBuf r11 = r10.fillByteBuf()
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            r0.<init>(r11)
            return r0
        Lbd:
            return r1
        Lbe:
            io.netty.buffer.ByteBuf r2 = r10.currentBuffer
            if (r2 != 0) goto Ld4
            if (r11 == 0) goto Ld1
            io.netty.buffer.ByteBuf[] r2 = new io.netty.buffer.ByteBuf[r4]
            r2[r5] = r0
            r2[r7] = r11
            io.netty.buffer.ByteBuf r11 = io.netty.buffer.Unpooled.wrappedBuffer(r2)
            r10.currentBuffer = r11
            goto Lf1
        Ld1:
            r10.currentBuffer = r0
            goto Lf1
        Ld4:
            if (r11 == 0) goto Le5
            io.netty.buffer.ByteBuf[] r3 = new io.netty.buffer.ByteBuf[r3]
            r3[r5] = r2
            r3[r7] = r0
            r3[r4] = r11
            io.netty.buffer.ByteBuf r11 = io.netty.buffer.Unpooled.wrappedBuffer(r3)
            r10.currentBuffer = r11
            goto Lf1
        Le5:
            io.netty.buffer.ByteBuf[] r11 = new io.netty.buffer.ByteBuf[r4]
            r11[r5] = r2
            r11[r7] = r0
            io.netty.buffer.ByteBuf r11 = io.netty.buffer.Unpooled.wrappedBuffer(r11)
            r10.currentBuffer = r11
        Lf1:
            io.netty.buffer.ByteBuf r11 = r10.currentBuffer
            int r11 = r11.readableBytes()
            if (r11 >= r6) goto Lfe
            r10.currentData = r1
            r10.isKey = r7
            return r1
        Lfe:
            io.netty.buffer.ByteBuf r11 = r10.fillByteBuf()
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            r0.<init>(r11)
            return r0
        L108:
            r11 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            r0.<init>(r11)
            throw r0
    }

    private io.netty.buffer.ByteBuf fillByteBuf() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.currentBuffer
            int r0 = r0.readableBytes()
            r1 = 8096(0x1fa0, float:1.1345E-41)
            if (r0 <= r1) goto L11
            io.netty.buffer.ByteBuf r0 = r2.currentBuffer
            io.netty.buffer.ByteBuf r0 = r0.readRetainedSlice(r1)
            return r0
        L11:
            io.netty.buffer.ByteBuf r0 = r2.currentBuffer
            r1 = 0
            r2.currentBuffer = r1
            return r0
    }

    private static java.lang.String getNewMultipartDelimiter() {
            java.util.Random r0 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            return r0
    }

    private void initDataMultipart() {
            r1 = this;
            java.lang.String r0 = getNewMultipartDelimiter()
            r1.multipartDataBoundary = r0
            return
    }

    private void initMixedMultipart() {
            r1 = this;
            java.lang.String r0 = getNewMultipartDelimiter()
            r1.multipartMixedBoundary = r0
            return
    }

    private io.netty.handler.codec.http.HttpContent lastChunk() {
            r2 = this;
            r0 = 1
            r2.isLastChunk = r0
            io.netty.buffer.ByteBuf r1 = r2.currentBuffer
            if (r1 != 0) goto Lc
            r2.isLastChunkSent = r0
            io.netty.handler.codec.http.LastHttpContent r0 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            return r0
        Lc:
            r0 = 0
            r2.currentBuffer = r0
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            r0.<init>(r1)
            return r0
    }

    private io.netty.handler.codec.http.HttpContent nextChunk() throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r2 = this;
            boolean r0 = r2.isLastChunk
            if (r0 == 0) goto La
            r0 = 1
            r2.isLastChunkSent = r0
            io.netty.handler.codec.http.LastHttpContent r0 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            return r0
        La:
            int r0 = r2.calculateRemainingSize()
            if (r0 > 0) goto L1a
            io.netty.buffer.ByteBuf r0 = r2.fillByteBuf()
            io.netty.handler.codec.http.DefaultHttpContent r1 = new io.netty.handler.codec.http.DefaultHttpContent
            r1.<init>(r0)
            return r1
        L1a:
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = r2.currentData
            if (r1 == 0) goto L32
            boolean r1 = r2.isMultipart
            if (r1 == 0) goto L27
            io.netty.handler.codec.http.HttpContent r0 = r2.encodeNextChunkMultipart(r0)
            goto L2b
        L27:
            io.netty.handler.codec.http.HttpContent r0 = r2.encodeNextChunkUrlEncoded(r0)
        L2b:
            if (r0 == 0) goto L2e
            return r0
        L2e:
            int r0 = r2.calculateRemainingSize()
        L32:
            java.util.ListIterator<io.netty.handler.codec.http.multipart.InterfaceHttpData> r1 = r2.iterator
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L3f
            io.netty.handler.codec.http.HttpContent r0 = r2.lastChunk()
            return r0
        L3f:
            if (r0 <= 0) goto L68
            java.util.ListIterator<io.netty.handler.codec.http.multipart.InterfaceHttpData> r1 = r2.iterator
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L68
            java.util.ListIterator<io.netty.handler.codec.http.multipart.InterfaceHttpData> r1 = r2.iterator
            java.lang.Object r1 = r1.next()
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r1
            r2.currentData = r1
            boolean r1 = r2.isMultipart
            if (r1 == 0) goto L5c
            io.netty.handler.codec.http.HttpContent r0 = r2.encodeNextChunkMultipart(r0)
            goto L60
        L5c:
            io.netty.handler.codec.http.HttpContent r0 = r2.encodeNextChunkUrlEncoded(r0)
        L60:
            if (r0 != 0) goto L67
            int r0 = r2.calculateRemainingSize()
            goto L3f
        L67:
            return r0
        L68:
            io.netty.handler.codec.http.HttpContent r0 = r2.lastChunk()
            return r0
    }

    public void addBodyAttribute(java.lang.String r4, java.lang.String r5) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r3 = this;
            if (r5 == 0) goto L3
            goto L5
        L3:
            java.lang.String r5 = ""
        L5:
            io.netty.handler.codec.http.multipart.HttpDataFactory r0 = r3.factory
            io.netty.handler.codec.http.HttpRequest r1 = r3.request
            java.lang.String r2 = "name"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            java.lang.String r4 = (java.lang.String) r4
            io.netty.handler.codec.http.multipart.Attribute r4 = r0.createAttribute(r1, r4, r5)
            r3.addBodyHttpData(r4)
            return
    }

    public void addBodyFileUpload(java.lang.String r7, java.io.File r8, java.lang.String r9, boolean r10) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r6 = this;
            java.lang.String r2 = r8.getName()
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.addBodyFileUpload(r1, r2, r3, r4, r5)
            return
    }

    public void addBodyFileUpload(java.lang.String r10, java.lang.String r11, java.io.File r12, java.lang.String r13, boolean r14) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r9 = this;
            java.lang.String r0 = "name"
            io.netty.util.internal.ObjectUtil.checkNotNull(r10, r0)
            java.lang.String r0 = "file"
            io.netty.util.internal.ObjectUtil.checkNotNull(r12, r0)
            if (r11 != 0) goto Le
            java.lang.String r11 = ""
        Le:
            r3 = r11
            if (r13 != 0) goto L15
            if (r14 == 0) goto L17
            java.lang.String r13 = "text/plain"
        L15:
            r4 = r13
            goto L1a
        L17:
            java.lang.String r13 = "application/octet-stream"
            goto L15
        L1a:
            if (r14 != 0) goto L24
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r11 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BINARY
            java.lang.String r11 = r11.value()
        L22:
            r5 = r11
            goto L26
        L24:
            r11 = 0
            goto L22
        L26:
            io.netty.handler.codec.http.multipart.HttpDataFactory r0 = r9.factory
            io.netty.handler.codec.http.HttpRequest r1 = r9.request
            r6 = 0
            long r7 = r12.length()
            r2 = r10
            io.netty.handler.codec.http.multipart.FileUpload r10 = r0.createFileUpload(r1, r2, r3, r4, r5, r6, r7)
            r10.setContent(r12)     // Catch: java.io.IOException -> L3b
            r9.addBodyHttpData(r10)
            return
        L3b:
            r0 = move-exception
            r10 = r0
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            r11.<init>(r10)
            throw r11
    }

    public void addBodyFileUploads(java.lang.String r5, java.io.File[] r6, java.lang.String[] r7, boolean[] r8) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r4 = this;
            int r0 = r6.length
            int r1 = r7.length
            if (r0 == r1) goto L11
            int r0 = r6.length
            int r1 = r8.length
            if (r0 != r1) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Different array length"
            r5.<init>(r6)
            throw r5
        L11:
            r0 = 0
        L12:
            int r1 = r6.length
            if (r0 >= r1) goto L21
            r1 = r6[r0]
            r2 = r7[r0]
            boolean r3 = r8[r0]
            r4.addBodyFileUpload(r5, r1, r2, r3)
            int r0 = r0 + 1
            goto L12
        L21:
            return
    }

    public void addBodyHttpData(io.netty.handler.codec.http.multipart.InterfaceHttpData r20) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r1.headerFinalized
            if (r2 != 0) goto L4e4
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r2 = r1.bodyListDatas
            java.lang.String r3 = "data"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r0, r3)
            r2.add(r3)
            boolean r2 = r1.isMultipart
            r3 = 1
            if (r2 != 0) goto L9b
            boolean r2 = r0 instanceof io.netty.handler.codec.http.multipart.Attribute
            r4 = 1
            if (r2 == 0) goto L5e
            io.netty.handler.codec.http.multipart.Attribute r0 = (io.netty.handler.codec.http.multipart.Attribute) r0
            java.lang.String r2 = r0.getName()     // Catch: java.io.IOException -> L57
            java.nio.charset.Charset r6 = r1.charset     // Catch: java.io.IOException -> L57
            java.lang.String r2 = r1.encodeAttribute(r2, r6)     // Catch: java.io.IOException -> L57
            java.lang.String r0 = r0.getValue()     // Catch: java.io.IOException -> L57
            java.nio.charset.Charset r6 = r1.charset     // Catch: java.io.IOException -> L57
            java.lang.String r0 = r1.encodeAttribute(r0, r6)     // Catch: java.io.IOException -> L57
            io.netty.handler.codec.http.multipart.HttpDataFactory r6 = r1.factory     // Catch: java.io.IOException -> L57
            io.netty.handler.codec.http.HttpRequest r7 = r1.request     // Catch: java.io.IOException -> L57
            io.netty.handler.codec.http.multipart.Attribute r0 = r6.createAttribute(r7, r2, r0)     // Catch: java.io.IOException -> L57
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r2 = r1.multipartHttpDatas     // Catch: java.io.IOException -> L57
            r2.add(r0)     // Catch: java.io.IOException -> L57
            long r6 = r1.globalBodySize     // Catch: java.io.IOException -> L57
            java.lang.String r2 = r0.getName()     // Catch: java.io.IOException -> L57
            int r2 = r2.length()     // Catch: java.io.IOException -> L57
            int r2 = r2 + r3
            long r2 = (long) r2     // Catch: java.io.IOException -> L57
            long r8 = r0.length()     // Catch: java.io.IOException -> L57
            long r2 = r2 + r8
            long r2 = r2 + r4
            long r6 = r6 + r2
            r1.globalBodySize = r6     // Catch: java.io.IOException -> L57
            return
        L57:
            r0 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r2 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            r2.<init>(r0)
            throw r2
        L5e:
            boolean r2 = r0 instanceof io.netty.handler.codec.http.multipart.FileUpload
            if (r2 == 0) goto L4e3
            io.netty.handler.codec.http.multipart.FileUpload r0 = (io.netty.handler.codec.http.multipart.FileUpload) r0
            java.lang.String r2 = r0.getName()
            java.nio.charset.Charset r6 = r1.charset
            java.lang.String r2 = r1.encodeAttribute(r2, r6)
            java.lang.String r0 = r0.getFilename()
            java.nio.charset.Charset r6 = r1.charset
            java.lang.String r0 = r1.encodeAttribute(r0, r6)
            io.netty.handler.codec.http.multipart.HttpDataFactory r6 = r1.factory
            io.netty.handler.codec.http.HttpRequest r7 = r1.request
            io.netty.handler.codec.http.multipart.Attribute r0 = r6.createAttribute(r7, r2, r0)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r2 = r1.multipartHttpDatas
            r2.add(r0)
            long r6 = r1.globalBodySize
            java.lang.String r2 = r0.getName()
            int r2 = r2.length()
            int r2 = r2 + r3
            long r2 = (long) r2
            long r8 = r0.length()
            long r2 = r2 + r8
            long r2 = r2 + r4
            long r6 = r6 + r2
            r1.globalBodySize = r6
            return
        L9b:
            boolean r2 = r0 instanceof io.netty.handler.codec.http.multipart.Attribute
            r4 = 61
            r5 = 0
            java.lang.String r6 = "\"\r\n"
            r7 = 0
            java.lang.String r8 = "=\""
            java.lang.String r9 = "--"
            java.lang.String r10 = "; "
            java.lang.String r11 = ": "
            java.lang.String r12 = "\r\n"
            if (r2 == 0) goto L1a7
            boolean r2 = r1.duringMixedMode
            if (r2 == 0) goto Lde
            io.netty.handler.codec.http.multipart.InternalAttribute r2 = new io.netty.handler.codec.http.multipart.InternalAttribute
            java.nio.charset.Charset r3 = r1.charset
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r13 = "\r\n--"
            r3.append(r13)
            java.lang.String r13 = r1.multipartMixedBoundary
            r3.append(r13)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.addValue(r3)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r3 = r1.multipartHttpDatas
            r3.add(r2)
            r1.multipartMixedBoundary = r5
            r1.currentFileUpload = r5
            r1.duringMixedMode = r7
        Lde:
            io.netty.handler.codec.http.multipart.InternalAttribute r2 = new io.netty.handler.codec.http.multipart.InternalAttribute
            java.nio.charset.Charset r3 = r1.charset
            r2.<init>(r3)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r3 = r1.multipartHttpDatas
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lf0
            r2.addValue(r12)
        Lf0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r5 = r1.multipartDataBoundary
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r2.addValue(r3)
            r3 = r0
            io.netty.handler.codec.http.multipart.Attribute r3 = (io.netty.handler.codec.http.multipart.Attribute) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r5.append(r7)
            r5.append(r11)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.FORM_DATA
            r5.append(r7)
            r5.append(r10)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.NAME
            r5.append(r7)
            r5.append(r8)
            java.lang.String r7 = r3.getName()
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.addValue(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r5.append(r6)
            r5.append(r11)
            long r6 = r3.length()
            r5.append(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            r2.addValue(r5)
            java.nio.charset.Charset r5 = r3.getCharset()
            if (r5 == 0) goto L18a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r6.append(r7)
            r6.append(r11)
            java.lang.String r7 = "text/plain"
            r6.append(r7)
            r6.append(r10)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r5.name()
            r6.append(r4)
            r6.append(r12)
            java.lang.String r4 = r6.toString()
            r2.addValue(r4)
        L18a:
            r2.addValue(r12)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r4 = r1.multipartHttpDatas
            r4.add(r2)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r4 = r1.multipartHttpDatas
            r4.add(r0)
            long r4 = r1.globalBodySize
            long r6 = r3.length()
            int r0 = r2.size()
            long r2 = (long) r0
            long r6 = r6 + r2
            long r4 = r4 + r6
            r1.globalBodySize = r4
            return
        L1a7:
            boolean r2 = r0 instanceof io.netty.handler.codec.http.multipart.FileUpload
            if (r2 == 0) goto L4e3
            r2 = r0
            io.netty.handler.codec.http.multipart.FileUpload r2 = (io.netty.handler.codec.http.multipart.FileUpload) r2
            io.netty.handler.codec.http.multipart.InternalAttribute r13 = new io.netty.handler.codec.http.multipart.InternalAttribute
            java.nio.charset.Charset r14 = r1.charset
            r13.<init>(r14)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r14 = r1.multipartHttpDatas
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L1c0
            r13.addValue(r12)
        L1c0:
            boolean r14 = r1.duringMixedMode
            java.lang.String r15 = "\r\n\r\n"
            if (r14 == 0) goto L210
            io.netty.handler.codec.http.multipart.FileUpload r14 = r1.currentFileUpload
            if (r14 == 0) goto L1de
            java.lang.String r14 = r14.getName()
            java.lang.String r3 = r2.getName()
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L1de
            r16 = r6
            r4 = r15
        L1db:
            r3 = 1
            goto L325
        L1de:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r14 = r1.multipartMixedBoundary
            r3.append(r14)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r3 = r1.multipartHttpDatas
            r3.add(r13)
            r1.multipartMixedBoundary = r5
            io.netty.handler.codec.http.multipart.InternalAttribute r13 = new io.netty.handler.codec.http.multipart.InternalAttribute
            java.nio.charset.Charset r3 = r1.charset
            r13.<init>(r3)
            r13.addValue(r12)
            r1.currentFileUpload = r2
            r1.duringMixedMode = r7
            r16 = r6
            r4 = r15
        L20d:
            r3 = 0
            goto L325
        L210:
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r3 = r1.encoderMode
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$EncoderMode r5 = io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.EncoderMode.HTML5
            if (r3 == r5) goto L31c
            io.netty.handler.codec.http.multipart.FileUpload r3 = r1.currentFileUpload
            if (r3 == 0) goto L31c
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = r2.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L31c
            r1.initMixedMultipart()
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r3 = r1.multipartHttpDatas
            int r5 = r3.size()
            r7 = 2
            int r5 = r5 - r7
            java.lang.Object r3 = r3.get(r5)
            io.netty.handler.codec.http.multipart.InternalAttribute r3 = (io.netty.handler.codec.http.multipart.InternalAttribute) r3
            long r4 = r1.globalBodySize
            int r14 = r3.size()
            r17 = r8
            r18 = 2
            long r7 = (long) r14
            long r4 = r4 - r7
            r1.globalBodySize = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = r1.multipartDataBoundary
            int r5 = r5.length()
            int r5 = r5 + 139
            java.lang.String r7 = r1.multipartMixedBoundary
            int r7 = r7.length()
            int r7 = r7 * 2
            int r5 = r5 + r7
            java.lang.String r7 = r2.getFilename()
            int r7 = r7.length()
            int r5 = r5 + r7
            java.lang.String r7 = r2.getName()
            int r7 = r7.length()
            int r5 = r5 + r7
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r5 = r1.multipartDataBoundary
            r4.append(r5)
            r4.append(r12)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r4.append(r5)
            r4.append(r11)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.FORM_DATA
            r4.append(r7)
            r4.append(r10)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.NAME
            r4.append(r7)
            r8 = r17
            r4.append(r8)
            java.lang.String r7 = r2.getName()
            r4.append(r7)
            r4.append(r6)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r4.append(r7)
            r4.append(r11)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.MULTIPART_MIXED
            r4.append(r7)
            r4.append(r10)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.BOUNDARY
            r4.append(r7)
            r14 = 61
            r4.append(r14)
            java.lang.String r7 = r1.multipartMixedBoundary
            r4.append(r7)
            r4.append(r15)
            r4.append(r9)
            java.lang.String r7 = r1.multipartMixedBoundary
            r4.append(r7)
            r4.append(r12)
            r4.append(r5)
            r4.append(r11)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderValues.ATTACHMENT
            r4.append(r5)
            java.lang.String r5 = r2.getFilename()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L2f9
            r4.append(r10)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            r4.append(r5)
            r4.append(r8)
            io.netty.handler.codec.http.multipart.FileUpload r5 = r1.currentFileUpload
            java.lang.String r5 = r5.getFilename()
            r4.append(r5)
            r5 = 34
            r4.append(r5)
        L2f9:
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r5 = 1
            r3.setValue(r4, r5)
            java.lang.String r4 = ""
            r7 = 2
            r3.setValue(r4, r7)
            r4 = r15
            long r14 = r1.globalBodySize
            int r3 = r3.size()
            r16 = r6
            long r5 = (long) r3
            long r14 = r14 + r5
            r1.globalBodySize = r14
            r5 = 1
            r1.duringMixedMode = r5
            goto L1db
        L31c:
            r16 = r6
            r4 = r15
            r1.currentFileUpload = r2
            r1.duringMixedMode = r7
            goto L20d
        L325:
            if (r3 == 0) goto L398
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r5 = r1.multipartMixedBoundary
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            java.lang.String r3 = r2.getFilename()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L366
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r3.append(r5)
            r3.append(r11)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderValues.ATTACHMENT
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            goto L42c
        L366:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r3.append(r5)
            r3.append(r11)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderValues.ATTACHMENT
            r3.append(r5)
            r3.append(r10)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            r3.append(r5)
            r3.append(r8)
            java.lang.String r5 = r2.getFilename()
            r3.append(r5)
            r5 = r16
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            goto L42c
        L398:
            r5 = r16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r6 = r1.multipartDataBoundary
            r3.append(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            java.lang.String r3 = r2.getFilename()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L3ea
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r3.append(r6)
            r3.append(r11)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderValues.FORM_DATA
            r3.append(r6)
            r3.append(r10)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderValues.NAME
            r3.append(r6)
            r3.append(r8)
            java.lang.String r6 = r2.getName()
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            goto L42c
        L3ea:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r3.append(r6)
            r3.append(r11)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderValues.FORM_DATA
            r3.append(r6)
            r3.append(r10)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderValues.NAME
            r3.append(r6)
            r3.append(r8)
            java.lang.String r6 = r2.getName()
            r3.append(r6)
            java.lang.String r6 = "\"; "
            r3.append(r6)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            r3.append(r6)
            r3.append(r8)
            java.lang.String r6 = r2.getFilename()
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
        L42c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r3.append(r5)
            r3.append(r11)
            long r5 = r2.length()
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r3.append(r5)
            r3.append(r11)
            java.lang.String r5 = r2.getContentType()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            java.lang.String r3 = r2.getContentTransferEncoding()
            if (r3 == 0) goto L499
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r5 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BINARY
            java.lang.String r6 = r5.value()
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L499
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TRANSFER_ENCODING
            r3.append(r6)
            r3.append(r11)
            java.lang.String r5 = r5.value()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            goto L4ca
        L499:
            java.nio.charset.Charset r3 = r2.getCharset()
            if (r3 == 0) goto L4c7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            r3.append(r5)
            r14 = 61
            r3.append(r14)
            java.nio.charset.Charset r5 = r2.getCharset()
            java.lang.String r5 = r5.name()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r13.addValue(r3)
            goto L4ca
        L4c7:
            r13.addValue(r4)
        L4ca:
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r3 = r1.multipartHttpDatas
            r3.add(r13)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r3 = r1.multipartHttpDatas
            r3.add(r0)
            long r3 = r1.globalBodySize
            long r5 = r2.length()
            int r0 = r13.size()
            long r7 = (long) r0
            long r5 = r5 + r7
            long r3 = r3 + r5
            r1.globalBodySize = r3
        L4e3:
            return
        L4e4:
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            java.lang.String r2 = "Cannot add value once finalized"
            r0.<init>(r2)
            throw r0
    }

    public void cleanFiles() {
            r2 = this;
            io.netty.handler.codec.http.multipart.HttpDataFactory r0 = r2.factory
            io.netty.handler.codec.http.HttpRequest r1 = r2.request
            r0.cleanRequestHttpData(r1)
            return
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws java.lang.Exception {
            r0 = this;
            return
    }

    public io.netty.handler.codec.http.HttpRequest finalizeRequest() throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r9 = this;
            boolean r0 = r9.headerFinalized
            if (r0 != 0) goto L163
            boolean r0 = r9.isMultipart
            r1 = 0
            if (r0 == 0) goto L5e
            io.netty.handler.codec.http.multipart.InternalAttribute r0 = new io.netty.handler.codec.http.multipart.InternalAttribute
            java.nio.charset.Charset r2 = r9.charset
            r0.<init>(r2)
            boolean r2 = r9.duringMixedMode
            java.lang.String r3 = "\r\n--"
            if (r2 == 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r4 = r9.multipartMixedBoundary
            r2.append(r4)
            java.lang.String r4 = "--"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.addValue(r2)
        L2f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = r9.multipartDataBoundary
            r2.append(r3)
            java.lang.String r3 = "--\r\n"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.addValue(r2)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r2 = r9.multipartHttpDatas
            r2.add(r0)
            r9.multipartMixedBoundary = r1
            r9.currentFileUpload = r1
            r2 = 0
            r9.duringMixedMode = r2
            long r2 = r9.globalBodySize
            int r0 = r0.size()
            long r4 = (long) r0
            long r2 = r2 + r4
            r9.globalBodySize = r2
        L5e:
            r0 = 1
            r9.headerFinalized = r0
            io.netty.handler.codec.http.HttpRequest r2 = r9.request
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            java.util.List r4 = r2.getAll(r3)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            java.util.List r5 = r2.getAll(r5)
            if (r4 == 0) goto Lab
            r2.remove(r3)
            java.util.Iterator r3 = r4.iterator()
        L7c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = r4.toLowerCase()
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.MULTIPART_FORM_DATA
            java.lang.String r7 = r7.toString()
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L7c
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderValues.APPLICATION_X_WWW_FORM_URLENCODED
            java.lang.String r7 = r7.toString()
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto La5
            goto L7c
        La5:
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r2.add(r6, r4)
            goto L7c
        Lab:
            boolean r3 = r9.isMultipart
            if (r3 == 0) goto Ld7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.MULTIPART_FORM_DATA
            r3.append(r4)
            java.lang.String r4 = "; "
            r3.append(r4)
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.BOUNDARY
            r3.append(r4)
            r4 = 61
            r3.append(r4)
            java.lang.String r4 = r9.multipartDataBoundary
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r2.add(r4, r3)
            goto Lde
        Ld7:
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.APPLICATION_X_WWW_FORM_URLENCODED
            r2.add(r3, r4)
        Lde:
            long r3 = r9.globalBodySize
            boolean r6 = r9.isMultipart
            if (r6 != 0) goto Le7
            r6 = 1
            long r3 = r3 - r6
        Le7:
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r6 = r9.multipartHttpDatas
            java.util.ListIterator r6 = r6.listIterator()
            r9.iterator = r6
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            java.lang.String r7 = java.lang.String.valueOf(r3)
            r2.set(r6, r7)
            r6 = 8096(0x1fa0, double:4.0E-320)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L12e
            boolean r3 = r9.isMultipart
            if (r3 == 0) goto L103
            goto L12e
        L103:
            io.netty.handler.codec.http.HttpContent r0 = r9.nextChunk()
            io.netty.handler.codec.http.HttpRequest r2 = r9.request
            boolean r3 = r2 instanceof io.netty.handler.codec.http.FullHttpRequest
            if (r3 == 0) goto L128
            io.netty.handler.codec.http.FullHttpRequest r2 = (io.netty.handler.codec.http.FullHttpRequest) r2
            io.netty.buffer.ByteBuf r0 = r0.content()
            io.netty.buffer.ByteBuf r1 = r2.content()
            if (r1 == r0) goto L127
            io.netty.buffer.ByteBuf r1 = r2.content()
            io.netty.buffer.ByteBuf r1 = r1.clear()
            r1.writeBytes(r0)
            r0.release()
        L127:
            return r2
        L128:
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$WrappedFullHttpRequest r3 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$WrappedFullHttpRequest
            r3.<init>(r2, r0, r1)
            return r3
        L12e:
            r9.isChunked = r0
            if (r5 == 0) goto L156
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r2.remove(r1)
            java.util.Iterator r1 = r5.iterator()
        L13b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L156
            java.lang.Object r3 = r1.next()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED
            boolean r4 = r4.contentEqualsIgnoreCase(r3)
            if (r4 == 0) goto L150
            goto L13b
        L150:
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r2.add(r4, r3)
            goto L13b
        L156:
            io.netty.handler.codec.http.HttpRequest r1 = r9.request
            io.netty.handler.codec.http.HttpUtil.setTransferEncodingChunked(r1, r0)
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$WrappedHttpRequest r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$WrappedHttpRequest
            io.netty.handler.codec.http.HttpRequest r1 = r9.request
            r0.<init>(r1)
            return r0
        L163:
            io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestEncoder$ErrorDataEncoderException
            java.lang.String r1 = "Header already encoded"
            r0.<init>(r1)
            throw r0
    }

    public java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> getBodyListAttributes() {
            r1 = this;
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r0 = r1.bodyListDatas
            return r0
    }

    public boolean isChunked() {
            r1 = this;
            boolean r0 = r1.isChunked
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.isLastChunkSent
            return r0
    }

    public boolean isMultipart() {
            r1 = this;
            boolean r0 = r1.isMultipart
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long length() {
            r4 = this;
            boolean r0 = r4.isMultipart
            if (r0 == 0) goto L7
            long r0 = r4.globalBodySize
            return r0
        L7:
            long r0 = r4.globalBodySize
            r2 = 1
            long r0 = r0 - r2
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long progress() {
            r2 = this;
            long r0 = r2.globalProgress
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    public io.netty.handler.codec.http.HttpContent readChunk(io.netty.buffer.ByteBufAllocator r5) throws java.lang.Exception {
            r4 = this;
            boolean r5 = r4.isLastChunkSent
            if (r5 == 0) goto L6
            r5 = 0
            return r5
        L6:
            io.netty.handler.codec.http.HttpContent r5 = r4.nextChunk()
            long r0 = r4.globalProgress
            io.netty.buffer.ByteBuf r2 = r5.content()
            int r2 = r2.readableBytes()
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.globalProgress = r0
            return r5
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public io.netty.handler.codec.http.HttpContent readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.handler.codec.http.HttpContent r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent readChunk(io.netty.buffer.ByteBufAllocator r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.readChunk(r1)
            return r1
    }

    public void setBodyHttpDatas(java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r3) throws io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException {
            r2 = this;
            if (r3 == 0) goto L2b
            r0 = 0
            r2.globalBodySize = r0
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r0 = r2.bodyListDatas
            r0.clear()
            r0 = 0
            r2.currentFileUpload = r0
            r0 = 0
            r2.duringMixedMode = r0
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r0 = r2.multipartHttpDatas
            r0.clear()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r0
            r2.addBodyHttpData(r0)
            goto L1a
        L2a:
            return
        L2b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "datas"
            r3.<init>(r0)
            throw r3
    }
}
