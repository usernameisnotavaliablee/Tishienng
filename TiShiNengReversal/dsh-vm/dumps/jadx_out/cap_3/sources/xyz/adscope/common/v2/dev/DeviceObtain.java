package xyz.adscope.common.v2.dev;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class DeviceObtain implements xyz.adscope.common.v2.dev.IDeviceInterface {
    private java.lang.String av;
    private java.lang.String bootMark;
    private java.lang.String brand;
    private java.lang.String carrier;
    private int connectType;
    private java.lang.String country;
    private int country_CN;
    private float density;
    private java.lang.String deviceName;
    private int deviceType;
    private java.lang.String fileMark;
    private java.lang.String hardDiskSize;
    private java.lang.String hmsCoreVersion;
    private java.lang.String hmsStoreVersion;
    private java.lang.String language;
    private final android.content.Context mContext;
    private java.lang.String mHonorOAID;
    private java.lang.String manufacturer;
    private java.lang.String model;
    private java.lang.String oaid;
    private int orientation;
    private final int os;
    private java.lang.String osVersion;
    private java.lang.String physicalMemory;
    private int ppi;
    private float pxRation;
    private int resolutionHeight;
    private int resolutionWidth;
    private java.lang.String romVersion;
    private int screenHeight;
    private int screenWidth;
    private java.lang.String timeZone;
    private java.lang.String updateMark;
    private java.lang.String userAgent;

    DeviceObtain(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.country_CN = r0
            r1.mContext = r2
            int r2 = xyz.adscope.common.v2.dev.info.DeviceUtil.getOS()
            r1.os = r2
            return
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getAndroidRelease() {
            r1 = this;
            java.lang.String r0 = r1.osVersion
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getAndroidRelease()
            r1.osVersion = r0
        Le:
            java.lang.String r0 = r1.osVersion
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getAndroidVersion() {
            r2 = this;
            java.lang.String r0 = r2.av
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = xyz.adscope.common.v2.dev.info.DeviceUtil.getAndroidVersion()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.av = r0
        L1f:
            java.lang.String r0 = r2.av
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getBrand() {
            r1 = this;
            java.lang.String r0 = r1.brand
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getBrand()
            r1.brand = r0
        Le:
            java.lang.String r0 = r1.brand
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getCarrier() {
            r1 = this;
            java.lang.String r0 = r1.carrier
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getCarrier(r0)
            r1.carrier = r0
        L10:
            java.lang.String r0 = r1.carrier
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getConnectType() {
            r1 = this;
            int r0 = r1.connectType
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.NetworkUtil.getConnectType(r0)
            r1.connectType = r0
        Lc:
            int r0 = r1.connectType
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getCountryCN() {
            r2 = this;
            int r0 = r2.country_CN
            r1 = -1
            if (r0 != r1) goto Ld
            android.content.Context r0 = r2.mContext
            int r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getCountryCN(r0)
            r2.country_CN = r0
        Ld:
            int r0 = r2.country_CN
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getCountryCode() {
            r1 = this;
            java.lang.String r0 = r1.country
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getCountryCode(r0)
            r1.country = r0
        L10:
            java.lang.String r0 = r1.country
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public float getDensity() {
            r2 = this;
            float r0 = r2.density
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            android.content.Context r0 = r2.mContext
            float r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getDensity(r0)
            r2.density = r0
        Lf:
            float r0 = r2.density
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getDensityDpi() {
            r1 = this;
            int r0 = r1.ppi
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getDensityDpi(r0)
            r1.ppi = r0
        Lc:
            int r0 = r1.ppi
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getDeveloperState() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "development_settings_enabled"
            r2 = 0
            int r0 = android.provider.Settings.Global.getInt(r0, r1, r2)
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getDeveloperTag() {
            r2 = this;
            int r0 = r2.getDeveloperState()
            r1 = 1
            if (r0 == r1) goto L10
            boolean r0 = xyz.adscope.common.v2.dev.info.NetworkUtil.isVPNConnected()
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            return r0
        L10:
            return r1
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getDeviceName() {
            r1 = this;
            java.lang.String r0 = r1.deviceName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getDeviceName(r0)
            r1.deviceName = r0
        L10:
            java.lang.String r0 = r1.deviceName
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getDeviceType() {
            r1 = this;
            int r0 = r1.deviceType
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getDeviceType(r0)
            r1.deviceType = r0
        Lc:
            int r0 = r1.deviceType
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getDeviceUpdateMark() {
            r1 = this;
            java.lang.String r0 = r1.updateMark
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getDeviceUpdateMark()
            r1.updateMark = r0
        Le:
            java.lang.String r0 = r1.updateMark
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getFileMark() {
            r3 = this;
            java.lang.String r0 = r3.fileMark
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = xyz.adscope.common.v2.dev.info.DeviceUtil.getFileMark()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.fileMark = r0
        L1f:
            java.lang.String r0 = r3.fileMark
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getGAID() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getHardDisk() {
            r1 = this;
            java.lang.String r0 = r1.hardDiskSize
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getHardDisk()
            r1.hardDiskSize = r0
        Le:
            java.lang.String r0 = r1.hardDiskSize
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getHmsCoreVersion() {
            r1 = this;
            java.lang.String r0 = r1.hmsCoreVersion
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.PackageUtil.getHmsCoreVersionCode(r0)
            r1.hmsCoreVersion = r0
        L10:
            java.lang.String r0 = r1.hmsCoreVersion
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getHmsStoreVersion() {
            r1 = this;
            java.lang.String r0 = r1.hmsStoreVersion
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.PackageUtil.getHmsStoreVersionCode(r0)
            r1.hmsStoreVersion = r0
        L10:
            java.lang.String r0 = r1.hmsStoreVersion
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getHonorOAID() {
            r2 = this;
            java.lang.String r0 = r2.mHonorOAID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L14
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.getInstance()
            android.content.Context r1 = r2.mContext
            java.lang.String r0 = r0.getHonorOAID(r1)
            r2.mHonorOAID = r0
        L14:
            java.lang.String r0 = r2.mHonorOAID
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getLanguage() {
            r1 = this;
            java.lang.String r0 = r1.language
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getLanguage()
            r1.language = r0
        Le:
            java.lang.String r0 = r1.language
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getManufacturer() {
            r1 = this;
            java.lang.String r0 = r1.manufacturer
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getManufacturer()
            r1.manufacturer = r0
        Le:
            java.lang.String r0 = r1.manufacturer
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getModel() {
            r1 = this;
            java.lang.String r0 = r1.model
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getModel()
            r1.model = r0
        Le:
            java.lang.String r0 = r1.model
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getOAID() {
            r2 = this;
            java.lang.String r0 = r2.oaid
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L14
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.getInstance()
            android.content.Context r1 = r2.mContext
            java.lang.String r0 = r0.getOAID(r1)
            r2.oaid = r0
        L14:
            java.lang.String r0 = r2.oaid
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getOMERomVersion() {
            r1 = this;
            java.lang.String r0 = r1.romVersion
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            xyz.adscope.common.v2.dev.info.OEMSystemInfo r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.getInstance()
            r0.initializeOEMInfo()
            xyz.adscope.common.v2.dev.info.OEMSystemInfo r0 = xyz.adscope.common.v2.dev.info.OEMSystemInfo.getInstance()
            java.lang.String r0 = r0.getRomVersion()
            r1.romVersion = r0
        L19:
            java.lang.String r0 = r1.romVersion
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getOrientation() {
            r1 = this;
            int r0 = r1.orientation
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getOrientation(r0)
            r1.orientation = r0
        Lc:
            int r0 = r1.orientation
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getOs() {
            r1 = this;
            int r0 = r1.os
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getPhysicalMemory() {
            r1 = this;
            java.lang.String r0 = r1.physicalMemory
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getPhysicalMemory(r0)
            r1.physicalMemory = r0
        L10:
            java.lang.String r0 = r1.physicalMemory
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getPromptTag() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.SettingCheckCompilation.checkIntentPrompt(r0)
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getResolutionHeight() {
            r1 = this;
            int r0 = r1.resolutionHeight
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenHeightDp(r0)
            r1.resolutionHeight = r0
        Lc:
            int r0 = r1.resolutionHeight
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getResolutionWidth() {
            r1 = this;
            int r0 = r1.resolutionWidth
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenWidthDp(r0)
            r1.resolutionWidth = r0
        Lc:
            int r0 = r1.resolutionWidth
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getScreenHeightPX() {
            r1 = this;
            int r0 = r1.screenHeight
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenHeight(r0)
            r1.screenHeight = r0
        Lc:
            int r0 = r1.screenHeight
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public int getScreenWidthPX() {
            r1 = this;
            int r0 = r1.screenWidth
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            int r0 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenWidth(r0)
            r1.screenWidth = r0
        Lc:
            int r0 = r1.screenWidth
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getTimeZone() {
            r1 = this;
            java.lang.String r0 = r1.timeZone
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.getTimeZone()
            r1.timeZone = r0
        Le:
            java.lang.String r0 = r1.timeZone
            return r0
    }

    @Override // xyz.adscope.common.v2.dev.IDeviceInterface
    public java.lang.String getUserAgent() {
            r2 = this;
            java.lang.String r0 = r2.userAgent
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L14
            xyz.adscope.common.v2.dev.info.UserAgentHelper r0 = xyz.adscope.common.v2.dev.info.UserAgentHelper.getInstance()
            android.content.Context r1 = r2.mContext
            java.lang.String r0 = r0.getUserAgent(r1)
            r2.userAgent = r0
        L14:
            java.lang.String r0 = r2.userAgent
            return r0
    }
}
