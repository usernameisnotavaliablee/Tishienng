package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class aj {
    private static com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean j;
    com.beizi.fusion.widget.ScrollClickView a;
    int b;
    int c;
    private android.content.Context d;
    private int e;
    private int f;
    private com.beizi.fusion.tool.aj.a g;
    private boolean h;
    private int i;
    private java.lang.Boolean k;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a_();

        void b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8);
    }

    public aj(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g = r0
            r0 = 0
            r1.h = r0
            r0 = 200(0xc8, float:2.8E-43)
            r1.i = r0
            r1.d = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.beizi.fusion.tool.aj r0) {
            android.content.Context r0 = r0.d
            return r0
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Boolean> c(int r4) {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r0 = (int) r0
            if (r0 > r4) goto L1a
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.<init>(r0, r1)
            return r4
        L1a:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.<init>(r0, r1)
            return r4
    }

    private void c() {
            r4 = this;
            int r0 = r4.f
            android.util.Pair r0 = c(r0)
            java.lang.Object r1 = r0.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L26
            com.beizi.fusion.tool.aj$1 r1 = new com.beizi.fusion.tool.aj$1
            r1.<init>(r4)
            int r2 = r4.e
            java.lang.Object r0 = r0.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 * 10
            int r2 = r2 + r0
            long r2 = (long) r2
            com.beizi.fusion.tool.u.a(r1, r2)
        L26:
            return
    }

    public android.view.View a(int r8, int r9, com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickPositionBean r10) {
            r7 = this;
            java.lang.String r0 = "enter getScrollClick"
            java.lang.String r1 = "ScrollClickUtil"
            com.beizi.fusion.tool.aa.a(r1, r0)
            android.content.Context r0 = r7.d
            if (r0 == 0) goto L193
            if (r10 != 0) goto Lf
            goto L193
        Lf:
            com.beizi.fusion.widget.ScrollClickView r0 = new com.beizi.fusion.widget.ScrollClickView
            android.content.Context r2 = r7.d
            r0.<init>(r2)
            r7.a = r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r2 = com.beizi.fusion.tool.aj.j     // Catch: java.lang.NumberFormatException -> L190
            r3 = 0
            java.lang.String r4 = "%"
            if (r2 == 0) goto Lbc
            java.lang.String r2 = r2.getScrollDirection()     // Catch: java.lang.NumberFormatException -> L190
            r0.setScrollDirection(r2)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r0 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r2 = com.beizi.fusion.tool.aj.j     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r2 = r2.getTitle()     // Catch: java.lang.NumberFormatException -> L190
            r0.setTitleText(r2)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r0 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r2 = com.beizi.fusion.tool.aj.j     // Catch: java.lang.NumberFormatException -> L190
            int r2 = r2.getTitleFont()     // Catch: java.lang.NumberFormatException -> L190
            r0.setTitleFont(r2)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.Boolean r0 = r7.k     // Catch: java.lang.NumberFormatException -> L190
            boolean r0 = r0.booleanValue()     // Catch: java.lang.NumberFormatException -> L190
            if (r0 != 0) goto L4b
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = com.beizi.fusion.tool.aj.j     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r0 = r0.getDetails()     // Catch: java.lang.NumberFormatException -> L190
            goto L59
        L4b:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = com.beizi.fusion.tool.aj.j     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r0 = r0.getDownloadDetails()     // Catch: java.lang.NumberFormatException -> L190
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.NumberFormatException -> L190
            if (r2 == 0) goto L59
            java.lang.String r0 = "下载应用"
        L59:
            com.beizi.fusion.widget.ScrollClickView r2 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            r2.setDetailText(r0)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r0 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r2 = com.beizi.fusion.tool.aj.j     // Catch: java.lang.NumberFormatException -> L190
            int r2 = r2.getDetailsFont()     // Catch: java.lang.NumberFormatException -> L190
            r0.setDetailsFont(r2)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = com.beizi.fusion.tool.aj.j     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r0 = r0.getPosition()     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r2 = r0.getWidth()     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r0 = r0.getHeight()     // Catch: java.lang.NumberFormatException -> L190
            boolean r5 = r2.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L190
            if (r5 == 0) goto L8e
            int r5 = r2.indexOf(r4)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r2 = r2.substring(r3, r5)     // Catch: java.lang.NumberFormatException -> L190
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L190
            int r2 = r2 * r8
            int r2 = r2 / 100
            goto L92
        L8e:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L190
        L92:
            boolean r5 = r0.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L190
            if (r5 == 0) goto La9
            int r5 = r0.indexOf(r4)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r0 = r0.substring(r3, r5)     // Catch: java.lang.NumberFormatException -> L190
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L190
            int r0 = r0 * r2
            int r0 = r0 / 100
            goto Lad
        La9:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L190
        Lad:
            com.beizi.fusion.widget.ScrollClickView r5 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            r5.setHandWidth(r2)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r2 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            r2.setScrollbarHeight(r0)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r0 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            r0.buildRealView()     // Catch: java.lang.NumberFormatException -> L190
        Lbc:
            java.lang.String r0 = r10.getTop()     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r10 = r10.getCenterX()     // Catch: java.lang.NumberFormatException -> L190
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r5 = "50%"
            java.lang.String r6 = "0"
            if (r2 != 0) goto Ld4
            boolean r2 = r6.equals(r10)     // Catch: java.lang.NumberFormatException -> L190
            if (r2 == 0) goto Ld5
        Ld4:
            r10 = r5
        Ld5:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.NumberFormatException -> L190
            if (r2 != 0) goto Le1
            boolean r2 = r6.equals(r0)     // Catch: java.lang.NumberFormatException -> L190
            if (r2 == 0) goto Le2
        Le1:
            r0 = r5
        Le2:
            android.content.Context r2 = r7.d     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.tool.ap.i(r2)     // Catch: java.lang.NumberFormatException -> L190
            boolean r2 = r10.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L190
            if (r2 == 0) goto L100
            int r2 = r10.indexOf(r4)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r10 = r10.substring(r3, r2)     // Catch: java.lang.NumberFormatException -> L190
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L190
            int r10 = r10 * r8
            int r10 = r10 / 100
            r7.b = r10     // Catch: java.lang.NumberFormatException -> L190
            goto L106
        L100:
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L190
            r7.b = r10     // Catch: java.lang.NumberFormatException -> L190
        L106:
            boolean r10 = r0.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L190
            if (r10 == 0) goto L11f
            int r10 = r0.indexOf(r4)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r10 = r0.substring(r3, r10)     // Catch: java.lang.NumberFormatException -> L190
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L190
            int r10 = r10 * r9
            int r10 = r10 / 100
            r7.c = r10     // Catch: java.lang.NumberFormatException -> L190
            goto L125
        L11f:
            int r10 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L190
            r7.c = r10     // Catch: java.lang.NumberFormatException -> L190
        L125:
            android.content.Context r10 = r7.d     // Catch: java.lang.NumberFormatException -> L190
            int r0 = r7.b     // Catch: java.lang.NumberFormatException -> L190
            float r0 = (float) r0     // Catch: java.lang.NumberFormatException -> L190
            int r10 = com.beizi.fusion.tool.ap.a(r10, r0)     // Catch: java.lang.NumberFormatException -> L190
            r7.b = r10     // Catch: java.lang.NumberFormatException -> L190
            android.content.Context r10 = r7.d     // Catch: java.lang.NumberFormatException -> L190
            int r0 = r7.c     // Catch: java.lang.NumberFormatException -> L190
            float r0 = (float) r0     // Catch: java.lang.NumberFormatException -> L190
            int r10 = com.beizi.fusion.tool.ap.a(r10, r0)     // Catch: java.lang.NumberFormatException -> L190
            r7.c = r10     // Catch: java.lang.NumberFormatException -> L190
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.NumberFormatException -> L190
            r0 = -2
            r10.<init>(r0, r0)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L190
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r2 = "topInt = "
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L190
            int r2 = r7.c     // Catch: java.lang.NumberFormatException -> L190
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r2 = ",centerXInt = "
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L190
            int r2 = r7.b     // Catch: java.lang.NumberFormatException -> L190
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r2 = ",adWidthDp = "
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L190
            r0.append(r8)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r2 = ",adHeightDp = "
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L190
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L190
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.tool.aa.a(r1, r0)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r0 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.tool.aj$2 r1 = new com.beizi.fusion.tool.aj$2     // Catch: java.lang.NumberFormatException -> L190
            r1.<init>(r7, r9, r8, r10)     // Catch: java.lang.NumberFormatException -> L190
            r0.addOnGlobalLayoutListener(r1)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r8 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            r8.setLayoutParams(r10)     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.widget.ScrollClickView r8 = r7.a     // Catch: java.lang.NumberFormatException -> L190
            com.beizi.fusion.tool.aj$3 r9 = new com.beizi.fusion.tool.aj$3     // Catch: java.lang.NumberFormatException -> L190
            r9.<init>(r7)     // Catch: java.lang.NumberFormatException -> L190
            r0 = 10
            r8.postDelayed(r9, r0)     // Catch: java.lang.NumberFormatException -> L190
        L190:
            com.beizi.fusion.widget.ScrollClickView r8 = r7.a
            return r8
        L193:
            r8 = 0
            return r8
    }

    protected void a() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enter callBackShakeHappened and mShakeStateListener != null ? "
            r0.append(r1)
            com.beizi.fusion.tool.aj$a r1 = r12.g
            r2 = 1
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.append(r1)
            java.lang.String r1 = ",!isCallBack = "
            r0.append(r1)
            boolean r1 = r12.h
            r1 = r1 ^ r2
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ScrollClickUtil"
            com.beizi.fusion.tool.aa.a(r1, r0)
            com.beizi.fusion.tool.aj$a r0 = r12.g
            if (r0 == 0) goto L54
            boolean r0 = r12.h
            if (r0 != 0) goto L54
            java.lang.String r0 = "callback onShakeHappened()"
            com.beizi.fusion.tool.aa.a(r1, r0)
            com.beizi.fusion.tool.aj$a r3 = r12.g
            java.lang.String r10 = "105"
            java.lang.String r11 = "206"
            java.lang.String r4 = "100"
            java.lang.String r5 = "200"
            java.lang.String r6 = "105"
            java.lang.String r7 = "206"
            java.lang.String r8 = "100"
            java.lang.String r9 = "200"
            r3.b(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.h = r2
            com.beizi.fusion.widget.ScrollClickView r0 = r12.a
            if (r0 == 0) goto L54
            r0.stopAnim()
        L54:
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.beizi.fusion.tool.aj.j = r2
            int r0 = r2.getRandomClickTime()
            r1.a(r0)
            int r2 = r2.getRandomClickNum()
            r1.b(r2)
            return
    }

    public void a(com.beizi.fusion.tool.aj.a r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void a(java.lang.Boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.h = r0
            com.beizi.fusion.widget.ScrollClickView r0 = r1.a
            if (r0 == 0) goto La
            r0.stopAnim()
        La:
            r0 = 0
            r1.g = r0
            r1.d = r0
            r1.a = r0
            r0 = 200(0xc8, float:2.8E-43)
            r1.i = r0
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.f = r1
            r0.c()
            return
    }
}
