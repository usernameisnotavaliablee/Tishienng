package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends android.graphics.drawable.Drawable {
    private final android.graphics.Paint a;
    private android.graphics.Bitmap b;
    private int c;
    private int d;
    private int e;

    public d(android.graphics.Bitmap r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 2
            r0.<init>(r1)
            r2.a = r0
            r0 = 255(0xff, float:3.57E-43)
            r2.c = r0
            r2.b(r3)
            return
    }

    public android.graphics.Bitmap a() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.b
            return r0
    }

    public void b(android.graphics.Bitmap r1) {
            r0 = this;
            r0.b = r1
            if (r1 == 0) goto L13
            int r1 = r1.getWidth()
            r0.d = r1
            android.graphics.Bitmap r1 = r0.b
            int r1 = r1.getHeight()
            r0.e = r1
            return
        L13:
            r1 = 0
            r0.e = r1
            r0.d = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Bitmap r0 = r4.b
            if (r0 == 0) goto L16
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L16
            android.graphics.Bitmap r0 = r4.b
            android.graphics.Rect r1 = r4.getBounds()
            android.graphics.Paint r2 = r4.a
            r3 = 0
            r5.drawBitmap(r0, r3, r1, r2)
        L16:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            r1.c = r2
            android.graphics.Paint r0 = r1.a
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            r0.setFilterBitmap(r2)
            return
    }
}
