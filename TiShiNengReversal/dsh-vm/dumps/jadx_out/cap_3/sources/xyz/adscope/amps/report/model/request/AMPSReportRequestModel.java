package xyz.adscope.amps.report.model.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSReportRequestModel {
    private xyz.adscope.amps.report.model.request.AdModel ad;
    private xyz.adscope.amps.report.model.request.AppModel app;
    private xyz.adscope.amps.report.model.request.DeviceModel device;
    private xyz.adscope.amps.report.model.request.EventModel eventModel;
    private xyz.adscope.amps.report.model.request.SdkModel sdk;
    private xyz.adscope.amps.report.model.request.UserModel user;

    public AMPSReportRequestModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public AMPSReportRequestModel(xyz.adscope.amps.report.model.request.AMPSReportRequestModel r2) {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.report.model.request.EventModel r0 = r2.getEventModel()
            r1.eventModel = r0
            xyz.adscope.amps.report.model.request.AppModel r0 = r2.getApp()
            r1.app = r0
            xyz.adscope.amps.report.model.request.DeviceModel r0 = r2.getDevice()
            r1.device = r0
            xyz.adscope.amps.report.model.request.UserModel r0 = r2.getUser()
            r1.user = r0
            xyz.adscope.amps.report.model.request.SdkModel r0 = r2.getSdk()
            r1.sdk = r0
            xyz.adscope.amps.report.model.request.AdModel r2 = r2.getAd()
            r1.ad = r2
            return
    }

    public xyz.adscope.amps.report.model.request.AdModel getAd() {
            r1 = this;
            xyz.adscope.amps.report.model.request.AdModel r0 = r1.ad
            return r0
    }

    public xyz.adscope.amps.report.model.request.AppModel getApp() {
            r1 = this;
            xyz.adscope.amps.report.model.request.AppModel r0 = r1.app
            return r0
    }

    public xyz.adscope.amps.report.model.request.DeviceModel getDevice() {
            r1 = this;
            xyz.adscope.amps.report.model.request.DeviceModel r0 = r1.device
            return r0
    }

    public xyz.adscope.amps.report.model.request.EventModel getEventModel() {
            r1 = this;
            xyz.adscope.amps.report.model.request.EventModel r0 = r1.eventModel
            return r0
    }

    public xyz.adscope.amps.report.model.request.SdkModel getSdk() {
            r1 = this;
            xyz.adscope.amps.report.model.request.SdkModel r0 = r1.sdk
            return r0
    }

    public xyz.adscope.amps.report.model.request.UserModel getUser() {
            r1 = this;
            xyz.adscope.amps.report.model.request.UserModel r0 = r1.user
            return r0
    }

    public void setAd(xyz.adscope.amps.report.model.request.AdModel r1) {
            r0 = this;
            r0.ad = r1
            return
    }

    public void setApp(xyz.adscope.amps.report.model.request.AppModel r1) {
            r0 = this;
            r0.app = r1
            return
    }

    public void setDevice(xyz.adscope.amps.report.model.request.DeviceModel r1) {
            r0 = this;
            r0.device = r1
            return
    }

    public void setEventModel(xyz.adscope.amps.report.model.request.EventModel r1) {
            r0 = this;
            r0.eventModel = r1
            return
    }

    public void setSdk(xyz.adscope.amps.report.model.request.SdkModel r1) {
            r0 = this;
            r0.sdk = r1
            return
    }

    public void setUser(xyz.adscope.amps.report.model.request.UserModel r1) {
            r0 = this;
            r0.user = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"eventModel\":"
            r0.append(r1)
            xyz.adscope.amps.report.model.request.EventModel r1 = r2.eventModel
            r0.append(r1)
            java.lang.String r1 = ", \"app\":"
            r0.append(r1)
            xyz.adscope.amps.report.model.request.AppModel r1 = r2.app
            r0.append(r1)
            java.lang.String r1 = ", \"device\":"
            r0.append(r1)
            xyz.adscope.amps.report.model.request.DeviceModel r1 = r2.device
            r0.append(r1)
            java.lang.String r1 = ", \"user\":"
            r0.append(r1)
            xyz.adscope.amps.report.model.request.UserModel r1 = r2.user
            r0.append(r1)
            java.lang.String r1 = ", \"ad\":"
            r0.append(r1)
            xyz.adscope.amps.report.model.request.AdModel r1 = r2.ad
            r0.append(r1)
            java.lang.String r1 = ", \"sdk\":"
            r0.append(r1)
            xyz.adscope.amps.report.model.request.SdkModel r1 = r2.sdk
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
