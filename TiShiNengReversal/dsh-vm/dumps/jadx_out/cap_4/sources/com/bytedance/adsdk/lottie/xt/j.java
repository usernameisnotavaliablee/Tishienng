package com.bytedance.adsdk.lottie.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private final java.util.Map<java.lang.String, android.graphics.Typeface> cw;
    private final com.bytedance.adsdk.lottie.model.ae<java.lang.String> j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f1905m;

    /* renamed from: r, reason: collision with root package name */
    private final android.content.res.AssetManager f1906r;
    private com.bytedance.adsdk.lottie.cw up;
    private final java.util.Map<com.bytedance.adsdk.lottie.model.ae<java.lang.String>, android.graphics.Typeface> xt;

    public j(android.graphics.drawable.Drawable.Callback r2, com.bytedance.adsdk.lottie.cw r3) {
            r1 = this;
            r1.<init>()
            com.bytedance.adsdk.lottie.model.ae r0 = new com.bytedance.adsdk.lottie.model.ae
            r0.<init>()
            r1.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.xt = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cw = r0
            java.lang.String r0 = ".ttf"
            r1.f1905m = r0
            r1.up = r3
            boolean r3 = r2 instanceof android.view.View
            if (r3 != 0) goto L2b
            java.lang.String r2 = "LottieDrawable must be inside of a view for images to work."
            com.bytedance.adsdk.lottie.up.up.xt(r2)
            r2 = 0
            r1.f1906r = r2
            return
        L2b:
            android.view.View r2 = (android.view.View) r2
            android.content.Context r2 = r2.getContext()
            android.content.res.AssetManager r2 = r2.getAssets()
            r1.f1906r = r2
            return
    }

    private android.graphics.Typeface j(android.graphics.Typeface r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "Italic"
            boolean r0 = r4.contains(r0)
            java.lang.String r1 = "Bold"
            boolean r4 = r4.contains(r1)
            if (r0 == 0) goto L12
            if (r4 == 0) goto L12
            r4 = 3
            goto L1b
        L12:
            if (r0 == 0) goto L16
            r4 = 2
            goto L1b
        L16:
            if (r4 == 0) goto L1a
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            int r0 = r3.getStyle()
            if (r0 != r4) goto L22
            return r3
        L22:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r4)
            return r3
    }

    private android.graphics.Typeface xt(com.bytedance.adsdk.lottie.model.cw r6) {
            r5 = this;
            java.lang.String r0 = r6.j()
            java.util.Map<java.lang.String, android.graphics.Typeface> r1 = r5.cw
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto Lf
            return r1
        Lf:
            java.lang.String r1 = r6.cw()
            java.lang.String r2 = r6.xt()
            com.bytedance.adsdk.lottie.cw r3 = r5.up
            if (r3 == 0) goto L28
            android.graphics.Typeface r3 = r3.j(r0, r1, r2)
            if (r3 != 0) goto L29
            com.bytedance.adsdk.lottie.cw r3 = r5.up
            android.graphics.Typeface r3 = r3.j(r0)
            goto L29
        L28:
            r3 = 0
        L29:
            com.bytedance.adsdk.lottie.cw r4 = r5.up
            if (r4 == 0) goto L46
            if (r3 != 0) goto L46
            java.lang.String r1 = r4.xt(r0, r1, r2)
            if (r1 != 0) goto L3b
            com.bytedance.adsdk.lottie.cw r1 = r5.up
            java.lang.String r1 = r1.xt(r0)
        L3b:
            if (r1 == 0) goto L46
            android.content.res.AssetManager r2 = r5.f1906r     // Catch: java.lang.Throwable -> L44
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
        L46:
            android.graphics.Typeface r1 = r6.r()
            if (r1 == 0) goto L51
            android.graphics.Typeface r6 = r6.r()
            return r6
        L51:
            if (r3 != 0) goto L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "fonts/"
            r6.<init>(r1)
            r6.append(r0)
            java.lang.String r1 = r5.f1905m
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            android.content.res.AssetManager r1 = r5.f1906r     // Catch: java.lang.Throwable -> L6d
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r1, r6)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
        L6f:
            java.util.Map<java.lang.String, android.graphics.Typeface> r6 = r5.cw
            r6.put(r0, r3)
            return r3
    }

    public android.graphics.Typeface j(com.bytedance.adsdk.lottie.model.cw r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.model.ae<java.lang.String> r0 = r3.j
            java.lang.String r1 = r4.j()
            java.lang.String r2 = r4.cw()
            r0.j(r1, r2)
            java.util.Map<com.bytedance.adsdk.lottie.model.ae<java.lang.String>, android.graphics.Typeface> r0 = r3.xt
            com.bytedance.adsdk.lottie.model.ae<java.lang.String> r1 = r3.j
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.graphics.Typeface r0 = r3.xt(r4)
            java.lang.String r4 = r4.cw()
            android.graphics.Typeface r4 = r3.j(r0, r4)
            java.util.Map<com.bytedance.adsdk.lottie.model.ae<java.lang.String>, android.graphics.Typeface> r0 = r3.xt
            com.bytedance.adsdk.lottie.model.ae<java.lang.String> r1 = r3.j
            r0.put(r1, r4)
            return r4
    }

    public void j(com.bytedance.adsdk.lottie.cw r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.f1905m = r1
            return
    }
}
