package xyz.adscope.amps.adapter.bz;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BZInitMediation extends xyz.adscope.amps.init.inter.AMPSChannelInitMediation {
    private static xyz.adscope.amps.adapter.bz.BZInitMediation instance;
    private boolean isInit;


    public BZInitMediation() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInit = r0
            return
    }

    public static synchronized xyz.adscope.amps.adapter.bz.BZInitMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.adapter.bz.BZInitMediation> r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.adapter.bz.BZInitMediation r1 = xyz.adscope.amps.adapter.bz.BZInitMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.adapter.bz.BZInitMediation> r1 = xyz.adscope.amps.adapter.bz.BZInitMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.adapter.bz.BZInitMediation r2 = new xyz.adscope.amps.adapter.bz.BZInitMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.adapter.bz.BZInitMediation.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.adapter.bz.BZInitMediation r1 = xyz.adscope.amps.adapter.bz.BZInitMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private java.lang.String getLossReason(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Lc
            r0 = 3
            if (r2 == r0) goto L9
            java.lang.String r2 = "999"
            return r2
        L9:
            java.lang.String r2 = "2"
            return r2
        Lc:
            java.lang.String r2 = "1"
            return r2
    }

    private void initBZSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r5, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r6) {
            r4 = this;
            android.content.Context r0 = xyz.adscope.amps.AMPSSDK.getContext()
            if (r0 == 0) goto L52
            if (r5 == 0) goto L52
            java.lang.String r1 = r5.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L13
            goto L52
        L13:
            java.util.Map r1 = r5.getLocalExtraMap()
            if (r1 == 0) goto L2e
            java.lang.String r2 = "bzLocalExtraData"
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L28
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 == 0) goto L2e
            com.beizi.fusion.BeiZis.setAnyCustomExt(r1)
        L2e:
            java.lang.String r1 = r5.getAppId()
            xyz.adscope.amps.adapter.bz.BZInitMediation$1 r2 = new xyz.adscope.amps.adapter.bz.BZInitMediation$1
            r2.<init>(r4, r5)
            com.beizi.fusion.BeiZis.init(r0, r1, r2)
            boolean r5 = r5.isPersonalRecommend()
            if (r5 != 0) goto L44
            r5 = 0
            com.beizi.fusion.BeiZis.setSupportPersonalized(r5)
        L44:
            r5 = 1
            r4.isInit = r5
            java.lang.String r5 = "amps_log_tag"
            java.lang.String r0 = "BZSDK init success"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r5, r0)
            r4.initSDKSuccess(r6)
            return
        L52:
            xyz.adscope.amps.common.AMPSError r5 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r5.<init>(r1, r0)
            r4.initSDKFail(r6, r5)
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> getLossInfo(xyz.adscope.amps.base.AMPSBidResult r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L2d
            r1.<init>()     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "winPrice"
            int r3 = r5.getEcpm()     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L2d
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "adnId"
            java.lang.String r3 = r5.getChannelName()     // Catch: java.lang.Exception -> L2d
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "lossReason"
            int r5 = r5.getReason()     // Catch: java.lang.Exception -> L2d
            java.lang.String r5 = r4.getLossReason(r5)     // Catch: java.lang.Exception -> L2d
            r1.put(r2, r5)     // Catch: java.lang.Exception -> L2d
            return r1
        L2d:
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkName() {
            r1 = this;
            java.lang.String r0 = "BZ"
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkVersion() {
            r1 = this;
            java.lang.String r0 = com.beizi.fusion.BeiZis.getSdkVersion()
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getWinInfo(xyz.adscope.amps.base.AMPSBidResult r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "winPrice"
            int r3 = r5.getWinPrice()     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L3a
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "highestLossPrice"
            int r3 = r5.getEcpm()     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L3a
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "adnId"
            java.lang.String r3 = r5.getChannelName()     // Catch: java.lang.Exception -> L3a
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.BZ_LOCAL_EXTRA_KEY_AUCTION_EXT     // Catch: java.lang.Exception -> L3a
            int r5 = r5.getWinPrice()     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L3a
            r1.put(r2, r5)     // Catch: java.lang.Exception -> L3a
            return r1
        L3a:
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public void initSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r3, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r4) {
            r2 = this;
            java.lang.String r0 = "com.beizi.fusion.BeiZis"
            boolean r0 = xyz.adscope.common.tool.utils.SystemUtil.hasSdk(r0)
            if (r0 != 0) goto L1b
            xyz.adscope.amps.common.AMPSError r3 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_SDK_NOT_IMPORT
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r3.<init>(r1, r0)
            r2.initSDKFail(r4, r3)
            return
        L1b:
            boolean r0 = r2.isInit
            if (r0 == 0) goto L23
            r2.initSDKSuccess(r4)
            return
        L23:
            r2.initBZSDK(r3, r4)
            return
    }
}
