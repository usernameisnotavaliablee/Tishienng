package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HttpPostBodyUtil {
    public static final java.lang.String DEFAULT_BINARY_CONTENT_TYPE = "application/octet-stream";
    public static final java.lang.String DEFAULT_TEXT_CONTENT_TYPE = "text/plain";
    public static final int chunkSize = 8096;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SeekAheadOptimize {
        io.netty.buffer.ByteBuf buffer;
        byte[] bytes;
        int limit;
        int origPos;
        int pos;
        int readerIndex;

        SeekAheadOptimize(io.netty.buffer.ByteBuf r3) {
                r2 = this;
                r2.<init>()
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L2e
                r2.buffer = r3
                byte[] r0 = r3.array()
                r2.bytes = r0
                int r0 = r3.readerIndex()
                r2.readerIndex = r0
                int r0 = r3.arrayOffset()
                int r1 = r2.readerIndex
                int r0 = r0 + r1
                r2.pos = r0
                r2.origPos = r0
                int r0 = r3.arrayOffset()
                int r3 = r3.writerIndex()
                int r0 = r0 + r3
                r2.limit = r0
                return
            L2e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "buffer hasn't backing byte array"
                r3.<init>(r0)
                throw r3
        }

        int getReadPosition(int r2) {
                r1 = this;
                int r0 = r1.origPos
                int r2 = r2 - r0
                int r0 = r1.readerIndex
                int r2 = r2 + r0
                return r2
        }

        void setReadPosition(int r2) {
                r1 = this;
                int r0 = r1.pos
                int r0 = r0 - r2
                r1.pos = r0
                int r2 = r1.getReadPosition(r0)
                r1.readerIndex = r2
                io.netty.buffer.ByteBuf r0 = r1.buffer
                r0.readerIndex(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum TransferEncodingMechanism extends java.lang.Enum<io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism> {
        private static final /* synthetic */ io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism[] $VALUES = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism BINARY = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism BIT7 = null;
        public static final io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism BIT8 = null;
        private final java.lang.String value;

        static {
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r0 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism
                java.lang.String r1 = "7bit"
                java.lang.String r2 = "BIT7"
                r3 = 0
                r0.<init>(r2, r3, r1)
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BIT7 = r0
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r1 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism
                java.lang.String r2 = "8bit"
                java.lang.String r4 = "BIT8"
                r5 = 1
                r1.<init>(r4, r5, r2)
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BIT8 = r1
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r2 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism
                java.lang.String r4 = "binary"
                java.lang.String r6 = "BINARY"
                r7 = 2
                r2.<init>(r6, r7, r4)
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.BINARY = r2
                r4 = 3
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism[] r4 = new io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism[r4]
                r4[r3] = r0
                r4[r5] = r1
                r4[r7] = r2
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.$VALUES = r4
                return
        }

        TransferEncodingMechanism(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism> r0 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism r1 = (io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism) r1
                return r1
        }

        public static io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism[] values() {
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism[] r0 = io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.multipart.HttpPostBodyUtil$TransferEncodingMechanism[] r0 = (io.netty.handler.codec.http.multipart.HttpPostBodyUtil.TransferEncodingMechanism[]) r0
                return r0
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public java.lang.String value() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    private HttpPostBodyUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static int findEndOfString(java.lang.String r2) {
            int r0 = r2.length()
        L4:
            if (r0 <= 0) goto L16
            int r1 = r0 + (-1)
            char r1 = r2.charAt(r1)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L13
            goto L16
        L13:
            int r0 = r0 + (-1)
            goto L4
        L16:
            return r0
    }

    static int findNonWhitespace(java.lang.String r1, int r2) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L14
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L11
            goto L14
        L11:
            int r2 = r2 + 1
            goto L0
        L14:
            return r2
    }
}
