package com.google.android.material.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class NavigationSubMenu extends androidx.appcompat.view.menu.SubMenuBuilder {
    public NavigationSubMenu(android.content.Context r1, com.google.android.material.internal.NavigationMenu r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public void onItemsChanged(boolean r2) {
            r1 = this;
            super/*androidx.appcompat.view.menu.MenuBuilder*/.onItemsChanged(r2)
            android.view.Menu r0 = r1.getParentMenu()
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            r0.onItemsChanged(r2)
            return
    }
}
