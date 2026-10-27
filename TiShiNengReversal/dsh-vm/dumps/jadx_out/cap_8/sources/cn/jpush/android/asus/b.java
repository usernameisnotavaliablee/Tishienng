package cn.jpush.android.asus;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jpush.android.api.JThirdPlatFormInterface {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public void clearAllNotification(android.content.Context r1) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public void clearNotification(android.content.Context r1, int r2) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public java.lang.String getAppId(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jpush.android.asus.a.f(r1)
            return r1
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public java.lang.String getAppkey(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jpush.android.asus.a.e(r1)
            return r1
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public java.lang.String getRomName() {
            r1 = this;
            java.lang.String r0 = cn.jpush.android.asus.a.a
            return r0
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public byte getRomType(android.content.Context r1) {
            r0 = this;
            byte r1 = cn.jpush.android.asus.a.d(r1)
            return r1
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public java.lang.String getToken(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jpush.android.asus.a.g(r1)
            return r1
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public void init(android.content.Context r1) {
            r0 = this;
            cn.jpush.android.asus.a.b(r1)
            return
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public boolean isNeedClearToken(android.content.Context r1) {
            r0 = this;
            boolean r1 = cn.jpush.android.asus.a.h(r1)
            return r1
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public boolean isSupport(android.content.Context r1) {
            r0 = this;
            boolean r1 = cn.jpush.android.asus.a.a(r1)
            return r1
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public void register(android.content.Context r1, android.os.Bundle r2) {
            r0 = this;
            cn.jpush.android.asus.a.c(r1)
            return
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public void resumePush(android.content.Context r1) {
            r0 = this;
            cn.jpush.android.c.b.b(r1)
            return
    }

    @Override // cn.jpush.android.api.JThirdPlatFormInterface
    public void stopPush(android.content.Context r1) {
            r0 = this;
            cn.jpush.android.c.b.c(r1)
            return
    }
}
