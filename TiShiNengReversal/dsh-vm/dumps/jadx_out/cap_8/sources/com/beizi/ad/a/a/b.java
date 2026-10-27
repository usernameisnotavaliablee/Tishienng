package com.beizi.ad.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean f6458b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean f6459c;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.ad.a.a.b.a f6460d;

    /* renamed from: e, reason: collision with root package name */
    private int f6461e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6462f;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8);
    }

    public b(android.content.Context r2, com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6460d = r0
            r0 = 0
            r1.f6462f = r0
            r1.a = r2
            r1.f6458b = r3
            java.util.List r2 = r3.getOrderData()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataFullScreenClickBean r2 = r1.a(r2, r4)
            if (r2 == 0) goto L23
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$FullScreenClickBean r3 = r2.getFullScreenClick()
            if (r3 == 0) goto L23
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$FullScreenClickBean r2 = r2.getFullScreenClick()
            r1.f6459c = r2
        L23:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$FullScreenClickBean r2 = r1.f6459c
            if (r2 == 0) goto L2e
            int r2 = r2.getRandomClickNum()
            r1.f6461e = r2
            return
        L2e:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$FullScreenClickBean r2 = r1.f6458b
            if (r2 == 0) goto L38
            int r2 = r2.getRandomClickNum()
            r1.f6461e = r2
        L38:
            return
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean> r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L23
            if (r5 != 0) goto L6
            goto L23
        L6:
            java.util.Iterator r4 = r4.iterator()
        La:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataFullScreenClickBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean) r1
            java.util.List r2 = r1.getOrderList()
            if (r2 == 0) goto La
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto La
            return r1
        L23:
            return r0
    }

    public static boolean a(int r4) {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r0 = (int) r0
            if (r0 > r4) goto L10
            r4 = 1
            return r4
        L10:
            r4 = 0
            return r4
    }

    public void a(android.view.View r2, com.beizi.ad.a.a.b.a r3) {
            r1 = this;
            if (r2 == 0) goto L18
            if (r3 != 0) goto L5
            goto L18
        L5:
            int r0 = r1.f6461e
            boolean r0 = a(r0)
            if (r0 == 0) goto L18
            r0 = 1
            r1.f6462f = r0
            com.beizi.ad.a.a.b$1 r0 = new com.beizi.ad.a.a.b$1
            r0.<init>(r1, r3)
            r2.setOnTouchListener(r0)
        L18:
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.f6462f
            return r0
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.f6458b = r0
            r1.f6459c = r0
            r1.f6460d = r0
            r1.a = r0
            return
    }
}
