package com.bxkj.student.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class WelcomeActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog Y;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.splash.WelcomeActivity a;

        a(com.bxkj.student.splash.WelcomeActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                com.bxkj.student.splash.WelcomeActivity r0 = r2.a
                int r0 = com.bxkj.student.splash.WelcomeActivity.g0(r0)
                r3.setLastVersionCode(r0)
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.splash.WelcomeActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.splash.WelcomeActivity.h0(r0)
                java.lang.Class<com.bxkj.student.splash.SplashActivity> r1 = com.bxkj.student.splash.SplashActivity.class
                r3.<init>(r0, r1)
                com.bxkj.student.splash.WelcomeActivity r0 = r2.a
                r0.startActivity(r3)
                com.bxkj.student.splash.WelcomeActivity r3 = r2.a
                r3.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends androidx.viewpager.widget.PagerAdapter {
        final /* synthetic */ java.util.List f;
        final /* synthetic */ com.bxkj.student.splash.WelcomeActivity g;

        b(com.bxkj.student.splash.WelcomeActivity r1, java.util.List r2) {
                r0 = this;
                r0.g = r1
                r0.f = r2
                r0.<init>()
                return
        }

        public void destroyItem(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
                r0 = this;
                java.util.List r3 = r0.f
                java.lang.Object r2 = r3.get(r2)
                android.view.View r2 = (android.view.View) r2
                r1.removeView(r2)
                return
        }

        public int getCount() {
                r1 = this;
                java.util.List r0 = r1.f
                int r0 = r0.size()
                return r0
        }

        public java.lang.Object instantiateItem(android.view.ViewGroup r3, int r4) {
                r2 = this;
                java.util.List r0 = r2.f
                java.lang.Object r0 = r0.get(r4)
                android.view.View r0 = (android.view.View) r0
                r1 = 0
                r3.addView(r0, r1)
                java.util.List r3 = r2.f
                java.lang.Object r3 = r3.get(r4)
                return r3
        }

        public boolean isViewFromObject(android.view.View r1, java.lang.Object r2) {
                r0 = this;
                if (r1 != r2) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }
    }

    public WelcomeActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ int g0(com.bxkj.student.splash.WelcomeActivity r0) {
            int r0 = r0.i0()
            return r0
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.splash.WelcomeActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private int i0() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.V     // Catch: java.lang.Exception -> L13
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L13
            android.content.Context r2 = r3.V     // Catch: java.lang.Exception -> L13
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L13
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> L13
            int r0 = r1.versionCode     // Catch: java.lang.Exception -> L13
        L13:
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493060(0x7f0c00c4, float:1.860959E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            r0 = 0
            r1.c0(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r0.j0()
            return
    }

    public void j0() {
            r6 = this;
            android.view.Window r0 = r6.getWindow()
            r1 = 2131689656(0x7f0f00b8, float:1.9008334E38)
            r0.setBackgroundDrawableResource(r1)
            androidx.viewpager.widget.ViewPager r0 = new androidx.viewpager.widget.ViewPager
            r0.<init>(r6)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r6)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_XY
            r4.setScaleType(r5)
            r4.setLayoutParams(r3)
            r4.setImageResource(r1)
            r2.add(r4)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r6)
            r1.setScaleType(r5)
            r1.setLayoutParams(r3)
            r4 = 2131689657(0x7f0f00b9, float:1.9008336E38)
            r1.setImageResource(r4)
            r2.add(r1)
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            r1.<init>(r6)
            r1.setLayoutParams(r3)
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r6)
            r4.setScaleType(r5)
            r4.setLayoutParams(r3)
            r3 = 2131689658(0x7f0f00ba, float:1.9008338E38)
            r4.setImageResource(r3)
            r1.addView(r4)
            com.bxkj.student.splash.WelcomeActivity$a r3 = new com.bxkj.student.splash.WelcomeActivity$a
            r3.<init>(r6)
            r4.setOnClickListener(r3)
            r2.add(r1)
            com.bxkj.student.splash.WelcomeActivity$b r1 = new com.bxkj.student.splash.WelcomeActivity$b
            r1.<init>(r6, r2)
            r0.setAdapter(r1)
            r6.setContentView(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.Y
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lf
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.Y
            r0.dismiss()
        Lf:
            super.onDestroy()
            return
    }
}
