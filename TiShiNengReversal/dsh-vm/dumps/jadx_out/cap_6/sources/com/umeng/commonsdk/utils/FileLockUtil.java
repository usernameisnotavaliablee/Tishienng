package com.umeng.commonsdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FileLockUtil {
    private final java.lang.Object lockObject;

    public FileLockUtil() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lockObject = r0
            return
    }

    private static java.nio.channels.FileLock getFileLock(java.lang.String r3) {
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "rw"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L13
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.lang.Throwable -> L13
            java.nio.channels.FileLock r3 = r3.lock()     // Catch: java.lang.Throwable -> L11
            return r3
        L11:
            goto L15
        L13:
            r3 = r0
        L15:
            if (r3 == 0) goto L1a
            r3.close()     // Catch: java.io.IOException -> L1a
        L1a:
            return r0
    }

    public void doFileOperateion(java.io.File r3, com.umeng.commonsdk.utils.FileLockCallback r4) {
            r2 = this;
            boolean r0 = r3.exists()
            if (r0 != 0) goto L7
            goto L39
        L7:
            java.lang.Object r0 = r2.lockObject
            monitor-enter(r0)
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L26
            java.nio.channels.FileLock r1 = getFileLock(r1)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L38
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L34
            r4.onFileLock(r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L34
            r1.release()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
        L1e:
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
            r3.close()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
            goto L38
        L26:
            r3 = move-exception
            goto L3a
        L28:
            r3 = move-exception
            r1.release()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L33
            java.nio.channels.FileChannel r4 = r1.channel()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L33
            r4.close()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L33
        L33:
            throw r3     // Catch: java.lang.Throwable -> L26
        L34:
            r1.release()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
            goto L1e
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
        L39:
            return
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r3
    }

    public void doFileOperateion(java.io.File r3, com.umeng.commonsdk.utils.FileLockCallback r4, int r5) {
            r2 = this;
            boolean r0 = r3.exists()
            if (r0 != 0) goto L7
            goto L35
        L7:
            java.lang.Object r0 = r2.lockObject
            monitor-enter(r0)
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L2e
            java.nio.channels.FileLock r1 = getFileLock(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L34
            r4.onFileLock(r3, r5)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L30
            r1.release()     // Catch: java.lang.Throwable -> L34
        L1a:
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch: java.lang.Throwable -> L34
            r3.close()     // Catch: java.lang.Throwable -> L34
            goto L34
        L22:
            r3 = move-exception
            r1.release()     // Catch: java.lang.Throwable -> L2d
            java.nio.channels.FileChannel r4 = r1.channel()     // Catch: java.lang.Throwable -> L2d
            r4.close()     // Catch: java.lang.Throwable -> L2d
        L2d:
            throw r3     // Catch: java.lang.Throwable -> L2e
        L2e:
            r3 = move-exception
            goto L36
        L30:
            r1.release()     // Catch: java.lang.Throwable -> L34
            goto L1a
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
        L35:
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r3
    }

    public void doFileOperateion(java.io.File r3, com.umeng.commonsdk.utils.FileLockCallback r4, java.lang.Object r5) {
            r2 = this;
            boolean r0 = r3.exists()
            if (r0 != 0) goto L7
            goto L39
        L7:
            java.lang.Object r0 = r2.lockObject
            monitor-enter(r0)
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L26
            java.nio.channels.FileLock r1 = getFileLock(r1)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L38
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L34
            r4.onFileLock(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L34
            r1.release()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
        L1e:
            java.nio.channels.FileChannel r3 = r1.channel()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
            r3.close()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
            goto L38
        L26:
            r3 = move-exception
            goto L3a
        L28:
            r3 = move-exception
            r1.release()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L33
            java.nio.channels.FileChannel r4 = r1.channel()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L33
            r4.close()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L33
        L33:
            throw r3     // Catch: java.lang.Throwable -> L26
        L34:
            r1.release()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L38
            goto L1e
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
        L39:
            return
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r3
    }

    public void doFileOperateion(java.lang.String r3, com.umeng.commonsdk.utils.FileLockCallback r4) {
            r2 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lc
            goto L3a
        Lc:
            java.lang.Object r1 = r2.lockObject
            monitor-enter(r1)
            java.nio.channels.FileLock r3 = getFileLock(r3)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L39
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L35
            r4.onFileLock(r0)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L35
            r3.release()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L39
        L1f:
            java.nio.channels.FileChannel r3 = r3.channel()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L39
            r3.close()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L39
            goto L39
        L27:
            r3 = move-exception
            goto L3b
        L29:
            r4 = move-exception
            r3.release()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L34
            java.nio.channels.FileChannel r3 = r3.channel()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L34
            r3.close()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L34
        L34:
            throw r4     // Catch: java.lang.Throwable -> L27
        L35:
            r3.release()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L39
            goto L1f
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
        L3a:
            return
        L3b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r3
    }
}
