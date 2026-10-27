package com.baidu.liantian.rp.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a extends android.content.BroadcastReceiver {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L4c
        L3:
            java.lang.String r4 = r4.getAction()     // Catch: java.lang.Throwable -> L4d
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto Le
            goto L4c
        Le:
            java.lang.String r0 = "android.intent.action.BOOT_COMPLETED"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L1e
            com.baidu.liantian.b.f r3 = com.baidu.liantian.b.f.a(r3)     // Catch: java.lang.Throwable -> L4d
            r3.a()     // Catch: java.lang.Throwable -> L4d
            return
        L1e:
            java.lang.String r0 = "com.b.r.p"
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4c
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L4d
            com.baidu.liantian.e r4 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4d
            int r0 = r4.x()     // Catch: java.lang.Throwable -> L4d
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L4d
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            int r0 = r0 * r1
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L4d
            com.baidu.liantian.b.e.a(r3, r0)     // Catch: java.lang.Throwable -> L4d
            com.baidu.liantian.b.f r3 = com.baidu.liantian.b.f.a(r3)     // Catch: java.lang.Throwable -> L4d
            r3.c()     // Catch: java.lang.Throwable -> L4d
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4d
            r4.d(r0)     // Catch: java.lang.Throwable -> L4d
        L4c:
            return
        L4d:
            com.baidu.liantian.b.e.a()
            return
    }
}
