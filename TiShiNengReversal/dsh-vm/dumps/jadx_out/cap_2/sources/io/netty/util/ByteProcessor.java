package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface ByteProcessor {
    public static final io.netty.util.ByteProcessor FIND_ASCII_SPACE = null;
    public static final io.netty.util.ByteProcessor FIND_COMMA = null;
    public static final io.netty.util.ByteProcessor FIND_CR = null;
    public static final io.netty.util.ByteProcessor FIND_CRLF = null;
    public static final io.netty.util.ByteProcessor FIND_LF = null;
    public static final io.netty.util.ByteProcessor FIND_LINEAR_WHITESPACE = null;
    public static final io.netty.util.ByteProcessor FIND_NON_CR = null;
    public static final io.netty.util.ByteProcessor FIND_NON_CRLF = null;
    public static final io.netty.util.ByteProcessor FIND_NON_LF = null;
    public static final io.netty.util.ByteProcessor FIND_NON_LINEAR_WHITESPACE = null;
    public static final io.netty.util.ByteProcessor FIND_NON_NUL = null;
    public static final io.netty.util.ByteProcessor FIND_NUL = null;
    public static final io.netty.util.ByteProcessor FIND_SEMI_COLON = null;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class IndexNotOfProcessor implements io.netty.util.ByteProcessor {
        private final byte byteToNotFind;

        public IndexNotOfProcessor(byte r1) {
                r0 = this;
                r0.<init>()
                r0.byteToNotFind = r1
                return
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte r2) {
                r1 = this;
                byte r0 = r1.byteToNotFind
                if (r2 != r0) goto L6
                r2 = 1
                return r2
            L6:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class IndexOfProcessor implements io.netty.util.ByteProcessor {
        private final byte byteToFind;

        public IndexOfProcessor(byte r1) {
                r0 = this;
                r0.<init>()
                r0.byteToFind = r1
                return
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte r2) {
                r1 = this;
                byte r0 = r1.byteToFind
                if (r2 == r0) goto L6
                r2 = 1
                return r2
            L6:
                r2 = 0
                return r2
        }
    }

    static {
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r1 = 0
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_NUL = r0
            io.netty.util.ByteProcessor$IndexNotOfProcessor r0 = new io.netty.util.ByteProcessor$IndexNotOfProcessor
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_NON_NUL = r0
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r1 = 13
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_CR = r0
            io.netty.util.ByteProcessor$IndexNotOfProcessor r0 = new io.netty.util.ByteProcessor$IndexNotOfProcessor
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_NON_CR = r0
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r1 = 10
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_LF = r0
            io.netty.util.ByteProcessor$IndexNotOfProcessor r0 = new io.netty.util.ByteProcessor$IndexNotOfProcessor
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_NON_LF = r0
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r1 = 59
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_SEMI_COLON = r0
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r1 = 44
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_COMMA = r0
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r1 = 32
            r0.<init>(r1)
            io.netty.util.ByteProcessor.FIND_ASCII_SPACE = r0
            io.netty.util.ByteProcessor$1 r0 = new io.netty.util.ByteProcessor$1
            r0.<init>()
            io.netty.util.ByteProcessor.FIND_CRLF = r0
            io.netty.util.ByteProcessor$2 r0 = new io.netty.util.ByteProcessor$2
            r0.<init>()
            io.netty.util.ByteProcessor.FIND_NON_CRLF = r0
            io.netty.util.ByteProcessor$3 r0 = new io.netty.util.ByteProcessor$3
            r0.<init>()
            io.netty.util.ByteProcessor.FIND_LINEAR_WHITESPACE = r0
            io.netty.util.ByteProcessor$4 r0 = new io.netty.util.ByteProcessor$4
            r0.<init>()
            io.netty.util.ByteProcessor.FIND_NON_LINEAR_WHITESPACE = r0
            return
    }

    boolean process(byte r1) throws java.lang.Exception;
}
