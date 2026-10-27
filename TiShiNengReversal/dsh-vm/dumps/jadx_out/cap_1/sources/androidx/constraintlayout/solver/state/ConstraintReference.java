package androidx.constraintlayout.solver.state;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintReference implements androidx.constraintlayout.solver.state.Reference {
    private java.lang.Object key;
    java.lang.Object mBaselineToBaseline;
    java.lang.Object mBottomToBottom;
    java.lang.Object mBottomToTop;
    private androidx.constraintlayout.solver.widgets.ConstraintWidget mConstraintWidget;
    java.lang.Object mEndToEnd;
    java.lang.Object mEndToStart;
    float mHorizontalBias;
    int mHorizontalChainStyle;
    androidx.constraintlayout.solver.state.Dimension mHorizontalDimension;
    androidx.constraintlayout.solver.state.State.Constraint mLast;
    java.lang.Object mLeftToLeft;
    java.lang.Object mLeftToRight;
    int mMarginBottom;
    int mMarginBottomGone;
    int mMarginEnd;
    int mMarginEndGone;
    int mMarginLeft;
    int mMarginLeftGone;
    int mMarginRight;
    int mMarginRightGone;
    int mMarginStart;
    int mMarginStartGone;
    int mMarginTop;
    int mMarginTopGone;
    java.lang.Object mRightToLeft;
    java.lang.Object mRightToRight;
    java.lang.Object mStartToEnd;
    java.lang.Object mStartToStart;
    final androidx.constraintlayout.solver.state.State mState;
    java.lang.Object mTopToBottom;
    java.lang.Object mTopToTop;
    float mVerticalBias;
    int mVerticalChainStyle;
    androidx.constraintlayout.solver.state.Dimension mVerticalDimension;
    private java.lang.Object mView;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.state.ConstraintReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint = null;

        static {
                androidx.constraintlayout.solver.state.State$Constraint[] r0 = androidx.constraintlayout.solver.state.State.Constraint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint = r0
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_RIGHT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_LEFT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_RIGHT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_START     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_END     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_START     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_END     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_TOP     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L84
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_TOP     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L90
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L9c
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.BASELINE_TO_BASELINE     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> La8
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.CENTER_HORIZONTALLY     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> Lb4
                androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.CENTER_VERTICALLY     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ConstraintReferenceFactory {
        androidx.constraintlayout.solver.state.ConstraintReference create(androidx.constraintlayout.solver.state.State r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class IncorrectConstraintException extends java.lang.Exception {
        private final java.util.ArrayList<java.lang.String> mErrors;
        final /* synthetic */ androidx.constraintlayout.solver.state.ConstraintReference this$0;

        public IncorrectConstraintException(androidx.constraintlayout.solver.state.ConstraintReference r1, java.util.ArrayList<java.lang.String> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mErrors = r2
                return
        }

        public java.util.ArrayList<java.lang.String> getErrors() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mErrors
                return r0
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "IncorrectConstraintException: "
                r0.append(r1)
                java.util.ArrayList<java.lang.String> r1 = r2.mErrors
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public ConstraintReference(androidx.constraintlayout.solver.state.State r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mHorizontalChainStyle = r0
            r2.mVerticalChainStyle = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.mHorizontalBias = r1
            r2.mVerticalBias = r1
            r2.mMarginLeft = r0
            r2.mMarginRight = r0
            r2.mMarginStart = r0
            r2.mMarginEnd = r0
            r2.mMarginTop = r0
            r2.mMarginBottom = r0
            r2.mMarginLeftGone = r0
            r2.mMarginRightGone = r0
            r2.mMarginStartGone = r0
            r2.mMarginEndGone = r0
            r2.mMarginTopGone = r0
            r2.mMarginBottomGone = r0
            r0 = 0
            r2.mLeftToLeft = r0
            r2.mLeftToRight = r0
            r2.mRightToLeft = r0
            r2.mRightToRight = r0
            r2.mStartToStart = r0
            r2.mStartToEnd = r0
            r2.mEndToStart = r0
            r2.mEndToEnd = r0
            r2.mTopToTop = r0
            r2.mTopToBottom = r0
            r2.mBottomToTop = r0
            r2.mBottomToBottom = r0
            r2.mBaselineToBaseline = r0
            r2.mLast = r0
            java.lang.Object r0 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            androidx.constraintlayout.solver.state.Dimension r1 = androidx.constraintlayout.solver.state.Dimension.Fixed(r0)
            r2.mHorizontalDimension = r1
            androidx.constraintlayout.solver.state.Dimension r0 = androidx.constraintlayout.solver.state.Dimension.Fixed(r0)
            r2.mVerticalDimension = r0
            r2.mState = r3
            return
    }

    private void applyConnection(androidx.constraintlayout.solver.widgets.ConstraintWidget r7, java.lang.Object r8, androidx.constraintlayout.solver.state.State.Constraint r9) {
            r6 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r6.getTarget(r8)
            if (r2 != 0) goto L7
            goto L19
        L7:
            int[] r8 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint
            int r0 = r9.ordinal()
            r0 = r8[r0]
            int r9 = r9.ordinal()
            r8 = r8[r9]
            r9 = 0
            switch(r8) {
                case 1: goto L101;
                case 2: goto Lec;
                case 3: goto Ld7;
                case 4: goto Lc4;
                case 5: goto Lb1;
                case 6: goto L9c;
                case 7: goto L87;
                case 8: goto L74;
                case 9: goto L61;
                case 10: goto L4c;
                case 11: goto L37;
                case 12: goto L24;
                case 13: goto L1a;
                default: goto L19;
            }
        L19:
            return
        L1a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            r4 = 0
            r5 = 0
            r3 = r1
            r0 = r7
            r0.immediateConnect(r1, r2, r3, r4, r5)
            return
        L24:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.getAnchor(r7)
            int r0 = r6.mMarginBottom
            int r1 = r6.mMarginBottomGone
            r8.connect(r7, r0, r1, r9)
            return
        L37:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginBottom
            int r1 = r6.mMarginBottomGone
            r7.connect(r8, r0, r1, r9)
            return
        L4c:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginTop
            int r1 = r6.mMarginTopGone
            r7.connect(r8, r0, r1, r9)
            return
        L61:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.getAnchor(r7)
            int r0 = r6.mMarginTop
            int r1 = r6.mMarginTopGone
            r8.connect(r7, r0, r1, r9)
            return
        L74:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.getAnchor(r7)
            int r0 = r6.mMarginEnd
            int r1 = r6.mMarginEndGone
            r8.connect(r7, r0, r1, r9)
            return
        L87:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginEnd
            int r1 = r6.mMarginEndGone
            r7.connect(r8, r0, r1, r9)
            return
        L9c:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginStart
            int r1 = r6.mMarginStartGone
            r7.connect(r8, r0, r1, r9)
            return
        Lb1:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.getAnchor(r7)
            int r0 = r6.mMarginStart
            int r1 = r6.mMarginStartGone
            r8.connect(r7, r0, r1, r9)
            return
        Lc4:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.getAnchor(r7)
            int r0 = r6.mMarginRight
            int r1 = r6.mMarginRightGone
            r8.connect(r7, r0, r1, r9)
            return
        Ld7:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginRight
            int r1 = r6.mMarginRightGone
            r7.connect(r8, r0, r1, r9)
            return
        Lec:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginLeft
            int r1 = r6.mMarginLeftGone
            r7.connect(r8, r0, r1, r9)
            return
        L101:
            r0 = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r0.getAnchor(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.getAnchor(r7)
            int r0 = r6.mMarginLeft
            int r1 = r6.mMarginLeftGone
            r8.connect(r7, r0, r1, r9)
            return
    }

    private void dereference() {
            r1 = this;
            java.lang.Object r0 = r1.mLeftToLeft
            java.lang.Object r0 = r1.get(r0)
            r1.mLeftToLeft = r0
            java.lang.Object r0 = r1.mLeftToRight
            java.lang.Object r0 = r1.get(r0)
            r1.mLeftToRight = r0
            java.lang.Object r0 = r1.mRightToLeft
            java.lang.Object r0 = r1.get(r0)
            r1.mRightToLeft = r0
            java.lang.Object r0 = r1.mRightToRight
            java.lang.Object r0 = r1.get(r0)
            r1.mRightToRight = r0
            java.lang.Object r0 = r1.mStartToStart
            java.lang.Object r0 = r1.get(r0)
            r1.mStartToStart = r0
            java.lang.Object r0 = r1.mStartToEnd
            java.lang.Object r0 = r1.get(r0)
            r1.mStartToEnd = r0
            java.lang.Object r0 = r1.mEndToStart
            java.lang.Object r0 = r1.get(r0)
            r1.mEndToStart = r0
            java.lang.Object r0 = r1.mEndToEnd
            java.lang.Object r0 = r1.get(r0)
            r1.mEndToEnd = r0
            java.lang.Object r0 = r1.mTopToTop
            java.lang.Object r0 = r1.get(r0)
            r1.mTopToTop = r0
            java.lang.Object r0 = r1.mTopToBottom
            java.lang.Object r0 = r1.get(r0)
            r1.mTopToBottom = r0
            java.lang.Object r0 = r1.mBottomToTop
            java.lang.Object r0 = r1.get(r0)
            r1.mBottomToTop = r0
            java.lang.Object r0 = r1.mBottomToBottom
            java.lang.Object r0 = r1.get(r0)
            r1.mBottomToBottom = r0
            java.lang.Object r0 = r1.mBaselineToBaseline
            java.lang.Object r0 = r1.get(r0)
            r1.mBaselineToBaseline = r0
            return
    }

    private java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.constraintlayout.solver.state.ConstraintReference
            if (r0 != 0) goto Le
            androidx.constraintlayout.solver.state.State r0 = r1.mState
            androidx.constraintlayout.solver.state.Reference r2 = r0.reference(r2)
        Le:
            return r2
    }

    private androidx.constraintlayout.solver.widgets.ConstraintWidget getTarget(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.constraintlayout.solver.state.Reference
            if (r0 == 0) goto Lb
            androidx.constraintlayout.solver.state.Reference r2 = (androidx.constraintlayout.solver.state.Reference) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.getConstraintWidget()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void apply() {
            r4 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            if (r0 != 0) goto L5
            return
        L5:
            androidx.constraintlayout.solver.state.Dimension r1 = r4.mHorizontalDimension
            androidx.constraintlayout.solver.state.State r2 = r4.mState
            r3 = 0
            r1.apply(r2, r0, r3)
            androidx.constraintlayout.solver.state.Dimension r0 = r4.mVerticalDimension
            androidx.constraintlayout.solver.state.State r1 = r4.mState
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r4.mConstraintWidget
            r3 = 1
            r0.apply(r1, r2, r3)
            r4.dereference()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mLeftToLeft
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_LEFT
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mLeftToRight
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_RIGHT
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mRightToLeft
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_LEFT
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mRightToRight
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_RIGHT
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mStartToStart
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_START
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mStartToEnd
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_END
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mEndToStart
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_START
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mEndToEnd
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_END
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mTopToTop
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_TOP
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mTopToBottom
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_BOTTOM
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mBottomToTop
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_TOP
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mBottomToBottom
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_BOTTOM
            r4.applyConnection(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            java.lang.Object r1 = r4.mBaselineToBaseline
            androidx.constraintlayout.solver.state.State$Constraint r2 = androidx.constraintlayout.solver.state.State.Constraint.BASELINE_TO_BASELINE
            r4.applyConnection(r0, r1, r2)
            int r0 = r4.mHorizontalChainStyle
            if (r0 == 0) goto L98
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r4.mConstraintWidget
            r1.setHorizontalChainStyle(r0)
        L98:
            int r0 = r4.mVerticalChainStyle
            if (r0 == 0) goto La1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r4.mConstraintWidget
            r1.setVerticalChainStyle(r0)
        La1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            float r1 = r4.mHorizontalBias
            r0.setHorizontalBiasPercent(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r4.mConstraintWidget
            float r1 = r4.mVerticalBias
            r0.setVerticalBiasPercent(r1)
            return
    }

    public androidx.constraintlayout.solver.state.ConstraintReference baseline() {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.BASELINE_TO_BASELINE
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference baselineToBaseline(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.BASELINE_TO_BASELINE
            r1.mLast = r0
            r1.mBaselineToBaseline = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference bias(float r3) {
            r2 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = r2.mLast
            if (r0 != 0) goto L5
            goto L10
        L5:
            int[] r1 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L14;
                case 2: goto L14;
                case 3: goto L14;
                case 4: goto L14;
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L14;
                case 9: goto L11;
                case 10: goto L11;
                case 11: goto L11;
                case 12: goto L11;
                case 13: goto L10;
                case 14: goto L14;
                case 15: goto L11;
                default: goto L10;
            }
        L10:
            return r2
        L11:
            r2.mVerticalBias = r3
            return r2
        L14:
            r2.mHorizontalBias = r3
            return r2
    }

    public androidx.constraintlayout.solver.state.ConstraintReference bottom() {
            r1 = this;
            java.lang.Object r0 = r1.mBottomToTop
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_TOP
            r1.mLast = r0
            return r1
        L9:
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_BOTTOM
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference bottomToBottom(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_BOTTOM
            r1.mLast = r0
            r1.mBottomToBottom = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference bottomToTop(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.BOTTOM_TO_TOP
            r1.mLast = r0
            r1.mBottomToTop = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference centerHorizontally(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            r0.mStartToStart = r1
            r0.mEndToEnd = r1
            androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.CENTER_HORIZONTALLY
            r0.mLast = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mHorizontalBias = r1
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference centerVertically(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            r0.mTopToTop = r1
            r0.mBottomToBottom = r1
            androidx.constraintlayout.solver.state.State$Constraint r1 = androidx.constraintlayout.solver.state.State.Constraint.CENTER_VERTICALLY
            r0.mLast = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mVerticalBias = r1
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference clear() {
            r4 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = r4.mLast
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4b
            int[] r3 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L42;
                case 2: goto L42;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L30;
                case 6: goto L30;
                case 7: goto L27;
                case 8: goto L27;
                case 9: goto L1e;
                case 10: goto L1e;
                case 11: goto L15;
                case 12: goto L15;
                case 13: goto L12;
                default: goto L11;
            }
        L11:
            return r4
        L12:
            r4.mBaselineToBaseline = r2
            return r4
        L15:
            r4.mBottomToTop = r2
            r4.mBottomToBottom = r2
            r4.mMarginBottom = r1
            r4.mMarginBottomGone = r1
            return r4
        L1e:
            r4.mTopToTop = r2
            r4.mTopToBottom = r2
            r4.mMarginTop = r1
            r4.mMarginTopGone = r1
            return r4
        L27:
            r4.mEndToStart = r2
            r4.mEndToEnd = r2
            r4.mMarginEnd = r1
            r4.mMarginEndGone = r1
            return r4
        L30:
            r4.mStartToStart = r2
            r4.mStartToEnd = r2
            r4.mMarginStart = r1
            r4.mMarginStartGone = r1
            return r4
        L39:
            r4.mRightToLeft = r2
            r4.mRightToRight = r2
            r4.mMarginRight = r1
            r4.mMarginRightGone = r1
            return r4
        L42:
            r4.mLeftToLeft = r2
            r4.mLeftToRight = r2
            r4.mMarginLeft = r1
            r4.mMarginLeftGone = r1
            return r4
        L4b:
            r4.mLeftToLeft = r2
            r4.mLeftToRight = r2
            r4.mMarginLeft = r1
            r4.mRightToLeft = r2
            r4.mRightToRight = r2
            r4.mMarginRight = r1
            r4.mStartToStart = r2
            r4.mStartToEnd = r2
            r4.mMarginStart = r1
            r4.mEndToStart = r2
            r4.mEndToEnd = r2
            r4.mMarginEnd = r1
            r4.mTopToTop = r2
            r4.mTopToBottom = r2
            r4.mMarginTop = r1
            r4.mBottomToTop = r2
            r4.mBottomToBottom = r2
            r4.mMarginBottom = r1
            r4.mBaselineToBaseline = r2
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.mHorizontalBias = r0
            r4.mVerticalBias = r0
            r4.mMarginLeftGone = r1
            r4.mMarginRightGone = r1
            r4.mMarginStartGone = r1
            r4.mMarginEndGone = r1
            r4.mMarginTopGone = r1
            r4.mMarginBottomGone = r1
            return r4
    }

    public androidx.constraintlayout.solver.state.ConstraintReference clearHorizontal() {
            r1 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.start()
            r0.clear()
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.end()
            r0.clear()
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.left()
            r0.clear()
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.right()
            r0.clear()
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference clearVertical() {
            r1 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.top()
            r0.clear()
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.baseline()
            r0.clear()
            androidx.constraintlayout.solver.state.ConstraintReference r0 = r1.bottom()
            r0.clear()
            return r1
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget createConstraintWidget() {
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = new androidx.constraintlayout.solver.widgets.ConstraintWidget
            androidx.constraintlayout.solver.state.Dimension r1 = r3.getWidth()
            int r1 = r1.getValue()
            androidx.constraintlayout.solver.state.Dimension r2 = r3.getHeight()
            int r2 = r2.getValue()
            r0.<init>(r1, r2)
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference end() {
            r1 = this;
            java.lang.Object r0 = r1.mEndToStart
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_START
            r1.mLast = r0
            return r1
        L9:
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_END
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference endToEnd(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_END
            r1.mLast = r0
            r1.mEndToEnd = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference endToStart(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.END_TO_START
            r1.mLast = r0
            r1.mEndToStart = r2
            return r1
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public androidx.constraintlayout.solver.widgets.ConstraintWidget getConstraintWidget() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mConstraintWidget
            if (r0 != 0) goto Lf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.createConstraintWidget()
            r2.mConstraintWidget = r0
            java.lang.Object r1 = r2.mView
            r0.setCompanionWidget(r1)
        Lf:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mConstraintWidget
            return r0
    }

    public androidx.constraintlayout.solver.state.Dimension getHeight() {
            r1 = this;
            androidx.constraintlayout.solver.state.Dimension r0 = r1.mVerticalDimension
            return r0
    }

    public int getHorizontalChainStyle() {
            r1 = this;
            int r0 = r1.mHorizontalChainStyle
            return r0
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.key
            return r0
    }

    public int getVerticalChainStyle(int r1) {
            r0 = this;
            int r1 = r0.mVerticalChainStyle
            return r1
    }

    public java.lang.Object getView() {
            r1 = this;
            java.lang.Object r0 = r1.mView
            return r0
    }

    public androidx.constraintlayout.solver.state.Dimension getWidth() {
            r1 = this;
            androidx.constraintlayout.solver.state.Dimension r0 = r1.mHorizontalDimension
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference height(androidx.constraintlayout.solver.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r1 = r0.setHeight(r1)
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference horizontalBias(float r1) {
            r0 = this;
            r0.mHorizontalBias = r1
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference left() {
            r1 = this;
            java.lang.Object r0 = r1.mLeftToLeft
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_LEFT
            r1.mLast = r0
            return r1
        L9:
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_RIGHT
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference leftToLeft(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_LEFT
            r1.mLast = r0
            r1.mLeftToLeft = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference leftToRight(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.LEFT_TO_RIGHT
            r1.mLast = r0
            r1.mLeftToRight = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference margin(int r3) {
            r2 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = r2.mLast
            if (r0 == 0) goto L22
            int[] r1 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L1f;
                case 2: goto L1f;
                case 3: goto L1c;
                case 4: goto L1c;
                case 5: goto L19;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L16;
                case 9: goto L13;
                case 10: goto L13;
                case 11: goto L10;
                case 12: goto L10;
                default: goto Lf;
            }
        Lf:
            return r2
        L10:
            r2.mMarginBottom = r3
            return r2
        L13:
            r2.mMarginTop = r3
            return r2
        L16:
            r2.mMarginEnd = r3
            return r2
        L19:
            r2.mMarginStart = r3
            return r2
        L1c:
            r2.mMarginRight = r3
            return r2
        L1f:
            r2.mMarginLeft = r3
            return r2
        L22:
            r2.mMarginLeft = r3
            r2.mMarginRight = r3
            r2.mMarginStart = r3
            r2.mMarginEnd = r3
            r2.mMarginTop = r3
            r2.mMarginBottom = r3
            return r2
    }

    public androidx.constraintlayout.solver.state.ConstraintReference margin(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            androidx.constraintlayout.solver.state.ConstraintReference r2 = r1.margin(r2)
            return r2
    }

    public androidx.constraintlayout.solver.state.ConstraintReference marginGone(int r3) {
            r2 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = r2.mLast
            if (r0 == 0) goto L22
            int[] r1 = androidx.constraintlayout.solver.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L1f;
                case 2: goto L1f;
                case 3: goto L1c;
                case 4: goto L1c;
                case 5: goto L19;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L16;
                case 9: goto L13;
                case 10: goto L13;
                case 11: goto L10;
                case 12: goto L10;
                default: goto Lf;
            }
        Lf:
            return r2
        L10:
            r2.mMarginBottomGone = r3
            return r2
        L13:
            r2.mMarginTopGone = r3
            return r2
        L16:
            r2.mMarginEndGone = r3
            return r2
        L19:
            r2.mMarginStartGone = r3
            return r2
        L1c:
            r2.mMarginRightGone = r3
            return r2
        L1f:
            r2.mMarginLeftGone = r3
            return r2
        L22:
            r2.mMarginLeftGone = r3
            r2.mMarginRightGone = r3
            r2.mMarginStartGone = r3
            r2.mMarginEndGone = r3
            r2.mMarginTopGone = r3
            r2.mMarginBottomGone = r3
            return r2
    }

    public androidx.constraintlayout.solver.state.ConstraintReference right() {
            r1 = this;
            java.lang.Object r0 = r1.mRightToLeft
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_LEFT
            r1.mLast = r0
            return r1
        L9:
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_RIGHT
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference rightToLeft(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_LEFT
            r1.mLast = r0
            r1.mRightToLeft = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference rightToRight(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.RIGHT_TO_RIGHT
            r1.mLast = r0
            r1.mRightToRight = r2
            return r1
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.solver.widgets.ConstraintWidget r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r1.mConstraintWidget = r2
            java.lang.Object r0 = r1.mView
            r2.setCompanionWidget(r0)
            return
    }

    public androidx.constraintlayout.solver.state.ConstraintReference setHeight(androidx.constraintlayout.solver.state.Dimension r1) {
            r0 = this;
            r0.mVerticalDimension = r1
            return r0
    }

    public void setHorizontalChainStyle(int r1) {
            r0 = this;
            r0.mHorizontalChainStyle = r1
            return
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setKey(java.lang.Object r1) {
            r0 = this;
            r0.key = r1
            return
    }

    public void setVerticalChainStyle(int r1) {
            r0 = this;
            r0.mVerticalChainStyle = r1
            return
    }

    public void setView(java.lang.Object r2) {
            r1 = this;
            r1.mView = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mConstraintWidget
            if (r0 == 0) goto L9
            r0.setCompanionWidget(r2)
        L9:
            return
    }

    public androidx.constraintlayout.solver.state.ConstraintReference setWidth(androidx.constraintlayout.solver.state.Dimension r1) {
            r0 = this;
            r0.mHorizontalDimension = r1
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference start() {
            r1 = this;
            java.lang.Object r0 = r1.mStartToStart
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_START
            r1.mLast = r0
            return r1
        L9:
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_END
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference startToEnd(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_END
            r1.mLast = r0
            r1.mStartToEnd = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference startToStart(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.START_TO_START
            r1.mLast = r0
            r1.mStartToStart = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference top() {
            r1 = this;
            java.lang.Object r0 = r1.mTopToTop
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_TOP
            r1.mLast = r0
            return r1
        L9:
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_BOTTOM
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference topToBottom(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_BOTTOM
            r1.mLast = r0
            r1.mTopToBottom = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference topToTop(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Constraint r0 = androidx.constraintlayout.solver.state.State.Constraint.TOP_TO_TOP
            r1.mLast = r0
            r1.mTopToTop = r2
            return r1
    }

    public void validate() throws androidx.constraintlayout.solver.state.ConstraintReference.IncorrectConstraintException {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r2.mLeftToLeft
            if (r1 == 0) goto L12
            java.lang.Object r1 = r2.mLeftToRight
            if (r1 == 0) goto L12
            java.lang.String r1 = "LeftToLeft and LeftToRight both defined"
            r0.add(r1)
        L12:
            java.lang.Object r1 = r2.mRightToLeft
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r2.mRightToRight
            if (r1 == 0) goto L1f
            java.lang.String r1 = "RightToLeft and RightToRight both defined"
            r0.add(r1)
        L1f:
            java.lang.Object r1 = r2.mStartToStart
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r2.mStartToEnd
            if (r1 == 0) goto L2c
            java.lang.String r1 = "StartToStart and StartToEnd both defined"
            r0.add(r1)
        L2c:
            java.lang.Object r1 = r2.mEndToStart
            if (r1 == 0) goto L39
            java.lang.Object r1 = r2.mEndToEnd
            if (r1 == 0) goto L39
            java.lang.String r1 = "EndToStart and EndToEnd both defined"
            r0.add(r1)
        L39:
            java.lang.Object r1 = r2.mLeftToLeft
            if (r1 != 0) goto L49
            java.lang.Object r1 = r2.mLeftToRight
            if (r1 != 0) goto L49
            java.lang.Object r1 = r2.mRightToLeft
            if (r1 != 0) goto L49
            java.lang.Object r1 = r2.mRightToRight
            if (r1 == 0) goto L5e
        L49:
            java.lang.Object r1 = r2.mStartToStart
            if (r1 != 0) goto L59
            java.lang.Object r1 = r2.mStartToEnd
            if (r1 != 0) goto L59
            java.lang.Object r1 = r2.mEndToStart
            if (r1 != 0) goto L59
            java.lang.Object r1 = r2.mEndToEnd
            if (r1 == 0) goto L5e
        L59:
            java.lang.String r1 = "Both left/right and start/end constraints defined"
            r0.add(r1)
        L5e:
            int r1 = r0.size()
            if (r1 > 0) goto L65
            return
        L65:
            androidx.constraintlayout.solver.state.ConstraintReference$IncorrectConstraintException r1 = new androidx.constraintlayout.solver.state.ConstraintReference$IncorrectConstraintException
            r1.<init>(r2, r0)
            throw r1
    }

    public androidx.constraintlayout.solver.state.ConstraintReference verticalBias(float r1) {
            r0 = this;
            r0.mVerticalBias = r1
            return r0
    }

    public androidx.constraintlayout.solver.state.ConstraintReference width(androidx.constraintlayout.solver.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.solver.state.ConstraintReference r1 = r0.setWidth(r1)
            return r1
    }
}
