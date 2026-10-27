package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LongPressToFinishButton extends android.widget.LinearLayout {
    private static final int TOUCH_SLOP = 20;
    private final int DURATION;
    private android.graphics.Paint backgroundCirclePaint;
    private android.widget.LinearLayout buttonLayout;
    private boolean isMoved;
    private boolean isPress;
    private int mLastMotionX;
    private int mLastMotionY;
    private com.bxkj.student.common.view.LongPressToFinishButton.OnFinishListener onFinishListener;
    private com.bxkj.student.common.view.LongPressToFinishButton.OnPressListener onPressListener;
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

    public LongPressToFinishButton(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.DURATION = r1
            r1 = 0
            r0.isMoved = r1
            r0.progress = r1
            r0.init()
            return
    }

    public LongPressToFinishButton(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.DURATION = r1
            r1 = 0
            r0.isMoved = r1
            r0.progress = r1
            r0.init()
            return
    }

    public LongPressToFinishButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.DURATION = r1
            r1 = 0
            r0.isMoved = r1
            r0.progress = r1
            r0.init()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.LongPressToFinishButton.OnFinishListener a(com.bxkj.student.common.view.LongPressToFinishButton r0) {
            com.bxkj.student.common.view.LongPressToFinishButton$OnFinishListener r0 = r0.onFinishListener
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.LongPressToFinishButton.OnPressListener b(com.bxkj.student.common.view.LongPressToFinishButton r0) {
            com.bxkj.student.common.view.LongPressToFinishButton$OnPressListener r0 = r0.onPressListener
            return r0
    }

    static /* bridge */ /* synthetic */ int c(com.bxkj.student.common.view.LongPressToFinishButton r0) {
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
            com.bxkj.student.common.view.LongPressToFinishButton$OnPressListener r0 = r2.onPressListener
            if (r0 == 0) goto L13
            r0.onCancel()
        L13:
            return
    }

    static /* bridge */ /* synthetic */ void d(com.bxkj.student.common.view.LongPressToFinishButton r0, boolean r1) {
            r0.isPress = r1
            return
    }

    static /* bridge */ /* synthetic */ void e(com.bxkj.student.common.view.LongPressToFinishButton r0, int r1) {
            r0.progress = r1
            return
    }

    private void init() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1 = 2131493112(0x7f0c00f8, float:1.8609695E38)
            r2 = 1
            android.view.View r0 = r0.inflate(r1, r4, r2)
            r1 = 2131296673(0x7f0901a1, float:1.821127E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.buttonLayout = r0
            android.content.Context r0 = r4.getContext()
            r1 = 1084227584(0x40a00000, float:5.0)
            int r0 = cn.bluemobi.dylan.base.utils.d.a(r0, r1)
            r4.roundWidth = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.backgroundCirclePaint = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r4.backgroundCirclePaint
            java.lang.String r3 = "#565351"
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setColor(r3)
            android.graphics.Paint r0 = r4.backgroundCirclePaint
            r0.setAntiAlias(r2)
            android.graphics.Paint r0 = r4.backgroundCirclePaint
            int r3 = r4.roundWidth
            float r3 = (float) r3
            r0.setStrokeWidth(r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.progressCirclePaint = r0
            r0.setStyle(r1)
            android.graphics.Paint r0 = r4.progressCirclePaint
            android.content.res.Resources r1 = r4.getResources()
            r3 = 2131100568(0x7f060398, float:1.7813521E38)
            int r1 = r1.getColor(r3)
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.progressCirclePaint
            r0.setAntiAlias(r2)
            android.graphics.Paint r0 = r4.progressCirclePaint
            int r1 = r4.roundWidth
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            r0 = 0
            r1 = 100
            int[] r0 = new int[]{r0, r1}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r4.valueAnimator = r0
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.valueAnimator
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r4.valueAnimator
            com.bxkj.student.common.view.LongPressToFinishButton$1 r1 = new com.bxkj.student.common.view.LongPressToFinishButton$1
            r1.<init>(r4)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r4.valueAnimator
            com.bxkj.student.common.view.LongPressToFinishButton$2 r1 = new com.bxkj.student.common.view.LongPressToFinishButton$2
            r1.<init>(r4)
            r0.addListener(r1)
            return
    }

    private void startAnim() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.valueAnimator
            if (r0 == 0) goto L7
            r0.start()
        L7:
            com.bxkj.student.common.view.LongPressToFinishButton$OnPressListener r0 = r1.onPressListener
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

    public void setOnFinishListener(com.bxkj.student.common.view.LongPressToFinishButton.OnFinishListener r1) {
            r0 = this;
            r0.onFinishListener = r1
            return
    }

    public void setOnPressListener(com.bxkj.student.common.view.LongPressToFinishButton.OnPressListener r1) {
            r0 = this;
            r0.onPressListener = r1
            return
    }
}
