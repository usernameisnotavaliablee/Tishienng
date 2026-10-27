package com.acse.ottn.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ActivityIndicatorView extends android.view.View {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2862b;

    /* renamed from: c, reason: collision with root package name */
    public float f2863c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2864d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2866f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2867g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f2868h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f2869i;

    /* renamed from: j, reason: collision with root package name */
    public android.os.Handler f2870j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f2871k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.widget.ActivityIndicatorView a;

        public a(com.acse.ottn.widget.ActivityIndicatorView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.acse.ottn.widget.ActivityIndicatorView r0 = r4.a
                r1 = 30
                com.acse.ottn.widget.ActivityIndicatorView.a(r0, r1)
                com.acse.ottn.widget.ActivityIndicatorView r0 = r4.a
                r0.invalidate()
                com.acse.ottn.widget.ActivityIndicatorView r0 = r4.a
                android.os.Handler r0 = com.acse.ottn.widget.ActivityIndicatorView.b(r0)
                com.acse.ottn.widget.ActivityIndicatorView r1 = r4.a
                java.lang.Runnable r1 = com.acse.ottn.widget.ActivityIndicatorView.a(r1)
                r2 = 100
                r0.postDelayed(r1, r2)
                return
        }
    }

    public ActivityIndicatorView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActivityIndicatorView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActivityIndicatorView(android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            r0 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r0, r0, r0)
            r3.a = r0
            r0 = 0
            r3.f2862b = r0
            r1 = 0
            r3.f2863c = r1
            r1 = 12
            r3.f2865e = r1
            r3.f2866f = r0
            r2 = 30
            r3.f2867g = r2
            int[] r1 = new int[r1]
            r3.f2868h = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r3.f2870j = r1
            com.acse.ottn.widget.ActivityIndicatorView$a r1 = new com.acse.ottn.widget.ActivityIndicatorView$a
            r1.<init>(r3)
            r3.f2871k = r1
            r3.a(r4, r5, r6, r0)
            return
    }

    public static /* synthetic */ int a(com.acse.ottn.widget.ActivityIndicatorView r1, int r2) {
            int r0 = r1.f2862b
            int r0 = r0 + r2
            r1.f2862b = r0
            return r0
    }

    public static /* synthetic */ java.lang.Runnable a(com.acse.ottn.widget.ActivityIndicatorView r0) {
            java.lang.Runnable r0 = r0.f2871k
            return r0
    }

    public static /* synthetic */ android.os.Handler b(com.acse.ottn.widget.ActivityIndicatorView r0) {
            android.os.Handler r0 = r0.f2870j
            return r0
    }

    public final float a(int r5, float r6) {
            r4 = this;
            double r0 = (double) r6
            double r5 = (double) r5
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 * r2
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 / r2
            double r5 = java.lang.Math.cos(r5)
            double r0 = r0 * r5
            float r5 = (float) r0
            return r5
    }

    public final void a() {
            r8 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r8.f2869i = r0
            int r0 = r8.a
            int r0 = android.graphics.Color.alpha(r0)
            int r1 = r8.a
            int r1 = android.graphics.Color.red(r1)
            int r2 = r8.a
            int r2 = android.graphics.Color.green(r2)
            int r3 = r8.a
            int r3 = android.graphics.Color.blue(r3)
            int r4 = java.lang.Math.abs(r0)
            int r4 = r4 / 12
            r5 = 0
        L27:
            int[] r6 = r8.f2868h
            int r7 = r6.length
            if (r5 >= r7) goto L39
            int r7 = r4 * r5
            int r7 = r0 - r7
            int r7 = android.graphics.Color.argb(r7, r1, r2, r3)
            r6[r5] = r7
            int r5 = r5 + 1
            goto L27
        L39:
            android.graphics.Paint r0 = r8.f2869i
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            return
    }

    public final void a(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            int[] r0 = com.acse.ottn.R.styleable.ActivityIndicatorView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            int r3 = com.acse.ottn.R.styleable.ActivityIndicatorView_aiv_color
            int r4 = r1.a
            int r3 = r2.getColor(r3, r4)
            r1.a = r3
            int r3 = com.acse.ottn.R.styleable.ActivityIndicatorView_aiv_startAngle
            int r4 = r1.f2862b
            int r3 = r2.getInt(r3, r4)
            r1.f2862b = r3
            int r3 = com.acse.ottn.R.styleable.ActivityIndicatorView_aiv_strokeWidth
            float r4 = r1.f2863c
            float r3 = r2.getDimension(r3, r4)
            r1.f2863c = r3
            int r3 = com.acse.ottn.R.styleable.ActivityIndicatorView_aiv_auto_start
            r4 = 1
            boolean r3 = r2.getBoolean(r3, r4)
            r1.f2864d = r3
            r2.recycle()
            r1.a()
            return
    }

    public final float b(int r5, float r6) {
            r4 = this;
            double r0 = (double) r6
            double r5 = (double) r5
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 * r2
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 / r2
            double r5 = java.lang.Math.sin(r5)
            double r0 = r0 * r5
            float r5 = (float) r0
            return r5
    }

    public void b() {
            r2 = this;
            android.os.Handler r0 = r2.f2870j
            java.lang.Runnable r1 = r2.f2871k
            r0.post(r1)
            return
    }

    public void c() {
            r2 = this;
            android.os.Handler r0 = r2.f2870j
            java.lang.Runnable r1 = r2.f2871k
            r0.removeCallbacks(r1)
            return
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.f2864d
            if (r0 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.os.Handler r0 = r1.f2870j
            if (r0 == 0) goto La
            r1.c()
        La:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r17) {
            r16 = this;
            r0 = r16
            super.onDraw(r17)
            int r1 = r0.getWidth()
            int r1 = r1 / 2
            int r2 = r0.getHeight()
            int r2 = r2 / 2
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.getHeight()
            int r5 = r0.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r0.getPaddingBottom()
            int r4 = r4 - r5
            int r3 = java.lang.Math.min(r3, r4)
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r4 = r0.f2863c
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L4a
            float r4 = r3 / r6
            r5 = 15
            float r4 = r0.a(r5, r4)
            float r4 = r4 / r6
            r0.f2863c = r4
        L4a:
            android.graphics.Paint r4 = r0.f2869i
            float r5 = r0.f2863c
            r4.setStrokeWidth(r5)
            r4 = 0
        L52:
            int[] r5 = r0.f2868h
            int r7 = r5.length
            if (r4 >= r7) goto L9c
            android.graphics.Paint r7 = r0.f2869i
            r5 = r5[r4]
            r7.setColor(r5)
            float r5 = (float) r1
            int r7 = r4 * (-30)
            int r8 = r0.f2862b
            int r8 = r8 + r7
            float r9 = r3 / r6
            float r8 = r0.a(r8, r9)
            float r11 = r5 + r8
            float r8 = (float) r2
            int r10 = r0.f2862b
            int r10 = r10 + r7
            float r9 = r0.b(r10, r9)
            float r12 = r8 + r9
            int r9 = r0.f2862b
            int r9 = r9 + r7
            float r10 = r0.f2863c
            float r10 = r10 / r6
            float r10 = r3 - r10
            float r9 = r0.a(r9, r10)
            float r13 = r5 + r9
            int r5 = r0.f2862b
            int r7 = r7 + r5
            float r5 = r0.f2863c
            float r5 = r5 / r6
            float r5 = r3 - r5
            float r5 = r0.b(r7, r5)
            float r14 = r8 + r5
            android.graphics.Paint r15 = r0.f2869i
            r10 = r17
            r10.drawLine(r11, r12, r13, r14, r15)
            int r4 = r4 + 1
            goto L52
        L9c:
            return
    }

    public void setColor(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setStartAngle(int r1) {
            r0 = this;
            r0.f2862b = r1
            return
    }

    public void setStrokeWidth(float r1) {
            r0 = this;
            r0.f2863c = r1
            return
    }
}
