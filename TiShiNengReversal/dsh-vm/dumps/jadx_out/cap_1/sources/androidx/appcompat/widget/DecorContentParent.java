package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface DecorContentParent {
    boolean canShowOverflowMenu();

    void dismissPopups();

    java.lang.CharSequence getTitle();

    boolean hasIcon();

    boolean hasLogo();

    boolean hideOverflowMenu();

    void initFeature(int r1);

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r1);

    void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r1);

    void setIcon(int r1);

    void setIcon(android.graphics.drawable.Drawable r1);

    void setLogo(int r1);

    void setMenu(android.view.Menu r1, androidx.appcompat.view.menu.MenuPresenter.Callback r2);

    void setMenuPrepared();

    void setUiOptions(int r1);

    void setWindowCallback(android.view.Window.Callback r1);

    void setWindowTitle(java.lang.CharSequence r1);

    boolean showOverflowMenu();
}
