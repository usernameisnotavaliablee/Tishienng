package io.netty.handler.codec.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SmtpResponseDecoder extends io.netty.handler.codec.LineBasedFrameDecoder {
    private java.util.List<java.lang.CharSequence> details;

    public SmtpResponseDecoder(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static io.netty.handler.codec.DecoderException newDecoderException(io.netty.buffer.ByteBuf r3, int r4, int r5) {
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Received invalid line: '"
            r1.append(r2)
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r3 = r3.toString(r4, r5, r2)
            r1.append(r3)
            r3 = 39
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    private static int parseCode(io.netty.buffer.ByteBuf r2) {
            byte r0 = r2.readByte()
            int r0 = parseNumber(r0)
            int r0 = r0 * 100
            byte r1 = r2.readByte()
            int r1 = parseNumber(r1)
            int r1 = r1 * 10
            byte r2 = r2.readByte()
            int r2 = parseNumber(r2)
            int r0 = r0 + r1
            int r0 = r0 + r2
            return r0
    }

    private static int parseNumber(byte r1) {
            char r1 = (char) r1
            r0 = 10
            int r1 = java.lang.Character.digit(r1, r0)
            return r1
    }

    @Override // io.netty.handler.codec.LineBasedFrameDecoder
    protected io.netty.handler.codec.smtp.SmtpResponse decode(io.netty.channel.ChannelHandlerContext r9, io.netty.buffer.ByteBuf r10) throws java.lang.Exception {
            r8 = this;
            java.lang.Object r9 = super.decode(r9, r10)
            io.netty.buffer.ByteBuf r9 = (io.netty.buffer.ByteBuf) r9
            r0 = 0
            if (r9 != 0) goto La
            return r0
        La:
            int r1 = r9.readableBytes()     // Catch: java.lang.Throwable -> L2a
            int r2 = r9.readerIndex()     // Catch: java.lang.Throwable -> L2a
            r3 = 3
            if (r1 < r3) goto L6b
            int r3 = parseCode(r9)     // Catch: java.lang.Throwable -> L2a
            byte r4 = r9.readByte()     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r9.isReadable()     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L2c
            java.nio.charset.Charset r5 = io.netty.util.CharsetUtil.US_ASCII     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r9.toString(r5)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r10 = move-exception
            goto L70
        L2c:
            r5 = r0
        L2d:
            java.util.List<java.lang.CharSequence> r6 = r8.details     // Catch: java.lang.Throwable -> L2a
            r7 = 32
            if (r4 == r7) goto L4f
            r3 = 45
            if (r4 != r3) goto L4a
            if (r5 == 0) goto L46
            if (r6 != 0) goto L43
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r10 = 4
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L2a
            r8.details = r6     // Catch: java.lang.Throwable -> L2a
        L43:
            r6.add(r5)     // Catch: java.lang.Throwable -> L2a
        L46:
            r9.release()
            return r0
        L4a:
            io.netty.handler.codec.DecoderException r10 = newDecoderException(r10, r2, r1)     // Catch: java.lang.Throwable -> L2a
            throw r10     // Catch: java.lang.Throwable -> L2a
        L4f:
            r8.details = r0     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L59
            if (r5 == 0) goto L62
            r6.add(r5)     // Catch: java.lang.Throwable -> L2a
            goto L62
        L59:
            if (r5 != 0) goto L5e
            java.util.List r6 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L2a
            goto L62
        L5e:
            java.util.List r6 = java.util.Collections.singletonList(r5)     // Catch: java.lang.Throwable -> L2a
        L62:
            io.netty.handler.codec.smtp.DefaultSmtpResponse r10 = new io.netty.handler.codec.smtp.DefaultSmtpResponse     // Catch: java.lang.Throwable -> L2a
            r10.<init>(r3, r6)     // Catch: java.lang.Throwable -> L2a
            r9.release()
            return r10
        L6b:
            io.netty.handler.codec.DecoderException r10 = newDecoderException(r10, r2, r1)     // Catch: java.lang.Throwable -> L2a
            throw r10     // Catch: java.lang.Throwable -> L2a
        L70:
            r9.release()
            throw r10
    }

    @Override // io.netty.handler.codec.LineBasedFrameDecoder
    protected /* bridge */ /* synthetic */ java.lang.Object decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.smtp.SmtpResponse r1 = r0.decode(r1, r2)
            return r1
    }
}
