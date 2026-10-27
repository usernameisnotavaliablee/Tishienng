package com.ss.android.socialbase.appdownloader.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j extends com.ss.android.socialbase.appdownloader.j.d {
    public j(android.content.Context r1, com.ss.android.socialbase.downloader.jy.j r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.ss.android.socialbase.appdownloader.j.k
    public android.content.Intent xt() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.ss.android.socialbase.downloader.xt.up.cw
            r1.append(r2)
            java.lang.String r2 = ".intent.action.OPEN_FILEMANAGER"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.String r1 = "CurrentDir"
            java.lang.String r2 = r3.c
            r0.putExtra(r1, r2)
            java.lang.String r1 = "first_position"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "CurrentMode"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "com.iqoo.secure"
            r0.putExtra(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.addFlags(r1)
            r1 = 1073741824(0x40000000, float:2.0)
            r0.addFlags(r1)
            return r0
    }
}
