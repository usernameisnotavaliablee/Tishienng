package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class NavControllerViewModel extends androidx.lifecycle.ViewModel {
    private static final androidx.lifecycle.ViewModelProvider.Factory FACTORY = null;
    private final java.util.HashMap<java.util.UUID, androidx.lifecycle.ViewModelStore> mViewModelStores;


    static {
            androidx.navigation.NavControllerViewModel$1 r0 = new androidx.navigation.NavControllerViewModel$1
            r0.<init>()
            androidx.navigation.NavControllerViewModel.FACTORY = r0
            return
    }

    NavControllerViewModel() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mViewModelStores = r0
            return
    }

    @androidx.annotation.NonNull
    static androidx.navigation.NavControllerViewModel getInstance(androidx.lifecycle.ViewModelStore r2) {
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.lifecycle.ViewModelProvider$Factory r1 = androidx.navigation.NavControllerViewModel.FACTORY
            r0.<init>(r2, r1)
            java.lang.Class<androidx.navigation.NavControllerViewModel> r2 = androidx.navigation.NavControllerViewModel.class
            androidx.lifecycle.ViewModel r2 = r0.get(r2)
            androidx.navigation.NavControllerViewModel r2 = (androidx.navigation.NavControllerViewModel) r2
            return r2
    }

    void clear(@androidx.annotation.NonNull java.util.UUID r2) {
            r1 = this;
            java.util.HashMap<java.util.UUID, androidx.lifecycle.ViewModelStore> r0 = r1.mViewModelStores
            java.lang.Object r2 = r0.remove(r2)
            androidx.lifecycle.ViewModelStore r2 = (androidx.lifecycle.ViewModelStore) r2
            if (r2 == 0) goto Ld
            r2.clear()
        Ld:
            return
    }

    @androidx.annotation.NonNull
    androidx.lifecycle.ViewModelStore getViewModelStore(@androidx.annotation.NonNull java.util.UUID r3) {
            r2 = this;
            java.util.HashMap<java.util.UUID, androidx.lifecycle.ViewModelStore> r0 = r2.mViewModelStores
            java.lang.Object r0 = r0.get(r3)
            androidx.lifecycle.ViewModelStore r0 = (androidx.lifecycle.ViewModelStore) r0
            if (r0 != 0) goto L14
            androidx.lifecycle.ViewModelStore r0 = new androidx.lifecycle.ViewModelStore
            r0.<init>()
            java.util.HashMap<java.util.UUID, androidx.lifecycle.ViewModelStore> r1 = r2.mViewModelStores
            r1.put(r3, r0)
        L14:
            return r0
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
            r2 = this;
            java.util.HashMap<java.util.UUID, androidx.lifecycle.ViewModelStore> r0 = r2.mViewModelStores
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.ViewModelStore r1 = (androidx.lifecycle.ViewModelStore) r1
            r1.clear()
            goto La
        L1a:
            java.util.HashMap<java.util.UUID, androidx.lifecycle.ViewModelStore> r0 = r2.mViewModelStores
            r0.clear()
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NavControllerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} ViewModelStores ("
            r0.append(r1)
            java.util.HashMap<java.util.UUID, androidx.lifecycle.ViewModelStore> r1 = r3.mViewModelStores
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.String r2 = ", "
            r0.append(r2)
            goto L22
        L3b:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
