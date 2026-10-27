package com.beizi.ad.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean f6470b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean f6471c;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.ad.a.a.c.a f6472d;

    /* renamed from: e, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean f6473e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f6474f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6475g;

    /* renamed from: h, reason: collision with root package name */
    private double f6476h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f6477i;

    /* renamed from: j, reason: collision with root package name */
    private int f6478j;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8);
    }

    public c(android.content.Context r4, com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean r5, java.lang.String r6, boolean r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f6472d = r0
            r3.f6474f = r0
            r3.f6475g = r0
            r1 = 0
            r3.f6476h = r1
            r3.f6477i = r0
            r0 = 0
            r3.f6478j = r0
            r3.a = r4     // Catch: java.lang.Exception -> Lda
            r3.f6470b = r5     // Catch: java.lang.Exception -> Lda
            java.util.List r4 = r5.getOrderData()     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataRegionalClickViewBean r4 = r3.a(r4, r6)     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto L2d
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r5 = r4.getRegionalClickView()     // Catch: java.lang.Exception -> Lda
            if (r5 == 0) goto L2d
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r4.getRegionalClickView()     // Catch: java.lang.Exception -> Lda
            r3.f6471c = r4     // Catch: java.lang.Exception -> Lda
        L2d:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6471c     // Catch: java.lang.Exception -> Lda
            java.lang.String r5 = "点击下载应用"
            if (r4 == 0) goto L73
            if (r7 != 0) goto L3c
            java.lang.String r4 = r4.getTitle()     // Catch: java.lang.Exception -> Lda
            r3.f6477i = r4     // Catch: java.lang.Exception -> Lda
            goto L4a
        L3c:
            java.lang.String r4 = r4.getDownloadTitle()     // Catch: java.lang.Exception -> Lda
            r3.f6477i = r4     // Catch: java.lang.Exception -> Lda
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto L4a
            r3.f6477i = r5     // Catch: java.lang.Exception -> Lda
        L4a:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6471c     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r4 = r4.getPosition()     // Catch: java.lang.Exception -> Lda
            r3.f6473e = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6471c     // Catch: java.lang.Exception -> Lda
            java.lang.String r4 = r4.getTitleColor()     // Catch: java.lang.Exception -> Lda
            r3.f6474f = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6471c     // Catch: java.lang.Exception -> Lda
            java.lang.String r4 = r4.getBackgroundColor()     // Catch: java.lang.Exception -> Lda
            r3.f6475g = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6471c     // Catch: java.lang.Exception -> Lda
            double r4 = r4.getBackgroundAlpha()     // Catch: java.lang.Exception -> Lda
            r3.f6476h = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6471c     // Catch: java.lang.Exception -> Lda
            int r4 = r4.getIsDisableClick()     // Catch: java.lang.Exception -> Lda
            r3.f6478j = r4     // Catch: java.lang.Exception -> Lda
            goto Lb6
        L73:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6470b     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto Lb6
            if (r7 != 0) goto L80
            java.lang.String r4 = r4.getTitle()     // Catch: java.lang.Exception -> Lda
            r3.f6477i = r4     // Catch: java.lang.Exception -> Lda
            goto L8e
        L80:
            java.lang.String r4 = r4.getDownloadTitle()     // Catch: java.lang.Exception -> Lda
            r3.f6477i = r4     // Catch: java.lang.Exception -> Lda
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto L8e
            r3.f6477i = r5     // Catch: java.lang.Exception -> Lda
        L8e:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6470b     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r4 = r4.getPosition()     // Catch: java.lang.Exception -> Lda
            r3.f6473e = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6470b     // Catch: java.lang.Exception -> Lda
            java.lang.String r4 = r4.getTitleColor()     // Catch: java.lang.Exception -> Lda
            r3.f6474f = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6470b     // Catch: java.lang.Exception -> Lda
            java.lang.String r4 = r4.getBackgroundColor()     // Catch: java.lang.Exception -> Lda
            r3.f6475g = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6470b     // Catch: java.lang.Exception -> Lda
            double r4 = r4.getBackgroundAlpha()     // Catch: java.lang.Exception -> Lda
            r3.f6476h = r4     // Catch: java.lang.Exception -> Lda
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r4 = r3.f6470b     // Catch: java.lang.Exception -> Lda
            int r4 = r4.getIsDisableClick()     // Catch: java.lang.Exception -> Lda
            r3.f6478j = r4     // Catch: java.lang.Exception -> Lda
        Lb6:
            java.lang.String r4 = r3.f6477i     // Catch: java.lang.Exception -> Lda
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto Lc2
            java.lang.String r4 = "点击跳转网页或第三方应用"
            r3.f6477i = r4     // Catch: java.lang.Exception -> Lda
        Lc2:
            java.lang.String r4 = r3.f6475g     // Catch: java.lang.Exception -> Lda
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto Lce
            java.lang.String r4 = "#3976FF"
            r3.f6475g = r4     // Catch: java.lang.Exception -> Lda
        Lce:
            java.lang.String r4 = r3.f6474f     // Catch: java.lang.Exception -> Lda
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto Lda
            java.lang.String r4 = "#FFFFFF"
            r3.f6474f = r4     // Catch: java.lang.Exception -> Lda
        Lda:
            return
    }

    static /* synthetic */ com.beizi.ad.a.a.c.a a(com.beizi.ad.a.a.c r0) {
            com.beizi.ad.a.a.c$a r0 = r0.f6472d
            return r0
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean> r4, java.lang.String r5) {
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
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataRegionalClickViewBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean) r1
            java.util.List r2 = r1.getOrderList()
            if (r2 == 0) goto La
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto La
            return r1
        L23:
            return r0
    }

    private int[] b(android.view.ViewGroup r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "RegionClickUtil"
            java.lang.String r3 = ";"
            java.lang.String r4 = "%"
            r5 = 4
            int[] r5 = new int[r5]
            r9 = 0
            if (r1 == 0) goto L14
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r10 = r0.f6473e     // Catch: java.lang.Exception -> L1d3
            if (r10 != 0) goto L1c
        L14:
            r16 = 3
            r17 = 2
            r18 = 1
            goto L1bd
        L1c:
            java.lang.String r10 = r10.getCenterX()     // Catch: java.lang.Exception -> L1d3
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r11 = r0.f6473e     // Catch: java.lang.Exception -> L1d3
            java.lang.String r11 = r11.getCenterY()     // Catch: java.lang.Exception -> L1d3
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r12 = r0.f6473e     // Catch: java.lang.Exception -> L1d3
            java.lang.String r12 = r12.getWidth()     // Catch: java.lang.Exception -> L1d3
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r13 = r0.f6473e     // Catch: java.lang.Exception -> L1d3
            java.lang.String r13 = r13.getHeight()     // Catch: java.lang.Exception -> L1d3
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r15 = "0"
            if (r14 != 0) goto L40
            boolean r14 = r15.equals(r10)     // Catch: java.lang.Exception -> L1d3
            if (r14 == 0) goto L41
        L40:
            r10 = r15
        L41:
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d3
            if (r14 != 0) goto L4d
            boolean r14 = r15.equals(r11)     // Catch: java.lang.Exception -> L1d3
            if (r14 == 0) goto L4e
        L4d:
            r11 = r15
        L4e:
            r1.measure(r9, r9)     // Catch: java.lang.Exception -> L1d3
            android.content.Context r14 = r0.a     // Catch: java.lang.Exception -> L1d3
            r16 = 3
            int r6 = r1.getMeasuredWidth()     // Catch: java.lang.Exception -> L1d3
            float r6 = (float) r6     // Catch: java.lang.Exception -> L1d3
            int r6 = com.beizi.ad.internal.h.u.b(r14, r6)     // Catch: java.lang.Exception -> L1d3
            android.content.Context r14 = r0.a     // Catch: java.lang.Exception -> L1d3
            r17 = 2
            int r7 = r1.getMeasuredHeight()     // Catch: java.lang.Exception -> L1d3
            float r7 = (float) r7     // Catch: java.lang.Exception -> L1d3
            int r7 = com.beizi.ad.internal.h.u.b(r14, r7)     // Catch: java.lang.Exception -> L1d3
            if (r6 > 0) goto L73
            android.content.Context r6 = r0.a     // Catch: java.lang.Exception -> L1d3
            int r6 = com.beizi.ad.lance.a.q.h(r6)     // Catch: java.lang.Exception -> L1d3
        L73:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d3
            r14.<init>()     // Catch: java.lang.Exception -> L1d3
            r18 = 1
            java.lang.String r8 = "position containerWidth:"
            r14.append(r8)     // Catch: java.lang.Exception -> L1d3
            r14.append(r6)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r8 = ";containerHeight:"
            r14.append(r8)     // Catch: java.lang.Exception -> L1d3
            r14.append(r7)     // Catch: java.lang.Exception -> L1d3
            r14.append(r3)     // Catch: java.lang.Exception -> L1d3
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d3
            int r8 = r8.width     // Catch: java.lang.Exception -> L1d3
            r14.append(r8)     // Catch: java.lang.Exception -> L1d3
            r14.append(r3)     // Catch: java.lang.Exception -> L1d3
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d3
            int r1 = r1.height     // Catch: java.lang.Exception -> L1d3
            r14.append(r1)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r1 = r14.toString()     // Catch: java.lang.Exception -> L1d3
            com.beizi.ad.lance.a.m.a(r2, r1)     // Catch: java.lang.Exception -> L1d3
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d3
            if (r1 != 0) goto Lb5
            boolean r1 = r15.equals(r12)     // Catch: java.lang.Exception -> L1d3
            if (r1 == 0) goto Lb9
        Lb5:
            java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L1d3
        Lb9:
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> L1d3
            if (r1 != 0) goto Lc5
            boolean r1 = r15.equals(r13)     // Catch: java.lang.Exception -> L1d3
            if (r1 == 0) goto Lc7
        Lc5:
            java.lang.String r13 = "40"
        Lc7:
            boolean r1 = r10.endsWith(r4)     // Catch: java.lang.Exception -> L1d3
            if (r1 == 0) goto Lde
            int r1 = r10.indexOf(r4)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r1 = r10.substring(r9, r1)     // Catch: java.lang.Exception -> L1d3
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L1d3
            int r1 = r1 * r6
            int r1 = r1 / 100
            goto Lea
        Lde:
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d3
            if (r1 != 0) goto Le9
            int r1 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L1d3
            goto Lea
        Le9:
            r1 = 0
        Lea:
            boolean r8 = r11.endsWith(r4)     // Catch: java.lang.Exception -> L1d3
            if (r8 == 0) goto L101
            int r8 = r11.indexOf(r4)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r8 = r11.substring(r9, r8)     // Catch: java.lang.Exception -> L1d3
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Exception -> L1d3
            int r7 = r7 * r8
            int r7 = r7 / 100
            goto L10d
        L101:
            boolean r7 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d3
            if (r7 != 0) goto L10c
            int r7 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L1d3
            goto L10d
        L10c:
            r7 = 0
        L10d:
            boolean r8 = r12.endsWith(r4)     // Catch: java.lang.Exception -> L1d3
            if (r8 == 0) goto L124
            int r8 = r12.indexOf(r4)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r8 = r12.substring(r9, r8)     // Catch: java.lang.Exception -> L1d3
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Exception -> L1d3
            int r6 = r6 * r8
            int r6 = r6 / 100
            goto L130
        L124:
            boolean r6 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d3
            if (r6 != 0) goto L12f
            int r6 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Exception -> L1d3
            goto L130
        L12f:
            r6 = 0
        L130:
            boolean r8 = r13.endsWith(r4)     // Catch: java.lang.Exception -> L1d3
            if (r8 == 0) goto L147
            int r4 = r13.indexOf(r4)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r4 = r13.substring(r9, r4)     // Catch: java.lang.Exception -> L1d3
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L1d3
            int r4 = r4 * r6
            int r4 = r4 / 100
            goto L154
        L147:
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d3
            if (r4 != 0) goto L152
            int r4 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.Exception -> L1d3
            goto L154
        L152:
            r4 = 40
        L154:
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d3
            float r6 = (float) r6     // Catch: java.lang.Exception -> L1d3
            int r6 = com.beizi.ad.internal.h.u.a(r8, r6)     // Catch: java.lang.Exception -> L1d3
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d3
            float r4 = (float) r4     // Catch: java.lang.Exception -> L1d3
            int r4 = com.beizi.ad.internal.h.u.a(r8, r4)     // Catch: java.lang.Exception -> L1d3
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d3
            float r1 = (float) r1     // Catch: java.lang.Exception -> L1d3
            int r1 = com.beizi.ad.internal.h.u.a(r8, r1)     // Catch: java.lang.Exception -> L1d3
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d3
            float r7 = (float) r7     // Catch: java.lang.Exception -> L1d3
            int r7 = com.beizi.ad.internal.h.u.a(r8, r7)     // Catch: java.lang.Exception -> L1d3
            r5[r9] = r6     // Catch: java.lang.Exception -> L1d3
            r5[r18] = r4     // Catch: java.lang.Exception -> L1d3
            if (r1 <= 0) goto L178
            r5[r17] = r1     // Catch: java.lang.Exception -> L1d3
        L178:
            if (r7 <= 0) goto L17c
            r5[r16] = r7     // Catch: java.lang.Exception -> L1d3
        L17c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d3
            r1.<init>()     // Catch: java.lang.Exception -> L1d3
            java.lang.String r4 = "position widthInt:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            r4 = r5[r9]     // Catch: java.lang.Exception -> L1d3
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r4 = ";heightInt:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            r4 = r5[r18]     // Catch: java.lang.Exception -> L1d3
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r4 = ";centerX:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            r4 = r5[r17]     // Catch: java.lang.Exception -> L1d3
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r4 = ";centerY:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            r4 = r5[r16]     // Catch: java.lang.Exception -> L1d3
            r1.append(r4)     // Catch: java.lang.Exception -> L1d3
            r1.append(r3)     // Catch: java.lang.Exception -> L1d3
            r1.append(r10)     // Catch: java.lang.Exception -> L1d3
            r1.append(r3)     // Catch: java.lang.Exception -> L1d3
            r1.append(r11)     // Catch: java.lang.Exception -> L1d3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L1d3
            com.beizi.ad.lance.a.m.a(r2, r1)     // Catch: java.lang.Exception -> L1d3
            return r5
        L1bd:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d3
            int r1 = r1.width     // Catch: java.lang.Exception -> L1d3
            android.content.Context r2 = r0.a     // Catch: java.lang.Exception -> L1d3
            r3 = 1109393408(0x42200000, float:40.0)
            int r2 = com.beizi.ad.internal.h.u.a(r2, r3)     // Catch: java.lang.Exception -> L1d3
            r5[r9] = r1     // Catch: java.lang.Exception -> L1d3
            r5[r18] = r2     // Catch: java.lang.Exception -> L1d3
            r5[r17] = r9     // Catch: java.lang.Exception -> L1d3
            r5[r16] = r9     // Catch: java.lang.Exception -> L1d3
        L1d3:
            return r5
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f6475g
            return r0
    }

    public void a(android.view.ViewGroup r11) {
            r10 = this;
            if (r11 == 0) goto L146
            android.content.Context r0 = r10.a     // Catch: java.lang.Exception -> L146
            if (r0 != 0) goto L8
            goto L146
        L8:
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Exception -> L146
            android.content.Context r1 = r10.a     // Catch: java.lang.Exception -> L146
            r0.<init>(r1)     // Catch: java.lang.Exception -> L146
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L146
            r2 = 1
            r0.setLines(r2)     // Catch: java.lang.Exception -> L146
            r3 = 17
            r0.setGravity(r3)     // Catch: java.lang.Exception -> L146
            r0.setMaxLines(r2)     // Catch: java.lang.Exception -> L146
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END     // Catch: java.lang.Exception -> L146
            r0.setEllipsize(r4)     // Catch: java.lang.Exception -> L146
            int r4 = r10.f6478j     // Catch: java.lang.Exception -> L146
            if (r4 != 0) goto L30
            com.beizi.ad.a.a.c$1 r4 = new com.beizi.ad.a.a.c$1     // Catch: java.lang.Exception -> L146
            r4.<init>(r10)     // Catch: java.lang.Exception -> L146
            r0.setOnTouchListener(r4)     // Catch: java.lang.Exception -> L146
        L30:
            java.lang.String r4 = r10.f6477i     // Catch: java.lang.Exception -> L146
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L146
            if (r4 != 0) goto L3d
            java.lang.String r4 = r10.f6477i     // Catch: java.lang.Exception -> L146
            r0.setText(r4)     // Catch: java.lang.Exception -> L146
        L3d:
            java.lang.String r4 = r10.f6474f     // Catch: java.lang.Exception -> L146
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L146
            if (r4 == 0) goto L49
            java.lang.String r4 = "#FFFFFF"
            r10.f6474f = r4     // Catch: java.lang.Exception -> L146
        L49:
            java.lang.String r4 = r10.f6474f     // Catch: java.lang.Exception -> L146
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L146
            java.lang.String r5 = "#"
            if (r4 != 0) goto L64
            java.lang.String r4 = r10.f6474f     // Catch: java.lang.Exception -> L146
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.Exception -> L146
            if (r4 == 0) goto L64
            java.lang.String r4 = r10.f6474f     // Catch: java.lang.Exception -> L146
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Exception -> L146
            r0.setTextColor(r4)     // Catch: java.lang.Exception -> L146
        L64:
            java.lang.String r4 = r10.f6475g     // Catch: java.lang.Exception -> L146
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L146
            if (r4 == 0) goto L70
            java.lang.String r4 = "#80000000"
            r10.f6475g = r4     // Catch: java.lang.Exception -> L146
        L70:
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Exception -> L146
            r4.<init>()     // Catch: java.lang.Exception -> L146
            java.lang.String r6 = r10.f6475g     // Catch: java.lang.Exception -> L146
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L146
            if (r6 != 0) goto L8e
            java.lang.String r6 = r10.f6475g     // Catch: java.lang.Exception -> L146
            boolean r5 = r6.startsWith(r5)     // Catch: java.lang.Exception -> L146
            if (r5 == 0) goto L8e
            java.lang.String r5 = r10.f6475g     // Catch: java.lang.Exception -> L146
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Exception -> L146
            r4.setColor(r5)     // Catch: java.lang.Exception -> L146
        L8e:
            double r5 = r10.f6476h     // Catch: java.lang.Exception -> L146
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto La1
            r7 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r5 = r5 * r7
            int r5 = (int) r5     // Catch: java.lang.Exception -> L146
            r4.setAlpha(r5)     // Catch: java.lang.Exception -> L146
        La1:
            android.content.Context r5 = r10.a     // Catch: java.lang.Exception -> L146
            r6 = 1088421888(0x40e00000, float:7.0)
            int r5 = com.beizi.ad.internal.h.u.a(r5, r6)     // Catch: java.lang.Exception -> L146
            float r5 = (float) r5     // Catch: java.lang.Exception -> L146
            r4.setCornerRadius(r5)     // Catch: java.lang.Exception -> L146
            r0.setBackgroundDrawable(r4)     // Catch: java.lang.Exception -> L146
            int[] r4 = r10.b(r11)     // Catch: java.lang.Exception -> L146
            r5 = 2
            r6 = 3
            r7 = r4[r2]     // Catch: java.lang.Exception -> Lca
            if (r7 <= 0) goto Lc4
            android.content.Context r8 = r10.a     // Catch: java.lang.Exception -> Lca
            float r7 = (float) r7     // Catch: java.lang.Exception -> Lca
            int r7 = com.beizi.ad.internal.h.u.b(r8, r7)     // Catch: java.lang.Exception -> Lca
            int r7 = r7 / r6
            double r7 = (double) r7     // Catch: java.lang.Exception -> Lca
            goto Lc6
        Lc4:
            r7 = 4624070917402656768(0x402c000000000000, double:14.0)
        Lc6:
            float r7 = (float) r7     // Catch: java.lang.Exception -> Lca
            r0.setTextSize(r5, r7)     // Catch: java.lang.Exception -> Lca
        Lca:
            boolean r7 = r11 instanceof android.widget.RelativeLayout     // Catch: java.lang.Exception -> L146
            r8 = -2
            r9 = -1
            if (r7 == 0) goto Lf0
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Exception -> L146
            r7.<init>(r9, r8)     // Catch: java.lang.Exception -> L146
            r1 = r4[r1]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto Ldb
            r7.width = r1     // Catch: java.lang.Exception -> L146
        Ldb:
            r1 = r4[r2]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto Le1
            r7.height = r1     // Catch: java.lang.Exception -> L146
        Le1:
            r1 = r4[r5]     // Catch: java.lang.Exception -> L146
            r7.leftMargin = r1     // Catch: java.lang.Exception -> L146
            r1 = r4[r6]     // Catch: java.lang.Exception -> L146
            r7.topMargin = r1     // Catch: java.lang.Exception -> L146
            r7.addRule(r3)     // Catch: java.lang.Exception -> L146
            r11.addView(r0, r7)     // Catch: java.lang.Exception -> L146
            goto L146
        Lf0:
            boolean r3 = r11 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> L146
            if (r3 == 0) goto L111
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L146
            r3.<init>(r9, r8)     // Catch: java.lang.Exception -> L146
            r1 = r4[r1]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto Lff
            r3.width = r1     // Catch: java.lang.Exception -> L146
        Lff:
            r1 = r4[r2]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto L105
            r3.height = r1     // Catch: java.lang.Exception -> L146
        L105:
            r1 = r4[r5]     // Catch: java.lang.Exception -> L146
            r3.leftMargin = r1     // Catch: java.lang.Exception -> L146
            r1 = r4[r6]     // Catch: java.lang.Exception -> L146
            r3.topMargin = r1     // Catch: java.lang.Exception -> L146
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> L146
            goto L146
        L111:
            boolean r3 = r11 instanceof android.widget.LinearLayout     // Catch: java.lang.Exception -> L146
            if (r3 == 0) goto L132
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L146
            r3.<init>(r9, r8)     // Catch: java.lang.Exception -> L146
            r1 = r4[r1]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto L120
            r3.width = r1     // Catch: java.lang.Exception -> L146
        L120:
            r1 = r4[r2]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto L126
            r3.height = r1     // Catch: java.lang.Exception -> L146
        L126:
            r1 = r4[r5]     // Catch: java.lang.Exception -> L146
            r3.leftMargin = r1     // Catch: java.lang.Exception -> L146
            r1 = r4[r6]     // Catch: java.lang.Exception -> L146
            r3.topMargin = r1     // Catch: java.lang.Exception -> L146
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> L146
            goto L146
        L132:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> L146
            r3.<init>(r9, r8)     // Catch: java.lang.Exception -> L146
            r1 = r4[r1]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto L13d
            r3.width = r1     // Catch: java.lang.Exception -> L146
        L13d:
            r1 = r4[r2]     // Catch: java.lang.Exception -> L146
            if (r1 <= 0) goto L143
            r3.height = r1     // Catch: java.lang.Exception -> L146
        L143:
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> L146
        L146:
            return
    }

    public void a(android.widget.LinearLayout r2, android.widget.TextView r3) {
            r1 = this;
            if (r2 == 0) goto L1f
            if (r3 != 0) goto L5
            goto L1f
        L5:
            java.lang.String r0 = r1.f6477i     // Catch: java.lang.Exception -> L1f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L12
            java.lang.String r0 = r1.f6477i     // Catch: java.lang.Exception -> L1f
            r3.setText(r0)     // Catch: java.lang.Exception -> L1f
        L12:
            int r3 = r1.f6478j     // Catch: java.lang.Exception -> L1f
            if (r3 == 0) goto L17
            goto L1f
        L17:
            com.beizi.ad.a.a.c$2 r3 = new com.beizi.ad.a.a.c$2     // Catch: java.lang.Exception -> L1f
            r3.<init>(r1)     // Catch: java.lang.Exception -> L1f
            r2.setOnTouchListener(r3)     // Catch: java.lang.Exception -> L1f
        L1f:
            return
    }

    public void a(com.beizi.ad.a.a.c.a r1) {
            r0 = this;
            r0.f6472d = r1
            return
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.f6470b = r0
            r1.f6471c = r0
            r1.f6473e = r0
            r1.f6472d = r0
            r1.a = r0
            return
    }
}
