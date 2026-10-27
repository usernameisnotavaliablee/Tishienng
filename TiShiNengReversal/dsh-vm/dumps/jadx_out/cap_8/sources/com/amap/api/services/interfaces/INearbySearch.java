package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface INearbySearch {
    void addNearbyListener(com.amap.api.services.nearby.NearbySearch.NearbyListener r1);

    void clearUserInfoAsyn();

    void destroy();

    void removeNearbyListener(com.amap.api.services.nearby.NearbySearch.NearbyListener r1);

    com.amap.api.services.nearby.NearbySearchResult searchNearbyInfo(com.amap.api.services.nearby.NearbySearch.NearbyQuery r1) throws com.amap.api.services.core.AMapException;

    void searchNearbyInfoAsyn(com.amap.api.services.nearby.NearbySearch.NearbyQuery r1);

    void setUserID(java.lang.String r1);

    void startUploadNearbyInfoAuto(com.amap.api.services.nearby.UploadInfoCallback r1, int r2);

    void stopUploadNearbyInfoAuto();

    void uploadNearbyInfoAsyn(com.amap.api.services.nearby.UploadInfo r1);
}
