package xyz.adscope.common.analyse2.publish;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IScopeEventAnalyser {
    void initializeAnalyse(java.lang.String r1);

    void registerAnalyseUpdate(xyz.adscope.common.analyse2.publish.IScopeAnalyserUpdater r1);

    void reportCrash(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    void reportEvent(java.lang.String r1, java.lang.String r2, java.lang.String r3);

    void scheduleHistoryEvent(long r1, long r3, java.util.concurrent.TimeUnit r5, java.lang.String r6);
}
