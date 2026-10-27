package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks5CommandType implements java.lang.Comparable<io.netty.handler.codec.socksx.v5.Socks5CommandType> {
    public static final io.netty.handler.codec.socksx.v5.Socks5CommandType BIND = null;
    public static final io.netty.handler.codec.socksx.v5.Socks5CommandType CONNECT = null;
    public static final io.netty.handler.codec.socksx.v5.Socks5CommandType UDP_ASSOCIATE = null;
    private final byte byteValue;
    private final java.lang.String name;
    private java.lang.String text;

    static {
            io.netty.handler.codec.socksx.v5.Socks5CommandType r0 = new io.netty.handler.codec.socksx.v5.Socks5CommandType
            r1 = 1
            java.lang.String r2 = "CONNECT"
            r0.<init>(r1, r2)
            io.netty.handler.codec.socksx.v5.Socks5CommandType.CONNECT = r0
            io.netty.handler.codec.socksx.v5.Socks5CommandType r0 = new io.netty.handler.codec.socksx.v5.Socks5CommandType
            r1 = 2
            java.lang.String r2 = "BIND"
            r0.<init>(r1, r2)
            io.netty.handler.codec.socksx.v5.Socks5CommandType.BIND = r0
            io.netty.handler.codec.socksx.v5.Socks5CommandType r0 = new io.netty.handler.codec.socksx.v5.Socks5CommandType
            r1 = 3
            java.lang.String r2 = "UDP_ASSOCIATE"
            r0.<init>(r1, r2)
            io.netty.handler.codec.socksx.v5.Socks5CommandType.UDP_ASSOCIATE = r0
            return
    }

    public Socks5CommandType(int r2) {
            r1 = this;
            java.lang.String r0 = "UNKNOWN"
            r1.<init>(r2, r0)
            return
    }

    public Socks5CommandType(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto Lb
            byte r1 = (byte) r1
            r0.byteValue = r1
            r0.name = r2
            return
        Lb:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "name"
            r1.<init>(r2)
            throw r1
    }

    public static io.netty.handler.codec.socksx.v5.Socks5CommandType valueOf(byte r1) {
            r0 = 1
            if (r1 == r0) goto L15
            r0 = 2
            if (r1 == r0) goto L12
            r0 = 3
            if (r1 == r0) goto Lf
            io.netty.handler.codec.socksx.v5.Socks5CommandType r0 = new io.netty.handler.codec.socksx.v5.Socks5CommandType
            r0.<init>(r1)
            return r0
        Lf:
            io.netty.handler.codec.socksx.v5.Socks5CommandType r1 = io.netty.handler.codec.socksx.v5.Socks5CommandType.UDP_ASSOCIATE
            return r1
        L12:
            io.netty.handler.codec.socksx.v5.Socks5CommandType r1 = io.netty.handler.codec.socksx.v5.Socks5CommandType.BIND
            return r1
        L15:
            io.netty.handler.codec.socksx.v5.Socks5CommandType r1 = io.netty.handler.codec.socksx.v5.Socks5CommandType.CONNECT
            return r1
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.socksx.v5.Socks5CommandType r2) {
            r1 = this;
            byte r0 = r1.byteValue
            byte r2 = r2.byteValue
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.socksx.v5.Socks5CommandType r1) {
            r0 = this;
            io.netty.handler.codec.socksx.v5.Socks5CommandType r1 = (io.netty.handler.codec.socksx.v5.Socks5CommandType) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.socksx.v5.Socks5CommandType
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte r0 = r2.byteValue
            io.netty.handler.codec.socksx.v5.Socks5CommandType r3 = (io.netty.handler.codec.socksx.v5.Socks5CommandType) r3
            byte r3 = r3.byteValue
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public int hashCode() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.text
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.name
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            byte r1 = r2.byteValue
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.text = r0
        L25:
            return r0
    }
}
