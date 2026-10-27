package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface MenuHost {
    void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1);

    void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2);

    @android.annotation.SuppressLint({"LambdaLast"})
    void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r3);

    void invalidateMenu();

    void removeMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1);
}
