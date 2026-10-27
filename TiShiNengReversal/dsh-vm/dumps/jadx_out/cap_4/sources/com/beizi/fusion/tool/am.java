package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class am {
    public am() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.graphics.drawable.Drawable a(java.lang.String r3, int r4, java.lang.String r5, int r6) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            r0.setShape(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r2 = "#"
            if (r1 != 0) goto L1f
            boolean r1 = r3.startsWith(r2)
            if (r1 == 0) goto L1f
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setColor(r3)
            goto L28
        L1f:
            java.lang.String r3 = "#00000000"
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setColor(r3)
        L28:
            if (r6 <= 0) goto L2e
            float r3 = (float) r6
            r0.setCornerRadius(r3)
        L2e:
            if (r4 <= 0) goto L43
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L43
            boolean r3 = r5.startsWith(r2)
            if (r3 == 0) goto L43
            int r3 = android.graphics.Color.parseColor(r5)
            r0.setStroke(r4, r3)
        L43:
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.view.View r0, java.lang.String r1, int r2, java.lang.String r3, int r4) {
            android.graphics.drawable.Drawable r1 = a(r1, r2, r3, r4)
            r0.setBackground(r1)
            return
    }
}
