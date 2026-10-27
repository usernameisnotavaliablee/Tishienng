package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2Stream {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum State extends java.lang.Enum<io.netty.handler.codec.http2.Http2Stream.State> {
        private static final /* synthetic */ io.netty.handler.codec.http2.Http2Stream.State[] $VALUES = null;
        public static final io.netty.handler.codec.http2.Http2Stream.State CLOSED = null;
        public static final io.netty.handler.codec.http2.Http2Stream.State HALF_CLOSED_LOCAL = null;
        public static final io.netty.handler.codec.http2.Http2Stream.State HALF_CLOSED_REMOTE = null;
        public static final io.netty.handler.codec.http2.Http2Stream.State IDLE = null;
        public static final io.netty.handler.codec.http2.Http2Stream.State OPEN = null;
        public static final io.netty.handler.codec.http2.Http2Stream.State RESERVED_LOCAL = null;
        public static final io.netty.handler.codec.http2.Http2Stream.State RESERVED_REMOTE = null;
        private final boolean localSideOpen;
        private final boolean remoteSideOpen;

        static {
                io.netty.handler.codec.http2.Http2Stream$State r0 = new io.netty.handler.codec.http2.Http2Stream$State
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2, r2, r2)
                io.netty.handler.codec.http2.Http2Stream.State.IDLE = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = new io.netty.handler.codec.http2.Http2Stream$State
                java.lang.String r3 = "RESERVED_LOCAL"
                r4 = 1
                r1.<init>(r3, r4, r2, r2)
                io.netty.handler.codec.http2.Http2Stream.State.RESERVED_LOCAL = r1
                io.netty.handler.codec.http2.Http2Stream$State r3 = new io.netty.handler.codec.http2.Http2Stream$State
                java.lang.String r5 = "RESERVED_REMOTE"
                r6 = 2
                r3.<init>(r5, r6, r2, r2)
                io.netty.handler.codec.http2.Http2Stream.State.RESERVED_REMOTE = r3
                io.netty.handler.codec.http2.Http2Stream$State r5 = new io.netty.handler.codec.http2.Http2Stream$State
                java.lang.String r7 = "OPEN"
                r8 = 3
                r5.<init>(r7, r8, r4, r4)
                io.netty.handler.codec.http2.Http2Stream.State.OPEN = r5
                io.netty.handler.codec.http2.Http2Stream$State r7 = new io.netty.handler.codec.http2.Http2Stream$State
                java.lang.String r9 = "HALF_CLOSED_LOCAL"
                r10 = 4
                r7.<init>(r9, r10, r2, r4)
                io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL = r7
                io.netty.handler.codec.http2.Http2Stream$State r9 = new io.netty.handler.codec.http2.Http2Stream$State
                java.lang.String r11 = "HALF_CLOSED_REMOTE"
                r12 = 5
                r9.<init>(r11, r12, r4, r2)
                io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE = r9
                io.netty.handler.codec.http2.Http2Stream$State r11 = new io.netty.handler.codec.http2.Http2Stream$State
                java.lang.String r13 = "CLOSED"
                r14 = 6
                r11.<init>(r13, r14, r2, r2)
                io.netty.handler.codec.http2.Http2Stream.State.CLOSED = r11
                r13 = 7
                io.netty.handler.codec.http2.Http2Stream$State[] r13 = new io.netty.handler.codec.http2.Http2Stream.State[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                io.netty.handler.codec.http2.Http2Stream.State.$VALUES = r13
                return
        }

        State(java.lang.String r1, int r2, boolean r3, boolean r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.localSideOpen = r3
                r0.remoteSideOpen = r4
                return
        }

        public static io.netty.handler.codec.http2.Http2Stream.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.Http2Stream$State> r0 = io.netty.handler.codec.http2.Http2Stream.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.Http2Stream$State r1 = (io.netty.handler.codec.http2.Http2Stream.State) r1
                return r1
        }

        public static io.netty.handler.codec.http2.Http2Stream.State[] values() {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = (io.netty.handler.codec.http2.Http2Stream.State[]) r0
                return r0
        }

        public boolean localSideOpen() {
                r1 = this;
                boolean r0 = r1.localSideOpen
                return r0
        }

        public boolean remoteSideOpen() {
                r1 = this;
                boolean r0 = r1.remoteSideOpen
                return r0
        }
    }

    io.netty.handler.codec.http2.Http2Stream close();

    io.netty.handler.codec.http2.Http2Stream closeLocalSide();

    io.netty.handler.codec.http2.Http2Stream closeRemoteSide();

    <V> V getProperty(io.netty.handler.codec.http2.Http2Connection.PropertyKey r1);

    io.netty.handler.codec.http2.Http2Stream headersReceived(boolean r1);

    io.netty.handler.codec.http2.Http2Stream headersSent(boolean r1);

    int id();

    boolean isHeadersReceived();

    boolean isHeadersSent();

    boolean isPushPromiseSent();

    boolean isResetSent();

    boolean isTrailersReceived();

    boolean isTrailersSent();

    io.netty.handler.codec.http2.Http2Stream open(boolean r1) throws io.netty.handler.codec.http2.Http2Exception;

    io.netty.handler.codec.http2.Http2Stream pushPromiseSent();

    <V> V removeProperty(io.netty.handler.codec.http2.Http2Connection.PropertyKey r1);

    io.netty.handler.codec.http2.Http2Stream resetSent();

    <V> V setProperty(io.netty.handler.codec.http2.Http2Connection.PropertyKey r1, V r2);

    io.netty.handler.codec.http2.Http2Stream.State state();
}
