package com.bytedance.adsdk.lottie.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends android.graphics.Paint {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public j(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public j(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    public j(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.<init>()
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r2)
            r1.setXfermode(r0)
            return
    }

    @Override // android.graphics.Paint
    public void setAlpha(int r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 >= r1) goto L1c
            int r0 = r4.getColor()
            int r5 = com.bytedance.adsdk.lottie.up.tl.j(r5, r3, r2)
            int r5 = r5 << 24
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r5 = r5 | r0
            r4.setColor(r5)
            return
        L1c:
            int r5 = com.bytedance.adsdk.lottie.up.tl.j(r5, r3, r2)
            super.setAlpha(r5)
            return
    }

    @Override // android.graphics.Paint
    public void setTextLocales(android.os.LocaleList r1) {
            r0 = this;
            return
    }
}
