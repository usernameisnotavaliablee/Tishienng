package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LoadingView extends android.widget.LinearLayout {
    android.os.Handler handler;
    private android.widget.RadioGroup rg;
    private java.util.Timer timer;
    private java.util.TimerTask timerTask;



    public LoadingView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            com.bxkj.student.common.view.LoadingView$2 r0 = new com.bxkj.student.common.view.LoadingView$2
            r0.<init>(r1)
            r1.handler = r0
            r1.init(r2)
            return
    }

    public LoadingView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.bxkj.student.common.view.LoadingView$2 r2 = new com.bxkj.student.common.view.LoadingView$2
            r2.<init>(r0)
            r0.handler = r2
            r0.init(r1)
            return
    }

    public LoadingView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.bxkj.student.common.view.LoadingView$2 r2 = new com.bxkj.student.common.view.LoadingView$2
            r2.<init>(r0)
            r0.handler = r2
            r0.init(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.RadioGroup a(com.bxkj.student.common.view.LoadingView r0) {
            android.widget.RadioGroup r0 = r0.rg
            return r0
    }

    private void init(android.content.Context r2) {
            r1 = this;
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r0 = 2131493152(0x7f0c0120, float:1.8609776E38)
            r2.inflate(r0, r1)
            r2 = 2131298361(0x7f090839, float:1.8214693E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
            r1.rg = r2
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            r1.timer = r2
            com.bxkj.student.common.view.LoadingView$1 r2 = new com.bxkj.student.common.view.LoadingView$1
            r2.<init>(r1)
            r1.timerTask = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            java.util.Timer r0 = r6.timer
            java.util.TimerTask r1 = r6.timerTask
            r2 = 0
            r4 = 300(0x12c, double:1.48E-321)
            r0.schedule(r1, r2, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            java.util.TimerTask r1 = r2.timerTask
            r0.removeCallbacks(r1)
            java.util.Timer r0 = r2.timer
            r0.cancel()
            super.onDetachedFromWindow()
            return
    }
}
