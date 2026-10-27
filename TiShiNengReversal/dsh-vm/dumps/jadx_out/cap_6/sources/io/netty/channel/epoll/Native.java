package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Native {
    public static final int EPOLLERR = 0;
    public static final int EPOLLET = 0;
    public static final int EPOLLIN = 0;
    public static final int EPOLLOUT = 0;
    public static final int EPOLLRDHUP = 0;
    public static final boolean IS_SUPPORTING_SENDMMSG = false;
    public static final boolean IS_SUPPORTING_TCP_FASTOPEN = false;
    public static final java.lang.String KERNEL_VERSION = null;
    public static final int TCP_MD5SIG_MAXKEYLEN = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.channel.epoll.Native> r0 = io.netty.channel.epoll.Native.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.epoll.Native.logger = r0
            offsetofEpollData()     // Catch: java.lang.UnsatisfiedLinkError -> Lc
            goto Lf
        Lc:
            loadNativeLibrary()
        Lf:
            io.netty.channel.unix.Socket.initialize()
            int r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.epollin()
            io.netty.channel.epoll.Native.EPOLLIN = r0
            int r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.epollout()
            io.netty.channel.epoll.Native.EPOLLOUT = r0
            int r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.epollrdhup()
            io.netty.channel.epoll.Native.EPOLLRDHUP = r0
            int r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.epollet()
            io.netty.channel.epoll.Native.EPOLLET = r0
            int r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.epollerr()
            io.netty.channel.epoll.Native.EPOLLERR = r0
            boolean r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.isSupportingSendmmsg()
            io.netty.channel.epoll.Native.IS_SUPPORTING_SENDMMSG = r0
            boolean r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.isSupportingTcpFastopen()
            io.netty.channel.epoll.Native.IS_SUPPORTING_TCP_FASTOPEN = r0
            int r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.tcpMd5SigMaxKeyLen()
            io.netty.channel.epoll.Native.TCP_MD5SIG_MAXKEYLEN = r0
            java.lang.String r0 = io.netty.channel.epoll.NativeStaticallyReferencedJniMethods.kernelVersion()
            io.netty.channel.epoll.Native.KERNEL_VERSION = r0
            return
    }

    private Native() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int epollBusyWait(io.netty.channel.unix.FileDescriptor r2, io.netty.channel.epoll.EpollEventArray r3) throws java.io.IOException {
            int r2 = r2.intValue()
            long r0 = r3.memoryAddress()
            int r3 = r3.length()
            int r2 = epollBusyWait0(r2, r0, r3)
            if (r2 < 0) goto L13
            return r2
        L13:
            java.lang.String r3 = "epoll_wait"
            io.netty.channel.unix.Errors$NativeIoException r2 = io.netty.channel.unix.Errors.newIOException(r3, r2)
            throw r2
    }

    private static native int epollBusyWait0(int r0, long r1, int r3);

    private static native int epollCreate();

    public static void epollCtlAdd(int r0, int r1, int r2) throws java.io.IOException {
            int r0 = epollCtlAdd0(r0, r1, r2)
            if (r0 < 0) goto L7
            return
        L7:
            java.lang.String r1 = "epoll_ctl"
            io.netty.channel.unix.Errors$NativeIoException r0 = io.netty.channel.unix.Errors.newIOException(r1, r0)
            throw r0
    }

    private static native int epollCtlAdd0(int r0, int r1, int r2);

    public static void epollCtlDel(int r0, int r1) throws java.io.IOException {
            int r0 = epollCtlDel0(r0, r1)
            if (r0 < 0) goto L7
            return
        L7:
            java.lang.String r1 = "epoll_ctl"
            io.netty.channel.unix.Errors$NativeIoException r0 = io.netty.channel.unix.Errors.newIOException(r1, r0)
            throw r0
    }

    private static native int epollCtlDel0(int r0, int r1);

    public static void epollCtlMod(int r0, int r1, int r2) throws java.io.IOException {
            int r0 = epollCtlMod0(r0, r1, r2)
            if (r0 < 0) goto L7
            return
        L7:
            java.lang.String r1 = "epoll_ctl"
            io.netty.channel.unix.Errors$NativeIoException r0 = io.netty.channel.unix.Errors.newIOException(r1, r0)
            throw r0
    }

    private static native int epollCtlMod0(int r0, int r1, int r2);

    public static int epollWait(io.netty.channel.unix.FileDescriptor r7, io.netty.channel.epoll.EpollEventArray r8, io.netty.channel.unix.FileDescriptor r9, int r10, int r11) throws java.io.IOException {
            int r0 = r7.intValue()
            long r1 = r8.memoryAddress()
            int r3 = r8.length()
            int r4 = r9.intValue()
            r5 = r10
            r6 = r11
            int r7 = epollWait0(r0, r1, r3, r4, r5, r6)
            if (r7 < 0) goto L19
            return r7
        L19:
            java.lang.String r8 = "epoll_wait"
            io.netty.channel.unix.Errors$NativeIoException r7 = io.netty.channel.unix.Errors.newIOException(r8, r7)
            throw r7
    }

    private static native int epollWait0(int r0, long r1, int r3, int r4, int r5, int r6);

    private static native int eventFd();

    public static native void eventFdRead(int r0);

    public static native void eventFdWrite(int r0, long r1);

    private static void loadNativeLibrary() {
            java.lang.String r0 = "os.name"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            java.util.Locale r1 = java.util.Locale.UK
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "linux"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "netty_transport_native_epoll"
            r0.append(r1)
            r2 = 95
            r0.append(r2)
            java.lang.String r2 = io.netty.util.internal.PlatformDependent.normalizedArch()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Class<io.netty.channel.epoll.Native> r2 = io.netty.channel.epoll.Native.class
            java.lang.ClassLoader r2 = io.netty.util.internal.PlatformDependent.getClassLoader(r2)
            io.netty.util.internal.NativeLibraryLoader.load(r0, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            return
        L3c:
            r3 = move-exception
            io.netty.util.internal.NativeLibraryLoader.load(r1, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L48
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.epoll.Native.logger     // Catch: java.lang.UnsatisfiedLinkError -> L48
            java.lang.String r2 = "Failed to load {}"
            r1.debug(r2, r0, r3)     // Catch: java.lang.UnsatisfiedLinkError -> L48
            return
        L48:
            r0 = move-exception
            io.netty.util.internal.ThrowableUtil.addSuppressed(r3, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only supported on Linux"
            r0.<init>(r1)
            throw r0
    }

    public static io.netty.channel.unix.FileDescriptor newEpollCreate() {
            io.netty.channel.unix.FileDescriptor r0 = new io.netty.channel.unix.FileDescriptor
            int r1 = epollCreate()
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.unix.FileDescriptor newEventFd() {
            io.netty.channel.unix.FileDescriptor r0 = new io.netty.channel.unix.FileDescriptor
            int r1 = eventFd()
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.unix.FileDescriptor newTimerFd() {
            io.netty.channel.unix.FileDescriptor r0 = new io.netty.channel.unix.FileDescriptor
            int r1 = timerFd()
            r0.<init>(r1)
            return r0
    }

    public static native int offsetofEpollData();

    static int sendmmsg(int r0, boolean r1, io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket[] r2, int r3, int r4) throws java.io.IOException {
            int r0 = sendmmsg0(r0, r1, r2, r3, r4)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.String r1 = "sendmmsg"
            int r0 = io.netty.channel.unix.Errors.ioResult(r1, r0)
            return r0
    }

    @java.lang.Deprecated
    public static int sendmmsg(int r1, io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket[] r2, int r3, int r4) throws java.io.IOException {
            boolean r0 = io.netty.channel.unix.Socket.isIPv6Preferred()
            int r1 = sendmmsg(r1, r0, r2, r3, r4)
            return r1
    }

    private static native int sendmmsg0(int r0, boolean r1, io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket[] r2, int r3, int r4);

    public static native int sizeofEpollEvent();

    public static int splice(int r0, long r1, int r3, long r4, long r6) throws java.io.IOException {
            int r0 = splice0(r0, r1, r3, r4, r6)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.String r1 = "splice"
            int r0 = io.netty.channel.unix.Errors.ioResult(r1, r0)
            return r0
    }

    private static native int splice0(int r0, long r1, int r3, long r4, long r6);

    private static native int timerFd();

    static native void timerFdRead(int r0);
}
