package com.autonavi.amap.mapcore.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IMapFragmentDelegate {
    com.autonavi.amap.mapcore.interfaces.IAMap getMap() throws android.os.RemoteException;

    boolean isReady() throws android.os.RemoteException;

    void loadWorldVectorMap(boolean r1);

    void onCreate(android.os.Bundle r1) throws android.os.RemoteException;

    android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onDestroyView() throws android.os.RemoteException;

    void onInflate(android.app.Activity r1, com.amap.api.maps.AMapOptions r2, android.os.Bundle r3) throws android.os.RemoteException;

    void onLowMemory() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onSaveInstanceState(android.os.Bundle r1) throws android.os.RemoteException;

    void setContext(android.content.Context r1);

    void setOptions(com.amap.api.maps.AMapOptions r1);

    void setVisibility(int r1);
}
