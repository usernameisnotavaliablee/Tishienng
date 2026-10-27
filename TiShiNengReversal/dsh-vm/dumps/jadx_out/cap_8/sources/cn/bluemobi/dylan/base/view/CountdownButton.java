package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CountdownButton extends androidx.appcompat.widget.AppCompatButton {
    private java.lang.String afterText;
    private java.lang.String beforeText;
    private android.os.Handler handler;
    private long length;
    private android.view.View.OnClickListener onClickListener;
    private java.util.Timer timer;
    private java.util.TimerTask timerTask;



    public CountdownButton(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.length = r0
            java.lang.String r3 = "获取验证码"
            r2.beforeText = r3
            java.lang.String r3 = "秒"
            r2.afterText = r3
            cn.bluemobi.dylan.base.view.CountdownButton$2 r3 = new cn.bluemobi.dylan.base.view.CountdownButton$2
            r3.<init>(r2)
            r2.handler = r3
            r2.initView()
            return
    }

    public CountdownButton(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 60000(0xea60, double:2.9644E-319)
            r0.length = r1
            java.lang.String r1 = "获取验证码"
            r0.beforeText = r1
            java.lang.String r1 = "秒"
            r0.afterText = r1
            cn.bluemobi.dylan.base.view.CountdownButton$2 r1 = new cn.bluemobi.dylan.base.view.CountdownButton$2
            r1.<init>(r0)
            r0.handler = r1
            r0.initView()
            return
    }

    public CountdownButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 60000(0xea60, double:2.9644E-319)
            r0.length = r1
            java.lang.String r1 = "获取验证码"
            r0.beforeText = r1
            java.lang.String r1 = "秒"
            r0.afterText = r1
            cn.bluemobi.dylan.base.view.CountdownButton$2 r1 = new cn.bluemobi.dylan.base.view.CountdownButton$2
            r1.<init>(r0)
            r0.handler = r1
            r0.initView()
            return
    }

    static /* synthetic */ android.os.Handler access$000(cn.bluemobi.dylan.base.view.CountdownButton r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    static /* synthetic */ long access$100(cn.bluemobi.dylan.base.view.CountdownButton r2) {
            long r0 = r2.length
            return r0
    }

    static /* synthetic */ long access$102(cn.bluemobi.dylan.base.view.CountdownButton r0, long r1) {
            r0.length = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$200(cn.bluemobi.dylan.base.view.CountdownButton r0) {
            java.lang.String r0 = r0.afterText
            return r0
    }

    static /* synthetic */ java.lang.String access$300(cn.bluemobi.dylan.base.view.CountdownButton r0) {
            java.lang.String r0 = r0.beforeText
            return r0
    }

    private void initTimer() {
            r1 = this;
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r1.timer = r0
            cn.bluemobi.dylan.base.view.CountdownButton$1 r0 = new cn.bluemobi.dylan.base.view.CountdownButton$1
            r0.<init>(r1)
            r1.timerTask = r0
            return
    }

    private void initView() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L18
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1.beforeText = r0
        L18:
            java.lang.String r0 = r1.beforeText
            r1.setText(r0)
            return
    }

    public void clearTimer() {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.length = r0
            android.os.Handler r0 = r2.handler
            if (r0 == 0) goto Le
            java.util.TimerTask r1 = r2.timerTask
            r0.removeCallbacks(r1)
        Le:
            java.util.TimerTask r0 = r2.timerTask
            r1 = 0
            if (r0 == 0) goto L18
            r0.cancel()
            r2.timerTask = r1
        L18:
            java.util.Timer r0 = r2.timer
            if (r0 == 0) goto L21
            r0.cancel()
            r2.timer = r1
        L21:
            return
    }

    protected void onDetachedFromWindow() {
            r0 = this;
            r0.clearTimer()
            super/*android.widget.Button*/.onDetachedFromWindow()
            return
    }

    public void setAfterText(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.afterText
            r0.afterText = r1
            return
    }

    public void setBeforeText(java.lang.String r1) {
            r0 = this;
            r0.beforeText = r1
            return
    }

    public void setLength(long r1) {
            r0 = this;
            r0.length = r1
            return
    }

    public void start() {
            r7 = this;
            r7.initTimer()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r7.length
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = r7.afterText
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            r0 = 0
            r7.setEnabled(r0)
            java.util.Timer r1 = r7.timer
            java.util.TimerTask r2 = r7.timerTask
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            r1.schedule(r2, r3, r5)
            return
    }
}
