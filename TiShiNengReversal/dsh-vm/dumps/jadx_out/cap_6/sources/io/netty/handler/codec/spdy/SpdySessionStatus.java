package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdySessionStatus implements java.lang.Comparable<io.netty.handler.codec.spdy.SpdySessionStatus> {
    public static final io.netty.handler.codec.spdy.SpdySessionStatus INTERNAL_ERROR = null;
    public static final io.netty.handler.codec.spdy.SpdySessionStatus OK = null;
    public static final io.netty.handler.codec.spdy.SpdySessionStatus PROTOCOL_ERROR = null;
    private final int code;
    private final java.lang.String statusPhrase;

    static {
            io.netty.handler.codec.spdy.SpdySessionStatus r0 = new io.netty.handler.codec.spdy.SpdySessionStatus
            r1 = 0
            java.lang.String r2 = "OK"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdySessionStatus.OK = r0
            io.netty.handler.codec.spdy.SpdySessionStatus r0 = new io.netty.handler.codec.spdy.SpdySessionStatus
            r1 = 1
            java.lang.String r2 = "PROTOCOL_ERROR"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdySessionStatus.PROTOCOL_ERROR = r0
            io.netty.handler.codec.spdy.SpdySessionStatus r0 = new io.netty.handler.codec.spdy.SpdySessionStatus
            r1 = 2
            java.lang.String r2 = "INTERNAL_ERROR"
            r0.<init>(r1, r2)
            io.netty.handler.codec.spdy.SpdySessionStatus.INTERNAL_ERROR = r0
            return
    }

    public SpdySessionStatus(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto La
            r0.code = r1
            r0.statusPhrase = r2
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "statusPhrase"
            r1.<init>(r2)
            throw r1
    }

    public static io.netty.handler.codec.spdy.SpdySessionStatus valueOf(int r3) {
            if (r3 == 0) goto L2a
            r0 = 1
            if (r3 == r0) goto L27
            r0 = 2
            if (r3 == r0) goto L24
            io.netty.handler.codec.spdy.SpdySessionStatus r0 = new io.netty.handler.codec.spdy.SpdySessionStatus
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
        L24:
            io.netty.handler.codec.spdy.SpdySessionStatus r3 = io.netty.handler.codec.spdy.SpdySessionStatus.INTERNAL_ERROR
            return r3
        L27:
            io.netty.handler.codec.spdy.SpdySessionStatus r3 = io.netty.handler.codec.spdy.SpdySessionStatus.PROTOCOL_ERROR
            return r3
        L2a:
            io.netty.handler.codec.spdy.SpdySessionStatus r3 = io.netty.handler.codec.spdy.SpdySessionStatus.OK
            return r3
    }

    public int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.spdy.SpdySessionStatus r2) {
            r1 = this;
            int r0 = r1.code()
            int r2 = r2.code()
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.spdy.SpdySessionStatus r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySessionStatus r1 = (io.netty.handler.codec.spdy.SpdySessionStatus) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.spdy.SpdySessionStatus
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.code()
            io.netty.handler.codec.spdy.SpdySessionStatus r3 = (io.netty.handler.codec.spdy.SpdySessionStatus) r3
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
