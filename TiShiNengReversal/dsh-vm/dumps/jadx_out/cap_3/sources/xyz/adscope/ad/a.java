package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a {
    private final java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel> a;
    private final java.util.Map<java.lang.String, android.view.View> b;
    private final xyz.adscope.ad.h c;

    a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            r1.a = r0
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            r1.b = r0
            xyz.adscope.ad.i r0 = xyz.adscope.ad.i.a()
            java.lang.Object r2 = r0.getOrCreateImplement(r2)
            xyz.adscope.ad.h r2 = (xyz.adscope.ad.h) r2
            r1.c = r2
            return
    }

    private long a(xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r3) {
            r2 = this;
            if (r3 == 0) goto L30
            java.util.List r3 = r3.b()
            if (r3 == 0) goto L30
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L30
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.SeatBidModel r3 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.SeatBidModel) r3
            if (r3 == 0) goto L30
            java.util.List r3 = r3.a()
            if (r3 == 0) goto L30
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L30
            java.lang.Object r3 = r3.get(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel) r3
            if (r3 == 0) goto L30
            long r0 = r3.b()
            return r0
        L30:
            r0 = 0
            return r0
    }

    private java.lang.String a(java.lang.String r2, xyz.adscope.ad.c r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r3.c()
            r0.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r2)
            return r2
    }

    private void a() {
            r4 = this;
            xyz.adscope.ad.h r0 = r4.c
            if (r0 == 0) goto L22
            long r0 = java.lang.System.currentTimeMillis()
            xyz.adscope.ad.h r2 = r4.c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ""
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Class<xyz.adscope.ad.model.impl.db.AdvertisingDBModel> r1 = xyz.adscope.ad.model.impl.db.AdvertisingDBModel.class
            java.lang.String r3 = "expireTime"
            r2.deleteLessThenWhere(r1, r3, r0)
        L22:
            return
    }

    public android.view.View a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, android.view.View> r0 = r1.b
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, android.view.View> r0 = r1.b
            java.lang.Object r2 = r0.get(r2)
            android.view.View r2 = (android.view.View) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    public java.lang.String a(xyz.adscope.ad.a2 r2, android.view.View r3) {
            r1 = this;
            if (r2 == 0) goto L14
            java.lang.String r0 = r2.getSpaceID()
            xyz.adscope.ad.c r2 = r2.getAdType()
            java.lang.String r2 = r1.a(r0, r2)
            java.util.Map<java.lang.String, android.view.View> r0 = r1.b
            r0.put(r2, r3)
            return r2
        L14:
            java.lang.String r2 = ""
            return r2
    }

    public xyz.adscope.ad.model.impl.db.AdvertisingDBModel a(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            r9 = 1
            r0[r9] = r10
            java.lang.String r9 = "%s_%s"
            java.lang.String r9 = java.lang.String.format(r9, r0)
            r8.a()
            xyz.adscope.ad.h r2 = r8.c
            if (r2 == 0) goto L3e
            java.lang.String r10 = "cacheKey"
            java.lang.String r4 = r2.whereEquals(r10)
            java.lang.String[] r5 = new java.lang.String[]{r9}
            xyz.adscope.ad.h r9 = r8.c
            java.lang.String r10 = "cacheTime"
            java.lang.String r6 = r9.getOrderByAsc(r10)
            java.lang.Class<xyz.adscope.ad.model.impl.db.AdvertisingDBModel> r3 = xyz.adscope.ad.model.impl.db.AdvertisingDBModel.class
            r7 = 1
            java.util.List r9 = r2.query(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3e
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L3e
            java.lang.Object r9 = r9.get(r1)
            xyz.adscope.ad.model.impl.db.AdvertisingDBModel r9 = (xyz.adscope.ad.model.impl.db.AdvertisingDBModel) r9
            return r9
        L3e:
            r9 = 0
            return r9
    }

    public void a(java.lang.String r4, java.lang.String r5, xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r6) {
            r3 = this;
            if (r6 == 0) goto L3f
            xyz.adscope.ad.model.impl.db.AdvertisingDBModel r0 = new xyz.adscope.ad.model.impl.db.AdvertisingDBModel
            r0.<init>()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "%s_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.b(r4)
            java.lang.String r4 = r6.toJsonString()
            r0.a(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r0.a(r4)
            long r4 = r3.a(r6)
            r1 = 0
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 != 0) goto L39
            long r4 = java.lang.System.currentTimeMillis()
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            long r4 = r4 + r1
        L39:
            r0.b(r4)
            r3.a(r0)
        L3f:
            return
    }

    public void a(java.lang.String r2, xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r3) {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel> r0 = r1.a
            if (r0 == 0) goto L7
            r0.put(r2, r3)
        L7:
            return
    }

    public void a(xyz.adscope.ad.model.impl.db.AdvertisingDBModel r2) {
            r1 = this;
            xyz.adscope.ad.h r0 = r1.c
            r0.insert(r2)
            return
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel b(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel> r0 = r1.a
            if (r0 == 0) goto L13
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L13
            java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r2 = (xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel) r2
            return r2
        L13:
            r2 = 0
            return r2
    }
}
