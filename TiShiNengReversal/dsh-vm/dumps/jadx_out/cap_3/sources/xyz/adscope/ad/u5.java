package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class u5 extends xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c implements xyz.adscope.ad.u2 {
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel h;
    private java.lang.String i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends xyz.adscope.common.v2.tool.str.StringUtil.StringStyleBean {
        private final java.lang.String a;
        final /* synthetic */ xyz.adscope.ad.u5 b;

        public a(xyz.adscope.ad.u5 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2, r3)
                r0.a = r4
                return
        }

        @Override // xyz.adscope.common.v2.tool.str.StringUtil.StringStyleBean, android.text.style.ClickableSpan
        public void onClick(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                xyz.adscope.ad.u5 r2 = r1.b
                java.lang.String r0 = r1.a
                xyz.adscope.ad.u5.a(r2, r0)
                return
        }
    }

    public u5(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.i = r1
            return
    }

    static /* synthetic */ java.lang.String a(xyz.adscope.ad.u5 r0, java.lang.String r1) {
            r0.i = r1
            return r1
    }

    private void f() {
            r9 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = r9.h
            if (r0 == 0) goto L91
            boolean r0 = r0.m()
            if (r0 == 0) goto L91
            xyz.adscope.ad.u5$a r0 = new xyz.adscope.ad.u5$a
            java.lang.String r1 = "permission"
            java.lang.String r2 = "权限详情"
            java.lang.String r3 = "#02cbf7"
            r0.<init>(r9, r2, r3, r1)
            xyz.adscope.ad.u5$a r1 = new xyz.adscope.ad.u5$a
            java.lang.String r4 = "privacy"
            java.lang.String r5 = "隐私协议"
            r1.<init>(r9, r5, r3, r4)
            xyz.adscope.ad.u5$a r4 = new xyz.adscope.ad.u5$a
            java.lang.String r6 = "introduction"
            java.lang.String r7 = "功能介绍"
            r4.<init>(r9, r7, r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "应用名称: "
            r3.append(r6)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r6 = r9.h
            java.lang.String r6 = r6.f()
            r3.append(r6)
            java.lang.String r6 = " | "
            r3.append(r6)
            java.lang.String r8 = "开发者: "
            r3.append(r8)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r8 = r9.h
            java.lang.String r8 = r8.d()
            r3.append(r8)
            r3.append(r6)
            java.lang.String r8 = "应用版本: "
            r3.append(r8)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r8 = r9.h
            java.lang.String r8 = r8.l()
            r3.append(r8)
            r3.append(r6)
            r3.append(r2)
            r3.append(r6)
            r3.append(r5)
            r3.append(r6)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            r3 = 3
            xyz.adscope.common.v2.tool.str.StringUtil$StringStyleBean[] r3 = new xyz.adscope.common.v2.tool.str.StringUtil.StringStyleBean[r3]
            r5 = 0
            r3[r5] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r4
            android.text.SpannableString r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseSpannableString(r2, r3)
            r9.setHighlightColor(r5)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r9.setMovementMethod(r1)
            r9.setText(r0)
        L91:
            return
    }

    @Override // xyz.adscope.ad.i6, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r1) {
            r0 = this;
            r0.f()
            super.a(r1)
            return
    }

    @Override // xyz.adscope.ad.u2
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void e() {
            r1 = this;
            r0 = 0
            r1.i = r0
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c, xyz.adscope.ad.j3
    public java.lang.String getActionType() {
            r1 = this;
            java.lang.String r0 = "downloadInfo"
            return r0
    }

    @Override // xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c, xyz.adscope.ad.j3
    public java.lang.String getInteractionType() {
            r1 = this;
            java.lang.String r0 = "click"
            return r0
    }

    public java.lang.String getWhereDetailActivityTab() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }
}
