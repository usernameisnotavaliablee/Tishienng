package xyz.adscope.amps.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSReportLoader implements xyz.adscope.amps.report.inter.IReportInterface {
    static final java.lang.String KEY_TABLE_NAME = "amps_event_report_table";
    private static xyz.adscope.amps.report.AMPSReportLoader ampsReportLoader;
    private int INIT_TIME;
    private int PERIOD_TIME;
    private xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager ampsDataBaseManager;
    private xyz.adscope.amps.model.AMPSGlobalModel ampsGlobalModel;
    private volatile java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> ampsReportConfigModelMap;
    private volatile java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> ampsTempReportMap;
    private volatile java.util.Map<java.lang.String, xyz.adscope.amps.report.AMPSReportTimer> ampsTempReportTimerMap;




    private AMPSReportLoader() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.ampsReportConfigModelMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.ampsTempReportMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.ampsTempReportTimerMap = r0
            r0 = 300(0x12c, float:4.2E-43)
            r3.INIT_TIME = r0
            r3.PERIOD_TIME = r0
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L3a
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = new xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r3.ampsDataBaseManager = r0
            java.lang.String r1 = "amps_event_report_table"
            java.lang.Class<xyz.adscope.amps.report.model.AMPSReportDBModel> r2 = xyz.adscope.amps.report.model.AMPSReportDBModel.class
            r0.setTableNameAndModel(r1, r2)
        L3a:
            return
    }

    public static /* synthetic */ void a(xyz.adscope.amps.report.AMPSReportLoader r0, java.lang.String r1, java.lang.String r2) {
            r0.reportInitEvent(r1, r2)
            return
    }

    static /* synthetic */ void access$000(xyz.adscope.amps.report.AMPSReportLoader r0) {
            r0.deleteOutTimeData()
            return
    }

    static /* synthetic */ java.util.List access$100(xyz.adscope.amps.report.AMPSReportLoader r0) {
            java.util.List r0 = r0.getEventCodeReportDBModels()
            return r0
    }

    static /* synthetic */ java.util.List access$200(xyz.adscope.amps.report.AMPSReportLoader r0, java.util.List r1) {
            java.util.List r0 = r0.dbModelsToRequestModels(r1)
            return r0
    }

    static /* synthetic */ void access$300(xyz.adscope.amps.report.AMPSReportLoader r0, java.util.List r1, java.lang.String r2) {
            r0.sendReportLocal(r1, r2)
            return
    }

    static /* synthetic */ void access$400(xyz.adscope.amps.report.AMPSReportLoader r0, java.lang.String r1) {
            r0.sendReportLog(r1)
            return
    }

    public static /* synthetic */ void b(xyz.adscope.amps.report.AMPSReportLoader r2, java.lang.String r3, java.lang.String r4, java.util.List r5) {
            r2.getClass()
            xyz.adscope.amps.tool.request.AMPSHttpRequest r0 = new xyz.adscope.amps.tool.request.AMPSHttpRequest
            r0.<init>()
            xyz.adscope.amps.report.AMPSReportLoader$3 r1 = new xyz.adscope.amps.report.AMPSReportLoader$3
            r1.<init>(r2, r5)
            r0.requestWithPostMethod(r3, r4, r1)
            return
    }

    private xyz.adscope.amps.report.model.request.AMPSReportRequestModel buildAMPSRequestReportModel(xyz.adscope.amps.model.AMPSCycleModel r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.inter.IAMPSInitInterface r0 = r0.getIAMPSInitInterface()
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.getGlobalModel()
            r7.ampsGlobalModel = r0
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.AMPSInitConfig r0 = r0.getAMPSAdConfig()
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r1 = new xyz.adscope.amps.report.model.request.AMPSReportRequestModel
            r1.<init>()
            xyz.adscope.amps.report.model.request.EventModel r2 = new xyz.adscope.amps.report.model.request.EventModel
            r2.<init>()
            java.lang.String r3 = "5.0.0"
            r2.setLogVersion(r3)
            java.lang.String r3 = "AMPS"
            r2.setAccessKey(r3)
            java.lang.String r3 = "mediation5"
            r2.setCustomId(r3)
            java.lang.String r3 = "xyz.adscope.amps"
            r2.setCustomLogger(r3)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            java.lang.String r4 = ""
            if (r3 == 0) goto L118
            java.lang.String r3 = r3.getStartId()
            r2.setStartId(r3)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            java.lang.String r3 = r3.getErrorCode()
            r2.setErrorCode(r3)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            java.lang.String r3 = r3.getErrorMsg()
            r2.setErrorInfo(r3)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            r3.setErrorCode(r4)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            r3.setErrorMsg(r4)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            java.lang.String r3 = r3.getAppId()
            r2.setMediationAppId(r3)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            java.lang.String r3 = r3.getEventId()
            r2.setEventId(r3)
            xyz.adscope.amps.report.AMPSEventReportCode r3 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_INIT_START_CODE
            java.lang.String r3 = r3.getCodeStr()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto La4
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            long r5 = r3.getInitStartTime()
            r2.setEventTime(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            xyz.adscope.amps.model.AMPSGlobalModel r5 = r7.ampsGlobalModel
            long r5 = r5.getInitStartTime()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setLogTime(r3)
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            r5 = 0
            r3.setInitStartTime(r5)
            goto Lc5
        La4:
            xyz.adscope.amps.model.AMPSGlobalModel r3 = r7.ampsGlobalModel
            long r5 = r3.getEventTime()
            r2.setEventTime(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            xyz.adscope.amps.model.AMPSGlobalModel r5 = r7.ampsGlobalModel
            long r5 = r5.getLogTime()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setLogTime(r3)
        Lc5:
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto Lce
            r2.setRoundTripTime(r10)
        Lce:
            xyz.adscope.amps.model.AMPSGlobalModel r10 = r7.ampsGlobalModel
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r10 = r10.getConfigureResponseModel()
            if (r10 == 0) goto L118
            xyz.adscope.amps.model.AMPSGlobalModel r10 = r7.ampsGlobalModel
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r10 = r10.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.ConfigModel r3 = r10.getConfig()
            if (r3 == 0) goto Lf0
            java.lang.String r5 = r3.getCustomData()
            r2.setCfgCustomData(r5)
            java.lang.String r3 = r3.getVersion()
            r2.setCfgVersion(r3)
        Lf0:
            xyz.adscope.amps.model.config.response.EventModel r3 = r10.getEvent()
            if (r3 == 0) goto L104
            java.lang.String r5 = r3.getCustomData()
            r2.setEventCustomData(r5)
            java.lang.String r3 = r3.getVersion()
            r2.setEventVersion(r3)
        L104:
            xyz.adscope.amps.model.config.response.MediationModel r10 = r10.getMediation()
            if (r10 == 0) goto L118
            java.lang.String r3 = r10.getCustomData()
            r2.setMdCustomData(r3)
            java.lang.String r10 = r10.getVersion()
            r2.setMdVersion(r10)
        L118:
            if (r8 == 0) goto L1b5
            java.lang.String r10 = r8.getSessionId()
            r2.setSessionId(r10)
            java.lang.String r10 = r8.getMediationAppId()
            r2.setMediationAppId(r10)
            java.lang.String r10 = r8.getMediationSpaceId()
            r2.setMediationSpaceId(r10)
            java.lang.String r10 = r8.getAdSourceId()
            r2.setAdSourceId(r10)
            java.lang.String r10 = r8.getAdSourceAppId()
            r2.setAdSourceAppId(r10)
            java.lang.String r10 = r8.getAdSourceSpaceId()
            r2.setAdSourceSpaceId(r10)
            java.lang.String r10 = r8.getEcpm()
            r2.setEcpm(r10)
            java.lang.String r10 = r8.getLogTime()
            r2.setLogTime(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            long r5 = r8.getRoundTripTime()
            r10.append(r5)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            r2.setRoundTripTime(r10)
            java.lang.String r10 = r8.getBidType()
            r2.setBiddingType(r10)
            long r5 = r8.getEventTime()
            r2.setEventTime(r5)
            java.lang.String r10 = r8.getAdSourceCustomData()
            r2.setAdsCustomData(r10)
            java.lang.String r10 = r8.getErrorCode()
            r2.setErrorCode(r10)
            java.lang.String r10 = r8.getErrorMsg()
            r2.setErrorInfo(r10)
            java.lang.String r10 = r8.getSpaceCustomData()
            r2.setMdCustomData(r10)
            java.lang.String r10 = r8.getIsHitAuction()
            r2.setIsHitAuction(r10)
            java.lang.String r10 = r8.getIsLastLook()
            r2.setIsLastLook(r10)
            java.lang.String r10 = r8.getBidStrategyCustomData()
            r2.setBidStrategyCustomData(r10)
            java.lang.String r10 = r8.getNoticePrice()
            r2.setNoticePrice(r10)
            java.lang.String r10 = r8.getLossReason()
            r2.setLossReason(r10)
        L1b5:
            r2.setEventCode(r9)
            r1.setEventModel(r2)
            xyz.adscope.amps.manager.AMPSSDKManager r9 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r9 = r9.getContext()
            xyz.adscope.amps.report.model.request.AppModel r10 = new xyz.adscope.amps.report.model.request.AppModel
            r10.<init>()
            if (r9 == 0) goto L20b
            java.lang.String r2 = xyz.adscope.common.info.AppInfo.getPackName(r9)
            r10.setBundleId(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r5 = xyz.adscope.common.info.AppInfo.getInstallDate(r9)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r10.setInstall(r2)
            java.lang.String r2 = xyz.adscope.common.info.AppInfo.getAppName(r9)
            r10.setName(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r5 = xyz.adscope.common.info.AppInfo.getLastUpdateTime(r9)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r10.setUpdate(r2)
            java.lang.String r2 = xyz.adscope.common.info.AppInfo.getAppVersionName(r9)
            r10.setVersion(r2)
        L20b:
            r1.setApp(r10)
            xyz.adscope.amps.report.model.request.DeviceModel r10 = new xyz.adscope.amps.report.model.request.DeviceModel
            r10.<init>()
            if (r9 == 0) goto L21a
            xyz.adscope.common.info.DeviceInfo r9 = xyz.adscope.common.info.DeviceInfo.getInstance(r9)
            goto L21b
        L21a:
            r9 = 0
        L21b:
            if (r9 == 0) goto L327
            java.lang.String r2 = r9.getSdkid()
            r10.setSaid(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r9.getDeviceType()
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r10.setType(r2)
            java.lang.String r2 = r9.getDeviceName()
            r10.setDeviceName(r2)
            java.lang.String r2 = r9.getBrand()
            r10.setBrand(r2)
            java.lang.String r2 = r9.getModel()
            r10.setModel(r2)
            java.lang.String r2 = r9.getOs()
            r10.setOs(r2)
            java.lang.String r2 = r9.getCountry()
            r10.setCountry(r2)
            java.lang.String r2 = r9.getTimeZone()
            r10.setZone(r2)
            java.lang.String r2 = r9.getLanguage()
            r10.setLang(r2)
            java.lang.String r2 = r9.getConnectType()
            r10.setContype(r2)
            java.lang.String r2 = r9.getCarrier()
            r10.setCarrier(r2)
            java.lang.String r2 = r9.getOsVersion()
            r10.setOsv(r2)
            if (r0 == 0) goto L295
            boolean r2 = r0.isPersonalRecommend()
            java.lang.String r3 = r0.getCustomOAID()
            r10.setCoaid(r3)
            java.lang.String r3 = r0.getCustomGAID()
            r10.setCgaid(r3)
            goto L296
        L295:
            r2 = 1
        L296:
            if (r2 == 0) goto L2ba
            java.lang.String r2 = r9.getOaid()
            r10.setOaid(r2)
            java.lang.String r2 = r9.getOaid()
            r10.setOoaid(r2)
            java.lang.String r2 = r9.getGaid()
            r10.setGaid(r2)
            java.lang.String r2 = r9.getGaid()
            r10.setOgaid(r2)
            java.lang.String r2 = "1"
            r10.setLmt(r2)
            goto L2bf
        L2ba:
            java.lang.String r2 = "0"
            r10.setLmt(r2)
        L2bf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r9.getResolutionWidth()
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r10.setW(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r9.getResolutionHeight()
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r10.setH(r2)
            java.lang.String r2 = r9.getManufacturer()
            r10.setMake(r2)
            java.lang.String r2 = r9.getBootMark()
            r10.setBootMark(r2)
            java.lang.String r2 = r9.getUpdateMark()
            r10.setUpdateMark(r2)
            java.lang.String r2 = r9.getFileMark()
            r10.setFileMark(r2)
            java.lang.String r2 = r9.getUpdateMark()
            r10.setSysUpdateMark(r2)
            java.lang.String r2 = r9.getHardDiskSize()
            r10.setHarddiskSize(r2)
            java.lang.String r2 = r9.getPhysicalMemory()
            r10.setPhysicalMemory(r2)
            int r9 = r9.getIsDevelop()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r10.setIsDevelop(r9)
        L327:
            r1.setDevice(r10)
            xyz.adscope.amps.report.model.request.UserModel r9 = new xyz.adscope.amps.report.model.request.UserModel
            r9.<init>()
            if (r0 == 0) goto L33f
            java.lang.String r10 = r0.getOptionInfo()
            r9.setCustomData(r10)
            java.lang.String r10 = r0.getUserId()
            r9.setUserId(r10)
        L33f:
            r1.setUser(r9)
            xyz.adscope.amps.report.model.request.SdkModel r9 = new xyz.adscope.amps.report.model.request.SdkModel
            r9.<init>()
            r7.updateSdkModelVersion(r9)
            xyz.adscope.amps.manager.AMPSSDKManager r10 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            java.lang.String r10 = r10.getSdkVersion()
            r9.setSdkVersion(r10)
            r1.setSdk(r9)
            xyz.adscope.amps.report.model.request.AdModel r9 = new xyz.adscope.amps.report.model.request.AdModel
            r9.<init>()
            java.lang.String r10 = "sdk"
            r9.setAccessType(r10)
            xyz.adscope.amps.manager.AMPSSDKManager r10 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            java.lang.String r10 = r10.getSdkVersion()
            r9.setAdSdkVersion(r10)
            if (r8 == 0) goto L3a4
            java.lang.String r10 = r8.getAdType()
            java.lang.String r10 = r7.getAdType(r10)
            r9.setAdType(r10)
            java.lang.String r10 = r8.getMaxWaitTime()
            r9.setMaxWaitTime(r10)
            java.lang.String r10 = r8.getBidType()
            r9.setBidType(r10)
            java.lang.String r10 = r8.getLoadType()
            r9.setLoadType(r10)
            java.lang.String r10 = r8.getFloorPrice()
            r9.setFloorPrice(r10)
            java.lang.String r10 = r8.getEcpm()
            r9.setExpPrice(r10)
            java.lang.String r8 = r8.getAdCount()
            r9.setQuantity(r8)
        L3a4:
            r1.setAd(r9)
            return r1
    }

    public static /* synthetic */ void c(xyz.adscope.amps.report.AMPSReportLoader r0, xyz.adscope.amps.model.AMPSCycleModel r1, java.lang.String r2) {
            r0.reportAdEvent(r1, r2)
            return
    }

    private java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> dbModelsToRequestModels(java.util.List<xyz.adscope.amps.report.model.AMPSReportDBModel> r5) {
            r4 = this;
            if (r5 == 0) goto L39
            int r0 = r5.size()
            r1 = 1
            if (r0 >= r1) goto La
            goto L39
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r5.next()
            xyz.adscope.amps.report.model.AMPSReportDBModel r1 = (xyz.adscope.amps.report.model.AMPSReportDBModel) r1
            java.lang.String r1 = r1.getEventJsonStr()
            java.lang.String r1 = xyz.adscope.common.tool.security.Base64Util.decode(r1)
            xyz.adscope.common.json.JSONParse r2 = new xyz.adscope.common.json.JSONParse
            r2.<init>()
            java.lang.Class<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r3 = xyz.adscope.amps.report.model.request.AMPSReportRequestModel.class
            java.lang.Object r1 = r2.fromJson(r1, r3)
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r1 = (xyz.adscope.amps.report.model.request.AMPSReportRequestModel) r1
            r0.add(r1)
            goto L13
        L38:
            return r0
        L39:
            r5 = 0
            return r5
    }

    private java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> deepCopyList(java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 == 0) goto L72
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto Le
            goto L72
        Le:
            java.util.Iterator r10 = r10.iterator()
        L12:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r10.next()
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r1 = (xyz.adscope.amps.report.model.request.AMPSReportRequestModel) r1
            if (r1 != 0) goto L21
            goto L12
        L21:
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r2 = new xyz.adscope.amps.report.model.request.AMPSReportRequestModel
            r2.<init>(r1)
            xyz.adscope.amps.report.model.request.EventModel r3 = new xyz.adscope.amps.report.model.request.EventModel
            xyz.adscope.amps.report.model.request.EventModel r4 = r1.getEventModel()
            r3.<init>(r4)
            xyz.adscope.amps.report.model.request.AppModel r4 = new xyz.adscope.amps.report.model.request.AppModel
            xyz.adscope.amps.report.model.request.AppModel r5 = r1.getApp()
            r4.<init>(r5)
            xyz.adscope.amps.report.model.request.DeviceModel r5 = new xyz.adscope.amps.report.model.request.DeviceModel
            xyz.adscope.amps.report.model.request.DeviceModel r6 = r1.getDevice()
            r5.<init>(r6)
            xyz.adscope.amps.report.model.request.UserModel r6 = new xyz.adscope.amps.report.model.request.UserModel
            xyz.adscope.amps.report.model.request.UserModel r7 = r1.getUser()
            r6.<init>(r7)
            xyz.adscope.amps.report.model.request.SdkModel r7 = new xyz.adscope.amps.report.model.request.SdkModel
            xyz.adscope.amps.report.model.request.SdkModel r8 = r1.getSdk()
            r7.<init>(r8)
            xyz.adscope.amps.report.model.request.AdModel r8 = new xyz.adscope.amps.report.model.request.AdModel
            xyz.adscope.amps.report.model.request.AdModel r1 = r1.getAd()
            r8.<init>(r1)
            r2.setEventModel(r3)
            r2.setApp(r4)
            r2.setUser(r6)
            r2.setDevice(r5)
            r2.setSdk(r7)
            r2.setAd(r8)
            r0.add(r2)
            goto L12
        L72:
            return r0
    }

    private xyz.adscope.amps.report.model.request.AMPSReportRequestModel deepCopyRequestModel(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r8) {
            r7 = this;
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r0 = new xyz.adscope.amps.report.model.request.AMPSReportRequestModel
            r0.<init>(r8)
            xyz.adscope.amps.report.model.request.EventModel r1 = new xyz.adscope.amps.report.model.request.EventModel
            xyz.adscope.amps.report.model.request.EventModel r2 = r8.getEventModel()
            r1.<init>(r2)
            xyz.adscope.amps.report.model.request.AppModel r2 = new xyz.adscope.amps.report.model.request.AppModel
            xyz.adscope.amps.report.model.request.AppModel r3 = r8.getApp()
            r2.<init>(r3)
            xyz.adscope.amps.report.model.request.DeviceModel r3 = new xyz.adscope.amps.report.model.request.DeviceModel
            xyz.adscope.amps.report.model.request.DeviceModel r4 = r8.getDevice()
            r3.<init>(r4)
            xyz.adscope.amps.report.model.request.UserModel r4 = new xyz.adscope.amps.report.model.request.UserModel
            xyz.adscope.amps.report.model.request.UserModel r5 = r8.getUser()
            r4.<init>(r5)
            xyz.adscope.amps.report.model.request.SdkModel r5 = new xyz.adscope.amps.report.model.request.SdkModel
            xyz.adscope.amps.report.model.request.SdkModel r6 = r8.getSdk()
            r5.<init>(r6)
            xyz.adscope.amps.report.model.request.AdModel r6 = new xyz.adscope.amps.report.model.request.AdModel
            xyz.adscope.amps.report.model.request.AdModel r8 = r8.getAd()
            r6.<init>(r8)
            r0.setEventModel(r1)
            r0.setApp(r2)
            r0.setUser(r4)
            r0.setDevice(r3)
            r0.setSdk(r5)
            r0.setAd(r6)
            return r0
    }

    private void deleteOutTimeData() {
            r4 = this;
            r0 = 3
            long r0 = xyz.adscope.amps.tool.util.AMPSDateUtil.getTimeMillisBeforeDay(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "eventTime"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = r4.ampsDataBaseManager
            if (r0 == 0) goto L31
            int r0 = r0.deleteOutTime(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "deleteOutTimeResult : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "amps_log_report"
            xyz.adscope.common.tool.LogUtil.i(r1, r0)
        L31:
            return
    }

    private void executeReport(java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r9, xyz.adscope.amps.report.model.AMPSReportConfigModel r10, java.lang.String r11) {
            r8 = this;
            java.lang.String r0 = r10.getReportURL()
            java.lang.String r10 = r10.getMacro()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        Le:
            int r3 = r9.size()
            if (r2 >= r3) goto L8d
            java.lang.Object r3 = r9.get(r2)
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r3 = (xyz.adscope.amps.report.model.request.AMPSReportRequestModel) r3
            xyz.adscope.amps.report.model.request.EventModel r4 = r3.getEventModel()
            if (r4 == 0) goto L83
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_CRASH_CODE
            java.lang.String r4 = r4.getCodeStr()
            xyz.adscope.amps.report.model.request.EventModel r5 = r3.getEventModel()
            java.lang.String r5 = r5.getEventCode()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L83
            xyz.adscope.amps.tool.crash.AMPSCrashHandler r4 = xyz.adscope.amps.tool.crash.AMPSCrashHandler.getInstance()
            java.util.List r4 = r4.getCrashData()
            if (r4 == 0) goto L8a
            int r5 = r4.size()
            if (r5 <= 0) goto L8a
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r4.next()
            xyz.adscope.amps.model.crash.AMPSCrashRequestModel r5 = (xyz.adscope.amps.model.crash.AMPSCrashRequestModel) r5
            xyz.adscope.amps.report.model.request.EventModel r6 = r3.getEventModel()
            if (r6 == 0) goto L48
            xyz.adscope.amps.report.model.request.EventModel r6 = r3.getEventModel()
            java.lang.String r7 = r5.getAffiliated()
            r6.setAffiliated(r7)
            xyz.adscope.amps.report.model.request.EventModel r6 = r3.getEventModel()
            java.lang.String r7 = r5.getException()
            r6.setException(r7)
            xyz.adscope.amps.report.model.request.EventModel r6 = r3.getEventModel()
            java.lang.String r5 = r5.getLog_time()
            r6.setLogTime(r5)
            java.lang.String r5 = xyz.adscope.amps.report.AMPSModifyMacro.modifyMacroWithModel(r3, r10)
            r1.add(r5)
            goto L48
        L83:
            java.lang.String r3 = xyz.adscope.amps.report.AMPSModifyMacro.modifyMacroWithModel(r3, r10)
            r1.add(r3)
        L8a:
            int r2 = r2 + 1
            goto Le
        L8d:
            int r10 = r1.size()
            if (r10 <= 0) goto L9a
            java.lang.String r10 = r1.toString()
            r8.sendReportRequest(r0, r10, r11, r9)
        L9a:
            return
    }

    private xyz.adscope.amps.report.model.AMPSReportConfigModel getAMPSReportLoaderModel(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r0 = r4.ampsReportConfigModelMap
            r1 = 0
            if (r0 == 0) goto L38
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r0 = r4.ampsReportConfigModelMap
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            goto L38
        Le:
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r0 = r4.ampsReportConfigModelMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L18
            java.lang.Object r5 = r2.getValue()
            xyz.adscope.amps.report.model.AMPSReportConfigModel r5 = (xyz.adscope.amps.report.model.AMPSReportConfigModel) r5
            return r5
        L37:
            return r1
        L38:
            r4.loadLogModelFromConfig()
            return r1
    }

    private java.lang.String getAdType(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L6c
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_SPLASH
            java.lang.String r1 = r0.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L17
            java.lang.String r3 = r0.getValue()
            return r3
        L17:
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_NATIVE_EXPRESS
            java.lang.String r1 = r0.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            java.lang.String r3 = r0.getValue()
            return r3
        L28:
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_NATIVE_UNIFIED
            java.lang.String r1 = r0.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L39
            java.lang.String r3 = r0.getValue()
            return r3
        L39:
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_INTERSTITIAL
            java.lang.String r1 = r0.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4a
            java.lang.String r3 = r0.getValue()
            return r3
        L4a:
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_REWARD_VIDEO
            java.lang.String r1 = r0.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5b
            java.lang.String r3 = r0.getValue()
            return r3
        L5b:
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_BANNER
            java.lang.String r1 = r0.getCode()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L6c
            java.lang.String r3 = r0.getValue()
            return r3
        L6c:
            java.lang.String r3 = ""
            return r3
    }

    private java.util.List<xyz.adscope.amps.report.model.AMPSReportDBModel> getEventCodeReportDBModels() {
            r2 = this;
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = r2.ampsDataBaseManager
            r1 = 0
            if (r0 == 0) goto La
            java.util.List r0 = r0.query(r1)
            return r0
        La:
            return r1
    }

    public static xyz.adscope.amps.report.AMPSReportLoader getInstance() {
            xyz.adscope.amps.report.AMPSReportLoader r0 = xyz.adscope.amps.report.AMPSReportLoader.ampsReportLoader
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.amps.report.AMPSReportLoader> r0 = xyz.adscope.amps.report.AMPSReportLoader.class
            monitor-enter(r0)
            xyz.adscope.amps.report.AMPSReportLoader r1 = xyz.adscope.amps.report.AMPSReportLoader.ampsReportLoader     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.amps.report.AMPSReportLoader r1 = new xyz.adscope.amps.report.AMPSReportLoader     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.report.AMPSReportLoader.ampsReportLoader = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            xyz.adscope.amps.report.AMPSReportLoader r0 = xyz.adscope.amps.report.AMPSReportLoader.ampsReportLoader
            return r0
    }

    private java.lang.String getKeyByEventCode(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r0 = r4.ampsReportConfigModelMap
            r1 = 0
            if (r0 == 0) goto L37
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r0 = r4.ampsReportConfigModelMap
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            goto L37
        Le:
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r0 = r4.ampsReportConfigModelMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L18
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L37:
            return r1
    }

    private long getTimerDuration(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L64
            xyz.adscope.amps.report.model.request.EventModel r2 = r7.getEventModel()
            if (r2 != 0) goto Lb
            goto L64
        Lb:
            xyz.adscope.amps.report.model.request.EventModel r7 = r7.getEventModel()
            java.lang.String r7 = r7.getEventCode()
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r2 = r6.ampsReportConfigModelMap
            if (r2 == 0) goto L61
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r2 = r6.ampsReportConfigModelMap
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L20
            goto L61
        L20:
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r2 = r6.ampsReportConfigModelMap
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L2b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L2b
            java.lang.Object r3 = r4.getValue()
            xyz.adscope.amps.report.model.AMPSReportConfigModel r3 = (xyz.adscope.amps.report.model.AMPSReportConfigModel) r3
            goto L2b
        L4a:
            if (r3 != 0) goto L4d
            return r0
        L4d:
            java.lang.String r7 = r3.getTime()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L58
            return r0
        L58:
            java.lang.String r7 = r3.getTime()
            long r0 = java.lang.Long.parseLong(r7)
            return r0
        L61:
            r6.loadLogModelFromConfig()
        L64:
            return r0
    }

    private synchronized void reportAdEvent(xyz.adscope.amps.model.AMPSCycleModel r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = ""
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r2 = r1.buildAMPSRequestReportModel(r2, r3, r0)     // Catch: java.lang.Throwable -> L13
            r1.uploadLog(r2)     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.report.AMPSReportMediation r0 = xyz.adscope.amps.report.AMPSReportMediation.getInstance()     // Catch: java.lang.Throwable -> L13
            r0.reportEvent(r2, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    private synchronized void reportInitEvent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r0 = r2.buildAMPSRequestReportModel(r0, r3, r4)     // Catch: java.lang.Throwable -> L12
            r2.uploadLog(r0)     // Catch: java.lang.Throwable -> L12
            xyz.adscope.amps.report.AMPSReportMediation r1 = xyz.adscope.amps.report.AMPSReportMediation.getInstance()     // Catch: java.lang.Throwable -> L12
            r1.reportInitEvent(r0, r3, r4)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    private void sendReportLocal(java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r3, java.lang.String r4) {
            r2 = this;
            xyz.adscope.amps.report.model.AMPSReportConfigModel r0 = r2.getAMPSReportLoaderModel(r4)
            if (r0 != 0) goto L7
            goto L11
        L7:
            java.lang.String r1 = r2.getKeyByEventCode(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L12
        L11:
            return
        L12:
            r2.executeReport(r3, r0, r4)
            return
    }

    private void sendReportLog(java.lang.String r4) {
            r3 = this;
            xyz.adscope.amps.report.model.AMPSReportConfigModel r0 = r3.getAMPSReportLoaderModel(r4)     // Catch: java.lang.Exception -> L4f
            if (r0 != 0) goto L7
            goto L4f
        L7:
            java.lang.String r1 = r3.getKeyByEventCode(r4)     // Catch: java.lang.Exception -> L4f
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto L12
            goto L4f
        L12:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r2 = r3.ampsTempReportMap     // Catch: java.lang.Exception -> L4f
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Exception -> L4f
            if (r2 != 0) goto L1b
            goto L4f
        L1b:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r2 = r3.ampsTempReportMap     // Catch: java.lang.Exception -> L4f
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L4f
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L4f
            r3.executeReport(r2, r0, r4)     // Catch: java.lang.Exception -> L4f
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r4 = r3.ampsTempReportMap     // Catch: java.lang.Exception -> L4f
            if (r4 == 0) goto L37
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r4 = r3.ampsTempReportMap     // Catch: java.lang.Exception -> L4f
            boolean r4 = r4.containsKey(r1)     // Catch: java.lang.Exception -> L4f
            if (r4 == 0) goto L37
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r4 = r3.ampsTempReportMap     // Catch: java.lang.Exception -> L4f
            r4.remove(r1)     // Catch: java.lang.Exception -> L4f
        L37:
            java.util.Map<java.lang.String, xyz.adscope.amps.report.AMPSReportTimer> r4 = r3.ampsTempReportTimerMap     // Catch: java.lang.Exception -> L4f
            boolean r4 = r4.containsKey(r1)     // Catch: java.lang.Exception -> L4f
            if (r4 == 0) goto L4f
            java.util.Map<java.lang.String, xyz.adscope.amps.report.AMPSReportTimer> r4 = r3.ampsTempReportTimerMap     // Catch: java.lang.Exception -> L4f
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Exception -> L4f
            xyz.adscope.amps.report.AMPSReportTimer r4 = (xyz.adscope.amps.report.AMPSReportTimer) r4     // Catch: java.lang.Exception -> L4f
            r4.cancelTimerTask()     // Catch: java.lang.Exception -> L4f
            java.util.Map<java.lang.String, xyz.adscope.amps.report.AMPSReportTimer> r4 = r3.ampsTempReportTimerMap     // Catch: java.lang.Exception -> L4f
            r4.remove(r1)     // Catch: java.lang.Exception -> L4f
        L4f:
            return
    }

    private void sendReportLog(java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r3, java.lang.String r4) {
            r2 = this;
            xyz.adscope.amps.report.model.AMPSReportConfigModel r0 = r2.getAMPSReportLoaderModel(r4)
            if (r0 != 0) goto L7
            goto L11
        L7:
            java.lang.String r1 = r2.getKeyByEventCode(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L12
        L11:
            return
        L12:
            r2.executeReport(r3, r0, r4)
            return
    }

    private void sendReportRequest(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r5) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r4 = xyz.adscope.amps.tool.thread.AMPSThreadPool.getSingleExecutorService()
            xyz.adscope.amps.report.c r0 = new xyz.adscope.amps.report.c
            r0.<init>(r1, r2, r3, r5)
            r4.execute(r0)
            return
    }

    private void setOaidAndGaid(xyz.adscope.amps.report.model.request.DeviceModel r4) {
            r3 = this;
            java.lang.String r0 = xyz.adscope.common.constants.CommonConstants.DEVICE_OAID_KEY
            java.lang.String r0 = xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.getString(r0)
            java.lang.String r1 = xyz.adscope.common.constants.CommonConstants.DEVICE_GAID_KEY
            java.lang.String r1 = xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L15
            r4.setOoaid(r0)
        L15:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1e
            r4.setOgaid(r1)
        L1e:
            return
    }

    private void updateSdkModelVersion(xyz.adscope.amps.report.model.request.SdkModel r1) {
            r0 = this;
            return
    }

    public java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> buildEventCodeMap(java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r5) {
            r4 = this;
            if (r5 == 0) goto L3b
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L3b
        L9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.next()
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r1 = (xyz.adscope.amps.report.model.request.AMPSReportRequestModel) r1
            xyz.adscope.amps.report.model.request.EventModel r2 = r1.getEventModel()
            java.lang.String r2 = r2.getEventCode()
            java.lang.Object r3 = r0.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L36
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L36:
            r3.add(r1)
            goto L12
        L3a:
            return r0
        L3b:
            r5 = 0
            return r5
    }

    @Override // xyz.adscope.amps.report.inter.IReportInterface
    public void deleteLog(java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel> r6) {
            r5 = this;
            if (r6 == 0) goto L40
            int r0 = r6.size()     // Catch: java.lang.Exception -> L40
            r1 = 1
            if (r0 >= r1) goto La
            goto L40
        La:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L40
        Le:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L40
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> L40
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r0 = (xyz.adscope.amps.report.model.request.AMPSReportRequestModel) r0     // Catch: java.lang.Exception -> L40
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L40
            r1.<init>()     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L38
            xyz.adscope.amps.report.model.request.EventModel r2 = r0.getEventModel()     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L38
            java.lang.String r2 = "eventTime"
            xyz.adscope.amps.report.model.request.EventModel r0 = r0.getEventModel()     // Catch: java.lang.Exception -> L40
            long r3 = r0.getEventTime()     // Catch: java.lang.Exception -> L40
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L40
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L40
        L38:
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r0 = r5.ampsDataBaseManager     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto Le
            r0.delete(r1)     // Catch: java.lang.Exception -> L40
            goto Le
        L40:
            return
    }

    public void loadLogModelFromConfig() {
            r5 = this;
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Exception -> L86
            xyz.adscope.amps.init.inter.IAMPSInitInterface r0 = r0.getIAMPSInitInterface()     // Catch: java.lang.Exception -> L86
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.getGlobalModel()     // Catch: java.lang.Exception -> L86
            r5.ampsGlobalModel = r0     // Catch: java.lang.Exception -> L86
            if (r0 != 0) goto L12
            goto L86
        L12:
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()     // Catch: java.lang.Exception -> L86
            if (r0 != 0) goto L19
            goto L86
        L19:
            xyz.adscope.amps.model.config.response.EventModel r0 = r0.getEvent()     // Catch: java.lang.Exception -> L86
            if (r0 != 0) goto L20
            goto L86
        L20:
            java.util.List r0 = r0.getEventLevel()     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L86
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L86
            if (r1 == 0) goto L2d
            goto L86
        L2d:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L86
            r1.<init>()     // Catch: java.lang.Exception -> L86
            r5.ampsReportConfigModelMap = r1     // Catch: java.lang.Exception -> L86
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L86
        L38:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L86
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L86
            xyz.adscope.amps.model.config.response.EventLevelModel r1 = (xyz.adscope.amps.model.config.response.EventLevelModel) r1     // Catch: java.lang.Exception -> L86
            java.util.List r2 = r1.getCodes()     // Catch: java.lang.Exception -> L86
            if (r2 == 0) goto L38
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L86
            if (r3 == 0) goto L51
            goto L38
        L51:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L86
            xyz.adscope.amps.report.model.AMPSReportConfigModel r3 = new xyz.adscope.amps.report.model.AMPSReportConfigModel     // Catch: java.lang.Exception -> L86
            r3.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = r1.getReportURL()     // Catch: java.lang.Exception -> L86
            r3.setReportURL(r4)     // Catch: java.lang.Exception -> L86
            r3.setCode(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = r1.getCount()     // Catch: java.lang.Exception -> L86
            r3.setCount(r4)     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = r1.getMacro()     // Catch: java.lang.Exception -> L86
            r3.setMacro(r4)     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = r1.getAcceptEncrypt()     // Catch: java.lang.Exception -> L86
            r3.setAcceptEncrypt(r4)     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = r1.getTime()     // Catch: java.lang.Exception -> L86
            r3.setTime(r1)     // Catch: java.lang.Exception -> L86
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r1 = r5.ampsReportConfigModelMap     // Catch: java.lang.Exception -> L86
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L86
            goto L38
        L86:
            return
    }

    public void loadLogsFromDatabase() {
            r7 = this;
            java.util.concurrent.ScheduledExecutorService r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.getSingleExecutorService()
            xyz.adscope.amps.report.AMPSReportLoader$1 r1 = new xyz.adscope.amps.report.AMPSReportLoader$1
            r1.<init>(r7)
            int r2 = r7.INIT_TIME
            long r2 = (long) r2
            int r4 = r7.PERIOD_TIME
            long r4 = (long) r4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return
    }

    @Override // xyz.adscope.amps.report.inter.IReportInterface
    public synchronized void reportAdLog(xyz.adscope.amps.model.AMPSCycleModel r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ScheduledExecutorService r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.getSingleExecutorService()     // Catch: java.lang.Throwable -> Lf
            xyz.adscope.amps.report.a r1 = new xyz.adscope.amps.report.a     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // xyz.adscope.amps.report.inter.IReportInterface
    public synchronized void reportInitLog(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ScheduledExecutorService r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.getSingleExecutorService()     // Catch: java.lang.Throwable -> Lf
            xyz.adscope.amps.report.b r1 = new xyz.adscope.amps.report.b     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // xyz.adscope.amps.report.inter.IReportInterface
    public void saveLog(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r4) {
            r3 = this;
            xyz.adscope.amps.report.model.AMPSReportDBModel r0 = new xyz.adscope.amps.report.model.AMPSReportDBModel
            r0.<init>()
            xyz.adscope.common.json.JSONParse r1 = new xyz.adscope.common.json.JSONParse
            r1.<init>()
            java.lang.String r1 = r1.toJson(r4)
            java.lang.String r1 = xyz.adscope.common.tool.security.Base64Util.encode(r1)
            r0.setEventJsonStr(r1)
            xyz.adscope.amps.report.model.request.EventModel r1 = r4.getEventModel()
            if (r1 == 0) goto L3c
            xyz.adscope.amps.report.model.request.EventModel r1 = r4.getEventModel()
            java.lang.String r1 = r1.getEventCode()
            r0.setEventCode(r1)
            xyz.adscope.amps.report.model.request.EventModel r1 = r4.getEventModel()
            long r1 = r1.getEventTime()
            r0.setEventTime(r1)
            xyz.adscope.amps.report.model.request.EventModel r4 = r4.getEventModel()
            java.lang.String r4 = r4.getEventId()
            r0.setEventId(r4)
        L3c:
            xyz.adscope.amps.tool.persistent.db.AMPSDataBaseManager r4 = r3.ampsDataBaseManager
            if (r4 == 0) goto L5e
            java.lang.Long r4 = r4.insert(r0)
            long r0 = r4.longValue()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "insertResult : "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "amps_log_report"
            xyz.adscope.common.tool.LogUtil.i(r0, r4)
        L5e:
            return
    }

    @Override // xyz.adscope.amps.report.inter.IReportInterface
    public void uploadLog(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r8) {
            r7 = this;
            xyz.adscope.amps.report.model.request.AMPSReportRequestModel r8 = r7.deepCopyRequestModel(r8)
            r7.saveLog(r8)
            if (r8 == 0) goto Lb4
            xyz.adscope.amps.report.model.request.EventModel r0 = r8.getEventModel()
            if (r0 != 0) goto L11
            goto Lb4
        L11:
            xyz.adscope.amps.report.model.request.EventModel r0 = r8.getEventModel()
            java.lang.String r0 = r0.getEventCode()
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r1 = r7.ampsReportConfigModelMap
            if (r1 == 0) goto Lb4
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r1 = r7.ampsReportConfigModelMap
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L27
            goto Lb4
        L27:
            java.util.Map<java.lang.String, xyz.adscope.amps.report.model.AMPSReportConfigModel> r1 = r7.ampsReportConfigModelMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L31
            java.lang.Object r1 = r2.getValue()
            xyz.adscope.amps.report.model.AMPSReportConfigModel r1 = (xyz.adscope.amps.report.model.AMPSReportConfigModel) r1
            goto L51
        L50:
            r1 = 0
        L51:
            if (r1 != 0) goto L57
            r7.loadLogModelFromConfig()
            return
        L57:
            r2 = 1
            java.lang.String r3 = r1.getCount()     // Catch: java.lang.NumberFormatException -> L61
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L61
            goto L63
        L61:
            r3 = 1
        L63:
            if (r3 != r2) goto L71
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r8)
            r7.sendReportLog(r1, r0)
            return
        L71:
            java.lang.String r2 = r1.getCode()
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r4 = r7.ampsTempReportMap
            boolean r4 = r4.containsKey(r2)
            if (r4 != 0) goto L99
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            xyz.adscope.amps.report.AMPSReportTimer r5 = new xyz.adscope.amps.report.AMPSReportTimer
            xyz.adscope.amps.report.AMPSReportLoader$2 r6 = new xyz.adscope.amps.report.AMPSReportLoader$2
            r6.<init>(r7, r0)
            java.lang.String r1 = r1.getTime()
            r5.<init>(r6, r1)
            r5.buildReportTimerTask()
            java.util.Map<java.lang.String, xyz.adscope.amps.report.AMPSReportTimer> r1 = r7.ampsTempReportTimerMap
            r1.put(r2, r5)
            goto La2
        L99:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r1 = r7.ampsTempReportMap
            java.lang.Object r1 = r1.get(r2)
            r4 = r1
            java.util.List r4 = (java.util.List) r4
        La2:
            r4.add(r8)
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.report.model.request.AMPSReportRequestModel>> r8 = r7.ampsTempReportMap
            r8.put(r2, r4)
            int r8 = r4.size()
            if (r8 >= r3) goto Lb1
            goto Lb4
        Lb1:
            r7.sendReportLog(r0)
        Lb4:
            return
    }
}
