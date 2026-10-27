package androidx.multidex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MultiDexApplication extends android.app.Application {
    public MultiDexApplication() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            androidx.multidex.MultiDex.install(r0)
            return
    }
}
