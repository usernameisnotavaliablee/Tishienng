package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NumberButton extends android.widget.LinearLayout implements android.view.View.OnClickListener, android.text.TextWatcher {
    private int mBuyMax;
    private android.widget.EditText mCount;
    private int mInventory;
    private com.bxkj.student.common.view.NumberButton.OnWarnListener mOnWarnListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnWarnListener {
        void onNumberChanged(int r1);

        void onWarningForBuyMax(int r1);

        void onWarningForInventory(int r1);
    }

    public NumberButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NumberButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.mInventory = r0
            r1.mBuyMax = r0
            r1.init(r2, r3)
            return
    }

    private void init(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r9)
            r1 = 2131493625(0x7f0c02f9, float:1.8610735E38)
            r0.inflate(r1, r8)
            r0 = 2131296672(0x7f0901a0, float:1.8211267E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setOnClickListener(r8)
            r1 = 2131296674(0x7f0901a2, float:1.8211271E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setOnClickListener(r8)
            r2 = 2131298668(0x7f09096c, float:1.8215316E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r8.mCount = r2
            r2.setOnClickListener(r8)
            int[] r2 = com.bxkj.student.R.styleable.NumberButton
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r2)
            r10 = 1
            boolean r10 = r9.getBoolean(r10, r10)
            r2 = 0
            r3 = -1
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r4 = 4
            int r4 = r9.getDimensionPixelSize(r4, r3)
            r5 = 3
            int r5 = r9.getDimensionPixelSize(r5, r3)
            r6 = 2
            r7 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            int r6 = r9.getColor(r6, r7)
            r9.recycle()
            r8.setEditable(r10)
            android.widget.EditText r9 = r8.mCount
            r9.setTextColor(r6)
            r1.setTextColor(r6)
            r0.setTextColor(r6)
            if (r5 <= 0) goto L6c
            android.widget.EditText r9 = r8.mCount
            float r10 = (float) r5
            r9.setTextSize(r10)
        L6c:
            if (r2 <= 0) goto L79
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r2, r3)
            r1.setLayoutParams(r9)
            r0.setLayoutParams(r9)
        L79:
            if (r4 <= 0) goto L85
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r4, r3)
            android.widget.EditText r10 = r8.mCount
            r10.setLayoutParams(r9)
        L85:
            return
    }

    private void onNumberChanged() {
            r2 = this;
            com.bxkj.student.common.view.NumberButton$OnWarnListener r0 = r2.mOnWarnListener
            if (r0 == 0) goto Lb
            int r1 = r2.getNumber()
            r0.onNumberChanged(r1)
        Lb:
            return
    }

    private void onNumberInput() {
            r3 = this;
            int r0 = r3.getNumber()
            if (r0 > 0) goto Le
            android.widget.EditText r0 = r3.mCount
            java.lang.String r1 = "1"
            r0.setText(r1)
            return
        Le:
            int r1 = r3.mBuyMax
            int r2 = r3.mInventory
            int r1 = java.lang.Math.min(r1, r2)
            if (r0 <= r1) goto L3b
            android.widget.EditText r0 = r3.mCount
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
            int r0 = r3.mInventory
            int r1 = r3.mBuyMax
            if (r0 >= r1) goto L38
            r3.warningForInventory()
            return
        L38:
            r3.warningForBuyMax()
        L3b:
            return
    }

    private void setEditable(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L13
            android.widget.EditText r2 = r1.mCount
            r0 = 1
            r2.setFocusable(r0)
            android.widget.EditText r2 = r1.mCount
            android.text.method.DigitsKeyListener r0 = new android.text.method.DigitsKeyListener
            r0.<init>()
            r2.setKeyListener(r0)
            return
        L13:
            android.widget.EditText r2 = r1.mCount
            r0 = 0
            r2.setFocusable(r0)
            android.widget.EditText r2 = r1.mCount
            r0 = 0
            r2.setKeyListener(r0)
            return
    }

    private void warningForBuyMax() {
            r2 = this;
            com.bxkj.student.common.view.NumberButton$OnWarnListener r0 = r2.mOnWarnListener
            if (r0 == 0) goto L9
            int r1 = r2.mBuyMax
            r0.onWarningForBuyMax(r1)
        L9:
            return
    }

    private void warningForInventory() {
            r2 = this;
            com.bxkj.student.common.view.NumberButton$OnWarnListener r0 = r2.mOnWarnListener
            if (r0 == 0) goto L9
            int r1 = r2.mInventory
            r0.onWarningForInventory(r1)
        L9:
            return
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public int getBuyMax() {
            r1 = this;
            int r0 = r1.mBuyMax
            return r0
    }

    public int getInventory() {
            r1 = this;
            int r0 = r1.mInventory
            return r0
    }

    public int getNumber() {
            r2 = this;
            android.widget.EditText r0 = r2.mCount     // Catch: java.lang.NumberFormatException -> Lf
            android.text.Editable r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lf
            return r0
        Lf:
            android.widget.EditText r0 = r2.mCount
            java.lang.String r1 = "1"
            r0.setText(r1)
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            int r0 = r4.getNumber()
            r1 = 2131296674(0x7f0901a2, float:1.8211271E38)
            java.lang.String r2 = ""
            r3 = 1
            if (r5 != r1) goto L2b
            if (r0 <= r3) goto L77
            android.widget.EditText r5 = r4.mCount
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            int r0 = r0 - r3
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.setText(r0)
            r4.onNumberChanged()
            return
        L2b:
            r1 = 2131296672(0x7f0901a0, float:1.8211267E38)
            if (r5 != r1) goto L61
            int r5 = r4.mBuyMax
            int r1 = r4.mInventory
            int r5 = java.lang.Math.min(r5, r1)
            if (r0 >= r5) goto L53
            android.widget.EditText r5 = r4.mCount
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            int r0 = r0 + r3
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.setText(r0)
            r4.onNumberChanged()
            return
        L53:
            int r5 = r4.mInventory
            int r0 = r4.mBuyMax
            if (r5 >= r0) goto L5d
            r4.warningForInventory()
            return
        L5d:
            r4.warningForBuyMax()
            return
        L61:
            r0 = 2131298668(0x7f09096c, float:1.8215316E38)
            if (r5 != r0) goto L77
            android.widget.EditText r5 = r4.mCount
            android.text.Editable r0 = r5.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r5.setSelection(r0)
        L77:
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            r0.onNumberInput()
            return
    }

    public com.bxkj.student.common.view.NumberButton setBuyMax(int r1) {
            r0 = this;
            r0.mBuyMax = r1
            return r0
    }

    public com.bxkj.student.common.view.NumberButton setCurrentNumber(int r5) {
            r4 = this;
            r0 = 1
            if (r5 >= r0) goto La
            android.widget.EditText r0 = r4.mCount
            java.lang.String r1 = "1"
            r0.setText(r1)
        La:
            android.widget.EditText r0 = r4.mCount
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            int r2 = r4.mBuyMax
            int r3 = r4.mInventory
            int r2 = java.lang.Math.min(r2, r3)
            int r5 = java.lang.Math.min(r2, r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.setText(r5)
            return r4
    }

    public com.bxkj.student.common.view.NumberButton setInventory(int r1) {
            r0 = this;
            r0.mInventory = r1
            return r0
    }

    public com.bxkj.student.common.view.NumberButton setOnWarnListener(com.bxkj.student.common.view.NumberButton.OnWarnListener r1) {
            r0 = this;
            r0.mOnWarnListener = r1
            return r0
    }
}
