package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    private android.app.Activity a;

    public k(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void a() {
            r4 = this;
            android.app.Activity r0 = r4.a
            android.view.Window r0 = r0.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r0.addFlags(r2)
            android.view.View r2 = r0.getDecorView()
            r3 = 1024(0x400, float:1.435E-42)
            r2.setSystemUiVisibility(r3)
            r0.clearFlags(r1)
            r1 = 0
            r0.setStatusBarColor(r1)
            return
    }
}
