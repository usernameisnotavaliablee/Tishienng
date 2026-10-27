package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a() {
            java.lang.String r0 = "com.tencent.mm.opensdk.openapi.IWXAPI"
            boolean r0 = com.beizi.fusion.tool.ap.a(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean a(android.content.Context r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L13
            return r1
        L13:
            java.lang.String r0 = b()     // Catch: java.lang.Throwable -> L35
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L1e
            return r1
        L1e:
            com.tencent.mm.opensdk.openapi.IWXAPI r3 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r3, r0)     // Catch: java.lang.Throwable -> L35
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req r0 = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "nativeOpenAdCanvas"
            r0.businessType = r2     // Catch: java.lang.Throwable -> L35
            r0.extInfo = r4     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L30
            return r1
        L30:
            boolean r3 = r3.sendReq(r0)     // Catch: java.lang.Throwable -> L35
            return r3
        L35:
            return r1
    }

    public static boolean a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L3e
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto L3e
        Le:
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L19
            return r1
        L19:
            java.lang.String r0 = b()     // Catch: java.lang.Throwable -> L3e
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L24
            return r1
        L24:
            com.tencent.mm.opensdk.openapi.IWXAPI r3 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r3, r0)     // Catch: java.lang.Throwable -> L3e
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req r0 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            r0.userName = r4     // Catch: java.lang.Throwable -> L3e
            r0.path = r5     // Catch: java.lang.Throwable -> L3e
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L39
            r0.extData = r6     // Catch: java.lang.Throwable -> L3e
        L39:
            boolean r3 = r3.sendReq(r0)     // Catch: java.lang.Throwable -> L3e
            return r3
        L3e:
            return r1
    }

    public static java.lang.String b() {
            r0 = 0
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto Lc
            return r0
        Lc:
            com.beizi.fusion.model.ResponseInfo r1 = com.beizi.fusion.model.ResponseInfo.getInstance(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.getOpenSDKAppId()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1b
            return r0
        L1b:
            return r1
        L1c:
            return r0
    }

    public static java.lang.String c() {
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            r0 = 638067200(0x26082200, float:4.7230557E-16)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String d() {
            r0 = 0
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.p()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto Lc
            return r0
        Lc:
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> L31
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            return r0
        L17:
            java.lang.String r2 = b()     // Catch: java.lang.Throwable -> L31
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L22
            return r0
        L22:
            com.tencent.mm.opensdk.openapi.IWXAPI r1 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r1, r2)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L29
            return r0
        L29:
            int r1 = r1.getWXAppSupportAPI()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L31
        L31:
            return r0
    }
}
