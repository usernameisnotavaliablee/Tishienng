package cn.jpush.android.asus;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AsusPushMessageReceiver extends cn.jiguang.push.asus.PushMessageReceiver {
    public AsusPushMessageReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // cn.jiguang.push.asus.PushMessageReceiver
    public void a(android.content.Context r1, cn.jpush.android.c.a r2) {
            r0 = this;
            if (r2 == 0) goto L9
            int r2 = r2.a()
            cn.jpush.android.asus.a.a(r1, r2)
        L9:
            return
    }

    @Override // cn.jiguang.push.asus.PushMessageReceiver
    public void a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a()
            r1 = 6
            r0.a(r3, r1, r4)
            return
    }
}
