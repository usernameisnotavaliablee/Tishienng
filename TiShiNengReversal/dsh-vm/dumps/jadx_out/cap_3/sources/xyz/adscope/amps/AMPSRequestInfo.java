package xyz.adscope.amps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSRequestInfo {
    protected java.lang.String appId;
    protected java.lang.String className;
    protected java.lang.String spaceId;

    public AMPSRequestInfo(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.appId = r1
            r0.spaceId = r2
            return
    }

    public abstract void formatAdResource(java.lang.String r1);

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public java.lang.String getSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.spaceId
            return r0
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    public void setSpaceId(java.lang.String r1) {
            r0 = this;
            r0.spaceId = r1
            return
    }
}
