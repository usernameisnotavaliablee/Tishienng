package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class m4 extends xyz.adscope.ad.n0 implements xyz.adscope.ad.h3 {
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> A;
    private xyz.adscope.ad.publish.ad.unified.IUnifiedAdBindListener B;
    private final java.lang.String s;
    private final java.lang.String t;
    private final java.lang.String u;
    private final java.lang.String v;
    private final java.lang.String w;
    private final java.lang.String x;
    private final java.lang.String y;
    private xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel, java.lang.Object> {
        final /* synthetic */ xyz.adscope.ad.m4 a;

        a(xyz.adscope.ad.m4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1, java.lang.Object r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r1 = r1.d()
                if (r1 == 0) goto L8
                r1 = 1
                return r1
            L8:
                r1 = 0
                return r1
        }

        @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
        public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1, java.lang.Object r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel) r1
                boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo.IPermissionInfo {
        private final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel a;

        private b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r1, xyz.adscope.ad.m4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo.IPermissionInfo
        public java.lang.String getDescribe() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r0 = r1.a
                java.lang.String r0 = r0.a()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo.IPermissionInfo
        public java.lang.String getPermissionType() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r0 = r1.a
                java.lang.String r0 = r0.b()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo.IPermissionInfo
        public java.lang.String getTitle() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r0 = r1.a
                java.lang.String r0 = r0.c()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.z3 {
        final /* synthetic */ xyz.adscope.ad.m4 a;

        private c(xyz.adscope.ad.m4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.m4 r1, xyz.adscope.ad.m4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.z3
        public void a() {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.m2
        public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.y3 r1) {
                r0 = this;
                xyz.adscope.ad.y3 r1 = (xyz.adscope.ad.y3) r1
                r0.a2(r1)
                return
        }

        @Override // xyz.adscope.ad.z3
        public void a(xyz.adscope.ad.o2 r5) {
                r4 = this;
                xyz.adscope.ad.b4 r0 = r5.c()
                boolean r1 = r0 instanceof xyz.adscope.ad.j3
                if (r1 == 0) goto L21
                xyz.adscope.ad.j3 r0 = (xyz.adscope.ad.j3) r0
                java.lang.String r1 = r0.getInteractionType()
                java.lang.String r2 = r0.getActionType()
                xyz.adscope.ad.m4 r3 = r4.a
                xyz.adscope.ad.b4 r5 = r5.c()
                xyz.adscope.ad.i3 r5 = xyz.adscope.ad.m4.a(r3, r5, r1, r2)
                if (r5 == 0) goto L21
                r0.a(r5)
            L21:
                return
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(xyz.adscope.ad.y3 r1) {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.z3
        public void renderFailed() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d implements xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo {
        private final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel a;

        private d(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ d(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1, xyz.adscope.ad.m4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getApkMD5() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.a()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getAppIntroduction() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.b()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getDeveloper() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.d()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getIconUrl() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.e()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getName() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.f()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getPackageName() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.c()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.util.List<xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo.IPermissionInfo> getPermission() {
                r5 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r5.a
                java.util.List r0 = r0.g()
                r1 = 0
                if (r0 == 0) goto L2e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r2 = r5.a
                java.util.List r2 = r2.g()
                java.util.Iterator r2 = r2.iterator()
            L18:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2d
                java.lang.Object r3 = r2.next()
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r3 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel) r3
                xyz.adscope.ad.m4$b r4 = new xyz.adscope.ad.m4$b
                r4.<init>(r3, r1)
                r0.add(r4)
                goto L18
            L2d:
                return r0
            L2e:
                return r1
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getPermissionUrl() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.h()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getPolicy() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.i()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getPolicyUrl() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.j()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getSize() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.k()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo
        public java.lang.String getVersion() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r1.a
                java.lang.String r0 = r0.l()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e implements xyz.adscope.ad.publish.ad.unified.IUnifiedMediaController {
        private xyz.adscope.ad.l6.f a;

        private e(java.lang.Object r2) {
                r1 = this;
                r1.<init>()
                boolean r0 = r2 instanceof xyz.adscope.ad.l6.f
                if (r0 == 0) goto Lb
                xyz.adscope.ad.l6$f r2 = (xyz.adscope.ad.l6.f) r2
                r1.a = r2
            Lb:
                return
        }

        /* synthetic */ e(java.lang.Object r1, xyz.adscope.ad.m4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedMediaController
        public void pauseVideo() {
                r1 = this;
                xyz.adscope.ad.l6$f r0 = r1.a
                if (r0 == 0) goto L7
                r0.a()
            L7:
                return
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedMediaController
        public void playVideo() {
                r1 = this;
                xyz.adscope.ad.l6$f r0 = r1.a
                if (r0 == 0) goto L7
                r0.b()
            L7:
                return
        }

        @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedMediaController
        public void setVideoSound(boolean r2) {
                r1 = this;
                xyz.adscope.ad.l6$f r0 = r1.a
                if (r0 == 0) goto L7
                r0.a(r2)
            L7:
                return
        }
    }

    protected m4(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            java.lang.String r1 = "title"
            r0.s = r1
            java.lang.String r1 = "desc"
            r0.t = r1
            java.lang.String r1 = "image"
            r0.u = r1
            java.lang.String r1 = "icon"
            r0.v = r1
            java.lang.String r1 = "video"
            r0.w = r1
            java.lang.String r1 = "actionText"
            r0.x = r1
            java.lang.String r1 = "adLogo"
            r0.y = r1
            r0.j()
            return
    }

    private java.lang.String a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.A
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L1a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L1a:
            java.lang.String r2 = ""
            return r2
    }

    private java.util.List<java.lang.String> a(java.util.List<java.lang.String> r1, java.lang.String r2) {
            r0 = this;
            if (r1 != 0) goto L7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L7:
            r1.add(r2)
            return r1
    }

    static /* synthetic */ xyz.adscope.ad.i3 a(xyz.adscope.ad.m4 r0, java.lang.Object r1, java.lang.String r2, java.lang.String r3) {
            xyz.adscope.ad.i3 r0 = r0.a(r1, r2, r3)
            return r0
    }

    private void a(android.view.View r3, java.lang.String[] r4) {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.String r1 = "scope_root_container"
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r1 = r2.z
            r3.setTag(r0, r1)
            android.content.Context r0 = r2.a
            java.lang.String r1 = "scope_unified_negative"
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            r3.setTag(r0, r4)
            java.lang.String r4 = "click"
            java.lang.String r0 = "complain"
            xyz.adscope.ad.i3 r3 = r2.a(r3, r4, r0)
            r4 = 0
            r3.a(r4)
            return
    }

    private void b(android.view.View r3) {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.String r1 = "scope_root_container"
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r1 = r2.z
            r3.setTag(r0, r1)
            java.lang.String r0 = "click"
            xyz.adscope.ad.i3 r3 = r2.a(r3, r0, r0)
            r0 = 0
            r3.a(r0)
            return
    }

    private void c(android.view.View r3) {
            r2 = this;
            xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r0 = r2.z
            if (r0 == 0) goto L1c
            android.content.Context r0 = r2.a
            java.lang.String r1 = "scope_root_container"
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r0, r1)
            xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r1 = r2.z
            r3.setTag(r0, r1)
            java.lang.String r0 = "click"
            xyz.adscope.ad.i3 r3 = r2.a(r3, r0, r0)
            r0 = 0
            r3.a(r0)
            return
        L1c:
            r2.f()
            return
    }

    private boolean d(android.view.View r2) {
            r1 = this;
        L0:
            if (r2 == 0) goto Lf
            boolean r0 = r2 instanceof xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            goto L0
        Lf:
            r2 = 0
            return r2
    }

    private void f() {
            r1 = this;
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdBindListener r0 = r1.B
            if (r0 == 0) goto L7
            r0.onAdBindError()
        L7:
            return
    }

    private java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel> g() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r1.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.b(r0)
            if (r0 == 0) goto Ld
            java.util.List r0 = r0.a()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private java.util.List<java.lang.String> h() {
            r2 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r2.A
            if (r0 == 0) goto Ld
            java.lang.String r1 = "image"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel i() {
            r3 = this;
            java.util.List r0 = r3.g()
            xyz.adscope.ad.m4$a r1 = new xyz.adscope.ad.m4$a
            r1.<init>(r3)
            r2 = 0
            java.lang.Object r0 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchFirstFromList(r0, r2, r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel) r0
            return r0
    }

    private void j() {
            r5 = this;
            java.util.List r0 = r5.g()
            if (r0 == 0) goto L119
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.A = r1
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L119
            java.lang.Object r1 = r0.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel) r1
            java.lang.String r2 = r1.a()
            java.lang.String r2 = r2.trim()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L11
            r3 = 0
            char r2 = r2.charAt(r3)
            switch(r2) {
                case 49: goto Lf8;
                case 50: goto Ld7;
                case 51: goto Lb6;
                case 52: goto L95;
                case 53: goto L74;
                case 54: goto L54;
                case 55: goto L34;
                default: goto L33;
            }
        L33:
            goto L11
        L34:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r2 = r1.b()
            if (r2 == 0) goto L11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.A
            java.lang.String r3 = "adLogo"
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r1 = r1.b()
            java.lang.String r1 = r1.c()
            java.util.List r1 = r5.a(r4, r1)
            r2.put(r3, r1)
            goto L11
        L54:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r2 = r1.c()
            if (r2 == 0) goto L11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.A
            java.lang.String r3 = "actionText"
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r1 = r1.c()
            java.lang.String r1 = r1.a()
            java.util.List r1 = r5.a(r4, r1)
            r2.put(r3, r1)
            goto L11
        L74:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r2 = r1.b()
            if (r2 == 0) goto L11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.A
            java.lang.String r3 = "icon"
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r1 = r1.b()
            java.lang.String r1 = r1.c()
            java.util.List r1 = r5.a(r4, r1)
            r2.put(r3, r1)
            goto L11
        L95:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r2 = r1.c()
            if (r2 == 0) goto L11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.A
            java.lang.String r3 = "desc"
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r1 = r1.c()
            java.lang.String r1 = r1.a()
            java.util.List r1 = r5.a(r4, r1)
            r2.put(r3, r1)
            goto L11
        Lb6:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r2 = r1.c()
            if (r2 == 0) goto L11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.A
            java.lang.String r3 = "title"
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.TitleModel r1 = r1.c()
            java.lang.String r1 = r1.a()
            java.util.List r1 = r5.a(r4, r1)
            r2.put(r3, r1)
            goto L11
        Ld7:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r2 = r1.d()
            if (r2 == 0) goto L11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.A
            java.lang.String r3 = "video"
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r1 = r1.d()
            java.lang.String r1 = r1.d()
            java.util.List r1 = r5.a(r4, r1)
            r2.put(r3, r1)
            goto L11
        Lf8:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r2 = r1.b()
            if (r2 == 0) goto L11
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.A
            java.lang.String r3 = "image"
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r1 = r1.b()
            java.lang.String r1 = r1.c()
            java.util.List r1 = r5.a(r4, r1)
            r2.put(r3, r1)
            goto L11
        L119:
            return
    }

    private void k() {
            r4 = this;
            android.content.Context r0 = r4.a
            xyz.adscope.ad.a2 r1 = r4.c
            xyz.adscope.ad.w3 r0 = xyz.adscope.ad.w3.a.a(r0, r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r1 = r4.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r1 = r1.d()
            r0.a(r1)
            boolean r1 = r0 instanceof xyz.adscope.ad.k2
            if (r1 == 0) goto L2b
            r1 = r0
            xyz.adscope.ad.k2 r1 = (xyz.adscope.ad.k2) r1
            xyz.adscope.ad.j2 r2 = r1.c()
            if (r2 == 0) goto L2b
            xyz.adscope.ad.j2 r1 = r1.c()
            xyz.adscope.ad.m4$c r2 = new xyz.adscope.ad.m4$c
            r3 = 0
            r2.<init>(r4, r3)
            r1.a(r2)
        L2b:
            boolean r1 = r0 instanceof xyz.adscope.ad.j6
            if (r1 == 0) goto L37
            r1 = r0
            xyz.adscope.ad.j6 r1 = (xyz.adscope.ad.j6) r1
            xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r2 = r4.z
            r1.a(r2)
        L37:
            r0.b()
            return
    }

    @Override // xyz.adscope.ad.h3
    public void bindAdActionView(java.util.List<android.view.View> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            android.view.View r0 = (android.view.View) r0
            r1.b(r0)
            goto L4
        L14:
            return
    }

    @Override // xyz.adscope.ad.h3
    public void bindAdToMediaView(android.app.Activity r5, xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedMediaView r6) {
            r4 = this;
            if (r6 == 0) goto L64
            boolean r0 = r4.d(r6)
            if (r0 == 0) goto L60
            java.lang.String r0 = "scope_unified_media_config"
            int r0 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r5, r0)
            java.lang.Object r0 = r6.getTag(r0)
            xyz.adscope.ad.l6 r1 = new xyz.adscope.ad.l6
            r1.<init>(r5)
            boolean r2 = r0 instanceof xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig
            if (r2 == 0) goto L21
            xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig r0 = (xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig) r0
            r1.setVideoConfig(r0)
            goto L2d
        L21:
            xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig$Builder r0 = new xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig$Builder
            r0.<init>()
            xyz.adscope.ad.publish.ad.unified.UnifiedMediaConfig r0 = r0.build()
            r1.setVideoConfig(r0)
        L2d:
            xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r0 = r4.z
            r1.setExpressRoot(r0)
            xyz.adscope.ad.n0$f r0 = r4.e()
            r1.a(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = r4.i()
            r1.a(r0)
            r0 = 0
            r1.a(r0)
            java.lang.String r2 = "scope_unified_media_ctrl"
            int r5 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r5, r2)
            xyz.adscope.ad.m4$e r2 = new xyz.adscope.ad.m4$e
            xyz.adscope.ad.l6$f r3 = r1.getVideoController()
            r2.<init>(r3, r0)
            r6.setTag(r5, r2)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r5.<init>(r0, r0)
            r6.addView(r1, r5)
            return
        L60:
            r4.f()
            return
        L64:
            r4.f()
            return
    }

    @Override // xyz.adscope.ad.h3
    public void bindAdToRootContainer(android.app.Activity r3, xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r4, java.util.List<android.view.View> r5) {
            r2 = this;
            r2.z = r4
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3 = r2.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r3 = r2.c(r3)
            xyz.adscope.ad.n0$d r0 = r2.d()
            xyz.adscope.ad.n0$f r1 = r2.e()
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.a(r4, r3, r0, r1)
            java.util.Iterator r3 = r5.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L27
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            r2.c(r4)
            goto L17
        L27:
            r2.k()
            return
    }

    @Override // xyz.adscope.ad.h3
    public void bindNegativeFeedbackView(android.view.View r1, java.lang.String[] r2) {
            r0 = this;
            r0.a(r1, r2)
            return
    }

    @Override // xyz.adscope.ad.h3
    public java.lang.String getActionButtonText() {
            r1 = this;
            java.lang.String r0 = "actionText"
            java.lang.String r0 = r1.a(r0)
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public java.lang.String getAdLogoUrl() {
            r1 = this;
            java.lang.String r0 = "adLogo"
            java.lang.String r0 = r1.a(r0)
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern getAdPattern() {
            r1 = this;
            java.util.List r0 = r1.getImagesUrl()
            if (r0 == 0) goto L13
            java.util.List r0 = r1.getImagesUrl()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_3_IMAGES
            return r0
        L13:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = r1.i()
            if (r0 == 0) goto L1c
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_VIDEO
            return r0
        L1c:
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_TEXT_IMAGE
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public java.lang.String getDesc() {
            r1 = this;
            java.lang.String r0 = "desc"
            java.lang.String r0 = r1.a(r0)
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo getDownloadInfo() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r3.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r3.b(r0)
            r1 = 0
            if (r0 == 0) goto L13
            xyz.adscope.ad.m4$d r2 = new xyz.adscope.ad.m4$d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r0.b()
            r2.<init>(r0, r1)
            return r2
        L13:
            return r1
    }

    @Override // xyz.adscope.ad.r2
    public android.view.View getExpressView() {
            r1 = this;
            xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r0 = r1.z
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public java.lang.String getIconUrl() {
            r1 = this;
            java.lang.String r0 = "icon"
            java.lang.String r0 = r1.a(r0)
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public java.util.List<java.lang.String> getImagesUrl() {
            r1 = this;
            java.util.List r0 = r1.h()
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public java.lang.String getMainImageUrl() {
            r1 = this;
            java.lang.String r0 = "image"
            java.lang.String r0 = r1.a(r0)
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = "title"
            java.lang.String r0 = r1.a(r0)
            return r0
    }

    @Override // xyz.adscope.ad.h3
    public boolean isDownloadAd() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r3.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r3.b(r0)
            r1 = 0
            if (r0 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = r0.c()
            if (r0 == 0) goto L17
            int r0 = r0.c()
            r2 = 1
            if (r2 != r0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // xyz.adscope.ad.h3
    public void setBindAdListener(xyz.adscope.ad.publish.ad.unified.IUnifiedAdBindListener r1) {
            r0 = this;
            r0.B = r1
            return
    }
}
