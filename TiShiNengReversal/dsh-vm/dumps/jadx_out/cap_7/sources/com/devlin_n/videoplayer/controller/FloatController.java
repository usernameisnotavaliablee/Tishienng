package com.devlin_n.videoplayer.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class FloatController extends com.devlin_n.videoplayer.controller.BaseVideoController implements android.view.View.OnClickListener {
    private android.widget.ProgressBar v;
    private android.widget.ImageView w;

    public FloatController(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FloatController(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void l(int r4) {
            r3 = this;
            int r0 = r3.o
            r1 = 6
            if (r0 != r1) goto L6
            goto L20
        L6:
            boolean r0 = r3.c
            if (r0 != 0) goto L10
            android.widget.ImageView r0 = r3.w
            r1 = 0
            r0.setVisibility(r1)
        L10:
            r0 = 1
            r3.c = r0
            java.lang.Runnable r0 = r3.q
            r3.removeCallbacks(r0)
            if (r4 == 0) goto L20
            java.lang.Runnable r0 = r3.q
            long r1 = (long) r4
            r3.postDelayed(r0, r1)
        L20:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void d() {
            r2 = this;
            int r0 = r2.o
            r1 = 6
            if (r0 != r1) goto L6
            goto L14
        L6:
            boolean r0 = r2.c
            if (r0 == 0) goto L14
            android.widget.ImageView r0 = r2.w
            r1 = 8
            r0.setVisibility(r1)
            r0 = 0
            r2.c = r0
        L14:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected void e() {
            r2 = this;
            super.e()
            r2.setOnClickListener(r2)
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.btn_close
            android.view.View r0 = r0.findViewById(r1)
            r0.setOnClickListener(r2)
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.loading
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r2.v = r0
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.start_play
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.w = r0
            r0.setOnClickListener(r2)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void g() {
            r1 = this;
            int r0 = r1.g
            r1.l(r0)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected int getLayoutId() {
            r1 = this;
            int r0 = com.devlin_n.videoplayer.R.layout.layout_float_controller
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.devlin_n.videoplayer.R.id.btn_close
            if (r2 != r0) goto Le
            com.devlin_n.videoplayer.controller.BaseVideoController$d r2 = r1.b
            r2.d()
            return
        Le:
            int r0 = com.devlin_n.videoplayer.R.id.start_play
            if (r2 != r0) goto L15
            r1.b()
        L15:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void setPlayState(int r3) {
            r2 = this;
            super.setPlayState(r3)
            r0 = 0
            r1 = 8
            switch(r3) {
                case 0: goto L61;
                case 1: goto L56;
                case 2: goto L4b;
                case 3: goto L37;
                case 4: goto L24;
                case 5: goto L20;
                case 6: goto L15;
                case 7: goto La;
                default: goto L9;
            }
        L9:
            return
        La:
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r1)
            android.widget.ProgressBar r3 = r2.v
            r3.setVisibility(r1)
            return
        L15:
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r1)
            android.widget.ProgressBar r3 = r2.v
            r3.setVisibility(r0)
            return
        L20:
            r2.l(r0)
            return
        L24:
            android.widget.ImageView r3 = r2.w
            r3.setSelected(r0)
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r0)
            android.widget.ProgressBar r3 = r2.v
            r3.setVisibility(r1)
            r2.l(r0)
            return
        L37:
            android.widget.ImageView r3 = r2.w
            r0 = 1
            r3.setSelected(r0)
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r1)
            android.widget.ProgressBar r3 = r2.v
            r3.setVisibility(r1)
            r2.d()
            return
        L4b:
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r1)
            android.widget.ProgressBar r3 = r2.v
            r3.setVisibility(r1)
            return
        L56:
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r1)
            android.widget.ProgressBar r3 = r2.v
            r3.setVisibility(r0)
            return
        L61:
            android.widget.ImageView r3 = r2.w
            r3.setSelected(r0)
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r0)
            android.widget.ProgressBar r3 = r2.v
            r3.setVisibility(r1)
            return
    }
}
