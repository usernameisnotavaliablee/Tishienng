package xyz.adscope.amps.report.model.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class EventModel {
    private java.lang.String accessKey;
    private java.lang.String adSourceAppId;
    private java.lang.String adSourceId;
    private java.lang.String adSourceSpaceId;
    private java.lang.String adsCustomData;
    private java.lang.String affiliated;
    private java.lang.String bidSeatId;
    private java.lang.String bidSpaceId;
    private java.lang.String bidStrategyCustomData;
    private java.lang.String biddingType;
    private java.lang.String cfgCustomData;
    private java.lang.String cfgVersion;
    private java.lang.String customId;
    private java.lang.String customLogger;
    private java.lang.String ecpm;
    private java.lang.String errorCode;
    private java.lang.String errorInfo;
    private java.lang.String eventCode;
    private java.lang.String eventCustomData;
    private java.lang.String eventId;
    private long eventTime;
    private java.lang.String eventVersion;
    private java.lang.String exception;
    private java.lang.String isHitAuction;
    private java.lang.String isLastLook;
    private java.lang.String logTime;
    private java.lang.String logVersion;
    private java.lang.String lossReason;
    private java.lang.String mdCustomData;
    private java.lang.String mdVersion;
    private java.lang.String mediationAppId;
    private java.lang.String mediationSpaceId;
    private java.lang.String noticePrice;
    private java.lang.String realPrice;
    private java.lang.String roundTripTime;
    private java.lang.String sessionId;
    private java.lang.String startId;

    public EventModel() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.logVersion = r0
            r3.startId = r0
            r3.sessionId = r0
            r3.accessKey = r0
            r3.customId = r0
            r3.customLogger = r0
            r3.mediationAppId = r0
            r3.mediationSpaceId = r0
            r3.adSourceId = r0
            r3.adSourceAppId = r0
            r3.adSourceSpaceId = r0
            r3.ecpm = r0
            r3.eventCode = r0
            r3.eventId = r0
            r1 = 0
            r3.eventTime = r1
            r3.errorCode = r0
            r3.errorInfo = r0
            r3.logTime = r0
            r3.cfgCustomData = r0
            r3.eventCustomData = r0
            r3.mdCustomData = r0
            r3.adsCustomData = r0
            r3.cfgVersion = r0
            r3.eventVersion = r0
            r3.mdVersion = r0
            r3.roundTripTime = r0
            r3.biddingType = r0
            r3.affiliated = r0
            r3.exception = r0
            return
    }

    public EventModel(xyz.adscope.amps.report.model.request.EventModel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.logVersion = r0
            r3.startId = r0
            r3.sessionId = r0
            r3.accessKey = r0
            r3.customId = r0
            r3.customLogger = r0
            r3.mediationAppId = r0
            r3.mediationSpaceId = r0
            r3.adSourceId = r0
            r3.adSourceAppId = r0
            r3.adSourceSpaceId = r0
            r3.ecpm = r0
            r3.eventCode = r0
            r3.eventId = r0
            r1 = 0
            r3.eventTime = r1
            r3.errorCode = r0
            r3.errorInfo = r0
            r3.logTime = r0
            r3.cfgCustomData = r0
            r3.eventCustomData = r0
            r3.mdCustomData = r0
            r3.adsCustomData = r0
            r3.cfgVersion = r0
            r3.eventVersion = r0
            r3.mdVersion = r0
            r3.roundTripTime = r0
            r3.biddingType = r0
            r3.affiliated = r0
            r3.exception = r0
            java.lang.String r0 = r4.getLogVersion()
            r3.logVersion = r0
            java.lang.String r0 = r4.getStartId()
            r3.startId = r0
            java.lang.String r0 = r4.getSessionId()
            r3.sessionId = r0
            java.lang.String r0 = r4.getAccessKey()
            r3.accessKey = r0
            java.lang.String r0 = r4.getCustomId()
            r3.customId = r0
            java.lang.String r0 = r4.getCustomLogger()
            r3.customLogger = r0
            java.lang.String r0 = r4.getMediationAppId()
            r3.mediationAppId = r0
            java.lang.String r0 = r4.getMediationSpaceId()
            r3.mediationSpaceId = r0
            java.lang.String r0 = r4.getAdSourceId()
            r3.adSourceId = r0
            java.lang.String r0 = r4.getAdSourceAppId()
            r3.adSourceAppId = r0
            java.lang.String r0 = r4.getAdSourceSpaceId()
            r3.adSourceSpaceId = r0
            java.lang.String r0 = r4.getEcpm()
            r3.ecpm = r0
            java.lang.String r0 = r4.getEventCode()
            r3.eventCode = r0
            java.lang.String r0 = r4.getEventId()
            r3.eventId = r0
            long r0 = r4.getEventTime()
            r3.eventTime = r0
            java.lang.String r0 = r4.getErrorCode()
            r3.errorCode = r0
            java.lang.String r0 = r4.getErrorInfo()
            r3.errorInfo = r0
            java.lang.String r0 = r4.getLogTime()
            r3.logTime = r0
            java.lang.String r0 = r4.getCfgCustomData()
            r3.cfgCustomData = r0
            java.lang.String r0 = r4.getEventCustomData()
            r3.eventCustomData = r0
            java.lang.String r0 = r4.getMdCustomData()
            r3.mdCustomData = r0
            java.lang.String r0 = r4.getAdsCustomData()
            r3.adsCustomData = r0
            java.lang.String r0 = r4.getCfgVersion()
            r3.cfgVersion = r0
            java.lang.String r0 = r4.getEventVersion()
            r3.eventVersion = r0
            java.lang.String r0 = r4.getMdVersion()
            r3.mdVersion = r0
            java.lang.String r0 = r4.getRoundTripTime()
            r3.roundTripTime = r0
            java.lang.String r0 = r4.getBiddingType()
            r3.biddingType = r0
            java.lang.String r0 = r4.getAffiliated()
            r3.affiliated = r0
            java.lang.String r0 = r4.getException()
            r3.exception = r0
            java.lang.String r0 = r4.getIsHitAuction()
            r3.isHitAuction = r0
            java.lang.String r0 = r4.getIsLastLook()
            r3.isLastLook = r0
            java.lang.String r0 = r4.getBidStrategyCustomData()
            r3.bidStrategyCustomData = r0
            java.lang.String r0 = r4.getNoticePrice()
            r3.noticePrice = r0
            java.lang.String r0 = r4.getLossReason()
            r3.lossReason = r0
            java.lang.String r0 = r4.getRealPrice()
            r3.realPrice = r0
            java.lang.String r0 = r4.getBidSeatId()
            r3.bidSeatId = r0
            java.lang.String r4 = r4.getBidSpaceId()
            r3.bidSpaceId = r4
            return
    }

    public java.lang.String getAccessKey() {
            r1 = this;
            java.lang.String r0 = r1.accessKey
            return r0
    }

    public java.lang.String getAdSourceAppId() {
            r1 = this;
            java.lang.String r0 = r1.adSourceAppId
            return r0
    }

    public java.lang.String getAdSourceId() {
            r1 = this;
            java.lang.String r0 = r1.adSourceId
            return r0
    }

    public java.lang.String getAdSourceSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.adSourceSpaceId
            return r0
    }

    public java.lang.String getAdsCustomData() {
            r1 = this;
            java.lang.String r0 = r1.adsCustomData
            return r0
    }

    public java.lang.String getAffiliated() {
            r1 = this;
            java.lang.String r0 = r1.affiliated
            return r0
    }

    public java.lang.String getBidSeatId() {
            r1 = this;
            java.lang.String r0 = r1.bidSeatId
            return r0
    }

    public java.lang.String getBidSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.bidSpaceId
            return r0
    }

    public java.lang.String getBidStrategyCustomData() {
            r1 = this;
            java.lang.String r0 = r1.bidStrategyCustomData
            return r0
    }

    public java.lang.String getBiddingType() {
            r1 = this;
            java.lang.String r0 = r1.biddingType
            return r0
    }

    public java.lang.String getCfgCustomData() {
            r1 = this;
            java.lang.String r0 = r1.cfgCustomData
            return r0
    }

    public java.lang.String getCfgVersion() {
            r1 = this;
            java.lang.String r0 = r1.cfgVersion
            return r0
    }

    public java.lang.String getCustomId() {
            r1 = this;
            java.lang.String r0 = r1.customId
            return r0
    }

    public java.lang.String getCustomLogger() {
            r1 = this;
            java.lang.String r0 = r1.customLogger
            return r0
    }

    public java.lang.String getEcpm() {
            r1 = this;
            java.lang.String r0 = r1.ecpm
            return r0
    }

    public java.lang.String getErrorCode() {
            r1 = this;
            java.lang.String r0 = r1.errorCode
            return r0
    }

    public java.lang.String getErrorInfo() {
            r1 = this;
            java.lang.String r0 = r1.errorInfo
            return r0
    }

    public java.lang.String getEventCode() {
            r1 = this;
            java.lang.String r0 = r1.eventCode
            return r0
    }

    public java.lang.String getEventCustomData() {
            r1 = this;
            java.lang.String r0 = r1.eventCustomData
            return r0
    }

    public java.lang.String getEventId() {
            r1 = this;
            java.lang.String r0 = r1.eventId
            return r0
    }

    public long getEventTime() {
            r2 = this;
            long r0 = r2.eventTime
            return r0
    }

    public java.lang.String getEventVersion() {
            r1 = this;
            java.lang.String r0 = r1.eventVersion
            return r0
    }

    public java.lang.String getException() {
            r1 = this;
            java.lang.String r0 = r1.exception
            return r0
    }

    public java.lang.String getIsHitAuction() {
            r1 = this;
            java.lang.String r0 = r1.isHitAuction
            return r0
    }

    public java.lang.String getIsLastLook() {
            r1 = this;
            java.lang.String r0 = r1.isLastLook
            return r0
    }

    public java.lang.String getLogTime() {
            r1 = this;
            java.lang.String r0 = r1.logTime
            return r0
    }

    public java.lang.String getLogVersion() {
            r1 = this;
            java.lang.String r0 = r1.logVersion
            return r0
    }

    public java.lang.String getLossReason() {
            r1 = this;
            java.lang.String r0 = r1.lossReason
            return r0
    }

    public java.lang.String getMdCustomData() {
            r1 = this;
            java.lang.String r0 = r1.mdCustomData
            return r0
    }

    public java.lang.String getMdVersion() {
            r1 = this;
            java.lang.String r0 = r1.mdVersion
            return r0
    }

    public java.lang.String getMediationAppId() {
            r1 = this;
            java.lang.String r0 = r1.mediationAppId
            return r0
    }

    public java.lang.String getMediationSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.mediationSpaceId
            return r0
    }

    public java.lang.String getNoticePrice() {
            r1 = this;
            java.lang.String r0 = r1.noticePrice
            return r0
    }

    public java.lang.String getRealPrice() {
            r1 = this;
            java.lang.String r0 = r1.realPrice
            return r0
    }

    public java.lang.String getRoundTripTime() {
            r1 = this;
            java.lang.String r0 = r1.roundTripTime
            return r0
    }

    public java.lang.String getSessionId() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            return r0
    }

    public java.lang.String getStartId() {
            r1 = this;
            java.lang.String r0 = r1.startId
            return r0
    }

    public void setAccessKey(java.lang.String r1) {
            r0 = this;
            r0.accessKey = r1
            return
    }

    public void setAdSourceAppId(java.lang.String r1) {
            r0 = this;
            r0.adSourceAppId = r1
            return
    }

    public void setAdSourceId(java.lang.String r1) {
            r0 = this;
            r0.adSourceId = r1
            return
    }

    public void setAdSourceSpaceId(java.lang.String r1) {
            r0 = this;
            r0.adSourceSpaceId = r1
            return
    }

    public void setAdsCustomData(java.lang.String r1) {
            r0 = this;
            r0.adsCustomData = r1
            return
    }

    public void setAffiliated(java.lang.String r1) {
            r0 = this;
            r0.affiliated = r1
            return
    }

    public void setBidSeatId(java.lang.String r1) {
            r0 = this;
            r0.bidSeatId = r1
            return
    }

    public void setBidSpaceId(java.lang.String r1) {
            r0 = this;
            r0.bidSpaceId = r1
            return
    }

    public void setBidStrategyCustomData(java.lang.String r1) {
            r0 = this;
            r0.bidStrategyCustomData = r1
            return
    }

    public void setBiddingType(java.lang.String r1) {
            r0 = this;
            r0.biddingType = r1
            return
    }

    public void setCfgCustomData(java.lang.String r1) {
            r0 = this;
            r0.cfgCustomData = r1
            return
    }

    public void setCfgVersion(java.lang.String r1) {
            r0 = this;
            r0.cfgVersion = r1
            return
    }

    public void setCustomId(java.lang.String r1) {
            r0 = this;
            r0.customId = r1
            return
    }

    public void setCustomLogger(java.lang.String r1) {
            r0 = this;
            r0.customLogger = r1
            return
    }

    public void setEcpm(java.lang.String r1) {
            r0 = this;
            r0.ecpm = r1
            return
    }

    public void setErrorCode(java.lang.String r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public void setErrorInfo(java.lang.String r1) {
            r0 = this;
            r0.errorInfo = r1
            return
    }

    public void setEventCode(java.lang.String r1) {
            r0 = this;
            r0.eventCode = r1
            return
    }

    public void setEventCustomData(java.lang.String r1) {
            r0 = this;
            r0.eventCustomData = r1
            return
    }

    public void setEventId(java.lang.String r1) {
            r0 = this;
            r0.eventId = r1
            return
    }

    public void setEventTime(long r1) {
            r0 = this;
            r0.eventTime = r1
            return
    }

    public void setEventVersion(java.lang.String r1) {
            r0 = this;
            r0.eventVersion = r1
            return
    }

    public void setException(java.lang.String r1) {
            r0 = this;
            r0.exception = r1
            return
    }

    public void setIsHitAuction(java.lang.String r1) {
            r0 = this;
            r0.isHitAuction = r1
            return
    }

    public void setIsLastLook(java.lang.String r1) {
            r0 = this;
            r0.isLastLook = r1
            return
    }

    public void setLogTime(java.lang.String r1) {
            r0 = this;
            r0.logTime = r1
            return
    }

    public void setLogVersion(java.lang.String r1) {
            r0 = this;
            r0.logVersion = r1
            return
    }

    public void setLossReason(java.lang.String r1) {
            r0 = this;
            r0.lossReason = r1
            return
    }

    public void setMdCustomData(java.lang.String r1) {
            r0 = this;
            r0.mdCustomData = r1
            return
    }

    public void setMdVersion(java.lang.String r1) {
            r0 = this;
            r0.mdVersion = r1
            return
    }

    public void setMediationAppId(java.lang.String r1) {
            r0 = this;
            r0.mediationAppId = r1
            return
    }

    public void setMediationSpaceId(java.lang.String r1) {
            r0 = this;
            r0.mediationSpaceId = r1
            return
    }

    public void setNoticePrice(java.lang.String r1) {
            r0 = this;
            r0.noticePrice = r1
            return
    }

    public void setRealPrice(java.lang.String r1) {
            r0 = this;
            r0.realPrice = r1
            return
    }

    public void setRoundTripTime(java.lang.String r1) {
            r0 = this;
            r0.roundTripTime = r1
            return
    }

    public void setSessionId(java.lang.String r1) {
            r0 = this;
            r0.sessionId = r1
            return
    }

    public void setStartId(java.lang.String r1) {
            r0 = this;
            r0.startId = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"startId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.startId
            r0.append(r1)
            java.lang.String r1 = "\",\"logVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r3.logVersion
            r0.append(r1)
            java.lang.String r1 = "\",\"sessionId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.sessionId
            r0.append(r1)
            java.lang.String r1 = "\",\"accessKey\":\""
            r0.append(r1)
            java.lang.String r1 = r3.accessKey
            r0.append(r1)
            java.lang.String r1 = "\",\"customId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.customId
            r0.append(r1)
            java.lang.String r1 = "\",\"customLogger\":\""
            r0.append(r1)
            java.lang.String r1 = r3.customLogger
            r0.append(r1)
            java.lang.String r1 = "\",\"mediationAppId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.mediationAppId
            r0.append(r1)
            java.lang.String r1 = "\",\"mediationSpaceId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.mediationSpaceId
            r0.append(r1)
            java.lang.String r1 = "\",\"adSourceId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.adSourceId
            r0.append(r1)
            java.lang.String r1 = "\",\"adSourceAppId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.adSourceAppId
            r0.append(r1)
            java.lang.String r1 = "\",\"adSourceSpaceId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.adSourceSpaceId
            r0.append(r1)
            java.lang.String r1 = "\",\"ecpm\":\""
            r0.append(r1)
            java.lang.String r1 = r3.ecpm
            r0.append(r1)
            java.lang.String r1 = "\",\"eventCode\":\""
            r0.append(r1)
            java.lang.String r1 = r3.eventCode
            r0.append(r1)
            java.lang.String r1 = "\",\"eventId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.eventId
            r0.append(r1)
            java.lang.String r1 = "\",\"eventTime\":"
            r0.append(r1)
            long r1 = r3.eventTime
            r0.append(r1)
            java.lang.String r1 = ",\"errorCode\":\""
            r0.append(r1)
            java.lang.String r1 = r3.errorCode
            r0.append(r1)
            java.lang.String r1 = "\",\"errorInfo\":\""
            r0.append(r1)
            java.lang.String r1 = r3.errorInfo
            r0.append(r1)
            java.lang.String r1 = "\",\"logTime\":\""
            r0.append(r1)
            java.lang.String r1 = r3.logTime
            r0.append(r1)
            java.lang.String r1 = "\",\"cfgCustomData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.cfgCustomData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\",\"eventCustomData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.eventCustomData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\",\"mdCustomData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.mdCustomData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\",\"adsCustomData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.adsCustomData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\",\"cfgVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r3.cfgVersion
            r0.append(r1)
            java.lang.String r1 = "\",\"eventVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r3.eventVersion
            r0.append(r1)
            java.lang.String r1 = "\",\"mdVersion\":\""
            r0.append(r1)
            java.lang.String r1 = r3.mdVersion
            r0.append(r1)
            java.lang.String r1 = "\",\"roundTripTime\":\""
            r0.append(r1)
            java.lang.String r1 = r3.roundTripTime
            r0.append(r1)
            java.lang.String r1 = "\",\"affiliated\":\""
            r0.append(r1)
            java.lang.String r1 = r3.affiliated
            r0.append(r1)
            java.lang.String r1 = "\",\"exception\":\""
            r0.append(r1)
            java.lang.String r1 = r3.exception
            r0.append(r1)
            java.lang.String r1 = "\",\"biddingType\":\""
            r0.append(r1)
            java.lang.String r1 = r3.biddingType
            r0.append(r1)
            java.lang.String r1 = "\",\"isHitAuction\":\""
            r0.append(r1)
            java.lang.String r1 = r3.isHitAuction
            r0.append(r1)
            java.lang.String r1 = "\",\"isLastLook\":\""
            r0.append(r1)
            java.lang.String r1 = r3.isLastLook
            r0.append(r1)
            java.lang.String r1 = "\",\"bidStrategyCustomData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.bidStrategyCustomData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\",\"noticePrice\":\""
            r0.append(r1)
            java.lang.String r1 = r3.noticePrice
            r0.append(r1)
            java.lang.String r1 = "\",\"lossReason\":\""
            r0.append(r1)
            java.lang.String r1 = r3.lossReason
            r0.append(r1)
            java.lang.String r1 = "\",\"realPrice\":\""
            r0.append(r1)
            java.lang.String r1 = r3.realPrice
            r0.append(r1)
            java.lang.String r1 = "\",\"bidSeatId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.bidSeatId
            r0.append(r1)
            java.lang.String r1 = "\",\"bidSpaceId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.bidSpaceId
            r0.append(r1)
            java.lang.String r1 = "\"}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
