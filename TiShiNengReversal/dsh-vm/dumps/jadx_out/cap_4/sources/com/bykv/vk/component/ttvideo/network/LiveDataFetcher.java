package com.bykv.vk.component.ttvideo.network;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LiveDataFetcher {
    private final java.util.concurrent.ExecutorService mExecutor;
    private java.util.concurrent.Future mFuture;
    private final com.bykv.vk.component.ttvideo.INetworkClient mNetworkClient;


    public interface OnCompletionListener {
        void onCompletion(com.bykv.vk.component.ttvideo.model.LiveStreamInfo r1);

        void onError(com.bykv.vk.component.ttvideo.log.LiveError r1);
    }

    public LiveDataFetcher(java.util.concurrent.ExecutorService r1, com.bykv.vk.component.ttvideo.INetworkClient r2) {
            r0 = this;
            r0.<init>()
            r0.mExecutor = r1
            r0.mNetworkClient = r2
            return
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.INetworkClient access$000(com.bykv.vk.component.ttvideo.network.LiveDataFetcher r0) {
            com.bykv.vk.component.ttvideo.INetworkClient r0 = r0.mNetworkClient
            return r0
    }

    public void cancel() {
            r2 = this;
            java.util.concurrent.Future r0 = r2.mFuture
            if (r0 == 0) goto L13
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L13
            java.util.concurrent.Future r0 = r2.mFuture
            r1 = 1
            r0.cancel(r1)
            r0 = 0
            r2.mFuture = r0
        L13:
            return
    }

    public void startFetch(java.lang.String r3, java.lang.String r4, com.bykv.vk.component.ttvideo.network.LiveDataFetcher.OnCompletionListener r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L26
            if (r5 != 0) goto L9
            goto L26
        L9:
            java.util.concurrent.ExecutorService r0 = r2.mExecutor
            if (r0 == 0) goto L1e
            r2.cancel()
            java.util.concurrent.ExecutorService r0 = r2.mExecutor
            com.bykv.vk.component.ttvideo.network.LiveDataFetcher$1 r1 = new com.bykv.vk.component.ttvideo.network.LiveDataFetcher$1
            r1.<init>(r2, r3, r4, r5)
            java.util.concurrent.Future r3 = r0.submit(r1)
            r2.mFuture = r3
            return
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "mExecutor should not be null"
            r3.<init>(r4)
            throw r3
        L26:
            return
    }
}
