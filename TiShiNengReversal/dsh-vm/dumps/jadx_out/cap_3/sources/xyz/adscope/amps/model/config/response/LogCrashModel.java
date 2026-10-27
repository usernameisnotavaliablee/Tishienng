package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LogCrashModel {
    private int close;
    private java.lang.String url;

    public LogCrashModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getClose() {
            r1 = this;
            int r0 = r1.close
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public void setClose(int r1) {
            r0 = this;
            r0.close = r1
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"close\":"
            r0.append(r1)
            int r1 = r2.close
            r0.append(r1)
            java.lang.String r1 = ", \"url\":\""
            r0.append(r1)
            java.lang.String r1 = r2.url
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
