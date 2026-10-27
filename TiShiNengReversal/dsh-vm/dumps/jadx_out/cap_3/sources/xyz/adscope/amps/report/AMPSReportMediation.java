package xyz.adscope.amps.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSReportMediation {
    private static xyz.adscope.amps.report.AMPSReportMediation instance;
    private java.lang.String AMPS_TAG;
    private boolean isExecuteBetaPlan;
    private boolean isJudgeBetaPlan;
    private android.content.Context mContext;
    private xyz.adscope.common.analyse2.publish.IScopeEventAnalyser scopeEventAnalyser;


    private AMPSReportMediation() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "mediation"
            r2.AMPS_TAG = r0
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L40
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r0 = r0.getContext()
            r2.mContext = r0
            xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager r0 = xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager.getInstance()
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r1 = r1.getContext()
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = (xyz.adscope.common.analyse2.publish.IScopeEventAnalyser) r0
            r2.scopeEventAnalyser = r0
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r0 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            android.content.Context r1 = r2.mContext
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r0 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r0
            xyz.adscope.common.v2.encrypt.EncryptConfig r1 = xyz.adscope.common.v2.encrypt.EncryptConfig.CONFIG_AES
            r0.initAesConfig(r1)
        L40:
            return
    }

    public static synchronized xyz.adscope.amps.report.AMPSReportMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.report.AMPSReportMediation> r0 = xyz.adscope.amps.report.AMPSReportMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.report.AMPSReportMediation r1 = xyz.adscope.amps.report.AMPSReportMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.report.AMPSReportMediation> r1 = xyz.adscope.amps.report.AMPSReportMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.report.AMPSReportMediation r2 = new xyz.adscope.amps.report.AMPSReportMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.report.AMPSReportMediation.instance = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            goto L1c
        L18:
            xyz.adscope.amps.report.AMPSReportMediation r1 = xyz.adscope.amps.report.AMPSReportMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private boolean isExecuteBetaPlan() {
            r2 = this;
            boolean r0 = r2.isJudgeBetaPlan
            if (r0 == 0) goto L7
            boolean r0 = r2.isExecuteBetaPlan
            return r0
        L7:
            xyz.adscope.amps.plan.BetaPlanMediation r0 = xyz.adscope.amps.plan.BetaPlanMediation.getInstance()
            boolean r0 = r0.isExecuteBetaPlan()
            r2.isExecuteBetaPlan = r0
            r1 = 1
            r2.isJudgeBetaPlan = r1
            return r0
    }

    private void reportHistoryEvent() {
            r7 = this;
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = r7.scopeEventAnalyser
            if (r0 != 0) goto L5
            return
        L5:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r6 = r7.AMPS_TAG
            r1 = 30
            r3 = 300(0x12c, double:1.48E-321)
            r0.scheduleHistoryEvent(r1, r3, r5, r6)
            return
    }

    public void initLogStrategy() {
            r10 = this;
            java.lang.String r0 = "mediation"
            android.content.Context r1 = r10.mContext
            if (r1 != 0) goto L8
            goto L110
        L8:
            boolean r1 = r10.isExecuteBetaPlan()     // Catch: org.json.JSONException -> L110
            if (r1 != 0) goto L10
            goto L110
        L10:
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: org.json.JSONException -> L110
            xyz.adscope.amps.init.inter.IAMPSInitInterface r1 = r1.getIAMPSInitInterface()     // Catch: org.json.JSONException -> L110
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r1.getGlobalModel()     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = r1.getStartId()     // Catch: org.json.JSONException -> L110
            java.lang.String r3 = r1.getAppId()     // Catch: org.json.JSONException -> L110
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r4 = r1.getConfigureResponseModel()     // Catch: org.json.JSONException -> L110
            r5 = 0
            java.lang.String r6 = "0"
            if (r4 == 0) goto L3a
            long r7 = r4.getLastUpdateTime()     // Catch: org.json.JSONException -> L110
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: org.json.JSONException -> L110
            java.lang.String r4 = r4.getVersion()     // Catch: org.json.JSONException -> L110
            goto L3c
        L3a:
            r4 = r5
            r7 = r6
        L3c:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L110
            r8.<init>()     // Catch: org.json.JSONException -> L110
            java.lang.String r9 = "start_id"
            r8.put(r9, r2)     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = "app_id"
            r8.put(r2, r3)     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = "custom_id"
            r8.put(r2, r0)     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = "lastUpdateTime"
            r8.put(r2, r7)     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = "config_version_md5"
            r8.put(r2, r4)     // Catch: org.json.JSONException -> L110
            xyz.adscope.amps.manager.AMPSSDKManager r2 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: org.json.JSONException -> L110
            xyz.adscope.amps.init.AMPSInitConfig r2 = r2.getAMPSAdConfig()     // Catch: org.json.JSONException -> L110
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L110
            r3.<init>()     // Catch: org.json.JSONException -> L110
            if (r2 == 0) goto Lc5
            java.lang.String r4 = r2.getUserId()     // Catch: org.json.JSONException -> L110
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L110
            if (r7 != 0) goto L78
            java.lang.String r7 = "user_id"
            r3.put(r7, r4)     // Catch: org.json.JSONException -> L110
        L78:
            java.lang.String r4 = r2.getOptionInfo()     // Catch: org.json.JSONException -> L110
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L110
            if (r7 != 0) goto L87
            java.lang.String r7 = "user_custom_data"
            r3.put(r7, r4)     // Catch: org.json.JSONException -> L110
        L87:
            boolean r4 = r2.isPersonalRecommend()     // Catch: org.json.JSONException -> L110
            java.lang.String r7 = "lmt"
            if (r4 == 0) goto L95
            java.lang.String r0 = "1"
            r3.put(r7, r0)     // Catch: org.json.JSONException -> L110
            goto L9d
        L95:
            r3.put(r7, r6)     // Catch: org.json.JSONException -> L110
            java.lang.String r4 = "oaid_auth"
            r3.put(r4, r0)     // Catch: org.json.JSONException -> L110
        L9d:
            java.lang.String r0 = r2.getCustomOAID()     // Catch: org.json.JSONException -> L110
            android.content.Context r2 = r10.mContext     // Catch: org.json.JSONException -> L110
            if (r2 == 0) goto Lb8
            xyz.adscope.common.info.DeviceInfo r2 = xyz.adscope.common.info.DeviceInfo.getInstance(r2)     // Catch: org.json.JSONException -> L110
            if (r2 == 0) goto Lb8
            java.lang.String r5 = r2.getOaid()     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = r2.getSdkid()     // Catch: org.json.JSONException -> L110
            java.lang.String r4 = "said"
            r3.put(r4, r2)     // Catch: org.json.JSONException -> L110
        Lb8:
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: org.json.JSONException -> L110
            if (r2 == 0) goto Lbf
            goto Lc0
        Lbf:
            r0 = r5
        Lc0:
            java.lang.String r2 = "oaid"
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L110
        Lc5:
            java.lang.String r0 = "user"
            r8.putOpt(r0, r3)     // Catch: org.json.JSONException -> L110
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L110
            r0.<init>()     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = "version"
            java.lang.String r3 = "5.1.0.32"
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L110
            java.lang.String r2 = "sdk"
            r8.putOpt(r2, r0)     // Catch: org.json.JSONException -> L110
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r1.getConfigureResponseModel()     // Catch: org.json.JSONException -> L110
            if (r0 == 0) goto Lee
            xyz.adscope.amps.model.config.response.LogStrategyModel r0 = r0.getLogStrategy()     // Catch: org.json.JSONException -> L110
            java.lang.String r1 = "logStrategy"
            org.json.JSONObject r0 = xyz.adscope.common.json.util.JsonUtil.objectToJsonObject(r0)     // Catch: org.json.JSONException -> L110
            r8.putOpt(r1, r0)     // Catch: org.json.JSONException -> L110
        Lee:
            java.lang.String r0 = r8.toString()     // Catch: org.json.JSONException -> L110
            java.lang.String r0 = xyz.adscope.common.tool.security.Base64Util.encode(r0)     // Catch: org.json.JSONException -> L110
            android.content.Context r1 = r10.mContext     // Catch: org.json.JSONException -> L110
            if (r1 != 0) goto Lfb
            goto L110
        Lfb:
            xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager r1 = xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager.getInstance()     // Catch: org.json.JSONException -> L110
            android.content.Context r2 = r10.mContext     // Catch: org.json.JSONException -> L110
            java.lang.Object r1 = r1.getOrCreateImplement(r2)     // Catch: org.json.JSONException -> L110
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r1 = (xyz.adscope.common.analyse2.publish.IScopeEventAnalyser) r1     // Catch: org.json.JSONException -> L110
            if (r1 != 0) goto L10a
            goto L110
        L10a:
            r1.initializeAnalyse(r0)     // Catch: org.json.JSONException -> L110
            r10.reportHistoryEvent()     // Catch: org.json.JSONException -> L110
        L110:
            return
    }

    public void registerAnalyseUpdate(xyz.adscope.amps.config.inter.IConfigUpdateCallBack r3) {
            r2 = this;
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = r2.scopeEventAnalyser     // Catch: java.lang.Exception -> Ld
            if (r0 != 0) goto L5
            goto Ld
        L5:
            xyz.adscope.amps.report.AMPSReportMediation$1 r1 = new xyz.adscope.amps.report.AMPSReportMediation$1     // Catch: java.lang.Exception -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> Ld
            r0.registerAnalyseUpdate(r1)     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    public void reportEvent(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.isExecuteBetaPlan()
            if (r0 != 0) goto L8
            goto L203
        L8:
            if (r5 != 0) goto Lc
            goto L203
        Lc:
            xyz.adscope.amps.report.model.request.EventModel r0 = r5.getEventModel()     // Catch: org.json.JSONException -> L203
            if (r0 != 0) goto L14
            goto L203
        L14:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L203
            r1.<init>()     // Catch: org.json.JSONException -> L203
            java.lang.String r2 = r0.getEventId()     // Catch: org.json.JSONException -> L203
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L203
            if (r3 != 0) goto L28
            java.lang.String r3 = "event_id"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L203
        L28:
            java.lang.String r2 = "event_code"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
            java.lang.String r6 = r0.getLogTime()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L3c
            java.lang.String r2 = "event_time"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L3c:
            java.lang.String r6 = r0.getErrorCode()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L4b
            java.lang.String r2 = "error_code"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L4b:
            java.lang.String r6 = r0.getErrorInfo()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L5a
            java.lang.String r2 = "error_info"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L5a:
            java.lang.String r6 = r0.getRoundTripTime()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L69
            java.lang.String r2 = "cost_time"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L69:
            java.lang.String r6 = r0.getAdSourceAppId()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L78
            java.lang.String r2 = "s_app_id"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L78:
            java.lang.String r6 = r0.getAdSourceSpaceId()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L87
            java.lang.String r2 = "s_space_id"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L87:
            java.lang.String r2 = r0.getAdSourceId()     // Catch: org.json.JSONException -> L203
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r6 != 0) goto L96
            java.lang.String r6 = "seat_id"
            r1.put(r6, r2)     // Catch: org.json.JSONException -> L203
        L96:
            java.lang.String r6 = r0.getEcpm()     // Catch: org.json.JSONException -> L203
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r6 != 0) goto La9
            java.lang.String r6 = "ecpm"
            java.lang.String r2 = r0.getEcpm()     // Catch: org.json.JSONException -> L203
            r1.put(r6, r2)     // Catch: org.json.JSONException -> L203
        La9:
            java.lang.String r6 = r0.getBiddingType()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto Lb8
            java.lang.String r2 = "bid_type"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        Lb8:
            java.lang.String r6 = r0.getIsHitAuction()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto Lc7
            java.lang.String r2 = "is_hit_auction"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        Lc7:
            java.lang.String r2 = r0.getIsLastLook()     // Catch: org.json.JSONException -> L203
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r6 != 0) goto Ld6
            java.lang.String r6 = "is_last_look"
            r1.put(r6, r2)     // Catch: org.json.JSONException -> L203
        Ld6:
            java.lang.String r6 = r0.getAdsCustomData()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto Le5
            java.lang.String r2 = "s_custom_data"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        Le5:
            java.lang.String r6 = r0.getNoticePrice()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto Lf4
            java.lang.String r2 = "notice_price"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        Lf4:
            java.lang.String r6 = r0.getLossReason()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L103
            java.lang.String r2 = "loss_reason"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L103:
            java.lang.String r6 = r0.getRealPrice()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L112
            java.lang.String r2 = "real_price"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L112:
            java.lang.String r6 = r0.getBidSeatId()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L121
            java.lang.String r2 = "bid_seat_id"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L121:
            java.lang.String r6 = r0.getBidSpaceId()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L130
            java.lang.String r2 = "bid_space_id"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L203
        L130:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L203
            r6.<init>()     // Catch: org.json.JSONException -> L203
            java.lang.String r2 = r0.getMediationSpaceId()     // Catch: org.json.JSONException -> L203
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L203
            if (r3 != 0) goto L144
            java.lang.String r3 = "space_id"
            r6.put(r3, r2)     // Catch: org.json.JSONException -> L203
        L144:
            java.lang.String r2 = r0.getSessionId()     // Catch: org.json.JSONException -> L203
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L203
            if (r3 != 0) goto L153
            java.lang.String r3 = "session_id"
            r6.put(r3, r2)     // Catch: org.json.JSONException -> L203
        L153:
            java.lang.String r0 = r0.getMdCustomData()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L162
            java.lang.String r2 = "custom_data"
            r6.put(r2, r0)     // Catch: org.json.JSONException -> L203
        L162:
            java.lang.String r0 = "currency"
            java.lang.String r2 = "CNY"
            r6.put(r0, r2)     // Catch: org.json.JSONException -> L203
            xyz.adscope.amps.report.model.request.AdModel r5 = r5.getAd()     // Catch: org.json.JSONException -> L203
            if (r5 == 0) goto L1c9
            java.lang.String r0 = r5.getAdType()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L17e
            java.lang.String r2 = "ad_type"
            r6.put(r2, r0)     // Catch: org.json.JSONException -> L203
        L17e:
            java.lang.String r0 = r5.getQuantity()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L18d
            java.lang.String r2 = "quantity"
            r6.put(r2, r0)     // Catch: org.json.JSONException -> L203
        L18d:
            java.lang.String r0 = r5.getAdTimeOut()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L19c
            java.lang.String r2 = "time_out"
            r6.put(r2, r0)     // Catch: org.json.JSONException -> L203
        L19c:
            java.lang.String r0 = r5.getLoadType()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L1ab
            java.lang.String r2 = "load_type"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L203
        L1ab:
            java.lang.String r0 = r5.getMaxWaitTime()     // Catch: org.json.JSONException -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L203
            if (r2 != 0) goto L1ba
            java.lang.String r2 = "s_time_out"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L203
        L1ba:
            java.lang.String r5 = r5.getFloorPrice()     // Catch: org.json.JSONException -> L203
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: org.json.JSONException -> L203
            if (r0 != 0) goto L1c9
            java.lang.String r0 = "floor_price"
            r1.put(r0, r5)     // Catch: org.json.JSONException -> L203
        L1c9:
            java.lang.String r5 = "amps"
            r1.putOpt(r5, r6)     // Catch: org.json.JSONException -> L203
            xyz.adscope.amps.manager.AMPSSDKManager r5 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: org.json.JSONException -> L203
            xyz.adscope.amps.init.inter.IAMPSInitInterface r5 = r5.getIAMPSInitInterface()     // Catch: org.json.JSONException -> L203
            xyz.adscope.amps.model.AMPSGlobalModel r5 = r5.getGlobalModel()     // Catch: org.json.JSONException -> L203
            if (r5 != 0) goto L1dd
            goto L203
        L1dd:
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r5 = r5.getConfigureResponseModel()     // Catch: org.json.JSONException -> L203
            if (r5 != 0) goto L1e4
            goto L203
        L1e4:
            xyz.adscope.amps.model.config.response.LogStrategyModel r5 = r5.getLogStrategy()     // Catch: org.json.JSONException -> L203
            if (r5 != 0) goto L1eb
            goto L203
        L1eb:
            java.lang.String r5 = r5.getVersion()     // Catch: org.json.JSONException -> L203
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r6 = r4.scopeEventAnalyser     // Catch: org.json.JSONException -> L203
            if (r6 != 0) goto L1f4
            goto L203
        L1f4:
            java.lang.String r6 = r1.toString()     // Catch: org.json.JSONException -> L203
            java.lang.String r6 = xyz.adscope.common.tool.security.Base64Util.encode(r6)     // Catch: org.json.JSONException -> L203
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = r4.scopeEventAnalyser     // Catch: org.json.JSONException -> L203
            java.lang.String r1 = r4.AMPS_TAG     // Catch: org.json.JSONException -> L203
            r0.reportEvent(r6, r5, r1)     // Catch: org.json.JSONException -> L203
        L203:
            return
    }

    public void reportInitEvent(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            boolean r0 = r3.isExecuteBetaPlan()
            if (r0 != 0) goto L8
            goto Lcf
        L8:
            xyz.adscope.amps.report.AMPSEventReportCode r0 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_INIT_START_CODE     // Catch: org.json.JSONException -> Lcf
            java.lang.String r0 = r0.getCodeStr()     // Catch: org.json.JSONException -> Lcf
            boolean r0 = r0.equals(r5)     // Catch: org.json.JSONException -> Lcf
            if (r0 != 0) goto L2c
            xyz.adscope.amps.report.AMPSEventReportCode r0 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_INIT_SUCCESS_CODE     // Catch: org.json.JSONException -> Lcf
            java.lang.String r0 = r0.getCodeStr()     // Catch: org.json.JSONException -> Lcf
            boolean r0 = r0.equals(r5)     // Catch: org.json.JSONException -> Lcf
            if (r0 != 0) goto L2c
            xyz.adscope.amps.report.AMPSEventReportCode r0 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_INIT_FAIL_CODE     // Catch: org.json.JSONException -> Lcf
            java.lang.String r0 = r0.getCodeStr()     // Catch: org.json.JSONException -> Lcf
            boolean r0 = r0.equals(r5)     // Catch: org.json.JSONException -> Lcf
            if (r0 == 0) goto Lc0
        L2c:
            if (r4 == 0) goto Lc0
            xyz.adscope.amps.report.model.request.EventModel r4 = r4.getEventModel()     // Catch: org.json.JSONException -> Lcf
            if (r4 == 0) goto Lc0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcf
            r0.<init>()     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = r4.getEventId()     // Catch: org.json.JSONException -> Lcf
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> Lcf
            if (r2 != 0) goto L48
            java.lang.String r2 = "event_id"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> Lcf
        L48:
            java.lang.String r1 = r4.getLogTime()     // Catch: org.json.JSONException -> Lcf
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> Lcf
            if (r2 != 0) goto L57
            java.lang.String r2 = "event_time"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> Lcf
        L57:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: org.json.JSONException -> Lcf
            if (r1 != 0) goto L62
            java.lang.String r1 = "event_code"
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lcf
        L62:
            java.lang.String r1 = r4.getErrorCode()     // Catch: org.json.JSONException -> Lcf
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> Lcf
            if (r2 != 0) goto L71
            java.lang.String r2 = "error_code"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> Lcf
        L71:
            java.lang.String r4 = r4.getErrorInfo()     // Catch: org.json.JSONException -> Lcf
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> Lcf
            if (r1 != 0) goto L80
            java.lang.String r1 = "error_info"
            r0.put(r1, r4)     // Catch: org.json.JSONException -> Lcf
        L80:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> Lcf
            if (r4 != 0) goto L8b
            java.lang.String r4 = "cost_time"
            r0.put(r4, r6)     // Catch: org.json.JSONException -> Lcf
        L8b:
            xyz.adscope.amps.manager.AMPSSDKManager r4 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: org.json.JSONException -> Lcf
            xyz.adscope.amps.init.inter.IAMPSInitInterface r4 = r4.getIAMPSInitInterface()     // Catch: org.json.JSONException -> Lcf
            xyz.adscope.amps.model.AMPSGlobalModel r4 = r4.getGlobalModel()     // Catch: org.json.JSONException -> Lcf
            if (r4 != 0) goto L9a
            goto Lcf
        L9a:
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r4 = r4.getConfigureResponseModel()     // Catch: org.json.JSONException -> Lcf
            if (r4 != 0) goto La1
            goto Lcf
        La1:
            xyz.adscope.amps.model.config.response.LogStrategyModel r4 = r4.getLogStrategy()     // Catch: org.json.JSONException -> Lcf
            if (r4 != 0) goto La8
            goto Lcf
        La8:
            java.lang.String r4 = r4.getVersion()     // Catch: org.json.JSONException -> Lcf
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r6 = r3.scopeEventAnalyser     // Catch: org.json.JSONException -> Lcf
            if (r6 != 0) goto Lb1
            goto Lcf
        Lb1:
            java.lang.String r6 = r0.toString()     // Catch: org.json.JSONException -> Lcf
            java.lang.String r6 = xyz.adscope.common.tool.security.Base64Util.encode(r6)     // Catch: org.json.JSONException -> Lcf
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = r3.scopeEventAnalyser     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = r3.AMPS_TAG     // Catch: org.json.JSONException -> Lcf
            r0.reportEvent(r6, r4, r1)     // Catch: org.json.JSONException -> Lcf
        Lc0:
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_CRASH_CODE     // Catch: org.json.JSONException -> Lcf
            java.lang.String r4 = r4.getCodeStr()     // Catch: org.json.JSONException -> Lcf
            boolean r4 = r4.equals(r5)     // Catch: org.json.JSONException -> Lcf
            if (r4 == 0) goto Lcf
            r3.uploadCrashLog()     // Catch: org.json.JSONException -> Lcf
        Lcf:
            return
    }

    public void uploadCrashLog() {
            r6 = this;
            boolean r0 = r6.isExecuteBetaPlan()
            if (r0 != 0) goto L8
            goto La7
        L8:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> La7
            r0.<init>()     // Catch: java.lang.Throwable -> La7
            xyz.adscope.amps.tool.crash.AMPSCrashHandler r1 = xyz.adscope.amps.tool.crash.AMPSCrashHandler.getInstance()     // Catch: java.lang.Throwable -> La7
            java.util.List r1 = r1.getCrashData()     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto La7
            int r2 = r1.size()     // Catch: java.lang.Throwable -> La7
            if (r2 <= 0) goto La7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La7
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La7
            xyz.adscope.amps.model.crash.AMPSCrashRequestModel r2 = (xyz.adscope.amps.model.crash.AMPSCrashRequestModel) r2     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r2.getException()     // Catch: java.lang.Throwable -> La7
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L38
            goto L21
        L38:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            r4.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "exception"
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r2.getAffiliated()     // Catch: java.lang.Throwable -> La7
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L55
            java.lang.String r3 = "affiliated"
            java.lang.String r5 = r2.getAffiliated()     // Catch: java.lang.Throwable -> La7
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> La7
        L55:
            java.lang.String r3 = r2.getLog_time()     // Catch: java.lang.Throwable -> La7
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L68
            java.lang.String r3 = "time"
            java.lang.String r2 = r2.getLog_time()     // Catch: java.lang.Throwable -> La7
            r4.put(r3, r2)     // Catch: java.lang.Throwable -> La7
        L68:
            r0.put(r4)     // Catch: java.lang.Throwable -> La7
            goto L21
        L6c:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> La7
            if (r1 <= 0) goto La7
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Throwable -> La7
            xyz.adscope.amps.init.inter.IAMPSInitInterface r1 = r1.getIAMPSInitInterface()     // Catch: java.lang.Throwable -> La7
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r1.getGlobalModel()     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto L81
            goto La7
        L81:
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto L88
            goto La7
        L88:
            xyz.adscope.amps.model.config.response.LogStrategyModel r1 = r1.getLogStrategy()     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            java.lang.String r1 = r1.getVersion()     // Catch: java.lang.Throwable -> La7
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r2 = r6.scopeEventAnalyser     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto L98
            goto La7
        L98:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = xyz.adscope.common.tool.security.Base64Util.encode(r0)     // Catch: java.lang.Throwable -> La7
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r2 = r6.scopeEventAnalyser     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r6.AMPS_TAG     // Catch: java.lang.Throwable -> La7
            r2.reportCrash(r0, r1, r3)     // Catch: java.lang.Throwable -> La7
        La7:
            return
    }
}
