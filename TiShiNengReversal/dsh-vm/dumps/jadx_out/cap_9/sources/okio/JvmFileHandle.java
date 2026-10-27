package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class JvmFileHandle extends okio.FileHandle {

    @org.jetbrains.annotations.NotNull
    private final java.io.RandomAccessFile randomAccessFile;

    public JvmFileHandle(boolean r2, @org.jetbrains.annotations.NotNull java.io.RandomAccessFile r3) {
            r1 = this;
            java.lang.String r0 = "randomAccessFile"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.randomAccessFile = r3
            return
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized void protectedFlush() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> Lc
            java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.lang.Throwable -> Lc
            r0.sync()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized int protectedRead(long r2, @org.jetbrains.annotations.NotNull byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r4, r0)     // Catch: java.lang.Throwable -> L1f
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L1f
            r0.seek(r2)     // Catch: java.lang.Throwable -> L1f
            r2 = 0
        Lc:
            if (r2 >= r6) goto L21
            java.io.RandomAccessFile r3 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L1f
            int r0 = r6 - r2
            int r3 = r3.read(r4, r5, r0)     // Catch: java.lang.Throwable -> L1f
            r0 = -1
            if (r3 != r0) goto L1d
            if (r2 != 0) goto L21
            monitor-exit(r1)
            return r0
        L1d:
            int r2 = r2 + r3
            goto Lc
        L1f:
            r2 = move-exception
            goto L23
        L21:
            monitor-exit(r1)
            return r2
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    @Override // okio.FileHandle
    protected synchronized void protectedResize(long r8) {
            r7 = this;
            monitor-enter(r7)
            long r2 = r7.size()     // Catch: java.lang.Throwable -> L19
            long r0 = r8 - r2
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1c
            int r6 = (int) r0     // Catch: java.lang.Throwable -> L19
            byte[] r4 = new byte[r6]     // Catch: java.lang.Throwable -> L19
            r5 = 0
            r1 = r7
            r1.protectedWrite(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r0 = move-exception
        L17:
            r8 = r0
            goto L24
        L19:
            r0 = move-exception
            r1 = r7
            goto L17
        L1c:
            r1 = r7
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L16
            r0.setLength(r8)     // Catch: java.lang.Throwable -> L16
        L22:
            monitor-exit(r7)
            return
        L24:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L16
            throw r8
    }

    @Override // okio.FileHandle
    protected synchronized long protectedSize() {
            r2 = this;
            monitor-enter(r2)
            java.io.RandomAccessFile r0 = r2.randomAccessFile     // Catch: java.lang.Throwable -> L9
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized void protectedWrite(long r2, @org.jetbrains.annotations.NotNull byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r4, r0)     // Catch: java.lang.Throwable -> L12
            java.io.RandomAccessFile r0 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L12
            r0.seek(r2)     // Catch: java.lang.Throwable -> L12
            java.io.RandomAccessFile r2 = r1.randomAccessFile     // Catch: java.lang.Throwable -> L12
            r2.write(r4, r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }
}
