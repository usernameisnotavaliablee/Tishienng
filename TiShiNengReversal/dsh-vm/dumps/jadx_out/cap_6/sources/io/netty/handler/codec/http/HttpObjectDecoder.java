package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class HttpObjectDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String EMPTY_VALUE = "";
    private long chunkSize;
    private final boolean chunkedSupported;
    private long contentLength;
    private io.netty.handler.codec.http.HttpObjectDecoder.State currentState;
    private final io.netty.handler.codec.http.HttpObjectDecoder.HeaderParser headerParser;
    private final io.netty.handler.codec.http.HttpObjectDecoder.LineParser lineParser;
    private final int maxChunkSize;
    private io.netty.handler.codec.http.HttpMessage message;
    private java.lang.CharSequence name;
    private volatile boolean resetRequested;
    private io.netty.handler.codec.http.LastHttpContent trailer;
    protected final boolean validateHeaders;
    private java.lang.CharSequence value;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.HttpObjectDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State = null;

        static {
                io.netty.handler.codec.http.HttpObjectDecoder$State[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State = r0
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.SKIP_CONTROL_CHARS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_SIZE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_INITIAL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_HEADER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_VARIABLE_LENGTH_CONTENT     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_FIXED_LENGTH_CONTENT     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNKED_CONTENT     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_DELIMITER     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_FOOTER     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.BAD_MESSAGE     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch: java.lang.NoSuchFieldError -> L84
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.UPGRADED     // Catch: java.lang.NoSuchFieldError -> L84
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class HeaderParser implements io.netty.util.ByteProcessor {
        private final int maxLength;
        private final io.netty.util.internal.AppendableCharSequence seq;
        private int size;

        HeaderParser(io.netty.util.internal.AppendableCharSequence r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.seq = r1
                r0.maxLength = r2
                return
        }

        protected io.netty.handler.codec.TooLongFrameException newException(int r4) {
                r3 = this;
                io.netty.handler.codec.TooLongFrameException r0 = new io.netty.handler.codec.TooLongFrameException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "HTTP header is larger than "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " bytes."
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                return r0
        }

        public io.netty.util.internal.AppendableCharSequence parse(io.netty.buffer.ByteBuf r4) {
                r3 = this;
                int r0 = r3.size
                io.netty.util.internal.AppendableCharSequence r1 = r3.seq
                r1.reset()
                int r1 = r4.forEachByte(r3)
                r2 = -1
                if (r1 != r2) goto L12
                r3.size = r0
                r4 = 0
                return r4
            L12:
                int r1 = r1 + 1
                r4.readerIndex(r1)
                io.netty.util.internal.AppendableCharSequence r4 = r3.seq
                return r4
        }

        public boolean process(byte r4) throws java.lang.Exception {
                r3 = this;
                r4 = r4 & 255(0xff, float:3.57E-43)
                char r4 = (char) r4
                r0 = 13
                r1 = 1
                if (r4 != r0) goto L9
                return r1
            L9:
                r0 = 10
                if (r4 != r0) goto Lf
                r4 = 0
                return r4
            Lf:
                int r0 = r3.size
                int r0 = r0 + r1
                r3.size = r0
                int r2 = r3.maxLength
                if (r0 > r2) goto L1e
                io.netty.util.internal.AppendableCharSequence r0 = r3.seq
                r0.append(r4)
                return r1
            L1e:
                io.netty.handler.codec.TooLongFrameException r4 = r3.newException(r2)
                throw r4
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.size = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class LineParser extends io.netty.handler.codec.http.HttpObjectDecoder.HeaderParser {
        LineParser(io.netty.util.internal.AppendableCharSequence r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.netty.handler.codec.http.HttpObjectDecoder.HeaderParser
        protected io.netty.handler.codec.TooLongFrameException newException(int r4) {
                r3 = this;
                io.netty.handler.codec.TooLongFrameException r0 = new io.netty.handler.codec.TooLongFrameException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "An HTTP line is larger than "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " bytes."
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                return r0
        }

        @Override // io.netty.handler.codec.http.HttpObjectDecoder.HeaderParser
        public io.netty.util.internal.AppendableCharSequence parse(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                r0.reset()
                io.netty.util.internal.AppendableCharSequence r1 = super.parse(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.http.HttpObjectDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.http.HttpObjectDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State BAD_MESSAGE = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_CHUNKED_CONTENT = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_CHUNK_DELIMITER = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_CHUNK_FOOTER = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_CHUNK_SIZE = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_FIXED_LENGTH_CONTENT = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_HEADER = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_INITIAL = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State READ_VARIABLE_LENGTH_CONTENT = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State SKIP_CONTROL_CHARS = null;
        public static final io.netty.handler.codec.http.HttpObjectDecoder.State UPGRADED = null;

        static {
                io.netty.handler.codec.http.HttpObjectDecoder$State r0 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r1 = "SKIP_CONTROL_CHARS"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.HttpObjectDecoder.State.SKIP_CONTROL_CHARS = r0
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r3 = "READ_INITIAL"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_INITIAL = r1
                io.netty.handler.codec.http.HttpObjectDecoder$State r3 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r5 = "READ_HEADER"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_HEADER = r3
                io.netty.handler.codec.http.HttpObjectDecoder$State r5 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r7 = "READ_VARIABLE_LENGTH_CONTENT"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_VARIABLE_LENGTH_CONTENT = r5
                io.netty.handler.codec.http.HttpObjectDecoder$State r7 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r9 = "READ_FIXED_LENGTH_CONTENT"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_FIXED_LENGTH_CONTENT = r7
                io.netty.handler.codec.http.HttpObjectDecoder$State r9 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r11 = "READ_CHUNK_SIZE"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_SIZE = r9
                io.netty.handler.codec.http.HttpObjectDecoder$State r11 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r13 = "READ_CHUNKED_CONTENT"
                r14 = 6
                r11.<init>(r13, r14)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNKED_CONTENT = r11
                io.netty.handler.codec.http.HttpObjectDecoder$State r13 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                java.lang.String r15 = "READ_CHUNK_DELIMITER"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_DELIMITER = r13
                io.netty.handler.codec.http.HttpObjectDecoder$State r15 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                r17 = 7
                java.lang.String r2 = "READ_CHUNK_FOOTER"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_FOOTER = r15
                io.netty.handler.codec.http.HttpObjectDecoder$State r2 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                r19 = 8
                java.lang.String r4 = "BAD_MESSAGE"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                io.netty.handler.codec.http.HttpObjectDecoder.State.BAD_MESSAGE = r2
                io.netty.handler.codec.http.HttpObjectDecoder$State r4 = new io.netty.handler.codec.http.HttpObjectDecoder$State
                r21 = 9
                java.lang.String r6 = "UPGRADED"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                io.netty.handler.codec.http.HttpObjectDecoder.State.UPGRADED = r4
                r6 = 11
                io.netty.handler.codec.http.HttpObjectDecoder$State[] r6 = new io.netty.handler.codec.http.HttpObjectDecoder.State[r6]
                r6[r16] = r0
                r6[r18] = r1
                r6[r20] = r3
                r6[r22] = r5
                r6[r10] = r7
                r6[r12] = r9
                r6[r14] = r11
                r6[r17] = r13
                r6[r19] = r15
                r6[r21] = r2
                r6[r8] = r4
                io.netty.handler.codec.http.HttpObjectDecoder.State.$VALUES = r6
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.HttpObjectDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.HttpObjectDecoder$State> r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.HttpObjectDecoder$State r1 = (io.netty.handler.codec.http.HttpObjectDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.http.HttpObjectDecoder.State[] values() {
                io.netty.handler.codec.http.HttpObjectDecoder$State[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.HttpObjectDecoder$State[] r0 = (io.netty.handler.codec.http.HttpObjectDecoder.State[]) r0
                return r0
        }
    }

    static {
            return
    }

    protected HttpObjectDecoder() {
            r3 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1 = 1
            r2 = 4096(0x1000, float:5.74E-42)
            r3.<init>(r2, r0, r0, r1)
            return
    }

    protected HttpObjectDecoder(int r7, int r8, int r9, boolean r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected HttpObjectDecoder(int r8, int r9, int r10, boolean r11, boolean r12) {
            r7 = this;
            r6 = 128(0x80, float:1.8E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    protected HttpObjectDecoder(int r3, int r4, int r5, boolean r6, boolean r7, int r8) {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775808
            r2.contentLength = r0
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.SKIP_CONTROL_CHARS
            r2.currentState = r0
            java.lang.String r0 = "maxInitialLineLength"
            io.netty.util.internal.ObjectUtil.checkPositive(r3, r0)
            java.lang.String r0 = "maxHeaderSize"
            io.netty.util.internal.ObjectUtil.checkPositive(r4, r0)
            java.lang.String r0 = "maxChunkSize"
            io.netty.util.internal.ObjectUtil.checkPositive(r5, r0)
            io.netty.util.internal.AppendableCharSequence r0 = new io.netty.util.internal.AppendableCharSequence
            r0.<init>(r8)
            io.netty.handler.codec.http.HttpObjectDecoder$LineParser r8 = new io.netty.handler.codec.http.HttpObjectDecoder$LineParser
            r8.<init>(r0, r3)
            r2.lineParser = r8
            io.netty.handler.codec.http.HttpObjectDecoder$HeaderParser r3 = new io.netty.handler.codec.http.HttpObjectDecoder$HeaderParser
            r3.<init>(r0, r4)
            r2.headerParser = r3
            r2.maxChunkSize = r5
            r2.chunkedSupported = r6
            r2.validateHeaders = r7
            return
    }

    private long contentLength() {
            r5 = this;
            long r0 = r5.contentLength
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            io.netty.handler.codec.http.HttpMessage r0 = r5.message
            r1 = -1
            long r0 = io.netty.handler.codec.http.HttpUtil.getContentLength(r0, r1)
            r5.contentLength = r0
        L12:
            long r0 = r5.contentLength
            return r0
    }

    private static int findEndOfString(io.netty.util.internal.AppendableCharSequence r2) {
            int r0 = r2.length()
            int r0 = r0 + (-1)
        L6:
            if (r0 <= 0) goto L18
            char r1 = r2.charAtUnsafe(r0)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L15
            int r0 = r0 + 1
            return r0
        L15:
            int r0 = r0 + (-1)
            goto L6
        L18:
            r2 = 0
            return r2
    }

    private static int findNonWhitespace(io.netty.util.internal.AppendableCharSequence r1, int r2) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L14
            char r0 = r1.charAtUnsafe(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L11
            return r2
        L11:
            int r2 = r2 + 1
            goto L0
        L14:
            int r1 = r1.length()
            return r1
    }

    private static int findWhitespace(io.netty.util.internal.AppendableCharSequence r1, int r2) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L14
            char r0 = r1.charAtUnsafe(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L11
            return r2
        L11:
            int r2 = r2 + 1
            goto L0
        L14:
            int r1 = r1.length()
            return r1
    }

    private static int getChunkSize(java.lang.String r4) {
            java.lang.String r4 = r4.trim()
            r0 = 0
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L28
            char r2 = r4.charAt(r1)
            r3 = 59
            if (r2 == r3) goto L24
            boolean r3 = java.lang.Character.isWhitespace(r2)
            if (r3 != 0) goto L24
            boolean r2 = java.lang.Character.isISOControl(r2)
            if (r2 == 0) goto L21
            goto L24
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            java.lang.String r4 = r4.substring(r0, r1)
        L28:
            r0 = 16
            int r4 = java.lang.Integer.parseInt(r4, r0)
            return r4
    }

    private io.netty.handler.codec.http.HttpContent invalidChunk(io.netty.buffer.ByteBuf r2, java.lang.Exception r3) {
            r1 = this;
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.BAD_MESSAGE
            r1.currentState = r0
            int r0 = r2.readableBytes()
            r2.skipBytes(r0)
            io.netty.handler.codec.http.DefaultLastHttpContent r2 = new io.netty.handler.codec.http.DefaultLastHttpContent
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r2.<init>(r0)
            io.netty.handler.codec.DecoderResult r3 = io.netty.handler.codec.DecoderResult.failure(r3)
            r2.setDecoderResult(r3)
            r3 = 0
            r1.message = r3
            r1.trailer = r3
            return r2
    }

    private io.netty.handler.codec.http.HttpMessage invalidMessage(io.netty.buffer.ByteBuf r2, java.lang.Exception r3) {
            r1 = this;
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.BAD_MESSAGE
            r1.currentState = r0
            int r0 = r2.readableBytes()
            r2.skipBytes(r0)
            io.netty.handler.codec.http.HttpMessage r2 = r1.message
            if (r2 != 0) goto L15
            io.netty.handler.codec.http.HttpMessage r2 = r1.createInvalidMessage()
            r1.message = r2
        L15:
            io.netty.handler.codec.http.HttpMessage r2 = r1.message
            io.netty.handler.codec.DecoderResult r3 = io.netty.handler.codec.DecoderResult.failure(r3)
            r2.setDecoderResult(r3)
            io.netty.handler.codec.http.HttpMessage r2 = r1.message
            r3 = 0
            r1.message = r3
            return r2
    }

    private io.netty.handler.codec.http.HttpObjectDecoder.State readHeaders(io.netty.buffer.ByteBuf r10) {
            r9 = this;
            io.netty.handler.codec.http.HttpMessage r0 = r9.message
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.handler.codec.http.HttpObjectDecoder$HeaderParser r2 = r9.headerParser
            io.netty.util.internal.AppendableCharSequence r2 = r2.parse(r10)
            r3 = 0
            if (r2 != 0) goto L10
            return r3
        L10:
            int r4 = r2.length()
            r5 = 0
            if (r4 <= 0) goto L63
        L17:
            char r4 = r2.charAt(r5)
            java.lang.CharSequence r6 = r9.name
            if (r6 == 0) goto L4a
            r7 = 32
            if (r4 == r7) goto L27
            r8 = 9
            if (r4 != r8) goto L4a
        L27:
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            java.lang.CharSequence r4 = r9.value
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r9.value = r2
            goto L54
        L4a:
            if (r6 == 0) goto L51
            java.lang.CharSequence r4 = r9.value
            r1.add(r6, r4)
        L51:
            r9.splitHeader(r2)
        L54:
            io.netty.handler.codec.http.HttpObjectDecoder$HeaderParser r2 = r9.headerParser
            io.netty.util.internal.AppendableCharSequence r2 = r2.parse(r10)
            if (r2 != 0) goto L5d
            return r3
        L5d:
            int r4 = r2.length()
            if (r4 > 0) goto L17
        L63:
            java.lang.CharSequence r10 = r9.name
            if (r10 == 0) goto L6c
            java.lang.CharSequence r2 = r9.value
            r1.add(r10, r2)
        L6c:
            r9.name = r3
            r9.value = r3
            boolean r10 = r9.isContentAlwaysEmpty(r0)
            if (r10 == 0) goto L7c
            io.netty.handler.codec.http.HttpUtil.setTransferEncodingChunked(r0, r5)
            io.netty.handler.codec.http.HttpObjectDecoder$State r10 = io.netty.handler.codec.http.HttpObjectDecoder.State.SKIP_CONTROL_CHARS
            return r10
        L7c:
            boolean r10 = io.netty.handler.codec.http.HttpUtil.isTransferEncodingChunked(r0)
            if (r10 == 0) goto L85
            io.netty.handler.codec.http.HttpObjectDecoder$State r10 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_SIZE
            return r10
        L85:
            long r0 = r9.contentLength()
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L92
            io.netty.handler.codec.http.HttpObjectDecoder$State r10 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_FIXED_LENGTH_CONTENT
            return r10
        L92:
            io.netty.handler.codec.http.HttpObjectDecoder$State r10 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_VARIABLE_LENGTH_CONTENT
            return r10
    }

    private io.netty.handler.codec.http.LastHttpContent readTrailingHeaders(io.netty.buffer.ByteBuf r9) {
            r8 = this;
            io.netty.handler.codec.http.HttpObjectDecoder$HeaderParser r0 = r8.headerParser
            io.netty.util.internal.AppendableCharSequence r0 = r0.parse(r9)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            io.netty.handler.codec.http.LastHttpContent r2 = r8.trailer
            int r3 = r0.length()
            if (r3 != 0) goto L17
            if (r2 != 0) goto L17
            io.netty.handler.codec.http.LastHttpContent r9 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            return r9
        L17:
            if (r2 != 0) goto L24
            io.netty.handler.codec.http.DefaultLastHttpContent r2 = new io.netty.handler.codec.http.DefaultLastHttpContent
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            boolean r4 = r8.validateHeaders
            r2.<init>(r3, r4)
            r8.trailer = r2
        L24:
            r3 = r1
        L25:
            int r4 = r0.length()
            if (r4 <= 0) goto La4
            r4 = 0
            char r4 = r0.charAt(r4)
            if (r3 == 0) goto L6f
            r5 = 32
            if (r4 == r5) goto L3a
            r5 = 9
            if (r4 != r5) goto L6f
        L3a:
            io.netty.handler.codec.http.HttpHeaders r4 = r2.trailingHeaders()
            java.util.List r4 = r4.getAll(r3)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L9b
            int r5 = r4.size()
            int r5 = r5 + (-1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.Object r6 = r4.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r4.set(r5, r0)
            goto L9b
        L6f:
            r8.splitHeader(r0)
            java.lang.CharSequence r0 = r8.name
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            boolean r3 = r3.contentEqualsIgnoreCase(r0)
            if (r3 != 0) goto L95
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            boolean r3 = r3.contentEqualsIgnoreCase(r0)
            if (r3 != 0) goto L95
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.TRAILER
            boolean r3 = r3.contentEqualsIgnoreCase(r0)
            if (r3 != 0) goto L95
            io.netty.handler.codec.http.HttpHeaders r3 = r2.trailingHeaders()
            java.lang.CharSequence r4 = r8.value
            r3.add(r0, r4)
        L95:
            java.lang.CharSequence r3 = r8.name
            r8.name = r1
            r8.value = r1
        L9b:
            io.netty.handler.codec.http.HttpObjectDecoder$HeaderParser r0 = r8.headerParser
            io.netty.util.internal.AppendableCharSequence r0 = r0.parse(r9)
            if (r0 != 0) goto L25
            return r1
        La4:
            r8.trailer = r1
            return r2
    }

    private void resetNow() {
            r4 = this;
            io.netty.handler.codec.http.HttpMessage r0 = r4.message
            r1 = 0
            r4.message = r1
            r4.name = r1
            r4.value = r1
            r2 = -9223372036854775808
            r4.contentLength = r2
            io.netty.handler.codec.http.HttpObjectDecoder$LineParser r2 = r4.lineParser
            r2.reset()
            io.netty.handler.codec.http.HttpObjectDecoder$HeaderParser r2 = r4.headerParser
            r2.reset()
            r4.trailer = r1
            boolean r1 = r4.isDecodingRequest()
            if (r1 != 0) goto L2e
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
            if (r0 == 0) goto L2e
            boolean r0 = r4.isSwitchingToNonHttp1Protocol(r0)
            if (r0 == 0) goto L2e
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.UPGRADED
            r4.currentState = r0
            return
        L2e:
            r0 = 0
            r4.resetRequested = r0
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.SKIP_CONTROL_CHARS
            r4.currentState = r0
            return
    }

    private static boolean skipControlCharacters(io.netty.buffer.ByteBuf r5) {
            int r0 = r5.writerIndex()
            int r1 = r5.readerIndex()
        L8:
            if (r0 <= r1) goto L20
            int r2 = r1 + 1
            short r3 = r5.getUnsignedByte(r1)
            boolean r4 = java.lang.Character.isISOControl(r3)
            if (r4 != 0) goto L1e
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 != 0) goto L1e
            r0 = 1
            goto L21
        L1e:
            r1 = r2
            goto L8
        L20:
            r0 = 0
        L21:
            r5.readerIndex(r1)
            return r0
    }

    private void splitHeader(io.netty.util.internal.AppendableCharSequence r7) {
            r6 = this;
            int r0 = r7.length()
            r1 = 0
            int r1 = findNonWhitespace(r7, r1)
            r2 = r1
        La:
            r3 = 58
            if (r2 >= r0) goto L1e
            char r4 = r7.charAt(r2)
            if (r4 == r3) goto L1e
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 == 0) goto L1b
            goto L1e
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            r4 = r2
        L1f:
            if (r4 >= r0) goto L2d
            char r5 = r7.charAt(r4)
            if (r5 != r3) goto L2a
            int r4 = r4 + 1
            goto L2d
        L2a:
            int r4 = r4 + 1
            goto L1f
        L2d:
            java.lang.String r1 = r7.subStringUnsafe(r1, r2)
            r6.name = r1
            int r1 = findNonWhitespace(r7, r4)
            if (r1 != r0) goto L3e
            java.lang.String r7 = ""
            r6.value = r7
            return
        L3e:
            int r0 = findEndOfString(r7)
            java.lang.String r7 = r7.subStringUnsafe(r1, r0)
            r6.value = r7
            return
    }

    private static java.lang.String[] splitInitialLine(io.netty.util.internal.AppendableCharSequence r6) {
            r0 = 0
            int r0 = findNonWhitespace(r6, r0)
            int r1 = findWhitespace(r6, r0)
            int r2 = findNonWhitespace(r6, r1)
            int r3 = findWhitespace(r6, r2)
            int r4 = findNonWhitespace(r6, r3)
            int r5 = findEndOfString(r6)
            java.lang.String r0 = r6.subStringUnsafe(r0, r1)
            java.lang.String r1 = r6.subStringUnsafe(r2, r3)
            if (r4 >= r5) goto L28
            java.lang.String r6 = r6.subStringUnsafe(r4, r5)
            goto L2a
        L28:
            java.lang.String r6 = ""
        L2a:
            java.lang.String[] r6 = new java.lang.String[]{r0, r1, r6}
            return r6
    }

    protected abstract io.netty.handler.codec.http.HttpMessage createInvalidMessage();

    protected abstract io.netty.handler.codec.http.HttpMessage createMessage(java.lang.String[] r1) throws java.lang.Exception;

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r8, io.netty.buffer.ByteBuf r9, java.util.List<java.lang.Object> r10) throws java.lang.Exception {
            r7 = this;
            boolean r8 = r7.resetRequested
            if (r8 == 0) goto L7
            r7.resetNow()
        L7:
            int[] r8 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = r7.currentState
            int r0 = r0.ordinal()
            r0 = r8[r0]
            r1 = 0
            switch(r0) {
                case 1: goto L117;
                case 2: goto L9a;
                case 3: goto L122;
                case 4: goto L145;
                case 5: goto L81;
                case 6: goto L46;
                case 7: goto Lbc;
                case 8: goto Lef;
                case 9: goto L2e;
                case 10: goto L26;
                case 11: goto L18;
                default: goto L16;
            }
        L16:
            goto L17c
        L18:
            int r8 = r9.readableBytes()
            if (r8 <= 0) goto L17c
            io.netty.buffer.ByteBuf r8 = r9.readBytes(r8)
            r10.add(r8)
            return
        L26:
            int r8 = r9.readableBytes()
            r9.skipBytes(r8)
            return
        L2e:
            io.netty.handler.codec.http.LastHttpContent r8 = r7.readTrailingHeaders(r9)     // Catch: java.lang.Exception -> L3d
            if (r8 != 0) goto L36
            goto L17c
        L36:
            r10.add(r8)     // Catch: java.lang.Exception -> L3d
            r7.resetNow()     // Catch: java.lang.Exception -> L3d
            return
        L3d:
            r8 = move-exception
            io.netty.handler.codec.http.HttpContent r8 = r7.invalidChunk(r9, r8)
            r10.add(r8)
            return
        L46:
            int r8 = r9.readableBytes()
            if (r8 != 0) goto L4e
            goto L17c
        L4e:
            int r0 = r7.maxChunkSize
            int r8 = java.lang.Math.min(r8, r0)
            long r3 = (long) r8
            long r5 = r7.chunkSize
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L5c
            int r8 = (int) r5
        L5c:
            io.netty.buffer.ByteBuf r9 = r9.readRetainedSlice(r8)
            long r3 = r7.chunkSize
            long r5 = (long) r8
            long r3 = r3 - r5
            r7.chunkSize = r3
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L78
            io.netty.handler.codec.http.DefaultLastHttpContent r8 = new io.netty.handler.codec.http.DefaultLastHttpContent
            boolean r0 = r7.validateHeaders
            r8.<init>(r9, r0)
            r10.add(r8)
            r7.resetNow()
            return
        L78:
            io.netty.handler.codec.http.DefaultHttpContent r8 = new io.netty.handler.codec.http.DefaultHttpContent
            r8.<init>(r9)
            r10.add(r8)
            return
        L81:
            int r8 = r9.readableBytes()
            int r0 = r7.maxChunkSize
            int r8 = java.lang.Math.min(r8, r0)
            if (r8 <= 0) goto L17c
            io.netty.buffer.ByteBuf r8 = r9.readRetainedSlice(r8)
            io.netty.handler.codec.http.DefaultHttpContent r9 = new io.netty.handler.codec.http.DefaultHttpContent
            r9.<init>(r8)
            r10.add(r9)
            return
        L9a:
            io.netty.handler.codec.http.HttpObjectDecoder$LineParser r8 = r7.lineParser     // Catch: java.lang.Exception -> Lb6
            io.netty.util.internal.AppendableCharSequence r8 = r8.parse(r9)     // Catch: java.lang.Exception -> Lb6
            if (r8 != 0) goto La4
            goto L17c
        La4:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Lb6
            int r8 = getChunkSize(r8)     // Catch: java.lang.Exception -> Lb6
            long r3 = (long) r8     // Catch: java.lang.Exception -> Lb6
            r7.chunkSize = r3     // Catch: java.lang.Exception -> Lb6
            if (r8 != 0) goto Lb8
            io.netty.handler.codec.http.HttpObjectDecoder$State r8 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_FOOTER     // Catch: java.lang.Exception -> Lb6
            r7.currentState = r8     // Catch: java.lang.Exception -> Lb6
            return
        Lb6:
            r8 = move-exception
            goto L10f
        Lb8:
            io.netty.handler.codec.http.HttpObjectDecoder$State r8 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNKED_CONTENT     // Catch: java.lang.Exception -> Lb6
            r7.currentState = r8     // Catch: java.lang.Exception -> Lb6
        Lbc:
            long r3 = r7.chunkSize
            int r8 = (int) r3
            int r0 = r7.maxChunkSize
            int r8 = java.lang.Math.min(r8, r0)
            int r0 = r9.readableBytes()
            int r8 = java.lang.Math.min(r8, r0)
            if (r8 != 0) goto Ld1
            goto L17c
        Ld1:
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            io.netty.buffer.ByteBuf r3 = r9.readRetainedSlice(r8)
            r0.<init>(r3)
            long r3 = r7.chunkSize
            long r5 = (long) r8
            long r3 = r3 - r5
            r7.chunkSize = r3
            r10.add(r0)
            long r3 = r7.chunkSize
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto Leb
            goto L17c
        Leb:
            io.netty.handler.codec.http.HttpObjectDecoder$State r8 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_DELIMITER
            r7.currentState = r8
        Lef:
            int r8 = r9.writerIndex()
            int r10 = r9.readerIndex()
        Lf7:
            if (r8 <= r10) goto L10b
            int r0 = r10 + 1
            byte r10 = r9.getByte(r10)
            r1 = 10
            if (r10 != r1) goto L109
            io.netty.handler.codec.http.HttpObjectDecoder$State r8 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_SIZE
            r7.currentState = r8
            r10 = r0
            goto L10b
        L109:
            r10 = r0
            goto Lf7
        L10b:
            r9.readerIndex(r10)
            return
        L10f:
            io.netty.handler.codec.http.HttpContent r8 = r7.invalidChunk(r9, r8)
            r10.add(r8)
            return
        L117:
            boolean r0 = skipControlCharacters(r9)
            if (r0 != 0) goto L11e
            goto L17c
        L11e:
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_INITIAL
            r7.currentState = r0
        L122:
            io.netty.handler.codec.http.HttpObjectDecoder$LineParser r0 = r7.lineParser     // Catch: java.lang.Exception -> L138
            io.netty.util.internal.AppendableCharSequence r0 = r0.parse(r9)     // Catch: java.lang.Exception -> L138
            if (r0 != 0) goto L12b
            goto L17c
        L12b:
            java.lang.String[] r0 = splitInitialLine(r0)     // Catch: java.lang.Exception -> L138
            int r3 = r0.length     // Catch: java.lang.Exception -> L138
            r4 = 3
            if (r3 >= r4) goto L13b
            io.netty.handler.codec.http.HttpObjectDecoder$State r8 = io.netty.handler.codec.http.HttpObjectDecoder.State.SKIP_CONTROL_CHARS     // Catch: java.lang.Exception -> L138
            r7.currentState = r8     // Catch: java.lang.Exception -> L138
            return
        L138:
            r8 = move-exception
            goto L1b3
        L13b:
            io.netty.handler.codec.http.HttpMessage r0 = r7.createMessage(r0)     // Catch: java.lang.Exception -> L138
            r7.message = r0     // Catch: java.lang.Exception -> L138
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_HEADER     // Catch: java.lang.Exception -> L138
            r7.currentState = r0     // Catch: java.lang.Exception -> L138
        L145:
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = r7.readHeaders(r9)     // Catch: java.lang.Exception -> L16f
            if (r0 != 0) goto L14c
            goto L17c
        L14c:
            r7.currentState = r0     // Catch: java.lang.Exception -> L16f
            int r3 = r0.ordinal()     // Catch: java.lang.Exception -> L16f
            r8 = r8[r3]     // Catch: java.lang.Exception -> L16f
            r3 = 1
            if (r8 == r3) goto L19d
            r3 = 2
            if (r8 == r3) goto L18b
            long r3 = r7.contentLength()     // Catch: java.lang.Exception -> L16f
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L17d
            r1 = -1
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L171
            boolean r8 = r7.isDecodingRequest()     // Catch: java.lang.Exception -> L16f
            if (r8 == 0) goto L171
            goto L17d
        L16f:
            r8 = move-exception
            goto L1ab
        L171:
            io.netty.handler.codec.http.HttpMessage r8 = r7.message     // Catch: java.lang.Exception -> L16f
            r10.add(r8)     // Catch: java.lang.Exception -> L16f
            io.netty.handler.codec.http.HttpObjectDecoder$State r8 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_FIXED_LENGTH_CONTENT     // Catch: java.lang.Exception -> L16f
            if (r0 != r8) goto L17c
            r7.chunkSize = r3     // Catch: java.lang.Exception -> L16f
        L17c:
            return
        L17d:
            io.netty.handler.codec.http.HttpMessage r8 = r7.message     // Catch: java.lang.Exception -> L16f
            r10.add(r8)     // Catch: java.lang.Exception -> L16f
            io.netty.handler.codec.http.LastHttpContent r8 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT     // Catch: java.lang.Exception -> L16f
            r10.add(r8)     // Catch: java.lang.Exception -> L16f
            r7.resetNow()     // Catch: java.lang.Exception -> L16f
            return
        L18b:
            boolean r8 = r7.chunkedSupported     // Catch: java.lang.Exception -> L16f
            if (r8 == 0) goto L195
            io.netty.handler.codec.http.HttpMessage r8 = r7.message     // Catch: java.lang.Exception -> L16f
            r10.add(r8)     // Catch: java.lang.Exception -> L16f
            return
        L195:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L16f
            java.lang.String r0 = "Chunked messages not supported"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L16f
            throw r8     // Catch: java.lang.Exception -> L16f
        L19d:
            io.netty.handler.codec.http.HttpMessage r8 = r7.message     // Catch: java.lang.Exception -> L16f
            r10.add(r8)     // Catch: java.lang.Exception -> L16f
            io.netty.handler.codec.http.LastHttpContent r8 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT     // Catch: java.lang.Exception -> L16f
            r10.add(r8)     // Catch: java.lang.Exception -> L16f
            r7.resetNow()     // Catch: java.lang.Exception -> L16f
            return
        L1ab:
            io.netty.handler.codec.http.HttpMessage r8 = r7.invalidMessage(r9, r8)
            r10.add(r8)
            return
        L1b3:
            io.netty.handler.codec.http.HttpMessage r8 = r7.invalidMessage(r9, r8)
            r10.add(r8)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decodeLast(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            super.decodeLast(r4, r5, r6)
            boolean r4 = r3.resetRequested
            if (r4 == 0) goto La
            r3.resetNow()
        La:
            io.netty.handler.codec.http.HttpMessage r4 = r3.message
            if (r4 == 0) goto L5f
            boolean r4 = io.netty.handler.codec.http.HttpUtil.isTransferEncodingChunked(r4)
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = r3.currentState
            io.netty.handler.codec.http.HttpObjectDecoder$State r1 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_VARIABLE_LENGTH_CONTENT
            if (r0 != r1) goto L29
            boolean r5 = r5.isReadable()
            if (r5 != 0) goto L29
            if (r4 != 0) goto L29
            io.netty.handler.codec.http.LastHttpContent r4 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            r6.add(r4)
            r3.resetNow()
            return
        L29:
            io.netty.handler.codec.http.HttpObjectDecoder$State r5 = r3.currentState
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_HEADER
            if (r5 != r0) goto L43
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            io.netty.handler.codec.PrematureChannelClosureException r5 = new io.netty.handler.codec.PrematureChannelClosureException
            java.lang.String r0 = "Connection closed before received headers"
            r5.<init>(r0)
            io.netty.handler.codec.http.HttpMessage r4 = r3.invalidMessage(r4, r5)
            r6.add(r4)
            r3.resetNow()
            return
        L43:
            boolean r5 = r3.isDecodingRequest()
            if (r5 != 0) goto L5c
            if (r4 == 0) goto L4c
            goto L5c
        L4c:
            long r4 = r3.contentLength()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L57
            goto L5c
        L57:
            io.netty.handler.codec.http.LastHttpContent r4 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            r6.add(r4)
        L5c:
            r3.resetNow()
        L5f:
            return
    }

    protected boolean isContentAlwaysEmpty(io.netty.handler.codec.http.HttpMessage r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.HttpResponse
            r1 = 0
            if (r0 == 0) goto L43
            io.netty.handler.codec.http.HttpResponse r5 = (io.netty.handler.codec.http.HttpResponse) r5
            io.netty.handler.codec.http.HttpResponseStatus r0 = r5.status()
            int r0 = r0.code()
            r2 = 100
            r3 = 1
            if (r0 < r2) goto L39
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 >= r2) goto L39
            r2 = 101(0x65, float:1.42E-43)
            if (r0 != r2) goto L38
            io.netty.handler.codec.http.HttpHeaders r0 = r5.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_ACCEPT
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L38
            io.netty.handler.codec.http.HttpHeaders r5 = r5.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.WEBSOCKET
            boolean r5 = r5.contains(r0, r2, r3)
            if (r5 != 0) goto L37
            goto L38
        L37:
            return r1
        L38:
            return r3
        L39:
            r5 = 204(0xcc, float:2.86E-43)
            if (r0 == r5) goto L42
            r5 = 304(0x130, float:4.26E-43)
            if (r0 == r5) goto L42
            goto L43
        L42:
            return r3
        L43:
            return r1
    }

    protected abstract boolean isDecodingRequest();

    protected boolean isSwitchingToNonHttp1Protocol(io.netty.handler.codec.http.HttpResponse r4) {
            r3 = this;
            io.netty.handler.codec.http.HttpResponseStatus r0 = r4.status()
            int r0 = r0.code()
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS
            int r1 = r1.code()
            r2 = 0
            if (r0 == r1) goto L12
            return r2
        L12:
            io.netty.handler.codec.http.HttpHeaders r4 = r4.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            java.lang.String r4 = r4.get(r0)
            if (r4 == 0) goto L38
            io.netty.handler.codec.http.HttpVersion r0 = io.netty.handler.codec.http.HttpVersion.HTTP_1_0
            java.lang.String r0 = r0.text()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L37
            io.netty.handler.codec.http.HttpVersion r0 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            java.lang.String r0 = r0.text()
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L37
            goto L38
        L37:
            return r2
        L38:
            r4 = 1
            return r4
    }

    public void reset() {
            r1 = this;
            r0 = 1
            r1.resetRequested = r0
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpExpectationFailedEvent
            if (r0 == 0) goto L1b
            int[] r0 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State
            io.netty.handler.codec.http.HttpObjectDecoder$State r1 = r2.currentState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            if (r0 == r1) goto L18
            r1 = 5
            if (r0 == r1) goto L18
            r1 = 6
            if (r0 == r1) goto L18
            goto L1b
        L18:
            r2.reset()
        L1b:
            super.userEventTriggered(r3, r4)
            return
    }
}
