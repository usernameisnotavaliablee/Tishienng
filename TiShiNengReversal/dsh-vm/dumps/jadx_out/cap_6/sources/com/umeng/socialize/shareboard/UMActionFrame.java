package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class UMActionFrame extends android.widget.LinearLayout {
    private com.umeng.socialize.shareboard.ShareBoardConfig mConfig;
    private android.widget.PopupWindow.OnDismissListener mDismissListener;





    public UMActionFrame(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public UMActionFrame(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @android.annotation.TargetApi(11)
    public UMActionFrame(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @android.annotation.TargetApi(21)
    public UMActionFrame(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ android.widget.PopupWindow.OnDismissListener access$000(com.umeng.socialize.shareboard.UMActionFrame r0) {
            android.widget.PopupWindow$OnDismissListener r0 = r0.mDismissListener
            return r0
    }

    private android.view.View createShareTitle() {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r4.mConfig
            java.lang.String r1 = r1.mTitleText
            r0.setText(r1)
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r4.mConfig
            int r1 = r1.mTitleTextColor
            r0.setTextColor(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1
            r0.setMaxLines(r1)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r2 = 1101004800(0x41a00000, float:20.0)
            int r2 = r4.dip2px(r2)
            r1.topMargin = r2
            r0.setLayoutParams(r1)
            return r0
    }

    private android.view.View createShareboardLayout(java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r8) {
            r7 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r7.mConfig
            int r1 = r1.mShareboardBgColor
            r0.setBackgroundColor(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            com.umeng.socialize.shareboard.ShareBoardConfig r2 = r7.mConfig
            int r3 = r2.mShareboardPosition
            int r4 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_CENTER
            if (r3 != r4) goto L25
            int r2 = r2.mTopMargin
            if (r2 == 0) goto L25
            r1.topMargin = r2
        L25:
            r2 = 1
            r0.setOrientation(r2)
            r0.setLayoutParams(r1)
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r7.mConfig
            boolean r1 = r1.mTitleVisibility
            if (r1 == 0) goto L39
            android.view.View r1 = r7.createShareTitle()
            r0.addView(r1)
        L39:
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r7.mConfig
            int r2 = r8.size()
            int r1 = r1.calculateMenuHeightInDp(r2)
            androidx.viewpager.widget.ViewPager r2 = r7.createViewPagerInstance()
            r3 = 0
            if (r2 == 0) goto L8a
            com.umeng.socialize.shareboard.SocializeMenuPagerAdapter r4 = new com.umeng.socialize.shareboard.SocializeMenuPagerAdapter
            android.content.Context r5 = r7.getContext()
            com.umeng.socialize.shareboard.ShareBoardConfig r6 = r7.mConfig
            r4.<init>(r5, r6)
            r4.setData(r8)
            r7.settingMenuLayout(r2, r1)
            r0.addView(r2)
            r2.setAdapter(r4)
            com.umeng.socialize.shareboard.ShareBoardConfig r8 = r7.mConfig
            boolean r8 = r8.mIndicatorVisibility
            if (r8 == 0) goto L6b
            com.umeng.socialize.shareboard.IndicatorView r3 = r7.createIndicatorView()
        L6b:
            if (r3 == 0) goto L77
            int r8 = r4.getCount()
            r3.setPageCount(r8)
            r0.addView(r3)
        L77:
            com.umeng.socialize.shareboard.UMActionFrame$2 r8 = new com.umeng.socialize.shareboard.UMActionFrame$2
            r8.<init>(r7, r3)
            boolean r1 = r7.verifyMethodExists()
            if (r1 == 0) goto L86
            r2.addOnPageChangeListener(r8)
            goto Lc6
        L86:
            r2.setOnPageChangeListener(r8)
            goto Lc6
        L8a:
            com.umeng.socialize.shareboard.widgets.SocializeViewPager r2 = r7.createSocializeViewPagerInstance()
            if (r2 != 0) goto L91
            return r3
        L91:
            com.umeng.socialize.shareboard.SocializeMenuAdapter r4 = new com.umeng.socialize.shareboard.SocializeMenuAdapter
            android.content.Context r5 = r7.getContext()
            com.umeng.socialize.shareboard.ShareBoardConfig r6 = r7.mConfig
            r4.<init>(r5, r6)
            r4.setData(r8)
            r7.settingMenuLayout(r2, r1)
            r0.addView(r2)
            r2.setAdapter(r4)
            com.umeng.socialize.shareboard.ShareBoardConfig r8 = r7.mConfig
            boolean r8 = r8.mIndicatorVisibility
            if (r8 == 0) goto Lb2
            com.umeng.socialize.shareboard.IndicatorView r3 = r7.createIndicatorView()
        Lb2:
            if (r3 == 0) goto Lbe
            int r8 = r4.getCount()
            r3.setPageCount(r8)
            r0.addView(r3)
        Lbe:
            com.umeng.socialize.shareboard.UMActionFrame$3 r8 = new com.umeng.socialize.shareboard.UMActionFrame$3
            r8.<init>(r7, r3)
            r2.addOnPageChangeListener(r8)
        Lc6:
            com.umeng.socialize.shareboard.ShareBoardConfig r8 = r7.mConfig
            boolean r8 = r8.mCancelBtnVisibility
            if (r8 == 0) goto Ld3
            android.view.View r8 = r7.createCancelBtn()
            r0.addView(r8)
        Ld3:
            return r0
    }

    private com.umeng.socialize.shareboard.widgets.SocializeViewPager createSocializeViewPagerInstance() {
            r5 = this;
            java.lang.String r0 = "com.umeng.socialize.shareboard.widgets.SocializeViewPager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L21
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L21
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L21
            android.content.Context r2 = r5.getContext()     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L21
            r1[r4] = r2     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L21
            com.umeng.socialize.shareboard.widgets.SocializeViewPager r0 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager) r0     // Catch: java.lang.Exception -> L21
            return r0
        L21:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.SHAREBOARD.NULLJAR
            com.umeng.socialize.utils.SLog.error(r1, r0)
            r0 = 0
            return r0
    }

    private androidx.viewpager.widget.ViewPager createViewPagerInstance() {
            r5 = this;
            java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L21
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L21
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L21
            android.content.Context r2 = r5.getContext()     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L21
            r1[r4] = r2     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L21
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0     // Catch: java.lang.Exception -> L21
            return r0
        L21:
            r0 = move-exception
            com.umeng.socialize.utils.SLog.error(r0)
            r0 = 0
            return r0
    }

    private int dip2px(float r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    private android.graphics.drawable.StateListDrawable getBtnBg() {
            r4 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r4.mConfig
            int r1 = r1.mCancelBtnBgColor
            r0.<init>(r1)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            com.umeng.socialize.shareboard.ShareBoardConfig r2 = r4.mConfig
            int r2 = r2.mCancelBtnBgPressedColor
            r1.<init>(r2)
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r3 = new int[]{r3}
            r2.addState(r3, r1)
            r1 = 0
            int[] r1 = new int[r1]
            r2.addState(r1, r0)
            return r2
    }

    private void init(java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r5) {
            r4 = this;
            r0 = 50
            r1 = 0
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            r4.setBackgroundColor(r0)
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r3)
            r2 = 100
            r0.setDuration(r2)
            r4.setAnimation(r0)
            r0 = 1
            r4.setOrientation(r0)
            com.umeng.socialize.shareboard.ShareBoardConfig r2 = r4.mConfig
            int r2 = r2.mShareboardPosition
            int r3 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM
            if (r2 != r3) goto L2c
            r1 = 80
            r4.setGravity(r1)
            goto L3e
        L2c:
            int r3 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_CENTER
            if (r2 != r3) goto L3e
            r2 = 17
            r4.setGravity(r2)
            r2 = 1108344832(0x42100000, float:36.0)
            int r2 = r4.dip2px(r2)
            r4.setPadding(r2, r1, r2, r1)
        L3e:
            com.umeng.socialize.shareboard.UMActionFrame$1 r1 = new com.umeng.socialize.shareboard.UMActionFrame$1
            r1.<init>(r4)
            r4.setOnClickListener(r1)
            android.view.View r5 = r4.createShareboardLayout(r5)
            if (r5 != 0) goto L4d
            return
        L4d:
            r5.setClickable(r0)
            r4.addView(r5)
            return
    }

    private void settingMenuLayout(android.view.View r4, int r5) {
            r3 = this;
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = r3.dip2px(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            float r5 = (float) r5
            int r5 = r3.dip2px(r5)
            r2 = -1
            r1.<init>(r2, r5)
            r1.topMargin = r0
            r5 = 1092616192(0x41200000, float:10.0)
            int r5 = r3.dip2px(r5)
            r1.rightMargin = r5
            r1.leftMargin = r5
            r4.setLayoutParams(r1)
            r5 = 0
            r4.setPadding(r5, r5, r5, r0)
            return
    }

    private boolean verifyMethodExists() {
            r6 = this;
            r0 = 0
            java.lang.String r1 = "androidx.viewpager.widget.ViewPager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "addOnPageChangeListener"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L17
            java.lang.Class<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r5 = androidx.viewpager.widget.ViewPager.OnPageChangeListener.class
            r4[r0] = r5     // Catch: java.lang.Exception -> L17
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L17
            if (r1 == 0) goto L1b
            return r3
        L17:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
        L1b:
            return r0
    }

    public android.view.View createCancelBtn() {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r4.mConfig
            java.lang.String r1 = r1.mCancelBtnText
            r0.setText(r1)
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r4.mConfig
            int r1 = r1.mCancelBtnColor
            r0.setTextColor(r1)
            r1 = 1
            r0.setClickable(r1)
            r1 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r1)
            r1 = 17
            r0.setGravity(r1)
            com.umeng.socialize.shareboard.ShareBoardConfig r1 = r4.mConfig
            int r2 = r1.mCancelBtnBgPressedColor
            if (r2 == 0) goto L33
            android.graphics.drawable.StateListDrawable r1 = r4.getBtnBg()
            r0.setBackground(r1)
            goto L38
        L33:
            int r1 = r1.mCancelBtnBgColor
            r0.setBackgroundColor(r1)
        L38:
            com.umeng.socialize.shareboard.UMActionFrame$4 r1 = new com.umeng.socialize.shareboard.UMActionFrame$4
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            r1 = 1112014848(0x42480000, float:50.0)
            int r1 = r4.dip2px(r1)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r1)
            r0.setLayoutParams(r2)
            return r0
    }

    public com.umeng.socialize.shareboard.IndicatorView createIndicatorView() {
            r5 = this;
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = r5.dip2px(r0)
            com.umeng.socialize.shareboard.IndicatorView r1 = new com.umeng.socialize.shareboard.IndicatorView
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r2.bottomMargin = r0
            r1.setLayoutParams(r2)
            com.umeng.socialize.shareboard.ShareBoardConfig r0 = r5.mConfig
            int r2 = r0.mIndicatorNormalColor
            int r0 = r0.mIndicatorSelectedColor
            r1.setIndicatorColor(r2, r0)
            r0 = 3
            r2 = 5
            r1.setIndicator(r0, r2)
            return r1
    }

    void setDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mDismissListener = r1
            return
    }

    public void setSnsPlatformData(java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r2) {
            r1 = this;
            com.umeng.socialize.shareboard.ShareBoardConfig r0 = new com.umeng.socialize.shareboard.ShareBoardConfig
            r0.<init>()
            r1.setSnsPlatformData(r2, r0)
            return
    }

    public void setSnsPlatformData(java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r1, com.umeng.socialize.shareboard.ShareBoardConfig r2) {
            r0 = this;
            if (r2 != 0) goto La
            com.umeng.socialize.shareboard.ShareBoardConfig r2 = new com.umeng.socialize.shareboard.ShareBoardConfig
            r2.<init>()
            r0.mConfig = r2
            goto Lc
        La:
            r0.mConfig = r2
        Lc:
            r0.init(r1)
            return
    }
}
