package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IRoutePOISearch {
    com.amap.api.services.routepoisearch.RoutePOISearchQuery getQuery();

    com.amap.api.services.routepoisearch.RoutePOISearchResult searchRoutePOI() throws com.amap.api.services.core.AMapException;

    void searchRoutePOIAsyn();

    void setQuery(com.amap.api.services.routepoisearch.RoutePOISearchQuery r1);

    void setRoutePOISearchListener(com.amap.api.services.routepoisearch.RoutePOISearch.OnRoutePOISearchListener r1);
}
