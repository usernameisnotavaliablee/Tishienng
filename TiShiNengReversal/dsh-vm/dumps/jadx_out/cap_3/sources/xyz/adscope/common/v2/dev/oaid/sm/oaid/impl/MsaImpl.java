package xyz.adscope.common.v2.dev.oaid.sm.oaid.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class MsaImpl implements xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID {
    private final android.content.Context context;


    public MsaImpl(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private void startMsaKlService() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "com.bun.msa.action.start.service"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "com.mdid.msa"
            java.lang.String r2 = "com.mdid.msa.service.MsaKlService"
            r0.setClassName(r1, r2)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "com.bun.msa.param.pkgname"
            android.content.Context r2 = r3.context     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L25
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> L25
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L25
            r2 = 26
            if (r1 >= r2) goto L27
            android.content.Context r1 = r3.context     // Catch: java.lang.Exception -> L25
            r1.startService(r0)     // Catch: java.lang.Exception -> L25
            return
        L25:
            r0 = move-exception
            goto L2d
        L27:
            android.content.Context r1 = r3.context     // Catch: java.lang.Exception -> L25
            androidx.media.session.a.a(r1, r0)     // Catch: java.lang.Exception -> L25
            return
        L2d:
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public void doGet(xyz.adscope.common.v2.dev.oaid.sm.oaid.IGetter r4) {
            r3 = this;
            android.content.Context r0 = r3.context
            if (r0 == 0) goto L2d
            if (r4 != 0) goto L7
            goto L2d
        L7:
            r3.startMsaKlService()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.bun.msa.action.bindto.service"
            r0.<init>(r1)
            java.lang.String r1 = "com.mdid.msa"
            java.lang.String r2 = "com.mdid.msa.service.MsaIdService"
            r0.setClassName(r1, r2)
            android.content.Context r1 = r3.context
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "com.bun.msa.param.pkgname"
            r0.putExtra(r2, r1)
            android.content.Context r1 = r3.context
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MsaImpl$1 r2 = new xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.MsaImpl$1
            r2.<init>(r3)
            xyz.adscope.common.v2.dev.oaid.sm.oaid.impl.OAIDService.bind(r1, r0, r4, r2)
        L2d:
            return
    }

    @Override // xyz.adscope.common.v2.dev.oaid.sm.oaid.IOAID
    public boolean supported() {
            r3 = this;
            android.content.Context r0 = r3.context
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "com.mdid.msa"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            return r1
        L15:
            r0 = move-exception
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r0)
            return r1
    }
}
