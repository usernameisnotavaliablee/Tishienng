package com.baidu.idl.face.platform.ui.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AlignTextView extends android.widget.TextView {
    private int mLineY;
    private int mViewWidth;

    public AlignTextView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AlignTextView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void drawScaledText(android.graphics.Canvas r8, java.lang.String r9, float r10) {
            r7 = this;
            boolean r0 = r7.isFirstLineOfParagraph(r9)
            r1 = 0
            if (r0 == 0) goto L21
            int r0 = r7.mLineY
            float r0 = (float) r0
            android.text.TextPaint r2 = r7.getPaint()
            java.lang.String r3 = "  "
            r8.drawText(r3, r1, r0, r2)
            android.text.TextPaint r0 = r7.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r3, r0)
            float r1 = r1 + r0
            r0 = 3
            java.lang.String r9 = r9.substring(r0)
        L21:
            int r0 = r9.length()
            r2 = 1
            int r0 = r0 - r2
            int r3 = r9.length()
            r4 = 2
            r5 = 0
            if (r3 <= r4) goto L55
            char r3 = r9.charAt(r5)
            r6 = 12288(0x3000, float:1.7219E-41)
            if (r3 != r6) goto L55
            char r2 = r9.charAt(r2)
            if (r2 != r6) goto L55
            java.lang.String r2 = r9.substring(r5, r4)
            android.text.TextPaint r3 = r7.getPaint()
            float r3 = android.text.Layout.getDesiredWidth(r2, r3)
            int r5 = r7.mLineY
            float r5 = (float) r5
            android.text.TextPaint r6 = r7.getPaint()
            r8.drawText(r2, r1, r5, r6)
            float r1 = r1 + r3
            goto L56
        L55:
            r4 = 0
        L56:
            int r2 = r7.mViewWidth
            float r2 = (float) r2
            float r2 = r2 - r10
            float r10 = (float) r0
            float r2 = r2 / r10
        L5c:
            int r10 = r9.length()
            if (r4 >= r10) goto L81
            char r10 = r9.charAt(r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            android.text.TextPaint r0 = r7.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r10, r0)
            int r3 = r7.mLineY
            float r3 = (float) r3
            android.text.TextPaint r5 = r7.getPaint()
            r8.drawText(r10, r1, r3, r5)
            float r0 = r0 + r2
            float r1 = r1 + r0
            int r4 = r4 + 1
            goto L5c
        L81:
            return
    }

    private boolean isFirstLineOfParagraph(java.lang.String r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 3
            r2 = 0
            if (r0 <= r1) goto L18
            char r0 = r4.charAt(r2)
            r1 = 32
            if (r0 != r1) goto L18
            r0 = 1
            char r4 = r4.charAt(r0)
            if (r4 != r1) goto L18
            return r0
        L18:
            return r2
    }

    private boolean needScale(java.lang.String r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.length()
            r2 = 1
            int r0 = r0 - r2
            char r4 = r4.charAt(r0)
            r0 = 10
            if (r4 == r0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            android.text.TextPaint r0 = r9.getPaint()
            int r1 = r9.getCurrentTextColor()
            r0.setColor(r1)
            int[] r1 = r9.getDrawableState()
            r0.drawableState = r1
            int r1 = r9.getMeasuredWidth()
            r9.mViewWidth = r1
            java.lang.CharSequence r1 = r9.getText()
            java.lang.String r1 = r1.toString()
            r2 = 0
            r9.mLineY = r2
            float r3 = (float) r2
            float r4 = r9.getTextSize()
            float r3 = r3 + r4
            int r3 = (int) r3
            r9.mLineY = r3
            android.text.Layout r3 = r9.getLayout()
            if (r3 != 0) goto L35
            goto L9c
        L35:
            android.graphics.Paint$FontMetrics r4 = r0.getFontMetrics()
            float r5 = r4.descent
            float r4 = r4.ascent
            float r5 = r5 - r4
            double r4 = (double) r5
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            float r4 = (float) r4
            float r5 = r3.getSpacingMultiplier()
            float r4 = r4 * r5
            float r5 = r3.getSpacingAdd()
            float r4 = r4 + r5
            int r4 = (int) r4
        L51:
            int r5 = r3.getLineCount()
            if (r2 >= r5) goto L9c
            int r5 = r3.getLineStart(r2)
            int r6 = r3.getLineEnd(r2)
            android.text.TextPaint r7 = r9.getPaint()
            float r7 = android.text.Layout.getDesiredWidth(r1, r5, r6, r7)
            java.lang.String r5 = r1.substring(r5, r6)
            java.lang.String r6 = ""
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L74
            goto L9c
        L74:
            int r6 = r3.getLineCount()
            int r6 = r6 + (-1)
            r8 = 0
            if (r2 >= r6) goto L8e
            boolean r6 = r9.needScale(r5)
            if (r6 == 0) goto L87
            r9.drawScaledText(r10, r5, r7)
            goto L94
        L87:
            int r6 = r9.mLineY
            float r6 = (float) r6
            r10.drawText(r5, r8, r6, r0)
            goto L94
        L8e:
            int r6 = r9.mLineY
            float r6 = (float) r6
            r10.drawText(r5, r8, r6, r0)
        L94:
            int r5 = r9.mLineY
            int r5 = r5 + r4
            r9.mLineY = r5
            int r2 = r2 + 1
            goto L51
        L9c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            return
    }
}
