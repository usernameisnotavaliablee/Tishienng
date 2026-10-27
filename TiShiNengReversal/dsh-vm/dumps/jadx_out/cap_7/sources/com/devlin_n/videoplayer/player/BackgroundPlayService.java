package com.devlin_n.videoplayer.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BackgroundPlayService extends android.app.Service {
    private android.view.WindowManager a;
    private android.view.WindowManager.LayoutParams b;
    private com.devlin_n.videoplayer.player.IjkVideoView c;
    private java.lang.String d;
    private com.devlin_n.videoplayer.widget.FloatView e;
    private int f;
    private boolean g;

    public BackgroundPlayService() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a() {
            r4 = this;
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.view.WindowManager r0 = g1.f.g(r0)
            r4.a = r0
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r4.b = r0
            r1 = 2003(0x7d3, float:2.807E-42)
            r0.type = r1
            r1 = 1
            r0.format = r1
            r1 = 8
            r0.flags = r1
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r0.gravity = r1
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r1 = 1132068864(0x437a0000, float:250.0)
            int r0 = g1.f.a(r0, r1)
            android.view.WindowManager$LayoutParams r1 = r4.b
            r1.width = r0
            int r2 = r0 * 9
            int r2 = r2 / 16
            r1.height = r2
            android.content.Context r2 = r4.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            int r2 = g1.f.e(r2)
            int r2 = r2 - r0
            r1.x = r2
            android.view.WindowManager$LayoutParams r0 = r4.b
            android.content.Context r1 = r4.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r2 = 0
            int r1 = g1.f.d(r1, r2)
            int r1 = r1 / 2
            r0.y = r1
            com.devlin_n.videoplayer.widget.FloatView r0 = new com.devlin_n.videoplayer.widget.FloatView
            android.content.Context r1 = r4.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            android.view.WindowManager r2 = r4.a
            android.view.WindowManager$LayoutParams r3 = r4.b
            r0.<init>(r1, r2, r3)
            r4.e = r0
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r0.c
            r4.c = r0
            return
    }

    private void b() {
            r3 = this;
            boolean r0 = r3.g
            if (r0 == 0) goto L9
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r3.c
            r0.T()
        L9:
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r3.c
            java.lang.String r1 = r3.d
            int r2 = r3.f
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r0.h0(r1, r2)
            com.devlin_n.videoplayer.controller.FloatController r1 = new com.devlin_n.videoplayer.controller.FloatController
            android.content.Context r2 = r3.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.<init>(r2)
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r0.f0(r1)
            r0.start()
            android.view.WindowManager r0 = r3.a
            com.devlin_n.videoplayer.widget.FloatView r1 = r3.e
            android.view.WindowManager$LayoutParams r2 = r3.b
            r0.addView(r1, r2)
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            r0.a()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            r0 = 0
            g1.a.c = r0
            com.devlin_n.videoplayer.widget.FloatView r0 = r2.e
            if (r0 == 0) goto Lf
            android.view.WindowManager r1 = r2.a
            r1.removeView(r0)
        Lf:
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r2.c
            r0.Z()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "url"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.d = r2
            java.lang.String r2 = "position"
            r3 = 0
            int r2 = r1.getIntExtra(r2, r3)
            r0.f = r2
            java.lang.String r2 = "enable_cache"
            boolean r1 = r1.getBooleanExtra(r2, r3)
            r0.g = r1
            r1 = 1
            g1.a.c = r1
            r0.b()
            r1 = 2
            return r1
    }
}
