package xyz.adscope.amps.model.config.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSConfigRequestModel extends xyz.adscope.amps.model.AMPSBaseModel {
    private xyz.adscope.amps.model.config.request.AppModel app;
    private xyz.adscope.amps.model.config.request.DeviceModel device;
    private xyz.adscope.amps.model.config.request.AMPSExtModel ext;
    private xyz.adscope.amps.model.config.request.SdkModel sdk;
    private long time;
    private xyz.adscope.amps.model.config.request.UserModel user;

    public AMPSConfigRequestModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public xyz.adscope.amps.model.config.request.AppModel getApp() {
            r1 = this;
            xyz.adscope.amps.model.config.request.AppModel r0 = r1.app
            return r0
    }

    public xyz.adscope.amps.model.config.request.DeviceModel getDevice() {
            r1 = this;
            xyz.adscope.amps.model.config.request.DeviceModel r0 = r1.device
            return r0
    }

    public xyz.adscope.amps.model.config.request.AMPSExtModel getExt() {
            r1 = this;
            xyz.adscope.amps.model.config.request.AMPSExtModel r0 = r1.ext
            return r0
    }

    public xyz.adscope.amps.model.config.request.SdkModel getSdk() {
            r1 = this;
            xyz.adscope.amps.model.config.request.SdkModel r0 = r1.sdk
            return r0
    }

    public java.lang.Long getTime() {
            r2 = this;
            long r0 = r2.time
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public xyz.adscope.amps.model.config.request.UserModel getUser() {
            r1 = this;
            xyz.adscope.amps.model.config.request.UserModel r0 = r1.user
            return r0
    }

    public void setApp(xyz.adscope.amps.model.config.request.AppModel r1) {
            r0 = this;
            r0.app = r1
            return
    }

    public void setDevice(xyz.adscope.amps.model.config.request.DeviceModel r1) {
            r0 = this;
            r0.device = r1
            return
    }

    public void setExt(xyz.adscope.amps.model.config.request.AMPSExtModel r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setSdk(xyz.adscope.amps.model.config.request.SdkModel r1) {
            r0 = this;
            r0.sdk = r1
            return
    }

    public void setTime(java.lang.Long r3) {
            r2 = this;
            long r0 = r3.longValue()
            r2.time = r0
            return
    }

    public void setUser(xyz.adscope.amps.model.config.request.UserModel r1) {
            r0 = this;
            r0.user = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"device\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.request.DeviceModel r1 = r3.device
            r0.append(r1)
            java.lang.String r1 = ", \"app\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.request.AppModel r1 = r3.app
            r0.append(r1)
            java.lang.String r1 = ", \"user\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.request.UserModel r1 = r3.user
            r0.append(r1)
            java.lang.String r1 = ", \"ext\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.request.AMPSExtModel r1 = r3.ext
            r0.append(r1)
            java.lang.String r1 = ", \"time\":"
            r0.append(r1)
            long r1 = r3.time
            r0.append(r1)
            java.lang.String r1 = ", \"sdk\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.request.SdkModel r1 = r3.sdk
            r0.append(r1)
            java.lang.String r1 = "} "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
