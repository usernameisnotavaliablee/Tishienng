package xyz.adscope.amps.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSConfigRequestInfo {
    private static xyz.adscope.amps.config.AMPSConfigRequestInfo mInstance;
    private xyz.adscope.amps.model.config.request.AMPSConfigRequestModel configureRequestModel;
    private android.content.Context context;
    public boolean isInit;

    private AMPSConfigRequestInfo(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInit = r0
            r1.context = r2
            return
    }

    public static xyz.adscope.amps.config.AMPSConfigRequestInfo getInstance(android.content.Context r2) {
            xyz.adscope.amps.config.AMPSConfigRequestInfo r0 = xyz.adscope.amps.config.AMPSConfigRequestInfo.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.amps.config.AMPSConfigRequestInfo> r0 = xyz.adscope.amps.config.AMPSConfigRequestInfo.class
            monitor-enter(r0)
            xyz.adscope.amps.config.AMPSConfigRequestInfo r1 = xyz.adscope.amps.config.AMPSConfigRequestInfo.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.amps.config.AMPSConfigRequestInfo r1 = new xyz.adscope.amps.config.AMPSConfigRequestInfo     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.config.AMPSConfigRequestInfo.mInstance = r1     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.config.AMPSConfigRequestInfo r2 = xyz.adscope.amps.config.AMPSConfigRequestInfo.mInstance
            return r2
    }

    public xyz.adscope.amps.model.config.request.AMPSConfigRequestModel getConfigureRequestModel() {
            r1 = this;
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r0 = r1.configureRequestModel
            return r0
    }

    public xyz.adscope.amps.config.AMPSConfigRequestInfo init(xyz.adscope.amps.init.AMPSInitConfig r6) {
            r5 = this;
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r0 = new xyz.adscope.amps.model.config.request.AMPSConfigRequestModel
            r0.<init>()
            r5.configureRequestModel = r0
            xyz.adscope.amps.model.config.request.AppModel r0 = new xyz.adscope.amps.model.config.request.AppModel
            r0.<init>()
            java.lang.String r1 = r6.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L21
            java.lang.String r1 = r6.getAppId()
            r0.setAppId(r1)
        L21:
            java.lang.String r1 = r6.getAppName()
            r0.setName(r1)
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = ""
            if (r1 == 0) goto L8e
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = xyz.adscope.common.info.AppInfo.getAppVersionName(r1)
            r0.setVersion(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            xyz.adscope.amps.manager.AMPSSDKManager r3 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r3 = r3.getContext()
            long r3 = xyz.adscope.common.info.AppInfo.getInstallDate(r3)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setInstall(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            xyz.adscope.amps.manager.AMPSSDKManager r3 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r3 = r3.getContext()
            long r3 = xyz.adscope.common.info.AppInfo.getLastUpdateTime(r3)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setUpdate(r1)
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = xyz.adscope.common.info.AppInfo.getPackName(r1)
            r0.setBundleid(r1)
        L8e:
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r1 = r5.configureRequestModel
            r1.setApp(r0)
            android.content.Context r0 = r5.context
            xyz.adscope.common.info.DeviceInfo r0 = xyz.adscope.common.info.DeviceInfo.getInstance(r0)
            xyz.adscope.amps.model.config.request.DeviceModel r1 = new xyz.adscope.amps.model.config.request.DeviceModel
            r1.<init>()
            if (r0 == 0) goto L190
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r0.getDeviceType()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.setType(r3)
            java.lang.String r3 = r0.getDeviceName()
            r1.setName(r3)
            java.lang.String r3 = r0.getSdkid()
            r1.setSaid(r3)
            java.lang.String r3 = r0.getOs()
            r1.setOs(r3)
            java.lang.String r3 = r0.getCountry()
            r1.setCountry(r3)
            java.lang.String r3 = r0.getTimeZone()
            r1.setZone(r3)
            java.lang.String r3 = r0.getLanguage()
            r1.setLang(r3)
            java.lang.String r3 = r0.getConnectType()
            r1.setContype(r3)
            java.lang.String r3 = r0.getCarrier()
            r1.setCarrier(r3)
            java.lang.String r3 = r0.getOsVersion()
            r1.setOsv(r3)
            java.lang.String r3 = r6.getCustomOAID()
            r1.setCoaid(r3)
            java.lang.String r3 = r6.getCustomGAID()
            r1.setCgaid(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r0.getResolutionWidth()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.setW(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r0.getResolutionHeight()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.setH(r3)
            java.lang.String r3 = r0.getManufacturer()
            r1.setMake(r3)
            java.lang.String r3 = r0.getBrand()
            r1.setBrand(r3)
            java.lang.String r3 = r1.getModel()
            r1.setModel(r3)
            java.lang.String r3 = r0.getBootMark()
            r1.setBootMark(r3)
            java.lang.String r3 = r0.getUpdateMark()
            r1.setUpdateMark(r3)
            r1.setSysUpdateMark(r2)
            java.lang.String r2 = r0.getFileMark()
            r1.setFileMark(r2)
            java.lang.String r2 = r0.getHardDiskSize()
            r1.setHarddiskSize(r2)
            java.lang.String r2 = r0.getPhysicalMemory()
            r1.setPhysicalMemory(r2)
            boolean r2 = r6.isPersonalRecommend()
            if (r2 == 0) goto L184
            java.lang.String r2 = "1"
            r1.setLmt(r2)
            java.lang.String r2 = r0.getOaid()
            r1.setOaid(r2)
            java.lang.String r2 = r0.getGaid()
            r1.setGaid(r2)
            goto L189
        L184:
            java.lang.String r2 = "0"
            r1.setLmt(r2)
        L189:
            int r0 = r0.getIsDevelop()
            r1.setIsDevelop(r0)
        L190:
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r0 = r5.configureRequestModel
            r0.setDevice(r1)
            xyz.adscope.amps.model.config.request.UserModel r0 = new xyz.adscope.amps.model.config.request.UserModel
            r0.<init>()
            java.lang.String r1 = r6.getUserId()
            r0.setId(r1)
            java.lang.String r1 = r6.getCity()
            r0.setCity(r1)
            java.lang.String r1 = r6.getProvince()
            r0.setProvince(r1)
            java.lang.String r1 = r6.getRegion()
            r0.setRegion(r1)
            java.lang.String r6 = r6.getOptionInfo()
            r0.setCustomData(r6)
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r6 = r5.configureRequestModel
            r6.setUser(r0)
            xyz.adscope.amps.model.config.request.SdkModel r6 = new xyz.adscope.amps.model.config.request.SdkModel
            r6.<init>()
            java.lang.String r0 = "5.1.0.32"
            r6.setVersion(r0)
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r0 = r5.configureRequestModel
            r0.setSdk(r6)
            xyz.adscope.amps.config.AMPSConfigRequestInfo r6 = xyz.adscope.amps.config.AMPSConfigRequestInfo.mInstance
            return r6
    }

    public boolean isInit() {
            r1 = this;
            boolean r0 = r1.isInit
            return r0
    }
}
