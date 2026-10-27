package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyStreamStatus implements java.lang.Comparable<io.netty.handler.codec.spdy.SpdyStreamStatus> {
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus CANCEL = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus FLOW_CONTROL_ERROR = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus FRAME_TOO_LARGE = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus INTERNAL_ERROR = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus INVALID_CREDENTIALS = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus INVALID_STREAM = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus PROTOCOL_ERROR = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus REFUSED_STREAM = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus STREAM_ALREADY_CLOSED = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus STREAM_IN_USE = null;
    public static final io.netty.handler.codec.spdy.SpdyStreamStatus UNSUPPORTED_VERSION = null;
    private final int code;
    private final java.lang.String statusPhrase;

    static {
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 1
            java.lang.String r2 = "PROTOCOL_ERROR"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 2
            java.lang.String r2 = "INVALID_STREAM"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_STREAM = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 3
            java.lang.String r2 = "REFUSED_STREAM"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.REFUSED_STREAM = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 4
            java.lang.String r2 = "UNSUPPORTED_VERSION"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.UNSUPPORTED_VERSION = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 5
            java.lang.String r2 = "CANCEL"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.CANCEL = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 6
            java.lang.String r2 = "INTERNAL_ERROR"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.INTERNAL_ERROR = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 7
            java.lang.String r2 = "FLOW_CONTROL_ERROR"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.FLOW_CONTROL_ERROR = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 8
            java.lang.String r2 = "STREAM_IN_USE"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.STREAM_IN_USE = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 9
            java.lang.String r2 = "STREAM_ALREADY_CLOSED"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.STREAM_ALREADY_CLOSED = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 10
            java.lang.String r2 = "INVALID_CREDENTIALS"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_CREDENTIALS = r0
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 11
            java.lang.String r2 = "FRAME_TOO_LARGE"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdyStreamStatus.FRAME_TOO_LARGE = r0
            return
    }

    public SpdyStreamStatus(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.code = r1
            r0.statusPhrase = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "statusPhrase"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "0 is not a valid status code for a RST_STREAM"
            r1.<init>(r2)
            throw r1
    }

    public static io.netty.handler.codec.spdy.SpdyStreamStatus valueOf(int r3) {
            if (r3 == 0) goto L42
            switch(r3) {
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L30;
                case 7: goto L2d;
                case 8: goto L2a;
                case 9: goto L27;
                case 10: goto L24;
                case 11: goto L21;
                default: goto L5;
            }
        L5:
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = new io.netty.handler.codec.spdy.SpdyStreamStatus
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UNKNOWN ("
            r1.append(r2)
            r1.append(r3)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            return r0
        L21:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.FRAME_TOO_LARGE
            return r3
        L24:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_CREDENTIALS
            return r3
        L27:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.STREAM_ALREADY_CLOSED
            return r3
        L2a:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.STREAM_IN_USE
            return r3
        L2d:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.FLOW_CONTROL_ERROR
            return r3
        L30:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.INTERNAL_ERROR
            return r3
        L33:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.CANCEL
            return r3
        L36:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.UNSUPPORTED_VERSION
            return r3
        L39:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.REFUSED_STREAM
            return r3
        L3c:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.INVALID_STREAM
            return r3
        L3f:
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = io.netty.handler.codec.spdy.SpdyStreamStatus.PROTOCOL_ERROR
            return r3
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "0 is not a valid status code for a RST_STREAM"
            r3.<init>(r0)
            throw r3
    }

    public int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.spdy.SpdyStreamStatus r2) {
            r1 = this;
            int r0 = r1.code()
            int r2 = r2.code()
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.spdy.SpdyStreamStatus r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyStreamStatus r1 = (io.netty.handler.codec.spdy.SpdyStreamStatus) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdyStreamStatus
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.code()
            io.netty.handler.codec.spdy.SpdyStreamStatus r3 = (io.netty.handler.codec.spdy.SpdyStreamStatus) r3
            int r3 = r3.code()
            if (r0 != r3) goto L14
            r3 = 1
            return r3
        L14:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.code()
            return r0
    }

    public java.lang.String statusPhrase() {
            r1 = this;
            java.lang.String r0 = r1.statusPhrase
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.statusPhrase()
            return r0
    }
}
