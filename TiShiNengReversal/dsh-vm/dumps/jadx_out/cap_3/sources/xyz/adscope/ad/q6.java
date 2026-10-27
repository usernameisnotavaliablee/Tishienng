package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class q6 {
    public q6() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.lang.String r1, int r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1a
            boolean r0 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r1)
            if (r0 == 0) goto L15
            float r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r1)
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = (int) r2
            return r1
        L15:
            int r1 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    private static android.graphics.drawable.Drawable a(android.content.Context r3, java.lang.String r4, int r5, java.lang.String r6, int r7) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            r0.setShape(r1)
            boolean r2 = xyz.adscope.common.v2.tool.str.StringUtil.isValidColor(r4)
            if (r2 == 0) goto L17
            int r4 = android.graphics.Color.parseColor(r4)
            r0.setColor(r4)
            goto L1a
        L17:
            r0.setColor(r1)
        L1a:
            if (r7 <= 0) goto L25
            float r4 = (float) r7
            int r4 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r3, r4)
            float r4 = (float) r4
            r0.setCornerRadius(r4)
        L25:
            if (r5 <= 0) goto L39
            boolean r4 = xyz.adscope.common.v2.tool.str.StringUtil.isValidColor(r6)
            if (r4 == 0) goto L39
            float r4 = (float) r5
            int r3 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r3, r4)
            int r4 = android.graphics.Color.parseColor(r6)
            r0.setStroke(r3, r4)
        L39:
            return r0
    }

    public static void a(android.content.Context r0, android.view.View r1, java.lang.String r2, int r3, java.lang.String r4, int r5) {
            android.graphics.drawable.Drawable r0 = a(r0, r2, r3, r4, r5)
            r1.setBackground(r0)
            return
    }
}
