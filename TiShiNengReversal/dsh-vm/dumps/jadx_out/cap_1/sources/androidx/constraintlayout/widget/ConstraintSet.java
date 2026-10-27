package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_TO_BASELINE = 1;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final java.lang.String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    public static final int INVISIBLE = 4;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final java.lang.String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 82;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int[] VISIBILITY_FLAGS = null;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    private static android.util.SparseIntArray mapToConstant;
    private java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet.Constraint> mConstraints;
    private boolean mForceId;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mSavedAttributes;
    private boolean mValidate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Constraint {
        public final androidx.constraintlayout.widget.ConstraintSet.Layout layout;
        public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints;
        int mViewId;
        public final androidx.constraintlayout.widget.ConstraintSet.Motion motion;
        public final androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet;
        public final androidx.constraintlayout.widget.ConstraintSet.Transform transform;

        public Constraint() {
                r1 = this;
                r1.<init>()
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = new androidx.constraintlayout.widget.ConstraintSet$PropertySet
                r0.<init>()
                r1.propertySet = r0
                androidx.constraintlayout.widget.ConstraintSet$Motion r0 = new androidx.constraintlayout.widget.ConstraintSet$Motion
                r0.<init>()
                r1.motion = r0
                androidx.constraintlayout.widget.ConstraintSet$Layout r0 = new androidx.constraintlayout.widget.ConstraintSet$Layout
                r0.<init>()
                r1.layout = r0
                androidx.constraintlayout.widget.ConstraintSet$Transform r0 = new androidx.constraintlayout.widget.ConstraintSet$Transform
                r0.<init>()
                r1.transform = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mCustomConstraints = r0
                return
        }

        static /* synthetic */ void access$000(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r2) {
                r0.fillFrom(r1, r2)
                return
        }

        static /* synthetic */ void access$300(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, androidx.constraintlayout.widget.ConstraintHelper r1, int r2, androidx.constraintlayout.widget.Constraints.LayoutParams r3) {
                r0.fillFromConstraints(r1, r2, r3)
                return
        }

        static /* synthetic */ void access$400(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, androidx.constraintlayout.widget.Constraints.LayoutParams r2) {
                r0.fillFromConstraints(r1, r2)
                return
        }

        static /* synthetic */ void access$500(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, int r2) {
                r0.setIntValue(r1, r2)
                return
        }

        static /* synthetic */ void access$600(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, int r2) {
                r0.setColorValue(r1, r2)
                return
        }

        static /* synthetic */ void access$700(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, float r2) {
                r0.setFloatValue(r1, r2)
                return
        }

        static /* synthetic */ void access$800(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, java.lang.String r2) {
                r0.setStringValue(r1, r2)
                return
        }

        private void fillFrom(int r2, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r3) {
                r1 = this;
                r1.mViewId = r2
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r1.layout
                int r0 = r3.leftToLeft
                r2.leftToLeft = r0
                int r0 = r3.leftToRight
                r2.leftToRight = r0
                int r0 = r3.rightToLeft
                r2.rightToLeft = r0
                int r0 = r3.rightToRight
                r2.rightToRight = r0
                int r0 = r3.topToTop
                r2.topToTop = r0
                int r0 = r3.topToBottom
                r2.topToBottom = r0
                int r0 = r3.bottomToTop
                r2.bottomToTop = r0
                int r0 = r3.bottomToBottom
                r2.bottomToBottom = r0
                int r0 = r3.baselineToBaseline
                r2.baselineToBaseline = r0
                int r0 = r3.startToEnd
                r2.startToEnd = r0
                int r0 = r3.startToStart
                r2.startToStart = r0
                int r0 = r3.endToStart
                r2.endToStart = r0
                int r0 = r3.endToEnd
                r2.endToEnd = r0
                float r0 = r3.horizontalBias
                r2.horizontalBias = r0
                float r0 = r3.verticalBias
                r2.verticalBias = r0
                java.lang.String r0 = r3.dimensionRatio
                r2.dimensionRatio = r0
                int r0 = r3.circleConstraint
                r2.circleConstraint = r0
                int r0 = r3.circleRadius
                r2.circleRadius = r0
                float r0 = r3.circleAngle
                r2.circleAngle = r0
                int r0 = r3.editorAbsoluteX
                r2.editorAbsoluteX = r0
                int r0 = r3.editorAbsoluteY
                r2.editorAbsoluteY = r0
                int r0 = r3.orientation
                r2.orientation = r0
                float r0 = r3.guidePercent
                r2.guidePercent = r0
                int r0 = r3.guideBegin
                r2.guideBegin = r0
                int r0 = r3.guideEnd
                r2.guideEnd = r0
                int r0 = r3.width
                r2.mWidth = r0
                int r0 = r3.height
                r2.mHeight = r0
                int r0 = r3.leftMargin
                r2.leftMargin = r0
                int r0 = r3.rightMargin
                r2.rightMargin = r0
                int r0 = r3.topMargin
                r2.topMargin = r0
                int r0 = r3.bottomMargin
                r2.bottomMargin = r0
                float r0 = r3.verticalWeight
                r2.verticalWeight = r0
                float r0 = r3.horizontalWeight
                r2.horizontalWeight = r0
                int r0 = r3.verticalChainStyle
                r2.verticalChainStyle = r0
                int r0 = r3.horizontalChainStyle
                r2.horizontalChainStyle = r0
                boolean r0 = r3.constrainedWidth
                r2.constrainedWidth = r0
                boolean r0 = r3.constrainedHeight
                r2.constrainedHeight = r0
                int r0 = r3.matchConstraintDefaultWidth
                r2.widthDefault = r0
                int r0 = r3.matchConstraintDefaultHeight
                r2.heightDefault = r0
                int r0 = r3.matchConstraintMaxWidth
                r2.widthMax = r0
                int r0 = r3.matchConstraintMaxHeight
                r2.heightMax = r0
                int r0 = r3.matchConstraintMinWidth
                r2.widthMin = r0
                int r0 = r3.matchConstraintMinHeight
                r2.heightMin = r0
                float r0 = r3.matchConstraintPercentWidth
                r2.widthPercent = r0
                float r0 = r3.matchConstraintPercentHeight
                r2.heightPercent = r0
                java.lang.String r0 = r3.constraintTag
                r2.mConstraintTag = r0
                int r0 = r3.goneTopMargin
                r2.goneTopMargin = r0
                int r0 = r3.goneBottomMargin
                r2.goneBottomMargin = r0
                int r0 = r3.goneLeftMargin
                r2.goneLeftMargin = r0
                int r0 = r3.goneRightMargin
                r2.goneRightMargin = r0
                int r0 = r3.goneStartMargin
                r2.goneStartMargin = r0
                int r0 = r3.goneEndMargin
                r2.goneEndMargin = r0
                int r0 = r3.getMarginEnd()
                r2.endMargin = r0
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r1.layout
                int r3 = r3.getMarginStart()
                r2.startMargin = r3
                return
        }

        private void fillFromConstraints(int r2, androidx.constraintlayout.widget.Constraints.LayoutParams r3) {
                r1 = this;
                r1.fillFrom(r2, r3)
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r1.propertySet
                float r0 = r3.alpha
                r2.alpha = r0
                androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r1.transform
                float r0 = r3.rotation
                r2.rotation = r0
                float r0 = r3.rotationX
                r2.rotationX = r0
                float r0 = r3.rotationY
                r2.rotationY = r0
                float r0 = r3.scaleX
                r2.scaleX = r0
                float r0 = r3.scaleY
                r2.scaleY = r0
                float r0 = r3.transformPivotX
                r2.transformPivotX = r0
                float r0 = r3.transformPivotY
                r2.transformPivotY = r0
                float r0 = r3.translationX
                r2.translationX = r0
                float r0 = r3.translationY
                r2.translationY = r0
                float r0 = r3.translationZ
                r2.translationZ = r0
                float r0 = r3.elevation
                r2.elevation = r0
                boolean r3 = r3.applyElevation
                r2.applyElevation = r3
                return
        }

        private void fillFromConstraints(androidx.constraintlayout.widget.ConstraintHelper r1, int r2, androidx.constraintlayout.widget.Constraints.LayoutParams r3) {
                r0 = this;
                r0.fillFromConstraints(r2, r3)
                boolean r2 = r1 instanceof androidx.constraintlayout.widget.Barrier
                if (r2 == 0) goto L24
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout
                r3 = 1
                r2.mHelperType = r3
                androidx.constraintlayout.widget.Barrier r1 = (androidx.constraintlayout.widget.Barrier) r1
                int r3 = r1.getType()
                r2.mBarrierDirection = r3
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout
                int[] r3 = r1.getReferencedIds()
                r2.mReferenceIds = r3
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout
                int r1 = r1.getMargin()
                r2.mBarrierMargin = r1
            L24:
                return
        }

        private androidx.constraintlayout.widget.ConstraintAttribute get(java.lang.String r3, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r4) {
                r2 = this;
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L36
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints
                java.lang.Object r3 = r0.get(r3)
                androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = r3.getType()
                if (r0 != r4) goto L17
                return r3
            L17:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ConstraintAttribute is already a "
                r0.append(r1)
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = r3.getType()
                java.lang.String r3 = r3.name()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            L36:
                androidx.constraintlayout.widget.ConstraintAttribute r0 = new androidx.constraintlayout.widget.ConstraintAttribute
                r0.<init>(r3, r4)
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r2.mCustomConstraints
                r4.put(r3, r0)
                return r0
        }

        private void setColorValue(java.lang.String r2, int r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setColorValue(r3)
                return
        }

        private void setFloatValue(java.lang.String r2, float r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setFloatValue(r3)
                return
        }

        private void setIntValue(java.lang.String r2, int r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setIntValue(r3)
                return
        }

        private void setStringValue(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setStringValue(r3)
                return
        }

        public void applyTo(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r3) {
                r2 = this;
                androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout
                int r1 = r0.leftToLeft
                r3.leftToLeft = r1
                int r1 = r0.leftToRight
                r3.leftToRight = r1
                int r1 = r0.rightToLeft
                r3.rightToLeft = r1
                int r1 = r0.rightToRight
                r3.rightToRight = r1
                int r1 = r0.topToTop
                r3.topToTop = r1
                int r1 = r0.topToBottom
                r3.topToBottom = r1
                int r1 = r0.bottomToTop
                r3.bottomToTop = r1
                int r1 = r0.bottomToBottom
                r3.bottomToBottom = r1
                int r1 = r0.baselineToBaseline
                r3.baselineToBaseline = r1
                int r1 = r0.startToEnd
                r3.startToEnd = r1
                int r1 = r0.startToStart
                r3.startToStart = r1
                int r1 = r0.endToStart
                r3.endToStart = r1
                int r1 = r0.endToEnd
                r3.endToEnd = r1
                int r1 = r0.leftMargin
                r3.leftMargin = r1
                int r1 = r0.rightMargin
                r3.rightMargin = r1
                int r1 = r0.topMargin
                r3.topMargin = r1
                int r1 = r0.bottomMargin
                r3.bottomMargin = r1
                int r1 = r0.goneStartMargin
                r3.goneStartMargin = r1
                int r1 = r0.goneEndMargin
                r3.goneEndMargin = r1
                int r1 = r0.goneTopMargin
                r3.goneTopMargin = r1
                int r1 = r0.goneBottomMargin
                r3.goneBottomMargin = r1
                float r1 = r0.horizontalBias
                r3.horizontalBias = r1
                float r1 = r0.verticalBias
                r3.verticalBias = r1
                int r1 = r0.circleConstraint
                r3.circleConstraint = r1
                int r1 = r0.circleRadius
                r3.circleRadius = r1
                float r1 = r0.circleAngle
                r3.circleAngle = r1
                java.lang.String r1 = r0.dimensionRatio
                r3.dimensionRatio = r1
                int r1 = r0.editorAbsoluteX
                r3.editorAbsoluteX = r1
                int r1 = r0.editorAbsoluteY
                r3.editorAbsoluteY = r1
                float r1 = r0.verticalWeight
                r3.verticalWeight = r1
                float r1 = r0.horizontalWeight
                r3.horizontalWeight = r1
                int r1 = r0.verticalChainStyle
                r3.verticalChainStyle = r1
                int r1 = r0.horizontalChainStyle
                r3.horizontalChainStyle = r1
                boolean r1 = r0.constrainedWidth
                r3.constrainedWidth = r1
                boolean r1 = r0.constrainedHeight
                r3.constrainedHeight = r1
                int r1 = r0.widthDefault
                r3.matchConstraintDefaultWidth = r1
                int r1 = r0.heightDefault
                r3.matchConstraintDefaultHeight = r1
                int r1 = r0.widthMax
                r3.matchConstraintMaxWidth = r1
                int r1 = r0.heightMax
                r3.matchConstraintMaxHeight = r1
                int r1 = r0.widthMin
                r3.matchConstraintMinWidth = r1
                int r1 = r0.heightMin
                r3.matchConstraintMinHeight = r1
                float r1 = r0.widthPercent
                r3.matchConstraintPercentWidth = r1
                float r1 = r0.heightPercent
                r3.matchConstraintPercentHeight = r1
                int r1 = r0.orientation
                r3.orientation = r1
                float r1 = r0.guidePercent
                r3.guidePercent = r1
                int r1 = r0.guideBegin
                r3.guideBegin = r1
                int r1 = r0.guideEnd
                r3.guideEnd = r1
                int r1 = r0.mWidth
                r3.width = r1
                int r1 = r0.mHeight
                r3.height = r1
                java.lang.String r1 = r0.mConstraintTag
                if (r1 == 0) goto Lcc
                r3.constraintTag = r1
            Lcc:
                int r0 = r0.startMargin
                r3.setMarginStart(r0)
                androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout
                int r0 = r0.endMargin
                r3.setMarginEnd(r0)
                r3.validate()
                return
        }

        public androidx.constraintlayout.widget.ConstraintSet.Constraint clone() {
                r3 = this;
                androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r0.layout
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r3.layout
                r1.copyFrom(r2)
                androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r0.motion
                androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r3.motion
                r1.copyFrom(r2)
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r0.propertySet
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r3.propertySet
                r1.copyFrom(r2)
                androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r0.transform
                androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r3.transform
                r1.copyFrom(r2)
                int r1 = r3.mViewId
                r0.mViewId = r1
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m46clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.clone()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        private static final int UNUSED = 76;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_PERCENT = 69;
        private static android.util.SparseIntArray mapToConstant;
        public int baselineToBaseline;
        public int bottomMargin;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public java.lang.String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endMargin;
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
        public int heightDefault;
        public int heightMax;
        public int heightMin;
        public float heightPercent;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftMargin;
        public int leftToLeft;
        public int leftToRight;
        public boolean mApply;
        public boolean mBarrierAllowsGoneWidgets;
        public int mBarrierDirection;
        public int mBarrierMargin;
        public java.lang.String mConstraintTag;
        public int mHeight;
        public int mHelperType;
        public boolean mIsGuideline;
        public java.lang.String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public int orientation;
        public int rightMargin;
        public int rightToLeft;
        public int rightToRight;
        public int startMargin;
        public int startToEnd;
        public int startToStart;
        public int topMargin;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int widthDefault;
        public int widthMax;
        public int widthMin;
        public float widthPercent;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toLeftOf
                r2 = 24
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toRightOf
                r2 = 25
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toLeftOf
                r2 = 28
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toRightOf
                r2 = 29
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toTopOf
                r2 = 35
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toBottomOf
                r2 = 34
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toTopOf
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toBottomOf
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_toBaselineOf
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteX
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteY
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_begin
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_end
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_percent
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_orientation
                r2 = 26
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toEndOf
                r2 = 31
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toStartOf
                r2 = 32
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toStartOf
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toEndOf
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginLeft
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginTop
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginRight
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginBottom
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginStart
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginEnd
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_weight
                r2 = 38
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_weight
                r2 = 37
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_chainStyle
                r2 = 39
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_chainStyle
                r2 = 40
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_bias
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_bias
                r2 = 36
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintDimensionRatio
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_creator
                r2 = 76
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginLeft
                r2 = 23
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginRight
                r2 = 27
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginStart
                r2 = 30
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginEnd
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginTop
                r2 = 33
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginBottom
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_width
                r2 = 22
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_height
                r2 = 21
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircle
                r2 = 61
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleRadius
                r2 = 62
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleAngle
                r2 = 63
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_percent
                r2 = 69
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight_percent
                r2 = 70
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_chainUseRtl
                r2 = 71
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_barrierDirection
                r2 = 72
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_barrierMargin
                r2 = 73
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_constraint_referenced_ids
                r2 = 74
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_barrierAllowsGoneWidgets
                r2 = 75
                r0.append(r1, r2)
                return
        }

        public Layout() {
                r4 = this;
                r4.<init>()
                r0 = 0
                r4.mIsGuideline = r0
                r4.mApply = r0
                r1 = -1
                r4.guideBegin = r1
                r4.guideEnd = r1
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r4.guidePercent = r2
                r4.leftToLeft = r1
                r4.leftToRight = r1
                r4.rightToLeft = r1
                r4.rightToRight = r1
                r4.topToTop = r1
                r4.topToBottom = r1
                r4.bottomToTop = r1
                r4.bottomToBottom = r1
                r4.baselineToBaseline = r1
                r4.startToEnd = r1
                r4.startToStart = r1
                r4.endToStart = r1
                r4.endToEnd = r1
                r3 = 1056964608(0x3f000000, float:0.5)
                r4.horizontalBias = r3
                r4.verticalBias = r3
                r3 = 0
                r4.dimensionRatio = r3
                r4.circleConstraint = r1
                r4.circleRadius = r0
                r3 = 0
                r4.circleAngle = r3
                r4.editorAbsoluteX = r1
                r4.editorAbsoluteY = r1
                r4.orientation = r1
                r4.leftMargin = r1
                r4.rightMargin = r1
                r4.topMargin = r1
                r4.bottomMargin = r1
                r4.endMargin = r1
                r4.startMargin = r1
                r4.goneLeftMargin = r1
                r4.goneTopMargin = r1
                r4.goneRightMargin = r1
                r4.goneBottomMargin = r1
                r4.goneEndMargin = r1
                r4.goneStartMargin = r1
                r4.verticalWeight = r2
                r4.horizontalWeight = r2
                r4.horizontalChainStyle = r0
                r4.verticalChainStyle = r0
                r4.widthDefault = r0
                r4.heightDefault = r0
                r4.widthMax = r1
                r4.heightMax = r1
                r4.widthMin = r1
                r4.heightMin = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r4.widthPercent = r2
                r4.heightPercent = r2
                r4.mBarrierDirection = r1
                r4.mBarrierMargin = r0
                r4.mHelperType = r1
                r4.constrainedWidth = r0
                r4.constrainedHeight = r0
                r0 = 1
                r4.mBarrierAllowsGoneWidgets = r0
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Layout r3) {
                r2 = this;
                boolean r0 = r3.mIsGuideline
                r2.mIsGuideline = r0
                int r0 = r3.mWidth
                r2.mWidth = r0
                boolean r0 = r3.mApply
                r2.mApply = r0
                int r0 = r3.mHeight
                r2.mHeight = r0
                int r0 = r3.guideBegin
                r2.guideBegin = r0
                int r0 = r3.guideEnd
                r2.guideEnd = r0
                float r0 = r3.guidePercent
                r2.guidePercent = r0
                int r0 = r3.leftToLeft
                r2.leftToLeft = r0
                int r0 = r3.leftToRight
                r2.leftToRight = r0
                int r0 = r3.rightToLeft
                r2.rightToLeft = r0
                int r0 = r3.rightToRight
                r2.rightToRight = r0
                int r0 = r3.topToTop
                r2.topToTop = r0
                int r0 = r3.topToBottom
                r2.topToBottom = r0
                int r0 = r3.bottomToTop
                r2.bottomToTop = r0
                int r0 = r3.bottomToBottom
                r2.bottomToBottom = r0
                int r0 = r3.baselineToBaseline
                r2.baselineToBaseline = r0
                int r0 = r3.startToEnd
                r2.startToEnd = r0
                int r0 = r3.startToStart
                r2.startToStart = r0
                int r0 = r3.endToStart
                r2.endToStart = r0
                int r0 = r3.endToEnd
                r2.endToEnd = r0
                float r0 = r3.horizontalBias
                r2.horizontalBias = r0
                float r0 = r3.verticalBias
                r2.verticalBias = r0
                java.lang.String r0 = r3.dimensionRatio
                r2.dimensionRatio = r0
                int r0 = r3.circleConstraint
                r2.circleConstraint = r0
                int r0 = r3.circleRadius
                r2.circleRadius = r0
                float r0 = r3.circleAngle
                r2.circleAngle = r0
                int r0 = r3.editorAbsoluteX
                r2.editorAbsoluteX = r0
                int r0 = r3.editorAbsoluteY
                r2.editorAbsoluteY = r0
                int r0 = r3.orientation
                r2.orientation = r0
                int r0 = r3.leftMargin
                r2.leftMargin = r0
                int r0 = r3.rightMargin
                r2.rightMargin = r0
                int r0 = r3.topMargin
                r2.topMargin = r0
                int r0 = r3.bottomMargin
                r2.bottomMargin = r0
                int r0 = r3.endMargin
                r2.endMargin = r0
                int r0 = r3.startMargin
                r2.startMargin = r0
                int r0 = r3.goneLeftMargin
                r2.goneLeftMargin = r0
                int r0 = r3.goneTopMargin
                r2.goneTopMargin = r0
                int r0 = r3.goneRightMargin
                r2.goneRightMargin = r0
                int r0 = r3.goneBottomMargin
                r2.goneBottomMargin = r0
                int r0 = r3.goneEndMargin
                r2.goneEndMargin = r0
                int r0 = r3.goneStartMargin
                r2.goneStartMargin = r0
                float r0 = r3.verticalWeight
                r2.verticalWeight = r0
                float r0 = r3.horizontalWeight
                r2.horizontalWeight = r0
                int r0 = r3.horizontalChainStyle
                r2.horizontalChainStyle = r0
                int r0 = r3.verticalChainStyle
                r2.verticalChainStyle = r0
                int r0 = r3.widthDefault
                r2.widthDefault = r0
                int r0 = r3.heightDefault
                r2.heightDefault = r0
                int r0 = r3.widthMax
                r2.widthMax = r0
                int r0 = r3.heightMax
                r2.heightMax = r0
                int r0 = r3.widthMin
                r2.widthMin = r0
                int r0 = r3.heightMin
                r2.heightMin = r0
                float r0 = r3.widthPercent
                r2.widthPercent = r0
                float r0 = r3.heightPercent
                r2.heightPercent = r0
                int r0 = r3.mBarrierDirection
                r2.mBarrierDirection = r0
                int r0 = r3.mBarrierMargin
                r2.mBarrierMargin = r0
                int r0 = r3.mHelperType
                r2.mHelperType = r0
                java.lang.String r0 = r3.mConstraintTag
                r2.mConstraintTag = r0
                int[] r0 = r3.mReferenceIds
                if (r0 == 0) goto Lf0
                int r1 = r0.length
                int[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.mReferenceIds = r0
                goto Lf3
            Lf0:
                r0 = 0
                r2.mReferenceIds = r0
            Lf3:
                java.lang.String r0 = r3.mReferenceIdString
                r2.mReferenceIdString = r0
                boolean r0 = r3.constrainedWidth
                r2.constrainedWidth = r0
                boolean r0 = r3.constrainedHeight
                r2.constrainedHeight = r0
                boolean r3 = r3.mBarrierAllowsGoneWidgets
                r2.mBarrierAllowsGoneWidgets = r3
                return
        }

        public void dump(androidx.constraintlayout.motion.widget.MotionScene r10, java.lang.StringBuilder r11) {
                r9 = this;
                java.lang.Class r0 = r9.getClass()
                java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
                java.lang.String r1 = "\n"
                r11.append(r1)
                r1 = 0
            Le:
                int r2 = r0.length
                if (r1 >= r2) goto L7b
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                int r4 = r2.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                if (r4 == 0) goto L22
                goto L78
            L22:
                java.lang.Object r4 = r2.get(r9)     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.Class r2 = r2.getType()     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.String r6 = "\"\n"
                java.lang.String r7 = " = \""
                java.lang.String r8 = "    "
                if (r2 != r5) goto L59
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.IllegalAccessException -> L78
                int r2 = r4.intValue()     // Catch: java.lang.IllegalAccessException -> L78
                r5 = -1
                if (r2 == r5) goto L78
                int r2 = r4.intValue()     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.String r2 = r10.lookUpConstraintName(r2)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r8)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r3)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r7)     // Catch: java.lang.IllegalAccessException -> L78
                if (r2 != 0) goto L51
                goto L52
            L51:
                r4 = r2
            L52:
                r11.append(r4)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r6)     // Catch: java.lang.IllegalAccessException -> L78
                goto L78
            L59:
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch: java.lang.IllegalAccessException -> L78
                if (r2 != r5) goto L78
                java.lang.Float r4 = (java.lang.Float) r4     // Catch: java.lang.IllegalAccessException -> L78
                float r2 = r4.floatValue()     // Catch: java.lang.IllegalAccessException -> L78
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 == 0) goto L78
                r11.append(r8)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r3)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r7)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r4)     // Catch: java.lang.IllegalAccessException -> L78
                r11.append(r6)     // Catch: java.lang.IllegalAccessException -> L78
            L78:
                int r1 = r1 + 1
                goto Le
            L7b:
                return
        }

        void fillFromAttributeList(android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Layout
                android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
                r6 = 1
                r4.mApply = r6
                int r6 = r5.getIndexCount()
                r0 = 0
            Le:
                if (r0 >= r6) goto L275
                int r1 = r5.getIndex(r0)
                android.util.SparseIntArray r2 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r2 = r2.get(r1)
                r3 = 80
                if (r2 == r3) goto L269
                r3 = 81
                if (r2 == r3) goto L260
                switch(r2) {
                    case 1: goto L257;
                    case 2: goto L24e;
                    case 3: goto L245;
                    case 4: goto L23c;
                    case 5: goto L235;
                    case 6: goto L22c;
                    case 7: goto L223;
                    case 8: goto L21a;
                    case 9: goto L211;
                    case 10: goto L208;
                    case 11: goto L1fe;
                    case 12: goto L1f4;
                    case 13: goto L1ea;
                    case 14: goto L1e0;
                    case 15: goto L1d6;
                    case 16: goto L1cc;
                    case 17: goto L1c2;
                    case 18: goto L1b8;
                    case 19: goto L1ae;
                    case 20: goto L1a4;
                    case 21: goto L19a;
                    case 22: goto L190;
                    case 23: goto L186;
                    case 24: goto L17c;
                    case 25: goto L172;
                    case 26: goto L168;
                    case 27: goto L15e;
                    case 28: goto L154;
                    case 29: goto L14a;
                    case 30: goto L140;
                    case 31: goto L136;
                    case 32: goto L12c;
                    case 33: goto L122;
                    case 34: goto L118;
                    case 35: goto L10e;
                    case 36: goto L104;
                    case 37: goto Lfa;
                    case 38: goto Lf0;
                    case 39: goto Le6;
                    case 40: goto Ldc;
                    default: goto L25;
                }
            L25:
                switch(r2) {
                    case 54: goto Ld2;
                    case 55: goto Lc8;
                    case 56: goto Lbe;
                    case 57: goto Lb4;
                    case 58: goto Laa;
                    case 59: goto La0;
                    default: goto L28;
                }
            L28:
                switch(r2) {
                    case 61: goto L96;
                    case 62: goto L8c;
                    case 63: goto L82;
                    default: goto L2b;
                }
            L2b:
                r3 = 1065353216(0x3f800000, float:1.0)
                switch(r2) {
                    case 69: goto L7a;
                    case 70: goto L72;
                    case 71: goto L271;
                    case 72: goto L68;
                    case 73: goto L5e;
                    case 74: goto L56;
                    case 75: goto L4c;
                    case 76: goto L42;
                    case 77: goto L3a;
                    default: goto L30;
                }
            L30:
                java.lang.Integer.toHexString(r1)
                android.util.SparseIntArray r2 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                r2.get(r1)
                goto L271
            L3a:
                java.lang.String r1 = r5.getString(r1)
                r4.mConstraintTag = r1
                goto L271
            L42:
                java.lang.Integer.toHexString(r1)
                android.util.SparseIntArray r2 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                r2.get(r1)
                goto L271
            L4c:
                boolean r2 = r4.mBarrierAllowsGoneWidgets
                boolean r1 = r5.getBoolean(r1, r2)
                r4.mBarrierAllowsGoneWidgets = r1
                goto L271
            L56:
                java.lang.String r1 = r5.getString(r1)
                r4.mReferenceIdString = r1
                goto L271
            L5e:
                int r2 = r4.mBarrierMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.mBarrierMargin = r1
                goto L271
            L68:
                int r2 = r4.mBarrierDirection
                int r1 = r5.getInt(r1, r2)
                r4.mBarrierDirection = r1
                goto L271
            L72:
                float r1 = r5.getFloat(r1, r3)
                r4.heightPercent = r1
                goto L271
            L7a:
                float r1 = r5.getFloat(r1, r3)
                r4.widthPercent = r1
                goto L271
            L82:
                float r2 = r4.circleAngle
                float r1 = r5.getFloat(r1, r2)
                r4.circleAngle = r1
                goto L271
            L8c:
                int r2 = r4.circleRadius
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.circleRadius = r1
                goto L271
            L96:
                int r2 = r4.circleConstraint
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.circleConstraint = r1
                goto L271
            La0:
                int r2 = r4.heightMin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.heightMin = r1
                goto L271
            Laa:
                int r2 = r4.widthMin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.widthMin = r1
                goto L271
            Lb4:
                int r2 = r4.heightMax
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.heightMax = r1
                goto L271
            Lbe:
                int r2 = r4.widthMax
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.widthMax = r1
                goto L271
            Lc8:
                int r2 = r4.heightDefault
                int r1 = r5.getInt(r1, r2)
                r4.heightDefault = r1
                goto L271
            Ld2:
                int r2 = r4.widthDefault
                int r1 = r5.getInt(r1, r2)
                r4.widthDefault = r1
                goto L271
            Ldc:
                int r2 = r4.verticalChainStyle
                int r1 = r5.getInt(r1, r2)
                r4.verticalChainStyle = r1
                goto L271
            Le6:
                int r2 = r4.horizontalChainStyle
                int r1 = r5.getInt(r1, r2)
                r4.horizontalChainStyle = r1
                goto L271
            Lf0:
                float r2 = r4.verticalWeight
                float r1 = r5.getFloat(r1, r2)
                r4.verticalWeight = r1
                goto L271
            Lfa:
                float r2 = r4.horizontalWeight
                float r1 = r5.getFloat(r1, r2)
                r4.horizontalWeight = r1
                goto L271
            L104:
                float r2 = r4.verticalBias
                float r1 = r5.getFloat(r1, r2)
                r4.verticalBias = r1
                goto L271
            L10e:
                int r2 = r4.topToTop
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.topToTop = r1
                goto L271
            L118:
                int r2 = r4.topToBottom
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.topToBottom = r1
                goto L271
            L122:
                int r2 = r4.topMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.topMargin = r1
                goto L271
            L12c:
                int r2 = r4.startToStart
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.startToStart = r1
                goto L271
            L136:
                int r2 = r4.startToEnd
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.startToEnd = r1
                goto L271
            L140:
                int r2 = r4.startMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.startMargin = r1
                goto L271
            L14a:
                int r2 = r4.rightToRight
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.rightToRight = r1
                goto L271
            L154:
                int r2 = r4.rightToLeft
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.rightToLeft = r1
                goto L271
            L15e:
                int r2 = r4.rightMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.rightMargin = r1
                goto L271
            L168:
                int r2 = r4.orientation
                int r1 = r5.getInt(r1, r2)
                r4.orientation = r1
                goto L271
            L172:
                int r2 = r4.leftToRight
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.leftToRight = r1
                goto L271
            L17c:
                int r2 = r4.leftToLeft
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.leftToLeft = r1
                goto L271
            L186:
                int r2 = r4.leftMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.leftMargin = r1
                goto L271
            L190:
                int r2 = r4.mWidth
                int r1 = r5.getLayoutDimension(r1, r2)
                r4.mWidth = r1
                goto L271
            L19a:
                int r2 = r4.mHeight
                int r1 = r5.getLayoutDimension(r1, r2)
                r4.mHeight = r1
                goto L271
            L1a4:
                float r2 = r4.horizontalBias
                float r1 = r5.getFloat(r1, r2)
                r4.horizontalBias = r1
                goto L271
            L1ae:
                float r2 = r4.guidePercent
                float r1 = r5.getFloat(r1, r2)
                r4.guidePercent = r1
                goto L271
            L1b8:
                int r2 = r4.guideEnd
                int r1 = r5.getDimensionPixelOffset(r1, r2)
                r4.guideEnd = r1
                goto L271
            L1c2:
                int r2 = r4.guideBegin
                int r1 = r5.getDimensionPixelOffset(r1, r2)
                r4.guideBegin = r1
                goto L271
            L1cc:
                int r2 = r4.goneTopMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.goneTopMargin = r1
                goto L271
            L1d6:
                int r2 = r4.goneStartMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.goneStartMargin = r1
                goto L271
            L1e0:
                int r2 = r4.goneRightMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.goneRightMargin = r1
                goto L271
            L1ea:
                int r2 = r4.goneLeftMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.goneLeftMargin = r1
                goto L271
            L1f4:
                int r2 = r4.goneEndMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.goneEndMargin = r1
                goto L271
            L1fe:
                int r2 = r4.goneBottomMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.goneBottomMargin = r1
                goto L271
            L208:
                int r2 = r4.endToStart
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.endToStart = r1
                goto L271
            L211:
                int r2 = r4.endToEnd
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.endToEnd = r1
                goto L271
            L21a:
                int r2 = r4.endMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.endMargin = r1
                goto L271
            L223:
                int r2 = r4.editorAbsoluteY
                int r1 = r5.getDimensionPixelOffset(r1, r2)
                r4.editorAbsoluteY = r1
                goto L271
            L22c:
                int r2 = r4.editorAbsoluteX
                int r1 = r5.getDimensionPixelOffset(r1, r2)
                r4.editorAbsoluteX = r1
                goto L271
            L235:
                java.lang.String r1 = r5.getString(r1)
                r4.dimensionRatio = r1
                goto L271
            L23c:
                int r2 = r4.bottomToTop
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.bottomToTop = r1
                goto L271
            L245:
                int r2 = r4.bottomToBottom
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.bottomToBottom = r1
                goto L271
            L24e:
                int r2 = r4.bottomMargin
                int r1 = r5.getDimensionPixelSize(r1, r2)
                r4.bottomMargin = r1
                goto L271
            L257:
                int r2 = r4.baselineToBaseline
                int r1 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r1, r2)
                r4.baselineToBaseline = r1
                goto L271
            L260:
                boolean r2 = r4.constrainedHeight
                boolean r1 = r5.getBoolean(r1, r2)
                r4.constrainedHeight = r1
                goto L271
            L269:
                boolean r2 = r4.constrainedWidth
                boolean r1 = r5.getBoolean(r1, r2)
                r4.constrainedWidth = r1
            L271:
                int r0 = r0 + 1
                goto Le
            L275:
                r5.recycle()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Motion {
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 6;
        private static final int PATH_MOTION_ARC = 2;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static android.util.SparseIntArray mapToConstant;
        public int mAnimateRelativeTo;
        public boolean mApply;
        public int mDrawPath;
        public float mMotionStagger;
        public int mPathMotionArc;
        public float mPathRotate;
        public java.lang.String mTransitionEasing;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_motionPathRotate
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_pathMotionArc
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_transitionEasing
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_drawPath
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_animate_relativeTo
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_motionStagger
                r2 = 6
                r0.append(r1, r2)
                return
        }

        public Motion() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mApply = r0
                r1 = -1
                r3.mAnimateRelativeTo = r1
                r2 = 0
                r3.mTransitionEasing = r2
                r3.mPathMotionArc = r1
                r3.mDrawPath = r0
                r0 = 2143289344(0x7fc00000, float:NaN)
                r3.mMotionStagger = r0
                r3.mPathRotate = r0
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Motion r2) {
                r1 = this;
                boolean r0 = r2.mApply
                r1.mApply = r0
                int r0 = r2.mAnimateRelativeTo
                r1.mAnimateRelativeTo = r0
                java.lang.String r0 = r2.mTransitionEasing
                r1.mTransitionEasing = r0
                int r0 = r2.mPathMotionArc
                r1.mPathMotionArc = r0
                int r0 = r2.mDrawPath
                r1.mDrawPath = r0
                float r0 = r2.mPathRotate
                r1.mPathRotate = r0
                float r2 = r2.mMotionStagger
                r1.mMotionStagger = r2
                return
        }

        void fillFromAttributeList(android.content.Context r6, android.util.AttributeSet r7) {
                r5 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Motion
                android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
                r7 = 1
                r5.mApply = r7
                int r7 = r6.getIndexCount()
                r0 = 0
                r1 = 0
            Lf:
                if (r1 >= r7) goto L67
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L5c;
                    case 2: goto L53;
                    case 3: goto L38;
                    case 4: goto L31;
                    case 5: goto L28;
                    case 6: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L64
            L1f:
                float r3 = r5.mMotionStagger
                float r2 = r6.getFloat(r2, r3)
                r5.mMotionStagger = r2
                goto L64
            L28:
                int r3 = r5.mAnimateRelativeTo
                int r2 = androidx.constraintlayout.widget.ConstraintSet.access$100(r6, r2, r3)
                r5.mAnimateRelativeTo = r2
                goto L64
            L31:
                int r2 = r6.getInt(r2, r0)
                r5.mDrawPath = r2
                goto L64
            L38:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 3
                if (r3 != r4) goto L48
                java.lang.String r2 = r6.getString(r2)
                r5.mTransitionEasing = r2
                goto L64
            L48:
                java.lang.String[] r3 = androidx.constraintlayout.motion.utils.Easing.NAMED_EASING
                int r2 = r6.getInteger(r2, r0)
                r2 = r3[r2]
                r5.mTransitionEasing = r2
                goto L64
            L53:
                int r3 = r5.mPathMotionArc
                int r2 = r6.getInt(r2, r3)
                r5.mPathMotionArc = r2
                goto L64
            L5c:
                float r3 = r5.mPathRotate
                float r2 = r6.getFloat(r2, r3)
                r5.mPathRotate = r2
            L64:
                int r1 = r1 + 1
                goto Lf
            L67:
                r6.recycle()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PropertySet {
        public float alpha;
        public boolean mApply;
        public float mProgress;
        public int mVisibilityMode;
        public int visibility;

        public PropertySet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mApply = r0
                r1.visibility = r0
                r1.mVisibilityMode = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.alpha = r0
                r0 = 2143289344(0x7fc00000, float:NaN)
                r1.mProgress = r0
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.PropertySet r2) {
                r1 = this;
                boolean r0 = r2.mApply
                r1.mApply = r0
                int r0 = r2.visibility
                r1.visibility = r0
                float r0 = r2.alpha
                r1.alpha = r0
                float r0 = r2.mProgress
                r1.mProgress = r0
                int r2 = r2.mVisibilityMode
                r1.mVisibilityMode = r2
                return
        }

        void fillFromAttributeList(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.PropertySet
                android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
                r5 = 1
                r3.mApply = r5
                int r5 = r4.getIndexCount()
                r0 = 0
            Le:
                if (r0 >= r5) goto L54
                int r1 = r4.getIndex(r0)
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_android_alpha
                if (r1 != r2) goto L21
                float r2 = r3.alpha
                float r1 = r4.getFloat(r1, r2)
                r3.alpha = r1
                goto L51
            L21:
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_android_visibility
                if (r1 != r2) goto L38
                int r2 = r3.visibility
                int r1 = r4.getInt(r1, r2)
                r3.visibility = r1
                int[] r1 = androidx.constraintlayout.widget.ConstraintSet.access$200()
                int r2 = r3.visibility
                r1 = r1[r2]
                r3.visibility = r1
                goto L51
            L38:
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_visibilityMode
                if (r1 != r2) goto L45
                int r2 = r3.mVisibilityMode
                int r1 = r4.getInt(r1, r2)
                r3.mVisibilityMode = r1
                goto L51
            L45:
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_motionProgress
                if (r1 != r2) goto L51
                float r2 = r3.mProgress
                float r1 = r4.getFloat(r1, r2)
                r3.mProgress = r1
            L51:
                int r0 = r0 + 1
                goto Le
            L54:
                r4.recycle()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static android.util.SparseIntArray mapToConstant;
        public boolean applyElevation;
        public float elevation;
        public boolean mApply;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_rotation
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_rotationX
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_rotationY
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_scaleX
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_scaleY
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotX
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotY
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_translationX
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_translationY
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_translationZ
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_elevation
                r2 = 11
                r0.append(r1, r2)
                return
        }

        public Transform() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mApply = r0
                r1 = 0
                r3.rotation = r1
                r3.rotationX = r1
                r3.rotationY = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.scaleX = r2
                r3.scaleY = r2
                r2 = 2143289344(0x7fc00000, float:NaN)
                r3.transformPivotX = r2
                r3.transformPivotY = r2
                r3.translationX = r1
                r3.translationY = r1
                r3.translationZ = r1
                r3.applyElevation = r0
                r3.elevation = r1
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Transform r2) {
                r1 = this;
                boolean r0 = r2.mApply
                r1.mApply = r0
                float r0 = r2.rotation
                r1.rotation = r0
                float r0 = r2.rotationX
                r1.rotationX = r0
                float r0 = r2.rotationY
                r1.rotationY = r0
                float r0 = r2.scaleX
                r1.scaleX = r0
                float r0 = r2.scaleY
                r1.scaleY = r0
                float r0 = r2.transformPivotX
                r1.transformPivotX = r0
                float r0 = r2.transformPivotY
                r1.transformPivotY = r0
                float r0 = r2.translationX
                r1.translationX = r0
                float r0 = r2.translationY
                r1.translationY = r0
                float r0 = r2.translationZ
                r1.translationZ = r0
                boolean r0 = r2.applyElevation
                r1.applyElevation = r0
                float r2 = r2.elevation
                r1.elevation = r2
                return
        }

        void fillFromAttributeList(android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Transform
                android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
                r6 = 1
                r4.mApply = r6
                int r0 = r5.getIndexCount()
                r1 = 0
            Le:
                if (r1 >= r0) goto L85
                int r2 = r5.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L7a;
                    case 2: goto L71;
                    case 3: goto L68;
                    case 4: goto L5f;
                    case 5: goto L56;
                    case 6: goto L4d;
                    case 7: goto L44;
                    case 8: goto L3b;
                    case 9: goto L32;
                    case 10: goto L29;
                    case 11: goto L1e;
                    default: goto L1d;
                }
            L1d:
                goto L82
            L1e:
                r4.applyElevation = r6
                float r3 = r4.elevation
                float r2 = r5.getDimension(r2, r3)
                r4.elevation = r2
                goto L82
            L29:
                float r3 = r4.translationZ
                float r2 = r5.getDimension(r2, r3)
                r4.translationZ = r2
                goto L82
            L32:
                float r3 = r4.translationY
                float r2 = r5.getDimension(r2, r3)
                r4.translationY = r2
                goto L82
            L3b:
                float r3 = r4.translationX
                float r2 = r5.getDimension(r2, r3)
                r4.translationX = r2
                goto L82
            L44:
                float r3 = r4.transformPivotY
                float r2 = r5.getDimension(r2, r3)
                r4.transformPivotY = r2
                goto L82
            L4d:
                float r3 = r4.transformPivotX
                float r2 = r5.getDimension(r2, r3)
                r4.transformPivotX = r2
                goto L82
            L56:
                float r3 = r4.scaleY
                float r2 = r5.getFloat(r2, r3)
                r4.scaleY = r2
                goto L82
            L5f:
                float r3 = r4.scaleX
                float r2 = r5.getFloat(r2, r3)
                r4.scaleX = r2
                goto L82
            L68:
                float r3 = r4.rotationY
                float r2 = r5.getFloat(r2, r3)
                r4.rotationY = r2
                goto L82
            L71:
                float r3 = r4.rotationX
                float r2 = r5.getFloat(r2, r3)
                r4.rotationX = r2
                goto L82
            L7a:
                float r3 = r4.rotation
                float r2 = r5.getFloat(r2, r3)
                r4.rotation = r2
            L82:
                int r1 = r1 + 1
                goto Le
            L85:
                r5.recycle()
                return
        }
    }

    static {
            r0 = 0
            r1 = 4
            r2 = 8
            int[] r0 = new int[]{r0, r1, r2}
            androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintSet.mapToConstant = r0
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toLeftOf
            r4 = 25
            r0.append(r3, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toRightOf
            r4 = 26
            r0.append(r3, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toLeftOf
            r4 = 29
            r0.append(r3, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toRightOf
            r4 = 30
            r0.append(r3, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toTopOf
            r4 = 36
            r0.append(r3, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toBottomOf
            r4 = 35
            r0.append(r3, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toTopOf
            r0.append(r3, r1)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toBottomOf
            r3 = 3
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBaselineOf
            r3 = 1
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteX
            r3 = 6
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteY
            r3 = 7
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_begin
            r3 = 17
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_end
            r3 = 18
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_percent
            r3 = 19
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_orientation
            r3 = 27
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toEndOf
            r3 = 32
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toStartOf
            r3 = 33
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toStartOf
            r3 = 10
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toEndOf
            r3 = 9
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginLeft
            r3 = 13
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginTop
            r3 = 16
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginRight
            r3 = 14
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginBottom
            r3 = 11
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginStart
            r3 = 15
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginEnd
            r3 = 12
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_weight
            r3 = 40
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_weight
            r3 = 39
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_chainStyle
            r3 = 41
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_chainStyle
            r3 = 42
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_bias
            r3 = 20
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_bias
            r3 = 37
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintDimensionRatio
            r3 = 5
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_creator
            r3 = 82
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_creator
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_creator
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_creator
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_creator
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginLeft
            r3 = 24
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginRight
            r3 = 28
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart
            r3 = 31
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginTop
            r2 = 34
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginBottom
            r2 = 2
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_width
            r2 = 23
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_height
            r2 = 21
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_visibility
            r2 = 22
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_alpha
            r2 = 43
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_elevation
            r2 = 44
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationX
            r2 = 45
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationY
            r2 = 46
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_rotation
            r2 = 60
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleX
            r2 = 47
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleY
            r2 = 48
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotX
            r2 = 49
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotY
            r2 = 50
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_translationX
            r2 = 51
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_translationY
            r2 = 52
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_translationZ
            r2 = 53
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_default
            r2 = 54
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_default
            r2 = 55
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_max
            r2 = 56
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_max
            r2 = 57
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_min
            r2 = 58
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_min
            r2 = 59
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircle
            r2 = 61
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleRadius
            r2 = 62
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleAngle
            r2 = 63
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_animate_relativeTo
            r2 = 64
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_transitionEasing
            r2 = 65
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_drawPath
            r2 = 66
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_transitionPathRotate
            r2 = 67
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_motionStagger
            r2 = 79
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_id
            r2 = 38
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_motionProgress
            r2 = 68
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_percent
            r2 = 69
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_percent
            r2 = 70
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_chainUseRtl
            r2 = 71
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_barrierDirection
            r2 = 72
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_barrierMargin
            r2 = 73
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_constraint_referenced_ids
            r2 = 74
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_barrierAllowsGoneWidgets
            r2 = 75
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_pathMotionArc
            r2 = 76
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTag
            r2 = 77
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_visibilityMode
            r2 = 78
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedWidth
            r2 = 80
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedHeight
            r2 = 81
            r0.append(r1, r2)
            return
    }

    public ConstraintSet() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mSavedAttributes = r0
            r0 = 1
            r1.mForceId = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mConstraints = r0
            return
    }

    static /* synthetic */ int access$100(android.content.res.TypedArray r0, int r1, int r2) {
            int r0 = lookupID(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int[] access$200() {
            int[] r0 = androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS
            return r0
    }

    private void addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r5, java.lang.String... r6) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L4f
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r4.mSavedAttributes
            r2 = r6[r0]
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L3e
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r4.mSavedAttributes
            r2 = r6[r0]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r1.getType()
            if (r2 != r5) goto L1f
            goto L4c
        L1f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ConstraintAttribute is already a "
            r6.append(r0)
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = r1.getType()
            java.lang.String r0 = r0.name()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L3e:
            androidx.constraintlayout.widget.ConstraintAttribute r1 = new androidx.constraintlayout.widget.ConstraintAttribute
            r2 = r6[r0]
            r1.<init>(r2, r5)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r4.mSavedAttributes
            r3 = r6[r0]
            r2.put(r3, r1)
        L4c:
            int r0 = r0 + 1
            goto L1
        L4f:
            return
    }

    private int[] convertReferenceString(android.view.View r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = ","
            java.lang.String[] r11 = r11.split(r0)
            android.content.Context r0 = r10.getContext()
            int r1 = r11.length
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            int r5 = r11.length
            if (r3 >= r5) goto L65
            r5 = r11[r3]
            java.lang.String r5 = r5.trim()
            java.lang.Class<androidx.constraintlayout.widget.R$id> r6 = androidx.constraintlayout.widget.R.id.class
            java.lang.reflect.Field r6 = r6.getField(r5)     // Catch: java.lang.Exception -> L25
            r7 = 0
            int r6 = r6.getInt(r7)     // Catch: java.lang.Exception -> L25
            goto L27
        L25:
            r6 = 0
        L27:
            if (r6 != 0) goto L37
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r7 = "id"
            java.lang.String r8 = r0.getPackageName()
            int r6 = r6.getIdentifier(r5, r7, r8)
        L37:
            if (r6 != 0) goto L5d
            boolean r7 = r10.isInEditMode()
            if (r7 == 0) goto L5d
            android.view.ViewParent r7 = r10.getParent()
            boolean r7 = r7 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r7 == 0) goto L5d
            android.view.ViewParent r7 = r10.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            java.lang.Object r5 = r7.getDesignInformation(r2, r5)
            if (r5 == 0) goto L5d
            boolean r7 = r5 instanceof java.lang.Integer
            if (r7 == 0) goto L5d
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
        L5d:
            int r5 = r4 + 1
            r1[r4] = r6
            int r3 = r3 + 1
            r4 = r5
            goto L10
        L65:
            int r10 = r11.length
            if (r4 == r10) goto L6c
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
        L6c:
            return r1
    }

    private void createHorizontalChain(int r12, int r13, int r14, int r15, int[] r16, float[] r17, int r18, int r19, int r20) {
            r11 = this;
            r6 = r16
            r7 = r17
            int r1 = r6.length
            r2 = 2
            java.lang.String r3 = "must have 2 or more widgets in a chain"
            if (r1 < r2) goto L7b
            if (r7 == 0) goto L17
            int r1 = r7.length
            int r2 = r6.length
            if (r1 != r2) goto L11
            goto L17
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        L17:
            r1 = 0
            if (r7 == 0) goto L26
            r2 = r6[r1]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r11.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = r7[r1]
            r2.horizontalWeight = r3
        L26:
            r2 = r6[r1]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r11.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = r18
            r2.horizontalChainStyle = r3
            r1 = r6[r1]
            r5 = -1
            r0 = r11
            r3 = r12
            r4 = r13
            r2 = r19
            r0.connect(r1, r2, r3, r4, r5)
            r8 = 1
            r9 = 1
        L3f:
            int r0 = r6.length
            if (r9 >= r0) goto L6d
            r1 = r6[r9]
            int r10 = r9 + (-1)
            r3 = r6[r10]
            r5 = -1
            r0 = r11
            r2 = r19
            r4 = r20
            r0.connect(r1, r2, r3, r4, r5)
            r1 = r6[r10]
            r3 = r6[r9]
            r4 = r19
            r2 = r20
            r0.connect(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L6a
            r1 = r6[r9]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r11.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r7[r9]
            r1.horizontalWeight = r2
        L6a:
            int r9 = r9 + 1
            goto L3f
        L6d:
            int r1 = r6.length
            int r1 = r1 - r8
            r1 = r6[r1]
            r5 = -1
            r0 = r11
            r3 = r14
            r4 = r15
            r2 = r20
            r0.connect(r1, r2, r3, r4, r5)
            return
        L7b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint fillFromAttributeList(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r0.<init>()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.Constraint
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r1)
            r2.populateConstraint(r3, r0, r4)
            r4.recycle()
            return r0
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint get(int r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1a
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r2.<init>()
            r0.put(r1, r2)
        L1a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r4
            return r4
    }

    private static int lookupID(android.content.res.TypedArray r1, int r2, int r3) {
            int r3 = r1.getResourceId(r2, r3)
            r0 = -1
            if (r3 != r0) goto Lc
            int r1 = r1.getInt(r2, r0)
            return r1
        Lc:
            return r3
    }

    private void populateConstraint(android.content.Context r7, androidx.constraintlayout.widget.ConstraintSet.Constraint r8, android.content.res.TypedArray r9) {
            r6 = this;
            int r7 = r9.getIndexCount()
            r0 = 0
            r1 = 0
        L6:
            if (r1 >= r7) goto L414
            int r2 = r9.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_android_id
            r4 = 1
            if (r2 == r3) goto L29
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart
            if (r3 == r2) goto L29
            int r3 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd
            if (r3 == r2) goto L29
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            r3.mApply = r4
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            r3.mApply = r4
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r8.propertySet
            r3.mApply = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            r3.mApply = r4
        L29:
            android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = r3.get(r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            switch(r3) {
                case 1: goto L406;
                case 2: goto L3fb;
                case 3: goto L3f0;
                case 4: goto L3e5;
                case 5: goto L3dc;
                case 6: goto L3d1;
                case 7: goto L3c6;
                case 8: goto L3bb;
                case 9: goto L3b0;
                case 10: goto L3a5;
                case 11: goto L399;
                case 12: goto L38d;
                case 13: goto L381;
                case 14: goto L375;
                case 15: goto L369;
                case 16: goto L35d;
                case 17: goto L351;
                case 18: goto L345;
                case 19: goto L339;
                case 20: goto L32d;
                case 21: goto L321;
                case 22: goto L30b;
                case 23: goto L2ff;
                case 24: goto L2f3;
                case 25: goto L2e7;
                case 26: goto L2db;
                case 27: goto L2cf;
                case 28: goto L2c3;
                case 29: goto L2b7;
                case 30: goto L2ab;
                case 31: goto L29f;
                case 32: goto L293;
                case 33: goto L287;
                case 34: goto L27b;
                case 35: goto L26f;
                case 36: goto L263;
                case 37: goto L257;
                case 38: goto L24d;
                case 39: goto L241;
                case 40: goto L235;
                case 41: goto L229;
                case 42: goto L21d;
                case 43: goto L211;
                case 44: goto L203;
                case 45: goto L1f7;
                case 46: goto L1eb;
                case 47: goto L1df;
                case 48: goto L1d3;
                case 49: goto L1c7;
                case 50: goto L1bb;
                case 51: goto L1af;
                case 52: goto L1a3;
                case 53: goto L197;
                case 54: goto L18b;
                case 55: goto L17f;
                case 56: goto L173;
                case 57: goto L167;
                case 58: goto L15b;
                case 59: goto L14f;
                case 60: goto L143;
                case 61: goto L137;
                case 62: goto L12b;
                case 63: goto L11f;
                case 64: goto L113;
                case 65: goto Lf2;
                case 66: goto Le8;
                case 67: goto Ldc;
                case 68: goto Ld0;
                case 69: goto Lc6;
                case 70: goto Lbc;
                case 71: goto L410;
                case 72: goto Lb0;
                case 73: goto La4;
                case 74: goto L9a;
                case 75: goto L8e;
                case 76: goto L82;
                case 77: goto L78;
                case 78: goto L6c;
                case 79: goto L60;
                case 80: goto L54;
                case 81: goto L48;
                case 82: goto L3e;
                default: goto L34;
            }
        L34:
            java.lang.Integer.toHexString(r2)
            android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            r3.get(r2)
            goto L410
        L3e:
            java.lang.Integer.toHexString(r2)
            android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            r3.get(r2)
            goto L410
        L48:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            boolean r4 = r3.constrainedHeight
            boolean r2 = r9.getBoolean(r2, r4)
            r3.constrainedHeight = r2
            goto L410
        L54:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            boolean r4 = r3.constrainedWidth
            boolean r2 = r9.getBoolean(r2, r4)
            r3.constrainedWidth = r2
            goto L410
        L60:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            float r4 = r3.mMotionStagger
            float r2 = r9.getFloat(r2, r4)
            r3.mMotionStagger = r2
            goto L410
        L6c:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r8.propertySet
            int r4 = r3.mVisibilityMode
            int r2 = r9.getInt(r2, r4)
            r3.mVisibilityMode = r2
            goto L410
        L78:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            java.lang.String r2 = r9.getString(r2)
            r3.mConstraintTag = r2
            goto L410
        L82:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            int r4 = r3.mPathMotionArc
            int r2 = r9.getInt(r2, r4)
            r3.mPathMotionArc = r2
            goto L410
        L8e:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            boolean r4 = r3.mBarrierAllowsGoneWidgets
            boolean r2 = r9.getBoolean(r2, r4)
            r3.mBarrierAllowsGoneWidgets = r2
            goto L410
        L9a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            java.lang.String r2 = r9.getString(r2)
            r3.mReferenceIdString = r2
            goto L410
        La4:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.mBarrierMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.mBarrierMargin = r2
            goto L410
        Lb0:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.mBarrierDirection
            int r2 = r9.getInt(r2, r4)
            r3.mBarrierDirection = r2
            goto L410
        Lbc:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r2 = r9.getFloat(r2, r5)
            r3.heightPercent = r2
            goto L410
        Lc6:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r2 = r9.getFloat(r2, r5)
            r3.widthPercent = r2
            goto L410
        Ld0:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r8.propertySet
            float r4 = r3.mProgress
            float r2 = r9.getFloat(r2, r4)
            r3.mProgress = r2
            goto L410
        Ldc:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            float r4 = r3.mPathRotate
            float r2 = r9.getFloat(r2, r4)
            r3.mPathRotate = r2
            goto L410
        Le8:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            int r2 = r9.getInt(r2, r0)
            r3.mDrawPath = r2
            goto L410
        Lf2:
            android.util.TypedValue r3 = r9.peekValue(r2)
            int r3 = r3.type
            r4 = 3
            if (r3 != r4) goto L105
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            java.lang.String r2 = r9.getString(r2)
            r3.mTransitionEasing = r2
            goto L410
        L105:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            java.lang.String[] r4 = androidx.constraintlayout.motion.utils.Easing.NAMED_EASING
            int r2 = r9.getInteger(r2, r0)
            r2 = r4[r2]
            r3.mTransitionEasing = r2
            goto L410
        L113:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r8.motion
            int r4 = r3.mAnimateRelativeTo
            int r2 = lookupID(r9, r2, r4)
            r3.mAnimateRelativeTo = r2
            goto L410
        L11f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r4 = r3.circleAngle
            float r2 = r9.getFloat(r2, r4)
            r3.circleAngle = r2
            goto L410
        L12b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.circleRadius
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.circleRadius = r2
            goto L410
        L137:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.circleConstraint
            int r2 = lookupID(r9, r2, r4)
            r3.circleConstraint = r2
            goto L410
        L143:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.rotation
            float r2 = r9.getFloat(r2, r4)
            r3.rotation = r2
            goto L410
        L14f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.heightMin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.heightMin = r2
            goto L410
        L15b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.widthMin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.widthMin = r2
            goto L410
        L167:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.heightMax
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.heightMax = r2
            goto L410
        L173:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.widthMax
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.widthMax = r2
            goto L410
        L17f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.heightDefault
            int r2 = r9.getInt(r2, r4)
            r3.heightDefault = r2
            goto L410
        L18b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.widthDefault
            int r2 = r9.getInt(r2, r4)
            r3.widthDefault = r2
            goto L410
        L197:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.translationZ
            float r2 = r9.getDimension(r2, r4)
            r3.translationZ = r2
            goto L410
        L1a3:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.translationY
            float r2 = r9.getDimension(r2, r4)
            r3.translationY = r2
            goto L410
        L1af:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.translationX
            float r2 = r9.getDimension(r2, r4)
            r3.translationX = r2
            goto L410
        L1bb:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.transformPivotY
            float r2 = r9.getDimension(r2, r4)
            r3.transformPivotY = r2
            goto L410
        L1c7:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.transformPivotX
            float r2 = r9.getDimension(r2, r4)
            r3.transformPivotX = r2
            goto L410
        L1d3:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.scaleY
            float r2 = r9.getFloat(r2, r4)
            r3.scaleY = r2
            goto L410
        L1df:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.scaleX
            float r2 = r9.getFloat(r2, r4)
            r3.scaleX = r2
            goto L410
        L1eb:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.rotationY
            float r2 = r9.getFloat(r2, r4)
            r3.rotationY = r2
            goto L410
        L1f7:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            float r4 = r3.rotationX
            float r2 = r9.getFloat(r2, r4)
            r3.rotationX = r2
            goto L410
        L203:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r8.transform
            r3.applyElevation = r4
            float r4 = r3.elevation
            float r2 = r9.getDimension(r2, r4)
            r3.elevation = r2
            goto L410
        L211:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r8.propertySet
            float r4 = r3.alpha
            float r2 = r9.getFloat(r2, r4)
            r3.alpha = r2
            goto L410
        L21d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.verticalChainStyle
            int r2 = r9.getInt(r2, r4)
            r3.verticalChainStyle = r2
            goto L410
        L229:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.horizontalChainStyle
            int r2 = r9.getInt(r2, r4)
            r3.horizontalChainStyle = r2
            goto L410
        L235:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r4 = r3.verticalWeight
            float r2 = r9.getFloat(r2, r4)
            r3.verticalWeight = r2
            goto L410
        L241:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r4 = r3.horizontalWeight
            float r2 = r9.getFloat(r2, r4)
            r3.horizontalWeight = r2
            goto L410
        L24d:
            int r3 = r8.mViewId
            int r2 = r9.getResourceId(r2, r3)
            r8.mViewId = r2
            goto L410
        L257:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r4 = r3.verticalBias
            float r2 = r9.getFloat(r2, r4)
            r3.verticalBias = r2
            goto L410
        L263:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.topToTop
            int r2 = lookupID(r9, r2, r4)
            r3.topToTop = r2
            goto L410
        L26f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.topToBottom
            int r2 = lookupID(r9, r2, r4)
            r3.topToBottom = r2
            goto L410
        L27b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.topMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.topMargin = r2
            goto L410
        L287:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.startToStart
            int r2 = lookupID(r9, r2, r4)
            r3.startToStart = r2
            goto L410
        L293:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.startToEnd
            int r2 = lookupID(r9, r2, r4)
            r3.startToEnd = r2
            goto L410
        L29f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.startMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.startMargin = r2
            goto L410
        L2ab:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.rightToRight
            int r2 = lookupID(r9, r2, r4)
            r3.rightToRight = r2
            goto L410
        L2b7:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.rightToLeft
            int r2 = lookupID(r9, r2, r4)
            r3.rightToLeft = r2
            goto L410
        L2c3:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.rightMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.rightMargin = r2
            goto L410
        L2cf:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.orientation
            int r2 = r9.getInt(r2, r4)
            r3.orientation = r2
            goto L410
        L2db:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.leftToRight
            int r2 = lookupID(r9, r2, r4)
            r3.leftToRight = r2
            goto L410
        L2e7:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.leftToLeft
            int r2 = lookupID(r9, r2, r4)
            r3.leftToLeft = r2
            goto L410
        L2f3:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.leftMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.leftMargin = r2
            goto L410
        L2ff:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.mWidth
            int r2 = r9.getLayoutDimension(r2, r4)
            r3.mWidth = r2
            goto L410
        L30b:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r8.propertySet
            int r4 = r3.visibility
            int r2 = r9.getInt(r2, r4)
            r3.visibility = r2
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r8.propertySet
            int[] r3 = androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS
            int r4 = r2.visibility
            r3 = r3[r4]
            r2.visibility = r3
            goto L410
        L321:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.mHeight
            int r2 = r9.getLayoutDimension(r2, r4)
            r3.mHeight = r2
            goto L410
        L32d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r4 = r3.horizontalBias
            float r2 = r9.getFloat(r2, r4)
            r3.horizontalBias = r2
            goto L410
        L339:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            float r4 = r3.guidePercent
            float r2 = r9.getFloat(r2, r4)
            r3.guidePercent = r2
            goto L410
        L345:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.guideEnd
            int r2 = r9.getDimensionPixelOffset(r2, r4)
            r3.guideEnd = r2
            goto L410
        L351:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.guideBegin
            int r2 = r9.getDimensionPixelOffset(r2, r4)
            r3.guideBegin = r2
            goto L410
        L35d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.goneTopMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.goneTopMargin = r2
            goto L410
        L369:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.goneStartMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.goneStartMargin = r2
            goto L410
        L375:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.goneRightMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.goneRightMargin = r2
            goto L410
        L381:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.goneLeftMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.goneLeftMargin = r2
            goto L410
        L38d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.goneEndMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.goneEndMargin = r2
            goto L410
        L399:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.goneBottomMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.goneBottomMargin = r2
            goto L410
        L3a5:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.endToStart
            int r2 = lookupID(r9, r2, r4)
            r3.endToStart = r2
            goto L410
        L3b0:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.endToEnd
            int r2 = lookupID(r9, r2, r4)
            r3.endToEnd = r2
            goto L410
        L3bb:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.endMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.endMargin = r2
            goto L410
        L3c6:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.editorAbsoluteY
            int r2 = r9.getDimensionPixelOffset(r2, r4)
            r3.editorAbsoluteY = r2
            goto L410
        L3d1:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.editorAbsoluteX
            int r2 = r9.getDimensionPixelOffset(r2, r4)
            r3.editorAbsoluteX = r2
            goto L410
        L3dc:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            java.lang.String r2 = r9.getString(r2)
            r3.dimensionRatio = r2
            goto L410
        L3e5:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.bottomToTop
            int r2 = lookupID(r9, r2, r4)
            r3.bottomToTop = r2
            goto L410
        L3f0:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.bottomToBottom
            int r2 = lookupID(r9, r2, r4)
            r3.bottomToBottom = r2
            goto L410
        L3fb:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.bottomMargin
            int r2 = r9.getDimensionPixelSize(r2, r4)
            r3.bottomMargin = r2
            goto L410
        L406:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r8.layout
            int r4 = r3.baselineToBaseline
            int r2 = lookupID(r9, r2, r4)
            r3.baselineToBaseline = r2
        L410:
            int r1 = r1 + 1
            goto L6
        L414:
            return
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

    private static java.lang.String[] splitString(java.lang.String r6) {
            char[] r6 = r6.toCharArray()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 0
        Lc:
            int r4 = r6.length
            if (r1 >= r4) goto L2d
            char r4 = r6[r1]
            r5 = 44
            if (r4 != r5) goto L24
            if (r3 != 0) goto L24
            java.lang.String r4 = new java.lang.String
            int r5 = r1 - r2
            r4.<init>(r6, r2, r5)
            r0.add(r4)
            int r2 = r1 + 1
            goto L2a
        L24:
            r5 = 34
            if (r4 != r5) goto L2a
            r3 = r3 ^ 1
        L2a:
            int r1 = r1 + 1
            goto Lc
        L2d:
            java.lang.String r1 = new java.lang.String
            int r3 = r6.length
            int r3 = r3 - r2
            r1.<init>(r6, r2, r3)
            r0.add(r1)
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
    }

    public void addColorAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addFloatAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addIntAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addStringAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addToHorizontalChain(int r15, int r16, int r17) {
            r14 = this;
            r0 = 2
            r1 = 1
            if (r16 != 0) goto L6
            r6 = 1
            goto L7
        L6:
            r6 = 2
        L7:
            r7 = 0
            r4 = 1
            r2 = r14
            r3 = r15
            r5 = r16
            r2.connect(r3, r4, r5, r6, r7)
            if (r17 != 0) goto L14
            r12 = 2
            goto L15
        L14:
            r12 = 1
        L15:
            r13 = 0
            r10 = 2
            r8 = r14
            r9 = r15
            r11 = r17
            r8.connect(r9, r10, r11, r12, r13)
            if (r16 == 0) goto L2a
            r12 = 1
            r13 = 0
            r10 = 2
            r8 = r14
            r11 = r15
            r9 = r16
            r8.connect(r9, r10, r11, r12, r13)
        L2a:
            if (r17 == 0) goto L36
            r12 = 2
            r13 = 0
            r10 = 1
            r8 = r14
            r11 = r15
            r9 = r17
            r8.connect(r9, r10, r11, r12, r13)
        L36:
            return
    }

    public void addToHorizontalChainRTL(int r15, int r16, int r17) {
            r14 = this;
            r0 = 7
            r1 = 6
            if (r16 != 0) goto L6
            r6 = 6
            goto L7
        L6:
            r6 = 7
        L7:
            r7 = 0
            r4 = 6
            r2 = r14
            r3 = r15
            r5 = r16
            r2.connect(r3, r4, r5, r6, r7)
            if (r17 != 0) goto L14
            r12 = 7
            goto L15
        L14:
            r12 = 6
        L15:
            r13 = 0
            r10 = 7
            r8 = r14
            r9 = r15
            r11 = r17
            r8.connect(r9, r10, r11, r12, r13)
            if (r16 == 0) goto L2a
            r12 = 6
            r13 = 0
            r10 = 7
            r8 = r14
            r11 = r15
            r9 = r16
            r8.connect(r9, r10, r11, r12, r13)
        L2a:
            if (r17 == 0) goto L36
            r12 = 7
            r13 = 0
            r10 = 6
            r8 = r14
            r11 = r15
            r9 = r17
            r8.connect(r9, r10, r11, r12, r13)
        L36:
            return
    }

    public void addToVerticalChain(int r15, int r16, int r17) {
            r14 = this;
            r0 = 4
            r1 = 3
            if (r16 != 0) goto L6
            r6 = 3
            goto L7
        L6:
            r6 = 4
        L7:
            r7 = 0
            r4 = 3
            r2 = r14
            r3 = r15
            r5 = r16
            r2.connect(r3, r4, r5, r6, r7)
            if (r17 != 0) goto L14
            r12 = 4
            goto L15
        L14:
            r12 = 3
        L15:
            r13 = 0
            r10 = 4
            r8 = r14
            r9 = r15
            r11 = r17
            r8.connect(r9, r10, r11, r12, r13)
            if (r16 == 0) goto L2a
            r12 = 3
            r13 = 0
            r10 = 4
            r8 = r14
            r11 = r15
            r9 = r16
            r8.connect(r9, r10, r11, r12, r13)
        L2a:
            if (r17 == 0) goto L36
            r12 = 4
            r13 = 0
            r10 = 3
            r8 = r14
            r11 = r15
            r9 = r17
            r8.connect(r9, r10, r11, r12, r13)
        L36:
            return
    }

    public void applyCustomAttributes(androidx.constraintlayout.widget.ConstraintLayout r7) {
            r6 = this;
            int r0 = r7.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4f
            android.view.View r2 = r7.getChildAt(r1)
            int r3 = r2.getId()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L1f
            androidx.constraintlayout.motion.widget.Debug.getName(r2)
            goto L4c
        L1f:
            boolean r4 = r6.mForceId
            if (r4 == 0) goto L2f
            r4 = -1
            if (r3 == r4) goto L27
            goto L2f
        L27:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r7.<init>(r0)
            throw r7
        L2f:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L4c
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r3.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(r2, r3)
        L4c:
            int r1 = r1 + 1
            goto L5
        L4f:
            return
    }

    public void applyTo(androidx.constraintlayout.widget.ConstraintLayout r2) {
            r1 = this;
            r0 = 1
            r1.applyToInternal(r2, r0)
            r0 = 0
            r2.setConstraintSet(r0)
            r2.requestLayout()
            return
    }

    public void applyToHelper(androidx.constraintlayout.widget.ConstraintHelper r4, androidx.constraintlayout.solver.widgets.ConstraintWidget r5, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r6, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7) {
            r3 = this;
            int r0 = r4.getId()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r3.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L25
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r3.mConstraints
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            boolean r1 = r5 instanceof androidx.constraintlayout.solver.widgets.HelperWidget
            if (r1 == 0) goto L25
            androidx.constraintlayout.solver.widgets.HelperWidget r5 = (androidx.constraintlayout.solver.widgets.HelperWidget) r5
            r4.loadParameters(r0, r5, r6, r7)
        L25:
            return
    }

    void applyToInternal(androidx.constraintlayout.widget.ConstraintLayout r10, boolean r11) {
            r9 = this;
            int r0 = r10.getChildCount()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r2 = r9.mConstraints
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            r2 = 0
        L10:
            r3 = 1
            r4 = -1
            if (r2 >= r0) goto L137
            android.view.View r5 = r10.getChildAt(r2)
            int r6 = r5.getId()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r7 = r9.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L2d
            androidx.constraintlayout.motion.widget.Debug.getName(r5)
            goto L133
        L2d:
            boolean r7 = r9.mForceId
            if (r7 == 0) goto L3c
            if (r6 == r4) goto L34
            goto L3c
        L34:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r10.<init>(r11)
            throw r10
        L3c:
            if (r6 != r4) goto L40
            goto L133
        L40:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r7 = r9.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L133
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1.remove(r7)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r7 = r9.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r7
            boolean r8 = r5 instanceof androidx.constraintlayout.widget.Barrier
            if (r8 == 0) goto L67
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = r7.layout
            r8.mHelperType = r3
        L67:
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = r7.layout
            int r8 = r8.mHelperType
            if (r8 == r4) goto La6
            if (r8 == r3) goto L70
            goto La6
        L70:
            r3 = r5
            androidx.constraintlayout.widget.Barrier r3 = (androidx.constraintlayout.widget.Barrier) r3
            r3.setId(r6)
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r7.layout
            int r4 = r4.mBarrierDirection
            r3.setType(r4)
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r7.layout
            int r4 = r4.mBarrierMargin
            r3.setMargin(r4)
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r7.layout
            boolean r4 = r4.mBarrierAllowsGoneWidgets
            r3.setAllowsGoneWidget(r4)
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r7.layout
            int[] r6 = r4.mReferenceIds
            if (r6 == 0) goto L95
            r3.setReferencedIds(r6)
            goto La6
        L95:
            java.lang.String r6 = r4.mReferenceIdString
            if (r6 == 0) goto La6
            int[] r6 = r9.convertReferenceString(r3, r6)
            r4.mReferenceIds = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r7.layout
            int[] r4 = r4.mReferenceIds
            r3.setReferencedIds(r4)
        La6:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            r3.validate()
            r7.applyTo(r3)
            if (r11 == 0) goto Lb9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r7.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(r5, r4)
        Lb9:
            r5.setLayoutParams(r3)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r7.propertySet
            int r4 = r3.mVisibilityMode
            if (r4 != 0) goto Lc7
            int r3 = r3.visibility
            r5.setVisibility(r3)
        Lc7:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r7.propertySet
            float r3 = r3.alpha
            r5.setAlpha(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.rotation
            r5.setRotation(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.rotationX
            r5.setRotationX(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.rotationY
            r5.setRotationY(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.scaleX
            r5.setScaleX(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.scaleY
            r5.setScaleY(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.transformPivotX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L102
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.transformPivotX
            r5.setPivotX(r3)
        L102:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.transformPivotY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L113
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.transformPivotY
            r5.setPivotY(r3)
        L113:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.translationX
            r5.setTranslationX(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.translationY
            r5.setTranslationY(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            float r3 = r3.translationZ
            r5.setTranslationZ(r3)
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r7.transform
            boolean r4 = r3.applyElevation
            if (r4 == 0) goto L133
            float r3 = r3.elevation
            r5.setElevation(r3)
        L133:
            int r2 = r2 + 1
            goto L10
        L137:
            java.util.Iterator r11 = r1.iterator()
        L13b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L1c0
            java.lang.Object r0 = r11.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r9.mConstraints
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r1.layout
            int r2 = r2.mHelperType
            if (r2 == r4) goto L19e
            if (r2 == r3) goto L158
            goto L19e
        L158:
            androidx.constraintlayout.widget.Barrier r2 = new androidx.constraintlayout.widget.Barrier
            android.content.Context r5 = r10.getContext()
            r2.<init>(r5)
            int r5 = r0.intValue()
            r2.setId(r5)
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r1.layout
            int[] r6 = r5.mReferenceIds
            if (r6 == 0) goto L172
            r2.setReferencedIds(r6)
            goto L183
        L172:
            java.lang.String r6 = r5.mReferenceIdString
            if (r6 == 0) goto L183
            int[] r6 = r9.convertReferenceString(r2, r6)
            r5.mReferenceIds = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r1.layout
            int[] r5 = r5.mReferenceIds
            r2.setReferencedIds(r5)
        L183:
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r1.layout
            int r5 = r5.mBarrierDirection
            r2.setType(r5)
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r1.layout
            int r5 = r5.mBarrierMargin
            r2.setMargin(r5)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = r10.generateDefaultLayoutParams()
            r2.validateParams()
            r1.applyTo(r5)
            r10.addView(r2, r5)
        L19e:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r1.layout
            boolean r2 = r2.mIsGuideline
            if (r2 == 0) goto L13b
            androidx.constraintlayout.widget.Guideline r2 = new androidx.constraintlayout.widget.Guideline
            android.content.Context r5 = r10.getContext()
            r2.<init>(r5)
            int r0 = r0.intValue()
            r2.setId(r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r10.generateDefaultLayoutParams()
            r1.applyTo(r0)
            r10.addView(r2, r0)
            goto L13b
        L1c0:
            return
    }

    public void applyToLayoutParams(int r3, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1b
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            r3.applyTo(r4)
        L1b:
            return
    }

    public void applyToWithoutCustom(androidx.constraintlayout.widget.ConstraintLayout r2) {
            r1 = this;
            r0 = 0
            r1.applyToInternal(r2, r0)
            r0 = 0
            r2.setConstraintSet(r0)
            return
    }

    public void center(int r8, int r9, int r10, int r11, int r12, int r13, int r14, float r15) {
            r7 = this;
            java.lang.String r0 = "margin must be > 0"
            if (r11 < 0) goto L9d
            if (r14 < 0) goto L96
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto L8d
            r0 = 1
            if (r10 == r0) goto L17
            r0 = 2
            if (r10 != r0) goto L21
        L17:
            r0 = r13
            r1 = r14
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r8
            r8 = r7
            goto L70
        L21:
            r0 = 6
            if (r10 == r0) goto L27
            r0 = 7
            if (r10 != r0) goto L30
        L27:
            r0 = r13
            r1 = r14
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r8
            r8 = r7
            goto L53
        L30:
            r3 = 3
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.connect(r2, r3, r4, r5, r6)
            r9 = r2
            r10 = 4
            r8 = r7
            r11 = r12
            r12 = r13
            r13 = r14
            r8.connect(r9, r10, r11, r12, r13)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r10 = r8.mConstraints
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r9 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r9
            androidx.constraintlayout.widget.ConstraintSet$Layout r9 = r9.layout
            r9.verticalBias = r15
            return
        L53:
            r10 = 6
            r8.connect(r9, r10, r11, r12, r13)
            r10 = 7
            r8 = r7
            r11 = r14
            r12 = r0
            r13 = r1
            r8.connect(r9, r10, r11, r12, r13)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r10 = r8.mConstraints
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r9 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r9
            androidx.constraintlayout.widget.ConstraintSet$Layout r9 = r9.layout
            r9.horizontalBias = r15
            return
        L70:
            r10 = 1
            r8.connect(r9, r10, r11, r12, r13)
            r10 = 2
            r8 = r7
            r11 = r14
            r12 = r0
            r13 = r1
            r8.connect(r9, r10, r11, r12, r13)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r10 = r8.mConstraints
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r9 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r9
            androidx.constraintlayout.widget.ConstraintSet$Layout r9 = r9.layout
            r9.horizontalBias = r15
            return
        L8d:
            r8 = r7
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "bias must be between 0 and 1 inclusive"
            r9.<init>(r10)
            throw r9
        L96:
            r8 = r7
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L9d:
            r8 = r7
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
    }

    public void centerHorizontally(int r19, int r20) {
            r18 = this;
            if (r20 != 0) goto L12
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 2
            r0 = r18
            r1 = r19
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L12:
            r16 = 0
            r17 = 1056964608(0x3f000000, float:0.5)
            r12 = 2
            r13 = 0
            r15 = 1
            r14 = r20
            r9 = r18
            r10 = r19
            r11 = r20
            r9.center(r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    public void centerHorizontally(int r7, int r8, int r9, int r10, int r11, int r12, int r13, float r14) {
            r6 = this;
            r2 = 1
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.connect(r1, r2, r3, r4, r5)
            r8 = r1
            r9 = 2
            r7 = r6
            r10 = r11
            r11 = r12
            r12 = r13
            r7.connect(r8, r9, r10, r11, r12)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r9 = r7.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r9.get(r8)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r8 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r8
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = r8.layout
            r8.horizontalBias = r14
            return
    }

    public void centerHorizontallyRtl(int r19, int r20) {
            r18 = this;
            if (r20 != 0) goto L12
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 6
            r4 = 0
            r5 = 0
            r6 = 7
            r0 = r18
            r1 = r19
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L12:
            r16 = 0
            r17 = 1056964608(0x3f000000, float:0.5)
            r12 = 7
            r13 = 0
            r15 = 6
            r14 = r20
            r9 = r18
            r10 = r19
            r11 = r20
            r9.center(r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    public void centerHorizontallyRtl(int r7, int r8, int r9, int r10, int r11, int r12, int r13, float r14) {
            r6 = this;
            r2 = 6
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.connect(r1, r2, r3, r4, r5)
            r8 = r1
            r9 = 7
            r7 = r6
            r10 = r11
            r11 = r12
            r12 = r13
            r7.connect(r8, r9, r10, r11, r12)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r9 = r7.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r9.get(r8)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r8 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r8
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = r8.layout
            r8.horizontalBias = r14
            return
    }

    public void centerVertically(int r19, int r20) {
            r18 = this;
            if (r20 != 0) goto L12
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 4
            r0 = r18
            r1 = r19
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L12:
            r16 = 0
            r17 = 1056964608(0x3f000000, float:0.5)
            r12 = 4
            r13 = 0
            r15 = 3
            r14 = r20
            r9 = r18
            r10 = r19
            r11 = r20
            r9.center(r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    public void centerVertically(int r7, int r8, int r9, int r10, int r11, int r12, int r13, float r14) {
            r6 = this;
            r2 = 3
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.connect(r1, r2, r3, r4, r5)
            r8 = r1
            r9 = 4
            r7 = r6
            r10 = r11
            r11 = r12
            r12 = r13
            r7.connect(r8, r9, r10, r11, r12)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r9 = r7.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r9.get(r8)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r8 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r8
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = r8.layout
            r8.verticalBias = r14
            return
    }

    public void clear(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r1.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return
    }

    public void clear(int r3, int r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L6a
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            r0 = -1
            switch(r4) {
                case 1: goto L60;
                case 2: goto L55;
                case 3: goto L4a;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L2f;
                case 7: goto L24;
                default: goto L1c;
            }
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "unknown constraint"
            r3.<init>(r4)
            throw r3
        L24:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r3.endToStart = r0
            r3.endToEnd = r0
            r3.endMargin = r0
            r3.goneEndMargin = r0
            return
        L2f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r3.startToEnd = r0
            r3.startToStart = r0
            r3.startMargin = r0
            r3.goneStartMargin = r0
            return
        L3a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r3.baselineToBaseline = r0
            return
        L3f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r3.bottomToTop = r0
            r3.bottomToBottom = r0
            r3.bottomMargin = r0
            r3.goneBottomMargin = r0
            return
        L4a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r3.topToBottom = r0
            r3.topToTop = r0
            r3.topMargin = r0
            r3.goneTopMargin = r0
            return
        L55:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r3.rightToRight = r0
            r3.rightToLeft = r0
            r3.rightMargin = r0
            r3.goneRightMargin = r0
            return
        L60:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r3.leftToRight = r0
            r3.leftToLeft = r0
            r3.leftMargin = r0
            r3.goneLeftMargin = r0
        L6a:
            return
    }

    public void clone(android.content.Context r2, int r3) {
            r1 = this;
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1.clone(r2)
            return
    }

    public void clone(androidx.constraintlayout.widget.ConstraintLayout r12) {
            r11 = this;
            int r0 = r12.getChildCount()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r11.mConstraints
            r1.clear()
            r1 = 0
        La:
            if (r1 >= r0) goto Lfb
            android.view.View r2 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            int r4 = r2.getId()
            boolean r5 = r11.mForceId
            if (r5 == 0) goto L2a
            r5 = -1
            if (r4 == r5) goto L22
            goto L2a
        L22:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r12.<init>(r0)
            throw r12
        L2a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L44
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r7.<init>()
            r5.put(r6, r7)
        L44:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r5
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r11.mSavedAttributes
            java.util.HashMap r6 = androidx.constraintlayout.widget.ConstraintAttribute.extractAttributes(r6, r2)
            r5.mCustomConstraints = r6
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$000(r5, r4, r3)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            int r4 = r2.getVisibility()
            r3.visibility = r4
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            float r4 = r2.getAlpha()
            r3.alpha = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotation()
            r3.rotation = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationX()
            r3.rotationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationY()
            r3.rotationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleX()
            r3.scaleX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleY()
            r3.scaleY = r4
            float r3 = r2.getPivotX()
            float r4 = r2.getPivotY()
            double r6 = (double) r3
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto La7
            double r6 = (double) r4
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Lad
        La7:
            androidx.constraintlayout.widget.ConstraintSet$Transform r6 = r5.transform
            r6.transformPivotX = r3
            r6.transformPivotY = r4
        Lad:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationX()
            r3.translationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationY()
            r3.translationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationZ()
            r3.translationZ = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            boolean r4 = r3.applyElevation
            if (r4 == 0) goto Ld1
            float r4 = r2.getElevation()
            r3.elevation = r4
        Ld1:
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Barrier
            if (r3 == 0) goto Lf7
            androidx.constraintlayout.widget.Barrier r2 = (androidx.constraintlayout.widget.Barrier) r2
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            boolean r4 = r2.allowsGoneWidget()
            r3.mBarrierAllowsGoneWidgets = r4
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            int[] r4 = r2.getReferencedIds()
            r3.mReferenceIds = r4
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            int r4 = r2.getType()
            r3.mBarrierDirection = r4
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            int r2 = r2.getMargin()
            r3.mBarrierMargin = r2
        Lf7:
            int r1 = r1 + 1
            goto La
        Lfb:
            return
    }

    public void clone(androidx.constraintlayout.widget.ConstraintSet r5) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r4.mConstraints
            r0.clear()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r5.mConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r2 = r4.mConstraints
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r5.mConstraints
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r3.clone()
            r2.put(r1, r3)
            goto Lf
        L2d:
            return
    }

    public void clone(androidx.constraintlayout.widget.Constraints r9) {
            r8 = this;
            int r0 = r9.getChildCount()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r8.mConstraints
            r1.clear()
            r1 = 0
        La:
            if (r1 >= r0) goto L5f
            android.view.View r2 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.Constraints$LayoutParams r3 = (androidx.constraintlayout.widget.Constraints.LayoutParams) r3
            int r4 = r2.getId()
            boolean r5 = r8.mForceId
            if (r5 == 0) goto L2a
            r5 = -1
            if (r4 == r5) goto L22
            goto L2a
        L22:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r9.<init>(r0)
            throw r9
        L2a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r8.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L44
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r8.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r7.<init>()
            r5.put(r6, r7)
        L44:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r8.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r5
            boolean r6 = r2 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r6 == 0) goto L59
            androidx.constraintlayout.widget.ConstraintHelper r2 = (androidx.constraintlayout.widget.ConstraintHelper) r2
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$300(r5, r2, r4, r3)
        L59:
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$400(r5, r4, r3)
            int r1 = r1 + 1
            goto La
        L5f:
            return
    }

    public void connect(int r10, int r11, int r12, int r13) {
            r9 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1a
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r2.<init>()
            r0.put(r1, r2)
        L1a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r0.get(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r10 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r10
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 4
            r4 = 6
            r5 = 7
            java.lang.String r6 = "right to "
            java.lang.String r7 = " undefined"
            r8 = -1
            switch(r11) {
                case 1: goto L175;
                case 2: goto L147;
                case 3: goto L115;
                case 4: goto Le3;
                case 5: goto Lb7;
                case 6: goto L89;
                case 7: goto L5b;
                default: goto L34;
            }
        L34:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = r9.sideToString(r11)
            r12.append(r11)
            java.lang.String r11 = " to "
            r12.append(r11)
            java.lang.String r11 = r9.sideToString(r13)
            r12.append(r11)
            java.lang.String r11 = " unknown"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L5b:
            if (r13 != r5) goto L64
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.endToEnd = r12
            r10.endToStart = r8
            return
        L64:
            if (r13 != r4) goto L6d
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.endToStart = r12
            r10.endToEnd = r8
            return
        L6d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L89:
            if (r13 != r4) goto L92
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.startToStart = r12
            r10.startToEnd = r8
            return
        L92:
            if (r13 != r5) goto L9b
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.startToEnd = r12
            r10.startToStart = r8
            return
        L9b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lb7:
            r11 = 5
            if (r13 != r11) goto Lc7
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToBaseline = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            return
        Lc7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Le3:
            if (r13 != r3) goto Lee
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.bottomToBottom = r12
            r10.bottomToTop = r8
            r10.baselineToBaseline = r8
            return
        Lee:
            if (r13 != r2) goto Lf9
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.bottomToTop = r12
            r10.bottomToBottom = r8
            r10.baselineToBaseline = r8
            return
        Lf9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L115:
            if (r13 != r2) goto L120
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.topToTop = r12
            r10.topToBottom = r8
            r10.baselineToBaseline = r8
            return
        L120:
            if (r13 != r3) goto L12b
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.topToBottom = r12
            r10.topToTop = r8
            r10.baselineToBaseline = r8
            return
        L12b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L147:
            if (r13 != r1) goto L150
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.rightToLeft = r12
            r10.rightToRight = r8
            return
        L150:
            if (r13 != r0) goto L159
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.rightToRight = r12
            r10.rightToLeft = r8
            return
        L159:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L175:
            if (r13 != r1) goto L17e
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.leftToLeft = r12
            r10.leftToRight = r8
            return
        L17e:
            if (r13 != r0) goto L187
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.leftToRight = r12
            r10.leftToLeft = r8
            return
        L187:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "left to "
            r11.append(r12)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public void connect(int r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1a
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r2.<init>()
            r0.put(r1, r2)
        L1a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r0.get(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r10 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r10
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 4
            r4 = 6
            r5 = 7
            java.lang.String r6 = "right to "
            java.lang.String r7 = " undefined"
            r8 = -1
            switch(r11) {
                case 1: goto L189;
                case 2: goto L157;
                case 3: goto L121;
                case 4: goto Leb;
                case 5: goto Lbf;
                case 6: goto L8d;
                case 7: goto L5b;
                default: goto L34;
            }
        L34:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = r9.sideToString(r11)
            r12.append(r11)
            java.lang.String r11 = " to "
            r12.append(r11)
            java.lang.String r11 = r9.sideToString(r13)
            r12.append(r11)
            java.lang.String r11 = " unknown"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L5b:
            if (r13 != r5) goto L64
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.endToEnd = r12
            r11.endToStart = r8
            goto L6c
        L64:
            if (r13 != r4) goto L71
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.endToStart = r12
            r11.endToEnd = r8
        L6c:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.endMargin = r14
            return
        L71:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L8d:
            if (r13 != r4) goto L96
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.startToStart = r12
            r11.startToEnd = r8
            goto L9e
        L96:
            if (r13 != r5) goto La3
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.startToEnd = r12
            r11.startToStart = r8
        L9e:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.startMargin = r14
            return
        La3:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lbf:
            r11 = 5
            if (r13 != r11) goto Lcf
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToBaseline = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            return
        Lcf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Leb:
            if (r13 != r3) goto Lf6
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.bottomToBottom = r12
            r11.bottomToTop = r8
            r11.baselineToBaseline = r8
            goto L100
        Lf6:
            if (r13 != r2) goto L105
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.bottomToTop = r12
            r11.bottomToBottom = r8
            r11.baselineToBaseline = r8
        L100:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.bottomMargin = r14
            return
        L105:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L121:
            if (r13 != r2) goto L12c
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.topToTop = r12
            r11.topToBottom = r8
            r11.baselineToBaseline = r8
            goto L136
        L12c:
            if (r13 != r3) goto L13b
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.topToBottom = r12
            r11.topToTop = r8
            r11.baselineToBaseline = r8
        L136:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.topMargin = r14
            return
        L13b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L157:
            if (r13 != r1) goto L160
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.rightToLeft = r12
            r11.rightToRight = r8
            goto L168
        L160:
            if (r13 != r0) goto L16d
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.rightToRight = r12
            r11.rightToLeft = r8
        L168:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.rightMargin = r14
            return
        L16d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L189:
            if (r13 != r1) goto L192
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.leftToLeft = r12
            r11.leftToRight = r8
            goto L19a
        L192:
            if (r13 != r0) goto L19f
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.leftToRight = r12
            r11.leftToLeft = r8
        L19a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.leftMargin = r14
            return
        L19f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Left to "
            r11.append(r12)
            java.lang.String r12 = r9.sideToString(r13)
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public void constrainCircle(int r1, int r2, int r3, float r4) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.circleConstraint = r2
            r1.circleRadius = r3
            r1.circleAngle = r4
            return
    }

    public void constrainDefaultHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightDefault = r2
            return
    }

    public void constrainDefaultWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthDefault = r2
            return
    }

    public void constrainHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mHeight = r2
            return
    }

    public void constrainMaxHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightMax = r2
            return
    }

    public void constrainMaxWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthMax = r2
            return
    }

    public void constrainMinHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightMin = r2
            return
    }

    public void constrainMinWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthMin = r2
            return
    }

    public void constrainPercentHeight(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightPercent = r2
            return
    }

    public void constrainPercentWidth(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthPercent = r2
            return
    }

    public void constrainWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mWidth = r2
            return
    }

    public void constrainedHeight(int r1, boolean r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.constrainedHeight = r2
            return
    }

    public void constrainedWidth(int r1, boolean r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.constrainedWidth = r2
            return
    }

    public void create(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r0 = 1
            r2.mIsGuideline = r0
            r2.orientation = r3
            return
    }

    public void createBarrier(int r2, int r3, int r4, int... r5) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r0 = 1
            r2.mHelperType = r0
            r2.mBarrierDirection = r3
            r2.mBarrierMargin = r4
            r3 = 0
            r2.mIsGuideline = r3
            r2.mReferenceIds = r5
            return
    }

    public void createHorizontalChain(int r11, int r12, int r13, int r14, int[] r15, float[] r16, int r17) {
            r10 = this;
            r8 = 1
            r9 = 2
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.createHorizontalChain(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void createHorizontalChainRtl(int r11, int r12, int r13, int r14, int[] r15, float[] r16, int r17) {
            r10 = this;
            r8 = 6
            r9 = 7
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.createHorizontalChain(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void createVerticalChain(int r12, int r13, int r14, int r15, int[] r16, float[] r17, int r18) {
            r11 = this;
            r6 = r16
            r7 = r17
            int r1 = r6.length
            r2 = 2
            java.lang.String r3 = "must have 2 or more widgets in a chain"
            if (r1 < r2) goto L75
            if (r7 == 0) goto L17
            int r1 = r7.length
            int r2 = r6.length
            if (r1 != r2) goto L11
            goto L17
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        L17:
            r1 = 0
            if (r7 == 0) goto L26
            r2 = r6[r1]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r11.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = r7[r1]
            r2.verticalWeight = r3
        L26:
            r2 = r6[r1]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r11.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = r18
            r2.verticalChainStyle = r3
            r1 = r6[r1]
            r2 = 3
            r5 = 0
            r0 = r11
            r3 = r12
            r4 = r13
            r0.connect(r1, r2, r3, r4, r5)
            r8 = 1
            r9 = 1
        L3e:
            int r0 = r6.length
            if (r9 >= r0) goto L68
            r1 = r6[r9]
            int r10 = r9 + (-1)
            r3 = r6[r10]
            r4 = 4
            r5 = 0
            r2 = 3
            r0 = r11
            r0.connect(r1, r2, r3, r4, r5)
            r1 = r6[r10]
            r3 = r6[r9]
            r4 = 3
            r2 = 4
            r0.connect(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L65
            r1 = r6[r9]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r11.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r7[r9]
            r1.verticalWeight = r2
        L65:
            int r9 = r9 + 1
            goto L3e
        L68:
            int r1 = r6.length
            int r1 = r1 - r8
            r1 = r6[r1]
            r2 = 4
            r5 = 0
            r0 = r11
            r3 = r14
            r4 = r15
            r0.connect(r1, r2, r3, r4, r5)
            return
        L75:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    public void dump(androidx.constraintlayout.motion.widget.MotionScene r7, int... r8) {
            r6 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r6.mConstraints
            java.util.Set r0 = r0.keySet()
            int r1 = r8.length
            r2 = 0
            if (r1 == 0) goto L1f
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r3 = 0
        L11:
            if (r3 >= r1) goto L25
            r4 = r8[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L11
        L1f:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r0)
            r0 = r8
        L25:
            java.io.PrintStream r8 = java.lang.System.out
            r0.size()
            r8.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            int r1 = r0.length
        L3b:
            if (r2 >= r1) goto L61
            r3 = r0[r2]
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r4
            java.lang.String r5 = "<Constraint id="
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = " \n"
            r8.append(r3)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r4.layout
            r3.dump(r7, r8)
            java.lang.String r3 = "/>\n"
            r8.append(r3)
            int r2 = r2 + 1
            goto L3b
        L61:
            java.io.PrintStream r7 = java.lang.System.out
            r7.getClass()
            return
    }

    public boolean getApplyElevation(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            boolean r1 = r1.applyElevation
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getConstraint(int r3) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            return r3
        L19:
            r3 = 0
            return r3
    }

    public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getCustomAttributeSet() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mSavedAttributes
            return r0
    }

    public int getHeight(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            int r1 = r1.mHeight
            return r1
    }

    public int[] getKnownIds() {
            r5 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r5.mConstraints
            java.util.Set r0 = r0.keySet()
            r1 = 0
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            int r2 = r0.length
            int[] r3 = new int[r2]
        L12:
            if (r1 >= r2) goto L1f
            r4 = r0[r1]
            int r4 = r4.intValue()
            r3[r1] = r4
            int r1 = r1 + 1
            goto L12
        L1f:
            return r3
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getParameters(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            return r1
    }

    public int[] getReferencedIds(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            int[] r2 = r2.mReferenceIds
            if (r2 != 0) goto Le
            r2 = 0
            int[] r2 = new int[r2]
            return r2
        Le:
            int r0 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r0)
            return r2
    }

    public int getVisibility(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            int r1 = r1.visibility
            return r1
    }

    public int getVisibilityMode(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            int r1 = r1.mVisibilityMode
            return r1
    }

    public int getWidth(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            int r1 = r1.mWidth
            return r1
    }

    public boolean isForceId() {
            r1 = this;
            boolean r0 = r1.mForceId
            return r0
    }

    public void load(android.content.Context r5, int r6) {
            r4 = this;
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)
            int r0 = r6.getEventType()     // Catch: java.lang.Throwable -> L41
        Lc:
            r1 = 1
            if (r0 == r1) goto L41
            if (r0 == 0) goto L39
            r2 = 2
            if (r0 == r2) goto L15
            goto L3c
        L15:
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> L41
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r6)     // Catch: java.lang.Throwable -> L41
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r4.fillFromAttributeList(r5, r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "Guideline"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2d
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout     // Catch: java.lang.Throwable -> L41
            r0.mIsGuideline = r1     // Catch: java.lang.Throwable -> L41
        L2d:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r4.mConstraints     // Catch: java.lang.Throwable -> L41
            int r1 = r2.mViewId     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L41
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L41
            goto L3c
        L39:
            r6.getName()     // Catch: java.lang.Throwable -> L41
        L3c:
            int r0 = r6.next()     // Catch: java.lang.Throwable -> L41
            goto Lc
        L41:
            return
    }

    public void load(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9) {
            r7 = this;
            int r0 = r9.getEventType()     // Catch: java.lang.Throwable -> L16d
            r1 = 0
            r2 = r1
        L6:
            r3 = 1
            if (r0 == r3) goto L16d
            if (r0 == 0) goto L164
            r4 = 2
            java.lang.String r5 = "Constraint"
            if (r0 == r4) goto L37
            r3 = 3
            if (r0 == r3) goto L15
            goto L167
        L15:
            java.lang.String r0 = r9.getName()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r3 == 0) goto L23
            goto L16d
        L23:
            boolean r0 = r0.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r7.mConstraints     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            int r3 = r2.mViewId     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r2 = r1
            goto L167
        L37:
            java.lang.String r0 = r9.getName()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            int r4 = r0.hashCode()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.String r6 = "XML parser error must be within a Constraint "
            switch(r4) {
                case -2025855158: goto L137;
                case -1984451626: goto L10a;
                case -1269513683: goto Ldc;
                case -1238332596: goto Lae;
                case -71750448: goto L96;
                case 1331510167: goto L80;
                case 1791837707: goto L56;
                case 1803088381: goto L46;
                default: goto L44;
            }
        L44:
            goto L167
        L46:
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r7.fillFromAttributeList(r8, r0)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        L56:
            java.lang.String r3 = "CustomAttribute"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            if (r2 == 0) goto L67
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r8, r9, r0)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        L67:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.<init>()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r6)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            int r9 = r9.getLineNumber()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            throw r8     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
        L80:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r7.fillFromAttributeList(r8, r0)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.mHelperType = r3     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        L96:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r7.fillFromAttributeList(r8, r0)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.mIsGuideline = r3     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.mApply = r3     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        Lae:
            java.lang.String r3 = "Transform"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            if (r2 == 0) goto Lc3
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r2.transform     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.fillFromAttributeList(r8, r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        Lc3:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.<init>()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r6)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            int r9 = r9.getLineNumber()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            throw r8     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
        Ldc:
            java.lang.String r3 = "PropertySet"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            if (r2 == 0) goto Lf1
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r2.propertySet     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.fillFromAttributeList(r8, r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        Lf1:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.<init>()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r6)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            int r9 = r9.getLineNumber()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            throw r8     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
        L10a:
            java.lang.String r3 = "Motion"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            if (r2 == 0) goto L11e
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r2.motion     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.fillFromAttributeList(r8, r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        L11e:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.<init>()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r6)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            int r9 = r9.getLineNumber()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            throw r8     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
        L137:
            java.lang.String r3 = "Layout"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            if (r0 == 0) goto L167
            if (r2 == 0) goto L14b
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.fillFromAttributeList(r8, r3)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L167
        L14b:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.<init>()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r6)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            int r9 = r9.getLineNumber()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r0.append(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            throw r8     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
        L164:
            r9.getName()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
        L167:
            int r0 = r9.next()     // Catch: java.lang.Throwable -> L16d java.lang.Throwable -> L16d
            goto L6
        L16d:
            return
    }

    public void parseColorAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            r0 = 0
            r1 = 0
        L8:
            int r2 = r7.length
            if (r1 >= r2) goto L29
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 2
            if (r3 == r4) goto L1a
            r2 = r7[r1]
            goto L26
        L1a:
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            int r2 = android.graphics.Color.parseColor(r2)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$600(r6, r3, r2)
        L26:
            int r1 = r1 + 1
            goto L8
        L29:
            return
    }

    public void parseFloatAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            r0 = 0
            r1 = 0
        L8:
            int r2 = r7.length
            if (r1 >= r2) goto L29
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 2
            if (r3 == r4) goto L1a
            r2 = r7[r1]
            goto L26
        L1a:
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            float r2 = java.lang.Float.parseFloat(r2)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$700(r6, r3, r2)
        L26:
            int r1 = r1 + 1
            goto L8
        L29:
            return
    }

    public void parseIntAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            r0 = 0
            r1 = 0
        L8:
            int r2 = r7.length
            if (r1 >= r2) goto L2e
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 2
            if (r3 == r4) goto L1a
            r2 = r7[r1]
            goto L2b
        L1a:
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            java.lang.Integer r2 = java.lang.Integer.decode(r2)
            int r2 = r2.intValue()
            float r2 = (float) r2
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$700(r6, r3, r2)
        L2b:
            int r1 = r1 + 1
            goto L8
        L2e:
            return
    }

    public void parseStringAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String[] r7 = splitString(r7)
            r0 = 0
            r1 = 0
        L6:
            int r2 = r7.length
            if (r1 >= r2) goto L1e
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            r3 = r7[r1]
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$800(r6, r3, r2)
            int r1 = r1 + 1
            goto L6
        L1e:
            return
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintLayout r12) {
            r11 = this;
            int r0 = r12.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L10f
            android.view.View r2 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            int r4 = r2.getId()
            boolean r5 = r11.mForceId
            if (r5 == 0) goto L25
            r5 = -1
            if (r4 == r5) goto L1d
            goto L25
        L1d:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r12.<init>(r0)
            throw r12
        L25:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L3f
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r7.<init>()
            r5.put(r6, r7)
        L3f:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r5
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r5.layout
            boolean r6 = r6.mApply
            r7 = 1
            if (r6 != 0) goto L87
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$000(r5, r4, r3)
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r3 == 0) goto L83
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            r4 = r2
            androidx.constraintlayout.widget.ConstraintHelper r4 = (androidx.constraintlayout.widget.ConstraintHelper) r4
            int[] r4 = r4.getReferencedIds()
            r3.mReferenceIds = r4
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Barrier
            if (r3 == 0) goto L83
            r3 = r2
            androidx.constraintlayout.widget.Barrier r3 = (androidx.constraintlayout.widget.Barrier) r3
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r5.layout
            boolean r6 = r3.allowsGoneWidget()
            r4.mBarrierAllowsGoneWidgets = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r5.layout
            int r6 = r3.getType()
            r4.mBarrierDirection = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r5.layout
            int r3 = r3.getMargin()
            r4.mBarrierMargin = r3
        L83:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            r3.mApply = r7
        L87:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            boolean r4 = r3.mApply
            if (r4 != 0) goto L9f
            int r4 = r2.getVisibility()
            r3.visibility = r4
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            float r4 = r2.getAlpha()
            r3.alpha = r4
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            r3.mApply = r7
        L9f:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            boolean r4 = r3.mApply
            if (r4 != 0) goto L10b
            r3.mApply = r7
            float r4 = r2.getRotation()
            r3.rotation = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationX()
            r3.rotationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationY()
            r3.rotationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleX()
            r3.scaleX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleY()
            r3.scaleY = r4
            float r3 = r2.getPivotX()
            float r4 = r2.getPivotY()
            double r6 = (double) r3
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto Le1
            double r6 = (double) r4
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Le7
        Le1:
            androidx.constraintlayout.widget.ConstraintSet$Transform r6 = r5.transform
            r6.transformPivotX = r3
            r6.transformPivotY = r4
        Le7:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationX()
            r3.translationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationY()
            r3.translationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationZ()
            r3.translationZ = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            boolean r4 = r3.applyElevation
            if (r4 == 0) goto L10b
            float r2 = r2.getElevation()
            r3.elevation = r2
        L10b:
            int r1 = r1 + 1
            goto L5
        L10f:
            return
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintSet r8) {
            r7 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r8.mConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r2 = r8.mConstraints
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r2
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r7.mConstraints
            boolean r3 = r3.containsKey(r1)
            if (r3 != 0) goto L33
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r7.mConstraints
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r4.<init>()
            r3.put(r1, r4)
        L33:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r7.mConstraints
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r1.layout
            boolean r4 = r3.mApply
            if (r4 != 0) goto L46
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r2.layout
            r3.copyFrom(r4)
        L46:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r1.propertySet
            boolean r4 = r3.mApply
            if (r4 != 0) goto L51
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r4 = r2.propertySet
            r3.copyFrom(r4)
        L51:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r1.transform
            boolean r4 = r3.mApply
            if (r4 != 0) goto L5c
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r2.transform
            r3.copyFrom(r4)
        L5c:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r1.motion
            boolean r4 = r3.mApply
            if (r4 != 0) goto L67
            androidx.constraintlayout.widget.ConstraintSet$Motion r4 = r2.motion
            r3.copyFrom(r4)
        L67:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r2.mCustomConstraints
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L71:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r1.mCustomConstraints
            boolean r5 = r5.containsKey(r4)
            if (r5 != 0) goto L71
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r1.mCustomConstraints
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r2.mCustomConstraints
            java.lang.Object r6 = r6.get(r4)
            r5.put(r4, r6)
            goto L71
        L91:
            return
    }

    public void removeAttribute(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mSavedAttributes
            r0.remove(r2)
            return
    }

    public void removeFromHorizontalChain(int r14) {
            r13 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r13.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto La9
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r13.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            int r2 = r0.leftToRight
            int r4 = r0.rightToLeft
            r1 = -1
            if (r2 != r1) goto L23
            if (r4 == r1) goto L25
        L23:
            r3 = r13
            goto L6a
        L25:
            int r6 = r0.startToEnd
            int r8 = r0.endToStart
            if (r6 != r1) goto L30
            if (r8 == r1) goto L2e
            goto L30
        L2e:
            r3 = r13
            goto L61
        L30:
            if (r6 == r1) goto L45
            if (r8 == r1) goto L45
            r9 = 6
            r10 = 0
            r7 = 7
            r5 = r13
            r5.connect(r6, r7, r8, r9, r10)
            r5 = 7
            r6 = 0
            r3 = 6
            r1 = r13
            r4 = r2
            r2 = r8
            r1.connect(r2, r3, r4, r5, r6)
            goto L2e
        L45:
            if (r2 != r1) goto L49
            if (r8 == r1) goto L2e
        L49:
            int r4 = r0.rightToRight
            if (r4 == r1) goto L55
            r5 = 7
            r6 = 0
            r3 = 7
            r1 = r13
            r1.connect(r2, r3, r4, r5, r6)
            goto L2e
        L55:
            int r10 = r0.leftToLeft
            if (r10 == r1) goto L2e
            r11 = 6
            r12 = 0
            r9 = 6
            r7 = r13
            r7.connect(r8, r9, r10, r11, r12)
            r3 = r7
        L61:
            r0 = 6
            r13.clear(r14, r0)
            r0 = 7
            r13.clear(r14, r0)
            return
        L6a:
            if (r2 == r1) goto L7f
            if (r4 == r1) goto L7f
            r5 = 1
            r6 = 0
            r3 = 2
            r1 = r13
            r1.connect(r2, r3, r4, r5, r6)
            r5 = 2
            r3 = 1
            r1 = r4
            r4 = r2
            r2 = r1
            r1 = r13
            r1.connect(r2, r3, r4, r5, r6)
            goto La0
        L7f:
            if (r2 != r1) goto L83
            if (r4 == r1) goto L85
        L83:
            r3 = r4
            goto L87
        L85:
            r1 = r13
            goto La0
        L87:
            int r4 = r0.rightToRight
            if (r4 == r1) goto L93
            r5 = 2
            r6 = 0
            r3 = 2
            r1 = r13
            r1.connect(r2, r3, r4, r5, r6)
            goto La0
        L93:
            int r6 = r0.leftToLeft
            if (r6 == r1) goto L85
            r7 = 1
            r8 = 0
            r5 = 1
            r4 = r3
            r3 = r13
            r3.connect(r4, r5, r6, r7, r8)
            r1 = r3
        La0:
            r0 = 1
            r13.clear(r14, r0)
            r0 = 2
            r13.clear(r14, r0)
            return
        La9:
            r1 = r13
            return
    }

    public void removeFromVerticalChain(int r10) {
            r9 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L24
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            int r2 = r0.topToBottom
            int r4 = r0.bottomToTop
            r1 = -1
            if (r2 != r1) goto L26
            if (r4 == r1) goto L24
            goto L26
        L24:
            r1 = r9
            goto L59
        L26:
            if (r2 == r1) goto L3b
            if (r4 == r1) goto L3b
            r5 = 3
            r6 = 0
            r3 = 4
            r1 = r9
            r1.connect(r2, r3, r4, r5, r6)
            r5 = 4
            r3 = 3
            r1 = r4
            r4 = r2
            r2 = r1
            r1 = r9
            r1.connect(r2, r3, r4, r5, r6)
            goto L59
        L3b:
            if (r2 != r1) goto L3f
            if (r4 == r1) goto L24
        L3f:
            r3 = r4
            int r4 = r0.bottomToBottom
            if (r4 == r1) goto L4c
            r5 = 4
            r6 = 0
            r3 = 4
            r1 = r9
            r1.connect(r2, r3, r4, r5, r6)
            goto L59
        L4c:
            int r6 = r0.topToTop
            if (r6 == r1) goto L24
            r7 = 3
            r8 = 0
            r5 = 3
            r4 = r3
            r3 = r9
            r3.connect(r4, r5, r6, r7, r8)
            r1 = r3
        L59:
            r0 = 3
            r9.clear(r10, r0)
            r0 = 4
            r9.clear(r10, r0)
            return
    }

    public void setAlpha(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.alpha = r2
            return
    }

    public void setApplyElevation(int r1, boolean r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.applyElevation = r2
            return
    }

    public void setBarrierType(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mHelperType = r2
            return
    }

    public void setColorValue(int r1, java.lang.String r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$600(r1, r2, r3)
            return
    }

    public void setDimensionRatio(int r1, java.lang.String r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.dimensionRatio = r2
            return
    }

    public void setEditorAbsoluteX(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.editorAbsoluteX = r2
            return
    }

    public void setEditorAbsoluteY(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.editorAbsoluteY = r2
            return
    }

    public void setElevation(int r2, float r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r0.transform
            r0.elevation = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r2.transform
            r3 = 1
            r2.applyElevation = r3
            return
    }

    public void setFloatValue(int r1, java.lang.String r2, float r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$700(r1, r2, r3)
            return
    }

    public void setForceId(boolean r1) {
            r0 = this;
            r0.mForceId = r1
            return
    }

    public void setGoneMargin(int r1, int r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            switch(r2) {
                case 1: goto L30;
                case 2: goto L2b;
                case 3: goto L26;
                case 4: goto L21;
                case 5: goto L19;
                case 6: goto L14;
                case 7: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lf:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneEndMargin = r3
            return
        L14:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneStartMargin = r3
            return
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L21:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneBottomMargin = r3
            return
        L26:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneTopMargin = r3
            return
        L2b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneRightMargin = r3
            return
        L30:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneLeftMargin = r3
            return
    }

    public void setGuidelineBegin(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.guideBegin = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r0 = -1
            r3.guideEnd = r0
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.guidePercent = r3
            return
    }

    public void setGuidelineEnd(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.guideEnd = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r0 = -1
            r3.guideBegin = r0
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.guidePercent = r3
            return
    }

    public void setGuidelinePercent(int r2, float r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.guidePercent = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r0 = -1
            r3.guideEnd = r0
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r2.guideBegin = r0
            return
    }

    public void setHorizontalBias(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalBias = r2
            return
    }

    public void setHorizontalChainStyle(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalChainStyle = r2
            return
    }

    public void setHorizontalWeight(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalWeight = r2
            return
    }

    public void setIntValue(int r1, java.lang.String r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$500(r1, r2, r3)
            return
    }

    public void setMargin(int r1, int r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            switch(r2) {
                case 1: goto L30;
                case 2: goto L2b;
                case 3: goto L26;
                case 4: goto L21;
                case 5: goto L19;
                case 6: goto L14;
                case 7: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lf:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.endMargin = r3
            return
        L14:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.startMargin = r3
            return
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L21:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.bottomMargin = r3
            return
        L26:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.topMargin = r3
            return
        L2b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.rightMargin = r3
            return
        L30:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.leftMargin = r3
            return
    }

    public void setReferencedIds(int r1, int... r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mReferenceIds = r2
            return
    }

    public void setRotation(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotation = r2
            return
    }

    public void setRotationX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotationX = r2
            return
    }

    public void setRotationY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotationY = r2
            return
    }

    public void setScaleX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.scaleX = r2
            return
    }

    public void setScaleY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.scaleY = r2
            return
    }

    public void setStringValue(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$800(r1, r2, r3)
            return
    }

    public void setTransformPivot(int r1, float r2, float r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotY = r3
            r1.transformPivotX = r2
            return
    }

    public void setTransformPivotX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotX = r2
            return
    }

    public void setTransformPivotY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotY = r2
            return
    }

    public void setTranslation(int r1, float r2, float r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationX = r2
            r1.translationY = r3
            return
    }

    public void setTranslationX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationX = r2
            return
    }

    public void setTranslationY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationY = r2
            return
    }

    public void setTranslationZ(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationZ = r2
            return
    }

    public void setValidateOnParse(boolean r1) {
            r0 = this;
            r0.mValidate = r1
            return
    }

    public void setVerticalBias(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalBias = r2
            return
    }

    public void setVerticalChainStyle(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalChainStyle = r2
            return
    }

    public void setVerticalWeight(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalWeight = r2
            return
    }

    public void setVisibility(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.visibility = r2
            return
    }

    public void setVisibilityMode(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.mVisibilityMode = r2
            return
    }
}
