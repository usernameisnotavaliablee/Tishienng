package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpPostMultipartRequestDecoder implements io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder {
    private static final java.lang.String FILENAME_ENCODED = null;
    private final java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> bodyListHttpData;
    private int bodyListHttpDataRank;
    private final java.util.Map<java.lang.String, java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData>> bodyMapHttpData;
    private java.nio.charset.Charset charset;
    private io.netty.handler.codec.http.multipart.Attribute currentAttribute;
    private java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> currentFieldAttributes;
    private io.netty.handler.codec.http.multipart.FileUpload currentFileUpload;
    private io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus currentStatus;
    private boolean destroyed;
    private int discardThreshold;
    private final io.netty.handler.codec.http.multipart.HttpDataFactory factory;
    private boolean isLastChunk;
    private java.lang.String multipartDataBoundary;
    private java.lang.String multipartMixedBoundary;
    private final io.netty.handler.codec.http.HttpRequest request;
    private io.netty.buffer.ByteBuf undecodedChunk;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus = null;

        static {
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus[] r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus = r0
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREAMBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDDISPOSITION     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDFILEUPLOAD     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus     // Catch: java.lang.NoSuchFieldError -> L84
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 42
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.FILENAME_ENCODED = r0
            return
    }

    public HttpPostMultipartRequestDecoder(io.netty.handler.codec.http.HttpRequest r4) {
            r3 = this;
            io.netty.handler.codec.http.multipart.DefaultHttpDataFactory r0 = new io.netty.handler.codec.http.multipart.DefaultHttpDataFactory
            r1 = 16384(0x4000, double:8.095E-320)
            r0.<init>(r1)
            java.nio.charset.Charset r1 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r3.<init>(r0, r4, r1)
            return
    }

    public HttpPostMultipartRequestDecoder(io.netty.handler.codec.http.multipart.HttpDataFactory r2, io.netty.handler.codec.http.HttpRequest r3) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r3, r0)
            return
    }

    public HttpPostMultipartRequestDecoder(io.netty.handler.codec.http.multipart.HttpDataFactory r3, io.netty.handler.codec.http.HttpRequest r4, java.nio.charset.Charset r5) {
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
            java.lang.String r1 = "charset"
            java.lang.Object r5 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r1)
            java.nio.charset.Charset r5 = (java.nio.charset.Charset) r5
            r2.charset = r5
            java.lang.String r5 = "factory"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r5)
            io.netty.handler.codec.http.multipart.HttpDataFactory r3 = (io.netty.handler.codec.http.multipart.HttpDataFactory) r3
            r2.factory = r3
            io.netty.handler.codec.http.HttpHeaders r3 = r0.headers()
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            java.lang.String r3 = r3.get(r5)
            r2.setMultipart(r3)
            boolean r3 = r4 instanceof io.netty.handler.codec.http.HttpContent
            if (r3 == 0) goto L50
            io.netty.handler.codec.http.HttpContent r4 = (io.netty.handler.codec.http.HttpContent) r4
            r2.offer(r4)
            return
        L50:
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
            java.lang.Class<io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder> r2 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " was destroyed already"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void cleanMixedAttributes() {
            r2 = this;
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r2.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            r0.remove(r1)
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r2.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r0.remove(r1)
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r2.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TRANSFER_ENCODING
            r0.remove(r1)
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r2.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r0.remove(r1)
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r2.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            r0.remove(r1)
            return
    }

    private static java.lang.String cleanString(java.lang.String r5) {
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L34
            char r3 = r5.charAt(r2)
            r4 = 9
            if (r3 == r4) goto L2c
            r4 = 34
            if (r3 == r4) goto L31
            r4 = 44
            if (r3 == r4) goto L2c
            r4 = 61
            if (r3 == r4) goto L2c
            r4 = 58
            if (r3 == r4) goto L2c
            r4 = 59
            if (r3 == r4) goto L2c
            r1.append(r3)
            goto L31
        L2c:
            r3 = 32
            r1.append(r3)
        L31:
            int r2 = r2 + 1
            goto La
        L34:
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.trim()
            return r5
    }

    private io.netty.handler.codec.http.multipart.InterfaceHttpData decodeMultipart(io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus r8) {
            r7 = this;
            int[] r0 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus
            int r8 = r8.ordinal()
            r8 = r0[r8]
            java.lang.String r0 = "Should not be called with the current getStatus"
            r1 = 0
            switch(r8) {
                case 1: goto L103;
                case 2: goto Lfd;
                case 3: goto Lf2;
                case 4: goto Led;
                case 5: goto L35;
                case 6: goto L2e;
                case 7: goto L23;
                case 8: goto L1e;
                case 9: goto L17;
                case 10: goto L16;
                case 11: goto L16;
                default: goto Le;
            }
        Le:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r8 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            java.lang.String r0 = "Shouldn't reach here."
            r8.<init>(r0)
            throw r8
        L16:
            return r1
        L17:
            java.lang.String r8 = r7.multipartMixedBoundary
            io.netty.handler.codec.http.multipart.InterfaceHttpData r8 = r7.getFileUpload(r8)
            return r8
        L1e:
            io.netty.handler.codec.http.multipart.InterfaceHttpData r8 = r7.findMultipartDisposition()
            return r8
        L23:
            java.lang.String r8 = r7.multipartMixedBoundary
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDDISPOSITION
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER
            io.netty.handler.codec.http.multipart.InterfaceHttpData r8 = r7.findMultipartDelimiter(r8, r0, r1)
            return r8
        L2e:
            java.lang.String r8 = r7.multipartDataBoundary
            io.netty.handler.codec.http.multipart.InterfaceHttpData r8 = r7.getFileUpload(r8)
            return r8
        L35:
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r8 = r7.currentFieldAttributes
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            java.lang.Object r8 = r8.get(r0)
            io.netty.handler.codec.http.multipart.Attribute r8 = (io.netty.handler.codec.http.multipart.Attribute) r8
            if (r8 == 0) goto L5a
            java.lang.String r8 = r8.getValue()     // Catch: java.nio.charset.UnsupportedCharsetException -> L4a java.io.IOException -> L4c
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch: java.nio.charset.UnsupportedCharsetException -> L4a java.io.IOException -> L4c
            goto L5b
        L4a:
            r8 = move-exception
            goto L4e
        L4c:
            r8 = move-exception
            goto L54
        L4e:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r8)
            throw r0
        L54:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r8)
            throw r0
        L5a:
            r8 = r1
        L5b:
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r7.currentFieldAttributes
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.NAME
            java.lang.Object r0 = r0.get(r2)
            io.netty.handler.codec.http.multipart.Attribute r0 = (io.netty.handler.codec.http.multipart.Attribute) r0
            io.netty.handler.codec.http.multipart.Attribute r2 = r7.currentAttribute
            if (r2 != 0) goto Ld5
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r2 = r7.currentFieldAttributes
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            java.lang.Object r2 = r2.get(r3)
            io.netty.handler.codec.http.multipart.Attribute r2 = (io.netty.handler.codec.http.multipart.Attribute) r2
            r3 = 0
            if (r2 == 0) goto L84
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.NumberFormatException -> L80 java.io.IOException -> L82
            long r5 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L80 java.io.IOException -> L82
            goto L8c
        L80:
            goto L84
        L82:
            r8 = move-exception
            goto L86
        L84:
            r5 = r3
            goto L8c
        L86:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r8)
            throw r0
        L8c:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto La9
            io.netty.handler.codec.http.multipart.HttpDataFactory r2 = r7.factory     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            io.netty.handler.codec.http.HttpRequest r3 = r7.request     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            java.lang.String r0 = r0.getValue()     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            java.lang.String r0 = cleanString(r0)     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.createAttribute(r3, r0, r5)     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            r7.currentAttribute = r0     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            goto Lbb
        La3:
            r8 = move-exception
            goto Lc3
        La5:
            r8 = move-exception
            goto Lc9
        La7:
            r8 = move-exception
            goto Lcf
        La9:
            io.netty.handler.codec.http.multipart.HttpDataFactory r2 = r7.factory     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            io.netty.handler.codec.http.HttpRequest r3 = r7.request     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            java.lang.String r0 = r0.getValue()     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            java.lang.String r0 = cleanString(r0)     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.createAttribute(r3, r0)     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
            r7.currentAttribute = r0     // Catch: java.io.IOException -> La3 java.lang.IllegalArgumentException -> La5 java.lang.NullPointerException -> La7
        Lbb:
            if (r8 == 0) goto Ld5
            io.netty.handler.codec.http.multipart.Attribute r0 = r7.currentAttribute
            r0.setCharset(r8)
            goto Ld5
        Lc3:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r8)
            throw r0
        Lc9:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r8)
            throw r0
        Lcf:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r8)
            throw r0
        Ld5:
            io.netty.buffer.ByteBuf r8 = r7.undecodedChunk
            java.lang.String r0 = r7.multipartDataBoundary
            io.netty.handler.codec.http.multipart.Attribute r2 = r7.currentAttribute
            boolean r8 = loadDataMultipart(r8, r0, r2)
            if (r8 != 0) goto Le2
            return r1
        Le2:
            io.netty.handler.codec.http.multipart.Attribute r8 = r7.currentAttribute
            r7.currentAttribute = r1
            r7.currentFieldAttributes = r1
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER
            r7.currentStatus = r0
            return r8
        Led:
            io.netty.handler.codec.http.multipart.InterfaceHttpData r8 = r7.findMultipartDisposition()
            return r8
        Lf2:
            java.lang.String r8 = r7.multipartDataBoundary
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE
            io.netty.handler.codec.http.multipart.InterfaceHttpData r8 = r7.findMultipartDelimiter(r8, r0, r1)
            return r8
        Lfd:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r8 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r8.<init>(r0)
            throw r8
        L103:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r8 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r8.<init>(r0)
            throw r8
    }

    private io.netty.handler.codec.http.multipart.InterfaceHttpData findMultipartDelimiter(java.lang.String r5, io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus r6, io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus r7) {
            r4 = this;
            io.netty.buffer.ByteBuf r0 = r4.undecodedChunk
            int r0 = r0.readerIndex()
            r1 = 0
            io.netty.buffer.ByteBuf r2 = r4.undecodedChunk     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L5a
            skipControlCharacters(r2)     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L5a
            r4.skipOneLine()
            io.netty.buffer.ByteBuf r2 = r4.undecodedChunk     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L54
            java.lang.String r2 = readDelimiter(r2, r5)     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L54
            boolean r3 = r2.equals(r5)
            if (r3 == 0) goto L22
            r4.currentStatus = r6
            io.netty.handler.codec.http.multipart.InterfaceHttpData r5 = r4.decodeMultipart(r6)
            return r5
        L22:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "--"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L47
            r4.currentStatus = r7
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r5 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER
            if (r7 != r5) goto L46
            r4.currentFieldAttributes = r1
            io.netty.handler.codec.http.multipart.InterfaceHttpData r5 = r4.decodeMultipart(r5)
            return r5
        L46:
            return r1
        L47:
            io.netty.buffer.ByteBuf r5 = r4.undecodedChunk
            r5.readerIndex(r0)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r5 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            java.lang.String r6 = "No Multipart delimiter found"
            r5.<init>(r6)
            throw r5
        L54:
            io.netty.buffer.ByteBuf r5 = r4.undecodedChunk
            r5.readerIndex(r0)
            return r1
        L5a:
            io.netty.buffer.ByteBuf r5 = r4.undecodedChunk
            r5.readerIndex(r0)
            return r1
    }

    private io.netty.handler.codec.http.multipart.InterfaceHttpData findMultipartDisposition() {
            r13 = this;
            io.netty.buffer.ByteBuf r0 = r13.undecodedChunk
            int r0 = r0.readerIndex()
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = r13.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION
            if (r1 != r2) goto L15
            java.util.TreeMap r1 = new java.util.TreeMap
            io.netty.handler.codec.http.multipart.CaseIgnoringComparator r2 = io.netty.handler.codec.http.multipart.CaseIgnoringComparator.INSTANCE
            r1.<init>(r2)
            r13.currentFieldAttributes = r1
        L15:
            boolean r1 = r13.skipOneLine()
            if (r1 != 0) goto L1a9
            io.netty.buffer.ByteBuf r1 = r13.undecodedChunk     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L1a2
            skipControlCharacters(r1)     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L1a2
            io.netty.buffer.ByteBuf r1 = r13.undecodedChunk     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L1a2
            java.nio.charset.Charset r2 = r13.charset     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L1a2
            java.lang.String r1 = readLine(r1, r2)     // Catch: io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException -> L1a2
            java.lang.String[] r1 = splitMultipartHeader(r1)
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r3 = 0
            r4 = r1[r3]
            boolean r2 = r2.contentEqualsIgnoreCase(r4)
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L8a
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = r13.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r6 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION
            if (r2 != r6) goto L48
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.FORM_DATA
            r3 = r1[r5]
            boolean r2 = r2.contentEqualsIgnoreCase(r3)
            goto L5e
        L48:
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.ATTACHMENT
            r6 = r1[r5]
            boolean r2 = r2.contentEqualsIgnoreCase(r6)
            if (r2 != 0) goto L5c
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.FILE
            r6 = r1[r5]
            boolean r2 = r2.contentEqualsIgnoreCase(r6)
            if (r2 == 0) goto L5d
        L5c:
            r3 = 1
        L5d:
            r2 = r3
        L5e:
            if (r2 == 0) goto L15
            r2 = 2
        L61:
            int r3 = r1.length
            if (r2 >= r3) goto L15
            r3 = r1[r2]
            java.lang.String r5 = "="
            java.lang.String[] r3 = r3.split(r5, r4)
            io.netty.handler.codec.http.multipart.Attribute r3 = r13.getContentDispositionAttribute(r3)     // Catch: java.lang.IllegalArgumentException -> L7c java.lang.NullPointerException -> L83
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r5 = r13.currentFieldAttributes
            java.lang.String r6 = r3.getName()
            r5.put(r6, r3)
            int r2 = r2 + 1
            goto L61
        L7c:
            r0 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L83:
            r0 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L8a:
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TRANSFER_ENCODING
            r6 = r1[r3]
            boolean r6 = r2.contentEqualsIgnoreCase(r6)
            if (r6 == 0) goto Lbd
            io.netty.handler.codec.http.multipart.HttpDataFactory r3 = r13.factory     // Catch: java.lang.IllegalArgumentException -> Lad java.lang.NullPointerException -> Laf
            io.netty.handler.codec.http.HttpRequest r4 = r13.request     // Catch: java.lang.IllegalArgumentException -> Lad java.lang.NullPointerException -> Laf
            java.lang.String r6 = r2.toString()     // Catch: java.lang.IllegalArgumentException -> Lad java.lang.NullPointerException -> Laf
            r1 = r1[r5]     // Catch: java.lang.IllegalArgumentException -> Lad java.lang.NullPointerException -> Laf
            java.lang.String r1 = cleanString(r1)     // Catch: java.lang.IllegalArgumentException -> Lad java.lang.NullPointerException -> Laf
            io.netty.handler.codec.http.multipart.Attribute r1 = r3.createAttribute(r4, r6, r1)     // Catch: java.lang.IllegalArgumentException -> Lad java.lang.NullPointerException -> Laf
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r3 = r13.currentFieldAttributes
            r3.put(r2, r1)
            goto L15
        Lad:
            r0 = move-exception
            goto Lb1
        Laf:
            r0 = move-exception
            goto Lb7
        Lb1:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        Lb7:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        Lbd:
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r6 = r1[r3]
            boolean r6 = r2.contentEqualsIgnoreCase(r6)
            if (r6 == 0) goto Lf0
            io.netty.handler.codec.http.multipart.HttpDataFactory r3 = r13.factory     // Catch: java.lang.IllegalArgumentException -> Le0 java.lang.NullPointerException -> Le2
            io.netty.handler.codec.http.HttpRequest r4 = r13.request     // Catch: java.lang.IllegalArgumentException -> Le0 java.lang.NullPointerException -> Le2
            java.lang.String r6 = r2.toString()     // Catch: java.lang.IllegalArgumentException -> Le0 java.lang.NullPointerException -> Le2
            r1 = r1[r5]     // Catch: java.lang.IllegalArgumentException -> Le0 java.lang.NullPointerException -> Le2
            java.lang.String r1 = cleanString(r1)     // Catch: java.lang.IllegalArgumentException -> Le0 java.lang.NullPointerException -> Le2
            io.netty.handler.codec.http.multipart.Attribute r1 = r3.createAttribute(r4, r6, r1)     // Catch: java.lang.IllegalArgumentException -> Le0 java.lang.NullPointerException -> Le2
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r3 = r13.currentFieldAttributes
            r3.put(r2, r1)
            goto L15
        Le0:
            r0 = move-exception
            goto Le4
        Le2:
            r0 = move-exception
            goto Lea
        Le4:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        Lea:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        Lf0:
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r6 = r1[r3]
            boolean r2 = r2.contentEqualsIgnoreCase(r6)
            if (r2 == 0) goto L15
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.MULTIPART_MIXED
            r6 = r1[r5]
            boolean r2 = r2.contentEqualsIgnoreCase(r6)
            r6 = 61
            if (r2 == 0) goto L136
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = r13.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION
            if (r0 != r2) goto L12e
            r0 = r1[r4]
            java.lang.String r0 = io.netty.util.internal.StringUtil.substringAfter(r0, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "--"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.multipartMixedBoundary = r0
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER
            r13.currentStatus = r0
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r13.decodeMultipart(r0)
            return r0
        L12e:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            java.lang.String r1 = "Mixed Multipart found in a previous Mixed Multipart"
            r0.<init>(r1)
            throw r0
        L136:
            int r2 = r1.length
            if (r5 >= r2) goto L15
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            java.lang.String r10 = r2.toString()
            r7 = r1[r5]
            r11 = 0
            int r12 = r10.length()
            r8 = 1
            r9 = 0
            boolean r4 = r7.regionMatches(r8, r9, r10, r11, r12)
            if (r4 == 0) goto L176
            r4 = r1[r5]
            java.lang.String r4 = io.netty.util.internal.StringUtil.substringAfter(r4, r6)
            io.netty.handler.codec.http.multipart.HttpDataFactory r7 = r13.factory     // Catch: java.lang.IllegalArgumentException -> L166 java.lang.NullPointerException -> L168
            io.netty.handler.codec.http.HttpRequest r8 = r13.request     // Catch: java.lang.IllegalArgumentException -> L166 java.lang.NullPointerException -> L168
            java.lang.String r4 = cleanString(r4)     // Catch: java.lang.IllegalArgumentException -> L166 java.lang.NullPointerException -> L168
            io.netty.handler.codec.http.multipart.Attribute r4 = r7.createAttribute(r8, r10, r4)     // Catch: java.lang.IllegalArgumentException -> L166 java.lang.NullPointerException -> L168
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r7 = r13.currentFieldAttributes
            r7.put(r2, r4)
            goto L18f
        L166:
            r0 = move-exception
            goto L16a
        L168:
            r0 = move-exception
            goto L170
        L16a:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L170:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L176:
            io.netty.handler.codec.http.multipart.HttpDataFactory r2 = r13.factory     // Catch: java.lang.IllegalArgumentException -> L192 java.lang.NullPointerException -> L194
            io.netty.handler.codec.http.HttpRequest r4 = r13.request     // Catch: java.lang.IllegalArgumentException -> L192 java.lang.NullPointerException -> L194
            r7 = r1[r3]     // Catch: java.lang.IllegalArgumentException -> L192 java.lang.NullPointerException -> L194
            java.lang.String r7 = cleanString(r7)     // Catch: java.lang.IllegalArgumentException -> L192 java.lang.NullPointerException -> L194
            r8 = r1[r5]     // Catch: java.lang.IllegalArgumentException -> L192 java.lang.NullPointerException -> L194
            io.netty.handler.codec.http.multipart.Attribute r2 = r2.createAttribute(r4, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L192 java.lang.NullPointerException -> L194
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r4 = r13.currentFieldAttributes
            java.lang.String r7 = r2.getName()
            r4.put(r7, r2)
        L18f:
            int r5 = r5 + 1
            goto L136
        L192:
            r0 = move-exception
            goto L196
        L194:
            r0 = move-exception
            goto L19c
        L196:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L19c:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r1.<init>(r0)
            throw r1
        L1a2:
            io.netty.buffer.ByteBuf r1 = r13.undecodedChunk
            r1.readerIndex(r0)
            r0 = 0
            return r0
        L1a9:
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r13.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.http.multipart.Attribute r0 = (io.netty.handler.codec.http.multipart.Attribute) r0
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = r13.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION
            if (r1 != r2) goto L1cd
            if (r0 == 0) goto L1c4
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD
            r13.currentStatus = r0
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r13.decodeMultipart(r0)
            return r0
        L1c4:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD
            r13.currentStatus = r0
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r13.decodeMultipart(r0)
            return r0
        L1cd:
            if (r0 == 0) goto L1d8
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDFILEUPLOAD
            r13.currentStatus = r0
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r13.decodeMultipart(r0)
            return r0
        L1d8:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            java.lang.String r1 = "Filename not found"
            r0.<init>(r1)
            throw r0
    }

    private io.netty.handler.codec.http.multipart.Attribute getContentDispositionAttribute(java.lang.String... r6) {
            r5 = this;
            r0 = 0
            r1 = r6[r0]
            java.lang.String r1 = cleanString(r1)
            r2 = 1
            r6 = r6[r2]
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            boolean r4 = r3.contentEquals(r1)
            if (r4 == 0) goto L2c
            int r3 = r6.length()
            int r3 = r3 - r2
            if (r3 <= 0) goto L61
            char r0 = r6.charAt(r0)
            r4 = 34
            if (r0 != r4) goto L61
            char r0 = r6.charAt(r3)
            if (r0 != r4) goto L61
            java.lang.String r6 = r6.substring(r2, r3)
            goto L61
        L2c:
            java.lang.String r2 = io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder.FILENAME_ENCODED
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.String r1 = r3.toString()     // Catch: java.nio.charset.UnsupportedCharsetException -> L4d java.lang.ArrayIndexOutOfBoundsException -> L4f
            java.lang.String r2 = "'"
            r3 = 3
            java.lang.String[] r6 = r6.split(r2, r3)     // Catch: java.nio.charset.UnsupportedCharsetException -> L4d java.lang.ArrayIndexOutOfBoundsException -> L4f
            r2 = 2
            r2 = r6[r2]     // Catch: java.nio.charset.UnsupportedCharsetException -> L4d java.lang.ArrayIndexOutOfBoundsException -> L4f
            r6 = r6[r0]     // Catch: java.nio.charset.UnsupportedCharsetException -> L4d java.lang.ArrayIndexOutOfBoundsException -> L4f
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.nio.charset.UnsupportedCharsetException -> L4d java.lang.ArrayIndexOutOfBoundsException -> L4f
            java.lang.String r6 = io.netty.handler.codec.http.QueryStringDecoder.decodeComponent(r2, r6)     // Catch: java.nio.charset.UnsupportedCharsetException -> L4d java.lang.ArrayIndexOutOfBoundsException -> L4f
            goto L61
        L4d:
            r6 = move-exception
            goto L51
        L4f:
            r6 = move-exception
            goto L57
        L51:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r6)
            throw r0
        L57:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r6)
            throw r0
        L5d:
            java.lang.String r6 = cleanString(r6)
        L61:
            io.netty.handler.codec.http.multipart.HttpDataFactory r0 = r5.factory
            io.netty.handler.codec.http.HttpRequest r2 = r5.request
            io.netty.handler.codec.http.multipart.Attribute r6 = r0.createAttribute(r2, r1, r6)
            return r6
    }

    private static boolean loadDataMultipart(io.netty.buffer.ByteBuf r12, java.lang.String r13, io.netty.handler.codec.http.multipart.HttpData r14) {
            boolean r0 = r12.hasArray()
            if (r0 != 0) goto Lb
            boolean r12 = loadDataMultipartStandard(r12, r13, r14)
            return r12
        Lb:
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize r0 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize
            r0.<init>(r12)
            int r1 = r12.readerIndex()
            int r2 = r13.length()
            int r3 = r0.pos
            r4 = 10
            r5 = 0
            r6 = 10
            r7 = 0
        L20:
            int r8 = r0.pos
            int r9 = r0.limit
            r10 = 13
            if (r8 >= r9) goto L4a
            byte[] r9 = r0.bytes
            int r11 = r8 + 1
            r0.pos = r11
            r8 = r9[r8]
            r9 = 1
            if (r6 != r4) goto L3f
            int r11 = r13.codePointAt(r7)
            if (r8 != r11) goto L3f
            int r7 = r7 + 1
            if (r2 != r7) goto L20
            r5 = 1
            goto L4a
        L3f:
            int r3 = r0.pos
            if (r8 != r4) goto L48
            if (r6 != r10) goto L46
            r9 = 2
        L46:
            int r3 = r3 - r9
            r7 = 0
        L48:
            r6 = r8
            goto L20
        L4a:
            if (r6 != r10) goto L4e
            int r3 = r3 + (-1)
        L4e:
            int r13 = r0.getReadPosition(r3)
            int r0 = r13 - r1
            io.netty.buffer.ByteBuf r0 = r12.copy(r1, r0)
            r14.addContent(r0, r5)     // Catch: java.io.IOException -> L5f
            r12.readerIndex(r13)
            return r5
        L5f:
            r12 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r13 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r13.<init>(r12)
            throw r13
    }

    private static boolean loadDataMultipartStandard(io.netty.buffer.ByteBuf r11, java.lang.String r12, io.netty.handler.codec.http.multipart.HttpData r13) {
            int r0 = r11.readerIndex()
            int r1 = r12.length()
            r2 = 0
            r3 = 10
            r6 = r0
            r4 = 10
            r5 = 0
        Lf:
            boolean r7 = r11.isReadable()
            r8 = 13
            if (r7 == 0) goto L37
            byte r7 = r11.readByte()
            r9 = 1
            if (r4 != r3) goto L2a
            int r10 = r12.codePointAt(r5)
            if (r7 != r10) goto L2a
            int r5 = r5 + 1
            if (r1 != r5) goto Lf
            r2 = 1
            goto L37
        L2a:
            int r6 = r11.readerIndex()
            if (r7 != r3) goto L35
            if (r4 != r8) goto L33
            r9 = 2
        L33:
            int r6 = r6 - r9
            r5 = 0
        L35:
            r4 = r7
            goto Lf
        L37:
            if (r4 != r8) goto L3b
            int r6 = r6 + (-1)
        L3b:
            int r12 = r6 - r0
            io.netty.buffer.ByteBuf r12 = r11.copy(r0, r12)
            r13.addContent(r12, r2)     // Catch: java.io.IOException -> L48
            r11.readerIndex(r6)
            return r2
        L48:
            r11 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r12 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r12.<init>(r11)
            throw r12
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
            r2.parseBodyMultipart()
            return
        Lf:
            boolean r0 = r2.isLastChunk
            if (r0 == 0) goto L17
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE
            r2.currentStatus = r0
        L17:
            return
    }

    private void parseBodyMultipart() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.undecodedChunk
            if (r0 == 0) goto L26
            int r0 = r0.readableBytes()
            if (r0 != 0) goto Lb
            goto L26
        Lb:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = r2.currentStatus
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r2.decodeMultipart(r0)
        L11:
            if (r0 == 0) goto L26
            r2.addHttpData(r0)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = r2.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE
            if (r0 == r1) goto L26
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE
            if (r0 != r1) goto L21
            goto L26
        L21:
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r2.decodeMultipart(r0)
            goto L11
        L26:
            return
    }

    private static java.lang.String readDelimiter(io.netty.buffer.ByteBuf r10, java.lang.String r11) {
            boolean r0 = r10.hasArray()
            if (r0 != 0) goto Lb
            java.lang.String r10 = readDelimiterStandard(r10, r11)
            return r10
        Lb:
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize r0 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize
            r0.<init>(r10)
            int r1 = r10.readerIndex()
            int r2 = r11.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r4 = 64
            r3.<init>(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r4 = 0
            r5 = 0
        L21:
            int r6 = r0.pos     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r7 = r0.limit     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r6 >= r7) goto L4a
            if (r5 >= r2) goto L4a
            byte[] r7 = r0.bytes     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r8 = r6 + 1
            r0.pos = r8     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r6 = r7[r6]     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            char r7 = r11.charAt(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r6 != r7) goto L41
            int r5 = r5 + 1
            char r6 = (char) r6     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r3.append(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            goto L21
        L3e:
            r11 = move-exception
            goto Lfa
        L41:
            r10.readerIndex(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r11.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            throw r11     // Catch: java.lang.IndexOutOfBoundsException -> L3e
        L4a:
            if (r6 >= r7) goto Lf1
            byte[] r11 = r0.bytes     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r2 = r6 + 1
            r0.pos = r2     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r5 = r11[r6]     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r8 = 13
            r9 = 10
            if (r5 != r8) goto L7e
            if (r2 >= r7) goto L75
            int r6 = r6 + 2
            r0.pos = r6     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r11 = r11[r2]     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r11 != r9) goto L6c
            r0.setReadPosition(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            java.lang.String r10 = r3.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            return r10
        L6c:
            r10.readerIndex(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r11.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            throw r11     // Catch: java.lang.IndexOutOfBoundsException -> L3e
        L75:
            r10.readerIndex(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r11.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            throw r11     // Catch: java.lang.IndexOutOfBoundsException -> L3e
        L7e:
            if (r5 != r9) goto L88
            r0.setReadPosition(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            java.lang.String r10 = r3.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            return r10
        L88:
            r11 = 45
            if (r5 != r11) goto Lf1
            r3.append(r11)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r2 = r0.pos     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r5 = r0.limit     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r2 >= r5) goto Lf1
            byte[] r5 = r0.bytes     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r6 = r2 + 1
            r0.pos = r6     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r2 = r5[r2]     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r2 != r11) goto Lf1
            r3.append(r11)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r11 = r0.pos     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r2 = r0.limit     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r11 >= r2) goto Le9
            byte[] r5 = r0.bytes     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int r6 = r11 + 1
            r0.pos = r6     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r7 = r5[r11]     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r7 != r8) goto Ld6
            if (r6 >= r2) goto Lcd
            int r11 = r11 + 2
            r0.pos = r11     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r11 = r5[r6]     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            if (r11 != r9) goto Lc4
            r0.setReadPosition(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            java.lang.String r10 = r3.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            return r10
        Lc4:
            r10.readerIndex(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r11.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            throw r11     // Catch: java.lang.IndexOutOfBoundsException -> L3e
        Lcd:
            r10.readerIndex(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r11.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            throw r11     // Catch: java.lang.IndexOutOfBoundsException -> L3e
        Ld6:
            if (r7 != r9) goto Le0
            r0.setReadPosition(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            java.lang.String r10 = r3.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            return r10
        Le0:
            r11 = 1
            r0.setReadPosition(r11)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            java.lang.String r10 = r3.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            return r10
        Le9:
            r0.setReadPosition(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            java.lang.String r10 = r3.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            return r10
        Lf1:
            r10.readerIndex(r1)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r10 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r10.<init>()
            throw r10
        Lfa:
            r10.readerIndex(r1)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r10 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r10.<init>(r11)
            throw r10
    }

    private static java.lang.String readDelimiterStandard(io.netty.buffer.ByteBuf r6, java.lang.String r7) {
            int r0 = r6.readerIndex()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L29
            r2 = 64
            r1.<init>(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            int r2 = r7.length()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            r3 = 0
        L10:
            boolean r4 = r6.isReadable()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r4 == 0) goto L35
            if (r3 >= r2) goto L35
            byte r4 = r6.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            char r5 = r7.charAt(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r4 != r5) goto L2c
            int r3 = r3 + 1
            char r4 = (char) r4     // Catch: java.lang.IndexOutOfBoundsException -> L29
            r1.append(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            goto L10
        L29:
            r7 = move-exception
            goto Lb3
        L2c:
            r6.readerIndex(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r7 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L29
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            throw r7     // Catch: java.lang.IndexOutOfBoundsException -> L29
        L35:
            boolean r7 = r6.isReadable()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r7 == 0) goto Laa
            byte r7 = r6.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            r2 = 13
            r3 = 10
            if (r7 != r2) goto L59
            byte r7 = r6.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r7 != r3) goto L50
            java.lang.String r6 = r1.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            return r6
        L50:
            r6.readerIndex(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r7 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L29
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            throw r7     // Catch: java.lang.IndexOutOfBoundsException -> L29
        L59:
            if (r7 != r3) goto L60
            java.lang.String r6 = r1.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            return r6
        L60:
            r4 = 45
            if (r7 != r4) goto Laa
            r1.append(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            byte r7 = r6.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r7 != r4) goto Laa
            r1.append(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            boolean r7 = r6.isReadable()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r7 == 0) goto La5
            byte r7 = r6.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r7 != r2) goto L90
            byte r7 = r6.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            if (r7 != r3) goto L87
            java.lang.String r6 = r1.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            return r6
        L87:
            r6.readerIndex(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r7 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException     // Catch: java.lang.IndexOutOfBoundsException -> L29
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            throw r7     // Catch: java.lang.IndexOutOfBoundsException -> L29
        L90:
            if (r7 != r3) goto L97
            java.lang.String r6 = r1.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            return r6
        L97:
            int r7 = r6.readerIndex()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            int r7 = r7 + (-1)
            r6.readerIndex(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L29
            java.lang.String r6 = r1.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            return r6
        La5:
            java.lang.String r6 = r1.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L29
            return r6
        Laa:
            r6.readerIndex(r0)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r6 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r6.<init>()
            throw r6
        Lb3:
            r6.readerIndex(r0)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r6 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r6.<init>(r7)
            throw r6
    }

    private static java.lang.String readLine(io.netty.buffer.ByteBuf r11, java.nio.charset.Charset r12) {
            boolean r0 = r11.hasArray()
            if (r0 != 0) goto Lb
            java.lang.String r11 = readLineStandard(r11, r12)
            return r11
        Lb:
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize r0 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize
            r0.<init>(r11)
            int r1 = r11.readerIndex()
            r2 = 64
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.buffer(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L41
        L1a:
            int r3 = r0.pos     // Catch: java.lang.IndexOutOfBoundsException -> L41
            int r4 = r0.limit     // Catch: java.lang.IndexOutOfBoundsException -> L41
            if (r3 >= r4) goto L5d
            byte[] r5 = r0.bytes     // Catch: java.lang.IndexOutOfBoundsException -> L41
            int r6 = r3 + 1
            r0.pos = r6     // Catch: java.lang.IndexOutOfBoundsException -> L41
            r7 = r5[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L41
            r8 = 0
            r9 = 10
            r10 = 13
            if (r7 != r10) goto L4f
            if (r6 >= r4) goto L4b
            int r4 = r3 + 2
            r0.pos = r4     // Catch: java.lang.IndexOutOfBoundsException -> L41
            r4 = r5[r6]     // Catch: java.lang.IndexOutOfBoundsException -> L41
            if (r4 != r9) goto L43
            r0.setReadPosition(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            java.lang.String r11 = r2.toString(r12)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            return r11
        L41:
            r12 = move-exception
            goto L66
        L43:
            int r3 = r3 + 1
            r0.pos = r3     // Catch: java.lang.IndexOutOfBoundsException -> L41
            r2.writeByte(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            goto L1a
        L4b:
            r2.writeByte(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            goto L1a
        L4f:
            if (r7 != r9) goto L59
            r0.setReadPosition(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            java.lang.String r11 = r2.toString(r12)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            return r11
        L59:
            r2.writeByte(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            goto L1a
        L5d:
            r11.readerIndex(r1)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r11.<init>()
            throw r11
        L66:
            r11.readerIndex(r1)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r11.<init>(r12)
            throw r11
    }

    private static java.lang.String readLineStandard(io.netty.buffer.ByteBuf r5, java.nio.charset.Charset r6) {
            int r0 = r5.readerIndex()
            r1 = 64
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.buffer(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L2c
        La:
            boolean r2 = r5.isReadable()     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            if (r2 == 0) goto L3d
            byte r2 = r5.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            r3 = 10
            r4 = 13
            if (r2 != r4) goto L32
            int r2 = r5.readerIndex()     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            byte r2 = r5.getByte(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            if (r2 != r3) goto L2e
            r5.readByte()     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            java.lang.String r5 = r1.toString(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            return r5
        L2c:
            r6 = move-exception
            goto L46
        L2e:
            r1.writeByte(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            goto La
        L32:
            if (r2 != r3) goto L39
            java.lang.String r5 = r1.toString(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            return r5
        L39:
            r1.writeByte(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L2c
            goto La
        L3d:
            r5.readerIndex(r0)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r5 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r5.<init>()
            throw r5
        L46:
            r5.readerIndex(r0)
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r5 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r5.<init>(r6)
            throw r5
    }

    private void setMultipart(java.lang.String r3) {
            r2 = this;
            java.lang.String[] r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.getMultipartDataBoundary(r3)
            if (r3 == 0) goto L1a
            r0 = 0
            r0 = r3[r0]
            r2.multipartDataBoundary = r0
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto L1d
            r3 = r3[r1]
            if (r3 == 0) goto L1d
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r2.charset = r3
            goto L1d
        L1a:
            r3 = 0
            r2.multipartDataBoundary = r3
        L1d:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER
            r2.currentStatus = r3
            return
    }

    private static void skipControlCharacters(io.netty.buffer.ByteBuf r3) {
            boolean r0 = r3.hasArray()
            if (r0 != 0) goto L11
            skipControlCharactersStandard(r3)     // Catch: java.lang.IndexOutOfBoundsException -> La
            return
        La:
            r3 = move-exception
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            r0.<init>(r3)
            throw r0
        L11:
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize r0 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$SeekAheadOptimize
            r0.<init>(r3)
        L16:
            int r3 = r0.pos
            int r1 = r0.limit
            if (r3 >= r1) goto L38
            byte[] r1 = r0.bytes
            int r2 = r3 + 1
            r0.pos = r2
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3
            boolean r1 = java.lang.Character.isISOControl(r3)
            if (r1 != 0) goto L16
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 != 0) goto L16
            r3 = 1
            r0.setReadPosition(r3)
            return
        L38:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException r3 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$NotEnoughDataDecoderException
            java.lang.String r0 = "Access out of bounds"
            r3.<init>(r0)
            throw r3
    }

    private static void skipControlCharactersStandard(io.netty.buffer.ByteBuf r2) {
        L0:
            short r0 = r2.readUnsignedByte()
            char r0 = (char) r0
            boolean r1 = java.lang.Character.isISOControl(r0)
            if (r1 != 0) goto L0
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L0
            int r0 = r2.readerIndex()
            int r0 = r0 + (-1)
            r2.readerIndex(r0)
            return
    }

    private boolean skipOneLine() {
            r5 = this;
            io.netty.buffer.ByteBuf r0 = r5.undecodedChunk
            boolean r0 = r0.isReadable()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            io.netty.buffer.ByteBuf r0 = r5.undecodedChunk
            byte r0 = r0.readByte()
            r2 = 13
            r3 = 10
            r4 = 1
            if (r0 != r2) goto L3f
            io.netty.buffer.ByteBuf r0 = r5.undecodedChunk
            boolean r0 = r0.isReadable()
            if (r0 != 0) goto L2a
            io.netty.buffer.ByteBuf r0 = r5.undecodedChunk
            int r2 = r0.readerIndex()
            int r2 = r2 - r4
            r0.readerIndex(r2)
            return r1
        L2a:
            io.netty.buffer.ByteBuf r0 = r5.undecodedChunk
            byte r0 = r0.readByte()
            if (r0 != r3) goto L33
            return r4
        L33:
            io.netty.buffer.ByteBuf r0 = r5.undecodedChunk
            int r2 = r0.readerIndex()
            int r2 = r2 + (-2)
            r0.readerIndex(r2)
            return r1
        L3f:
            if (r0 != r3) goto L42
            return r4
        L42:
            io.netty.buffer.ByteBuf r0 = r5.undecodedChunk
            int r2 = r0.readerIndex()
            int r2 = r2 - r4
            r0.readerIndex(r2)
            return r1
    }

    private static java.lang.String[] splitMultipartHeader(java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            int r2 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findNonWhitespace(r7, r1)
            r3 = r2
        Lc:
            int r4 = r7.length()
            r5 = 58
            if (r3 >= r4) goto L24
            char r4 = r7.charAt(r3)
            if (r4 == r5) goto L24
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 == 0) goto L21
            goto L24
        L21:
            int r3 = r3 + 1
            goto Lc
        L24:
            r4 = r3
        L25:
            int r6 = r7.length()
            if (r4 >= r6) goto L37
            char r6 = r7.charAt(r4)
            if (r6 != r5) goto L34
            int r4 = r4 + 1
            goto L37
        L34:
            int r4 = r4 + 1
            goto L25
        L37:
            int r4 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findNonWhitespace(r7, r4)
            int r5 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findEndOfString(r7)
            java.lang.String r2 = r7.substring(r2, r3)
            r0.add(r2)
            if (r4 < r5) goto L4b
            java.lang.String r7 = ""
            goto L4f
        L4b:
            java.lang.String r7 = r7.substring(r4, r5)
        L4f:
            r2 = 59
            int r2 = r7.indexOf(r2)
            if (r2 < 0) goto L5c
            java.lang.String[] r7 = splitMultipartHeaderValues(r7)
            goto L62
        L5c:
            java.lang.String r2 = ","
            java.lang.String[] r7 = r7.split(r2)
        L62:
            int r2 = r7.length
            r3 = 0
        L64:
            if (r3 >= r2) goto L72
            r4 = r7[r3]
            java.lang.String r4 = r4.trim()
            r0.add(r4)
            int r3 = r3 + 1
            goto L64
        L72:
            int r7 = r0.size()
            java.lang.String[] r7 = new java.lang.String[r7]
        L78:
            int r2 = r0.size()
            if (r1 >= r2) goto L89
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r7[r1] = r2
            int r1 = r1 + 1
            goto L78
        L89:
            return r7
    }

    private static java.lang.String[] splitMultipartHeaderValues(java.lang.String r10) {
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            r1 = 1
            java.util.ArrayList r0 = r0.arrayList(r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        Le:
            int r7 = r10.length()
            if (r3 >= r7) goto L3e
            char r7 = r10.charAt(r3)
            r8 = 34
            if (r5 == 0) goto L2a
            if (r6 == 0) goto L20
            r6 = 0
            goto L3b
        L20:
            r9 = 92
            if (r7 != r9) goto L26
            r6 = 1
            goto L3b
        L26:
            if (r7 != r8) goto L3b
            r5 = 0
            goto L3b
        L2a:
            if (r7 != r8) goto L2e
            r5 = 1
            goto L3b
        L2e:
            r8 = 59
            if (r7 != r8) goto L3b
            java.lang.String r4 = r10.substring(r4, r3)
            r0.add(r4)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Le
        L3e:
            java.lang.String r10 = r10.substring(r4)
            r0.add(r10)
            java.lang.String[] r10 = new java.lang.String[r2]
            java.lang.Object[] r10 = r0.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            return r10
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
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.currentFileUpload
            if (r0 == 0) goto L5
            return r0
        L5:
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.currentAttribute
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void destroy() {
            r2 = this;
            r2.checkDestroyed()
            r2.cleanFiles()
            r0 = 1
            r2.destroyed = r0
            io.netty.buffer.ByteBuf r0 = r2.undecodedChunk
            if (r0 == 0) goto L1b
            int r0 = r0.refCnt()
            if (r0 <= 0) goto L1b
            io.netty.buffer.ByteBuf r0 = r2.undecodedChunk
            r0.release()
            r0 = 0
            r2.undecodedChunk = r0
        L1b:
            int r0 = r2.bodyListHttpDataRank
        L1d:
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r1 = r2.bodyListHttpData
            int r1 = r1.size()
            if (r0 >= r1) goto L33
            java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> r1 = r2.bodyListHttpData
            java.lang.Object r1 = r1.get(r0)
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r1
            r1.release()
            int r0 = r0 + 1
            goto L1d
        L33:
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

    protected io.netty.handler.codec.http.multipart.InterfaceHttpData getFileUpload(java.lang.String r11) {
            r10 = this;
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r10.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TRANSFER_ENCODING
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.http.multipart.Attribute r0 = (io.netty.handler.codec.http.multipart.Attribute) r0
            java.nio.charset.Charset r1 = r10.charset
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r2 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BIT7
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.getValue()     // Catch: java.io.IOException -> L58
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.io.IOException -> L58
            java.lang.String r3 = r2.value()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L25
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            goto L60
        L25:
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r2 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BIT8
            java.lang.String r3 = r2.value()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L34
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.ISO_8859_1
            goto L60
        L34:
            io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r2 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BINARY
            java.lang.String r3 = r2.value()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L41
            goto L60
        L41:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TransferEncoding Unknown: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L58:
            r0 = move-exception
            r11 = r0
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r11)
            throw r0
        L60:
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r10.currentFieldAttributes
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            java.lang.Object r0 = r0.get(r3)
            io.netty.handler.codec.http.multipart.Attribute r0 = (io.netty.handler.codec.http.multipart.Attribute) r0
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.getValue()     // Catch: java.nio.charset.UnsupportedCharsetException -> L76 java.io.IOException -> L79
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch: java.nio.charset.UnsupportedCharsetException -> L76 java.io.IOException -> L79
        L74:
            r7 = r1
            goto L88
        L76:
            r0 = move-exception
            r11 = r0
            goto L7c
        L79:
            r0 = move-exception
            r11 = r0
            goto L82
        L7c:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r11)
            throw r0
        L82:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r11)
            throw r0
        L88:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r10.currentFileUpload
            if (r0 != 0) goto L116
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r0 = r10.currentFieldAttributes
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.http.multipart.Attribute r0 = (io.netty.handler.codec.http.multipart.Attribute) r0
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r1 = r10.currentFieldAttributes
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.NAME
            java.lang.Object r1 = r1.get(r3)
            io.netty.handler.codec.http.multipart.Attribute r1 = (io.netty.handler.codec.http.multipart.Attribute) r1
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r3 = r10.currentFieldAttributes
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            java.lang.Object r3 = r3.get(r4)
            io.netty.handler.codec.http.multipart.Attribute r3 = (io.netty.handler.codec.http.multipart.Attribute) r3
            java.util.Map<java.lang.CharSequence, io.netty.handler.codec.http.multipart.Attribute> r4 = r10.currentFieldAttributes
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            java.lang.Object r4 = r4.get(r5)
            io.netty.handler.codec.http.multipart.Attribute r4 = (io.netty.handler.codec.http.multipart.Attribute) r4
            r5 = 0
            if (r4 == 0) goto Lc6
            java.lang.String r4 = r4.getValue()     // Catch: java.lang.NumberFormatException -> Lc1 java.io.IOException -> Lc3
            long r5 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> Lc1 java.io.IOException -> Lc3
            goto Lc6
        Lc1:
            goto Lc6
        Lc3:
            r0 = move-exception
            r11 = r0
            goto Lc8
        Lc6:
            r8 = r5
            goto Lce
        Lc8:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r11)
            throw r0
        Lce:
            if (r3 == 0) goto Le0
            java.lang.String r3 = r3.getValue()     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
        Ld4:
            r5 = r3
            r3 = r1
            goto Le3
        Ld7:
            r0 = move-exception
            r11 = r0
            goto L104
        Lda:
            r0 = move-exception
            r11 = r0
            goto L10a
        Ldd:
            r0 = move-exception
            r11 = r0
            goto L110
        Le0:
            java.lang.String r3 = "application/octet-stream"
            goto Ld4
        Le3:
            io.netty.handler.codec.http.multipart.HttpDataFactory r1 = r10.factory     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            r4 = r2
            io.netty.handler.codec.http.HttpRequest r2 = r10.request     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            java.lang.String r3 = r3.getValue()     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            java.lang.String r3 = cleanString(r3)     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            java.lang.String r0 = r0.getValue()     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            java.lang.String r0 = cleanString(r0)     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            java.lang.String r6 = r4.value()     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            r4 = r0
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.createFileUpload(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            r10.currentFileUpload = r0     // Catch: java.io.IOException -> Ld7 java.lang.IllegalArgumentException -> Lda java.lang.NullPointerException -> Ldd
            goto L116
        L104:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r11)
            throw r0
        L10a:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r11)
            throw r0
        L110:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            r0.<init>(r11)
            throw r0
        L116:
            io.netty.buffer.ByteBuf r0 = r10.undecodedChunk
            io.netty.handler.codec.http.multipart.FileUpload r1 = r10.currentFileUpload
            boolean r11 = loadDataMultipart(r0, r11, r1)
            r0 = 0
            if (r11 != 0) goto L122
            return r0
        L122:
            io.netty.handler.codec.http.multipart.FileUpload r11 = r10.currentFileUpload
            boolean r11 = r11.isCompleted()
            if (r11 == 0) goto L143
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r11 = r10.currentStatus
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD
            if (r11 != r1) goto L137
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r11 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER
            r10.currentStatus = r11
            r10.currentFieldAttributes = r0
            goto L13e
        L137:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r11 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER
            r10.currentStatus = r11
            r10.cleanMixedAttributes()
        L13e:
            io.netty.handler.codec.http.multipart.FileUpload r11 = r10.currentFileUpload
            r10.currentFileUpload = r0
            return r11
        L143:
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
            r0 = 1
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
    public io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder offer(io.netty.handler.codec.http.HttpContent r3) {
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
            io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder r1 = r0.offer(r1)
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
