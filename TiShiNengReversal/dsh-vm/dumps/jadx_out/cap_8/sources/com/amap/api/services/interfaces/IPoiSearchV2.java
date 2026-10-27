package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IPoiSearchV2 {
    com.amap.api.services.poisearch.PoiSearchV2.SearchBound getBound();

    java.lang.String getLanguage();

    com.amap.api.services.poisearch.PoiSearchV2.Query getQuery();

    com.amap.api.services.poisearch.PoiResultV2 searchPOI() throws com.amap.api.services.core.AMapException;

    void searchPOIAsyn();

    com.amap.api.services.core.PoiItemV2 searchPOIId(java.lang.String r1) throws com.amap.api.services.core.AMapException;

    void searchPOIIdAsyn(java.lang.String r1);

    void setBound(com.amap.api.services.poisearch.PoiSearchV2.SearchBound r1);

    void setLanguage(java.lang.String r1);

    void setOnPoiSearchListener(com.amap.api.services.poisearch.PoiSearchV2.OnPoiSearchListener r1);

    void setQuery(com.amap.api.services.poisearch.PoiSearchV2.Query r1);
}
