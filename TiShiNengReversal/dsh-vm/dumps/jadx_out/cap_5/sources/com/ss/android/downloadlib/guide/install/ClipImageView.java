package com.ss.android.downloadlib.guide.install;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ClipImageView extends android.widget.ImageView {
    private boolean a;
    private android.graphics.Path b;
    private android.graphics.RectF c;
    private android.graphics.Paint d;
    private float[] e;

    public ClipImageView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            r1.a = r0
            r1.a(r2)
            return
    }

    public ClipImageView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 1
            r0.a = r2
            r0.a(r1)
            return
    }

    public ClipImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 1
            r0.a = r2
            r0.a(r1)
            return
    }

    protected void a(android.content.Context r1) {
            r0 = this;
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.b = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.c = r1
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.a
            if (r0 == 0) goto L3e
            android.graphics.Path r0 = r4.b
            r0.reset()
            android.graphics.RectF r0 = r4.c
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r2 = r4.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            float[] r0 = r4.e
            if (r0 == 0) goto L26
            android.graphics.Path r1 = r4.b
            android.graphics.RectF r2 = r4.c
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r2, r0, r3)
        L26:
            android.graphics.PaintFlagsDrawFilter r0 = new android.graphics.PaintFlagsDrawFilter
            r1 = 0
            r2 = 3
            r0.<init>(r1, r2)
            r5.setDrawFilter(r0)
            android.graphics.Path r0 = r4.b
            r5.clipPath(r0)
            android.graphics.Paint r0 = r4.d
            if (r0 == 0) goto L3e
            android.graphics.Path r1 = r4.b
            r5.drawPath(r1, r0)
        L3e:
            super.onDraw(r5)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r3) {
            r2 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r2.d = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.d
            r0.setColor(r3)
            return
    }

    public void setClip(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setRadius(float[] r3) {
            r2 = this;
            if (r3 == 0) goto La
            int r0 = r3.length
            r1 = 8
            if (r0 == r1) goto L8
            goto La
        L8:
            r2.e = r3
        La:
            return
    }

    public void setRoundRadius(int r3) {
            r2 = this;
            if (r3 <= 0) goto L22
            float r3 = (float) r3
            r0 = 8
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            r1 = 2
            r0[r1] = r3
            r1 = 3
            r0[r1] = r3
            r1 = 4
            r0[r1] = r3
            r1 = 5
            r0[r1] = r3
            r1 = 6
            r0[r1] = r3
            r1 = 7
            r0[r1] = r3
            r2.setRadius(r0)
        L22:
            return
    }
}
