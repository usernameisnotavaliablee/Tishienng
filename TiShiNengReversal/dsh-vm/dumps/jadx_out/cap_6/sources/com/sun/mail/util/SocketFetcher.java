package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocketFetcher {


    private SocketFetcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void configureSSLSocket(java.net.Socket r2, java.util.Properties r3, java.lang.String r4) {
            boolean r0 = r2 instanceof javax.net.ssl.SSLSocket
            if (r0 != 0) goto L5
            goto L50
        L5:
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r0.<init>(r1)
            java.lang.String r1 = ".ssl.protocols"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r0 = r3.getProperty(r0, r1)
            if (r0 == 0) goto L28
            java.lang.String[] r0 = stringArray(r0)
            r2.setEnabledProtocols(r0)
            goto L31
        L28:
            java.lang.String r0 = "TLSv1"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r2.setEnabledProtocols(r0)
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.<init>(r4)
            java.lang.String r4 = ".ssl.ciphersuites"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r3 = r3.getProperty(r4, r1)
            if (r3 == 0) goto L50
            java.lang.String[] r3 = stringArray(r3)
            r2.setEnabledCipherSuites(r3)
        L50:
            return
    }

    private static java.net.Socket createSocket(java.net.InetAddress r0, int r1, java.lang.String r2, int r3, int r4, javax.net.SocketFactory r5, boolean r6) throws java.io.IOException {
            if (r5 == 0) goto L7
            java.net.Socket r5 = r5.createSocket()
            goto L17
        L7:
            if (r6 == 0) goto L12
            javax.net.SocketFactory r5 = javax.net.ssl.SSLSocketFactory.getDefault()
            java.net.Socket r5 = r5.createSocket()
            goto L17
        L12:
            java.net.Socket r5 = new java.net.Socket
            r5.<init>()
        L17:
            if (r0 == 0) goto L21
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress
            r6.<init>(r0, r1)
            r5.bind(r6)
        L21:
            if (r4 < 0) goto L2c
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2, r3)
            r5.connect(r0, r4)
            return r5
        L2c:
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2, r3)
            r5.connect(r0)
            return r5
    }

    private static java.lang.ClassLoader getContextClassLoader() {
            com.sun.mail.util.SocketFetcher$1 r0 = new com.sun.mail.util.SocketFetcher$1
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            return r0
    }

    public static java.net.Socket getSocket(java.lang.String r1, int r2, java.util.Properties r3, java.lang.String r4) throws java.io.IOException {
            r0 = 0
            java.net.Socket r1 = getSocket(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.net.Socket getSocket(java.lang.String r15, int r16, java.util.Properties r17, java.lang.String r18, boolean r19) throws java.io.IOException {
            if (r18 != 0) goto L6
            java.lang.String r0 = "socket"
            r1 = r0
            goto L8
        L6:
            r1 = r18
        L8:
            if (r17 != 0) goto L11
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r2 = r0
            goto L13
        L11:
            r2 = r17
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r3 = ".connectiontimeout"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 0
            java.lang.String r0 = r2.getProperty(r0, r3)
            r4 = -1
            if (r0 == 0) goto L30
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2f
            r9 = r0
            goto L31
        L2f:
        L30:
            r9 = -1
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r5 = ".timeout"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r12 = r2.getProperty(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r5 = ".localaddress"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r2.getProperty(r0, r3)
            if (r0 == 0) goto L5d
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)
            r5 = r0
            goto L5e
        L5d:
            r5 = r3
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r6 = ".localport"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r2.getProperty(r0, r3)
            r6 = 0
            if (r0 == 0) goto L78
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7a
            r6 = r0
        L78:
            r0 = 0
            goto L7c
        L7a:
            goto L78
        L7c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            java.lang.String r8 = ".socketFactory.fallback"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r2.getProperty(r7, r3)
            if (r7 == 0) goto L9a
            java.lang.String r8 = "false"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L9a
            r13 = 0
            goto L9c
        L9a:
            r0 = 1
            r13 = 1
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r7 = ".socketFactory.class"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r14 = r2.getProperty(r0, r3)
            javax.net.SocketFactory r10 = getSocketFactory(r14)     // Catch: java.lang.Exception -> Lcd java.net.SocketTimeoutException -> L149
            if (r10 == 0) goto L12c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcd java.net.SocketTimeoutException -> L149
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lcd java.net.SocketTimeoutException -> L149
            java.lang.String r7 = ".socketFactory.port"
            r0.append(r7)     // Catch: java.lang.Exception -> Lcd java.net.SocketTimeoutException -> L149
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lcd java.net.SocketTimeoutException -> L149
            java.lang.String r0 = r2.getProperty(r0, r3)     // Catch: java.lang.Exception -> Lcd java.net.SocketTimeoutException -> L149
            if (r0 == 0) goto Ld1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> Lcd java.lang.NumberFormatException -> Ld0 java.net.SocketTimeoutException -> L149
            goto Ld2
        Lcd:
            r0 = move-exception
            r8 = -1
            goto Le2
        Ld0:
        Ld1:
            r0 = -1
        Ld2:
            if (r0 != r4) goto Lda
            r8 = r16
        Ld6:
            r7 = r15
            r11 = r19
            goto Ldc
        Lda:
            r8 = r0
            goto Ld6
        Ldc:
            java.net.Socket r3 = createSocket(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Le1 java.net.SocketTimeoutException -> L149
            goto L12c
        Le1:
            r0 = move-exception
        Le2:
            if (r13 != 0) goto L12c
            boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto Lf6
            r1 = r0
            java.lang.reflect.InvocationTargetException r1 = (java.lang.reflect.InvocationTargetException) r1
            java.lang.Throwable r1 = r1.getTargetException()
            boolean r2 = r1 instanceof java.lang.Exception
            if (r2 == 0) goto Lf6
            r0 = r1
            java.lang.Exception r0 = (java.lang.Exception) r0
        Lf6:
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 == 0) goto Lfd
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        Lfd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Couldn't connect using \""
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r3 = "\" socket factory to host, port: "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r15 = ", "
            r2.append(r15)
            r2.append(r8)
            java.lang.String r15 = "; Exception: "
            r2.append(r15)
            r2.append(r0)
            java.lang.String r15 = r2.toString()
            r1.<init>(r15)
            r1.initCause(r0)
            throw r1
        L12c:
            if (r3 != 0) goto L138
            r10 = 0
            r7 = r15
            r8 = r16
            r11 = r19
            java.net.Socket r3 = createSocket(r5, r6, r7, r8, r9, r10, r11)
        L138:
            if (r12 == 0) goto L140
            int r4 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.NumberFormatException -> L13f
            goto L140
        L13f:
        L140:
            if (r4 < 0) goto L145
            r3.setSoTimeout(r4)
        L145:
            configureSSLSocket(r3, r2, r1)
            return r3
        L149:
            r0 = move-exception
            r15 = r0
            throw r15
    }

    private static javax.net.SocketFactory getSocketFactory(java.lang.String r2) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r0 = 0
            if (r2 == 0) goto L2f
            int r1 = r2.length()
            if (r1 != 0) goto La
            goto L2f
        La:
            java.lang.ClassLoader r1 = getContextClassLoader()
            if (r1 == 0) goto L16
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L17
        L15:
        L16:
            r1 = r0
        L17:
            if (r1 != 0) goto L1d
            java.lang.Class r1 = java.lang.Class.forName(r2)
        L1d:
            java.lang.String r2 = "getDefault"
            java.lang.reflect.Method r2 = r1.getMethod(r2, r0)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            java.lang.Object r2 = r2.invoke(r1, r0)
            javax.net.SocketFactory r2 = (javax.net.SocketFactory) r2
            return r2
        L2f:
            return r0
    }

    public static java.net.Socket startTLS(java.net.Socket r2) throws java.io.IOException {
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "socket"
            java.net.Socket r2 = startTLS(r2, r0, r1)
            return r2
    }

    public static java.net.Socket startTLS(java.net.Socket r4, java.util.Properties r5, java.lang.String r6) throws java.io.IOException {
            java.net.InetAddress r0 = r4.getInetAddress()
            java.lang.String r0 = r0.getHostName()
            int r1 = r4.getPort()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L30
            r2.<init>(r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = ".socketFactory.class"
            r2.append(r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L30
            r3 = 0
            java.lang.String r2 = r5.getProperty(r2, r3)     // Catch: java.lang.Exception -> L30
            javax.net.SocketFactory r2 = getSocketFactory(r2)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L32
            boolean r3 = r2 instanceof javax.net.ssl.SSLSocketFactory     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L32
            javax.net.ssl.SSLSocketFactory r2 = (javax.net.ssl.SSLSocketFactory) r2     // Catch: java.lang.Exception -> L30
            goto L38
        L30:
            r4 = move-exception
            goto L41
        L32:
            javax.net.SocketFactory r2 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch: java.lang.Exception -> L30
            javax.net.ssl.SSLSocketFactory r2 = (javax.net.ssl.SSLSocketFactory) r2     // Catch: java.lang.Exception -> L30
        L38:
            r3 = 1
            java.net.Socket r4 = r2.createSocket(r4, r0, r1, r3)     // Catch: java.lang.Exception -> L30
            configureSSLSocket(r4, r5, r6)     // Catch: java.lang.Exception -> L30
            return r4
        L41:
            boolean r5 = r4 instanceof java.lang.reflect.InvocationTargetException
            if (r5 == 0) goto L53
            r5 = r4
            java.lang.reflect.InvocationTargetException r5 = (java.lang.reflect.InvocationTargetException) r5
            java.lang.Throwable r5 = r5.getTargetException()
            boolean r6 = r5 instanceof java.lang.Exception
            if (r6 == 0) goto L53
            r4 = r5
            java.lang.Exception r4 = (java.lang.Exception) r4
        L53:
            boolean r5 = r4 instanceof java.io.IOException
            if (r5 == 0) goto L5a
            java.io.IOException r4 = (java.io.IOException) r4
            throw r4
        L5a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in startTLS: host "
            r6.<init>(r2)
            r6.append(r0)
            java.lang.String r0 = ", port "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "; Exception: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            r5.initCause(r4)
            throw r5
    }

    private static java.lang.String[] stringArray(java.lang.String r2) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        La:
            boolean r1 = r0.hasMoreTokens()
            if (r1 != 0) goto L1d
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
        L1d:
            java.lang.String r1 = r0.nextToken()
            r2.add(r1)
            goto La
    }
}
