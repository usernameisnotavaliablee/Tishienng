package com.amap.api.trace;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface LBSTraceBase {
    void destroy();

    void queryProcessedTrace(int r1, java.util.List<com.amap.api.trace.TraceLocation> r2, int r3, com.amap.api.trace.TraceListener r4);

    void setLocationInterval(long r1);

    void setTraceStatusInterval(int r1);

    void startTrace(com.amap.api.trace.TraceStatusListener r1);

    void stopTrace();
}
