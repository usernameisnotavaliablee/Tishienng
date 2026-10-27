package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends org.apache.commons.net.ftp.c {
    private static final byte[] Q0 = null;
    private final java.lang.String K0;
    private final int L0;
    private final java.lang.String M0;
    private final java.lang.String N0;
    private final org.apache.commons.net.util.a O0;
    private java.lang.String P0;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            org.apache.commons.net.ftp.j.Q0 = r0
            return
    }

    public j(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public j(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            org.apache.commons.net.util.a r0 = new org.apache.commons.net.util.a
            r0.<init>()
            r1.O0 = r0
            r1.K0 = r2
            r1.L0 = r3
            r1.M0 = r4
            r1.N0 = r5
            r2 = 0
            r1.P0 = r2
            return
    }

    private java.io.BufferedReader Y3(java.lang.String r5, int r6, java.io.InputStream r7, java.io.OutputStream r8) throws java.io.IOException, java.io.UnsupportedEncodingException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CONNECT "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r2 = " HTTP/1.1"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Host: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r4.P0 = r5
            java.lang.String r5 = "UTF-8"
            byte[] r0 = r0.getBytes(r5)
            r8.write(r0)
            byte[] r0 = org.apache.commons.net.ftp.j.Q0
            r8.write(r0)
            byte[] r6 = r6.getBytes(r5)
            r8.write(r6)
            r8.write(r0)
            java.lang.String r6 = r4.M0
            if (r6 == 0) goto L8f
            java.lang.String r6 = r4.N0
            if (r6 == 0) goto L8f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r4.M0
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = r4.N0
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Proxy-Authorization: Basic "
            r1.append(r2)
            org.apache.commons.net.util.a r2 = r4.O0
            byte[] r6 = r6.getBytes(r5)
            java.lang.String r6 = r2.v(r6)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            byte[] r5 = r6.getBytes(r5)
            r8.write(r5)
        L8f:
            r8.write(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r8 = new java.io.InputStreamReader
            java.nio.charset.Charset r0 = r4.q()
            r8.<init>(r7, r0)
            r6.<init>(r8)
            java.lang.String r7 = r6.readLine()
        La9:
            if (r7 == 0) goto Lb9
            int r8 = r7.length()
            if (r8 <= 0) goto Lb9
            r5.add(r7)
            java.lang.String r7 = r6.readLine()
            goto La9
        Lb9:
            int r7 = r5.size()
            if (r7 == 0) goto L12e
            r7 = 0
            java.lang.Object r7 = r5.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "HTTP/"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L117
            int r8 = r7.length()
            r0 = 12
            if (r8 < r0) goto L117
            r8 = 9
            java.lang.String r7 = r7.substring(r8, r0)
            java.lang.String r8 = "200"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L116
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTPTunnelConnector: connection failed\r\n"
            r6.append(r7)
            java.lang.String r7 = "Response received from the proxy:\r\n"
            r6.append(r7)
            java.util.Iterator r5 = r5.iterator()
        Lf7:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L10c
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            java.lang.String r7 = "\r\n"
            r6.append(r7)
            goto Lf7
        L10c:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L116:
            return r6
        L117:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Invalid response from proxy: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L12e:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "No response from proxy"
            r5.<init>(r6)
            throw r5
    }

    @Override // org.apache.commons.net.ftp.c
    @java.lang.Deprecated
    protected java.net.Socket B1(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.net.Socket r1 = super.B1(r1, r2)
            return r1
    }

    @Override // org.apache.commons.net.ftp.c
    protected java.net.Socket C1(java.lang.String r9, java.lang.String r10) throws java.io.IOException {
            r8 = this;
            int r0 = r8.k2()
            r1 = 2
            if (r0 != r1) goto L88
            java.net.InetAddress r0 = r8.B()
            boolean r0 = r0 instanceof java.net.Inet6Address
            boolean r1 = r8.L2()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L17
            if (r0 == 0) goto L2d
        L17:
            int r1 = r8.r0()
            r4 = 229(0xe5, float:3.21E-43)
            if (r1 != r4) goto L2d
            java.util.ArrayList<java.lang.String> r0 = r8.v
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r8.E1(r0)
            java.lang.String r0 = r8.P0
            goto L48
        L2d:
            if (r0 == 0) goto L30
            return r3
        L30:
            int r0 = r8.Q0()
            r1 = 227(0xe3, float:3.18E-43)
            if (r0 == r1) goto L39
            return r3
        L39:
            java.util.ArrayList<java.lang.String> r0 = r8.v
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r8.F1(r0)
            java.lang.String r0 = r8.r2()
        L48:
            javax.net.SocketFactory r1 = r8.j
            java.lang.String r2 = r8.K0
            int r4 = r8.L0
            java.net.Socket r1 = r1.createSocket(r2, r4)
            java.io.InputStream r2 = r1.getInputStream()
            java.io.OutputStream r4 = r1.getOutputStream()
            int r5 = r8.t2()
            r8.Y3(r0, r5, r2, r4)
            long r4 = r8.w2()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L79
            long r4 = r8.w2()
            boolean r0 = r8.n3(r4)
            if (r0 != 0) goto L79
            r1.close()
            return r3
        L79:
            int r9 = r8.d1(r9, r10)
            boolean r9 = org.apache.commons.net.ftp.l.e(r9)
            if (r9 != 0) goto L87
            r1.close()
            return r3
        L87:
            return r1
        L88:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Only passive connection mode supported"
            r9.<init>(r10)
            throw r9
    }

    @Override // org.apache.commons.net.g
    public void h(java.lang.String r5, int r6) throws java.net.SocketException, java.io.IOException {
            r4 = this;
            javax.net.SocketFactory r0 = r4.j
            java.lang.String r1 = r4.K0
            int r2 = r4.L0
            java.net.Socket r0 = r0.createSocket(r1, r2)
            r4.e = r0
            java.io.InputStream r0 = r0.getInputStream()
            r4.h = r0
            java.net.Socket r0 = r4.e
            java.io.OutputStream r0 = r0.getOutputStream()
            r4.i = r0
            java.io.InputStream r1 = r4.h     // Catch: java.lang.Exception -> L24
            java.io.BufferedReader r5 = r4.Y3(r5, r6, r1, r0)     // Catch: java.lang.Exception -> L24
            super.h0(r5)
            return
        L24:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not connect to "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " using port "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            r1.initCause(r0)
            throw r1
    }
}
