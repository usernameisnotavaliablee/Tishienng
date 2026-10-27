package cn.bluemobi.dylan.photoview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ImagePagerActivity extends androidx.fragment.app.FragmentActivity {
    private static final java.lang.String T = "STATE_POSITION";
    public static final java.lang.String U = "image_index";
    public static final java.lang.String V = "image_urls";
    public static final java.lang.String W = "is_show_save_button";
    private cn.bluemobi.dylan.photoview.HackyViewPager O;
    private int P;
    private android.widget.TextView Q;
    private android.widget.ImageView R;
    private boolean S;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        final /* synthetic */ cn.bluemobi.dylan.photoview.ImagePagerActivity a;

        a(cn.bluemobi.dylan.photoview.ImagePagerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        public void onPageScrolled(int r1, float r2, int r3) {
                r0 = this;
                return
        }

        public void onPageSelected(int r7) {
                r6 = this;
                cn.bluemobi.dylan.photoview.ImagePagerActivity r0 = r6.a
                int r1 = cn.bluemobi.dylan.photoview.R.string.viewpager_indicator
                r2 = 1
                int r7 = r7 + r2
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                cn.bluemobi.dylan.photoview.ImagePagerActivity r3 = r6.a
                cn.bluemobi.dylan.photoview.HackyViewPager r3 = cn.bluemobi.dylan.photoview.ImagePagerActivity.e(r3)
                androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
                int r3 = r3.getCount()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r7
                r4[r2] = r3
                java.lang.String r7 = r0.getString(r1, r4)
                cn.bluemobi.dylan.photoview.ImagePagerActivity r0 = r6.a
                android.widget.TextView r0 = cn.bluemobi.dylan.photoview.ImagePagerActivity.f(r0)
                r0.setText(r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ java.lang.String[] a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.photoview.ImagePagerActivity f152b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements cn.bluemobi.dylan.photoview.c {
            final /* synthetic */ cn.bluemobi.dylan.photoview.ImagePagerActivity.b a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a$a, reason: collision with other inner class name */
            class RunnableC0001a implements java.lang.Runnable {
                final /* synthetic */ cn.bluemobi.dylan.photoview.ImagePagerActivity.b.a a;

                RunnableC0001a(cn.bluemobi.dylan.photoview.ImagePagerActivity.b.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r3 = this;
                        cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a r0 = r3.a
                        cn.bluemobi.dylan.photoview.ImagePagerActivity$b r0 = r0.a
                        cn.bluemobi.dylan.photoview.ImagePagerActivity r0 = r0.f152b
                        java.lang.String r1 = "已成功保存到相册"
                        r2 = 0
                        android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
                        r0.show()
                        return
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a$b, reason: collision with other inner class name */
            class RunnableC0002b implements java.lang.Runnable {
                final /* synthetic */ cn.bluemobi.dylan.photoview.ImagePagerActivity.b.a a;

                RunnableC0002b(cn.bluemobi.dylan.photoview.ImagePagerActivity.b.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r3 = this;
                        cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a r0 = r3.a
                        cn.bluemobi.dylan.photoview.ImagePagerActivity$b r0 = r0.a
                        cn.bluemobi.dylan.photoview.ImagePagerActivity r0 = r0.f152b
                        java.lang.String r1 = "保存失败，请稍后再试"
                        r2 = 0
                        android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
                        r0.show()
                        return
                }
            }

            a(cn.bluemobi.dylan.photoview.ImagePagerActivity.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // cn.bluemobi.dylan.photoview.c
            public void a() {
                    r2 = this;
                    cn.bluemobi.dylan.photoview.ImagePagerActivity$b r0 = r2.a
                    cn.bluemobi.dylan.photoview.ImagePagerActivity r0 = r0.f152b
                    cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a$b r1 = new cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a$b
                    r1.<init>(r2)
                    r0.runOnUiThread(r1)
                    return
            }

            @Override // cn.bluemobi.dylan.photoview.c
            public void onSuccess() {
                    r2 = this;
                    cn.bluemobi.dylan.photoview.ImagePagerActivity$b r0 = r2.a
                    cn.bluemobi.dylan.photoview.ImagePagerActivity r0 = r0.f152b
                    cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a$a r1 = new cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a$a
                    r1.<init>(r2)
                    r0.runOnUiThread(r1)
                    return
            }
        }

        b(cn.bluemobi.dylan.photoview.ImagePagerActivity r1, java.lang.String[] r2) {
                r0 = this;
                r0.f152b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                java.lang.Thread r5 = new java.lang.Thread
                cn.bluemobi.dylan.photoview.b r0 = new cn.bluemobi.dylan.photoview.b
                cn.bluemobi.dylan.photoview.ImagePagerActivity r1 = r4.f152b
                java.lang.String[] r2 = r4.a
                cn.bluemobi.dylan.photoview.HackyViewPager r3 = cn.bluemobi.dylan.photoview.ImagePagerActivity.e(r1)
                int r3 = r3.getCurrentItem()
                r2 = r2[r3]
                cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a r3 = new cn.bluemobi.dylan.photoview.ImagePagerActivity$b$a
                r3.<init>(r4)
                r0.<init>(r1, r2, r3)
                r5.<init>(r0)
                r5.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends androidx.fragment.app.FragmentStatePagerAdapter {

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String[] f153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.photoview.ImagePagerActivity f154g;

        public c(cn.bluemobi.dylan.photoview.ImagePagerActivity r1, androidx.fragment.app.FragmentManager r2, java.lang.String[] r3) {
                r0 = this;
                r0.f154g = r1
                r0.<init>(r2)
                r0.f153f = r3
                return
        }

        public int getCount() {
                r1 = this;
                java.lang.String[] r0 = r1.f153f
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.length
                return r0
        }

        public androidx.fragment.app.Fragment getItem(int r2) {
                r1 = this;
                java.lang.String[] r0 = r1.f153f
                r2 = r0[r2]
                cn.bluemobi.dylan.photoview.ImageDetailFragment r2 = cn.bluemobi.dylan.photoview.ImageDetailFragment.e(r2)
                return r2
        }
    }

    static {
            r0 = 7546(0x1d7a, float:1.0574E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ImagePagerActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ cn.bluemobi.dylan.photoview.HackyViewPager e(cn.bluemobi.dylan.photoview.ImagePagerActivity r0) {
            cn.bluemobi.dylan.photoview.HackyViewPager r0 = r0.O
            return r0
    }

    static /* synthetic */ android.widget.TextView f(cn.bluemobi.dylan.photoview.ImagePagerActivity r0) {
            android.widget.TextView r0 = r0.Q
            return r0
    }

    public native void onCreate(android.os.Bundle r1);

    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            cn.bluemobi.dylan.photoview.HackyViewPager r0 = r2.O
            int r0 = r0.getCurrentItem()
            java.lang.String r1 = "STATE_POSITION"
            r3.putInt(r1, r0)
            return
    }
}
