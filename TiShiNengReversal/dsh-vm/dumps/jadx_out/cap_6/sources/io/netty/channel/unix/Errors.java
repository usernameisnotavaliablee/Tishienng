package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Errors {
    public static final int ERRNO_EAGAIN_NEGATIVE = 0;
    public static final int ERRNO_EBADF_NEGATIVE = 0;
    public static final int ERRNO_ECONNRESET_NEGATIVE = 0;
    public static final int ERRNO_EINPROGRESS_NEGATIVE = 0;
    public static final int ERRNO_ENOENT_NEGATIVE = 0;
    public static final int ERRNO_ENOTCONN_NEGATIVE = 0;
    public static final int ERRNO_EPIPE_NEGATIVE = 0;
    public static final int ERRNO_EWOULDBLOCK_NEGATIVE = 0;
    private static final java.lang.String[] ERRORS = null;
    public static final int ERROR_EALREADY_NEGATIVE = 0;
    public static final int ERROR_ECONNREFUSED_NEGATIVE = 0;
    public static final int ERROR_EISCONN_NEGATIVE = 0;
    public static final int ERROR_ENETUNREACH_NEGATIVE = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NativeConnectException extends java.net.ConnectException {
        private static final long serialVersionUID = -5532328671712318161L;
        private final int expectedErr;

        NativeConnectException(java.lang.String r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "(..) failed: "
                r0.append(r3)
                java.lang.String[] r3 = io.netty.channel.unix.Errors.access$000()
                int r1 = -r4
                r3 = r3[r1]
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                r2.expectedErr = r4
                return
        }

        int expectedErr() {
                r1 = this;
                int r0 = r1.expectedErr
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class NativeIoException extends java.io.IOException {
        private static final long serialVersionUID = 8222160204268655526L;
        private final int expectedErr;
        private final boolean fillInStackTrace;

        public NativeIoException(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r3, r0)
                return
        }

        public NativeIoException(java.lang.String r3, int r4, boolean r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "(..) failed: "
                r0.append(r3)
                java.lang.String[] r3 = io.netty.channel.unix.Errors.access$000()
                int r1 = -r4
                r3 = r3[r1]
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                r2.expectedErr = r4
                r2.fillInStackTrace = r5
                return
        }

        public int expectedErr() {
                r1 = this;
                int r0 = r1.expectedErr
                return r0
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.fillInStackTrace     // Catch: java.lang.Throwable -> Lb
                if (r0 == 0) goto Ld
                java.lang.Throwable r0 = super.fillInStackTrace()     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return r0
            Lb:
                r0 = move-exception
                goto Lf
            Ld:
                monitor-exit(r1)
                return r1
            Lf:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r0
        }
    }

    static {
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoENOENT()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_ENOENT_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoENOTCONN()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_ENOTCONN_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoEBADF()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_EBADF_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoEPIPE()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_EPIPE_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoECONNRESET()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_ECONNRESET_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoEAGAIN()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_EAGAIN_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoEWOULDBLOCK()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_EWOULDBLOCK_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errnoEINPROGRESS()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERRNO_EINPROGRESS_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errorECONNREFUSED()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERROR_ECONNREFUSED_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errorEISCONN()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERROR_EISCONN_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errorEALREADY()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERROR_EALREADY_NEGATIVE = r0
            int r0 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.errorENETUNREACH()
            int r0 = -r0
            io.netty.channel.unix.Errors.ERROR_ENETUNREACH_NEGATIVE = r0
            r0 = 512(0x200, float:7.17E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            io.netty.channel.unix.Errors.ERRORS = r0
            r0 = 0
        L5b:
            java.lang.String[] r1 = io.netty.channel.unix.Errors.ERRORS
            int r2 = r1.length
            if (r0 >= r2) goto L69
            java.lang.String r2 = io.netty.channel.unix.ErrorsStaticallyReferencedJniMethods.strError(r0)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L5b
        L69:
            return
    }

    private Errors() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String[] access$000() {
            java.lang.String[] r0 = io.netty.channel.unix.Errors.ERRORS
            return r0
    }

    public static int ioResult(java.lang.String r2, int r3) throws java.io.IOException {
            int r0 = io.netty.channel.unix.Errors.ERRNO_EAGAIN_NEGATIVE
            r1 = 0
            if (r3 == r0) goto L2e
            int r0 = io.netty.channel.unix.Errors.ERRNO_EWOULDBLOCK_NEGATIVE
            if (r3 != r0) goto La
            goto L2e
        La:
            int r0 = io.netty.channel.unix.Errors.ERRNO_EBADF_NEGATIVE
            if (r3 == r0) goto L28
            int r0 = io.netty.channel.unix.Errors.ERRNO_ENOTCONN_NEGATIVE
            if (r3 == r0) goto L22
            int r0 = io.netty.channel.unix.Errors.ERRNO_ENOENT_NEGATIVE
            if (r3 != r0) goto L1c
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            r2.<init>()
            throw r2
        L1c:
            io.netty.channel.unix.Errors$NativeIoException r0 = new io.netty.channel.unix.Errors$NativeIoException
            r0.<init>(r2, r3, r1)
            throw r0
        L22:
            java.nio.channels.NotYetConnectedException r2 = new java.nio.channels.NotYetConnectedException
            r2.<init>()
            throw r2
        L28:
            java.nio.channels.ClosedChannelException r2 = new java.nio.channels.ClosedChannelException
            r2.<init>()
            throw r2
        L2e:
            return r1
    }

    @java.lang.Deprecated
    public static int ioResult(java.lang.String r1, int r2, io.netty.channel.unix.Errors.NativeIoException r3, java.nio.channels.ClosedChannelException r4) throws java.io.IOException {
            int r0 = io.netty.channel.unix.Errors.ERRNO_EAGAIN_NEGATIVE
            if (r2 == r0) goto L2e
            int r0 = io.netty.channel.unix.Errors.ERRNO_EWOULDBLOCK_NEGATIVE
            if (r2 != r0) goto L9
            goto L2e
        L9:
            int r0 = r3.expectedErr()
            if (r2 == r0) goto L2d
            int r3 = io.netty.channel.unix.Errors.ERRNO_EBADF_NEGATIVE
            if (r2 == r3) goto L2c
            int r3 = io.netty.channel.unix.Errors.ERRNO_ENOTCONN_NEGATIVE
            if (r2 == r3) goto L26
            int r3 = io.netty.channel.unix.Errors.ERRNO_ENOENT_NEGATIVE
            if (r2 != r3) goto L21
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            r1.<init>()
            throw r1
        L21:
            io.netty.channel.unix.Errors$NativeIoException r1 = newIOException(r1, r2)
            throw r1
        L26:
            java.nio.channels.NotYetConnectedException r1 = new java.nio.channels.NotYetConnectedException
            r1.<init>()
            throw r1
        L2c:
            throw r4
        L2d:
            throw r3
        L2e:
            r1 = 0
            return r1
    }

    public static io.netty.channel.unix.Errors.NativeIoException newConnectionResetException(java.lang.String r2, int r3) {
            io.netty.channel.unix.Errors$NativeIoException r0 = new io.netty.channel.unix.Errors$NativeIoException
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.StackTraceElement[] r2 = io.netty.util.internal.EmptyArrays.EMPTY_STACK_TRACE
            r0.setStackTrace(r2)
            return r0
    }

    public static io.netty.channel.unix.Errors.NativeIoException newIOException(java.lang.String r1, int r2) {
            io.netty.channel.unix.Errors$NativeIoException r0 = new io.netty.channel.unix.Errors$NativeIoException
            r0.<init>(r1, r2)
            return r0
    }

    static void throwConnectException(java.lang.String r2, int r3) throws java.io.IOException {
            int r0 = io.netty.channel.unix.Errors.ERROR_EALREADY_NEGATIVE
            if (r3 == r0) goto L41
            int r0 = io.netty.channel.unix.Errors.ERROR_ENETUNREACH_NEGATIVE
            if (r3 == r0) goto L3b
            int r0 = io.netty.channel.unix.Errors.ERROR_EISCONN_NEGATIVE
            if (r3 == r0) goto L35
            int r0 = io.netty.channel.unix.Errors.ERRNO_ENOENT_NEGATIVE
            if (r3 != r0) goto L16
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            r2.<init>()
            throw r2
        L16:
            java.net.ConnectException r0 = new java.net.ConnectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "(..) failed: "
            r1.append(r2)
            java.lang.String[] r2 = io.netty.channel.unix.Errors.ERRORS
            int r3 = -r3
            r2 = r2[r3]
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L35:
            java.nio.channels.AlreadyConnectedException r2 = new java.nio.channels.AlreadyConnectedException
            r2.<init>()
            throw r2
        L3b:
            java.net.NoRouteToHostException r2 = new java.net.NoRouteToHostException
            r2.<init>()
            throw r2
        L41:
            java.nio.channels.ConnectionPendingException r2 = new java.nio.channels.ConnectionPendingException
            r2.<init>()
            throw r2
    }
}
