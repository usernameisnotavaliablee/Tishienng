package com.amap.api.services.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IRouteSearch {
    com.amap.api.services.route.BusRouteResult calculateBusRoute(com.amap.api.services.route.RouteSearch.BusRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearch.BusRouteQuery r1);

    com.amap.api.services.route.DriveRoutePlanResult calculateDrivePlan(com.amap.api.services.route.RouteSearch.DrivePlanQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateDrivePlanAsyn(com.amap.api.services.route.RouteSearch.DrivePlanQuery r1);

    com.amap.api.services.route.DriveRouteResult calculateDriveRoute(com.amap.api.services.route.RouteSearch.DriveRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearch.DriveRouteQuery r1);

    com.amap.api.services.route.RideRouteResult calculateRideRoute(com.amap.api.services.route.RouteSearch.RideRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearch.RideRouteQuery r1);

    com.amap.api.services.route.TruckRouteRestult calculateTruckRoute(com.amap.api.services.route.RouteSearch.TruckRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateTruckRouteAsyn(com.amap.api.services.route.RouteSearch.TruckRouteQuery r1);

    com.amap.api.services.route.WalkRouteResult calculateWalkRoute(com.amap.api.services.route.RouteSearch.WalkRouteQuery r1) throws com.amap.api.services.core.AMapException;

    void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearch.WalkRouteQuery r1);

    void setOnRoutePlanSearchListener(com.amap.api.services.route.RouteSearch.OnRoutePlanSearchListener r1);

    void setOnTruckRouteSearchListener(com.amap.api.services.route.RouteSearch.OnTruckRouteSearchListener r1);

    void setRouteSearchListener(com.amap.api.services.route.RouteSearch.OnRouteSearchListener r1);
}
