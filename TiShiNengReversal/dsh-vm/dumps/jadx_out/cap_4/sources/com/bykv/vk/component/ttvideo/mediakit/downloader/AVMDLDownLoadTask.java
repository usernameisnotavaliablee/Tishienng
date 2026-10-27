package com.bykv.vk.component.ttvideo.mediakit.downloader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDownLoadTask {
    public static final int IsHttpOpen = 0;
    public static final int IsHttpRead = 1;
    public static final int IsInValidStep = -1;
    public static final int IsReponseHeader = 0;
    public static final int IsResponseComplete = 3;
    public static final int IsResponseData = 1;
    public static final int IsResponseError = 2;
    private static final java.lang.String TAG = "AVMDLDownLoadTask";
    private java.io.File file;
    java.io.FileOutputStream fos;
    private java.util.concurrent.Future mFuture;
    private long mHandle;
    private java.util.concurrent.locks.Lock mHandleLock;
    private boolean mIsRunning;
    private com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest mRequest;
    private java.util.concurrent.locks.Lock mResonseLock;
    private com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse mResponse;
    private int mStep;


    public AVMDLDownLoadTask() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mHandle = r0
            r0 = 0
            r2.mIsRunning = r0
            r0 = -1
            r2.mStep = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.mHandleLock = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.mResonseLock = r0
            return
    }

    private static native void _notifyLoadInfo(long r0, int r2, long r3, long r5, java.lang.String r7);

    private static native int _onRecvData(long r0, byte[] r2, int r3);

    static /* synthetic */ com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest access$000(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask r0) {
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r0 = r0.mRequest
            return r0
    }

    static /* synthetic */ boolean access$100(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask r0) {
            boolean r0 = r0.mIsRunning
            return r0
    }

    static /* synthetic */ int access$200(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask r0) {
            int r0 = r0.mStep
            return r0
    }

    static /* synthetic */ int access$202(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask r0, int r1) {
            r0.mStep = r1
            return r1
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse access$300(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask r0, com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r1) {
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r0 = r0.httOpen(r1)
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse access$400(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask r0, com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r1, byte[] r2) {
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r0 = r0.httpRead(r1, r2)
            return r0
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private void cancelResponse() {
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.mResonseLock     // Catch: java.lang.Throwable -> L27
            r0.lock()     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r0 = r5.mResponse     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r2 = r5.mResponse     // Catch: java.lang.Throwable -> L27
            r2.cancel()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "end cancel cost time:%d"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L27
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L27
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            r3 = 0
            r1[r3] = r0     // Catch: java.lang.Throwable -> L27
            java.lang.String.format(r2, r1)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2f
        L29:
            java.util.concurrent.locks.Lock r0 = r5.mResonseLock
            r0.unlock()
            return
        L2f:
            java.util.concurrent.locks.Lock r1 = r5.mResonseLock
            r1.unlock()
            throw r0
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse httOpen(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r11) {
            r10 = this;
            int r1 = r11.mCurlUrlIndex
            r2 = 0
            r10.setResponse(r2)
            r3 = r1
        L7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            int[] r4 = r11.mUrlState
            r4 = r4[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int[] r5 = r11.mUrlErrCount
            r5 = r5[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r11.mMaxTryCout
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r0
            r9 = 1
            r7[r9] = r4
            r0 = 2
            r7[r0] = r5
            r0 = 3
            r7[r0] = r6
            java.lang.String r0 = "http open index:%d state:%d trycount:%d maxTry:%d"
            java.lang.String.format(r0, r7)
            int[] r0 = r11.mUrlState
            r0 = r0[r3]
            if (r0 != 0) goto L8c
            int r0 = r11.mMaxTryCout
            if (r0 <= 0) goto L45
            int[] r4 = r11.mUrlErrCount
            r4 = r4[r3]
            if (r4 >= r0) goto L8c
        L45:
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r0 = com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLHttpExcutor.excute(r11, r3)     // Catch: java.io.IOException -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r0.getLocalizedMessage()
            r0 = r2
        L4f:
            if (r0 == 0) goto L68
            boolean r4 = r0.isOpenSuccessful()
            if (r4 == 0) goto L68
            r10.setResponse(r0)
            int r1 = r0.statusCode
            long r4 = (long) r1
            long r6 = r0.contentlength
            r8 = 0
            r3 = 0
            r2 = r10
            r2.notifyToNative(r3, r4, r6, r8)
            r0.request = r11
            return r0
        L68:
            int[] r4 = r11.mUrlErrCount
            r5 = r4[r3]
            int r5 = r5 + r9
            r4[r3] = r5
            if (r0 == 0) goto L8c
            int r0 = r0.statusCode
            r4 = 400(0x190, float:5.6E-43)
            if (r0 < r4) goto L8c
            r4 = 600(0x258, float:8.41E-43)
            if (r0 >= r4) goto L8c
            int[] r0 = r11.mUrlState
            r0[r3] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r4[r8] = r0
            java.lang.String r0 = "set url state forbidden index:%d"
            java.lang.String.format(r0, r4)
        L8c:
            int r3 = r3 + 1
            java.lang.String[] r0 = r11.urls
            int r0 = r0.length
            int r3 = r3 % r0
            if (r3 != r1) goto L7
            return r2
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse httpRead(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r7, byte[] r8) {
            r6 = this;
            int r0 = r7.readData(r8)
            if (r0 <= 0) goto L25
            java.util.concurrent.locks.Lock r1 = r6.mHandleLock     // Catch: java.lang.Throwable -> L17
            r1.lock()     // Catch: java.lang.Throwable -> L17
            long r1 = r6.mHandle     // Catch: java.lang.Throwable -> L17
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L19
            _onRecvData(r1, r8, r0)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r7 = move-exception
            goto L1f
        L19:
            java.util.concurrent.locks.Lock r8 = r6.mHandleLock
            r8.unlock()
            return r7
        L1f:
            java.util.concurrent.locks.Lock r8 = r6.mHandleLock
            r8.unlock()
            throw r7
        L25:
            return r7
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private void setHandle(long r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.mHandleLock     // Catch: java.lang.Throwable -> L1c
            r0.lock()     // Catch: java.lang.Throwable -> L1c
            r2.mHandle = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "set handle:%d"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1c
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            r4[r1] = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.String.format(r0, r4)     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.locks.Lock r3 = r2.mHandleLock
            r3.unlock()
            return
        L1c:
            r3 = move-exception
            java.util.concurrent.locks.Lock r4 = r2.mHandleLock
            r4.unlock()
            throw r3
    }

    private void setResponse(com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLResponse r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.mResonseLock
            r0.lock()
            r1.mResponse = r2
            java.util.concurrent.locks.Lock r2 = r1.mResonseLock
            r2.unlock()
            return
    }

    public void close() {
            r2 = this;
            r0 = 0
            r2.setHandle(r0)
            r0 = 0
            r2.mIsRunning = r0
            r2.cancelResponse()
            return
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    public void notifyToNative(int r10, long r11, long r13, java.lang.String r15) {
            r9 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.String r0 = "notify type:%d code:%d param:%d "
            java.lang.String.format(r0, r3)
            java.util.concurrent.locks.Lock r0 = r9.mHandleLock     // Catch: java.lang.Throwable -> L32
            r0.lock()     // Catch: java.lang.Throwable -> L32
            long r1 = r9.mHandle     // Catch: java.lang.Throwable -> L32
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L35
            r3 = r10
            r4 = r11
            r6 = r13
            r8 = r15
            _notifyLoadInfo(r1, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            r0 = move-exception
            r10 = r0
            goto L3b
        L35:
            java.util.concurrent.locks.Lock r10 = r9.mHandleLock
            r10.unlock()
            return
        L3b:
            java.util.concurrent.locks.Lock r11 = r9.mHandleLock
            r11.unlock()
            throw r10
    }

    public int open(long r1, java.lang.Object r3, java.lang.Object r4, int r5, int r6, int r7) {
            r0 = this;
            r4 = 0
            java.lang.String r6 = "AVMDLDownLoadTask"
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 == 0) goto L33
            if (r3 != 0) goto Lb
            goto L33
        Lb:
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest r3 = (com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLRequest) r3
            java.lang.String[] r4 = r3.urls
            if (r4 == 0) goto L2c
            int r4 = r4.length
            if (r4 != 0) goto L15
            goto L2c
        L15:
            r0.mRequest = r3
            r0.setHandle(r1)
            r1 = 0
            r0.mStep = r1
            r2 = 1
            r0.mIsRunning = r2
            com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask$1 r2 = new com.bykv.vk.component.ttvideo.mediakit.downloader.AVMDLDownLoadTask$1
            r2.<init>(r0)
            java.util.concurrent.Future r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLThreadPool.addExecuteTask(r2)
            r0.mFuture = r2
            return r1
        L2c:
            java.lang.String r1 = "no url err"
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r6, r1)
            r1 = -2
            return r1
        L33:
            java.lang.String r1 = "handle zero err"
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r6, r1)
            r1 = -1
            return r1
    }
}
