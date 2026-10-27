package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface FragmentResultOwner {
    void clearFragmentResult(@androidx.annotation.NonNull java.lang.String r1);

    void clearFragmentResultListener(@androidx.annotation.NonNull java.lang.String r1);

    void setFragmentResult(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.os.Bundle r2);

    void setFragmentResultListener(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentResultListener r3);
}
