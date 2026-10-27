package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintProperties {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;
    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams mParams;
    android.view.View mView;

    public ConstraintProperties(android.view.View r3) {
            r2 = this;
            r2.<init>()
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L12
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r2.mParams = r0
            r2.mView = r3
            return
        L12:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Only children of ConstraintLayout.LayoutParams supported"
            r3.<init>(r0)
            throw r3
    }

    private java.lang.String sideToString(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L18;
                case 2: goto L15;
                case 3: goto L12;
                case 4: goto Lf;
                case 5: goto Lc;
                case 6: goto L9;
                case 7: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = "undefined"
            return r1
        L6:
            java.lang.String r1 = "end"
            return r1
        L9:
            java.lang.String r1 = "start"
            return r1
        Lc:
            java.lang.String r1 = "baseline"
            return r1
        Lf:
            java.lang.String r1 = "bottom"
            return r1
        L12:
            java.lang.String r1 = "top"
            return r1
        L15:
            java.lang.String r1 = "right"
            return r1
        L18:
            java.lang.String r1 = "left"
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChain(int r5, int r6) {
            r4 = this;
            r0 = 2
            r1 = 1
            if (r5 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 2
        L7:
            r3 = 0
            r4.connect(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = 2
            goto L10
        Lf:
            r2 = 1
        L10:
            r4.connect(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.mView
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ConstraintProperties r2 = new androidx.constraintlayout.widget.ConstraintProperties
            r2.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r2.connect(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r6.connect(r1, r5, r0, r3)
        L4b:
            return r4
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChainRTL(int r5, int r6) {
            r4 = this;
            r0 = 7
            r1 = 6
            if (r5 != 0) goto L6
            r2 = 6
            goto L7
        L6:
            r2 = 7
        L7:
            r3 = 0
            r4.connect(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = 7
            goto L10
        Lf:
            r2 = 6
        L10:
            r4.connect(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.mView
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ConstraintProperties r2 = new androidx.constraintlayout.widget.ConstraintProperties
            r2.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r2.connect(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r6.connect(r1, r5, r0, r3)
        L4b:
            return r4
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToVerticalChain(int r5, int r6) {
            r4 = this;
            r0 = 4
            r1 = 3
            if (r5 != 0) goto L6
            r2 = 3
            goto L7
        L6:
            r2 = 4
        L7:
            r3 = 0
            r4.connect(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = 4
            goto L10
        Lf:
            r2 = 3
        L10:
            r4.connect(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.mView
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ConstraintProperties r2 = new androidx.constraintlayout.widget.ConstraintProperties
            r2.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r2.connect(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r6.connect(r1, r5, r0, r3)
        L4b:
            return r4
    }

    public androidx.constraintlayout.widget.ConstraintProperties alpha(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setAlpha(r2)
            return r1
    }

    public void apply() {
            r0 = this;
            return
    }

    public androidx.constraintlayout.widget.ConstraintProperties center(int r3, int r4, int r5, int r6, int r7, int r8, float r9) {
            r2 = this;
            java.lang.String r0 = "margin must be > 0"
            if (r5 < 0) goto L50
            if (r8 < 0) goto L4a
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L42
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L42
            r0 = 2
            r1 = 1
            if (r4 == r1) goto L37
            if (r4 != r0) goto L18
            goto L37
        L18:
            r0 = 7
            r1 = 6
            if (r4 == r1) goto L2c
            if (r4 != r0) goto L1f
            goto L2c
        L1f:
            r0 = 3
            r2.connect(r0, r3, r4, r5)
            r3 = 4
            r2.connect(r3, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.verticalBias = r9
            return r2
        L2c:
            r2.connect(r1, r3, r4, r5)
            r2.connect(r0, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.horizontalBias = r9
            return r2
        L37:
            r2.connect(r1, r3, r4, r5)
            r2.connect(r0, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.horizontalBias = r9
            return r2
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bias must be between 0 and 1 inclusive"
            r3.<init>(r4)
            throw r3
        L4a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
        L50:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int r17) {
            r16 = this;
            if (r17 != 0) goto L10
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 2
            r0 = r16
            r0.center(r1, r2, r3, r4, r5, r6, r7)
            return r16
        L10:
            r14 = 0
            r15 = 1056964608(0x3f000000, float:0.5)
            r10 = 2
            r11 = 0
            r13 = 1
            r12 = r17
            r8 = r16
            r9 = r17
            r8.center(r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 1
            r1.connect(r0, r2, r3, r4)
            r2 = 2
            r1.connect(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.horizontalBias = r8
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int r17) {
            r16 = this;
            if (r17 != 0) goto L10
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 6
            r3 = 0
            r4 = 0
            r5 = 7
            r0 = r16
            r0.center(r1, r2, r3, r4, r5, r6, r7)
            return r16
        L10:
            r14 = 0
            r15 = 1056964608(0x3f000000, float:0.5)
            r10 = 7
            r11 = 0
            r13 = 6
            r12 = r17
            r8 = r16
            r9 = r17
            r8.center(r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 6
            r1.connect(r0, r2, r3, r4)
            r2 = 7
            r1.connect(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.horizontalBias = r8
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int r17) {
            r16 = this;
            if (r17 != 0) goto L10
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 3
            r3 = 0
            r4 = 0
            r5 = 4
            r0 = r16
            r0.center(r1, r2, r3, r4, r5, r6, r7)
            return r16
        L10:
            r14 = 0
            r15 = 1056964608(0x3f000000, float:0.5)
            r10 = 4
            r11 = 0
            r13 = 3
            r12 = r17
            r8 = r16
            r9 = r17
            r8.center(r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 3
            r1.connect(r0, r2, r3, r4)
            r2 = 4
            r1.connect(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.verticalBias = r8
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties connect(int r10, int r11, int r12, int r13) {
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 4
            r4 = 6
            r5 = 7
            java.lang.String r6 = "right to "
            java.lang.String r7 = " undefined"
            r8 = -1
            switch(r10) {
                case 1: goto L165;
                case 2: goto L133;
                case 3: goto Lfd;
                case 4: goto Lc7;
                case 5: goto L9b;
                case 6: goto L68;
                case 7: goto L35;
                default: goto Le;
            }
        Le:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r10 = r9.sideToString(r10)
            r13.append(r10)
            java.lang.String r10 = " to "
            r13.append(r10)
            java.lang.String r10 = r9.sideToString(r12)
            r13.append(r10)
            java.lang.String r10 = " unknown"
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            r11.<init>(r10)
            throw r11
        L35:
            if (r12 != r5) goto L3e
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.endToEnd = r11
            r10.endToStart = r8
            goto L46
        L3e:
            if (r12 != r4) goto L4c
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.endToStart = r11
            r10.endToEnd = r8
        L46:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.setMarginEnd(r13)
            return r9
        L4c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L68:
            if (r12 != r4) goto L71
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.startToStart = r11
            r10.startToEnd = r8
            goto L79
        L71:
            if (r12 != r5) goto L7f
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.startToEnd = r11
            r10.startToStart = r8
        L79:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.setMarginStart(r13)
            return r9
        L7f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L9b:
            r10 = 5
            if (r12 != r10) goto Lab
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.baselineToBaseline = r11
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            return r9
        Lab:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lc7:
            if (r12 != r3) goto Ld2
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.bottomToBottom = r11
            r10.bottomToTop = r8
            r10.baselineToBaseline = r8
            goto Ldc
        Ld2:
            if (r12 != r2) goto Le1
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.bottomToTop = r11
            r10.bottomToBottom = r8
            r10.baselineToBaseline = r8
        Ldc:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.bottomMargin = r13
            return r9
        Le1:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lfd:
            if (r12 != r2) goto L108
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.topToTop = r11
            r10.topToBottom = r8
            r10.baselineToBaseline = r8
            goto L112
        L108:
            if (r12 != r3) goto L117
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.topToBottom = r11
            r10.topToTop = r8
            r10.baselineToBaseline = r8
        L112:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.topMargin = r13
            return r9
        L117:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L133:
            if (r12 != r1) goto L13c
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.rightToLeft = r11
            r10.rightToRight = r8
            goto L144
        L13c:
            if (r12 != r0) goto L149
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.rightToRight = r11
            r10.rightToLeft = r8
        L144:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.rightMargin = r13
            return r9
        L149:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L165:
            if (r12 != r1) goto L16e
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.leftToLeft = r11
            r10.leftToRight = r8
            goto L176
        L16e:
            if (r12 != r0) goto L17b
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.leftToRight = r11
            r10.leftToLeft = r8
        L176:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.leftMargin = r13
            return r9
        L17b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "Left to "
            r11.append(r13)
            java.lang.String r12 = r9.sideToString(r12)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintDefaultHeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintDefaultWidth = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.height = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMaxHeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMaxWidth = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMinHeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMinWidth = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.width = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties dimensionRatio(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.dimensionRatio = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties elevation(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setElevation(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties goneMargin(int r1, int r2) {
            r0 = this;
            switch(r1) {
                case 1: goto L2c;
                case 2: goto L27;
                case 3: goto L22;
                case 4: goto L1d;
                case 5: goto L15;
                case 6: goto L10;
                case 7: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lb:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneEndMargin = r2
            return r0
        L10:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneStartMargin = r2
            return r0
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L1d:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneBottomMargin = r2
            return r0
        L22:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneTopMargin = r2
            return r0
        L27:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneRightMargin = r2
            return r0
        L2c:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneLeftMargin = r2
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.horizontalBias = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalChainStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.horizontalChainStyle = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalWeight(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.horizontalWeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties margin(int r1, int r2) {
            r0 = this;
            switch(r1) {
                case 1: goto L2e;
                case 2: goto L29;
                case 3: goto L24;
                case 4: goto L1f;
                case 5: goto L17;
                case 6: goto L11;
                case 7: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lb:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.setMarginEnd(r2)
            return r0
        L11:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.setMarginStart(r2)
            return r0
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L1f:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.bottomMargin = r2
            return r0
        L24:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.topMargin = r2
            return r0
        L29:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.rightMargin = r2
            return r0
        L2e:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.leftMargin = r2
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeConstraints(int r2) {
            r1 = this;
            r0 = -1
            switch(r2) {
                case 1: goto L4e;
                case 2: goto L43;
                case 3: goto L38;
                case 4: goto L2d;
                case 5: goto L28;
                case 6: goto L1a;
                case 7: goto Lc;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown constraint"
            r2.<init>(r0)
            throw r2
        Lc:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.endToStart = r0
            r2.endToEnd = r0
            r2.setMarginEnd(r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.goneEndMargin = r0
            return r1
        L1a:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.startToEnd = r0
            r2.startToStart = r0
            r2.setMarginStart(r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.goneStartMargin = r0
            return r1
        L28:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.baselineToBaseline = r0
            return r1
        L2d:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.bottomToTop = r0
            r2.bottomToBottom = r0
            r2.bottomMargin = r0
            r2.goneBottomMargin = r0
            return r1
        L38:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.topToBottom = r0
            r2.topToTop = r0
            r2.topMargin = r0
            r2.goneTopMargin = r0
            return r1
        L43:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.rightToRight = r0
            r2.rightToLeft = r0
            r2.rightMargin = r0
            r2.goneRightMargin = r0
            return r1
        L4e:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.leftToRight = r0
            r2.leftToLeft = r0
            r2.leftMargin = r0
            r2.goneLeftMargin = r0
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromHorizontalChain() {
            r10 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r10.mParams
            int r1 = r0.leftToRight
            int r2 = r0.rightToLeft
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L60
            if (r2 == r4) goto Ld
            goto L60
        Ld:
            int r2 = r0.startToEnd
            int r0 = r0.endToStart
            r5 = 6
            r6 = 7
            if (r2 != r4) goto L17
            if (r0 == r4) goto L59
        L17:
            android.view.View r7 = r10.mView
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.findViewById(r2)
            androidx.constraintlayout.widget.ConstraintProperties r8 = new androidx.constraintlayout.widget.ConstraintProperties
            r8.<init>(r7)
            android.view.View r7 = r10.mView
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintProperties r9 = new androidx.constraintlayout.widget.ConstraintProperties
            r9.<init>(r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = r10.mParams
            if (r2 == r4) goto L46
            if (r0 == r4) goto L46
            r8.connect(r6, r0, r5, r3)
            r9.connect(r5, r1, r6, r3)
            goto L59
        L46:
            if (r1 != r4) goto L4a
            if (r0 == r4) goto L59
        L4a:
            int r0 = r7.rightToRight
            if (r0 == r4) goto L52
            r8.connect(r6, r0, r6, r3)
            goto L59
        L52:
            int r0 = r7.leftToLeft
            if (r0 == r4) goto L59
            r9.connect(r5, r0, r5, r3)
        L59:
            r10.removeConstraints(r5)
            r10.removeConstraints(r6)
            return r10
        L60:
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.findViewById(r1)
            androidx.constraintlayout.widget.ConstraintProperties r5 = new androidx.constraintlayout.widget.ConstraintProperties
            r5.<init>(r0)
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.findViewById(r2)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r10.mParams
            r7 = 1
            r8 = 2
            if (r1 == r4) goto L91
            if (r2 == r4) goto L91
            r5.connect(r8, r2, r7, r3)
            r6.connect(r7, r1, r8, r3)
            goto La4
        L91:
            if (r1 != r4) goto L95
            if (r2 == r4) goto La4
        L95:
            int r1 = r0.rightToRight
            if (r1 == r4) goto L9d
            r5.connect(r8, r1, r8, r3)
            goto La4
        L9d:
            int r0 = r0.leftToLeft
            if (r0 == r4) goto La4
            r6.connect(r7, r0, r7, r3)
        La4:
            r10.removeConstraints(r7)
            r10.removeConstraints(r8)
            return r10
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromVerticalChain() {
            r9 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r9.mParams
            int r1 = r0.topToBottom
            int r0 = r0.bottomToTop
            r2 = 3
            r3 = 4
            r4 = -1
            if (r1 != r4) goto Ld
            if (r0 == r4) goto L50
        Ld:
            android.view.View r5 = r9.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r1)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r9.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintProperties r7 = new androidx.constraintlayout.widget.ConstraintProperties
            r7.<init>(r5)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = r9.mParams
            r8 = 0
            if (r1 == r4) goto L3d
            if (r0 == r4) goto L3d
            r6.connect(r3, r0, r2, r8)
            r7.connect(r2, r1, r3, r8)
            goto L50
        L3d:
            if (r1 != r4) goto L41
            if (r0 == r4) goto L50
        L41:
            int r0 = r5.bottomToBottom
            if (r0 == r4) goto L49
            r6.connect(r3, r0, r3, r8)
            goto L50
        L49:
            int r0 = r5.topToTop
            if (r0 == r4) goto L50
            r7.connect(r2, r0, r2, r8)
        L50:
            r9.removeConstraints(r2)
            r9.removeConstraints(r3)
            return r9
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotation(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setRotation(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setRotationX(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationY(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setRotationY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setScaleY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleY(float r1) {
            r0 = this;
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivot(float r2, float r3) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setPivotX(r2)
            android.view.View r2 = r1.mView
            r2.setPivotY(r3)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setPivotX(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotY(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setPivotY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translation(float r2, float r3) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationX(r2)
            android.view.View r2 = r1.mView
            r2.setTranslationY(r3)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationX(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationY(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationZ(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationZ(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.verticalBias = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalChainStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.verticalChainStyle = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalWeight(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.verticalWeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties visibility(int r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setVisibility(r2)
            return r1
    }
}
