package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IRouteSearchV2 {
    com.amap.api.services.route.BusRouteResultV2 calculateBusRoute(com.amap.api.services.route.RouteSearchV2.BusRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearchV2.BusRouteQuery r1);

    com.amap.api.services.route.DriveRouteResultV2 calculateDriveRoute(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery r1);

    com.amap.api.services.route.RideRouteResultV2 calculateRideRoute(com.amap.api.services.route.RouteSearchV2.RideRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearchV2.RideRouteQuery r1);

    com.amap.api.services.route.WalkRouteResultV2 calculateWalkRoute(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r1);

    void setRouteSearchListener(com.amap.api.services.route.RouteSearchV2.OnRouteSearchListener r1);
}
