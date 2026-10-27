package com.kwad.components.offline.api.core.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TkViewRCHelper {
    private boolean mClipBackground;

    @androidx.annotation.NonNull
    private com.kwad.sdk.widget.j.a mCornerConf;
    private android.graphics.Paint mPaint;
    private android.graphics.Path mPath;
    private float mRadius;
    private android.graphics.RectF mRectF;
    public float[] radiusArray;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CornerConf {
        private boolean bottomLeft;
        private boolean leftTop;
        private boolean rightBottom;
        private boolean topRight;

        public CornerConf() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.leftTop = r0
                r1.topRight = r0
                r1.rightBottom = r0
                r1.bottomLeft = r0
                return
        }

        public boolean isBottomLeft() {
                r1 = this;
                boolean r0 = r1.bottomLeft
                return r0
        }

        public boolean isLeftTop() {
                r1 = this;
                boolean r0 = r1.leftTop
                return r0
        }

        public boolean isRightBottom() {
                r1 = this;
                boolean r0 = r1.rightBottom
                return r0
        }

        public boolean isTopRight() {
                r1 = this;
                boolean r0 = r1.topRight
                return r0
        }

        public void setAllCorner(boolean r1) {
                r0 = this;
                r0.leftTop = r1
                r0.topRight = r1
                r0.rightBottom = r1
                r0.bottomLeft = r1
                return
        }

        public com.kwad.components.offline.api.core.utils.TkViewRCHelper.CornerConf setBottomLeft(boolean r1) {
                r0 = this;
                r0.bottomLeft = r1
                return r0
        }

        public com.kwad.components.offline.api.core.utils.TkViewRCHelper.CornerConf setLeftTop(boolean r1) {
                r0 = this;
                r0.leftTop = r1
                return r0
        }

        public com.kwad.components.offline.api.core.utils.TkViewRCHelper.CornerConf setRightBottom(boolean r1) {
                r0 = this;
                r0.rightBottom = r1
                return r0
        }

        public com.kwad.components.offline.api.core.utils.TkViewRCHelper.CornerConf setTopRight(boolean r1) {
                r0 = this;
                r0.topRight = r1
                return r0
        }
    }

    public TkViewRCHelper() {
            r1 = this;
            r1.<init>()
            r0 = 8
            float[] r0 = new float[r0]
            r1.radiusArray = r0
            com.kwad.sdk.widget.j$a r0 = new com.kwad.sdk.widget.j$a
            r0.<init>()
            r1.mCornerConf = r0
            return
    }

    public TkViewRCHelper(com.kwad.sdk.widget.j.a r2) {
            r1 = this;
            r1.<init>()
            r0 = 8
            float[] r0 = new float[r0]
            r1.radiusArray = r0
            if (r2 != 0) goto L13
            com.kwad.sdk.widget.j$a r2 = new com.kwad.sdk.widget.j$a
            r2.<init>()
            r1.mCornerConf = r2
            return
        L13:
            r1.mCornerConf = r2
            return
    }

    private android.graphics.Path getPath() {
            r4 = this;
            android.graphics.Path r0 = r4.mPath     // Catch: java.lang.Exception -> L6
            r0.reset()     // Catch: java.lang.Exception -> L6
            goto L7
        L6:
        L7:
            float r0 = r4.mRadius
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            float[] r0 = r4.radiusArray
            goto L15
        L11:
            float[] r0 = r4.getRadius()
        L15:
            android.graphics.Path r1 = r4.mPath
            android.graphics.RectF r2 = r4.mRectF
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r2, r0, r3)
            android.graphics.Path r0 = r4.mPath
            return r0
    }

    private float[] getRadius() {
            r4 = this;
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isLeftTop()
            r2 = 0
            if (r1 == 0) goto Le
            float r1 = r4.mRadius
            goto Lf
        Le:
            r1 = 0
        Lf:
            r3 = 0
            r0[r3] = r1
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isLeftTop()
            if (r1 == 0) goto L1f
            float r1 = r4.mRadius
            goto L20
        L1f:
            r1 = 0
        L20:
            r3 = 1
            r0[r3] = r1
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isTopRight()
            if (r1 == 0) goto L30
            float r1 = r4.mRadius
            goto L31
        L30:
            r1 = 0
        L31:
            r3 = 2
            r0[r3] = r1
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isTopRight()
            if (r1 == 0) goto L41
            float r1 = r4.mRadius
            goto L42
        L41:
            r1 = 0
        L42:
            r3 = 3
            r0[r3] = r1
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isRightBottom()
            if (r1 == 0) goto L52
            float r1 = r4.mRadius
            goto L53
        L52:
            r1 = 0
        L53:
            r3 = 4
            r0[r3] = r1
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isRightBottom()
            if (r1 == 0) goto L63
            float r1 = r4.mRadius
            goto L64
        L63:
            r1 = 0
        L64:
            r3 = 5
            r0[r3] = r1
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isBottomLeft()
            if (r1 == 0) goto L74
            float r1 = r4.mRadius
            goto L75
        L74:
            r1 = 0
        L75:
            r3 = 6
            r0[r3] = r1
            float[] r0 = r4.radiusArray
            com.kwad.sdk.widget.j$a r1 = r4.mCornerConf
            boolean r1 = r1.isBottomLeft()
            if (r1 == 0) goto L84
            float r2 = r4.mRadius
        L84:
            r1 = 7
            r0[r1] = r2
            float[] r0 = r4.radiusArray
            return r0
    }

    public void afterDispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Lf
            android.graphics.Path r0 = r2.getPath()
            android.graphics.Paint r1 = r2.mPaint
            r3.drawPath(r0, r1)
        Lf:
            r3.restore()
            return
    }

    public void afterDraw(android.graphics.Canvas r3) {
            r2 = this;
            boolean r0 = r2.mClipBackground
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L14
            android.graphics.Path r0 = r2.getPath()
            android.graphics.Paint r1 = r2.mPaint
            r3.drawPath(r0, r1)
        L14:
            r3.restore()
            return
    }

    public void beforeDispatchDraw(android.graphics.Canvas r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r4.save()
            android.graphics.Path r0 = r3.getPath()
            r4.clipPath(r0)
            return
        L11:
            android.graphics.RectF r0 = r3.mRectF
            r1 = 0
            r2 = 31
            r4.saveLayer(r0, r1, r2)
            return
    }

    public void beforeDraw(android.graphics.Canvas r4) {
            r3 = this;
            boolean r0 = r3.mClipBackground
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L14
            android.graphics.RectF r0 = r3.mRectF
            r1 = 0
            r2 = 31
            r4.saveLayer(r0, r1, r2)
            return
        L14:
            r4.save()
            android.graphics.Path r0 = r3.getPath()
            r4.clipPath(r0)
            return
    }

    @androidx.annotation.NonNull
    public com.kwad.sdk.widget.j.a getCornerConf() {
            r1 = this;
            com.kwad.sdk.widget.j$a r0 = r1.mCornerConf
            return r0
    }

    public void initAttrs(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.mPath = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.mPaint = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.mRectF = r2
            android.graphics.Paint r2 = r1.mPaint
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_IN
            r3.<init>(r0)
            r2.setXfermode(r3)
            return
    }

    public void onSizeChanged(int r3, int r4) {
            r2 = this;
            android.graphics.RectF r0 = r2.mRectF
            float r3 = (float) r3
            float r4 = (float) r4
            r1 = 0
            r0.set(r1, r1, r3, r4)
            return
    }

    public void setRadius(float r1) {
            r0 = this;
            r0.mRadius = r1
            return
    }

    public void setRadius(float[] r1) {
            r0 = this;
            r0.radiusArray = r1
            return
    }
}
