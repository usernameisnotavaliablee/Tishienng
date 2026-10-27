package com.bytedance.j.xt.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c extends com.bytedance.j.xt.m.b {
    c(android.os.Handler r1, long r2, long r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()
            java.lang.String r0 = r0.e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2c
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L17
            goto L2c
        L17:
            com.bytedance.j.xt.up.g r1 = com.bytedance.j.xt.e.b()
            r1.b(r0)
            java.lang.String r1 = "[DeviceIdTask] did is "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            com.bytedance.j.xt.tl.i.a(r0)
            return
        L2c:
            long r0 = r2.a()
            r2.c(r0)
            java.lang.String r0 = "[DeviceIdTask] did is null, continue check."
            com.bytedance.j.xt.tl.i.a(r0)
            return
    }
}
