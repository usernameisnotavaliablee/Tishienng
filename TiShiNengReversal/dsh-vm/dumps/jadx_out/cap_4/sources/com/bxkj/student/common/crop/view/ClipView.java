package com.bxkj.student.common.crop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ClipView extends android.view.View {
    private android.graphics.Paint a;
    private android.graphics.Paint b;
    private float c;
    private int d;
    private int e;
    private int f;
    private int g;
    private com.bxkj.student.common.crop.view.ClipView.ClipType h;
    private android.graphics.Xfermode i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ClipType extends java.lang.Enum<com.bxkj.student.common.crop.view.ClipView.ClipType> {
        private static final /* synthetic */ com.bxkj.student.common.crop.view.ClipView.ClipType[] $VALUES = null;
        public static final com.bxkj.student.common.crop.view.ClipView.ClipType CIRCLE = null;
        public static final com.bxkj.student.common.crop.view.ClipView.ClipType RECTANGLE = null;

        private static /* synthetic */ com.bxkj.student.common.crop.view.ClipView.ClipType[] $values() {
                r0 = 2
                com.bxkj.student.common.crop.view.ClipView$ClipType[] r0 = new com.bxkj.student.common.crop.view.ClipView.ClipType[r0]
                com.bxkj.student.common.crop.view.ClipView$ClipType r1 = com.bxkj.student.common.crop.view.ClipView.ClipType.CIRCLE
                r2 = 0
                r0[r2] = r1
                com.bxkj.student.common.crop.view.ClipView$ClipType r1 = com.bxkj.student.common.crop.view.ClipView.ClipType.RECTANGLE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.bxkj.student.common.crop.view.ClipView$ClipType r0 = new com.bxkj.student.common.crop.view.ClipView$ClipType
                java.lang.String r1 = "CIRCLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bxkj.student.common.crop.view.ClipView.ClipType.CIRCLE = r0
                com.bxkj.student.common.crop.view.ClipView$ClipType r0 = new com.bxkj.student.common.crop.view.ClipView$ClipType
                java.lang.String r1 = "RECTANGLE"
                r2 = 1
                r0.<init>(r1, r2)
                com.bxkj.student.common.crop.view.ClipView.ClipType.RECTANGLE = r0
                com.bxkj.student.common.crop.view.ClipView$ClipType[] r0 = $values()
                com.bxkj.student.common.crop.view.ClipView.ClipType.$VALUES = r0
                return
        }

        ClipType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bxkj.student.common.crop.view.ClipView.ClipType valueOf(java.lang.String r1) {
                java.lang.Class<com.bxkj.student.common.crop.view.ClipView$ClipType> r0 = com.bxkj.student.common.crop.view.ClipView.ClipType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bxkj.student.common.crop.view.ClipView$ClipType r1 = (com.bxkj.student.common.crop.view.ClipView.ClipType) r1
                return r1
        }

        public static com.bxkj.student.common.crop.view.ClipView.ClipType[] values() {
                com.bxkj.student.common.crop.view.ClipView$ClipType[] r0 = com.bxkj.student.common.crop.view.ClipView.ClipType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bxkj.student.common.crop.view.ClipView$ClipType[] r0 = (com.bxkj.student.common.crop.view.ClipView.ClipType[]) r0
                return r0
        }
    }

    public ClipView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClipView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ClipView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.a = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.b = r1
            com.bxkj.student.common.crop.view.ClipView$ClipType r1 = com.bxkj.student.common.crop.view.ClipView.ClipType.CIRCLE
            r0.h = r1
            android.graphics.Paint r1 = r0.a
            r2 = 1
            r1.setAntiAlias(r2)
            android.graphics.Paint r1 = r0.b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = r0.b
            r3 = -1
            r1.setColor(r3)
            android.graphics.Paint r1 = r0.b
            int r3 = r0.d
            float r3 = (float) r3
            r1.setStrokeWidth(r3)
            android.graphics.Paint r1 = r0.b
            r1.setAntiAlias(r2)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            r1.<init>(r2)
            r0.i = r1
            return
    }

    public static int b(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r1 = r0.widthPixels
            return r1
    }

    public int a(float r3, android.content.Context r4) {
            r2 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            android.view.Display r4 = r4.getDefaultDisplay()
            r4.getMetrics(r0)
            float r4 = r0.density
            float r3 = r3 * r4
            double r3 = (double) r3
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = r3 + r0
            int r3 = (int) r3
            return r3
    }

    public android.graphics.Rect getClipRect() {
            r3 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = r3.getWidth()
            int r1 = r1 / 2
            int r2 = r3.f
            int r2 = r2 / 2
            int r1 = r1 - r2
            r0.left = r1
            int r1 = r3.getWidth()
            int r1 = r1 / 2
            int r2 = r3.f
            int r2 = r2 / 2
            int r1 = r1 + r2
            r0.right = r1
            int r1 = r3.getHeight()
            int r1 = r1 / 2
            int r2 = r3.g
            int r2 = r2 / 2
            int r1 = r1 - r2
            r0.top = r1
            int r1 = r3.getHeight()
            int r1 = r1 / 2
            int r2 = r3.g
            int r2 = r2 / 2
            int r1 = r1 + r2
            r0.bottom = r1
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r15) {
            r14 = this;
            super.onDraw(r15)
            int r0 = r14.getWidth()
            float r4 = (float) r0
            int r0 = r14.getHeight()
            float r5 = (float) r0
            r6 = 0
            r2 = 0
            r3 = 0
            r7 = 31
            r1 = r15
            r1.saveLayer(r2, r3, r4, r5, r6, r7)
            r8 = r1
            java.lang.String r15 = "#a8000000"
            int r15 = android.graphics.Color.parseColor(r15)
            r8.drawColor(r15)
            android.graphics.Paint r15 = r14.a
            android.graphics.Xfermode r0 = r14.i
            r15.setXfermode(r0)
            com.bxkj.student.common.crop.view.ClipView$ClipType r15 = r14.h
            com.bxkj.student.common.crop.view.ClipView$ClipType r0 = com.bxkj.student.common.crop.view.ClipView.ClipType.CIRCLE
            if (r15 != r0) goto L5a
            int r15 = r14.getWidth()
            int r15 = r15 / 2
            float r15 = (float) r15
            int r0 = r14.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = r14.e
            float r1 = (float) r1
            android.graphics.Paint r2 = r14.a
            r8.drawCircle(r15, r0, r1, r2)
            int r15 = r14.getWidth()
            int r15 = r15 / 2
            float r15 = (float) r15
            int r0 = r14.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = r14.e
            float r1 = (float) r1
            android.graphics.Paint r2 = r14.b
            r8.drawCircle(r15, r0, r1, r2)
            goto Lc8
        L5a:
            com.bxkj.student.common.crop.view.ClipView$ClipType r0 = com.bxkj.student.common.crop.view.ClipView.ClipType.RECTANGLE
            if (r15 != r0) goto Lc8
            int r15 = r14.getWidth()
            int r15 = r15 / 2
            int r0 = r14.f
            int r0 = r0 / 2
            int r15 = r15 - r0
            float r9 = (float) r15
            int r15 = r14.getHeight()
            int r15 = r15 / 2
            int r0 = r14.g
            int r0 = r0 / 2
            int r15 = r15 - r0
            float r10 = (float) r15
            int r15 = r14.getWidth()
            int r15 = r15 / 2
            int r0 = r14.f
            int r0 = r0 / 2
            int r15 = r15 + r0
            float r11 = (float) r15
            int r15 = r14.getHeight()
            int r15 = r15 / 2
            int r0 = r14.g
            int r0 = r0 / 2
            int r15 = r15 + r0
            float r12 = (float) r15
            android.graphics.Paint r13 = r14.a
            r8.drawRect(r9, r10, r11, r12, r13)
            int r15 = r14.getWidth()
            int r15 = r15 / 2
            int r0 = r14.f
            int r0 = r0 / 2
            int r15 = r15 - r0
            float r9 = (float) r15
            int r15 = r14.getHeight()
            int r15 = r15 / 2
            int r0 = r14.g
            int r0 = r0 / 2
            int r15 = r15 - r0
            float r10 = (float) r15
            int r15 = r14.getWidth()
            int r15 = r15 / 2
            int r0 = r14.f
            int r0 = r0 / 2
            int r15 = r15 + r0
            float r11 = (float) r15
            int r15 = r14.getHeight()
            int r15 = r15 / 2
            int r0 = r14.g
            int r0 = r0 / 2
            int r15 = r15 + r0
            float r12 = (float) r15
            android.graphics.Paint r13 = r14.b
            r8.drawRect(r9, r10, r11, r12, r13)
        Lc8:
            r8.restore()
            return
    }

    public void setClipBorderWidth(int r2) {
            r1 = this;
            r1.d = r2
            android.graphics.Paint r0 = r1.b
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            r1.invalidate()
            return
    }

    public void setClipType(com.bxkj.student.common.crop.view.ClipView.ClipType r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setmHorizontalPadding(float r3) {
            r2 = this;
            r2.c = r3
            android.content.Context r0 = r2.getContext()
            int r0 = b(r0)
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r1
            float r0 = r0 - r3
            int r3 = (int) r0
            int r3 = r3 / 2
            r2.e = r3
            r3 = 1133740032(0x43938000, float:295.0)
            android.content.Context r0 = r2.getContext()
            int r3 = r2.a(r3, r0)
            r2.f = r3
            r3 = 1137606656(0x43ce8000, float:413.0)
            android.content.Context r0 = r2.getContext()
            int r3 = r2.a(r3, r0)
            r2.g = r3
            return
    }
}
