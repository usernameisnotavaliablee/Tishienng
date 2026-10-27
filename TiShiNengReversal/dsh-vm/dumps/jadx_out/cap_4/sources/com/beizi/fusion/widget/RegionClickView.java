package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RegionClickView extends android.widget.LinearLayout {
    android.graphics.drawable.GradientDrawable a;
    android.widget.TextView b;
    private boolean c;
    private java.lang.Boolean d;

    public RegionClickView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.c = r0
            r1.init(r2)
            return
    }

    public RegionClickView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.c = r2
            r0.init(r1)
            return
    }

    public RegionClickView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.c = r2
            r0.init(r1)
            return
    }

    private void a(android.content.Context r3, int r4) {
            r2 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r2.a = r0
            java.lang.String r1 = "#80000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            r0 = 1
            if (r4 != r0) goto L1e
            android.graphics.drawable.GradientDrawable r4 = r2.a
            java.lang.String r1 = "#E8E8E8"
            int r1 = android.graphics.Color.parseColor(r1)
            r4.setStroke(r0, r1)
        L1e:
            android.graphics.drawable.GradientDrawable r4 = r2.a
            r0 = 1106247680(0x41f00000, float:30.0)
            int r3 = com.beizi.fusion.tool.ap.a(r3, r0)
            float r3 = (float) r3
            r4.setCornerRadius(r3)
            android.graphics.drawable.GradientDrawable r3 = r2.a
            r2.setBackgroundDrawable(r3)
            return
    }

    public void init(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.c = r0
            r3.a(r4, r0)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r4)
            r3.b = r1
            r1.setLines(r0)
            android.widget.TextView r4 = r3.b
            r1 = 2
            r2 = 1099956224(0x41900000, float:18.0)
            r4.setTextSize(r1, r2)
            android.widget.TextView r4 = r3.b
            java.lang.String r1 = "#949494"
            int r1 = android.graphics.Color.parseColor(r1)
            r4.setTextColor(r1)
            android.widget.TextView r4 = r3.b
            java.lang.String r1 = "点击跳转详情页或第三方应用     >"
            r4.setText(r1)
            android.widget.TextView r4 = r3.b
            r1 = 17
            r4.setGravity(r1)
            r3.setGravity(r1)
            r3.setOrientation(r0)
            android.widget.TextView r4 = r3.b
            r3.addView(r4)
            return
    }

    public void setBackGroundAlpha(double r5) {
            r4 = this;
            android.graphics.drawable.GradientDrawable r0 = r4.a
            if (r0 == 0) goto L15
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L15
            r1 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r5 = r5 * r1
            int r5 = (int) r5
            r0.setAlpha(r5)
        L15:
            return
    }

    public void setBackgroundColor(java.lang.String r2) {
            r1 = this;
            android.graphics.drawable.GradientDrawable r0 = r1.a
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> Ld
            r0.setColor(r2)     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    public void setDownloadApp(java.lang.Boolean r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setRegionalClickViewBean(com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.Boolean r0 = r2.d
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L10
            java.lang.String r0 = r3.getTitle()
            goto L1c
        L10:
            java.lang.String r0 = r3.getDownloadTitle()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1c
            java.lang.String r0 = "点击下载应用"
        L1c:
            r2.setTitle(r0)
            java.lang.String r0 = r3.getTitleColor()
            r2.setTitleColor(r0)
            double r0 = r3.getBackgroundAlpha()
            r2.setBackGroundAlpha(r0)
            java.lang.String r3 = r3.getBackgroundColor()
            r2.setBackgroundColor(r3)
            return
    }

    public void setTitle(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.b
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.setText(r2)     // Catch: java.lang.Exception -> L9
        L9:
            return
    }

    public void setTitleColor(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.b
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> Ld
            r0.setTextColor(r2)     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }
}
