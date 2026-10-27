package com.scwang.smartrefresh.layout.internal.pathview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends android.graphics.drawable.Drawable {
    protected static final android.graphics.Region n = null;
    protected static final android.graphics.Region o = null;
    protected android.graphics.Paint a;
    protected java.util.List<android.graphics.Path> b;
    protected java.util.List<java.lang.Integer> c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected java.util.List<android.graphics.Path> j;
    protected java.util.List<java.lang.String> k;
    private android.graphics.Bitmap l;
    private boolean m;

    static {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>()
            com.scwang.smartrefresh.layout.internal.pathview.b.n = r0
            android.graphics.Region r0 = new android.graphics.Region
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r1, r1, r2, r2)
            com.scwang.smartrefresh.layout.internal.pathview.b.o = r0
            return
    }

    public b() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.d = r0
            r3.e = r0
            r1 = 0
            r3.f = r1
            r3.g = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r3.a = r1
            r2 = -15614977(0xffffffffff11bbff, float:-1.937142E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r3.a
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r3.a
            r1.setAntiAlias(r0)
            return
    }

    private void d(android.graphics.Canvas r4) {
            r3 = this;
            int r0 = r3.f
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r3.g
            int r1 = -r1
            float r1 = (float) r1
            r4.translate(r0, r1)
            java.util.List<android.graphics.Path> r0 = r3.b
            if (r0 == 0) goto L43
            r0 = 0
        L10:
            java.util.List<android.graphics.Path> r1 = r3.b
            int r1 = r1.size()
            if (r0 >= r1) goto L43
            java.util.List<java.lang.Integer> r1 = r3.c
            if (r1 == 0) goto L33
            int r1 = r1.size()
            if (r0 >= r1) goto L33
            android.graphics.Paint r1 = r3.a
            java.util.List<java.lang.Integer> r2 = r3.c
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setColor(r2)
        L33:
            java.util.List<android.graphics.Path> r1 = r3.b
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Path r1 = (android.graphics.Path) r1
            android.graphics.Paint r2 = r3.a
            r4.drawPath(r1, r2)
            int r0 = r0 + 1
            goto L10
        L43:
            return
    }

    public boolean a(int r2, int r3) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.l
            int r0 = r0.getWidth()
            if (r2 != r0) goto L12
            android.graphics.Bitmap r2 = r1.l
            int r2 = r2.getHeight()
            if (r3 != r2) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.m
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void c(int r2, int r3) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.l
            if (r0 == 0) goto Lc
            boolean r0 = r1.a(r2, r3)
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
            r1.l = r2
            r2 = 1
            r1.m = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.getBounds()
            int r1 = r0.width()
            int r2 = r0.height()
            android.graphics.Paint r3 = r5.a
            int r3 = r3.getAlpha()
            r4 = 255(0xff, float:3.57E-43)
            if (r3 != r4) goto L69
            r6.save()
            int r1 = r0.left
            int r2 = r5.f
            int r1 = r1 - r2
            float r1 = (float) r1
            int r0 = r0.top
            int r2 = r5.g
            int r0 = r0 - r2
            float r0 = (float) r0
            r6.translate(r1, r0)
            java.util.List<android.graphics.Path> r0 = r5.b
            if (r0 == 0) goto L65
            r0 = 0
        L2d:
            java.util.List<android.graphics.Path> r1 = r5.b
            int r1 = r1.size()
            if (r0 >= r1) goto L60
            java.util.List<java.lang.Integer> r1 = r5.c
            if (r1 == 0) goto L50
            int r1 = r1.size()
            if (r0 >= r1) goto L50
            android.graphics.Paint r1 = r5.a
            java.util.List<java.lang.Integer> r2 = r5.c
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setColor(r2)
        L50:
            java.util.List<android.graphics.Path> r1 = r5.b
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Path r1 = (android.graphics.Path) r1
            android.graphics.Paint r2 = r5.a
            r6.drawPath(r1, r2)
            int r0 = r0 + 1
            goto L2d
        L60:
            android.graphics.Paint r0 = r5.a
            r0.setAlpha(r4)
        L65:
            r6.restore()
            return
        L69:
            r5.c(r1, r2)
            boolean r3 = r5.b()
            if (r3 != 0) goto L78
            r5.m(r1, r2)
            r5.l()
        L78:
            android.graphics.Bitmap r1 = r5.l
            int r2 = r0.left
            float r2 = (float) r2
            int r0 = r0.top
            float r0 = (float) r0
            android.graphics.Paint r3 = r5.a
            r6.drawBitmap(r1, r2, r0, r3)
            return
    }

    public android.graphics.Paint e() {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            return r0
    }

    public int f() {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.height()
            return r0
    }

    protected void g() {
            r8 = this;
            java.util.List<android.graphics.Path> r0 = r8.b
            r1 = 0
            if (r0 == 0) goto L73
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
            r3 = r2
            r4 = r3
        Lc:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L70
            java.lang.Object r5 = r0.next()
            android.graphics.Path r5 = (android.graphics.Path) r5
            android.graphics.Region r6 = com.scwang.smartrefresh.layout.internal.pathview.b.n
            android.graphics.Region r7 = com.scwang.smartrefresh.layout.internal.pathview.b.o
            r6.setPath(r5, r7)
            android.graphics.Rect r5 = r6.getBounds()
            if (r1 != 0) goto L28
            int r1 = r5.top
            goto L2c
        L28:
            int r1 = r1.intValue()
        L2c:
            int r6 = r5.top
            int r1 = java.lang.Math.min(r1, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r2 != 0) goto L3b
            int r2 = r5.left
            goto L3f
        L3b:
            int r2 = r2.intValue()
        L3f:
            int r6 = r5.left
            int r2 = java.lang.Math.min(r2, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r3 != 0) goto L4e
            int r3 = r5.right
            goto L52
        L4e:
            int r3 = r3.intValue()
        L52:
            int r6 = r5.right
            int r3 = java.lang.Math.max(r3, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r4 != 0) goto L61
            int r4 = r5.bottom
            goto L65
        L61:
            int r4 = r4.intValue()
        L65:
            int r5 = r5.bottom
            int r4 = java.lang.Math.max(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto Lc
        L70:
            r0 = r1
            r1 = r2
            goto L76
        L73:
            r0 = r1
            r3 = r0
            r4 = r3
        L76:
            r2 = 0
            if (r1 != 0) goto L7b
            r1 = 0
            goto L7f
        L7b:
            int r1 = r1.intValue()
        L7f:
            r8.f = r1
            if (r0 != 0) goto L85
            r0 = 0
            goto L89
        L85:
            int r0 = r0.intValue()
        L89:
            r8.g = r0
            if (r3 != 0) goto L8f
            r0 = 0
            goto L96
        L8f:
            int r0 = r3.intValue()
            int r1 = r8.f
            int r0 = r0 - r1
        L96:
            r8.d = r0
            if (r4 != 0) goto L9b
            goto La3
        L9b:
            int r0 = r4.intValue()
            int r1 = r8.g
            int r2 = r0 - r1
        La3:
            r8.e = r2
            int r0 = r8.h
            if (r0 != 0) goto Lad
            int r0 = r8.d
            r8.h = r0
        Lad:
            int r0 = r8.i
            if (r0 != 0) goto Lb3
            r8.i = r2
        Lb3:
            android.graphics.Rect r0 = r8.getBounds()
            int r1 = r0.left
            int r0 = r0.top
            int r2 = r8.d
            int r2 = r2 + r1
            int r3 = r8.e
            int r3 = r3 + r0
            super.setBounds(r1, r0, r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public void h(int... r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.c = r0
            int r0 = r5.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            r2 = r5[r1]
            java.util.List<java.lang.Integer> r3 = r4.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    public void i(java.lang.String... r5) {
            r4 = this;
            r0 = 0
            r4.i = r0
            r4.h = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.k = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.j = r1
            r4.b = r1
            int r1 = r5.length
        L16:
            if (r0 >= r1) goto L2b
            r2 = r5[r0]
            java.util.List<java.lang.String> r3 = r4.k
            r3.add(r2)
            java.util.List<android.graphics.Path> r3 = r4.j
            android.graphics.Path r2 = com.scwang.smartrefresh.layout.internal.pathview.a.e(r2)
            r3.add(r2)
            int r0 = r0 + 1
            goto L16
        L2b:
            r4.g()
            return
    }

    public void j(int r5) {
            r4 = this;
            android.graphics.Rect r0 = r4.getBounds()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = (float) r5
            float r5 = r5 * r1
            int r1 = r0.height()
            float r1 = (float) r1
            float r5 = r5 / r1
            int r1 = r0.left
            float r1 = (float) r1
            float r1 = r1 * r5
            int r1 = (int) r1
            int r2 = r0.top
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = (int) r2
            int r3 = r0.right
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = (int) r3
            int r0 = r0.bottom
            float r0 = (float) r0
            float r0 = r0 * r5
            int r5 = (int) r0
            r4.setBounds(r1, r2, r3, r5)
            return
    }

    public void k(int r5) {
            r4 = this;
            android.graphics.Rect r0 = r4.getBounds()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = (float) r5
            float r5 = r5 * r1
            int r1 = r0.width()
            float r1 = (float) r1
            float r5 = r5 / r1
            int r1 = r0.left
            float r1 = (float) r1
            float r1 = r1 * r5
            int r1 = (int) r1
            int r2 = r0.top
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = (int) r2
            int r3 = r0.right
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = (int) r3
            int r0 = r0.bottom
            float r0 = (float) r0
            float r0 = r0 * r5
            int r5 = (int) r0
            r4.setBounds(r1, r2, r3, r5)
            return
    }

    public void l() {
            r1 = this;
            r0 = 0
            r1.m = r0
            return
    }

    public void m(int r1, int r2) {
            r0 = this;
            android.graphics.Bitmap r1 = r0.l
            r2 = 0
            r1.eraseColor(r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = r0.l
            r1.<init>(r2)
            r0.d(r1)
            return
    }

    public int n() {
            r1 = this;
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.width()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int r4, int r5, int r6, int r7) {
            r3 = this;
            int r0 = r6 - r4
            int r1 = r7 - r5
            java.util.List<android.graphics.Path> r2 = r3.j
            if (r2 == 0) goto L34
            int r2 = r2.size()
            if (r2 <= 0) goto L34
            int r2 = r3.d
            if (r0 != r2) goto L16
            int r2 = r3.e
            if (r1 == r2) goto L34
        L16:
            float r4 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            int r6 = r3.h
            float r6 = (float) r6
            float r4 = r4 / r6
            float r6 = (float) r1
            float r6 = r6 * r5
            int r5 = r3.i
            float r5 = (float) r5
            float r6 = r6 / r5
            java.util.List<android.graphics.Path> r5 = r3.j
            java.util.List<java.lang.String> r7 = r3.k
            java.util.List r4 = com.scwang.smartrefresh.layout.internal.pathview.a.j(r4, r6, r5, r7)
            r3.b = r4
            r3.g()
            return
        L34:
            super.setBounds(r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@androidx.annotation.NonNull android.graphics.Rect r4) {
            r3 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.setBounds(r0, r1, r2, r4)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            r0.setColorFilter(r2)
            return
    }
}
