package com.beizi.fusion;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface NativeUnifiedAdResponse {
    java.lang.String getActionText();

    java.lang.String getAdLogoUrl();

    java.lang.String getDescription();

    com.beizi.fusion.model.UnifiedAdDownloadAppInfo getDownloadAppInfo();

    int getECPM();

    java.lang.String getIconUrl();

    java.lang.String getImageUrl();

    java.util.List<java.lang.String> getImgList();

    int getMaterialType();

    java.lang.String getTitle();

    android.view.View getVideoView();

    android.view.ViewGroup getViewContainer();

    boolean isVideo();

    void registerDownloadAppInfoClickEvent(android.view.View r1);

    void registerViewForInteraction(java.util.List<android.view.View> r1);
}
