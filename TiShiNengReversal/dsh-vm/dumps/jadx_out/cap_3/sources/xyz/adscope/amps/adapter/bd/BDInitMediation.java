package xyz.adscope.amps.adapter.bd;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDInitMediation extends xyz.adscope.amps.init.inter.AMPSChannelInitMediation {
    private static xyz.adscope.amps.adapter.bd.BDInitMediation instance;
    private static boolean isInit;


    public BDInitMediation() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean access$002(boolean r0) {
            xyz.adscope.amps.adapter.bd.BDInitMediation.isInit = r0
            return r0
    }

    private int getAdn(java.lang.String r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = -1
            switch(r0) {
                case 1507456: goto L3b;
                case 1507457: goto L30;
                case 1507462: goto L25;
                case 1507463: goto L1a;
                case 1507487: goto Lf;
                default: goto Le;
            }
        Le:
            goto L45
        Lf:
            java.lang.String r0 = "1022"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L18
            goto L45
        L18:
            r4 = 4
            goto L45
        L1a:
            java.lang.String r0 = "1019"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L23
            goto L45
        L23:
            r4 = 3
            goto L45
        L25:
            java.lang.String r0 = "1018"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e
            goto L45
        L2e:
            r4 = 2
            goto L45
        L30:
            java.lang.String r0 = "1013"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L39
            goto L45
        L39:
            r4 = 1
            goto L45
        L3b:
            java.lang.String r0 = "1012"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L44
            goto L45
        L44:
            r4 = 0
        L45:
            switch(r4) {
                case 0: goto L50;
                case 1: goto L4f;
                case 2: goto L4c;
                case 3: goto L4b;
                case 4: goto L4f;
                default: goto L48;
            }
        L48:
            r6 = 10
            return r6
        L4b:
            return r1
        L4c:
            r6 = 9
            return r6
        L4f:
            return r3
        L50:
            return r2
    }

    private int getAdnType(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "C2S"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Le
            r2 = 10
            return r2
        Le:
            r2 = 3
            return r2
    }

    public static synchronized xyz.adscope.amps.adapter.bd.BDInitMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.adapter.bd.BDInitMediation> r0 = xyz.adscope.amps.adapter.bd.BDInitMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.adapter.bd.BDInitMediation r1 = xyz.adscope.amps.adapter.bd.BDInitMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.adapter.bd.BDInitMediation> r1 = xyz.adscope.amps.adapter.bd.BDInitMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = new xyz.adscope.amps.adapter.bd.BDInitMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.adapter.bd.BDInitMediation.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.adapter.bd.BDInitMediation r1 = xyz.adscope.amps.adapter.bd.BDInitMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private void initBDSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r11, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r12) {
            r10 = this;
            android.content.Context r0 = xyz.adscope.amps.AMPSSDK.getContext()
            if (r0 == 0) goto L188
            if (r11 == 0) goto L188
            java.lang.String r1 = r11.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L14
            goto L188
        L14:
            r1 = 0
            r2 = 0
            r3 = 1
            xyz.adscope.amps.config.AMPSPrivacyConfig r4 = r11.getPrivacyConfig()     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L54
            boolean r5 = r4.isCanUsePhoneState()     // Catch: java.lang.Exception -> L2a
            if (r5 == 0) goto L2d
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionReadDeviceID(r3)     // Catch: java.lang.Exception -> L2a
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionDeviceInfo(r3)     // Catch: java.lang.Exception -> L2a
            goto L33
        L2a:
            r4 = 1
            goto L66
        L2d:
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionReadDeviceID(r2)     // Catch: java.lang.Exception -> L2a
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionDeviceInfo(r2)     // Catch: java.lang.Exception -> L2a
        L33:
            boolean r5 = r4.isCanUseWriteExternal()     // Catch: java.lang.Exception -> L2a
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionStorage(r5)     // Catch: java.lang.Exception -> L2a
            boolean r5 = r4.isCanUseAppList()     // Catch: java.lang.Exception -> L2a
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionAppList(r5)     // Catch: java.lang.Exception -> L2a
            boolean r5 = r4.isCanUseLocation()     // Catch: java.lang.Exception -> L2a
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionLocation(r5)     // Catch: java.lang.Exception -> L2a
            boolean r5 = r4.isCanUseOaid()     // Catch: java.lang.Exception -> L2a
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setPermissionOAID(r5)     // Catch: java.lang.Exception -> L2a
            boolean r4 = r4.isCanUseShakeAd()     // Catch: java.lang.Exception -> L2a
            goto L55
        L54:
            r4 = 1
        L55:
            boolean r5 = r11.isPersonalRecommend()     // Catch: java.lang.Exception -> L5f
            if (r5 != 0) goto L61
            com.baidu.mobads.sdk.api.MobadsPermissionSettings.setLimitPersonalAds(r3)     // Catch: java.lang.Exception -> L5f
            goto L61
        L5f:
            goto L66
        L61:
            java.lang.String r5 = r11.getAppId()     // Catch: java.lang.Exception -> L5f
            goto L67
        L66:
            r5 = r1
        L67:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L80
            xyz.adscope.amps.common.AMPSError r11 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r11.<init>(r1, r0)
            r10.initSDKFail(r12, r11)
            return
        L80:
            com.baidu.mobads.sdk.api.BDAdConfig$Builder r6 = new com.baidu.mobads.sdk.api.BDAdConfig$Builder
            r6.<init>()
            r6.setAppsid(r5)
            boolean r5 = r11.isDebug()
            r6.setDebug(r5)
            java.util.Map r11 = r11.getLocalExtraMap()
            if (r11 == 0) goto L14f
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_BD
            boolean r5 = r11.containsKey(r5)
            if (r5 == 0) goto La6
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_BD
            java.lang.Object r11 = r11.get(r5)
            java.util.Map r11 = (java.util.Map) r11
            goto La7
        La6:
            r11 = r1
        La7:
            if (r11 == 0) goto L14f
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_DL_DIALOG_TYPE
            boolean r5 = r11.containsKey(r5)
            if (r5 == 0) goto Lc4
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_DL_DIALOG_TYPE
            java.lang.Object r5 = r11.get(r5)
            if (r5 == 0) goto Lc4
            boolean r7 = r5 instanceof java.lang.Integer
            if (r7 == 0) goto Lc4
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto Lc5
        Lc4:
            r5 = 0
        Lc5:
            java.lang.String r7 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_DL_DIALOG_ANIM_STYLE
            boolean r7 = r11.containsKey(r7)
            if (r7 == 0) goto Le0
            java.lang.String r7 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_DL_DIALOG_ANIM_STYLE
            java.lang.Object r7 = r11.get(r7)
            if (r7 == 0) goto Le0
            boolean r8 = r7 instanceof java.lang.Integer
            if (r8 == 0) goto Le0
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto Le1
        Le0:
            r7 = 0
        Le1:
            java.lang.String r8 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_WX_APP_ID
            boolean r8 = r11.containsKey(r8)
            if (r8 == 0) goto Lf8
            java.lang.String r8 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_WX_APP_ID
            java.lang.Object r8 = r11.get(r8)
            if (r8 == 0) goto Lf8
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto Lf8
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
        Lf8:
            java.lang.String r8 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_VIDEO_CACHE_CAPACITY_MB
            boolean r8 = r11.containsKey(r8)
            if (r8 == 0) goto L112
            java.lang.String r8 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_VIDEO_CACHE_CAPACITY_MB
            java.lang.Object r8 = r11.get(r8)
            if (r8 == 0) goto L112
            boolean r9 = r8 instanceof java.lang.Integer
            if (r9 == 0) goto L112
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r2 = r8.intValue()
        L112:
            java.lang.String r8 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_EXTRA_PARAMS
            boolean r8 = r11.containsKey(r8)
            if (r8 == 0) goto L14c
            java.lang.String r8 = xyz.adscope.amps.common.AMPSConstants.BD_LOCAL_EXTRA_KEY_EXTRA_PARAMS
            java.lang.Object r11 = r11.get(r8)
            if (r11 == 0) goto L14c
            boolean r8 = r11 instanceof java.util.Map
            if (r8 == 0) goto L14c
            java.util.Map r11 = (java.util.Map) r11
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L130:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L14c
            java.lang.Object r8 = r11.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r6.putExtraParam(r9, r8)
            goto L130
        L14c:
            r11 = r2
            r2 = r5
            goto L151
        L14f:
            r11 = 0
            r7 = 0
        L151:
            com.baidu.mobads.sdk.api.BDDialogParams$Builder r5 = new com.baidu.mobads.sdk.api.BDDialogParams$Builder
            r5.<init>()
            com.baidu.mobads.sdk.api.BDDialogParams$Builder r2 = r5.setDlDialogType(r2)
            com.baidu.mobads.sdk.api.BDDialogParams$Builder r2 = r2.setDlDialogAnimStyle(r7)
            com.baidu.mobads.sdk.api.BDDialogParams r2 = r2.build()
            r6.setDialogParams(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L16e
            r6.setWXAppid(r1)
        L16e:
            if (r4 != 0) goto L173
            r6.setCloseShake(r3)
        L173:
            if (r11 == 0) goto L178
            r6.setVideoCacheCapacityMb(r11)
        L178:
            xyz.adscope.amps.adapter.bd.BDInitMediation$1 r11 = new xyz.adscope.amps.adapter.bd.BDInitMediation$1
            r11.<init>(r10, r12)
            r6.setBDAdInitListener(r11)
            com.baidu.mobads.sdk.api.BDAdConfig r11 = r6.build(r0)
            r11.init()
            return
        L188:
            xyz.adscope.amps.common.AMPSError r11 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r11.<init>(r1, r0)
            r10.initSDKFail(r12, r11)
            return
    }

    public int getLossReason(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L12
            r0 = 2
            if (r2 == r0) goto Lf
            r0 = 3
            if (r2 == r0) goto Lc
            r2 = 900(0x384, float:1.261E-42)
            return r2
        Lc:
            r2 = 100
            return r2
        Lf:
            r2 = 201(0xc9, float:2.82E-43)
            return r2
        L12:
            r2 = 203(0xcb, float:2.84E-43)
            return r2
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkName() {
            r1 = this;
            java.lang.String r0 = "BD"
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkVersion() {
            r1 = this;
            java.lang.String r0 = com.baidu.mobads.sdk.api.AdSettings.getSDKVersion()
            return r0
    }

    public java.util.LinkedHashMap<java.lang.String, java.lang.Object> getSecondInfo(xyz.adscope.amps.base.AMPSBidResult r6) {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            int r1 = r6.getEcpm()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ecpm"
            r0.put(r2, r1)
            java.lang.String r1 = r6.getChannelName()
            int r1 = r5.getAdn(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "adn"
            r0.put(r2, r1)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ad_t"
            r0.put(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "ad_time"
            r0.put(r2, r1)
            java.lang.String r6 = r6.getBidType()
            int r6 = r5.getAdnType(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "bid_t"
            r0.put(r1, r6)
            return r0
    }

    public java.util.LinkedHashMap<java.lang.String, java.lang.Object> getWinInfo(xyz.adscope.amps.base.AMPSBidResult r7) {
            r6 = this;
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            if (r7 != 0) goto Ld
            return r1
        Ld:
            int r2 = r7.getEcpm()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "ecpm"
            r1.put(r3, r2)
            java.lang.String r2 = r7.getChannelName()
            int r2 = r6.getAdn(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "adn"
            r1.put(r3, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "ad_t"
            r1.put(r3, r2)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "ad_time"
            r1.put(r3, r2)
            java.lang.String r2 = r7.getBidType()
            int r2 = r6.getAdnType(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "bid_t"
            r1.put(r3, r2)
            java.lang.String r2 = "is_s"
            r1.put(r2, r0)
            java.lang.String r2 = "is_c"
            r1.put(r2, r0)
            int r7 = r7.getReason()
            int r7 = r6.getLossReason(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "reason"
            r1.put(r0, r7)
            return r1
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public void initSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r3, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r4) {
            r2 = this;
            java.lang.String r0 = "com.baidu.mobads.sdk.api.BDAdConfig"
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
            boolean r0 = xyz.adscope.amps.adapter.bd.BDInitMediation.isInit
            if (r0 == 0) goto L23
            r2.initSDKSuccess(r4)
            return
        L23:
            r2.initBDSDK(r3, r4)
            return
    }
}
