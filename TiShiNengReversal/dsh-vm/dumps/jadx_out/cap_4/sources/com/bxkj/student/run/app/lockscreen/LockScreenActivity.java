package com.bxkj.student.run.app.lockscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LockScreenActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.content.BroadcastReceiver G0;
    private com.romainpiel.shimmer.ShimmerTextView H0;
    private com.romainpiel.shimmer.b I0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1170k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1171p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.run.app.lockscreen.LockScreenActivity a;

        a(com.bxkj.student.run.app.lockscreen.LockScreenActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "NOTIFY_RUN_DATA"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L61
                java.lang.String r3 = "distance"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L21
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.h0(r0)
                java.lang.String r3 = r4.getStringExtra(r3)
                r0.setText(r3)
            L21:
                java.lang.String r3 = "speed"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L36
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.k0(r0)
                java.lang.String r3 = r4.getStringExtra(r3)
                r0.setText(r3)
            L36:
                java.lang.String r3 = "peisu"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L4b
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.j0(r0)
                java.lang.String r3 = r4.getStringExtra(r3)
                r0.setText(r3)
            L4b:
                java.lang.String r3 = "time"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto Le3
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.m0(r0)
                java.lang.String r3 = r4.getStringExtra(r3)
                r0.setText(r3)
                return
            L61:
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "UPDATE_STEP"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L88
                java.lang.String r3 = "stepCount"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto Le3
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.l0(r0)
                r1 = 0
                int r3 = r4.getIntExtra(r3, r1)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.setText(r3)
                return
            L88:
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "RUN_PAUSE_NOTIFICATION"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto Laa
                java.lang.String r3 = "message"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto Le3
                java.lang.String r3 = r4.getStringExtra(r3)
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r4 = r2.a
                android.widget.TextView r4 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.i0(r4)
                r4.setText(r3)
                return
            Laa:
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "RUN_CONTINUE_NOTIFICATION"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto Lc2
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r3 = r2.a
                android.widget.TextView r3 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.i0(r3)
                java.lang.String r4 = ""
                r3.setText(r4)
                return
            Lc2:
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "RUN_DEBUG_INFO"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto Le3
                java.lang.String r3 = "msg"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto Le3
                java.lang.String r3 = r4.getStringExtra(r3)
                com.bxkj.student.run.app.lockscreen.LockScreenActivity r4 = r2.a
                android.widget.TextView r4 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.g0(r4)
                r4.setText(r3)
            Le3:
                return
        }
    }

    public LockScreenActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView g0(com.bxkj.student.run.app.lockscreen.LockScreenActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView h0(com.bxkj.student.run.app.lockscreen.LockScreenActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView i0(com.bxkj.student.run.app.lockscreen.LockScreenActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.student.run.app.lockscreen.LockScreenActivity r0) {
            android.widget.TextView r0 = r0.f1170k0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.run.app.lockscreen.LockScreenActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.run.app.lockscreen.LockScreenActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.run.app.lockscreen.LockScreenActivity r0) {
            android.widget.TextView r0 = r0.f1171p0
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected void M() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0.addFlags(r1)
            android.view.Window r0 = r2.getWindow()
            r1 = 524288(0x80000, float:7.34684E-40)
            r0.addFlags(r1)
            super.M()
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492968(0x7f0c0068, float:1.8609403E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "distance"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L15
            android.widget.TextView r2 = r4.b0
            java.lang.String r1 = r0.getStringExtra(r1)
            r2.setText(r1)
        L15:
            java.lang.String r1 = "speed"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L26
            android.widget.TextView r2 = r4.c0
            java.lang.String r1 = r0.getStringExtra(r1)
            r2.setText(r1)
        L26:
            java.lang.String r1 = "peisu"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L37
            android.widget.TextView r2 = r4.f1170k0
            java.lang.String r1 = r0.getStringExtra(r1)
            r2.setText(r1)
        L37:
            java.lang.String r1 = "time"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L48
            android.widget.TextView r2 = r4.f1171p0
            java.lang.String r1 = r0.getStringExtra(r1)
            r2.setText(r1)
        L48:
            java.lang.String r1 = "stepCount"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L5e
            android.widget.TextView r2 = r4.F0
            r3 = 0
            int r1 = r0.getIntExtra(r1, r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.setText(r1)
        L5e:
            java.lang.String r1 = "lastPauseMessage"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L6f
            android.widget.TextView r2 = r4.a0
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.setText(r0)
        L6f:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "NOTIFY_RUN_DATA"
            r0.addAction(r1)
            java.lang.String r1 = "UPDATE_STEP"
            r0.addAction(r1)
            java.lang.String r1 = "RUN_PAUSE_NOTIFICATION"
            r0.addAction(r1)
            java.lang.String r1 = "RUN_CONTINUE_NOTIFICATION"
            r0.addAction(r1)
            java.lang.String r1 = "RUN_DEBUG_INFO"
            r0.addAction(r1)
            com.bxkj.student.run.app.lockscreen.LockScreenActivity$a r1 = new com.bxkj.student.run.app.lockscreen.LockScreenActivity$a
            r1.<init>(r4)
            r4.G0 = r1
            java.lang.String r2 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r3 = 0
            r4.registerReceiver(r1, r0, r2, r3)
            return
    }

    public void S() {
            r1 = this;
            r0 = 0
            r1.c0(r0)
            return
    }

    public void T(android.os.Bundle r3) {
            r2 = this;
            r3 = 2131298601(0x7f090929, float:1.821518E38)
            android.view.View r0 = r2.findViewById(r3)     // Catch: java.lang.Exception -> L15
            android.view.View r0 = r0.getRootView()     // Catch: java.lang.Exception -> L15
            android.view.View r0 = r0.getRootView()     // Catch: java.lang.Exception -> L15
            r1 = 2131689902(0x7f0f01ae, float:1.9008832E38)
            r0.setBackgroundResource(r1)     // Catch: java.lang.Exception -> L15
        L15:
            com.bxkj.student.common.utils.l.d(r2)
            r0 = 2131298092(0x7f09072c, float:1.8214147E38)
            android.view.View r0 = r2.findViewById(r0)
            com.romainpiel.shimmer.ShimmerTextView r0 = (com.romainpiel.shimmer.ShimmerTextView) r0
            r2.H0 = r0
            com.romainpiel.shimmer.b r0 = new com.romainpiel.shimmer.b
            r0.<init>()
            r2.I0 = r0
            android.view.View r3 = r2.findViewById(r3)
            com.bxkj.student.run.app.lockscreen.SwipeBackLayout r3 = (com.bxkj.student.run.app.lockscreen.SwipeBackLayout) r3
            com.bxkj.student.run.app.lockscreen.SwipeBackLayout$b r0 = new com.bxkj.student.run.app.lockscreen.SwipeBackLayout$b
            r0.<init>(r2)
            r3.setSwipeBackListener(r0)
            r3 = 2131298876(0x7f090a3c, float:1.8215738E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Z = r3
            r3 = 2131298900(0x7f090a54, float:1.8215786E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.a0 = r3
            r3 = 2131298779(0x7f0909db, float:1.821554E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Y = r3
            r3 = 2131298881(0x7f090a41, float:1.8215748E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.b0 = r3
            r3 = 2131299109(0x7f090b25, float:1.821621E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.c0 = r3
            r3 = 2131299022(0x7f090ace, float:1.8216034E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f1170k0 = r3
            r3 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f1171p0 = r3
            r3 = 2131299117(0x7f090b2d, float:1.8216226E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.F0 = r3
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r1 = this;
            android.content.BroadcastReceiver r0 = r1.G0
            if (r0 == 0) goto La
            r1.unregisterReceiver(r0)
            r0 = 0
            r1.G0 = r0
        La:
            super.onDestroy()
            return
    }

    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            int r0 = r5.getKeyCode()
            r1 = 4
            r2 = 1
            if (r0 == r1) goto L11
            r1 = 82
            if (r0 == r1) goto L11
            boolean r4 = super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(r4, r5)
            return r4
        L11:
            return r2
    }

    protected void onResume() {
            r2 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.romainpiel.shimmer.b r0 = r2.I0
            com.romainpiel.shimmer.ShimmerTextView r1 = r2.H0
            r0.t(r1)
            return
    }

    protected void onStop() {
            r1 = this;
            com.romainpiel.shimmer.b r0 = r1.I0
            r0.h()
            super/*androidx.appcompat.app.AppCompatActivity*/.onStop()
            return
    }
}
