package androidx.appcompat.view.menu;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface MenuView {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ItemView {
        androidx.appcompat.view.menu.MenuItemImpl getItemData();

        void initialize(androidx.appcompat.view.menu.MenuItemImpl r1, int r2);

        boolean prefersCondensedTitle();

        void setCheckable(boolean r1);

        void setChecked(boolean r1);

        void setEnabled(boolean r1);

        void setIcon(android.graphics.drawable.Drawable r1);

        void setShortcut(boolean r1, char r2);

        void setTitle(java.lang.CharSequence r1);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(androidx.appcompat.view.menu.MenuBuilder r1);
}
