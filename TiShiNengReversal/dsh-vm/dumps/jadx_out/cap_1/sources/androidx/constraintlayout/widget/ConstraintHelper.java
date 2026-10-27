package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ConstraintHelper extends android.view.View {
    protected int mCount;
    protected androidx.constraintlayout.solver.widgets.Helper mHelperWidget;
    protected int[] mIds;
    private java.util.HashMap<java.lang.Integer, java.lang.String> mMap;
    protected java.lang.String mReferenceIds;
    protected boolean mUseViewMeasure;
    private android.view.View[] mViews;
    protected android.content.Context myContext;

    public ConstraintHelper(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 32
            int[] r0 = new int[r0]
            r2.mIds = r0
            r0 = 0
            r2.mUseViewMeasure = r0
            r0 = 0
            r2.mViews = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mMap = r1
            r2.myContext = r3
            r2.init(r0)
            return
    }

    public ConstraintHelper(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 32
            int[] r0 = new int[r0]
            r1.mIds = r0
            r0 = 0
            r1.mUseViewMeasure = r0
            r0 = 0
            r1.mViews = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mMap = r0
            r1.myContext = r2
            r1.init(r3)
            return
    }

    public ConstraintHelper(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 32
            int[] r3 = new int[r3]
            r0.mIds = r3
            r3 = 0
            r0.mUseViewMeasure = r3
            r3 = 0
            r0.mViews = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.mMap = r3
            r0.myContext = r1
            r0.init(r2)
            return
    }

    private void addID(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L32
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L32
        L9:
            android.content.Context r0 = r3.myContext
            if (r0 != 0) goto Le
            goto L32
        Le:
            java.lang.String r4 = r4.trim()
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L20
            android.view.ViewParent r0 = r3.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
        L20:
            int r0 = r3.findId(r4)
            if (r0 == 0) goto L32
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r3.mMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r4)
            r3.addRscID(r0)
        L32:
            return
    }

    private void addRscID(int r4) {
            r3 = this;
            int r0 = r3.getId()
            if (r4 != r0) goto L7
            return
        L7:
            int r0 = r3.mCount
            int r0 = r0 + 1
            int[] r1 = r3.mIds
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.mIds = r0
        L19:
            int[] r0 = r3.mIds
            int r1 = r3.mCount
            r0[r1] = r4
            int r1 = r1 + 1
            r3.mCount = r1
            return
    }

    private int[] convertReferenceString(android.view.View r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = ","
            java.lang.String[] r6 = r6.split(r0)
            r5.getContext()
            int r5 = r6.length
            int[] r5 = new int[r5]
            r0 = 0
            r1 = 0
        Le:
            int r2 = r6.length
            if (r0 >= r2) goto L25
            r2 = r6[r0]
            java.lang.String r2 = r2.trim()
            int r2 = r4.findId(r2)
            if (r2 == 0) goto L22
            int r3 = r1 + 1
            r5[r1] = r2
            r1 = r3
        L22:
            int r0 = r0 + 1
            goto Le
        L25:
            int r6 = r6.length
            if (r1 == r6) goto L2c
            int[] r5 = java.util.Arrays.copyOf(r5, r1)
        L2c:
            return r5
    }

    private int findId(androidx.constraintlayout.widget.ConstraintLayout r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L39
            if (r8 != 0) goto L6
            goto L39
        L6:
            android.content.Context r1 = r7.myContext
            android.content.res.Resources r1 = r1.getResources()
            if (r1 != 0) goto Lf
            return r0
        Lf:
            int r2 = r8.getChildCount()
            r3 = 0
        L14:
            if (r3 >= r2) goto L39
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L36
            int r5 = r4.getId()     // Catch: android.content.res.Resources.NotFoundException -> L2a
            java.lang.String r5 = r1.getResourceEntryName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L36
            int r8 = r4.getId()
            return r8
        L36:
            int r3 = r3 + 1
            goto L14
        L39:
            return r0
    }

    private int findId(java.lang.String r6) {
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L10
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r2 = r5.isInEditMode()
            r3 = 0
            if (r2 == 0) goto L28
            if (r0 == 0) goto L28
            java.lang.Object r2 = r0.getDesignInformation(r3, r6)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L28
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
        L28:
            if (r3 != 0) goto L30
            if (r0 == 0) goto L30
            int r3 = r5.findId(r0, r6)
        L30:
            if (r3 != 0) goto L3e
            java.lang.Class<androidx.constraintlayout.widget.R$id> r0 = androidx.constraintlayout.widget.R.id.class
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: java.lang.Exception -> L3d
            int r3 = r0.getInt(r1)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
        L3e:
            if (r3 != 0) goto L52
            android.content.Context r0 = r5.myContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r1 = r5.myContext
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "id"
            int r3 = r0.getIdentifier(r6, r2, r1)
        L52:
            return r3
    }

    public void addView(android.view.View r3) {
            r2 = this;
            if (r3 != r2) goto L3
            return
        L3:
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 != 0) goto L12
            return
        L12:
            r0 = 0
            r2.mReferenceIds = r0
            int r3 = r3.getId()
            r2.addRscID(r3)
            r2.requestLayout()
            return
    }

    protected void applyLayoutFeatures() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto Lf
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto Lf
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2.applyLayoutFeatures(r0)
        Lf:
            return
    }

    protected void applyLayoutFeatures(androidx.constraintlayout.widget.ConstraintLayout r6) {
            r5 = this;
            int r0 = r5.getVisibility()
            float r1 = r5.getElevation()
            r2 = 0
        L9:
            int r3 = r5.mCount
            if (r2 >= r3) goto L2a
            int[] r3 = r5.mIds
            r3 = r3[r2]
            android.view.View r3 = r6.getViewById(r3)
            if (r3 == 0) goto L27
            r3.setVisibility(r0)
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L27
            float r4 = r3.getTranslationZ()
            float r4 = r4 + r1
            r3.setTranslationZ(r4)
        L27:
            int r2 = r2 + 1
            goto L9
        L2a:
            return
    }

    public int[] getReferencedIds() {
            r2 = this;
            int[] r0 = r2.mIds
            int r1 = r2.mCount
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    protected android.view.View[] getViews(androidx.constraintlayout.widget.ConstraintLayout r4) {
            r3 = this;
            android.view.View[] r0 = r3.mViews
            if (r0 == 0) goto L9
            int r0 = r0.length
            int r1 = r3.mCount
            if (r0 == r1) goto Lf
        L9:
            int r0 = r3.mCount
            android.view.View[] r0 = new android.view.View[r0]
            r3.mViews = r0
        Lf:
            r0 = 0
        L10:
            int r1 = r3.mCount
            if (r0 >= r1) goto L23
            int[] r1 = r3.mIds
            r1 = r1[r0]
            android.view.View[] r2 = r3.mViews
            android.view.View r1 = r4.getViewById(r1)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L10
        L23:
            android.view.View[] r4 = r3.mViews
            return r4
    }

    protected void init(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L27
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L27
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_ids
            if (r2 != r3) goto L24
            java.lang.String r2 = r5.getString(r2)
            r4.mReferenceIds = r2
            r4.setIds(r2)
        L24:
            int r1 = r1 + 1
            goto L11
        L27:
            return
    }

    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r3, androidx.constraintlayout.solver.widgets.HelperWidget r4, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r5, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r6) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r3.layout
            int[] r0 = r5.mReferenceIds
            if (r0 == 0) goto La
            r2.setReferencedIds(r0)
            goto L1e
        La:
            java.lang.String r5 = r5.mReferenceIdString
            if (r5 == 0) goto L1e
            int r5 = r5.length()
            if (r5 <= 0) goto L1e
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r3.layout
            java.lang.String r0 = r5.mReferenceIdString
            int[] r0 = r2.convertReferenceString(r2, r0)
            r5.mReferenceIds = r0
        L1e:
            r4.removeAllIds()
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r3.layout
            int[] r5 = r5.mReferenceIds
            if (r5 == 0) goto L3f
            r5 = 0
        L28:
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r3.layout
            int[] r0 = r0.mReferenceIds
            int r1 = r0.length
            if (r5 >= r1) goto L3f
            r0 = r0[r5]
            java.lang.Object r0 = r6.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r0
            if (r0 == 0) goto L3c
            r4.add(r0)
        L3c:
            int r5 = r5 + 1
            goto L28
        L3f:
            return
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r1.mReferenceIds
            if (r0 == 0) goto La
            r1.setIds(r0)
        La:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.mUseViewMeasure
            if (r0 == 0) goto L8
            super.onMeasure(r2, r3)
            return
        L8:
            r2 = 0
            r1.setMeasuredDimension(r2, r2)
            return
    }

    public void removeView(android.view.View r5) {
            r4 = this;
            int r5 = r5.getId()
            r0 = -1
            if (r5 != r0) goto L8
            return
        L8:
            r0 = 0
            r4.mReferenceIds = r0
            r0 = 0
            r1 = 0
        Ld:
            int r2 = r4.mCount
            if (r1 >= r2) goto L35
            int[] r2 = r4.mIds
            r2 = r2[r1]
            if (r2 != r5) goto L32
        L17:
            int r5 = r4.mCount
            int r2 = r5 + (-1)
            if (r1 >= r2) goto L27
            int[] r5 = r4.mIds
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto L17
        L27:
            int[] r1 = r4.mIds
            int r2 = r5 + (-1)
            r1[r2] = r0
            int r5 = r5 + (-1)
            r4.mCount = r5
            goto L35
        L32:
            int r1 = r1 + 1
            goto Ld
        L35:
            r4.requestLayout()
            return
    }

    public void resolveRtl(androidx.constraintlayout.solver.widgets.ConstraintWidget r1, boolean r2) {
            r0 = this;
            return
    }

    protected void setIds(java.lang.String r4) {
            r3 = this;
            r3.mReferenceIds = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.mCount = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.addID(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.addID(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferencedIds(int[] r3) {
            r2 = this;
            r0 = 0
            r2.mReferenceIds = r0
            r0 = 0
            r2.mCount = r0
        L6:
            int r1 = r3.length
            if (r0 >= r1) goto L11
            r1 = r3[r0]
            r2.addRscID(r1)
            int r0 = r0 + 1
            goto L6
        L11:
            return
    }

    public void updatePostConstraints(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public void updatePostMeasure(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public void updatePreDraw(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public void updatePreLayout(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2, androidx.constraintlayout.solver.widgets.Helper r3, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4) {
            r1 = this;
            r3.removeAllIds()
            r2 = 0
        L4:
            int r0 = r1.mCount
            if (r2 >= r0) goto L18
            int[] r0 = r1.mIds
            r0 = r0[r2]
            java.lang.Object r0 = r4.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r0
            r3.add(r0)
            int r2 = r2 + 1
            goto L4
        L18:
            return
    }

    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout r6) {
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r5.mReferenceIds
            r5.setIds(r0)
        Lb:
            androidx.constraintlayout.solver.widgets.Helper r0 = r5.mHelperWidget
            if (r0 != 0) goto L10
            return
        L10:
            r0.removeAllIds()
            r0 = 0
        L14:
            int r1 = r5.mCount
            if (r0 >= r1) goto L53
            int[] r1 = r5.mIds
            r1 = r1[r0]
            android.view.View r2 = r6.getViewById(r1)
            if (r2 != 0) goto L45
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.mMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.findId(r6, r1)
            if (r3 == 0) goto L45
            int[] r2 = r5.mIds
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.mMap
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.getViewById(r3)
        L45:
            if (r2 == 0) goto L50
            androidx.constraintlayout.solver.widgets.Helper r1 = r5.mHelperWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r6.getViewWidget(r2)
            r1.add(r2)
        L50:
            int r0 = r0 + 1
            goto L14
        L53:
            androidx.constraintlayout.solver.widgets.Helper r0 = r5.mHelperWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r6.mLayoutWidget
            r0.updateConstraints(r6)
            return
    }

    public void validateParams() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.Helper r0 = r2.mHelperWidget
            if (r0 != 0) goto L5
            goto L15
        L5:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L15
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            androidx.constraintlayout.solver.widgets.Helper r1 = r2.mHelperWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r1
            r0.widget = r1
        L15:
            return
    }
}
