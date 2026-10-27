package com.bxkj.base.v2.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBindingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindingAdapter.kt\ncom/bxkj/base/v2/base/BindingAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class o {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.base.o a = null;

    static {
            com.bxkj.base.v2.base.o r0 = new com.bxkj.base.v2.base.o
            r0.<init>()
            com.bxkj.base.v2.base.o.a = r0
            return
    }

    private o() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(android.widget.TextView r0, android.animation.ValueAnimator r1) {
            l(r0, r1)
            return
    }

    public static /* synthetic */ void b(android.widget.TextView r0, android.animation.ValueAnimator r1) {
            j(r0, r1)
            return
    }

    @androidx.databinding.BindingAdapter({"background"})
    @kotlin.jvm.JvmStatic
    public static final void c(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1, @org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable r2) {
            java.lang.String r0 = "viewGroup"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto La
            r1.setBackground(r2)
        La:
            return
    }

    @androidx.databinding.BindingAdapter({"bitmap"})
    @kotlin.jvm.JvmStatic
    public static final void d(@org.jetbrains.annotations.NotNull android.widget.ImageView r1, @org.jetbrains.annotations.Nullable android.graphics.Bitmap r2) {
            java.lang.String r0 = "imageView"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto La
            r1.setImageBitmap(r2)
        La:
            return
    }

    @androidx.databinding.BindingAdapter({"src"})
    @kotlin.jvm.JvmStatic
    public static final void e(@org.jetbrains.annotations.NotNull android.widget.ImageView r1, @org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable r2) {
            java.lang.String r0 = "imageView"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto La
            r1.setImageDrawable(r2)
        La:
            return
    }

    @androidx.databinding.BindingAdapter({"imageUrl"})
    @kotlin.jvm.JvmStatic
    public static final void f(@org.jetbrains.annotations.NotNull android.widget.ImageView r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            java.lang.String r0 = "imageView"
            kotlin.jvm.internal.g0.p(r1, r0)
            android.content.Context r0 = r1.getContext()
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            com.bumptech.glide.h r2 = r0.M(r2)
            r2.m1(r1)
            return
    }

    @androidx.databinding.BindingAdapter({"imageUrl", "placeHolder", "error"})
    @kotlin.jvm.JvmStatic
    public static final void g(@org.jetbrains.annotations.NotNull android.widget.ImageView r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable r6, @org.jetbrains.annotations.Nullable android.graphics.drawable.Drawable r7) {
            java.lang.String r0 = "imageView"
            kotlin.jvm.internal.g0.p(r4, r0)
            if (r5 == 0) goto L84
            int r0 = r5.length()
            r1 = 0
            if (r0 <= 0) goto Lf
            goto L10
        Lf:
            r5 = r1
        L10:
            if (r5 == 0) goto L84
            java.lang.String r0 = "http"
            r2 = 0
            r3 = 2
            boolean r0 = kotlin.text.u.H2(r5, r0, r2, r3, r1)
            if (r0 == 0) goto L38
            android.content.Context r0 = r4.getContext()
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            com.bumptech.glide.h r5 = r0.M(r5)
            com.bumptech.glide.request.a r5 = r5.z0(r6)
            com.bumptech.glide.h r5 = (com.bumptech.glide.h) r5
            com.bumptech.glide.request.a r5 = r5.A(r7)
            com.bumptech.glide.h r5 = (com.bumptech.glide.h) r5
            r5.m1(r4)
            return
        L38:
            java.lang.String r0 = "/"
            boolean r0 = kotlin.text.u.H2(r5, r0, r2, r3, r1)
            if (r0 == 0) goto L61
            android.content.Context r0 = r4.getContext()
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            com.bumptech.glide.h r5 = r0.J(r1)
            com.bumptech.glide.request.a r5 = r5.z0(r6)
            com.bumptech.glide.h r5 = (com.bumptech.glide.h) r5
            com.bumptech.glide.request.a r5 = r5.A(r7)
            com.bumptech.glide.h r5 = (com.bumptech.glide.h) r5
            r5.m1(r4)
            return
        L61:
            android.content.Context r0 = r4.getContext()
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.bumptech.glide.h r5 = r0.K(r5)
            com.bumptech.glide.request.a r5 = r5.z0(r6)
            com.bumptech.glide.h r5 = (com.bumptech.glide.h) r5
            com.bumptech.glide.request.a r5 = r5.A(r7)
            com.bumptech.glide.h r5 = (com.bumptech.glide.h) r5
            r5.m1(r4)
        L84:
            return
    }

    @androidx.databinding.BindingAdapter({"cardBackground"})
    @kotlin.jvm.JvmStatic
    public static final void h(@org.jetbrains.annotations.NotNull androidx.cardview.widget.CardView r1, int r2) {
            java.lang.String r0 = "cardView"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.setCardBackgroundColor(r2)
            return
    }

    private static final void j(android.widget.TextView r1, android.animation.ValueAnimator r2) {
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            return
    }

    private static final void l(android.widget.TextView r3, android.animation.ValueAnimator r4) {
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            kotlin.jvm.internal.g0.n(r4, r0)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.000"
            r0.<init>(r1)
            double r1 = (double) r4
            java.lang.String r4 = r0.format(r1)
            r3.setText(r4)
            return
    }

    @androidx.databinding.BindingAdapter({"progress", "max"})
    @kotlin.jvm.JvmStatic
    public static final void m(@org.jetbrains.annotations.NotNull android.widget.ProgressBar r1, int r2, int r3) {
            java.lang.String r0 = "progressBar"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.setMax(r3)
            r1.setProgress(r2)
            return
    }

    @androidx.databinding.BindingAdapter({"count", "distance"})
    @kotlin.jvm.JvmStatic
    public static final void n(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.common.view.SportCardView r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
            java.lang.String r0 = "sportCardView"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "findViewById(...)"
            if (r4 == 0) goto L1e
            com.bxkj.base.v2.base.o r1 = com.bxkj.base.v2.base.o.a
            int r2 = com.bxkj.base.R.id.tv_count
            android.view.View r2 = r3.findViewById(r2)
            kotlin.jvm.internal.g0.o(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            float r4 = java.lang.Float.parseFloat(r4)
            int r4 = (int) r4
            r1.i(r2, r4)
        L1e:
            if (r5 == 0) goto L34
            com.bxkj.base.v2.base.o r4 = com.bxkj.base.v2.base.o.a
            int r1 = com.bxkj.base.R.id.tv_distance
            android.view.View r3 = r3.findViewById(r1)
            kotlin.jvm.internal.g0.o(r3, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            float r5 = java.lang.Float.parseFloat(r5)
            r4.k(r3, r5)
        L34:
            return
    }

    public final void i(@org.jetbrains.annotations.NotNull android.widget.TextView r3, int r4) {
            r2 = this;
            java.lang.String r0 = "tvCount"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int[] r4 = new int[]{r0, r4}
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofInt(r4)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.setDuration(r0)
            com.bxkj.base.v2.base.n r0 = new com.bxkj.base.v2.base.n
            r0.<init>(r3)
            r4.addUpdateListener(r0)
            r4.start()
            return
    }

    public final void k(@org.jetbrains.annotations.NotNull android.widget.TextView r4, float r5) {
            r3 = this;
            java.lang.String r0 = "tvDistance"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r5
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.setDuration(r0)
            com.bxkj.base.v2.base.m r0 = new com.bxkj.base.v2.base.m
            r0.<init>(r4)
            r5.addUpdateListener(r0)
            r5.start()
            return
    }
}
