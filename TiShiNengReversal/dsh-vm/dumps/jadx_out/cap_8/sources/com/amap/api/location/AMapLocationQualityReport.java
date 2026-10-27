package com.amap.api.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapLocationQualityReport implements java.lang.Cloneable {
    public static final int GPS_STATUS_MODE_SAVING = 3;
    public static final int GPS_STATUS_NOGPSPERMISSION = 4;
    public static final int GPS_STATUS_NOGPSPROVIDER = 1;
    public static final int GPS_STATUS_OFF = 2;
    public static final int GPS_STATUS_OK = 0;
    com.amap.api.location.AMapLocationClientOption.AMapLocationMode a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4946b;

    /* renamed from: c, reason: collision with root package name */
    private int f4947c;

    /* renamed from: d, reason: collision with root package name */
    private int f4948d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f4949e;

    /* renamed from: f, reason: collision with root package name */
    private long f4950f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4951g;

    public AMapLocationQualityReport() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4946b = r0
            r1 = 2
            r3.f4947c = r1
            r3.f4948d = r0
            java.lang.String r1 = "UNKNOWN"
            r3.f4949e = r1
            r1 = 0
            r3.f4950f = r1
            r3.f4951g = r0
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy
            r3.a = r0
            return
    }

    protected com.amap.api.location.AMapLocationQualityReport clone() {
            r4 = this;
            com.amap.api.location.AMapLocationQualityReport r0 = new com.amap.api.location.AMapLocationQualityReport
            r0.<init>()
            super.clone()     // Catch: java.lang.Throwable -> L8
        L8:
            int r1 = r4.f4947c     // Catch: java.lang.Throwable -> L2c
            r0.setGpsStatus(r1)     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.f4948d     // Catch: java.lang.Throwable -> L2c
            r0.setGPSSatellites(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r4.f4946b     // Catch: java.lang.Throwable -> L2c
            r0.setWifiAble(r1)     // Catch: java.lang.Throwable -> L2c
            long r1 = r4.f4950f     // Catch: java.lang.Throwable -> L2c
            r0.setNetUseTime(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r4.f4949e     // Catch: java.lang.Throwable -> L2c
            r0.setNetworkType(r1)     // Catch: java.lang.Throwable -> L2c
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.a     // Catch: java.lang.Throwable -> L2c
            r0.setLocationMode(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r4.f4951g     // Catch: java.lang.Throwable -> L2c
            r0.setInstallHighDangerMockApp(r1)     // Catch: java.lang.Throwable -> L2c
            goto L34
        L2c:
            r1 = move-exception
            java.lang.String r2 = "AMapLocationQualityReport"
            java.lang.String r3 = "clone"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
        L34:
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    protected /* bridge */ /* synthetic */ java.lang.Object m5clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.location.AMapLocationQualityReport r0 = r1.clone()
            return r0
    }

    public java.lang.String getAdviseMessage() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving
            if (r1 == r2) goto L41
            int r2 = r4.f4947c
            r3 = 4
            if (r2 == 0) goto L34
            r1 = 1
            if (r2 == r1) goto L2e
            r1 = 2
            if (r2 == r1) goto L28
            r1 = 3
            if (r2 == r1) goto L22
            if (r2 == r3) goto L1c
            goto L41
        L1c:
            java.lang.String r1 = "您的设置禁用了GPS定位权限，开启GPS定位权限有助于提高定位的精确度\n"
            r0.append(r1)
            goto L41
        L22:
            java.lang.String r1 = "您的设备当前设置的定位模式不包含GPS定位，选择包含GPS模式的定位模式有助于提高定位的精确度\n"
            r0.append(r1)
            goto L41
        L28:
            java.lang.String r1 = "您的设备关闭了GPS定位功能，开启GPS定位功能有助于提高定位的精确度\n"
            r0.append(r1)
            goto L41
        L2e:
            java.lang.String r1 = "您的设备没有GPS模块或者GPS模块异常，无法进行GPS定位\n"
            r0.append(r1)
            goto L41
        L34:
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r1 != r2) goto L41
            int r1 = r4.f4948d
            if (r1 >= r3) goto L41
            java.lang.String r1 = "当前GPS信号弱，位置更新可能会延迟\n"
            r0.append(r1)
        L41:
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r1 == r2) goto L6f
            java.lang.String r1 = "DISCONNECTED"
            java.lang.String r2 = r4.f4949e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L57
            java.lang.String r1 = "您的设备未连接到网络，无法进行网络定位\n"
            r0.append(r1)
            goto L66
        L57:
            java.lang.String r1 = "2G"
            java.lang.String r2 = r4.f4949e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L66
            java.lang.String r1 = "您的设备网络状态不太好，网络定位可能会有延迟\n"
            r0.append(r1)
        L66:
            boolean r1 = r4.f4946b
            if (r1 != 0) goto L6f
            java.lang.String r1 = "您的设备WIFI开关已关闭，打开WIFI开关有助于提高定位的成功率\n"
            r0.append(r1)
        L6f:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int getGPSSatellites() {
            r1 = this;
            int r0 = r1.f4948d
            return r0
    }

    public int getGPSStatus() {
            r1 = this;
            int r0 = r1.f4947c
            return r0
    }

    public long getNetUseTime() {
            r2 = this;
            long r0 = r2.f4950f
            return r0
    }

    public java.lang.String getNetworkType() {
            r1 = this;
            java.lang.String r0 = r1.f4949e
            return r0
    }

    public boolean isInstalledHighDangerMockApp() {
            r1 = this;
            boolean r0 = r1.f4951g
            return r0
    }

    public boolean isWifiAble() {
            r1 = this;
            boolean r0 = r1.f4946b
            return r0
    }

    public void setGPSSatellites(int r1) {
            r0 = this;
            r0.f4948d = r1
            return
    }

    public void setGpsStatus(int r1) {
            r0 = this;
            r0.f4947c = r1
            return
    }

    public void setInstallHighDangerMockApp(boolean r1) {
            r0 = this;
            r0.f4951g = r1
            return
    }

    public void setLocationMode(com.amap.api.location.AMapLocationClientOption.AMapLocationMode r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setNetUseTime(long r1) {
            r0 = this;
            r0.f4950f = r1
            return
    }

    public void setNetworkType(java.lang.String r1) {
            r0 = this;
            r0.f4949e = r1
            return
    }

    public void setWifiAble(boolean r1) {
            r0 = this;
            r0.f4946b = r1
            return
    }
}
