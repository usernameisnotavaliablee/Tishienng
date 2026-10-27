package cn.jpush.android.ui;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RoundedImageView extends android.widget.ImageView {
    private int defaultRadius;
    private float height;
    private int leftBottomRadius;
    private int leftTopRadius;
    private int radius;
    private int rightBottomRadius;
    private int rightTopRadius;
    private float width;

    public RoundedImageView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.init(r2, r0)
            return
    }

    public RoundedImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r1.init(r2, r3)
            return
    }

    public RoundedImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 45
            r0.defaultRadius = r3
            r0.init(r1, r2)
            return
    }

    private void init(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            int r1 = r0.defaultRadius
            r0.leftTopRadius = r1
            r0.rightTopRadius = r1
            r0.rightBottomRadius = r1
            r0.leftBottomRadius = r1
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            int r0 = r5.leftTopRadius
            int r1 = r5.leftBottomRadius
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.rightTopRadius
            int r2 = r5.rightBottomRadius
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = r0 + r1
            int r1 = r5.leftTopRadius
            int r2 = r5.rightTopRadius
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r5.leftBottomRadius
            int r3 = r5.rightBottomRadius
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1 + r2
            float r2 = r5.width
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L85
            float r0 = r5.height
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L85
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            int r1 = r5.leftTopRadius
            float r1 = (float) r1
            r2 = 0
            r0.moveTo(r1, r2)
            float r1 = r5.width
            int r3 = r5.rightTopRadius
            float r3 = (float) r3
            float r1 = r1 - r3
            r0.lineTo(r1, r2)
            float r1 = r5.width
            int r3 = r5.rightTopRadius
            float r3 = (float) r3
            r0.quadTo(r1, r2, r1, r3)
            float r1 = r5.width
            float r3 = r5.height
            int r4 = r5.rightBottomRadius
            float r4 = (float) r4
            float r3 = r3 - r4
            r0.lineTo(r1, r3)
            float r1 = r5.width
            float r3 = r5.height
            int r4 = r5.rightBottomRadius
            float r4 = (float) r4
            float r4 = r1 - r4
            r0.quadTo(r1, r3, r4, r3)
            int r1 = r5.leftBottomRadius
            float r1 = (float) r1
            float r3 = r5.height
            r0.lineTo(r1, r3)
            float r1 = r5.height
            int r3 = r5.leftBottomRadius
            float r3 = (float) r3
            float r3 = r1 - r3
            r0.quadTo(r2, r1, r2, r3)
            int r1 = r5.leftTopRadius
            float r1 = (float) r1
            r0.lineTo(r2, r1)
            int r1 = r5.leftTopRadius
            float r1 = (float) r1
            r0.quadTo(r2, r2, r1, r2)
            r6.clipPath(r0)
        L85:
            super.onDraw(r6)
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            int r2 = r0.getWidth()
            float r2 = (float) r2
            r1.width = r2
            int r2 = r0.getHeight()
            float r2 = (float) r2
            r1.height = r2
            return
    }

    public void setRadius(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.leftTopRadius = r1
            r0.rightTopRadius = r2
            r0.rightBottomRadius = r3
            r0.leftBottomRadius = r4
            r0.invalidate()
            return
    }
}
