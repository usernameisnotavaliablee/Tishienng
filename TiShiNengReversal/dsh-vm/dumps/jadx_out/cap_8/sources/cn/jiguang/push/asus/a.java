package cn.jiguang.push.asus;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class a implements java.lang.Runnable {
    final /* synthetic */ android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Intent f1406b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cn.jiguang.push.asus.PushMessageReceiver f1407c;

    a(cn.jiguang.push.asus.PushMessageReceiver r1, android.content.Context r2, android.content.Intent r3) {
            r0 = this;
            r0.f1407c = r1
            r0.a = r2
            r0.f1406b = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            cn.jiguang.push.asus.PushMessageReceiver r0 = r3.f1407c
            android.content.Context r1 = r3.a
            android.content.Intent r2 = r3.f1406b
            r0.a(r1, r2)
            return
    }
}
