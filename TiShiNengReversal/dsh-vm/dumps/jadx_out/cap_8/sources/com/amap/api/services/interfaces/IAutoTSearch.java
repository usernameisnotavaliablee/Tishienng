package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IAutoTSearch {
    com.amap.api.services.auto.AutoTChargeStationResult searchChargeStation() throws com.amap.api.services.core.AMapException;

    void searchChargeStationAsync() throws com.amap.api.services.core.AMapException;

    void setChargeStationListener(com.amap.api.services.auto.AutoTSearch.OnChargeStationListener r1);

    void setQuery(com.amap.api.services.auto.AutoTSearch.Query r1);
}
