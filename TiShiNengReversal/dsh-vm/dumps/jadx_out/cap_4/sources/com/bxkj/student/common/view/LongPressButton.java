package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LongPressButton extends android.widget.LinearLayout {
    private static final int TOUCH_SLOP = 20;
    private final int DURATION;
    private android.graphics.Paint backgroundCirclePaint;
    private android.widget.Button bt_img;
    private android.widget.LinearLayout buttonLayout;
    private boolean isMoved;
    private boolean isPress;
    private int mLastMotionX;
    private int mLastMotionY;
    private com.bxkj.student.common.view.LongPressButton.OnFinishListener onFinishListener;
    private com.bxkj.student.common.view.LongPressButton.OnPressListener onPressListener;
    private int progress;
    private android.graphics.Paint progressCirclePaint;
    int roundWidth;
    private android.animation.ValueAnimator valueAnimator;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnFinishListener {
        void onFinish();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPressListener {
        void onCancel();

        void onFinish();

        void onStart();
    }

    public LongPressButton(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.DURATION = r1
            r1 = 0
            r0.isMoved = r1
            r0.progress = r1
            r1 = 0
            r0.init(r1)
            return
    }

    public LongPressButton(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.DURATION = r1
            r1 = 0
            r0.isMoved = r1
            r0.progress = r1
            r0.init(r2)
            return
    }

    public LongPressButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.DURATION = r1
            r1 = 0
            r0.isMoved = r1
            r0.progress = r1
            r0.init(r2)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.LongPressButton.OnFinishListener a(com.bxkj.student.common.view.LongPressButton r0) {
            com.bxkj.student.common.view.LongPressButton$OnFinishListener r0 = r0.onFinishListener
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.LongPressButton.OnPressListener b(com.bxkj.student.common.view.LongPressButton r0) {
            com.bxkj.student.common.view.LongPressButton$OnPressListener r0 = r0.onPressListener
            return r0
    }

    static /* bridge */ /* synthetic */ int c(com.bxkj.student.common.view.LongPressButton r0) {
            int r0 = r0.progress
            return r0
    }

    private void cancelAnimation() {
            r2 = this;
            r0 = 0
            r2.isPress = r0
            android.animation.ValueAnimator r1 = r2.valueAnimator
            if (r1 == 0) goto La
            r1.cancel()
        La:
            r2.progress = r0
            com.bxkj.student.common.view.LongPressButton$OnPressListener r0 = r2.onPressListener
            if (r0 == 0) goto L13
            r0.onCancel()
        L13:
            return
    }

    static /* bridge */ /* synthetic */ void d(com.bxkj.student.common.view.LongPressButton r0, boolean r1) {
            r0.isPress = r1
            return
    }

    static /* bridge */ /* synthetic */ void e(com.bxkj.student.common.view.LongPressButton r0, int r1) {
            r0.progress = r1
            return
    }

    private void init(android.util.AttributeSet r6) {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            int[] r1 = com.bxkj.student.R.styleable.LongPressButton
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            r0 = 2131690242(0x7f0f0302, float:1.9009522E38)
            r1 = 0
            int r0 = r6.getResourceId(r1, r0)
            r2 = 2131100710(0x7f060426, float:1.781381E38)
            r3 = 1
            int r6 = r6.getResourceId(r3, r2)
            android.content.Context r2 = r5.getContext()
            java.lang.String r4 = "layout_inflater"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            r4 = 2131493725(0x7f0c035d, float:1.8610938E38)
            android.view.View r2 = r2.inflate(r4, r5, r3)
            r4 = 2131296673(0x7f0901a1, float:1.821127E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r5.buttonLayout = r4
            r4 = 2131296613(0x7f090165, float:1.8211148E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.Button r2 = (android.widget.Button) r2
            r5.bt_img = r2
            r2.setBackgroundResource(r0)
            android.content.Context r0 = r5.getContext()
            r2 = 1084227584(0x40a00000, float:5.0)
            int r0 = cn.bluemobi.dylan.base.utils.d.a(r0, r2)
            r5.roundWidth = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.backgroundCirclePaint = r0
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            android.graphics.Paint r0 = r5.backgroundCirclePaint
            java.lang.String r4 = "#565351"
            int r4 = android.graphics.Color.parseColor(r4)
            r0.setColor(r4)
            android.graphics.Paint r0 = r5.backgroundCirclePaint
            r0.setAntiAlias(r3)
            android.graphics.Paint r0 = r5.backgroundCirclePaint
            int r4 = r5.roundWidth
            float r4 = (float) r4
            r0.setStrokeWidth(r4)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.progressCirclePaint = r0
            r0.setStyle(r2)
            android.graphics.Paint r0 = r5.progressCirclePaint
            android.content.res.Resources r2 = r5.getResources()
            int r6 = r2.getColor(r6)
            r0.setColor(r6)
            android.graphics.Paint r6 = r5.progressCirclePaint
            r6.setAntiAlias(r3)
            android.graphics.Paint r6 = r5.progressCirclePaint
            int r0 = r5.roundWidth
            float r0 = (float) r0
            r6.setStrokeWidth(r0)
            r6 = 100
            int[] r6 = new int[]{r1, r6}
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofInt(r6)
            r5.valueAnimator = r6
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.setDuration(r0)
            android.animation.ValueAnimator r6 = r5.valueAnimator
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r6.setInterpolator(r0)
            android.animation.ValueAnimator r6 = r5.valueAnimator
            com.bxkj.student.common.view.LongPressButton$1 r0 = new com.bxkj.student.common.view.LongPressButton$1
            r0.<init>(r5)
            r6.addUpdateListener(r0)
            android.animation.ValueAnimator r6 = r5.valueAnimator
            com.bxkj.student.common.view.LongPressButton$2 r0 = new com.bxkj.student.common.view.LongPressButton$2
            r0.<init>(r5)
            r6.addListener(r0)
            return
    }

    private void startAnim() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.valueAnimator
            if (r0 == 0) goto L7
            r0.start()
        L7:
            com.bxkj.student.common.view.LongPressButton$OnPressListener r0 = r1.onPressListener
            if (r0 == 0) goto Le
            r0.onStart()
        Le:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r9) {
            r8 = this;
            super.dispatchDraw(r9)
            int r0 = r8.getWidth()
            int r0 = r0 / 2
            int r1 = r8.roundWidth
            int r1 = r1 / 2
            int r1 = r0 - r1
            r9.save()
            android.graphics.RectF r3 = new android.graphics.RectF
            int r2 = r0 - r1
            float r2 = (float) r2
            int r0 = r0 + r1
            float r0 = (float) r0
            r3.<init>(r2, r2, r0, r0)
            boolean r0 = r8.isPress
            if (r0 == 0) goto L39
            r6 = 0
            android.graphics.Paint r7 = r8.backgroundCirclePaint
            r4 = 0
            r5 = 1135869952(0x43b40000, float:360.0)
            r2 = r9
            r2.drawArc(r3, r4, r5, r6, r7)
            int r9 = r8.progress
            int r9 = r9 * 360
            int r9 = r9 / 100
            float r5 = (float) r9
            android.graphics.Paint r7 = r8.progressCirclePaint
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2.drawArc(r3, r4, r5, r6, r7)
            goto L3a
        L39:
            r2 = r9
        L3a:
            r2.restore()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            float r0 = r5.getX()
            int r0 = (int) r0
            float r1 = r5.getY()
            int r1 = (int) r1
            int r5 = r5.getAction()
            r2 = 1
            if (r5 == 0) goto L3a
            if (r5 == r2) goto L36
            r3 = 2
            if (r5 == r3) goto L17
            goto L66
        L17:
            boolean r5 = r4.isMoved
            if (r5 == 0) goto L1c
            goto L66
        L1c:
            int r5 = r4.mLastMotionX
            int r5 = r5 - r0
            int r5 = java.lang.Math.abs(r5)
            r0 = 20
            if (r5 > r0) goto L30
            int r5 = r4.mLastMotionY
            int r5 = r5 - r1
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= r0) goto L66
        L30:
            r4.isMoved = r2
            r4.cancelAnimation()
            goto L66
        L36:
            r4.cancelAnimation()
            goto L66
        L3a:
            android.widget.LinearLayout r5 = r4.buttonLayout
            int r5 = r5.getLeft()
            if (r0 < r5) goto L66
            android.widget.LinearLayout r5 = r4.buttonLayout
            int r5 = r5.getRight()
            if (r0 > r5) goto L66
            android.widget.LinearLayout r5 = r4.buttonLayout
            int r5 = r5.getTop()
            if (r1 < r5) goto L66
            android.widget.LinearLayout r5 = r4.buttonLayout
            int r5 = r5.getBottom()
            if (r1 > r5) goto L66
            r4.mLastMotionX = r0
            r4.mLastMotionY = r1
            r5 = 0
            r4.isMoved = r5
            r4.isPress = r2
            r4.startAnim()
        L66:
            return r2
    }

    public com.bxkj.student.common.view.LongPressButton setBt_img(@androidx.annotation.IdRes int r2) {
            r1 = this;
            android.widget.Button r0 = r1.bt_img
            r0.setBackgroundResource(r2)
            return r1
    }

    public com.bxkj.student.common.view.LongPressButton setColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.progressCirclePaint
            r0.setColor(r2)
            return r1
    }

    public void setOnFinishListener(com.bxkj.student.common.view.LongPressButton.OnFinishListener r1) {
            r0 = this;
            r0.onFinishListener = r1
            return
    }

    public void setOnPressListener(com.bxkj.student.common.view.LongPressButton.OnPressListener r1) {
            r0 = this;
            r0.onPressListener = r1
            return
    }
}
