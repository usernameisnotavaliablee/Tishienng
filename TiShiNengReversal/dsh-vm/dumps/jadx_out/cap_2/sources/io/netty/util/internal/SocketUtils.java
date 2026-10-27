package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SocketUtils {














    private SocketUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.nio.channels.SocketChannel accept(java.nio.channels.ServerSocketChannel r1) throws java.io.IOException {
            io.netty.util.internal.SocketUtils$5 r0 = new io.netty.util.internal.SocketUtils$5     // Catch: java.security.PrivilegedActionException -> Lc
            r0.<init>(r1)     // Catch: java.security.PrivilegedActionException -> Lc
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> Lc
            java.nio.channels.SocketChannel r1 = (java.nio.channels.SocketChannel) r1     // Catch: java.security.PrivilegedActionException -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    public static java.net.InetAddress addressByName(java.lang.String r1) throws java.net.UnknownHostException {
            io.netty.util.internal.SocketUtils$8 r0 = new io.netty.util.internal.SocketUtils$8     // Catch: java.security.PrivilegedActionException -> Lc
            r0.<init>(r1)     // Catch: java.security.PrivilegedActionException -> Lc
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> Lc
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch: java.security.PrivilegedActionException -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.net.UnknownHostException r1 = (java.net.UnknownHostException) r1
            throw r1
    }

    public static java.util.Enumeration<java.net.InetAddress> addressesFromNetworkInterface(java.net.NetworkInterface r1) {
            io.netty.util.internal.SocketUtils$11 r0 = new io.netty.util.internal.SocketUtils$11
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.util.Enumeration r1 = (java.util.Enumeration) r1
            return r1
    }

    public static java.net.InetAddress[] allAddressesByName(java.lang.String r1) throws java.net.UnknownHostException {
            io.netty.util.internal.SocketUtils$9 r0 = new io.netty.util.internal.SocketUtils$9     // Catch: java.security.PrivilegedActionException -> Lc
            r0.<init>(r1)     // Catch: java.security.PrivilegedActionException -> Lc
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> Lc
            java.net.InetAddress[] r1 = (java.net.InetAddress[]) r1     // Catch: java.security.PrivilegedActionException -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.net.UnknownHostException r1 = (java.net.UnknownHostException) r1
            throw r1
    }

    public static void bind(java.net.Socket r1, java.net.SocketAddress r2) throws java.io.IOException {
            io.netty.util.internal.SocketUtils$2 r0 = new io.netty.util.internal.SocketUtils$2     // Catch: java.security.PrivilegedActionException -> L9
            r0.<init>(r1, r2)     // Catch: java.security.PrivilegedActionException -> L9
            java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L9
            return
        L9:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    public static void bind(java.nio.channels.DatagramChannel r1, java.net.SocketAddress r2) throws java.io.IOException {
            io.netty.util.internal.SocketUtils$6 r0 = new io.netty.util.internal.SocketUtils$6     // Catch: java.security.PrivilegedActionException -> L9
            r0.<init>(r1, r2)     // Catch: java.security.PrivilegedActionException -> L9
            java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L9
            return
        L9:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    public static void bind(java.nio.channels.SocketChannel r1, java.net.SocketAddress r2) throws java.io.IOException {
            io.netty.util.internal.SocketUtils$4 r0 = new io.netty.util.internal.SocketUtils$4     // Catch: java.security.PrivilegedActionException -> L9
            r0.<init>(r1, r2)     // Catch: java.security.PrivilegedActionException -> L9
            java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L9
            return
        L9:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    public static void connect(java.net.Socket r1, java.net.SocketAddress r2, int r3) throws java.io.IOException {
            io.netty.util.internal.SocketUtils$1 r0 = new io.netty.util.internal.SocketUtils$1     // Catch: java.security.PrivilegedActionException -> L9
            r0.<init>(r1, r2, r3)     // Catch: java.security.PrivilegedActionException -> L9
            java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L9
            return
        L9:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    public static boolean connect(java.nio.channels.SocketChannel r1, java.net.SocketAddress r2) throws java.io.IOException {
            io.netty.util.internal.SocketUtils$3 r0 = new io.netty.util.internal.SocketUtils$3     // Catch: java.security.PrivilegedActionException -> L10
            r0.<init>(r1, r2)     // Catch: java.security.PrivilegedActionException -> L10
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L10
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.security.PrivilegedActionException -> L10
            boolean r1 = r1.booleanValue()     // Catch: java.security.PrivilegedActionException -> L10
            return r1
        L10:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    public static byte[] hardwareAddressFromNetworkInterface(java.net.NetworkInterface r1) throws java.net.SocketException {
            io.netty.util.internal.SocketUtils$13 r0 = new io.netty.util.internal.SocketUtils$13     // Catch: java.security.PrivilegedActionException -> Lc
            r0.<init>(r1)     // Catch: java.security.PrivilegedActionException -> Lc
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> Lc
            byte[] r1 = (byte[]) r1     // Catch: java.security.PrivilegedActionException -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.net.SocketException r1 = (java.net.SocketException) r1
            throw r1
    }

    public static java.net.SocketAddress localSocketAddress(java.net.ServerSocket r1) {
            io.netty.util.internal.SocketUtils$7 r0 = new io.netty.util.internal.SocketUtils$7
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.net.SocketAddress r1 = (java.net.SocketAddress) r1
            return r1
    }

    public static java.net.InetAddress loopbackAddress() {
            io.netty.util.internal.SocketUtils$12 r0 = new io.netty.util.internal.SocketUtils$12
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.net.InetAddress r0 = (java.net.InetAddress) r0
            return r0
    }

    public static java.net.InetSocketAddress socketAddress(java.lang.String r1, int r2) {
            io.netty.util.internal.SocketUtils$10 r0 = new io.netty.util.internal.SocketUtils$10
            r0.<init>(r1, r2)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            return r1
    }
}
