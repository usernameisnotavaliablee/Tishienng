package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.c a = null;

    static {
            com.bxkj.base.v2.common.utils.c r0 = new com.bxkj.base.v2.common.utils.c
            r0.<init>()
            com.bxkj.base.v2.common.utils.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(com.bxkj.base.v2.common.utils.y r0, com.amap.api.location.AMapLocation r1) {
            c(r0, r1)
            return
    }

    private static final void c(com.bxkj.base.v2.common.utils.y r4, com.amap.api.location.AMapLocation r5) {
            int r0 = r5.getErrorCode()
            if (r0 != 0) goto L2d
            java.lang.String r0 = r5.getAddress()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GPS定位成功"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            double r0 = r5.getLatitude()
            double r2 = r5.getLongitude()
            r4.a(r0, r2)
            return
        L2d:
            int r0 = r5.getErrorCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = r5.getErrorInfo()
            r4.b(r0, r5)
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.common.utils.y r4) {
            r3 = this;
            java.lang.String r0 = "locationObserver"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.amap.api.location.AMapLocationClient r0 = new com.amap.api.location.AMapLocationClient
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            r0.<init>(r1)
            com.amap.api.location.AMapLocationClientOption r1 = new com.amap.api.location.AMapLocationClientOption
            r1.<init>()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy
            r1.setLocationMode(r2)
            com.amap.api.location.AMapLocationClientOption$AMapLocationPurpose r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.SignIn
            r1.setLocationPurpose(r2)
            r2 = 1
            r1.setOnceLocation(r2)
            r1.setOnceLocationLatest(r2)
            r0.setLocationOption(r1)
            com.bxkj.base.v2.common.utils.b r1 = new com.bxkj.base.v2.common.utils.b
            r1.<init>(r4)
            r0.setLocationListener(r1)
            r0.startLocation()
            return
    }
}
