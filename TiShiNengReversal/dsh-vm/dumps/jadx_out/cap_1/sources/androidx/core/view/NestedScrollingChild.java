package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float r1, float r2, boolean r3);

    boolean dispatchNestedPreFling(float r1, float r2);

    boolean dispatchNestedPreScroll(int r1, int r2, @androidx.annotation.Nullable int[] r3, @androidx.annotation.Nullable int[] r4);

    boolean dispatchNestedScroll(int r1, int r2, int r3, int r4, @androidx.annotation.Nullable int[] r5);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean r1);

    boolean startNestedScroll(int r1);

    void stopNestedScroll();
}
