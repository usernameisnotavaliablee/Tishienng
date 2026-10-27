package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewKt {
    public static /* synthetic */ void a(kotlin.jvm.functions.Function0 r0) {
            postOnAnimationDelayed$lambda$1(r0)
            return
    }

    public static final void doOnAttach(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.n1> r2) {
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto La
            r2.invoke(r1)
            return
        La:
            androidx.core.view.ViewKt$doOnAttach$1 r0 = new androidx.core.view.ViewKt$doOnAttach$1
            r0.<init>(r1, r2)
            r1.addOnAttachStateChangeListener(r0)
            return
    }

    public static final void doOnDetach(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.n1> r2) {
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto La
            r2.invoke(r1)
            return
        La:
            androidx.core.view.ViewKt$doOnDetach$1 r0 = new androidx.core.view.ViewKt$doOnDetach$1
            r0.<init>(r1, r2)
            r1.addOnAttachStateChangeListener(r0)
            return
    }

    public static final void doOnLayout(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.n1> r2) {
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto L10
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L10
            r2.invoke(r1)
            return
        L10:
            androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1 r0 = new androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
            r0.<init>(r2)
            r1.addOnLayoutChangeListener(r0)
            return
    }

    public static final void doOnNextLayout(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.n1> r2) {
            androidx.core.view.ViewKt$doOnNextLayout$1 r0 = new androidx.core.view.ViewKt$doOnNextLayout$1
            r0.<init>(r2)
            r1.addOnLayoutChangeListener(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.core.view.OneShotPreDrawListener doOnPreDraw(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.n1> r2) {
            androidx.core.view.ViewKt$doOnPreDraw$1 r0 = new androidx.core.view.ViewKt$doOnPreDraw$1
            r0.<init>(r2, r1)
            androidx.core.view.OneShotPreDrawListener r1 = androidx.core.view.OneShotPreDrawListener.add(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap drawToBitmap(@org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.Config r4) {
            boolean r0 = r3.isLaidOut()
            if (r0 == 0) goto L2a
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r1, r4)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r4)
            int r1 = r3.getScrollX()
            float r1 = (float) r1
            float r1 = -r1
            int r2 = r3.getScrollY()
            float r2 = (float) r2
            float r2 = -r2
            r0.translate(r1, r2)
            r3.draw(r0)
            return r4
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "View needs to be laid out before calling drawToBitmap()"
            r3.<init>(r4)
            throw r3
    }

    public static /* synthetic */ android.graphics.Bitmap drawToBitmap$default(android.view.View r0, android.graphics.Bitmap.Config r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = drawToBitmap(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<android.view.View> getAllViews(@org.jetbrains.annotations.NotNull android.view.View r2) {
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.sequences.m r2 = kotlin.sequences.p.b(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<android.view.ViewParent> getAncestors(@org.jetbrains.annotations.NotNull android.view.View r1) {
            android.view.ViewParent r1 = r1.getParent()
            androidx.core.view.ViewKt$ancestors$1 r0 = androidx.core.view.ViewKt$ancestors$1.INSTANCE
            kotlin.sequences.m r1 = kotlin.sequences.p.t(r1, r0)
            return r1
    }

    public static final int getMarginBottom(@org.jetbrains.annotations.NotNull android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.bottomMargin
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final int getMarginEnd(@org.jetbrains.annotations.NotNull android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lf
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.getMarginEnd()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static final int getMarginLeft(@org.jetbrains.annotations.NotNull android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.leftMargin
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final int getMarginRight(@org.jetbrains.annotations.NotNull android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.rightMargin
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final int getMarginStart(@org.jetbrains.annotations.NotNull android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lf
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.getMarginStart()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static final int getMarginTop(@org.jetbrains.annotations.NotNull android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L11
            int r1 = r1.topMargin
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final boolean isGone(@org.jetbrains.annotations.NotNull android.view.View r1) {
            int r1 = r1.getVisibility()
            r0 = 8
            if (r1 != r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final boolean isInvisible(@org.jetbrains.annotations.NotNull android.view.View r1) {
            int r1 = r1.getVisibility()
            r0 = 4
            if (r1 != r0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static final boolean isVisible(@org.jetbrains.annotations.NotNull android.view.View r0) {
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postDelayed(@org.jetbrains.annotations.NotNull android.view.View r1, long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            androidx.core.view.ViewKt$postDelayed$runnable$1 r0 = new androidx.core.view.ViewKt$postDelayed$runnable$1
            r0.<init>(r4)
            r1.postDelayed(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable postOnAnimationDelayed(@org.jetbrains.annotations.NotNull android.view.View r1, long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            androidx.core.view.l0 r0 = new androidx.core.view.l0
            r0.<init>(r4)
            r1.postOnAnimationDelayed(r0, r2)
            return r0
    }

    private static final void postOnAnimationDelayed$lambda$1(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            return
    }

    public static final void setGone(@org.jetbrains.annotations.NotNull android.view.View r0, boolean r1) {
            if (r1 == 0) goto L5
            r1 = 8
            goto L6
        L5:
            r1 = 0
        L6:
            r0.setVisibility(r1)
            return
    }

    public static final void setInvisible(@org.jetbrains.annotations.NotNull android.view.View r0, boolean r1) {
            if (r1 == 0) goto L4
            r1 = 4
            goto L5
        L4:
            r1 = 0
        L5:
            r0.setVisibility(r1)
            return
    }

    public static final void setPadding(@org.jetbrains.annotations.NotNull android.view.View r0, @androidx.annotation.Px int r1) {
            r0.setPadding(r1, r1, r1, r1)
            return
    }

    public static final void setVisible(@org.jetbrains.annotations.NotNull android.view.View r0, boolean r1) {
            if (r1 == 0) goto L4
            r1 = 0
            goto L6
        L4:
            r1 = 8
        L6:
            r0.setVisibility(r1)
            return
    }

    public static final void updateLayoutParams(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.ViewGroup.LayoutParams, kotlin.n1> r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto Ld
            r2.invoke(r0)
            r1.setLayoutParams(r0)
            return
        Ld:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r1.<init>(r2)
            throw r1
    }

    @kotlin.jvm.JvmName(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends android.view.ViewGroup.LayoutParams> void updateLayoutParamsTyped(android.view.View r3, kotlin.jvm.functions.Function1<? super T, kotlin.n1> r4) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = 1
            java.lang.String r2 = "T"
            kotlin.jvm.internal.g0.y(r1, r2)
            r4.invoke(r0)
            r3.setLayoutParams(r0)
            return
    }

    public static final void updatePadding(@org.jetbrains.annotations.NotNull android.view.View r0, @androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void updatePadding$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingLeft()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingRight()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    public static final void updatePaddingRelative(@org.jetbrains.annotations.NotNull android.view.View r0, @androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void updatePaddingRelative$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingEnd()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }
}
