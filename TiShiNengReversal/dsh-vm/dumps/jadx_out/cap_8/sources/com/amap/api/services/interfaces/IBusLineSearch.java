package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IBusLineSearch {
    com.amap.api.services.busline.BusLineQuery getQuery();

    com.amap.api.services.busline.BusLineResult searchBusLine() throws com.amap.api.services.core.AMapException;

    void searchBusLineAsyn();

    void setOnBusLineSearchListener(com.amap.api.services.busline.BusLineSearch.OnBusLineSearchListener r1);

    void setQuery(com.amap.api.services.busline.BusLineQuery r1);
}
