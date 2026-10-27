package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final java.lang.String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final java.lang.String VERSION = "ConstraintLayout-2.0.1";
    android.util.SparseArray<android.view.View> mChildrenByIds;
    private java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.ConstraintLayoutStates mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    androidx.constraintlayout.widget.ConstraintLayout.Measurer mMeasurer;
    private androidx.constraintlayout.solver.Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> mTempMapIdToWidget;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = null;

        static {
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = r0
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public java.lang.String constraintTag;
        public java.lang.String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        boolean isVirtualGroup;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        androidx.constraintlayout.solver.widgets.ConstraintWidget widget;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final android.util.SparseIntArray map = null;

            static {
                    android.util.SparseIntArray r0 = new android.util.SparseIntArray
                    r0.<init>()
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.map = r0
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf
                    r2 = 8
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf
                    r2 = 9
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf
                    r2 = 10
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf
                    r2 = 11
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf
                    r2 = 12
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf
                    r2 = 13
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf
                    r2 = 14
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf
                    r2 = 15
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf
                    r2 = 16
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircle
                    r2 = 2
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius
                    r2 = 3
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle
                    r2 = 4
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX
                    r2 = 49
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY
                    r2 = 50
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin
                    r2 = 5
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end
                    r2 = 6
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent
                    r2 = 7
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_orientation
                    r2 = 1
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf
                    r2 = 17
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf
                    r2 = 18
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf
                    r2 = 19
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf
                    r2 = 20
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft
                    r2 = 21
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginTop
                    r2 = 22
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginRight
                    r2 = 23
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom
                    r2 = 24
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginStart
                    r2 = 25
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd
                    r2 = 26
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias
                    r2 = 29
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias
                    r2 = 30
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio
                    r2 = 44
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight
                    r2 = 45
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight
                    r2 = 46
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle
                    r2 = 47
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle
                    r2 = 48
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedWidth
                    r2 = 27
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedHeight
                    r2 = 28
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default
                    r2 = 31
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default
                    r2 = 32
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min
                    r2 = 33
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max
                    r2 = 34
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent
                    r2 = 35
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min
                    r2 = 36
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max
                    r2 = 37
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent
                    r2 = 38
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator
                    r2 = 39
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator
                    r2 = 40
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator
                    r2 = 41
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator
                    r2 = 42
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator
                    r2 = 43
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTag
                    r2 = 51
                    r0.append(r1, r2)
                    return
            }

            private Table() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public LayoutParams(int r5, int r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r5 = -1
                r4.guideBegin = r5
                r4.guideEnd = r5
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.guidePercent = r6
                r4.leftToLeft = r5
                r4.leftToRight = r5
                r4.rightToLeft = r5
                r4.rightToRight = r5
                r4.topToTop = r5
                r4.topToBottom = r5
                r4.bottomToTop = r5
                r4.bottomToBottom = r5
                r4.baselineToBaseline = r5
                r4.circleConstraint = r5
                r0 = 0
                r4.circleRadius = r0
                r1 = 0
                r4.circleAngle = r1
                r4.startToEnd = r5
                r4.startToStart = r5
                r4.endToStart = r5
                r4.endToEnd = r5
                r4.goneLeftMargin = r5
                r4.goneTopMargin = r5
                r4.goneRightMargin = r5
                r4.goneBottomMargin = r5
                r4.goneStartMargin = r5
                r4.goneEndMargin = r5
                r2 = 1056964608(0x3f000000, float:0.5)
                r4.horizontalBias = r2
                r4.verticalBias = r2
                r3 = 0
                r4.dimensionRatio = r3
                r4.dimensionRatioValue = r1
                r1 = 1
                r4.dimensionRatioSide = r1
                r4.horizontalWeight = r6
                r4.verticalWeight = r6
                r4.horizontalChainStyle = r0
                r4.verticalChainStyle = r0
                r4.matchConstraintDefaultWidth = r0
                r4.matchConstraintDefaultHeight = r0
                r4.matchConstraintMinWidth = r0
                r4.matchConstraintMinHeight = r0
                r4.matchConstraintMaxWidth = r0
                r4.matchConstraintMaxHeight = r0
                r6 = 1065353216(0x3f800000, float:1.0)
                r4.matchConstraintPercentWidth = r6
                r4.matchConstraintPercentHeight = r6
                r4.editorAbsoluteX = r5
                r4.editorAbsoluteY = r5
                r4.orientation = r5
                r4.constrainedWidth = r0
                r4.constrainedHeight = r0
                r4.constraintTag = r3
                r4.horizontalDimensionFixed = r1
                r4.verticalDimensionFixed = r1
                r4.needsBaseline = r0
                r4.isGuideline = r0
                r4.isHelper = r0
                r4.isInPlaceholder = r0
                r4.isVirtualGroup = r0
                r4.resolvedLeftToLeft = r5
                r4.resolvedLeftToRight = r5
                r4.resolvedRightToLeft = r5
                r4.resolvedRightToRight = r5
                r4.resolveGoneLeftMargin = r5
                r4.resolveGoneRightMargin = r5
                r4.resolvedHorizontalBias = r2
                androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = new androidx.constraintlayout.solver.widgets.ConstraintWidget
                r5.<init>()
                r4.widget = r5
                r4.helped = r0
                return
        }

        public LayoutParams(android.content.Context r10, android.util.AttributeSet r11) {
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.guideBegin = r0
                r9.guideEnd = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.guidePercent = r1
                r9.leftToLeft = r0
                r9.leftToRight = r0
                r9.rightToLeft = r0
                r9.rightToRight = r0
                r9.topToTop = r0
                r9.topToBottom = r0
                r9.bottomToTop = r0
                r9.bottomToBottom = r0
                r9.baselineToBaseline = r0
                r9.circleConstraint = r0
                r2 = 0
                r9.circleRadius = r2
                r3 = 0
                r9.circleAngle = r3
                r9.startToEnd = r0
                r9.startToStart = r0
                r9.endToStart = r0
                r9.endToEnd = r0
                r9.goneLeftMargin = r0
                r9.goneTopMargin = r0
                r9.goneRightMargin = r0
                r9.goneBottomMargin = r0
                r9.goneStartMargin = r0
                r9.goneEndMargin = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.horizontalBias = r4
                r9.verticalBias = r4
                r5 = 0
                r9.dimensionRatio = r5
                r9.dimensionRatioValue = r3
                r6 = 1
                r9.dimensionRatioSide = r6
                r9.horizontalWeight = r1
                r9.verticalWeight = r1
                r9.horizontalChainStyle = r2
                r9.verticalChainStyle = r2
                r9.matchConstraintDefaultWidth = r2
                r9.matchConstraintDefaultHeight = r2
                r9.matchConstraintMinWidth = r2
                r9.matchConstraintMinHeight = r2
                r9.matchConstraintMaxWidth = r2
                r9.matchConstraintMaxHeight = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.matchConstraintPercentWidth = r1
                r9.matchConstraintPercentHeight = r1
                r9.editorAbsoluteX = r0
                r9.editorAbsoluteY = r0
                r9.orientation = r0
                r9.constrainedWidth = r2
                r9.constrainedHeight = r2
                r9.constraintTag = r5
                r9.horizontalDimensionFixed = r6
                r9.verticalDimensionFixed = r6
                r9.needsBaseline = r2
                r9.isGuideline = r2
                r9.isHelper = r2
                r9.isInPlaceholder = r2
                r9.isVirtualGroup = r2
                r9.resolvedLeftToLeft = r0
                r9.resolvedLeftToRight = r0
                r9.resolvedRightToLeft = r0
                r9.resolvedRightToRight = r0
                r9.resolveGoneLeftMargin = r0
                r9.resolveGoneRightMargin = r0
                r9.resolvedHorizontalBias = r4
                androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidget
                r1.<init>()
                r9.widget = r1
                r9.helped = r2
                int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = 0
            L9e:
                if (r1 >= r11) goto L3c3
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.map
                int r5 = r5.get(r4)
                r7 = 2
                r8 = -2
                switch(r5) {
                    case 1: goto L3b7;
                    case 2: goto L3a6;
                    case 3: goto L39d;
                    case 4: goto L388;
                    case 5: goto L37f;
                    case 6: goto L376;
                    case 7: goto L36d;
                    case 8: goto L35c;
                    case 9: goto L34b;
                    case 10: goto L339;
                    case 11: goto L327;
                    case 12: goto L315;
                    case 13: goto L303;
                    case 14: goto L2f1;
                    case 15: goto L2df;
                    case 16: goto L2cd;
                    case 17: goto L2bb;
                    case 18: goto L2a9;
                    case 19: goto L297;
                    case 20: goto L285;
                    case 21: goto L27b;
                    case 22: goto L271;
                    case 23: goto L267;
                    case 24: goto L25d;
                    case 25: goto L253;
                    case 26: goto L249;
                    case 27: goto L23f;
                    case 28: goto L235;
                    case 29: goto L22b;
                    case 30: goto L221;
                    case 31: goto L219;
                    case 32: goto L211;
                    case 33: goto L1fa;
                    case 34: goto L1e3;
                    case 35: goto L1d3;
                    case 36: goto L1bc;
                    case 37: goto L1a5;
                    case 38: goto L195;
                    default: goto Laf;
                }
            Laf:
                switch(r5) {
                    case 44: goto Lf4;
                    case 45: goto Lea;
                    case 46: goto Le0;
                    case 47: goto Ld8;
                    case 48: goto Ld0;
                    case 49: goto Lc6;
                    case 50: goto Lbc;
                    case 51: goto Lb4;
                    default: goto Lb2;
                }
            Lb2:
                goto L3bf
            Lb4:
                java.lang.String r4 = r10.getString(r4)
                r9.constraintTag = r4
                goto L3bf
            Lbc:
                int r5 = r9.editorAbsoluteY
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.editorAbsoluteY = r4
                goto L3bf
            Lc6:
                int r5 = r9.editorAbsoluteX
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.editorAbsoluteX = r4
                goto L3bf
            Ld0:
                int r4 = r10.getInt(r4, r2)
                r9.verticalChainStyle = r4
                goto L3bf
            Ld8:
                int r4 = r10.getInt(r4, r2)
                r9.horizontalChainStyle = r4
                goto L3bf
            Le0:
                float r5 = r9.verticalWeight
                float r4 = r10.getFloat(r4, r5)
                r9.verticalWeight = r4
                goto L3bf
            Lea:
                float r5 = r9.horizontalWeight
                float r4 = r10.getFloat(r4, r5)
                r9.horizontalWeight = r4
                goto L3bf
            Lf4:
                java.lang.String r4 = r10.getString(r4)
                r9.dimensionRatio = r4
                r5 = 2143289344(0x7fc00000, float:NaN)
                r9.dimensionRatioValue = r5
                r9.dimensionRatioSide = r0
                if (r4 == 0) goto L3bf
                int r4 = r4.length()
                java.lang.String r5 = r9.dimensionRatio
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L132
                int r7 = r4 + (-1)
                if (r5 >= r7) goto L132
                java.lang.String r7 = r9.dimensionRatio
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L125
                r9.dimensionRatioSide = r2
                goto L12f
            L125:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L12f
                r9.dimensionRatioSide = r6
            L12f:
                int r5 = r5 + 1
                goto L133
            L132:
                r5 = 0
            L133:
                java.lang.String r7 = r9.dimensionRatio
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L181
                int r4 = r4 + (-1)
                if (r7 >= r4) goto L181
                java.lang.String r4 = r9.dimensionRatio
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r9.dimensionRatio
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L3bf
                int r7 = r5.length()
                if (r7 <= 0) goto L3bf
                float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3bf
                float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L3bf
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3bf
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3bf
                int r7 = r9.dimensionRatioSide     // Catch: java.lang.NumberFormatException -> L3bf
                if (r7 != r6) goto L178
                float r5 = r5 / r4
                float r4 = java.lang.Math.abs(r5)     // Catch: java.lang.NumberFormatException -> L3bf
                r9.dimensionRatioValue = r4     // Catch: java.lang.NumberFormatException -> L3bf
                goto L3bf
            L178:
                float r4 = r4 / r5
                float r4 = java.lang.Math.abs(r4)     // Catch: java.lang.NumberFormatException -> L3bf
                r9.dimensionRatioValue = r4     // Catch: java.lang.NumberFormatException -> L3bf
                goto L3bf
            L181:
                java.lang.String r4 = r9.dimensionRatio
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L3bf
                float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3bf
                r9.dimensionRatioValue = r4     // Catch: java.lang.NumberFormatException -> L3bf
                goto L3bf
            L195:
                float r5 = r9.matchConstraintPercentHeight
                float r4 = r10.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r9.matchConstraintPercentHeight = r4
                r9.matchConstraintDefaultHeight = r7
                goto L3bf
            L1a5:
                int r5 = r9.matchConstraintMaxHeight     // Catch: java.lang.Exception -> L1af
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1af
                r9.matchConstraintMaxHeight = r5     // Catch: java.lang.Exception -> L1af
                goto L3bf
            L1af:
                int r5 = r9.matchConstraintMaxHeight
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L3bf
                r9.matchConstraintMaxHeight = r8
                goto L3bf
            L1bc:
                int r5 = r9.matchConstraintMinHeight     // Catch: java.lang.Exception -> L1c6
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1c6
                r9.matchConstraintMinHeight = r5     // Catch: java.lang.Exception -> L1c6
                goto L3bf
            L1c6:
                int r5 = r9.matchConstraintMinHeight
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L3bf
                r9.matchConstraintMinHeight = r8
                goto L3bf
            L1d3:
                float r5 = r9.matchConstraintPercentWidth
                float r4 = r10.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r9.matchConstraintPercentWidth = r4
                r9.matchConstraintDefaultWidth = r7
                goto L3bf
            L1e3:
                int r5 = r9.matchConstraintMaxWidth     // Catch: java.lang.Exception -> L1ed
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1ed
                r9.matchConstraintMaxWidth = r5     // Catch: java.lang.Exception -> L1ed
                goto L3bf
            L1ed:
                int r5 = r9.matchConstraintMaxWidth
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L3bf
                r9.matchConstraintMaxWidth = r8
                goto L3bf
            L1fa:
                int r5 = r9.matchConstraintMinWidth     // Catch: java.lang.Exception -> L204
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L204
                r9.matchConstraintMinWidth = r5     // Catch: java.lang.Exception -> L204
                goto L3bf
            L204:
                int r5 = r9.matchConstraintMinWidth
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L3bf
                r9.matchConstraintMinWidth = r8
                goto L3bf
            L211:
                int r4 = r10.getInt(r4, r2)
                r9.matchConstraintDefaultHeight = r4
                goto L3bf
            L219:
                int r4 = r10.getInt(r4, r2)
                r9.matchConstraintDefaultWidth = r4
                goto L3bf
            L221:
                float r5 = r9.verticalBias
                float r4 = r10.getFloat(r4, r5)
                r9.verticalBias = r4
                goto L3bf
            L22b:
                float r5 = r9.horizontalBias
                float r4 = r10.getFloat(r4, r5)
                r9.horizontalBias = r4
                goto L3bf
            L235:
                boolean r5 = r9.constrainedHeight
                boolean r4 = r10.getBoolean(r4, r5)
                r9.constrainedHeight = r4
                goto L3bf
            L23f:
                boolean r5 = r9.constrainedWidth
                boolean r4 = r10.getBoolean(r4, r5)
                r9.constrainedWidth = r4
                goto L3bf
            L249:
                int r5 = r9.goneEndMargin
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.goneEndMargin = r4
                goto L3bf
            L253:
                int r5 = r9.goneStartMargin
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.goneStartMargin = r4
                goto L3bf
            L25d:
                int r5 = r9.goneBottomMargin
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.goneBottomMargin = r4
                goto L3bf
            L267:
                int r5 = r9.goneRightMargin
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.goneRightMargin = r4
                goto L3bf
            L271:
                int r5 = r9.goneTopMargin
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.goneTopMargin = r4
                goto L3bf
            L27b:
                int r5 = r9.goneLeftMargin
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.goneLeftMargin = r4
                goto L3bf
            L285:
                int r5 = r9.endToEnd
                int r5 = r10.getResourceId(r4, r5)
                r9.endToEnd = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.endToEnd = r4
                goto L3bf
            L297:
                int r5 = r9.endToStart
                int r5 = r10.getResourceId(r4, r5)
                r9.endToStart = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.endToStart = r4
                goto L3bf
            L2a9:
                int r5 = r9.startToStart
                int r5 = r10.getResourceId(r4, r5)
                r9.startToStart = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.startToStart = r4
                goto L3bf
            L2bb:
                int r5 = r9.startToEnd
                int r5 = r10.getResourceId(r4, r5)
                r9.startToEnd = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.startToEnd = r4
                goto L3bf
            L2cd:
                int r5 = r9.baselineToBaseline
                int r5 = r10.getResourceId(r4, r5)
                r9.baselineToBaseline = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.baselineToBaseline = r4
                goto L3bf
            L2df:
                int r5 = r9.bottomToBottom
                int r5 = r10.getResourceId(r4, r5)
                r9.bottomToBottom = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.bottomToBottom = r4
                goto L3bf
            L2f1:
                int r5 = r9.bottomToTop
                int r5 = r10.getResourceId(r4, r5)
                r9.bottomToTop = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.bottomToTop = r4
                goto L3bf
            L303:
                int r5 = r9.topToBottom
                int r5 = r10.getResourceId(r4, r5)
                r9.topToBottom = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.topToBottom = r4
                goto L3bf
            L315:
                int r5 = r9.topToTop
                int r5 = r10.getResourceId(r4, r5)
                r9.topToTop = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.topToTop = r4
                goto L3bf
            L327:
                int r5 = r9.rightToRight
                int r5 = r10.getResourceId(r4, r5)
                r9.rightToRight = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.rightToRight = r4
                goto L3bf
            L339:
                int r5 = r9.rightToLeft
                int r5 = r10.getResourceId(r4, r5)
                r9.rightToLeft = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.rightToLeft = r4
                goto L3bf
            L34b:
                int r5 = r9.leftToRight
                int r5 = r10.getResourceId(r4, r5)
                r9.leftToRight = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.leftToRight = r4
                goto L3bf
            L35c:
                int r5 = r9.leftToLeft
                int r5 = r10.getResourceId(r4, r5)
                r9.leftToLeft = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.leftToLeft = r4
                goto L3bf
            L36d:
                float r5 = r9.guidePercent
                float r4 = r10.getFloat(r4, r5)
                r9.guidePercent = r4
                goto L3bf
            L376:
                int r5 = r9.guideEnd
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.guideEnd = r4
                goto L3bf
            L37f:
                int r5 = r9.guideBegin
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.guideBegin = r4
                goto L3bf
            L388:
                float r5 = r9.circleAngle
                float r4 = r10.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r9.circleAngle = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L3bf
                float r4 = r5 - r4
                float r4 = r4 % r5
                r9.circleAngle = r4
                goto L3bf
            L39d:
                int r5 = r9.circleRadius
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.circleRadius = r4
                goto L3bf
            L3a6:
                int r5 = r9.circleConstraint
                int r5 = r10.getResourceId(r4, r5)
                r9.circleConstraint = r5
                if (r5 != r0) goto L3bf
                int r4 = r10.getInt(r4, r0)
                r9.circleConstraint = r4
                goto L3bf
            L3b7:
                int r5 = r9.orientation
                int r4 = r10.getInt(r4, r5)
                r9.orientation = r4
            L3bf:
                int r1 = r1 + 1
                goto L9e
            L3c3:
                r10.recycle()
                r9.validate()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r6) {
                r5 = this;
                r5.<init>(r6)
                r6 = -1
                r5.guideBegin = r6
                r5.guideEnd = r6
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r5.guidePercent = r0
                r5.leftToLeft = r6
                r5.leftToRight = r6
                r5.rightToLeft = r6
                r5.rightToRight = r6
                r5.topToTop = r6
                r5.topToBottom = r6
                r5.bottomToTop = r6
                r5.bottomToBottom = r6
                r5.baselineToBaseline = r6
                r5.circleConstraint = r6
                r1 = 0
                r5.circleRadius = r1
                r2 = 0
                r5.circleAngle = r2
                r5.startToEnd = r6
                r5.startToStart = r6
                r5.endToStart = r6
                r5.endToEnd = r6
                r5.goneLeftMargin = r6
                r5.goneTopMargin = r6
                r5.goneRightMargin = r6
                r5.goneBottomMargin = r6
                r5.goneStartMargin = r6
                r5.goneEndMargin = r6
                r3 = 1056964608(0x3f000000, float:0.5)
                r5.horizontalBias = r3
                r5.verticalBias = r3
                r4 = 0
                r5.dimensionRatio = r4
                r5.dimensionRatioValue = r2
                r2 = 1
                r5.dimensionRatioSide = r2
                r5.horizontalWeight = r0
                r5.verticalWeight = r0
                r5.horizontalChainStyle = r1
                r5.verticalChainStyle = r1
                r5.matchConstraintDefaultWidth = r1
                r5.matchConstraintDefaultHeight = r1
                r5.matchConstraintMinWidth = r1
                r5.matchConstraintMinHeight = r1
                r5.matchConstraintMaxWidth = r1
                r5.matchConstraintMaxHeight = r1
                r0 = 1065353216(0x3f800000, float:1.0)
                r5.matchConstraintPercentWidth = r0
                r5.matchConstraintPercentHeight = r0
                r5.editorAbsoluteX = r6
                r5.editorAbsoluteY = r6
                r5.orientation = r6
                r5.constrainedWidth = r1
                r5.constrainedHeight = r1
                r5.constraintTag = r4
                r5.horizontalDimensionFixed = r2
                r5.verticalDimensionFixed = r2
                r5.needsBaseline = r1
                r5.isGuideline = r1
                r5.isHelper = r1
                r5.isInPlaceholder = r1
                r5.isVirtualGroup = r1
                r5.resolvedLeftToLeft = r6
                r5.resolvedLeftToRight = r6
                r5.resolvedRightToLeft = r6
                r5.resolvedRightToRight = r6
                r5.resolveGoneLeftMargin = r6
                r5.resolveGoneRightMargin = r6
                r5.resolvedHorizontalBias = r3
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = new androidx.constraintlayout.solver.widgets.ConstraintWidget
                r6.<init>()
                r5.widget = r6
                r5.helped = r1
                return
        }

        public LayoutParams(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r7) {
                r6 = this;
                r6.<init>(r7)
                r0 = -1
                r6.guideBegin = r0
                r6.guideEnd = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r6.guidePercent = r1
                r6.leftToLeft = r0
                r6.leftToRight = r0
                r6.rightToLeft = r0
                r6.rightToRight = r0
                r6.topToTop = r0
                r6.topToBottom = r0
                r6.bottomToTop = r0
                r6.bottomToBottom = r0
                r6.baselineToBaseline = r0
                r6.circleConstraint = r0
                r2 = 0
                r6.circleRadius = r2
                r3 = 0
                r6.circleAngle = r3
                r6.startToEnd = r0
                r6.startToStart = r0
                r6.endToStart = r0
                r6.endToEnd = r0
                r6.goneLeftMargin = r0
                r6.goneTopMargin = r0
                r6.goneRightMargin = r0
                r6.goneBottomMargin = r0
                r6.goneStartMargin = r0
                r6.goneEndMargin = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r6.horizontalBias = r4
                r6.verticalBias = r4
                r5 = 0
                r6.dimensionRatio = r5
                r6.dimensionRatioValue = r3
                r3 = 1
                r6.dimensionRatioSide = r3
                r6.horizontalWeight = r1
                r6.verticalWeight = r1
                r6.horizontalChainStyle = r2
                r6.verticalChainStyle = r2
                r6.matchConstraintDefaultWidth = r2
                r6.matchConstraintDefaultHeight = r2
                r6.matchConstraintMinWidth = r2
                r6.matchConstraintMinHeight = r2
                r6.matchConstraintMaxWidth = r2
                r6.matchConstraintMaxHeight = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r6.matchConstraintPercentWidth = r1
                r6.matchConstraintPercentHeight = r1
                r6.editorAbsoluteX = r0
                r6.editorAbsoluteY = r0
                r6.orientation = r0
                r6.constrainedWidth = r2
                r6.constrainedHeight = r2
                r6.constraintTag = r5
                r6.horizontalDimensionFixed = r3
                r6.verticalDimensionFixed = r3
                r6.needsBaseline = r2
                r6.isGuideline = r2
                r6.isHelper = r2
                r6.isInPlaceholder = r2
                r6.isVirtualGroup = r2
                r6.resolvedLeftToLeft = r0
                r6.resolvedLeftToRight = r0
                r6.resolvedRightToLeft = r0
                r6.resolvedRightToRight = r0
                r6.resolveGoneLeftMargin = r0
                r6.resolveGoneRightMargin = r0
                r6.resolvedHorizontalBias = r4
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = new androidx.constraintlayout.solver.widgets.ConstraintWidget
                r0.<init>()
                r6.widget = r0
                r6.helped = r2
                int r0 = r7.guideBegin
                r6.guideBegin = r0
                int r0 = r7.guideEnd
                r6.guideEnd = r0
                float r0 = r7.guidePercent
                r6.guidePercent = r0
                int r0 = r7.leftToLeft
                r6.leftToLeft = r0
                int r0 = r7.leftToRight
                r6.leftToRight = r0
                int r0 = r7.rightToLeft
                r6.rightToLeft = r0
                int r0 = r7.rightToRight
                r6.rightToRight = r0
                int r0 = r7.topToTop
                r6.topToTop = r0
                int r0 = r7.topToBottom
                r6.topToBottom = r0
                int r0 = r7.bottomToTop
                r6.bottomToTop = r0
                int r0 = r7.bottomToBottom
                r6.bottomToBottom = r0
                int r0 = r7.baselineToBaseline
                r6.baselineToBaseline = r0
                int r0 = r7.circleConstraint
                r6.circleConstraint = r0
                int r0 = r7.circleRadius
                r6.circleRadius = r0
                float r0 = r7.circleAngle
                r6.circleAngle = r0
                int r0 = r7.startToEnd
                r6.startToEnd = r0
                int r0 = r7.startToStart
                r6.startToStart = r0
                int r0 = r7.endToStart
                r6.endToStart = r0
                int r0 = r7.endToEnd
                r6.endToEnd = r0
                int r0 = r7.goneLeftMargin
                r6.goneLeftMargin = r0
                int r0 = r7.goneTopMargin
                r6.goneTopMargin = r0
                int r0 = r7.goneRightMargin
                r6.goneRightMargin = r0
                int r0 = r7.goneBottomMargin
                r6.goneBottomMargin = r0
                int r0 = r7.goneStartMargin
                r6.goneStartMargin = r0
                int r0 = r7.goneEndMargin
                r6.goneEndMargin = r0
                float r0 = r7.horizontalBias
                r6.horizontalBias = r0
                float r0 = r7.verticalBias
                r6.verticalBias = r0
                java.lang.String r0 = r7.dimensionRatio
                r6.dimensionRatio = r0
                float r0 = r7.dimensionRatioValue
                r6.dimensionRatioValue = r0
                int r0 = r7.dimensionRatioSide
                r6.dimensionRatioSide = r0
                float r0 = r7.horizontalWeight
                r6.horizontalWeight = r0
                float r0 = r7.verticalWeight
                r6.verticalWeight = r0
                int r0 = r7.horizontalChainStyle
                r6.horizontalChainStyle = r0
                int r0 = r7.verticalChainStyle
                r6.verticalChainStyle = r0
                boolean r0 = r7.constrainedWidth
                r6.constrainedWidth = r0
                boolean r0 = r7.constrainedHeight
                r6.constrainedHeight = r0
                int r0 = r7.matchConstraintDefaultWidth
                r6.matchConstraintDefaultWidth = r0
                int r0 = r7.matchConstraintDefaultHeight
                r6.matchConstraintDefaultHeight = r0
                int r0 = r7.matchConstraintMinWidth
                r6.matchConstraintMinWidth = r0
                int r0 = r7.matchConstraintMaxWidth
                r6.matchConstraintMaxWidth = r0
                int r0 = r7.matchConstraintMinHeight
                r6.matchConstraintMinHeight = r0
                int r0 = r7.matchConstraintMaxHeight
                r6.matchConstraintMaxHeight = r0
                float r0 = r7.matchConstraintPercentWidth
                r6.matchConstraintPercentWidth = r0
                float r0 = r7.matchConstraintPercentHeight
                r6.matchConstraintPercentHeight = r0
                int r0 = r7.editorAbsoluteX
                r6.editorAbsoluteX = r0
                int r0 = r7.editorAbsoluteY
                r6.editorAbsoluteY = r0
                int r0 = r7.orientation
                r6.orientation = r0
                boolean r0 = r7.horizontalDimensionFixed
                r6.horizontalDimensionFixed = r0
                boolean r0 = r7.verticalDimensionFixed
                r6.verticalDimensionFixed = r0
                boolean r0 = r7.needsBaseline
                r6.needsBaseline = r0
                boolean r0 = r7.isGuideline
                r6.isGuideline = r0
                int r0 = r7.resolvedLeftToLeft
                r6.resolvedLeftToLeft = r0
                int r0 = r7.resolvedLeftToRight
                r6.resolvedLeftToRight = r0
                int r0 = r7.resolvedRightToLeft
                r6.resolvedRightToLeft = r0
                int r0 = r7.resolvedRightToRight
                r6.resolvedRightToRight = r0
                int r0 = r7.resolveGoneLeftMargin
                r6.resolveGoneLeftMargin = r0
                int r0 = r7.resolveGoneRightMargin
                r6.resolveGoneRightMargin = r0
                float r0 = r7.resolvedHorizontalBias
                r6.resolvedHorizontalBias = r0
                java.lang.String r0 = r7.constraintTag
                r6.constraintTag = r0
                androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.widget
                r6.widget = r7
                return
        }

        public java.lang.String getConstraintTag() {
                r1 = this;
                java.lang.String r0 = r1.constraintTag
                return r0
        }

        public androidx.constraintlayout.solver.widgets.ConstraintWidget getConstraintWidget() {
                r1 = this;
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.widget
                return r0
        }

        public void reset() {
                r1 = this;
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.widget
                if (r0 == 0) goto L7
                r0.reset()
            L7:
                return
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        public void resolveLayoutDirection(int r10) {
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L11
                r10 = 1
                goto L12
            L11:
                r10 = 0
            L12:
                r4 = -1
                r9.resolvedRightToLeft = r4
                r9.resolvedRightToRight = r4
                r9.resolvedLeftToLeft = r4
                r9.resolvedLeftToRight = r4
                int r5 = r9.goneLeftMargin
                r9.resolveGoneLeftMargin = r5
                int r5 = r9.goneRightMargin
                r9.resolveGoneRightMargin = r5
                float r5 = r9.horizontalBias
                r9.resolvedHorizontalBias = r5
                int r6 = r9.guideBegin
                r9.resolvedGuideBegin = r6
                int r7 = r9.guideEnd
                r9.resolvedGuideEnd = r7
                float r8 = r9.guidePercent
                r9.resolvedGuidePercent = r8
                if (r10 == 0) goto L8e
                int r10 = r9.startToEnd
                if (r10 == r4) goto L3d
                r9.resolvedRightToLeft = r10
            L3b:
                r2 = 1
                goto L44
            L3d:
                int r10 = r9.startToStart
                if (r10 == r4) goto L44
                r9.resolvedRightToRight = r10
                goto L3b
            L44:
                int r10 = r9.endToStart
                if (r10 == r4) goto L4b
                r9.resolvedLeftToRight = r10
                r2 = 1
            L4b:
                int r10 = r9.endToEnd
                if (r10 == r4) goto L52
                r9.resolvedLeftToLeft = r10
                r2 = 1
            L52:
                int r10 = r9.goneStartMargin
                if (r10 == r4) goto L58
                r9.resolveGoneRightMargin = r10
            L58:
                int r10 = r9.goneEndMargin
                if (r10 == r4) goto L5e
                r9.resolveGoneLeftMargin = r10
            L5e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L66
                float r2 = r10 - r5
                r9.resolvedHorizontalBias = r2
            L66:
                boolean r2 = r9.isGuideline
                if (r2 == 0) goto Lb2
                int r2 = r9.orientation
                if (r2 != r3) goto Lb2
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L7c
                float r10 = r10 - r8
                r9.resolvedGuidePercent = r10
                r9.resolvedGuideBegin = r4
                r9.resolvedGuideEnd = r4
                goto Lb2
            L7c:
                if (r6 == r4) goto L85
                r9.resolvedGuideEnd = r6
                r9.resolvedGuideBegin = r4
                r9.resolvedGuidePercent = r2
                goto Lb2
            L85:
                if (r7 == r4) goto Lb2
                r9.resolvedGuideBegin = r7
                r9.resolvedGuideEnd = r4
                r9.resolvedGuidePercent = r2
                goto Lb2
            L8e:
                int r10 = r9.startToEnd
                if (r10 == r4) goto L94
                r9.resolvedLeftToRight = r10
            L94:
                int r10 = r9.startToStart
                if (r10 == r4) goto L9a
                r9.resolvedLeftToLeft = r10
            L9a:
                int r10 = r9.endToStart
                if (r10 == r4) goto La0
                r9.resolvedRightToLeft = r10
            La0:
                int r10 = r9.endToEnd
                if (r10 == r4) goto La6
                r9.resolvedRightToRight = r10
            La6:
                int r10 = r9.goneStartMargin
                if (r10 == r4) goto Lac
                r9.resolveGoneLeftMargin = r10
            Lac:
                int r10 = r9.goneEndMargin
                if (r10 == r4) goto Lb2
                r9.resolveGoneRightMargin = r10
            Lb2:
                int r10 = r9.endToStart
                if (r10 != r4) goto Lfc
                int r10 = r9.endToEnd
                if (r10 != r4) goto Lfc
                int r10 = r9.startToStart
                if (r10 != r4) goto Lfc
                int r10 = r9.startToEnd
                if (r10 != r4) goto Lfc
                int r10 = r9.rightToLeft
                if (r10 == r4) goto Ld1
                r9.resolvedRightToLeft = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto Ldf
                if (r1 <= 0) goto Ldf
                r9.rightMargin = r1
                goto Ldf
            Ld1:
                int r10 = r9.rightToRight
                if (r10 == r4) goto Ldf
                r9.resolvedRightToRight = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto Ldf
                if (r1 <= 0) goto Ldf
                r9.rightMargin = r1
            Ldf:
                int r10 = r9.leftToLeft
                if (r10 == r4) goto Lee
                r9.resolvedLeftToLeft = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto Lfc
                if (r0 <= 0) goto Lfc
                r9.leftMargin = r0
                return
            Lee:
                int r10 = r9.leftToRight
                if (r10 == r4) goto Lfc
                r9.resolvedLeftToRight = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto Lfc
                if (r0 <= 0) goto Lfc
                r9.leftMargin = r0
            Lfc:
                return
        }

        public void setWidgetDebugName(java.lang.String r2) {
                r1 = this;
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.widget
                r0.setDebugName(r2)
                return
        }

        public void validate() {
                r6 = this;
                r0 = 0
                r6.isGuideline = r0
                r1 = 1
                r6.horizontalDimensionFixed = r1
                r6.verticalDimensionFixed = r1
                int r2 = r6.width
                r3 = -2
                if (r2 != r3) goto L19
                boolean r4 = r6.constrainedWidth
                if (r4 == 0) goto L19
                r6.horizontalDimensionFixed = r0
                int r4 = r6.matchConstraintDefaultWidth
                if (r4 != 0) goto L19
                r6.matchConstraintDefaultWidth = r1
            L19:
                int r4 = r6.height
                if (r4 != r3) goto L29
                boolean r5 = r6.constrainedHeight
                if (r5 == 0) goto L29
                r6.verticalDimensionFixed = r0
                int r5 = r6.matchConstraintDefaultHeight
                if (r5 != 0) goto L29
                r6.matchConstraintDefaultHeight = r1
            L29:
                r5 = -1
                if (r2 == 0) goto L2e
                if (r2 != r5) goto L3a
            L2e:
                r6.horizontalDimensionFixed = r0
                if (r2 != 0) goto L3a
                int r2 = r6.matchConstraintDefaultWidth
                if (r2 != r1) goto L3a
                r6.width = r3
                r6.constrainedWidth = r1
            L3a:
                if (r4 == 0) goto L3e
                if (r4 != r5) goto L4a
            L3e:
                r6.verticalDimensionFixed = r0
                if (r4 != 0) goto L4a
                int r0 = r6.matchConstraintDefaultHeight
                if (r0 != r1) goto L4a
                r6.height = r3
                r6.constrainedHeight = r1
            L4a:
                float r0 = r6.guidePercent
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L5c
                int r0 = r6.guideBegin
                if (r0 != r5) goto L5c
                int r0 = r6.guideEnd
                if (r0 == r5) goto L5b
                goto L5c
            L5b:
                return
            L5c:
                r6.isGuideline = r1
                r6.horizontalDimensionFixed = r1
                r6.verticalDimensionFixed = r1
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.widget
                boolean r0 = r0 instanceof androidx.constraintlayout.solver.widgets.Guideline
                if (r0 != 0) goto L6f
                androidx.constraintlayout.solver.widgets.Guideline r0 = new androidx.constraintlayout.solver.widgets.Guideline
                r0.<init>()
                r6.widget = r0
            L6f:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.widget
                androidx.constraintlayout.solver.widgets.Guideline r0 = (androidx.constraintlayout.solver.widgets.Guideline) r0
                int r1 = r6.orientation
                r0.setOrientation(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class Measurer implements androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer {
        androidx.constraintlayout.widget.ConstraintLayout layout;
        int layoutHeightSpec;
        int layoutWidthSpec;
        int paddingBottom;
        int paddingHeight;
        int paddingTop;
        int paddingWidth;
        final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout this$0;

        public Measurer(androidx.constraintlayout.widget.ConstraintLayout r1, androidx.constraintlayout.widget.ConstraintLayout r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.layout = r2
                return
        }

        public void captureLayoutInfos(int r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.paddingTop = r3
                r0.paddingBottom = r4
                r0.paddingWidth = r5
                r0.paddingHeight = r6
                r0.layoutWidthSpec = r1
                r0.layoutHeightSpec = r2
                return
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        public final void didMeasures() {
                r5 = this;
                androidx.constraintlayout.widget.ConstraintLayout r0 = r5.layout
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L1e
                androidx.constraintlayout.widget.ConstraintLayout r3 = r5.layout
                android.view.View r3 = r3.getChildAt(r2)
                boolean r4 = r3 instanceof androidx.constraintlayout.widget.Placeholder
                if (r4 == 0) goto L1b
                androidx.constraintlayout.widget.Placeholder r3 = (androidx.constraintlayout.widget.Placeholder) r3
                androidx.constraintlayout.widget.ConstraintLayout r4 = r5.layout
                r3.updatePostMeasure(r4)
            L1b:
                int r2 = r2 + 1
                goto L8
            L1e:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r5.layout
                java.util.ArrayList r0 = androidx.constraintlayout.widget.ConstraintLayout.access$000(r0)
                int r0 = r0.size()
                if (r0 <= 0) goto L40
            L2a:
                if (r1 >= r0) goto L40
                androidx.constraintlayout.widget.ConstraintLayout r2 = r5.layout
                java.util.ArrayList r2 = androidx.constraintlayout.widget.ConstraintLayout.access$000(r2)
                java.lang.Object r2 = r2.get(r1)
                androidx.constraintlayout.widget.ConstraintHelper r2 = (androidx.constraintlayout.widget.ConstraintHelper) r2
                androidx.constraintlayout.widget.ConstraintLayout r3 = r5.layout
                r2.updatePostMeasure(r3)
                int r1 = r1 + 1
                goto L2a
            L40:
                return
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        @android.annotation.SuppressLint({"WrongCall"})
        public final void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget r21, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure r22) {
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                if (r1 != 0) goto L9
                return
            L9:
                int r3 = r1.getVisibility()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L1f
                boolean r3 = r1.isInPlaceholder()
                if (r3 != 0) goto L1f
                r2.measuredWidth = r5
                r2.measuredHeight = r5
                r2.measuredBaseline = r5
                return
            L1f:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.horizontalBehavior
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.verticalBehavior
                int r6 = r2.horizontalDimension
                int r7 = r2.verticalDimension
                int r8 = r0.paddingTop
                int r9 = r0.paddingBottom
                int r8 = r8 + r9
                int r9 = r0.paddingWidth
                java.lang.Object r10 = r1.getCompanionWidget()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r16 = 0
                r14 = 3
                r15 = 2
                r5 = 1
                if (r12 == r5) goto La7
                if (r12 == r15) goto L9b
                if (r12 == r14) goto L8a
                if (r12 == r13) goto L4e
                r6 = 0
            L4b:
                r9 = 0
                goto Lb3
            L4e:
                int r6 = r0.layoutWidthSpec
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.mMatchConstraintDefaultWidth
                if (r9 != r5) goto L5b
                r9 = 1
                goto L5c
            L5b:
                r9 = 0
            L5c:
                int[] r12 = r1.wrapMeasure
                r12[r15] = r16
                boolean r13 = r2.useCurrentDimensions
                if (r13 == 0) goto L88
                if (r9 == 0) goto L72
                r13 = r12[r14]
                if (r13 == 0) goto L72
                r12 = r12[r16]
                int r13 = r1.getWidth()
                if (r12 != r13) goto L76
            L72:
                boolean r12 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r12 == 0) goto L78
            L76:
                r12 = 1
                goto L79
            L78:
                r12 = 0
            L79:
                if (r9 == 0) goto L7d
                if (r12 == 0) goto L88
            L7d:
                int r6 = r1.getWidth()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L4b
            L88:
                r9 = 1
                goto Lb3
            L8a:
                int r6 = r0.layoutWidthSpec
                int r12 = r1.getHorizontalMargin()
                int r9 = r9 + r12
                r12 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.wrapMeasure
                r9[r15] = r12
                goto L4b
            L9b:
                int r6 = r0.layoutWidthSpec
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.wrapMeasure
                r9[r15] = r12
                goto L88
            La7:
                r9 = 1073741824(0x40000000, float:2.0)
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                int[] r9 = r1.wrapMeasure
                r9[r15] = r6
                r6 = r12
                goto L4b
            Lb3:
                int r12 = r4.ordinal()
                r11 = r11[r12]
                if (r11 == r5) goto L11f
                if (r11 == r15) goto L113
                if (r11 == r14) goto L102
                r7 = 4
                if (r11 == r7) goto Lc6
                r7 = 0
            Lc3:
                r8 = 0
                goto L12b
            Lc6:
                int r7 = r0.layoutHeightSpec
                r12 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r12)
                int r8 = r1.mMatchConstraintDefaultHeight
                if (r8 != r5) goto Ld3
                r8 = 1
                goto Ld4
            Ld3:
                r8 = 0
            Ld4:
                int[] r11 = r1.wrapMeasure
                r11[r14] = r16
                boolean r12 = r2.useCurrentDimensions
                if (r12 == 0) goto L100
                if (r8 == 0) goto Lea
                r12 = r11[r15]
                if (r12 == 0) goto Lea
                r11 = r11[r5]
                int r12 = r1.getHeight()
                if (r11 != r12) goto Lee
            Lea:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r11 == 0) goto Lf0
            Lee:
                r11 = 1
                goto Lf1
            Lf0:
                r11 = 0
            Lf1:
                if (r8 == 0) goto Lf5
                if (r11 == 0) goto L100
            Lf5:
                int r7 = r1.getHeight()
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto Lc3
            L100:
                r8 = 1
                goto L12b
            L102:
                int r7 = r0.layoutHeightSpec
                int r11 = r1.getVerticalMargin()
                int r8 = r8 + r11
                r12 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r12)
                int[] r8 = r1.wrapMeasure
                r8[r14] = r12
                goto Lc3
            L113:
                int r7 = r0.layoutHeightSpec
                r12 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r12)
                int[] r8 = r1.wrapMeasure
                r8[r14] = r12
                goto L100
            L11f:
                r8 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                int[] r8 = r1.wrapMeasure
                r8[r14] = r7
                r7 = r11
                goto Lc3
            L12b:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r11) goto L131
                r12 = 1
                goto L132
            L131:
                r12 = 0
            L132:
                if (r4 != r11) goto L136
                r11 = 1
                goto L137
            L136:
                r11 = 0
            L137:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                r17 = 3
                if (r4 == r13) goto L144
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r4 != r14) goto L142
                goto L144
            L142:
                r4 = 0
                goto L145
            L144:
                r4 = 1
            L145:
                if (r3 == r13) goto L14e
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r13) goto L14c
                goto L14e
            L14c:
                r3 = 0
                goto L14f
            L14e:
                r3 = 1
            L14f:
                r13 = 0
                if (r12 == 0) goto L15a
                float r14 = r1.mDimensionRatio
                int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
                if (r14 <= 0) goto L15a
                r14 = 1
                goto L15b
            L15a:
                r14 = 0
            L15b:
                if (r11 == 0) goto L167
                r18 = 0
                float r13 = r1.mDimensionRatio
                int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
                if (r13 <= 0) goto L167
                r13 = 1
                goto L168
            L167:
                r13 = 0
            L168:
                android.view.ViewGroup$LayoutParams r18 = r10.getLayoutParams()
                r19 = 2
                r15 = r18
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r15 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r15
                r18 = 1
                boolean r5 = r2.useCurrentDimensions
                if (r5 != 0) goto L18b
                if (r12 == 0) goto L18b
                int r5 = r1.mMatchConstraintDefaultWidth
                if (r5 != 0) goto L18b
                if (r11 == 0) goto L18b
                int r5 = r1.mMatchConstraintDefaultHeight
                if (r5 == 0) goto L185
                goto L18b
            L185:
                r0 = -1
                r8 = 0
                r9 = 0
                r12 = 0
                goto L22b
            L18b:
                boolean r5 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r5 == 0) goto L19d
                boolean r5 = r1 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
                if (r5 == 0) goto L19d
                r5 = r1
                androidx.constraintlayout.solver.widgets.VirtualLayout r5 = (androidx.constraintlayout.solver.widgets.VirtualLayout) r5
                r11 = r10
                androidx.constraintlayout.widget.VirtualLayout r11 = (androidx.constraintlayout.widget.VirtualLayout) r11
                r11.onMeasure(r5, r6, r7)
                goto L1a0
            L19d:
                r10.measure(r6, r7)
            L1a0:
                int r5 = r10.getMeasuredWidth()
                int r11 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                if (r9 == 0) goto L1b5
                int[] r9 = r1.wrapMeasure
                r9[r16] = r5
                r9[r19] = r11
                goto L1bb
            L1b5:
                int[] r9 = r1.wrapMeasure
                r9[r16] = r16
                r9[r19] = r16
            L1bb:
                if (r8 == 0) goto L1c4
                int[] r8 = r1.wrapMeasure
                r8[r18] = r11
                r8[r17] = r5
                goto L1ca
            L1c4:
                int[] r8 = r1.wrapMeasure
                r8[r18] = r16
                r8[r17] = r16
            L1ca:
                int r8 = r1.mMatchConstraintMinWidth
                if (r8 <= 0) goto L1d3
                int r8 = java.lang.Math.max(r8, r5)
                goto L1d4
            L1d3:
                r8 = r5
            L1d4:
                int r9 = r1.mMatchConstraintMaxWidth
                if (r9 <= 0) goto L1dc
                int r8 = java.lang.Math.min(r9, r8)
            L1dc:
                int r9 = r1.mMatchConstraintMinHeight
                if (r9 <= 0) goto L1e5
                int r9 = java.lang.Math.max(r9, r11)
                goto L1e6
            L1e5:
                r9 = r11
            L1e6:
                int r0 = r1.mMatchConstraintMaxHeight
                if (r0 <= 0) goto L1ee
                int r9 = java.lang.Math.min(r0, r9)
            L1ee:
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r14 == 0) goto L1fc
                if (r4 == 0) goto L1fc
                float r3 = r1.mDimensionRatio
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r8 = (int) r4
                goto L206
            L1fc:
                if (r13 == 0) goto L206
                if (r3 == 0) goto L206
                float r3 = r1.mDimensionRatio
                float r4 = (float) r8
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r9 = (int) r4
            L206:
                if (r5 != r8) goto L20d
                if (r11 == r9) goto L20b
                goto L20d
            L20b:
                r0 = -1
                goto L22b
            L20d:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r5 == r8) goto L215
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L215:
                if (r11 == r9) goto L21b
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L21b:
                r10.measure(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                goto L20b
            L22b:
                if (r12 == r0) goto L22f
                r0 = 1
                goto L230
            L22f:
                r0 = 0
            L230:
                int r3 = r2.horizontalDimension
                if (r8 != r3) goto L23b
                int r3 = r2.verticalDimension
                if (r9 == r3) goto L239
                goto L23b
            L239:
                r5 = 0
                goto L23c
            L23b:
                r5 = 1
            L23c:
                r2.measuredNeedsSolverPass = r5
                boolean r3 = r15.needsBaseline
                if (r3 == 0) goto L243
                r0 = 1
            L243:
                if (r0 == 0) goto L251
                r3 = -1
                if (r12 == r3) goto L251
                int r1 = r1.getBaselineDistance()
                if (r1 == r12) goto L251
                r1 = 1
                r2.measuredNeedsSolverPass = r1
            L251:
                r2.measuredWidth = r8
                r2.measuredHeight = r9
                r2.measuredHasBaseline = r0
                r2.measuredBaseline = r12
                return
        }
    }

    public ConstraintLayout(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r3.mChildrenByIds = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 4
            r4.<init>(r0)
            r3.mConstraintHelpers = r4
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            r4.<init>()
            r3.mLayoutWidget = r4
            r4 = 0
            r3.mMinWidth = r4
            r3.mMinHeight = r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.mMaxWidth = r0
            r3.mMaxHeight = r0
            r0 = 1
            r3.mDirtyHierarchy = r0
            r0 = 263(0x107, float:3.69E-43)
            r3.mOptimizationLevel = r0
            r0 = 0
            r3.mConstraintSet = r0
            r3.mConstraintLayoutSpec = r0
            r1 = -1
            r3.mConstraintSetId = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.mDesignIds = r2
            r3.mLastMeasureWidth = r1
            r3.mLastMeasureHeight = r1
            r3.mLastMeasureWidthSize = r1
            r3.mLastMeasureHeightSize = r1
            r3.mLastMeasureWidthMode = r4
            r3.mLastMeasureHeightMode = r4
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r3.mTempMapIdToWidget = r1
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r1 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r1.<init>(r3, r3)
            r3.mMeasurer = r1
            r3.mOnMeasureWidthMeasureSpec = r4
            r3.mOnMeasureHeightMeasureSpec = r4
            r3.init(r0, r4, r4)
            return
    }

    public ConstraintLayout(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 263(0x107, float:3.69E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.init(r4, r3, r3)
            return
    }

    public ConstraintLayout(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 263(0x107, float:3.69E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.init(r4, r5, r3)
            return
    }

    @android.annotation.TargetApi(21)
    public ConstraintLayout(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.mChildrenByIds = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 4
            r3.<init>(r0)
            r2.mConstraintHelpers = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            r3.<init>()
            r2.mLayoutWidget = r3
            r3 = 0
            r2.mMinWidth = r3
            r2.mMinHeight = r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxWidth = r0
            r2.mMaxHeight = r0
            r0 = 1
            r2.mDirtyHierarchy = r0
            r0 = 263(0x107, float:3.69E-43)
            r2.mOptimizationLevel = r0
            r0 = 0
            r2.mConstraintSet = r0
            r2.mConstraintLayoutSpec = r0
            r0 = -1
            r2.mConstraintSetId = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mDesignIds = r1
            r2.mLastMeasureWidth = r0
            r2.mLastMeasureHeight = r0
            r2.mLastMeasureWidthSize = r0
            r2.mLastMeasureHeightSize = r0
            r2.mLastMeasureWidthMode = r3
            r2.mLastMeasureHeightMode = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.mTempMapIdToWidget = r0
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = new androidx.constraintlayout.widget.ConstraintLayout$Measurer
            r0.<init>(r2, r2)
            r2.mMeasurer = r0
            r2.mOnMeasureWidthMeasureSpec = r3
            r2.mOnMeasureHeightMeasureSpec = r3
            r2.init(r4, r5, r6)
            return
    }

    static /* synthetic */ java.util.ArrayList access$000(androidx.constraintlayout.widget.ConstraintLayout r0) {
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r0 = r0.mConstraintHelpers
            return r0
    }

    private int getPaddingWidth() {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r4.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r2)
            int r0 = r0 + r2
            int r2 = r4.getPaddingStart()
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r4.getPaddingEnd()
            int r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + r1
            if (r2 <= 0) goto L26
            return r2
        L26:
            return r0
    }

    private final androidx.constraintlayout.solver.widgets.ConstraintWidget getTargetWidget(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r1.mLayoutWidget
            return r2
        L5:
            android.util.SparseArray<android.view.View> r0 = r1.mChildrenByIds
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L20
            android.view.View r0 = r1.findViewById(r2)
            if (r0 == 0) goto L20
            if (r0 == r1) goto L20
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != r1) goto L20
            r1.onViewAdded(r0)
        L20:
            if (r0 != r1) goto L25
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r1.mLayoutWidget
            return r2
        L25:
            if (r0 != 0) goto L29
            r2 = 0
            return r2
        L29:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.widget
            return r2
    }

    private void init(android.util.AttributeSet r6, int r7, int r8) {
            r5 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r5.mLayoutWidget
            r0.setCompanionWidget(r5)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r5.mLayoutWidget
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r1 = r5.mMeasurer
            r0.setMeasurer(r1)
            android.util.SparseArray<android.view.View> r0 = r5.mChildrenByIds
            int r1 = r5.getId()
            r0.put(r1, r5)
            r0 = 0
            r5.mConstraintSet = r0
            if (r6 == 0) goto La3
            android.content.Context r1 = r5.getContext()
            int[] r2 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2, r7, r8)
            int r7 = r6.getIndexCount()
            r8 = 0
            r1 = 0
        L2a:
            if (r1 >= r7) goto La0
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minWidth
            if (r2 != r3) goto L3d
            int r3 = r5.mMinWidth
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMinWidth = r2
            goto L9d
        L3d:
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minHeight
            if (r2 != r3) goto L4a
            int r3 = r5.mMinHeight
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMinHeight = r2
            goto L9d
        L4a:
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxWidth
            if (r2 != r3) goto L57
            int r3 = r5.mMaxWidth
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMaxWidth = r2
            goto L9d
        L57:
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxHeight
            if (r2 != r3) goto L64
            int r3 = r5.mMaxHeight
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.mMaxHeight = r2
            goto L9d
        L64:
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_optimizationLevel
            if (r2 != r3) goto L71
            int r3 = r5.mOptimizationLevel
            int r2 = r6.getInt(r2, r3)
            r5.mOptimizationLevel = r2
            goto L9d
        L71:
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layoutDescription
            if (r2 != r3) goto L82
            int r2 = r6.getResourceId(r2, r8)
            if (r2 == 0) goto L9d
            r5.parseLayoutDescription(r2)     // Catch: android.content.res.Resources.NotFoundException -> L7f
            goto L9d
        L7f:
            r5.mConstraintLayoutSpec = r0
            goto L9d
        L82:
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraintSet
            if (r2 != r3) goto L9d
            int r2 = r6.getResourceId(r2, r8)
            androidx.constraintlayout.widget.ConstraintSet r3 = new androidx.constraintlayout.widget.ConstraintSet     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.mConstraintSet = r3     // Catch: android.content.res.Resources.NotFoundException -> L99
            android.content.Context r4 = r5.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r3.load(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto L9b
        L99:
            r5.mConstraintSet = r0
        L9b:
            r5.mConstraintSetId = r2
        L9d:
            int r1 = r1 + 1
            goto L2a
        La0:
            r6.recycle()
        La3:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r5.mLayoutWidget
            int r7 = r5.mOptimizationLevel
            r6.setOptimizationLevel(r7)
            return
    }

    private void markHierarchyDirty() {
            r1 = this;
            r0 = 1
            r1.mDirtyHierarchy = r0
            r0 = -1
            r1.mLastMeasureWidth = r0
            r1.mLastMeasureHeight = r0
            r1.mLastMeasureWidthSize = r0
            r1.mLastMeasureHeightSize = r0
            r0 = 0
            r1.mLastMeasureWidthMode = r0
            r1.mLastMeasureHeightMode = r0
            return
    }

    private void setChildrenConstraints() {
            r8 = this;
            boolean r1 = r8.isInEditMode()
            int r6 = r8.getChildCount()
            r0 = 0
            r2 = 0
        La:
            if (r2 >= r6) goto L1d
            android.view.View r3 = r8.getChildAt(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r8.getViewWidget(r3)
            if (r3 != 0) goto L17
            goto L1a
        L17:
            r3.reset()
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            r2 = -1
            if (r1 == 0) goto L5a
            r3 = 0
        L21:
            if (r3 >= r6) goto L5a
            android.view.View r4 = r8.getChildAt(r3)
            android.content.res.Resources r5 = r8.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r7 = r4.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.String r5 = r5.getResourceName(r7)     // Catch: android.content.res.Resources.NotFoundException -> L57
            int r7 = r4.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r8.setDesignInformation(r0, r5, r7)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r7 = 47
            int r7 = r5.indexOf(r7)     // Catch: android.content.res.Resources.NotFoundException -> L57
            if (r7 == r2) goto L4c
            int r7 = r7 + 1
            java.lang.String r5 = r5.substring(r7)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L4c:
            int r4 = r4.getId()     // Catch: android.content.res.Resources.NotFoundException -> L57
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r8.getTargetWidget(r4)     // Catch: android.content.res.Resources.NotFoundException -> L57
            r4.setDebugName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L57
        L57:
            int r3 = r3 + 1
            goto L21
        L5a:
            int r3 = r8.mConstraintSetId
            if (r3 == r2) goto L7c
            r2 = 0
        L5f:
            if (r2 >= r6) goto L7c
            android.view.View r3 = r8.getChildAt(r2)
            int r4 = r3.getId()
            int r5 = r8.mConstraintSetId
            if (r4 != r5) goto L79
            boolean r4 = r3 instanceof androidx.constraintlayout.widget.Constraints
            if (r4 == 0) goto L79
            androidx.constraintlayout.widget.Constraints r3 = (androidx.constraintlayout.widget.Constraints) r3
            androidx.constraintlayout.widget.ConstraintSet r3 = r3.getConstraintSet()
            r8.mConstraintSet = r3
        L79:
            int r2 = r2 + 1
            goto L5f
        L7c:
            androidx.constraintlayout.widget.ConstraintSet r2 = r8.mConstraintSet
            if (r2 == 0) goto L84
            r3 = 1
            r2.applyToInternal(r8, r3)
        L84:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r8.mLayoutWidget
            r2.removeAllChildren()
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r2 = r8.mConstraintHelpers
            int r2 = r2.size()
            if (r2 <= 0) goto La2
            r3 = 0
        L92:
            if (r3 >= r2) goto La2
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r4 = r8.mConstraintHelpers
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintHelper r4 = (androidx.constraintlayout.widget.ConstraintHelper) r4
            r4.updatePreLayout(r8)
            int r3 = r3 + 1
            goto L92
        La2:
            r2 = 0
        La3:
            if (r2 >= r6) goto Lb5
            android.view.View r3 = r8.getChildAt(r2)
            boolean r4 = r3 instanceof androidx.constraintlayout.widget.Placeholder
            if (r4 == 0) goto Lb2
            androidx.constraintlayout.widget.Placeholder r3 = (androidx.constraintlayout.widget.Placeholder) r3
            r3.updatePreLayout(r8)
        Lb2:
            int r2 = r2 + 1
            goto La3
        Lb5:
            android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r8.mTempMapIdToWidget
            r2.clear()
            android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r8.mTempMapIdToWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r8.mLayoutWidget
            r2.put(r0, r3)
            android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r8.mTempMapIdToWidget
            int r3 = r8.getId()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r8.mLayoutWidget
            r2.put(r3, r4)
            r2 = 0
        Lcd:
            if (r2 >= r6) goto Le3
            android.view.View r3 = r8.getChildAt(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r8.getViewWidget(r3)
            android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r8.mTempMapIdToWidget
            int r3 = r3.getId()
            r5.put(r3, r4)
            int r2 = r2 + 1
            goto Lcd
        Le3:
            r7 = 0
        Le4:
            if (r7 >= r6) goto L106
            android.view.View r2 = r8.getChildAt(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r8.getViewWidget(r2)
            if (r3 != 0) goto Lf1
            goto L103
        Lf1:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            r0.add(r3)
            android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r8.mTempMapIdToWidget
            r0 = r8
            r0.applyConstraintsFromLayoutParams(r1, r2, r3, r4, r5)
        L103:
            int r7 = r7 + 1
            goto Le4
        L106:
            return
    }

    private boolean updateHierarchy() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L17
            android.view.View r3 = r4.getChildAt(r2)
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L14
            r1 = 1
            goto L17
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            if (r1 == 0) goto L1c
            r4.setChildrenConstraints()
        L1c:
            return r1
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            return
    }

    protected void applyConstraintsFromLayoutParams(boolean r17, android.view.View r18, androidx.constraintlayout.solver.widgets.ConstraintWidget r19, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r20, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r21) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r7 = r20
            r8 = r21
            r7.validate()
            r9 = 0
            r7.helped = r9
            int r3 = r1.getVisibility()
            r2.setVisibility(r3)
            boolean r3 = r7.isInPlaceholder
            r10 = 1
            if (r3 == 0) goto L24
            r2.setInPlaceholder(r10)
            r3 = 8
            r2.setVisibility(r3)
        L24:
            r2.setCompanionWidget(r1)
            boolean r3 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r3 == 0) goto L36
            androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            boolean r3 = r3.isRtl()
            r1.resolveRtl(r2, r3)
        L36:
            boolean r1 = r7.isGuideline
            r11 = -1
            if (r1 == 0) goto L5a
            r1 = r2
            androidx.constraintlayout.solver.widgets.Guideline r1 = (androidx.constraintlayout.solver.widgets.Guideline) r1
            int r2 = r7.resolvedGuideBegin
            int r3 = r7.resolvedGuideEnd
            float r4 = r7.resolvedGuidePercent
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L4e
            r1.setGuidePercent(r4)
            return
        L4e:
            if (r2 == r11) goto L54
            r1.setGuideBegin(r2)
            return
        L54:
            if (r3 == r11) goto L59
            r1.setGuideEnd(r3)
        L59:
            return
        L5a:
            int r1 = r7.resolvedLeftToLeft
            int r3 = r7.resolvedLeftToRight
            int r12 = r7.resolvedRightToLeft
            int r13 = r7.resolvedRightToRight
            int r6 = r7.resolveGoneLeftMargin
            int r14 = r7.resolveGoneRightMargin
            float r15 = r7.resolvedHorizontalBias
            int r4 = r7.circleConstraint
            if (r4 == r11) goto L7e
            java.lang.Object r1 = r8.get(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r1
            if (r1 == 0) goto L7b
            float r3 = r7.circleAngle
            int r4 = r7.circleRadius
            r2.connectCircularConstraint(r1, r3, r4)
        L7b:
            r1 = r2
            goto L1a4
        L7e:
            if (r1 == r11) goto L94
            java.lang.Object r1 = r8.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto Laa
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r5 = r7.leftMargin
            r4 = r2
            r1 = r19
            r1.immediateConnect(r2, r3, r4, r5, r6)
            goto Laa
        L94:
            if (r3 == r11) goto Laa
            java.lang.Object r1 = r8.get(r3)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto Laa
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r5 = r7.leftMargin
            r1 = r19
            r1.immediateConnect(r2, r3, r4, r5, r6)
        Laa:
            if (r12 == r11) goto Lc2
            java.lang.Object r1 = r8.get(r12)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto Ld8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r5 = r7.rightMargin
            r1 = r19
            r6 = r14
            r1.immediateConnect(r2, r3, r4, r5, r6)
            goto Ld8
        Lc2:
            r6 = r14
            if (r13 == r11) goto Ld8
            java.lang.Object r1 = r8.get(r13)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto Ld8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r5 = r7.rightMargin
            r4 = r2
            r1 = r19
            r1.immediateConnect(r2, r3, r4, r5, r6)
        Ld8:
            int r1 = r7.topToTop
            if (r1 == r11) goto Lf2
            java.lang.Object r1 = r8.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L10c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r5 = r7.topMargin
            int r6 = r7.goneTopMargin
            r4 = r2
            r1 = r19
            r1.immediateConnect(r2, r3, r4, r5, r6)
            goto L10c
        Lf2:
            int r1 = r7.topToBottom
            if (r1 == r11) goto L10c
            java.lang.Object r1 = r8.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L10c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r5 = r7.topMargin
            int r6 = r7.goneTopMargin
            r1 = r19
            r1.immediateConnect(r2, r3, r4, r5, r6)
        L10c:
            int r1 = r7.bottomToTop
            if (r1 == r11) goto L129
            java.lang.Object r1 = r8.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L126
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r5 = r7.bottomMargin
            int r6 = r7.goneBottomMargin
            r1 = r19
            r1.immediateConnect(r2, r3, r4, r5, r6)
        L126:
            r1 = r19
            goto L142
        L129:
            int r1 = r7.bottomToBottom
            if (r1 == r11) goto L126
            java.lang.Object r1 = r8.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L126
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r5 = r7.bottomMargin
            int r6 = r7.goneBottomMargin
            r4 = r2
            r1 = r19
            r1.immediateConnect(r2, r3, r4, r5, r6)
        L142:
            int r2 = r7.baselineToBaseline
            if (r2 == r11) goto L193
            android.util.SparseArray<android.view.View> r3 = r0.mChildrenByIds
            java.lang.Object r2 = r3.get(r2)
            android.view.View r2 = (android.view.View) r2
            int r3 = r7.baselineToBaseline
            java.lang.Object r3 = r8.get(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L193
            if (r2 == 0) goto L193
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            boolean r4 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r4 == 0) goto L193
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            r7.needsBaseline = r10
            r2.needsBaseline = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.getAnchor(r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            r5.connect(r3, r9, r11, r10)
            r1.setHasBaseline(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.widget
            r2.setHasBaseline(r10)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.getAnchor(r2)
            r2.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.getAnchor(r2)
            r2.reset()
        L193:
            r2 = 0
            int r3 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r3 < 0) goto L19b
            r1.setHorizontalBiasPercent(r15)
        L19b:
            float r3 = r7.verticalBias
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L1a4
            r1.setVerticalBiasPercent(r3)
        L1a4:
            if (r17 == 0) goto L1b3
            int r2 = r7.editorAbsoluteX
            if (r2 != r11) goto L1ae
            int r3 = r7.editorAbsoluteY
            if (r3 == r11) goto L1b3
        L1ae:
            int r3 = r7.editorAbsoluteY
            r1.setOrigin(r2, r3)
        L1b3:
            boolean r2 = r7.horizontalDimensionFixed
            r3 = -2
            if (r2 != 0) goto L1e9
            int r2 = r7.width
            if (r2 != r11) goto L1e0
            boolean r2 = r7.constrainedWidth
            if (r2 == 0) goto L1c6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r1.setHorizontalDimensionBehaviour(r2)
            goto L1cb
        L1c6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r1.setHorizontalDimensionBehaviour(r2)
        L1cb:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.getAnchor(r2)
            int r4 = r7.leftMargin
            r2.mMargin = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.getAnchor(r2)
            int r4 = r7.rightMargin
            r2.mMargin = r4
            goto L1fc
        L1e0:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r1.setHorizontalDimensionBehaviour(r2)
            r1.setWidth(r9)
            goto L1fc
        L1e9:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.setHorizontalDimensionBehaviour(r2)
            int r2 = r7.width
            r1.setWidth(r2)
            int r2 = r7.width
            if (r2 != r3) goto L1fc
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r1.setHorizontalDimensionBehaviour(r2)
        L1fc:
            boolean r2 = r7.verticalDimensionFixed
            if (r2 != 0) goto L231
            int r2 = r7.height
            if (r2 != r11) goto L228
            boolean r2 = r7.constrainedHeight
            if (r2 == 0) goto L20e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r1.setVerticalDimensionBehaviour(r2)
            goto L213
        L20e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r1.setVerticalDimensionBehaviour(r2)
        L213:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.getAnchor(r2)
            int r3 = r7.topMargin
            r2.mMargin = r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.getAnchor(r2)
            int r3 = r7.bottomMargin
            r2.mMargin = r3
            goto L244
        L228:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r1.setVerticalDimensionBehaviour(r2)
            r1.setHeight(r9)
            goto L244
        L231:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.setVerticalDimensionBehaviour(r2)
            int r2 = r7.height
            r1.setHeight(r2)
            int r2 = r7.height
            if (r2 != r3) goto L244
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r1.setVerticalDimensionBehaviour(r2)
        L244:
            java.lang.String r2 = r7.dimensionRatio
            r1.setDimensionRatio(r2)
            float r2 = r7.horizontalWeight
            r1.setHorizontalWeight(r2)
            float r2 = r7.verticalWeight
            r1.setVerticalWeight(r2)
            int r2 = r7.horizontalChainStyle
            r1.setHorizontalChainStyle(r2)
            int r2 = r7.verticalChainStyle
            r1.setVerticalChainStyle(r2)
            int r2 = r7.matchConstraintDefaultWidth
            int r3 = r7.matchConstraintMinWidth
            int r4 = r7.matchConstraintMaxWidth
            float r5 = r7.matchConstraintPercentWidth
            r1.setHorizontalMatchStyle(r2, r3, r4, r5)
            int r2 = r7.matchConstraintDefaultHeight
            int r3 = r7.matchConstraintMinHeight
            int r4 = r7.matchConstraintMaxHeight
            float r5 = r7.matchConstraintPercentHeight
            r1.setVerticalMatchStyle(r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r0.mConstraintHelpers
            r2 = 0
            if (r1 == 0) goto L1e
            int r1 = r1.size()
            if (r1 <= 0) goto L1e
            r3 = 0
        Le:
            if (r3 >= r1) goto L1e
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r4 = r0.mConstraintHelpers
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintHelper r4 = (androidx.constraintlayout.widget.ConstraintHelper) r4
            r4.updatePreDraw(r0)
            int r3 = r3 + 1
            goto Le
        L1e:
            super.dispatchDraw(r18)
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto Ld1
            int r1 = r0.getChildCount()
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r4 = r0.getHeight()
            float r4 = (float) r4
            r5 = 0
        L36:
            if (r5 >= r1) goto Ld1
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L46
            goto Lcd
        L46:
            java.lang.Object r6 = r6.getTag()
            if (r6 == 0) goto Lcd
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lcd
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 4
            if (r7 != r8) goto Lcd
            r7 = r6[r2]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = 1
            r8 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r8)
            r9 = 2
            r9 = r6[r9]
            int r9 = java.lang.Integer.parseInt(r9)
            r10 = 3
            r6 = r6[r10]
            int r6 = java.lang.Integer.parseInt(r6)
            float r7 = (float) r7
            r10 = 1149698048(0x44870000, float:1080.0)
            float r7 = r7 / r10
            float r7 = r7 * r3
            int r7 = (int) r7
            float r8 = (float) r8
            r11 = 1156579328(0x44f00000, float:1920.0)
            float r8 = r8 / r11
            float r8 = r8 * r4
            int r8 = (int) r8
            float r9 = (float) r9
            float r9 = r9 / r10
            float r9 = r9 * r3
            int r9 = (int) r9
            float r6 = (float) r6
            float r6 = r6 / r11
            float r6 = r6 * r4
            int r6 = (int) r6
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>()
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r15.setColor(r10)
            float r11 = (float) r7
            float r12 = (float) r8
            int r7 = r7 + r9
            float r13 = (float) r7
            r14 = r12
            r10 = r18
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            int r8 = r8 + r6
            float r14 = (float) r8
            r11 = r13
            r10.drawLine(r11, r12, r13, r14, r15)
            r6 = r12
            r12 = r14
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            r11 = r13
            r14 = r6
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r6 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.setColor(r6)
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r10.drawLine(r11, r12, r13, r14, r15)
        Lcd:
            int r5 = r5 + 1
            goto L36
        Ld1:
            return
    }

    public void fillMetrics(androidx.constraintlayout.solver.Metrics r2) {
            r1 = this;
            r1.mMetrics = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r1.mLayoutWidget
            r0.fillMetrics(r2)
            return
    }

    @Override // android.view.View
    public void forceLayout() {
            r0 = this;
            r0.markHierarchyDirty()
            super.forceLayout()
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public java.lang.Object getDesignInformation(int r1, java.lang.Object r2) {
            r0 = this;
            if (r1 != 0) goto L19
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.mDesignIds
            if (r1 == 0) goto L19
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L19
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.mDesignIds
            java.lang.Object r1 = r1.get(r2)
            return r1
        L19:
            r1 = 0
            return r1
    }

    public int getMaxHeight() {
            r1 = this;
            int r0 = r1.mMaxHeight
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.mMaxWidth
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

    public int getOptimizationLevel() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r1.mLayoutWidget
            int r0 = r0.getOptimizationLevel()
            return r0
    }

    public android.view.View getViewById(int r2) {
            r1 = this;
            android.util.SparseArray<android.view.View> r0 = r1.mChildrenByIds
            java.lang.Object r2 = r0.get(r2)
            android.view.View r2 = (android.view.View) r2
            return r2
    }

    public final androidx.constraintlayout.solver.widgets.ConstraintWidget getViewWidget(android.view.View r1) {
            r0 = this;
            if (r1 != r0) goto L5
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            return r1
        L5:
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.widget
            return r1
    }

    protected boolean isRtl() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L17
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r1 != r0) goto L17
            return r1
        L17:
            r0 = 0
            return r0
    }

    public void loadLayoutDescription(int r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L12
            androidx.constraintlayout.widget.ConstraintLayoutStates r1 = new androidx.constraintlayout.widget.ConstraintLayoutStates     // Catch: android.content.res.Resources.NotFoundException -> Lf
            android.content.Context r2 = r3.getContext()     // Catch: android.content.res.Resources.NotFoundException -> Lf
            r1.<init>(r2, r3, r4)     // Catch: android.content.res.Resources.NotFoundException -> Lf
            r3.mConstraintLayoutSpec = r1     // Catch: android.content.res.Resources.NotFoundException -> Lf
            return
        Lf:
            r3.mConstraintLayoutSpec = r0
            return
        L12:
            r3.mConstraintLayoutSpec = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int r6 = r5.getChildCount()
            boolean r7 = r5.isInEditMode()
            r8 = 0
            r9 = 0
        La:
            if (r9 >= r6) goto L5e
            android.view.View r10 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.widget
            int r2 = r10.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2f
            boolean r2 = r0.isGuideline
            if (r2 != 0) goto L2f
            boolean r2 = r0.isHelper
            if (r2 != 0) goto L2f
            boolean r2 = r0.isVirtualGroup
            if (r2 != 0) goto L2f
            if (r7 != 0) goto L2f
            goto L5b
        L2f:
            boolean r0 = r0.isInPlaceholder
            if (r0 == 0) goto L34
            goto L5b
        L34:
            int r0 = r1.getX()
            int r2 = r1.getY()
            int r3 = r1.getWidth()
            int r3 = r3 + r0
            int r1 = r1.getHeight()
            int r1 = r1 + r2
            r10.layout(r0, r2, r3, r1)
            boolean r4 = r10 instanceof androidx.constraintlayout.widget.Placeholder
            if (r4 == 0) goto L5b
            androidx.constraintlayout.widget.Placeholder r10 = (androidx.constraintlayout.widget.Placeholder) r10
            android.view.View r10 = r10.getContent()
            if (r10 == 0) goto L5b
            r10.setVisibility(r8)
            r10.layout(r0, r2, r3, r1)
        L5b:
            int r9 = r9 + 1
            goto La
        L5e:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r6 = r5.mConstraintHelpers
            int r6 = r6.size()
            if (r6 <= 0) goto L76
        L66:
            if (r8 >= r6) goto L76
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r7 = r5.mConstraintHelpers
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.widget.ConstraintHelper r7 = (androidx.constraintlayout.widget.ConstraintHelper) r7
            r7.updatePostLayout(r5)
            int r8 = r8 + 1
            goto L66
        L76:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r9, int r10) {
            r8 = this;
            r8.mOnMeasureWidthMeasureSpec = r9
            r8.mOnMeasureHeightMeasureSpec = r10
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            boolean r1 = r8.isRtl()
            r0.setRtl(r1)
            boolean r0 = r8.mDirtyHierarchy
            if (r0 == 0) goto L1f
            r0 = 0
            r8.mDirtyHierarchy = r0
            boolean r0 = r8.updateHierarchy()
            if (r0 == 0) goto L1f
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            r0.updateHierarchy()
        L1f:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            int r1 = r8.mOptimizationLevel
            r8.resolveSystem(r0, r1, r9, r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            int r4 = r0.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            int r5 = r0.getHeight()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            boolean r6 = r0.isWidthMeasuredTooSmall()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.mLayoutWidget
            boolean r7 = r0.isHeightMeasuredTooSmall()
            r1 = r8
            r2 = r9
            r3 = r10
            r1.resolveMeasuredDimension(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r4) {
            r3 = this;
            super.onViewAdded(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.getViewWidget(r4)
            boolean r1 = r4 instanceof androidx.constraintlayout.widget.Guideline
            r2 = 1
            if (r1 == 0) goto L24
            boolean r0 = r0 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r0 != 0) goto L24
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            androidx.constraintlayout.solver.widgets.Guideline r1 = new androidx.constraintlayout.solver.widgets.Guideline
            r1.<init>()
            r0.widget = r1
            r0.isGuideline = r2
            int r0 = r0.orientation
            r1.setOrientation(r0)
        L24:
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r0 == 0) goto L43
            r0 = r4
            androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
            r0.validateParams()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r1.isHelper = r2
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r3.mConstraintHelpers
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L43
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r3.mConstraintHelpers
            r1.add(r0)
        L43:
            android.util.SparseArray<android.view.View> r0 = r3.mChildrenByIds
            int r1 = r4.getId()
            r0.put(r1, r4)
            r3.mDirtyHierarchy = r2
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            android.util.SparseArray<android.view.View> r0 = r2.mChildrenByIds
            int r1 = r3.getId()
            r0.remove(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.getViewWidget(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r2.mLayoutWidget
            r1.remove(r0)
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r0 = r2.mConstraintHelpers
            r0.remove(r3)
            r3 = 1
            r2.mDirtyHierarchy = r3
            return
    }

    protected void parseLayoutDescription(int r3) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = new androidx.constraintlayout.widget.ConstraintLayoutStates
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r2, r3)
            r2.mConstraintLayoutSpec = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r1) {
            r0 = this;
            super.removeView(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r0 = this;
            r0.markHierarchyDirty()
            super.requestLayout()
            return
    }

    protected void resolveMeasuredDimension(int r3, int r4, int r5, int r6, boolean r7, boolean r8) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = r2.mMeasurer
            int r1 = r0.paddingHeight
            int r0 = r0.paddingWidth
            int r5 = r5 + r0
            int r6 = r6 + r1
            r0 = 0
            int r3 = android.view.View.resolveSizeAndState(r5, r3, r0)
            int r4 = android.view.View.resolveSizeAndState(r6, r4, r0)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r5
            r4 = r4 & r5
            int r5 = r2.mMaxWidth
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r2.mMaxHeight
            int r4 = java.lang.Math.min(r5, r4)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == 0) goto L27
            r3 = r3 | r5
        L27:
            if (r8 == 0) goto L2a
            r4 = r4 | r5
        L2a:
            r2.setMeasuredDimension(r3, r4)
            r2.mLastMeasureWidth = r3
            r2.mLastMeasureHeight = r4
            return
    }

    protected void resolveSystem(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r14, int r15, int r16, int r17) {
            r13 = this;
            int r2 = android.view.View.MeasureSpec.getMode(r16)
            int r0 = android.view.View.MeasureSpec.getSize(r16)
            int r4 = android.view.View.MeasureSpec.getMode(r17)
            int r1 = android.view.View.MeasureSpec.getSize(r17)
            int r3 = r13.getPaddingTop()
            r5 = 0
            int r9 = java.lang.Math.max(r5, r3)
            int r3 = r13.getPaddingBottom()
            int r10 = java.lang.Math.max(r5, r3)
            int r12 = r9 + r10
            int r11 = r13.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r6 = r13.mMeasurer
            r7 = r16
            r8 = r17
            r6.captureLayoutInfos(r7, r8, r9, r10, r11, r12)
            int r3 = r13.getPaddingStart()
            int r3 = java.lang.Math.max(r5, r3)
            int r6 = r13.getPaddingEnd()
            int r6 = java.lang.Math.max(r5, r6)
            if (r3 > 0) goto L4f
            if (r6 <= 0) goto L45
            goto L4f
        L45:
            int r3 = r13.getPaddingLeft()
            int r3 = java.lang.Math.max(r5, r3)
        L4d:
            r8 = r3
            goto L56
        L4f:
            boolean r5 = r13.isRtl()
            if (r5 == 0) goto L4d
            r8 = r6
        L56:
            int r3 = r0 - r11
            int r5 = r1 - r12
            r0 = r13
            r1 = r14
            r0.setSelfDimensionBehaviour(r1, r2, r3, r4, r5)
            int r6 = r13.mLastMeasureWidth
            int r7 = r13.mLastMeasureHeight
            r0 = r14
            r1 = r15
            r0.measure(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void setConstraintSet(androidx.constraintlayout.widget.ConstraintSet r1) {
            r0 = this;
            r0.mConstraintSet = r1
            return
    }

    public void setDesignInformation(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            if (r2 != 0) goto L2d
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L2d
            boolean r2 = r4 instanceof java.lang.Integer
            if (r2 == 0) goto L2d
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r1.mDesignIds
            if (r2 != 0) goto L15
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.mDesignIds = r2
        L15:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "/"
            int r2 = r3.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L26
            int r2 = r2 + 1
            java.lang.String r3 = r3.substring(r2)
        L26:
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r1.mDesignIds
            r2.put(r3, r4)
        L2d:
            return
    }

    @Override // android.view.View
    public void setId(int r3) {
            r2 = this;
            android.util.SparseArray<android.view.View> r0 = r2.mChildrenByIds
            int r1 = r2.getId()
            r0.remove(r1)
            super.setId(r3)
            android.util.SparseArray<android.view.View> r3 = r2.mChildrenByIds
            int r0 = r2.getId()
            r3.put(r0, r2)
            return
    }

    public void setMaxHeight(int r2) {
            r1 = this;
            int r0 = r1.mMaxHeight
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMaxHeight = r2
            r1.requestLayout()
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            int r0 = r1.mMaxWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMaxWidth = r2
            r1.requestLayout()
            return
    }

    public void setMinHeight(int r2) {
            r1 = this;
            int r0 = r1.mMinHeight
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMinHeight = r2
            r1.requestLayout()
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            int r0 = r1.mMinWidth
            if (r2 != r0) goto L5
            return
        L5:
            r1.mMinWidth = r2
            r1.requestLayout()
            return
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener r2) {
            r1 = this;
            r1.mConstraintsChangedListener = r2
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L9
            r0.setOnConstraintsChanged(r2)
        L9:
            return
    }

    public void setOptimizationLevel(int r2) {
            r1 = this;
            r1.mOptimizationLevel = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r1.mLayoutWidget
            r0.setOptimizationLevel(r2)
            return
    }

    protected void setSelfDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = r7.mMeasurer
            int r1 = r0.paddingHeight
            int r0 = r0.paddingWidth
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L38
        L1a:
            int r9 = r7.mMaxWidth
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = 0
            goto L5d
        L40:
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.getWidth()
            if (r10 != r11) goto L69
            int r11 = r8.getHeight()
            if (r12 == r11) goto L6c
        L69:
            r8.invalidateMeasures()
        L6c:
            r8.setX(r5)
            r8.setY(r5)
            int r11 = r7.mMaxWidth
            int r11 = r11 - r0
            r8.setMaxWidth(r11)
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            r8.setMaxHeight(r11)
            r8.setMinWidth(r5)
            r8.setMinHeight(r5)
            r8.setHorizontalDimensionBehaviour(r9)
            r8.setWidth(r10)
            r8.setVerticalDimensionBehaviour(r2)
            r8.setHeight(r12)
            int r9 = r7.mMinWidth
            int r9 = r9 - r0
            r8.setMinWidth(r9)
            int r9 = r7.mMinHeight
            int r9 = r9 - r1
            r8.setMinHeight(r9)
            return
    }

    public void setState(int r2, int r3, int r4) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L9
            float r3 = (float) r3
            float r4 = (float) r4
            r0.updateConstraints(r2, r3, r4)
        L9:
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
