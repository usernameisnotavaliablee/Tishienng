package com.ss.android.socialbase.appdownloader.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f extends com.ss.android.socialbase.appdownloader.j.d {
    public f(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    @Override // com.ss.android.socialbase.appdownloader.j.k
    public android.content.Intent xt() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.SECURITY_SETTINGS"
            r0.<init>(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r1 = 1073741824(0x40000000, float:2.0)
            r0.addFlags(r1)
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0.addFlags(r1)
            return r0
    }
}
