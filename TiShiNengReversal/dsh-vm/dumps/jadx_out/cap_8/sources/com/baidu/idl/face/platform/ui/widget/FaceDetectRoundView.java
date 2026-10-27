package com.baidu.idl.face.platform.ui.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceDetectRoundView extends android.view.View {
    public static final int CIRCLE_LINE_WIDTH = 3;
    public static final int COLOR_BG = 0;
    public static final int COLOR_CIRCLE_LINE = 0;
    public static final int COLOR_CIRCLE_SELECT_LINE = 0;
    public static final int COLOR_ROUND = 0;
    public static final float HEIGHT_EXT_RATIO = 0.2f;
    public static final float HEIGHT_RATIO = 0.1f;
    public static final int PATH_SMALL_SPACE = 12;
    public static final int PATH_SPACE = 16;
    public static final float RECT_RATIO = 0.9f;
    public static final float SURFACE_HEIGHT = 1000.0f;
    public static final float SURFACE_RATIO = 0.75f;
    private static final java.lang.String TAG = "FaceDetectRoundView";
    public static final float WIDTH_SPACE_RATIO = 0.33f;
    private static float mRatioX;
    private static float mRatioY;
    private android.graphics.Paint mBGPaint;
    private android.graphics.Paint mCircleLinePaint;
    private android.graphics.Paint mCircleLineSelectPaint;
    private android.graphics.Rect mFaceDetectRect;
    private com.baidu.idl.face.platform.model.FaceExtInfo mFaceExtInfo;
    private android.graphics.Rect mFaceRect;
    private android.graphics.Paint mFaceRoundPaint;
    private boolean mIsActiveLive;
    private float mR;
    private int mSuccessActiveCount;
    private android.graphics.Paint mTextSecondPaint;
    private android.graphics.Paint mTextTopPaint;
    private java.lang.String mTipSecondText;
    private java.lang.String mTipTopText;
    private int mTotalActiveCount;
    private float mX;
    private float mY;

    static {
            java.lang.String r0 = "#FFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_BG = r0
            java.lang.String r0 = "#FFA800"
            int r0 = android.graphics.Color.parseColor(r0)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_ROUND = r0
            java.lang.String r0 = "#CCCCCC"
            int r0 = android.graphics.Color.parseColor(r0)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_CIRCLE_LINE = r0
            java.lang.String r0 = "#00BAF2"
            int r0 = android.graphics.Color.parseColor(r0)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_CIRCLE_SELECT_LINE = r0
            return
    }

    public FaceDetectRoundView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r5 = 0
            r0 = 1
            r3.setLayerType(r0, r5)
            r5 = 1077936128(0x40400000, float:3.0)
            int r4 = com.baidu.idl.face.platform.utils.DensityUtils.dip2px(r4, r5)
            float r4 = (float) r4
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r3.mBGPaint = r5
            int r1 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_BG
            r5.setColor(r1)
            android.graphics.Paint r5 = r3.mBGPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r5.setStyle(r1)
            android.graphics.Paint r5 = r3.mBGPaint
            r5.setAntiAlias(r0)
            android.graphics.Paint r5 = r3.mBGPaint
            r5.setDither(r0)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r3.mFaceRoundPaint = r5
            int r2 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_ROUND
            r5.setColor(r2)
            android.graphics.Paint r5 = r3.mFaceRoundPaint
            r5.setStyle(r1)
            android.graphics.Paint r5 = r3.mFaceRoundPaint
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r5.setXfermode(r1)
            android.graphics.Paint r5 = r3.mFaceRoundPaint
            r5.setAntiAlias(r0)
            android.graphics.Paint r5 = r3.mFaceRoundPaint
            r5.setDither(r0)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r3.mCircleLinePaint = r5
            int r1 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_CIRCLE_LINE
            r5.setColor(r1)
            android.graphics.Paint r5 = r3.mCircleLinePaint
            r5.setStrokeWidth(r4)
            android.graphics.Paint r5 = r3.mCircleLinePaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r1)
            android.graphics.Paint r5 = r3.mCircleLinePaint
            r5.setAntiAlias(r0)
            android.graphics.Paint r5 = r3.mCircleLinePaint
            r5.setDither(r0)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r3.mCircleLineSelectPaint = r5
            int r2 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.COLOR_CIRCLE_SELECT_LINE
            r5.setColor(r2)
            android.graphics.Paint r5 = r3.mCircleLineSelectPaint
            r5.setStrokeWidth(r4)
            android.graphics.Paint r4 = r3.mCircleLineSelectPaint
            r4.setStyle(r1)
            android.graphics.Paint r4 = r3.mCircleLineSelectPaint
            r4.setAntiAlias(r0)
            android.graphics.Paint r4 = r3.mCircleLineSelectPaint
            r4.setDither(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r0)
            r3.mTextSecondPaint = r4
            java.lang.String r5 = "#666666"
            int r5 = android.graphics.Color.parseColor(r5)
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.mTextSecondPaint
            android.content.Context r5 = r3.getContext()
            r1 = 1098907648(0x41800000, float:16.0)
            int r5 = com.baidu.idl.face.platform.utils.DensityUtils.dip2px(r5, r1)
            float r5 = (float) r5
            r4.setTextSize(r5)
            android.graphics.Paint r4 = r3.mTextSecondPaint
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r5)
            android.graphics.Paint r4 = r3.mTextSecondPaint
            r4.setAntiAlias(r0)
            android.graphics.Paint r4 = r3.mTextSecondPaint
            r4.setDither(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r0)
            r3.mTextTopPaint = r4
            java.lang.String r1 = "#000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r4.setColor(r1)
            android.graphics.Paint r4 = r3.mTextTopPaint
            android.content.Context r1 = r3.getContext()
            r2 = 1102053376(0x41b00000, float:22.0)
            int r1 = com.baidu.idl.face.platform.utils.DensityUtils.dip2px(r1, r2)
            float r1 = (float) r1
            r4.setTextSize(r1)
            android.graphics.Paint r4 = r3.mTextTopPaint
            r4.setTextAlign(r5)
            android.graphics.Paint r4 = r3.mTextTopPaint
            r4.setAntiAlias(r0)
            android.graphics.Paint r4 = r3.mTextTopPaint
            r4.setDither(r0)
            return
    }

    private void drawCircleLine(android.graphics.Canvas r10) {
            r9 = this;
            r10.save()
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10.rotate(r0)
            r0 = 0
        L9:
            r1 = 360(0x168, float:5.04E-43)
            if (r0 >= r1) goto L29
            float r1 = r9.mR
            r2 = 1109393408(0x42200000, float:40.0)
            float r4 = r1 + r2
            float r1 = r1 + r2
            r2 = 1103626240(0x41c80000, float:25.0)
            float r6 = r1 + r2
            r7 = 0
            android.graphics.Paint r8 = r9.mCircleLinePaint
            r5 = 0
            r3 = r10
            r3.drawLine(r4, r5, r6, r7, r8)
            r10 = 1086324736(0x40c00000, float:6.0)
            r3.rotate(r10)
            int r0 = r0 + 6
            r10 = r3
            goto L9
        L29:
            r3 = r10
            r3.restore()
            return
    }

    private void drawSuccessCircleLine(android.graphics.Canvas r11) {
            r10 = this;
            int r0 = r10.mSuccessActiveCount
            float r0 = (float) r0
            int r1 = r10.mTotalActiveCount
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r11.save()
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r11.rotate(r1)
            r1 = 0
        L15:
            if (r1 >= r0) goto L33
            float r2 = r10.mR
            r3 = 1109393408(0x42200000, float:40.0)
            float r5 = r2 + r3
            float r2 = r2 + r3
            r3 = 1103626240(0x41c80000, float:25.0)
            float r7 = r2 + r3
            r8 = 0
            android.graphics.Paint r9 = r10.mCircleLineSelectPaint
            r6 = 0
            r4 = r11
            r4.drawLine(r5, r6, r7, r8, r9)
            r11 = 1086324736(0x40c00000, float:6.0)
            r4.rotate(r11)
            int r1 = r1 + 6
            r11 = r4
            goto L15
        L33:
            r4 = r11
            r4.restore()
            return
    }

    public static android.graphics.Rect getFaceInfoRect(com.baidu.idl.face.platform.model.FaceExtInfo r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            float r0 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.mRatioX
            float r1 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.mRatioY
            r2 = 1061158912(0x3f400000, float:0.75)
            android.graphics.Rect r3 = r3.getFaceRect(r0, r1, r2)
            return r3
    }

    public static android.graphics.Rect getPreviewDetectRect(int r4, int r5, int r6) {
            int r4 = r4 / 2
            float r4 = (float) r4
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            float r0 = r0 * r4
            float r4 = r4 - r0
            int r5 = r5 / 2
            float r5 = (float) r5
            int r6 = r6 / 2
            float r6 = (float) r6
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 * r6
            float r6 = r6 - r0
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1a
            goto L1b
        L1a:
            r4 = r5
        L1b:
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r4
            float r0 = r0 + r4
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r5 - r4
            int r2 = (int) r2
            float r3 = r6 - r0
            int r3 = (int) r3
            float r5 = r5 + r4
            int r4 = (int) r5
            float r6 = r6 + r0
            int r5 = (int) r6
            r1.<init>(r2, r3, r4, r5)
            return r1
    }

    public static android.graphics.Rect getPreviewDetectRect(int r3, int r4, int r5, int r6) {
            int r0 = r3 / 2
            float r0 = (float) r0
            r1 = 1051260355(0x3ea8f5c3, float:0.33)
            float r1 = r1 * r0
            float r0 = r0 - r1
            float r3 = (float) r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r1
            float r5 = (float) r5
            float r2 = r5 * r1
            float r3 = r3 / r2
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.mRatioX = r3
            float r4 = (float) r4
            float r4 = r4 * r1
            float r6 = (float) r6
            float r1 = r1 * r6
            float r4 = r4 / r1
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.mRatioY = r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            float r2 = r5 * r3
            float r6 = r6 / r1
            float r1 = r6 * r4
            float r6 = r6 * r4
            r4 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r4
            float r1 = r1 - r6
            float r4 = r5 * r3
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L34
            goto L36
        L34:
            float r0 = r5 * r3
        L36:
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            float r3 = r3 * r0
            float r3 = r3 + r0
            android.graphics.Rect r4 = new android.graphics.Rect
            float r5 = r2 - r0
            int r5 = (int) r5
            float r6 = r1 - r3
            int r6 = (int) r6
            float r2 = r2 + r0
            int r0 = (int) r2
            float r1 = r1 + r3
            int r3 = (int) r1
            r4.<init>(r5, r6, r0, r3)
            return r4
    }

    public android.graphics.Rect getFaceRoundRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.mFaceRect
            if (r0 == 0) goto L7
            r0.toString()
        L7:
            android.graphics.Rect r0 = r1.mFaceRect
            return r0
    }

    public float getRound() {
            r1 = this;
            float r0 = r1.mR
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            super.onDraw(r8)
            r0 = 0
            r8.drawColor(r0)
            android.graphics.Paint r0 = r7.mBGPaint
            r8.drawPaint(r0)
            float r0 = r7.mX
            float r1 = r7.mY
            float r2 = r7.mR
            android.graphics.Paint r3 = r7.mFaceRoundPaint
            r8.drawCircle(r0, r1, r2, r3)
            java.lang.String r0 = r7.mTipSecondText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1114374144(0x426c0000, float:59.0)
            r2 = 1103626240(0x41c80000, float:25.0)
            r3 = 1109393408(0x42200000, float:40.0)
            if (r0 != 0) goto L36
            java.lang.String r0 = r7.mTipSecondText
            float r4 = r7.mX
            float r5 = r7.mY
            float r6 = r7.mR
            float r5 = r5 - r6
            float r5 = r5 - r3
            float r5 = r5 - r2
            float r5 = r5 - r1
            android.graphics.Paint r6 = r7.mTextSecondPaint
            r8.drawText(r0, r4, r5, r6)
        L36:
            java.lang.String r0 = r7.mTipTopText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L52
            java.lang.String r0 = r7.mTipTopText
            float r4 = r7.mX
            float r5 = r7.mY
            float r6 = r7.mR
            float r5 = r5 - r6
            float r5 = r5 - r3
            float r5 = r5 - r2
            float r5 = r5 - r1
            r1 = 1119092736(0x42b40000, float:90.0)
            float r5 = r5 - r1
            android.graphics.Paint r1 = r7.mTextTopPaint
            r8.drawText(r0, r4, r5, r1)
        L52:
            boolean r0 = r7.mIsActiveLive
            if (r0 == 0) goto L63
            float r0 = r7.mX
            float r1 = r7.mY
            r8.translate(r0, r1)
            r7.drawCircleLine(r8)
            r7.drawSuccessCircleLine(r8)
        L63:
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            int r7 = r7 - r5
            float r4 = (float) r7
            int r8 = r8 - r6
            float r5 = (float) r8
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
            float r5 = r5 / r6
            r6 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r5
            float r5 = r5 - r6
            r6 = 1051260355(0x3ea8f5c3, float:0.33)
            float r6 = r6 * r4
            float r6 = r4 - r6
            android.graphics.Rect r7 = r3.mFaceRect
            if (r7 != 0) goto L2c
            android.graphics.Rect r7 = new android.graphics.Rect
            float r8 = r4 - r6
            int r8 = (int) r8
            float r0 = r5 - r6
            int r0 = (int) r0
            float r1 = r4 + r6
            int r1 = (int) r1
            float r2 = r5 + r6
            int r2 = (int) r2
            r7.<init>(r8, r0, r1, r2)
            r3.mFaceRect = r7
        L2c:
            android.graphics.Rect r7 = r3.mFaceDetectRect
            if (r7 != 0) goto L48
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            float r7 = r7 * r6
            float r7 = r7 + r6
            android.graphics.Rect r8 = new android.graphics.Rect
            float r0 = r4 - r6
            int r0 = (int) r0
            float r1 = r5 - r7
            int r1 = (int) r1
            float r2 = r4 + r6
            int r2 = (int) r2
            float r7 = r7 + r5
            int r7 = (int) r7
            r8.<init>(r0, r1, r2, r7)
            r3.mFaceDetectRect = r8
        L48:
            r3.mX = r4
            r3.mY = r5
            r3.mR = r6
            return
    }

    public void setFaceInfo(com.baidu.idl.face.platform.model.FaceExtInfo r1) {
            r0 = this;
            r0.mFaceExtInfo = r1
            r0.postInvalidate()
            return
    }

    public void setIsActiveLive(boolean r1) {
            r0 = this;
            r0.mIsActiveLive = r1
            return
    }

    public void setProcessCount(int r1, int r2) {
            r0 = this;
            r0.mSuccessActiveCount = r1
            r0.mTotalActiveCount = r2
            r0.postInvalidate()
            return
    }

    public void setTipSecondText(java.lang.String r1) {
            r0 = this;
            r0.mTipSecondText = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lb
            r0.invalidate()
        Lb:
            return
    }

    public void setTipTopText(java.lang.String r1) {
            r0 = this;
            r0.mTipTopText = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lb
            r0.invalidate()
        Lb:
            return
    }
}
