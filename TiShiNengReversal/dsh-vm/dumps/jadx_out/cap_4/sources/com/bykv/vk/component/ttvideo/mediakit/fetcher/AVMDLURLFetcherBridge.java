package com.bykv.vk.component.ttvideo.mediakit.fetcher;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLURLFetcherBridge implements com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLURLFetcherListener {
    private static final java.lang.String TAG = "AVMDLURLFetcherBridge";
    private static com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLFetcherMakerInterface fetcherMaker;
    public java.lang.String fileKey;
    private long handle;
    boolean isFinish;
    private java.util.concurrent.locks.Lock lock;
    java.lang.String newURL;
    public java.lang.String oldURL;
    public java.lang.String rawKey;

    public AVMDLURLFetcherBridge() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.rawKey = r0
            r2.fileKey = r0
            r2.oldURL = r0
            r2.newURL = r0
            r0 = 0
            r2.isFinish = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.lock = r0
            r0 = 0
            r2.handle = r0
            return
    }

    private static native void _notifyFetcherResult(long r0, java.lang.String r2, java.lang.String r3, java.lang.String r4);

    public static void setFetcherMaker(com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLFetcherMakerInterface r0) {
            if (r0 == 0) goto L4
            com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLURLFetcherBridge.fetcherMaker = r0
        L4:
            return
    }

    public java.lang.String getResult() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.lock()
            java.lang.String r0 = r2.newURL     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            return r0
        Ld:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            throw r0
    }

    boolean isFinish() {
            r1 = this;
            boolean r0 = r1.isFinish
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLURLFetcherListener
    public void onCompletion(int r6, java.lang.String r7, java.lang.String r8, java.lang.String[] r9) {
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.lock
            r0.lock()
            boolean r0 = r5.isFinish     // Catch: java.lang.Throwable -> L16
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L3b
            if (r9 == 0) goto L18
            int r0 = r9.length     // Catch: java.lang.Throwable -> L16
            if (r0 <= 0) goto L18
            r9 = r9[r3]     // Catch: java.lang.Throwable -> L16
            r5.newURL = r9     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r6 = move-exception
            goto L54
        L18:
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "receive completion code:%d result:%s"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = r5.newURL     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L16
            r1[r3] = r6     // Catch: java.lang.Throwable -> L16
            r1[r2] = r4     // Catch: java.lang.Throwable -> L16
            java.lang.String.format(r9, r0, r1)     // Catch: java.lang.Throwable -> L16
            r5.isFinish = r2     // Catch: java.lang.Throwable -> L16
            long r0 = r5.handle     // Catch: java.lang.Throwable -> L16
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L4e
            java.lang.String r6 = r5.newURL     // Catch: java.lang.Throwable -> L16
            _notifyFetcherResult(r0, r7, r8, r6)     // Catch: java.lang.Throwable -> L16
            goto L4e
        L3b:
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L16
            java.lang.String r8 = "has fetch finished not need cur completion code:%d result:%s"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = r5.newURL     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L16
            r0[r3] = r6     // Catch: java.lang.Throwable -> L16
            r0[r2] = r9     // Catch: java.lang.Throwable -> L16
            java.lang.String.format(r7, r8, r0)     // Catch: java.lang.Throwable -> L16
        L4e:
            java.util.concurrent.locks.Lock r6 = r5.lock
            r6.unlock()
            return
        L54:
            java.util.concurrent.locks.Lock r7 = r5.lock
            r7.unlock()
            throw r6
    }

    public void release() {
            r5 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            java.lang.String r3 = "----start release fetcher:%s"
            java.lang.String.format(r3, r1)
            java.util.concurrent.locks.Lock r1 = r5.lock
            r1.lock()
            r3 = 0
            r5.handle = r3     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.locks.Lock r1 = r5.lock
            r1.unlock()
            java.lang.String r1 = r5.rawKey
            java.lang.String r3 = r5.fileKey
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            r4[r0] = r3
            java.lang.String r1 = "remove fetcher rawkey:%s, fileKey:%s"
            java.lang.String.format(r1, r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            java.lang.String r1 = "****end call release:%s"
            java.lang.String.format(r1, r0)
            return
        L33:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.lock
            r1.unlock()
            throw r0
    }

    public int start(long r6, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r5 = this;
            com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLFetcherMakerInterface r0 = com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLURLFetcherBridge.fetcherMaker
            r1 = -1
            if (r0 == 0) goto La3
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto La3
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto La3
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L19
            goto La3
        L19:
            java.util.concurrent.locks.Lock r0 = r5.lock
            r0.lock()
            r5.handle = r6
            r5.rawKey = r8     // Catch: java.lang.Throwable -> L57
            r5.fileKey = r9     // Catch: java.lang.Throwable -> L57
            r5.oldURL = r10     // Catch: java.lang.Throwable -> L57
            com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLFetcherMakerInterface r6 = com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLURLFetcherBridge.fetcherMaker     // Catch: java.lang.Throwable -> L57
            com.bykv.vk.component.ttvideo.mediakit.fetcher.AVMDLURLFetcherInterface r6 = r6.getFetcher(r8, r9, r10)     // Catch: java.lang.Throwable -> L57
            if (r6 != 0) goto L34
            java.util.concurrent.locks.Lock r6 = r5.lock
            r6.unlock()
            return r1
        L34:
            int r7 = r6.start(r8, r9, r10, r5)     // Catch: java.lang.Throwable -> L57
            r10 = 1
            r0 = 0
            if (r7 <= 0) goto L6f
            java.lang.String[] r6 = r6.getURLs()     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L59
            int r1 = r6.length     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L46
            goto L59
        L46:
            long r1 = r5.handle     // Catch: java.lang.Throwable -> L57
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L87
            r6 = r6[r0]     // Catch: java.lang.Throwable -> L57
            r5.newURL = r6     // Catch: java.lang.Throwable -> L57
            _notifyFetcherResult(r1, r8, r9, r6)     // Catch: java.lang.Throwable -> L57
            r6 = 1
            goto L88
        L57:
            r6 = move-exception
            goto L9d
        L59:
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L57
            java.lang.String r8 = "****end fail start ret:%d, but getURLs null"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L57
            r9[r0] = r7     // Catch: java.lang.Throwable -> L57
            java.lang.String.format(r6, r8, r9)     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.locks.Lock r6 = r5.lock
            r6.unlock()
            r6 = -2
            return r6
        L6f:
            if (r7 >= 0) goto L87
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L57
            java.lang.String r8 = "****end fail start ret:%d, not need wait result"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L57
            r9[r0] = r7     // Catch: java.lang.Throwable -> L57
            java.lang.String.format(r6, r8, r9)     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.locks.Lock r6 = r5.lock
            r6.unlock()
            r6 = -3
            return r6
        L87:
            r6 = 0
        L88:
            java.util.concurrent.locks.Lock r7 = r5.lock
            r7.unlock()
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r9[r0] = r8
            java.lang.String r8 = "****call start end, result:%d"
            java.lang.String.format(r7, r8, r9)
            return r6
        L9d:
            java.util.concurrent.locks.Lock r7 = r5.lock
            r7.unlock()
            throw r6
        La3:
            return r1
    }
}
