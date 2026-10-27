package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    int mCurrentConstraintNumber;
    int mCurrentStateId;
    androidx.constraintlayout.widget.ConstraintSet mDefaultConstraintSet;
    int mDefaultState;
    private android.util.SparseArray<androidx.constraintlayout.widget.StateSet.State> mStateList;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        java.util.ArrayList<androidx.constraintlayout.widget.StateSet.Variant> mVariants;

        public State(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mVariants = r0
                r0 = -1
                r5.mConstraintID = r0
                r0 = 0
                r5.mIsLayout = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r1 = androidx.constraintlayout.widget.R.styleable.State
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
                int r1 = r7.getIndexCount()
            L1e:
                if (r0 >= r1) goto L5e
                int r2 = r7.getIndex(r0)
                int r3 = androidx.constraintlayout.widget.R.styleable.State_android_id
                if (r2 != r3) goto L31
                int r3 = r5.mId
                int r2 = r7.getResourceId(r2, r3)
                r5.mId = r2
                goto L5b
            L31:
                int r3 = androidx.constraintlayout.widget.R.styleable.State_constraints
                if (r2 != r3) goto L5b
                int r3 = r5.mConstraintID
                int r2 = r7.getResourceId(r2, r3)
                r5.mConstraintID = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.mConstraintID
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.mConstraintID
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L5b
                r2 = 1
                r5.mIsLayout = r2
            L5b:
                int r0 = r0 + 1
                goto L1e
            L5e:
                r7.recycle()
                return
        }

        void add(androidx.constraintlayout.widget.StateSet.Variant r2) {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r0 = r1.mVariants
                r0.add(r2)
                return
        }

        public int findMatch(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r2.mVariants
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r2.mVariants
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.StateSet$Variant r1 = (androidx.constraintlayout.widget.StateSet.Variant) r1
                boolean r1 = r1.match(r3, r4)
                if (r1 == 0) goto L18
                return r0
            L18:
                int r0 = r0 + 1
                goto L1
            L1b:
                r3 = -1
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r5.mMinWidth = r0
                r5.mMinHeight = r0
                r5.mMaxWidth = r0
                r5.mMaxHeight = r0
                r0 = -1
                r5.mConstraintID = r0
                r0 = 0
                r5.mIsLayout = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r1 = androidx.constraintlayout.widget.R.styleable.Variant
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
                int r1 = r7.getIndexCount()
            L21:
                if (r0 >= r1) goto L88
                int r2 = r7.getIndex(r0)
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_constraints
                if (r2 != r3) goto L52
                int r3 = r5.mConstraintID
                int r2 = r7.getResourceId(r2, r3)
                r5.mConstraintID = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.mConstraintID
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.mConstraintID
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L85
                r2 = 1
                r5.mIsLayout = r2
                goto L85
            L52:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan
                if (r2 != r3) goto L5f
                float r3 = r5.mMaxHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxHeight = r2
                goto L85
            L5f:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan
                if (r2 != r3) goto L6c
                float r3 = r5.mMinHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMinHeight = r2
                goto L85
            L6c:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan
                if (r2 != r3) goto L79
                float r3 = r5.mMaxWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxWidth = r2
                goto L85
            L79:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan
                if (r2 != r3) goto L85
                float r3 = r5.mMinWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMinWidth = r2
            L85:
                int r0 = r0 + 1
                goto L21
            L88:
                r7.recycle()
                return
        }

        boolean match(float r3, float r4) {
                r2 = this;
                float r0 = r2.mMinWidth
                boolean r0 = java.lang.Float.isNaN(r0)
                r1 = 0
                if (r0 != 0) goto L10
                float r0 = r2.mMinWidth
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 >= 0) goto L10
                return r1
            L10:
                float r0 = r2.mMinHeight
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L1f
                float r0 = r2.mMinHeight
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L1f
                return r1
            L1f:
                float r0 = r2.mMaxWidth
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L2e
                float r0 = r2.mMaxWidth
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                return r1
            L2e:
                float r3 = r2.mMaxHeight
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 != 0) goto L3d
                float r3 = r2.mMaxHeight
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3d
                return r1
            L3d:
                r3 = 1
                return r3
        }
    }

    public StateSet(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mDefaultState = r0
            r1.mCurrentStateId = r0
            r1.mCurrentConstraintNumber = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mStateList = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mConstraintSetMap = r0
            r0 = 0
            r1.mConstraintsChangedListener = r0
            r1.load(r2, r3)
            return
    }

    private void load(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
            r5 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
            int[] r1 = androidx.constraintlayout.widget.R.styleable.StateSet
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L24
            int r3 = r0.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.StateSet_defaultState
            if (r3 != r4) goto L21
            int r4 = r5.mDefaultState
            int r3 = r0.getResourceId(r3, r4)
            r5.mDefaultState = r3
        L21:
            int r2 = r2 + 1
            goto Lf
        L24:
            int r0 = r7.getEventType()     // Catch: java.lang.Throwable -> L8a
            r1 = 0
        L29:
            r2 = 1
            if (r0 == r2) goto L8a
            if (r0 == 0) goto L82
            r2 = 2
            java.lang.String r3 = "StateSet"
            if (r0 == r2) goto L42
            r2 = 3
            if (r0 == r2) goto L37
            goto L85
        L37:
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            if (r0 == 0) goto L85
            goto L8a
        L42:
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            switch(r2) {
                case 80204913: goto L6d;
                case 1301459538: goto L66;
                case 1382829617: goto L61;
                case 1901439077: goto L4e;
                default: goto L4d;
            }     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
        L4d:
            goto L85
        L4e:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            if (r0 == 0) goto L85
            androidx.constraintlayout.widget.StateSet$Variant r0 = new androidx.constraintlayout.widget.StateSet$Variant     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            if (r1 == 0) goto L85
            r1.add(r0)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            goto L85
        L61:
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            goto L85
        L66:
            java.lang.String r2 = "LayoutDescription"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            goto L85
        L6d:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            if (r0 == 0) goto L85
            androidx.constraintlayout.widget.StateSet$State r1 = new androidx.constraintlayout.widget.StateSet$State     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r0 = r5.mStateList     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            int r2 = r1.mId     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            goto L85
        L82:
            r7.getName()     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
        L85:
            int r0 = r7.next()     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            goto L29
        L8a:
            return
    }

    public int convertToConstraintSet(int r5, int r6, float r7, float r8) {
            r4 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r0 = r4.mStateList
            java.lang.Object r0 = r0.get(r6)
            androidx.constraintlayout.widget.StateSet$State r0 = (androidx.constraintlayout.widget.StateSet.State) r0
            if (r0 != 0) goto Lb
            return r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 == 0) goto L3e
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L16
            goto L3e
        L16:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r6 = r0.mVariants
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L1d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r6.next()
            androidx.constraintlayout.widget.StateSet$Variant r2 = (androidx.constraintlayout.widget.StateSet.Variant) r2
            boolean r3 = r2.match(r7, r8)
            if (r3 == 0) goto L1d
            int r1 = r2.mConstraintID
            if (r5 != r1) goto L34
            goto L59
        L34:
            r1 = r2
            goto L1d
        L36:
            if (r1 == 0) goto L3b
            int r5 = r1.mConstraintID
            return r5
        L3b:
            int r5 = r0.mConstraintID
            return r5
        L3e:
            int r6 = r0.mConstraintID
            if (r6 != r5) goto L43
            goto L59
        L43:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r6 = r0.mVariants
            java.util.Iterator r6 = r6.iterator()
        L49:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.widget.StateSet$Variant r7 = (androidx.constraintlayout.widget.StateSet.Variant) r7
            int r7 = r7.mConstraintID
            if (r5 != r7) goto L49
        L59:
            return r5
        L5a:
            int r5 = r0.mConstraintID
            return r5
    }

    public boolean needsToChange(int r5, float r6, float r7) {
            r4 = this;
            int r0 = r4.mCurrentStateId
            r1 = 1
            if (r0 == r5) goto L6
            return r1
        L6:
            r2 = -1
            r3 = 0
            if (r5 != r2) goto L13
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.valueAt(r3)
        L10:
            androidx.constraintlayout.widget.StateSet$State r5 = (androidx.constraintlayout.widget.StateSet.State) r5
            goto L1a
        L13:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.get(r0)
            goto L10
        L1a:
            int r0 = r4.mCurrentConstraintNumber
            if (r0 == r2) goto L2d
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r2 = r5.mVariants
            java.lang.Object r0 = r2.get(r0)
            androidx.constraintlayout.widget.StateSet$Variant r0 = (androidx.constraintlayout.widget.StateSet.Variant) r0
            boolean r0 = r0.match(r6, r7)
            if (r0 == 0) goto L2d
            return r3
        L2d:
            int r0 = r4.mCurrentConstraintNumber
            int r5 = r5.findMatch(r6, r7)
            if (r0 != r5) goto L36
            return r3
        L36:
            return r1
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener r1) {
            r0 = this;
            r0.mConstraintsChangedListener = r1
            return
    }

    public int stateGetConstraintID(int r2, int r3, int r4) {
            r1 = this;
            float r3 = (float) r3
            float r4 = (float) r4
            r0 = -1
            int r2 = r1.updateConstraints(r0, r2, r3, r4)
            return r2
    }

    public int updateConstraints(int r3, int r4, float r5, float r6) {
            r2 = this;
            r0 = -1
            if (r3 != r4) goto L46
            if (r4 != r0) goto Lf
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r4 = r2.mStateList
            r1 = 0
            java.lang.Object r4 = r4.valueAt(r1)
            androidx.constraintlayout.widget.StateSet$State r4 = (androidx.constraintlayout.widget.StateSet.State) r4
            goto L19
        Lf:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r4 = r2.mStateList
            int r1 = r2.mCurrentStateId
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.widget.StateSet$State r4 = (androidx.constraintlayout.widget.StateSet.State) r4
        L19:
            if (r4 != 0) goto L1c
            return r0
        L1c:
            int r1 = r2.mCurrentConstraintNumber
            if (r1 == r0) goto L2f
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r4.mVariants
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.widget.StateSet$Variant r1 = (androidx.constraintlayout.widget.StateSet.Variant) r1
            boolean r1 = r1.match(r5, r6)
            if (r1 == 0) goto L2f
            goto L35
        L2f:
            int r5 = r4.findMatch(r5, r6)
            if (r3 != r5) goto L36
        L35:
            return r3
        L36:
            if (r5 != r0) goto L3b
            int r3 = r4.mConstraintID
            return r3
        L3b:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r3 = r4.mVariants
            java.lang.Object r3 = r3.get(r5)
            androidx.constraintlayout.widget.StateSet$Variant r3 = (androidx.constraintlayout.widget.StateSet.Variant) r3
            int r3 = r3.mConstraintID
            return r3
        L46:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r3 = r2.mStateList
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.StateSet$State r3 = (androidx.constraintlayout.widget.StateSet.State) r3
            if (r3 != 0) goto L51
            return r0
        L51:
            int r4 = r3.findMatch(r5, r6)
            if (r4 != r0) goto L5a
            int r3 = r3.mConstraintID
            return r3
        L5a:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r3 = r3.mVariants
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.StateSet$Variant r3 = (androidx.constraintlayout.widget.StateSet.Variant) r3
            int r3 = r3.mConstraintID
            return r3
    }
}
