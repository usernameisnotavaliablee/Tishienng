package com.devlin_n.videoplayer.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class StatusView extends android.widget.LinearLayout {
    private android.widget.TextView a;
    private android.widget.TextView b;
    private android.widget.ImageView c;
    private float d;
    private float e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.devlin_n.videoplayer.widget.StatusView a;

        a(com.devlin_n.videoplayer.widget.StatusView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.devlin_n.videoplayer.widget.StatusView r4 = r3.a
                android.content.Context r4 = r4.getContext()
                android.content.Context r4 = r4.getApplicationContext()
                android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
                android.content.Intent r0 = new android.content.Intent
                com.devlin_n.videoplayer.widget.StatusView r1 = r3.a
                android.content.Context r1 = r1.getContext()
                java.lang.Class<com.devlin_n.videoplayer.player.BackgroundPlayService> r2 = com.devlin_n.videoplayer.player.BackgroundPlayService.class
                r0.<init>(r1, r2)
                r4.stopService(r0)
                return
        }
    }

    public StatusView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public StatusView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a()
            return
    }

    private void a() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.devlin_n.videoplayer.R.layout.layout_status_view
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.devlin_n.videoplayer.R.id.message
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.a = r1
            int r1 = com.devlin_n.videoplayer.R.id.status_btn
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.b = r1
            int r1 = com.devlin_n.videoplayer.R.id.btn_close
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.c = r0
            r0 = 17170444(0x106000c, float:2.4611947E-38)
            r2.setBackgroundResource(r0)
            r0 = 1
            r2.setClickable(r0)
            boolean r0 = g1.a.c
            if (r0 == 0) goto L4a
            android.widget.ImageView r0 = r2.c
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.c
            com.devlin_n.videoplayer.widget.StatusView$a r1 = new com.devlin_n.videoplayer.widget.StatusView$a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L4a:
            return
    }

    public void b(java.lang.String r2, android.view.View.OnClickListener r3) {
            r1 = this;
            android.widget.TextView r0 = r1.b
            if (r0 == 0) goto Lc
            r0.setText(r2)
            android.widget.TextView r2 = r1.b
            r2.setOnClickListener(r3)
        Lc:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 == 0) goto L4b
            r1 = 2
            if (r0 == r1) goto La
            goto L5f
        La:
            float r0 = r4.getX()
            float r1 = r3.d
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r4.getY()
            float r2 = r3.e
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            android.content.Context r2 = r3.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledTouchSlop()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L42
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5f
        L42:
            android.view.ViewParent r0 = r3.getParent()
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L5f
        L4b:
            float r0 = r4.getX()
            r3.d = r0
            float r0 = r4.getY()
            r3.e = r0
            android.view.ViewParent r0 = r3.getParent()
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
        L5f:
            boolean r4 = super.dispatchTouchEvent(r4)
            return r4
    }

    public void setMessage(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.a
            if (r0 == 0) goto L7
            r0.setText(r2)
        L7:
            return
    }
}
