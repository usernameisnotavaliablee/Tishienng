package androidx.appcompat.view.menu;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MenuWrapperICS extends androidx.appcompat.view.menu.BaseMenuWrapper implements android.view.Menu {
    private final androidx.core.internal.view.SupportMenu mWrappedObject;

    public MenuWrapperICS(android.content.Context r1, androidx.core.internal.view.SupportMenu r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.mWrappedObject = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrapped Object can not be null."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r12, int r13, int r14, android.content.ComponentName r15, android.content.Intent[] r16, android.content.Intent r17, int r18, android.view.MenuItem[] r19) {
            r11 = this;
            r0 = r19
            if (r0 == 0) goto L9
            int r1 = r0.length
            android.view.MenuItem[] r1 = new android.view.MenuItem[r1]
        L7:
            r10 = r1
            goto Lb
        L9:
            r1 = 0
            goto L7
        Lb:
            androidx.core.internal.view.SupportMenu r2 = r11.mWrappedObject
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            int r12 = r2.addIntentOptions(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r10 == 0) goto L2c
            int r13 = r10.length
            r14 = 0
        L1f:
            if (r14 >= r13) goto L2c
            r15 = r10[r14]
            android.view.MenuItem r15 = r11.getMenuItemWrapper(r15)
            r0[r14] = r15
            int r14 = r14 + 1
            goto L1f
        L2c:
            return r12
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            r1.internalClear()
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.clear()
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.close()
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.findItem(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.getItem(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r0 = r0.hasVisibleItems()
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r2 = r0.isShortcutKey(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r2, int r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r2 = r0.performIdentifierAction(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r2, android.view.KeyEvent r3, int r4) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r2 = r0.performShortcut(r2, r3, r4)
            return r2
    }

    @Override // android.view.Menu
    public void removeGroup(int r2) {
            r1 = this;
            r1.internalRemoveGroup(r2)
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.removeGroup(r2)
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
            r1 = this;
            r1.internalRemoveItem(r2)
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.removeItem(r2)
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r2, boolean r3, boolean r4) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setGroupCheckable(r2, r3, r4)
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r2, boolean r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setGroupEnabled(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r2, boolean r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setGroupVisible(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setQwertyMode(r2)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            int r0 = r0.size()
            return r0
    }
}
