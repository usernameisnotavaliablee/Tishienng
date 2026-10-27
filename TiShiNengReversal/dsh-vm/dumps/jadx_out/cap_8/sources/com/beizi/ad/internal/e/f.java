package com.beizi.ad.internal.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {




    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.view.View a(android.content.Context r8, com.beizi.ad.i r9) {
            r0 = 0
            if (r8 == 0) goto L8c
            if (r9 != 0) goto L7
            goto L8c
        L7:
            com.beizi.ad.lance.ApkBean r9 = r9.n()     // Catch: java.lang.Exception -> L8c
            if (r9 != 0) goto Le
            return r0
        Le:
            java.lang.String r3 = r9.getApkName()     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = r9.getAppDeveloper()     // Catch: java.lang.Exception -> L8c
            java.lang.String r2 = r9.getAppVersion()     // Catch: java.lang.Exception -> L8c
            java.lang.String r4 = r9.getAppPermissionsUrl()     // Catch: java.lang.Exception -> L8c
            java.lang.String r5 = r9.getAppPermissionsDesc()     // Catch: java.lang.Exception -> L8c
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L8c
            if (r6 != 0) goto L29
            r5 = r4
        L29:
            java.lang.String r4 = r9.getAppPrivacyUrl()     // Catch: java.lang.Exception -> L8c
            java.lang.String r6 = r9.getAppintro()     // Catch: java.lang.Exception -> L8c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8c
            r9.<init>()     // Catch: java.lang.Exception -> L8c
            java.lang.String r7 = "应用名称："
            r9.append(r7)     // Catch: java.lang.Exception -> L8c
            r9.append(r3)     // Catch: java.lang.Exception -> L8c
            java.lang.String r7 = " | 开发者："
            r9.append(r7)     // Catch: java.lang.Exception -> L8c
            r9.append(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = " | 应用版本："
            r9.append(r1)     // Catch: java.lang.Exception -> L8c
            r9.append(r2)     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = " | <u>权限详情</u> | <u>隐私协议</u> | <u>功能介绍</u>"
            r9.append(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L8c
            android.widget.TextView r7 = new android.widget.TextView     // Catch: java.lang.Exception -> L8c
            r7.<init>(r8)     // Catch: java.lang.Exception -> L8c
            android.text.Spanned r9 = android.text.Html.fromHtml(r9)     // Catch: java.lang.Exception -> L8c
            r7.setText(r9)     // Catch: java.lang.Exception -> L8c
            r9 = 2
            r1 = 1086324736(0x40c00000, float:6.0)
            r7.setTextSize(r9, r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r9 = "#999999"
            int r9 = android.graphics.Color.parseColor(r9)     // Catch: java.lang.Exception -> L8c
            r7.setTextColor(r9)     // Catch: java.lang.Exception -> L8c
            java.lang.String r9 = "#333333"
            int r9 = android.graphics.Color.parseColor(r9)     // Catch: java.lang.Exception -> L8c
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.setShadowLayer(r1, r1, r1, r9)     // Catch: java.lang.Exception -> L8c
            r9 = 10
            r7.setPadding(r9, r9, r9, r9)     // Catch: java.lang.Exception -> L8c
            com.beizi.ad.internal.e.f$3 r1 = new com.beizi.ad.internal.e.f$3     // Catch: java.lang.Exception -> L8c
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L8c
            r7.setOnClickListener(r1)     // Catch: java.lang.Exception -> L8c
            return r7
        L8c:
            return r0
    }

    public static android.widget.FrameLayout a(android.content.Context r1, android.graphics.Bitmap r2, com.beizi.ad.i r3) {
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r0.setScaleType(r1)
            r1 = 0
            r0.setVisibility(r1)
            r0.setImageBitmap(r2)
            android.widget.FrameLayout r1 = a(r0, r3)
            return r1
    }

    public static android.widget.FrameLayout a(android.view.View r8, com.beizi.ad.i r9) {
            int r0 = com.beizi.fusion.R.drawable.button_close_background     // Catch: java.lang.Exception -> Lb6
            java.lang.Object r1 = r8.getTag(r0)     // Catch: java.lang.Exception -> Lb6
            if (r1 == 0) goto L20
            java.lang.Object r1 = r8.getTag(r0)     // Catch: java.lang.Exception -> Lb6
            boolean r1 = r1 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> Lb6
            if (r1 == 0) goto L20
            java.lang.Object r9 = r8.getTag(r0)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9     // Catch: java.lang.Exception -> Lb6
            com.beizi.ad.internal.h.u.a(r9)     // Catch: java.lang.Exception -> Lb6
            java.lang.Object r8 = r8.getTag(r0)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8     // Catch: java.lang.Exception -> Lb6
            return r8
        L20:
            r8.getContext()     // Catch: java.lang.Exception -> Lb6
            com.beizi.ad.internal.h.u.a(r8)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout r1 = new android.widget.FrameLayout     // Catch: java.lang.Exception -> Lb6
            android.content.Context r2 = r8.getContext()     // Catch: java.lang.Exception -> Lb6
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lb6
            r3 = 17
            r4 = -2
            r2.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lb6
            r1.setLayoutParams(r2)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lb6
            r5 = -1
            r2.<init>(r5, r5, r3)     // Catch: java.lang.Exception -> Lb6
            r1.addView(r8, r2)     // Catch: java.lang.Exception -> Lb6
            android.widget.LinearLayout r2 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> Lb6
            android.content.Context r5 = r8.getContext()     // Catch: java.lang.Exception -> Lb6
            r2.<init>(r5)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lb6
            r5.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lb6
            r2.setLayoutParams(r5)     // Catch: java.lang.Exception -> Lb6
            com.beizi.ad.internal.f.c$a r5 = r9.l()     // Catch: java.lang.Exception -> Lb6
            android.content.Context r6 = r8.getContext()     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout r5 = com.beizi.ad.internal.h.u.a(r6, r5)     // Catch: java.lang.Exception -> Lb6
            r6 = 0
            r5.setVisibility(r6)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lb6
            r7.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lb6
            r2.addView(r5, r7)     // Catch: java.lang.Exception -> Lb6
            com.beizi.ad.internal.f.c$a r9 = r9.k()     // Catch: java.lang.Exception -> Lb6
            android.content.Context r5 = r8.getContext()     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout r9 = com.beizi.ad.internal.h.u.b(r5, r9)     // Catch: java.lang.Exception -> Lb6
            r9.setVisibility(r6)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lb6
            r5.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lb6
            r2.addView(r9, r5)     // Catch: java.lang.Exception -> Lb6
            android.view.ViewGroup$LayoutParams r5 = r9.getLayoutParams()     // Catch: java.lang.Exception -> Lb6
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5     // Catch: java.lang.Exception -> Lb6
            r7 = 5
            r5.setMargins(r7, r6, r6, r6)     // Catch: java.lang.Exception -> Lb6
            r5.gravity = r3     // Catch: java.lang.Exception -> Lb6
            r9.setLayoutParams(r5)     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lb6
            r3 = 85
            r9.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lb6
            r1.addView(r2, r9)     // Catch: java.lang.Exception -> Lb6
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()     // Catch: java.lang.Exception -> Lb6
            android.widget.FrameLayout$LayoutParams r9 = (android.widget.FrameLayout.LayoutParams) r9     // Catch: java.lang.Exception -> Lb6
            android.content.Context r3 = r8.getContext()     // Catch: java.lang.Exception -> Lb6
            r4 = 1101004800(0x41a00000, float:20.0)
            int r3 = com.beizi.ad.internal.h.u.a(r3, r4)     // Catch: java.lang.Exception -> Lb6
            r9.setMargins(r6, r6, r3, r3)     // Catch: java.lang.Exception -> Lb6
            r2.setLayoutParams(r9)     // Catch: java.lang.Exception -> Lb6
            r8.setTag(r0, r1)     // Catch: java.lang.Exception -> Lb6
            return r1
        Lb6:
            r8 = 0
            return r8
    }

    public static void a(com.beizi.ad.i r2, android.view.View r3, com.beizi.ad.internal.e.b r4) {
            boolean r0 = a(r2)
            if (r0 == 0) goto L1a
            if (r3 != 0) goto L9
            goto L1a
        L9:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.beizi.ad.internal.e.f$1 r1 = new com.beizi.ad.internal.e.f$1
            r1.<init>(r2, r3, r4)
            r0.post(r1)
        L1a:
            return
    }

    public static void a(com.beizi.ad.i r9, android.view.View r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
            android.content.Context r0 = r10.getContext()     // Catch: java.lang.Exception -> L19
            android.view.View r1 = r10.getRootView()     // Catch: java.lang.Exception -> L19
            if (r1 == 0) goto Le
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Exception -> L19
        Le:
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r2 = r0
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    @java.lang.Deprecated
    public static void a(com.beizi.ad.i r2, android.view.View r3, java.util.List<android.view.View> r4, com.beizi.ad.internal.e.b r5) {
            boolean r0 = a(r2)
            if (r0 == 0) goto L22
            if (r3 == 0) goto L22
            if (r4 == 0) goto L22
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L11
            goto L22
        L11:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.beizi.ad.internal.e.f$2 r1 = new com.beizi.ad.internal.e.f$2
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
        L22:
            return
    }

    static boolean a(com.beizi.ad.i r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.g()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
