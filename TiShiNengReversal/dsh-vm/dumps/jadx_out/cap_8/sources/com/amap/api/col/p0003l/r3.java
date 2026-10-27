package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
abstract class r3 extends android.app.Dialog {
    public r3(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.b()
            return
    }

    private void b() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L2e
            r1 = 1
            r0.requestFeature(r1)
            r3.a()
            android.view.View r1 = r0.getDecorView()
            r2 = 0
            r1.setPadding(r2, r2, r2, r2)
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            if (r1 == 0) goto L25
            r2 = -1
            r1.width = r2
            r2 = -2
            r1.height = r2
            r2 = 80
            r1.gravity = r2
        L25:
            r0.setAttributes(r1)
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r1)
        L2e:
            return
    }

    protected abstract void a();
}
