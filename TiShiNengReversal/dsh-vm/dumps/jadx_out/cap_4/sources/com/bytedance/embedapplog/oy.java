package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oy extends com.bytedance.embedapplog.ki.j {
    private volatile java.lang.String j;

    public oy() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.j = r0
            return
    }

    @Override // com.bytedance.embedapplog.ki
    public void j(int r1, long r2, boolean r4, float r5, double r6, java.lang.String r8) {
            r0 = this;
            return
    }

    @Override // com.bytedance.embedapplog.ki
    public void j(int r1, android.os.Bundle r2) {
            r0 = this;
            if (r1 != 0) goto Lc
            if (r2 == 0) goto Lc
            java.lang.String r1 = "oa_id_flag"
            java.lang.String r1 = r2.getString(r1)
            r0.j = r1
        Lc:
            return
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }
}
