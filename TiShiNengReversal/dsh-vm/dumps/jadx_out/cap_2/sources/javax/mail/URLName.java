package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class URLName {
    static final int caseDiff = 32;
    private static boolean doEncode = true;
    static java.util.BitSet dontNeedEncoding;
    private java.lang.String file;
    protected java.lang.String fullURL;
    private int hashCode;
    private java.lang.String host;
    private java.net.InetAddress hostAddress;
    private boolean hostAddressKnown;
    private java.lang.String password;
    private int port;
    private java.lang.String protocol;
    private java.lang.String ref;
    private java.lang.String username;

    static {
            java.lang.String r0 = "mail.URLName.dontencode"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Exception -> La
            r0 = r0 ^ 1
            javax.mail.URLName.doEncode = r0     // Catch: java.lang.Exception -> La
        La:
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            javax.mail.URLName.dontNeedEncoding = r0
            r0 = 97
        L15:
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L59
            r0 = 65
        L1b:
            r1 = 90
            if (r0 <= r1) goto L51
            r0 = 48
        L21:
            r1 = 57
            if (r0 <= r1) goto L49
            java.util.BitSet r0 = javax.mail.URLName.dontNeedEncoding
            r1 = 32
            r0.set(r1)
            java.util.BitSet r0 = javax.mail.URLName.dontNeedEncoding
            r1 = 45
            r0.set(r1)
            java.util.BitSet r0 = javax.mail.URLName.dontNeedEncoding
            r1 = 95
            r0.set(r1)
            java.util.BitSet r0 = javax.mail.URLName.dontNeedEncoding
            r1 = 46
            r0.set(r1)
            java.util.BitSet r0 = javax.mail.URLName.dontNeedEncoding
            r1 = 42
            r0.set(r1)
            return
        L49:
            java.util.BitSet r1 = javax.mail.URLName.dontNeedEncoding
            r1.set(r0)
            int r0 = r0 + 1
            goto L21
        L51:
            java.util.BitSet r1 = javax.mail.URLName.dontNeedEncoding
            r1.set(r0)
            int r0 = r0 + 1
            goto L1b
        L59:
            java.util.BitSet r1 = javax.mail.URLName.dontNeedEncoding
            r1.set(r0)
            int r0 = r0 + 1
            goto L15
    }

    public URLName(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.hostAddressKnown = r0
            r1 = -1
            r2.port = r1
            r2.hashCode = r0
            r2.parseString(r3)
            return
    }

    public URLName(java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hostAddressKnown = r0
            r1.hashCode = r0
            r1.protocol = r2
            r1.host = r3
            r1.port = r4
            if (r5 == 0) goto L28
            r2 = 35
            int r2 = r5.indexOf(r2)
            r3 = -1
            if (r2 == r3) goto L28
            java.lang.String r3 = r5.substring(r0, r2)
            r1.file = r3
            int r2 = r2 + 1
            java.lang.String r2 = r5.substring(r2)
            r1.ref = r2
            goto L2d
        L28:
            r1.file = r5
            r2 = 0
            r1.ref = r2
        L2d:
            boolean r2 = javax.mail.URLName.doEncode
            if (r2 == 0) goto L35
            java.lang.String r6 = encode(r6)
        L35:
            r1.username = r6
            boolean r2 = javax.mail.URLName.doEncode
            if (r2 == 0) goto L3f
            java.lang.String r7 = encode(r7)
        L3f:
            r1.password = r7
            return
    }

    public URLName(java.net.URL r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return
    }

    private static java.lang.String _encode(java.lang.String r10) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r10.length()
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r2 = 10
            r1.<init>(r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r1)
            r3 = 0
            r4 = 0
        L17:
            int r5 = r10.length()
            if (r4 < r5) goto L22
            java.lang.String r10 = r0.toString()
            return r10
        L22:
            char r5 = r10.charAt(r4)
            java.util.BitSet r6 = javax.mail.URLName.dontNeedEncoding
            boolean r6 = r6.get(r5)
            if (r6 == 0) goto L39
            r6 = 32
            if (r5 != r6) goto L34
            r5 = 43
        L34:
            char r5 = (char) r5
            r0.append(r5)
            goto L82
        L39:
            r2.write(r5)     // Catch: java.io.IOException -> L7f
            r2.flush()     // Catch: java.io.IOException -> L7f
            byte[] r5 = r1.toByteArray()
            r6 = 0
        L44:
            int r7 = r5.length
            if (r6 < r7) goto L4b
            r1.reset()
            goto L82
        L4b:
            r7 = 37
            r0.append(r7)
            r7 = r5[r6]
            int r7 = r7 >> 4
            r7 = r7 & 15
            r8 = 16
            char r7 = java.lang.Character.forDigit(r7, r8)
            boolean r9 = java.lang.Character.isLetter(r7)
            if (r9 == 0) goto L65
            int r7 = r7 + (-32)
            char r7 = (char) r7
        L65:
            r0.append(r7)
            r7 = r5[r6]
            r7 = r7 & 15
            char r7 = java.lang.Character.forDigit(r7, r8)
            boolean r8 = java.lang.Character.isLetter(r7)
            if (r8 == 0) goto L79
            int r7 = r7 + (-32)
            char r7 = (char) r7
        L79:
            r0.append(r7)
            int r6 = r6 + 1
            goto L44
        L7f:
            r1.reset()
        L82:
            int r4 = r4 + 1
            goto L17
    }

    static java.lang.String decode(java.lang.String r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.String r0 = "+%"
            int r0 = indexOfAny(r4, r0)
            r1 = -1
            if (r0 != r1) goto Le
            return r4
        Le:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L14:
            int r2 = r4.length()
            if (r1 < r2) goto L2b
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "8859_1"
            byte[] r0 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L2a
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L2a
            r1.<init>(r0)     // Catch: java.io.UnsupportedEncodingException -> L2a
            return r1
        L2a:
            return r4
        L2b:
            char r2 = r4.charAt(r1)
            r3 = 37
            if (r2 == r3) goto L41
            r3 = 43
            if (r2 == r3) goto L3b
            r0.append(r2)
            goto L55
        L3b:
            r2 = 32
            r0.append(r2)
            goto L55
        L41:
            int r2 = r1 + 1
            int r3 = r1 + 3
            java.lang.String r2 = r4.substring(r2, r3)     // Catch: java.lang.NumberFormatException -> L58
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)     // Catch: java.lang.NumberFormatException -> L58
            char r2 = (char) r2     // Catch: java.lang.NumberFormatException -> L58
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L58
            int r1 = r1 + 2
        L55:
            int r1 = r1 + 1
            goto L14
        L58:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    static java.lang.String encode(java.lang.String r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 0
        L5:
            int r1 = r3.length()
            if (r0 < r1) goto Lc
            return r3
        Lc:
            char r1 = r3.charAt(r0)
            r2 = 32
            if (r1 == r2) goto L20
            java.util.BitSet r2 = javax.mail.URLName.dontNeedEncoding
            boolean r1 = r2.get(r1)
            if (r1 != 0) goto L1d
            goto L20
        L1d:
            int r0 = r0 + 1
            goto L5
        L20:
            java.lang.String r3 = _encode(r3)
            return r3
    }

    private synchronized java.net.InetAddress getHostAddress() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hostAddressKnown     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            java.net.InetAddress r0 = r2.hostAddress     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            goto L22
        Lb:
            java.lang.String r0 = r2.host     // Catch: java.lang.Throwable -> L9
            r1 = 0
            if (r0 != 0) goto L12
            monitor-exit(r2)
            return r1
        L12:
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Throwable -> L9 java.net.UnknownHostException -> L19
            r2.hostAddress = r0     // Catch: java.lang.Throwable -> L9 java.net.UnknownHostException -> L19
            goto L1b
        L19:
            r2.hostAddress = r1     // Catch: java.lang.Throwable -> L9
        L1b:
            r0 = 1
            r2.hostAddressKnown = r0     // Catch: java.lang.Throwable -> L9
            java.net.InetAddress r0 = r2.hostAddress     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private static int indexOfAny(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            int r1 = indexOfAny(r1, r2, r0)
            return r1
    }

    private static int indexOfAny(java.lang.String r3, java.lang.String r4, int r5) {
            r0 = -1
            int r1 = r3.length()     // Catch: java.lang.StringIndexOutOfBoundsException -> L16
        L5:
            if (r5 < r1) goto L8
            return r0
        L8:
            char r2 = r3.charAt(r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L16
            int r2 = r4.indexOf(r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L16
            if (r2 < 0) goto L13
            return r5
        L13:
            int r5 = r5 + 1
            goto L5
        L16:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof javax.mail.URLName
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.URLName r5 = (javax.mail.URLName) r5
            java.lang.String r0 = r5.protocol
            if (r0 == 0) goto L68
            java.lang.String r2 = r4.protocol
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L15
            goto L68
        L15:
            java.net.InetAddress r0 = r4.getHostAddress()
            java.net.InetAddress r2 = r5.getHostAddress()
            if (r0 == 0) goto L28
            if (r2 == 0) goto L28
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3c
            return r1
        L28:
            java.lang.String r0 = r4.host
            if (r0 == 0) goto L37
            java.lang.String r2 = r5.host
            if (r2 == 0) goto L37
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L3c
            return r1
        L37:
            java.lang.String r2 = r5.host
            if (r0 == r2) goto L3c
            return r1
        L3c:
            java.lang.String r0 = r4.username
            java.lang.String r2 = r5.username
            if (r0 == r2) goto L4b
            if (r0 == 0) goto L4a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4b
        L4a:
            return r1
        L4b:
            java.lang.String r0 = r4.file
            java.lang.String r2 = ""
            if (r0 != 0) goto L52
            r0 = r2
        L52:
            java.lang.String r3 = r5.file
            if (r3 != 0) goto L57
            goto L58
        L57:
            r2 = r3
        L58:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            return r1
        L5f:
            int r0 = r4.port
            int r5 = r5.port
            if (r0 == r5) goto L66
            return r1
        L66:
            r5 = 1
            return r5
        L68:
            return r1
    }

    public java.lang.String getFile() {
            r1 = this;
            java.lang.String r0 = r1.file
            return r0
    }

    public java.lang.String getHost() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public java.lang.String getPassword() {
            r1 = this;
            boolean r0 = javax.mail.URLName.doEncode
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.password
            java.lang.String r0 = decode(r0)
            return r0
        Lb:
            java.lang.String r0 = r1.password
            return r0
    }

    public int getPort() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    public java.lang.String getProtocol() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }

    public java.lang.String getRef() {
            r1 = this;
            java.lang.String r0 = r1.ref
            return r0
    }

    public java.net.URL getURL() throws java.net.MalformedURLException {
            r5 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r5.getProtocol()
            java.lang.String r2 = r5.getHost()
            int r3 = r5.getPort()
            java.lang.String r4 = r5.getFile()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public java.lang.String getUsername() {
            r1 = this;
            boolean r0 = javax.mail.URLName.doEncode
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.username
            java.lang.String r0 = decode(r0)
            return r0
        Lb:
            java.lang.String r0 = r1.username
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.hashCode
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r3.protocol
            if (r1 == 0) goto L10
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r3.hashCode = r0
        L10:
            java.net.InetAddress r0 = r3.getHostAddress()
            if (r0 == 0) goto L20
            int r1 = r3.hashCode
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            r3.hashCode = r1
            goto L33
        L20:
            java.lang.String r0 = r3.host
            if (r0 == 0) goto L33
            int r1 = r3.hashCode
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r2)
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            r3.hashCode = r1
        L33:
            java.lang.String r0 = r3.username
            if (r0 == 0) goto L40
            int r1 = r3.hashCode
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            r3.hashCode = r1
        L40:
            java.lang.String r0 = r3.file
            if (r0 == 0) goto L4d
            int r1 = r3.hashCode
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            r3.hashCode = r1
        L4d:
            int r0 = r3.hashCode
            int r1 = r3.port
            int r0 = r0 + r1
            r3.hashCode = r0
            return r0
    }

    protected void parseString(java.lang.String r9) {
            r8 = this;
            r0 = 0
            r8.password = r0
            r8.username = r0
            r8.host = r0
            r8.ref = r0
            r8.file = r0
            r8.protocol = r0
            r0 = -1
            r8.port = r0
            int r1 = r9.length()
            r2 = 58
            int r3 = r9.indexOf(r2)
            r4 = 0
            if (r3 == r0) goto L23
            java.lang.String r5 = r9.substring(r4, r3)
            r8.protocol = r5
        L23:
            int r5 = r3 + 1
            java.lang.String r6 = "//"
            r7 = 2
            boolean r6 = r9.regionMatches(r5, r6, r4, r7)
            if (r6 == 0) goto Lb7
            int r3 = r3 + 3
            r5 = 47
            int r5 = r9.indexOf(r5, r3)
            if (r5 == r0) goto L4c
            java.lang.String r3 = r9.substring(r3, r5)
            int r5 = r5 + 1
            if (r5 >= r1) goto L47
            java.lang.String r9 = r9.substring(r5)
            r8.file = r9
            goto L50
        L47:
            java.lang.String r9 = ""
            r8.file = r9
            goto L50
        L4c:
            java.lang.String r3 = r9.substring(r3)
        L50:
            r9 = 64
            int r9 = r3.indexOf(r9)
            if (r9 == r0) goto L79
            java.lang.String r1 = r3.substring(r4, r9)
            int r9 = r9 + 1
            java.lang.String r3 = r3.substring(r9)
            int r9 = r1.indexOf(r2)
            if (r9 == r0) goto L77
            java.lang.String r5 = r1.substring(r4, r9)
            r8.username = r5
            int r9 = r9 + 1
            java.lang.String r9 = r1.substring(r9)
            r8.password = r9
            goto L79
        L77:
            r8.username = r1
        L79:
            int r9 = r3.length()
            if (r9 <= 0) goto L92
            char r9 = r3.charAt(r4)
            r1 = 91
            if (r9 != r1) goto L92
            r9 = 93
            int r9 = r3.indexOf(r9)
            int r9 = r3.indexOf(r2, r9)
            goto L96
        L92:
            int r9 = r3.indexOf(r2)
        L96:
            if (r9 == r0) goto Lb4
            int r1 = r9 + 1
            java.lang.String r1 = r3.substring(r1)
            int r2 = r1.length()
            if (r2 <= 0) goto Lad
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lab
            r8.port = r1     // Catch: java.lang.NumberFormatException -> Lab
            goto Lad
        Lab:
            r8.port = r0
        Lad:
            java.lang.String r9 = r3.substring(r4, r9)
            r8.host = r9
            goto Lbf
        Lb4:
            r8.host = r3
            goto Lbf
        Lb7:
            if (r5 >= r1) goto Lbf
            java.lang.String r9 = r9.substring(r5)
            r8.file = r9
        Lbf:
            java.lang.String r9 = r8.file
            if (r9 == 0) goto Ldd
            r1 = 35
            int r9 = r9.indexOf(r1)
            if (r9 == r0) goto Ldd
            java.lang.String r0 = r8.file
            int r1 = r9 + 1
            java.lang.String r0 = r0.substring(r1)
            r8.ref = r0
            java.lang.String r0 = r8.file
            java.lang.String r9 = r0.substring(r4, r9)
            r8.file = r9
        Ldd:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.fullURL
            if (r0 != 0) goto L76
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r4.protocol
            java.lang.String r2 = ":"
            if (r1 == 0) goto L15
            r0.append(r1)
            r0.append(r2)
        L15:
            java.lang.String r1 = r4.username
            if (r1 != 0) goto L1d
            java.lang.String r1 = r4.host
            if (r1 == 0) goto L5b
        L1d:
            java.lang.String r1 = "//"
            r0.append(r1)
            java.lang.String r1 = r4.username
            if (r1 == 0) goto L3a
            r0.append(r1)
            java.lang.String r1 = r4.password
            if (r1 == 0) goto L35
            r0.append(r2)
            java.lang.String r1 = r4.password
            r0.append(r1)
        L35:
            java.lang.String r1 = "@"
            r0.append(r1)
        L3a:
            java.lang.String r1 = r4.host
            if (r1 == 0) goto L41
            r0.append(r1)
        L41:
            int r1 = r4.port
            r3 = -1
            if (r1 == r3) goto L52
            r0.append(r2)
            int r1 = r4.port
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
        L52:
            java.lang.String r1 = r4.file
            if (r1 == 0) goto L5b
            java.lang.String r1 = "/"
            r0.append(r1)
        L5b:
            java.lang.String r1 = r4.file
            if (r1 == 0) goto L62
            r0.append(r1)
        L62:
            java.lang.String r1 = r4.ref
            if (r1 == 0) goto L70
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r4.ref
            r0.append(r1)
        L70:
            java.lang.String r0 = r0.toString()
            r4.fullURL = r0
        L76:
            java.lang.String r0 = r4.fullURL
            return r0
    }
}
