package xyz.adscope.common.v2.thread.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IBaseThreadPool {
    void executeAnalyseAsyncTask(java.lang.Runnable r1);

    void executeBasicAsyncTask(java.lang.Runnable r1);

    void executeInitAsyncTask(java.lang.Runnable r1);

    void executeLocalAsyncTask(java.lang.Runnable r1);

    void executeRequestAsyncTask(java.lang.Runnable r1);

    void executeResourceCacheTask(java.lang.Runnable r1);

    void scheduleAsyncTask(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4);
}
