package io.netty.handler.codec.socksx.v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks4CommandStatus implements java.lang.Comparable<io.netty.handler.codec.socksx.v4.Socks4CommandStatus> {
    public static final io.netty.handler.codec.socksx.v4.Socks4CommandStatus IDENTD_AUTH_FAILURE = null;
    public static final io.netty.handler.codec.socksx.v4.Socks4CommandStatus IDENTD_UNREACHABLE = null;
    public static final io.netty.handler.codec.socksx.v4.Socks4CommandStatus REJECTED_OR_FAILED = null;
    public static final io.netty.handler.codec.socksx.v4.Socks4CommandStatus SUCCESS = null;
    private final byte byteValue;
    private final java.lang.String name;
    private java.lang.String text;

    static {
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r0 = new io.netty.handler.codec.socksx.v4.Socks4CommandStatus
            r1 = 90
            java.lang.String r2 = "SUCCESS"
            r0.<init>(r1, r2)
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus.SUCCESS = r0
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r0 = new io.netty.handler.codec.socksx.v4.Socks4CommandStatus
            r1 = 91
            java.lang.String r2 = "REJECTED_OR_FAILED"
            r0.<init>(r1, r2)
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus.REJECTED_OR_FAILED = r0
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r0 = new io.netty.handler.codec.socksx.v4.Socks4CommandStatus
            r1 = 92
            java.lang.String r2 = "IDENTD_UNREACHABLE"
            r0.<init>(r1, r2)
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus.IDENTD_UNREACHABLE = r0
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r0 = new io.netty.handler.codec.socksx.v4.Socks4CommandStatus
            r1 = 93
            java.lang.String r2 = "IDENTD_AUTH_FAILURE"
            r0.<init>(r1, r2)
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus.IDENTD_AUTH_FAILURE = r0
            return
    }

    public Socks4CommandStatus(int r2) {
            r1 = this;
            java.lang.String r0 = "UNKNOWN"
            r1.<init>(r2, r0)
            return
    }

    public Socks4CommandStatus(int r1, java.lang.String r2) {
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

    public static io.netty.handler.codec.socksx.v4.Socks4CommandStatus valueOf(byte r1) {
            switch(r1) {
                case 90: goto L12;
                case 91: goto Lf;
                case 92: goto Lc;
                case 93: goto L9;
                default: goto L3;
            }
        L3:
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r0 = new io.netty.handler.codec.socksx.v4.Socks4CommandStatus
            r0.<init>(r1)
            return r0
        L9:
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r1 = io.netty.handler.codec.socksx.v4.Socks4CommandStatus.IDENTD_AUTH_FAILURE
            return r1
        Lc:
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r1 = io.netty.handler.codec.socksx.v4.Socks4CommandStatus.IDENTD_UNREACHABLE
            return r1
        Lf:
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r1 = io.netty.handler.codec.socksx.v4.Socks4CommandStatus.REJECTED_OR_FAILED
            return r1
        L12:
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r1 = io.netty.handler.codec.socksx.v4.Socks4CommandStatus.SUCCESS
            return r1
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.socksx.v4.Socks4CommandStatus r2) {
            r1 = this;
            byte r0 = r1.byteValue
            byte r2 = r2.byteValue
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.socksx.v4.Socks4CommandStatus r1) {
            r0 = this;
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r1 = (io.netty.handler.codec.socksx.v4.Socks4CommandStatus) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.socksx.v4.Socks4CommandStatus
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte r0 = r2.byteValue
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r3 = (io.netty.handler.codec.socksx.v4.Socks4CommandStatus) r3
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

    public boolean isSuccess() {
            r2 = this;
            byte r0 = r2.byteValue
            r1 = 90
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
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
