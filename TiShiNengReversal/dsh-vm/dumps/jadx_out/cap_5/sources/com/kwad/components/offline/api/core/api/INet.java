package com.kwad.components.offline.api.core.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface INet {
    public static final int HTTP_STATUS_CODE_INVALID = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public @interface HostType {
        public static final java.lang.String API = "api";
        public static final java.lang.String CDN = "cdn";
        public static final java.lang.String ULOG = "ulog";
        public static final java.lang.String ZT = "zt";
    }

    int getActiveNetworkType(android.content.Context r1);

    java.lang.String getCurrHost(@com.kwad.components.offline.api.core.api.INet.HostType java.lang.String r1, java.lang.String r2);

    void handleSwitchHost(java.lang.String r1, @com.kwad.components.offline.api.core.api.INet.HostType java.lang.String r2, int r3, java.lang.Throwable r4);

    boolean isMobileConnected(android.content.Context r1);

    boolean isNetworkConnected(android.content.Context r1);

    boolean isWifiConnected(android.content.Context r1);
}
