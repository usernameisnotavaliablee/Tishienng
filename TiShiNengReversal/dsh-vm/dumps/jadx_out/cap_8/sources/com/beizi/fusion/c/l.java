package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    private static boolean a;


    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L15
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            a(r1, r2)
            java.lang.String r1 = com.beizi.ad.f.c(r3)
            return r1
        L15:
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()
            r2.a(r1)
            com.beizi.ad.v2.e.b r1 = new com.beizi.ad.v2.e.b
            r1.<init>()
            java.lang.String r2 = com.beizi.fusion.tool.ao.a()
            r3 = 0
            java.lang.String r1 = r1.a(r2, r3)
            return r1
    }

    public static void a(android.content.Context r2) {
            com.beizi.fusion.model.ResponseInfo r2 = com.beizi.fusion.model.ResponseInfo.getInstance(r2)     // Catch: java.lang.Exception -> L60
            com.beizi.fusion.model.AdPlusConfig r2 = r2.getAdPlusConfig()     // Catch: java.lang.Exception -> L60
            if (r2 == 0) goto L24
            java.util.List r0 = r2.getH5RedirectBlackList()     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L17
            int r1 = r0.size()     // Catch: java.lang.Exception -> L60
            if (r1 <= 0) goto L17
            goto L21
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L60
            r0.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "market://"
            r0.add(r1)     // Catch: java.lang.Exception -> L60
        L21:
            com.beizi.ad.f.a(r0)     // Catch: java.lang.Exception -> L60
        L24:
            if (r2 == 0) goto L41
            java.lang.String r0 = r2.getAdUrl()     // Catch: java.lang.Exception -> L60
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto L41
            java.lang.String r0 = r2.getAdUrl()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L41
            java.lang.String r2 = r2.getAdUrl()     // Catch: java.lang.Exception -> L60
            goto L57
        L41:
            boolean r2 = com.beizi.fusion.BeiZis.getTransferProtocol()     // Catch: java.lang.Exception -> L60
            if (r2 == 0) goto L4a
            java.lang.String r2 = "aHR0cHM6Ly9hcGktaHRwLmJlaXppLmJpei9tYi9zZGswL2pzb24="
            goto L4c
        L4a:
            java.lang.String r2 = "aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAwL21iL3NkazAvanNvbg=="
        L4c:
            java.lang.String r2 = com.beizi.fusion.tool.d.a(r2)     // Catch: java.lang.Exception -> L60
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L57
            goto L60
        L57:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto L60
            com.beizi.ad.f.a(r2)     // Catch: java.lang.Exception -> L60
        L60:
            return
    }

    public static void a(android.content.Context r0, java.lang.String r1) {
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> Lb
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> Lb
            b(r0, r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private static void b(android.content.Context r1, java.lang.String r2) {
            boolean r0 = com.beizi.fusion.c.l.a
            if (r0 != 0) goto L25
            a(r1)     // Catch: java.lang.Exception -> L25
            com.beizi.fusion.c.l$1 r0 = new com.beizi.fusion.c.l$1     // Catch: java.lang.Exception -> L25
            r0.<init>(r1)     // Catch: java.lang.Exception -> L25
            com.beizi.ad.f.a(r1, r2, r0)     // Catch: java.lang.Exception -> L25
            com.beizi.fusion.tool.x r2 = com.beizi.fusion.tool.x.a()     // Catch: java.lang.Exception -> L25
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L25
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = r2.a(r1)     // Catch: java.lang.Exception -> L25
            com.beizi.ad.f.b(r1)     // Catch: java.lang.Exception -> L25
            r1 = 1
            com.beizi.fusion.c.l.a = r1     // Catch: java.lang.Exception -> L25
        L25:
            return
    }
}
