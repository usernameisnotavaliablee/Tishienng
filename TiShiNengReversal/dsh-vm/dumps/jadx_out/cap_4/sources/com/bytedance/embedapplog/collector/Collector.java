package com.bytedance.embedapplog.collector;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Collector extends android.content.BroadcastReceiver {
    public Collector() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            java.lang.String r1 = "EMBED_K_DATA"
            java.lang.String[] r1 = r2.getStringArrayExtra(r1)
            if (r1 == 0) goto Lf
            int r2 = r1.length
            if (r2 <= 0) goto Lf
            com.bytedance.embedapplog.f.j(r1)
            return
        Lf:
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
            return
    }
}
