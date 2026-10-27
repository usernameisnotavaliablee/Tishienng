package com.bxkj.student.common.utils.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OnLinePlayVideoActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.devlin_n.videoplayer.player.IjkVideoView Y;

    public OnLinePlayVideoActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492994(0x7f0c0082, float:1.8609456E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "videoPath"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L32
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            com.devlin_n.videoplayer.controller.StandardVideoController r1 = new com.devlin_n.videoplayer.controller.StandardVideoController
            r1.<init>(r3)
            com.devlin_n.videoplayer.player.IjkVideoView r2 = r3.Y
            com.devlin_n.videoplayer.player.IjkVideoView r2 = r2.T()
            com.devlin_n.videoplayer.player.IjkVideoView r2 = r2.R()
            java.lang.String r0 = com.bxkj.base.util.c0.a(r0)
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r2.e0(r0)
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r0.f0(r1)
            r0.start()
        L32:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "播放视频"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298315(0x7f09080b, float:1.82146E38)
            android.view.View r1 = r0.findViewById(r1)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = (com.devlin_n.videoplayer.player.IjkVideoView) r1
            r0.Y = r1
            return
    }

    public void onBackPressed() {
            r1 = this;
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.Y
            boolean r0 = r0.X()
            if (r0 != 0) goto Lb
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
        Lb:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.Y
            r0.Z()
            return
    }

    protected void onPause() {
            r1 = this;
            super.onPause()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.Y
            r0.pause()
            return
    }

    protected void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.Y
            r0.d()
            return
    }
}
