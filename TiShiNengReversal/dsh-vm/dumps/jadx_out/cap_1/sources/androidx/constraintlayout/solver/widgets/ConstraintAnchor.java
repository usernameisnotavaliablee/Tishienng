package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    private static final int UNSET_GONE_MARGIN = -1;
    private java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> mDependents;
    int mGoneMargin;
    public int mMargin;
    public final androidx.constraintlayout.solver.widgets.ConstraintWidget mOwner;
    androidx.constraintlayout.solver.SolverVariable mSolverVariable;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mTarget;
    public final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type mType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = null;

        static {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type> {
        private static final /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type[] $VALUES = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type BASELINE = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type BOTTOM = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type CENTER = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type CENTER_X = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type CENTER_Y = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type LEFT = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type NONE = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type RIGHT = null;
        public static final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type TOP = null;

        static {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r3 = "LEFT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT = r1
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r5 = "TOP"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP = r3
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r7 = "RIGHT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT = r5
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r9 = "BOTTOM"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM = r7
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r11 = "BASELINE"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE = r9
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r13 = "CENTER"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER = r11
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r13 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                java.lang.String r15 = "CENTER_X"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X = r13
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r15 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type
                r17 = 7
                java.lang.String r2 = "CENTER_Y"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y = r15
                r2 = 9
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r2 = new androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type[r2]
                r2[r16] = r0
                r2[r18] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                r2[r4] = r15
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.$VALUES = r2
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type> r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r1
                return r1
        }

        public static androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type[] values() {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type[]) r0
                return r0
        }
    }

    public ConstraintAnchor(androidx.constraintlayout.solver.widgets.ConstraintWidget r2, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDependents = r0
            r0 = 0
            r1.mMargin = r0
            r0 = -1
            r1.mGoneMargin = r0
            r1.mOwner = r2
            r1.mType = r3
            return
    }

    private boolean isConnectionToMe(androidx.constraintlayout.solver.widgets.ConstraintWidget r7, java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8) {
            r6 = this;
            boolean r0 = r8.contains(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r8.add(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.getOwner()
            r2 = 1
            if (r7 != r0) goto L13
            return r2
        L13:
            java.util.ArrayList r7 = r7.getAnchors()
            int r0 = r7.size()
            r3 = 0
        L1c:
            if (r3 >= r0) goto L42
            java.lang.Object r4 = r7.get(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r4
            boolean r5 = r4.isSimilarDimensionConnection(r6)
            if (r5 == 0) goto L3f
            boolean r5 = r4.isConnected()
            if (r5 == 0) goto L3f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.getTarget()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.getOwner()
            boolean r4 = r6.isConnectionToMe(r4, r8)
            if (r4 == 0) goto L3f
            return r2
        L3f:
            int r3 = r3 + 1
            goto L1c
        L42:
            return r1
    }

    public boolean connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor r3, int r4) {
            r2 = this;
            r0 = -1
            r1 = 0
            boolean r3 = r2.connect(r3, r4, r0, r1)
            return r3
    }

    public boolean connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor r3, int r4, int r5, boolean r6) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L7
            r2.reset()
            return r0
        L7:
            r1 = 0
            if (r6 != 0) goto L11
            boolean r6 = r2.isValidConnection(r3)
            if (r6 != 0) goto L11
            return r1
        L11:
            r2.mTarget = r3
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r6 = r3.mDependents
            if (r6 != 0) goto L1e
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r3.mDependents = r6
        L1e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mTarget
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r3 = r3.mDependents
            r3.add(r2)
            if (r4 <= 0) goto L2a
            r2.mMargin = r4
            goto L2c
        L2a:
            r2.mMargin = r1
        L2c:
            r2.mGoneMargin = r5
            return r0
    }

    public void copyFrom(androidx.constraintlayout.solver.widgets.ConstraintAnchor r3, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> r4) {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r2.mTarget
            if (r0 == 0) goto Lb
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r0.mDependents
            if (r0 == 0) goto Lb
            r0.remove(r2)
        Lb:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L24
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = r0.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r3.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.mOwner
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.getAnchor(r0)
            r2.mTarget = r4
            goto L27
        L24:
            r4 = 0
            r2.mTarget = r4
        L27:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.mTarget
            if (r4 == 0) goto L3d
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r4.mDependents
            if (r0 != 0) goto L36
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.mDependents = r0
        L36:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.mTarget
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r4.mDependents
            r4.add(r2)
        L3d:
            int r4 = r3.mMargin
            r2.mMargin = r4
            int r3 = r3.mGoneMargin
            r2.mGoneMargin = r3
            return
    }

    public int getMargin() {
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.mOwner
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r3.mGoneMargin
            r2 = -1
            if (r0 <= r2) goto L20
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L20
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mOwner
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L20
            int r0 = r3.mGoneMargin
            return r0
        L20:
            int r0 = r3.mMargin
            return r0
    }

    public final androidx.constraintlayout.solver.widgets.ConstraintAnchor getOpposite() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2d;
                case 2: goto L28;
                case 3: goto L23;
                case 4: goto L1e;
                case 5: goto L19;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                default: goto Ld;
            }
        Ld:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.name()
            r0.<init>(r1)
            throw r0
        L19:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTop
            return r0
        L1e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            return r0
        L23:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mLeft
            return r0
        L28:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mRight
            return r0
        L2d:
            r0 = 0
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getOwner() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mOwner
            return r0
    }

    public androidx.constraintlayout.solver.SolverVariable getSolverVariable() {
            r1 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r1.mSolverVariable
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintAnchor getTarget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTarget
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type getType() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = r1.mType
            return r0
    }

    public boolean hasCenteredDependents() {
            r3 = this;
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r3.mDependents
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getOpposite()
            boolean r2 = r2.isConnected()
            if (r2 == 0) goto La
            r0 = 1
            return r0
        L22:
            return r1
    }

    public boolean hasDependents() {
            r2 = this;
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r2.mDependents
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.size()
            if (r0 <= 0) goto Le
            r0 = 1
            return r0
        Le:
            return r1
    }

    public boolean isConnected() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.solver.widgets.ConstraintWidget r4) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r0 = r3.isConnectionToMe(r4, r0)
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.getOwner()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            r2 = 1
            if (r0 != r4) goto L19
            return r2
        L19:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.getParent()
            if (r4 != r0) goto L20
            return r2
        L20:
            return r1
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.solver.widgets.ConstraintWidget r1, androidx.constraintlayout.solver.widgets.ConstraintAnchor r2) {
            r0 = this;
            boolean r1 = r0.isConnectionAllowed(r1)
            return r1
    }

    public boolean isSideAnchor() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1b;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L1b;
                case 7: goto L1b;
                case 8: goto L1b;
                case 9: goto L1b;
                default: goto Ld;
            }
        Ld:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.name()
            r0.<init>(r1)
            throw r0
        L19:
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public boolean isSimilarDimensionConnection(androidx.constraintlayout.solver.widgets.ConstraintAnchor r4) {
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r4.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = r3.mType
            r1 = 1
            if (r4 != r0) goto La
            return r1
        La:
            int[] r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L36;
                case 3: goto L36;
                case 4: goto L23;
                case 5: goto L23;
                case 6: goto L23;
                case 7: goto L36;
                case 8: goto L23;
                case 9: goto L22;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = r3.mType
            java.lang.String r0 = r0.name()
            r4.<init>(r0)
            throw r4
        L22:
            return r2
        L23:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r4 == r0) goto L35
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r4 == r0) goto L35
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r4 == r0) goto L35
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            if (r4 != r0) goto L34
            goto L35
        L34:
            return r2
        L35:
            return r1
        L36:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r4 == r0) goto L44
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r4 == r0) goto L44
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            if (r4 != r0) goto L43
            goto L44
        L43:
            return r2
        L44:
            return r1
        L45:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            if (r4 == r0) goto L4a
            return r1
        L4a:
            return r2
    }

    public boolean isValidConnection(androidx.constraintlayout.solver.widgets.ConstraintAnchor r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r6.getType()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = r5.mType
            r3 = 1
            if (r1 != r2) goto L27
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            if (r2 != r1) goto L26
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.getOwner()
            boolean r6 = r6.hasBaseline()
            if (r6 == 0) goto L25
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.getOwner()
            boolean r6 = r6.hasBaseline()
            if (r6 != 0) goto L26
        L25:
            return r0
        L26:
            return r3
        L27:
            int[] r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            int r2 = r2.ordinal()
            r2 = r4[r2]
            switch(r2) {
                case 1: goto L7b;
                case 2: goto L5d;
                case 3: goto L5d;
                case 4: goto L3f;
                case 5: goto L3f;
                case 6: goto L3e;
                case 7: goto L3e;
                case 8: goto L3e;
                case 9: goto L3e;
                default: goto L32;
            }
        L32:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = r5.mType
            java.lang.String r0 = r0.name()
            r6.<init>(r0)
            throw r6
        L3e:
            return r0
        L3f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r1 == r2) goto L4a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r1 != r2) goto L48
            goto L4a
        L48:
            r2 = 0
            goto L4b
        L4a:
            r2 = 1
        L4b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.getOwner()
            boolean r6 = r6 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r6 == 0) goto L5c
            if (r2 != 0) goto L5b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r1 != r6) goto L5a
            goto L5b
        L5a:
            return r0
        L5b:
            return r3
        L5c:
            return r2
        L5d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            if (r1 == r2) goto L68
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            if (r1 != r2) goto L66
            goto L68
        L66:
            r2 = 0
            goto L69
        L68:
            r2 = 1
        L69:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.getOwner()
            boolean r6 = r6 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r6 == 0) goto L7a
            if (r2 != 0) goto L79
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            if (r1 != r6) goto L78
            goto L79
        L78:
            return r0
        L79:
            return r3
        L7a:
            return r2
        L7b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            if (r1 == r6) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X
            if (r1 == r6) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r1 == r6) goto L88
            return r3
        L88:
            return r0
    }

    public boolean isVerticalAnchor() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1b;
                case 2: goto L1b;
                case 3: goto L1b;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L19;
                case 7: goto L1b;
                case 8: goto L19;
                case 9: goto L19;
                default: goto Ld;
            }
        Ld:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.name()
            r0.<init>(r1)
            throw r0
        L19:
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public void reset() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto Lb
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r0.mDependents
            if (r0 == 0) goto Lb
            r0.remove(r1)
        Lb:
            r0 = 0
            r1.mTarget = r0
            r0 = 0
            r1.mMargin = r0
            r0 = -1
            r1.mGoneMargin = r0
            return
    }

    public void resetSolverVariable(androidx.constraintlayout.solver.Cache r3) {
            r2 = this;
            androidx.constraintlayout.solver.SolverVariable r3 = r2.mSolverVariable
            if (r3 != 0) goto Lf
            androidx.constraintlayout.solver.SolverVariable r3 = new androidx.constraintlayout.solver.SolverVariable
            androidx.constraintlayout.solver.SolverVariable$Type r0 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            r1 = 0
            r3.<init>(r0, r1)
            r2.mSolverVariable = r3
            return
        Lf:
            r3.reset()
            return
    }

    public void setGoneMargin(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L8
            r1.mGoneMargin = r2
        L8:
            return
    }

    public void setMargin(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L8
            r1.mMargin = r2
        L8:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r2.mOwner
            java.lang.String r1 = r1.getDebugName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
