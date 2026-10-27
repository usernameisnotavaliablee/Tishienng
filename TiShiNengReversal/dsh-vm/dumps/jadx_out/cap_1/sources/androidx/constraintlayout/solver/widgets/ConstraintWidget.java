package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean hasBaseline;
    public androidx.constraintlayout.solver.widgets.analyzer.ChainRun horizontalChainRun;
    public androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> mAnchors;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mCenter;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mCenterX;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private java.lang.Object mCompanionWidget;
    private int mContainerItemSkip;
    private java.lang.String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    androidx.constraintlayout.solver.widgets.ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor[] mListAnchors;
    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[] mListDimensionBehaviors;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    public androidx.constraintlayout.solver.widgets.ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private java.lang.String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    androidx.constraintlayout.solver.widgets.ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    protected int mX;
    protected int mY;
    public boolean measured;
    public androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[] run;
    public androidx.constraintlayout.solver.widgets.analyzer.ChainRun verticalChainRun;
    public androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = null;

        static {
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = r0
                r1 = 1
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = r4
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L4e
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L58
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L62
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L6d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L83
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L8f
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L8f:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L9b
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
            L9b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DimensionBehaviour extends java.lang.Enum<androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour> {
        private static final /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[] $VALUES = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour FIXED = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour MATCH_CONSTRAINT = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour MATCH_PARENT = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour WRAP_CONTENT = null;

        static {
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = new androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r1 = "FIXED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED = r0
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r3 = "WRAP_CONTENT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT = r1
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = new androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r5 = "MATCH_CONSTRAINT"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT = r3
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = new androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r7 = "MATCH_PARENT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT = r5
                r7 = 4
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = new androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.$VALUES = r7
                return
        }

        DimensionBehaviour(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour> r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour) r1
                return r1
        }

        public static androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[] values() {
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[]) r0
                return r0
        }
    }

    static {
            return
    }

    public ConstraintWidget() {
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.measured = r0
            r1 = 2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[r1]
            r11.run = r2
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = new androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun
            r2.<init>(r11)
            r11.horizontalRun = r2
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = new androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            r2.<init>(r11)
            r11.verticalRun = r2
            boolean[] r2 = new boolean[r1]
            r2 = {x0122: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r11.isTerminalWidget = r2
            int[] r2 = new int[]{r0, r0, r0, r0}
            r11.wrapMeasure = r2
            r11.mResolvedHasRatio = r0
            r2 = -1
            r11.mHorizontalResolution = r2
            r11.mVerticalResolution = r2
            r11.mMatchConstraintDefaultWidth = r0
            r11.mMatchConstraintDefaultHeight = r0
            int[] r3 = new int[r1]
            r11.mResolvedMatchConstraintDefault = r3
            r11.mMatchConstraintMinWidth = r0
            r11.mMatchConstraintMaxWidth = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.mMatchConstraintPercentWidth = r3
            r11.mMatchConstraintMinHeight = r0
            r11.mMatchConstraintMaxHeight = r0
            r11.mMatchConstraintPercentHeight = r3
            r11.mResolvedDimensionRatioSide = r2
            r11.mResolvedDimensionRatio = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            int[] r3 = new int[]{r3, r3}
            r11.mMaxDimension = r3
            r3 = 0
            r11.mCircleConstraintAngle = r3
            r11.hasBaseline = r0
            r11.mInVirtuaLayout = r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            r4.<init>(r11, r5)
            r11.mLeft = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            r4.<init>(r11, r5)
            r11.mTop = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            r4.<init>(r11, r5)
            r11.mRight = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            r4.<init>(r11, r5)
            r11.mBottom = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            r4.<init>(r11, r5)
            r11.mBaseline = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            r4.<init>(r11, r5)
            r11.mCenterX = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            r4.<init>(r11, r5)
            r11.mCenterY = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            r4.<init>(r11, r5)
            r11.mCenter = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r11.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r11.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r11.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r11.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r11.mBaseline
            r10 = 6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor[r10]
            r10[r0] = r5
            r5 = 1
            r10[r5] = r6
            r10[r1] = r7
            r6 = 3
            r10[r6] = r8
            r6 = 4
            r10[r6] = r9
            r6 = 5
            r10[r6] = r4
            r11.mListAnchors = r10
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11.mAnchors = r4
            boolean[] r4 = new boolean[r1]
            r11.mIsInBarrier = r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = new androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4[r0] = r6
            r4[r5] = r6
            r11.mListDimensionBehaviors = r4
            r4 = 0
            r11.mParent = r4
            r11.mWidth = r0
            r11.mHeight = r0
            r11.mDimensionRatio = r3
            r11.mDimensionRatioSide = r2
            r11.mX = r0
            r11.mY = r0
            r11.mRelX = r0
            r11.mRelY = r0
            r11.mOffsetX = r0
            r11.mOffsetY = r0
            r11.mBaselineDistance = r0
            float r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DEFAULT_BIAS
            r11.mHorizontalBiasPercent = r2
            r11.mVerticalBiasPercent = r2
            r11.mContainerItemSkip = r0
            r11.mVisibility = r0
            r11.mDebugName = r4
            r11.mType = r4
            r11.mOptimizerMeasurable = r0
            r11.mGroupsToSolver = r0
            r11.mHorizontalChainStyle = r0
            r11.mVerticalChainStyle = r0
            float[] r2 = new float[r1]
            r2 = {x0128: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r11.mWeight = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r1]
            r2[r0] = r4
            r2[r5] = r4
            r11.mListNextMatchConstraintsWidget = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r1]
            r1[r0] = r4
            r1[r5] = r4
            r11.mNextChainWidget = r1
            r11.mHorizontalNextWidget = r4
            r11.mVerticalNextWidget = r4
            r11.addAnchors()
            return
    }

    public ConstraintWidget(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r2, r3)
            return
    }

    public ConstraintWidget(int r12, int r13, int r14, int r15) {
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.measured = r0
            r1 = 2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[r1]
            r11.run = r2
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = new androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun
            r2.<init>(r11)
            r11.horizontalRun = r2
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = new androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            r2.<init>(r11)
            r11.verticalRun = r2
            boolean[] r2 = new boolean[r1]
            r2 = {x0122: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r11.isTerminalWidget = r2
            int[] r2 = new int[]{r0, r0, r0, r0}
            r11.wrapMeasure = r2
            r11.mResolvedHasRatio = r0
            r2 = -1
            r11.mHorizontalResolution = r2
            r11.mVerticalResolution = r2
            r11.mMatchConstraintDefaultWidth = r0
            r11.mMatchConstraintDefaultHeight = r0
            int[] r3 = new int[r1]
            r11.mResolvedMatchConstraintDefault = r3
            r11.mMatchConstraintMinWidth = r0
            r11.mMatchConstraintMaxWidth = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.mMatchConstraintPercentWidth = r3
            r11.mMatchConstraintMinHeight = r0
            r11.mMatchConstraintMaxHeight = r0
            r11.mMatchConstraintPercentHeight = r3
            r11.mResolvedDimensionRatioSide = r2
            r11.mResolvedDimensionRatio = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            int[] r3 = new int[]{r3, r3}
            r11.mMaxDimension = r3
            r3 = 0
            r11.mCircleConstraintAngle = r3
            r11.hasBaseline = r0
            r11.mInVirtuaLayout = r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            r4.<init>(r11, r5)
            r11.mLeft = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            r4.<init>(r11, r5)
            r11.mTop = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            r4.<init>(r11, r5)
            r11.mRight = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            r4.<init>(r11, r5)
            r11.mBottom = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            r4.<init>(r11, r5)
            r11.mBaseline = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            r4.<init>(r11, r5)
            r11.mCenterX = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            r4.<init>(r11, r5)
            r11.mCenterY = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            r4.<init>(r11, r5)
            r11.mCenter = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r11.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r11.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r11.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r11.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r11.mBaseline
            r10 = 6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor[r10]
            r10[r0] = r5
            r5 = 1
            r10[r5] = r6
            r10[r1] = r7
            r6 = 3
            r10[r6] = r8
            r6 = 4
            r10[r6] = r9
            r6 = 5
            r10[r6] = r4
            r11.mListAnchors = r10
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11.mAnchors = r4
            boolean[] r4 = new boolean[r1]
            r11.mIsInBarrier = r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = new androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4[r0] = r6
            r4[r5] = r6
            r11.mListDimensionBehaviors = r4
            r4 = 0
            r11.mParent = r4
            r11.mDimensionRatio = r3
            r11.mDimensionRatioSide = r2
            r11.mRelX = r0
            r11.mRelY = r0
            r11.mOffsetX = r0
            r11.mOffsetY = r0
            r11.mBaselineDistance = r0
            float r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DEFAULT_BIAS
            r11.mHorizontalBiasPercent = r2
            r11.mVerticalBiasPercent = r2
            r11.mContainerItemSkip = r0
            r11.mVisibility = r0
            r11.mDebugName = r4
            r11.mType = r4
            r11.mOptimizerMeasurable = r0
            r11.mGroupsToSolver = r0
            r11.mHorizontalChainStyle = r0
            r11.mVerticalChainStyle = r0
            float[] r2 = new float[r1]
            r2 = {x0128: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r11.mWeight = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r1]
            r2[r0] = r4
            r2[r5] = r4
            r11.mListNextMatchConstraintsWidget = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r1]
            r1[r0] = r4
            r1[r5] = r4
            r11.mNextChainWidget = r1
            r11.mHorizontalNextWidget = r4
            r11.mVerticalNextWidget = r4
            r11.mX = r12
            r11.mY = r13
            r11.mWidth = r14
            r11.mHeight = r15
            r11.addAnchors()
            return
    }

    private void addAnchors() {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mLeft
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mTop
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mRight
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mBottom
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mCenterX
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mCenterY
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mCenter
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mBaseline
            r0.add(r1)
            return
    }

    private void applyConstraints(androidx.constraintlayout.solver.LinearSystem r29, boolean r30, boolean r31, boolean r32, boolean r33, androidx.constraintlayout.solver.SolverVariable r34, androidx.constraintlayout.solver.SolverVariable r35, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r36, boolean r37, androidx.constraintlayout.solver.widgets.ConstraintAnchor r38, androidx.constraintlayout.solver.widgets.ConstraintAnchor r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, int r49, int r50, int r51, int r52, float r53, boolean r54) {
            r28 = this;
            r0 = r28
            r1 = r29
            r10 = r34
            r12 = r38
            r13 = r39
            r14 = r42
            r2 = r43
            r4 = r51
            r5 = r52
            androidx.constraintlayout.solver.SolverVariable r6 = r1.createObjectVariable(r12)
            androidx.constraintlayout.solver.SolverVariable r7 = r1.createObjectVariable(r13)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r12.getTarget()
            androidx.constraintlayout.solver.SolverVariable r15 = r1.createObjectVariable(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r13.getTarget()
            androidx.constraintlayout.solver.SolverVariable r8 = r1.createObjectVariable(r8)
            androidx.constraintlayout.solver.Metrics r9 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            if (r9 == 0) goto L3c
            androidx.constraintlayout.solver.Metrics r9 = androidx.constraintlayout.solver.LinearSystem.getMetrics()
            long r11 = r9.nonresolvedWidgets
            r16 = 1
            long r11 = r11 + r16
            r9.nonresolvedWidgets = r11
        L3c:
            boolean r11 = r38.isConnected()
            boolean r12 = r13.isConnected()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mCenter
            boolean r16 = r9.isConnected()
            if (r12 == 0) goto L4f
            int r9 = r11 + 1
            goto L50
        L4f:
            r9 = r11
        L50:
            if (r16 == 0) goto L54
            int r9 = r9 + 1
        L54:
            r17 = r11
            if (r45 == 0) goto L5b
            r18 = 3
            goto L5d
        L5b:
            r18 = r49
        L5d:
            int[] r19 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour
            int r20 = r36.ordinal()
            r11 = r19[r20]
            r19 = r12
            r12 = 1
            if (r11 == r12) goto L73
            r12 = 2
            if (r11 == r12) goto L73
            r12 = 3
            if (r11 == r12) goto L73
            r12 = 4
            if (r11 == r12) goto L78
        L73:
            r11 = r18
        L75:
            r18 = 0
            goto L7f
        L78:
            r11 = r18
            if (r11 != r12) goto L7d
            goto L75
        L7d:
            r18 = 1
        L7f:
            int r12 = r0.mVisibility
            r3 = 8
            if (r12 != r3) goto L89
            r12 = 0
            r18 = 0
            goto L8b
        L89:
            r12 = r41
        L8b:
            if (r54 == 0) goto L98
            if (r17 != 0) goto L9d
            if (r19 != 0) goto L9d
            if (r16 != 0) goto L9d
            r3 = r40
            r1.addEquality(r6, r3)
        L98:
            r23 = r8
            r8 = 8
            goto Lac
        L9d:
            if (r17 == 0) goto L98
            if (r19 != 0) goto L98
            int r3 = r38.getMargin()
            r23 = r8
            r8 = 8
            r1.addEquality(r6, r15, r3, r8)
        Lac:
            if (r18 != 0) goto Ld5
            if (r37 == 0) goto Lc5
            r3 = 3
            r8 = 0
            r1.addEquality(r7, r6, r8, r3)
            r8 = 8
            if (r14 <= 0) goto Lbc
            r1.addGreaterThan(r7, r6, r14, r8)
        Lbc:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r3) goto Lc8
            r1.addLowerThan(r7, r6, r2, r8)
            goto Lc8
        Lc5:
            r1.addEquality(r7, r6, r12, r8)
        Lc8:
            r3 = r5
            r5 = r7
            r2 = r9
            r24 = r18
            r12 = r23
            r18 = r33
        Ld1:
            r23 = r4
            goto L1bb
        Ld5:
            r2 = 2
            if (r9 == r2) goto Lf8
            if (r45 != 0) goto Lf8
            r2 = 1
            if (r11 == r2) goto Ldf
            if (r11 != 0) goto Lf8
        Ldf:
            int r2 = java.lang.Math.max(r4, r12)
            if (r5 <= 0) goto Le9
            int r2 = java.lang.Math.min(r5, r2)
        Le9:
            r8 = 8
            r1.addEquality(r7, r6, r2, r8)
            r18 = r33
            r3 = r5
            r5 = r7
            r2 = r9
            r12 = r23
            r24 = 0
            goto Ld1
        Lf8:
            r2 = -2
            if (r4 != r2) goto Lfd
            r3 = r12
            goto Lfe
        Lfd:
            r3 = r4
        Lfe:
            if (r5 != r2) goto L102
            r2 = r12
            goto L103
        L102:
            r2 = r5
        L103:
            if (r12 <= 0) goto L109
            r4 = 1
            if (r11 == r4) goto L109
            r12 = 0
        L109:
            r8 = 8
            if (r3 <= 0) goto L114
            r1.addGreaterThan(r7, r6, r3, r8)
            int r12 = java.lang.Math.max(r12, r3)
        L114:
            r4 = 1
            if (r2 <= 0) goto L123
            if (r31 == 0) goto L11c
            if (r11 != r4) goto L11c
            goto L11f
        L11c:
            r1.addLowerThan(r7, r6, r2, r8)
        L11f:
            int r12 = java.lang.Math.min(r12, r2)
        L123:
            if (r11 != r4) goto L149
            if (r31 == 0) goto L12b
            r1.addEquality(r7, r6, r12, r8)
            goto L13c
        L12b:
            if (r46 == 0) goto L135
            r4 = 5
            r1.addEquality(r7, r6, r12, r4)
            r1.addLowerThan(r7, r6, r12, r8)
            goto L13c
        L135:
            r4 = 5
            r1.addEquality(r7, r6, r12, r4)
            r1.addLowerThan(r7, r6, r12, r8)
        L13c:
            r5 = r7
            r24 = r18
            r12 = r23
            r18 = r33
            r23 = r3
            r3 = r2
            r2 = r9
            goto L1bb
        L149:
            r12 = 2
            if (r11 != r12) goto L1ae
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r38.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r4 == r5) goto L177
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r38.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r4 != r8) goto L15d
            goto L177
        L15d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.getAnchor(r5)
            androidx.constraintlayout.solver.SolverVariable r4 = r1.createObjectVariable(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.getAnchor(r8)
            androidx.constraintlayout.solver.SolverVariable r5 = r1.createObjectVariable(r5)
        L175:
            r8 = r4
            goto L18e
        L177:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.getAnchor(r5)
            androidx.constraintlayout.solver.SolverVariable r4 = r1.createObjectVariable(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.getAnchor(r8)
            androidx.constraintlayout.solver.SolverVariable r5 = r1.createObjectVariable(r5)
            goto L175
        L18e:
            androidx.constraintlayout.solver.ArrayRow r4 = r1.createRow()
            r37 = r7
            r7 = r5
            r5 = r37
            r37 = r2
            r2 = r9
            r12 = r23
            r9 = r53
            androidx.constraintlayout.solver.ArrayRow r4 = r4.createRowDimensionRatio(r5, r6, r7, r8, r9)
            r1.addConstraint(r4)
            r18 = r33
            r23 = r3
            r24 = 0
        L1ab:
            r3 = r37
            goto L1bb
        L1ae:
            r37 = r2
            r5 = r7
            r2 = r9
            r12 = r23
            r23 = r3
            r24 = r18
            r18 = 1
            goto L1ab
        L1bb:
            if (r54 == 0) goto L3b9
            if (r46 == 0) goto L1c6
            r11 = r35
            r12 = 2
            r13 = 8
            goto L3be
        L1c6:
            if (r17 != 0) goto L1cf
            if (r19 != 0) goto L1cf
            if (r16 != 0) goto L1cf
        L1cc:
            r2 = r12
            goto L39f
        L1cf:
            if (r17 == 0) goto L1d4
            if (r19 != 0) goto L1d4
            goto L1cc
        L1d4:
            if (r17 != 0) goto L1ea
            if (r19 == 0) goto L1ea
            int r2 = r13.getMargin()
            int r2 = -r2
            r8 = 8
            r1.addEquality(r5, r12, r2, r8)
            if (r31 == 0) goto L1cc
            r4 = 5
            r8 = 0
            r1.addGreaterThan(r6, r10, r8, r4)
            goto L1cc
        L1ea:
            r4 = 5
            if (r17 == 0) goto L1cc
            if (r19 == 0) goto L1cc
            r2 = r38
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r13.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r8.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getParent()
            r16 = 6
            if (r24 == 0) goto L2a3
            if (r11 != 0) goto L22e
            if (r3 != 0) goto L210
            if (r23 != 0) goto L210
            r3 = 8
            r17 = 8
            r19 = 0
            r25 = 1
            goto L217
        L210:
            r3 = 5
            r17 = 5
            r19 = 1
            r25 = 0
        L217:
            boolean r4 = r7 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r4 != 0) goto L228
            boolean r4 = r8 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r4 == 0) goto L220
            goto L228
        L220:
            r4 = r19
            r1 = 6
        L223:
            r19 = r3
            r3 = 0
            goto L2a7
        L228:
            r4 = r19
            r1 = 6
            r17 = 4
            goto L223
        L22e:
            r4 = 1
            if (r11 != r4) goto L23c
            r1 = 6
            r3 = 1
            r4 = 1
            r17 = 4
            r19 = 8
        L238:
            r25 = 0
            goto L2a7
        L23c:
            r4 = 3
            if (r11 != r4) goto L29b
            int r4 = r0.mResolvedDimensionRatioSide
            r1 = -1
            if (r4 != r1) goto L257
            if (r47 == 0) goto L254
            if (r31 == 0) goto L252
            r1 = 5
        L249:
            r3 = 1
            r4 = 1
            r17 = 5
            r19 = 8
        L24f:
            r25 = 1
            goto L2a7
        L252:
            r1 = 4
            goto L249
        L254:
            r1 = 8
            goto L249
        L257:
            if (r45 == 0) goto L270
            r1 = r50
            r4 = 2
            if (r1 == r4) goto L266
            r4 = 1
            if (r1 != r4) goto L262
            goto L266
        L262:
            r1 = 8
            r3 = 5
            goto L268
        L266:
            r1 = 5
            r3 = 4
        L268:
            r19 = r1
            r17 = r3
            r1 = 6
            r3 = 1
            r4 = 1
            goto L24f
        L270:
            if (r3 <= 0) goto L27a
            r1 = 6
            r3 = 1
            r4 = 1
            r17 = 5
        L277:
            r19 = 5
            goto L24f
        L27a:
            if (r3 != 0) goto L295
            if (r23 != 0) goto L295
            if (r47 != 0) goto L286
            r1 = 6
            r3 = 1
            r4 = 1
            r17 = 8
            goto L277
        L286:
            if (r7 == r9) goto L28c
            if (r8 == r9) goto L28c
            r1 = 4
            goto L28d
        L28c:
            r1 = 5
        L28d:
            r19 = r1
            r1 = 6
            r3 = 1
            r4 = 1
            r17 = 4
            goto L24f
        L295:
            r1 = 6
            r3 = 1
            r4 = 1
            r17 = 4
            goto L277
        L29b:
            r1 = 6
            r3 = 0
            r4 = 0
        L29e:
            r17 = 4
            r19 = 5
            goto L238
        L2a3:
            r1 = 6
            r3 = 1
            r4 = 1
            goto L29e
        L2a7:
            if (r3 == 0) goto L2b2
            if (r15 != r12) goto L2b2
            if (r7 == r9) goto L2b2
            r26 = 0
            r27 = 0
            goto L2b6
        L2b2:
            r26 = r3
            r27 = 1
        L2b6:
            if (r4 == 0) goto L2e0
            int r3 = r0.mVisibility
            r4 = 8
            if (r3 != r4) goto L2bf
            r1 = 4
        L2bf:
            r22 = 8
            int r4 = r2.getMargin()
            r3 = r8
            int r8 = r13.getMargin()
            r2 = r6
            r14 = r9
            r6 = r12
            r13 = 8
            r9 = r1
            r12 = r3
            r3 = r15
            r1 = r29
            r15 = r7
            r7 = r5
            r5 = r44
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r6
            r6 = r2
            r2 = r5
            r5 = r7
            goto L2e9
        L2e0:
            r1 = r29
            r14 = r9
            r2 = r12
            r3 = r15
            r13 = 8
            r15 = r7
            r12 = r8
        L2e9:
            int r4 = r0.mVisibility
            if (r4 != r13) goto L2ef
            goto L400
        L2ef:
            if (r26 == 0) goto L314
            if (r31 == 0) goto L301
            if (r3 == r2) goto L301
            if (r24 != 0) goto L301
            boolean r4 = r15 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r4 != 0) goto L2ff
            boolean r4 = r12 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r4 == 0) goto L301
        L2ff:
            r4 = 6
            goto L303
        L301:
            r4 = r19
        L303:
            int r7 = r38.getMargin()
            r1.addGreaterThan(r6, r3, r7, r4)
            int r7 = r39.getMargin()
            int r7 = -r7
            r1.addLowerThan(r5, r2, r7, r4)
            r19 = r4
        L314:
            if (r31 == 0) goto L325
            if (r48 == 0) goto L325
            boolean r4 = r15 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r4 != 0) goto L325
            boolean r4 = r12 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r4 != 0) goto L325
            r4 = 6
            r7 = 6
            r21 = 1
            goto L32b
        L325:
            r4 = r17
            r7 = r19
            r21 = r27
        L32b:
            if (r21 == 0) goto L378
            if (r25 == 0) goto L358
            if (r47 == 0) goto L333
            if (r32 == 0) goto L358
        L333:
            if (r15 == r14) goto L33a
            if (r12 != r14) goto L338
            goto L33a
        L338:
            r16 = r4
        L33a:
            boolean r8 = r15 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r8 != 0) goto L342
            boolean r8 = r12 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r8 == 0) goto L344
        L342:
            r16 = 5
        L344:
            boolean r8 = r15 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r8 != 0) goto L34c
            boolean r8 = r12 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r8 == 0) goto L34e
        L34c:
            r16 = 5
        L34e:
            if (r47 == 0) goto L352
            r8 = 5
            goto L354
        L352:
            r8 = r16
        L354:
            int r4 = java.lang.Math.max(r8, r4)
        L358:
            if (r31 == 0) goto L368
            int r4 = java.lang.Math.min(r7, r4)
            if (r45 == 0) goto L368
            if (r47 != 0) goto L368
            if (r15 == r14) goto L366
            if (r12 != r14) goto L368
        L366:
            r12 = 4
            goto L369
        L368:
            r12 = r4
        L369:
            int r4 = r38.getMargin()
            r1.addEquality(r6, r3, r4, r12)
            int r4 = r39.getMargin()
            int r4 = -r4
            r1.addEquality(r5, r2, r4, r12)
        L378:
            if (r31 == 0) goto L388
            if (r10 != r3) goto L381
            int r4 = r38.getMargin()
            goto L382
        L381:
            r4 = 0
        L382:
            if (r3 == r10) goto L388
            r3 = 5
            r1.addGreaterThan(r6, r10, r4, r3)
        L388:
            if (r31 == 0) goto L39f
            if (r24 == 0) goto L39f
            if (r42 != 0) goto L39f
            if (r23 != 0) goto L39f
            if (r24 == 0) goto L39a
            r12 = 3
            if (r11 != r12) goto L39a
            r8 = 0
            r1.addGreaterThan(r5, r6, r8, r13)
            goto L39f
        L39a:
            r8 = 0
            r4 = 5
            r1.addGreaterThan(r5, r6, r8, r4)
        L39f:
            if (r31 == 0) goto L400
            if (r18 == 0) goto L400
            r13 = r39
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mTarget
            if (r3 == 0) goto L3b0
            int r12 = r13.getMargin()
        L3ad:
            r11 = r35
            goto L3b2
        L3b0:
            r12 = 0
            goto L3ad
        L3b2:
            if (r2 == r11) goto L400
            r4 = 5
            r1.addGreaterThan(r11, r5, r12, r4)
            return
        L3b9:
            r11 = r35
            r13 = 8
            r12 = 2
        L3be:
            if (r2 >= r12) goto L400
            if (r31 == 0) goto L400
            if (r18 == 0) goto L400
            r8 = 0
            r1.addGreaterThan(r6, r10, r8, r13)
            if (r30 != 0) goto L3d3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L3d1
            goto L3d3
        L3d1:
            r8 = 0
            goto L3d4
        L3d3:
            r8 = 1
        L3d4:
            if (r30 != 0) goto L3f9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L3f9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mOwner
            float r3 = r2.mDimensionRatio
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L3f7
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r2.mListDimensionBehaviors
            r20 = 0
            r3 = r2[r20]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r4) goto L3f7
            r21 = 1
            r2 = r2[r21]
            if (r2 != r4) goto L3f7
            r12 = 1
            goto L3fa
        L3f7:
            r12 = 0
            goto L3fa
        L3f9:
            r12 = r8
        L3fa:
            if (r12 == 0) goto L400
            r8 = 0
            r1.addGreaterThan(r11, r5, r8, r13)
        L400:
            return
    }

    private boolean isChainHead(int r4) {
            r3 = this;
            int r4 = r4 * 2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r3.mListAnchors
            r1 = r0[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mTarget
            if (r2 == 0) goto L1b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == r1) goto L1b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r4.mTarget
            if (r0 == 0) goto L1b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != r4) goto L1b
            return r1
        L1b:
            r4 = 0
            return r4
    }

    boolean addFirst() {
            r1 = this;
            boolean r0 = r1 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
            if (r0 != 0) goto Lb
            boolean r0 = r1 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public void addToSolver(androidx.constraintlayout.solver.LinearSystem r47) {
            r46 = this;
            r0 = r46
            r1 = r47
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mLeft
            androidx.constraintlayout.solver.SolverVariable r2 = r1.createObjectVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mRight
            androidx.constraintlayout.solver.SolverVariable r3 = r1.createObjectVariable(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.mTop
            androidx.constraintlayout.solver.SolverVariable r4 = r1.createObjectVariable(r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r0.mBottom
            androidx.constraintlayout.solver.SolverVariable r5 = r1.createObjectVariable(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.mBaseline
            androidx.constraintlayout.solver.SolverVariable r6 = r1.createObjectVariable(r6)
            androidx.constraintlayout.solver.Metrics r7 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            r8 = 1
            if (r7 == 0) goto L2d
            long r10 = r7.widgets
            long r10 = r10 + r8
            r7.widgets = r10
        L2d:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r10 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r10.start
            boolean r12 = r11.resolved
            r13 = 8
            r14 = 1
            r15 = 0
            if (r12 == 0) goto Ld4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto Ld4
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r10 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = r10.start
            boolean r12 = r12.resolved
            if (r12 == 0) goto Ld4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto Ld4
            if (r7 == 0) goto L57
            r16 = r8
            long r8 = r7.graphSolved
            long r8 = r8 + r16
            r7.graphSolved = r8
        L57:
            int r7 = r11.value
            r1.addEquality(r2, r7)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.value
            r1.addEquality(r3, r2)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.start
            int r2 = r2.value
            r1.addEquality(r4, r2)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.value
            r1.addEquality(r5, r2)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.baseline
            int r2 = r2.value
            r1.addEquality(r6, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            if (r2 == 0) goto Ld1
            if (r2 == 0) goto L90
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.mListDimensionBehaviors
            r4 = r4[r15]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != r6) goto L90
            r4 = 1
            goto L91
        L90:
            r4 = 0
        L91:
            if (r2 == 0) goto L9d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r2.mListDimensionBehaviors
            r2 = r2[r14]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r6) goto L9d
            r2 = 1
            goto L9e
        L9d:
            r2 = 0
        L9e:
            if (r4 == 0) goto Lb7
            boolean[] r4 = r0.isTerminalWidget
            boolean r4 = r4[r15]
            if (r4 == 0) goto Lb7
            boolean r4 = r0.isInHorizontalChain()
            if (r4 != 0) goto Lb7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mRight
            androidx.constraintlayout.solver.SolverVariable r4 = r1.createObjectVariable(r4)
            r1.addGreaterThan(r4, r3, r15, r13)
        Lb7:
            if (r2 == 0) goto Ld1
            boolean[] r2 = r0.isTerminalWidget
            boolean r2 = r2[r14]
            if (r2 == 0) goto Ld1
            boolean r2 = r0.isInVerticalChain()
            if (r2 != 0) goto Ld1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.solver.SolverVariable r2 = r1.createObjectVariable(r2)
            r1.addGreaterThan(r2, r5, r15, r13)
            return
        Ld1:
            r7 = r0
            goto L4c0
        Ld4:
            r16 = r8
            if (r7 == 0) goto Lde
            long r8 = r7.linearSolved
            long r8 = r8 + r16
            r7.linearSolved = r8
        Lde:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r0.mParent
            if (r7 == 0) goto L169
            if (r7 == 0) goto Lee
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r7.mListDimensionBehaviors
            r8 = r8[r15]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r9) goto Lee
            r8 = 1
            goto Lef
        Lee:
            r8 = 0
        Lef:
            if (r7 == 0) goto Lfb
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r7.mListDimensionBehaviors
            r7 = r7[r14]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r9) goto Lfb
            r7 = 1
            goto Lfc
        Lfb:
            r7 = 0
        Lfc:
            boolean r9 = r0.isChainHead(r15)
            if (r9 == 0) goto L10b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r9
            r9.addChain(r0, r15)
            r9 = 1
            goto L10f
        L10b:
            boolean r9 = r0.isInHorizontalChain()
        L10f:
            boolean r10 = r0.isChainHead(r14)
            if (r10 == 0) goto L11e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r10
            r10.addChain(r0, r14)
            r10 = 1
            goto L122
        L11e:
            boolean r10 = r0.isInVerticalChain()
        L122:
            if (r9 != 0) goto L141
            if (r8 == 0) goto L141
            int r11 = r0.mVisibility
            if (r11 == r13) goto L141
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 != 0) goto L141
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 != 0) goto L141
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mRight
            androidx.constraintlayout.solver.SolverVariable r11 = r1.createObjectVariable(r11)
            r1.addGreaterThan(r11, r3, r15, r14)
        L141:
            if (r10 != 0) goto L164
            if (r7 == 0) goto L164
            int r11 = r0.mVisibility
            if (r11 == r13) goto L164
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 != 0) goto L164
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 != 0) goto L164
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBaseline
            if (r11 != 0) goto L164
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mBottom
            androidx.constraintlayout.solver.SolverVariable r11 = r1.createObjectVariable(r11)
            r1.addGreaterThan(r11, r5, r15, r14)
        L164:
            r18 = r9
            r19 = r10
            goto L16f
        L169:
            r7 = 0
            r8 = 0
            r18 = 0
            r19 = 0
        L16f:
            int r9 = r0.mWidth
            int r10 = r0.mMinWidth
            if (r9 >= r10) goto L176
            goto L177
        L176:
            r10 = r9
        L177:
            int r11 = r0.mHeight
            int r12 = r0.mMinHeight
            if (r11 >= r12) goto L180
        L17d:
            r16 = 1
            goto L182
        L180:
            r12 = r11
            goto L17d
        L182:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r14 = r0.mListDimensionBehaviors
            r17 = 0
            r15 = r14[r17]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r21 = r4
            if (r15 == r13) goto L190
            r4 = 1
            goto L191
        L190:
            r4 = 0
        L191:
            r14 = r14[r16]
            r22 = r5
            if (r14 == r13) goto L19b
            r5 = 1
        L198:
            r23 = r6
            goto L19d
        L19b:
            r5 = 0
            goto L198
        L19d:
            int r6 = r0.mDimensionRatioSide
            r0.mResolvedDimensionRatioSide = r6
            r24 = r10
            float r10 = r0.mDimensionRatio
            r0.mResolvedDimensionRatio = r10
            r25 = r10
            int r10 = r0.mMatchConstraintDefaultWidth
            r26 = r10
            int r10 = r0.mMatchConstraintDefaultHeight
            r27 = 0
            r28 = r10
            int r27 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r27 <= 0) goto L227
            int r10 = r0.mVisibility
            r29 = r12
            r12 = 8
            if (r10 == r12) goto L224
            r10 = 3
            if (r15 != r13) goto L1c6
            if (r26 != 0) goto L1c6
            r12 = 3
            goto L1c8
        L1c6:
            r12 = r26
        L1c8:
            if (r14 != r13) goto L1cf
            if (r28 != 0) goto L1cf
            r30 = 3
            goto L1d1
        L1cf:
            r30 = r28
        L1d1:
            if (r15 != r13) goto L1e1
            if (r14 != r13) goto L1e1
            if (r12 != r10) goto L1e1
            r31 = r3
            r3 = r30
            if (r3 != r10) goto L1e5
            r0.setupDimensionRatio(r8, r7, r4, r5)
            goto L1fc
        L1e1:
            r31 = r3
            r3 = r30
        L1e5:
            r4 = 4
            if (r15 != r13) goto L203
            if (r12 != r10) goto L203
            r5 = 0
            r0.mResolvedDimensionRatioSide = r5
            float r5 = (float) r11
            float r10 = r25 * r5
            int r10 = (int) r10
            r24 = r10
            if (r14 == r13) goto L1fc
            r4 = r22
            r10 = 4
            r22 = r3
        L1fa:
            r3 = 0
            goto L231
        L1fc:
            r10 = r12
            r4 = r22
        L1ff:
            r22 = r3
            r3 = 1
            goto L231
        L203:
            if (r14 != r13) goto L1fc
            if (r3 != r10) goto L1fc
            r5 = 1
            r0.mResolvedDimensionRatioSide = r5
            r5 = -1
            if (r6 != r5) goto L213
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r25
            r0.mResolvedDimensionRatio = r5
        L213:
            float r5 = r0.mResolvedDimensionRatio
            float r6 = (float) r9
            float r5 = r5 * r6
            int r5 = (int) r5
            r29 = r5
            r10 = r12
            r4 = r22
            if (r15 == r13) goto L1ff
            r3 = 0
            r22 = 4
            goto L231
        L224:
            r31 = r3
            goto L22a
        L227:
            r29 = r12
            goto L224
        L22a:
            r4 = r22
            r10 = r26
            r22 = r28
            goto L1fa
        L231:
            int[] r5 = r0.mResolvedMatchConstraintDefault
            r17 = 0
            r5[r17] = r10
            r16 = 1
            r5[r16] = r22
            r0.mResolvedHasRatio = r3
            if (r3 == 0) goto L248
            int r5 = r0.mResolvedDimensionRatioSide
            r6 = -1
            if (r5 == 0) goto L246
            if (r5 != r6) goto L249
        L246:
            r5 = 1
            goto L24a
        L248:
            r6 = -1
        L249:
            r5 = 0
        L24a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r0.mListDimensionBehaviors
            r17 = 0
            r9 = r9[r17]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r11) goto L25a
            boolean r9 = r0 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r9 == 0) goto L25a
            r9 = 1
            goto L25b
        L25a:
            r9 = 0
        L25b:
            if (r9 == 0) goto L25f
            r13 = 0
            goto L261
        L25f:
            r13 = r24
        L261:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mCenter
            boolean r12 = r12.isConnected()
            r16 = 1
            r26 = r12 ^ 1
            boolean[] r12 = r0.mIsInBarrier
            r14 = 8
            r17 = 0
            boolean r20 = r12[r17]
            boolean r27 = r12[r16]
            int r12 = r0.mHorizontalResolution
            r15 = 2
            r28 = 0
            if (r12 == r15) goto L347
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r12 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r12.start
            boolean r14 = r6.resolved
            if (r14 == 0) goto L28a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = r12.end
            boolean r12 = r12.resolved
            if (r12 != 0) goto L28f
        L28a:
            r6 = r31
            r14 = 8
            goto L2d3
        L28f:
            int r5 = r6.value
            r1.addEquality(r2, r5)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.end
            int r5 = r5.value
            r6 = r31
            r1.addEquality(r6, r5)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.mParent
            if (r5 == 0) goto L2bf
            if (r8 == 0) goto L2bf
            boolean[] r5 = r0.isTerminalWidget
            r9 = 0
            boolean r5 = r5[r9]
            if (r5 == 0) goto L2bf
            boolean r5 = r0.isInHorizontalChain()
            if (r5 != 0) goto L2bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mRight
            androidx.constraintlayout.solver.SolverVariable r5 = r1.createObjectVariable(r5)
            r14 = 8
            r1.addGreaterThan(r5, r6, r9, r14)
        L2bf:
            r40 = r2
            r30 = r3
            r43 = r4
            r31 = r6
        L2c7:
            r4 = r7
            r3 = r8
            r45 = r11
            r42 = r21
            r44 = r23
            r21 = r10
            goto L34f
        L2d3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r0.mParent
            if (r12 == 0) goto L2de
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r12.mRight
            androidx.constraintlayout.solver.SolverVariable r12 = r1.createObjectVariable(r12)
            goto L2e0
        L2de:
            r12 = r28
        L2e0:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = r0.mParent
            if (r14 == 0) goto L2eb
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r14.mLeft
            androidx.constraintlayout.solver.SolverVariable r14 = r1.createObjectVariable(r14)
            goto L2ed
        L2eb:
            r14 = r28
        L2ed:
            boolean[] r15 = r0.isTerminalWidget
            r17 = 0
            boolean r15 = r15[r17]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r0.mListDimensionBehaviors
            r1 = r1[r17]
            r31 = r21
            r21 = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mLeft
            r32 = r11
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
            r33 = r4
            r4 = r7
            r7 = r12
            int r12 = r0.mX
            r34 = r6
            r6 = r14
            int r14 = r0.mMinWidth
            r35 = r1
            int[] r1 = r0.mMaxDimension
            r1 = r1[r17]
            r36 = r1
            float r1 = r0.mHorizontalBiasPercent
            r37 = r1
            int r1 = r0.mMatchConstraintMinWidth
            r38 = r1
            int r1 = r0.mMatchConstraintMaxWidth
            r39 = r1
            float r1 = r0.mMatchConstraintPercentWidth
            r40 = r2
            r2 = 1
            r25 = r1
            r30 = r3
            r17 = r5
            r3 = r8
            r5 = r15
            r44 = r23
            r42 = r31
            r45 = r32
            r43 = r33
            r31 = r34
            r8 = r35
            r15 = r36
            r16 = r37
            r23 = r38
            r24 = r39
            r1 = r47
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L34f
        L347:
            r40 = r2
            r30 = r3
            r43 = r4
            goto L2c7
        L34f:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r2.start
            boolean r6 = r5.resolved
            if (r6 == 0) goto L39f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.end
            boolean r2 = r2.resolved
            if (r2 == 0) goto L39f
            int r2 = r5.value
            r5 = r42
            r1.addEquality(r5, r2)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.value
            r6 = r43
            r1.addEquality(r6, r2)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.baseline
            int r2 = r2.value
            r7 = r44
            r1.addEquality(r7, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.mParent
            if (r2 == 0) goto L39a
            if (r19 != 0) goto L39a
            if (r4 == 0) goto L39a
            boolean[] r8 = r0.isTerminalWidget
            r9 = 1
            boolean r8 = r8[r9]
            if (r8 == 0) goto L396
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.solver.SolverVariable r2 = r1.createObjectVariable(r2)
            r8 = 0
            r14 = 8
            r1.addGreaterThan(r2, r6, r8, r14)
            goto L39d
        L396:
            r8 = 0
        L397:
            r14 = 8
            goto L39d
        L39a:
            r8 = 0
            r9 = 1
            goto L397
        L39d:
            r2 = 0
            goto L3aa
        L39f:
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = 0
            r9 = 1
            r14 = 8
            r2 = 1
        L3aa:
            int r10 = r0.mVerticalResolution
            r11 = 2
            if (r10 != r11) goto L3b1
            r15 = 0
            goto L3b2
        L3b1:
            r15 = r2
        L3b2:
            if (r15 == 0) goto L46a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.mListDimensionBehaviors
            r2 = r2[r9]
            r10 = r45
            if (r2 != r10) goto L3c2
            boolean r2 = r0 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r2 == 0) goto L3c2
            r2 = 1
            goto L3c3
        L3c2:
            r2 = 0
        L3c3:
            if (r2 == 0) goto L3c7
            r13 = 0
            goto L3c9
        L3c7:
            r13 = r29
        L3c9:
            if (r30 == 0) goto L3d5
            int r10 = r0.mResolvedDimensionRatioSide
            if (r10 == r9) goto L3d2
            r11 = -1
            if (r10 != r11) goto L3d5
        L3d2:
            r17 = 1
            goto L3d7
        L3d5:
            r17 = 0
        L3d7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r0.mParent
            if (r10 == 0) goto L3e2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.mBottom
            androidx.constraintlayout.solver.SolverVariable r10 = r1.createObjectVariable(r10)
            goto L3e4
        L3e2:
            r10 = r28
        L3e4:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.mParent
            if (r11 == 0) goto L3ee
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTop
            androidx.constraintlayout.solver.SolverVariable r28 = r1.createObjectVariable(r11)
        L3ee:
            int r11 = r0.mBaselineDistance
            if (r11 > 0) goto L3f6
            int r11 = r0.mVisibility
            if (r11 != r14) goto L420
        L3f6:
            int r11 = r0.getBaselineDistance()
            r1.addEquality(r7, r5, r11, r14)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L419
            androidx.constraintlayout.solver.SolverVariable r11 = r1.createObjectVariable(r11)
            r1.addEquality(r7, r11, r8, r14)
            if (r4 == 0) goto L416
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mBottom
            androidx.constraintlayout.solver.SolverVariable r7 = r1.createObjectVariable(r7)
            r11 = 5
            r1.addGreaterThan(r10, r7, r8, r11)
        L416:
            r26 = 0
            goto L420
        L419:
            int r11 = r0.mVisibility
            if (r11 != r14) goto L420
            r1.addEquality(r7, r5, r8, r14)
        L420:
            boolean[] r7 = r0.isTerminalWidget
            boolean r7 = r7[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r0.mListDimensionBehaviors
            r8 = r8[r9]
            r42 = r5
            r5 = r7
            r7 = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBottom
            int r12 = r0.mY
            int r14 = r0.mMinHeight
            int[] r15 = r0.mMaxDimension
            r15 = r15[r9]
            float r9 = r0.mVerticalBiasPercent
            int r1 = r0.mMatchConstraintMinHeight
            r23 = r1
            int r1 = r0.mMatchConstraintMaxHeight
            r24 = r1
            float r1 = r0.mMatchConstraintPercentHeight
            r16 = r9
            r41 = 1
            r9 = r2
            r2 = 0
            r20 = r4
            r4 = r3
            r3 = r20
            r20 = r19
            r19 = r18
            r18 = r20
            r20 = r22
            r22 = r21
            r21 = r20
            r25 = r1
            r33 = r6
            r20 = r27
            r6 = r28
            r1 = r47
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L468:
            r7 = r0
            goto L46f
        L46a:
            r42 = r5
            r33 = r6
            goto L468
        L46f:
            if (r30 == 0) goto L487
            int r0 = r7.mResolvedDimensionRatioSide
            r6 = 8
            r5 = 1
            if (r0 != r5) goto L48a
            float r5 = r7.mResolvedDimensionRatio
            r0 = r47
            r3 = r31
            r1 = r33
            r4 = r40
            r2 = r42
            r0.addRatio(r1, r2, r3, r4, r5, r6)
        L487:
            r1 = r47
            goto L49a
        L48a:
            float r5 = r7.mResolvedDimensionRatio
            r0 = r47
            r1 = r31
            r3 = r33
            r2 = r40
            r4 = r42
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            r1 = r0
        L49a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mCenter
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L4c0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mCenter
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getOwner()
            float r2 = r7.mCircleConstraintAngle
            r3 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.toRadians(r2)
            float r2 = (float) r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.mCenter
            int r3 = r3.getMargin()
            r1.addCenterPoint(r7, r0, r2, r3)
        L4c0:
            return
    }

    public boolean allowedInBarrier() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public void connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r2, androidx.constraintlayout.solver.widgets.ConstraintWidget r3, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r4) {
            r1 = this;
            r0 = 0
            r1.connect(r2, r3, r4, r0)
            return
    }

    public void connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r9, androidx.constraintlayout.solver.widgets.ConstraintWidget r10, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r11, int r12) {
            r8 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            r1 = 0
            if (r9 != r0) goto Lbc
            if (r11 != r0) goto L81
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r8.getAnchor(r12)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r8.getAnchor(r5)
            r7 = 1
            if (r11 == 0) goto L28
            boolean r11 = r11.isConnected()
            if (r11 != 0) goto L30
        L28:
            if (r2 == 0) goto L32
            boolean r11 = r2.isConnected()
            if (r11 == 0) goto L32
        L30:
            r9 = 0
            goto L39
        L32:
            r8.connect(r9, r10, r9, r1)
            r8.connect(r12, r10, r12, r1)
            r9 = 1
        L39:
            if (r4 == 0) goto L41
            boolean r11 = r4.isConnected()
            if (r11 != 0) goto L49
        L41:
            if (r6 == 0) goto L4b
            boolean r11 = r6.isConnected()
            if (r11 == 0) goto L4b
        L49:
            r7 = 0
            goto L51
        L4b:
            r8.connect(r3, r10, r3, r1)
            r8.connect(r5, r10, r5, r1)
        L51:
            if (r9 == 0) goto L61
            if (r7 == 0) goto L61
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r0)
            r9.connect(r10, r1)
            return
        L61:
            if (r9 == 0) goto L71
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r11.connect(r9, r1)
            return
        L71:
            if (r7 == 0) goto L1f2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r11.connect(r9, r1)
            return
        L81:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r11 == r9) goto La6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r12) goto L8a
            goto La6
        L8a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r9) goto L92
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r12) goto L1f2
        L92:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            return
        La6:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            r8.connect(r9, r10, r11, r1)     // Catch: java.lang.Throwable -> Lba
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            return
        Lba:
            r9 = move-exception
            throw r9
        Lbc:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            if (r9 != r2) goto Le4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r11 == r3) goto Lc8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r4) goto Le4
        Lc8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            r9.connect(r10, r1)
            r11.connect(r10, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
            r9.connect(r10, r1)
            return
        Le4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r9 != r3) goto L10c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r4) goto Lf0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r5) goto L10c
        Lf0:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r11)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r8.getAnchor(r4)
            r10.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r8.getAnchor(r10)
            r10.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r8.getAnchor(r3)
            r10.connect(r9, r1)
            return
        L10c:
            if (r9 != r2) goto L136
            if (r11 != r2) goto L136
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            return
        L136:
            if (r9 != r3) goto L160
            if (r11 != r3) goto L160
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            return
        L160:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            boolean r11 = r4.isValidConnection(r10)
            if (r11 == 0) goto L1f2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            if (r9 != r11) goto L18a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r9 == 0) goto L183
            r9.reset()
        L183:
            if (r11 == 0) goto L188
            r11.reset()
        L188:
            r12 = 0
            goto L1ef
        L18a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r9 == r1) goto L1c1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r9 != r1) goto L193
            goto L1c1
        L193:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r9 == r11) goto L19b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r9 != r11) goto L1ef
        L19b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L1a8
            r11.reset()
        L1a8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r2)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L1ef
            r9.reset()
            r11.reset()
            goto L1ef
        L1c1:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r11 == 0) goto L1ca
            r11.reset()
        L1ca:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L1d7
            r11.reset()
        L1d7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r8.getAnchor(r3)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L1ef
            r9.reset()
            r11.reset()
        L1ef:
            r4.connect(r10, r12)
        L1f2:
            return
    }

    public void connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor r2, androidx.constraintlayout.solver.widgets.ConstraintAnchor r3, int r4) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.getOwner()
            if (r0 != r1) goto L15
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = r2.getType()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.getOwner()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = r3.getType()
            r1.connect(r2, r0, r3, r4)
        L15:
            return
    }

    public void connectCircularConstraint(androidx.constraintlayout.solver.widgets.ConstraintWidget r7, float r8, int r9) {
            r6 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            r5 = 0
            r3 = r1
            r0 = r6
            r2 = r7
            r4 = r9
            r0.immediateConnect(r1, r2, r3, r4, r5)
            r0.mCircleConstraintAngle = r8
            return
    }

    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget r7, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> r8) {
            r6 = this;
            int r0 = r7.mHorizontalResolution
            r6.mHorizontalResolution = r0
            int r0 = r7.mVerticalResolution
            r6.mVerticalResolution = r0
            int r0 = r7.mMatchConstraintDefaultWidth
            r6.mMatchConstraintDefaultWidth = r0
            int r0 = r7.mMatchConstraintDefaultHeight
            r6.mMatchConstraintDefaultHeight = r0
            int[] r0 = r6.mResolvedMatchConstraintDefault
            int[] r1 = r7.mResolvedMatchConstraintDefault
            r2 = 0
            r3 = r1[r2]
            r0[r2] = r3
            r3 = 1
            r1 = r1[r3]
            r0[r3] = r1
            int r0 = r7.mMatchConstraintMinWidth
            r6.mMatchConstraintMinWidth = r0
            int r0 = r7.mMatchConstraintMaxWidth
            r6.mMatchConstraintMaxWidth = r0
            int r0 = r7.mMatchConstraintMinHeight
            r6.mMatchConstraintMinHeight = r0
            int r0 = r7.mMatchConstraintMaxHeight
            r6.mMatchConstraintMaxHeight = r0
            float r0 = r7.mMatchConstraintPercentHeight
            r6.mMatchConstraintPercentHeight = r0
            boolean r0 = r7.mIsWidthWrapContent
            r6.mIsWidthWrapContent = r0
            boolean r0 = r7.mIsHeightWrapContent
            r6.mIsHeightWrapContent = r0
            int r0 = r7.mResolvedDimensionRatioSide
            r6.mResolvedDimensionRatioSide = r0
            float r0 = r7.mResolvedDimensionRatio
            r6.mResolvedDimensionRatio = r0
            int[] r0 = r7.mMaxDimension
            int r1 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r6.mMaxDimension = r0
            float r0 = r7.mCircleConstraintAngle
            r6.mCircleConstraintAngle = r0
            boolean r0 = r7.hasBaseline
            r6.hasBaseline = r0
            boolean r0 = r7.inPlaceholder
            r6.inPlaceholder = r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mLeft
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mTop
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mRight
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mBottom
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mBaseline
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mCenterX
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mCenterY
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mCenter
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.mListDimensionBehaviors
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[]) r0
            r6.mListDimensionBehaviors = r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.mParent
            r1 = 0
            if (r0 != 0) goto L91
            r0 = r1
            goto L99
        L91:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.mParent
            java.lang.Object r0 = r8.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r0
        L99:
            r6.mParent = r0
            int r0 = r7.mWidth
            r6.mWidth = r0
            int r0 = r7.mHeight
            r6.mHeight = r0
            float r0 = r7.mDimensionRatio
            r6.mDimensionRatio = r0
            int r0 = r7.mDimensionRatioSide
            r6.mDimensionRatioSide = r0
            int r0 = r7.mX
            r6.mX = r0
            int r0 = r7.mY
            r6.mY = r0
            int r0 = r7.mRelX
            r6.mRelX = r0
            int r0 = r7.mRelY
            r6.mRelY = r0
            int r0 = r7.mOffsetX
            r6.mOffsetX = r0
            int r0 = r7.mOffsetY
            r6.mOffsetY = r0
            int r0 = r7.mBaselineDistance
            r6.mBaselineDistance = r0
            int r0 = r7.mMinWidth
            r6.mMinWidth = r0
            int r0 = r7.mMinHeight
            r6.mMinHeight = r0
            float r0 = r7.mHorizontalBiasPercent
            r6.mHorizontalBiasPercent = r0
            float r0 = r7.mVerticalBiasPercent
            r6.mVerticalBiasPercent = r0
            java.lang.Object r0 = r7.mCompanionWidget
            r6.mCompanionWidget = r0
            int r0 = r7.mContainerItemSkip
            r6.mContainerItemSkip = r0
            int r0 = r7.mVisibility
            r6.mVisibility = r0
            java.lang.String r0 = r7.mDebugName
            r6.mDebugName = r0
            java.lang.String r0 = r7.mType
            r6.mType = r0
            int r0 = r7.mDistToTop
            r6.mDistToTop = r0
            int r0 = r7.mDistToLeft
            r6.mDistToLeft = r0
            int r0 = r7.mDistToRight
            r6.mDistToRight = r0
            int r0 = r7.mDistToBottom
            r6.mDistToBottom = r0
            boolean r0 = r7.mLeftHasCentered
            r6.mLeftHasCentered = r0
            boolean r0 = r7.mRightHasCentered
            r6.mRightHasCentered = r0
            boolean r0 = r7.mTopHasCentered
            r6.mTopHasCentered = r0
            boolean r0 = r7.mBottomHasCentered
            r6.mBottomHasCentered = r0
            boolean r0 = r7.mHorizontalWrapVisited
            r6.mHorizontalWrapVisited = r0
            boolean r0 = r7.mVerticalWrapVisited
            r6.mVerticalWrapVisited = r0
            boolean r0 = r7.mOptimizerMeasurable
            r6.mOptimizerMeasurable = r0
            boolean r0 = r7.mGroupsToSolver
            r6.mGroupsToSolver = r0
            int r0 = r7.mHorizontalChainStyle
            r6.mHorizontalChainStyle = r0
            int r0 = r7.mVerticalChainStyle
            r6.mVerticalChainStyle = r0
            boolean r0 = r7.mHorizontalChainFixedPosition
            r6.mHorizontalChainFixedPosition = r0
            boolean r0 = r7.mVerticalChainFixedPosition
            r6.mVerticalChainFixedPosition = r0
            float[] r0 = r6.mWeight
            float[] r4 = r7.mWeight
            r5 = r4[r2]
            r0[r2] = r5
            r4 = r4[r3]
            r0[r3] = r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r6.mListNextMatchConstraintsWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = r7.mListNextMatchConstraintsWidget
            r5 = r4[r2]
            r0[r2] = r5
            r4 = r4[r3]
            r0[r3] = r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r6.mNextChainWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = r7.mNextChainWidget
            r5 = r4[r2]
            r0[r2] = r5
            r2 = r4[r3]
            r0[r3] = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.mHorizontalNextWidget
            if (r0 != 0) goto L155
            r0 = r1
            goto L15b
        L155:
            java.lang.Object r0 = r8.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r0
        L15b:
            r6.mHorizontalNextWidget = r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.mVerticalNextWidget
            if (r7 != 0) goto L162
            goto L169
        L162:
            java.lang.Object r7 = r8.get(r7)
            r1 = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r1
        L169:
            r6.mVerticalNextWidget = r1
            return
    }

    public void createObjectVariables(androidx.constraintlayout.solver.LinearSystem r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mLeft
            r2.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTop
            r2.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mRight
            r2.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mBottom
            r2.createObjectVariable(r0)
            int r0 = r1.mBaselineDistance
            if (r0 <= 0) goto L1d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mBaseline
            r2.createObjectVariable(r0)
        L1d:
            return
    }

    public androidx.constraintlayout.solver.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L17;
                case 9: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r3 = r3.name()
            r0.<init>(r3)
            throw r0
        L15:
            r3 = 0
            return r3
        L17:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mCenterY
            return r3
        L1a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mCenterX
            return r3
        L1d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mCenter
            return r3
        L20:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mBaseline
            return r3
        L23:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mBottom
            return r3
        L26:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mRight
            return r3
        L29:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mTop
            return r3
        L2c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mLeft
            return r3
    }

    public java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> getAnchors() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.mAnchors
            return r0
    }

    public int getBaselineDistance() {
            r1 = this;
            int r0 = r1.mBaselineDistance
            return r0
    }

    public float getBiasPercent(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            float r2 = r1.mHorizontalBiasPercent
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            float r2 = r1.mVerticalBiasPercent
            return r2
        Lb:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r2
    }

    public int getBottom() {
            r2 = this;
            int r0 = r2.getY()
            int r1 = r2.mHeight
            int r0 = r0 + r1
            return r0
    }

    public java.lang.Object getCompanionWidget() {
            r1 = this;
            java.lang.Object r0 = r1.mCompanionWidget
            return r0
    }

    public int getContainerItemSkip() {
            r1 = this;
            int r0 = r1.mContainerItemSkip
            return r0
    }

    public java.lang.String getDebugName() {
            r1 = this;
            java.lang.String r0 = r1.mDebugName
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour getDimensionBehaviour(int r2) {
            r1 = this;
            if (r2 != 0) goto L7
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r1.getHorizontalDimensionBehaviour()
            return r2
        L7:
            r0 = 1
            if (r2 != r0) goto Lf
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r1.getVerticalDimensionBehaviour()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public float getDimensionRatio() {
            r1 = this;
            float r0 = r1.mDimensionRatio
            return r0
    }

    public int getDimensionRatioSide() {
            r1 = this;
            int r0 = r1.mDimensionRatioSide
            return r0
    }

    public boolean getHasBaseline() {
            r1 = this;
            boolean r0 = r1.hasBaseline
            return r0
    }

    public int getHeight() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.mHeight
            return r0
    }

    public float getHorizontalBiasPercent() {
            r1 = this;
            float r0 = r1.mHorizontalBiasPercent
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getHorizontalChainControlWidget() {
            r5 = this;
            boolean r0 = r5.isInHorizontalChain()
            r1 = 0
            if (r0 == 0) goto L45
            r2 = r5
            r0 = r1
        L9:
            if (r0 != 0) goto L44
            if (r2 == 0) goto L44
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.getAnchor(r3)
            if (r3 != 0) goto L17
            r3 = r1
            goto L1b
        L17:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.getTarget()
        L1b:
            if (r3 != 0) goto L1f
            r3 = r1
            goto L23
        L1f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.getOwner()
        L23:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r5.getParent()
            if (r3 != r4) goto L2a
            return r2
        L2a:
            if (r3 != 0) goto L2e
            r4 = r1
            goto L38
        L2e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.getTarget()
        L38:
            if (r4 == 0) goto L42
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.getOwner()
            if (r4 == r2) goto L42
            r0 = r2
            goto L9
        L42:
            r2 = r3
            goto L9
        L44:
            return r0
        L45:
            return r1
    }

    public int getHorizontalChainStyle() {
            r1 = this;
            int r0 = r1.mHorizontalChainStyle
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour getHorizontalDimensionBehaviour() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getHorizontalMargin() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mLeft
            if (r0 == 0) goto L7
            int r0 = r0.mMargin
            goto L8
        L7:
            r0 = 0
        L8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mRight
            if (r1 == 0) goto Lf
            int r1 = r1.mMargin
            int r0 = r0 + r1
        Lf:
            return r0
    }

    public int getLeft() {
            r1 = this;
            int r0 = r1.getX()
            return r0
    }

    public int getLength(int r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.getWidth()
            return r2
        L7:
            r0 = 1
            if (r2 != r0) goto Lf
            int r2 = r1.getHeight()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int getMaxHeight() {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public int getMaxWidth() {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.mMinHeight
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.mMinWidth
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getNextChainMember(int r3) {
            r2 = this;
            if (r3 != 0) goto Lf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        Lf:
            r0 = 1
            if (r3 != r0) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public int getOptimizerWrapHeight() {
            r4 = this;
            int r0 = r4.mHeight
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r4.mListDimensionBehaviors
            r2 = 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L25
            int r1 = r4.mMatchConstraintDefaultHeight
            if (r1 != r2) goto L16
            int r1 = r4.mMatchConstraintMinHeight
            int r0 = java.lang.Math.max(r1, r0)
            goto L1e
        L16:
            int r0 = r4.mMatchConstraintMinHeight
            if (r0 <= 0) goto L1d
            r4.mHeight = r0
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r1 = r4.mMatchConstraintMaxHeight
            if (r1 <= 0) goto L25
            if (r1 >= r0) goto L25
            return r1
        L25:
            return r0
    }

    public int getOptimizerWrapWidth() {
            r4 = this;
            int r0 = r4.mWidth
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r4.mListDimensionBehaviors
            r2 = 0
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L26
            int r1 = r4.mMatchConstraintDefaultWidth
            r3 = 1
            if (r1 != r3) goto L17
            int r1 = r4.mMatchConstraintMinWidth
            int r2 = java.lang.Math.max(r1, r0)
            goto L1e
        L17:
            int r0 = r4.mMatchConstraintMinWidth
            if (r0 <= 0) goto L1e
            r4.mWidth = r0
            r2 = r0
        L1e:
            int r0 = r4.mMatchConstraintMaxWidth
            if (r0 <= 0) goto L25
            if (r0 >= r2) goto L25
            return r0
        L25:
            return r2
        L26:
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getParent() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mParent
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getPreviousChainMember(int r3) {
            r2 = this;
            if (r3 != 0) goto Lf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        Lf:
            r0 = 1
            if (r3 != r0) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L1f:
            r3 = 0
            return r3
    }

    int getRelativePositioning(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            int r2 = r1.mRelX
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            int r2 = r1.mRelY
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public int getRight() {
            r2 = this;
            int r0 = r2.getX()
            int r1 = r2.mWidth
            int r0 = r0 + r1
            return r0
    }

    protected int getRootX() {
            r2 = this;
            int r0 = r2.mX
            int r1 = r2.mOffsetX
            int r0 = r0 + r1
            return r0
    }

    protected int getRootY() {
            r2 = this;
            int r0 = r2.mY
            int r1 = r2.mOffsetY
            int r0 = r0 + r1
            return r0
    }

    public androidx.constraintlayout.solver.widgets.analyzer.WidgetRun getRun(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public int getTop() {
            r1 = this;
            int r0 = r1.getY()
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.mType
            return r0
    }

    public float getVerticalBiasPercent() {
            r1 = this;
            float r0 = r1.mVerticalBiasPercent
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getVerticalChainControlWidget() {
            r5 = this;
            boolean r0 = r5.isInVerticalChain()
            r1 = 0
            if (r0 == 0) goto L45
            r2 = r5
            r0 = r1
        L9:
            if (r0 != 0) goto L44
            if (r2 == 0) goto L44
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.getAnchor(r3)
            if (r3 != 0) goto L17
            r3 = r1
            goto L1b
        L17:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.getTarget()
        L1b:
            if (r3 != 0) goto L1f
            r3 = r1
            goto L23
        L1f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.getOwner()
        L23:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r5.getParent()
            if (r3 != r4) goto L2a
            return r2
        L2a:
            if (r3 != 0) goto L2e
            r4 = r1
            goto L38
        L2e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.getTarget()
        L38:
            if (r4 == 0) goto L42
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.getOwner()
            if (r4 == r2) goto L42
            r0 = r2
            goto L9
        L42:
            r2 = r3
            goto L9
        L44:
            return r0
        L45:
            return r1
    }

    public int getVerticalChainStyle() {
            r1 = this;
            int r0 = r1.mVerticalChainStyle
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour getVerticalDimensionBehaviour() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public int getVerticalMargin() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mLeft
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mTop
            int r0 = r0.mMargin
            goto La
        L9:
            r0 = 0
        La:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mRight
            if (r1 == 0) goto L13
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.mBottom
            int r1 = r1.mMargin
            int r0 = r0 + r1
        L13:
            return r0
    }

    public int getVisibility() {
            r1 = this;
            int r0 = r1.mVisibility
            return r0
    }

    public int getWidth() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.mWidth
            return r0
    }

    public int getX() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mParent
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L10
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            int r0 = r0.mPaddingLeft
            int r1 = r2.mX
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.mX
            return r0
    }

    public int getY() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mParent
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L10
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            int r0 = r0.mPaddingTop
            int r1 = r2.mY
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.mY
            return r0
    }

    public boolean hasBaseline() {
            r1 = this;
            boolean r0 = r1.hasBaseline
            return r0
    }

    public void immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r1, androidx.constraintlayout.solver.widgets.ConstraintWidget r2, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r3, int r4, int r5) {
            r0 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.getAnchor(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getAnchor(r3)
            r3 = 1
            r1.connect(r2, r4, r5, r3)
            return
    }

    public boolean isHeightWrapContent() {
            r1 = this;
            boolean r0 = r1.mIsHeightWrapContent
            return r0
    }

    public boolean isInHorizontalChain() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto La
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == r0) goto L14
        La:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto L16
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != r0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean isInPlaceholder() {
            r1 = this;
            boolean r0 = r1.inPlaceholder
            return r0
    }

    public boolean isInVerticalChain() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto La
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == r0) goto L14
        La:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto L16
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != r0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean isInVirtualLayout() {
            r1 = this;
            boolean r0 = r1.mInVirtuaLayout
            return r0
    }

    public boolean isRoot() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mParent
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isSpreadHeight() {
            r3 = this;
            int r0 = r3.mMatchConstraintDefaultHeight
            if (r0 != 0) goto L1d
            float r0 = r3.mDimensionRatio
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMinHeight
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMaxHeight
            if (r0 != 0) goto L1d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r3.mListDimensionBehaviors
            r1 = 1
            r0 = r0[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L1d
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public boolean isSpreadWidth() {
            r3 = this;
            int r0 = r3.mMatchConstraintDefaultWidth
            r1 = 0
            if (r0 != 0) goto L1e
            float r0 = r3.mDimensionRatio
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1e
            int r0 = r3.mMatchConstraintMinWidth
            if (r0 != 0) goto L1e
            int r0 = r3.mMatchConstraintMaxWidth
            if (r0 != 0) goto L1e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r3.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L1e
            r0 = 1
            return r0
        L1e:
            return r1
    }

    public boolean isWidthWrapContent() {
            r1 = this;
            boolean r0 = r1.mIsWidthWrapContent
            return r0
    }

    public void reset() {
            r6 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mLeft
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mTop
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mRight
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mBottom
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mBaseline
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mCenterX
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mCenterY
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mCenter
            r0.reset()
            r0 = 0
            r6.mParent = r0
            r1 = 0
            r6.mCircleConstraintAngle = r1
            r2 = 0
            r6.mWidth = r2
            r6.mHeight = r2
            r6.mDimensionRatio = r1
            r1 = -1
            r6.mDimensionRatioSide = r1
            r6.mX = r2
            r6.mY = r2
            r6.mOffsetX = r2
            r6.mOffsetY = r2
            r6.mBaselineDistance = r2
            r6.mMinWidth = r2
            r6.mMinHeight = r2
            float r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DEFAULT_BIAS
            r6.mHorizontalBiasPercent = r3
            r6.mVerticalBiasPercent = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r6.mListDimensionBehaviors
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3[r2] = r4
            r5 = 1
            r3[r5] = r4
            r6.mCompanionWidget = r0
            r6.mContainerItemSkip = r2
            r6.mVisibility = r2
            r6.mType = r0
            r6.mHorizontalWrapVisited = r2
            r6.mVerticalWrapVisited = r2
            r6.mHorizontalChainStyle = r2
            r6.mVerticalChainStyle = r2
            r6.mHorizontalChainFixedPosition = r2
            r6.mVerticalChainFixedPosition = r2
            float[] r0 = r6.mWeight
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0[r2] = r3
            r0[r5] = r3
            r6.mHorizontalResolution = r1
            r6.mVerticalResolution = r1
            int[] r0 = r6.mMaxDimension
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0[r2] = r3
            r0[r5] = r3
            r6.mMatchConstraintDefaultWidth = r2
            r6.mMatchConstraintDefaultHeight = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.mMatchConstraintPercentWidth = r0
            r6.mMatchConstraintPercentHeight = r0
            r6.mMatchConstraintMaxWidth = r3
            r6.mMatchConstraintMaxHeight = r3
            r6.mMatchConstraintMinWidth = r2
            r6.mMatchConstraintMinHeight = r2
            r6.mResolvedHasRatio = r2
            r6.mResolvedDimensionRatioSide = r1
            r6.mResolvedDimensionRatio = r0
            r6.mOptimizerMeasurable = r2
            r6.mGroupsToSolver = r2
            boolean[] r0 = r6.isTerminalWidget
            r0[r2] = r5
            r0[r5] = r5
            r6.mInVirtuaLayout = r2
            boolean[] r0 = r6.mIsInBarrier
            r0[r2] = r2
            r0[r5] = r2
            return
    }

    public void resetAllConstraints() {
            r1 = this;
            r1.resetAnchors()
            float r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DEFAULT_BIAS
            r1.setVerticalBiasPercent(r0)
            float r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DEFAULT_BIAS
            r1.setHorizontalBiasPercent(r0)
            return
    }

    public void resetAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor r9) {
            r8 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.getParent()
            if (r0 == 0) goto L1b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L1b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.getParent()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.handlesInternalConstraints()
            if (r0 == 0) goto L1b
            return
        L1b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r8.getAnchor(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r8.getAnchor(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r8.getAnchor(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.getAnchor(r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r8.getAnchor(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r8.getAnchor(r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r4) goto L87
            boolean r4 = r0.isConnected()
            if (r4 == 0) goto L65
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L65
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.getTarget()
            if (r4 != r5) goto L65
            r0.reset()
            r1.reset()
        L65:
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L81
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L81
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r3.getTarget()
            if (r0 != r1) goto L81
            r2.reset()
            r3.reset()
        L81:
            r8.mHorizontalBiasPercent = r7
            r8.mVerticalBiasPercent = r7
            goto L109
        L87:
            if (r9 != r5) goto Lb0
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto Lad
            boolean r2 = r1.isConnected()
            if (r2 == 0) goto Lad
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.getOwner()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.getOwner()
            if (r2 != r3) goto Lad
            r0.reset()
            r1.reset()
        Lad:
            r8.mHorizontalBiasPercent = r7
            goto L109
        Lb0:
            if (r9 != r6) goto Ld9
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto Ld6
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto Ld6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getOwner()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r3.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.getOwner()
            if (r0 != r1) goto Ld6
            r2.reset()
            r3.reset()
        Ld6:
            r8.mVerticalBiasPercent = r7
            goto L109
        Ld9:
            if (r9 == r0) goto Lf6
            if (r9 != r1) goto Lde
            goto Lf6
        Lde:
            if (r9 == r2) goto Le2
            if (r9 != r3) goto L109
        Le2:
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L109
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r3.getTarget()
            if (r0 != r1) goto L109
            r4.reset()
            goto L109
        Lf6:
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto L109
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.getTarget()
            if (r0 != r1) goto L109
            r4.reset()
        L109:
            r9.reset()
            return
    }

    public void resetAnchors() {
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.getParent()
            if (r0 == 0) goto L17
            boolean r0 = r0 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L17
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.getParent()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.handlesInternalConstraints()
            if (r0 == 0) goto L17
            goto L2e
        L17:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r3.mAnchors
            int r0 = r0.size()
            r1 = 0
        L1e:
            if (r1 >= r0) goto L2e
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r3.mAnchors
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r2
            r2.reset()
            int r1 = r1 + 1
            goto L1e
        L2e:
            return
    }

    public void resetSolverVariables(androidx.constraintlayout.solver.Cache r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mLeft
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTop
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mRight
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mBottom
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mBaseline
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mCenter
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mCenterX
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mCenterY
            r0.resetSolverVariable(r2)
            return
    }

    public void setBaselineDistance(int r1) {
            r0 = this;
            r0.mBaselineDistance = r1
            if (r1 <= 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.hasBaseline = r1
            return
    }

    public void setCompanionWidget(java.lang.Object r1) {
            r0 = this;
            r0.mCompanionWidget = r1
            return
    }

    public void setContainerItemSkip(int r1) {
            r0 = this;
            if (r1 < 0) goto L5
            r0.mContainerItemSkip = r1
            return
        L5:
            r1 = 0
            r0.mContainerItemSkip = r1
            return
    }

    public void setDebugName(java.lang.String r1) {
            r0 = this;
            r0.mDebugName = r1
            return
    }

    public void setDebugSolverName(androidx.constraintlayout.solver.LinearSystem r7, java.lang.String r8) {
            r6 = this;
            r6.mDebugName = r8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mLeft
            androidx.constraintlayout.solver.SolverVariable r0 = r7.createObjectVariable(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r6.mTop
            androidx.constraintlayout.solver.SolverVariable r1 = r7.createObjectVariable(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r6.mRight
            androidx.constraintlayout.solver.SolverVariable r2 = r7.createObjectVariable(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r6.mBottom
            androidx.constraintlayout.solver.SolverVariable r3 = r7.createObjectVariable(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r5 = ".left"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.setName(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r4 = ".top"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.setName(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".right"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setName(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".bottom"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setName(r0)
            int r0 = r6.mBaselineDistance
            if (r0 <= 0) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mBaseline
            androidx.constraintlayout.solver.SolverVariable r7 = r7.createObjectVariable(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = ".baseline"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.setName(r8)
        L88:
            return
    }

    public void setDimension(int r2, int r3) {
            r1 = this;
            r1.mWidth = r2
            int r0 = r1.mMinWidth
            if (r2 >= r0) goto L8
            r1.mWidth = r0
        L8:
            r1.mHeight = r3
            int r2 = r1.mMinHeight
            if (r3 >= r2) goto L10
            r1.mHeight = r2
        L10:
            return
    }

    public void setDimensionRatio(float r1, int r2) {
            r0 = this;
            r0.mDimensionRatio = r1
            r0.mDimensionRatioSide = r2
            return
    }

    public void setDimensionRatio(java.lang.String r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L91
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L91
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = -1
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L87
            int r2 = r9.length()
            if (r2 <= 0) goto L87
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L87
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L87
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L87
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L86:
        L87:
            r9 = 0
        L88:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L90
            r8.mDimensionRatio = r9
            r8.mDimensionRatioSide = r5
        L90:
            return
        L91:
            r8.mDimensionRatio = r0
            return
    }

    public void setFrame(int r2, int r3, int r4) {
            r1 = this;
            if (r4 != 0) goto L6
            r1.setHorizontalDimension(r2, r3)
            return
        L6:
            r0 = 1
            if (r4 != r0) goto Lc
            r1.setVerticalDimension(r2, r3)
        Lc:
            return
    }

    public void setFrame(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r4 = r4 - r2
            int r5 = r5 - r3
            r1.mX = r2
            r1.mY = r3
            int r2 = r1.mVisibility
            r3 = 8
            r0 = 0
            if (r2 != r3) goto L12
            r1.mWidth = r0
            r1.mHeight = r0
            return
        L12:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.mListDimensionBehaviors
            r3 = r2[r0]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r0) goto L1f
            int r3 = r1.mWidth
            if (r4 >= r3) goto L1f
            r4 = r3
        L1f:
            r3 = 1
            r2 = r2[r3]
            if (r2 != r0) goto L29
            int r2 = r1.mHeight
            if (r5 >= r2) goto L29
            r5 = r2
        L29:
            r1.mWidth = r4
            r1.mHeight = r5
            int r2 = r1.mMinHeight
            if (r5 >= r2) goto L33
            r1.mHeight = r2
        L33:
            int r2 = r1.mMinWidth
            if (r4 >= r2) goto L39
            r1.mWidth = r2
        L39:
            return
    }

    public void setGoneMargin(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r2, int r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L24
            r0 = 2
            if (r2 == r0) goto L1f
            r0 = 3
            if (r2 == r0) goto L1a
            r0 = 4
            if (r2 == r0) goto L15
            return
        L15:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mBottom
            r2.mGoneMargin = r3
            return
        L1a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mRight
            r2.mGoneMargin = r3
            return
        L1f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mTop
            r2.mGoneMargin = r3
            return
        L24:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mLeft
            r2.mGoneMargin = r3
            return
    }

    public void setHasBaseline(boolean r1) {
            r0 = this;
            r0.hasBaseline = r1
            return
    }

    public void setHeight(int r2) {
            r1 = this;
            r1.mHeight = r2
            int r0 = r1.mMinHeight
            if (r2 >= r0) goto L8
            r1.mHeight = r0
        L8:
            return
    }

    public void setHeightWrapContent(boolean r1) {
            r0 = this;
            r0.mIsHeightWrapContent = r1
            return
    }

    public void setHorizontalBiasPercent(float r1) {
            r0 = this;
            r0.mHorizontalBiasPercent = r1
            return
    }

    public void setHorizontalChainStyle(int r1) {
            r0 = this;
            r0.mHorizontalChainStyle = r1
            return
    }

    public void setHorizontalDimension(int r1, int r2) {
            r0 = this;
            r0.mX = r1
            int r2 = r2 - r1
            r0.mWidth = r2
            int r1 = r0.mMinWidth
            if (r2 >= r1) goto Lb
            r0.mWidth = r1
        Lb:
            return
    }

    public void setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r3) {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 0
            r0[r1] = r3
            return
    }

    public void setHorizontalMatchStyle(int r1, int r2, int r3, float r4) {
            r0 = this;
            r0.mMatchConstraintDefaultWidth = r1
            r0.mMatchConstraintMinWidth = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto La
            r3 = 0
        La:
            r0.mMatchConstraintMaxWidth = r3
            r0.mMatchConstraintPercentWidth = r4
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            if (r1 != 0) goto L1e
            r1 = 2
            r0.mMatchConstraintDefaultWidth = r1
        L1e:
            return
    }

    public void setHorizontalWeight(float r3) {
            r2 = this;
            float[] r0 = r2.mWeight
            r1 = 0
            r0[r1] = r3
            return
    }

    protected void setInBarrier(int r2, boolean r3) {
            r1 = this;
            boolean[] r0 = r1.mIsInBarrier
            r0[r2] = r3
            return
    }

    public void setInPlaceholder(boolean r1) {
            r0 = this;
            r0.inPlaceholder = r1
            return
    }

    public void setInVirtualLayout(boolean r1) {
            r0 = this;
            r0.mInVirtuaLayout = r1
            return
    }

    public void setLength(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r1.setWidth(r2)
            return
        L6:
            r0 = 1
            if (r3 != r0) goto Lc
            r1.setHeight(r2)
        Lc:
            return
    }

    public void setMaxHeight(int r3) {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setMaxWidth(int r3) {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 0
            r0[r1] = r3
            return
    }

    public void setMinHeight(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            r1 = 0
            r0.mMinHeight = r1
            return
        L6:
            r0.mMinHeight = r1
            return
    }

    public void setMinWidth(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            r1 = 0
            r0.mMinWidth = r1
            return
        L6:
            r0.mMinWidth = r1
            return
    }

    public void setOffset(int r1, int r2) {
            r0 = this;
            r0.mOffsetX = r1
            r0.mOffsetY = r2
            return
    }

    public void setOrigin(int r1, int r2) {
            r0 = this;
            r0.mX = r1
            r0.mY = r2
            return
    }

    public void setParent(androidx.constraintlayout.solver.widgets.ConstraintWidget r1) {
            r0 = this;
            r0.mParent = r1
            return
    }

    void setRelativePositioning(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L5
            r1.mRelX = r2
            return
        L5:
            r0 = 1
            if (r3 != r0) goto La
            r1.mRelY = r2
        La:
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setVerticalBiasPercent(float r1) {
            r0 = this;
            r0.mVerticalBiasPercent = r1
            return
    }

    public void setVerticalChainStyle(int r1) {
            r0 = this;
            r0.mVerticalChainStyle = r1
            return
    }

    public void setVerticalDimension(int r1, int r2) {
            r0 = this;
            r0.mY = r1
            int r2 = r2 - r1
            r0.mHeight = r2
            int r1 = r0.mMinHeight
            if (r2 >= r1) goto Lb
            r0.mHeight = r1
        Lb:
            return
    }

    public void setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r3) {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setVerticalMatchStyle(int r1, int r2, int r3, float r4) {
            r0 = this;
            r0.mMatchConstraintDefaultHeight = r1
            r0.mMatchConstraintMinHeight = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto La
            r3 = 0
        La:
            r0.mMatchConstraintMaxHeight = r3
            r0.mMatchConstraintPercentHeight = r4
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            if (r1 != 0) goto L1e
            r1 = 2
            r0.mMatchConstraintDefaultHeight = r1
        L1e:
            return
    }

    public void setVerticalWeight(float r3) {
            r2 = this;
            float[] r0 = r2.mWeight
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setVisibility(int r1) {
            r0 = this;
            r0.mVisibility = r1
            return
    }

    public void setWidth(int r2) {
            r1 = this;
            r1.mWidth = r2
            int r0 = r1.mMinWidth
            if (r2 >= r0) goto L8
            r1.mWidth = r0
        L8:
            return
    }

    public void setWidthWrapContent(boolean r1) {
            r0 = this;
            r0.mIsWidthWrapContent = r1
            return
    }

    public void setX(int r1) {
            r0 = this;
            r0.mX = r1
            return
    }

    public void setY(int r1) {
            r0 = this;
            r0.mY = r1
            return
    }

    public void setupDimensionRatio(boolean r4, boolean r5, boolean r6, boolean r7) {
            r3 = this;
            int r4 = r3.mResolvedDimensionRatioSide
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r1 = 1
            r2 = -1
            if (r4 != r2) goto L20
            if (r6 == 0) goto L10
            if (r7 != 0) goto L10
            r3.mResolvedDimensionRatioSide = r0
            goto L20
        L10:
            if (r6 != 0) goto L20
            if (r7 == 0) goto L20
            r3.mResolvedDimensionRatioSide = r1
            int r4 = r3.mDimensionRatioSide
            if (r4 != r2) goto L20
            float r4 = r3.mResolvedDimensionRatio
            float r4 = r5 / r4
            r3.mResolvedDimensionRatio = r4
        L20:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != 0) goto L37
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L34
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L37
        L34:
            r3.mResolvedDimensionRatioSide = r1
            goto L4d
        L37:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r1) goto L4d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L4b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L4d
        L4b:
            r3.mResolvedDimensionRatioSide = r0
        L4d:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r2) goto L9c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L9c
        L71:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L84
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L84
            r3.mResolvedDimensionRatioSide = r0
            goto L9c
        L84:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L9c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L9c
            float r4 = r3.mResolvedDimensionRatio
            float r4 = r5 / r4
            r3.mResolvedDimensionRatio = r4
            r3.mResolvedDimensionRatioSide = r1
        L9c:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r2) goto Lb8
            int r4 = r3.mMatchConstraintMinWidth
            if (r4 <= 0) goto Lab
            int r6 = r3.mMatchConstraintMinHeight
            if (r6 != 0) goto Lab
            r3.mResolvedDimensionRatioSide = r0
            return
        Lab:
            if (r4 != 0) goto Lb8
            int r4 = r3.mMatchConstraintMinHeight
            if (r4 <= 0) goto Lb8
            float r4 = r3.mResolvedDimensionRatio
            float r5 = r5 / r4
            r3.mResolvedDimensionRatio = r5
            r3.mResolvedDimensionRatioSide = r1
        Lb8:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.mType
            java.lang.String r2 = ""
            java.lang.String r3 = " "
            if (r1 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "type: "
            r1.append(r4)
            java.lang.String r4 = r5.mType
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L25
        L24:
            r1 = r2
        L25:
            r0.append(r1)
            java.lang.String r1 = r5.mDebugName
            if (r1 == 0) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "id: "
            r1.append(r2)
            java.lang.String r2 = r5.mDebugName
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
        L42:
            r0.append(r2)
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r5.mX
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r1 = r5.mY
            r0.append(r1)
            java.lang.String r1 = ") - ("
            r0.append(r1)
            int r1 = r5.mWidth
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            int r1 = r5.mHeight
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void updateFromRuns(boolean r8, boolean r9) {
            r7 = this;
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            boolean r0 = r0.isResolved()
            r8 = r8 & r0
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r7.verticalRun
            boolean r0 = r0.isResolved()
            r9 = r9 & r0
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.start
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r7.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r2.start
            int r3 = r3.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.value
            int r4 = r0 - r1
            int r5 = r2 - r3
            r6 = 0
            if (r4 < 0) goto L40
            if (r5 < 0) goto L40
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L40
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto L40
            if (r3 == r4) goto L40
            if (r3 == r5) goto L40
            if (r0 == r4) goto L40
            if (r0 == r5) goto L40
            if (r2 == r4) goto L40
            if (r2 != r5) goto L44
        L40:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L44:
            int r0 = r0 - r1
            int r2 = r2 - r3
            if (r8 == 0) goto L4a
            r7.mX = r1
        L4a:
            if (r9 == 0) goto L4e
            r7.mY = r3
        L4e:
            int r1 = r7.mVisibility
            r3 = 8
            if (r1 != r3) goto L59
            r7.mWidth = r6
            r7.mHeight = r6
            return
        L59:
            if (r8 == 0) goto L70
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r7.mListDimensionBehaviors
            r8 = r8[r6]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r1) goto L68
            int r8 = r7.mWidth
            if (r0 >= r8) goto L68
            r0 = r8
        L68:
            r7.mWidth = r0
            int r8 = r7.mMinWidth
            if (r0 >= r8) goto L70
            r7.mWidth = r8
        L70:
            if (r9 == 0) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r7.mListDimensionBehaviors
            r9 = 1
            r8 = r8[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r9) goto L80
            int r8 = r7.mHeight
            if (r2 >= r8) goto L80
            r2 = r8
        L80:
            r7.mHeight = r2
            int r8 = r7.mMinHeight
            if (r2 >= r8) goto L88
            r7.mHeight = r8
        L88:
            return
    }

    public void updateFromSolver(androidx.constraintlayout.solver.LinearSystem r7) {
            r6 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.mLeft
            int r0 = r7.getObjectVariableValue(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r6.mTop
            int r1 = r7.getObjectVariableValue(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r6.mRight
            int r2 = r7.getObjectVariableValue(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r6.mBottom
            int r7 = r7.getObjectVariableValue(r3)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r6.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r3.start
            boolean r5 = r4.resolved
            if (r5 == 0) goto L2a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.end
            boolean r5 = r3.resolved
            if (r5 == 0) goto L2a
            int r0 = r4.value
            int r2 = r3.value
        L2a:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r3 = r6.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r3.start
            boolean r5 = r4.resolved
            if (r5 == 0) goto L3c
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.end
            boolean r5 = r3.resolved
            if (r5 == 0) goto L3c
            int r1 = r4.value
            int r7 = r3.value
        L3c:
            int r3 = r2 - r0
            int r4 = r7 - r1
            if (r3 < 0) goto L59
            if (r4 < 0) goto L59
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r3) goto L59
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L59
            if (r1 == r3) goto L59
            if (r1 == r4) goto L59
            if (r2 == r3) goto L59
            if (r2 == r4) goto L59
            if (r7 == r3) goto L59
            if (r7 != r4) goto L5d
        L59:
            r0 = 0
            r7 = 0
            r1 = 0
            r2 = 0
        L5d:
            r6.setFrame(r0, r1, r2, r7)
            return
    }
}
