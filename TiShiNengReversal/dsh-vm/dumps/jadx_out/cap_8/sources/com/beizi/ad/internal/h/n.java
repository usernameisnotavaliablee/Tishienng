package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {
    public n() {
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

    private static android.graphics.drawable.Drawable a(java.lang.String r6, int r7, java.lang.String r8, float[] r9) {
            int r0 = r9.length
            float[] r0 = new float[r0]
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r2 = 0
            r1.setShape(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r4 = "#"
            if (r3 != 0) goto L22
            boolean r3 = r6.startsWith(r4)
            if (r3 == 0) goto L22
            int r6 = android.graphics.Color.parseColor(r6)
            r1.setColor(r6)
            goto L2b
        L22:
            java.lang.String r6 = "#00000000"
            int r6 = android.graphics.Color.parseColor(r6)
            r1.setColor(r6)
        L2b:
            int r6 = r9.length
            if (r2 >= r6) goto L3d
            r6 = r9[r2]
            r3 = 0
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 < 0) goto L38
            r0[r2] = r6
            goto L3a
        L38:
            r0[r2] = r3
        L3a:
            int r2 = r2 + 1
            goto L2b
        L3d:
            r1.setCornerRadii(r0)
            if (r7 <= 0) goto L55
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 != 0) goto L55
            boolean r6 = r8.startsWith(r4)
            if (r6 == 0) goto L55
            int r6 = android.graphics.Color.parseColor(r8)
            r1.setStroke(r7, r6)
        L55:
            return r1
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.view.View r0, java.lang.String r1, int r2, java.lang.String r3, int r4) {
            android.graphics.drawable.Drawable r1 = a(r1, r2, r3, r4)
            r0.setBackground(r1)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.view.View r0, java.lang.String r1, int r2, java.lang.String r3, float[] r4) {
            android.graphics.drawable.Drawable r1 = a(r1, r2, r3, r4)
            r0.setBackground(r1)
            return
    }
}
