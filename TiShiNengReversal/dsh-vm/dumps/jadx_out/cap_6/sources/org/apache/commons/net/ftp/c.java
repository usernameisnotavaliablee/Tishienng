package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends org.apache.commons.net.ftp.b implements org.apache.commons.net.ftp.a {
    public static final java.lang.String C0 = "org.apache.commons.net.ftp.systemType";
    public static final java.lang.String D0 = "org.apache.commons.net.ftp.systemType.default";
    public static final java.lang.String E0 = "/systemType.properties";
    public static final int F0 = 0;
    public static final int G0 = 1;
    public static final int H0 = 2;
    public static final int I0 = 3;
    private static final java.util.regex.Pattern J0 = null;
    private boolean A0;
    private java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> B0;
    private int W;
    private int X;
    private int Y;
    private java.lang.String Z;
    private final java.util.Random a0;
    private int b0;
    private int c0;
    private java.net.InetAddress d0;
    private java.net.InetAddress e0;
    private java.net.InetAddress f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private boolean k0;
    private long l0;
    private org.apache.commons.net.ftp.parser.e m0;
    private int n0;
    private int o0;
    private int p0;
    private boolean q0;
    private boolean r0;
    private java.lang.String s0;
    private org.apache.commons.net.ftp.f t0;
    private java.lang.String u0;
    private org.apache.commons.net.ftp.d v0;
    private org.apache.commons.net.io.c w0;
    private long x0;
    private int y0;
    private org.apache.commons.net.ftp.c.b z0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements org.apache.commons.net.io.c {
        private final org.apache.commons.net.ftp.c a;
        private final long b;
        private final int c;
        private long d;
        private int e;

        a(org.apache.commons.net.ftp.c r3, long r4, int r6) throws java.net.SocketException {
                r2 = this;
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.d = r0
                r2.b = r4
                r2.a = r3
                int r4 = r3.G()
                r2.c = r4
                r3.V(r6)
                return
        }

        @Override // org.apache.commons.net.io.c
        public void a(org.apache.commons.net.io.CopyStreamEvent r7) {
                r6 = this;
                long r1 = r7.getTotalBytesTransferred()
                int r3 = r7.getBytesTransferred()
                long r4 = r7.getStreamSize()
                r0 = r6
                r0.c(r1, r3, r4)
                return
        }

        @Override // org.apache.commons.net.io.c
        public void c(long r3, int r5, long r6) {
                r2 = this;
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r2.d
                long r5 = r3 - r5
                long r0 = r2.b
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 <= 0) goto L1c
                org.apache.commons.net.ftp.c r5 = r2.a     // Catch: java.net.SocketTimeoutException -> L14 java.io.IOException -> L1a
                r5.e0()     // Catch: java.net.SocketTimeoutException -> L14 java.io.IOException -> L1a
                goto L1a
            L14:
                int r5 = r2.e
                int r5 = r5 + 1
                r2.e = r5
            L1a:
                r2.d = r3
            L1c:
                return
        }

        void e() throws java.io.IOException {
                r3 = this;
            L0:
                int r0 = r3.e     // Catch: java.lang.Throwable -> Le
                int r1 = r0 + (-1)
                r3.e = r1     // Catch: java.lang.Throwable -> Le
                if (r0 <= 0) goto L10
                org.apache.commons.net.ftp.c r0 = r3.a     // Catch: java.lang.Throwable -> Le
                r0.c0()     // Catch: java.lang.Throwable -> Le
                goto L0
            Le:
                r0 = move-exception
                goto L18
            L10:
                org.apache.commons.net.ftp.c r0 = r3.a
                int r1 = r3.c
                r0.V(r1)
                return
            L18:
                org.apache.commons.net.ftp.c r1 = r3.a
                int r2 = r3.c
                r1.V(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        java.lang.String resolve(java.lang.String r1) throws java.net.UnknownHostException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.apache.commons.net.ftp.c$c, reason: collision with other inner class name */
    public static class C0069c implements org.apache.commons.net.ftp.c.b {
        private org.apache.commons.net.ftp.c a;

        public C0069c(org.apache.commons.net.ftp.c r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // org.apache.commons.net.ftp.c.b
        public java.lang.String resolve(java.lang.String r3) throws java.net.UnknownHostException {
                r2 = this;
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r3)
                boolean r0 = r0.isSiteLocalAddress()
                if (r0 == 0) goto L1a
                org.apache.commons.net.ftp.c r0 = r2.a
                java.net.InetAddress r0 = r0.B()
                boolean r1 = r0.isSiteLocalAddress()
                if (r1 != 0) goto L1a
                java.lang.String r3 = r0.getHostAddress()
            L1a:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d {
        static final java.util.Properties a = null;

        static {
                java.lang.Class<org.apache.commons.net.ftp.c> r0 = org.apache.commons.net.ftp.c.class
                java.lang.String r1 = "/systemType.properties"
                java.io.InputStream r0 = r0.getResourceAsStream(r1)
                if (r0 == 0) goto L1b
                java.util.Properties r1 = new java.util.Properties
                r1.<init>()
                r1.load(r0)     // Catch: java.io.IOException -> L12 java.lang.Throwable -> L16
            L12:
                r0.close()     // Catch: java.io.IOException -> L1c
                goto L1c
            L16:
                r1 = move-exception
                r0.close()     // Catch: java.io.IOException -> L1a
            L1a:
                throw r1
            L1b:
                r1 = 0
            L1c:
                org.apache.commons.net.ftp.c.d.a = r1
                return
        }

        private d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.net.ftp.c.J0 = r0
            return
    }

    public c() {
            r2 = this;
            r2.<init>()
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.y0 = r0
            org.apache.commons.net.ftp.c$c r0 = new org.apache.commons.net.ftp.c$c
            r0.<init>(r2)
            r2.z0 = r0
            r0 = 0
            r2.A0 = r0
            r2.w1()
            r1 = -1
            r2.X = r1
            r1 = 1
            r2.k0 = r1
            org.apache.commons.net.ftp.parser.c r1 = new org.apache.commons.net.ftp.parser.c
            r1.<init>()
            r2.m0 = r1
            r1 = 0
            r2.v0 = r1
            r2.q0 = r0
            r2.r0 = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.a0 = r0
            r2.f0 = r1
            return
    }

    private java.io.OutputStream A1(org.apache.commons.net.ftp.FTPCmd r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getCommand()
            java.io.OutputStream r1 = r0.J1(r1, r2)
            return r1
    }

    private boolean E2() throws java.io.IOException {
            r8 = this;
            java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> r0 = r8.B0
            r1 = 1
            if (r0 != 0) goto L67
            int r0 = r8.s0()
            r2 = 530(0x212, float:7.43E-43)
            r3 = 0
            if (r0 != r2) goto Lf
            return r3
        Lf:
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r8.B0 = r2
            if (r0 != 0) goto L1d
            return r3
        L1d:
            java.lang.String[] r0 = r8.x0()
            int r2 = r0.length
        L22:
            if (r3 >= r2) goto L67
            r4 = r0[r3]
            java.lang.String r5 = " "
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L64
            r5 = 32
            int r5 = r4.indexOf(r5, r1)
            if (r5 <= 0) goto L41
            java.lang.String r6 = r4.substring(r1, r5)
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            goto L47
        L41:
            java.lang.String r6 = r4.substring(r1)
            java.lang.String r4 = ""
        L47:
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r5 = r6.toUpperCase(r5)
            java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> r6 = r8.B0
            java.lang.Object r6 = r6.get(r5)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L61
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> r7 = r8.B0
            r7.put(r5, r6)
        L61:
            r6.add(r4)
        L64:
            int r3 = r3 + 1
            goto L22
        L67:
            return r1
    }

    private org.apache.commons.net.ftp.k I2(org.apache.commons.net.ftp.f r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.LIST
            java.lang.String r4 = r2.n2(r4)
            java.net.Socket r4 = r2.D1(r0, r4)
            org.apache.commons.net.ftp.k r0 = new org.apache.commons.net.ftp.k
            org.apache.commons.net.ftp.d r1 = r2.v0
            r0.<init>(r3, r1)
            if (r4 != 0) goto L14
            return r0
        L14:
            java.io.InputStream r3 = r4.getInputStream()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r2.t0()     // Catch: java.lang.Throwable -> L26
            r0.h(r3, r1)     // Catch: java.lang.Throwable -> L26
            org.apache.commons.net.io.l.b(r4)
            r2.R1()
            return r0
        L26:
            r3 = move-exception
            org.apache.commons.net.io.l.b(r4)
            throw r3
    }

    private org.apache.commons.net.ftp.k J2(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MLSD
            java.net.Socket r4 = r3.D1(r0, r4)
            org.apache.commons.net.ftp.k r0 = new org.apache.commons.net.ftp.k
            org.apache.commons.net.ftp.parser.h r1 = org.apache.commons.net.ftp.parser.h.f()
            org.apache.commons.net.ftp.d r2 = r3.v0
            r0.<init>(r1, r2)
            if (r4 != 0) goto L14
            return r0
        L14:
            java.io.InputStream r1 = r4.getInputStream()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r3.t0()     // Catch: java.lang.Throwable -> L26
            r0.h(r1, r2)     // Catch: java.lang.Throwable -> L26
            org.apache.commons.net.io.l.b(r4)
            r3.R1()
            return r0
        L26:
            r0 = move-exception
            org.apache.commons.net.io.l.b(r4)
            r3.R1()
            throw r0
    }

    private int c2() {
            r3 = this;
            int r0 = r3.b0
            if (r0 <= 0) goto L18
            int r1 = r3.c0
            if (r1 < r0) goto L18
            if (r1 != r0) goto Lb
            return r1
        Lb:
            java.util.Random r2 = r3.a0
            int r1 = r1 - r0
            int r1 = r1 + 1
            int r0 = r2.nextInt(r1)
            int r1 = r3.b0
            int r0 = r0 + r1
            return r0
        L18:
            r0 = 0
            return r0
    }

    private java.io.InputStream f2(java.io.InputStream r3) {
            r2 = this;
            int r0 = r2.n0
            if (r0 <= 0) goto Lc
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            int r1 = r2.n0
            r0.<init>(r3, r1)
            return r0
        Lc:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r3)
            return r0
    }

    private java.io.OutputStream g2(java.io.OutputStream r3) {
            r2 = this;
            int r0 = r2.n0
            if (r0 <= 0) goto Lc
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            int r1 = r2.n0
            r0.<init>(r3, r1)
            return r0
        Lc:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r3)
            return r0
    }

    private java.net.InetAddress m2() {
            r1 = this;
            java.net.InetAddress r0 = r1.d0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.net.InetAddress r0 = r1.x()
            return r0
    }

    private static java.util.Properties q2() {
            java.util.Properties r0 = org.apache.commons.net.ftp.c.d.a
            return r0
    }

    private java.net.InetAddress v2() {
            r1 = this;
            java.net.InetAddress r0 = r1.e0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.net.InetAddress r0 = r1.m2()
            return r0
    }

    private void w1() {
            r4 = this;
            r0 = 0
            r4.W = r0
            r1 = 0
            r4.Z = r1
            r2 = -1
            r4.Y = r2
            r4.d0 = r1
            r4.e0 = r1
            r4.b0 = r0
            r4.c0 = r0
            r4.g0 = r0
            r0 = 7
            r4.i0 = r0
            r0 = 4
            r4.h0 = r0
            r0 = 10
            r4.j0 = r0
            r2 = 0
            r4.l0 = r2
            r4.s0 = r1
            r4.t0 = r1
            java.lang.String r0 = ""
            r4.u0 = r0
            r4.B0 = r1
            return
    }

    private org.apache.commons.net.io.c x1(org.apache.commons.net.io.c r2) {
            r1 = this;
            if (r2 != 0) goto L5
            org.apache.commons.net.io.c r2 = r1.w0
            return r2
        L5:
            org.apache.commons.net.io.c r0 = r1.w0
            if (r0 != 0) goto La
            return r2
        La:
            org.apache.commons.net.io.b r0 = new org.apache.commons.net.io.b
            r0.<init>()
            r0.e(r2)
            org.apache.commons.net.io.c r2 = r1.w0
            r0.e(r2)
            return r0
    }

    static java.lang.String y1(java.lang.String r7) {
            r0 = 4
            java.lang.String r7 = r7.substring(r0)
            java.lang.String r0 = "\""
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 1
            r3 = 1
            r4 = 0
        L16:
            int r5 = r7.length()
            if (r3 >= r5) goto L3a
            char r5 = r7.charAt(r3)
            r6 = 34
            if (r5 != r6) goto L2d
            if (r4 == 0) goto L2b
            r0.append(r5)
            r4 = 0
            goto L37
        L2b:
            r4 = 1
            goto L37
        L2d:
            if (r4 == 0) goto L34
            java.lang.String r7 = r0.toString()
            return r7
        L34:
            r0.append(r5)
        L37:
            int r3 = r3 + 1
            goto L16
        L3a:
            if (r4 == 0) goto L40
            java.lang.String r7 = r0.toString()
        L40:
            return r7
    }

    private boolean z1(org.apache.commons.net.ftp.FTPCmd r1, java.lang.String r2, java.io.InputStream r3) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getCommand()
            boolean r1 = r0.I1(r1, r2, r3)
            return r1
    }

    @java.lang.Deprecated
    public java.lang.String A2() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r2.s0
            if (r0 != 0) goto L23
            int r0 = r2.r1()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto L23
            java.util.ArrayList<java.lang.String> r0 = r2.v
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            r2.s0 = r0
        L23:
            java.lang.String r0 = r2.s0
            return r0
    }

    public boolean A3(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.q1(r2)
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto Le
            r1.i0 = r2
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    protected java.net.Socket B1(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.net.ftp.e.b(r1)
            java.net.Socket r1 = r0.C1(r1, r2)
            return r1
    }

    public java.lang.String B2() throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = r3.s0
            if (r0 != 0) goto L4a
            int r0 = r3.r1()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto L24
            java.util.ArrayList<java.lang.String> r0 = r3.v
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            r3.s0 = r0
            goto L4a
        L24:
            java.lang.String r0 = "org.apache.commons.net.ftp.systemType.default"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L2f
            r3.s0 = r0
            goto L4a
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to determine system type - response: "
            r1.append(r2)
            java.lang.String r2 = r3.w0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4a:
            java.lang.String r0 = r3.s0
            return r0
    }

    public boolean B3(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.L0(r2)
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto Le
            r1.j0 = r2
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    protected java.net.Socket C1(java.lang.String r9, java.lang.String r10) throws java.io.IOException {
            r8 = this;
            int r0 = r8.W
            r1 = 0
            if (r0 == 0) goto L9
            r2 = 2
            if (r0 == r2) goto L9
            return r1
        L9:
            java.net.InetAddress r0 = r8.B()
            boolean r0 = r0 instanceof java.net.Inet6Address
            int r2 = r8.W
            r3 = 0
            if (r2 != 0) goto L9b
            javax.net.ServerSocketFactory r2 = r8.k
            int r5 = r8.c2()
            r6 = 1
            java.net.InetAddress r7 = r8.m2()
            java.net.ServerSocket r2 = r2.createServerSocket(r5, r6, r7)
            if (r0 == 0) goto L3e
            java.net.InetAddress r0 = r8.v2()     // Catch: java.lang.Throwable -> L3c
            int r5 = r2.getLocalPort()     // Catch: java.lang.Throwable -> L3c
            int r0 = r8.q0(r0, r5)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L54
            r2.close()
            return r1
        L3c:
            r9 = move-exception
            goto L97
        L3e:
            java.net.InetAddress r0 = r8.v2()     // Catch: java.lang.Throwable -> L3c
            int r5 = r2.getLocalPort()     // Catch: java.lang.Throwable -> L3c
            int r0 = r8.R0(r0, r5)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L54
            r2.close()
            return r1
        L54:
            long r5 = r8.l0     // Catch: java.lang.Throwable -> L3c
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L64
            boolean r0 = r8.n3(r5)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L64
            r2.close()
            return r1
        L64:
            int r9 = r8.d1(r9, r10)     // Catch: java.lang.Throwable -> L3c
            boolean r9 = org.apache.commons.net.ftp.l.e(r9)     // Catch: java.lang.Throwable -> L3c
            if (r9 != 0) goto L72
            r2.close()
            return r1
        L72:
            int r9 = r8.X     // Catch: java.lang.Throwable -> L3c
            if (r9 < 0) goto L79
            r2.setSoTimeout(r9)     // Catch: java.lang.Throwable -> L3c
        L79:
            java.net.Socket r9 = r2.accept()     // Catch: java.lang.Throwable -> L3c
            int r10 = r8.X     // Catch: java.lang.Throwable -> L3c
            if (r10 < 0) goto L84
            r9.setSoTimeout(r10)     // Catch: java.lang.Throwable -> L3c
        L84:
            int r10 = r8.p0     // Catch: java.lang.Throwable -> L3c
            if (r10 <= 0) goto L8b
            r9.setReceiveBufferSize(r10)     // Catch: java.lang.Throwable -> L3c
        L8b:
            int r10 = r8.o0     // Catch: java.lang.Throwable -> L3c
            if (r10 <= 0) goto L92
            r9.setSendBufferSize(r10)     // Catch: java.lang.Throwable -> L3c
        L92:
            r2.close()
            goto L125
        L97:
            r2.close()
            throw r9
        L9b:
            boolean r2 = r8.L2()
            r5 = 0
            if (r2 != 0) goto La4
            if (r0 == 0) goto Lb8
        La4:
            int r2 = r8.r0()
            r6 = 229(0xe5, float:3.21E-43)
            if (r2 != r6) goto Lb8
            java.util.ArrayList<java.lang.String> r0 = r8.v
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r8.E1(r0)
            goto Lcf
        Lb8:
            if (r0 == 0) goto Lbb
            return r1
        Lbb:
            int r0 = r8.Q0()
            r2 = 227(0xe3, float:3.18E-43)
            if (r0 == r2) goto Lc4
            return r1
        Lc4:
            java.util.ArrayList<java.lang.String> r0 = r8.v
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r8.F1(r0)
        Lcf:
            javax.net.SocketFactory r0 = r8.j
            java.net.Socket r0 = r0.createSocket()
            int r2 = r8.p0
            if (r2 <= 0) goto Ldc
            r0.setReceiveBufferSize(r2)
        Ldc:
            int r2 = r8.o0
            if (r2 <= 0) goto Le3
            r0.setSendBufferSize(r2)
        Le3:
            java.net.InetAddress r2 = r8.f0
            if (r2 == 0) goto Lf1
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress
            java.net.InetAddress r6 = r8.f0
            r2.<init>(r6, r5)
            r0.bind(r2)
        Lf1:
            int r2 = r8.X
            if (r2 < 0) goto Lf8
            r0.setSoTimeout(r2)
        Lf8:
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress
            java.lang.String r5 = r8.Z
            int r6 = r8.Y
            r2.<init>(r5, r6)
            int r5 = r8.l
            r0.connect(r2, r5)
            long r5 = r8.l0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L116
            boolean r2 = r8.n3(r5)
            if (r2 != 0) goto L116
            r0.close()
            return r1
        L116:
            int r9 = r8.d1(r9, r10)
            boolean r9 = org.apache.commons.net.ftp.l.e(r9)
            if (r9 != 0) goto L124
            r0.close()
            return r1
        L124:
            r9 = r0
        L125:
            boolean r10 = r8.k0
            if (r10 == 0) goto L162
            boolean r10 = r8.Y(r9)
            if (r10 == 0) goto L130
            goto L162
        L130:
            r9.close()
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Host attempting data connection "
            r0.append(r1)
            java.net.InetAddress r9 = r9.getInetAddress()
            java.lang.String r9 = r9.getHostAddress()
            r0.append(r9)
            java.lang.String r9 = " is not same as server "
            r0.append(r9)
            java.net.InetAddress r9 = r8.B()
            java.lang.String r9 = r9.getHostAddress()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L162:
            return r9
    }

    public boolean C2(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.E2()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> r0 = r2.B0
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toUpperCase(r1)
            boolean r3 = r0.containsKey(r3)
            return r3
    }

    public boolean C3(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.s1(r2)
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto L11
            r1.g0 = r2
            r2 = 4
            r1.h0 = r2
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    protected java.net.Socket D1(org.apache.commons.net.ftp.FTPCmd r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getCommand()
            java.net.Socket r1 = r0.C1(r1, r2)
            return r1
    }

    public boolean D2(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.E2()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> r0 = r3.B0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toUpperCase(r2)
            java.lang.Object r4 = r0.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L1d
            boolean r4 = r4.contains(r5)
            return r4
        L1d:
            return r1
    }

    public boolean D3(int r2, int r3) throws java.io.IOException {
            r1 = this;
            int r0 = r1.t1(r2, r3)
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto L10
            r1.g0 = r2
            r1.h0 = r3
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    protected void E1(java.lang.String r7) throws org.apache.commons.net.MalformedServerReplyException {
            r6 = this;
            r0 = 40
            int r0 = r7.indexOf(r0)
            r1 = 1
            int r0 = r0 + r1
            r2 = 41
            int r2 = r7.indexOf(r2)
            java.lang.String r7 = r7.substring(r0, r2)
            java.lang.String r7 = r7.trim()
            r0 = 0
            char r0 = r7.charAt(r0)
            char r2 = r7.charAt(r1)
            r3 = 2
            char r3 = r7.charAt(r3)
            int r4 = r7.length()
            int r4 = r4 - r1
            char r4 = r7.charAt(r4)
            java.lang.String r5 = "Could not parse extended passive host information.\nServer Reply: "
            if (r0 != r2) goto L65
            if (r2 != r3) goto L65
            if (r3 != r4) goto L65
            int r0 = r7.length()     // Catch: java.lang.NumberFormatException -> L50
            int r0 = r0 - r1
            r1 = 3
            java.lang.String r0 = r7.substring(r1, r0)     // Catch: java.lang.NumberFormatException -> L50
            int r7 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L50
            java.net.InetAddress r0 = r6.B()
            java.lang.String r0 = r0.getHostAddress()
            r6.Z = r0
            r6.Y = r7
            return
        L50:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L65:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public void E3(boolean r1) {
            r0 = this;
            r0.q0 = r1
            return
    }

    protected void F1(java.lang.String r6) throws org.apache.commons.net.MalformedServerReplyException {
            r5 = this;
            java.util.regex.Pattern r0 = org.apache.commons.net.ftp.c.J0
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r1 = r0.find()
            java.lang.String r2 = "Could not parse passive host information.\nServer Reply: "
            if (r1 == 0) goto L9a
            r1 = 1
            java.lang.String r1 = r0.group(r1)
            r3 = 44
            r4 = 46
            java.lang.String r1 = r1.replace(r3, r4)
            r5.Z = r1
            r1 = 2
            java.lang.String r1 = r0.group(r1)     // Catch: java.lang.NumberFormatException -> L83
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L83
            r3 = 3
            java.lang.String r0 = r0.group(r3)     // Catch: java.lang.NumberFormatException -> L83
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L83
            int r1 = r1 << 8
            r0 = r0 | r1
            r5.Y = r0     // Catch: java.lang.NumberFormatException -> L83
            org.apache.commons.net.ftp.c$b r0 = r5.z0
            if (r0 == 0) goto L82
            java.lang.String r1 = r5.Z     // Catch: java.net.UnknownHostException -> L6d
            java.lang.String r0 = r0.resolve(r1)     // Catch: java.net.UnknownHostException -> L6d
            java.lang.String r1 = r5.Z     // Catch: java.net.UnknownHostException -> L6d
            boolean r1 = r1.equals(r0)     // Catch: java.net.UnknownHostException -> L6d
            if (r1 != 0) goto L82
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.net.UnknownHostException -> L6d
            r1.<init>()     // Catch: java.net.UnknownHostException -> L6d
            java.lang.String r3 = "[Replacing PASV mode reply address "
            r1.append(r3)     // Catch: java.net.UnknownHostException -> L6d
            java.lang.String r3 = r5.Z     // Catch: java.net.UnknownHostException -> L6d
            r1.append(r3)     // Catch: java.net.UnknownHostException -> L6d
            java.lang.String r3 = " with "
            r1.append(r3)     // Catch: java.net.UnknownHostException -> L6d
            r1.append(r0)     // Catch: java.net.UnknownHostException -> L6d
            java.lang.String r3 = "]\n"
            r1.append(r3)     // Catch: java.net.UnknownHostException -> L6d
            java.lang.String r1 = r1.toString()     // Catch: java.net.UnknownHostException -> L6d
            r3 = 0
            r5.p(r3, r1)     // Catch: java.net.UnknownHostException -> L6d
            r5.Z = r0     // Catch: java.net.UnknownHostException -> L6d
            return
        L6d:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L82:
            return
        L83:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not parse passive port information.\nServer Reply: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L9a:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public org.apache.commons.net.ftp.k F2() throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.k r0 = r1.G2(r0)
            return r0
    }

    public boolean F3(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.F0(r1, r2)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    protected boolean G1(java.lang.String r9, java.lang.String r10, java.io.OutputStream r11) throws java.io.IOException {
            r8 = this;
            java.net.Socket r9 = r8.C1(r9, r10)
            if (r9 != 0) goto L8
            r9 = 0
            return r9
        L8:
            int r10 = r8.g0
            if (r10 != 0) goto L1b
            org.apache.commons.net.io.f r10 = new org.apache.commons.net.io.f
            java.io.InputStream r0 = r9.getInputStream()
            java.io.InputStream r0 = r8.f2(r0)
            r10.<init>(r0)
        L19:
            r1 = r10
            goto L24
        L1b:
            java.io.InputStream r10 = r9.getInputStream()
            java.io.InputStream r10 = r8.f2(r10)
            goto L19
        L24:
            long r2 = r8.x0
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L34
            org.apache.commons.net.ftp.c$a r10 = new org.apache.commons.net.ftp.c$a
            int r0 = r8.y0
            r10.<init>(r8, r2, r0)
            goto L35
        L34:
            r10 = 0
        L35:
            int r3 = r8.e2()     // Catch: java.lang.Throwable -> L54
            org.apache.commons.net.io.c r6 = r8.x1(r10)     // Catch: java.lang.Throwable -> L54
            r7 = 0
            r4 = -1
            r2 = r11
            org.apache.commons.net.io.l.i(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L54
            org.apache.commons.net.io.l.a(r1)
            org.apache.commons.net.io.l.b(r9)
            if (r10 == 0) goto L4f
            r10.e()
        L4f:
            boolean r9 = r8.R1()
            return r9
        L54:
            r0 = move-exception
            r11 = r0
            org.apache.commons.net.io.l.a(r1)
            org.apache.commons.net.io.l.b(r9)
            if (r10 == 0) goto L61
            r10.e()
        L61:
            throw r11
    }

    public org.apache.commons.net.ftp.k G2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.k r2 = r1.H2(r0, r2)
            return r2
    }

    public void G3(org.apache.commons.net.ftp.parser.e r1) {
            r0 = this;
            r0.m0 = r1
            return
    }

    protected java.io.InputStream H1(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.net.Socket r2 = r1.C1(r2, r3)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r3 = r1.g0
            if (r3 != 0) goto L1a
            org.apache.commons.net.io.f r3 = new org.apache.commons.net.io.f
            java.io.InputStream r0 = r2.getInputStream()
            java.io.InputStream r0 = r1.f2(r0)
            r3.<init>(r0)
            goto L1e
        L1a:
            java.io.InputStream r3 = r2.getInputStream()
        L1e:
            org.apache.commons.net.io.h r0 = new org.apache.commons.net.io.h
            r0.<init>(r2, r3)
            return r0
    }

    public org.apache.commons.net.ftp.k H2(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            r0.v1(r1)
            org.apache.commons.net.ftp.f r1 = r0.t0
            org.apache.commons.net.ftp.k r1 = r0.I2(r1, r2)
            return r1
    }

    public void H3(java.lang.String r1) throws java.net.UnknownHostException {
            r0 = this;
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
            r0.f0 = r1
            return
    }

    protected boolean I1(java.lang.String r8, java.lang.String r9, java.io.InputStream r10) throws java.io.IOException {
            r7 = this;
            java.net.Socket r8 = r7.C1(r8, r9)
            if (r8 != 0) goto L8
            r8 = 0
            return r8
        L8:
            int r9 = r7.g0
            if (r9 != 0) goto L1b
            org.apache.commons.net.io.k r9 = new org.apache.commons.net.io.k
            java.io.OutputStream r0 = r8.getOutputStream()
            java.io.OutputStream r0 = r7.g2(r0)
            r9.<init>(r0)
        L19:
            r1 = r9
            goto L24
        L1b:
            java.io.OutputStream r9 = r8.getOutputStream()
            java.io.OutputStream r9 = r7.g2(r9)
            goto L19
        L24:
            long r2 = r7.x0
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L34
            org.apache.commons.net.ftp.c$a r9 = new org.apache.commons.net.ftp.c$a
            int r0 = r7.y0
            r9.<init>(r7, r2, r0)
            goto L35
        L34:
            r9 = 0
        L35:
            int r2 = r7.e2()     // Catch: java.io.IOException -> L54
            org.apache.commons.net.io.c r5 = r7.x1(r9)     // Catch: java.io.IOException -> L54
            r6 = 0
            r3 = -1
            r0 = r10
            org.apache.commons.net.io.l.i(r0, r1, r2, r3, r5, r6)     // Catch: java.io.IOException -> L54
            r1.close()
            r8.close()
            if (r9 == 0) goto L4f
            r9.e()
        L4f:
            boolean r8 = r7.R1()
            return r8
        L54:
            r0 = move-exception
            r10 = r0
            org.apache.commons.net.io.l.b(r8)
            if (r9 == 0) goto L5e
            r9.e()
        L5e:
            throw r10
    }

    public void I3(java.net.InetAddress r1) {
            r0 = this;
            r0.f0 = r1
            return
    }

    protected java.io.OutputStream J1(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.net.Socket r2 = r1.C1(r2, r3)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r3 = r1.g0
            if (r3 != 0) goto L1a
            org.apache.commons.net.io.k r3 = new org.apache.commons.net.io.k
            java.io.OutputStream r0 = r2.getOutputStream()
            java.io.OutputStream r0 = r1.g2(r0)
            r3.<init>(r0)
            goto L1e
        L1a:
            java.io.OutputStream r3 = r2.getOutputStream()
        L1e:
            org.apache.commons.net.io.i r0 = new org.apache.commons.net.io.i
            r0.<init>(r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public void J3(boolean r1) {
            r0 = this;
            if (r1 == 0) goto La
            org.apache.commons.net.ftp.c$c r1 = new org.apache.commons.net.ftp.c$c
            r1.<init>(r0)
            r0.z0 = r1
            return
        La:
            r1 = 0
            r0.z0 = r1
            return
    }

    public boolean K1() throws java.io.IOException {
            r1 = this;
            int r0 = r1.i0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            return r0
    }

    public boolean K2() {
            r1 = this;
            boolean r0 = r1.k0
            return r0
    }

    public void K3(org.apache.commons.net.ftp.c.b r1) {
            r0 = this;
            r0.z0 = r1
            return
    }

    public boolean L1(int r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.k0(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public boolean L2() {
            r1 = this;
            boolean r0 = r1.r0
            return r0
    }

    public void L3(int r1) {
            r0 = this;
            r0.p0 = r1
            return
    }

    public boolean M1(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.l0(r1, r2)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public org.apache.commons.net.ftp.FTPFile[] M2() throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.FTPFile[] r0 = r1.N2(r0)
            return r0
    }

    public void M3(boolean r1) {
            r0 = this;
            r0.k0 = r1
            return
    }

    public boolean N1(java.lang.String r2, java.io.InputStream r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.APPE
            boolean r2 = r1.z1(r0, r2, r3)
            return r2
    }

    public org.apache.commons.net.ftp.FTPFile[] N2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.h r0 = org.apache.commons.net.ftp.i.c
            org.apache.commons.net.ftp.FTPFile[] r2 = r1.Q2(r2, r0)
            return r2
    }

    public void N3(java.lang.String r1) throws java.net.UnknownHostException {
            r0 = this;
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
            r0.e0 = r1
            return
    }

    public java.io.OutputStream O1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.APPE
            java.io.OutputStream r2 = r1.A1(r0, r2)
            return r2
    }

    public org.apache.commons.net.ftp.FTPFile[] O2() throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.FTPFile[] r0 = r1.P2(r0)
            return r0
    }

    public void O3(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r3.l0 = r4
        L8:
            return
    }

    public boolean P1() throws java.io.IOException {
            r1 = this;
            int r0 = r1.n0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            return r0
    }

    public org.apache.commons.net.ftp.FTPFile[] P2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.k r2 = r1.H2(r0, r2)
            org.apache.commons.net.ftp.FTPFile[] r2 = r2.a()
            return r2
    }

    public void P3(int r1) {
            r0 = this;
            r0.o0 = r1
            return
    }

    public boolean Q1(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.o0(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public org.apache.commons.net.ftp.FTPFile[] Q2(java.lang.String r2, org.apache.commons.net.ftp.h r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.k r2 = r1.H2(r0, r2)
            org.apache.commons.net.ftp.FTPFile[] r2 = r2.b(r3)
            return r2
    }

    public void Q3(boolean r1) {
            r0 = this;
            r0.r0 = r1
            return
    }

    public boolean R1() throws java.io.IOException {
            r1 = this;
            int r0 = r1.u0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            return r0
    }

    public java.lang.String R2() throws java.io.IOException {
            r1 = this;
            int r0 = r1.y0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r1.w0()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public boolean R3(java.lang.String r2, java.io.InputStream r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOR
            boolean r2 = r1.z1(r0, r2, r3)
            return r2
    }

    public boolean S1(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.p0(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public java.lang.String S2(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.z0(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            if (r1 == 0) goto Lf
            java.lang.String r1 = r0.w0()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public java.io.OutputStream S3(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOR
            java.io.OutputStream r2 = r1.A1(r0, r2)
            return r2
    }

    public boolean T1(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.d1(r1, r2)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public java.lang.String[] T2() throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = r1.U2(r0)
            return r0
    }

    public boolean T3(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOU
            r1 = 0
            boolean r3 = r2.z1(r0, r1, r3)
            return r3
    }

    public java.lang.String[] U1(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.d1(r1, r2)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            if (r1 == 0) goto Lf
            java.lang.String[] r1 = r0.x0()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public java.lang.String[] U2(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.NLST
            java.lang.String r6 = r5.n2(r6)
            java.net.Socket r6 = r5.D1(r0, r6)
            r0 = 0
            if (r6 != 0) goto Le
            return r0
        Le:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r3 = r6.getInputStream()
            java.lang.String r4 = r5.t0()
            r2.<init>(r3, r4)
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L25:
            java.lang.String r3 = r1.readLine()
            if (r3 == 0) goto L2f
            r2.add(r3)
            goto L25
        L2f:
            r1.close()
            r6.close()
            boolean r6 = r5.R1()
            if (r6 == 0) goto L48
            int r6 = r2.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r2.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        L48:
            return r0
    }

    public boolean U3(java.lang.String r2, java.io.InputStream r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOU
            boolean r2 = r1.z1(r0, r2, r3)
            return r2
    }

    public void V1() {
            r1 = this;
            r0 = 0
            r1.W = r0
            r0 = 0
            r1.Z = r0
            r0 = -1
            r1.Y = r0
            return
    }

    public boolean V2(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            r0.u1(r1)
            int r1 = r0.u
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            if (r1 == 0) goto Ld
            r1 = 1
            return r1
        Ld:
            int r1 = r0.u
            boolean r1 = org.apache.commons.net.ftp.l.d(r1)
            if (r1 != 0) goto L17
            r1 = 0
            return r1
        L17:
            int r1 = r0.P0(r2)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public java.io.OutputStream V3() throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOU
            r1 = 0
            java.io.OutputStream r0 = r2.A1(r0, r1)
            return r0
    }

    public void W1() {
            r1 = this;
            r0 = 2
            r1.W = r0
            r0 = 0
            r1.Z = r0
            r0 = -1
            r1.Y = r0
            return
    }

    public boolean W2(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            r2.u1(r3)
            int r3 = r2.u
            boolean r3 = org.apache.commons.net.ftp.l.c(r3)
            r0 = 1
            if (r3 == 0) goto Ld
            return r0
        Ld:
            int r3 = r2.u
            boolean r3 = org.apache.commons.net.ftp.l.d(r3)
            r1 = 0
            if (r3 != 0) goto L17
            return r1
        L17:
            r2.P0(r4)
            int r3 = r2.u
            boolean r3 = org.apache.commons.net.ftp.l.c(r3)
            if (r3 == 0) goto L23
            return r0
        L23:
            int r3 = r2.u
            boolean r3 = org.apache.commons.net.ftp.l.d(r3)
            if (r3 != 0) goto L2c
            return r1
        L2c:
            int r3 = r2.j0(r5)
            boolean r3 = org.apache.commons.net.ftp.l.c(r3)
            return r3
    }

    public java.io.OutputStream W3(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.STOU
            java.io.OutputStream r2 = r1.A1(r0, r2)
            return r2
    }

    public boolean X1(java.net.InetAddress r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.R0(r1, r2)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            if (r1 == 0) goto L14
            r1 = 1
            r0.W = r1
            r2 = 0
            r0.Z = r2
            r2 = -1
            r0.Y = r2
            return r1
        L14:
            r1 = 0
            return r1
    }

    public boolean X2() throws java.io.IOException {
            r1 = this;
            int r0 = r1.T0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            return r0
    }

    public boolean X3(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.k1(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public boolean Y1() throws java.io.IOException {
            r3 = this;
            int r0 = r3.Q0()
            r1 = 227(0xe3, float:3.18E-43)
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            r0 = 3
            r3.W = r0
            java.util.ArrayList<java.lang.String> r0 = r3.v
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.F1(r0)
            r0 = 1
            return r0
    }

    public boolean Y2(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.G0(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public java.lang.String Z1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String[] r2 = r1.a2(r2)
            if (r2 == 0) goto La
            r0 = 0
            r2 = r2[r0]
            return r2
        La:
            r2 = 0
            return r2
    }

    public org.apache.commons.net.ftp.FTPFile Z2(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.E0(r3)
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto L29
            java.lang.String[] r0 = r2.x0()
            r1 = 0
            r0 = r0[r1]
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            org.apache.commons.net.ftp.FTPFile r1 = new org.apache.commons.net.ftp.FTPFile
            r1.<init>()
            r1.setName(r3)
            r1.setRawListing(r0)
            java.util.Calendar r3 = org.apache.commons.net.ftp.parser.h.h(r0)
            r1.setTimestamp(r3)
            return r1
        L29:
            r3 = 0
            return r3
    }

    public java.lang.String[] a2(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.E2()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> r0 = r3.B0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toUpperCase(r2)
            java.lang.Object r4 = r0.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L25
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
        L25:
            return r1
    }

    public org.apache.commons.net.ftp.FTPFile[] a3() throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.commons.net.ftp.FTPFile[] r0 = r1.b3(r0)
            return r0
    }

    @Override // org.apache.commons.net.ftp.b, org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.h0(r0)
            return
    }

    public boolean b2() throws java.io.IOException {
            r1 = this;
            int r0 = r1.s0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            return r0
    }

    public org.apache.commons.net.ftp.FTPFile[] b3(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.net.ftp.k r1 = r0.J2(r1)
            org.apache.commons.net.ftp.FTPFile[] r1 = r1.a()
            return r1
    }

    @Override // org.apache.commons.net.ftp.a
    public void c(org.apache.commons.net.ftp.d r1) {
            r0 = this;
            r0.v0 = r1
            return
    }

    public org.apache.commons.net.ftp.FTPFile[] c3(java.lang.String r1, org.apache.commons.net.ftp.h r2) throws java.io.IOException {
            r0 = this;
            org.apache.commons.net.ftp.k r1 = r0.J2(r1)
            org.apache.commons.net.ftp.FTPFile[] r1 = r1.b(r2)
            return r1
    }

    public boolean d2() {
            r1 = this;
            boolean r0 = r1.A0
            return r0
    }

    public org.apache.commons.net.ftp.FTPFile d3(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.MLST
            int r4 = r3.f1(r0, r4)
            boolean r4 = org.apache.commons.net.ftp.l.c(r4)
            if (r4 == 0) goto L48
            java.lang.String[] r4 = r3.x0()
            r0 = 1
            r4 = r4[r0]
            int r1 = r4.length()
            r2 = 3
            if (r1 < r2) goto L2c
            r1 = 0
            char r1 = r4.charAt(r1)
            r2 = 32
            if (r1 != r2) goto L2c
            java.lang.String r4 = r4.substring(r0)
            org.apache.commons.net.ftp.FTPFile r4 = org.apache.commons.net.ftp.parser.h.g(r4)
            return r4
        L2c:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid server reply (MLST): '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "'"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L48:
            r4 = 0
            return r4
    }

    public int e2() {
            r1 = this;
            int r0 = r1.n0
            return r0
    }

    public java.lang.String e3() throws java.io.IOException {
            r2 = this;
            int r0 = r2.S0()
            r1 = 257(0x101, float:3.6E-43)
            if (r0 == r1) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList<java.lang.String> r0 = r2.v
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = y1(r0)
            return r0
    }

    public boolean f3() throws java.io.IOException {
            r1 = this;
            r1.U0()
            int r0 = r1.u
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 != 0) goto L20
            int r0 = r1.u
            boolean r0 = org.apache.commons.net.ftp.l.e(r0)
            if (r0 == 0) goto L1e
            int r0 = r1.u0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            return r0
        L20:
            r1.w1()
            r0 = 1
            return r0
    }

    public boolean g3(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.W
            r1 = 1
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r3 = 0
            return r3
        Lb:
            int r3 = r2.m0(r3)
            boolean r3 = org.apache.commons.net.ftp.l.e(r3)
            return r3
    }

    @Override // org.apache.commons.net.ftp.b
    protected void h0(java.io.Reader r6) throws java.io.IOException {
            r5 = this;
            super.h0(r6)
            r5.w1()
            boolean r6 = r5.A0
            if (r6 == 0) goto L59
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r0 = r5.v
            r6.<init>(r0)
            int r0 = r5.u
            java.lang.String r1 = "UTF8"
            boolean r1 = r5.C2(r1)
            java.lang.String r2 = "UTF-8"
            if (r1 != 0) goto L23
            boolean r1 = r5.C2(r2)
            if (r1 == 0) goto L4a
        L23:
            r5.g1(r2)
            org.apache.commons.net.io.a r1 = new org.apache.commons.net.io.a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r3 = r5.h
            java.lang.String r4 = r5.t0()
            r2.<init>(r3, r4)
            r1.<init>(r2)
            r5.C = r1
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            java.io.OutputStream r3 = r5.i
            java.lang.String r4 = r5.t0()
            r2.<init>(r3, r4)
            r1.<init>(r2)
            r5.D = r1
        L4a:
            java.util.ArrayList<java.lang.String> r1 = r5.v
            r1.clear()
            java.util.ArrayList<java.lang.String> r1 = r5.v
            r1.addAll(r6)
            r5.u = r0
            r6 = 1
            r5.w = r6
        L59:
            return
    }

    public int h2() {
            r1 = this;
            int r0 = r1.y0
            return r0
    }

    public boolean h3(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.W
            r1 = 1
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r3 = 0
            return r3
        Lb:
            int r3 = r2.W0(r3)
            boolean r3 = org.apache.commons.net.ftp.l.e(r3)
            return r3
    }

    public long i2() {
            r4 = this;
            long r0 = r4.x0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            return r0
    }

    public boolean i3(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.W
            r1 = 1
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r3 = 0
            return r3
        Lb:
            int r3 = r2.n1(r3)
            boolean r3 = org.apache.commons.net.ftp.l.e(r3)
            return r3
    }

    public org.apache.commons.net.io.c j2() {
            r1 = this;
            org.apache.commons.net.io.c r0 = r1.w0
            return r0
    }

    public boolean j3() throws java.io.IOException {
            r2 = this;
            int r0 = r2.W
            r1 = 1
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            int r0 = r2.o1()
            boolean r0 = org.apache.commons.net.ftp.l.e(r0)
            return r0
    }

    public int k2() {
            r1 = this;
            int r0 = r1.W
            return r0
    }

    public boolean k3(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.W
            r1 = 1
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r3 = 0
            return r3
        Lb:
            int r3 = r2.p1(r3)
            boolean r3 = org.apache.commons.net.ftp.l.e(r3)
            return r3
    }

    org.apache.commons.net.ftp.f l2() {
            r1 = this;
            org.apache.commons.net.ftp.f r0 = r1.t0
            return r0
    }

    public boolean l3(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.X0(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public boolean m3(java.lang.String r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.Y0(r1)
            boolean r1 = org.apache.commons.net.ftp.l.d(r1)
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            int r1 = r0.Z0(r2)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    @Override // org.apache.commons.net.ftp.b, org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r0 = this;
            super.n()
            r0.w1()
            return
    }

    protected java.lang.String n2(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.o2()
            if (r0 == 0) goto L22
            if (r3 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r1 = r1 + 3
            r0.<init>(r1)
            java.lang.String r1 = "-a "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L20:
            java.lang.String r3 = "-a"
        L22:
            return r3
    }

    protected boolean n3(long r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.l0 = r0
            java.lang.String r3 = java.lang.Long.toString(r3)
            int r3 = r2.V0(r3)
            boolean r3 = org.apache.commons.net.ftp.l.d(r3)
            return r3
    }

    public boolean o2() {
            r1 = this;
            boolean r0 = r1.q0
            return r0
    }

    public boolean o3(java.lang.String r2, java.io.OutputStream r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.RETR
            java.lang.String r0 = r0.getCommand()
            boolean r2 = r1.G1(r0, r2, r3)
            return r2
    }

    public java.lang.String p2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            int r2 = r1.E0(r2)
            boolean r2 = org.apache.commons.net.ftp.l.c(r2)
            if (r2 == 0) goto L17
            java.lang.String[] r2 = r1.x0()
            r0 = 0
            r2 = r2[r0]
            r0 = 4
            java.lang.String r2 = r2.substring(r0)
            return r2
        L17:
            r2 = 0
            return r2
    }

    public java.io.InputStream p3(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.FTPCmd r0 = org.apache.commons.net.ftp.FTPCmd.RETR
            java.lang.String r0 = r0.getCommand()
            java.io.InputStream r2 = r1.H1(r0, r2)
            return r2
    }

    public boolean q3() throws java.io.IOException {
            r1 = this;
            int r0 = r1.O0()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            return r0
    }

    public java.lang.String r2() {
            r1 = this;
            java.lang.String r0 = r1.Z
            return r0
    }

    public boolean r3(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.j1(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            return r1
    }

    public java.net.InetAddress s2() {
            r1 = this;
            java.net.InetAddress r0 = r1.f0
            return r0
    }

    public void s3(java.lang.String r1) throws java.net.UnknownHostException {
            r0 = this;
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
            r0.d0 = r1
            return
    }

    public int t2() {
            r1 = this;
            int r0 = r1.Y
            return r0
    }

    public void t3(int r1, int r2) {
            r0 = this;
            r0.b0 = r1
            r0.c0 = r2
            return
    }

    public int u2() {
            r1 = this;
            int r0 = r1.p0
            return r0
    }

    public void u3(boolean r1) {
            r0 = this;
            r0.A0 = r1
            return
    }

    void v1(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.net.ftp.f r0 = r3.t0
            if (r0 == 0) goto L10
            if (r4 == 0) goto Lf
            java.lang.String r0 = r3.u0
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            if (r4 == 0) goto L1d
            org.apache.commons.net.ftp.parser.e r0 = r3.m0
            org.apache.commons.net.ftp.f r0 = r0.a(r4)
            r3.t0 = r0
            r3.u0 = r4
            return
        L1d:
            org.apache.commons.net.ftp.d r4 = r3.v0
            if (r4 == 0) goto L3e
            java.lang.String r4 = r4.e()
            int r4 = r4.length()
            if (r4 <= 0) goto L3e
            org.apache.commons.net.ftp.parser.e r4 = r3.m0
            org.apache.commons.net.ftp.d r0 = r3.v0
            org.apache.commons.net.ftp.f r4 = r4.b(r0)
            r3.t0 = r4
            org.apache.commons.net.ftp.d r4 = r3.v0
            java.lang.String r4 = r4.e()
            r3.u0 = r4
            return
        L3e:
            java.lang.String r4 = "org.apache.commons.net.ftp.systemType"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            if (r4 != 0) goto L57
            java.lang.String r4 = r3.B2()
            java.util.Properties r0 = q2()
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.getProperty(r4)
            if (r0 == 0) goto L57
            r4 = r0
        L57:
            org.apache.commons.net.ftp.d r0 = r3.v0
            if (r0 == 0) goto L6b
            org.apache.commons.net.ftp.parser.e r0 = r3.m0
            org.apache.commons.net.ftp.d r1 = new org.apache.commons.net.ftp.d
            org.apache.commons.net.ftp.d r2 = r3.v0
            r1.<init>(r4, r2)
            org.apache.commons.net.ftp.f r0 = r0.b(r1)
            r3.t0 = r0
            goto L73
        L6b:
            org.apache.commons.net.ftp.parser.e r0 = r3.m0
            org.apache.commons.net.ftp.f r0 = r0.a(r4)
            r3.t0 = r0
        L73:
            r3.u0 = r4
            return
    }

    public void v3(int r1) {
            r0 = this;
            r0.n0 = r1
            return
    }

    public long w2() {
            r2 = this;
            long r0 = r2.l0
            return r0
    }

    public void w3(int r1) {
            r0 = this;
            r0.y0 = r1
            return
    }

    public int x2() {
            r1 = this;
            int r0 = r1.o0
            return r0
    }

    public void x3(long r3) {
            r2 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            r2.x0 = r3
            return
    }

    public java.lang.String y2() throws java.io.IOException {
            r1 = this;
            int r0 = r1.l1()
            boolean r0 = org.apache.commons.net.ftp.l.c(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r1.w0()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public void y3(org.apache.commons.net.io.c r1) {
            r0 = this;
            r0.w0 = r1
            return
    }

    public java.lang.String z2(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.m1(r1)
            boolean r1 = org.apache.commons.net.ftp.l.c(r1)
            if (r1 == 0) goto Lf
            java.lang.String r1 = r0.w0()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public void z3(int r1) {
            r0 = this;
            r0.X = r1
            return
    }
}
