package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AndroidViewModel extends androidx.lifecycle.ViewModel {

    @org.jetbrains.annotations.NotNull
    private final android.app.Application application;

    public AndroidViewModel(@org.jetbrains.annotations.NotNull android.app.Application r2) {
            r1 = this;
            java.lang.String r0 = "application"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.application = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public <T extends android.app.Application> T getApplication() {
            r2 = this;
            android.app.Application r0 = r2.application
            java.lang.String r1 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }
}
