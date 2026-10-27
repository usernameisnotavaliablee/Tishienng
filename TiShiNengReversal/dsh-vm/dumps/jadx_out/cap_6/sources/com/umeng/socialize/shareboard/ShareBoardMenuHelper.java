package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class ShareBoardMenuHelper {
    private static java.lang.String TAG = "ShareBoardMenuHelper";
    private com.umeng.socialize.shareboard.ShareBoardConfig mShareBoardConfig;


    static {
            return
    }

    public ShareBoardMenuHelper(com.umeng.socialize.shareboard.ShareBoardConfig r1) {
            r0 = this;
            r0.<init>()
            r0.mShareBoardConfig = r1
            return
    }

    static /* synthetic */ com.umeng.socialize.shareboard.ShareBoardConfig access$000(com.umeng.socialize.shareboard.ShareBoardMenuHelper r0) {
            com.umeng.socialize.shareboard.ShareBoardConfig r0 = r0.mShareBoardConfig
            return r0
    }

    private android.view.View createBtnView(android.content.Context r12, com.umeng.socialize.shareboard.SnsPlatform r13) {
            r11 = this;
            java.lang.String r0 = ""
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r12)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r4 = 0
            r2.<init>(r4, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.weight = r3
            r1.setLayoutParams(r2)
            r2 = 17
            r1.setGravity(r2)
            if (r13 == 0) goto Ldf
            com.umeng.socialize.common.ResContainer r3 = com.umeng.socialize.common.ResContainer.get(r12)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r12)
            java.lang.String r6 = "socialize_share_menu_item"
            int r6 = r3.layout(r6)
            r7 = 0
            android.view.View r5 = r5.inflate(r6, r7)
            java.lang.String r6 = "socialize_image_view"
            int r6 = r3.id(r6)
            android.view.View r6 = r5.findViewById(r6)
            com.umeng.socialize.shareboard.SocializeImageView r6 = (com.umeng.socialize.shareboard.SocializeImageView) r6
            java.lang.String r7 = "socialize_text_view"
            int r3 = r3.id(r7)
            android.view.View r3 = r5.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.umeng.socialize.shareboard.ShareBoardConfig r7 = r11.mShareBoardConfig
            int r8 = r7.mMenuBgColor
            if (r8 == 0) goto L62
            int r9 = r7.mMenuBgShape
            int r10 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_NONE
            if (r9 == r10) goto L62
            int r7 = r7.mMenuBgPressedColor
            r6.setBackgroundColor(r8, r7)
            com.umeng.socialize.shareboard.ShareBoardConfig r7 = r11.mShareBoardConfig
            int r8 = r7.mMenuBgShape
            int r7 = r7.mMenuBgShapeAngle
            r6.setBackgroundShape(r8, r7)
            goto L65
        L62:
            r6.setPadding(r4, r4, r4, r4)
        L65:
            com.umeng.socialize.shareboard.ShareBoardConfig r7 = r11.mShareBoardConfig
            int r7 = r7.mMenuIconPressedColor
            if (r7 == 0) goto L6e
            r6.setPressedColor(r7)
        L6e:
            java.lang.String r7 = r13.mShowWord     // Catch: java.lang.Exception -> L71
            goto L91
        L71:
            r7 = move-exception
            com.umeng.socialize.bean.SHARE_MEDIA r8 = r13.mPlatform
            if (r8 != 0) goto L78
            r8 = r0
            goto L7c
        L78:
            java.lang.String r8 = r8.toString()
        L7c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = com.umeng.socialize.utils.UmengText.SHAREBOARD.NULLNAME
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.umeng.socialize.utils.SLog.error(r8, r7)
            r7 = r0
        L91:
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L9c
            java.lang.String r7 = r13.mShowWord
            r3.setText(r7)
        L9c:
            r3.setGravity(r2)
            java.lang.String r2 = "drawable"
            java.lang.String r7 = r13.mIcon     // Catch: java.lang.Exception -> La8
            int r4 = com.umeng.socialize.common.ResContainer.getResourceId(r12, r2, r7)     // Catch: java.lang.Exception -> La8
            goto Lc6
        La8:
            r12 = move-exception
            com.umeng.socialize.bean.SHARE_MEDIA r2 = r13.mPlatform
            if (r2 != 0) goto Lae
            goto Lb2
        Lae:
            java.lang.String r0 = r2.toString()
        Lb2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = com.umeng.socialize.utils.UmengText.SHAREBOARD.NULLNAME
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.umeng.socialize.utils.SLog.error(r0, r12)
        Lc6:
            if (r4 == 0) goto Lcb
            r6.setImageResource(r4)
        Lcb:
            com.umeng.socialize.shareboard.ShareBoardConfig r12 = r11.mShareBoardConfig
            int r12 = r12.mMenuTextColor
            if (r12 == 0) goto Ld4
            r3.setTextColor(r12)
        Ld4:
            com.umeng.socialize.shareboard.ShareBoardMenuHelper$1 r12 = new com.umeng.socialize.shareboard.ShareBoardMenuHelper$1
            r12.<init>(r11, r13)
            r5.setOnClickListener(r12)
            r1.addView(r5)
        Ldf:
            return r1
    }

    private android.view.View createRowLayout(android.content.Context r6, com.umeng.socialize.shareboard.SnsPlatform[] r7, boolean r8) {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 1
            r0.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            if (r8 == 0) goto L1e
            r8 = 1101004800(0x41a00000, float:20.0)
            int r8 = r5.dip2px(r6, r8)
            r2.topMargin = r8
        L1e:
            r0.setLayoutParams(r2)
        L21:
            int r8 = r7.length
            if (r1 >= r8) goto L30
            r8 = r7[r1]
            android.view.View r8 = r5.createBtnView(r6, r8)
            r0.addView(r8)
            int r1 = r1 + 1
            goto L21
        L30:
            return r0
    }

    private int dip2px(android.content.Context r1, float r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r2 = r2 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r1 = (int) r2
            return r1
    }

    public android.view.View createPageLayout(android.content.Context r7, com.umeng.socialize.shareboard.SnsPlatform[][] r8) {
            r6 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 48
            r0.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r0.setLayoutParams(r2)
            r2 = 0
            r3 = 0
        L1a:
            int r4 = r8.length
            if (r3 >= r4) goto L2e
            r4 = r8[r3]
            if (r3 == 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            android.view.View r4 = r6.createRowLayout(r7, r4, r5)
            r0.addView(r4)
            int r3 = r3 + 1
            goto L1a
        L2e:
            return r0
    }

    public java.util.List<com.umeng.socialize.shareboard.SnsPlatform[][]> formatPageData(java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r14) {
            r13 = this;
            com.umeng.socialize.shareboard.ShareBoardConfig r0 = r13.mShareBoardConfig
            int r0 = r0.mMenuColumnNum
            r1 = 2
            int r0 = r0 * 2
            int r2 = r14.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.umeng.socialize.shareboard.ShareBoardConfig r4 = r13.mShareBoardConfig
            int r4 = r4.mMenuColumnNum
            java.lang.Class<com.umeng.socialize.shareboard.SnsPlatform> r5 = com.umeng.socialize.shareboard.SnsPlatform.class
            r6 = 0
            r7 = 1
            if (r2 >= r4) goto L3e
            int[] r0 = new int[r1]
            r0[r7] = r2
            r0[r6] = r7
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r5, r0)
            com.umeng.socialize.shareboard.SnsPlatform[][] r0 = (com.umeng.socialize.shareboard.SnsPlatform[][]) r0
            r1 = 0
        L27:
            int r2 = r14.size()
            if (r1 >= r2) goto L3a
            r2 = r0[r6]
            java.lang.Object r4 = r14.get(r1)
            com.umeng.socialize.shareboard.SnsPlatform r4 = (com.umeng.socialize.shareboard.SnsPlatform) r4
            r2[r1] = r4
            int r1 = r1 + 1
            goto L27
        L3a:
            r3.add(r0)
            return r3
        L3e:
            int r8 = r2 / r0
            int r0 = r2 % r0
            r9 = -1
            if (r0 == 0) goto L51
            int r10 = r0 / r4
            int r0 = r0 % r4
            if (r0 == 0) goto L4c
            r0 = 1
            goto L4d
        L4c:
            r0 = 0
        L4d:
            int r10 = r10 + r0
            int r8 = r8 + 1
            goto L52
        L51:
            r10 = -1
        L52:
            r0 = 0
        L53:
            if (r0 >= r8) goto L74
            int r4 = r8 + (-1)
            if (r0 != r4) goto L5d
            if (r10 == r9) goto L5d
            r4 = r10
            goto L5e
        L5d:
            r4 = 2
        L5e:
            com.umeng.socialize.shareboard.ShareBoardConfig r11 = r13.mShareBoardConfig
            int r11 = r11.mMenuColumnNum
            int[] r12 = new int[r1]
            r12[r7] = r11
            r12[r6] = r4
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r5, r12)
            com.umeng.socialize.shareboard.SnsPlatform[][] r4 = (com.umeng.socialize.shareboard.SnsPlatform[][]) r4
            r3.add(r4)
            int r0 = r0 + 1
            goto L53
        L74:
            r0 = 0
            r1 = 0
        L76:
            int r4 = r3.size()
            if (r0 >= r4) goto La1
            java.lang.Object r4 = r3.get(r0)
            com.umeng.socialize.shareboard.SnsPlatform[][] r4 = (com.umeng.socialize.shareboard.SnsPlatform[][]) r4
            int r5 = r4.length
            r7 = 0
        L84:
            if (r7 >= r5) goto L9e
            r8 = r4[r7]
            r9 = 0
        L89:
            int r10 = r8.length
            if (r9 >= r10) goto L9b
            if (r1 >= r2) goto L96
            java.lang.Object r10 = r14.get(r1)
            com.umeng.socialize.shareboard.SnsPlatform r10 = (com.umeng.socialize.shareboard.SnsPlatform) r10
            r8[r9] = r10
        L96:
            int r1 = r1 + 1
            int r9 = r9 + 1
            goto L89
        L9b:
            int r7 = r7 + 1
            goto L84
        L9e:
            int r0 = r0 + 1
            goto L76
        La1:
            return r3
    }
}
