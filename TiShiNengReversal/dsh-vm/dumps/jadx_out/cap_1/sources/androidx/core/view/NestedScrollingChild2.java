package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface NestedScrollingChild2 extends androidx.core.view.NestedScrollingChild {
    boolean dispatchNestedPreScroll(int r1, int r2, @androidx.annotation.Nullable int[] r3, @androidx.annotation.Nullable int[] r4, int r5);

    boolean dispatchNestedScroll(int r1, int r2, int r3, int r4, @androidx.annotation.Nullable int[] r5, int r6);

    boolean hasNestedScrollingParent(int r1);

    boolean startNestedScroll(int r1, int r2);

    void stopNestedScroll(int r1);
}
