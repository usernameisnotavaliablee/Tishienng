package com.beizi.fusion.work.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b extends com.beizi.fusion.work.e.a implements android.view.View.OnClickListener, com.beizi.fusion.tool.aj.a, com.beizi.fusion.tool.al.a {
    private android.view.ViewGroup W;
    private android.widget.FrameLayout X;
    private com.beizi.ad.v2.d.c Y;
    private com.beizi.ad.i Z;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean aa;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean ab;
    private java.util.List<android.view.View> ac;
    private java.lang.Boolean ad;








    public b(android.content.Context r1, long r2, com.beizi.fusion.model.AdSpacesBean.BuyerBean r4, com.beizi.fusion.model.AdSpacesBean.ForwardBean r5, com.beizi.fusion.c.d r6, int r7) {
            r0 = this;
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r1 = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.ac = r2
            return
    }

    static /* synthetic */ android.widget.FrameLayout a(com.beizi.fusion.work.e.b r0, android.widget.FrameLayout r1) {
            r0.X = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.i a(com.beizi.fusion.work.e.b r0, com.beizi.ad.i r1) {
            r0.Z = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.v2.d.c a(com.beizi.fusion.work.e.b r0) {
            com.beizi.ad.v2.d.c r0 = r0.Y
            return r0
    }

    static /* synthetic */ com.beizi.fusion.e.a a(com.beizi.fusion.work.e.b r0, com.beizi.fusion.e.a r1) {
            r0.j = r1
            return r1
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean> r4, java.lang.String r5) {
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
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataShakeViewBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean) r1
            java.util.List r2 = r1.getOrderList()
            if (r2 == 0) goto La
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto La
            return r1
        L23:
            return r0
    }

    static /* synthetic */ java.lang.Boolean a(com.beizi.fusion.work.e.b r0, java.lang.Boolean r1) {
            r0.ad = r1
            return r1
    }

    static /* synthetic */ void a(com.beizi.fusion.work.e.b r0, double r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.e.b r0, int r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.e.b r0, java.lang.String r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.work.e.b r0, java.lang.String r1, int r2) {
            r0.a(r1, r2)
            return
    }

    private void aR() {
            r2 = this;
            com.beizi.ad.v2.d.c r0 = r2.Y
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "shakeViewBean != null ? "
            r0.append(r1)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r1 = r2.aa
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            android.view.ViewGroup r0 = r2.f214x
            r0.removeAllViews()
            android.view.ViewGroup r0 = r2.f214x
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.beizi.fusion.work.e.b$7 r1 = new com.beizi.fusion.work.e.b$7
            r1.<init>(r2)
            r0.addOnGlobalLayoutListener(r1)
            return
        L35:
            r2.ap()
            return
    }

    private void aS() {
            r5 = this;
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            boolean r0 = r0.n()
            if (r0 == 0) goto Lc
            goto Lae
        Lc:
            com.beizi.fusion.tool.al r0 = r5.P
            if (r0 != 0) goto L19
            com.beizi.fusion.tool.al r0 = new com.beizi.fusion.tool.al
            android.content.Context r1 = r5.N
            r0.<init>(r1)
            r5.P = r0
        L19:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r5.aa
            if (r0 == 0) goto Lae
            com.beizi.fusion.tool.al r1 = r5.P
            if (r1 == 0) goto Lae
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r0 = r0.getPosition()
            if (r0 == 0) goto Lae
            com.beizi.fusion.events.EventBean r0 = r5.b
            if (r0 == 0) goto L37
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r1 = r5.aa
            java.lang.String r1 = r1.getShakeViewUuid()
            r0.setShakeViewUuid(r1)
            r5.ao()
        L37:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r5.aa
            java.util.List r0 = r0.getOrderData()
            com.beizi.ad.v2.d.c r1 = r5.Y
            java.lang.String r1 = r1.b()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataShakeViewBean r0 = r5.a(r0, r1)
            if (r0 == 0) goto L53
            com.beizi.fusion.tool.al r1 = r5.P
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r0.getShakeView()
            r1.a(r0)
            goto L5a
        L53:
            com.beizi.fusion.tool.al r0 = r5.P
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r1 = r5.aa
            r0.a(r1)
        L5a:
            com.beizi.fusion.tool.al r0 = r5.P
            java.lang.Boolean r1 = r5.ad
            r0.a(r1)
            com.beizi.fusion.tool.al r0 = r5.P
            android.content.Context r1 = r5.N
            android.view.ViewGroup r2 = r5.f214x
            int r2 = r2.getWidth()
            float r2 = (float) r2
            int r1 = com.beizi.fusion.tool.ap.b(r1, r2)
            android.content.Context r2 = r5.N
            android.view.ViewGroup r3 = r5.f214x
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r2 = com.beizi.fusion.tool.ap.b(r2, r3)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r3 = r5.aa
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r3 = r3.getPosition()
            android.view.View r0 = r0.a(r1, r2, r3)
            if (r0 == 0) goto Lae
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto Lae
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r3 = r1.width
            int r4 = r1.height
            r2.<init>(r3, r4)
            int r3 = r1.leftMargin
            r2.leftMargin = r3
            int r1 = r1.topMargin
            r2.topMargin = r1
            android.view.ViewGroup r1 = r5.f214x     // Catch: java.lang.Exception -> Lae
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> Lae
            com.beizi.fusion.tool.al r0 = r5.P     // Catch: java.lang.Exception -> Lae
            r0.a(r5)     // Catch: java.lang.Exception -> Lae
        Lae:
            return
    }

    private void aT() {
            r5 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r5.ab
            if (r0 == 0) goto La6
            com.beizi.fusion.tool.aj r1 = r5.Q
            if (r1 == 0) goto La6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r0 = r0.getPosition()
            if (r0 == 0) goto La6
            com.beizi.fusion.events.EventBean r0 = r5.b
            if (r0 == 0) goto L1e
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r5.ab
            java.lang.String r1 = r1.getScrollClickUuid()
            r0.setScrollClickUuid(r1)
            r5.ao()
        L1e:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r5.ab
            java.util.List r0 = r0.getOrderData()
            com.beizi.ad.v2.d.c r1 = r5.Y
            java.lang.String r1 = r1.b()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean r0 = r5.b(r0, r1)
            if (r0 == 0) goto L3a
            com.beizi.fusion.tool.aj r1 = r5.Q
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r0.getScrollClick()
            r1.a(r0)
            goto L41
        L3a:
            com.beizi.fusion.tool.aj r0 = r5.Q
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r5.ab
            r0.a(r1)
        L41:
            com.beizi.fusion.tool.aj r0 = r5.Q
            java.lang.Boolean r1 = r5.ad
            r0.a(r1)
            com.beizi.fusion.tool.aj r0 = r5.Q
            android.content.Context r1 = r5.N
            android.view.ViewGroup r2 = r5.f214x
            int r2 = r2.getWidth()
            float r2 = (float) r2
            int r1 = com.beizi.fusion.tool.ap.b(r1, r2)
            android.content.Context r2 = r5.N
            android.view.ViewGroup r3 = r5.f214x
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r2 = com.beizi.fusion.tool.ap.b(r2, r3)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r3 = r5.ab
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r3 = r3.getPosition()
            android.view.View r0 = r0.a(r1, r2, r3)
            if (r0 == 0) goto La6
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto La6
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r3 = r1.width
            int r4 = r1.height
            r2.<init>(r3, r4)
            int r3 = r1.leftMargin
            r2.leftMargin = r3
            int r1 = r1.topMargin
            r2.topMargin = r1
            android.view.ViewGroup r1 = r5.f214x     // Catch: java.lang.Exception -> La6
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> La6
            com.beizi.fusion.tool.aj r0 = r5.Q     // Catch: java.lang.Exception -> La6
            r0.a(r5)     // Catch: java.lang.Exception -> La6
            android.view.ViewGroup r0 = r5.f214x     // Catch: java.lang.Exception -> La6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r5.ab     // Catch: java.lang.Exception -> La6
            java.lang.String r1 = r1.getScrollDirection()     // Catch: java.lang.Exception -> La6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r2 = r5.ab     // Catch: java.lang.Exception -> La6
            int r2 = r2.getScrollDistance()     // Catch: java.lang.Exception -> La6
            r5.a(r0, r1, r2, r5)     // Catch: java.lang.Exception -> La6
        La6:
            return
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean b(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> r4, java.lang.String r5) {
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
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean) r1
            java.util.List r2 = r1.getOrderList()
            if (r2 == 0) goto La
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto La
            return r1
        L23:
            return r0
    }

    static /* synthetic */ void b(com.beizi.fusion.work.e.b r0) {
            r0.x()
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.work.e.b r0, java.lang.String r1, int r2) {
            r0.a(r1, r2)
            return
    }

    private void b(java.lang.String r11) {
            r10 = this;
            com.beizi.ad.v2.d.c r0 = r10.Y     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L69
            com.beizi.fusion.events.EventBean r0 = r10.b     // Catch: java.lang.Exception -> L69
            r0.setClickType(r11)     // Catch: java.lang.Exception -> L69
            r10.ao()     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "BeiZis"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L69
            r1.<init>()     // Catch: java.lang.Exception -> L69
            java.lang.String r2 = "enter showBeiZiUnifiedCustomAd clickUnifiedAd clickEventType:"
            r1.append(r2)     // Catch: java.lang.Exception -> L69
            r1.append(r11)     // Catch: java.lang.Exception -> L69
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.tool.aa.a(r0, r11)     // Catch: java.lang.Exception -> L69
            r11 = 2
            int[] r0 = new int[r11]     // Catch: java.lang.Exception -> L69
            android.widget.FrameLayout r1 = r10.X     // Catch: java.lang.Exception -> L69
            r1.getLocationOnScreen(r0)     // Catch: java.lang.Exception -> L69
            android.widget.FrameLayout r1 = r10.X     // Catch: java.lang.Exception -> L69
            r2 = 0
            r1.measure(r2, r2)     // Catch: java.lang.Exception -> L69
            android.widget.FrameLayout r1 = r10.X     // Catch: java.lang.Exception -> L69
            int r1 = r1.getMeasuredWidth()     // Catch: java.lang.Exception -> L69
            android.widget.FrameLayout r3 = r10.X     // Catch: java.lang.Exception -> L69
            int r3 = r3.getMeasuredHeight()     // Catch: java.lang.Exception -> L69
            int r1 = r1 / r11
            int r3 = r3 / r11
            int[] r11 = com.beizi.fusion.tool.af.a(r1, r3)     // Catch: java.lang.Exception -> L69
            com.beizi.ad.i r3 = r10.Z     // Catch: java.lang.Exception -> L69
            android.widget.FrameLayout r4 = r10.X     // Catch: java.lang.Exception -> L69
            r1 = r11[r2]     // Catch: java.lang.Exception -> L69
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L69
            r1 = 1
            r6 = r11[r1]     // Catch: java.lang.Exception -> L69
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L69
            r7 = r11[r2]     // Catch: java.lang.Exception -> L69
            r2 = r0[r2]     // Catch: java.lang.Exception -> L69
            int r7 = r7 + r2
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L69
            r11 = r11[r1]     // Catch: java.lang.Exception -> L69
            r0 = r0[r1]     // Catch: java.lang.Exception -> L69
            int r11 = r11 + r0
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch: java.lang.Exception -> L69
            r9 = 2
            com.beizi.ad.internal.e.f.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L69
        L69:
            return
    }

    static /* synthetic */ com.beizi.ad.i c(com.beizi.fusion.work.e.b r0) {
            com.beizi.ad.i r0 = r0.Z
            return r0
    }

    static /* synthetic */ void d(com.beizi.fusion.work.e.b r0) {
            r0.aS()
            return
    }

    static /* synthetic */ void e(com.beizi.fusion.work.e.b r0) {
            r0.aT()
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public void a(java.util.List<android.view.View> r4) {
            r3 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r3.T
            java.util.List r0 = r0.getClickView()
            r1 = 0
            if (r0 == 0) goto L40
            int r2 = r0.size()
            if (r2 <= 0) goto L40
            java.lang.String r2 = "bg"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L2e
            java.lang.String r2 = "ad"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L2e
            java.lang.String r2 = "image"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L28
            goto L2e
        L28:
            android.view.ViewGroup r0 = r3.W
            r0.setVisibility(r1)
            goto L35
        L2e:
            android.view.ViewGroup r0 = r3.W
            r1 = 8
            r0.setVisibility(r1)
        L35:
            java.util.List<android.view.View> r0 = r3.ac
            r0.clear()
            java.util.List<android.view.View> r0 = r3.ac
            r0.addAll(r4)
            return
        L40:
            android.view.ViewGroup r4 = r3.W
            r4.setVisibility(r1)
            return
    }

    @Override // com.beizi.fusion.work.a
    public void a(java.util.Map r6) {
            r5 = this;
            java.lang.String r0 = "auctionExt"
            java.lang.String r1 = "highestLossPrice"
            java.lang.String r2 = "adnId"
            java.lang.String r3 = "winPrice"
            com.beizi.ad.v2.d.c r4 = r5.Y     // Catch: java.lang.Exception -> L8b
            if (r4 != 0) goto Le
            goto L8b
        Le:
            r4.a(r6)     // Catch: java.lang.Exception -> L8b
            boolean r4 = r6.containsKey(r3)     // Catch: java.lang.Exception -> L8b
            if (r4 == 0) goto L2e
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L2e
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r4 == 0) goto L2e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L8b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L8b
            if (r4 != 0) goto L2e
            com.beizi.fusion.events.EventBean r4 = r5.b     // Catch: java.lang.Exception -> L8b
            r4.setWinPrice(r3)     // Catch: java.lang.Exception -> L8b
        L2e:
            boolean r3 = r6.containsKey(r2)     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L4b
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L4b
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r3 == 0) goto L4b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L8b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L8b
            if (r3 != 0) goto L4b
            com.beizi.fusion.events.EventBean r3 = r5.b     // Catch: java.lang.Exception -> L8b
            r3.setAdnId(r2)     // Catch: java.lang.Exception -> L8b
        L4b:
            boolean r2 = r6.containsKey(r1)     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L68
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Exception -> L8b
            if (r1 == 0) goto L68
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L68
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L8b
            if (r2 != 0) goto L68
            com.beizi.fusion.events.EventBean r2 = r5.b     // Catch: java.lang.Exception -> L8b
            r2.setHighestLossPrice(r1)     // Catch: java.lang.Exception -> L8b
        L68:
            boolean r1 = r6.containsKey(r0)     // Catch: java.lang.Exception -> L8b
            if (r1 == 0) goto L85
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L8b
            if (r6 == 0) goto L85
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L85
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L8b
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L8b
            if (r0 != 0) goto L85
            com.beizi.fusion.events.EventBean r0 = r5.b     // Catch: java.lang.Exception -> L8b
            r0.setSecondPrice(r6)     // Catch: java.lang.Exception -> L8b
        L85:
            r5.ao()     // Catch: java.lang.Exception -> L8b
            r5.M()     // Catch: java.lang.Exception -> L8b
        L8b:
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public void aA() {
            r6 = this;
            r6.t()
            android.content.Context r0 = r6.N
            java.lang.String r1 = r6.h
            com.beizi.fusion.c.l.a(r0, r1)
            r6.u()
            r6.f()
            long r0 = r6.H
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1f
            android.os.Handler r2 = r6.f127m
            r2.sendEmptyMessageDelayed(r4, r0)
            goto L35
        L1f:
            com.beizi.fusion.c.d r0 = r6.d
            if (r0 == 0) goto L35
            int r0 = r0.p()
            if (r0 >= r4) goto L35
            com.beizi.fusion.c.d r0 = r6.d
            int r0 = r0.o()
            r1 = 2
            if (r0 == r1) goto L35
            r6.k()
        L35:
            com.beizi.fusion.tool.aj r0 = new com.beizi.fusion.tool.aj
            android.content.Context r1 = r6.N
            r0.<init>(r1)
            r6.Q = r0
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public void aB() {
            r4 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.e
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r0.getShakeView()
            r4.aa = r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r4.e
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r0.getScrollClick()
            r4.ab = r0
            com.beizi.ad.v2.d.c r0 = new com.beizi.ad.v2.d.c
            android.content.Context r1 = r4.N
            java.lang.String r2 = r4.i
            com.beizi.fusion.work.e.b$1 r3 = new com.beizi.fusion.work.e.b$1
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            r4.Y = r0
            r1 = 1
            r0.a(r1)
            java.lang.String r0 = "S2S"
            java.lang.String r1 = r4.g()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            com.beizi.ad.v2.d.c r0 = r4.Y
            java.lang.String r1 = r4.g()
            r0.c(r1)
            com.beizi.fusion.c.d r0 = r4.d
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.w()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4c
            com.beizi.ad.v2.d.c r1 = r4.Y
            r1.b(r0)
        L4c:
            com.beizi.fusion.c.d r0 = r4.d
            if (r0 == 0) goto L59
            com.beizi.ad.v2.d.c r1 = r4.Y
            java.util.Map r0 = r0.x()
            r1.c(r0)
        L59:
            com.beizi.ad.v2.d.c r0 = r4.Y
            r0.c()
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public void aG() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r1.T
            int r0 = r0.getCec()
            boolean r0 = com.beizi.fusion.tool.af.a(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "regionalClick"
            r1.b(r0)
            return
        L12:
            r1.aQ()
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public void aH() {
            r4 = this;
            r4.aR()
            java.util.List<android.view.View> r0 = r4.ac
            if (r0 == 0) goto L1c
            int r0 = r0.size()
            if (r0 <= 0) goto L1c
            com.beizi.ad.i r0 = r4.Z
            android.widget.FrameLayout r1 = r4.X
            java.util.List<android.view.View> r2 = r4.ac
            com.beizi.fusion.work.e.b$3 r3 = new com.beizi.fusion.work.e.b$3
            r3.<init>(r4)
            com.beizi.ad.internal.e.f.a(r0, r1, r2, r3)
            goto L28
        L1c:
            com.beizi.ad.i r0 = r4.Z
            android.widget.FrameLayout r1 = r4.X
            com.beizi.fusion.work.e.b$4 r2 = new com.beizi.fusion.work.e.b$4
            r2.<init>(r4)
            com.beizi.ad.internal.e.f.a(r0, r1, r2)
        L28:
            com.beizi.ad.v2.d.c r0 = r4.Y
            if (r0 == 0) goto L36
            android.widget.FrameLayout r1 = r4.X
            com.beizi.fusion.work.e.b$5 r2 = new com.beizi.fusion.work.e.b$5
            r2.<init>(r4)
            r0.a(r1, r2)
        L36:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r4.T
            int r0 = r0.getRmc()
            boolean r0 = com.beizi.fusion.tool.af.a(r0)
            if (r0 == 0) goto L5c
            double r0 = java.lang.Math.random()
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            double r0 = r0 + r2
            long r0 = (long) r0
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            com.beizi.fusion.work.e.b$6 r3 = new com.beizi.fusion.work.e.b$6
            r3.<init>(r4)
            r2.postDelayed(r3, r0)
        L5c:
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public void aJ() {
            r3 = this;
            android.view.ViewGroup r0 = r3.f210t
            r0.removeAllViews()
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            android.view.ViewGroup r1 = r3.f210t
            android.widget.FrameLayout r2 = r3.X
            r1.addView(r2, r0)
            android.view.ViewGroup r0 = r3.W
            android.view.ViewGroup r1 = r3.f210t
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r0.setLayoutParams(r1)
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public java.lang.String aK() {
            r1 = this;
            com.beizi.ad.i r0 = r1.Z
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // com.beizi.fusion.work.e.a
    public java.lang.String aL() {
            r1 = this;
            com.beizi.ad.i r0 = r1.Z
            java.lang.String r0 = r0.c()
            return r0
    }

    @Override // com.beizi.fusion.work.e.a
    public java.lang.String aM() {
            r1 = this;
            com.beizi.ad.i r0 = r1.Z
            java.lang.String r0 = r0.d()
            return r0
    }

    @Override // com.beizi.fusion.work.e.a
    public java.lang.String aN() {
            r4 = this;
            com.beizi.ad.i r0 = r4.Z
            java.lang.String r0 = r0.e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L22
            com.beizi.ad.i r1 = r4.Z
            java.util.ArrayList r1 = r1.j()
            if (r1 == 0) goto L22
            int r2 = r1.size()
            r3 = 3
            if (r2 < r3) goto L22
            r0 = 2
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L22:
            return r0
    }

    @Override // com.beizi.fusion.work.e.a
    public void aP() {
            r3 = this;
            com.beizi.ad.i r0 = r3.Z
            if (r0 != 0) goto La
            r0 = -991(0xfffffffffffffc21, float:NaN)
            r3.c(r0)
            return
        La:
            r0 = 0
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.a(r0)
            com.beizi.ad.i r1 = r3.Z
            java.lang.String r1 = r1.b()
            com.beizi.fusion.work.e.b$2 r2 = new com.beizi.fusion.work.e.b$2
            r2.<init>(r3)
            r0.a(r1, r2)
            return
    }

    @Override // com.beizi.fusion.tool.aj.a
    public void a_() {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r2.ab
            if (r0 == 0) goto L10
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "enter showBeiZiUnifiedCustomAd onScrollDistanceMeet  "
            com.beizi.fusion.tool.aa.a(r0, r1)
            java.lang.String r0 = "scroll"
            r2.b(r0)
        L10:
            return
    }

    @Override // com.beizi.fusion.work.a
    public java.lang.String aw() {
            r1 = this;
            com.beizi.ad.v2.d.c r0 = r1.Y
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.h()
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public org.json.JSONObject ax() {
            r1 = this;
            com.beizi.ad.v2.d.c r0 = r1.Y
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            org.json.JSONObject r0 = r0.m()
            return r0
    }

    @Override // com.beizi.fusion.work.e.a
    public int ay() {
            r1 = this;
            int r0 = com.beizi.fusion.R.layout.beizi_layout_unified_view
            return r0
    }

    @Override // com.beizi.fusion.work.e.a
    public void az() {
            r2 = this;
            super.az()
            android.view.View r0 = r2.f205o
            int r1 = com.beizi.fusion.R.id.fl_container_mask
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.W = r0
            return
    }

    @Override // com.beizi.fusion.tool.al.a
    public void b() {
            r2 = this;
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "enter showBeiZiUnifiedCustomAd onShakeHappened  "
            com.beizi.fusion.tool.aa.a(r0, r1)
            java.lang.String r0 = "shake"
            r2.b(r0)
            return
    }

    @Override // com.beizi.fusion.tool.aj.a
    public void b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            return
    }

    @Override // com.beizi.fusion.work.a
    public void b(java.util.Map r5) {
            r4 = this;
            java.lang.String r0 = "lossReason"
            java.lang.String r1 = "adnId"
            java.lang.String r2 = "winPrice"
            com.beizi.ad.v2.d.c r3 = r4.Y     // Catch: java.lang.Exception -> L6b
            if (r3 != 0) goto Lb
            goto L6b
        Lb:
            r3.b(r5)     // Catch: java.lang.Exception -> L6b
            boolean r3 = r5.containsKey(r2)     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L2b
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L2b
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L2b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L6b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L6b
            if (r3 != 0) goto L2b
            com.beizi.fusion.events.EventBean r3 = r4.b     // Catch: java.lang.Exception -> L6b
            r3.setWinPrice(r2)     // Catch: java.lang.Exception -> L6b
        L2b:
            boolean r2 = r5.containsKey(r1)     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L48
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Exception -> L6b
            if (r1 == 0) goto L48
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L48
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L6b
            if (r2 != 0) goto L48
            com.beizi.fusion.events.EventBean r2 = r4.b     // Catch: java.lang.Exception -> L6b
            r2.setAdnId(r1)     // Catch: java.lang.Exception -> L6b
        L48:
            boolean r1 = r5.containsKey(r0)     // Catch: java.lang.Exception -> L6b
            if (r1 == 0) goto L65
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Exception -> L6b
            if (r5 == 0) goto L65
            boolean r0 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L65
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L6b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L6b
            if (r0 != 0) goto L65
            com.beizi.fusion.events.EventBean r0 = r4.b     // Catch: java.lang.Exception -> L6b
            r0.setLossReason(r5)     // Catch: java.lang.Exception -> L6b
        L65:
            r4.ao()     // Catch: java.lang.Exception -> L6b
            r4.N()     // Catch: java.lang.Exception -> L6b
        L6b:
            return
    }

    @Override // com.beizi.fusion.work.e.a
    public void b(boolean r4) {
            r3 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r3.T
            int r0 = r0.getSlc()
            boolean r0 = com.beizi.fusion.tool.af.a(r0)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r1 = r3.T
            int r1 = r1.getSlac()
            boolean r1 = com.beizi.fusion.tool.af.a(r1)
            java.lang.String r2 = "regionalClick"
            if (r4 == 0) goto L1e
            if (r0 == 0) goto L1e
            r3.b(r2)
            return
        L1e:
            if (r4 != 0) goto L26
            if (r1 == 0) goto L26
            r3.b(r2)
            return
        L26:
            r3.aQ()
            return
    }

    @Override // com.beizi.fusion.work.e.a, com.beizi.fusion.work.a
    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = "BEIZI"
            return r0
    }

    @Override // com.beizi.fusion.work.e.a, com.beizi.fusion.work.a
    public void l() {
            r1 = this;
            com.beizi.ad.i r0 = r1.Z
            if (r0 == 0) goto L7
            r0.h()
        L7:
            com.beizi.ad.v2.d.c r0 = r1.Y
            if (r0 == 0) goto Le
            r0.f()
        Le:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r1) {
            r0 = this;
            java.lang.String r1 = "regionalClick"
            r0.b(r1)
            return
    }

    @Override // com.beizi.fusion.work.a
    protected void z() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto Ld
            com.beizi.ad.v2.d.c r0 = r1.Y
            if (r0 == 0) goto Ld
            r1.ag()
        Ld:
            return
    }
}
