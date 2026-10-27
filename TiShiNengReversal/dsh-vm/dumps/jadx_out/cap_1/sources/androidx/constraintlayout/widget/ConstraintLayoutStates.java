package androidx.constraintlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    private final androidx.constraintlayout.widget.ConstraintLayout mConstraintLayout;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    int mCurrentConstraintNumber;
    int mCurrentStateId;
    androidx.constraintlayout.widget.ConstraintSet mDefaultConstraintSet;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates.State> mStateList;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class State {
        int mConstraintID;
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
        java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates.Variant> mVariants;

        public State(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mVariants = r0
                r0 = -1
                r5.mConstraintID = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.R.styleable.State
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L65
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.R.styleable.State_android_id
                if (r2 != r3) goto L2f
                int r3 = r5.mId
                int r2 = r7.getResourceId(r2, r3)
                r5.mId = r2
                goto L62
            L2f:
                int r3 = androidx.constraintlayout.widget.R.styleable.State_constraints
                if (r2 != r3) goto L62
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
                if (r2 == 0) goto L62
                androidx.constraintlayout.widget.ConstraintSet r2 = new androidx.constraintlayout.widget.ConstraintSet
                r2.<init>()
                r5.mConstraintSet = r2
                int r3 = r5.mConstraintID
                r2.clone(r6, r3)
            L62:
                int r1 = r1 + 1
                goto L1c
            L65:
                r7.recycle()
                return
        }

        void add(androidx.constraintlayout.widget.ConstraintLayoutStates.Variant r2) {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r0 = r1.mVariants
                r0.add(r2)
                return
        }

        public int findMatch(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r1 = r2.mVariants
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r1 = r2.mVariants
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r1 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r1
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
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
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
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Variant
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L8f
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_constraints
                if (r2 != r3) goto L59
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
                if (r2 == 0) goto L8c
                androidx.constraintlayout.widget.ConstraintSet r2 = new androidx.constraintlayout.widget.ConstraintSet
                r2.<init>()
                r5.mConstraintSet = r2
                int r3 = r5.mConstraintID
                r2.clone(r6, r3)
                goto L8c
            L59:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan
                if (r2 != r3) goto L66
                float r3 = r5.mMaxHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxHeight = r2
                goto L8c
            L66:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan
                if (r2 != r3) goto L73
                float r3 = r5.mMinHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMinHeight = r2
                goto L8c
            L73:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan
                if (r2 != r3) goto L80
                float r3 = r5.mMaxWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxWidth = r2
                goto L8c
            L80:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan
                if (r2 != r3) goto L8c
                float r3 = r5.mMinWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMinWidth = r2
            L8c:
                int r1 = r1 + 1
                goto L1f
            L8f:
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

    ConstraintLayoutStates(android.content.Context r2, androidx.constraintlayout.widget.ConstraintLayout r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
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
            r1.mConstraintLayout = r3
            r1.load(r2, r4)
            return
    }

    private void load(android.content.Context r4, int r5) {
            r3 = this;
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)
            int r0 = r5.getEventType()     // Catch: java.lang.Throwable -> L68
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L68
            if (r0 == 0) goto L60
            r2 = 2
            if (r0 == r2) goto L16
            goto L63
        L16:
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L68
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L68
            switch(r2) {
                case -1349929691: goto L54;
                case 80204913: goto L3f;
                case 1382829617: goto L3c;
                case 1657696882: goto L35;
                case 1901439077: goto L22;
                default: goto L21;
            }     // Catch: java.lang.Throwable -> L68
        L21:
            goto L63
        L22:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L63
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = new androidx.constraintlayout.widget.ConstraintLayoutStates$Variant     // Catch: java.lang.Throwable -> L68
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L63
            r1.add(r0)     // Catch: java.lang.Throwable -> L68
            goto L63
        L35:
            java.lang.String r2 = "layoutDescription"
        L37:
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L68
            goto L63
        L3c:
            java.lang.String r2 = "StateSet"
            goto L37
        L3f:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L63
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r1 = new androidx.constraintlayout.widget.ConstraintLayoutStates$State     // Catch: java.lang.Throwable -> L68
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L68
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r0 = r3.mStateList     // Catch: java.lang.Throwable -> L68
            int r2 = r1.mId     // Catch: java.lang.Throwable -> L68
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L68
            goto L63
        L54:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L63
            r3.parseConstraintSet(r4, r5)     // Catch: java.lang.Throwable -> L68
            goto L63
        L60:
            r5.getName()     // Catch: java.lang.Throwable -> L68
        L63:
            int r0 = r5.next()     // Catch: java.lang.Throwable -> L68
            goto Ld
        L68:
            return
    }

    private void parseConstraintSet(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            int r1 = r10.getAttributeCount()
            r2 = 0
        La:
            if (r2 >= r1) goto L5b
            java.lang.String r3 = r10.getAttributeName(r2)
            java.lang.String r4 = "id"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L58
            java.lang.String r1 = r10.getAttributeValue(r2)
            java.lang.String r2 = "/"
            boolean r2 = r1.contains(r2)
            r3 = -1
            r5 = 1
            if (r2 == 0) goto L3e
            r2 = 47
            int r2 = r1.indexOf(r2)
            int r2 = r2 + r5
            java.lang.String r2 = r1.substring(r2)
            android.content.res.Resources r6 = r9.getResources()
            java.lang.String r7 = r9.getPackageName()
            int r2 = r6.getIdentifier(r2, r4, r7)
            goto L3f
        L3e:
            r2 = -1
        L3f:
            if (r2 != r3) goto L4f
            int r3 = r1.length()
            if (r3 <= r5) goto L4f
            java.lang.String r1 = r1.substring(r5)
            int r2 = java.lang.Integer.parseInt(r1)
        L4f:
            r0.load(r9, r10)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r9 = r8.mConstraintSetMap
            r9.put(r2, r0)
            return
        L58:
            int r2 = r2 + 1
            goto La
        L5b:
            return
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
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.valueAt(r3)
        L10:
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r5 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r5
            goto L1a
        L13:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.get(r0)
            goto L10
        L1a:
            int r0 = r4.mCurrentConstraintNumber
            if (r0 == r2) goto L2d
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r2 = r5.mVariants
            java.lang.Object r0 = r2.get(r0)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r0
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

    public void updateConstraints(int r4, float r5, float r6) {
            r3 = this;
            int r0 = r3.mCurrentStateId
            r1 = -1
            if (r0 != r4) goto L6e
            if (r4 != r1) goto L11
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r4 = r3.mStateList
            r0 = 0
            java.lang.Object r4 = r4.valueAt(r0)
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r4 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r4
            goto L19
        L11:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r4 = r3.mStateList
            java.lang.Object r4 = r4.get(r0)
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r4 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r4
        L19:
            int r0 = r3.mCurrentConstraintNumber
            if (r0 == r1) goto L2d
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r2 = r4.mVariants
            java.lang.Object r0 = r2.get(r0)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r0
            boolean r0 = r0.match(r5, r6)
            if (r0 == 0) goto L2d
            goto Lb2
        L2d:
            int r5 = r4.findMatch(r5, r6)
            int r6 = r3.mCurrentConstraintNumber
            if (r6 != r5) goto L37
            goto Lb2
        L37:
            if (r5 != r1) goto L3c
            androidx.constraintlayout.widget.ConstraintSet r6 = r3.mDefaultConstraintSet
            goto L46
        L3c:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r6 = r4.mVariants
            java.lang.Object r6 = r6.get(r5)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r6 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r6
            androidx.constraintlayout.widget.ConstraintSet r6 = r6.mConstraintSet
        L46:
            if (r5 != r1) goto L4b
            int r4 = r4.mConstraintID
            goto L55
        L4b:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r4 = r4.mVariants
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r4 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r4
            int r4 = r4.mConstraintID
        L55:
            if (r6 != 0) goto L58
            goto Lb2
        L58:
            r3.mCurrentConstraintNumber = r5
            androidx.constraintlayout.widget.ConstraintsChangedListener r5 = r3.mConstraintsChangedListener
            if (r5 == 0) goto L61
            r5.preLayoutChange(r1, r4)
        L61:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r3.mConstraintLayout
            r6.applyTo(r5)
            androidx.constraintlayout.widget.ConstraintsChangedListener r5 = r3.mConstraintsChangedListener
            if (r5 == 0) goto Lb2
            r5.postLayoutChange(r1, r4)
            return
        L6e:
            r3.mCurrentStateId = r4
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r0 = r3.mStateList
            java.lang.Object r0 = r0.get(r4)
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.State) r0
            int r5 = r0.findMatch(r5, r6)
            if (r5 != r1) goto L81
            androidx.constraintlayout.widget.ConstraintSet r6 = r0.mConstraintSet
            goto L8b
        L81:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r6 = r0.mVariants
            java.lang.Object r6 = r6.get(r5)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r6 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r6
            androidx.constraintlayout.widget.ConstraintSet r6 = r6.mConstraintSet
        L8b:
            if (r5 != r1) goto L90
            int r0 = r0.mConstraintID
            goto L9a
        L90:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates$Variant> r0 = r0.mVariants
            java.lang.Object r0 = r0.get(r5)
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r0 = (androidx.constraintlayout.widget.ConstraintLayoutStates.Variant) r0
            int r0 = r0.mConstraintID
        L9a:
            if (r6 != 0) goto L9d
            return
        L9d:
            r3.mCurrentConstraintNumber = r5
            androidx.constraintlayout.widget.ConstraintsChangedListener r5 = r3.mConstraintsChangedListener
            if (r5 == 0) goto La6
            r5.preLayoutChange(r4, r0)
        La6:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r3.mConstraintLayout
            r6.applyTo(r5)
            androidx.constraintlayout.widget.ConstraintsChangedListener r5 = r3.mConstraintsChangedListener
            if (r5 == 0) goto Lb2
            r5.postLayoutChange(r4, r0)
        Lb2:
            return
    }
}
