package androidx.appcompat.view.menu;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface MenuPresenter {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Callback {
        void onCloseMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1, boolean r2);

        boolean onOpenSubMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1);
    }

    boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2);

    boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2);

    boolean flagActionItems();

    int getId();

    androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r1);

    void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.MenuBuilder r2);

    void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2);

    void onRestoreInstanceState(android.os.Parcelable r1);

    android.os.Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r1);

    void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1);

    void updateMenuView(boolean r1);
}
