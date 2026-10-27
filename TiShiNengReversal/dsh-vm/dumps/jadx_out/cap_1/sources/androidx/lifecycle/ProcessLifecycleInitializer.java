package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.Initializer<androidx.lifecycle.LifecycleOwner> {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LifecycleOwner create(@org.jetbrains.annotations.NotNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.getInstance(r3)
            java.lang.String r1 = "getInstance(context)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r1 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r0 = r0.isEagerlyInitialized(r1)
            if (r0 == 0) goto L23
            androidx.lifecycle.LifecycleDispatcher.init(r3)
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            r0.init$lifecycle_process_release(r3)
            androidx.lifecycle.LifecycleOwner r3 = r0.get()
            return r3
        L23:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ androidx.lifecycle.LifecycleOwner create(android.content.Context r1) {
            r0 = this;
            androidx.lifecycle.LifecycleOwner r1 = r0.create(r1)
            return r1
    }

    @Override // androidx.startup.Initializer
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }
}
