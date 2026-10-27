package com.bxkj.student.home.teaching.learning.detail.type;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MusicPlayFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f924l;

    /* renamed from: m, reason: collision with root package name */
    private cn.bluemobi.dylan.smartwebview.SmartWebView f925m;

    /* renamed from: n, reason: collision with root package name */
    private com.devlin_n.videoplayer.player.IjkVideoView f926n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f927o;

    public MusicPlayFragment() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f927o = r0
            return
    }

    private void N(java.lang.String r5) {
            r4 = this;
            com.devlin_n.videoplayer.controller.StandardMusicController r0 = new com.devlin_n.videoplayer.controller.StandardMusicController
            android.content.Context r1 = r4.g
            r0.<init>(r1)
            r0.q()
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r4.f926n
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.R()
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.T()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "正在播放音频："
            r2.append(r3)
            java.lang.String r3 = r4.f927o
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.d0(r2)
            java.lang.String r5 = com.bxkj.base.util.c0.a(r5)
            com.devlin_n.videoplayer.player.IjkVideoView r5 = r1.e0(r5)
            com.devlin_n.videoplayer.player.IjkVideoView r5 = r5.f0(r0)
            r5.start()
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public void e() {
            r4 = this;
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "title"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L16
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r4.f927o = r0
        L16:
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "videoPath"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L2d
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r4.N(r0)
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "标题："
            r0.append(r1)
            java.lang.String r1 = r4.f927o
            r0.append(r1)
            android.widget.TextView r1 = r4.j
            java.lang.String r0 = r0.toString()
            r1.setText(r0)
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "synopsis"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L5e
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r4.f924l
            r1.setText(r0)
        L5e:
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "pv"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L88
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r4.k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "播放量："
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
        L88:
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131299185(0x7f090b71, float:1.8216364E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.j = r1
            r1 = 2131298538(0x7f0908ea, float:1.8215052E38)
            android.view.View r1 = r0.c(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r1
            r0.f925m = r1
            r1 = 2131298315(0x7f09080b, float:1.82146E38)
            android.view.View r1 = r0.c(r1)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = (com.devlin_n.videoplayer.player.IjkVideoView) r1
            r0.f926n = r1
            r1 = 2131299042(0x7f090ae2, float:1.8216074E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.k = r1
            r1 = 2131299184(0x7f090b70, float:1.8216362E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f924l = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493191(0x7f0c0147, float:1.8609855E38)
            return r0
    }

    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r2 = 1
            if (r1 != r2) goto L21
            com.devlin_n.floatWindowPermission.b r1 = com.devlin_n.floatWindowPermission.b.f()
            android.content.Context r2 = r0.g
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L15
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.f926n
            r1.c()
            return
        L15:
            android.content.Context r1 = r0.g
            java.lang.String r2 = "权限授予失败，无法开启悬浮窗"
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
        L21:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r1 = this;
            super/*androidx.fragment.app.Fragment*/.onDestroy()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f926n
            r0.Z()
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f926n
            r0.pause()
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.Fragment*/.onResume()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f926n
            r0.d()
            return
    }
}
