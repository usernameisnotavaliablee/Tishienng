package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class KeyTrigger extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 5;
    static final java.lang.String NAME = "KeyTrigger";
    private static final java.lang.String TAG = "KeyTrigger";
    android.graphics.RectF mCollisionRect;
    private java.lang.String mCross;
    private int mCurveFit;
    private java.lang.reflect.Method mFireCross;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private java.lang.reflect.Method mFireNegativeCross;
    private boolean mFireNegativeReset;
    private java.lang.reflect.Method mFirePositiveCross;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    private java.lang.String mNegativeCross;
    private java.lang.String mPositiveCross;
    private boolean mPostLayout;
    android.graphics.RectF mTargetRect;
    private int mTriggerCollisionId;
    private android.view.View mTriggerCollisionView;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_framePosition
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_onCross
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_onNegativeCross
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_onPositiveCross
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_motionTarget
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerId
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerSlack
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_triggerOnCollision
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_postLayoutCollision
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerReceiver
                r2 = 11
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTrigger r4, android.content.res.TypedArray r5, android.content.Context r6) {
                int r6 = r5.getIndexCount()
                r0 = 0
            L5:
                if (r0 >= r6) goto Lb6
                int r1 = r5.getIndex(r0)
                android.util.SparseIntArray r2 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                int r2 = r2.get(r1)
                switch(r2) {
                    case 1: goto Lab;
                    case 2: goto La3;
                    case 3: goto L14;
                    case 4: goto L9b;
                    case 5: goto L92;
                    case 6: goto L86;
                    case 7: goto L57;
                    case 8: goto L44;
                    case 9: goto L37;
                    case 10: goto L2a;
                    case 11: goto L15;
                    default: goto L14;
                }
            L14:
                goto L20
            L15:
                int r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$700(r4)
                int r2 = r5.getResourceId(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$702(r4, r2)
            L20:
                java.lang.Integer.toHexString(r1)
                android.util.SparseIntArray r2 = androidx.constraintlayout.motion.widget.KeyTrigger.Loader.mAttrMap
                r2.get(r1)
                goto Lb2
            L2a:
                boolean r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$600(r4)
                boolean r1 = r5.getBoolean(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$602(r4, r1)
                goto Lb2
            L37:
                int r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$500(r4)
                int r1 = r5.getResourceId(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$502(r4, r1)
                goto Lb2
            L44:
                int r2 = r4.mFramePosition
                int r1 = r5.getInteger(r1, r2)
                r4.mFramePosition = r1
                float r1 = (float) r1
                r2 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 + r2
                r2 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 / r2
                androidx.constraintlayout.motion.widget.KeyTrigger.access$002(r4, r1)
                goto Lb2
            L57:
                boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r2 == 0) goto L6d
                int r2 = r4.mTargetId
                int r2 = r5.getResourceId(r1, r2)
                r4.mTargetId = r2
                r3 = -1
                if (r2 != r3) goto Lb2
                java.lang.String r1 = r5.getString(r1)
                r4.mTargetString = r1
                goto Lb2
            L6d:
                android.util.TypedValue r2 = r5.peekValue(r1)
                int r2 = r2.type
                r3 = 3
                if (r2 != r3) goto L7d
                java.lang.String r1 = r5.getString(r1)
                r4.mTargetString = r1
                goto Lb2
            L7d:
                int r2 = r4.mTargetId
                int r1 = r5.getResourceId(r1, r2)
                r4.mTargetId = r1
                goto Lb2
            L86:
                int r2 = androidx.constraintlayout.motion.widget.KeyTrigger.access$400(r4)
                int r1 = r5.getResourceId(r1, r2)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$402(r4, r1)
                goto Lb2
            L92:
                float r2 = r4.mTriggerSlack
                float r1 = r5.getFloat(r1, r2)
                r4.mTriggerSlack = r1
                goto Lb2
            L9b:
                java.lang.String r1 = r5.getString(r1)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$302(r4, r1)
                goto Lb2
            La3:
                java.lang.String r1 = r5.getString(r1)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$202(r4, r1)
                goto Lb2
            Lab:
                java.lang.String r1 = r5.getString(r1)
                androidx.constraintlayout.motion.widget.KeyTrigger.access$102(r4, r1)
            Lb2:
                int r0 = r0 + 1
                goto L5
            Lb6:
                return
        }
    }

    public KeyTrigger() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mCurveFit = r0
            r0 = 0
            r2.mCross = r0
            int r1 = androidx.constraintlayout.motion.widget.Key.UNSET
            r2.mTriggerReceiver = r1
            r2.mNegativeCross = r0
            r2.mPositiveCross = r0
            r2.mTriggerID = r1
            r2.mTriggerCollisionId = r1
            r2.mTriggerCollisionView = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.mTriggerSlack = r0
            r0 = 1
            r2.mFireCrossReset = r0
            r2.mFireNegativeReset = r0
            r2.mFirePositiveReset = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mFireThreshold = r0
            r0 = 0
            r2.mPostLayout = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.mCollisionRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.mTargetRect = r0
            r0 = 5
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyTrigger r0, float r1) {
            r0.mFireThreshold = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$102(androidx.constraintlayout.motion.widget.KeyTrigger r0, java.lang.String r1) {
            r0.mNegativeCross = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$202(androidx.constraintlayout.motion.widget.KeyTrigger r0, java.lang.String r1) {
            r0.mPositiveCross = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$302(androidx.constraintlayout.motion.widget.KeyTrigger r0, java.lang.String r1) {
            r0.mCross = r1
            return r1
    }

    static /* synthetic */ int access$400(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            int r0 = r0.mTriggerID
            return r0
    }

    static /* synthetic */ int access$402(androidx.constraintlayout.motion.widget.KeyTrigger r0, int r1) {
            r0.mTriggerID = r1
            return r1
    }

    static /* synthetic */ int access$500(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            int r0 = r0.mTriggerCollisionId
            return r0
    }

    static /* synthetic */ int access$502(androidx.constraintlayout.motion.widget.KeyTrigger r0, int r1) {
            r0.mTriggerCollisionId = r1
            return r1
    }

    static /* synthetic */ boolean access$600(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            boolean r0 = r0.mPostLayout
            return r0
    }

    static /* synthetic */ boolean access$602(androidx.constraintlayout.motion.widget.KeyTrigger r0, boolean r1) {
            r0.mPostLayout = r1
            return r1
    }

    static /* synthetic */ int access$700(androidx.constraintlayout.motion.widget.KeyTrigger r0) {
            int r0 = r0.mTriggerReceiver
            return r0
    }

    static /* synthetic */ int access$702(androidx.constraintlayout.motion.widget.KeyTrigger r0, int r1) {
            r0.mTriggerReceiver = r1
            return r1
    }

    private void setUpRect(android.graphics.RectF r2, android.view.View r3, boolean r4) {
            r1 = this;
            int r0 = r3.getTop()
            float r0 = (float) r0
            r2.top = r0
            int r0 = r3.getBottom()
            float r0 = (float) r0
            r2.bottom = r0
            int r0 = r3.getLeft()
            float r0 = (float) r0
            r2.left = r0
            int r0 = r3.getRight()
            float r0 = (float) r0
            r2.right = r0
            if (r4 == 0) goto L25
            android.graphics.Matrix r3 = r3.getMatrix()
            r3.mapRect(r2)
        L25:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r1) {
            r0 = this;
            return
    }

    public void conditionallyFire(float r9, android.view.View r10) {
            r8 = this;
            int r0 = r8.mTriggerCollisionId
            int r1 = androidx.constraintlayout.motion.widget.Key.UNSET
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L61
            android.view.View r0 = r8.mTriggerCollisionView
            if (r0 != 0) goto L1a
            android.view.ViewParent r0 = r10.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r8.mTriggerCollisionId
            android.view.View r0 = r0.findViewById(r1)
            r8.mTriggerCollisionView = r0
        L1a:
            android.graphics.RectF r0 = r8.mCollisionRect
            android.view.View r1 = r8.mTriggerCollisionView
            boolean r4 = r8.mPostLayout
            r8.setUpRect(r0, r1, r4)
            android.graphics.RectF r0 = r8.mTargetRect
            boolean r1 = r8.mPostLayout
            r8.setUpRect(r0, r10, r1)
            android.graphics.RectF r0 = r8.mCollisionRect
            android.graphics.RectF r1 = r8.mTargetRect
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L4a
            boolean r0 = r8.mFireCrossReset
            if (r0 == 0) goto L3c
            r8.mFireCrossReset = r3
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            boolean r1 = r8.mFirePositiveReset
            if (r1 == 0) goto L45
            r8.mFirePositiveReset = r3
            r1 = 1
            goto L46
        L45:
            r1 = 0
        L46:
            r8.mFireNegativeReset = r2
            goto Le0
        L4a:
            boolean r0 = r8.mFireCrossReset
            if (r0 != 0) goto L52
            r8.mFireCrossReset = r2
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            boolean r1 = r8.mFireNegativeReset
            if (r1 == 0) goto L5b
            r8.mFireNegativeReset = r3
            r1 = 1
            goto L5c
        L5b:
            r1 = 0
        L5c:
            r8.mFirePositiveReset = r2
            r3 = r1
            goto Ldf
        L61:
            boolean r0 = r8.mFireCrossReset
            r1 = 0
            if (r0 == 0) goto L77
            float r0 = r8.mFireThreshold
            float r4 = r9 - r0
            float r5 = r8.mFireLastPos
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L87
            r8.mFireCrossReset = r3
            r0 = 1
            goto L88
        L77:
            float r0 = r8.mFireThreshold
            float r0 = r9 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r8.mTriggerSlack
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L87
            r8.mFireCrossReset = r2
        L87:
            r0 = 0
        L88:
            boolean r4 = r8.mFireNegativeReset
            if (r4 == 0) goto La1
            float r4 = r8.mFireThreshold
            float r5 = r9 - r4
            float r6 = r8.mFireLastPos
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lb1
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lb1
            r8.mFireNegativeReset = r3
            r4 = 1
            goto Lb2
        La1:
            float r4 = r8.mFireThreshold
            float r4 = r9 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r8.mTriggerSlack
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb1
            r8.mFireNegativeReset = r2
        Lb1:
            r4 = 0
        Lb2:
            boolean r5 = r8.mFirePositiveReset
            if (r5 == 0) goto Lce
            float r5 = r8.mFireThreshold
            float r6 = r9 - r5
            float r7 = r8.mFireLastPos
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto Lca
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lca
            r8.mFirePositiveReset = r3
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            r1 = r2
            r3 = r4
            goto Le0
        Lce:
            float r1 = r8.mFireThreshold
            float r1 = r9 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r8.mTriggerSlack
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lde
            r8.mFirePositiveReset = r2
        Lde:
            r3 = r4
        Ldf:
            r1 = 0
        Le0:
            r8.mFireLastPos = r9
            if (r3 != 0) goto Le8
            if (r0 != 0) goto Le8
            if (r1 == 0) goto Lf3
        Le8:
            android.view.ViewParent r2 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = (androidx.constraintlayout.motion.widget.MotionLayout) r2
            int r4 = r8.mTriggerID
            r2.fireTrigger(r4, r1, r9)
        Lf3:
            int r9 = r8.mTriggerReceiver
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r9 != r2) goto Lfa
            goto L106
        Lfa:
            android.view.ViewParent r9 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = (androidx.constraintlayout.motion.widget.MotionLayout) r9
            int r10 = r8.mTriggerReceiver
            android.view.View r10 = r9.findViewById(r10)
        L106:
            r9 = 0
            if (r3 == 0) goto L130
            java.lang.String r2 = r8.mNegativeCross
            if (r2 == 0) goto L130
            java.lang.reflect.Method r2 = r8.mFireNegativeCross
            if (r2 != 0) goto L124
            java.lang.Class r2 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L11e
            java.lang.String r3 = r8.mNegativeCross     // Catch: java.lang.NoSuchMethodException -> L11e
            java.lang.reflect.Method r2 = r2.getMethod(r3, r9)     // Catch: java.lang.NoSuchMethodException -> L11e
            r8.mFireNegativeCross = r2     // Catch: java.lang.NoSuchMethodException -> L11e
            goto L124
        L11e:
            r10.getClass()
            androidx.constraintlayout.motion.widget.Debug.getName(r10)
        L124:
            java.lang.reflect.Method r2 = r8.mFireNegativeCross     // Catch: java.lang.Exception -> L12a
            r2.invoke(r10, r9)     // Catch: java.lang.Exception -> L12a
            goto L130
        L12a:
            r10.getClass()
            androidx.constraintlayout.motion.widget.Debug.getName(r10)
        L130:
            if (r1 == 0) goto L159
            java.lang.String r1 = r8.mPositiveCross
            if (r1 == 0) goto L159
            java.lang.reflect.Method r1 = r8.mFirePositiveCross
            if (r1 != 0) goto L14d
            java.lang.Class r1 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L147
            java.lang.String r2 = r8.mPositiveCross     // Catch: java.lang.NoSuchMethodException -> L147
            java.lang.reflect.Method r1 = r1.getMethod(r2, r9)     // Catch: java.lang.NoSuchMethodException -> L147
            r8.mFirePositiveCross = r1     // Catch: java.lang.NoSuchMethodException -> L147
            goto L14d
        L147:
            r10.getClass()
            androidx.constraintlayout.motion.widget.Debug.getName(r10)
        L14d:
            java.lang.reflect.Method r1 = r8.mFirePositiveCross     // Catch: java.lang.Exception -> L153
            r1.invoke(r10, r9)     // Catch: java.lang.Exception -> L153
            goto L159
        L153:
            r10.getClass()
            androidx.constraintlayout.motion.widget.Debug.getName(r10)
        L159:
            if (r0 == 0) goto L182
            java.lang.String r0 = r8.mCross
            if (r0 == 0) goto L182
            java.lang.reflect.Method r0 = r8.mFireCross
            if (r0 != 0) goto L176
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L170
            java.lang.String r1 = r8.mCross     // Catch: java.lang.NoSuchMethodException -> L170
            java.lang.reflect.Method r0 = r0.getMethod(r1, r9)     // Catch: java.lang.NoSuchMethodException -> L170
            r8.mFireCross = r0     // Catch: java.lang.NoSuchMethodException -> L170
            goto L176
        L170:
            r10.getClass()
            androidx.constraintlayout.motion.widget.Debug.getName(r10)
        L176:
            java.lang.reflect.Method r0 = r8.mFireCross     // Catch: java.lang.Exception -> L17c
            r0.invoke(r10, r9)     // Catch: java.lang.Exception -> L17c
            goto L182
        L17c:
            r10.getClass()
            androidx.constraintlayout.motion.widget.Debug.getName(r10)
        L182:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    int getCurveFit() {
            r1 = this;
            int r0 = r1.mCurveFit
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyTrigger
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyTrigger.Loader.read(r1, r3, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            return
    }
}
