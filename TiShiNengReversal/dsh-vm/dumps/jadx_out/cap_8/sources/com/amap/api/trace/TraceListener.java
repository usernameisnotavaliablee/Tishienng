package com.amap.api.trace;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface TraceListener {
    void onFinished(int r1, java.util.List<com.amap.api.maps.model.LatLng> r2, int r3, int r4);

    void onRequestFailed(int r1, java.lang.String r2);

    void onTraceProcessing(int r1, int r2, java.util.List<com.amap.api.maps.model.LatLng> r3);
}
