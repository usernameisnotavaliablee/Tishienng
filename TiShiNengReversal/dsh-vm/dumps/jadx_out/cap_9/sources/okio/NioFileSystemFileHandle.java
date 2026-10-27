package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class NioFileSystemFileHandle extends okio.FileHandle {

    @org.jetbrains.annotations.NotNull
    private final java.nio.channels.FileChannel fileChannel;

    public NioFileSystemFileHandle(boolean r2, @org.jetbrains.annotations.NotNull java.nio.channels.FileChannel r3) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.fileChannel = r3
            return
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L8
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
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.force(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized int protectedRead(long r2, @org.jetbrains.annotations.NotNull byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r4, r0)     // Catch: java.lang.Throwable -> L21
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L21
            r0.position(r2)     // Catch: java.lang.Throwable -> L21
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L10:
            if (r3 >= r6) goto L23
            java.nio.channels.FileChannel r4 = r1.fileChannel     // Catch: java.lang.Throwable -> L21
            int r4 = r4.read(r2)     // Catch: java.lang.Throwable -> L21
            r5 = -1
            if (r4 != r5) goto L1f
            if (r3 != 0) goto L23
            monitor-exit(r1)
            return r5
        L1f:
            int r3 = r3 + r4
            goto L10
        L21:
            r2 = move-exception
            goto L25
        L23:
            monitor-exit(r1)
            return r3
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
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
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L16
            r0.truncate(r8)     // Catch: java.lang.Throwable -> L16
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
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> L9
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L9
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
            kotlin.jvm.internal.g0.p(r4, r0)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L16
            r0.position(r2)     // Catch: java.lang.Throwable -> L16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r3 = r1.fileChannel     // Catch: java.lang.Throwable -> L16
            r3.write(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }
}
