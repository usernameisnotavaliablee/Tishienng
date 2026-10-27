package com.sun.mail.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class f {
    private static final int g = 110;
    private static final java.lang.String h = "\r\n";
    private static char[] i;
    private java.net.Socket a;
    private java.io.DataInputStream b;
    private java.io.PrintWriter c;
    private boolean d;
    private java.io.PrintStream e;
    private java.lang.String f;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.sun.mail.pop3.f.i = r0
            return
    }

    f(java.lang.String r5, int r6, boolean r7, java.io.PrintStream r8, java.util.Properties r9, java.lang.String r10, boolean r11) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f = r0
            r4.d = r7
            r4.e = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r10)
            r1.<init>(r2)
            java.lang.String r2 = ".apop.enable"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r9.getProperty(r1)
            r2 = 1
            if (r1 == 0) goto L2d
            java.lang.String r3 = "true"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            r3 = -1
            if (r6 != r3) goto L33
            r6 = 110(0x6e, float:1.54E-43)
        L33:
            if (r7 == 0) goto L3b
            r8.getClass()     // Catch: java.io.IOException -> L39
            goto L3b
        L39:
            r5 = move-exception
            goto La6
        L3b:
            java.net.Socket r5 = com.sun.mail.util.SocketFetcher.getSocket(r5, r6, r9, r10, r11)     // Catch: java.io.IOException -> L39
            r4.a = r5     // Catch: java.io.IOException -> L39
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.io.IOException -> L39
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L39
            java.net.Socket r9 = r4.a     // Catch: java.io.IOException -> L39
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.io.IOException -> L39
            r6.<init>(r9)     // Catch: java.io.IOException -> L39
            r5.<init>(r6)     // Catch: java.io.IOException -> L39
            r4.b = r5     // Catch: java.io.IOException -> L39
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch: java.io.IOException -> L39
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch: java.io.IOException -> L39
            java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L39
            java.net.Socket r10 = r4.a     // Catch: java.io.IOException -> L39
            java.io.OutputStream r10 = r10.getOutputStream()     // Catch: java.io.IOException -> L39
            java.lang.String r11 = "iso-8859-1"
            r9.<init>(r10, r11)     // Catch: java.io.IOException -> L39
            r6.<init>(r9)     // Catch: java.io.IOException -> L39
            r5.<init>(r6)     // Catch: java.io.IOException -> L39
            r4.c = r5     // Catch: java.io.IOException -> L39
            com.sun.mail.pop3.g r5 = r4.k(r0)     // Catch: java.io.IOException -> L39
            boolean r6 = r5.a
            if (r6 == 0) goto L99
            if (r1 == 0) goto L98
            java.lang.String r6 = r5.b
            r9 = 60
            int r6 = r6.indexOf(r9)
            java.lang.String r9 = r5.b
            r10 = 62
            int r9 = r9.indexOf(r10, r6)
            if (r6 == r3) goto L93
            if (r9 == r3) goto L93
            java.lang.String r5 = r5.b
            int r9 = r9 + r2
            java.lang.String r5 = r5.substring(r6, r9)
            r4.f = r5
        L93:
            if (r7 == 0) goto L98
            r8.getClass()
        L98:
            return
        L99:
            java.net.Socket r5 = r4.a     // Catch: java.lang.Throwable -> L9e
            r5.close()     // Catch: java.lang.Throwable -> L9e
        L9e:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Connect failed"
            r5.<init>(r6)
            throw r5
        La6:
            java.net.Socket r6 = r4.a     // Catch: java.lang.Throwable -> Lab
            r6.close()     // Catch: java.lang.Throwable -> Lab
        Lab:
            throw r5
    }

    private java.lang.String b(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "iso-8859-1"
            byte[] r4 = r4.getBytes(r2)     // Catch: java.lang.Throwable -> L28
            byte[] r4 = r1.digest(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = m(r4)
            return r4
        L28:
            return r0
    }

    private com.sun.mail.pop3.g f(java.lang.String r4, int r5) throws java.io.IOException {
            r3 = this;
            com.sun.mail.pop3.g r4 = r3.k(r4)
            boolean r0 = r4.a
            if (r0 != 0) goto L9
            return r4
        L9:
            com.sun.mail.pop3.h r0 = new com.sun.mail.pop3.h
            r0.<init>(r5)
            r5 = 10
            r1 = 10
        L12:
            java.io.DataInputStream r2 = r3.b
            int r2 = r2.read()
            if (r2 >= 0) goto L1b
            goto L4c
        L1b:
            if (r1 != r5) goto L5d
            r1 = 46
            if (r2 != r1) goto L5d
            boolean r1 = r3.d
            if (r1 == 0) goto L2a
            java.io.PrintStream r1 = r3.e
            r1.write(r2)
        L2a:
            java.io.DataInputStream r1 = r3.b
            int r1 = r1.read()
            r2 = 13
            if (r1 != r2) goto L5e
            boolean r5 = r3.d
            if (r5 == 0) goto L3d
            java.io.PrintStream r5 = r3.e
            r5.write(r1)
        L3d:
            java.io.DataInputStream r5 = r3.b
            int r2 = r5.read()
            boolean r5 = r3.d
            if (r5 == 0) goto L4c
            java.io.PrintStream r5 = r3.e
            r5.write(r2)
        L4c:
            if (r2 < 0) goto L55
            java.io.InputStream r5 = r0.a()
            r4.c = r5
            return r4
        L55:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "EOF on socket"
            r4.<init>(r5)
            throw r4
        L5d:
            r1 = r2
        L5e:
            r0.write(r1)
            boolean r2 = r3.d
            if (r2 == 0) goto L12
            java.io.PrintStream r2 = r3.e
            r2.write(r1)
            goto L12
    }

    private com.sun.mail.pop3.g k(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.net.Socket r0 = r3.a
            if (r0 == 0) goto L89
            if (r4 == 0) goto L27
            boolean r0 = r3.d
            if (r0 == 0) goto Lf
            java.io.PrintStream r0 = r3.e
            r0.getClass()
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r4 = "\r\n"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.io.PrintWriter r0 = r3.c
            r0.print(r4)
            java.io.PrintWriter r4 = r3.c
            r4.flush()
        L27:
            java.io.DataInputStream r4 = r3.b
            java.lang.String r4 = r4.readLine()
            if (r4 != 0) goto L40
            boolean r4 = r3.d
            if (r4 == 0) goto L38
            java.io.PrintStream r4 = r3.e
            r4.getClass()
        L38:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r0 = "EOF on socket"
            r4.<init>(r0)
            throw r4
        L40:
            boolean r0 = r3.d
            if (r0 == 0) goto L49
            java.io.PrintStream r0 = r3.e
            r0.getClass()
        L49:
            com.sun.mail.pop3.g r0 = new com.sun.mail.pop3.g
            r0.<init>()
            java.lang.String r1 = "+OK"
            boolean r1 = r4.startsWith(r1)
            r2 = 1
            if (r1 == 0) goto L5a
            r0.a = r2
            goto L65
        L5a:
            java.lang.String r1 = "-ERR"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L75
            r1 = 0
            r0.a = r1
        L65:
            r1 = 32
            int r1 = r4.indexOf(r1)
            if (r1 < 0) goto L74
            int r1 = r1 + r2
            java.lang.String r4 = r4.substring(r1)
            r0.b = r4
        L74:
            return r0
        L75:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected response: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L89:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Folder is closed"
            r4.<init>(r0)
            throw r4
    }

    private static java.lang.String m(byte[] r7) {
            int r0 = r7.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 0
        L7:
            int r3 = r7.length
            if (r1 < r3) goto L10
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            return r7
        L10:
            r3 = r7[r1]
            r4 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r2 + 1
            char[] r6 = com.sun.mail.pop3.f.i
            int r4 = r4 >> 4
            char r4 = r6[r4]
            r0[r2] = r4
            int r2 = r2 + 2
            r3 = r3 & 15
            char r3 = r6[r3]
            r0[r5] = r3
            int r1 = r1 + 1
            goto L7
    }

    synchronized boolean a(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "DELE "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r0.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L17
            com.sun.mail.pop3.g r3 = r2.k(r3)     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r3
        L17:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    synchronized int c(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "LIST "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r0.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.pop3.g r3 = r2.k(r3)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r3.a     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            java.lang.String r0 = r3.b     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            java.util.StringTokenizer r0 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r3 = r3.b     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r0.nextToken()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r3 = r0.nextToken()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            goto L31
        L2e:
            r3 = move-exception
            goto L33
        L30:
            r3 = -1
        L31:
            monitor-exit(r2)
            return r3
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
    }

    synchronized java.io.InputStream d() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "LIST"
            r1 = 128(0x80, float:1.8E-43)
            com.sun.mail.pop3.g r0 = r2.f(r0, r1)     // Catch: java.lang.Throwable -> Ld
            java.io.InputStream r0 = r0.c     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    synchronized java.lang.String e(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.f     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.String r0 = r3.b(r5)     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r4 = move-exception
            goto L6f
        Ld:
            r0 = r1
        Le:
            java.lang.String r2 = r3.f     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L2f
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "APOP "
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            r5.append(r4)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = " "
            r5.append(r4)     // Catch: java.lang.Throwable -> Lb
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> Lb
            com.sun.mail.pop3.g r4 = r3.k(r4)     // Catch: java.lang.Throwable -> Lb
            goto L60
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "USER "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            r0.append(r4)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> Lb
            com.sun.mail.pop3.g r4 = r3.k(r4)     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r4.a     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L4e
            java.lang.String r4 = r4.b     // Catch: java.lang.Throwable -> Lb
            if (r4 == 0) goto L4a
            goto L4c
        L4a:
            java.lang.String r4 = "USER command failed"
        L4c:
            monitor-exit(r3)
            return r4
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "PASS "
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lb
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb
            com.sun.mail.pop3.g r4 = r3.k(r4)     // Catch: java.lang.Throwable -> Lb
        L60:
            boolean r5 = r4.a     // Catch: java.lang.Throwable -> Lb
            if (r5 != 0) goto L6d
            java.lang.String r4 = r4.b     // Catch: java.lang.Throwable -> Lb
            if (r4 == 0) goto L69
            goto L6b
        L69:
            java.lang.String r4 = "login failed"
        L6b:
            monitor-exit(r3)
            return r4
        L6d:
            monitor-exit(r3)
            return r1
        L6f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            super.finalize()
            java.net.Socket r0 = r1.a
            if (r0 == 0) goto La
            r1.h()
        La:
            return
    }

    synchronized boolean g() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "NOOP"
            com.sun.mail.pop3.g r0 = r1.k(r0)     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.a     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    synchronized boolean h() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.lang.String r1 = "QUIT"
            com.sun.mail.pop3.g r1 = r3.k(r1)     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.a     // Catch: java.lang.Throwable -> L21
            java.net.Socket r2 = r3.a     // Catch: java.lang.Throwable -> L19
            r2.close()     // Catch: java.lang.Throwable -> L19
            r3.a = r0     // Catch: java.lang.Throwable -> L17
            r3.b = r0     // Catch: java.lang.Throwable -> L17
            r3.c = r0     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return r1
        L17:
            r0 = move-exception
            goto L36
        L19:
            r1 = move-exception
            r3.a = r0     // Catch: java.lang.Throwable -> L17
            r3.b = r0     // Catch: java.lang.Throwable -> L17
            r3.c = r0     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L21:
            r1 = move-exception
            java.net.Socket r2 = r3.a     // Catch: java.lang.Throwable -> L2e
            r2.close()     // Catch: java.lang.Throwable -> L2e
            r3.a = r0     // Catch: java.lang.Throwable -> L17
            r3.b = r0     // Catch: java.lang.Throwable -> L17
            r3.c = r0     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L2e:
            r1 = move-exception
            r3.a = r0     // Catch: java.lang.Throwable -> L17
            r3.b = r0     // Catch: java.lang.Throwable -> L17
            r3.c = r0     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    synchronized java.io.InputStream i(int r3, int r4) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "RETR "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r0.append(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L17
            com.sun.mail.pop3.g r3 = r2.f(r3, r4)     // Catch: java.lang.Throwable -> L17
            java.io.InputStream r3 = r3.c     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r3
        L17:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    synchronized boolean j() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "RSET"
            com.sun.mail.pop3.g r0 = r1.k(r0)     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.a     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    synchronized com.sun.mail.pop3.i l() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "STAT"
            com.sun.mail.pop3.g r0 = r3.k(r0)     // Catch: java.lang.Throwable -> L30
            com.sun.mail.pop3.i r1 = new com.sun.mail.pop3.i     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            boolean r2 = r0.a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            java.lang.String r2 = r0.b     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            java.util.StringTokenizer r2 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.String r0 = r2.nextToken()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r1.a = r0     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.String r0 = r2.nextToken()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r1.b = r0     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            goto L32
        L30:
            r0 = move-exception
            goto L34
        L32:
            monitor-exit(r3)
            return r1
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    synchronized java.io.InputStream n(int r3, int r4) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "TOP "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r0.append(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = " "
            r0.append(r3)     // Catch: java.lang.Throwable -> L20
            r0.append(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L20
            r4 = 0
            com.sun.mail.pop3.g r3 = r2.f(r3, r4)     // Catch: java.lang.Throwable -> L20
            java.io.InputStream r3 = r3.c     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return r3
        L20:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    synchronized java.lang.String o(int r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "UIDL "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            com.sun.mail.pop3.g r4 = r3.k(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r4.a     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 != 0) goto L1a
            monitor-exit(r3)
            return r1
        L1a:
            java.lang.String r0 = r4.b     // Catch: java.lang.Throwable -> L2e
            r2 = 32
            int r0 = r0.indexOf(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 <= 0) goto L30
            java.lang.String r4 = r4.b     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return r4
        L2e:
            r4 = move-exception
            goto L32
        L30:
            monitor-exit(r3)
            return r1
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r4
    }

    synchronized boolean p(java.lang.String[] r7) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "UIDL"
            int r1 = r7.length     // Catch: java.lang.Throwable -> L48
            int r1 = r1 * 15
            com.sun.mail.pop3.g r0 = r6.f(r0, r1)     // Catch: java.lang.Throwable -> L48
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L48
            r2 = 0
            if (r1 != 0) goto L11
            monitor-exit(r6)
            return r2
        L11:
            com.sun.mail.util.LineInputStream r1 = new com.sun.mail.util.LineInputStream     // Catch: java.lang.Throwable -> L48
            java.io.InputStream r0 = r0.c     // Catch: java.lang.Throwable -> L48
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L48
        L18:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L48
            r3 = 1
            if (r0 != 0) goto L21
            monitor-exit(r6)
            return r3
        L21:
            r4 = 32
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L48
            if (r4 < r3) goto L18
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L48
            if (r4 < r3) goto L30
            goto L18
        L30:
            java.lang.String r3 = r0.substring(r2, r4)     // Catch: java.lang.Throwable -> L48
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L48
            if (r3 <= 0) goto L18
            int r5 = r7.length     // Catch: java.lang.Throwable -> L48
            if (r3 > r5) goto L18
            int r3 = r3 + (-1)
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)     // Catch: java.lang.Throwable -> L48
            r7[r3] = r0     // Catch: java.lang.Throwable -> L48
            goto L18
        L48:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
    }
}
