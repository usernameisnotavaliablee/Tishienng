package com.yalantis.ucrop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UCropActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final int T0 = 90;
    public static final android.graphics.Bitmap.CompressFormat U0 = null;
    public static final int V0 = 0;
    public static final int W0 = 1;
    public static final int X0 = 2;
    public static final int Y0 = 3;
    private static final java.lang.String Z0 = "UCropActivity";
    private static final long a1 = 50;
    private static final int b1 = 3;
    private static final int c1 = 15000;
    private static final int d1 = 42;
    private android.view.ViewGroup F0;
    private android.view.ViewGroup G0;
    private android.view.ViewGroup H0;
    private android.view.ViewGroup I0;
    private java.util.List<android.view.ViewGroup> J0;
    private android.widget.TextView K0;
    private android.widget.TextView L0;
    private android.view.View M0;
    private androidx.transition.Transition N0;
    private java.lang.String O;
    private android.graphics.Bitmap.CompressFormat O0;
    private int P;
    private int P0;
    private int Q;
    private int[] Q0;
    private int R;
    private com.yalantis.ucrop.view.TransformImageView.b R0;
    private int S;
    private final android.view.View.OnClickListener S0;
    private int T;

    @androidx.annotation.ColorInt
    private int U;

    @androidx.annotation.DrawableRes
    private int V;

    @androidx.annotation.DrawableRes
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private com.yalantis.ucrop.view.UCropView a0;
    private com.yalantis.ucrop.view.GestureCropImageView b0;
    private com.yalantis.ucrop.view.OverlayView c0;
    private android.view.ViewGroup k0;
    private android.view.ViewGroup p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.yalantis.ucrop.view.TransformImageView.b {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        a(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void a() {
                r3 = this;
                com.yalantis.ucrop.UCropActivity r0 = r3.a
                com.yalantis.ucrop.view.UCropView r0 = com.yalantis.ucrop.UCropActivity.g(r0)
                android.view.ViewPropertyAnimator r0 = r0.animate()
                r1 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
                r1 = 300(0x12c, double:1.48E-321)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
                android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
                r1.<init>()
                r0.setInterpolator(r1)
                com.yalantis.ucrop.UCropActivity r0 = r3.a
                android.view.View r0 = com.yalantis.ucrop.UCropActivity.h(r0)
                r1 = 0
                r0.setClickable(r1)
                com.yalantis.ucrop.UCropActivity r0 = r3.a
                com.yalantis.ucrop.UCropActivity.i(r0, r1)
                com.yalantis.ucrop.UCropActivity r0 = r3.a
                r0.supportInvalidateOptionsMenu()
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void b(@androidx.annotation.NonNull java.lang.Exception r2) {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                r0.X(r2)
                com.yalantis.ucrop.UCropActivity r2 = r1.a
                r2.finish()
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void c(float r2) {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                com.yalantis.ucrop.UCropActivity.f(r0, r2)
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void d(float r2) {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                com.yalantis.ucrop.UCropActivity.e(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        b(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                com.yalantis.ucrop.UCropActivity r0 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropActivity.j(r0)
                r1 = r5
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = 0
                android.view.View r1 = r1.getChildAt(r2)
                com.yalantis.ucrop.view.widget.AspectRatioTextView r1 = (com.yalantis.ucrop.view.widget.AspectRatioTextView) r1
                boolean r3 = r5.isSelected()
                float r1 = r1.b(r3)
                r0.setTargetAspectRatio(r1)
                com.yalantis.ucrop.UCropActivity r0 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropActivity.j(r0)
                r0.y()
                boolean r0 = r5.isSelected()
                if (r0 != 0) goto L49
                com.yalantis.ucrop.UCropActivity r0 = r4.a
                java.util.List r0 = com.yalantis.ucrop.UCropActivity.k(r0)
                java.util.Iterator r0 = r0.iterator()
            L34:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L49
                java.lang.Object r1 = r0.next()
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                if (r1 != r5) goto L44
                r3 = 1
                goto L45
            L44:
                r3 = 0
            L45:
                r1.setSelected(r3)
                goto L34
            L49:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        c(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropActivity.j(r0)
                r0.y()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropActivity.j(r0)
                r0.s()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void onScroll(float r2, float r3) {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r3 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r3 = com.yalantis.ucrop.UCropActivity.j(r3)
                r0 = 1109917696(0x42280000, float:42.0)
                float r2 = r2 / r0
                r3.w(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.view.View.OnClickListener {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        d(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.yalantis.ucrop.UCropActivity r1 = r0.a
                com.yalantis.ucrop.UCropActivity.l(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements android.view.View.OnClickListener {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        e(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r2 = r1.a
                r0 = 90
                com.yalantis.ucrop.UCropActivity.m(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        f(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropActivity.j(r0)
                r0.y()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropActivity.j(r0)
                r0.s()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void onScroll(float r5, float r6) {
                r4 = this;
                r6 = 0
                r0 = 1181376512(0x466a6000, float:15000.0)
                int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r6 <= 0) goto L35
                com.yalantis.ucrop.UCropActivity r6 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r6 = com.yalantis.ucrop.UCropActivity.j(r6)
                com.yalantis.ucrop.UCropActivity r1 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r1 = com.yalantis.ucrop.UCropActivity.j(r1)
                float r1 = r1.getCurrentScale()
                com.yalantis.ucrop.UCropActivity r2 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r2 = com.yalantis.ucrop.UCropActivity.j(r2)
                float r2 = r2.getMaxScale()
                com.yalantis.ucrop.UCropActivity r3 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r3 = com.yalantis.ucrop.UCropActivity.j(r3)
                float r3 = r3.getMinScale()
                float r2 = r2 - r3
                float r2 = r2 / r0
                float r5 = r5 * r2
                float r1 = r1 + r5
                r6.B(r1)
                return
            L35:
                com.yalantis.ucrop.UCropActivity r6 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r6 = com.yalantis.ucrop.UCropActivity.j(r6)
                com.yalantis.ucrop.UCropActivity r1 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r1 = com.yalantis.ucrop.UCropActivity.j(r1)
                float r1 = r1.getCurrentScale()
                com.yalantis.ucrop.UCropActivity r2 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r2 = com.yalantis.ucrop.UCropActivity.j(r2)
                float r2 = r2.getMaxScale()
                com.yalantis.ucrop.UCropActivity r3 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r3 = com.yalantis.ucrop.UCropActivity.j(r3)
                float r3 = r3.getMinScale()
                float r2 = r2 - r3
                float r2 = r2 / r0
                float r5 = r5 * r2
                float r1 = r1 + r5
                r6.D(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements android.view.View.OnClickListener {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        g(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                boolean r0 = r2.isSelected()
                if (r0 != 0) goto Lf
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                int r2 = r2.getId()
                com.yalantis.ucrop.UCropActivity.L(r0, r2)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements e3.a {
        final /* synthetic */ com.yalantis.ucrop.UCropActivity a;

        h(com.yalantis.ucrop.UCropActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // e3.a
        public void a(@androidx.annotation.NonNull android.net.Uri r8, int r9, int r10, int r11, int r12) {
                r7 = this;
                com.yalantis.ucrop.UCropActivity r0 = r7.a
                com.yalantis.ucrop.view.GestureCropImageView r1 = com.yalantis.ucrop.UCropActivity.j(r0)
                float r2 = r1.getTargetAspectRatio()
                r1 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.Y(r1, r2, r3, r4, r5, r6)
                com.yalantis.ucrop.UCropActivity r8 = r7.a
                r8.finish()
                return
        }

        @Override // e3.a
        public void b(@androidx.annotation.NonNull java.lang.Throwable r2) {
                r1 = this;
                com.yalantis.ucrop.UCropActivity r0 = r1.a
                r0.X(r2)
                com.yalantis.ucrop.UCropActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    static {
            r0 = 43725(0xaacd, float:6.1272E-41)
            com.stub.StubApp.interface11(r0)
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            com.yalantis.ucrop.UCropActivity.U0 = r0
            return
    }

    public UCropActivity() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.Z = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.J0 = r1
            android.graphics.Bitmap$CompressFormat r1 = com.yalantis.ucrop.UCropActivity.U0
            r3.O0 = r1
            r1 = 90
            r3.P0 = r1
            r1 = 2
            r2 = 3
            int[] r0 = new int[]{r0, r1, r2}
            r3.Q0 = r0
            com.yalantis.ucrop.UCropActivity$a r0 = new com.yalantis.ucrop.UCropActivity$a
            r0.<init>(r3)
            r3.R0 = r0
            com.yalantis.ucrop.UCropActivity$g r0 = new com.yalantis.ucrop.UCropActivity$g
            r0.<init>(r3)
            r3.S0 = r0
            return
    }

    static /* synthetic */ void L(com.yalantis.ucrop.UCropActivity r0, int r1) {
            r0.b0(r1)
            return
    }

    private void M() {
            r3 = this;
            android.view.View r0 = r3.M0
            if (r0 != 0) goto L22
            android.view.View r0 = new android.view.View
            r0.<init>(r3)
            r3.M0 = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r1 = 3
            int r2 = com.yalantis.ucrop.R.id.toolbar
            r0.addRule(r1, r2)
            android.view.View r1 = r3.M0
            r1.setLayoutParams(r0)
            android.view.View r0 = r3.M0
            r1 = 1
            r0.setClickable(r1)
        L22:
            int r0 = com.yalantis.ucrop.R.id.ucrop_photobox
            android.view.View r0 = r3.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.view.View r1 = r3.M0
            r0.addView(r1)
            return
    }

    private void N(int r5) {
            r4 = this;
            int r0 = com.yalantis.ucrop.R.id.ucrop_photobox
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.transition.Transition r1 = r4.N0
            androidx.transition.TransitionManager.beginDelayedTransition(r0, r1)
            android.view.ViewGroup r0 = r4.F0
            int r1 = com.yalantis.ucrop.R.id.text_view_scale
            android.view.View r0 = r0.findViewById(r1)
            int r1 = com.yalantis.ucrop.R.id.state_scale
            r2 = 8
            r3 = 0
            if (r5 != r1) goto L1e
            r1 = 0
            goto L20
        L1e:
            r1 = 8
        L20:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r4.k0
            int r1 = com.yalantis.ucrop.R.id.text_view_crop
            android.view.View r0 = r0.findViewById(r1)
            int r1 = com.yalantis.ucrop.R.id.state_aspect_ratio
            if (r5 != r1) goto L31
            r1 = 0
            goto L33
        L31:
            r1 = 8
        L33:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r4.p0
            int r1 = com.yalantis.ucrop.R.id.text_view_rotate
            android.view.View r0 = r0.findViewById(r1)
            int r1 = com.yalantis.ucrop.R.id.state_rotate
            if (r5 != r1) goto L43
            r2 = 0
        L43:
            r0.setVisibility(r2)
            return
    }

    private void P() {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.id.ucrop
            android.view.View r0 = r3.findViewById(r0)
            com.yalantis.ucrop.view.UCropView r0 = (com.yalantis.ucrop.view.UCropView) r0
            r3.a0 = r0
            com.yalantis.ucrop.view.GestureCropImageView r0 = r0.getCropImageView()
            r3.b0 = r0
            com.yalantis.ucrop.view.UCropView r0 = r3.a0
            com.yalantis.ucrop.view.OverlayView r0 = r0.getOverlayView()
            r3.c0 = r0
            com.yalantis.ucrop.view.GestureCropImageView r0 = r3.b0
            com.yalantis.ucrop.view.TransformImageView$b r1 = r3.R0
            r0.setTransformImageListener(r1)
            int r0 = com.yalantis.ucrop.R.id.image_view_logo
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r1 = r3.X
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setColorFilter(r1, r2)
            int r0 = com.yalantis.ucrop.R.id.ucrop_frame
            android.view.View r0 = r3.findViewById(r0)
            int r1 = r3.U
            r0.setBackgroundColor(r1)
            return
    }

    private void Q(@androidx.annotation.NonNull android.content.Intent r8) {
            r7 = this;
            java.lang.String r0 = "com.yalantis.ucrop.CompressionFormatName"
            java.lang.String r0 = r8.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L11
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.valueOf(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L16
            android.graphics.Bitmap$CompressFormat r0 = com.yalantis.ucrop.UCropActivity.U0
        L16:
            r7.O0 = r0
            java.lang.String r0 = "com.yalantis.ucrop.CompressionQuality"
            r1 = 90
            int r0 = r8.getIntExtra(r0, r1)
            r7.P0 = r0
            java.lang.String r0 = "com.yalantis.ucrop.AllowedGestures"
            int[] r0 = r8.getIntArrayExtra(r0)
            if (r0 == 0) goto L30
            int r1 = r0.length
            r2 = 3
            if (r1 != r2) goto L30
            r7.Q0 = r0
        L30:
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.b0
            java.lang.String r1 = "com.yalantis.ucrop.MaxBitmapSize"
            r2 = 0
            int r1 = r8.getIntExtra(r1, r2)
            r0.setMaxBitmapSize(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.b0
            java.lang.String r1 = "com.yalantis.ucrop.MaxScaleMultiplier"
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r8.getFloatExtra(r1, r3)
            r0.setMaxScaleMultiplier(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.b0
            java.lang.String r1 = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration"
            r3 = 500(0x1f4, float:7.0E-43)
            int r1 = r8.getIntExtra(r1, r3)
            long r3 = (long) r1
            r0.setImageToWrapCropBoundsAnimDuration(r3)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            java.lang.String r1 = "com.yalantis.ucrop.FreeStyleCrop"
            boolean r1 = r8.getBooleanExtra(r1, r2)
            r0.setFreestyleCropEnabled(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_default_dimmed
            int r1 = r1.getColor(r3)
            java.lang.String r3 = "com.yalantis.ucrop.DimmedLayerColor"
            int r1 = r8.getIntExtra(r3, r1)
            r0.setDimmedColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            java.lang.String r1 = "com.yalantis.ucrop.CircleDimmedLayer"
            boolean r1 = r8.getBooleanExtra(r1, r2)
            r0.setCircleDimmedLayer(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            java.lang.String r1 = "com.yalantis.ucrop.ShowCropFrame"
            r3 = 1
            boolean r1 = r8.getBooleanExtra(r1, r3)
            r0.setShowCropFrame(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.yalantis.ucrop.R.color.ucrop_color_default_crop_frame
            int r1 = r1.getColor(r4)
            java.lang.String r4 = "com.yalantis.ucrop.CropFrameColor"
            int r1 = r8.getIntExtra(r4, r1)
            r0.setCropFrameColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_frame_stoke_width
            int r1 = r1.getDimensionPixelSize(r4)
            java.lang.String r4 = "com.yalantis.ucrop.CropFrameStrokeWidth"
            int r1 = r8.getIntExtra(r4, r1)
            r0.setCropFrameStrokeWidth(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            java.lang.String r1 = "com.yalantis.ucrop.ShowCropGrid"
            boolean r1 = r8.getBooleanExtra(r1, r3)
            r0.setShowCropGrid(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            java.lang.String r1 = "com.yalantis.ucrop.CropGridRowCount"
            r3 = 2
            int r1 = r8.getIntExtra(r1, r3)
            r0.setCropGridRowCount(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            java.lang.String r1 = "com.yalantis.ucrop.CropGridColumnCount"
            int r1 = r8.getIntExtra(r1, r3)
            r0.setCropGridColumnCount(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_default_crop_grid
            int r1 = r1.getColor(r3)
            java.lang.String r3 = "com.yalantis.ucrop.CropGridColor"
            int r1 = r8.getIntExtra(r3, r1)
            r0.setCropGridColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.c0
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_grid_stoke_width
            int r1 = r1.getDimensionPixelSize(r3)
            java.lang.String r3 = "com.yalantis.ucrop.CropGridStrokeWidth"
            int r1 = r8.getIntExtra(r3, r1)
            r0.setCropGridStrokeWidth(r1)
            java.lang.String r0 = "com.yalantis.ucrop.AspectRatioX"
            r1 = 0
            float r0 = r8.getFloatExtra(r0, r1)
            java.lang.String r3 = "com.yalantis.ucrop.AspectRatioY"
            float r3 = r8.getFloatExtra(r3, r1)
            java.lang.String r4 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
            int r4 = r8.getIntExtra(r4, r2)
            java.lang.String r5 = "com.yalantis.ucrop.AspectRatioOptions"
            java.util.ArrayList r5 = r8.getParcelableArrayListExtra(r5)
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 <= 0) goto L135
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L135
            android.view.ViewGroup r1 = r7.k0
            if (r1 == 0) goto L12e
            r4 = 8
            r1.setVisibility(r4)
        L12e:
            com.yalantis.ucrop.view.GestureCropImageView r1 = r7.b0
            float r0 = r0 / r3
            r1.setTargetAspectRatio(r0)
            goto L15d
        L135:
            if (r5 == 0) goto L158
            int r0 = r5.size()
            if (r4 >= r0) goto L158
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.b0
            java.lang.Object r1 = r5.get(r4)
            com.yalantis.ucrop.model.AspectRatio r1 = (com.yalantis.ucrop.model.AspectRatio) r1
            float r1 = r1.b()
            java.lang.Object r3 = r5.get(r4)
            com.yalantis.ucrop.model.AspectRatio r3 = (com.yalantis.ucrop.model.AspectRatio) r3
            float r3 = r3.c()
            float r1 = r1 / r3
            r0.setTargetAspectRatio(r1)
            goto L15d
        L158:
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.b0
            r0.setTargetAspectRatio(r1)
        L15d:
            java.lang.String r0 = "com.yalantis.ucrop.MaxSizeX"
            int r0 = r8.getIntExtra(r0, r2)
            java.lang.String r1 = "com.yalantis.ucrop.MaxSizeY"
            int r8 = r8.getIntExtra(r1, r2)
            if (r0 <= 0) goto L177
            if (r8 <= 0) goto L177
            com.yalantis.ucrop.view.GestureCropImageView r1 = r7.b0
            r1.setMaxResultImageSizeX(r0)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.b0
            r0.setMaxResultImageSizeY(r8)
        L177:
            return
    }

    private void R() {
            r2 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.b0
            float r1 = r0.getCurrentAngle()
            float r1 = -r1
            r0.w(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.b0
            r0.y()
            return
    }

    private void S(int r2) {
            r1 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r1.b0
            float r2 = (float) r2
            r0.w(r2)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.b0
            r2.y()
            return
    }

    private void T(int r6) {
            r5 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r5.b0
            int[] r1 = r5.Q0
            r1 = r1[r6]
            r2 = 0
            r3 = 1
            r4 = 3
            if (r1 == r4) goto L10
            if (r1 != r3) goto Le
            goto L10
        Le:
            r1 = 0
            goto L11
        L10:
            r1 = 1
        L11:
            r0.setScaleEnabled(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r5.b0
            int[] r1 = r5.Q0
            r6 = r1[r6]
            if (r6 == r4) goto L1f
            r1 = 2
            if (r6 != r1) goto L20
        L1f:
            r2 = 1
        L20:
            r0.setRotateEnabled(r2)
            return
    }

    private void U(float r5) {
            r4 = this;
            android.widget.TextView r0 = r4.K0
            if (r0 == 0) goto L1b
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "%.1f°"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.setText(r5)
        L1b:
            return
    }

    private void V(@androidx.annotation.NonNull android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = "com.yalantis.ucrop.InputUri"
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r1 = "com.yalantis.ucrop.OutputUri"
            android.os.Parcelable r1 = r3.getParcelableExtra(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            r2.Q(r3)
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
            com.yalantis.ucrop.view.GestureCropImageView r3 = r2.b0     // Catch: java.lang.Exception -> L1d
            r3.m(r0, r1)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r3 = move-exception
            r2.X(r3)
            r2.finish()
            return
        L25:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            int r0 = com.yalantis.ucrop.R.string.ucrop_error_input_data_is_absent
            java.lang.String r0 = r2.getString(r0)
            r3.<init>(r0)
            r2.X(r3)
            r2.finish()
            return
    }

    private void W() {
            r1 = this;
            boolean r0 = r1.Y
            if (r0 == 0) goto L18
            android.view.ViewGroup r0 = r1.k0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            int r0 = com.yalantis.ucrop.R.id.state_aspect_ratio
            r1.b0(r0)
            return
        L12:
            int r0 = com.yalantis.ucrop.R.id.state_scale
            r1.b0(r0)
            return
        L18:
            r0 = 0
            r1.T(r0)
            return
    }

    private void Z(float r5) {
            r4 = this;
            android.widget.TextView r0 = r4.L0
            if (r0 == 0) goto L20
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r2
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "%d%%"
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.setText(r5)
        L20:
            return
    }

    @android.annotation.TargetApi(21)
    private void a0(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto Le
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            r0.setStatusBarColor(r3)
        Le:
            return
    }

    private void b0(@androidx.annotation.IdRes int r8) {
            r7 = this;
            boolean r0 = r7.Y
            if (r0 != 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r7.k0
            int r1 = com.yalantis.ucrop.R.id.state_aspect_ratio
            r2 = 1
            r3 = 0
            if (r8 != r1) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            r0.setSelected(r4)
            android.view.ViewGroup r0 = r7.p0
            int r4 = com.yalantis.ucrop.R.id.state_rotate
            if (r8 != r4) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r0.setSelected(r5)
            android.view.ViewGroup r0 = r7.F0
            int r5 = com.yalantis.ucrop.R.id.state_scale
            if (r8 != r5) goto L27
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            r0.setSelected(r6)
            android.view.ViewGroup r0 = r7.G0
            r6 = 8
            if (r8 != r1) goto L33
            r1 = 0
            goto L35
        L33:
            r1 = 8
        L35:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r7.H0
            if (r8 != r4) goto L3e
            r1 = 0
            goto L40
        L3e:
            r1 = 8
        L40:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r7.I0
            if (r8 != r5) goto L48
            r6 = 0
        L48:
            r0.setVisibility(r6)
            r7.N(r8)
            if (r8 != r5) goto L54
            r7.T(r3)
            return
        L54:
            if (r8 != r4) goto L5a
            r7.T(r2)
            return
        L5a:
            r8 = 2
            r7.T(r8)
            return
    }

    private void c0() {
            r4 = this;
            int r0 = r4.Q
            r4.a0(r0)
            int r0 = com.yalantis.ucrop.R.id.toolbar
            android.view.View r0 = r4.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            int r1 = r4.P
            r0.setBackgroundColor(r1)
            int r1 = r4.T
            r0.setTitleTextColor(r1)
            int r1 = com.yalantis.ucrop.R.id.toolbar_title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = r4.T
            r1.setTextColor(r2)
            java.lang.String r2 = r4.O
            r1.setText(r2)
            int r1 = r4.V
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r4, r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            int r2 = r4.T
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r2, r3)
            r0.setNavigationIcon(r1)
            r4.setSupportActionBar(r0)
            androidx.appcompat.app.ActionBar r0 = r4.getSupportActionBar()
            if (r0 == 0) goto L4a
            r1 = 0
            r0.setDisplayShowTitleEnabled(r1)
        L4a:
            return
    }

    private void d0(@androidx.annotation.NonNull android.content.Intent r10) {
            r9 = this;
            java.lang.String r0 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
            r1 = 0
            int r0 = r10.getIntExtra(r0, r1)
            java.lang.String r2 = "com.yalantis.ucrop.AspectRatioOptions"
            java.util.ArrayList r10 = r10.getParcelableArrayListExtra(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r10 == 0) goto L18
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L5b
        L18:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r0.<init>(r3, r2, r2)
            r10.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r4 = 1082130432(0x40800000, float:4.0)
            r5 = 1077936128(0x40400000, float:3.0)
            r0.<init>(r3, r5, r4)
            r10.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            int r4 = com.yalantis.ucrop.R.string.ucrop_label_original
            java.lang.String r4 = r9.getString(r4)
            java.lang.String r4 = r4.toUpperCase()
            r6 = 0
            r0.<init>(r4, r6, r6)
            r10.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r4 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r3, r5, r4)
            r10.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r4 = 1098907648(0x41800000, float:16.0)
            r5 = 1091567616(0x41100000, float:9.0)
            r0.<init>(r3, r4, r5)
            r10.add(r0)
            r0 = 2
        L5b:
            int r4 = com.yalantis.ucrop.R.id.layout_aspect_ratio
            android.view.View r4 = r9.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r5.<init>(r1, r6)
            r5.weight = r2
            java.util.Iterator r10 = r10.iterator()
        L6f:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r10.next()
            com.yalantis.ucrop.model.AspectRatio r2 = (com.yalantis.ucrop.model.AspectRatio) r2
            android.view.LayoutInflater r6 = r9.getLayoutInflater()
            int r7 = com.yalantis.ucrop.R.layout.ucrop_aspect_ratio
            android.view.View r6 = r6.inflate(r7, r3)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r6.setLayoutParams(r5)
            android.view.View r7 = r6.getChildAt(r1)
            com.yalantis.ucrop.view.widget.AspectRatioTextView r7 = (com.yalantis.ucrop.view.widget.AspectRatioTextView) r7
            int r8 = r9.R
            r7.setActiveColor(r8)
            r7.setAspectRatio(r2)
            r4.addView(r6)
            java.util.List<android.view.ViewGroup> r2 = r9.J0
            r2.add(r6)
            goto L6f
        La1:
            java.util.List<android.view.ViewGroup> r10 = r9.J0
            java.lang.Object r10 = r10.get(r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0 = 1
            r10.setSelected(r0)
            java.util.List<android.view.ViewGroup> r10 = r9.J0
            java.util.Iterator r10 = r10.iterator()
        Lb3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r0 = r10.next()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.yalantis.ucrop.UCropActivity$b r1 = new com.yalantis.ucrop.UCropActivity$b
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            goto Lb3
        Lc8:
            return
    }

    static /* synthetic */ void e(com.yalantis.ucrop.UCropActivity r0, float r1) {
            r0.U(r1)
            return
    }

    private void e0() {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.id.text_view_rotate
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.K0 = r0
            int r0 = com.yalantis.ucrop.R.id.rotate_scroll_wheel
            android.view.View r1 = r3.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r1 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r1
            com.yalantis.ucrop.UCropActivity$c r2 = new com.yalantis.ucrop.UCropActivity$c
            r2.<init>(r3)
            r1.setScrollingListener(r2)
            android.view.View r0 = r3.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r0 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r0
            int r1 = r3.R
            r0.setMiddleLineColor(r1)
            int r0 = com.yalantis.ucrop.R.id.wrapper_reset_rotate
            android.view.View r0 = r3.findViewById(r0)
            com.yalantis.ucrop.UCropActivity$d r1 = new com.yalantis.ucrop.UCropActivity$d
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.wrapper_rotate_by_angle
            android.view.View r0 = r3.findViewById(r0)
            com.yalantis.ucrop.UCropActivity$e r1 = new com.yalantis.ucrop.UCropActivity$e
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    static /* synthetic */ void f(com.yalantis.ucrop.UCropActivity r0, float r1) {
            r0.Z(r1)
            return
    }

    private void f0() {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.id.text_view_scale
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.L0 = r0
            int r0 = com.yalantis.ucrop.R.id.scale_scroll_wheel
            android.view.View r1 = r3.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r1 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r1
            com.yalantis.ucrop.UCropActivity$f r2 = new com.yalantis.ucrop.UCropActivity$f
            r2.<init>(r3)
            r1.setScrollingListener(r2)
            android.view.View r0 = r3.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r0 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r0
            int r1 = r3.R
            r0.setMiddleLineColor(r1)
            return
    }

    static /* synthetic */ com.yalantis.ucrop.view.UCropView g(com.yalantis.ucrop.UCropActivity r0) {
            com.yalantis.ucrop.view.UCropView r0 = r0.a0
            return r0
    }

    private void g0() {
            r6 = this;
            int r0 = com.yalantis.ucrop.R.id.image_view_state_scale
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r1 = com.yalantis.ucrop.R.id.image_view_state_rotate
            android.view.View r1 = r6.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.yalantis.ucrop.R.id.image_view_state_aspect_ratio
            android.view.View r2 = r6.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.yalantis.ucrop.util.i r3 = new com.yalantis.ucrop.util.i
            android.graphics.drawable.Drawable r4 = r0.getDrawable()
            int r5 = r6.S
            r3.<init>(r4, r5)
            r0.setImageDrawable(r3)
            com.yalantis.ucrop.util.i r0 = new com.yalantis.ucrop.util.i
            android.graphics.drawable.Drawable r3 = r1.getDrawable()
            int r4 = r6.S
            r0.<init>(r3, r4)
            r1.setImageDrawable(r0)
            com.yalantis.ucrop.util.i r0 = new com.yalantis.ucrop.util.i
            android.graphics.drawable.Drawable r1 = r2.getDrawable()
            int r3 = r6.S
            r0.<init>(r1, r3)
            r2.setImageDrawable(r0)
            return
    }

    static /* synthetic */ android.view.View h(com.yalantis.ucrop.UCropActivity r0) {
            android.view.View r0 = r0.M0
            return r0
    }

    private void h0(@androidx.annotation.NonNull android.content.Intent r5) {
            r4 = this;
            int r0 = com.yalantis.ucrop.R.color.ucrop_color_statusbar
            int r0 = androidx.core.content.ContextCompat.getColor(r4, r0)
            java.lang.String r1 = "com.yalantis.ucrop.StatusBarColor"
            int r0 = r5.getIntExtra(r1, r0)
            r4.Q = r0
            int r0 = com.yalantis.ucrop.R.color.ucrop_color_toolbar
            int r0 = androidx.core.content.ContextCompat.getColor(r4, r0)
            java.lang.String r1 = "com.yalantis.ucrop.ToolbarColor"
            int r0 = r5.getIntExtra(r1, r0)
            r4.P = r0
            int r0 = com.yalantis.ucrop.R.color.ucrop_color_widget_background
            int r0 = androidx.core.content.ContextCompat.getColor(r4, r0)
            java.lang.String r1 = "com.yalantis.ucrop.UcropColorWidgetActive"
            int r0 = r5.getIntExtra(r1, r0)
            r4.R = r0
            int r0 = com.yalantis.ucrop.R.color.ucrop_color_active_controls_color
            int r0 = androidx.core.content.ContextCompat.getColor(r4, r0)
            java.lang.String r1 = "com.yalantis.ucrop.UcropColorControlsWidgetActive"
            int r0 = r5.getIntExtra(r1, r0)
            r4.S = r0
            int r0 = com.yalantis.ucrop.R.color.ucrop_color_toolbar_widget
            int r0 = androidx.core.content.ContextCompat.getColor(r4, r0)
            java.lang.String r1 = "com.yalantis.ucrop.UcropToolbarWidgetColor"
            int r0 = r5.getIntExtra(r1, r0)
            r4.T = r0
            java.lang.String r0 = "com.yalantis.ucrop.UcropToolbarCancelDrawable"
            int r1 = com.yalantis.ucrop.R.drawable.ucrop_ic_cross
            int r0 = r5.getIntExtra(r0, r1)
            r4.V = r0
            java.lang.String r0 = "com.yalantis.ucrop.UcropToolbarCropDrawable"
            int r1 = com.yalantis.ucrop.R.drawable.ucrop_ic_done
            int r0 = r5.getIntExtra(r0, r1)
            r4.W = r0
            java.lang.String r0 = "com.yalantis.ucrop.UcropToolbarTitleText"
            java.lang.String r0 = r5.getStringExtra(r0)
            r4.O = r0
            if (r0 == 0) goto L65
            goto L6f
        L65:
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.yalantis.ucrop.R.string.ucrop_label_edit_photo
            java.lang.String r0 = r0.getString(r1)
        L6f:
            r4.O = r0
            int r0 = com.yalantis.ucrop.R.color.ucrop_color_default_logo
            int r0 = androidx.core.content.ContextCompat.getColor(r4, r0)
            java.lang.String r1 = "com.yalantis.ucrop.UcropLogoColor"
            int r0 = r5.getIntExtra(r1, r0)
            r4.X = r0
            java.lang.String r0 = "com.yalantis.ucrop.HideBottomControls"
            r1 = 0
            boolean r0 = r5.getBooleanExtra(r0, r1)
            r2 = 1
            r0 = r0 ^ r2
            r4.Y = r0
            int r0 = com.yalantis.ucrop.R.color.ucrop_color_crop_background
            int r0 = androidx.core.content.ContextCompat.getColor(r4, r0)
            java.lang.String r3 = "com.yalantis.ucrop.UcropRootViewBackgroundColor"
            int r0 = r5.getIntExtra(r3, r0)
            r4.U = r0
            r4.c0()
            r4.P()
            boolean r0 = r4.Y
            if (r0 == 0) goto L126
            int r0 = com.yalantis.ucrop.R.id.ucrop_photobox
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = com.yalantis.ucrop.R.id.controls_wrapper
            android.view.View r0 = r0.findViewById(r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setVisibility(r1)
            int r1 = r4.U
            r0.setBackgroundColor(r1)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            int r3 = com.yalantis.ucrop.R.layout.ucrop_controls
            r1.inflate(r3, r0, r2)
            androidx.transition.AutoTransition r0 = new androidx.transition.AutoTransition
            r0.<init>()
            r4.N0 = r0
            r1 = 50
            r0.setDuration(r1)
            int r0 = com.yalantis.ucrop.R.id.state_aspect_ratio
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.k0 = r0
            android.view.View$OnClickListener r1 = r4.S0
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.state_rotate
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.p0 = r0
            android.view.View$OnClickListener r1 = r4.S0
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.state_scale
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.F0 = r0
            android.view.View$OnClickListener r1 = r4.S0
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.layout_aspect_ratio
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.G0 = r0
            int r0 = com.yalantis.ucrop.R.id.layout_rotate_wheel
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.H0 = r0
            int r0 = com.yalantis.ucrop.R.id.layout_scale_wheel
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.I0 = r0
            r4.d0(r5)
            r4.e0()
            r4.f0()
            r4.g0()
        L126:
            return
    }

    static /* synthetic */ boolean i(com.yalantis.ucrop.UCropActivity r0, boolean r1) {
            r0.Z = r1
            return r1
    }

    static /* synthetic */ com.yalantis.ucrop.view.GestureCropImageView j(com.yalantis.ucrop.UCropActivity r0) {
            com.yalantis.ucrop.view.GestureCropImageView r0 = r0.b0
            return r0
    }

    static /* synthetic */ java.util.List k(com.yalantis.ucrop.UCropActivity r0) {
            java.util.List<android.view.ViewGroup> r0 = r0.J0
            return r0
    }

    static /* synthetic */ void l(com.yalantis.ucrop.UCropActivity r0) {
            r0.R()
            return
    }

    static /* synthetic */ void m(com.yalantis.ucrop.UCropActivity r0, int r1) {
            r0.S(r1)
            return
    }

    protected void O() {
            r4 = this;
            android.view.View r0 = r4.M0
            r1 = 1
            r0.setClickable(r1)
            r4.Z = r1
            r4.supportInvalidateOptionsMenu()
            com.yalantis.ucrop.view.GestureCropImageView r0 = r4.b0
            android.graphics.Bitmap$CompressFormat r1 = r4.O0
            int r2 = r4.P0
            com.yalantis.ucrop.UCropActivity$h r3 = new com.yalantis.ucrop.UCropActivity$h
            r3.<init>(r4)
            r0.t(r1, r2, r3)
            return
    }

    protected void X(java.lang.Throwable r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.yalantis.ucrop.Error"
            android.content.Intent r3 = r0.putExtra(r1, r3)
            r0 = 96
            r2.setResult(r0, r3)
            return
    }

    protected void Y(android.net.Uri r3, float r4, int r5, int r6, int r7, int r8) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.yalantis.ucrop.OutputUri"
            android.content.Intent r3 = r0.putExtra(r1, r3)
            java.lang.String r0 = "com.yalantis.ucrop.CropAspectRatio"
            android.content.Intent r3 = r3.putExtra(r0, r4)
            java.lang.String r4 = "com.yalantis.ucrop.ImageWidth"
            android.content.Intent r3 = r3.putExtra(r4, r7)
            java.lang.String r4 = "com.yalantis.ucrop.ImageHeight"
            android.content.Intent r3 = r3.putExtra(r4, r8)
            java.lang.String r4 = "com.yalantis.ucrop.OffsetX"
            android.content.Intent r3 = r3.putExtra(r4, r5)
            java.lang.String r4 = "com.yalantis.ucrop.OffsetY"
            android.content.Intent r3 = r3.putExtra(r4, r6)
            r4 = -1
            r2.setResult(r4, r3)
            return
    }

    public native void onCreate(android.os.Bundle r1);

    public boolean onCreateOptionsMenu(android.view.Menu r7) {
            r6 = this;
            android.view.MenuInflater r0 = r6.getMenuInflater()
            int r1 = com.yalantis.ucrop.R.menu.ucrop_menu_activity
            r0.inflate(r1, r7)
            int r0 = com.yalantis.ucrop.R.id.menu_loader
            android.view.MenuItem r0 = r7.findItem(r0)
            android.graphics.drawable.Drawable r1 = r0.getIcon()
            r2 = 1
            if (r1 == 0) goto L45
            r1.mutate()     // Catch: java.lang.IllegalStateException -> L24
            int r3 = r6.T     // Catch: java.lang.IllegalStateException -> L24
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch: java.lang.IllegalStateException -> L24
            r1.setColorFilter(r3, r4)     // Catch: java.lang.IllegalStateException -> L24
            r0.setIcon(r1)     // Catch: java.lang.IllegalStateException -> L24
            goto L3c
        L24:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            int r3 = com.yalantis.ucrop.R.string.ucrop_mutate_exception_hint
            java.lang.String r3 = r6.getString(r3)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r4[r2] = r3
            java.lang.String r1 = "%s - %s"
            java.lang.String.format(r1, r4)
        L3c:
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            r0.start()
        L45:
            int r0 = com.yalantis.ucrop.R.id.menu_crop
            android.view.MenuItem r7 = r7.findItem(r0)
            int r0 = r6.W
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r6, r0)
            if (r0 == 0) goto L60
            r0.mutate()
            int r1 = r6.T
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setColorFilter(r1, r3)
            r7.setIcon(r0)
        L60:
            return r2
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r4) {
            r3 = this;
            int r0 = r4.getItemId()
            int r1 = com.yalantis.ucrop.R.id.menu_crop
            r2 = 1
            if (r0 != r1) goto Ld
            r3.O()
            return r2
        Ld:
            int r0 = r4.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto L1a
            r3.onBackPressed()
            return r2
        L1a:
            boolean r4 = super/*android.app.Activity*/.onOptionsItemSelected(r4)
            return r4
    }

    public boolean onPrepareOptionsMenu(android.view.Menu r3) {
            r2 = this;
            int r0 = com.yalantis.ucrop.R.id.menu_crop
            android.view.MenuItem r0 = r3.findItem(r0)
            boolean r1 = r2.Z
            r1 = r1 ^ 1
            r0.setVisible(r1)
            int r0 = com.yalantis.ucrop.R.id.menu_loader
            android.view.MenuItem r0 = r3.findItem(r0)
            boolean r1 = r2.Z
            r0.setVisible(r1)
            boolean r3 = super/*android.app.Activity*/.onPrepareOptionsMenu(r3)
            return r3
    }

    protected void onStop() {
            r1 = this;
            super.onStop()
            com.yalantis.ucrop.view.GestureCropImageView r0 = r1.b0
            if (r0 == 0) goto La
            r0.s()
        La:
            return
    }
}
