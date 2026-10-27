package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpVersion implements java.lang.Comparable<io.netty.handler.codec.http.HttpVersion> {
    public static final io.netty.handler.codec.http.HttpVersion HTTP_1_0 = null;
    private static final java.lang.String HTTP_1_0_STRING = "HTTP/1.0";
    public static final io.netty.handler.codec.http.HttpVersion HTTP_1_1 = null;
    private static final java.lang.String HTTP_1_1_STRING = "HTTP/1.1";
    private static final java.util.regex.Pattern VERSION_PATTERN = null;
    private final byte[] bytes;
    private final boolean keepAliveDefault;
    private final int majorVersion;
    private final int minorVersion;
    private final java.lang.String protocolName;
    private final java.lang.String text;

    static {
            java.lang.String r0 = "(\\S+)/(\\d+)\\.(\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.codec.http.HttpVersion.VERSION_PATTERN = r0
            io.netty.handler.codec.http.HttpVersion r1 = new io.netty.handler.codec.http.HttpVersion
            r5 = 0
            r6 = 1
            java.lang.String r2 = "HTTP"
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            io.netty.handler.codec.http.HttpVersion.HTTP_1_0 = r1
            io.netty.handler.codec.http.HttpVersion r2 = new io.netty.handler.codec.http.HttpVersion
            r7 = 1
            java.lang.String r3 = "HTTP"
            r4 = 1
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            io.netty.handler.codec.http.HttpVersion.HTTP_1_1 = r2
            return
    }

    public HttpVersion(java.lang.String r7, int r8, int r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private HttpVersion(java.lang.String r3, int r4, int r5, boolean r6, boolean r7) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L80
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = r3.toUpperCase()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L78
            r0 = 0
        L14:
            int r1 = r3.length()
            if (r0 >= r1) goto L39
            char r1 = r3.charAt(r0)
            boolean r1 = java.lang.Character.isISOControl(r1)
            if (r1 != 0) goto L31
            char r1 = r3.charAt(r0)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L31
            int r0 = r0 + 1
            goto L14
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "invalid character in protocolName"
            r3.<init>(r4)
            throw r3
        L39:
            java.lang.String r0 = "majorVersion"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            java.lang.String r0 = "minorVersion"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r0)
            r2.protocolName = r3
            r2.majorVersion = r4
            r2.minorVersion = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 47
            r0.append(r3)
            r0.append(r4)
            r3 = 46
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.text = r3
            r2.keepAliveDefault = r6
            if (r7 == 0) goto L74
            java.nio.charset.Charset r4 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r3 = r3.getBytes(r4)
            r2.bytes = r3
            return
        L74:
            r3 = 0
            r2.bytes = r3
            return
        L78:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "empty protocolName"
            r3.<init>(r4)
            throw r3
        L80:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "protocolName"
            r3.<init>(r4)
            throw r3
    }

    public HttpVersion(java.lang.String r4, boolean r5) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L7f
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = r4.toUpperCase()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L77
            java.util.regex.Pattern r0 = io.netty.handler.codec.http.HttpVersion.VERSION_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L60
            r4 = 1
            java.lang.String r4 = r0.group(r4)
            r3.protocolName = r4
            r1 = 2
            java.lang.String r1 = r0.group(r1)
            int r1 = java.lang.Integer.parseInt(r1)
            r3.majorVersion = r1
            r2 = 3
            java.lang.String r0 = r0.group(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.minorVersion = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            r2.append(r1)
            r4 = 46
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r3.text = r4
            r3.keepAliveDefault = r5
            r4 = 0
            r3.bytes = r4
            return
        L60:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid version format: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L77:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "empty text"
            r4.<init>(r5)
            throw r4
        L7f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "text"
            r4.<init>(r5)
            throw r4
    }

    public static io.netty.handler.codec.http.HttpVersion valueOf(java.lang.String r2) {
            if (r2 == 0) goto L21
            java.lang.String r2 = r2.trim()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L19
            io.netty.handler.codec.http.HttpVersion r0 = version0(r2)
            if (r0 != 0) goto L18
            io.netty.handler.codec.http.HttpVersion r0 = new io.netty.handler.codec.http.HttpVersion
            r1 = 1
            r0.<init>(r2, r1)
        L18:
            return r0
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "text is empty (possibly HTTP/0.9)"
            r2.<init>(r0)
            throw r2
        L21:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "text"
            r2.<init>(r0)
            throw r2
    }

    private static io.netty.handler.codec.http.HttpVersion version0(java.lang.String r1) {
            java.lang.String r0 = "HTTP/1.1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            return r1
        Lb:
            java.lang.String r0 = "HTTP/1.0"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L16
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_0
            return r1
        L16:
            r1 = 0
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.HttpVersion r3) {
            r2 = this;
            java.lang.String r0 = r2.protocolName()
            java.lang.String r1 = r3.protocolName()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            int r0 = r2.majorVersion()
            int r1 = r3.majorVersion()
            int r0 = r0 - r1
            if (r0 == 0) goto L1b
            return r0
        L1b:
            int r0 = r2.minorVersion()
            int r3 = r3.minorVersion()
            int r0 = r0 - r3
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.HttpVersion r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpVersion r1 = (io.netty.handler.codec.http.HttpVersion) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    void encode(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            byte[] r0 = r2.bytes
            if (r0 != 0) goto Lc
            java.lang.String r0 = r2.text
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            r3.writeCharSequence(r0, r1)
            return
        Lc:
            r3.writeBytes(r0)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpVersion
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http.HttpVersion r4 = (io.netty.handler.codec.http.HttpVersion) r4
            int r0 = r3.minorVersion()
            int r2 = r4.minorVersion()
            if (r0 != r2) goto L2c
            int r0 = r3.majorVersion()
            int r2 = r4.majorVersion()
            if (r0 != r2) goto L2c
            java.lang.String r0 = r3.protocolName()
            java.lang.String r4 = r4.protocolName()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L2c
            r4 = 1
            return r4
        L2c:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.protocolName()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.majorVersion()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.minorVersion()
            int r0 = r0 + r1
            return r0
    }

    public boolean isKeepAliveDefault() {
            r1 = this;
            boolean r0 = r1.keepAliveDefault
            return r0
    }

    public int majorVersion() {
            r1 = this;
            int r0 = r1.majorVersion
            return r0
    }

    public int minorVersion() {
            r1 = this;
            int r0 = r1.minorVersion
            return r0
    }

    public java.lang.String protocolName() {
            r1 = this;
            java.lang.String r0 = r1.protocolName
            return r0
    }

    public java.lang.String text() {
            r1 = this;
            java.lang.String r0 = r1.text
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.text()
            return r0
    }
}
