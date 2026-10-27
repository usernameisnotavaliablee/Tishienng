package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Rectangle {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int beyond180Mode;
    public float bottom;
    public com.autonavi.base.amap.mapcore.FPoint[] clipMapRect;
    public com.autonavi.amap.mapcore.IPoint[] clipRect;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int[] jniClipRect;
    public float left;
    public android.graphics.Rect rect;
    public float right;
    public float top;

    public Rectangle() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.rect = r0
            r0 = 0
            r1.beyond180Mode = r0
            r0 = 0
            r1.clipRect = r0
            r1.clipMapRect = r0
            r0 = 8
            int[] r0 = new int[r0]
            r1.jniClipRect = r0
            return
    }

    public Rectangle(float r2, float r3, float r4, float r5) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.rect = r0
            r0 = 0
            r1.beyond180Mode = r0
            r0 = 0
            r1.clipRect = r0
            r1.clipMapRect = r0
            r0 = 8
            int[] r0 = new int[r0]
            r1.jniClipRect = r0
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L29
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 > 0) goto L21
            goto L29
        L21:
            r1.left = r2
            r1.right = r3
            r1.top = r5
            r1.bottom = r4
        L29:
            return
    }

    public Rectangle(android.graphics.Rect r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r0 = 0
            r1.beyond180Mode = r0
            r0 = 0
            r1.clipRect = r0
            r1.clipMapRect = r0
            r0 = 8
            int[] r0 = new int[r0]
            r1.jniClipRect = r0
            r1.rect = r2
            if (r2 == 0) goto L2b
            r1.updateRect(r2, r3, r4)
            r1.updateClipRect()
            int r3 = r2.centerX()
            int r2 = r2.centerY()
            r1.updateClipMapRect(r3, r2)
        L2b:
            return
    }

    private void updateClipMapRect(int r12, int r13) {
            r11 = this;
            com.autonavi.base.amap.mapcore.FPoint[] r0 = r11.clipMapRect
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 != 0) goto L2c
            r0 = 4
            com.autonavi.base.amap.mapcore.FPoint[] r0 = new com.autonavi.base.amap.mapcore.FPoint[r0]
            r11.clipMapRect = r0
            r5 = 0
            com.autonavi.base.amap.mapcore.FPoint r6 = com.autonavi.base.amap.mapcore.FPoint.obtain(r5, r5)
            r0[r2] = r6
            com.autonavi.base.amap.mapcore.FPoint[] r0 = r11.clipMapRect
            com.autonavi.base.amap.mapcore.FPoint r6 = com.autonavi.base.amap.mapcore.FPoint.obtain(r5, r5)
            r0[r4] = r6
            com.autonavi.base.amap.mapcore.FPoint[] r0 = r11.clipMapRect
            com.autonavi.base.amap.mapcore.FPoint r6 = com.autonavi.base.amap.mapcore.FPoint.obtain(r5, r5)
            r0[r3] = r6
            com.autonavi.base.amap.mapcore.FPoint[] r0 = r11.clipMapRect
            com.autonavi.base.amap.mapcore.FPoint r5 = com.autonavi.base.amap.mapcore.FPoint.obtain(r5, r5)
            r0[r1] = r5
        L2c:
            android.graphics.Rect r0 = r11.rect
            if (r0 == 0) goto L66
            com.autonavi.base.amap.mapcore.FPoint[] r5 = r11.clipMapRect
            r6 = r5[r2]
            int r7 = r0.left
            int r8 = r7 - r12
            float r8 = (float) r8
            r6.x = r8
            int r8 = r0.top
            int r9 = r8 - r13
            float r9 = (float) r9
            r6.y = r9
            r6 = r5[r4]
            int r9 = r0.right
            int r10 = r9 - r12
            float r10 = (float) r10
            r6.x = r10
            int r8 = r8 - r13
            float r8 = (float) r8
            r6.y = r8
            r6 = r5[r3]
            int r9 = r9 - r12
            float r8 = (float) r9
            r6.x = r8
            int r0 = r0.bottom
            int r8 = r0 - r13
            float r8 = (float) r8
            r6.y = r8
            r1 = r5[r1]
            int r7 = r7 - r12
            float r12 = (float) r7
            r1.x = r12
            int r0 = r0 - r13
            float r12 = (float) r0
            r1.y = r12
        L66:
            int[] r12 = r11.jniClipRect
            if (r12 != 0) goto L73
            com.autonavi.base.amap.mapcore.FPoint[] r12 = r11.clipMapRect
            int r12 = r12.length
            int r12 = r12 * 2
            int[] r12 = new int[r12]
            r11.jniClipRect = r12
        L73:
            com.autonavi.base.amap.mapcore.FPoint[] r12 = r11.clipMapRect
            int r13 = r12.length
            if (r2 >= r13) goto L8c
            int[] r13 = r11.jniClipRect
            int r0 = r2 * 2
            r12 = r12[r2]
            float r1 = r12.x
            int r1 = (int) r1
            r13[r0] = r1
            int r0 = r0 + r4
            float r12 = r12.y
            int r12 = (int) r12
            r13[r0] = r12
            int r2 = r2 + 1
            goto L73
        L8c:
            return
    }

    private void updateClipRect() {
            r8 = this;
            com.autonavi.amap.mapcore.IPoint[] r0 = r8.clipRect
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L2b
            r0 = 4
            com.autonavi.amap.mapcore.IPoint[] r0 = new com.autonavi.amap.mapcore.IPoint[r0]
            r8.clipRect = r0
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain(r4, r4)
            r0[r4] = r5
            com.autonavi.amap.mapcore.IPoint[] r0 = r8.clipRect
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain(r4, r4)
            r0[r3] = r5
            com.autonavi.amap.mapcore.IPoint[] r0 = r8.clipRect
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain(r4, r4)
            r0[r2] = r5
            com.autonavi.amap.mapcore.IPoint[] r0 = r8.clipRect
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain(r4, r4)
            r0[r1] = r5
        L2b:
            android.graphics.Rect r0 = r8.rect
            if (r0 == 0) goto L51
            com.autonavi.amap.mapcore.IPoint[] r5 = r8.clipRect
            r4 = r5[r4]
            int r6 = r0.left
            r4.x = r6
            int r7 = r0.top
            r4.y = r7
            r3 = r5[r3]
            int r4 = r0.right
            r3.x = r4
            r3.y = r7
            r2 = r5[r2]
            r2.x = r4
            int r0 = r0.bottom
            r2.y = r0
            r1 = r5[r1]
            r1.x = r6
            r1.y = r0
        L51:
            return
    }

    public boolean contains(int r5, int r6) {
            r4 = this;
            android.graphics.Rect r0 = r4.rect
            if (r0 == 0) goto L27
            boolean r0 = r0.contains(r5, r6)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            int r0 = r4.beyond180Mode
            if (r0 == 0) goto L27
            android.graphics.Rect r0 = r4.rect
            r2 = 268435456(0x10000000, float:2.524355E-29)
            int r3 = r5 - r2
            boolean r0 = r0.contains(r3, r6)
            if (r0 == 0) goto L1d
            return r1
        L1d:
            android.graphics.Rect r0 = r4.rect
            int r5 = r5 + r2
            boolean r5 = r0.contains(r5, r6)
            if (r5 == 0) goto L27
            return r1
        L27:
            r5 = 0
            return r5
    }

    public boolean contains(android.graphics.Rect r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            android.graphics.Rect r0 = r1.rect
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean contains(com.autonavi.amap.mapcore.IPoint r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.x
            int r2 = r2.y
            boolean r2 = r1.contains(r0, r2)
            return r2
    }

    public int getBeyond180Mode() {
            r1 = this;
            int r0 = r1.beyond180Mode
            return r0
    }

    public com.autonavi.base.amap.mapcore.FPoint[] getClipMapRect() {
            r1 = this;
            com.autonavi.base.amap.mapcore.FPoint[] r0 = r1.clipMapRect
            return r0
    }

    public com.autonavi.amap.mapcore.IPoint[] getClipRect() {
            r1 = this;
            com.autonavi.amap.mapcore.IPoint[] r0 = r1.clipRect
            return r0
    }

    public android.graphics.Rect getRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.rect
            return r0
    }

    public boolean isOverlap(int r4, int r5, int r6, int r7) {
            r3 = this;
            android.graphics.Rect r0 = r3.rect
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.left
            int r0 = r0.width()
            int r2 = r2 + r0
            if (r2 <= r4) goto L28
            int r4 = r4 + r6
            android.graphics.Rect r6 = r3.rect
            int r0 = r6.left
            if (r4 <= r0) goto L28
            int r4 = r6.top
            int r6 = r6.height()
            int r4 = r4 + r6
            if (r4 <= r5) goto L28
            int r5 = r5 + r7
            android.graphics.Rect r4 = r3.rect
            int r4 = r4.top
            if (r5 <= r4) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    public boolean isOverlap(android.graphics.Rect r5) {
            r4 = this;
            android.graphics.Rect r0 = r4.rect
            r1 = 0
            if (r0 == 0) goto L36
            if (r5 != 0) goto L8
            goto L36
        L8:
            int r2 = r0.left
            int r0 = r0.width()
            int r2 = r2 + r0
            int r0 = r5.left
            if (r2 <= r0) goto L36
            int r2 = r5.width()
            int r0 = r0 + r2
            android.graphics.Rect r2 = r4.rect
            int r3 = r2.left
            if (r0 <= r3) goto L36
            int r0 = r2.top
            int r2 = r2.height()
            int r0 = r0 + r2
            int r2 = r5.top
            if (r0 <= r2) goto L36
            int r5 = r5.height()
            int r2 = r2 + r5
            android.graphics.Rect r5 = r4.rect
            int r5 = r5.top
            if (r2 <= r5) goto L36
            r5 = 1
            return r5
        L36:
            return r1
    }

    public void updateRect(android.graphics.Rect r4, int r5, int r6) {
            r3 = this;
            if (r4 == 0) goto L3e
            r3.rect = r4
            int r0 = r4.width()
            int r0 = -r0
            int r0 = r0 / 8
            int r1 = r4.height()
            int r1 = -r1
            int r1 = r1 / 8
            r4.inset(r0, r1)
            android.graphics.Rect r4 = r3.rect
            int r0 = r4.left
            float r0 = (float) r0
            r1 = 1203982336(0x47c35000, float:100000.0)
            float r0 = r0 / r1
            int r4 = r4.right
            float r2 = (float) r4
            float r2 = r2 / r1
            float r0 = r0 * r2
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r4 = -1
            r3.beyond180Mode = r4
            goto L38
        L2d:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 <= r0) goto L35
            r4 = 1
            r3.beyond180Mode = r4
            goto L38
        L35:
            r4 = 0
            r3.beyond180Mode = r4
        L38:
            r3.updateClipRect()
            r3.updateClipMapRect(r5, r6)
        L3e:
            return
    }
}
