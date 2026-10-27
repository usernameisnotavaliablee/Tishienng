package xyz.adscope.amps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSGlobalModel extends xyz.adscope.amps.model.AMPSBaseModel {
    private java.lang.String acceptEncrypt;
    private xyz.adscope.amps.init.AMPSInitConfig ampsInitConfig;
    private java.lang.String appId;
    private xyz.adscope.amps.model.config.response.AMPSConfigResponseModel configureResponseModel;
    private java.lang.String errorCode;
    private java.lang.String errorMsg;
    private long initStartTime;
    private xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus initStatus;
    private long sdkInitEndTime;
    private java.lang.String sessionId;
    private java.lang.String startId;

    public AMPSGlobalModel() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.appId = r0
            r2.errorCode = r0
            r2.errorMsg = r0
            java.lang.String r1 = "101,1001"
            r2.acceptEncrypt = r1
            r2.startId = r0
            r2.sessionId = r0
            return
    }

    public java.lang.String getAcceptEncrypt() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r1.configureResponseModel
            if (r0 == 0) goto L25
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            if (r0 == 0) goto L25
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r1.configureResponseModel
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            java.lang.String r0 = r0.getAcceptEncrypt()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r1.configureResponseModel
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            java.lang.String r0 = r0.getAcceptEncrypt()
            return r0
        L25:
            java.lang.String r0 = r1.acceptEncrypt
            return r0
    }

    public xyz.adscope.amps.init.AMPSInitConfig getAmpsInitConfig() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitConfig r0 = r1.ampsInitConfig
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public xyz.adscope.amps.model.config.response.AMPSConfigResponseModel getConfigureResponseModel() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r1.configureResponseModel
            return r0
    }

    public java.lang.String getErrorCode() {
            r1 = this;
            java.lang.String r0 = r1.errorCode
            return r0
    }

    public java.lang.String getErrorMsg() {
            r1 = this;
            java.lang.String r0 = r1.errorMsg
            return r0
    }

    public java.lang.String getEventId() {
            r1 = this;
            java.lang.String r0 = xyz.adscope.amps.tool.util.AMPSStringUtil.createRequestId()
            return r0
    }

    public long getEventTime() {
            r2 = this;
            long r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getTimeStamp()
            return r0
    }

    public long getInitStartTime() {
            r2 = this;
            long r0 = r2.initStartTime
            return r0
    }

    public xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus getInitStatus() {
            r1 = this;
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = r1.initStatus
            return r0
    }

    public long getLogTime() {
            r2 = this;
            long r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getTimeStamp()
            return r0
    }

    public java.lang.String getRequestId() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public long getSdkInitEndTime() {
            r2 = this;
            long r0 = r2.sdkInitEndTime
            return r0
    }

    public java.lang.String getStartId() {
            r1 = this;
            java.lang.String r0 = r1.startId
            return r0
    }

    public void setAmpsInitConfig(xyz.adscope.amps.init.AMPSInitConfig r1) {
            r0 = this;
            r0.ampsInitConfig = r1
            return
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    public void setConfigureResponseModel(xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1) {
            r0 = this;
            r0.configureResponseModel = r1
            return
    }

    public void setErrorCode(java.lang.String r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public void setErrorMsg(java.lang.String r1) {
            r0 = this;
            r0.errorMsg = r1
            return
    }

    public void setInitStartTime(long r1) {
            r0 = this;
            r0.initStartTime = r1
            return
    }

    public void setInitStatus(xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus r1) {
            r0 = this;
            r0.initStatus = r1
            return
    }

    public void setSdkInitEndTime(long r1) {
            r0 = this;
            r0.sdkInitEndTime = r1
            return
    }

    public void setStartId(java.lang.String r1) {
            r0 = this;
            r0.startId = r1
            return
    }
}
