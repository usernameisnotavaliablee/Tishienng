package com.kwad.components.offline.api.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOfflineHostApi {
    com.kwad.components.offline.api.core.api.IAsync async();

    com.kwad.components.offline.api.core.api.IBundleService bundleService();

    com.kwad.components.offline.api.core.api.ICache cache();

    boolean canUseStorage();

    com.kwad.components.offline.api.core.api.ICrash crash();

    com.kwad.components.offline.api.core.api.IOfflineDeviceManagerProxy deviceManager();

    com.kwad.components.offline.api.core.api.IDownloader downloader();

    com.kwad.components.offline.api.core.api.IEncrypt encrypt();

    com.kwad.components.offline.api.core.api.IEnvironment env();

    com.kwad.components.offline.api.core.api.IFlowUuid flowUuid();

    int getAppIconId(android.content.Context r1);

    int getDrawableId(android.content.Context r1, java.lang.String r2);

    int getId(android.content.Context r1, java.lang.String r2);

    android.content.pm.PackageInfo getPackageInfo(android.content.Context r1, java.lang.String r2, int r3);

    long getSystemTimeInMs(android.content.Context r1, boolean r2);

    int getTKErrorDetailCount();

    java.util.List<java.lang.String> getTKPreloadMemCacheTemplates();

    java.lang.String getWaynePlayerPlayConfig();

    com.kwad.components.offline.api.core.network.IIdc idc();

    com.kwad.components.offline.api.core.api.IImageLoader imageLoader();

    com.kwad.components.offline.api.core.imageplayer.IImagePlayer imagePlayer();

    boolean isOrientationPortrait();

    com.kwad.components.offline.api.core.api.ILifeCycle lifeCycle();

    com.kwad.components.offline.api.core.adlive.ILive live();

    com.kwad.components.offline.api.core.api.IOfflineCompoLogcat log();

    com.kwad.components.offline.api.core.api.ILoggerReporter loggerReporter();

    com.kwad.components.offline.api.core.api.INet net();

    com.kwad.components.offline.api.core.network.INetworkManager networkManager();

    void saveTKTemplateCache(java.lang.String r1, int r2, java.lang.String r3);

    com.kwad.components.offline.api.core.api.ISensorManagerProxy sensorManager();

    com.kwad.components.offline.api.core.api.ISystemProperties systemProperty();

    com.kwad.components.offline.api.core.api.IVibratorUtil vibratorUtil();

    com.kwad.components.offline.api.core.video.IVideo video();

    com.kwad.components.offline.api.core.webview.IWebView webview();

    com.kwad.components.offline.api.core.api.IZipper zipper();
}
