package xyz.adscope.common.v2.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IScopeCrashHandler {
    java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> getUnReportCrash(android.content.Context r1, java.lang.String r2);

    boolean hasASNPCausedCrash(android.content.Context r1, java.lang.String r2);

    void registerCrashHandler(boolean r1);
}
