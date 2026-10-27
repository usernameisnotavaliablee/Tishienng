package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TwistView extends android.widget.RelativeLayout {
    public static final long DELAY_TIME_TWIST = 100;
    private int A;
    private int B;
    private com.beizi.fusion.widget.TwistView.a C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private android.os.Handler J;
    private android.view.View a;
    private android.view.View b;
    private android.view.View c;
    private android.view.View d;
    private com.beizi.fusion.widget.BackArrowView e;
    private com.beizi.fusion.widget.BackArrowView f;
    private com.beizi.fusion.widget.BackArrowView g;
    private com.beizi.fusion.widget.ShakeView h;
    private android.widget.TextView i;
    private android.widget.TextView j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private android.animation.ObjectAnimator f109l;

    /* renamed from: m, reason: collision with root package name */
    private final int f110m;

    /* renamed from: n, reason: collision with root package name */
    private final int f111n;

    /* renamed from: o, reason: collision with root package name */
    private final long f112o;

    /* renamed from: p, reason: collision with root package name */
    private final long f113p;

    /* renamed from: q, reason: collision with root package name */
    private final long f114q;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f115r;

    /* renamed from: s, reason: collision with root package name */
    private java.lang.String f116s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.String f117t;

    /* renamed from: u, reason: collision with root package name */
    private long f118u;

    /* renamed from: v, reason: collision with root package name */
    private java.util.Timer f119v;

    /* renamed from: w, reason: collision with root package name */
    private java.util.TimerTask f120w;

    /* renamed from: x, reason: collision with root package name */
    private java.util.Timer f121x;

    /* renamed from: y, reason: collision with root package name */
    private java.util.TimerTask f122y;

    /* renamed from: z, reason: collision with root package name */
    private int f123z;









    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();
    }

    public TwistView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 1000(0x3e8, float:1.401E-42)
            r2.f110m = r3
            r3 = 2000(0x7d0, float:2.803E-42)
            r2.f111n = r3
            r0 = 500(0x1f4, double:2.47E-321)
            r2.f112o = r0
            r0 = 0
            r2.f113p = r0
            r2.f114q = r0
            java.lang.String r3 = "#FFFFFFFF"
            r2.f115r = r3
            java.lang.String r3 = "#99FFFFFF"
            r2.f116s = r3
            java.lang.String r3 = "#33FFFFFF"
            r2.f117t = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.f118u = r0
            r3 = 0
            r2.f123z = r3
            r2.A = r3
            r2.B = r3
            r2.D = r3
            r0 = 1
            r2.E = r0
            r1 = 3
            r2.F = r1
            r2.G = r0
            r0 = 95
            r2.H = r0
            r2.I = r3
            com.beizi.fusion.widget.TwistView$1 r3 = new com.beizi.fusion.widget.TwistView$1
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r2, r0)
            r2.J = r3
            r2.b()
            return
    }

    public TwistView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.f110m = r2
            r2 = 2000(0x7d0, float:2.803E-42)
            r1.f111n = r2
            r2 = 500(0x1f4, double:2.47E-321)
            r1.f112o = r2
            r2 = 0
            r1.f113p = r2
            r1.f114q = r2
            java.lang.String r2 = "#FFFFFFFF"
            r1.f115r = r2
            java.lang.String r2 = "#99FFFFFF"
            r1.f116s = r2
            java.lang.String r2 = "#33FFFFFF"
            r1.f117t = r2
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.f118u = r2
            r2 = 0
            r1.f123z = r2
            r1.A = r2
            r1.B = r2
            r1.D = r2
            r3 = 1
            r1.E = r3
            r0 = 3
            r1.F = r0
            r1.G = r3
            r3 = 95
            r1.H = r3
            r1.I = r2
            com.beizi.fusion.widget.TwistView$1 r2 = new com.beizi.fusion.widget.TwistView$1
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r1, r3)
            r1.J = r2
            r1.b()
            return
    }

    public TwistView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.f110m = r1
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.f111n = r1
            r1 = 500(0x1f4, double:2.47E-321)
            r0.f112o = r1
            r1 = 0
            r0.f113p = r1
            r0.f114q = r1
            java.lang.String r1 = "#FFFFFFFF"
            r0.f115r = r1
            java.lang.String r1 = "#99FFFFFF"
            r0.f116s = r1
            java.lang.String r1 = "#33FFFFFF"
            r0.f117t = r1
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.f118u = r1
            r1 = 0
            r0.f123z = r1
            r0.A = r1
            r0.B = r1
            r0.D = r1
            r2 = 1
            r0.E = r2
            r3 = 3
            r0.F = r3
            r0.G = r2
            r2 = 95
            r0.H = r2
            r0.I = r1
            com.beizi.fusion.widget.TwistView$1 r1 = new com.beizi.fusion.widget.TwistView$1
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r0, r2)
            r0.J = r1
            r0.b()
            return
    }

    static /* synthetic */ int a(com.beizi.fusion.widget.TwistView r0) {
            int r0 = r0.D
            return r0
    }

    private void a() {
            r4 = this;
            int r0 = r4.k     // Catch: java.lang.Exception -> L8c
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L2e
            com.beizi.fusion.widget.BackArrowView r0 = r4.e     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L13
            java.lang.String r3 = r4.f115r     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
        L13:
            com.beizi.fusion.widget.BackArrowView r0 = r4.f     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L20
            java.lang.String r3 = r4.f116s     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
        L20:
            com.beizi.fusion.widget.BackArrowView r0 = r4.g     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L81
            java.lang.String r3 = r4.f117t     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
            goto L81
        L2e:
            if (r0 != r2) goto L58
            com.beizi.fusion.widget.BackArrowView r0 = r4.e     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L3d
            java.lang.String r3 = r4.f117t     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
        L3d:
            com.beizi.fusion.widget.BackArrowView r0 = r4.f     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L4a
            java.lang.String r3 = r4.f115r     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
        L4a:
            com.beizi.fusion.widget.BackArrowView r0 = r4.g     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L81
            java.lang.String r3 = r4.f116s     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
            goto L81
        L58:
            if (r0 != r1) goto L81
            com.beizi.fusion.widget.BackArrowView r0 = r4.e     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L67
            java.lang.String r3 = r4.f116s     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
        L67:
            com.beizi.fusion.widget.BackArrowView r0 = r4.f     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L74
            java.lang.String r3 = r4.f117t     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
        L74:
            com.beizi.fusion.widget.BackArrowView r0 = r4.g     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L81
            java.lang.String r3 = r4.f115r     // Catch: java.lang.Exception -> L8c
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L8c
            r0.setViewColor(r3)     // Catch: java.lang.Exception -> L8c
        L81:
            int r0 = r4.k     // Catch: java.lang.Exception -> L8c
            if (r0 != r1) goto L89
            r0 = 0
            r4.k = r0     // Catch: java.lang.Exception -> L8c
            return
        L89:
            int r0 = r0 + r2
            r4.k = r0     // Catch: java.lang.Exception -> L8c
        L8c:
            return
    }

    private void a(android.view.View r1, float r2, long r3, boolean r5, int r6) {
            r0 = this;
            r0.b(r1, r2, r3, r5, r6)     // Catch: java.lang.Exception -> L8
            r2 = r1
            r1 = r0
            r1.a(r2, r3, r5, r6)     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    private void a(android.view.View r8, long r9, boolean r11, int r12) {
            r7 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "rotation"
            r3 = 1
            r4 = 0
            if (r11 == 0) goto L3b
            int r11 = r7.getCountAnimation()     // Catch: java.lang.Exception -> L6d
            float r11 = (float) r11     // Catch: java.lang.Exception -> L6d
            r5 = 1135869952(0x43b40000, float:360.0)
            float r11 = r5 / r11
            float r6 = (float) r12     // Catch: java.lang.Exception -> L6d
            float r6 = r6 * r11
            float r6 = r6 + r4
            int r12 = r12 + r3
            float r12 = (float) r12     // Catch: java.lang.Exception -> L6d
            float r11 = r11 * r12
            int r12 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r12 > 0) goto L6d
            int r12 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r12 <= 0) goto L22
            goto L6d
        L22:
            float[] r12 = new float[r1]     // Catch: java.lang.Exception -> L6d
            r12[r0] = r6     // Catch: java.lang.Exception -> L6d
            r12[r3] = r11     // Catch: java.lang.Exception -> L6d
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r2, r12)     // Catch: java.lang.Exception -> L6d
            r8.setDuration(r9)     // Catch: java.lang.Exception -> L6d
            com.beizi.fusion.widget.TwistView$4 r9 = new com.beizi.fusion.widget.TwistView$4     // Catch: java.lang.Exception -> L6d
            r9.<init>(r7)     // Catch: java.lang.Exception -> L6d
            r8.addUpdateListener(r9)     // Catch: java.lang.Exception -> L6d
            r8.start()     // Catch: java.lang.Exception -> L6d
            return
        L3b:
            int r11 = r7.getCountAnimation()     // Catch: java.lang.Exception -> L6d
            float r11 = (float) r11     // Catch: java.lang.Exception -> L6d
            r5 = -1011613696(0xffffffffc3b40000, float:-360.0)
            float r11 = r5 / r11
            float r6 = (float) r12     // Catch: java.lang.Exception -> L6d
            float r6 = r6 * r11
            float r6 = r6 + r4
            int r12 = r12 + r3
            float r12 = (float) r12     // Catch: java.lang.Exception -> L6d
            float r11 = r11 * r12
            int r12 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r12 < 0) goto L6d
            int r12 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r12 >= 0) goto L55
            goto L6d
        L55:
            float[] r12 = new float[r1]     // Catch: java.lang.Exception -> L6d
            r12[r0] = r6     // Catch: java.lang.Exception -> L6d
            r12[r3] = r11     // Catch: java.lang.Exception -> L6d
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r2, r12)     // Catch: java.lang.Exception -> L6d
            r8.setDuration(r9)     // Catch: java.lang.Exception -> L6d
            com.beizi.fusion.widget.TwistView$5 r9 = new com.beizi.fusion.widget.TwistView$5     // Catch: java.lang.Exception -> L6d
            r9.<init>(r7)     // Catch: java.lang.Exception -> L6d
            r8.addUpdateListener(r9)     // Catch: java.lang.Exception -> L6d
            r8.start()     // Catch: java.lang.Exception -> L6d
        L6d:
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    private void a(android.view.View r8, android.view.View r9, long r10, int r12, int r13) {
            r7 = this;
            if (r8 == 0) goto L40
            int r5 = r8.getVisibility()     // Catch: java.lang.Throwable -> L40
            if (r5 != 0) goto L40
            android.view.ViewParent r5 = r8.getParent()     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L40
            boolean r5 = r8.hasWindowFocus()     // Catch: java.lang.Throwable -> L40
            if (r5 != 0) goto L15
            goto L40
        L15:
            r5 = 1
            if (r12 != r5) goto L29
            r7.hideTargetView(r8, r10, r13)     // Catch: java.lang.Throwable -> L40
            int r1 = r8.getRight()     // Catch: java.lang.Throwable -> L40
            float r2 = (float) r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            r0 = r7
            r1 = r9
            r3 = r10
            r6 = r13
            r0.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L40
            return
        L29:
            r5 = 2
            if (r12 != r5) goto L40
            boolean r2 = r7.E     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L40
            r7.showTargetView(r8, r10, r13)     // Catch: java.lang.Throwable -> L40
            int r1 = r8.getRight()     // Catch: java.lang.Throwable -> L40
            float r2 = (float) r1     // Catch: java.lang.Throwable -> L40
            r5 = 0
            r0 = r7
            r1 = r9
            r3 = r10
            r6 = r13
            r0.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }

    static /* synthetic */ boolean a(com.beizi.fusion.widget.TwistView r0, boolean r1) {
            r0.I = r1
            return r1
    }

    private void b() {
            r2 = this;
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Exception -> L15
            int r1 = com.beizi.fusion.R.layout.beizi_twist_view     // Catch: java.lang.Exception -> L15
            android.view.View.inflate(r0, r1, r2)     // Catch: java.lang.Exception -> L15
            r2.c()     // Catch: java.lang.Exception -> L15
            r2.d()     // Catch: java.lang.Exception -> L15
            r2.e()     // Catch: java.lang.Exception -> L15
            r2.startTwistTimerTask()     // Catch: java.lang.Exception -> L15
        L15:
            return
    }

    private void b(android.view.View r8, float r9, long r10, boolean r12, int r13) {
            r7 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.String r3 = "translationX"
            r4 = 0
            if (r12 == 0) goto L53
            int r12 = r8.getWidth()     // Catch: java.lang.Exception -> L8a
            float r12 = (float) r12     // Catch: java.lang.Exception -> L8a
            float r9 = r9 - r12
            int r12 = r7.getCountAnimation()     // Catch: java.lang.Exception -> L8a
            float r12 = (float) r12     // Catch: java.lang.Exception -> L8a
            float r12 = r9 / r12
            float r5 = (float) r13     // Catch: java.lang.Exception -> L8a
            float r5 = r5 * r12
            float r6 = r5 + r4
            float r12 = r12 + r5
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 > 0) goto L23
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto L25
        L23:
            r7.E = r1     // Catch: java.lang.Exception -> L8a
        L25:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 >= 0) goto L2d
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 < 0) goto L34
        L2d:
            int r9 = r7.getCountAnimation()     // Catch: java.lang.Exception -> L8a
            if (r13 < r9) goto L34
            goto L8a
        L34:
            float[] r9 = new float[r0]     // Catch: java.lang.Exception -> L8a
            r9[r1] = r6     // Catch: java.lang.Exception -> L8a
            r9[r2] = r12     // Catch: java.lang.Exception -> L8a
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r3, r9)     // Catch: java.lang.Exception -> L8a
            r7.f109l = r8     // Catch: java.lang.Exception -> L8a
            r8.setDuration(r10)     // Catch: java.lang.Exception -> L8a
            android.animation.ObjectAnimator r8 = r7.f109l     // Catch: java.lang.Exception -> L8a
            r8.start()     // Catch: java.lang.Exception -> L8a
            android.animation.ObjectAnimator r8 = r7.f109l     // Catch: java.lang.Exception -> L8a
            com.beizi.fusion.widget.TwistView$3 r9 = new com.beizi.fusion.widget.TwistView$3     // Catch: java.lang.Exception -> L8a
            r9.<init>(r7, r13)     // Catch: java.lang.Exception -> L8a
            r8.addListener(r9)     // Catch: java.lang.Exception -> L8a
            return
        L53:
            int r12 = r8.getWidth()     // Catch: java.lang.Exception -> L8a
            float r12 = (float) r12     // Catch: java.lang.Exception -> L8a
            float r9 = r9 - r12
            int r12 = r7.getCountAnimation()     // Catch: java.lang.Exception -> L8a
            float r12 = (float) r12     // Catch: java.lang.Exception -> L8a
            float r12 = r9 / r12
            float r5 = (float) r13     // Catch: java.lang.Exception -> L8a
            float r5 = r5 * r12
            float r5 = r9 - r5
            int r13 = r13 + r2
            float r13 = (float) r13     // Catch: java.lang.Exception -> L8a
            float r13 = r13 * r12
            float r9 = r9 - r13
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 < 0) goto L88
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 >= 0) goto L73
            goto L88
        L73:
            float[] r12 = new float[r0]     // Catch: java.lang.Exception -> L8a
            r12[r1] = r5     // Catch: java.lang.Exception -> L8a
            r12[r2] = r9     // Catch: java.lang.Exception -> L8a
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r3, r12)     // Catch: java.lang.Exception -> L8a
            r7.f109l = r8     // Catch: java.lang.Exception -> L8a
            r8.setDuration(r10)     // Catch: java.lang.Exception -> L8a
            android.animation.ObjectAnimator r8 = r7.f109l     // Catch: java.lang.Exception -> L8a
            r8.start()     // Catch: java.lang.Exception -> L8a
            return
        L88:
            r7.E = r2     // Catch: java.lang.Exception -> L8a
        L8a:
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.widget.TwistView r0) {
            r0.a()
            return
    }

    private void c() {
            r1 = this;
            int r0 = com.beizi.fusion.R.id.beizi_twist_go_imageview     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            r1.a = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_shake_total_layout     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            r1.d = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_total_layout     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            r1.b = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_right_total_layout     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            r1.c = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_title_text     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L64
            r1.i = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_describe_text     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L64
            r1.j = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_right_first_image     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            com.beizi.fusion.widget.BackArrowView r0 = (com.beizi.fusion.widget.BackArrowView) r0     // Catch: java.lang.Exception -> L64
            r1.e = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_right_second_image     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            com.beizi.fusion.widget.BackArrowView r0 = (com.beizi.fusion.widget.BackArrowView) r0     // Catch: java.lang.Exception -> L64
            r1.f = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_right_third_image     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            com.beizi.fusion.widget.BackArrowView r0 = (com.beizi.fusion.widget.BackArrowView) r0     // Catch: java.lang.Exception -> L64
            r1.g = r0     // Catch: java.lang.Exception -> L64
            int r0 = com.beizi.fusion.R.id.beizi_twist_top_view     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r1.findViewById(r0)     // Catch: java.lang.Exception -> L64
            com.beizi.fusion.widget.ShakeView r0 = (com.beizi.fusion.widget.ShakeView) r0     // Catch: java.lang.Exception -> L64
            r1.h = r0     // Catch: java.lang.Exception -> L64
            r0.updateTwistRollAnim()     // Catch: java.lang.Exception -> L64
            java.lang.String r0 = "#d9333333"
            r1.setTwistTotalLayoutBg(r0)     // Catch: java.lang.Exception -> L64
        L64:
            return
    }

    static /* synthetic */ boolean c(com.beizi.fusion.widget.TwistView r0) {
            boolean r0 = r0.I
            return r0
    }

    static /* synthetic */ android.os.Handler d(com.beizi.fusion.widget.TwistView r0) {
            android.os.Handler r0 = r0.J
            return r0
    }

    private void d() {
            r1 = this;
            com.beizi.fusion.widget.ShakeView r0 = r1.h     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.startShake()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    static /* synthetic */ int e(com.beizi.fusion.widget.TwistView r0) {
            int r0 = r0.getCountAnimation()
            return r0
    }

    private void e() {
            r7 = this;
            java.util.Timer r0 = r7.f121x     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer     // Catch: java.lang.Exception -> L21
            r0.<init>()     // Catch: java.lang.Exception -> L21
            r7.f121x = r0     // Catch: java.lang.Exception -> L21
        Lb:
            java.util.TimerTask r0 = r7.f122y     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto L16
            com.beizi.fusion.widget.TwistView$6 r0 = new com.beizi.fusion.widget.TwistView$6     // Catch: java.lang.Exception -> L21
            r0.<init>(r7)     // Catch: java.lang.Exception -> L21
            r7.f122y = r0     // Catch: java.lang.Exception -> L21
        L16:
            java.util.Timer r1 = r7.f121x     // Catch: java.lang.Exception -> L21
            java.util.TimerTask r2 = r7.f122y     // Catch: java.lang.Exception -> L21
            r3 = 0
            r5 = 500(0x1f4, double:2.47E-321)
            r1.schedule(r2, r3, r5)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    static /* synthetic */ com.beizi.fusion.widget.TwistView.a f(com.beizi.fusion.widget.TwistView r0) {
            com.beizi.fusion.widget.TwistView$a r0 = r0.C
            return r0
    }

    private boolean f() {
            r2 = this;
            int r0 = r2.B
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean g(com.beizi.fusion.widget.TwistView r0) {
            boolean r0 = r0.f()
            return r0
    }

    private int getCountAnimation() {
            r4 = this;
            long r0 = r4.f118u
            r2 = 100
            long r0 = r0 / r2
            int r1 = (int) r0
            return r1
    }

    public void cancelArrowTimerTask() {
            r2 = this;
            java.util.Timer r0 = r2.f121x     // Catch: java.lang.Exception -> L13
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()     // Catch: java.lang.Exception -> L13
            r2.f121x = r1     // Catch: java.lang.Exception -> L13
        La:
            java.util.TimerTask r0 = r2.f122y     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            r0.cancel()     // Catch: java.lang.Exception -> L13
            r2.f122y = r1     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    public void cancelTwistTimerTask() {
            r2 = this;
            java.util.Timer r0 = r2.f119v     // Catch: java.lang.Exception -> L13
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()     // Catch: java.lang.Exception -> L13
            r2.f119v = r1     // Catch: java.lang.Exception -> L13
        La:
            java.util.TimerTask r0 = r2.f120w     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            r0.cancel()     // Catch: java.lang.Exception -> L13
            r2.f120w = r1     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    public void destroyView() {
            r1 = this;
            com.beizi.fusion.widget.ShakeView r0 = r1.h     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L7
            r0.stopShake()     // Catch: java.lang.Exception -> L10
        L7:
            r1.cancelTwistTimerTask()     // Catch: java.lang.Exception -> L10
            r1.cancelArrowTimerTask()     // Catch: java.lang.Exception -> L10
            r1.removeHandlerMsg()     // Catch: java.lang.Exception -> L10
        L10:
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public void hideTargetView(android.view.View r6, long r7, int r9) {
            r5 = this;
            int r0 = r6.getRight()     // Catch: java.lang.Exception -> L43
            int r1 = r6.getTop()     // Catch: java.lang.Exception -> L43
            int r2 = r6.getBottom()     // Catch: java.lang.Exception -> L43
            int r1 = r1 + r2
            int r1 = r1 / 2
            int r2 = r6.getWidth()     // Catch: java.lang.Exception -> L43
            int r3 = r6.getHeight()     // Catch: java.lang.Exception -> L43
            int r2 = java.lang.Math.max(r2, r3)     // Catch: java.lang.Exception -> L43
            float r2 = (float) r2     // Catch: java.lang.Exception -> L43
            int r3 = r5.getCountAnimation()     // Catch: java.lang.Exception -> L43
            float r3 = (float) r3     // Catch: java.lang.Exception -> L43
            float r3 = r2 / r3
            float r4 = (float) r9     // Catch: java.lang.Exception -> L43
            float r4 = r4 * r3
            float r4 = r2 - r4
            int r9 = r9 + 1
            float r9 = (float) r9     // Catch: java.lang.Exception -> L43
            float r3 = r3 * r9
            float r2 = r2 - r3
            android.animation.Animator r9 = android.view.ViewAnimationUtils.createCircularReveal(r6, r0, r1, r4, r2)     // Catch: java.lang.Exception -> L43
            r9.setDuration(r7)     // Catch: java.lang.Exception -> L43
            r6.clearAnimation()     // Catch: java.lang.Exception -> L43
            com.beizi.fusion.widget.TwistView$8 r6 = new com.beizi.fusion.widget.TwistView$8     // Catch: java.lang.Exception -> L43
            r6.<init>(r5)     // Catch: java.lang.Exception -> L43
            r9.addListener(r6)     // Catch: java.lang.Exception -> L43
            r9.start()     // Catch: java.lang.Exception -> L43
        L43:
            return
    }

    public void removeHandlerMsg() {
            r2 = this;
            android.os.Handler r0 = r2.J     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto La
            r1 = 0
            r0.removeCallbacks(r1)     // Catch: java.lang.Exception -> La
            r2.J = r1     // Catch: java.lang.Exception -> La
        La:
            return
    }

    public void setDescribeText(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.j     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setText(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setDurationAnimation(long r1) {
            r0 = this;
            r0.f118u = r1
            return
    }

    public void setJumpClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            android.view.View r0 = r1.d
            if (r0 == 0) goto L7
            r0.setOnClickListener(r2)
        L7:
            return
    }

    public void setJumpOnTouchListener(android.view.View.OnTouchListener r2) {
            r1 = this;
            android.view.View r0 = r1.d
            if (r0 == 0) goto L7
            r0.setOnTouchListener(r2)
        L7:
            return
    }

    public void setMainTitleText(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.i     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setText(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setRotationEndCallback(com.beizi.fusion.widget.TwistView.a r1) {
            r0 = this;
            r0.C = r1
            return
    }

    public void setTwistTotalLayoutBg(java.lang.String r5) {
            r4 = this;
            android.view.View r0 = r4.d
            if (r0 == 0) goto L24
            java.lang.String r1 = ""
            r2 = 100
            r3 = 0
            com.beizi.fusion.tool.am.a(r0, r5, r3, r1, r2)     // Catch: java.lang.Exception -> Ld
            return
        Ld:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " e : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "TwistView"
            com.beizi.fusion.tool.aa.b(r0, r5)
        L24:
            return
    }

    public void setTwistTotalLayoutWidthAndHeight(int r6, int r7) {
            r5 = this;
            android.view.View r0 = r5.d     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L4b
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L4b
            r0.width = r6     // Catch: java.lang.Exception -> L4b
            android.content.Context r6 = r5.getContext()     // Catch: java.lang.Exception -> L4b
            int r1 = r5.H     // Catch: java.lang.Exception -> L4b
            float r1 = (float) r1     // Catch: java.lang.Exception -> L4b
            int r6 = com.beizi.fusion.tool.ap.a(r6, r1)     // Catch: java.lang.Exception -> L4b
            int r7 = r7 - r6
            r0.height = r7     // Catch: java.lang.Exception -> L4b
            android.view.View r6 = r5.d     // Catch: java.lang.Exception -> L4b
            android.content.Context r7 = r5.getContext()     // Catch: java.lang.Exception -> L4b
            r1 = 0
            int r7 = com.beizi.fusion.tool.ap.a(r7, r1)     // Catch: java.lang.Exception -> L4b
            android.content.Context r2 = r5.getContext()     // Catch: java.lang.Exception -> L4b
            int r3 = r5.F     // Catch: java.lang.Exception -> L4b
            float r3 = (float) r3     // Catch: java.lang.Exception -> L4b
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L4b
            android.content.Context r3 = r5.getContext()     // Catch: java.lang.Exception -> L4b
            int r1 = com.beizi.fusion.tool.ap.a(r3, r1)     // Catch: java.lang.Exception -> L4b
            android.content.Context r3 = r5.getContext()     // Catch: java.lang.Exception -> L4b
            int r4 = r5.F     // Catch: java.lang.Exception -> L4b
            float r4 = (float) r4     // Catch: java.lang.Exception -> L4b
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)     // Catch: java.lang.Exception -> L4b
            r6.setPadding(r7, r2, r1, r3)     // Catch: java.lang.Exception -> L4b
            android.view.View r6 = r5.d     // Catch: java.lang.Exception -> L4b
            r6.setLayoutParams(r0)     // Catch: java.lang.Exception -> L4b
        L4b:
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public void showTargetView(android.view.View r6, long r7, int r9) {
            r5 = this;
            int r0 = r6.getRight()     // Catch: java.lang.Exception -> L41
            int r1 = r6.getTop()     // Catch: java.lang.Exception -> L41
            int r2 = r6.getBottom()     // Catch: java.lang.Exception -> L41
            int r1 = r1 + r2
            int r1 = r1 / 2
            int r2 = r6.getWidth()     // Catch: java.lang.Exception -> L41
            int r3 = r6.getHeight()     // Catch: java.lang.Exception -> L41
            int r2 = java.lang.Math.max(r2, r3)     // Catch: java.lang.Exception -> L41
            float r2 = (float) r2     // Catch: java.lang.Exception -> L41
            int r3 = r5.getCountAnimation()     // Catch: java.lang.Exception -> L41
            float r3 = (float) r3     // Catch: java.lang.Exception -> L41
            float r2 = r2 / r3
            float r3 = (float) r9     // Catch: java.lang.Exception -> L41
            float r3 = r3 * r2
            r4 = 0
            float r3 = r3 + r4
            int r4 = r9 + 1
            float r4 = (float) r4     // Catch: java.lang.Exception -> L41
            float r2 = r2 * r4
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r6, r0, r1, r3, r2)     // Catch: java.lang.Exception -> L41
            r0.setDuration(r7)     // Catch: java.lang.Exception -> L41
            r6.clearAnimation()     // Catch: java.lang.Exception -> L41
            com.beizi.fusion.widget.TwistView$7 r6 = new com.beizi.fusion.widget.TwistView$7     // Catch: java.lang.Exception -> L41
            r6.<init>(r5, r9)     // Catch: java.lang.Exception -> L41
            r0.addListener(r6)     // Catch: java.lang.Exception -> L41
            r0.start()     // Catch: java.lang.Exception -> L41
        L41:
            return
    }

    public void startTwistTimerTask() {
            r7 = this;
            java.util.Timer r0 = r7.f119v     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer     // Catch: java.lang.Exception -> L21
            r0.<init>()     // Catch: java.lang.Exception -> L21
            r7.f119v = r0     // Catch: java.lang.Exception -> L21
        Lb:
            java.util.TimerTask r0 = r7.f120w     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto L16
            com.beizi.fusion.widget.TwistView$2 r0 = new com.beizi.fusion.widget.TwistView$2     // Catch: java.lang.Exception -> L21
            r0.<init>(r7)     // Catch: java.lang.Exception -> L21
            r7.f120w = r0     // Catch: java.lang.Exception -> L21
        L16:
            java.util.Timer r1 = r7.f119v     // Catch: java.lang.Exception -> L21
            java.util.TimerTask r2 = r7.f120w     // Catch: java.lang.Exception -> L21
            r3 = 0
            r5 = 100
            r1.scheduleAtFixedRate(r2, r3, r5)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    public void updateRollStatus(int r1) {
            r0 = this;
            r0.D = r1
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public void updateStatus(int r11) {
            r10 = this;
            if (r11 != 0) goto L4
        L2:
            r3 = r10
            goto L47
        L4:
            int r0 = r10.getCountAnimation()     // Catch: java.lang.Throwable -> L2
            int r1 = r10.B     // Catch: java.lang.Throwable -> L2
            r2 = 0
            if (r1 != r11) goto Le
            goto L1d
        Le:
            boolean r1 = r10.E     // Catch: java.lang.Throwable -> L2
            if (r1 == 0) goto L15
            r10.A = r2     // Catch: java.lang.Throwable -> L2
            goto L1b
        L15:
            int r1 = r10.A     // Catch: java.lang.Throwable -> L2
            int r1 = r0 - r1
            r10.A = r1     // Catch: java.lang.Throwable -> L2
        L1b:
            r10.B = r11     // Catch: java.lang.Throwable -> L2
        L1d:
            int r1 = r10.A     // Catch: java.lang.Throwable -> L2
            if (r1 >= 0) goto L23
            r10.A = r2     // Catch: java.lang.Throwable -> L2
        L23:
            int r1 = r10.A     // Catch: java.lang.Throwable -> L2
            if (r1 < r0) goto L30
            boolean r1 = r10.E     // Catch: java.lang.Throwable -> L2
            if (r1 == 0) goto L2e
            r10.A = r2     // Catch: java.lang.Throwable -> L2
            goto L30
        L2e:
            r10.A = r0     // Catch: java.lang.Throwable -> L2
        L30:
            int r9 = r10.A     // Catch: java.lang.Throwable -> L2
            if (r9 < 0) goto L2
            if (r9 > r0) goto L2
            android.view.View r4 = r10.b     // Catch: java.lang.Throwable -> L2
            android.view.View r5 = r10.a     // Catch: java.lang.Throwable -> L2
            r6 = 100
            r3 = r10
            r8 = r11
            r3.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L47
            int r11 = r3.A     // Catch: java.lang.Throwable -> L47
            int r11 = r11 + 1
            r3.A = r11     // Catch: java.lang.Throwable -> L47
        L47:
            return
    }
}
