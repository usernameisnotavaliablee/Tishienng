package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class u extends com.bytedance.embedapplog.uq<com.bytedance.embedapplog.vl> {
    private final android.content.Context j;


    u(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "com.coolpad.deviceidsupport"
            r1.<init>(r0)
            r1.j = r2
            return
    }

    static /* synthetic */ android.content.Context j(com.bytedance.embedapplog.u r0) {
            android.content.Context r0 = r0.j
            return r0
    }

    @Override // com.bytedance.embedapplog.uq
    protected android.content.Intent cw(android.content.Context r4) {
            r3 = this;
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "com.coolpad.deviceidsupport"
            java.lang.String r2 = "com.coolpad.deviceidsupport.DeviceIdService"
            r0.<init>(r1, r2)
            r4.setComponent(r0)
            return r4
    }

    @Override // com.bytedance.embedapplog.uq
    protected com.bytedance.embedapplog.oq.xt<com.bytedance.embedapplog.vl, java.lang.String> j() {
            r1 = this;
            com.bytedance.embedapplog.u$1 r0 = new com.bytedance.embedapplog.u$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.embedapplog.uq, com.bytedance.embedapplog.tk
    public /* bridge */ /* synthetic */ boolean j(android.content.Context r1) {
            r0 = this;
            boolean r1 = super.j(r1)
            return r1
    }

    @Override // com.bytedance.embedapplog.uq, com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r3) {
            r2 = this;
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "coolos.oaid"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)     // Catch: java.lang.Throwable -> L18
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            com.bytedance.embedapplog.tk$j r1 = new com.bytedance.embedapplog.tk$j     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            r1.xt = r0     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L1c:
            com.bytedance.embedapplog.tk$j r3 = super.xt(r3)
            return r3
    }
}
