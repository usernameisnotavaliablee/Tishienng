package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ScrollClickView extends android.widget.LinearLayout {
    public static final java.lang.String DIR_DOWN = "down";
    public static final java.lang.String DIR_LEFT = "left";
    public static final java.lang.String DIR_RIGHT = "right";
    public static final java.lang.String DIR_UP = "up";
    android.widget.ImageView a;
    android.widget.ImageView b;
    android.widget.TextView c;
    android.widget.TextView d;
    private boolean e;
    private java.lang.String f;
    private java.lang.String g;
    private int h;
    private int i;
    private java.lang.String j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private int f103l;

    /* renamed from: m, reason: collision with root package name */
    private android.animation.ValueAnimator f104m;

    /* renamed from: n, reason: collision with root package name */
    private android.content.Context f105n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.FrameLayout f106o;

    /* renamed from: p, reason: collision with root package name */
    private android.widget.FrameLayout f107p;

    /* renamed from: q, reason: collision with root package name */
    private android.widget.LinearLayout f108q;



    public ScrollClickView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.e = r0
            java.lang.String r0 = "up"
            r1.j = r0
            r0 = 45
            r1.k = r0
            r0 = 180(0xb4, float:2.52E-43)
            r1.f103l = r0
            r0 = 0
            r1.f108q = r0
            r1.init(r2)
            return
    }

    public ScrollClickView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.e = r2
            java.lang.String r2 = "up"
            r0.j = r2
            r2 = 45
            r0.k = r2
            r2 = 180(0xb4, float:2.52E-43)
            r0.f103l = r2
            r2 = 0
            r0.f108q = r2
            r0.init(r1)
            return
    }

    public ScrollClickView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.e = r2
            java.lang.String r2 = "up"
            r0.j = r2
            r2 = 45
            r0.k = r2
            r2 = 180(0xb4, float:2.52E-43)
            r0.f103l = r2
            r2 = 0
            r0.f108q = r2
            r0.init(r1)
            return
    }

    static /* synthetic */ android.animation.ValueAnimator a(com.beizi.fusion.widget.ScrollClickView r0, android.animation.ValueAnimator r1) {
            r0.f104m = r1
            return r1
    }

    static /* synthetic */ android.widget.FrameLayout a(com.beizi.fusion.widget.ScrollClickView r0) {
            android.widget.FrameLayout r0 = r0.f106o
            return r0
    }

    private void a() {
            r2 = this;
            android.widget.ImageView r0 = r2.a     // Catch: java.lang.Exception -> La
            com.beizi.fusion.widget.ScrollClickView$1 r1 = new com.beizi.fusion.widget.ScrollClickView$1     // Catch: java.lang.Exception -> La
            r1.<init>(r2)     // Catch: java.lang.Exception -> La
            r0.post(r1)     // Catch: java.lang.Exception -> La
        La:
            return
    }

    static /* synthetic */ android.widget.FrameLayout b(com.beizi.fusion.widget.ScrollClickView r0) {
            android.widget.FrameLayout r0 = r0.f107p
            return r0
    }

    private void b() {
            r2 = this;
            android.widget.ImageView r0 = r2.a     // Catch: java.lang.Exception -> La
            com.beizi.fusion.widget.ScrollClickView$2 r1 = new com.beizi.fusion.widget.ScrollClickView$2     // Catch: java.lang.Exception -> La
            r1.<init>(r2)     // Catch: java.lang.Exception -> La
            r0.post(r1)     // Catch: java.lang.Exception -> La
        La:
            return
    }

    static /* synthetic */ int c(com.beizi.fusion.widget.ScrollClickView r0) {
            int r0 = r0.f103l
            return r0
    }

    static /* synthetic */ android.animation.ValueAnimator d(com.beizi.fusion.widget.ScrollClickView r0) {
            android.animation.ValueAnimator r0 = r0.f104m
            return r0
    }

    public void buildRealView() {
            r5 = this;
            java.lang.String r0 = "down"
            java.lang.String r1 = "up"
            java.lang.String r2 = r5.j     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            android.content.Context r2 = r5.f105n     // Catch: java.lang.Throwable -> L1d
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)     // Catch: java.lang.Throwable -> L1d
            int r3 = com.beizi.fusion.R.layout.layout_scrollview_up     // Catch: java.lang.Throwable -> L1d
            android.view.View r2 = r2.inflate(r3, r5)     // Catch: java.lang.Throwable -> L1d
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2     // Catch: java.lang.Throwable -> L1d
            r5.f108q = r2     // Catch: java.lang.Throwable -> L1d
            goto L79
        L1d:
            goto L38
        L1f:
            java.lang.String r2 = r5.j     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L79
            android.content.Context r2 = r5.f105n     // Catch: java.lang.Throwable -> L1d
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)     // Catch: java.lang.Throwable -> L1d
            int r3 = com.beizi.fusion.R.layout.layout_scrollview_down     // Catch: java.lang.Throwable -> L1d
            android.view.View r2 = r2.inflate(r3, r5)     // Catch: java.lang.Throwable -> L1d
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2     // Catch: java.lang.Throwable -> L1d
            r5.f108q = r2     // Catch: java.lang.Throwable -> L1d
            goto L79
        L38:
            java.lang.String r2 = r5.j
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L59
            android.content.Context r2 = r5.f105n
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.beizi.fusion.R.layout.layout_scrollview_up
            android.view.View r2 = r2.inflate(r3, r5)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r5.f108q = r2
            goto L79
        L59:
            java.lang.String r2 = r5.j
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L79
            android.content.Context r2 = r5.f105n
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.beizi.fusion.R.layout.layout_scrollview_down
            android.view.View r2 = r2.inflate(r3, r5)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r5.f108q = r2
        L79:
            android.widget.LinearLayout r2 = r5.f108q     // Catch: java.lang.Exception -> L154
            if (r2 != 0) goto L7f
            goto L154
        L7f:
            int r3 = com.beizi.fusion.R.id.hand     // Catch: java.lang.Exception -> L154
            android.view.View r2 = r2.findViewById(r3)     // Catch: java.lang.Exception -> L154
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch: java.lang.Exception -> L154
            r5.a = r2     // Catch: java.lang.Exception -> L154
            android.widget.LinearLayout r2 = r5.f108q     // Catch: java.lang.Exception -> L154
            int r3 = com.beizi.fusion.R.id.scrollbar     // Catch: java.lang.Exception -> L154
            android.view.View r2 = r2.findViewById(r3)     // Catch: java.lang.Exception -> L154
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch: java.lang.Exception -> L154
            r5.b = r2     // Catch: java.lang.Exception -> L154
            android.widget.LinearLayout r2 = r5.f108q     // Catch: java.lang.Exception -> L154
            int r3 = com.beizi.fusion.R.id.title     // Catch: java.lang.Exception -> L154
            android.view.View r2 = r2.findViewById(r3)     // Catch: java.lang.Exception -> L154
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Exception -> L154
            r5.c = r2     // Catch: java.lang.Exception -> L154
            android.widget.LinearLayout r2 = r5.f108q     // Catch: java.lang.Exception -> L154
            int r3 = com.beizi.fusion.R.id.details     // Catch: java.lang.Exception -> L154
            android.view.View r2 = r2.findViewById(r3)     // Catch: java.lang.Exception -> L154
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Exception -> L154
            r5.d = r2     // Catch: java.lang.Exception -> L154
            android.widget.LinearLayout r2 = r5.f108q     // Catch: java.lang.Exception -> L154
            int r3 = com.beizi.fusion.R.id.scroll_container     // Catch: java.lang.Exception -> L154
            android.view.View r2 = r2.findViewById(r3)     // Catch: java.lang.Exception -> L154
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2     // Catch: java.lang.Exception -> L154
            r5.f106o = r2     // Catch: java.lang.Exception -> L154
            android.widget.LinearLayout r2 = r5.f108q     // Catch: java.lang.Exception -> L154
            int r3 = com.beizi.fusion.R.id.scrollbar_container     // Catch: java.lang.Exception -> L154
            android.view.View r2 = r2.findViewById(r3)     // Catch: java.lang.Exception -> L154
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2     // Catch: java.lang.Exception -> L154
            r5.f107p = r2     // Catch: java.lang.Exception -> L154
            android.content.Context r2 = r5.f105n     // Catch: java.lang.Exception -> L154
            int r3 = r5.k     // Catch: java.lang.Exception -> L154
            float r3 = (float) r3     // Catch: java.lang.Exception -> L154
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L154
            r5.k = r2     // Catch: java.lang.Exception -> L154
            android.content.Context r2 = r5.f105n     // Catch: java.lang.Exception -> L154
            int r3 = r5.f103l     // Catch: java.lang.Exception -> L154
            float r3 = (float) r3     // Catch: java.lang.Exception -> L154
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L154
            int r3 = r5.k     // Catch: java.lang.Exception -> L154
            int r2 = r2 + r3
            r5.f103l = r2     // Catch: java.lang.Exception -> L154
            android.widget.TextView r2 = r5.c     // Catch: java.lang.Exception -> L154
            r3 = 2
            if (r2 == 0) goto Lf0
            java.lang.String r4 = r5.f     // Catch: java.lang.Exception -> L154
            r2.setText(r4)     // Catch: java.lang.Exception -> L154
            android.widget.TextView r2 = r5.c     // Catch: java.lang.Exception -> L154
            int r4 = r5.h     // Catch: java.lang.Exception -> L154
            float r4 = (float) r4     // Catch: java.lang.Exception -> L154
            r2.setTextSize(r3, r4)     // Catch: java.lang.Exception -> L154
        Lf0:
            android.widget.TextView r2 = r5.d     // Catch: java.lang.Exception -> L154
            if (r2 == 0) goto L101
            java.lang.String r4 = r5.g     // Catch: java.lang.Exception -> L154
            r2.setText(r4)     // Catch: java.lang.Exception -> L154
            android.widget.TextView r2 = r5.d     // Catch: java.lang.Exception -> L154
            int r4 = r5.i     // Catch: java.lang.Exception -> L154
            float r4 = (float) r4     // Catch: java.lang.Exception -> L154
            r2.setTextSize(r3, r4)     // Catch: java.lang.Exception -> L154
        L101:
            android.widget.ImageView r2 = r5.a     // Catch: java.lang.Exception -> L154
            if (r2 == 0) goto L154
            android.widget.ImageView r3 = r5.b     // Catch: java.lang.Exception -> L154
            if (r3 == 0) goto L154
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L154
            android.widget.ImageView r3 = r5.b     // Catch: java.lang.Exception -> L154
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch: java.lang.Exception -> L154
            if (r2 == 0) goto L12a
            int r4 = r5.k     // Catch: java.lang.Exception -> L154
            r2.width = r4     // Catch: java.lang.Exception -> L154
            r2.height = r4     // Catch: java.lang.Exception -> L154
            if (r3 == 0) goto L12a
            int r2 = r5.f103l     // Catch: java.lang.Exception -> L154
            r3.height = r2     // Catch: java.lang.Exception -> L154
            float r2 = (float) r4     // Catch: java.lang.Exception -> L154
            r4 = 1057803469(0x3f0ccccd, float:0.55)
            float r2 = r2 * r4
            int r2 = (int) r2     // Catch: java.lang.Exception -> L154
            r3.width = r2     // Catch: java.lang.Exception -> L154
        L12a:
            java.lang.String r2 = r5.j     // Catch: java.lang.Exception -> L154
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L154
            if (r0 == 0) goto L136
            r5.b()     // Catch: java.lang.Exception -> L154
            goto L154
        L136:
            java.lang.String r0 = r5.j     // Catch: java.lang.Exception -> L154
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L154
            if (r0 == 0) goto L142
            r5.a()     // Catch: java.lang.Exception -> L154
            goto L154
        L142:
            java.lang.String r0 = "left"
            java.lang.String r1 = r5.j     // Catch: java.lang.Exception -> L154
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L154
            if (r0 == 0) goto L14d
            goto L154
        L14d:
            java.lang.String r0 = "right"
            java.lang.String r1 = r5.j     // Catch: java.lang.Exception -> L154
            r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L154
        L154:
            return
    }

    public void init(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto L5
            return
        L5:
            r1.f105n = r2
            r2 = 1
            r1.e = r2
            return
    }

    public void setDetailText(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setDetailsFont(int r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setHandWidth(int r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setScrollDirection(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setScrollbarHeight(int r1) {
            r0 = this;
            r0.f103l = r1
            return
    }

    public void setTitleFont(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setTitleText(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void startAnim() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startAnim animator != null ? "
            r0.append(r1)
            android.animation.ValueAnimator r1 = r2.f104m
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ScrollClickUtil"
            com.beizi.fusion.tool.aa.b(r1, r0)
            android.animation.ValueAnimator r0 = r2.f104m     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L24
            r0.start()     // Catch: java.lang.Exception -> L24
        L24:
            return
    }

    public void stopAnim() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f104m     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto Lc
            r0.removeAllUpdateListeners()     // Catch: java.lang.Exception -> Lc
            android.animation.ValueAnimator r0 = r1.f104m     // Catch: java.lang.Exception -> Lc
            r0.cancel()     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }
}
