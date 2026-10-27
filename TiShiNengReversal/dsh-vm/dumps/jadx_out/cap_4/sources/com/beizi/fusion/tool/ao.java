package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ao {
    public ao() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = a(r0)     // Catch: java.lang.Exception -> Lc
        Lc:
            return r0
    }

    public static java.lang.String a(android.content.Context r7, java.lang.String r8, com.beizi.fusion.events.EventBean r9) {
            com.beizi.fusion.model.RequestInfo r0 = com.beizi.fusion.model.RequestInfo.getInstance(r7)
            boolean r1 = r0.isInit
            if (r1 != 0) goto Lb
            r0.init()
        Lb:
            com.beizi.fusion.model.DevInfo r1 = r0.getDevInfo()
            com.beizi.fusion.model.EnvInfo r2 = r0.getEnvInfo()
            if (r9 == 0) goto L4db
            java.lang.String r3 = r9.getSessionID()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L2d
            java.lang.String r3 = "__SESSIONID__"
            java.lang.String r4 = r9.getSessionID()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            goto L2d
        L2a:
            r7 = move-exception
            goto L90e
        L2d:
            java.lang.String r3 = r9.getReqId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L41
            java.lang.String r3 = "__EVENTID__"
            java.lang.String r4 = r9.getReqId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L41:
            java.lang.String r3 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L55
            java.lang.String r3 = "__EVENTCODE__"
            java.lang.String r4 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L55:
            java.lang.String r3 = r9.getAdType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L69
            java.lang.String r3 = "__ADTYPE__"
            java.lang.String r4 = r9.getAdType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L69:
            java.lang.String r3 = r9.getAppId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L7d
            java.lang.String r3 = "__PLATFORMAPPID__"
            java.lang.String r4 = r9.getAppId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L7d:
            java.lang.String r3 = r9.getSpaceId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L91
            java.lang.String r3 = "__PLATFORMPACEID__"
            java.lang.String r4 = r9.getSpaceId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L91:
            java.lang.String r3 = r9.getEventTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto La5
            java.lang.String r3 = "__EVENTTIME__"
            java.lang.String r4 = r9.getEventTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        La5:
            java.lang.String r3 = r9.getReserveTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto Lb9
            java.lang.String r3 = "__RESERVETIME__"
            java.lang.String r4 = r9.getReserveTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        Lb9:
            java.lang.String r3 = r9.getError()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto Lcd
            java.lang.String r3 = "__ERRINFO__"
            java.lang.String r4 = r9.getError()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        Lcd:
            java.lang.String r3 = r9.getExtra()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto Le1
            java.lang.String r3 = "__EXTRA__"
            java.lang.String r4 = r9.getExtra()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        Le1:
            java.lang.String r3 = r9.getErrorCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto Lf5
            java.lang.String r3 = "__ERRORCODE__"
            java.lang.String r4 = r9.getErrorCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        Lf5:
            java.lang.String r3 = r9.getBeiZiBaseId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L109
            java.lang.String r3 = "__BASEID__"
            java.lang.String r4 = r9.getBeiZiBaseId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L109:
            int r3 = r9.getBeiZiSrcType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L125
            java.lang.String r3 = "__SRCTYPE__"
            int r4 = r9.getBeiZiSrcType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L125:
            java.lang.String r3 = r9.getBeiZiPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L139
            java.lang.String r3 = "__PRICE__"
            java.lang.String r4 = r9.getBeiZiPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L139:
            java.lang.String r3 = r9.getBidPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L14d
            java.lang.String r3 = "__BIDPRICE__"
            java.lang.String r4 = r9.getBidPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L14d:
            java.lang.String r3 = r9.getBuyerId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L161
            java.lang.String r3 = "__BUYERID__"
            java.lang.String r4 = r9.getBuyerId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L161:
            java.lang.String r3 = r9.getBuyerAppId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L175
            java.lang.String r3 = "__BUYERAPPID__"
            java.lang.String r4 = r9.getBuyerAppId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L175:
            java.lang.String r3 = r9.getBuyerSpaceId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L189
            java.lang.String r3 = "__BUYERSPACEID__"
            java.lang.String r4 = r9.getBuyerSpaceId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L189:
            java.lang.String r3 = r9.getForwardId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L19d
            java.lang.String r3 = "__FORWARDID__"
            java.lang.String r4 = r9.getForwardId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L19d:
            java.lang.String r3 = r9.getParentId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L1b1
            java.lang.String r3 = "__PARENTFORWARDID__"
            java.lang.String r4 = r9.getParentId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L1b1:
            java.lang.String r3 = r9.getLevel()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L1c5
            java.lang.String r3 = "__FORWARDLEVEL__"
            java.lang.String r4 = r9.getLevel()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L1c5:
            java.lang.String r3 = r9.getBuyerSpaceUuId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L1d9
            java.lang.String r3 = "__BUYERSPACEUUID__"
            java.lang.String r4 = r9.getBuyerSpaceUuId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L1d9:
            java.lang.String r3 = r9.getSkipType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L1ed
            java.lang.String r3 = "__SKIPTYPE__"
            java.lang.String r4 = r9.getSkipType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L1ed:
            java.lang.String r3 = r9.getClickType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L201
            java.lang.String r3 = "__CLICKTYPE__"
            java.lang.String r4 = r9.getClickType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L201:
            java.lang.String r3 = r9.getGdtVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L215
            java.lang.String r3 = "__GDTVERSION__"
            java.lang.String r4 = r9.getGdtVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L215:
            java.lang.String r3 = r9.getCsjVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L229
            java.lang.String r3 = "__CSJVERSION__"
            java.lang.String r4 = r9.getCsjVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L229:
            java.lang.String r3 = r9.getKsVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L23d
            java.lang.String r3 = "__KSVERSION__"
            java.lang.String r4 = r9.getKsVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L23d:
            java.lang.String r3 = r9.getBaiduVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L251
            java.lang.String r3 = "__BAIDUVERSION__"
            java.lang.String r4 = r9.getBaiduVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L251:
            java.lang.String r3 = r9.getImbVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L265
            java.lang.String r3 = "__INMOBIVERSION__"
            java.lang.String r4 = r9.getImbVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L265:
            java.lang.String r3 = r9.getGmVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L279
            java.lang.String r3 = "__GMADVERSION__"
            java.lang.String r4 = r9.getGmVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L279:
            java.lang.String r3 = r9.getJdVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L28d
            java.lang.String r3 = "__JADYUNVERSION__"
            java.lang.String r4 = r9.getJdVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L28d:
            java.lang.String r3 = r9.getMtgVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L2a1
            java.lang.String r3 = "__MTGVERSION__"
            java.lang.String r4 = r9.getMtgVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L2a1:
            java.lang.String r3 = r9.getComponentSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L2b5
            java.lang.String r3 = "__COMPONENTSSID__"
            java.lang.String r4 = r9.getComponentSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L2b5:
            java.lang.String r3 = r9.getBzComponentSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L2c9
            java.lang.String r3 = "__BZCOMPONENTSSID__"
            java.lang.String r4 = r9.getBzComponentSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L2c9:
            java.lang.String r3 = r9.getPlatformFilterSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L2dd
            java.lang.String r3 = "__PLATFORMFILTERSSID__"
            java.lang.String r4 = r9.getPlatformFilterSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L2dd:
            java.lang.String r3 = r9.getChannelFilterSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L2f1
            java.lang.String r3 = "__CHANNELFILTERSSID__"
            java.lang.String r4 = r9.getChannelFilterSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L2f1:
            java.lang.String r3 = r9.getRenderViewSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L305
            java.lang.String r3 = "__RENDERVIEWSSID__"
            java.lang.String r4 = r9.getRenderViewSsid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L305:
            java.lang.String r3 = r9.getScrollClickUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L319
            java.lang.String r3 = "__SCROLLCLICKUUID__"
            java.lang.String r4 = r9.getScrollClickUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L319:
            java.lang.String r3 = r9.getShakeViewUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L32d
            java.lang.String r3 = "__SHAKEVIEWUUID__"
            java.lang.String r4 = r9.getShakeViewUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L32d:
            java.lang.String r3 = r9.getRegionalClickUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L341
            java.lang.String r3 = "__REGIONALCLICKUUID__"
            java.lang.String r4 = r9.getRegionalClickUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L341:
            java.lang.String r3 = r9.getFullScreenClickUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L355
            java.lang.String r3 = "__FULLSCREENCLICKUUID__"
            java.lang.String r4 = r9.getFullScreenClickUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L355:
            java.lang.String r3 = r9.getRollViewUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L369
            java.lang.String r3 = "__ROLLVIEWUUID__"
            java.lang.String r4 = r9.getRollViewUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L369:
            java.lang.String r3 = r9.getIsClickEye()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r4 != 0) goto L379
            java.lang.String r4 = "__ZOOMOUTAD__"
            java.lang.String r8 = r8.replace(r4, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L379:
            java.lang.String r3 = r9.getCallBackStrategyUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L38d
            java.lang.String r3 = "__BACKSTRATEGYUUID__"
            java.lang.String r4 = r9.getCallBackStrategyUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L38d:
            java.lang.String r3 = r9.getDislikeUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L3a1
            java.lang.String r3 = "__DISLIKEUUID__"
            java.lang.String r4 = r9.getDislikeUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L3a1:
            java.lang.String r3 = r9.getEulerAngleUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L3b5
            java.lang.String r3 = "__EULERANGLEUUID__"
            java.lang.String r4 = r9.getEulerAngleUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L3b5:
            java.lang.String r3 = r9.getComplain()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L3db
            java.lang.String r3 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r4 != 0) goto L3db
            java.lang.String r4 = "290.500"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 == 0) goto L3db
            java.lang.String r3 = "__COMPLAIN__"
            java.lang.String r4 = r9.getComplain()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L3db:
            java.lang.String r3 = r9.getWinPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r4 = "280.270"
            java.lang.String r5 = "280.260"
            if (r3 != 0) goto L409
            java.lang.String r3 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r6 != 0) goto L409
            boolean r6 = r5.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r6 != 0) goto L3ff
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 == 0) goto L409
        L3ff:
            java.lang.String r3 = "__WIN_PRICE__"
            java.lang.String r6 = r9.getWinPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r6)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L409:
            java.lang.String r3 = r9.getSecondPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L42d
            java.lang.String r3 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r6 != 0) goto L42d
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 == 0) goto L42d
            java.lang.String r3 = "__SECOND_PRICE__"
            java.lang.String r6 = r9.getSecondPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r6)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L42d:
            java.lang.String r3 = r9.getAdnId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L457
            java.lang.String r3 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r6 != 0) goto L457
            boolean r6 = r5.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r6 != 0) goto L44d
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 == 0) goto L457
        L44d:
            java.lang.String r3 = "__ADN_ID__"
            java.lang.String r6 = r9.getAdnId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r6)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L457:
            java.lang.String r3 = r9.getHighestLossPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L47b
            java.lang.String r3 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r6 != 0) goto L47b
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 == 0) goto L47b
            java.lang.String r3 = "__HIGHEST_LOSS_PRICE__"
            java.lang.String r5 = r9.getHighestLossPrice()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r5)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L47b:
            java.lang.String r3 = r9.getLossReason()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L49f
            java.lang.String r3 = r9.getEventCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r5 != 0) goto L49f
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 == 0) goto L49f
            java.lang.String r3 = "__LOSS_REASON__"
            java.lang.String r4 = r9.getLossReason()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L49f:
            java.lang.String r3 = r9.getIsCacheAd()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L4b3
            java.lang.String r3 = "__IS_CACHE__"
            java.lang.String r4 = r9.getIsCacheAd()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L4b3:
            java.lang.String r3 = r9.getCacheTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L4c7
            java.lang.String r3 = "__CACHE_TIME__"
            java.lang.String r4 = r9.getCacheTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L4c7:
            java.lang.String r3 = r9.getNativeRuleUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L4db
            java.lang.String r3 = "__NATIVERULEUUID__"
            java.lang.String r9 = r9.getNativeRuleUuid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L4db:
            java.lang.String r9 = r0.getAppId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L4ef
            java.lang.String r9 = "__APPID__"
            java.lang.String r3 = r0.getAppId()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L4ef:
            java.lang.String r9 = r0.getChannelStr()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L503
            java.lang.String r9 = "__CHANNELSTRING__"
            java.lang.String r3 = r0.getChannelStr()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L503:
            java.lang.String r9 = r0.getCustomOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L517
            java.lang.String r9 = "__CUSTOMOAID__"
            java.lang.String r3 = r0.getCustomOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L517:
            com.beizi.fusion.model.ResponseInfo r9 = com.beizi.fusion.model.ResponseInfo.getInstance(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r9 = r9.getConfigVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L52b
            java.lang.String r3 = "__CONFIGVERSION__"
            java.lang.String r8 = r8.replace(r3, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L52b:
            com.beizi.fusion.model.ResponseInfo r9 = com.beizi.fusion.model.ResponseInfo.getInstance(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            com.beizi.fusion.model.Configurator r9 = r9.getConfigurator()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 == 0) goto L549
            java.lang.String r3 = r9.getVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L549
            java.lang.String r3 = "__CONFIGURATORCONFIGVERSION__"
            java.lang.String r9 = r9.getVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L549:
            com.beizi.fusion.model.ResponseInfo r9 = com.beizi.fusion.model.ResponseInfo.getInstance(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            com.beizi.fusion.model.Manager r9 = r9.getManager()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 == 0) goto L567
            java.lang.String r3 = r9.getConfigVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L567
            java.lang.String r3 = "__MANAGERCONFIGVERSION__"
            java.lang.String r9 = r9.getConfigVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L567:
            com.beizi.fusion.model.ResponseInfo r9 = com.beizi.fusion.model.ResponseInfo.getInstance(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            com.beizi.fusion.model.Messenger r9 = r9.getMessenger()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 == 0) goto L585
            java.lang.String r3 = r9.getConfigVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r3 != 0) goto L585
            java.lang.String r3 = "__MESSENGERCONFIGVERSION__"
            java.lang.String r9 = r9.getConfigVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L585:
            java.lang.String r9 = r1.getPlatform()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L599
            java.lang.String r9 = "__PLATFORM__"
            java.lang.String r3 = r1.getPlatform()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L599:
            java.lang.String r9 = r0.getPackageName()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L5ad
            java.lang.String r9 = "__PACKAGENAME__"
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L5ad:
            java.lang.String r9 = r0.getInstallTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L5c1
            java.lang.String r9 = "__INSTALLTIME__"
            java.lang.String r3 = r0.getInstallTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L5c1:
            java.lang.String r9 = r0.getUpdateTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L5e3
            java.lang.String r9 = "__UPDATETIME__"
            java.lang.String r3 = r0.getUpdateTime()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r9 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r3 = "__UPLOADTIME__"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r9.replace(r3, r4)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L5e3:
            java.lang.String r9 = r0.getAppVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L5f7
            java.lang.String r9 = "__APPVERSION__"
            java.lang.String r3 = r0.getAppVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L5f7:
            java.lang.String r9 = r0.getAppVersionCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L60b
            java.lang.String r9 = "__APPVERSIONCODE__"
            java.lang.String r3 = r0.getAppVersionCode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L60b:
            java.lang.String r9 = r0.getSdkVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L61f
            java.lang.String r9 = "__SDKVERSION__"
            java.lang.String r3 = r0.getSdkVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L61f:
            java.lang.String r9 = r1.getSdkUID()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L633
            java.lang.String r9 = "__SDKUID__"
            java.lang.String r3 = r1.getSdkUID()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L633:
            java.lang.String r9 = r1.getSdkUIDOrig()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L647
            java.lang.String r9 = "__SDKUIDORIG__"
            java.lang.String r3 = r1.getSdkUIDOrig()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L647:
            java.lang.String r9 = r1.getOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r3 = "__OAID__"
            if (r9 != 0) goto L65c
            java.lang.String r9 = r1.getOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            goto L66e
        L65c:
            java.lang.String r9 = r0.getCustomOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L66e
            java.lang.String r9 = r0.getCustomOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r3, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L66e:
            java.lang.String r9 = r1.getHonorOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L682
            java.lang.String r9 = "__HONOROAID__"
            java.lang.String r3 = r1.getHonorOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L682:
            java.lang.String r9 = r1.getGaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L696
            java.lang.String r9 = "__GAID__"
            java.lang.String r3 = r1.getGaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L696:
            java.lang.String r9 = r1.getSmOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L6aa
            java.lang.String r9 = "__SMOAID__"
            java.lang.String r3 = r1.getSmOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L6aa:
            java.lang.String r9 = r1.getCnOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L6be
            java.lang.String r9 = "__CNOAID__"
            java.lang.String r3 = r1.getCnOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L6be:
            java.lang.String r9 = r1.getMsaOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L6d2
            java.lang.String r9 = "__MSAOAID__"
            java.lang.String r3 = r1.getMsaOaid()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L6d2:
            java.lang.String r9 = r1.getOs()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L6e6
            java.lang.String r9 = "__OS__"
            java.lang.String r3 = r1.getOs()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L6e6:
            java.lang.String r9 = r1.getDevType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L6fa
            java.lang.String r9 = "__DEVTYPE__"
            java.lang.String r3 = r1.getDevType()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L6fa:
            java.lang.String r9 = r1.getBrand()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L70e
            java.lang.String r9 = "__BRAND__"
            java.lang.String r3 = r1.getBrand()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L70e:
            java.lang.String r9 = r1.getModel()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L722
            java.lang.String r9 = "__MODEL__"
            java.lang.String r3 = r1.getModel()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L722:
            java.lang.String r9 = r1.getResolution()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L736
            java.lang.String r9 = "__RESOLUTION__"
            java.lang.String r3 = r1.getResolution()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L736:
            java.lang.String r9 = r1.getScreenSize()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L74a
            java.lang.String r9 = "__SCREENSIZE__"
            java.lang.String r3 = r1.getScreenSize()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L74a:
            java.lang.String r9 = r1.getLanguage()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L75e
            java.lang.String r9 = "__LANGUAGE__"
            java.lang.String r3 = r1.getLanguage()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L75e:
            java.lang.String r9 = r1.getDensity()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L772
            java.lang.String r9 = "__DENSITY__"
            java.lang.String r3 = r1.getDensity()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L772:
            java.lang.String r9 = r1.getRoot()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L786
            java.lang.String r9 = "__ROOT__"
            java.lang.String r3 = r1.getRoot()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r3)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L786:
            java.lang.String r9 = r1.getRomVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L79a
            java.lang.String r9 = "__ROMVERSION__"
            java.lang.String r1 = r1.getRomVersion()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L79a:
            java.lang.String r9 = r2.getUserAgent()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L7ae
            java.lang.String r9 = "__USERAGENT__"
            java.lang.String r1 = r2.getUserAgent()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L7ae:
            java.lang.String r9 = r2.getNet()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L7c2
            java.lang.String r9 = "__NET__"
            java.lang.String r1 = r2.getNet()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L7c2:
            java.lang.String r9 = r2.getIsp()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L7d6
            java.lang.String r9 = "__ISP__"
            java.lang.String r1 = r2.getIsp()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L7d6:
            java.lang.String r9 = r2.isDeveloperMode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L7ea
            java.lang.String r9 = "__DEVELOPERMODE__"
            java.lang.String r1 = r2.isDeveloperMode()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L7ea:
            java.lang.String r9 = r2.isIsDebugApk()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L7fe
            java.lang.String r9 = "__ISDEBUGAPK__"
            java.lang.String r1 = r2.isIsDebugApk()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L7fe:
            java.lang.String r9 = r2.isIsDebugConnected()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L812
            java.lang.String r9 = "__ISDEBUGCONNECTED__"
            java.lang.String r1 = r2.isIsDebugConnected()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L812:
            java.lang.String r9 = r2.isIsWifiProxy()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L826
            java.lang.String r9 = "__ISWIFIPROXY__"
            java.lang.String r1 = r2.isIsWifiProxy()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L826:
            com.beizi.fusion.model.AppEventId r7 = com.beizi.fusion.model.AppEventId.getInstance(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r7 == 0) goto L8b9
            java.lang.String r9 = r7.getAppStart()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L840
            java.lang.String r9 = "__APPSTART__"
            java.lang.String r1 = r7.getAppStart()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L840:
            java.lang.String r9 = r7.getAppSdkInit()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L854
            java.lang.String r9 = "__APPSDKINIT__"
            java.lang.String r1 = r7.getAppSdkInit()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L854:
            java.lang.String r9 = r7.getAppSplashRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L868
            java.lang.String r9 = "__APPSPLASHREQUEST__"
            java.lang.String r1 = r7.getAppSplashRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L868:
            java.lang.String r9 = r7.getAppNativeRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L87c
            java.lang.String r9 = "__APPNATIVEREQUEST__"
            java.lang.String r1 = r7.getAppNativeRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L87c:
            java.lang.String r9 = r7.getAppRewardedVideoRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L890
            java.lang.String r9 = "__APPREWARDEDVIDEOREQUEST__"
            java.lang.String r1 = r7.getAppRewardedVideoRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L890:
            java.lang.String r9 = r7.getAppFullScreenVideoRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L8a4
            java.lang.String r9 = "__APPFULLSCREENVIDEOREQUEST__"
            java.lang.String r1 = r7.getAppFullScreenVideoRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r8 = r8.replace(r9, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
        L8a4:
            java.lang.String r9 = r7.getAppBannerRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r9 != 0) goto L8b9
            java.lang.String r9 = "__APPBANNERREQUEST__"
            java.lang.String r7 = r7.getAppBannerRequest()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r7 = r8.replace(r9, r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            r8 = r7
        L8b9:
            java.lang.String r7 = r2.isIsLockScreen()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r7 != 0) goto L8ce
            java.lang.String r7 = "__ISLOCKSCREEN__"
            java.lang.String r9 = r2.isIsLockScreen()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r7 = r8.replace(r7, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            r8 = r7
        L8ce:
            java.lang.String r7 = r2.isIsVpn()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r7 != 0) goto L8e3
            java.lang.String r7 = "__ISVPN__"
            java.lang.String r9 = r2.isIsVpn()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r7 = r8.replace(r7, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            r8 = r7
        L8e3:
            java.lang.String r7 = r2.isIsSimulator()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r7 != 0) goto L8f8
            java.lang.String r7 = "__ISSIMULATOR__"
            java.lang.String r9 = r2.isIsSimulator()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r7 = r8.replace(r7, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            r8 = r7
        L8f8:
            java.lang.String r7 = r0.getForbidSensor()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            if (r7 != 0) goto L90d
            java.lang.String r7 = "__FORBID_SENSOR__"
            java.lang.String r9 = r0.getForbidSensor()     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            java.lang.String r7 = r8.replace(r7, r9)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L911
            return r7
        L90d:
            return r8
        L90e:
            r7.getMessage()
        L911:
            return r8
    }

    public static java.lang.String a(android.content.Context r0, java.lang.String r1, com.beizi.fusion.events.EventBean r2, java.lang.String r3) {
            java.lang.String r0 = a(r0, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto L10
            java.lang.String r1 = "__APPLINKS__"
            java.lang.String r0 = r0.replace(r1, r3)     // Catch: java.lang.Exception -> L10
        L10:
            return r0
    }

    public static java.lang.String a(java.lang.String r5) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)     // Catch: java.lang.Throwable -> L38
            byte[] r5 = r0.digest(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            int r1 = r5.length     // Catch: java.lang.Throwable -> L38
            int r1 = r1 * 2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            int r1 = r5.length     // Catch: java.lang.Throwable -> L38
            r2 = 0
        L1a:
            if (r2 >= r1) goto L33
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L38
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 16
            if (r3 >= r4) goto L29
            java.lang.String r4 = "0"
            r0.append(r4)     // Catch: java.lang.Throwable -> L38
        L29:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L38
            r0.append(r3)     // Catch: java.lang.Throwable -> L38
            int r2 = r2 + 1
            goto L1a
        L33:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L38
            return r5
        L38:
            java.lang.String r5 = ""
            return r5
    }

    public static java.lang.String b() {
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [66, 85, 72, 68, 65} // fill-array
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.reverse()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
