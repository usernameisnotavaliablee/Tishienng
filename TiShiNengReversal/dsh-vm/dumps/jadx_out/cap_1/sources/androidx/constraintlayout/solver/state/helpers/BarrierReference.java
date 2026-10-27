package androidx.constraintlayout.solver.state.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BarrierReference extends androidx.constraintlayout.solver.state.HelperReference {
    private androidx.constraintlayout.solver.widgets.Barrier mBarrierWidget;
    private androidx.constraintlayout.solver.state.State.Direction mDirection;
    private int mMargin;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.state.helpers.BarrierReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Direction = null;

        static {
                androidx.constraintlayout.solver.state.State$Direction[] r0 = androidx.constraintlayout.solver.state.State.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Direction = r0
                androidx.constraintlayout.solver.state.State$Direction r1 = androidx.constraintlayout.solver.state.State.Direction.LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.state.State$Direction r1 = androidx.constraintlayout.solver.state.State.Direction.START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.state.State$Direction r1 = androidx.constraintlayout.solver.state.State.Direction.RIGHT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.solver.state.State$Direction r1 = androidx.constraintlayout.solver.state.State.Direction.END     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.solver.state.State$Direction r1 = androidx.constraintlayout.solver.state.State.Direction.TOP     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.solver.state.State$Direction r1 = androidx.constraintlayout.solver.state.State.Direction.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    public BarrierReference(androidx.constraintlayout.solver.state.State r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Helper r0 = androidx.constraintlayout.solver.state.State.Helper.BARRIER
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.constraintlayout.solver.state.HelperReference
    public void apply() {
            r2 = this;
            r2.getHelperWidget()
            int[] r0 = androidx.constraintlayout.solver.state.helpers.BarrierReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$state$State$Direction
            androidx.constraintlayout.solver.state.State$Direction r1 = r2.mDirection
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L17;
                case 2: goto L17;
                case 3: goto L16;
                case 4: goto L16;
                case 5: goto L14;
                case 6: goto L12;
                default: goto L11;
            }
        L11:
            goto L17
        L12:
            r1 = 3
            goto L17
        L14:
            r1 = 2
            goto L17
        L16:
            r1 = 1
        L17:
            androidx.constraintlayout.solver.widgets.Barrier r0 = r2.mBarrierWidget
            r0.setBarrierType(r1)
            androidx.constraintlayout.solver.widgets.Barrier r0 = r2.mBarrierWidget
            int r1 = r2.mMargin
            r0.setMargin(r1)
            return
    }

    @Override // androidx.constraintlayout.solver.state.HelperReference
    public androidx.constraintlayout.solver.widgets.HelperWidget getHelperWidget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.Barrier r0 = r1.mBarrierWidget
            if (r0 != 0) goto Lb
            androidx.constraintlayout.solver.widgets.Barrier r0 = new androidx.constraintlayout.solver.widgets.Barrier
            r0.<init>()
            r1.mBarrierWidget = r0
        Lb:
            androidx.constraintlayout.solver.widgets.Barrier r0 = r1.mBarrierWidget
            return r0
    }

    public void margin(int r1) {
            r0 = this;
            r0.mMargin = r1
            return
    }

    public void margin(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            r1.margin(r2)
            return
    }

    public void setBarrierDirection(androidx.constraintlayout.solver.state.State.Direction r1) {
            r0 = this;
            r0.mDirection = r1
            return
    }
}
