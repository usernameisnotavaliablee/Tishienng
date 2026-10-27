package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2Flags {
    public static final short ACK = 1;
    public static final short END_HEADERS = 4;
    public static final short END_STREAM = 1;
    public static final short PADDED = 8;
    public static final short PRIORITY = 32;
    private short value;

    public Http2Flags() {
            r0 = this;
            r0.<init>()
            return
    }

    public Http2Flags(short r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public io.netty.handler.codec.http2.Http2Flags ack(boolean r2) {
            r1 = this;
            r0 = 1
            io.netty.handler.codec.http2.Http2Flags r2 = r1.setFlag(r2, r0)
            return r2
    }

    public boolean ack() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.isFlagSet(r0)
            return r0
    }

    public io.netty.handler.codec.http2.Http2Flags endOfHeaders(boolean r2) {
            r1 = this;
            r0 = 4
            io.netty.handler.codec.http2.Http2Flags r2 = r1.setFlag(r2, r0)
            return r2
    }

    public boolean endOfHeaders() {
            r1 = this;
            r0 = 4
            boolean r0 = r1.isFlagSet(r0)
            return r0
    }

    public io.netty.handler.codec.http2.Http2Flags endOfStream(boolean r2) {
            r1 = this;
            r0 = 1
            io.netty.handler.codec.http2.Http2Flags r2 = r1.setFlag(r2, r0)
            return r2
    }

    public boolean endOfStream() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.isFlagSet(r0)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<io.netty.handler.codec.http2.Http2Flags> r2 = io.netty.handler.codec.http2.Http2Flags.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            short r2 = r4.value
            io.netty.handler.codec.http2.Http2Flags r5 = (io.netty.handler.codec.http2.Http2Flags) r5
            short r5 = r5.value
            if (r2 != r5) goto L1a
            return r0
        L1a:
            return r1
    }

    public int getNumPriorityBytes() {
            r1 = this;
            boolean r0 = r1.priorityPresent()
            if (r0 == 0) goto L8
            r0 = 5
            return r0
        L8:
            r0 = 0
            return r0
    }

    public int getPaddingPresenceFieldLength() {
            r1 = this;
            boolean r0 = r1.paddingPresent()
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = 31
            short r1 = r2.value
            int r0 = r0 + r1
            return r0
    }

    public boolean isFlagSet(short r2) {
            r1 = this;
            short r0 = r1.value
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public io.netty.handler.codec.http2.Http2Flags paddingPresent(boolean r2) {
            r1 = this;
            r0 = 8
            io.netty.handler.codec.http2.Http2Flags r2 = r1.setFlag(r2, r0)
            return r2
    }

    public boolean paddingPresent() {
            r1 = this;
            r0 = 8
            boolean r0 = r1.isFlagSet(r0)
            return r0
    }

    public io.netty.handler.codec.http2.Http2Flags priorityPresent(boolean r2) {
            r1 = this;
            r0 = 32
            io.netty.handler.codec.http2.Http2Flags r2 = r1.setFlag(r2, r0)
            return r2
    }

    public boolean priorityPresent() {
            r1 = this;
            r0 = 32
            boolean r0 = r1.isFlagSet(r0)
            return r0
    }

    public io.netty.handler.codec.http2.Http2Flags setFlag(boolean r1, short r2) {
            r0 = this;
            if (r1 == 0) goto L9
            short r1 = r0.value
            r1 = r1 | r2
            short r1 = (short) r1
            r0.value = r1
            return r0
        L9:
            short r1 = r0.value
            int r2 = ~r2
            r1 = r1 & r2
            short r1 = (short) r1
            r0.value = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "value = "
            r0.append(r1)
            short r1 = r2.value
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            boolean r1 = r2.ack()
            if (r1 == 0) goto L1f
            java.lang.String r1 = "ACK,"
            r0.append(r1)
        L1f:
            boolean r1 = r2.endOfHeaders()
            if (r1 == 0) goto L2a
            java.lang.String r1 = "END_OF_HEADERS,"
            r0.append(r1)
        L2a:
            boolean r1 = r2.endOfStream()
            if (r1 == 0) goto L35
            java.lang.String r1 = "END_OF_STREAM,"
            r0.append(r1)
        L35:
            boolean r1 = r2.priorityPresent()
            if (r1 == 0) goto L40
            java.lang.String r1 = "PRIORITY_PRESENT,"
            r0.append(r1)
        L40:
            boolean r1 = r2.paddingPresent()
            if (r1 == 0) goto L4b
            java.lang.String r1 = "PADDING_PRESENT,"
            r0.append(r1)
        L4b:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public short value() {
            r1 = this;
            short r0 = r1.value
            return r0
    }
}
