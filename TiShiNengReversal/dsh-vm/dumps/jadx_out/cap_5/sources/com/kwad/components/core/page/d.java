package com.kwad.components.core.page;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d extends com.kwad.components.core.proxy.i {
    private boolean Tv;



    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.page.d r0) {
            r0.ra()
            return
    }

    private void aI(boolean r2) {
            r1 = this;
            android.content.Intent r0 = r1.getIntent()
            if (r2 == 0) goto L16
            java.lang.String r2 = "pendingIntent"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            android.content.Intent r2 = (android.content.Intent) r2
            android.app.Activity r0 = r1.getActivity()
            r0.startActivity(r2)
            return
        L16:
            java.lang.String r2 = "filePath"
            java.lang.String r2 = r0.getStringExtra(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L25
            com.kwad.sdk.utils.as.he(r2)
        L25:
            return
    }

    private void qZ() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.app.Activity r1 = r3.getActivity()
            r0.<init>(r1)
            int r1 = com.kwad.sdk.R.string.ksad_request_install_title
            r0.setTitle(r1)
            int r1 = com.kwad.sdk.R.string.ksad_request_install_content
            r0.setMessage(r1)
            int r1 = com.kwad.sdk.R.string.ksad_request_install_nagative
            com.kwad.components.core.page.d$1 r2 = new com.kwad.components.core.page.d$1
            r2.<init>(r3)
            r0.setNegativeButton(r1, r2)
            int r1 = com.kwad.sdk.R.string.ksad_request_install_positive
            com.kwad.components.core.page.d$2 r2 = new com.kwad.components.core.page.d$2
            r2.<init>(r3)
            r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return
    }

    private void ra() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "package:"
            r0.<init>(r1)
            android.app.Activity r1 = r3.getActivity()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.packageName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            r1.<init>(r2, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r0)
            android.app.Activity r0 = r3.getActivity()
            r2 = 100
            r0.startActivityForResult(r1, r2)
            return
        L38:
            r3.finish()
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.BaseFragmentActivity$RequestInstallPermissionActivity> r0 = com.kwad.sdk.api.proxy.app.BaseFragmentActivity.RequestInstallPermissionActivity.class
            java.lang.Class<com.kwad.components.core.page.d> r1 = com.kwad.components.core.page.d.class
            com.kwad.sdk.service.c.a(r0, r1)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // com.kwad.components.core.proxy.i
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "RequestInstallPermissionImpl"
            return r0
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r3 = 100
            if (r1 != r3) goto Lc
            r1 = -1
            if (r2 != r1) goto Lc
            boolean r1 = r0.Tv
            r0.aI(r1)
        Lc:
            r0.finish()
            return
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)     // Catch: java.lang.Throwable -> Ld
            android.content.Intent r5 = r4.getIntent()     // Catch: java.lang.Throwable -> Ld
            if (r5 != 0) goto Lf
            r4.finish()     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r5 = move-exception
            goto L4b
        Lf:
            java.lang.String r0 = "fromNotification"
            r1 = 0
            boolean r0 = r5.getBooleanExtra(r0, r1)     // Catch: java.lang.Throwable -> Ld
            r4.Tv = r0     // Catch: java.lang.Throwable -> Ld
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ld
            r3 = 26
            if (r2 >= r3) goto L25
            r4.aI(r0)     // Catch: java.lang.Throwable -> Ld
            r4.finish()     // Catch: java.lang.Throwable -> Ld
            return
        L25:
            if (r0 == 0) goto L3b
            android.app.Activity r5 = r4.getActivity()     // Catch: java.lang.Throwable -> Ld
            boolean r5 = com.kwad.sdk.utils.y.cM(r5)     // Catch: java.lang.Throwable -> Ld
            if (r5 == 0) goto L37
            boolean r5 = r4.Tv     // Catch: java.lang.Throwable -> Ld
            r4.aI(r5)     // Catch: java.lang.Throwable -> Ld
            return
        L37:
            r4.ra()     // Catch: java.lang.Throwable -> Ld
            return
        L3b:
            java.lang.String r0 = "needAllowDialog"
            boolean r5 = r5.getBooleanExtra(r0, r1)     // Catch: java.lang.Throwable -> Ld
            if (r5 == 0) goto L47
            r4.qZ()     // Catch: java.lang.Throwable -> Ld
            return
        L47:
            r4.ra()     // Catch: java.lang.Throwable -> Ld
            return
        L4b:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r5)
            return
    }
}
