package xyz.adscope.common.analyse.publish;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IEventAnalyser {
    void initializeQueueLinked(java.util.List<xyz.adscope.common.analyse.publish.IEventConfigModel> r1, java.lang.String r2);

    void reportCrashEvent(java.util.List<xyz.adscope.common.analyse.model.IBaseEventReportModel> r1, java.lang.String r2);

    void reportRealtimeEvent(xyz.adscope.common.analyse.model.IBaseEventReportModel r1, java.lang.String r2);

    void scheduleHistoryEvent(long r1, long r3, java.util.concurrent.TimeUnit r5);
}
