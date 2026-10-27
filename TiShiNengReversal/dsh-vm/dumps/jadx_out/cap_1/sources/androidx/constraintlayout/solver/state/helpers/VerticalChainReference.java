package androidx.constraintlayout.solver.state.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VerticalChainReference extends androidx.constraintlayout.solver.state.helpers.ChainReference {
    private java.lang.Object mBottomToBottom;
    private java.lang.Object mBottomToTop;
    private java.lang.Object mTopToBottom;
    private java.lang.Object mTopToTop;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.state.helpers.VerticalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Chain = null;

        static {
                androidx.constraintlayout.solver.state.State$Chain[] r0 = androidx.constraintlayout.solver.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Chain = r0
                androidx.constraintlayout.solver.state.State$Chain r1 = androidx.constraintlayout.solver.state.State.Chain.SPREAD     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.state.State$Chain r1 = androidx.constraintlayout.solver.state.State.Chain.SPREAD_INSIDE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.state.State$Chain r1 = androidx.constraintlayout.solver.state.State.Chain.PACKED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public VerticalChainReference(androidx.constraintlayout.solver.state.State r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Helper r0 = androidx.constraintlayout.solver.state.State.Helper.VERTICAL_CHAIN
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.constraintlayout.solver.state.HelperReference
    public void apply() {
            r5 = this;
            java.util.ArrayList<java.lang.Object> r0 = r5.mReferences
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.state.State r2 = r5.mState
            androidx.constraintlayout.solver.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearVertical()
            goto L6
        L1a:
            java.util.ArrayList<java.lang.Object> r0 = r5.mReferences
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L22:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.solver.state.State r4 = r5.mState
            androidx.constraintlayout.solver.state.ConstraintReference r3 = r4.constraints(r3)
            if (r2 != 0) goto L4a
            java.lang.Object r2 = r5.mTopToTop
            if (r2 == 0) goto L3c
            r3.topToTop(r2)
            goto L49
        L3c:
            java.lang.Object r2 = r5.mTopToBottom
            if (r2 == 0) goto L44
            r3.topToBottom(r2)
            goto L49
        L44:
            java.lang.Integer r2 = androidx.constraintlayout.solver.state.State.PARENT
            r3.topToTop(r2)
        L49:
            r2 = r3
        L4a:
            if (r1 == 0) goto L5a
            java.lang.Object r4 = r3.getKey()
            r1.bottomToTop(r4)
            java.lang.Object r1 = r1.getKey()
            r3.topToBottom(r1)
        L5a:
            r1 = r3
            goto L22
        L5c:
            if (r1 == 0) goto L73
            java.lang.Object r0 = r5.mBottomToTop
            if (r0 == 0) goto L66
            r1.bottomToTop(r0)
            goto L73
        L66:
            java.lang.Object r0 = r5.mBottomToBottom
            if (r0 == 0) goto L6e
            r1.bottomToBottom(r0)
            goto L73
        L6e:
            java.lang.Integer r0 = androidx.constraintlayout.solver.state.State.PARENT
            r1.bottomToBottom(r0)
        L73:
            if (r2 == 0) goto L80
            float r0 = r5.mBias
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L80
            r2.verticalBias(r0)
        L80:
            int[] r0 = androidx.constraintlayout.solver.state.helpers.VerticalChainReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Chain
            androidx.constraintlayout.solver.state.State$Chain r1 = r5.mStyle
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L9c
            r3 = 2
            if (r0 == r3) goto L98
            r1 = 3
            if (r0 == r1) goto L94
            return
        L94:
            r2.setVerticalChainStyle(r3)
            return
        L98:
            r2.setVerticalChainStyle(r1)
            return
        L9c:
            r0 = 0
            r2.setVerticalChainStyle(r0)
            return
    }

    public void bottomToBottom(java.lang.Object r1) {
            r0 = this;
            r0.mBottomToBottom = r1
            return
    }

    public void bottomToTop(java.lang.Object r1) {
            r0 = this;
            r0.mBottomToTop = r1
            return
    }

    public void topToBottom(java.lang.Object r1) {
            r0 = this;
            r0.mTopToBottom = r1
            return
    }

    public void topToTop(java.lang.Object r1) {
            r0 = this;
            r0.mTopToTop = r1
            return
    }
}
