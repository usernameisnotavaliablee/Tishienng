package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DeliveryHeader extends android.view.View implements l2.e {
    private android.graphics.Paint a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float f;
    private com.scwang.smartrefresh.layout.constant.RefreshState g;
    private com.scwang.smartrefresh.layout.internal.pathview.b h;
    private com.scwang.smartrefresh.layout.internal.pathview.b i;
    private com.scwang.smartrefresh.layout.internal.pathview.b j;

    public DeliveryHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.n(r2, r0)
            return
    }

    public DeliveryHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.n(r1, r2)
            return
    }

    public DeliveryHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.n(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public DeliveryHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.n(r1, r2)
            return
    }

    private void m(int r3) {
            r2 = this;
            int r0 = r2.b
            r1 = 1091567616(0x41100000, float:9.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r0 = r0 + r1
            r2.b = r0
            int r0 = r2.c
            r1 = 1084227584(0x40a00000, float:5.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r0 = r0 + r1
            r2.c = r0
            int r0 = r2.d
            r1 = 1094713344(0x41400000, float:12.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r0 = r0 + r1
            r2.d = r0
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r2.h
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.width()
            int r1 = r2.b
            int r3 = r3 + r0
            if (r1 <= r3) goto L33
            int r1 = -r0
            r2.b = r1
        L33:
            int r1 = r2.c
            if (r1 <= r3) goto L3a
            int r1 = -r0
            r2.c = r1
        L3a:
            int r1 = r2.d
            if (r1 <= r3) goto L41
            int r3 = -r0
            r2.d = r3
        L41:
            float r3 = r2.f
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r3 = r3 + r0
            r2.f = r3
            r2.invalidate()
            return
    }

    private void n(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r8.a = r9
            r10 = 1
            r9.setAntiAlias(r10)
            r9 = 1125515264(0x43160000, float:150.0)
            int r9 = com.scwang.smartrefresh.layout.util.c.b(r9)
            r8.setMinimumHeight(r9)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r9.<init>()
            r8.h = r9
            java.lang.String r10 = "M63,0.1A22.6,22.4 0,0 0,42.1 14.2,17.3 17.3,0 0,0 30.9,10.2 17.3,17.3 0,0 0,13.7 25.8,8.8 8.8,0 0,0 8.7,24.2 8.8,8.8 0,0 0,0 32h99a7.9,7.9 0,0 0,0 -0.6,7.9 7.9,0 0,0 -7.9,-7.9 7.9,7.9 0,0 0,-5.8 2.6,22.6 22.4,0 0,0 0.3,-3.6A22.6,22.4 0,0 0,63 0.1Z"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            r9.i(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.h
            r10 = -1
            int[] r10 = new int[]{r10}
            r9.h(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.h
            r10 = 1101004800(0x41a00000, float:20.0)
            int r10 = com.scwang.smartrefresh.layout.util.c.b(r10)
            r9.j(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r9.<init>()
            r8.i = r9
            java.lang.String r6 = "m156.48,313.99c32.9,-59.38 53.82,-87.19 69.12,-155.22 12.23,38.4 28.73,22.32 40.64,-17.24 -2.11,50.59 -43.12,112.84 -99.62,171.38 -4.57,4.73 -8.31,9.42 -8.31,10.4 -0,2.28 -3.52,5.43 -7.1,6.82 -4.65,0.73 2.08,-12.86 5.27,-16.15z"
            java.lang.String r7 = "M130.37,332.77C129.51,321.51 128.56,320.77 125.3,311.42 113.97,281.37 101.34,222.24 95.3,175.45c16.48,38.98 60.02,33.39 76.96,-1 -5.91,58.92 -10.85,88.45 -27.42,138.74 -1.67,6.75 -2.67,11.63 -3.7,19.46 -2.94,0.45 -6.48,0.45 -10.78,0.12zM119.44,25.22c-3.52,-1.25 -6.98,-3.72 -8.14,-7.8 -0.44,-1.53 -0.24,-2.79 0.41,-3.98 2.48,-4.55 14.53,-6.26 21.78,-6.06 5.29,0.15 14.87,0.72 20.87,6.01 1.82,1.61 2.74,3.95 2.34,5.44 -0.76,2.83 -4.21,5.19 -6.59,6.04 -7.49,2.68 -22.62,3.2 -30.66,0.34z"
            java.lang.String r0 = "M113.91,328.86 L119.02,331.02 134.86,359.02 133.99,359.02ZM2.18,144.52c-3.67,-76.84 49.96,-122.23 96.3,-134.98 6.03,0.21 7.57,0.59 13.23,3.9 0.19,1.7 0.25,2.17 -0.41,3.98 -47.88,37.64 -55.13,79.65 -68.07,137.22C37.56,194.8 16.18,191.4 2.18,144.52Z"
            java.lang.String r1 = "m133.99,359.02 l-0.71,-26.66 2.6,0.26 -1.02,26.4zM119.02,331.02c-3.39,-0.99 -8.53,-3.03 -8.72,-6.61 0,-0.81 -2.02,-3.63 -4.49,-6.27C88.05,299.71 7.29,218.46 2.18,144.52c17.67,43.57 33.35,45.33 41.05,10.12 0.13,-70.78 33.78,-125.48 68.07,-137.22 2.34,3.33 4.11,4.81 8.14,7.8 -22.02,65.69 -23.25,84.11 -24.14,150.23 -8.68,29.57 -37.44,32.81 -52.07,-20.81 14.12,64.06 31.66,101.57 60.64,147.13 6.2,8.38 14.74,18.4 15.15,29.25zM98.48,9.54c4.59,-1.5 17.8,-4.6 33.87,-5.07 0.95,0.95 1.38,1.91 1.14,2.91 -8.81,1.34 -16.36,3.1 -21.78,6.06 -2.53,-1.27 -7.82,-3.26 -13.23,-3.9z"
            java.lang.String r2 = "m119.02,331.02c-1.29,-7.57 -4.22,-12.31 -6.54,-15.79 -36.86,-54.89 -63.48,-98.79 -69.25,-160.59 19.89,45.9 41.27,48.65 52.07,20.81 -1.95,-52.55 -8.04,-91.2 24.14,-150.23 10.47,-0.28 16.85,0.17 30.66,-0.34 40.19,60.54 24.92,135.95 22.16,149.57 -13.9,53.18 -66.91,34.12 -76.96,1 11.54,50.55 20.28,89.27 30,135.97 4.12,10.03 5.37,10.37 5.06,21.35 -2.82,-0.22 -8.22,-1.01 -11.35,-1.75z"
            java.lang.String r3 = "m172.27,174.45c4.91,-51.6 -1.8,-105.99 -22.16,-149.57 2.51,-3.42 3.25,-4.36 6.59,-6.04 47.91,22.5 77.5,62.66 68.9,139.94 -16.53,49.7 -45.39,52.78 -53.33,15.68zM154.36,13.39c-6.65,-2.73 -11.65,-4.27 -20.87,-6.01 -0.25,-1.02 -0.71,-2.21 -1.14,-2.91 16.31,-0.22 27.58,2.29 37.27,4.82 -5.49,0.42 -11.39,1.87 -15.26,4.11z"
            java.lang.String r4 = "m133.99,359.02 l14.98,-28.13 2.24,-0.75 -16.34,28.88zM141.15,332.65c0.01,-11.71 2.3,-14.29 4.13,-21.52 11.82,-46.68 16.09,-77.45 26.98,-136.68 12.18,38.55 37.7,23.31 53.33,-15.68 -4.01,53.72 -43.68,121.28 -68.8,155.25 -6.17,9.5 -8.27,16.22 -5.59,16.12 -3.69,1.47 -6.24,2.05 -10.05,2.51z"
            java.lang.String r5 = "m225.59,158.77c1.61,-52.44 -22.26,-117.1 -68.9,-139.94 -1.48,-2.24 -1.63,-2.16 -2.34,-5.44 3.7,-3.42 9.42,-4.82 15.26,-4.11 48.59,9.81 103.07,66.75 96.62,132.26 -9.7,45.68 -35.45,51.78 -40.64,17.24z"
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            r9.i(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.i
            r10 = 8
            int[] r10 = new int[r10]
            r10 = {x00e2: FILL_ARRAY_DATA , data: [-7151637, -9580311, -11549721, -13650202, -14308898, -15619100, -15819816, -12535839} // fill-array
            r9.h(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.i
            r10 = 1128792064(0x43480000, float:200.0)
            int r10 = com.scwang.smartrefresh.layout.util.c.b(r10)
            r9.k(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r9.<init>()
            r8.j = r9
            java.lang.String r10 = "M47.9,35.4 L47.5,93 92.8,76.2V29.9l2.2,-0.8 0,-10.9z"
            java.lang.String r0 = "M82.6,80 L92.8,62.4 92.8,76.2ZM47.6,79.8 L59.8,88.4 47.5,93ZM47.8,46.4 L92.8,29.9 92.8,34.2 47.8,51.6Z"
            java.lang.String r1 = "M0,17.5 L3.1,29.8 2.9,76.4 47.5,93 92.8,76.2V29.9L94.9,18.1 47.4,0.5Z"
            java.lang.String r2 = "M3.1,29.8 L47.8,46.4 47.5,93 2.9,76.4ZM0,17.5 L47.9,35.4 47.8,46.4 0.2,28.8Z"
            java.lang.String r3 = "m56.5,17.8c0,2.1 -3.8,3.8 -8.5,3.8 -4.7,0 -8.5,-1.7 -8.5,-3.8 0,-2.1 3.8,-3.8 8.5,-3.8 4.7,0 8.5,1.7 8.5,3.8zM3.1,29.8 L3.1,34.7l44.7,16.9 0,-5.1z"
            java.lang.String[] r10 = new java.lang.String[]{r1, r2, r3, r10, r0}
            r9.i(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.j
            r10 = -81839(0xfffffffffffec051, float:NaN)
            r0 = -545463(0xfffffffffff7ad49, float:NaN)
            r1 = -478905(0xfffffffffff8b147, float:NaN)
            r2 = -878788(0xfffffffffff2973c, float:NaN)
            r3 = -1212368(0xffffffffffed8030, float:NaN)
            int[] r10 = new int[]{r1, r2, r3, r10, r0}
            r9.h(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.j
            r10 = 1112014848(0x42480000, float:50.0)
            int r10 = com.scwang.smartrefresh.layout.util.c.b(r10)
            r9.k(r10)
            boolean r9 = r8.isInEditMode()
            if (r9 == 0) goto Le1
            com.scwang.smartrefresh.layout.constant.RefreshState r9 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            r8.g = r9
            r9 = 1120403456(0x42c80000, float:100.0)
            r8.f = r9
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.h
            int r9 = r9.n()
            float r9 = (float) r9
            r10 = 1080033280(0x40600000, float:3.5)
            float r9 = r9 * r10
            int r9 = (int) r9
            r8.b = r9
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.h
            int r9 = r9.n()
            float r9 = (float) r9
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
            int r9 = (int) r9
            r8.c = r9
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = r8.h
            int r9 = r9.n()
            float r9 = (float) r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r10
            int r9 = (int) r9
            r8.d = r9
        Le1:
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            r0.e = r2
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = r0.g
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r2 == r3) goto L1d
            com.scwang.smartrefresh.layout.internal.pathview.b r2 = r0.j
            android.graphics.Paint r2 = r2.e()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            float r1 = java.lang.Math.max(r3, r1)
            float r4 = r4 - r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r1
            int r1 = (int) r4
            r2.setAlpha(r1)
        L1d:
            return
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r1, int r2, int r3) {
            r0 = this;
            r0.t(r1, r2, r3)
            return
    }

    public void j(float r1, int r2, int r3) {
            r0 = this;
            return
    }

    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            int r2 = r10.getSaveCount()
            r10.save()
            int r3 = r9.e
            int r3 = r3 / 13
            double r3 = (double) r3
            float r5 = r9.f
            double r5 = (double) r5
            double r5 = java.lang.Math.sin(r5)
            double r3 = r3 * r5
            int r3 = (int) r3
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = r9.g
            com.scwang.smartrefresh.layout.constant.RefreshState r5 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r4 == r5) goto L28
            com.scwang.smartrefresh.layout.constant.RefreshState r6 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
            if (r4 != r6) goto L8a
        L28:
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r9.h
            android.graphics.Rect r4 = r4.getBounds()
            int r6 = r9.b
            int r7 = r9.e
            int r7 = r7 / 3
            r4.offsetTo(r6, r7)
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r9.h
            r4.draw(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r9.h
            android.graphics.Rect r4 = r4.getBounds()
            int r6 = r9.c
            int r7 = r9.e
            int r7 = r7 / 2
            r4.offsetTo(r6, r7)
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r9.h
            r4.draw(r10)
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r9.h
            android.graphics.Rect r4 = r4.getBounds()
            int r6 = r9.d
            int r7 = r9.e
            int r7 = r7 * 2
            int r7 = r7 / 3
            r4.offsetTo(r6, r7)
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r9.h
            r4.draw(r10)
            float r4 = r9.f
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
            double r6 = (double) r4
            double r6 = java.lang.Math.sin(r6)
            float r4 = (float) r6
            r6 = 1084227584(0x40a00000, float:5.0)
            float r4 = r4 * r6
            int r6 = r0 / 2
            float r6 = (float) r6
            int r7 = r9.e
            int r7 = r7 / 2
            com.scwang.smartrefresh.layout.internal.pathview.b r8 = r9.i
            int r8 = r8.f()
            int r7 = r7 - r8
            float r7 = (float) r7
            r10.rotate(r4, r6, r7)
            r9.m(r0)
        L8a:
            int r4 = r9.e
            int r6 = r4 / 2
            int r1 = r1 - r6
            int r1 = r1 + r3
            int r4 = r4 / 2
            com.scwang.smartrefresh.layout.internal.pathview.b r3 = r9.j
            int r3 = r3.f()
            int r4 = r4 - r3
            int r4 = r4 + r1
            int r3 = r9.e
            int r3 = r3 / 2
            com.scwang.smartrefresh.layout.internal.pathview.b r6 = r9.j
            int r6 = r6.f()
            int r3 = r3 - r6
            float r6 = r9.f
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r7
            int r6 = com.scwang.smartrefresh.layout.util.c.b(r6)
            int r3 = java.lang.Math.min(r3, r6)
            int r4 = r4 - r3
            com.scwang.smartrefresh.layout.internal.pathview.b r3 = r9.j
            android.graphics.Rect r3 = r3.getBounds()
            int r0 = r0 / 2
            com.scwang.smartrefresh.layout.internal.pathview.b r6 = r9.j
            int r6 = r6.n()
            int r6 = r6 / 2
            int r6 = r0 - r6
            com.scwang.smartrefresh.layout.internal.pathview.b r8 = r9.j
            int r8 = r8.f()
            int r8 = r8 / 4
            int r4 = r4 - r8
            r3.offsetTo(r6, r4)
            com.scwang.smartrefresh.layout.internal.pathview.b r3 = r9.j
            r3.draw(r10)
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = r9.g
            if (r3 == r5) goto Ldf
            com.scwang.smartrefresh.layout.constant.RefreshState r4 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish
            if (r3 != r4) goto L10f
        Ldf:
            com.scwang.smartrefresh.layout.internal.pathview.b r3 = r9.i
            android.graphics.Rect r3 = r3.getBounds()
            int r4 = r9.e
            int r1 = r1 - r4
            float r5 = r9.f
            float r5 = r5 * r7
            int r5 = com.scwang.smartrefresh.layout.util.c.b(r5)
            int r4 = java.lang.Math.min(r4, r5)
            int r1 = r1 + r4
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r9.i
            android.graphics.Rect r4 = r4.getBounds()
            int r5 = r3.width()
            int r5 = r5 / 2
            int r0 = r0 - r5
            int r3 = r3.height()
            int r1 = r1 - r3
            r4.offsetTo(r0, r1)
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r9.i
            r0.draw(r10)
        L10f:
            r10.restoreToCount(r2)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = android.view.View.resolveSize(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            r0.g = r3
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r3 != r1) goto L1a
            r1 = 0
            r0.f = r1
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r0.h
            android.graphics.Rect r1 = r1.getBounds()
            int r1 = r1.width()
            int r1 = -r1
            r0.d = r1
            r0.c = r1
            r0.b = r1
        L1a:
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto L18
            r0 = 0
            r0 = r3[r0]
            r2.setBackgroundColor(r0)
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto L18
            com.scwang.smartrefresh.layout.internal.pathview.b r0 = r2.h
            r3 = r3[r1]
            int[] r3 = new int[]{r3}
            r0.h(r3)
        L18:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            r0.g = r1
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r0.j
            android.graphics.Paint r1 = r1.e()
            r2 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r2)
            r0.invalidate()
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void x(float r1, int r2, int r3, int r4) {
            r0 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = r0.g
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r2 == r3) goto L1d
            com.scwang.smartrefresh.layout.internal.pathview.b r2 = r0.j
            android.graphics.Paint r2 = r2.e()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            float r1 = java.lang.Math.max(r3, r1)
            float r4 = r4 - r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r1
            int r1 = (int) r4
            r2.setAlpha(r1)
        L1d:
            return
    }
}
