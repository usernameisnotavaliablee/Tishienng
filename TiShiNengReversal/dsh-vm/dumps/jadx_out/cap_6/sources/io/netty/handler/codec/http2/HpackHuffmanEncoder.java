package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HpackHuffmanEncoder {
    private final int[] codes;
    private final io.netty.handler.codec.http2.HpackHuffmanEncoder.EncodeProcessor encodeProcessor;
    private final io.netty.handler.codec.http2.HpackHuffmanEncoder.EncodedLengthProcessor encodedLengthProcessor;
    private final byte[] lengths;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.HpackHuffmanEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EncodeProcessor implements io.netty.util.ByteProcessor {
        private long current;
        private int n;
        io.netty.buffer.ByteBuf out;
        final /* synthetic */ io.netty.handler.codec.http2.HpackHuffmanEncoder this$0;

        private EncodeProcessor(io.netty.handler.codec.http2.HpackHuffmanEncoder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ EncodeProcessor(io.netty.handler.codec.http2.HpackHuffmanEncoder r1, io.netty.handler.codec.http2.HpackHuffmanEncoder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        void end() {
                r9 = this;
                r0 = 0
                r1 = 0
                r3 = 0
                int r4 = r9.n     // Catch: java.lang.Throwable -> L1c
                if (r4 <= 0) goto L1e
                long r5 = r9.current     // Catch: java.lang.Throwable -> L1c
                int r7 = 8 - r4
                long r5 = r5 << r7
                r7 = 255(0xff, float:3.57E-43)
                int r4 = r7 >>> r4
                long r7 = (long) r4     // Catch: java.lang.Throwable -> L1c
                long r5 = r5 | r7
                r9.current = r5     // Catch: java.lang.Throwable -> L1c
                io.netty.buffer.ByteBuf r4 = r9.out     // Catch: java.lang.Throwable -> L1c
                int r6 = (int) r5     // Catch: java.lang.Throwable -> L1c
                r4.writeByte(r6)     // Catch: java.lang.Throwable -> L1c
                goto L1e
            L1c:
                r4 = move-exception
                goto L25
            L1e:
                r9.out = r3
                r9.current = r1
                r9.n = r0
                return
            L25:
                r9.out = r3
                r9.current = r1
                r9.n = r0
                throw r4
        }

        public boolean process(byte r6) {
                r5 = this;
                r6 = r6 & 255(0xff, float:3.57E-43)
                io.netty.handler.codec.http2.HpackHuffmanEncoder r0 = r5.this$0
                byte[] r0 = io.netty.handler.codec.http2.HpackHuffmanEncoder.access$200(r0)
                r0 = r0[r6]
                long r1 = r5.current
                long r1 = r1 << r0
                r5.current = r1
                io.netty.handler.codec.http2.HpackHuffmanEncoder r3 = r5.this$0
                int[] r3 = io.netty.handler.codec.http2.HpackHuffmanEncoder.access$300(r3)
                r6 = r3[r6]
                long r3 = (long) r6
                long r1 = r1 | r3
                r5.current = r1
                int r6 = r5.n
                int r6 = r6 + r0
                r5.n = r6
            L20:
                int r6 = r5.n
                r0 = 8
                if (r6 < r0) goto L34
                int r6 = r6 + (-8)
                r5.n = r6
                io.netty.buffer.ByteBuf r0 = r5.out
                long r1 = r5.current
                long r1 = r1 >> r6
                int r6 = (int) r1
                r0.writeByte(r6)
                goto L20
            L34:
                r6 = 1
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EncodedLengthProcessor implements io.netty.util.ByteProcessor {
        private long len;
        final /* synthetic */ io.netty.handler.codec.http2.HpackHuffmanEncoder this$0;

        private EncodedLengthProcessor(io.netty.handler.codec.http2.HpackHuffmanEncoder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ EncodedLengthProcessor(io.netty.handler.codec.http2.HpackHuffmanEncoder r1, io.netty.handler.codec.http2.HpackHuffmanEncoder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        int length() {
                r4 = this;
                long r0 = r4.len
                r2 = 7
                long r0 = r0 + r2
                r2 = 3
                long r0 = r0 >> r2
                int r1 = (int) r0
                return r1
        }

        public boolean process(byte r5) {
                r4 = this;
                long r0 = r4.len
                io.netty.handler.codec.http2.HpackHuffmanEncoder r2 = r4.this$0
                byte[] r2 = io.netty.handler.codec.http2.HpackHuffmanEncoder.access$200(r2)
                r5 = r5 & 255(0xff, float:3.57E-43)
                r5 = r2[r5]
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.len = r0
                r5 = 1
                return r5
        }

        void reset() {
                r2 = this;
                r0 = 0
                r2.len = r0
                return
        }
    }

    HpackHuffmanEncoder() {
            r2 = this;
            int[] r0 = io.netty.handler.codec.http2.HpackUtil.HUFFMAN_CODES
            byte[] r1 = io.netty.handler.codec.http2.HpackUtil.HUFFMAN_CODE_LENGTHS
            r2.<init>(r0, r1)
            return
    }

    private HpackHuffmanEncoder(int[] r3, byte[] r4) {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodedLengthProcessor r0 = new io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodedLengthProcessor
            r1 = 0
            r0.<init>(r2, r1)
            r2.encodedLengthProcessor = r0
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodeProcessor r0 = new io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodeProcessor
            r0.<init>(r2, r1)
            r2.encodeProcessor = r0
            r2.codes = r3
            r2.lengths = r4
            return
    }

    static /* synthetic */ byte[] access$200(io.netty.handler.codec.http2.HpackHuffmanEncoder r0) {
            byte[] r0 = r0.lengths
            return r0
    }

    static /* synthetic */ int[] access$300(io.netty.handler.codec.http2.HpackHuffmanEncoder r0) {
            int[] r0 = r0.codes
            return r0
    }

    private void encodeSlowPath(io.netty.buffer.ByteBuf r8, java.lang.CharSequence r9) {
            r7 = this;
            r0 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r9.length()
            r5 = 255(0xff, float:3.57E-43)
            if (r2 >= r4) goto L2d
            char r4 = r9.charAt(r2)
            r4 = r4 & r5
            int[] r5 = r7.codes
            r5 = r5[r4]
            byte[] r6 = r7.lengths
            r4 = r6[r4]
            long r0 = r0 << r4
            long r5 = (long) r5
            long r0 = r0 | r5
            int r3 = r3 + r4
        L1d:
            r4 = 8
            if (r3 < r4) goto L2a
            int r3 = r3 + (-8)
            long r4 = r0 >> r3
            int r5 = (int) r4
            r8.writeByte(r5)
            goto L1d
        L2a:
            int r2 = r2 + 1
            goto L4
        L2d:
            if (r3 <= 0) goto L3a
            int r9 = 8 - r3
            long r0 = r0 << r9
            int r9 = r5 >>> r3
            long r2 = (long) r9
            long r0 = r0 | r2
            int r9 = (int) r0
            r8.writeByte(r9)
        L3a:
            return
    }

    private int getEncodedLengthSlowPath(java.lang.CharSequence r6) {
            r5 = this;
            r0 = 0
            r2 = 0
        L3:
            int r3 = r6.length()
            if (r2 >= r3) goto L18
            byte[] r3 = r5.lengths
            char r4 = r6.charAt(r2)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3[r4]
            long r3 = (long) r3
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
        L18:
            r2 = 7
            long r0 = r0 + r2
            r6 = 3
            long r0 = r0 >> r6
            int r6 = (int) r0
            return r6
    }

    public void encode(io.netty.buffer.ByteBuf r2, java.lang.CharSequence r3) {
            r1 = this;
            java.lang.String r0 = "out"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            boolean r0 = r3 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L26
            io.netty.util.AsciiString r3 = (io.netty.util.AsciiString) r3
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodeProcessor r0 = r1.encodeProcessor     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r0.out = r2     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r3.forEachByte(r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
        L12:
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodeProcessor r2 = r1.encodeProcessor
            r2.end()
            goto L1f
        L18:
            r2 = move-exception
            goto L20
        L1a:
            r2 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r2)     // Catch: java.lang.Throwable -> L18
            goto L12
        L1f:
            return
        L20:
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodeProcessor r3 = r1.encodeProcessor
            r3.end()
            throw r2
        L26:
            r1.encodeSlowPath(r2, r3)
            return
    }

    int getEncodedLength(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L1d
            io.netty.util.AsciiString r2 = (io.netty.util.AsciiString) r2
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodedLengthProcessor r0 = r1.encodedLengthProcessor     // Catch: java.lang.Exception -> L17
            r0.reset()     // Catch: java.lang.Exception -> L17
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodedLengthProcessor r0 = r1.encodedLengthProcessor     // Catch: java.lang.Exception -> L17
            r2.forEachByte(r0)     // Catch: java.lang.Exception -> L17
            io.netty.handler.codec.http2.HpackHuffmanEncoder$EncodedLengthProcessor r2 = r1.encodedLengthProcessor     // Catch: java.lang.Exception -> L17
            int r2 = r2.length()     // Catch: java.lang.Exception -> L17
            return r2
        L17:
            r2 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r2)
            r2 = -1
            return r2
        L1d:
            int r2 = r1.getEncodedLengthSlowPath(r2)
            return r2
    }
}
