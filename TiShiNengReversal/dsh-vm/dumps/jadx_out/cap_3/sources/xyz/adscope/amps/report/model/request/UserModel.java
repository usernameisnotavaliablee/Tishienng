package xyz.adscope.amps.report.model.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UserModel {
    private java.lang.String customData;
    private java.lang.String ext;
    private java.lang.String userId;

    public UserModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.userId = r0
            r1.customData = r0
            r1.ext = r0
            return
    }

    public UserModel(xyz.adscope.amps.report.model.request.UserModel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.userId = r0
            r1.customData = r0
            r1.ext = r0
            java.lang.String r0 = r2.getUserId()
            r1.userId = r0
            java.lang.String r0 = r2.getCustomData()
            r1.customData = r0
            java.lang.String r2 = r2.getExt()
            r1.ext = r2
            return
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.userId
            return r0
    }

    public void setCustomData(java.lang.String r1) {
            r0 = this;
            r0.customData = r1
            return
    }

    public void setExt(java.lang.String r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setUserId(java.lang.String r1) {
            r0 = this;
            r0.userId = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"userId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.userId
            r0.append(r1)
            java.lang.String r1 = "\", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r2.customData
            r0.append(r1)
            java.lang.String r1 = "\", \"ext\":\""
            r0.append(r1)
            java.lang.String r1 = r2.ext
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
