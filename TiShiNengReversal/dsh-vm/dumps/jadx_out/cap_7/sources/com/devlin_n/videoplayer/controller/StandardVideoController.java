package com.devlin_n.videoplayer.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class StandardVideoController extends com.devlin_n.videoplayer.controller.BaseVideoController implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener {
    protected android.widget.SeekBar A;
    protected android.widget.ImageView B;
    protected android.widget.ImageView C;
    protected android.widget.ImageView D;
    protected android.widget.TextView E;
    private boolean F;
    private boolean G;
    private android.view.View H;
    private android.widget.ProgressBar I;
    private android.widget.ImageView J;
    private android.widget.ImageView K;
    private android.widget.ProgressBar L;
    private android.widget.ImageView M;
    private android.widget.LinearLayout N;
    private android.view.animation.Animation O;
    private android.view.animation.Animation P;
    private androidx.appcompat.widget.PopupMenu Q;
    protected android.widget.TextView v;
    protected android.widget.TextView w;
    protected android.widget.ImageView x;
    protected android.widget.LinearLayout y;
    protected android.widget.LinearLayout z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
        final /* synthetic */ com.devlin_n.videoplayer.controller.StandardVideoController a;

        a(com.devlin_n.videoplayer.controller.StandardVideoController r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                int r3 = r3.getItemId()
                int r0 = com.devlin_n.videoplayer.R.id.scale_default
                r1 = 0
                if (r3 != r0) goto L11
                com.devlin_n.videoplayer.controller.StandardVideoController r3 = r2.a
                com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r3.b
                r3.f(r1)
                goto L44
            L11:
                int r0 = com.devlin_n.videoplayer.R.id.scale_original
                if (r3 != r0) goto L1e
                com.devlin_n.videoplayer.controller.StandardVideoController r3 = r2.a
                com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r3.b
                r0 = 4
                r3.f(r0)
                goto L44
            L1e:
                int r0 = com.devlin_n.videoplayer.R.id.scale_match
                if (r3 != r0) goto L2b
                com.devlin_n.videoplayer.controller.StandardVideoController r3 = r2.a
                com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r3.b
                r0 = 3
                r3.f(r0)
                goto L44
            L2b:
                int r0 = com.devlin_n.videoplayer.R.id.scale_16_9
                if (r3 != r0) goto L38
                com.devlin_n.videoplayer.controller.StandardVideoController r3 = r2.a
                com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r3.b
                r0 = 1
                r3.f(r0)
                goto L44
            L38:
                int r0 = com.devlin_n.videoplayer.R.id.scale_4_3
                if (r3 != r0) goto L44
                com.devlin_n.videoplayer.controller.StandardVideoController r3 = r2.a
                com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r3.b
                r0 = 2
                r3.f(r0)
            L44:
                com.devlin_n.videoplayer.controller.StandardVideoController r3 = r2.a
                androidx.appcompat.widget.PopupMenu r3 = com.devlin_n.videoplayer.controller.StandardVideoController.l(r3)
                r3.dismiss()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ com.devlin_n.videoplayer.controller.StandardVideoController a;

        b(com.devlin_n.videoplayer.controller.StandardVideoController r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.devlin_n.videoplayer.controller.StandardVideoController r0 = r4.a
                android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
                int r2 = g1.a.b
                int r3 = g1.a.a
                r1.<init>(r2, r3)
                r0.setLayoutParams(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnTouchListener {
        final /* synthetic */ com.devlin_n.videoplayer.controller.StandardVideoController a;

        c(com.devlin_n.videoplayer.controller.StandardVideoController r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    public StandardVideoController(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public StandardVideoController(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public StandardVideoController(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, @androidx.annotation.AttrRes int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            int r2 = com.devlin_n.videoplayer.R.anim.anim_alpha_in
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.O = r1
            android.content.Context r1 = r0.getContext()
            int r2 = com.devlin_n.videoplayer.R.anim.anim_alpha_out
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.P = r1
            return
    }

    static /* synthetic */ androidx.appcompat.widget.PopupMenu l(com.devlin_n.videoplayer.controller.StandardVideoController r0) {
            androidx.appcompat.widget.PopupMenu r0 = r0.Q
            return r0
    }

    private void m() {
            r3 = this;
            boolean r0 = r3.f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            r3.f = r2
            r3.c = r2
            r3.k = r1
            r3.g()
            android.widget.ImageView r0 = r3.D
            r0.setSelected(r2)
            android.content.Context r0 = r3.getContext()
            int r1 = com.devlin_n.videoplayer.R.string.unlocked
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L3b
        L22:
            r3.d()
            r3.f = r1
            r3.k = r2
            android.widget.ImageView r0 = r3.D
            r0.setSelected(r1)
            android.content.Context r0 = r3.getContext()
            int r1 = com.devlin_n.videoplayer.R.string.locked
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        L3b:
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r3.b
            boolean r1 = r3.f
            r0.setLock(r1)
            return
    }

    private void n() {
            r3 = this;
            android.widget.LinearLayout r0 = r3.z
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r3.z
            android.view.animation.Animation r2 = r3.P
            r0.startAnimation(r2)
            android.widget.LinearLayout r0 = r3.y
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r3.y
            android.view.animation.Animation r1 = r3.P
            r0.startAnimation(r1)
            return
    }

    private void o(int r4) {
            r3 = this;
            boolean r0 = r3.c
            if (r0 != 0) goto L36
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r3.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L1a
            android.widget.ImageView r0 = r3.D
            r1 = 0
            r0.setVisibility(r1)
            boolean r0 = r3.f
            if (r0 != 0) goto L1d
            r3.p()
            goto L1d
        L1a:
            r3.p()
        L1d:
            boolean r0 = r3.f
            if (r0 != 0) goto L33
            boolean r0 = r3.F
            if (r0 != 0) goto L33
            android.widget.ProgressBar r0 = r3.I
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r3.I
            android.view.animation.Animation r1 = r3.P
            r0.startAnimation(r1)
        L33:
            r0 = 1
            r3.c = r0
        L36:
            java.lang.Runnable r0 = r3.q
            r3.removeCallbacks(r0)
            if (r4 == 0) goto L43
            java.lang.Runnable r0 = r3.q
            long r1 = (long) r4
            r3.postDelayed(r0, r1)
        L43:
            return
    }

    private void p() {
            r3 = this;
            android.widget.LinearLayout r0 = r3.y
            r1 = 0
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r3.y
            android.view.animation.Animation r2 = r3.O
            r0.startAnimation(r2)
            android.widget.LinearLayout r0 = r3.z
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r3.z
            android.view.animation.Animation r1 = r3.O
            r0.startAnimation(r1)
            android.content.Context r0 = r3.getContext()
            g1.f.n(r0)
            android.content.Context r0 = r3.getContext()
            g1.f.m(r0)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void d() {
            r3 = this;
            boolean r0 = r3.c
            if (r0 == 0) goto L43
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r3.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L29
            android.widget.ImageView r0 = r3.D
            r1 = 8
            r0.setVisibility(r1)
            boolean r0 = r3.f
            if (r0 != 0) goto L2c
            r3.n()
            android.content.Context r0 = r3.getContext()
            g1.f.j(r0)
            android.content.Context r0 = r3.getContext()
            g1.f.i(r0)
            goto L2c
        L29:
            r3.n()
        L2c:
            boolean r0 = r3.F
            r1 = 0
            if (r0 != 0) goto L41
            boolean r0 = r3.f
            if (r0 != 0) goto L41
            android.widget.ProgressBar r0 = r3.I
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r3.I
            android.view.animation.Animation r2 = r3.O
            r0.startAnimation(r2)
        L41:
            r3.c = r1
        L43:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected void e() {
            r4 = this;
            super.e()
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.more_menu
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.B = r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.fullscreen
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.x = r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.bottom_container
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.y = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.top_container
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.z = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.seekBar
            android.view.View r0 = r0.findViewById(r1)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r4.A = r0
            r0.setOnSeekBarChangeListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.total_time
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.v = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.curr_time
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.w = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.back
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.C = r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.lock
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.D = r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.thumb
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.M = r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.iv_play
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.J = r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.start_play
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.K = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.loading
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r4.L = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.bottom_progress
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r4.I = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.iv_replay
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.complete_container
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.N = r0
            r0.setOnClickListener(r4)
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.E = r0
            android.view.View r0 = r4.a
            int r1 = com.devlin_n.videoplayer.R.id.status_holder
            android.view.View r0 = r0.findViewById(r1)
            r4.H = r0
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r2 = r4.getContext()
            double r2 = g1.f.f(r2)
            int r2 = (int) r2
            r3 = -1
            r1.<init>(r3, r2)
            r0.setLayoutParams(r1)
            androidx.appcompat.widget.PopupMenu r0 = new androidx.appcompat.widget.PopupMenu
            android.content.Context r1 = r4.getContext()
            android.widget.ImageView r2 = r4.B
            r3 = 8388613(0x800005, float:1.175495E-38)
            r0.<init>(r1, r2, r3)
            r4.Q = r0
            android.view.MenuInflater r0 = r0.getMenuInflater()
            int r1 = com.devlin_n.videoplayer.R.menu.controller_menu
            androidx.appcompat.widget.PopupMenu r2 = r4.Q
            android.view.Menu r2 = r2.getMenu()
            r0.inflate(r1, r2)
            androidx.appcompat.widget.PopupMenu r0 = r4.Q
            com.devlin_n.videoplayer.controller.StandardVideoController$a r1 = new com.devlin_n.videoplayer.controller.StandardVideoController$a
            r1.<init>(r4)
            r0.setOnMenuItemClickListener(r1)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected int f() {
            r7 = this;
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r7.b
            r1 = 0
            if (r0 == 0) goto L8b
            boolean r2 = r7.G
            if (r2 == 0) goto Lb
            goto L8b
        Lb:
            int r0 = r0.getCurrentPosition()
            com.devlin_n.videoplayer.controller.BaseVideoController$d r2 = r7.b
            int r2 = r2.getDuration()
            android.widget.SeekBar r3 = r7.A
            if (r3 == 0) goto L67
            if (r2 <= 0) goto L3b
            r1 = 1
            r3.setEnabled(r1)
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r5
            double r5 = (double) r2
            double r3 = r3 / r5
            android.widget.SeekBar r1 = r7.A
            int r1 = r1.getMax()
            double r5 = (double) r1
            double r3 = r3 * r5
            int r1 = (int) r3
            android.widget.SeekBar r3 = r7.A
            r3.setProgress(r1)
            android.widget.ProgressBar r3 = r7.I
            r3.setProgress(r1)
            goto L3e
        L3b:
            r3.setEnabled(r1)
        L3e:
            com.devlin_n.videoplayer.controller.BaseVideoController$d r1 = r7.b
            int r1 = r1.getBufferPercentage()
            r3 = 95
            if (r1 < r3) goto L5b
            android.widget.SeekBar r1 = r7.A
            int r3 = r1.getMax()
            r1.setSecondaryProgress(r3)
            android.widget.ProgressBar r1 = r7.I
            int r3 = r1.getMax()
            r1.setSecondaryProgress(r3)
            goto L67
        L5b:
            android.widget.SeekBar r3 = r7.A
            int r1 = r1 * 10
            r3.setSecondaryProgress(r1)
            android.widget.ProgressBar r3 = r7.I
            r3.setSecondaryProgress(r1)
        L67:
            android.widget.TextView r1 = r7.v
            if (r1 == 0) goto L72
            java.lang.String r2 = r7.k(r2)
            r1.setText(r2)
        L72:
            android.widget.TextView r1 = r7.w
            if (r1 == 0) goto L7d
            java.lang.String r2 = r7.k(r0)
            r1.setText(r2)
        L7d:
            android.widget.TextView r1 = r7.E
            if (r1 == 0) goto L8a
            com.devlin_n.videoplayer.controller.BaseVideoController$d r2 = r7.b
            java.lang.String r2 = r2.getTitle()
            r1.setText(r2)
        L8a:
            return r0
        L8b:
            return r1
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void g() {
            r1 = this;
            int r0 = r1.g
            r1.o(r0)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected int getLayoutId() {
            r1 = this;
            int r0 = com.devlin_n.videoplayer.R.layout.layout_standard_controller
            return r0
    }

    public android.widget.ImageView getThumb() {
            r1 = this;
            android.widget.ImageView r0 = r1.M
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    protected void i(float r2) {
            r1 = this;
            boolean r0 = r1.F
            if (r0 == 0) goto L8
            r2 = 0
            r1.u = r2
            return
        L8:
            super.i(r2)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.devlin_n.videoplayer.R.id.fullscreen
            if (r2 == r0) goto L33
            int r0 = com.devlin_n.videoplayer.R.id.back
            if (r2 != r0) goto Ld
            goto L33
        Ld:
            int r0 = com.devlin_n.videoplayer.R.id.lock
            if (r2 != r0) goto L15
            r1.m()
            return
        L15:
            int r0 = com.devlin_n.videoplayer.R.id.iv_play
            if (r2 == r0) goto L2f
            int r0 = com.devlin_n.videoplayer.R.id.thumb
            if (r2 == r0) goto L2f
            int r0 = com.devlin_n.videoplayer.R.id.iv_replay
            if (r2 != r0) goto L22
            goto L2f
        L22:
            int r0 = com.devlin_n.videoplayer.R.id.more_menu
            if (r2 != r0) goto L2e
            androidx.appcompat.widget.PopupMenu r2 = r1.Q
            r2.show()
            r1.g()
        L2e:
            return
        L2f:
            r1.b()
            return
        L33:
            r1.c()
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar r3, int r4, boolean r5) {
            r2 = this;
            if (r5 != 0) goto L3
            goto L21
        L3:
            com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r2.b
            int r3 = r3.getDuration()
            long r0 = (long) r3
            long r3 = (long) r4
            long r0 = r0 * r3
            android.widget.SeekBar r3 = r2.A
            int r3 = r3.getMax()
            long r3 = (long) r3
            long r0 = r0 / r3
            android.widget.TextView r3 = r2.w
            if (r3 == 0) goto L21
            int r4 = (int) r0
            java.lang.String r4 = r2.k(r4)
            r3.setText(r4)
        L21:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            r1 = 1
            r0.G = r1
            java.lang.Runnable r1 = r0.p
            r0.removeCallbacks(r1)
            java.lang.Runnable r1 = r0.q
            r0.removeCallbacks(r1)
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar r5) {
            r4 = this;
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r4.b
            int r0 = r0.getDuration()
            long r0 = (long) r0
            int r5 = r5.getProgress()
            long r2 = (long) r5
            long r0 = r0 * r2
            android.widget.SeekBar r5 = r4.A
            int r5 = r5.getMax()
            long r2 = (long) r5
            long r0 = r0 / r2
            com.devlin_n.videoplayer.controller.BaseVideoController$d r5 = r4.b
            int r1 = (int) r0
            r5.seekTo(r1)
            r5 = 0
            r4.G = r5
            java.lang.Runnable r5 = r4.p
            r4.post(r5)
            r4.g()
            return
    }

    public void q() {
            r2 = this;
            android.widget.TextView r0 = r2.E
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    public void setCanFast(boolean r2) {
            r1 = this;
            android.widget.SeekBar r2 = r1.A
            com.devlin_n.videoplayer.controller.StandardVideoController$c r0 = new com.devlin_n.videoplayer.controller.StandardVideoController$c
            r0.<init>(r1)
            r2.setOnTouchListener(r0)
            return
    }

    public void setLive(boolean r2) {
            r1 = this;
            r1.F = r2
            android.widget.ProgressBar r2 = r1.I
            r0 = 8
            r2.setVisibility(r0)
            android.widget.SeekBar r2 = r1.A
            r0 = 4
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.v
            r2.setVisibility(r0)
            android.widget.ImageView r2 = r1.B
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void setPlayState(int r3) {
            r2 = this;
            super.setPlayState(r3)
            r0 = 8
            r1 = 0
            switch(r3) {
                case -1: goto Lc6;
                case 0: goto L98;
                case 1: goto L83;
                case 2: goto L6f;
                case 3: goto L54;
                case 4: goto L49;
                case 5: goto L25;
                case 6: goto L15;
                case 7: goto La;
                default: goto L9;
            }
        L9:
            return
        La:
            android.widget.ProgressBar r3 = r2.L
            r3.setVisibility(r0)
            java.lang.String r3 = "STATE_BUFFERED"
            g1.c.b(r3)
            return
        L15:
            java.lang.String r3 = "STATE_BUFFERING"
            g1.c.b(r3)
            android.widget.ImageView r3 = r2.K
            r3.setVisibility(r0)
            android.widget.ProgressBar r3 = r2.L
            r3.setVisibility(r1)
            return
        L25:
            java.lang.String r3 = "STATE_PLAYBACK_COMPLETED"
            g1.c.b(r3)
            r2.d()
            android.widget.ImageView r3 = r2.M
            r3.setVisibility(r1)
            android.widget.LinearLayout r3 = r2.N
            r3.setVisibility(r1)
            android.widget.ProgressBar r3 = r2.I
            r3.setProgress(r1)
            android.widget.ProgressBar r3 = r2.I
            r3.setSecondaryProgress(r1)
            r2.f = r1
            com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r2.b
            r3.setLock(r1)
            return
        L49:
            java.lang.String r3 = "STATE_PAUSED"
            g1.c.b(r3)
            android.widget.ImageView r3 = r2.J
            r3.setSelected(r1)
            return
        L54:
            java.lang.String r3 = "STATE_PLAYING"
            g1.c.b(r3)
            java.lang.Runnable r3 = r2.p
            r2.post(r3)
            android.widget.ImageView r3 = r2.J
            r1 = 1
            r3.setSelected(r1)
            android.widget.LinearLayout r3 = r2.N
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.M
            r3.setVisibility(r0)
            return
        L6f:
            java.lang.String r3 = "STATE_PREPARED"
            g1.c.b(r3)
            boolean r3 = r2.F
            if (r3 != 0) goto L7d
            android.widget.ProgressBar r3 = r2.I
            r3.setVisibility(r1)
        L7d:
            android.widget.ProgressBar r3 = r2.L
            r3.setVisibility(r0)
            return
        L83:
            java.lang.String r3 = "STATE_PREPARING"
            g1.c.b(r3)
            android.widget.LinearLayout r3 = r2.N
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.K
            r3.setVisibility(r0)
            android.widget.ProgressBar r3 = r2.L
            r3.setVisibility(r1)
            return
        L98:
            java.lang.String r3 = "STATE_IDLE"
            g1.c.b(r3)
            r2.d()
            r2.f = r1
            android.widget.ImageView r3 = r2.D
            r3.setSelected(r1)
            com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r2.b
            r3.setLock(r1)
            android.widget.LinearLayout r3 = r2.N
            r3.setVisibility(r0)
            android.widget.ProgressBar r3 = r2.I
            r3.setVisibility(r0)
            android.widget.ProgressBar r3 = r2.L
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.K
            r3.setVisibility(r1)
            android.widget.ImageView r3 = r2.M
            r3.setVisibility(r1)
            return
        Lc6:
            java.lang.String r3 = "STATE_ERROR"
            g1.c.b(r3)
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController
    public void setPlayerState(int r6) {
            r5 = this;
            r0 = 10
            r1 = 8
            r2 = 0
            if (r6 == r0) goto L55
            r0 = 11
            if (r6 == r0) goto Lc
            goto L5e
        Lc:
            java.lang.String r6 = "PLAYER_FULL_SCREEN"
            g1.c.b(r6)
            boolean r6 = r5.f
            if (r6 == 0) goto L16
            goto L5e
        L16:
            com.devlin_n.videoplayer.controller.StandardVideoController$b r6 = new com.devlin_n.videoplayer.controller.StandardVideoController$b
            r6.<init>(r5)
            r3 = 300(0x12c, double:1.48E-321)
            r5.postDelayed(r6, r3)
            r6 = 1
            r5.k = r6
            android.widget.ImageView r0 = r5.x
            r0.setSelected(r6)
            android.view.View r6 = r5.H
            r6.setVisibility(r2)
            android.widget.ImageView r6 = r5.C
            r6.setVisibility(r2)
            android.widget.TextView r6 = r5.E
            r6.setVisibility(r2)
            boolean r6 = r5.c
            if (r6 == 0) goto L4f
            android.widget.ImageView r6 = r5.D
            r6.setVisibility(r2)
            android.content.Context r6 = r5.getContext()
            g1.f.m(r6)
            android.content.Context r6 = r5.getContext()
            g1.f.n(r6)
            return
        L4f:
            android.widget.ImageView r6 = r5.D
            r6.setVisibility(r1)
            return
        L55:
            java.lang.String r6 = "PLAYER_NORMAL"
            g1.c.b(r6)
            boolean r6 = r5.f
            if (r6 == 0) goto L5f
        L5e:
            return
        L5f:
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r6.<init>(r0, r0)
            r5.setLayoutParams(r6)
            r5.k = r2
            android.widget.ImageView r6 = r5.x
            r6.setSelected(r2)
            android.widget.ImageView r6 = r5.C
            r6.setVisibility(r1)
            android.widget.ImageView r6 = r5.D
            r6.setVisibility(r1)
            android.view.View r6 = r5.H
            r6.setVisibility(r1)
            android.widget.TextView r6 = r5.E
            r0 = 4
            r6.setVisibility(r0)
            return
    }
}
