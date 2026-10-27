package androidx.room.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FileLock {

    @org.jetbrains.annotations.Nullable
    private java.nio.channels.FileChannel lockChannel;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String lockFilename;

    public FileLock(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "filename"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ".lck"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.lockFilename = r2
            return
    }

    public final void lock() {
            r4 = this;
            java.nio.channels.FileChannel r0 = r4.lockChannel
            if (r0 == 0) goto L5
            goto L28
        L5:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r4.lockFilename     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            java.io.File r1 = r0.getParentFile()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            r1.mkdirs()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L29
        L18:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L16
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L16
            r4.lockChannel = r0     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L28
            r0.lock()     // Catch: java.lang.Throwable -> L16
        L28:
            return
        L29:
            java.nio.channels.FileChannel r1 = r4.lockChannel
            if (r1 == 0) goto L30
            r1.close()
        L30:
            r1 = 0
            r4.lockChannel = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to lock file: '"
            r2.append(r3)
            java.lang.String r3 = r4.lockFilename
            r2.append(r3)
            java.lang.String r3 = "'."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    public final void unlock() {
            r2 = this;
            java.nio.channels.FileChannel r0 = r2.lockChannel
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Lc
            r2.lockChannel = r1
            return
        Lc:
            r0 = move-exception
            r2.lockChannel = r1
            throw r0
    }
}
