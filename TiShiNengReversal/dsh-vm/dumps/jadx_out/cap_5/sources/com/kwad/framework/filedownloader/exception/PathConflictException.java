package com.kwad.framework.filedownloader.exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PathConflictException extends java.lang.IllegalAccessException {
    private final int mAnotherSamePathTaskId;
    private final java.lang.String mDownloadingConflictPath;
    private final java.lang.String mTargetFilePath;

    public PathConflictException(int r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r5
            r0 = 2
            r1[r0] = r6
            java.lang.String r0 = "There is an another running task(%d) with the same downloading path(%s), because of they are with the same target-file-path(%s), so if the current task is started, the path of the file is sure to be written by multiple tasks, it is wrong, then you receive this exception to avoid such conflict."
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r1)
            r3.<init>(r0)
            r3.mAnotherSamePathTaskId = r4
            r3.mDownloadingConflictPath = r5
            r3.mTargetFilePath = r6
            return
    }

    public int getAnotherSamePathTaskId() {
            r1 = this;
            int r0 = r1.mAnotherSamePathTaskId
            return r0
    }

    public java.lang.String getDownloadingConflictPath() {
            r1 = this;
            java.lang.String r0 = r1.mDownloadingConflictPath
            return r0
    }

    public java.lang.String getTargetFilePath() {
            r1 = this;
            java.lang.String r0 = r1.mTargetFilePath
            return r0
    }
}
