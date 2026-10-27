package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ag {
    private static java.lang.String d;
    private static java.lang.String e;
    private static java.lang.String f;
    private static java.lang.String g;
    private android.content.Context a;
    private com.beizi.fusion.tool.ag.a b;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean c;
    private java.lang.Boolean h;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8);
    }

    public ag(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.a = r2
            return
    }

    @androidx.annotation.NonNull
    private android.view.ViewGroup.MarginLayoutParams a(int r11, int r12, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r13) {
            r10 = this;
            java.lang.String r0 = r13.getCenterX()
            java.lang.String r1 = r13.getCenterY()
            java.lang.String r2 = r13.getWidth()
            java.lang.String r13 = r13.getHeight()
            android.content.Context r3 = r10.a
            float r3 = com.beizi.fusion.tool.ap.j(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "0"
            if (r4 != 0) goto L24
            boolean r4 = r5.equals(r0)
            if (r4 == 0) goto L26
        L24:
            java.lang.String r0 = "50%"
        L26:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r6 = ",adHeightDp = "
            java.lang.String r7 = "BeiZis"
            if (r4 != 0) goto L36
            boolean r4 = r5.equals(r1)
            if (r4 == 0) goto L5a
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "screenHeightDp = "
            r1.append(r4)
            r1.append(r3)
            r1.append(r6)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.beizi.fusion.tool.aa.a(r7, r1)
            float r1 = (float) r12
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L58
            java.lang.String r1 = "63"
            goto L5a
        L58:
            java.lang.String r1 = "188"
        L5a:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L66
            boolean r3 = r5.equals(r2)
            if (r3 == 0) goto L68
        L66:
            java.lang.String r2 = "325"
        L68:
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            if (r3 != 0) goto L74
            boolean r3 = r5.equals(r13)
            if (r3 == 0) goto L76
        L74:
            java.lang.String r13 = "65"
        L76:
            android.content.Context r3 = r10.a
            float r3 = com.beizi.fusion.tool.ap.i(r3)
            java.lang.String r4 = "%"
            boolean r5 = r0.endsWith(r4)
            r8 = 0
            if (r5 == 0) goto L96
            int r5 = r0.indexOf(r4)
            java.lang.String r0 = r0.substring(r8, r5)
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 * r11
            int r0 = r0 / 100
            goto L9a
        L96:
            int r0 = java.lang.Integer.parseInt(r0)
        L9a:
            boolean r5 = r1.endsWith(r4)
            if (r5 == 0) goto Lb1
            int r5 = r1.indexOf(r4)
            java.lang.String r1 = r1.substring(r8, r5)
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * r12
            int r1 = r1 / 100
            goto Ld3
        Lb1:
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r12 - r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "adHeightDp = "
            r5.append(r9)
            r5.append(r12)
            java.lang.String r9 = ", centerYInt = "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.beizi.fusion.tool.aa.a(r7, r5)
        Ld3:
            boolean r5 = r2.endsWith(r4)
            r9 = 400(0x190, float:5.6E-43)
            if (r5 == 0) goto Lf9
            int r5 = r2.indexOf(r4)
            java.lang.String r2 = r2.substring(r8, r5)
            int r2 = java.lang.Integer.parseInt(r2)
            r5 = 1137180672(0x43c80000, float:400.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto Lf2
            int r2 = r2 * 400
            int r2 = r2 / 100
            goto L100
        Lf2:
            int r3 = (int) r3
            int r3 = r3 * r2
            int r3 = r3 / 100
            r9 = r3
            goto L101
        Lf9:
            int r2 = java.lang.Integer.parseInt(r2)
            if (r2 < r9) goto L100
            goto L101
        L100:
            r9 = r2
        L101:
            boolean r2 = r13.endsWith(r4)
            if (r2 == 0) goto L118
            int r2 = r13.indexOf(r4)
            java.lang.String r13 = r13.substring(r8, r2)
            int r13 = java.lang.Integer.parseInt(r13)
            int r13 = r13 * r9
            int r13 = r13 / 100
            goto L11c
        L118:
            int r13 = java.lang.Integer.parseInt(r13)
        L11c:
            android.content.Context r2 = r10.a
            float r3 = (float) r9
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)
            android.content.Context r3 = r10.a
            float r13 = (float) r13
            int r13 = com.beizi.fusion.tool.ap.a(r3, r13)
            android.content.Context r3 = r10.a
            float r0 = (float) r0
            int r0 = com.beizi.fusion.tool.ap.a(r3, r0)
            android.content.Context r3 = r10.a
            float r1 = (float) r1
            int r1 = com.beizi.fusion.tool.ap.a(r3, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "widthInt = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ",heightInt = "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            com.beizi.fusion.tool.aa.a(r7, r3)
            android.view.ViewGroup$MarginLayoutParams r3 = new android.view.ViewGroup$MarginLayoutParams
            r3.<init>(r2, r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "centerYInt = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ",centerXInt = "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ",adWidthDp = "
            r4.append(r5)
            r4.append(r11)
            r4.append(r6)
            r4.append(r12)
            java.lang.String r11 = r4.toString()
            com.beizi.fusion.tool.aa.a(r7, r11)
            int r13 = r13 / 2
            int r1 = r1 - r13
            r3.topMargin = r1
            int r2 = r2 / 2
            int r0 = r0 - r2
            r3.leftMargin = r0
            return r3
    }

    static /* synthetic */ com.beizi.fusion.tool.ag.a a(com.beizi.fusion.tool.ag r0) {
            com.beizi.fusion.tool.ag$a r0 = r0.b
            return r0
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            com.beizi.fusion.tool.ag.d = r0
            return r0
    }

    static /* synthetic */ java.lang.String b() {
            java.lang.String r0 = com.beizi.fusion.tool.ag.d
            return r0
    }

    static /* synthetic */ java.lang.String b(java.lang.String r0) {
            com.beizi.fusion.tool.ag.e = r0
            return r0
    }

    static /* synthetic */ java.lang.String c() {
            java.lang.String r0 = com.beizi.fusion.tool.ag.e
            return r0
    }

    static /* synthetic */ java.lang.String c(java.lang.String r0) {
            com.beizi.fusion.tool.ag.f = r0
            return r0
    }

    static /* synthetic */ java.lang.String d() {
            java.lang.String r0 = com.beizi.fusion.tool.ag.f
            return r0
    }

    static /* synthetic */ java.lang.String d(java.lang.String r0) {
            com.beizi.fusion.tool.ag.g = r0
            return r0
    }

    static /* synthetic */ java.lang.String e() {
            java.lang.String r0 = com.beizi.fusion.tool.ag.g
            return r0
    }

    public android.view.View a(int r3, int r4, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r5, boolean r6) {
            r2 = this;
            android.content.Context r0 = r2.a
            if (r0 == 0) goto L54
            if (r5 != 0) goto L7
            goto L54
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "adWidthDp = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ",adHeightDp = "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            com.beizi.fusion.widget.RegionClickView r0 = new com.beizi.fusion.widget.RegionClickView
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r1 = r2.c
            if (r1 == 0) goto L3a
            java.lang.Boolean r1 = r2.h
            r0.setDownloadApp(r1)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r1 = r2.c
            r0.setRegionalClickViewBean(r1)
        L3a:
            android.view.ViewGroup$MarginLayoutParams r3 = r2.a(r3, r4, r5)
            r0.setLayoutParams(r3)
            if (r6 == 0) goto L53
            com.beizi.fusion.tool.ag$1 r3 = new com.beizi.fusion.tool.ag$1
            r3.<init>(r2)
            r0.setOnClickListener(r3)
            com.beizi.fusion.tool.ag$2 r3 = new com.beizi.fusion.tool.ag$2
            r3.<init>(r2)
            r0.setOnTouchListener(r3)
        L53:
            return r0
        L54:
            r3 = 0
            return r3
    }

    public void a() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.c = r0
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(com.beizi.fusion.tool.ag.a r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void a(java.lang.Boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
