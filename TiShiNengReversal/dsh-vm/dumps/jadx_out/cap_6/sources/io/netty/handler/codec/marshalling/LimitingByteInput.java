package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class LimitingByteInput implements org.jboss.marshalling.ByteInput {
    private static final io.netty.handler.codec.marshalling.LimitingByteInput.TooBigObjectException EXCEPTION = null;
    private final org.jboss.marshalling.ByteInput input;
    private final long limit;
    private long read;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TooBigObjectException extends java.io.IOException {
        private static final long serialVersionUID = 1;

        TooBigObjectException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            io.netty.handler.codec.marshalling.LimitingByteInput$TooBigObjectException r0 = new io.netty.handler.codec.marshalling.LimitingByteInput$TooBigObjectException
            r0.<init>()
            io.netty.handler.codec.marshalling.LimitingByteInput.EXCEPTION = r0
            return
    }

    LimitingByteInput(org.jboss.marshalling.ByteInput r4, long r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            r3.input = r4
            r3.limit = r5
            return
        Le:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The limit MUST be > 0"
            r4.<init>(r5)
            throw r4
    }

    private int readable(int r7) {
            r6 = this;
            long r0 = (long) r7
            long r2 = r6.limit
            long r4 = r6.read
            long r2 = r2 - r4
            long r0 = java.lang.Math.min(r0, r2)
            int r7 = (int) r0
            return r7
    }

    public int available() throws java.io.IOException {
            r1 = this;
            org.jboss.marshalling.ByteInput r0 = r1.input
            int r0 = r0.available()
            int r0 = r1.readable(r0)
            return r0
    }

    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    public int read() throws java.io.IOException {
            r5 = this;
            r0 = 1
            int r0 = r5.readable(r0)
            if (r0 <= 0) goto L15
            org.jboss.marshalling.ByteInput r0 = r5.input
            int r0 = r0.read()
            long r1 = r5.read
            r3 = 1
            long r1 = r1 + r3
            r5.read = r1
            return r0
        L15:
            io.netty.handler.codec.marshalling.LimitingByteInput$TooBigObjectException r0 = io.netty.handler.codec.marshalling.LimitingByteInput.EXCEPTION
            throw r0
    }

    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r5 = r2.readable(r5)
            if (r5 <= 0) goto L13
            org.jboss.marshalling.ByteInput r0 = r2.input
            int r3 = r0.read(r3, r4, r5)
            long r4 = r2.read
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.read = r4
            return r3
        L13:
            io.netty.handler.codec.marshalling.LimitingByteInput$TooBigObjectException r3 = io.netty.handler.codec.marshalling.LimitingByteInput.EXCEPTION
            throw r3
    }

    public long skip(long r3) throws java.io.IOException {
            r2 = this;
            int r4 = (int) r3
            int r3 = r2.readable(r4)
            if (r3 <= 0) goto L14
            org.jboss.marshalling.ByteInput r4 = r2.input
            long r0 = (long) r3
            long r3 = r4.skip(r0)
            long r0 = r2.read
            long r0 = r0 + r3
            r2.read = r0
            return r3
        L14:
            io.netty.handler.codec.marshalling.LimitingByteInput$TooBigObjectException r3 = io.netty.handler.codec.marshalling.LimitingByteInput.EXCEPTION
            throw r3
    }
}
