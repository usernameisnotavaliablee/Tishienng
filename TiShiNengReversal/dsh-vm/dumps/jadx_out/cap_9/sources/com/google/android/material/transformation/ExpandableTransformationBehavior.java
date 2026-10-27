package com.google.android.material.transformation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ExpandableTransformationBehavior extends com.google.android.material.transformation.ExpandableBehavior {

    @androidx.annotation.Nullable
    private android.animation.AnimatorSet currentAnimation;


    public ExpandableTransformationBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public ExpandableTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ android.animation.AnimatorSet access$002(com.google.android.material.transformation.ExpandableTransformationBehavior r0, android.animation.AnimatorSet r1) {
            r0.currentAnimation = r1
            return r1
    }

    @androidx.annotation.NonNull
    protected abstract android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(android.view.View r1, android.view.View r2, boolean r3, boolean r4);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @androidx.annotation.CallSuper
    protected boolean onExpandedStateChange(android.view.View r4, android.view.View r5, boolean r6, boolean r7) {
            r3 = this;
            android.animation.AnimatorSet r0 = r3.currentAnimation
            r1 = 1
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 == 0) goto Ld
            r0.cancel()
        Ld:
            android.animation.AnimatorSet r4 = r3.onCreateExpandedStateChangeAnimation(r4, r5, r6, r2)
            r3.currentAnimation = r4
            com.google.android.material.transformation.ExpandableTransformationBehavior$1 r5 = new com.google.android.material.transformation.ExpandableTransformationBehavior$1
            r5.<init>(r3)
            r4.addListener(r5)
            android.animation.AnimatorSet r4 = r3.currentAnimation
            r4.start()
            if (r7 != 0) goto L27
            android.animation.AnimatorSet r4 = r3.currentAnimation
            r4.end()
        L27:
            return r1
    }
}
