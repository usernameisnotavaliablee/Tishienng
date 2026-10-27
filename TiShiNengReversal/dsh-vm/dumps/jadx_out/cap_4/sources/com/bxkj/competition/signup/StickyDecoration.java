package com.bxkj.competition.signup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class StickyDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private android.text.TextPaint e;
    private android.graphics.Paint f;
    private int g;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> h;
    private android.content.Context i;
    private final android.content.res.Resources j;

    public StickyDecoration(android.content.Context r3, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4) {
            r2 = this;
            r2.<init>()
            r2.h = r4
            r2.i = r3
            android.content.res.Resources r4 = r3.getResources()
            r2.j = r4
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.f = r0
            int r1 = com.bxkj.competition.R.color.group_bg
            int r4 = r4.getColor(r1)
            r0.setColor(r4)
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            r2.e = r4
            r0 = 1
            r4.setAntiAlias(r0)
            android.text.TextPaint r4 = r2.e
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = r0 * r1
            r4.setTextSize(r0)
            android.text.TextPaint r4 = r2.e
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setColor(r0)
            r4 = 1112014848(0x42480000, float:50.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r4, r3)
            r2.g = r3
            return
    }

    private boolean a(int r5) {
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            if (r5 <= 0) goto L31
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.h
            int r1 = r1.size()
            if (r5 >= r1) goto L31
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.h
            java.lang.Object r1 = r1.get(r5)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "groupName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.h
            int r5 = r5 - r0
            java.lang.Object r5 = r3.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L31
            r5 = 0
            return r5
        L31:
            return r0
    }

    public void getItemOffsets(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r0 = this;
            super.getItemOffsets(r1, r2, r3, r4)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r0.h
            if (r4 == 0) goto L20
            int r4 = r4.size()
            if (r4 != 0) goto Le
            goto L20
        Le:
            int r2 = r3.getChildAdapterPosition(r2)
            boolean r2 = r0.a(r2)
            if (r2 == 0) goto L1d
            int r2 = r0.g
            r1.top = r2
            return
        L1d:
            r2 = 0
            r1.top = r2
        L20:
            return
    }

    public void onDraw(android.graphics.Canvas r15, androidx.recyclerview.widget.RecyclerView r16, androidx.recyclerview.widget.RecyclerView.State r17) {
            r14 = this;
            r6 = r16
            super.onDraw(r15, r16, r17)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r14.h
            if (r0 == 0) goto Lbb
            int r0 = r0.size()
            if (r0 != 0) goto L11
            goto Lbb
        L11:
            int r7 = r6.getPaddingLeft()
            int r0 = r6.getWidth()
            int r1 = r6.getPaddingRight()
            int r8 = r0 - r1
            int r9 = r6.getChildCount()
            r0 = 0
            r10 = 0
        L25:
            if (r10 >= r9) goto Lbb
            android.view.View r0 = r6.getChildAt(r10)
            int r1 = r6.getChildAdapterPosition(r0)
            boolean r2 = r14.a(r1)
            if (r2 == 0) goto Lb6
            if (r1 <= 0) goto L4f
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r14.h
            int r2 = r2.size()
            if (r1 >= r2) goto L4f
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r14.h
            java.lang.Object r1 = r2.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "groupName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
        L4d:
            r11 = r1
            goto L52
        L4f:
            java.lang.String r1 = ""
            goto L4d
        L52:
            int r1 = r0.getTop()
            int r2 = r14.g
            int r12 = r1 - r2
            int r13 = r0.getTop()
            android.graphics.Paint r0 = r14.f
            android.content.Context r1 = r14.i
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.bxkj.competition.R.color.colorAccent
            int r1 = r1.getColor(r2)
            r0.setColor(r1)
            float r1 = (float) r7
            float r2 = (float) r12
            float r3 = (float) r8
            float r4 = (float) r13
            android.graphics.Paint r5 = r14.f
            r0 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
            android.graphics.Paint r1 = r14.f
            android.content.res.Resources r2 = r14.j
            int r3 = com.bxkj.competition.R.color.group_bg
            int r2 = r2.getColor(r3)
            r1.setColor(r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r2 = 1084227584(0x40a00000, float:5.0)
            android.content.Context r3 = r14.i
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            int r2 = r2 + r7
            r1.<init>(r2, r12, r8, r13)
            android.graphics.Paint r2 = r14.f
            r15.drawRect(r1, r2)
            android.text.TextPaint r2 = r14.e
            android.graphics.Paint$FontMetricsInt r2 = r2.getFontMetricsInt()
            int r3 = r1.bottom
            int r1 = r1.top
            int r3 = r3 + r1
            int r1 = r2.bottom
            int r3 = r3 - r1
            int r1 = r2.top
            int r3 = r3 - r1
            int r3 = r3 / 2
            int r1 = r7 + 30
            float r1 = (float) r1
            float r2 = (float) r3
            android.text.TextPaint r3 = r14.e
            r15.drawText(r11, r1, r2, r3)
            goto Lb7
        Lb6:
            r0 = r15
        Lb7:
            int r10 = r10 + 1
            goto L25
        Lbb:
            return
    }

    public void onDrawOver(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11, androidx.recyclerview.widget.RecyclerView.State r12) {
            r9 = this;
            super.onDrawOver(r10, r11, r12)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r12 = r9.h
            if (r12 == 0) goto L8f
            int r12 = r12.size()
            if (r12 != 0) goto Lf
            goto L8f
        Lf:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r12 = r11.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r12 = (androidx.recyclerview.widget.LinearLayoutManager) r12
            int r12 = r12.findFirstVisibleItemPosition()
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getWidth()
            int r11 = r11.getPaddingRight()
            int r1 = r1 - r11
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r11 = r9.h
            java.lang.Object r11 = r11.get(r12)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r12 = "groupName"
            java.lang.String r11 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r12)
            android.graphics.Paint r12 = r9.f
            android.content.Context r2 = r9.i
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.bxkj.competition.R.color.colorAccent
            int r2 = r2.getColor(r3)
            r12.setColor(r2)
            float r4 = (float) r0
            float r6 = (float) r1
            int r12 = r9.g
            float r7 = (float) r12
            android.graphics.Paint r8 = r9.f
            r5 = 0
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
            android.graphics.Paint r10 = r9.f
            android.content.res.Resources r12 = r9.j
            int r2 = com.bxkj.competition.R.color.group_bg
            int r12 = r12.getColor(r2)
            r10.setColor(r12)
            android.graphics.Rect r10 = new android.graphics.Rect
            r12 = 1084227584(0x40a00000, float:5.0)
            android.content.Context r2 = r9.i
            int r12 = cn.bluemobi.dylan.base.utils.u.a(r12, r2)
            int r0 = r0 + r12
            r12 = 0
            int r2 = r9.g
            r10.<init>(r0, r12, r1, r2)
            android.graphics.Paint r12 = r9.f
            r3.drawRect(r10, r12)
            android.text.TextPaint r12 = r9.e
            android.graphics.Paint$FontMetricsInt r12 = r12.getFontMetricsInt()
            int r0 = r10.bottom
            int r10 = r10.top
            int r0 = r0 + r10
            int r10 = r12.bottom
            int r0 = r0 - r10
            int r10 = r12.top
            int r0 = r0 - r10
            int r0 = r0 / 2
            float r10 = (float) r0
            android.text.TextPaint r12 = r9.e
            r0 = 1106247680(0x41f00000, float:30.0)
            r3.drawText(r11, r0, r10, r12)
        L8f:
            return
    }
}
