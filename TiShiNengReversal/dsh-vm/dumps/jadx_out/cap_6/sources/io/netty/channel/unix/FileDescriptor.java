package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FileDescriptor {
    private static final int STATE_ALL_MASK = 7;
    private static final int STATE_CLOSED_MASK = 1;
    private static final int STATE_INPUT_SHUTDOWN_MASK = 2;
    private static final int STATE_OUTPUT_SHUTDOWN_MASK = 4;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.unix.FileDescriptor> stateUpdater = null;
    final int fd;
    volatile int state;

    static {
            java.lang.Class<io.netty.channel.unix.FileDescriptor> r0 = io.netty.channel.unix.FileDescriptor.class
            java.lang.String r1 = "state"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.channel.unix.FileDescriptor.stateUpdater = r0
            return
    }

    public FileDescriptor(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "fd"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.fd = r2
            return
    }

    private static native int close(int r0);

    public static io.netty.channel.unix.FileDescriptor from(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.io.File r1 = (java.io.File) r1
            java.lang.String r1 = r1.getPath()
            io.netty.channel.unix.FileDescriptor r1 = from(r1)
            return r1
    }

    public static io.netty.channel.unix.FileDescriptor from(java.lang.String r1) throws java.io.IOException {
            java.lang.String r0 = "path"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            int r1 = open(r1)
            if (r1 < 0) goto L11
            io.netty.channel.unix.FileDescriptor r0 = new io.netty.channel.unix.FileDescriptor
            r0.<init>(r1)
            return r0
        L11:
            java.lang.String r0 = "open"
            io.netty.channel.unix.Errors$NativeIoException r1 = io.netty.channel.unix.Errors.newIOException(r0, r1)
            throw r1
    }

    static int inputShutdown(int r0) {
            r0 = r0 | 2
            return r0
    }

    static boolean isClosed(int r1) {
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L5
            return r0
        L5:
            r1 = 0
            return r1
    }

    static boolean isInputShutdown(int r0) {
            r0 = r0 & 2
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    static boolean isOutputShutdown(int r0) {
            r0 = r0 & 4
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static native long newPipe();

    private static native int open(java.lang.String r0);

    static int outputShutdown(int r0) {
            r0 = r0 | 4
            return r0
    }

    public static io.netty.channel.unix.FileDescriptor[] pipe() throws java.io.IOException {
            long r0 = newPipe()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L24
            io.netty.channel.unix.FileDescriptor r2 = new io.netty.channel.unix.FileDescriptor
            r3 = 32
            long r3 = r0 >>> r3
            int r4 = (int) r3
            r2.<init>(r4)
            io.netty.channel.unix.FileDescriptor r3 = new io.netty.channel.unix.FileDescriptor
            int r1 = (int) r0
            r3.<init>(r1)
            r0 = 2
            io.netty.channel.unix.FileDescriptor[] r0 = new io.netty.channel.unix.FileDescriptor[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            return r0
        L24:
            java.lang.String r2 = "newPipe"
            int r1 = (int) r0
            io.netty.channel.unix.Errors$NativeIoException r0 = io.netty.channel.unix.Errors.newIOException(r2, r1)
            throw r0
    }

    private static native int read(int r0, java.nio.ByteBuffer r1, int r2, int r3);

    private static native int readAddress(int r0, long r1, int r3, int r4);

    private static native int write(int r0, java.nio.ByteBuffer r1, int r2, int r3);

    private static native int writeAddress(int r0, long r1, int r3, int r4);

    private static native long writev(int r0, java.nio.ByteBuffer[] r1, int r2, int r3, long r4);

    private static native long writevAddresses(int r0, long r1, int r3);

    final boolean casState(int r2, int r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.unix.FileDescriptor> r0 = io.netty.channel.unix.FileDescriptor.stateUpdater
            boolean r2 = r0.compareAndSet(r1, r2, r3)
            return r2
    }

    public void close() throws java.io.IOException {
            r2 = this;
        L0:
            int r0 = r2.state
            boolean r1 = isClosed(r0)
            if (r1 == 0) goto L9
            goto L19
        L9:
            r1 = r0 | 7
            boolean r0 = r2.casState(r0, r1)
            if (r0 == 0) goto L0
            int r0 = r2.fd
            int r0 = close(r0)
            if (r0 < 0) goto L1a
        L19:
            return
        L1a:
            java.lang.String r1 = "close"
            io.netty.channel.unix.Errors$NativeIoException r0 = io.netty.channel.unix.Errors.newIOException(r1, r0)
            throw r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof io.netty.channel.unix.FileDescriptor
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r3.fd
            io.netty.channel.unix.FileDescriptor r4 = (io.netty.channel.unix.FileDescriptor) r4
            int r4 = r4.fd
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.fd
            return r0
    }

    public final int intValue() {
            r1 = this;
            int r0 = r1.fd
            return r0
    }

    public boolean isOpen() {
            r1 = this;
            int r0 = r1.state
            boolean r0 = isClosed(r0)
            r0 = r0 ^ 1
            return r0
    }

    public final int read(java.nio.ByteBuffer r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r2 = read(r0, r2, r3, r4)
            if (r2 <= 0) goto L9
            return r2
        L9:
            if (r2 != 0) goto Ld
            r2 = -1
            return r2
        Ld:
            java.lang.String r3 = "read"
            int r2 = io.netty.channel.unix.Errors.ioResult(r3, r2)
            return r2
    }

    public final int readAddress(long r2, int r4, int r5) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r2 = readAddress(r0, r2, r4, r5)
            if (r2 <= 0) goto L9
            return r2
        L9:
            if (r2 != 0) goto Ld
            r2 = -1
            return r2
        Ld:
            java.lang.String r3 = "readAddress"
            int r2 = io.netty.channel.unix.Errors.ioResult(r3, r2)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FileDescriptor{fd="
            r0.append(r1)
            int r1 = r2.fd
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int write(java.nio.ByteBuffer r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r2 = write(r0, r2, r3, r4)
            if (r2 < 0) goto L9
            return r2
        L9:
            java.lang.String r3 = "write"
            int r2 = io.netty.channel.unix.Errors.ioResult(r3, r2)
            return r2
    }

    public final int writeAddress(long r2, int r4, int r5) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r2 = writeAddress(r0, r2, r4, r5)
            if (r2 < 0) goto L9
            return r2
        L9:
            java.lang.String r3 = "writeAddress"
            int r2 = io.netty.channel.unix.Errors.ioResult(r3, r2)
            return r2
    }

    public final long writev(java.nio.ByteBuffer[] r7, int r8, int r9, long r10) throws java.io.IOException {
            r6 = this;
            int r0 = r6.fd
            int r1 = io.netty.channel.unix.Limits.IOV_MAX
            int r3 = java.lang.Math.min(r1, r9)
            r1 = r7
            r2 = r8
            r4 = r10
            long r7 = writev(r0, r1, r2, r3, r4)
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L16
            return r7
        L16:
            java.lang.String r9 = "writev"
            int r8 = (int) r7
            int r7 = io.netty.channel.unix.Errors.ioResult(r9, r8)
            long r7 = (long) r7
            return r7
    }

    public final long writevAddresses(long r3, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.fd
            long r3 = writevAddresses(r0, r3, r5)
            r0 = 0
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto Ld
            return r3
        Ld:
            java.lang.String r5 = "writevAddresses"
            int r4 = (int) r3
            int r3 = io.netty.channel.unix.Errors.ioResult(r5, r4)
            long r3 = (long) r3
            return r3
    }
}
