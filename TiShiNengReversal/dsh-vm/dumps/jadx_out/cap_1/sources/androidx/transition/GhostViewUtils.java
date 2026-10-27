package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class GhostViewUtils {
    private GhostViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    static androidx.transition.GhostView addGhost(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.Nullable android.graphics.Matrix r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto Lb
            androidx.transition.GhostView r2 = androidx.transition.GhostViewPlatform.addGhost(r2, r3, r4)
            return r2
        Lb:
            androidx.transition.GhostViewPort r2 = androidx.transition.GhostViewPort.addGhost(r2, r3, r4)
            return r2
    }

    static void removeGhost(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            androidx.transition.GhostViewPlatform.removeGhost(r2)
            return
        La:
            androidx.transition.GhostViewPort.removeGhost(r2)
            return
    }
}
