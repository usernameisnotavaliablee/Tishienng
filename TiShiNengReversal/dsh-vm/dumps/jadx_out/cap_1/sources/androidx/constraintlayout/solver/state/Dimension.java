package androidx.constraintlayout.solver.state;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Dimension {
    public static final java.lang.Object FIXED_DIMENSION = null;
    public static final java.lang.Object PARENT_DIMENSION = null;
    public static final java.lang.Object PERCENT_DIMENSION = null;
    public static final java.lang.Object SPREAD_DIMENSION = null;
    public static final java.lang.Object WRAP_DIMENSION = null;
    private final int WRAP_CONTENT;
    java.lang.Object mInitialValue;
    boolean mIsSuggested;
    int mMax;
    int mMin;
    float mPercent;
    float mRatio;
    int mValue;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<androidx.constraintlayout.solver.state.Dimension.Type> {
        private static final /* synthetic */ androidx.constraintlayout.solver.state.Dimension.Type[] $VALUES = null;
        public static final androidx.constraintlayout.solver.state.Dimension.Type FIXED = null;
        public static final androidx.constraintlayout.solver.state.Dimension.Type MATCH_CONSTRAINT = null;
        public static final androidx.constraintlayout.solver.state.Dimension.Type MATCH_PARENT = null;
        public static final androidx.constraintlayout.solver.state.Dimension.Type WRAP = null;

        static {
                androidx.constraintlayout.solver.state.Dimension$Type r0 = new androidx.constraintlayout.solver.state.Dimension$Type
                java.lang.String r1 = "FIXED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.state.Dimension.Type.FIXED = r0
                androidx.constraintlayout.solver.state.Dimension$Type r1 = new androidx.constraintlayout.solver.state.Dimension$Type
                java.lang.String r3 = "WRAP"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.state.Dimension.Type.WRAP = r1
                androidx.constraintlayout.solver.state.Dimension$Type r3 = new androidx.constraintlayout.solver.state.Dimension$Type
                java.lang.String r5 = "MATCH_PARENT"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.state.Dimension.Type.MATCH_PARENT = r3
                androidx.constraintlayout.solver.state.Dimension$Type r5 = new androidx.constraintlayout.solver.state.Dimension$Type
                java.lang.String r7 = "MATCH_CONSTRAINT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.solver.state.Dimension.Type.MATCH_CONSTRAINT = r5
                r7 = 4
                androidx.constraintlayout.solver.state.Dimension$Type[] r7 = new androidx.constraintlayout.solver.state.Dimension.Type[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.solver.state.Dimension.Type.$VALUES = r7
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.state.Dimension.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.state.Dimension$Type> r0 = androidx.constraintlayout.solver.state.Dimension.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.state.Dimension$Type r1 = (androidx.constraintlayout.solver.state.Dimension.Type) r1
                return r1
        }

        public static androidx.constraintlayout.solver.state.Dimension.Type[] values() {
                androidx.constraintlayout.solver.state.Dimension$Type[] r0 = androidx.constraintlayout.solver.state.Dimension.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.state.Dimension$Type[] r0 = (androidx.constraintlayout.solver.state.Dimension.Type[]) r0
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.solver.state.Dimension.FIXED_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.solver.state.Dimension.SPREAD_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.solver.state.Dimension.PARENT_DIMENSION = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.constraintlayout.solver.state.Dimension.PERCENT_DIMENSION = r0
            return
    }

    private Dimension() {
            r2 = this;
            r2.<init>()
            r0 = -2
            r2.WRAP_CONTENT = r0
            r0 = 0
            r2.mMin = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.mMax = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.mPercent = r1
            r2.mValue = r0
            r2.mRatio = r1
            java.lang.Object r1 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            r2.mInitialValue = r1
            r2.mIsSuggested = r0
            return
    }

    private Dimension(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            r0 = -2
            r2.WRAP_CONTENT = r0
            r0 = 0
            r2.mMin = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.mMax = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.mPercent = r1
            r2.mValue = r0
            r2.mRatio = r1
            r2.mIsSuggested = r0
            r2.mInitialValue = r3
            return
    }

    public static androidx.constraintlayout.solver.state.Dimension Fixed(int r2) {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.solver.state.Dimension.FIXED_DIMENSION
            r0.<init>(r1)
            r0.fixed(r2)
            return r0
    }

    public static androidx.constraintlayout.solver.state.Dimension Fixed(java.lang.Object r2) {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.solver.state.Dimension.FIXED_DIMENSION
            r0.<init>(r1)
            r0.fixed(r2)
            return r0
    }

    public static androidx.constraintlayout.solver.state.Dimension Parent() {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.solver.state.Dimension.PARENT_DIMENSION
            r0.<init>(r1)
            return r0
    }

    public static androidx.constraintlayout.solver.state.Dimension Percent(java.lang.Object r2, float r3) {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.solver.state.Dimension.PERCENT_DIMENSION
            r0.<init>(r1)
            r0.percent(r2, r3)
            return r0
    }

    public static androidx.constraintlayout.solver.state.Dimension Spread() {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.solver.state.Dimension.SPREAD_DIMENSION
            r0.<init>(r1)
            return r0
    }

    public static androidx.constraintlayout.solver.state.Dimension Suggested(int r1) {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            r0.<init>()
            r0.suggested(r1)
            return r0
    }

    public static androidx.constraintlayout.solver.state.Dimension Suggested(java.lang.Object r1) {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            r0.<init>()
            r0.suggested(r1)
            return r0
    }

    public static androidx.constraintlayout.solver.state.Dimension Wrap() {
            androidx.constraintlayout.solver.state.Dimension r0 = new androidx.constraintlayout.solver.state.Dimension
            java.lang.Object r1 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            r0.<init>(r1)
            return r0
    }

    public void apply(androidx.constraintlayout.solver.state.State r4, androidx.constraintlayout.solver.widgets.ConstraintWidget r5, int r6) {
            r3 = this;
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0 = 2
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L5a
            boolean r6 = r3.mIsSuggested
            if (r6 == 0) goto L29
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r5.setHorizontalDimensionBehaviour(r4)
            java.lang.Object r4 = r3.mInitialValue
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            if (r4 != r6) goto L19
            r0 = 1
            goto L1f
        L19:
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.PERCENT_DIMENSION
            if (r4 != r6) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r4 = r3.mMin
            int r6 = r3.mMax
            float r1 = r3.mPercent
            r5.setHorizontalMatchStyle(r0, r4, r6, r1)
            return
        L29:
            int r6 = r3.mMin
            if (r6 <= 0) goto L30
            r5.setMinWidth(r6)
        L30:
            int r6 = r3.mMax
            if (r6 >= r4) goto L37
            r5.setMaxWidth(r6)
        L37:
            java.lang.Object r4 = r3.mInitialValue
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            if (r4 != r6) goto L43
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r5.setHorizontalDimensionBehaviour(r4)
            return
        L43:
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.PARENT_DIMENSION
            if (r4 != r6) goto L4d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r5.setHorizontalDimensionBehaviour(r4)
            return
        L4d:
            if (r4 != 0) goto Lab
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r5.setHorizontalDimensionBehaviour(r4)
            int r4 = r3.mValue
            r5.setWidth(r4)
            return
        L5a:
            boolean r6 = r3.mIsSuggested
            if (r6 == 0) goto L7b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r5.setVerticalDimensionBehaviour(r4)
            java.lang.Object r4 = r3.mInitialValue
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            if (r4 != r6) goto L6b
            r0 = 1
            goto L71
        L6b:
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.PERCENT_DIMENSION
            if (r4 != r6) goto L70
            goto L71
        L70:
            r0 = 0
        L71:
            int r4 = r3.mMin
            int r6 = r3.mMax
            float r1 = r3.mPercent
            r5.setVerticalMatchStyle(r0, r4, r6, r1)
            return
        L7b:
            int r6 = r3.mMin
            if (r6 <= 0) goto L82
            r5.setMinHeight(r6)
        L82:
            int r6 = r3.mMax
            if (r6 >= r4) goto L89
            r5.setMaxHeight(r6)
        L89:
            java.lang.Object r4 = r3.mInitialValue
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            if (r4 != r6) goto L95
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r5.setVerticalDimensionBehaviour(r4)
            return
        L95:
            java.lang.Object r6 = androidx.constraintlayout.solver.state.Dimension.PARENT_DIMENSION
            if (r4 != r6) goto L9f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r5.setVerticalDimensionBehaviour(r4)
            return
        L9f:
            if (r4 != 0) goto Lab
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r5.setVerticalDimensionBehaviour(r4)
            int r4 = r3.mValue
            r5.setHeight(r4)
        Lab:
            return
    }

    public androidx.constraintlayout.solver.state.Dimension fixed(int r2) {
            r1 = this;
            r0 = 0
            r1.mInitialValue = r0
            r1.mValue = r2
            return r1
    }

    public androidx.constraintlayout.solver.state.Dimension fixed(java.lang.Object r2) {
            r1 = this;
            r1.mInitialValue = r2
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L11
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mValue = r2
            r2 = 0
            r1.mInitialValue = r2
        L11:
            return r1
    }

    float getRatio() {
            r1 = this;
            float r0 = r1.mRatio
            return r0
    }

    int getValue() {
            r1 = this;
            int r0 = r1.mValue
            return r0
    }

    public androidx.constraintlayout.solver.state.Dimension max(int r2) {
            r1 = this;
            int r0 = r1.mMax
            if (r0 < 0) goto L6
            r1.mMax = r2
        L6:
            return r1
    }

    public androidx.constraintlayout.solver.state.Dimension max(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            if (r2 != r0) goto Lf
            boolean r2 = r1.mIsSuggested
            if (r2 == 0) goto Lf
            r1.mInitialValue = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.mMax = r2
        Lf:
            return r1
    }

    public androidx.constraintlayout.solver.state.Dimension min(int r1) {
            r0 = this;
            if (r1 < 0) goto L4
            r0.mMin = r1
        L4:
            return r0
    }

    public androidx.constraintlayout.solver.state.Dimension min(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = androidx.constraintlayout.solver.state.Dimension.WRAP_DIMENSION
            if (r2 != r0) goto L7
            r2 = -2
            r1.mMin = r2
        L7:
            return r1
    }

    public androidx.constraintlayout.solver.state.Dimension percent(java.lang.Object r1, float r2) {
            r0 = this;
            r0.mPercent = r2
            return r0
    }

    public androidx.constraintlayout.solver.state.Dimension ratio(float r1) {
            r0 = this;
            return r0
    }

    void setRatio(float r1) {
            r0 = this;
            r0.mRatio = r1
            return
    }

    void setValue(int r2) {
            r1 = this;
            r0 = 0
            r1.mIsSuggested = r0
            r0 = 0
            r1.mInitialValue = r0
            r1.mValue = r2
            return
    }

    public androidx.constraintlayout.solver.state.Dimension suggested(int r1) {
            r0 = this;
            r1 = 1
            r0.mIsSuggested = r1
            return r0
    }

    public androidx.constraintlayout.solver.state.Dimension suggested(java.lang.Object r1) {
            r0 = this;
            r0.mInitialValue = r1
            r1 = 1
            r0.mIsSuggested = r1
            return r0
    }
}
