package cn.bluemobi.dylan.base.adapter.common.recyclerview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f61g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final int f62h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f63i = 1;

    /* renamed from: e, reason: collision with root package name */
    private android.graphics.drawable.Drawable f64e;

    /* renamed from: f, reason: collision with root package name */
    private int f65f;

    static {
            r0 = 16843284(0x1010214, float:2.369505E-38)
            int[] r0 = new int[]{r0}
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration.f61g = r0
            return
    }

    public DividerItemDecoration(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>()
            int[] r0 = cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration.f61g
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r1.f64e = r0
            r2.recycle()
            r1.setOrientation(r3)
            return
    }

    public void drawHorizontal(android.graphics.Canvas r8, androidx.recyclerview.widget.RecyclerView r9) {
            r7 = this;
            int r0 = r9.getPaddingTop()
            int r1 = r9.getHeight()
            int r2 = r9.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r9.getChildCount()
            r3 = 0
        L12:
            if (r3 >= r2) goto L39
            android.view.View r4 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r5 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r5
            int r4 = r4.getRight()
            int r5 = r5.rightMargin
            int r4 = r4 + r5
            android.graphics.drawable.Drawable r5 = r7.f64e
            int r5 = r5.getIntrinsicHeight()
            int r5 = r5 + r4
            android.graphics.drawable.Drawable r6 = r7.f64e
            r6.setBounds(r4, r0, r5, r1)
            android.graphics.drawable.Drawable r4 = r7.f64e
            r4.draw(r8)
            int r3 = r3 + 1
            goto L12
        L39:
            return
    }

    public void drawVertical(android.graphics.Canvas r8, androidx.recyclerview.widget.RecyclerView r9) {
            r7 = this;
            int r0 = r9.getPaddingLeft()
            int r1 = r9.getWidth()
            int r2 = r9.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r9.getChildCount()
            r3 = 0
        L12:
            if (r3 >= r2) goto L42
            android.view.View r4 = r9.getChildAt(r3)
            androidx.recyclerview.widget.RecyclerView r5 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r6 = r9.getContext()
            r5.<init>(r6)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r5 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r5
            int r4 = r4.getBottom()
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            android.graphics.drawable.Drawable r5 = r7.f64e
            int r5 = r5.getIntrinsicHeight()
            int r5 = r5 + r4
            android.graphics.drawable.Drawable r6 = r7.f64e
            r6.setBounds(r0, r4, r1, r5)
            android.graphics.drawable.Drawable r4 = r7.f64e
            r4.draw(r8)
            int r3 = r3 + 1
            goto L12
        L42:
            return
    }

    public void getItemOffsets(android.graphics.Rect r2, int r3, androidx.recyclerview.widget.RecyclerView r4) {
            r1 = this;
            int r3 = r1.f65f
            r4 = 1
            r0 = 0
            if (r3 != r4) goto L10
            android.graphics.drawable.Drawable r3 = r1.f64e
            int r3 = r3.getIntrinsicHeight()
            r2.set(r0, r0, r0, r3)
            return
        L10:
            android.graphics.drawable.Drawable r3 = r1.f64e
            int r3 = r3.getIntrinsicWidth()
            r2.set(r0, r0, r3, r0)
            return
    }

    public void onDraw(android.graphics.Canvas r3, androidx.recyclerview.widget.RecyclerView r4) {
            r2 = this;
            int r0 = r2.f65f
            r1 = 1
            if (r0 != r1) goto L9
            r2.drawVertical(r3, r4)
            return
        L9:
            r2.drawHorizontal(r3, r4)
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            if (r2 == 0) goto Le
            r0 = 1
            if (r2 != r0) goto L6
            goto Le
        L6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid orientation"
            r2.<init>(r0)
            throw r2
        Le:
            r1.f65f = r2
            return
    }
}
