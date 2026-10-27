package com.yalantis.ucrop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UCropView extends android.widget.FrameLayout {
    private com.yalantis.ucrop.view.GestureCropImageView a;
    private final com.yalantis.ucrop.view.OverlayView b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements e3.c {
        final /* synthetic */ com.yalantis.ucrop.view.UCropView a;

        a(com.yalantis.ucrop.view.UCropView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // e3.c
        public void a(float r2) {
                r1 = this;
                com.yalantis.ucrop.view.UCropView r0 = r1.a
                com.yalantis.ucrop.view.OverlayView r0 = com.yalantis.ucrop.view.UCropView.a(r0)
                r0.setTargetAspectRatio(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements e3.d {
        final /* synthetic */ com.yalantis.ucrop.view.UCropView a;

        b(com.yalantis.ucrop.view.UCropView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // e3.d
        public void a(android.graphics.RectF r2) {
                r1 = this;
                com.yalantis.ucrop.view.UCropView r0 = r1.a
                com.yalantis.ucrop.view.GestureCropImageView r0 = com.yalantis.ucrop.view.UCropView.b(r0)
                r0.setCropRect(r2)
                return
        }
    }

    public UCropView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public UCropView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r3)
            int r0 = com.yalantis.ucrop.R.layout.ucrop_view
            r1 = 1
            r5.inflate(r0, r2, r1)
            int r5 = com.yalantis.ucrop.R.id.image_view_crop
            android.view.View r5 = r2.findViewById(r5)
            com.yalantis.ucrop.view.GestureCropImageView r5 = (com.yalantis.ucrop.view.GestureCropImageView) r5
            r2.a = r5
            int r5 = com.yalantis.ucrop.R.id.view_overlay
            android.view.View r5 = r2.findViewById(r5)
            com.yalantis.ucrop.view.OverlayView r5 = (com.yalantis.ucrop.view.OverlayView) r5
            r2.b = r5
            int[] r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            r5.h(r3)
            com.yalantis.ucrop.view.GestureCropImageView r4 = r2.a
            r4.x(r3)
            r3.recycle()
            r2.d()
            return
    }

    static /* synthetic */ com.yalantis.ucrop.view.OverlayView a(com.yalantis.ucrop.view.UCropView r0) {
            com.yalantis.ucrop.view.OverlayView r0 = r0.b
            return r0
    }

    static /* synthetic */ com.yalantis.ucrop.view.GestureCropImageView b(com.yalantis.ucrop.view.UCropView r0) {
            com.yalantis.ucrop.view.GestureCropImageView r0 = r0.a
            return r0
    }

    private void d() {
            r2 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.a
            com.yalantis.ucrop.view.UCropView$a r1 = new com.yalantis.ucrop.view.UCropView$a
            r1.<init>(r2)
            r0.setCropBoundsChangeListener(r1)
            com.yalantis.ucrop.view.OverlayView r0 = r2.b
            com.yalantis.ucrop.view.UCropView$b r1 = new com.yalantis.ucrop.view.UCropView$b
            r1.<init>(r2)
            r0.setOverlayViewChangeListener(r1)
            return
    }

    public void c() {
            r2 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.a
            r2.removeView(r0)
            com.yalantis.ucrop.view.GestureCropImageView r0 = new com.yalantis.ucrop.view.GestureCropImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.a = r0
            r2.d()
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.a
            com.yalantis.ucrop.view.OverlayView r1 = r2.getOverlayView()
            android.graphics.RectF r1 = r1.getCropViewRect()
            r0.setCropRect(r1)
            com.yalantis.ucrop.view.GestureCropImageView r0 = r2.a
            r1 = 0
            r2.addView(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    public com.yalantis.ucrop.view.GestureCropImageView getCropImageView() {
            r1 = this;
            com.yalantis.ucrop.view.GestureCropImageView r0 = r1.a
            return r0
    }

    @androidx.annotation.NonNull
    public com.yalantis.ucrop.view.OverlayView getOverlayView() {
            r1 = this;
            com.yalantis.ucrop.view.OverlayView r0 = r1.b
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
