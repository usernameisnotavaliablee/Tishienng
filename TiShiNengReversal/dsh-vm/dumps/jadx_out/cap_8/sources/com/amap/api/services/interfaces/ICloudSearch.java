package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ICloudSearch {
    void searchCloudAsyn(com.amap.api.services.cloud.CloudSearch.Query r1);

    void searchCloudDetailAsyn(java.lang.String r1, java.lang.String r2);

    void setOnCloudSearchListener(com.amap.api.services.cloud.CloudSearch.OnCloudSearchListener r1);
}
