package xyz.adscope.common.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DeviceInfo {
    private static xyz.adscope.common.info.DeviceInfo J;
    java.lang.String A;
    java.lang.String B;
    java.lang.String C;
    java.lang.String D;
    java.lang.String E;
    java.lang.String F;
    int G;
    private java.lang.String H;
    private int I;
    private android.content.Context a;
    long b;
    java.lang.String c;
    int d;
    java.lang.String e;
    java.lang.String f;
    java.lang.String g;
    java.lang.String h;
    java.lang.String i;
    java.lang.String j;
    java.lang.String k;
    java.lang.String l;
    int m;
    int n;
    int o;
    int p;
    int q;
    float r;
    float s;
    java.lang.String t;
    java.lang.String u;
    java.lang.String v;
    java.lang.String w;
    java.lang.String x;
    java.lang.String y;
    java.lang.String z;

    private DeviceInfo(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.d = r0
            r2.m = r0
            r2.n = r0
            r2.o = r0
            r2.p = r0
            r2.q = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.r = r1
            r2.s = r1
            r2.G = r0
            r2.I = r0
            r2.a = r3
            return
    }

    public static xyz.adscope.common.info.DeviceInfo getInstance(android.content.Context r2) {
            xyz.adscope.common.info.DeviceInfo r0 = xyz.adscope.common.info.DeviceInfo.J
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.common.info.DeviceInfo> r0 = xyz.adscope.common.info.DeviceInfo.class
            monitor-enter(r0)
            xyz.adscope.common.info.DeviceInfo r1 = xyz.adscope.common.info.DeviceInfo.J     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.common.info.DeviceInfo r1 = new xyz.adscope.common.info.DeviceInfo     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            xyz.adscope.common.info.DeviceInfo.J = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            xyz.adscope.common.info.DeviceInfo r2 = xyz.adscope.common.info.DeviceInfo.J
            return r2
    }

    public java.lang.String getAv() {
            r1 = this;
            java.lang.String r0 = r1.F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getAndroidVersion()
            r1.F = r0
        Le:
            java.lang.String r0 = r1.F
            return r0
    }

    public java.lang.String getBootMark() {
            r1 = this;
            java.lang.String r0 = r1.t
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getDeviceBootMark()
            r1.t = r0
        Le:
            java.lang.String r0 = r1.t
            return r0
    }

    public java.lang.String getBrand() {
            r1 = this;
            java.lang.String r0 = r1.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getBrand()
            r1.f = r0
        Le:
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String getCarrier() {
            r1 = this;
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.a
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getCarrier(r0)
            r1.j = r0
        L10:
            java.lang.String r0 = r1.j
            return r0
    }

    public java.lang.String getConnectType() {
            r2 = this;
            java.lang.String r0 = r2.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r2.a
            int r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getConnectType(r1)
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.k = r0
        L21:
            java.lang.String r0 = r2.k
            return r0
    }

    public java.lang.String getCountry() {
            r1 = this;
            java.lang.String r0 = r1.C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.a
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getCountry(r0)
            r1.C = r0
        L10:
            java.lang.String r0 = r1.C
            return r0
    }

    public int getCountry_CN() {
            r2 = this;
            int r0 = r2.G
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getCountryCN(r0)
            r2.G = r0
        Ld:
            int r0 = r2.G
            return r0
    }

    public java.lang.String getDensity() {
            r2 = this;
            java.lang.String r0 = r2.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r2.a
            float r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getDensity(r1)
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.B = r0
        L21:
            java.lang.String r0 = r2.B
            return r0
    }

    public java.lang.String getDeviceName() {
            r1 = this;
            java.lang.String r0 = r1.E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.a
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getDeviceName(r0)
            r1.E = r0
        L10:
            java.lang.String r0 = r1.E
            return r0
    }

    public int getDeviceType() {
            r2 = this;
            int r0 = r2.d
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getDeviceType(r0)
            r2.d = r0
        Ld:
            int r0 = r2.d
            return r0
    }

    public java.lang.String getFileMark() {
            r1 = this;
            java.lang.String r0 = r1.D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getFileMark()
            r1.D = r0
        Le:
            java.lang.String r0 = r1.D
            return r0
    }

    public java.lang.String getGaid() {
            r2 = this;
            java.lang.String r0 = r2.y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L12
            android.content.Context r0 = r2.a
            java.lang.String r1 = xyz.adscope.common.constants.CommonConstants.DEVICE_GAID_KEY
            java.lang.String r0 = xyz.adscope.common.sp.CommonSpUtil.getString(r0, r1)
            r2.y = r0
        L12:
            java.lang.String r0 = r2.y
            return r0
    }

    public java.lang.String getHardDiskSize() {
            r1 = this;
            java.lang.String r0 = r1.w
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getHardDisk()
            r1.w = r0
        Le:
            java.lang.String r0 = r1.w
            return r0
    }

    public java.lang.String getHmsCoreVersion() {
            r1 = this;
            java.lang.String r0 = r1.H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.a
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getHmsCoreVersion(r0)
            r1.H = r0
        L10:
            java.lang.String r0 = r1.H
            return r0
    }

    public int getIsDevelop() {
            r2 = this;
            int r0 = r2.I
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.isDevelop(r0)
            r2.I = r0
        Ld:
            int r0 = r2.I
            return r0
    }

    public java.lang.String getLanguage() {
            r1 = this;
            java.lang.String r0 = r1.l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getLanguage()
            r1.l = r0
        Le:
            java.lang.String r0 = r1.l
            return r0
    }

    public java.lang.String getManufacturer() {
            r1 = this;
            java.lang.String r0 = r1.e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getManufacturer()
            r1.e = r0
        Le:
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String getModel() {
            r1 = this;
            java.lang.String r0 = r1.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getModel()
            r1.g = r0
        Le:
            java.lang.String r0 = r1.g
            return r0
    }

    public java.lang.String getOaid() {
            r2 = this;
            java.lang.String r0 = r2.x
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L12
            android.content.Context r0 = r2.a
            java.lang.String r1 = xyz.adscope.common.constants.CommonConstants.DEVICE_OAID_KEY
            java.lang.String r0 = xyz.adscope.common.sp.CommonSpUtil.getString(r0, r1)
            r2.x = r0
        L12:
            java.lang.String r0 = r2.x
            return r0
    }

    public int getOrientation() {
            r2 = this;
            int r0 = r2.q
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getOrientation(r0)
            r2.q = r0
        Ld:
            int r0 = r2.q
            return r0
    }

    public java.lang.String getOs() {
            r2 = this;
            java.lang.String r0 = r2.h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getOs()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.h = r0
        L1f:
            java.lang.String r0 = r2.h
            return r0
    }

    public java.lang.String getOsVersion() {
            r1 = this;
            java.lang.String r0 = r1.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getOsVersion()
            r1.i = r0
        Le:
            java.lang.String r0 = r1.i
            return r0
    }

    public java.lang.String getPhysicalMemory() {
            r1 = this;
            java.lang.String r0 = r1.v
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.a
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getPhysicalMemory(r0)
            r1.v = r0
        L10:
            java.lang.String r0 = r1.v
            return r0
    }

    public float getPpi() {
            r2 = this;
            float r0 = r2.s
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lf
            android.content.Context r0 = r2.a
            float r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getPPI(r0)
            r2.s = r0
        Lf:
            float r0 = r2.s
            return r0
    }

    public float getPxRation() {
            r2 = this;
            float r0 = r2.r
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lf
            android.content.Context r0 = r2.a
            float r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getPxRatio(r0)
            r2.r = r0
        Lf:
            float r0 = r2.r
            return r0
    }

    public int getResolutionHeight() {
            r2 = this;
            int r0 = r2.o
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getScreenHeight(r0)
            r2.o = r0
        Ld:
            int r0 = r2.o
            return r0
    }

    public int getResolutionWidth() {
            r2 = this;
            int r0 = r2.p
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getScreenWidth(r0)
            r2.p = r0
        Ld:
            int r0 = r2.p
            return r0
    }

    public int getScreenHeight() {
            r2 = this;
            int r0 = r2.m
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getScreenHeightDp(r0)
            r2.m = r0
        Ld:
            int r0 = r2.m
            return r0
    }

    public int getScreenWidth() {
            r2 = this;
            int r0 = r2.n
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.a
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getScreenWidthDp(r0)
            r2.n = r0
        Ld:
            int r0 = r2.n
            return r0
    }

    public java.lang.String getSdkid() {
            r1 = this;
            java.lang.String r0 = r1.A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.a
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getSdkId(r0)
            r1.A = r0
        L10:
            java.lang.String r0 = r1.A
            return r0
    }

    public long getTimeStamp() {
            r2 = this;
            long r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getTimeStamp()
            return r0
    }

    public java.lang.String getTimeZone() {
            r1 = this;
            java.lang.String r0 = r1.z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getTimeZone()
            r1.z = r0
        Le:
            java.lang.String r0 = r1.z
            return r0
    }

    public java.lang.String getUpdateMark() {
            r1 = this;
            java.lang.String r0 = r1.u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getDeviceUpdateMark()
            r1.u = r0
        Le:
            java.lang.String r0 = r1.u
            return r0
    }

    public java.lang.String getUserAgent() {
            r1 = this;
            java.lang.String r0 = r1.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.a
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getUserAgent(r0)
            r1.c = r0
        L10:
            java.lang.String r0 = r1.c
            return r0
    }

    public void setAv(java.lang.String r1) {
            r0 = this;
            r0.F = r1
            return
    }

    public void setBootMark(java.lang.String r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setBrand(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setCarrier(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setConnectType(java.lang.String r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setCountry(java.lang.String r1) {
            r0 = this;
            r0.C = r1
            return
    }

    public void setCountry_CN(int r1) {
            r0 = this;
            r0.G = r1
            return
    }

    public void setDensity(java.lang.String r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void setDeviceName(java.lang.String r1) {
            r0 = this;
            r0.E = r1
            return
    }

    public void setDeviceType(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setFileMark(java.lang.String r1) {
            r0 = this;
            r0.D = r1
            return
    }

    public void setGaid(java.lang.String r1) {
            r0 = this;
            r0.y = r1
            return
    }

    public void setHardDiskSize(java.lang.String r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void setHmsCoreVersion(java.lang.String r1) {
            r0 = this;
            r0.H = r1
            return
    }

    public void setIsDevelop(int r1) {
            r0 = this;
            r0.I = r1
            return
    }

    public void setLanguage(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setManufacturer(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setModel(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setOaid(java.lang.String r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void setOs(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setOsVersion(java.lang.String r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setPhysicalMemory(java.lang.String r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public void setPpi(float r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public void setPxRation(float r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void setResolutionHeight(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setResolutionWidth(int r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setScreenHeight(int r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setScreenWidth(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setSdkid(java.lang.String r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void setTimeStamp(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setTimeZone(java.lang.String r1) {
            r0 = this;
            r0.z = r1
            return
    }

    public void setUpdateMark(java.lang.String r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public void setUserAgent(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
