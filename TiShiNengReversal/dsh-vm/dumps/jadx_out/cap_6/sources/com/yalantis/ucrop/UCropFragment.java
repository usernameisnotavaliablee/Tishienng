package com.yalantis.ucrop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UCropFragment extends androidx.fragment.app.Fragment {
    public static final int B = 90;
    public static final android.graphics.Bitmap.CompressFormat C = null;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final java.lang.String H = "UCropFragment";
    private static final long I = 50;
    private static final int J = 3;
    private static final int K = 15000;
    private static final int L = 42;
    private final android.view.View.OnClickListener A;
    private com.yalantis.ucrop.c c;
    private int d;
    private int e;

    @androidx.annotation.ColorInt
    private int f;
    private int g;
    private boolean h;
    private androidx.transition.Transition i;
    private com.yalantis.ucrop.view.UCropView j;
    private com.yalantis.ucrop.view.GestureCropImageView k;
    private com.yalantis.ucrop.view.OverlayView l;
    private android.view.ViewGroup m;
    private android.view.ViewGroup n;
    private android.view.ViewGroup o;
    private android.view.ViewGroup p;

    /* renamed from: q, reason: collision with root package name */
    private android.view.ViewGroup f41q;
    private android.view.ViewGroup r;
    private java.util.List<android.view.ViewGroup> s;
    private android.widget.TextView t;
    private android.widget.TextView u;
    private android.view.View v;
    private android.graphics.Bitmap.CompressFormat w;
    private int x;
    private int[] y;
    private com.yalantis.ucrop.view.TransformImageView.b z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.yalantis.ucrop.view.TransformImageView.b {
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        a(com.yalantis.ucrop.UCropFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void a() {
                r3 = this;
                com.yalantis.ucrop.UCropFragment r0 = r3.a
                com.yalantis.ucrop.view.UCropView r0 = com.yalantis.ucrop.UCropFragment.d(r0)
                android.view.ViewPropertyAnimator r0 = r0.animate()
                r1 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
                r1 = 300(0x12c, double:1.48E-321)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
                android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
                r1.<init>()
                r0.setInterpolator(r1)
                com.yalantis.ucrop.UCropFragment r0 = r3.a
                android.view.View r0 = com.yalantis.ucrop.UCropFragment.e(r0)
                r1 = 0
                r0.setClickable(r1)
                com.yalantis.ucrop.UCropFragment r0 = r3.a
                com.yalantis.ucrop.c r0 = com.yalantis.ucrop.UCropFragment.f(r0)
                r0.a(r1)
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void b(@androidx.annotation.NonNull java.lang.Exception r3) {
                r2 = this;
                com.yalantis.ucrop.UCropFragment r0 = r2.a
                com.yalantis.ucrop.c r0 = com.yalantis.ucrop.UCropFragment.f(r0)
                com.yalantis.ucrop.UCropFragment r1 = r2.a
                com.yalantis.ucrop.UCropFragment$i r3 = r1.M(r3)
                r0.b(r3)
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void c(float r2) {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r0 = r1.a
                com.yalantis.ucrop.UCropFragment.c(r0, r2)
                return
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.b
        public void d(float r2) {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r0 = r1.a
                com.yalantis.ucrop.UCropFragment.b(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        b(com.yalantis.ucrop.UCropFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                com.yalantis.ucrop.UCropFragment r0 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropFragment.g(r0)
                r1 = r5
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = 0
                android.view.View r1 = r1.getChildAt(r2)
                com.yalantis.ucrop.view.widget.AspectRatioTextView r1 = (com.yalantis.ucrop.view.widget.AspectRatioTextView) r1
                boolean r3 = r5.isSelected()
                float r1 = r1.b(r3)
                r0.setTargetAspectRatio(r1)
                com.yalantis.ucrop.UCropFragment r0 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropFragment.g(r0)
                r0.y()
                boolean r0 = r5.isSelected()
                if (r0 != 0) goto L49
                com.yalantis.ucrop.UCropFragment r0 = r4.a
                java.util.List r0 = com.yalantis.ucrop.UCropFragment.h(r0)
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
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        c(com.yalantis.ucrop.UCropFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropFragment.g(r0)
                r0.y()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropFragment.g(r0)
                r0.s()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void onScroll(float r2, float r3) {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r3 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r3 = com.yalantis.ucrop.UCropFragment.g(r3)
                r0 = 1109917696(0x42280000, float:42.0)
                float r2 = r2 / r0
                r3.w(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.view.View.OnClickListener {
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        d(com.yalantis.ucrop.UCropFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.yalantis.ucrop.UCropFragment r1 = r0.a
                com.yalantis.ucrop.UCropFragment.i(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements android.view.View.OnClickListener {
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        e(com.yalantis.ucrop.UCropFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r2 = r1.a
                r0 = 90
                com.yalantis.ucrop.UCropFragment.j(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a {
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        f(com.yalantis.ucrop.UCropFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropFragment.g(r0)
                r0.y()
                return
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
                r1 = this;
                com.yalantis.ucrop.UCropFragment r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.UCropFragment.g(r0)
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
                com.yalantis.ucrop.UCropFragment r6 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r6 = com.yalantis.ucrop.UCropFragment.g(r6)
                com.yalantis.ucrop.UCropFragment r1 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r1 = com.yalantis.ucrop.UCropFragment.g(r1)
                float r1 = r1.getCurrentScale()
                com.yalantis.ucrop.UCropFragment r2 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r2 = com.yalantis.ucrop.UCropFragment.g(r2)
                float r2 = r2.getMaxScale()
                com.yalantis.ucrop.UCropFragment r3 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r3 = com.yalantis.ucrop.UCropFragment.g(r3)
                float r3 = r3.getMinScale()
                float r2 = r2 - r3
                float r2 = r2 / r0
                float r5 = r5 * r2
                float r1 = r1 + r5
                r6.B(r1)
                return
            L35:
                com.yalantis.ucrop.UCropFragment r6 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r6 = com.yalantis.ucrop.UCropFragment.g(r6)
                com.yalantis.ucrop.UCropFragment r1 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r1 = com.yalantis.ucrop.UCropFragment.g(r1)
                float r1 = r1.getCurrentScale()
                com.yalantis.ucrop.UCropFragment r2 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r2 = com.yalantis.ucrop.UCropFragment.g(r2)
                float r2 = r2.getMaxScale()
                com.yalantis.ucrop.UCropFragment r3 = r4.a
                com.yalantis.ucrop.view.GestureCropImageView r3 = com.yalantis.ucrop.UCropFragment.g(r3)
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
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        g(com.yalantis.ucrop.UCropFragment r1) {
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
                com.yalantis.ucrop.UCropFragment r0 = r1.a
                int r2 = r2.getId()
                com.yalantis.ucrop.UCropFragment.k(r0, r2)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements e3.a {
        final /* synthetic */ com.yalantis.ucrop.UCropFragment a;

        h(com.yalantis.ucrop.UCropFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // e3.a
        public void a(@androidx.annotation.NonNull android.net.Uri r9, int r10, int r11, int r12, int r13) {
                r8 = this;
                com.yalantis.ucrop.UCropFragment r0 = r8.a
                com.yalantis.ucrop.c r0 = com.yalantis.ucrop.UCropFragment.f(r0)
                com.yalantis.ucrop.UCropFragment r1 = r8.a
                com.yalantis.ucrop.view.GestureCropImageView r2 = com.yalantis.ucrop.UCropFragment.g(r1)
                float r3 = r2.getTargetAspectRatio()
                r2 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                com.yalantis.ucrop.UCropFragment$i r9 = r1.N(r2, r3, r4, r5, r6, r7)
                r0.b(r9)
                com.yalantis.ucrop.UCropFragment r9 = r8.a
                com.yalantis.ucrop.c r9 = com.yalantis.ucrop.UCropFragment.f(r9)
                r10 = 0
                r9.a(r10)
                return
        }

        @Override // e3.a
        public void b(@androidx.annotation.NonNull java.lang.Throwable r3) {
                r2 = this;
                com.yalantis.ucrop.UCropFragment r0 = r2.a
                com.yalantis.ucrop.c r0 = com.yalantis.ucrop.UCropFragment.f(r0)
                com.yalantis.ucrop.UCropFragment r1 = r2.a
                com.yalantis.ucrop.UCropFragment$i r3 = r1.M(r3)
                r0.b(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i {
        public int a;
        public android.content.Intent b;
        final /* synthetic */ com.yalantis.ucrop.UCropFragment c;

        public i(com.yalantis.ucrop.UCropFragment r1, int r2, android.content.Intent r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }
    }

    static {
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            com.yalantis.ucrop.UCropFragment.C = r0
            return
    }

    public UCropFragment() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.s = r0
            android.graphics.Bitmap$CompressFormat r0 = com.yalantis.ucrop.UCropFragment.C
            r3.w = r0
            r0 = 90
            r3.x = r0
            r0 = 2
            r1 = 3
            r2 = 1
            int[] r0 = new int[]{r2, r0, r1}
            r3.y = r0
            com.yalantis.ucrop.UCropFragment$a r0 = new com.yalantis.ucrop.UCropFragment$a
            r0.<init>(r3)
            r3.z = r0
            com.yalantis.ucrop.UCropFragment$g r0 = new com.yalantis.ucrop.UCropFragment$g
            r0.<init>(r3)
            r3.A = r0
            return
    }

    private void O(android.view.View r4) {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.id.ucrop
            android.view.View r0 = r4.findViewById(r0)
            com.yalantis.ucrop.view.UCropView r0 = (com.yalantis.ucrop.view.UCropView) r0
            r3.j = r0
            com.yalantis.ucrop.view.GestureCropImageView r0 = r0.getCropImageView()
            r3.k = r0
            com.yalantis.ucrop.view.UCropView r0 = r3.j
            com.yalantis.ucrop.view.OverlayView r0 = r0.getOverlayView()
            r3.l = r0
            com.yalantis.ucrop.view.GestureCropImageView r0 = r3.k
            com.yalantis.ucrop.view.TransformImageView$b r1 = r3.z
            r0.setTransformImageListener(r1)
            int r0 = com.yalantis.ucrop.R.id.image_view_logo
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r1 = r3.g
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setColorFilter(r1, r2)
            int r0 = com.yalantis.ucrop.R.id.ucrop_frame
            android.view.View r4 = r4.findViewById(r0)
            int r0 = r3.f
            r4.setBackgroundColor(r0)
            return
    }

    public static com.yalantis.ucrop.UCropFragment P(android.os.Bundle r1) {
            com.yalantis.ucrop.UCropFragment r0 = new com.yalantis.ucrop.UCropFragment
            r0.<init>()
            r0.setArguments(r1)
            return r0
    }

    private void Q(@androidx.annotation.NonNull android.os.Bundle r8) {
            r7 = this;
            java.lang.String r0 = "com.yalantis.ucrop.CompressionFormatName"
            java.lang.String r0 = r8.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L11
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.valueOf(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L16
            android.graphics.Bitmap$CompressFormat r0 = com.yalantis.ucrop.UCropFragment.C
        L16:
            r7.w = r0
            java.lang.String r0 = "com.yalantis.ucrop.CompressionQuality"
            r1 = 90
            int r0 = r8.getInt(r0, r1)
            r7.x = r0
            java.lang.String r0 = "com.yalantis.ucrop.AllowedGestures"
            int[] r0 = r8.getIntArray(r0)
            if (r0 == 0) goto L30
            int r1 = r0.length
            r2 = 3
            if (r1 != r2) goto L30
            r7.y = r0
        L30:
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.k
            java.lang.String r1 = "com.yalantis.ucrop.MaxBitmapSize"
            r2 = 0
            int r1 = r8.getInt(r1, r2)
            r0.setMaxBitmapSize(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.k
            java.lang.String r1 = "com.yalantis.ucrop.MaxScaleMultiplier"
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r8.getFloat(r1, r3)
            r0.setMaxScaleMultiplier(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.k
            java.lang.String r1 = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration"
            r3 = 500(0x1f4, float:7.0E-43)
            int r1 = r8.getInt(r1, r3)
            long r3 = (long) r1
            r0.setImageToWrapCropBoundsAnimDuration(r3)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            java.lang.String r1 = "com.yalantis.ucrop.FreeStyleCrop"
            boolean r1 = r8.getBoolean(r1, r2)
            r0.setFreestyleCropEnabled(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_default_dimmed
            int r1 = r1.getColor(r3)
            java.lang.String r3 = "com.yalantis.ucrop.DimmedLayerColor"
            int r1 = r8.getInt(r3, r1)
            r0.setDimmedColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            java.lang.String r1 = "com.yalantis.ucrop.CircleDimmedLayer"
            boolean r1 = r8.getBoolean(r1, r2)
            r0.setCircleDimmedLayer(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            java.lang.String r1 = "com.yalantis.ucrop.ShowCropFrame"
            r3 = 1
            boolean r1 = r8.getBoolean(r1, r3)
            r0.setShowCropFrame(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.yalantis.ucrop.R.color.ucrop_color_default_crop_frame
            int r1 = r1.getColor(r4)
            java.lang.String r4 = "com.yalantis.ucrop.CropFrameColor"
            int r1 = r8.getInt(r4, r1)
            r0.setCropFrameColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_frame_stoke_width
            int r1 = r1.getDimensionPixelSize(r4)
            java.lang.String r4 = "com.yalantis.ucrop.CropFrameStrokeWidth"
            int r1 = r8.getInt(r4, r1)
            r0.setCropFrameStrokeWidth(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            java.lang.String r1 = "com.yalantis.ucrop.ShowCropGrid"
            boolean r1 = r8.getBoolean(r1, r3)
            r0.setShowCropGrid(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            java.lang.String r1 = "com.yalantis.ucrop.CropGridRowCount"
            r3 = 2
            int r1 = r8.getInt(r1, r3)
            r0.setCropGridRowCount(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            java.lang.String r1 = "com.yalantis.ucrop.CropGridColumnCount"
            int r1 = r8.getInt(r1, r3)
            r0.setCropGridColumnCount(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_default_crop_grid
            int r1 = r1.getColor(r3)
            java.lang.String r3 = "com.yalantis.ucrop.CropGridColor"
            int r1 = r8.getInt(r3, r1)
            r0.setCropGridColor(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r7.l
            android.content.res.Resources r1 = r7.getResources()
            int r3 = com.yalantis.ucrop.R.dimen.ucrop_default_crop_grid_stoke_width
            int r1 = r1.getDimensionPixelSize(r3)
            java.lang.String r3 = "com.yalantis.ucrop.CropGridStrokeWidth"
            int r1 = r8.getInt(r3, r1)
            r0.setCropGridStrokeWidth(r1)
            java.lang.String r0 = "com.yalantis.ucrop.AspectRatioX"
            r1 = 0
            float r0 = r8.getFloat(r0, r1)
            java.lang.String r3 = "com.yalantis.ucrop.AspectRatioY"
            float r3 = r8.getFloat(r3, r1)
            java.lang.String r4 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
            int r4 = r8.getInt(r4, r2)
            java.lang.String r5 = "com.yalantis.ucrop.AspectRatioOptions"
            java.util.ArrayList r5 = r8.getParcelableArrayList(r5)
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 <= 0) goto L135
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L135
            android.view.ViewGroup r1 = r7.m
            if (r1 == 0) goto L12e
            r4 = 8
            r1.setVisibility(r4)
        L12e:
            com.yalantis.ucrop.view.GestureCropImageView r1 = r7.k
            float r0 = r0 / r3
            r1.setTargetAspectRatio(r0)
            goto L15d
        L135:
            if (r5 == 0) goto L158
            int r0 = r5.size()
            if (r4 >= r0) goto L158
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.k
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
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.k
            r0.setTargetAspectRatio(r1)
        L15d:
            java.lang.String r0 = "com.yalantis.ucrop.MaxSizeX"
            int r0 = r8.getInt(r0, r2)
            java.lang.String r1 = "com.yalantis.ucrop.MaxSizeY"
            int r8 = r8.getInt(r1, r2)
            if (r0 <= 0) goto L177
            if (r8 <= 0) goto L177
            com.yalantis.ucrop.view.GestureCropImageView r1 = r7.k
            r1.setMaxResultImageSizeX(r0)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r7.k
            r0.setMaxResultImageSizeY(r8)
        L177:
            return
    }

    private void R() {
            r2 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.k
            float r1 = r0.getCurrentAngle()
            float r1 = -r1
            r0.w(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.k
            r0.y()
            return
    }

    private void S(int r2) {
            r1 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r1.k
            float r2 = (float) r2
            r0.w(r2)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.k
            r2.y()
            return
    }

    private void T(int r6) {
            r5 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r5.k
            int[] r1 = r5.y
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
            com.yalantis.ucrop.view.GestureCropImageView r0 = r5.k
            int[] r1 = r5.y
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
            android.widget.TextView r0 = r4.t
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

    private void W(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "com.yalantis.ucrop.InputUri"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r1 = "com.yalantis.ucrop.OutputUri"
            android.os.Parcelable r1 = r3.getParcelable(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            r2.Q(r3)
            if (r0 == 0) goto L28
            if (r1 == 0) goto L28
            com.yalantis.ucrop.view.GestureCropImageView r3 = r2.k     // Catch: java.lang.Exception -> L1d
            r3.m(r0, r1)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r3 = move-exception
            com.yalantis.ucrop.c r0 = r2.c
            com.yalantis.ucrop.UCropFragment$i r3 = r2.M(r3)
            r0.b(r3)
            return
        L28:
            com.yalantis.ucrop.c r3 = r2.c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            int r1 = com.yalantis.ucrop.R.string.ucrop_error_input_data_is_absent
            java.lang.String r1 = r2.getString(r1)
            r0.<init>(r1)
            com.yalantis.ucrop.UCropFragment$i r0 = r2.M(r0)
            r3.b(r0)
            return
    }

    private void X() {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto L18
            android.view.ViewGroup r0 = r1.m
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            int r0 = com.yalantis.ucrop.R.id.state_aspect_ratio
            r1.Z(r0)
            return
        L12:
            int r0 = com.yalantis.ucrop.R.id.state_scale
            r1.Z(r0)
            return
        L18:
            r0 = 0
            r1.T(r0)
            return
    }

    private void Y(float r5) {
            r4 = this;
            android.widget.TextView r0 = r4.u
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

    private void Z(@androidx.annotation.IdRes int r8) {
            r7 = this;
            boolean r0 = r7.h
            if (r0 != 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r7.m
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
            android.view.ViewGroup r0 = r7.n
            int r4 = com.yalantis.ucrop.R.id.state_rotate
            if (r8 != r4) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r0.setSelected(r5)
            android.view.ViewGroup r0 = r7.o
            int r5 = com.yalantis.ucrop.R.id.state_scale
            if (r8 != r5) goto L27
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            r0.setSelected(r6)
            android.view.ViewGroup r0 = r7.p
            r6 = 8
            if (r8 != r1) goto L33
            r1 = 0
            goto L35
        L33:
            r1 = 8
        L35:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r7.f41q
            if (r8 != r4) goto L3e
            r1 = 0
            goto L40
        L3e:
            r1 = 8
        L40:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r7.r
            if (r8 != r5) goto L48
            r6 = 0
        L48:
            r0.setVisibility(r6)
            r7.m(r8)
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

    private void a0(@androidx.annotation.NonNull android.os.Bundle r9, android.view.View r10) {
            r8 = this;
            java.lang.String r0 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
            r1 = 0
            int r0 = r9.getInt(r0, r1)
            java.lang.String r2 = "com.yalantis.ucrop.AspectRatioOptions"
            java.util.ArrayList r9 = r9.getParcelableArrayList(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r9 == 0) goto L18
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L5b
        L18:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r0.<init>(r3, r2, r2)
            r9.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r4 = 1082130432(0x40800000, float:4.0)
            r5 = 1077936128(0x40400000, float:3.0)
            r0.<init>(r3, r5, r4)
            r9.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            int r4 = com.yalantis.ucrop.R.string.ucrop_label_original
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r4 = r4.toUpperCase()
            r6 = 0
            r0.<init>(r4, r6, r6)
            r9.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r4 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r3, r5, r4)
            r9.add(r0)
            com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
            r4 = 1098907648(0x41800000, float:16.0)
            r5 = 1091567616(0x41100000, float:9.0)
            r0.<init>(r3, r4, r5)
            r9.add(r0)
            r0 = 2
        L5b:
            int r4 = com.yalantis.ucrop.R.id.layout_aspect_ratio
            android.view.View r10 = r10.findViewById(r4)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r4.<init>(r1, r5)
            r4.weight = r2
            java.util.Iterator r9 = r9.iterator()
        L6f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r9.next()
            com.yalantis.ucrop.model.AspectRatio r2 = (com.yalantis.ucrop.model.AspectRatio) r2
            android.view.LayoutInflater r5 = r8.getLayoutInflater()
            int r6 = com.yalantis.ucrop.R.layout.ucrop_aspect_ratio
            android.view.View r5 = r5.inflate(r6, r3)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r5.setLayoutParams(r4)
            android.view.View r6 = r5.getChildAt(r1)
            com.yalantis.ucrop.view.widget.AspectRatioTextView r6 = (com.yalantis.ucrop.view.widget.AspectRatioTextView) r6
            int r7 = r8.e
            r6.setActiveColor(r7)
            r6.setAspectRatio(r2)
            r10.addView(r5)
            java.util.List<android.view.ViewGroup> r2 = r8.s
            r2.add(r5)
            goto L6f
        La1:
            java.util.List<android.view.ViewGroup> r9 = r8.s
            java.lang.Object r9 = r9.get(r0)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r10 = 1
            r9.setSelected(r10)
            java.util.List<android.view.ViewGroup> r9 = r8.s
            java.util.Iterator r9 = r9.iterator()
        Lb3:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc8
            java.lang.Object r10 = r9.next()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            com.yalantis.ucrop.UCropFragment$b r0 = new com.yalantis.ucrop.UCropFragment$b
            r0.<init>(r8)
            r10.setOnClickListener(r0)
            goto Lb3
        Lc8:
            return
    }

    static /* synthetic */ void b(com.yalantis.ucrop.UCropFragment r0, float r1) {
            r0.U(r1)
            return
    }

    private void b0(android.view.View r4) {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.id.text_view_rotate
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.t = r0
            int r0 = com.yalantis.ucrop.R.id.rotate_scroll_wheel
            android.view.View r1 = r4.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r1 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r1
            com.yalantis.ucrop.UCropFragment$c r2 = new com.yalantis.ucrop.UCropFragment$c
            r2.<init>(r3)
            r1.setScrollingListener(r2)
            android.view.View r0 = r4.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r0 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r0
            int r1 = r3.e
            r0.setMiddleLineColor(r1)
            int r0 = com.yalantis.ucrop.R.id.wrapper_reset_rotate
            android.view.View r0 = r4.findViewById(r0)
            com.yalantis.ucrop.UCropFragment$d r1 = new com.yalantis.ucrop.UCropFragment$d
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.wrapper_rotate_by_angle
            android.view.View r4 = r4.findViewById(r0)
            com.yalantis.ucrop.UCropFragment$e r0 = new com.yalantis.ucrop.UCropFragment$e
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            return
    }

    static /* synthetic */ void c(com.yalantis.ucrop.UCropFragment r0, float r1) {
            r0.Y(r1)
            return
    }

    private void c0(android.view.View r4) {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.id.text_view_scale
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.u = r0
            int r0 = com.yalantis.ucrop.R.id.scale_scroll_wheel
            android.view.View r1 = r4.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r1 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r1
            com.yalantis.ucrop.UCropFragment$f r2 = new com.yalantis.ucrop.UCropFragment$f
            r2.<init>(r3)
            r1.setScrollingListener(r2)
            android.view.View r4 = r4.findViewById(r0)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r4 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r4
            int r0 = r3.e
            r4.setMiddleLineColor(r0)
            return
    }

    static /* synthetic */ com.yalantis.ucrop.view.UCropView d(com.yalantis.ucrop.UCropFragment r0) {
            com.yalantis.ucrop.view.UCropView r0 = r0.j
            return r0
    }

    private void d0(android.view.View r6) {
            r5 = this;
            int r0 = com.yalantis.ucrop.R.id.image_view_state_scale
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r1 = com.yalantis.ucrop.R.id.image_view_state_rotate
            android.view.View r1 = r6.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.yalantis.ucrop.R.id.image_view_state_aspect_ratio
            android.view.View r6 = r6.findViewById(r2)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.yalantis.ucrop.util.i r2 = new com.yalantis.ucrop.util.i
            android.graphics.drawable.Drawable r3 = r0.getDrawable()
            int r4 = r5.d
            r2.<init>(r3, r4)
            r0.setImageDrawable(r2)
            com.yalantis.ucrop.util.i r0 = new com.yalantis.ucrop.util.i
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            int r3 = r5.d
            r0.<init>(r2, r3)
            r1.setImageDrawable(r0)
            com.yalantis.ucrop.util.i r0 = new com.yalantis.ucrop.util.i
            android.graphics.drawable.Drawable r1 = r6.getDrawable()
            int r2 = r5.d
            r0.<init>(r1, r2)
            r6.setImageDrawable(r0)
            return
    }

    static /* synthetic */ android.view.View e(com.yalantis.ucrop.UCropFragment r0) {
            android.view.View r0 = r0.v
            return r0
    }

    static /* synthetic */ com.yalantis.ucrop.c f(com.yalantis.ucrop.UCropFragment r0) {
            com.yalantis.ucrop.c r0 = r0.c
            return r0
    }

    static /* synthetic */ com.yalantis.ucrop.view.GestureCropImageView g(com.yalantis.ucrop.UCropFragment r0) {
            com.yalantis.ucrop.view.GestureCropImageView r0 = r0.k
            return r0
    }

    static /* synthetic */ java.util.List h(com.yalantis.ucrop.UCropFragment r0) {
            java.util.List<android.view.ViewGroup> r0 = r0.s
            return r0
    }

    static /* synthetic */ void i(com.yalantis.ucrop.UCropFragment r0) {
            r0.R()
            return
    }

    static /* synthetic */ void j(com.yalantis.ucrop.UCropFragment r0, int r1) {
            r0.S(r1)
            return
    }

    static /* synthetic */ void k(com.yalantis.ucrop.UCropFragment r0, int r1) {
            r0.Z(r1)
            return
    }

    private void l(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.v
            if (r0 != 0) goto L20
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.v = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            android.view.View r1 = r2.v
            r1.setLayoutParams(r0)
            android.view.View r0 = r2.v
            r1 = 1
            r0.setClickable(r1)
        L20:
            int r0 = com.yalantis.ucrop.R.id.ucrop_photobox
            android.view.View r3 = r3.findViewById(r0)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            android.view.View r0 = r2.v
            r3.addView(r0)
            return
    }

    private void m(int r5) {
            r4 = this;
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto L17
            android.view.View r0 = r4.getView()
            int r1 = com.yalantis.ucrop.R.id.ucrop_photobox
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.transition.Transition r1 = r4.i
            androidx.transition.TransitionManager.beginDelayedTransition(r0, r1)
        L17:
            android.view.ViewGroup r0 = r4.o
            int r1 = com.yalantis.ucrop.R.id.text_view_scale
            android.view.View r0 = r0.findViewById(r1)
            int r1 = com.yalantis.ucrop.R.id.state_scale
            r2 = 8
            r3 = 0
            if (r5 != r1) goto L28
            r1 = 0
            goto L2a
        L28:
            r1 = 8
        L2a:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r4.m
            int r1 = com.yalantis.ucrop.R.id.text_view_crop
            android.view.View r0 = r0.findViewById(r1)
            int r1 = com.yalantis.ucrop.R.id.state_aspect_ratio
            if (r5 != r1) goto L3b
            r1 = 0
            goto L3d
        L3b:
            r1 = 8
        L3d:
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r4.n
            int r1 = com.yalantis.ucrop.R.id.text_view_rotate
            android.view.View r0 = r0.findViewById(r1)
            int r1 = com.yalantis.ucrop.R.id.state_rotate
            if (r5 != r1) goto L4d
            r2 = 0
        L4d:
            r0.setVisibility(r2)
            return
    }

    public void L() {
            r4 = this;
            android.view.View r0 = r4.v
            r1 = 1
            r0.setClickable(r1)
            com.yalantis.ucrop.c r0 = r4.c
            r0.a(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r4.k
            android.graphics.Bitmap$CompressFormat r1 = r4.w
            int r2 = r4.x
            com.yalantis.ucrop.UCropFragment$h r3 = new com.yalantis.ucrop.UCropFragment$h
            r3.<init>(r4)
            r0.t(r1, r2, r3)
            return
    }

    protected com.yalantis.ucrop.UCropFragment.i M(java.lang.Throwable r4) {
            r3 = this;
            com.yalantis.ucrop.UCropFragment$i r0 = new com.yalantis.ucrop.UCropFragment$i
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.yalantis.ucrop.Error"
            android.content.Intent r4 = r1.putExtra(r2, r4)
            r1 = 96
            r0.<init>(r3, r1, r4)
            return r0
    }

    protected com.yalantis.ucrop.UCropFragment.i N(android.net.Uri r4, float r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            com.yalantis.ucrop.UCropFragment$i r0 = new com.yalantis.ucrop.UCropFragment$i
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.yalantis.ucrop.OutputUri"
            android.content.Intent r4 = r1.putExtra(r2, r4)
            java.lang.String r1 = "com.yalantis.ucrop.CropAspectRatio"
            android.content.Intent r4 = r4.putExtra(r1, r5)
            java.lang.String r5 = "com.yalantis.ucrop.ImageWidth"
            android.content.Intent r4 = r4.putExtra(r5, r8)
            java.lang.String r5 = "com.yalantis.ucrop.ImageHeight"
            android.content.Intent r4 = r4.putExtra(r5, r9)
            java.lang.String r5 = "com.yalantis.ucrop.OffsetX"
            android.content.Intent r4 = r4.putExtra(r5, r6)
            java.lang.String r5 = "com.yalantis.ucrop.OffsetY"
            android.content.Intent r4 = r4.putExtra(r5, r7)
            r5 = -1
            r0.<init>(r3, r5, r4)
            return r0
    }

    public void V(com.yalantis.ucrop.c r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void e0(android.view.View r5, android.os.Bundle r6) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = com.yalantis.ucrop.R.color.ucrop_color_widget_background
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            java.lang.String r1 = "com.yalantis.ucrop.UcropColorWidgetActive"
            int r0 = r6.getInt(r1, r0)
            r4.e = r0
            android.content.Context r0 = r4.getContext()
            int r2 = com.yalantis.ucrop.R.color.ucrop_color_widget_active
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r2)
            int r0 = r6.getInt(r1, r0)
            r4.d = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.yalantis.ucrop.R.color.ucrop_color_default_logo
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            java.lang.String r1 = "com.yalantis.ucrop.UcropLogoColor"
            int r0 = r6.getInt(r1, r0)
            r4.g = r0
            java.lang.String r0 = "com.yalantis.ucrop.HideBottomControls"
            r1 = 0
            boolean r0 = r6.getBoolean(r0, r1)
            r2 = 1
            r0 = r0 ^ r2
            r4.h = r0
            android.content.Context r0 = r4.getContext()
            int r3 = com.yalantis.ucrop.R.color.ucrop_color_crop_background
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r3)
            java.lang.String r3 = "com.yalantis.ucrop.UcropRootViewBackgroundColor"
            int r0 = r6.getInt(r3, r0)
            r4.f = r0
            r4.O(r5)
            com.yalantis.ucrop.c r0 = r4.c
            r0.a(r2)
            boolean r0 = r4.h
            if (r0 == 0) goto Ldd
            int r0 = com.yalantis.ucrop.R.id.controls_wrapper
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setVisibility(r1)
            int r1 = r4.f
            r0.setBackgroundColor(r1)
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r3 = com.yalantis.ucrop.R.layout.ucrop_controls
            r1.inflate(r3, r0, r2)
            androidx.transition.AutoTransition r0 = new androidx.transition.AutoTransition
            r0.<init>()
            r4.i = r0
            r1 = 50
            r0.setDuration(r1)
            int r0 = com.yalantis.ucrop.R.id.state_aspect_ratio
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.m = r0
            android.view.View$OnClickListener r1 = r4.A
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.state_rotate
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.n = r0
            android.view.View$OnClickListener r1 = r4.A
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.state_scale
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.o = r0
            android.view.View$OnClickListener r1 = r4.A
            r0.setOnClickListener(r1)
            int r0 = com.yalantis.ucrop.R.id.layout_aspect_ratio
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.p = r0
            int r0 = com.yalantis.ucrop.R.id.layout_rotate_wheel
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.f41q = r0
            int r0 = com.yalantis.ucrop.R.id.layout_scale_wheel
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.r = r0
            r4.a0(r6, r5)
            r4.b0(r5)
            r4.c0(r5)
            r4.d0(r5)
        Ldd:
            return
    }

    public void onAttach(android.content.Context r3) {
            r2 = this;
            super.onAttach(r3)
            androidx.fragment.app.Fragment r0 = r2.getParentFragment()
            boolean r0 = r0 instanceof com.yalantis.ucrop.c
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r3 = r2.getParentFragment()
            com.yalantis.ucrop.c r3 = (com.yalantis.ucrop.c) r3
            r2.c = r3
            return
        L14:
            boolean r0 = r3 instanceof com.yalantis.ucrop.c
            if (r0 == 0) goto L1d
            com.yalantis.ucrop.c r3 = (com.yalantis.ucrop.c) r3
            r2.c = r3
            return
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " must implement UCropFragmentCallback"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.Nullable
    public android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r2, @androidx.annotation.Nullable android.view.ViewGroup r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            int r4 = com.yalantis.ucrop.R.layout.ucrop_fragment_photobox
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            android.os.Bundle r3 = r1.getArguments()
            r1.e0(r2, r3)
            r1.W(r3)
            r1.X()
            r1.l(r2)
            return r2
    }
}
