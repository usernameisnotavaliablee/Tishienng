package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpPostStandardRequestDecoder implements io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder {
    private final java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> bodyListHttpData;
    private int bodyListHttpDataRank;
    private final java.util.Map<java.lang.String, java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData>> bodyMapHttpData;
    private final java.nio.charset.Charset charset;
    private io.netty.handler.codec.http.multipart.Attribute currentAttribute;
    private io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus currentStatus;
    private boolean destroyed;
    private int discardThreshold;
    private final io.netty.handler.codec.http.multipart.HttpDataFactory factory;
    private boolean isLastChunk;
    private final io.netty.handler.codec.http.HttpRequest request;
    private io.netty.buffer.ByteBuf undecodedChunk;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus = null;

        static {
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus[] r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus = r0
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public HttpPostStandardRequestDecoder(io.netty.handler.codec.http.HttpRequest r4) {
            r3 = this;
            io.netty.handler.codec.http.multipart.DefaultHttpDataFactory r0 = new io.netty.handler.codec.http.multipart.DefaultHttpDataFactory
            r1 = 16384(0x4000, double:8.095E-320)
            r0.<init>(r1)
            java.nio.charset.Charset r1 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r3.<init>(r0, r4, r1)
            return
    }

    public HttpPostStandardRequestDecoder(io.netty.handler.codec.http.multipart.HttpDataFactory r2, io.netty.handler.codec.http.HttpRequest r3) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r3, r0)
            return
    }

    public HttpPostStandardRequestDecoder(io.netty.handler.codec.http.multipart.HttpDataFactory r3, io.netty.handler.codec.http.HttpRequest r4, java.nio.charset.Charset r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.bodyListHttpData = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            io.netty.handler.codec.http.multipart.CaseIgnoringComparator r1 = io.netty.handler.codec.http.multipart.CaseIgnoringComparator.INSTANCE
            r0.<init>(r1)
            r2.bodyMapHttpData = r0
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED
            r2.currentStatus = r0
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r2.discardThreshold = r0
            java.lang.String r0 = "request"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            r2.request = r0
            java.lang.String r0 = "charset"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.nio.charset.Charset r5 = (java.nio.charset.Charset) r5
            r2.charset = r5
            java.lang.String r5 = "factory"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r5)
            io.netty.handler.codec.http.multipart.HttpDataFactory r3 = (io.netty.handler.codec.http.multipart.HttpDataFactory) r3
            r2.factory = r3
            boolean r3 = r4 instanceof io.netty.handler.codec.http.HttpContent
            if (r3 == 0) goto L43
            io.netty.handler.codec.http.HttpContent r4 = (io.netty.handler.codec.http.HttpContent) r4
            r2.offer(r4)
            return
        L43:
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.buffer()
            r2.undecodedChunk = r3
            r2.parseBody()
            return
    }

    private void checkDestroyed() {
            r3 = this;
            boolean r0 = r3.destroyed
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder> r2 = io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " was destroyed already"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String decodeAttribute(java.lang.String r3, java.nio.charset.Charset r4) {
            java.lang.String r3 = io.netty.handler.codec.http.QueryStringDecoder.decodeComponent(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L5
            return r3
        L5:
            r4 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad string: '"
            r1.append(r2)
            r1.append(r3)
            r3 = 39
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    private void parseBody() {
            r2 = this;
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = r2.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE
            if (r0 == r1) goto Lf
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE
            if (r0 != r1) goto Lb
            goto Lf
        Lb:
            r2.parseBodyAttributes()
            return
        Lf:
            boolean r0 = r2.isLastChunk
            if (r0 == 0) goto L17
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE
            r2.currentStatus = r0
        L17:
            return
    }

    private void parseBodyAttributes() {
            r9 = this;
            io.netty.buffer.ByteBuf r0 = r9.undecodedChunk
            boolean r0 = r0.hasArray()
            if (r0 != 0) goto Lc
            r9.parseBodyAttributesStandard()
            return
        Lc:
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize r0 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize
            io.netty.buffer.ByteBuf r1 = r9.undecodedChunk
            r0.<init>(r1)
            io.netty.buffer.ByteBuf r1 = r9.undecodedChunk
            int r1 = r1.readerIndex()
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = r9.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED
            if (r2 != r3) goto L23
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION
            r9.currentStatus = r2
        L23:
            r2 = r1
        L24:
            int r3 = r0.pos     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r4 = r0.limit     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r5 = 1
            r6 = 0
            if (r3 >= r4) goto L111
            byte[] r4 = r0.bytes     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r7 = r3 + 1
            r0.pos = r7     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r3 = r4[r3]     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r4 = r1 + 1
            int[] r7 = io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r8 = r9.currentStatus     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r8 = r8.ordinal()     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r7 = r7[r8]     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r8 = 38
            if (r7 == r5) goto Lbe
            r5 = 2
            if (r7 == r5) goto L5a
            r0.setReadPosition(r6)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r1 = r4
        L4e:
            r5 = 0
            goto L111
        L51:
            r0 = move-exception
            goto L15e
        L54:
            r0 = move-exception
            goto L169
        L57:
            r0 = move-exception
            goto L174
        L5a:
            if (r3 != r8) goto L6c
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.currentStatus = r3     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.buffer.ByteBuf r3 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r1 = r1 - r2
            io.netty.buffer.ByteBuf r1 = r3.copy(r2, r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.setFinalBuffer(r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
        L6a:
            r1 = r4
            goto L23
        L6c:
            r5 = 13
            r7 = 10
            if (r3 != r5) goto Laa
            int r3 = r0.pos     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r5 = r0.limit     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            if (r3 >= r5) goto La6
            byte[] r4 = r0.bytes     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r5 = r3 + 1
            r0.pos = r5     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r3 = r4[r3]     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r4 = r1 + 2
            if (r3 != r7) goto L9b
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.currentStatus = r3     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r0.setReadPosition(r6)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.buffer.ByteBuf r0 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r1 = r1 - r2
            io.netty.buffer.ByteBuf r0 = r0.copy(r2, r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.setFinalBuffer(r0)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
        L98:
            r1 = r4
            r2 = r1
            goto L4e
        L9b:
            r0.setReadPosition(r6)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.lang.String r1 = "Bad end of line"
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            throw r0     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
        La6:
            if (r5 <= 0) goto L10e
            goto L24
        Laa:
            if (r3 != r7) goto L10e
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.currentStatus = r3     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r0.setReadPosition(r6)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.buffer.ByteBuf r0 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r1 = r1 - r2
            io.netty.buffer.ByteBuf r0 = r0.copy(r2, r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.setFinalBuffer(r0)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            goto L98
        Lbe:
            r5 = 61
            if (r3 != r5) goto Le0
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.currentStatus = r3     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.buffer.ByteBuf r3 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r1 = r1 - r2
            java.nio.charset.Charset r5 = r9.charset     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.lang.String r1 = r3.toString(r2, r1, r5)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.nio.charset.Charset r3 = r9.charset     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.lang.String r1 = decodeAttribute(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.HttpDataFactory r3 = r9.factory     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.HttpRequest r5 = r9.request     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.Attribute r1 = r3.createAttribute(r5, r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.currentAttribute = r1     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            goto L6a
        Le0:
            if (r3 != r8) goto L10e
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.currentStatus = r3     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.buffer.ByteBuf r3 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r1 = r1 - r2
            java.nio.charset.Charset r5 = r9.charset     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.lang.String r1 = r3.toString(r2, r1, r5)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.nio.charset.Charset r3 = r9.charset     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.lang.String r1 = decodeAttribute(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.HttpDataFactory r3 = r9.factory     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.HttpRequest r5 = r9.request     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.Attribute r1 = r3.createAttribute(r5, r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.currentAttribute = r1     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            java.lang.String r3 = ""
            r1.setValue(r3)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.Attribute r1 = r9.currentAttribute     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.addHttpData(r1)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r1 = 0
            r9.currentAttribute = r1     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            goto L6a
        L10e:
            r1 = r4
            goto L24
        L111:
            boolean r0 = r9.isLastChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            if (r0 == 0) goto L140
            io.netty.handler.codec.http.multipart.Attribute r0 = r9.currentAttribute     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            if (r0 == 0) goto L140
            if (r1 <= r2) goto L127
            io.netty.buffer.ByteBuf r0 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r3 = r1 - r2
            io.netty.buffer.ByteBuf r0 = r0.copy(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.setFinalBuffer(r0)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            goto L132
        L127:
            boolean r0 = r0.isCompleted()     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            if (r0 != 0) goto L132
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r9.setFinalBuffer(r0)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
        L132:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE     // Catch: java.lang.IllegalArgumentException -> L137 java.io.IOException -> L13a io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L13d
            r9.currentStatus = r0     // Catch: java.lang.IllegalArgumentException -> L137 java.io.IOException -> L13a io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L13d
            goto L157
        L137:
            r0 = move-exception
            r2 = r1
            goto L15e
        L13a:
            r0 = move-exception
            r2 = r1
            goto L169
        L13d:
            r0 = move-exception
            r2 = r1
            goto L174
        L140:
            if (r5 == 0) goto L158
            io.netty.handler.codec.http.multipart.Attribute r0 = r9.currentAttribute     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            if (r0 == 0) goto L158
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = r9.currentStatus     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r4 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            if (r3 != r4) goto L158
            io.netty.buffer.ByteBuf r3 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            int r4 = r1 - r2
            io.netty.buffer.ByteBuf r3 = r3.copy(r2, r4)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r0.addContent(r3, r6)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
        L157:
            r2 = r1
        L158:
            io.netty.buffer.ByteBuf r0 = r9.undecodedChunk     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            r0.readerIndex(r2)     // Catch: java.lang.IllegalArgumentException -> L51 java.io.IOException -> L54 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L57
            return
        L15e:
            io.netty.buffer.ByteBuf r1 = r9.undecodedChunk
            r1.readerIndex(r2)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L169:
            io.netty.buffer.ByteBuf r1 = r9.undecodedChunk
            r1.readerIndex(r2)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L174:
            io.netty.buffer.ByteBuf r1 = r9.undecodedChunk
            r1.readerIndex(r2)
            throw r0
    }

    private void parseBodyAttributesStandard() {
            r10 = this;
            io.netty.buffer.ByteBuf r0 = r10.undecodedChunk
            int r0 = r0.readerIndex()
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = r10.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED
            if (r1 != r2) goto L10
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION
            r10.currentStatus = r1
        L10:
            r1 = 1
        L11:
            r2 = r0
            r3 = 1
        L13:
            io.netty.buffer.ByteBuf r4 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            boolean r4 = r4.isReadable()     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r5 = 0
            if (r4 == 0) goto Led
            if (r3 == 0) goto Led
            io.netty.buffer.ByteBuf r4 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            short r4 = r4.readUnsignedByte()     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            char r4 = (char) r4     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r6 = r0 + 1
            int[] r7 = io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r8 = r10.currentStatus     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r8 = r8.ordinal()     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r7 = r7[r8]     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r8 = 38
            if (r7 == r1) goto L97
            r9 = 2
            if (r7 == r9) goto L3b
            r0 = r6
        L39:
            r3 = 0
            goto L13
        L3b:
            if (r4 != r8) goto L53
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.currentStatus = r3     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.buffer.ByteBuf r3 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r0 = r0 - r2
            io.netty.buffer.ByteBuf r0 = r3.copy(r2, r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.setFinalBuffer(r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
        L4b:
            r0 = r6
            goto L11
        L4d:
            r0 = move-exception
            goto L13a
        L50:
            r0 = move-exception
            goto L145
        L53:
            r7 = 13
            r8 = 10
            if (r4 != r7) goto L85
            io.netty.buffer.ByteBuf r4 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            boolean r4 = r4.isReadable()     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            if (r4 == 0) goto L13
            io.netty.buffer.ByteBuf r3 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            short r3 = r3.readUnsignedByte()     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            char r3 = (char) r3     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r4 = r0 + 2
            if (r3 != r8) goto L7d
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.currentStatus = r3     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.buffer.ByteBuf r3 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r0 = r0 - r2
            io.netty.buffer.ByteBuf r0 = r3.copy(r2, r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.setFinalBuffer(r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r0 = r4
        L7b:
            r2 = r0
            goto L39
        L7d:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.lang.String r1 = "Bad end of line"
            r0.<init>(r1)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            throw r0     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
        L85:
            if (r4 != r8) goto Lea
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.currentStatus = r3     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.buffer.ByteBuf r3 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r0 = r0 - r2
            io.netty.buffer.ByteBuf r0 = r3.copy(r2, r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.setFinalBuffer(r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r0 = r6
            goto L7b
        L97:
            r5 = 61
            if (r4 != r5) goto Lbc
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r4 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.currentStatus = r4     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.buffer.ByteBuf r4 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r0 = r0 - r2
            java.nio.charset.Charset r5 = r10.charset     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.lang.String r0 = r4.toString(r2, r0, r5)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.nio.charset.Charset r4 = r10.charset     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.lang.String r0 = decodeAttribute(r0, r4)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.multipart.HttpDataFactory r4 = r10.factory     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.HttpRequest r5 = r10.request     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.multipart.Attribute r0 = r4.createAttribute(r5, r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.currentAttribute = r0     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r0 = r6
            r2 = r0
            goto L13
        Lbc:
            if (r4 != r8) goto Lea
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.currentStatus = r3     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.buffer.ByteBuf r3 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r0 = r0 - r2
            java.nio.charset.Charset r4 = r10.charset     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.lang.String r0 = r3.toString(r2, r0, r4)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.nio.charset.Charset r3 = r10.charset     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.lang.String r0 = decodeAttribute(r0, r3)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.multipart.HttpDataFactory r3 = r10.factory     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.HttpRequest r4 = r10.request     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.multipart.Attribute r0 = r3.createAttribute(r4, r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.currentAttribute = r0     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            java.lang.String r3 = ""
            r0.setValue(r3)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.multipart.Attribute r0 = r10.currentAttribute     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.addHttpData(r0)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r0 = 0
            r10.currentAttribute = r0     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            goto L4b
        Lea:
            r0 = r6
            goto L13
        Led:
            boolean r1 = r10.isLastChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            if (r1 == 0) goto L11b
            io.netty.handler.codec.http.multipart.Attribute r1 = r10.currentAttribute     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            if (r1 == 0) goto L11b
            if (r0 <= r2) goto L103
            io.netty.buffer.ByteBuf r1 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r3 = r0 - r2
            io.netty.buffer.ByteBuf r1 = r1.copy(r2, r3)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.setFinalBuffer(r1)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            goto L10e
        L103:
            boolean r1 = r1.isCompleted()     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            if (r1 != 0) goto L10e
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r10.setFinalBuffer(r1)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
        L10e:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE     // Catch: java.io.IOException -> L113 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L117
            r10.currentStatus = r1     // Catch: java.io.IOException -> L113 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L117
            goto L134
        L113:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L13a
        L117:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L145
        L11b:
            if (r3 == 0) goto L133
            io.netty.handler.codec.http.multipart.Attribute r1 = r10.currentAttribute     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            if (r1 == 0) goto L133
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = r10.currentStatus     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r4 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            if (r3 != r4) goto L133
            io.netty.buffer.ByteBuf r3 = r10.undecodedChunk     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            int r4 = r0 - r2
            io.netty.buffer.ByteBuf r3 = r3.copy(r2, r4)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            r1.addContent(r3, r5)     // Catch: java.io.IOException -> L4d io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L50
            goto L134
        L133:
            r0 = r2
        L134:
            io.netty.buffer.ByteBuf r1 = r10.undecodedChunk     // Catch: java.io.IOException -> L113 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L117
            r1.readerIndex(r0)     // Catch: java.io.IOException -> L113 io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException -> L117
            return
        L13a:
            io.netty.buffer.ByteBuf r1 = r10.undecodedChunk
            r1.readerIndex(r2)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L145:
            io.netty.buffer.ByteBuf r1 = r10.undecodedChunk
            r1.readerIndex(r2)
            throw r0
    }

    private void setFinalBuffer(io.netty.buffer.ByteBuf r3) throws java.io.IOException {
            r2 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.currentAttribute
            r1 = 1
            r0.addContent(r3, r1)
            io.netty.handler.codec.http.multipart.Attribute r3 = r2.currentAttribute
            io.netty.buffer.ByteBuf r3 = r3.getByteBuf()
            java.nio.charset.Charset r0 = r2.charset
            java.lang.String r3 = r3.toString(r0)
            java.nio.charset.Charset r0 = r2.charset
            java.lang.String r3 = decodeAttribute(r3, r0)
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.currentAttribute
            r0.setValue(r3)
            io.netty.handler.codec.http.multipart.Attribute r3 = r2.currentAttribute
            r2.addHttpData(r3)
            r3 = 0
            r2.currentAttribute = r3
            return
    }

    protected void addHttpData(io.netty.handler.codec.http.multipart.InterfaceHttpData r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.Map<java.lang.String, java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData>> r0 = r3.bodyMapHttpData
            java.lang.String r1 = r4.getName()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            java.util.Map<java.lang.String, java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData>> r1 = r3.bodyMapHttpData
            java.lang.String r2 = r4.getName()
            r1.put(r2, r0)
        L20:
            r0.add(r4)
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r0 = r3.bodyListHttpData
            r0.add(r4)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void cleanFiles() {
            r2 = this;
            r2.checkDestroyed()
            io.netty.handler.codec.http.multipart.HttpDataFactory r0 = r2.factory
            io.netty.handler.codec.http.HttpRequest r1 = r2.request
            r0.cleanRequestHttpData(r1)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.InterfaceHttpData currentPartialHttpData() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.currentAttribute
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void destroy() {
            r1 = this;
            r1.cleanFiles()
            r0 = 1
            r1.destroyed = r0
            io.netty.buffer.ByteBuf r0 = r1.undecodedChunk
            if (r0 == 0) goto L18
            int r0 = r0.refCnt()
            if (r0 <= 0) goto L18
            io.netty.buffer.ByteBuf r0 = r1.undecodedChunk
            r0.release()
            r0 = 0
            r1.undecodedChunk = r0
        L18:
            return
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.InterfaceHttpData getBodyHttpData(java.lang.String r2) {
            r1 = this;
            r1.checkDestroyed()
            boolean r0 = r1.isLastChunk
            if (r0 == 0) goto L1b
            java.util.Map<java.lang.String, java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData>> r0 = r1.bodyMapHttpData
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L19
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            io.netty.handler.codec.http.multipart.InterfaceHttpData r2 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r2
            return r2
        L19:
            r2 = 0
            return r2
        L1b:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r2 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r2.<init>()
            throw r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> getBodyHttpDatas() {
            r1 = this;
            r1.checkDestroyed()
            boolean r0 = r1.isLastChunk
            if (r0 == 0) goto La
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r0 = r1.bodyListHttpData
            return r0
        La:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> getBodyHttpDatas(java.lang.String r2) {
            r1 = this;
            r1.checkDestroyed()
            boolean r0 = r1.isLastChunk
            if (r0 == 0) goto L10
            java.util.Map<java.lang.String, java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData>> r0 = r1.bodyMapHttpData
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
        L10:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r2 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r2.<init>()
            throw r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public int getDiscardThreshold() {
            r1 = this;
            int r0 = r1.discardThreshold
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean hasNext() {
            r2 = this;
            r2.checkDestroyed()
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = r2.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE
            if (r0 != r1) goto L1a
            int r0 = r2.bodyListHttpDataRank
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r1 = r2.bodyListHttpData
            int r1 = r1.size()
            if (r0 >= r1) goto L14
            goto L1a
        L14:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$EndOfDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$EndOfDataDecoderException
            r0.<init>()
            throw r0
        L1a:
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r0 = r2.bodyListHttpData
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            int r0 = r2.bodyListHttpDataRank
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r1 = r2.bodyListHttpData
            int r1 = r1.size()
            if (r0 >= r1) goto L2e
            r0 = 1
            return r0
        L2e:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean isMultipart() {
            r1 = this;
            r1.checkDestroyed()
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.InterfaceHttpData next() {
            r3 = this;
            r3.checkDestroyed()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r0 = r3.bodyListHttpData
            int r1 = r3.bodyListHttpDataRank
            int r2 = r1 + 1
            r3.bodyListHttpDataRank = r2
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r0
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder offer(io.netty.handler.codec.http.HttpContent r3) {
            r2 = this;
            r2.checkDestroyed()
            io.netty.buffer.ByteBuf r0 = r3.content()
            io.netty.buffer.ByteBuf r1 = r2.undecodedChunk
            if (r1 != 0) goto L12
            io.netty.buffer.ByteBuf r0 = r0.copy()
            r2.undecodedChunk = r0
            goto L15
        L12:
            r1.writeBytes(r0)
        L15:
            boolean r3 = r3 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r3 == 0) goto L1c
            r3 = 1
            r2.isLastChunk = r3
        L1c:
            r2.parseBody()
            io.netty.buffer.ByteBuf r3 = r2.undecodedChunk
            if (r3 == 0) goto L30
            int r3 = r3.writerIndex()
            int r0 = r2.discardThreshold
            if (r3 <= r0) goto L30
            io.netty.buffer.ByteBuf r3 = r2.undecodedChunk
            r3.discardReadBytes()
        L30:
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder offer(io.netty.handler.codec.http.HttpContent r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder r1 = r0.offer(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void removeHttpDataFromClean(io.netty.handler.codec.http.multipart.InterfaceHttpData r3) {
            r2 = this;
            r2.checkDestroyed()
            io.netty.handler.codec.http.multipart.HttpDataFactory r0 = r2.factory
            io.netty.handler.codec.http.HttpRequest r1 = r2.request
            r0.removeHttpDataFromClean(r1, r3)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void setDiscardThreshold(int r2) {
            r1 = this;
            java.lang.String r0 = "discardThreshold"
            int r2 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.discardThreshold = r2
            return
    }
}
