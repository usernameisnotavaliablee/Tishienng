package androidx.viewbinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewBindings {
    private ViewBindings() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static <T extends android.view.View> T findChildViewById(android.view.View r4, @androidx.annotation.IdRes int r5) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r4.getChildAt(r2)
            android.view.View r3 = r3.findViewById(r5)
            if (r3 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            return r1
    }
}
