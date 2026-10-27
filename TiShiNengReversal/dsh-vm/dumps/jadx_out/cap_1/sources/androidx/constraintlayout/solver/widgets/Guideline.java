package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Guideline extends androidx.constraintlayout.solver.widgets.ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNWON = -1;
    public static final int VERTICAL = 1;
    private androidx.constraintlayout.solver.widgets.ConstraintAnchor mAnchor;
    private int mMinimumPosition;
    private int mOrientation;
    protected int mRelativeBegin;
    protected int mRelativeEnd;
    protected float mRelativePercent;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.widgets.Guideline$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = null;

        static {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }
    }

    public Guideline() {
            r4 = this;
            r4.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mRelativePercent = r0
            r0 = -1
            r4.mRelativeBegin = r0
            r4.mRelativeEnd = r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r4.mTop
            r4.mAnchor = r0
            r0 = 0
            r4.mOrientation = r0
            r4.mMinimumPosition = r0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r1 = r4.mAnchors
            r1.clear()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r1 = r4.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r4.mAnchor
            r1.add(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r4.mListAnchors
            int r1 = r1.length
        L24:
            if (r0 >= r1) goto L2f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r4.mListAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r4.mAnchor
            r2[r0] = r3
            int r0 = r0 + 1
            goto L24
        L2f:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem r9) {
            r8 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.getParent()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            if (r0 != 0) goto La
            goto La3
        La:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.getAnchor(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.getAnchor(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r8.mParent
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L26
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r3.mListDimensionBehaviors
            r3 = r3[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r6) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            int r6 = r8.mOrientation
            if (r6 != 0) goto L46
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.getAnchor(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.getAnchor(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.mParent
            if (r0 == 0) goto L44
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r4]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L44
            goto L45
        L44:
            r4 = 0
        L45:
            r3 = r4
        L46:
            int r0 = r8.mRelativeBegin
            r4 = 8
            r6 = -1
            r7 = 5
            if (r0 == r6) goto L67
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r8.mAnchor
            androidx.constraintlayout.solver.SolverVariable r0 = r9.createObjectVariable(r0)
            androidx.constraintlayout.solver.SolverVariable r1 = r9.createObjectVariable(r1)
            int r6 = r8.mRelativeBegin
            r9.addEquality(r0, r1, r6, r4)
            if (r3 == 0) goto La3
            androidx.constraintlayout.solver.SolverVariable r1 = r9.createObjectVariable(r2)
            r9.addGreaterThan(r1, r0, r5, r7)
            return
        L67:
            int r0 = r8.mRelativeEnd
            if (r0 == r6) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r8.mAnchor
            androidx.constraintlayout.solver.SolverVariable r0 = r9.createObjectVariable(r0)
            androidx.constraintlayout.solver.SolverVariable r2 = r9.createObjectVariable(r2)
            int r6 = r8.mRelativeEnd
            int r6 = -r6
            r9.addEquality(r0, r2, r6, r4)
            if (r3 == 0) goto La3
            androidx.constraintlayout.solver.SolverVariable r1 = r9.createObjectVariable(r1)
            r9.addGreaterThan(r0, r1, r5, r7)
            r9.addGreaterThan(r2, r0, r5, r7)
            return
        L88:
            float r0 = r8.mRelativePercent
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r8.mAnchor
            androidx.constraintlayout.solver.SolverVariable r0 = r9.createObjectVariable(r0)
            androidx.constraintlayout.solver.SolverVariable r1 = r9.createObjectVariable(r2)
            float r2 = r8.mRelativePercent
            androidx.constraintlayout.solver.ArrayRow r0 = androidx.constraintlayout.solver.LinearSystem.createRowDimensionPercent(r9, r0, r1, r2)
            r9.addConstraint(r0)
        La3:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.solver.widgets.Guideline r1 = (androidx.constraintlayout.solver.widgets.Guideline) r1
            float r2 = r1.mRelativePercent
            r0.mRelativePercent = r2
            int r2 = r1.mRelativeBegin
            r0.mRelativeBegin = r2
            int r2 = r1.mRelativeEnd
            r0.mRelativeEnd = r2
            int r1 = r1.mOrientation
            r0.setOrientation(r1)
            return
    }

    public void cyclePosition() {
            r3 = this;
            int r0 = r3.mRelativeBegin
            r1 = -1
            if (r0 == r1) goto L9
            r3.inferRelativePercentPosition()
            return
        L9:
            float r0 = r3.mRelativePercent
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L15
            r3.inferRelativeEndPosition()
            return
        L15:
            int r0 = r3.mRelativeEnd
            if (r0 == r1) goto L1c
            r3.inferRelativeBeginPosition()
        L1c:
            return
    }

    public androidx.constraintlayout.solver.widgets.ConstraintAnchor getAnchor() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mAnchor
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.solver.widgets.Guideline.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L15;
                case 2: goto L15;
                case 3: goto Le;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lc;
                case 9: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L1d
        Lc:
            r3 = 0
            return r3
        Le:
            int r0 = r2.mOrientation
            if (r0 != 0) goto L1d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mAnchor
            return r3
        L15:
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L1d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mAnchor
            return r3
        L1d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r3 = r3.name()
            r0.<init>(r3)
            throw r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public int getRelativeBegin() {
            r1 = this;
            int r0 = r1.mRelativeBegin
            return r0
    }

    public int getRelativeBehaviour() {
            r2 = this;
            float r0 = r2.mRelativePercent
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r2.mRelativeBegin
            r1 = -1
            if (r0 == r1) goto L11
            r0 = 1
            return r0
        L11:
            int r0 = r2.mRelativeEnd
            if (r0 == r1) goto L17
            r0 = 2
            return r0
        L17:
            return r1
    }

    public int getRelativeEnd() {
            r1 = this;
            int r0 = r1.mRelativeEnd
            return r0
    }

    public float getRelativePercent() {
            r1 = this;
            float r0 = r1.mRelativePercent
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "Guideline"
            return r0
    }

    void inferRelativeBeginPosition() {
            r2 = this;
            int r0 = r2.getX()
            int r1 = r2.mOrientation
            if (r1 != 0) goto Lc
            int r0 = r2.getY()
        Lc:
            r2.setGuideBegin(r0)
            return
    }

    void inferRelativeEndPosition() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.getParent()
            int r0 = r0.getWidth()
            int r1 = r2.getX()
            int r0 = r0 - r1
            int r1 = r2.mOrientation
            if (r1 != 0) goto L1e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.getParent()
            int r0 = r0.getHeight()
            int r1 = r2.getY()
            int r0 = r0 - r1
        L1e:
            r2.setGuideEnd(r0)
            return
    }

    void inferRelativePercentPosition() {
            r2 = this;
            int r0 = r2.getX()
            float r0 = (float) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r2.getParent()
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r2.mOrientation
            if (r1 != 0) goto L22
            int r0 = r2.getY()
            float r0 = (float) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r2.getParent()
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
        L22:
            r2.setGuidePercent(r0)
            return
    }

    public boolean isPercent() {
            r2 = this;
            float r0 = r2.mRelativePercent
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L13
            int r0 = r2.mRelativeBegin
            r1 = -1
            if (r0 != r1) goto L13
            int r0 = r2.mRelativeEnd
            if (r0 != r1) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    public void setGuideBegin(int r3) {
            r2 = this;
            r0 = -1
            if (r3 <= r0) goto Lb
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mRelativePercent = r1
            r2.mRelativeBegin = r3
            r2.mRelativeEnd = r0
        Lb:
            return
    }

    public void setGuideEnd(int r3) {
            r2 = this;
            r0 = -1
            if (r3 <= r0) goto Lb
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mRelativePercent = r1
            r2.mRelativeBegin = r0
            r2.mRelativeEnd = r3
        Lb:
            return
    }

    public void setGuidePercent(float r2) {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r1.mRelativePercent = r2
            r2 = -1
            r1.mRelativeBegin = r2
            r1.mRelativeEnd = r2
        Ld:
            return
    }

    public void setGuidePercent(int r2) {
            r1 = this;
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            r1.setGuidePercent(r2)
            return
    }

    public void setMinimumPosition(int r1) {
            r0 = this;
            r0.mMinimumPosition = r1
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            int r0 = r3.mOrientation
            if (r0 != r4) goto L5
            goto L30
        L5:
            r3.mOrientation = r4
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r3.mAnchors
            r4.clear()
            int r4 = r3.mOrientation
            r0 = 1
            if (r4 != r0) goto L16
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mLeft
            r3.mAnchor = r4
            goto L1a
        L16:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mTop
            r3.mAnchor = r4
        L1a:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r3.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mAnchor
            r4.add(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r3.mListAnchors
            int r4 = r4.length
            r0 = 0
        L25:
            if (r0 >= r4) goto L30
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r3.mListAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r3.mAnchor
            r1[r0] = r2
            int r0 = r0 + 1
            goto L25
        L30:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromSolver(androidx.constraintlayout.solver.LinearSystem r4) {
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.getParent()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mAnchor
            int r4 = r4.getObjectVariableValue(r0)
            int r0 = r3.mOrientation
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L28
            r3.setX(r4)
            r3.setY(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r3.getParent()
            int r4 = r4.getHeight()
            r3.setHeight(r4)
            r3.setWidth(r2)
            return
        L28:
            r3.setX(r2)
            r3.setY(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r3.getParent()
            int r4 = r4.getWidth()
            r3.setWidth(r4)
            r3.setHeight(r2)
            return
    }
}
