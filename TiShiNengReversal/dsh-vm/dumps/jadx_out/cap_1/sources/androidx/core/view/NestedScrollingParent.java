package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(@androidx.annotation.NonNull android.view.View r1, float r2, float r3, boolean r4);

    boolean onNestedPreFling(@androidx.annotation.NonNull android.view.View r1, float r2, float r3);

    void onNestedPreScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, @androidx.annotation.NonNull int[] r4);

    void onNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5);

    void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3);

    boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3);

    void onStopNestedScroll(@androidx.annotation.NonNull android.view.View r1);
}
