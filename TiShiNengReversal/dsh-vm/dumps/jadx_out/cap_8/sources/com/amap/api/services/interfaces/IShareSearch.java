package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IShareSearch {
    java.lang.String searchBusRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareBusRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void searchBusRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareBusRouteQuery r1);

    java.lang.String searchDrivingRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void searchDrivingRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery r1);

    java.lang.String searchLocationShareUrl(com.amap.api.services.core.LatLonSharePoint r1) throws com.amap.api.services.core.AMapException;

    void searchLocationShareUrlAsyn(com.amap.api.services.core.LatLonSharePoint r1);

    java.lang.String searchNaviShareUrl(com.amap.api.services.share.ShareSearch.ShareNaviQuery r1) throws com.amap.api.services.core.AMapException;

    void searchNaviShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareNaviQuery r1);

    java.lang.String searchPoiShareUrl(com.amap.api.services.core.PoiItem r1) throws com.amap.api.services.core.AMapException;

    void searchPoiShareUrlAsyn(com.amap.api.services.core.PoiItem r1);

    java.lang.String searchWalkRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void searchWalkRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery r1);

    void setOnShareSearchListener(com.amap.api.services.share.ShareSearch.OnShareSearchListener r1);
}
