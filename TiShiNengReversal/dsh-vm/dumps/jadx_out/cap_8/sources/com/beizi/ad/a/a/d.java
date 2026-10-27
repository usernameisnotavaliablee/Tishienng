package com.beizi.ad.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean f6491b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean f6492c;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickPositionBean f6493d;

    /* renamed from: e, reason: collision with root package name */
    private com.beizi.ad.a.a.d.a f6494e;

    /* renamed from: f, reason: collision with root package name */
    private android.view.View f6495f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6496g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f6497h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f6498i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f6499j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f6500k;
    private int l;
    private android.animation.ValueAnimator m;
    private int n;
    private android.widget.ImageView o;
    private android.widget.ImageView p;
    private android.widget.ImageView q;
    private java.lang.String r;
    private java.lang.String s;
    private java.lang.String t;
    private android.widget.LinearLayout u;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8);

        void b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8);
    }

    public d(android.content.Context r1, com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r3 = 0
            r0.f6494e = r3
            java.lang.String r3 = "up"
            r0.f6497h = r3
            java.lang.String r3 = "down"
            r0.f6498i = r3
            java.lang.String r3 = "left"
            r0.f6499j = r3
            java.lang.String r3 = "right"
            r0.f6500k = r3
            java.lang.String r3 = "#9CBBFF"
            r0.r = r3
            java.lang.String r3 = "#C1D4FF"
            r0.s = r3
            java.lang.String r3 = "#FFFFFF"
            r0.t = r3
            r0.a = r1     // Catch: java.lang.Exception -> L71
            r0.f6491b = r2     // Catch: java.lang.Exception -> L71
            java.util.List r1 = r2.getOrderData()     // Catch: java.lang.Exception -> L71
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean r1 = r0.a(r1, r4)     // Catch: java.lang.Exception -> L71
            if (r1 == 0) goto L3c
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r2 = r1.getScrollClick()     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto L3c
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r1.getScrollClick()     // Catch: java.lang.Exception -> L71
            r0.f6492c = r1     // Catch: java.lang.Exception -> L71
        L3c:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r0.f6492c     // Catch: java.lang.Exception -> L71
            if (r1 == 0) goto L57
            java.lang.String r1 = r1.getScrollDirection()     // Catch: java.lang.Exception -> L71
            r0.f6496g = r1     // Catch: java.lang.Exception -> L71
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r0.f6492c     // Catch: java.lang.Exception -> L71
            int r1 = r1.getScrollDistance()     // Catch: java.lang.Exception -> L71
            r0.l = r1     // Catch: java.lang.Exception -> L71
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r0.f6492c     // Catch: java.lang.Exception -> L71
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r1 = r1.getPosition()     // Catch: java.lang.Exception -> L71
            r0.f6493d = r1     // Catch: java.lang.Exception -> L71
            return
        L57:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r0.f6491b     // Catch: java.lang.Exception -> L71
            if (r1 == 0) goto L71
            java.lang.String r1 = r1.getScrollDirection()     // Catch: java.lang.Exception -> L71
            r0.f6496g = r1     // Catch: java.lang.Exception -> L71
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r0.f6491b     // Catch: java.lang.Exception -> L71
            int r1 = r1.getScrollDistance()     // Catch: java.lang.Exception -> L71
            r0.l = r1     // Catch: java.lang.Exception -> L71
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r1 = r0.f6491b     // Catch: java.lang.Exception -> L71
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r1 = r1.getPosition()     // Catch: java.lang.Exception -> L71
            r0.f6493d = r1     // Catch: java.lang.Exception -> L71
        L71:
            return
    }

    static /* synthetic */ int a(com.beizi.ad.a.a.d r0) {
            int r0 = r0.l
            return r0
    }

    static /* synthetic */ int a(com.beizi.ad.a.a.d r0, int r1) {
            r0.n = r1
            return r1
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> r4, java.lang.String r5) {
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

    static /* synthetic */ java.lang.String b(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.f6496g
            return r0
    }

    private void b() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.u
            r1 = 17
            r0.setGravity(r1)
            android.widget.LinearLayout r0 = r6.u
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.width
            android.widget.LinearLayout r1 = r6.u
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.height
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r3 = r6.a
            r2.<init>(r3)
            r6.o = r2
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r3 = r6.a
            r2.<init>(r3)
            r6.p = r2
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r3 = r6.a
            r2.<init>(r3)
            r6.q = r2
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r2.<init>(r3, r3)
            java.lang.String r3 = r6.f6497h
            java.lang.String r4 = r6.f6496g
            boolean r3 = r3.equals(r4)
            r4 = 1
            if (r3 == 0) goto L82
            android.widget.LinearLayout r3 = r6.u
            r3.setOrientation(r4)
            android.widget.ImageView r3 = r6.o
            int r4 = com.beizi.fusion.R.mipmap.beizi_interaction_icon_arrow_up
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.p
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.q
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.o
            java.lang.String r4 = r6.r
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.p
            java.lang.String r4 = r6.s
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.q
            java.lang.String r4 = r6.t
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            r2.width = r0
            int r1 = r1 / 3
            r2.height = r1
            goto L15b
        L82:
            java.lang.String r3 = r6.f6498i
            java.lang.String r5 = r6.f6496g
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Lcb
            android.widget.LinearLayout r3 = r6.u
            r3.setOrientation(r4)
            android.widget.ImageView r3 = r6.o
            int r4 = com.beizi.fusion.R.mipmap.beizi_interaction_icon_arrow_down
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.p
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.q
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.o
            java.lang.String r4 = r6.t
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.p
            java.lang.String r4 = r6.s
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.q
            java.lang.String r4 = r6.r
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            r2.width = r0
            int r1 = r1 / 3
            r2.height = r1
            goto L15b
        Lcb:
            java.lang.String r3 = r6.f6499j
            java.lang.String r4 = r6.f6496g
            boolean r3 = r3.equals(r4)
            r4 = 0
            if (r3 == 0) goto L114
            android.widget.LinearLayout r3 = r6.u
            r3.setOrientation(r4)
            android.widget.ImageView r3 = r6.o
            int r4 = com.beizi.fusion.R.mipmap.beizi_interaction_icon_arrow_left
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.p
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.q
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.o
            java.lang.String r4 = r6.r
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.p
            java.lang.String r4 = r6.s
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.q
            java.lang.String r4 = r6.t
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            int r0 = r0 / 3
            r2.width = r0
            r2.height = r1
            goto L15b
        L114:
            java.lang.String r3 = r6.f6500k
            java.lang.String r5 = r6.f6496g
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L15b
            android.widget.LinearLayout r3 = r6.u
            r3.setOrientation(r4)
            android.widget.ImageView r3 = r6.o
            int r4 = com.beizi.fusion.R.mipmap.beizi_interaction_icon_arrow_right
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.p
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.q
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r6.o
            java.lang.String r4 = r6.t
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.p
            java.lang.String r4 = r6.s
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            android.widget.ImageView r3 = r6.q
            java.lang.String r4 = r6.r
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColorFilter(r4)
            int r0 = r0 / 3
            r2.width = r0
            r2.height = r1
        L15b:
            android.widget.LinearLayout r0 = r6.u
            android.widget.ImageView r1 = r6.o
            r0.addView(r1, r2)
            android.widget.LinearLayout r0 = r6.u
            android.widget.ImageView r1 = r6.p
            r0.addView(r1, r2)
            android.widget.LinearLayout r0 = r6.u
            android.widget.ImageView r1 = r6.q
            r0.addView(r1, r2)
            return
    }

    private int[] b(android.view.ViewGroup r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "ScrollUtil"
            java.lang.String r3 = ";"
            java.lang.String r4 = "%"
            r5 = 4
            int[] r5 = new int[r5]
            r9 = 0
            if (r1 == 0) goto L14
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r10 = r0.f6493d     // Catch: java.lang.Exception -> L1d5
            if (r10 != 0) goto L1c
        L14:
            r16 = 3
            r17 = 2
            r18 = 1
            goto L1bd
        L1c:
            java.lang.String r10 = r10.getCenterX()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r11 = r0.f6493d     // Catch: java.lang.Exception -> L1d5
            java.lang.String r11 = r11.getTop()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r12 = r0.f6493d     // Catch: java.lang.Exception -> L1d5
            java.lang.String r12 = r12.getWidth()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r13 = r0.f6493d     // Catch: java.lang.Exception -> L1d5
            java.lang.String r13 = r13.getHeight()     // Catch: java.lang.Exception -> L1d5
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r15 = "10"
            r16 = 3
            java.lang.String r6 = "0"
            if (r14 != 0) goto L44
            boolean r14 = r6.equals(r10)     // Catch: java.lang.Exception -> L1d5
            if (r14 == 0) goto L45
        L44:
            r10 = r15
        L45:
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d5
            if (r14 != 0) goto L51
            boolean r14 = r6.equals(r11)     // Catch: java.lang.Exception -> L1d5
            if (r14 == 0) goto L52
        L51:
            r11 = r15
        L52:
            r1.measure(r9, r9)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r14 = r0.a     // Catch: java.lang.Exception -> L1d5
            int r15 = r1.getMeasuredWidth()     // Catch: java.lang.Exception -> L1d5
            float r15 = (float) r15     // Catch: java.lang.Exception -> L1d5
            int r14 = com.beizi.ad.internal.h.u.b(r14, r15)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r15 = r0.a     // Catch: java.lang.Exception -> L1d5
            r17 = 2
            int r7 = r1.getMeasuredHeight()     // Catch: java.lang.Exception -> L1d5
            float r7 = (float) r7     // Catch: java.lang.Exception -> L1d5
            int r7 = com.beizi.ad.internal.h.u.b(r15, r7)     // Catch: java.lang.Exception -> L1d5
            if (r14 > 0) goto L75
            android.content.Context r14 = r0.a     // Catch: java.lang.Exception -> L1d5
            int r14 = com.beizi.ad.lance.a.q.h(r14)     // Catch: java.lang.Exception -> L1d5
        L75:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d5
            r15.<init>()     // Catch: java.lang.Exception -> L1d5
            r18 = 1
            java.lang.String r8 = "position containerWidth:"
            r15.append(r8)     // Catch: java.lang.Exception -> L1d5
            r15.append(r14)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r8 = ";containerHeight:"
            r15.append(r8)     // Catch: java.lang.Exception -> L1d5
            r15.append(r7)     // Catch: java.lang.Exception -> L1d5
            r15.append(r3)     // Catch: java.lang.Exception -> L1d5
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d5
            int r8 = r8.width     // Catch: java.lang.Exception -> L1d5
            r15.append(r8)     // Catch: java.lang.Exception -> L1d5
            r15.append(r3)     // Catch: java.lang.Exception -> L1d5
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d5
            int r1 = r1.height     // Catch: java.lang.Exception -> L1d5
            r15.append(r1)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r15.toString()     // Catch: java.lang.Exception -> L1d5
            com.beizi.ad.lance.a.m.a(r2, r1)     // Catch: java.lang.Exception -> L1d5
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r8 = "20"
            if (r1 != 0) goto Lb9
            boolean r1 = r6.equals(r12)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lba
        Lb9:
            r12 = r8
        Lba:
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> L1d5
            if (r1 != 0) goto Lc6
            boolean r1 = r6.equals(r13)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lc7
        Lc6:
            r13 = r8
        Lc7:
            boolean r1 = r10.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lde
            int r1 = r10.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r10.substring(r9, r1)     // Catch: java.lang.Exception -> L1d5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L1d5
            int r1 = r1 * r14
            int r1 = r1 / 100
            goto Lea
        Lde:
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d5
            if (r1 != 0) goto Le9
            int r1 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L1d5
            goto Lea
        Le9:
            r1 = 0
        Lea:
            boolean r6 = r11.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            if (r6 == 0) goto L101
            int r6 = r11.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r6 = r11.substring(r9, r6)     // Catch: java.lang.Exception -> L1d5
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1d5
            int r7 = r7 * r6
            int r7 = r7 / 100
            goto L10d
        L101:
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d5
            if (r6 != 0) goto L10c
            int r7 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L1d5
            goto L10d
        L10c:
            r7 = 0
        L10d:
            boolean r6 = r12.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            r8 = 20
            if (r6 == 0) goto L126
            int r6 = r12.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r6 = r12.substring(r9, r6)     // Catch: java.lang.Exception -> L1d5
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1d5
            int r14 = r14 * r6
            int r14 = r14 / 100
            goto L133
        L126:
            boolean r6 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d5
            if (r6 != 0) goto L131
            int r14 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Exception -> L1d5
            goto L133
        L131:
            r14 = 20
        L133:
            boolean r6 = r13.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            if (r6 == 0) goto L14a
            int r4 = r13.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = r13.substring(r9, r4)     // Catch: java.lang.Exception -> L1d5
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L1d5
            int r4 = r4 * r14
            int r8 = r4 / 100
            goto L154
        L14a:
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d5
            if (r4 != 0) goto L154
            int r8 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.Exception -> L1d5
        L154:
            android.content.Context r4 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r6 = (float) r14     // Catch: java.lang.Exception -> L1d5
            int r4 = com.beizi.ad.internal.h.u.a(r4, r6)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r6 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r8 = (float) r8     // Catch: java.lang.Exception -> L1d5
            int r6 = com.beizi.ad.internal.h.u.a(r6, r8)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r1 = (float) r1     // Catch: java.lang.Exception -> L1d5
            int r1 = com.beizi.ad.internal.h.u.a(r8, r1)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r7 = (float) r7     // Catch: java.lang.Exception -> L1d5
            int r7 = com.beizi.ad.internal.h.u.a(r8, r7)     // Catch: java.lang.Exception -> L1d5
            r5[r9] = r4     // Catch: java.lang.Exception -> L1d5
            r5[r18] = r6     // Catch: java.lang.Exception -> L1d5
            if (r1 <= 0) goto L178
            r5[r17] = r1     // Catch: java.lang.Exception -> L1d5
        L178:
            if (r7 <= 0) goto L17c
            r5[r16] = r7     // Catch: java.lang.Exception -> L1d5
        L17c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d5
            r1.<init>()     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = "position widthInt:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r9]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = ";heightInt:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r18]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = ";centerX:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r17]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = ";centerY:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r16]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r1.append(r10)     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r1.append(r11)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L1d5
            com.beizi.ad.lance.a.m.a(r2, r1)     // Catch: java.lang.Exception -> L1d5
            return r5
        L1bd:
            android.content.Context r1 = r0.a     // Catch: java.lang.Exception -> L1d5
            r2 = 1101004800(0x41a00000, float:20.0)
            int r1 = com.beizi.ad.internal.h.u.a(r1, r2)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r2 = r0.a     // Catch: java.lang.Exception -> L1d5
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = com.beizi.ad.internal.h.u.a(r2, r3)     // Catch: java.lang.Exception -> L1d5
            r5[r9] = r1     // Catch: java.lang.Exception -> L1d5
            r5[r18] = r1     // Catch: java.lang.Exception -> L1d5
            r5[r17] = r2     // Catch: java.lang.Exception -> L1d5
            r5[r16] = r2     // Catch: java.lang.Exception -> L1d5
        L1d5:
            return r5
    }

    static /* synthetic */ java.lang.String c(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.f6498i
            return r0
    }

    private void c() {
            r2 = this;
            android.view.View r0 = r2.f6495f
            if (r0 != 0) goto L5
            return
        L5:
            com.beizi.ad.a.a.d$1 r1 = new com.beizi.ad.a.a.d$1
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            return
    }

    static /* synthetic */ com.beizi.ad.a.a.d.a d(com.beizi.ad.a.a.d r0) {
            com.beizi.ad.a.a.d$a r0 = r0.f6494e
            return r0
    }

    private void d() {
            r3 = this;
            r0 = 0
            r1 = 10
            int[] r0 = new int[]{r1, r0}     // Catch: java.lang.Exception -> L2d
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)     // Catch: java.lang.Exception -> L2d
            r3.m = r0     // Catch: java.lang.Exception -> L2d
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)     // Catch: java.lang.Exception -> L2d
            android.animation.ValueAnimator r0 = r3.m     // Catch: java.lang.Exception -> L2d
            com.beizi.ad.a.a.d$2 r1 = new com.beizi.ad.a.a.d$2     // Catch: java.lang.Exception -> L2d
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2d
            r0.addUpdateListener(r1)     // Catch: java.lang.Exception -> L2d
            android.animation.ValueAnimator r0 = r3.m     // Catch: java.lang.Exception -> L2d
            com.beizi.ad.a.a.d$3 r1 = new com.beizi.ad.a.a.d$3     // Catch: java.lang.Exception -> L2d
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2d
            r0.addListener(r1)     // Catch: java.lang.Exception -> L2d
            android.animation.ValueAnimator r0 = r3.m     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2d
            r0.start()     // Catch: java.lang.Exception -> L2d
        L2d:
            return
    }

    static /* synthetic */ java.lang.String e(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.f6497h
            return r0
    }

    static /* synthetic */ java.lang.String f(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.f6499j
            return r0
    }

    static /* synthetic */ java.lang.String g(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.f6500k
            return r0
    }

    static /* synthetic */ int h(com.beizi.ad.a.a.d r2) {
            int r0 = r2.n
            int r1 = r0 + 1
            r2.n = r1
            return r0
    }

    static /* synthetic */ int i(com.beizi.ad.a.a.d r0) {
            int r0 = r0.n
            return r0
    }

    static /* synthetic */ java.lang.String j(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.s
            return r0
    }

    static /* synthetic */ android.widget.ImageView k(com.beizi.ad.a.a.d r0) {
            android.widget.ImageView r0 = r0.o
            return r0
    }

    static /* synthetic */ java.lang.String l(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.t
            return r0
    }

    static /* synthetic */ android.widget.ImageView m(com.beizi.ad.a.a.d r0) {
            android.widget.ImageView r0 = r0.p
            return r0
    }

    static /* synthetic */ java.lang.String n(com.beizi.ad.a.a.d r0) {
            java.lang.String r0 = r0.r
            return r0
    }

    static /* synthetic */ android.widget.ImageView o(com.beizi.ad.a.a.d r0) {
            android.widget.ImageView r0 = r0.q
            return r0
    }

    static /* synthetic */ android.animation.ValueAnimator p(com.beizi.ad.a.a.d r0) {
            android.animation.ValueAnimator r0 = r0.m
            return r0
    }

    public void a() {
            r2 = this;
            r0 = 0
            r2.f6495f = r0     // Catch: java.lang.Exception -> L1d
            r2.f6494e = r0     // Catch: java.lang.Exception -> L1d
            r2.f6492c = r0     // Catch: java.lang.Exception -> L1d
            r2.f6491b = r0     // Catch: java.lang.Exception -> L1d
            android.animation.ValueAnimator r1 = r2.m     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L15
            r1.removeAllUpdateListeners()     // Catch: java.lang.Exception -> L1d
            android.animation.ValueAnimator r1 = r2.m     // Catch: java.lang.Exception -> L1d
            r1.removeAllListeners()     // Catch: java.lang.Exception -> L1d
        L15:
            r2.m = r0     // Catch: java.lang.Exception -> L1d
            r2.o = r0     // Catch: java.lang.Exception -> L1d
            r2.p = r0     // Catch: java.lang.Exception -> L1d
            r2.q = r0     // Catch: java.lang.Exception -> L1d
        L1d:
            return
    }

    public void a(android.view.View r1, com.beizi.ad.a.a.d.a r2) {
            r0 = this;
            r0.f6495f = r1
            r0.f6494e = r2
            r0.c()
            return
    }

    public void a(android.view.ViewGroup r9) {
            r8 = this;
            if (r9 == 0) goto La5
            android.content.Context r0 = r8.a     // Catch: java.lang.Exception -> La5
            if (r0 != 0) goto L8
            goto La5
        L8:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> La5
            android.content.Context r1 = r8.a     // Catch: java.lang.Exception -> La5
            r0.<init>(r1)     // Catch: java.lang.Exception -> La5
            r8.u = r0     // Catch: java.lang.Exception -> La5
            int[] r0 = r8.b(r9)     // Catch: java.lang.Exception -> La5
            boolean r1 = r9 instanceof android.widget.RelativeLayout     // Catch: java.lang.Exception -> La5
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = -2
            r7 = -1
            if (r1 == 0) goto L43
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Exception -> La5
            r1.<init>(r7, r6)     // Catch: java.lang.Exception -> La5
            r5 = r0[r5]     // Catch: java.lang.Exception -> La5
            if (r5 <= 0) goto L2a
            r1.width = r5     // Catch: java.lang.Exception -> La5
        L2a:
            r4 = r0[r4]     // Catch: java.lang.Exception -> La5
            if (r4 <= 0) goto L30
            r1.height = r4     // Catch: java.lang.Exception -> La5
        L30:
            r3 = r0[r3]     // Catch: java.lang.Exception -> La5
            r1.leftMargin = r3     // Catch: java.lang.Exception -> La5
            r0 = r0[r2]     // Catch: java.lang.Exception -> La5
            r1.topMargin = r0     // Catch: java.lang.Exception -> La5
            r0 = 17
            r1.addRule(r0)     // Catch: java.lang.Exception -> La5
            android.widget.LinearLayout r0 = r8.u     // Catch: java.lang.Exception -> La5
            r9.addView(r0, r1)     // Catch: java.lang.Exception -> La5
            goto L9f
        L43:
            boolean r1 = r9 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L66
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> La5
            r1.<init>(r7, r6)     // Catch: java.lang.Exception -> La5
            r5 = r0[r5]     // Catch: java.lang.Exception -> La5
            if (r5 <= 0) goto L52
            r1.width = r5     // Catch: java.lang.Exception -> La5
        L52:
            r4 = r0[r4]     // Catch: java.lang.Exception -> La5
            if (r4 <= 0) goto L58
            r1.height = r4     // Catch: java.lang.Exception -> La5
        L58:
            r3 = r0[r3]     // Catch: java.lang.Exception -> La5
            r1.leftMargin = r3     // Catch: java.lang.Exception -> La5
            r0 = r0[r2]     // Catch: java.lang.Exception -> La5
            r1.topMargin = r0     // Catch: java.lang.Exception -> La5
            android.widget.LinearLayout r0 = r8.u     // Catch: java.lang.Exception -> La5
            r9.addView(r0, r1)     // Catch: java.lang.Exception -> La5
            goto L9f
        L66:
            boolean r1 = r9 instanceof android.widget.LinearLayout     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L89
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> La5
            r1.<init>(r7, r6)     // Catch: java.lang.Exception -> La5
            r5 = r0[r5]     // Catch: java.lang.Exception -> La5
            if (r5 <= 0) goto L75
            r1.width = r5     // Catch: java.lang.Exception -> La5
        L75:
            r4 = r0[r4]     // Catch: java.lang.Exception -> La5
            if (r4 <= 0) goto L7b
            r1.height = r4     // Catch: java.lang.Exception -> La5
        L7b:
            r3 = r0[r3]     // Catch: java.lang.Exception -> La5
            r1.leftMargin = r3     // Catch: java.lang.Exception -> La5
            r0 = r0[r2]     // Catch: java.lang.Exception -> La5
            r1.topMargin = r0     // Catch: java.lang.Exception -> La5
            android.widget.LinearLayout r0 = r8.u     // Catch: java.lang.Exception -> La5
            r9.addView(r0, r1)     // Catch: java.lang.Exception -> La5
            goto L9f
        L89:
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> La5
            r1.<init>(r7, r6)     // Catch: java.lang.Exception -> La5
            r2 = r0[r5]     // Catch: java.lang.Exception -> La5
            if (r2 <= 0) goto L94
            r1.width = r2     // Catch: java.lang.Exception -> La5
        L94:
            r0 = r0[r4]     // Catch: java.lang.Exception -> La5
            if (r0 <= 0) goto L9a
            r1.height = r0     // Catch: java.lang.Exception -> La5
        L9a:
            android.widget.LinearLayout r0 = r8.u     // Catch: java.lang.Exception -> La5
            r9.addView(r0, r1)     // Catch: java.lang.Exception -> La5
        L9f:
            r8.b()     // Catch: java.lang.Exception -> La5
            r8.d()     // Catch: java.lang.Exception -> La5
        La5:
            return
    }
}
