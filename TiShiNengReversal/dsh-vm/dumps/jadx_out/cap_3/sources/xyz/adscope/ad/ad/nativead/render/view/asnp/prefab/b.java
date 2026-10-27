package xyz.adscope.ad.ad.nativead.render.view.asnp.prefab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b extends android.widget.ImageView {
    private final android.graphics.RectF a;
    private float b;
    private java.lang.String c;
    private int d;
    private final android.graphics.Paint e;
    private final android.graphics.Paint f;

    public b(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.a = r1
            r1 = 0
            r0.b = r1
            r1 = 0
            r0.c = r1
            r1 = 0
            r0.d = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.e = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f = r1
            r0.d()
            return
    }

    private void d() {
            r4 = this;
            android.graphics.Paint r0 = r4.e
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r4.e
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3)
            r0.setXfermode(r2)
            android.graphics.Paint r0 = r4.f
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r4.f
            r1 = -1
            r0.setColor(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.RectF r0 = r4.a
            android.graphics.Paint r1 = r4.f
            r2 = 31
            r5.saveLayer(r0, r1, r2)
            android.graphics.RectF r0 = r4.a
            float r1 = r4.b
            android.graphics.Paint r3 = r4.f
            r5.drawRoundRect(r0, r1, r1, r3)
            android.graphics.RectF r0 = r4.a
            android.graphics.Paint r1 = r4.e
            r5.saveLayer(r0, r1, r2)
            super.draw(r5)
            int r0 = r4.d
            if (r0 <= 0) goto L56
            java.lang.String r0 = r4.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L56
            java.lang.String r0 = r4.c
            java.lang.String r1 = "#"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L56
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            java.lang.String r1 = r4.c
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            int r1 = r4.d
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.RectF r1 = r4.a
            float r2 = r4.b
            r5.drawRoundRect(r1, r2, r2, r0)
        L56:
            r5.restore()
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            android.graphics.RectF r4 = r1.a
            float r2 = (float) r2
            float r3 = (float) r3
            r5 = 0
            r4.set(r5, r5, r2, r3)
            return
    }

    protected void setBorderColor(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    protected void setBorderWidth(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    protected void setRectRadius(float r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
