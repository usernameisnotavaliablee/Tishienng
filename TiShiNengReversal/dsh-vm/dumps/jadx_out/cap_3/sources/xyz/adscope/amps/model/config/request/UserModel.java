package xyz.adscope.amps.model.config.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UserModel {
    private java.lang.String city;
    private java.lang.String customData;
    private java.lang.String ext;
    private java.lang.String id;
    private java.lang.String province;
    private java.lang.String region;

    public UserModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.id = r0
            r1.province = r0
            r1.city = r0
            r1.region = r0
            r1.customData = r0
            r1.ext = r0
            return
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.city
            return r0
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

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.province
            return r0
    }

    public java.lang.String getRegion() {
            r1 = this;
            java.lang.String r0 = r1.region
            return r0
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.city = r1
            return
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

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setProvince(java.lang.String r1) {
            r0 = this;
            r0.province = r1
            return
    }

    public void setRegion(java.lang.String r1) {
            r0 = this;
            r0.region = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"id\":\""
            r0.append(r1)
            java.lang.String r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = "\",\"province\":\""
            r0.append(r1)
            java.lang.String r1 = r2.province
            r0.append(r1)
            java.lang.String r1 = "\",\"city\":\""
            r0.append(r1)
            java.lang.String r1 = r2.city
            r0.append(r1)
            java.lang.String r1 = "\",\"region\":\""
            r0.append(r1)
            java.lang.String r1 = r2.region
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
