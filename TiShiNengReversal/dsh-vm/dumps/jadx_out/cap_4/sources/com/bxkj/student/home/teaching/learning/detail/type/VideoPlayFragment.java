package com.bxkj.student.home.teaching.learning.detail.type;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class VideoPlayFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f938l;

    /* renamed from: m, reason: collision with root package name */
    private cn.bluemobi.dylan.smartwebview.SmartWebView f939m;

    /* renamed from: n, reason: collision with root package name */
    private com.devlin_n.videoplayer.player.IjkVideoView f940n;

    /* renamed from: o, reason: collision with root package name */
    private com.devlin_n.videoplayer.controller.StandardVideoController f941o;

    public VideoPlayFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private void O(java.lang.String r3) {
            r2 = this;
            com.devlin_n.videoplayer.controller.StandardVideoController r0 = new com.devlin_n.videoplayer.controller.StandardVideoController
            android.content.Context r1 = r2.g
            r0.<init>(r1)
            r2.f941o = r0
            r1 = 0
            r0.setCanFast(r1)
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r2.f940n
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r0.R()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r0.T()
            java.lang.String r3 = com.bxkj.base.util.c0.a(r3)
            com.devlin_n.videoplayer.player.IjkVideoView r3 = r0.e0(r3)
            com.devlin_n.videoplayer.controller.StandardVideoController r0 = r2.f941o
            com.devlin_n.videoplayer.player.IjkVideoView r3 = r3.f0(r0)
            r3.start()
            return
    }

    public void N() {
            r1 = this;
            com.devlin_n.videoplayer.controller.StandardVideoController r0 = r1.f941o
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public void e() {
            r4 = this;
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "videoPath"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L17
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r4.O(r0)
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "标题："
            r0.append(r1)
            android.os.Bundle r1 = r4.getArguments()
            java.lang.String r2 = "title"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L38
            android.os.Bundle r1 = r4.getArguments()
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
        L38:
            android.widget.TextView r1 = r4.j
            java.lang.String r0 = r0.toString()
            r1.setText(r0)
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "synopsis"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L5a
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r4.f938l
            r1.setText(r0)
        L5a:
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "pv"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L84
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
        L84:
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
            r0.f939m = r1
            r1 = 2131298315(0x7f09080b, float:1.82146E38)
            android.view.View r1 = r0.c(r1)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = (com.devlin_n.videoplayer.player.IjkVideoView) r1
            r0.f940n = r1
            r1 = 2131299042(0x7f090ae2, float:1.8216074E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.k = r1
            r1 = 2131299184(0x7f090b70, float:1.8216362E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f938l = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131492965(0x7f0c0065, float:1.8609397E38)
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
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.f940n
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
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f940n
            r0.Z()
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f940n
            r0.pause()
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.Fragment*/.onResume()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f940n
            r0.d()
            return
    }
}
