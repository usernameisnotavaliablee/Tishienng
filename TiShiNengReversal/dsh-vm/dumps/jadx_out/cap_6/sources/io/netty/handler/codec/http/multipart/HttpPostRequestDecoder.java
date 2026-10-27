package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpPostRequestDecoder implements io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder {
    static final int DEFAULT_DISCARD_THRESHOLD = 10485760;
    private final io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder decoder;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EndOfDataDecoderException extends io.netty.handler.codec.DecoderException {
        private static final long serialVersionUID = 1336267941020800769L;

        public EndOfDataDecoderException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ErrorDataDecoderException extends io.netty.handler.codec.DecoderException {
        private static final long serialVersionUID = 5020247425493164465L;

        public ErrorDataDecoderException() {
                r0 = this;
                r0.<init>()
                return
        }

        public ErrorDataDecoderException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ErrorDataDecoderException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public ErrorDataDecoderException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected enum MultiPartStatus extends java.lang.Enum<io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus> {
        private static final /* synthetic */ io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus[] $VALUES = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus CLOSEDELIMITER = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus DISPOSITION = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus EPILOGUE = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus FIELD = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus FILEUPLOAD = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus HEADERDELIMITER = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus MIXEDCLOSEDELIMITER = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus MIXEDDELIMITER = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus MIXEDDISPOSITION = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus MIXEDFILEUPLOAD = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus MIXEDPREAMBLE = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus NOTSTARTED = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus PREAMBLE = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus PREEPILOGUE = null;

        static {
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r0 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r1 = "NOTSTARTED"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED = r0
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r3 = "PREAMBLE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREAMBLE = r1
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r3 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r5 = "HEADERDELIMITER"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER = r3
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r5 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r7 = "DISPOSITION"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.DISPOSITION = r5
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r7 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r9 = "FIELD"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD = r7
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r9 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r11 = "FILEUPLOAD"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD = r9
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r13 = "MIXEDPREAMBLE"
                r14 = 6
                r11.<init>(r13, r14)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDPREAMBLE = r11
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r13 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                java.lang.String r15 = "MIXEDDELIMITER"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER = r13
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r15 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                r17 = 7
                java.lang.String r2 = "MIXEDDISPOSITION"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDDISPOSITION = r15
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r2 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                r19 = 8
                java.lang.String r4 = "MIXEDFILEUPLOAD"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDFILEUPLOAD = r2
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r4 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                r21 = 9
                java.lang.String r6 = "MIXEDCLOSEDELIMITER"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.MIXEDCLOSEDELIMITER = r4
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r6 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                r23 = 10
                java.lang.String r8 = "CLOSEDELIMITER"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.CLOSEDELIMITER = r6
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r8 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                r25 = 11
                java.lang.String r10 = "PREEPILOGUE"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE = r8
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r10 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus
                r27 = 12
                java.lang.String r12 = "EPILOGUE"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE = r10
                r12 = 14
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus[] r12 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus[r12]
                r12[r16] = r0
                r12[r18] = r1
                r12[r20] = r3
                r12[r22] = r5
                r12[r24] = r7
                r12[r26] = r9
                r12[r28] = r11
                r12[r17] = r13
                r12[r19] = r15
                r12[r21] = r2
                r12[r23] = r4
                r12[r25] = r6
                r12[r27] = r8
                r12[r14] = r10
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.$VALUES = r12
                return
        }

        MultiPartStatus(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus> r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus r1 = (io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus) r1
                return r1
        }

        public static io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus[] values() {
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus[] r0 = io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$MultiPartStatus[] r0 = (io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NotEnoughDataDecoderException extends io.netty.handler.codec.DecoderException {
        private static final long serialVersionUID = -7846841864603865638L;

        public NotEnoughDataDecoderException() {
                r0 = this;
                r0.<init>()
                return
        }

        public NotEnoughDataDecoderException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public NotEnoughDataDecoderException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public NotEnoughDataDecoderException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public HttpPostRequestDecoder(io.netty.handler.codec.http.HttpRequest r4) {
            r3 = this;
            io.netty.handler.codec.http.multipart.DefaultHttpDataFactory r0 = new io.netty.handler.codec.http.multipart.DefaultHttpDataFactory
            r1 = 16384(0x4000, double:8.095E-320)
            r0.<init>(r1)
            java.nio.charset.Charset r1 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r3.<init>(r0, r4, r1)
            return
    }

    public HttpPostRequestDecoder(io.netty.handler.codec.http.multipart.HttpDataFactory r2, io.netty.handler.codec.http.HttpRequest r3) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r3, r0)
            return
    }

    public HttpPostRequestDecoder(io.netty.handler.codec.http.multipart.HttpDataFactory r2, io.netty.handler.codec.http.HttpRequest r3, java.nio.charset.Charset r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2f
            if (r3 == 0) goto L27
            if (r4 == 0) goto L1f
            boolean r0 = isMultipart(r3)
            if (r0 == 0) goto L17
            io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder r0 = new io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder
            r0.<init>(r2, r3, r4)
            r1.decoder = r0
            return
        L17:
            io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder r0 = new io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder
            r0.<init>(r2, r3, r4)
            r1.decoder = r0
            return
        L1f:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "charset"
            r2.<init>(r3)
            throw r2
        L27:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "request"
            r2.<init>(r3)
            throw r2
        L2f:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "factory"
            r2.<init>(r3)
            throw r2
    }

    protected static java.lang.String[] getMultipartDataBoundary(java.lang.String r11) {
            java.lang.String[] r11 = splitHeaderContentType(r11)
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.MULTIPART_FORM_DATA
            java.lang.String r4 = r0.toString()
            r0 = 0
            r1 = r11[r0]
            r5 = 0
            int r6 = r4.length()
            r2 = 1
            r3 = 0
            boolean r1 = r1.regionMatches(r2, r3, r4, r5, r6)
            r2 = 0
            if (r1 == 0) goto Lb9
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.BOUNDARY
            java.lang.String r6 = r1.toString()
            r1 = 1
            r3 = r11[r1]
            r7 = 0
            int r8 = r6.length()
            r4 = 1
            r5 = 0
            boolean r3 = r3.regionMatches(r4, r5, r6, r7, r8)
            r9 = 2
            if (r3 == 0) goto L35
            r2 = 2
            r9 = 1
            goto L45
        L35:
            r3 = r11[r9]
            r7 = 0
            int r8 = r6.length()
            r4 = 1
            r5 = 0
            boolean r3 = r3.regionMatches(r4, r5, r6, r7, r8)
            if (r3 == 0) goto Lb9
            r2 = 1
        L45:
            r3 = r11[r9]
            r4 = 61
            java.lang.String r3 = io.netty.util.internal.StringUtil.substringAfter(r3, r4)
            if (r3 == 0) goto Lb1
            char r0 = r3.charAt(r0)
            r5 = 34
            if (r0 != r5) goto L6a
            java.lang.String r0 = r3.trim()
            int r6 = r0.length()
            int r6 = r6 - r1
            char r7 = r0.charAt(r6)
            if (r7 != r5) goto L6a
            java.lang.String r3 = r0.substring(r1, r6)
        L6a:
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            java.lang.String r8 = r0.toString()
            r5 = r11[r2]
            r9 = 0
            int r10 = r8.length()
            r6 = 1
            r7 = 0
            boolean r0 = r5.regionMatches(r6, r7, r8, r9, r10)
            java.lang.String r1 = "--"
            if (r0 == 0) goto L9d
            r11 = r11[r2]
            java.lang.String r11 = io.netty.util.internal.StringUtil.substringAfter(r11, r4)
            if (r11 == 0) goto L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String[] r11 = new java.lang.String[]{r0, r11}
            return r11
        L9d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            java.lang.String[] r11 = new java.lang.String[]{r11}
            return r11
        Lb1:
            io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException r11 = new io.netty.handler.codec.http.multipart.HttpPostRequestDecoder$ErrorDataDecoderException
            java.lang.String r0 = "Needs a boundary value"
            r11.<init>(r0)
            throw r11
        Lb9:
            return r2
    }

    public static boolean isMultipart(io.netty.handler.codec.http.HttpRequest r3) {
            io.netty.handler.codec.http.HttpHeaders r0 = r3.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            boolean r0 = r0.contains(r1)
            r2 = 0
            if (r0 == 0) goto L1d
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            java.lang.String r3 = r3.get(r1)
            java.lang.String[] r3 = getMultipartDataBoundary(r3)
            if (r3 == 0) goto L1d
            r3 = 1
            return r3
        L1d:
            return r2
    }

    private static java.lang.String[] splitHeaderContentType(java.lang.String r8) {
            r0 = 0
            int r0 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findNonWhitespace(r8, r0)
            r1 = 59
            int r2 = r8.indexOf(r1)
            java.lang.String r3 = ""
            r4 = -1
            if (r2 != r4) goto L15
            java.lang.String[] r8 = new java.lang.String[]{r8, r3, r3}
            return r8
        L15:
            int r5 = r2 + 1
            int r5 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findNonWhitespace(r8, r5)
            int r6 = r2 + (-1)
            char r6 = r8.charAt(r6)
            r7 = 32
            if (r6 != r7) goto L27
            int r2 = r2 + (-1)
        L27:
            int r1 = r8.indexOf(r1, r5)
            if (r1 != r4) goto L3e
            int r1 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findEndOfString(r8)
            java.lang.String r0 = r8.substring(r0, r2)
            java.lang.String r8 = r8.substring(r5, r1)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8, r3}
            return r8
        L3e:
            int r3 = r1 + 1
            int r3 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findNonWhitespace(r8, r3)
            int r4 = r1 + (-1)
            char r4 = r8.charAt(r4)
            if (r4 != r7) goto L4e
            int r1 = r1 + (-1)
        L4e:
            int r4 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.findEndOfString(r8)
            java.lang.String r0 = r8.substring(r0, r2)
            java.lang.String r1 = r8.substring(r5, r1)
            java.lang.String r8 = r8.substring(r3, r4)
            java.lang.String[] r8 = new java.lang.String[]{r0, r1, r8}
            return r8
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void cleanFiles() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            r0.cleanFiles()
            return
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.InterfaceHttpData currentPartialHttpData() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r0.currentPartialHttpData()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void destroy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            r0.destroy()
            return
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.InterfaceHttpData getBodyHttpData(java.lang.String r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            io.netty.handler.codec.http.multipart.InterfaceHttpData r2 = r0.getBodyHttpData(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> getBodyHttpDatas() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            java.util.List r0 = r0.getBodyHttpDatas()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> getBodyHttpDatas(java.lang.String r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            java.util.List r2 = r0.getBodyHttpDatas(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public int getDiscardThreshold() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            int r0 = r0.getDiscardThreshold()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean hasNext() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean isMultipart() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            boolean r0 = r0.isMultipart()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.InterfaceHttpData next() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r0.next()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder offer(io.netty.handler.codec.http.HttpContent r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r2 = r0.offer(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void removeHttpDataFromClean(io.netty.handler.codec.http.multipart.InterfaceHttpData r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            r0.removeHttpDataFromClean(r2)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void setDiscardThreshold(int r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder r0 = r1.decoder
            r0.setDiscardThreshold(r2)
            return
    }
}
