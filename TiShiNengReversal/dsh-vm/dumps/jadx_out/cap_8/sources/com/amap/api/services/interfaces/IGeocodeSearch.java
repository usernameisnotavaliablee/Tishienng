package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IGeocodeSearch {
    com.amap.api.services.geocoder.RegeocodeAddress getFromLocation(com.amap.api.services.geocoder.RegeocodeQuery r1) throws com.amap.api.services.core.AMapException;

    void getFromLocationAsyn(com.amap.api.services.geocoder.RegeocodeQuery r1);

    java.util.List<com.amap.api.services.geocoder.GeocodeAddress> getFromLocationName(com.amap.api.services.geocoder.GeocodeQuery r1) throws com.amap.api.services.core.AMapException;

    void getFromLocationNameAsyn(com.amap.api.services.geocoder.GeocodeQuery r1);

    void setOnGeocodeSearchListener(com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener r1);
}
