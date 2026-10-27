package cn.jpush.android.data;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushConfigEx extends cn.jpush.android.data.JPushConfig {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1772b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1773c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f1774d;

    public JPushConfigEx() {
            r0 = this;
            r0.<init>()
            return
    }

    public JPushConfigEx(cn.jpush.android.data.JPushConfig r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getjAppKey()
            r1.setjAppKey(r0)
            java.lang.String r0 = r2.getMzAppId()
            r1.setMzAppId(r0)
            java.lang.String r0 = r2.getMzAppKey()
            r1.setMzAppKey(r0)
            java.lang.String r0 = r2.getOppoAppId()
            r1.setOppoAppId(r0)
            java.lang.String r0 = r2.getOppoAppKey()
            r1.setOppoAppKey(r0)
            java.lang.String r0 = r2.getOppoAppSecret()
            r1.setOppoAppSecret(r0)
            java.lang.String r0 = r2.getXmAppId()
            r1.setXmAppId(r0)
            java.lang.String r2 = r2.getXmAppKey()
            r1.setXmAppKey(r2)
            return
    }

    public java.lang.String getHonorAppId() {
            r1 = this;
            java.lang.String r0 = r1.f1772b
            return r0
    }

    public java.lang.String getHwAppId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getVivoAppId() {
            r1 = this;
            java.lang.String r0 = r1.f1774d
            return r0
    }

    public java.lang.String getVivoAppKey() {
            r1 = this;
            java.lang.String r0 = r1.f1773c
            return r0
    }

    public void setHonorAppId(java.lang.String r1) {
            r0 = this;
            r0.f1772b = r1
            return
    }

    public void setHwAppId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setVivoAppId(java.lang.String r1) {
            r0 = this;
            r0.f1774d = r1
            return
    }

    public void setVivoAppKey(java.lang.String r1) {
            r0 = this;
            r0.f1773c = r1
            return
    }
}
