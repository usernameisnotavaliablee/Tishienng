package com.devlin_n.videoplayer.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class AdController extends com.devlin_n.videoplayer.controller.BaseVideoController implements android.view.View.OnClickListener {
    protected android.widget.ImageView A;
    protected android.widget.TextView v;
    protected android.widget.TextView w;
    protected android.widget.ImageView x;
    protected android.widget.ImageView y;
    protected android.widget.ImageView z;

    public AdController(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AdController(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void l() {
            r2 = this;
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            r0.h()
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            boolean r0 = r0.isMute()
            if (r0 == 0) goto L15
            android.widget.ImageView r0 = r2.y
            int r1 = com.devlin_n.videoplayer.R.drawable.ic_action_volume_up
            r0.setImageResource(r1)
            return
        L15:
            android.widget.ImageView r0 = r2.y
            int r1 = com.devlin_n.videoplayer.R.drawable.ic_action_volume_off
            r0.setImageResource(r1)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected void e() {
            r2 = this;
            super.e()
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.ad_time
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.v = r0
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.ad_detail
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.w = r0
            java.lang.String r1 = "了解详情>"
            r0.setText(r1)
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.back
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.x = r0
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.iv_volume
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.y = r0
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.fullscreen
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.z = r0
            android.view.View r0 = r2.a
            int r1 = com.devlin_n.videoplayer.R.id.iv_play
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.A = r0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.v
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.w
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r2.x
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r2.y
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r2.z
            r0.setOnClickListener(r2)
            r0 = 1
            r2.c = r0
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected int f() {
            r5 = this;
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r5.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.getCurrentPosition()
            com.devlin_n.videoplayer.controller.BaseVideoController$d r2 = r5.b
            int r2 = r2.getDuration()
            android.widget.TextView r3 = r5.v
            if (r3 == 0) goto L29
            int r2 = r2 - r0
            int r2 = r2 / 1000
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r2
            java.lang.String r1 = "%s | 跳过"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r3.setText(r1)
        L29:
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected int getLayoutId() {
            r1 = this;
            int r0 = com.devlin_n.videoplayer.R.layout.layout_ad_controller
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            int r0 = com.devlin_n.videoplayer.R.id.back
            r1 = 0
            r2 = 1
            if (r5 != r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            int r3 = com.devlin_n.videoplayer.R.id.fullscreen
            if (r5 != r3) goto L12
            r1 = 1
        L12:
            r0 = r0 | r1
            if (r0 == 0) goto L19
            r4.c()
            return
        L19:
            int r0 = com.devlin_n.videoplayer.R.id.iv_volume
            if (r5 != r0) goto L21
            r4.l()
            return
        L21:
            int r0 = com.devlin_n.videoplayer.R.id.ad_detail
            if (r5 != r0) goto L2d
            f1.a r5 = r4.n
            if (r5 == 0) goto L3e
            r5.onAdClick()
            return
        L2d:
            int r0 = com.devlin_n.videoplayer.R.id.ad_time
            if (r5 != r0) goto L37
            com.devlin_n.videoplayer.controller.BaseVideoController$d r5 = r4.b
            r5.e()
            return
        L37:
            int r0 = com.devlin_n.videoplayer.R.id.iv_play
            if (r5 != r0) goto L3e
            r4.b()
        L3e:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            int r1 = r1.getAction()
            if (r1 == 0) goto L7
            goto Le
        L7:
            f1.a r1 = r0.n
            if (r1 == 0) goto Le
            r1.onAdClick()
        Le:
            r1 = 0
            return r1
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void setPlayState(int r2) {
            r1 = this;
            super.setPlayState(r2)
            r0 = 3
            if (r2 == r0) goto L11
            r0 = 4
            if (r2 == r0) goto La
            return
        La:
            android.widget.ImageView r2 = r1.A
            r0 = 0
            r2.setSelected(r0)
            return
        L11:
            java.lang.Runnable r2 = r1.p
            r1.post(r2)
            android.widget.ImageView r2 = r1.A
            r0 = 1
            r2.setSelected(r0)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void setPlayerState(int r2) {
            r1 = this;
            super.setPlayerState(r2)
            r0 = 10
            if (r2 == r0) goto L13
            r0 = 11
            if (r2 == r0) goto Lc
            return
        Lc:
            android.widget.ImageView r2 = r1.x
            r0 = 0
            r2.setVisibility(r0)
            return
        L13:
            android.widget.ImageView r2 = r1.x
            r0 = 8
            r2.setVisibility(r0)
            return
    }
}
