package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IInputtipsSearch {
    com.amap.api.services.help.InputtipsQuery getQuery();

    java.util.ArrayList<com.amap.api.services.help.Tip> requestInputtips() throws com.amap.api.services.core.AMapException;

    void requestInputtips(java.lang.String r1, java.lang.String r2) throws com.amap.api.services.core.AMapException;

    void requestInputtips(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws com.amap.api.services.core.AMapException;

    void requestInputtipsAsyn();

    void setInputtipsListener(com.amap.api.services.help.Inputtips.InputtipsListener r1);

    void setQuery(com.amap.api.services.help.InputtipsQuery r1);
}
