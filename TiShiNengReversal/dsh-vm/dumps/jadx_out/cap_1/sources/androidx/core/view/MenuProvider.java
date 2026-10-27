package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface MenuProvider {
    void onCreateMenu(@androidx.annotation.NonNull android.view.Menu r1, @androidx.annotation.NonNull android.view.MenuInflater r2);

    void onMenuClosed(@androidx.annotation.NonNull android.view.Menu r1);

    boolean onMenuItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1);

    void onPrepareMenu(@androidx.annotation.NonNull android.view.Menu r1);
}
