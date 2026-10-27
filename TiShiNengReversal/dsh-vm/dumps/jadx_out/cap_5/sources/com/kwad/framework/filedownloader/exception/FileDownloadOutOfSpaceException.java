package com.kwad.framework.filedownloader.exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FileDownloadOutOfSpaceException extends java.io.IOException {
    private long breakpointBytes;
    private long freeSpaceBytes;
    private long requiredSpaceBytes;

    public FileDownloadOutOfSpaceException(long r6, long r8, long r10) {
            r5 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.String r0 = "The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r3)
            r5.<init>(r0)
            r5.init(r6, r8, r10)
            return
    }

    @android.annotation.TargetApi(9)
    public FileDownloadOutOfSpaceException(long r6, long r8, long r10, java.lang.Throwable r12) {
            r5 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.String r0 = "The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r3)
            r5.<init>(r0, r12)
            r5.init(r6, r8, r10)
            return
    }

    private void init(long r1, long r3, long r5) {
            r0 = this;
            r0.freeSpaceBytes = r1
            r0.requiredSpaceBytes = r3
            r0.breakpointBytes = r5
            return
    }

    public long getBreakpointBytes() {
            r2 = this;
            long r0 = r2.breakpointBytes
            return r0
    }

    public long getFreeSpaceBytes() {
            r2 = this;
            long r0 = r2.freeSpaceBytes
            return r0
    }

    public long getRequiredSpaceBytes() {
            r2 = this;
            long r0 = r2.requiredSpaceBytes
            return r0
    }
}
