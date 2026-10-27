package com.acse.ottn.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AutoScrollViewPager extends android.widget.RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f2118f = "right";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f2119g = "center";

    /* renamed from: h, reason: collision with root package name */
    public static final int f2120h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2121i = 1;
    public com.acse.ottn.t a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f2122b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f2123c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f2124d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f2125e;

    public AutoScrollViewPager(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AutoScrollViewPager(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AutoScrollViewPager(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = com.acse.ottn.R.styleable.AutoScrollViewPager
            r1 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r5 = com.acse.ottn.R.styleable.AutoScrollViewPager_point_layout
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r0 = "center"
            if (r5 != 0) goto L15
            r5 = r0
        L15:
            boolean r0 = r5.equals(r0)
            r1 = 0
            if (r0 != 0) goto L3e
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L31
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r3)
            int r0 = com.acse.ottn.R.layout.point_center_text
            android.view.View r5 = r5.inflate(r0, r1)
            r2.f2124d = r5
            goto L4a
        L31:
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r3)
            int r0 = com.acse.ottn.R.layout.point_right_text
            android.view.View r5 = r5.inflate(r0, r1)
            r2.f2124d = r5
            goto L4a
        L3e:
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r3)
            int r0 = com.acse.ottn.R.layout.point_center_text
            android.view.View r5 = r5.inflate(r0, r1)
            r2.f2124d = r5
        L4a:
            r4.recycle()
            r2.a(r3)
            return
    }

    public void a() {
            r1 = this;
            com.acse.ottn.t r0 = r1.a
            if (r0 == 0) goto L7
            r0.d()
        L7:
            return
    }

    public void a(int r2) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0)
            return
    }

    public void a(int r5, int r6) {
            r4 = this;
            android.widget.LinearLayout r0 = r4.f2123c
            r0.removeAllViews()
            r0 = 0
        L6:
            if (r0 >= r5) goto L32
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r2 = r4.f2122b
            r1.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 15
            r2.<init>(r3, r3)
            r3 = 8
            r2.leftMargin = r3
            r1.setLayoutParams(r2)
            if (r0 != r6) goto L25
            int r2 = com.acse.ottn.R.drawable.point_checked
            r1.setBackgroundResource(r2)
            goto L2a
        L25:
            int r2 = com.acse.ottn.R.drawable.point_normal
            r1.setBackgroundResource(r2)
        L2a:
            android.widget.LinearLayout r2 = r4.f2123c
            r2.addView(r1)
            int r0 = r0 + 1
            goto L6
        L32:
            return
    }

    public final void a(android.content.Context r2) {
            r1 = this;
            r1.f2122b = r2
            com.acse.ottn.t r0 = new com.acse.ottn.t
            r0.<init>(r2)
            r1.a = r0
            r1.addView(r0)
            android.view.View r2 = r1.f2124d
            if (r2 == 0) goto L3b
            int r0 = com.acse.ottn.R.id.subTitle
            android.view.View r2 = r2.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f2125e = r2
            android.view.View r2 = r1.f2124d
            int r0 = com.acse.ottn.R.id.pointLayout
            android.view.View r2 = r2.findViewById(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f2123c = r2
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r0 = -2
            r2.<init>(r0, r0)
            r0 = 12
            r2.addRule(r0)
            android.view.View r0 = r1.f2124d
            r0.setLayoutParams(r2)
            android.view.View r2 = r1.f2124d
            r1.addView(r2)
        L3b:
            return
    }

    public void b() {
            r1 = this;
            com.acse.ottn.t r0 = r1.a
            if (r0 == 0) goto L7
            r0.f()
        L7:
            return
    }

    public void b(int r5) {
            r4 = this;
            android.widget.LinearLayout r0 = r4.f2123c
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L21
            android.widget.LinearLayout r2 = r4.f2123c
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r1 != r5) goto L19
            int r3 = com.acse.ottn.R.drawable.point_checked
            r2.setBackgroundResource(r3)
            goto L1e
        L19:
            int r3 = com.acse.ottn.R.drawable.point_normal
            r2.setBackgroundResource(r3)
        L1e:
            int r1 = r1 + 1
            goto L7
        L21:
            return
    }

    public void c() {
            r1 = this;
            com.acse.ottn.t r0 = r1.a
            if (r0 == 0) goto Lf
            boolean r0 = r0.c()
            if (r0 != 0) goto Lf
            com.acse.ottn.t r0 = r1.a
            r0.g()
        Lf:
            return
    }

    public android.widget.TextView getSubTitle() {
            r1 = this;
            android.widget.TextView r0 = r1.f2125e
            return r0
    }

    public com.acse.ottn.t getViewPager() {
            r1 = this;
            com.acse.ottn.t r0 = r1.a
            return r0
    }

    public void setAdapter(com.acse.ottn.e0 r2) {
            r1 = this;
            com.acse.ottn.t r0 = r1.a
            if (r0 == 0) goto L7
            r0.a(r0, r2)
        L7:
            return
    }
}
