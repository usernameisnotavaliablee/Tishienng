package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class EventLevelModel {
    private java.lang.String acceptEncrypt;
    private java.util.List<java.lang.String> codes;
    private java.lang.String count;
    private java.lang.String ext;
    private java.lang.String macro;
    private java.lang.String reportURL;
    private java.lang.String time;

    public EventLevelModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.macro = r0
            r1.count = r0
            r1.reportURL = r0
            r1.time = r0
            r1.acceptEncrypt = r0
            r1.ext = r0
            return
    }

    public java.lang.String getAcceptEncrypt() {
            r1 = this;
            java.lang.String r0 = r1.acceptEncrypt
            return r0
    }

    public java.util.List<java.lang.String> getCodes() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.codes
            return r0
    }

    public java.lang.String getCount() {
            r1 = this;
            java.lang.String r0 = r1.count
            return r0
    }

    public java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public java.lang.String getMacro() {
            r1 = this;
            java.lang.String r0 = r1.macro
            return r0
    }

    public java.lang.String getReportURL() {
            r1 = this;
            java.lang.String r0 = r1.reportURL
            return r0
    }

    public java.lang.String getTime() {
            r1 = this;
            java.lang.String r0 = r1.time
            return r0
    }

    public void setAcceptEncrypt(java.lang.String r1) {
            r0 = this;
            r0.acceptEncrypt = r1
            return
    }

    public void setCodes(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.codes = r1
            return
    }

    public void setCount(java.lang.String r1) {
            r0 = this;
            r0.count = r1
            return
    }

    public void setExt(java.lang.String r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setMacro(java.lang.String r1) {
            r0 = this;
            r0.macro = r1
            return
    }

    public void setReportURL(java.lang.String r1) {
            r0 = this;
            r0.reportURL = r1
            return
    }

    public void setTime(java.lang.String r1) {
            r0 = this;
            r0.time = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"macro\":\""
            r0.append(r1)
            java.lang.String r1 = r2.macro
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\", \"count\":\""
            r0.append(r1)
            java.lang.String r1 = r2.count
            r0.append(r1)
            java.lang.String r1 = "\", \"codes\":"
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.codes
            java.lang.String r1 = xyz.adscope.common.tool.utils.StringUtil.ListToString(r1)
            r0.append(r1)
            java.lang.String r1 = ", \"reportURL\":\""
            r0.append(r1)
            java.lang.String r1 = r2.reportURL
            r0.append(r1)
            java.lang.String r1 = "\", \"time\":\""
            r0.append(r1)
            java.lang.String r1 = r2.time
            r0.append(r1)
            java.lang.String r1 = "\", \"acceptEncrypt\":\""
            r0.append(r1)
            java.lang.String r1 = r2.acceptEncrypt
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
