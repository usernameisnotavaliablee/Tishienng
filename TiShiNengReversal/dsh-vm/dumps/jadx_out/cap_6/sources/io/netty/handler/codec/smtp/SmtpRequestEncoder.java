package io.netty.handler.codec.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SmtpRequestEncoder extends io.netty.handler.codec.MessageToMessageEncoder<java.lang.Object> {
    private static final int CRLF_SHORT = 3338;
    private static final io.netty.buffer.ByteBuf DOT_CRLF_BUFFER = null;
    private static final byte SP = 32;
    private boolean contentExpected;

    static {
            r0 = 3
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.directBuffer(r0)
            r1 = 46
            io.netty.buffer.ByteBuf r0 = r0.writeByte(r1)
            r1 = 13
            io.netty.buffer.ByteBuf r0 = r0.writeByte(r1)
            r1 = 10
            io.netty.buffer.ByteBuf r0 = r0.writeByte(r1)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.handler.codec.smtp.SmtpRequestEncoder.DOT_CRLF_BUFFER = r0
            return
    }

    public SmtpRequestEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void writeParameters(java.util.List<java.lang.CharSequence> r4, io.netty.buffer.ByteBuf r5) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L49
        L7:
            r0 = 32
            r5.writeByte(r0)
            boolean r1 = r4 instanceof java.util.RandomAccess
            if (r1 == 0) goto L32
            int r1 = r4.size()
            int r1 = r1 + (-1)
            r2 = 0
        L17:
            if (r2 >= r1) goto L28
            java.lang.Object r3 = r4.get(r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            io.netty.buffer.ByteBufUtil.writeAscii(r5, r3)
            r5.writeByte(r0)
            int r2 = r2 + 1
            goto L17
        L28:
            java.lang.Object r4 = r4.get(r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            io.netty.buffer.ByteBufUtil.writeAscii(r5, r4)
            return
        L32:
            java.util.Iterator r4 = r4.iterator()
        L36:
            java.lang.Object r1 = r4.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.buffer.ByteBufUtil.writeAscii(r5, r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L49
            r5.writeByte(r0)
            goto L36
        L49:
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.smtp.SmtpRequest
            if (r0 != 0) goto Lb
            boolean r2 = r2 instanceof io.netty.handler.codec.smtp.SmtpContent
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected void encode(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            boolean r0 = r6 instanceof io.netty.handler.codec.smtp.SmtpRequest
            r1 = 0
            if (r0 == 0) goto L59
            r0 = r6
            io.netty.handler.codec.smtp.SmtpRequest r0 = (io.netty.handler.codec.smtp.SmtpRequest) r0
            boolean r2 = r4.contentExpected
            if (r2 == 0) goto L23
            io.netty.handler.codec.smtp.SmtpCommand r2 = r0.command()
            io.netty.handler.codec.smtp.SmtpCommand r3 = io.netty.handler.codec.smtp.SmtpCommand.RSET
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1b
            r4.contentExpected = r1
            goto L23
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "SmtpContent expected"
            r5.<init>(r6)
            throw r5
        L23:
            io.netty.buffer.ByteBufAllocator r5 = r5.alloc()
            io.netty.buffer.ByteBuf r5 = r5.buffer()
            r2 = 1
            io.netty.handler.codec.smtp.SmtpCommand r3 = r0.command()     // Catch: java.lang.Throwable -> L51
            r3.encode(r5)     // Catch: java.lang.Throwable -> L51
            java.util.List r3 = r0.parameters()     // Catch: java.lang.Throwable -> L51
            writeParameters(r3, r5)     // Catch: java.lang.Throwable -> L51
            r3 = 3338(0xd0a, float:4.678E-42)
            io.netty.buffer.ByteBufUtil.writeShortBE(r5, r3)     // Catch: java.lang.Throwable -> L51
            r7.add(r5)     // Catch: java.lang.Throwable -> L51
            io.netty.handler.codec.smtp.SmtpCommand r0 = r0.command()     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r0.isContentExpected()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L59
            r4.contentExpected = r2     // Catch: java.lang.Throwable -> L4f
            goto L59
        L4f:
            r6 = move-exception
            goto L53
        L51:
            r6 = move-exception
            r1 = 1
        L53:
            if (r1 == 0) goto L58
            r5.release()
        L58:
            throw r6
        L59:
            boolean r5 = r6 instanceof io.netty.handler.codec.smtp.SmtpContent
            if (r5 == 0) goto L87
            boolean r5 = r4.contentExpected
            if (r5 == 0) goto L7f
            r5 = r6
            io.netty.handler.codec.smtp.SmtpContent r5 = (io.netty.handler.codec.smtp.SmtpContent) r5
            io.netty.buffer.ByteBuf r5 = r5.content()
            io.netty.buffer.ByteBuf r5 = r5.retain()
            r7.add(r5)
            boolean r5 = r6 instanceof io.netty.handler.codec.smtp.LastSmtpContent
            if (r5 == 0) goto L87
            io.netty.buffer.ByteBuf r5 = io.netty.handler.codec.smtp.SmtpRequestEncoder.DOT_CRLF_BUFFER
            io.netty.buffer.ByteBuf r5 = r5.retainedDuplicate()
            r7.add(r5)
            r4.contentExpected = r1
            return
        L7f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No SmtpContent expected"
            r5.<init>(r6)
            throw r5
        L87:
            return
    }
}
