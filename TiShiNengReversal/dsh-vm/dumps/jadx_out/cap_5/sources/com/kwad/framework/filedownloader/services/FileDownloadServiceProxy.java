package com.kwad.framework.filedownloader.services;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.FileDownloadService.class)
@androidx.annotation.Keep
@android.annotation.SuppressLint({"Registered"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FileDownloadServiceProxy extends com.kwad.sdk.m.a {
    private static final java.lang.String TAG = "filedownloader";
    public android.app.Service context;
    private com.kwad.framework.filedownloader.services.i handler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.FileDownloadService.SeparateProcessService.class)
    @androidx.annotation.Keep
    public static class SeparateProcessServiceProxy extends com.kwad.framework.filedownloader.services.FileDownloadServiceProxy {
        public SeparateProcessServiceProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.framework.filedownloader.services.FileDownloadServiceProxy, com.kwad.sdk.m.a, com.kwad.sdk.api.proxy.IServiceProxy
        public void onCreate(android.app.Service r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L15
                android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L15
                android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Exception -> L15
                java.lang.String r0 = com.kwad.sdk.utils.ay.getProcessName(r0)     // Catch: java.lang.Exception -> L15
                cn.jpush.android.ad.n.a(r0)     // Catch: java.lang.Exception -> L15
            L15:
                super.onCreate(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.FileDownloadService.SharedMainProcessService.class)
    @androidx.annotation.Keep
    public static class SharedMainProcessServiceProxy extends com.kwad.framework.filedownloader.services.FileDownloadServiceProxy {
        public SharedMainProcessServiceProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.framework.filedownloader.services.FileDownloadServiceProxy, com.kwad.sdk.m.a, com.kwad.sdk.api.proxy.IServiceProxy
        public void onCreate(android.app.Service r1) {
                r0 = this;
                super.onCreate(r1)
                return
        }
    }

    public FileDownloadServiceProxy() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.FileDownloadService$SeparateProcessService> r0 = com.kwad.sdk.api.proxy.app.FileDownloadService.SeparateProcessService.class
            java.lang.Class<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy$SeparateProcessServiceProxy> r1 = com.kwad.framework.filedownloader.services.FileDownloadServiceProxy.SeparateProcessServiceProxy.class
            com.kwad.sdk.service.c.a(r0, r1)
            java.lang.Class<com.kwad.sdk.api.proxy.app.FileDownloadService$SharedMainProcessService> r0 = com.kwad.sdk.api.proxy.app.FileDownloadService.SharedMainProcessService.class
            java.lang.Class<com.kwad.framework.filedownloader.services.FileDownloadServiceProxy$SharedMainProcessServiceProxy> r1 = com.kwad.framework.filedownloader.services.FileDownloadServiceProxy.SharedMainProcessServiceProxy.class
            com.kwad.sdk.service.c.a(r0, r1)
            return
    }

    @Override // com.kwad.sdk.m.a, com.kwad.sdk.api.proxy.IServiceProxy
    public android.os.IBinder onBind(android.app.Service r1, android.content.Intent r2) {
            r0 = this;
            com.kwad.framework.filedownloader.services.i r1 = r0.handler
            android.os.IBinder r1 = r1.zq()
            return r1
    }

    @Override // com.kwad.sdk.m.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onCreate(android.app.Service r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r2.context = r3
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            com.kwad.framework.filedownloader.f.c.aI(r3)
            com.kwad.framework.filedownloader.f.e r3 = com.kwad.framework.filedownloader.f.e.zB()     // Catch: java.lang.IllegalAccessException -> L23
            int r3 = r3.apE     // Catch: java.lang.IllegalAccessException -> L23
            com.kwad.framework.filedownloader.f.f.cf(r3)     // Catch: java.lang.IllegalAccessException -> L23
            com.kwad.framework.filedownloader.f.e r3 = com.kwad.framework.filedownloader.f.e.zB()     // Catch: java.lang.IllegalAccessException -> L23
            long r0 = r3.apF     // Catch: java.lang.IllegalAccessException -> L23
            com.kwad.framework.filedownloader.f.f.ac(r0)     // Catch: java.lang.IllegalAccessException -> L23
            goto L24
        L23:
        L24:
            com.kwad.framework.filedownloader.services.g r3 = new com.kwad.framework.filedownloader.services.g
            r3.<init>()
            com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.zB()
            boolean r0 = r0.apH
            if (r0 == 0) goto L3e
            com.kwad.framework.filedownloader.services.e r0 = new com.kwad.framework.filedownloader.services.e
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.<init>(r1, r3)
            r2.handler = r0
            return
        L3e:
            com.kwad.framework.filedownloader.services.d r0 = new com.kwad.framework.filedownloader.services.d
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.<init>(r1, r3)
            r2.handler = r0
            return
    }

    @Override // com.kwad.sdk.m.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onDestroy(android.app.Service r1) {
            r0 = this;
            com.kwad.framework.filedownloader.services.i r1 = r0.handler
            r1.onDestroy()
            return
    }

    @Override // com.kwad.sdk.m.a, com.kwad.sdk.api.proxy.IServiceProxy
    public int onStartCommand(android.app.Service r1, android.content.Intent r2, int r3, int r4) {
            r0 = this;
            com.kwad.framework.filedownloader.services.i r1 = r0.handler
            r1.zp()
            r1 = 2
            return r1
    }
}
