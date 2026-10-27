package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a5 implements xyz.adscope.ad.h2 {
    private final xyz.adscope.ad.h2.a a;
    private final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel b;
    private final android.content.Context c;
    private java.util.Map<java.lang.String, xyz.adscope.ad.o2> d;
    private xyz.adscope.ad.o2 e;
    private boolean f;
    private java.lang.String g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel, java.lang.String> {
        final /* synthetic */ xyz.adscope.ad.a5 a;

        a(xyz.adscope.ad.a5 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r2, java.lang.String r3) {
                r1 = this;
                if (r2 == 0) goto L11
                java.lang.String r2 = r2.a()
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L11
                boolean r2 = r2.equals(r3)
                return r2
            L11:
                r2 = 0
                return r2
        }

        @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
        public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1, java.lang.String r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel) r1
                java.lang.String r2 = (java.lang.String) r2
                boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    a5(android.content.Context r2, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r3, xyz.adscope.ad.h2.a r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r1.c = r2
            r1.b = r3
            r1.a = r4
            r2 = 1
            r1.a(r2)
            return
    }

    private void a(android.content.Context r13, java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel> r14, java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel> r15, boolean r16, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r17) {
            r12 = this;
            r0 = 0
            if (r14 == 0) goto Lec
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto Lec
            java.util.Comparator r1 = xyz.adscope.ad.y4.b()
            java.util.Collections.sort(r14, r1)
            r1 = 0
        L11:
            int r2 = r14.size()
            r3 = 1
            if (r1 >= r2) goto Le9
            java.lang.Object r2 = r14.get(r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r2 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel) r2
            if (r2 == 0) goto Le1
            java.lang.String r4 = r2.a()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Le1
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r4 = r2.f()
            java.lang.String r5 = ""
            if (r4 == 0) goto L3b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r4 = r2.f()
            java.lang.String r4 = r4.h()
            goto L3c
        L3b:
            r4 = r5
        L3c:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r6 = r2.b()
            if (r6 == 0) goto L4a
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r5 = r2.b()
            java.lang.String r5 = r5.a()
        L4a:
            xyz.adscope.ad.b4 r5 = xyz.adscope.ad.m6.a(r13, r4, r5)
            boolean r6 = r5 instanceof xyz.adscope.ad.c4
            if (r6 == 0) goto L5b
            r6 = r5
            xyz.adscope.ad.c4 r6 = (xyz.adscope.ad.c4) r6
            r7 = r16
            r6.setRenderWithDownload(r7)
            goto L5d
        L5b:
            r7 = r16
        L5d:
            xyz.adscope.ad.b5 r6 = new xyz.adscope.ad.b5
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r8 = r12.d
            r6.<init>(r5, r2, r8)
            java.lang.String r8 = r2.e()
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L9d
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r9 = r12.d
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L9d
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r9 = r12.d
            java.lang.Object r9 = r9.get(r8)
            xyz.adscope.ad.o2 r9 = (xyz.adscope.ad.o2) r9
            if (r9 == 0) goto L9f
            java.lang.String r10 = r2.a()
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r0] = r10
            r11[r3] = r8
            java.lang.String r3 = "当前model (%s) 的 父节点 (%s) 存在. 设置父子节点关系..."
            java.lang.String r3 = java.lang.String.format(r3, r11)
            java.lang.String r8 = "RenderHierarchy"
            xyz.adscope.common.v2.log.SDKLog.d(r8, r3)
            r9.a(r6)
            r6.b(r9)
            goto L9f
        L9d:
            r12.e = r6
        L9f:
            xyz.adscope.ad.o2 r3 = r12.e
            r6.c(r3)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r3 = r2.f()
            if (r3 == 0) goto Ld1
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r3 = r2.f()
            r12.a(r4, r3)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2 = r2.f()
            java.lang.String r2 = r2.b()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Ld1
            xyz.adscope.ad.a5$a r3 = new xyz.adscope.ad.a5$a
            r3.<init>(r12)
            r4 = r15
            java.lang.Object r2 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchFirstFromList(r15, r2, r3)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r2 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel) r2
            if (r2 == 0) goto Ld2
            r6.a(r2)
            goto Ld2
        Ld1:
            r4 = r15
        Ld2:
            boolean r2 = r5 instanceof xyz.adscope.ad.u2
            if (r2 == 0) goto Lde
            xyz.adscope.ad.u2 r5 = (xyz.adscope.ad.u2) r5
            r2 = r17
            r5.a(r2)
            goto Le5
        Lde:
            r2 = r17
            goto Le5
        Le1:
            r4 = r15
            r7 = r16
            goto Lde
        Le5:
            int r1 = r1 + 1
            goto L11
        Le9:
            r12.f = r3
            return
        Lec:
            r12.f = r0
            return
    }

    private void a(java.lang.String r2, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r3) {
            r1 = this;
            java.lang.String r0 = "tag"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r2 = r1.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.ext.DisplayExtModel r2 = r2.b()
            if (r2 == 0) goto L17
            java.lang.String r2 = r2.a()
            r3.a(r2)
        L17:
            return
    }

    private void a(boolean r8) {
            r7 = this;
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            r7.d = r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r0 = r7.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r0.d()
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.toJsonString()
            java.lang.String r2 = "scheme"
            java.lang.String r1 = xyz.adscope.common.v2.tool.json.JsonUtil.getJSONArrayStr(r1, r2)
            r7.g = r1
            if (r8 == 0) goto L22
            java.util.List r8 = r0.e()
            goto L23
        L22:
            r8 = 0
        L23:
            if (r8 == 0) goto L2b
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L37
        L2b:
            xyz.adscope.ad.h2$a r1 = r7.a
            if (r1 == 0) goto L37
            java.lang.String r8 = r0.f()
            java.util.List r8 = r1.a(r8)
        L37:
            r3 = r8
            java.util.List r4 = r0.a()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r8 = r0.c()
            if (r8 == 0) goto L4f
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r8 = r0.c()
            int r8 = r8.c()
            r1 = 1
            if (r8 != r1) goto L4f
            r5 = 1
            goto L51
        L4f:
            r1 = 0
            r5 = 0
        L51:
            android.content.Context r2 = r7.c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r6 = r0.b()
            r1 = r7
            r1.a(r2, r3, r4, r5, r6)
        L5b:
            return
    }

    @Override // xyz.adscope.ad.h2
    public xyz.adscope.ad.o2 a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r0 = r1.d
            if (r0 == 0) goto L13
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L13
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r0 = r1.d
            java.lang.Object r2 = r0.get(r2)
            xyz.adscope.ad.o2 r2 = (xyz.adscope.ad.o2) r2
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.ad.h2
    public void a() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.ad.h2
    public void b() {
            r2 = this;
            xyz.adscope.ad.h2$a r0 = r2.a
            r1 = 0
            if (r0 == 0) goto L9
            r2.a(r1)
            return
        L9:
            r2.f = r1
            return
    }

    @Override // xyz.adscope.ad.h2
    public boolean c() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    @Override // xyz.adscope.ad.h2
    public int d() {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r0 = r1.d
            int r0 = r0.size()
            return r0
    }

    @Override // xyz.adscope.ad.h2
    public xyz.adscope.ad.o2 e() {
            r1 = this;
            xyz.adscope.ad.o2 r0 = r1.e
            return r0
    }

    @Override // xyz.adscope.ad.h2
    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }
}
