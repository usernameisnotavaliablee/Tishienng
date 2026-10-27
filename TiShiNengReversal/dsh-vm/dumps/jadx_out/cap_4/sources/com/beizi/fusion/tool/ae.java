package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae {
    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(boolean r1) {
            if (r1 != 0) goto L9a
            r1 = 1
            com.beizi.ad.f.a(r1)     // Catch: java.lang.Throwable -> L6
        L6:
            com.beizi.fusion.BeiZis.setLimitPersonalAds(r1)     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto La1
            boolean r1 = b()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto La1
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = ""
            if (r1 == 0) goto L5a
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.getOaid()     // Catch: java.lang.Throwable -> La1
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La1
            if (r1 != 0) goto L5a
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Throwable -> La1
            r1.setOaid(r0)     // Catch: java.lang.Throwable -> La1
        L5a:
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto La1
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.getHonorOaid()     // Catch: java.lang.Throwable -> La1
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La1
            if (r1 != 0) goto La1
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Throwable -> La1
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Throwable -> La1
            r1.setHonorOaid(r0)     // Catch: java.lang.Throwable -> La1
            goto La1
        L9a:
            r1 = 0
            com.beizi.ad.f.a(r1)     // Catch: java.lang.Throwable -> L9e
        L9e:
            com.beizi.fusion.BeiZis.setLimitPersonalAds(r1)     // Catch: java.lang.Throwable -> La1
        La1:
            return
    }

    public static boolean a() {
            int r0 = c()
            boolean r1 = com.beizi.fusion.BeiZis.isLimitPersonalAds()
            if (r0 == 0) goto Lf
            r2 = 2
            if (r0 == r2) goto Lf
            r0 = 0
            return r0
        Lf:
            return r1
    }

    public static boolean b() {
            int r0 = c()
            if (r0 == 0) goto Lb
            r1 = 2
            if (r0 == r1) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    private static int c() {
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            android.content.Context r0 = r0.e()
            if (r0 == 0) goto L2a
            com.beizi.fusion.model.ResponseInfo r1 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)
            boolean r1 = r1.isInit()
            if (r1 != 0) goto L1b
            com.beizi.fusion.model.ResponseInfo r1 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)
            r1.init()
        L1b:
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)
            com.beizi.fusion.model.Manager r0 = r0.getManager()
            if (r0 == 0) goto L2a
            int r0 = r0.getPersonalRecommend()
            return r0
        L2a:
            r0 = 0
            return r0
    }
}
